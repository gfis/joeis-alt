package irvine.oeis.a118;
// Generated by gen_seq4.pl holos [0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1] [1,22,43,55,76,88,109,922,250,73,58,106,622,247,763,388,904,430] 0 at 2019-12-17 15:30
// DO NOT EDIT here!

import irvine.oeis.HolonomicRecurrence;

/**
 * A118602 Start with 1 and repeatedly reverse the digits and add 21 to get the next term.
 * @author Georg Fischer
 */
public class A118602 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A118602() {
    super(1, "[0,-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1]", "[1,22,43,55,76,88,109,922,250,73,58,106,622,247,763,388,904,430]", 0);
  }
}
