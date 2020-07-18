package irvine.oeis.a118;
// Generated by gen_seq4.pl holos [0,-1,0,0,1] [1,40,43,73,76,106,640,85,97,118,850] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A118635 Start with 1 and repeatedly reverse the digits and add 39 to get the next term.
 * @author Georg Fischer
 */
public class A118635 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A118635() {
    super(1, "[0,-1,0,0,1]", "[1,40,43,73,76,106,640,85,97,118,850]", 0);
  }
}