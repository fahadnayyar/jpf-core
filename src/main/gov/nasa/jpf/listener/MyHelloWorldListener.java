package gov.nasa.jpf.listener;

import gov.nasa.jpf.ListenerAdapter;
import gov.nasa.jpf.search.Search;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;
import java.io.PrintWriter;
import gov.nasa.jpf.jvm.bytecode.IfInstruction;

/**
 * simple listener to print all instructions executed by JPF.
 */

public class MyHelloWorldListener extends ListenerAdapter {
  @Override
  public void instructionExecuted(VM vm, ThreadInfo ti, Instruction nextInsn, Instruction executedInsn) {
    PrintWriter out = new PrintWriter(System.out, true);;
    out.println(executedInsn);
    if (executedInsn instanceof IfInstruction) {
        out.println("This is a branch Instruction !!");
    }
  }
}

