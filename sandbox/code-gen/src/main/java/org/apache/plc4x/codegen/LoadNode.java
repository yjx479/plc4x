package org.apache.plc4x.codegen;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Load")
public class LoadNode extends ContextNode {
    @Override public <T> T accept(NodeVisitor<T> visitor) {
        return visitor.visit(this);
    }
}