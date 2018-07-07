package com.sul.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class GpioMapper implements RowMapper<Gpio> {

	private static final String GPIO_ID = "gpio_id";
	private static final String GPIO_NAME = "gpio_name";
	private static final String GPIO_NUMBER = "gpio_number";
	private static final String GPIO_STATUS = "gpio_status";
	private static final String OUTPUT_PIN = "output_pin";
	private static final String INPUT_PIN = "input_pin";

	@Override
	public Gpio mapRow(ResultSet rs, int rowNum) throws SQLException {
		Gpio gpio = new Gpio();
		gpio.setId(rs.getInt(GPIO_ID));
		gpio.setName(rs.getString(GPIO_NAME));
		gpio.setNumber(rs.getInt(GPIO_NUMBER));
		gpio.setStatus(rs.getBoolean(GPIO_STATUS));
		gpio.setOutputPin(rs.getBoolean(OUTPUT_PIN));
		gpio.setInputPin(rs.getBoolean(INPUT_PIN));
		return gpio;
	}
}
