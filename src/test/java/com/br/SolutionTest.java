package com.br;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution sut;

    @BeforeEach
    void setup(){
        sut = new Solution();
    }

    @AfterEach
    void teardown(){
        sut = null;
    }

    @Test
    @DisplayName("Should return 2")
    void shouldReturn2() {
        assertAll(
                () -> assertEquals(2, sut.solution(new int[]{0,4,-1,0,3}, new int[]{0,-2,5,0,3})),
                () -> assertEquals(2, sut.solution(new int[]{1,4,2,-2,5}, new int[]{7,-2,-2,2,5}))
        );
    }

    @Test
    @DisplayName("Should return 1 if a fair is discarded because one of the sides is empty")
    void shouldReturn1IfAFairIsDiscardedBecauseOneOfTheSidesIsEmpty() {
        assertEquals(1, sut.solution(new int[]{2,-2,-3,3}, new int[]{0,0,4,-4}));
    }

    @Test
    @DisplayName("Should return 0 if there is no fairs")
    void shouldReturn0IfThereIsNoFairs() {
        assertAll(
                () -> assertEquals(0, sut.solution(new int[]{4,-1,0,3}, new int[]{-2,6,0,4})),
                () -> assertEquals(0, sut.solution(new int[]{3,2,6}, new int[]{4,1,6}))
        );
    }

    @Test
    @DisplayName("Should return 0 if arrays can not be divided")
    void shouldReturn0IfArraysCanNotBeDivided() {
        assertEquals(0, sut.solution(new int[]{2}, new int[]{1}));
    }

    @Test
    @DisplayName("Should return 0 if the arrays have different sizes")
    void shouldReturn0IfTheArraysHaveDifferentSizes() {
        assertEquals(0, sut.solution(new int[]{2}, new int[]{1,-1}));
    }

    @Test
    @DisplayName("should return zero if arrays are null")
    void shouldReturnZeroIfArraysAreNull() {
        assertEquals(0, sut.solution(null, null));
    }

    @Test
    @DisplayName("should return zero if arrays are empty")
    void shouldReturnZeroIfArraysAreEmpty() {
        assertEquals(0, sut.solution(new int[]{}, new int[]{}));
    }

}