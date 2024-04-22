package com.jeremyyytannn.database.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jeremyyytannn.database.dao.AuthorDao;
import com.jeremyyytannn.database.domain.Author;

public class AuthorDaoImpl implements AuthorDao {
  private JdbcTemplate jdbcTemplate;

  public AuthorDaoImpl(final JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public void create(Author author) {
    jdbcTemplate.update(
      "INSERT INTO authors (id, name, age) VALUES (?, ?, ?)", 
      author.getId(), author.getName(), author.getAge()
    );
  }
}
