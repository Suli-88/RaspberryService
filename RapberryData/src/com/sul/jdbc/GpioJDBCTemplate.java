package com.sul.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class GpioJDBCTemplate implements GpioDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, Integer id) {
		String SQL = "insert into gpio (gpio_id, gpio_name) values (?, ?)";
		jdbcTemplateObject.update(SQL, id, name);
		System.out.println("Created Record Name = " + name + " Age = " + id);
		return;
	}

	@Override
	public Gpio getStudent(int gpioId) {
		String SQL = "select * from gpio where gpio_id = ?";
		Gpio student = jdbcTemplateObject.queryForObject(SQL, new Object[] { gpioId }, new GpioMapper());

		return student;
	}

	@Override
	public List<Gpio> listStudents() {
		String SQL = "select * from gpio";
		List<Gpio> students = jdbcTemplateObject.query(SQL, new GpioMapper());
		return students;
	}

	@Override
	public void delete(Integer id) {
		String SQL = "delete from Student where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id);
		return;
	}

	@Override
	public void update(Integer id, Integer age) {
		String SQL = "update Student set age = ? where id = ?";
		jdbcTemplateObject.update(SQL, age, id);
		System.out.println("Updated Record with ID = " + id);
		return;
	}
}
