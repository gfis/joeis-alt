package irvine.oeis.a118;
// Generated by gen_seq4.pl holos [0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1] [1,9,17,79,105,509,913,327,731,145,549,953,367,771,185,589,993,407,712,225,530,43,42,32,31,21,20,10] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A118527 Start with 1 and repeatedly reverse the digits and add 8 to get the next term.
 * @author Georg Fischer
 */
public class A118527 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A118527() {
    super(1, "[0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]", "[1,9,17,79,105,509,913,327,731,145,549,953,367,771,185,589,993,407,712,225,530,43,42,32,31,21,20,10]", 0);
  }
}