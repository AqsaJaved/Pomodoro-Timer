package com.pomodoro.model;

public class Attempt {
    private int mRemainingSeconds;
    private AttemptKind mKind;

    public Attempt(String message, AttemptKind kind) {
        mKind = kind;
        mRemainingSeconds=kind.getTotalSeconds();
    }

    public int getRemainingSeconds() {
        return mRemainingSeconds;
    }

    public AttemptKind getKind() {
        return mKind;
    }

    public void tick() {
        mRemainingSeconds--;
    }

    public void save() {
        System.out.printf("Saving %s %n",this);
    }

    @Override
    public String toString() {
        return "Attempt{" +
                ", mRemainingSeconds=" + mRemainingSeconds +
                ", mKind=" + mKind +
                '}';
    }
}
