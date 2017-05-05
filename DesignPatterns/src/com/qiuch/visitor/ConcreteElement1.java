package com.qiuch.visitor;

class ConcreteElement1 extends Element {    
    public void doSomething(){    
        System.out.println("this is element 1");    
    }    
        
    public void accept(IVisitor visitor) {    
        visitor.visit(this);    
    }    
}    
     
