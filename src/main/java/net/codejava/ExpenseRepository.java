package net.codejava;

import org.springframework.data.jpa.repository.JpaRepository;

import net.codejava.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

}
