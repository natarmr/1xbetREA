package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class d3l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5408a;
    public final boolean b;

    public d3l0(boolean z, boolean z2) {
        this.f5408a = z;
        this.b = z2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3l0)) {
            return false;
        }
        d3l0 d3l0Var = (d3l0) obj;
        tc00 tc00Var = tc00.f33696a;
        return tc00Var.equals(tc00Var) && this.f5408a == d3l0Var.f5408a && this.b == d3l0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + brm0.e(-2105834007, 31, this.f5408a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListCheckbox(listCheckboxStyle=");
        sb.append(tc00.f33696a);
        sb.append(", active=");
        sb.append(this.f5408a);
        sb.append(", enabled=");
        return rw2.p(sb, this.b, Separators.RPAREN);
    }
}
