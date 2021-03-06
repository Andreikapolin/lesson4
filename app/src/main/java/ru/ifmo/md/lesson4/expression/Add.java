package ru.ifmo.md.lesson4.expression;

/**
 * Created by andreikapolin on 06.10.14.
 */
public class Add extends BinaryOperation {
    public Add(Expression3 first, Expression3 second) {
        super(first, second);
    }

    @Override
    public double evaluate() {
        return first.evaluate() + second.evaluate();
    }
}
