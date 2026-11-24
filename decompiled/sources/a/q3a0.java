package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class q3a0 implements t3a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f28043a;
    public final a4x b;
    public final int c;
    public final m1e0 d;
    public final mdm e;

    public q3a0(imm immVar, a4x a4xVar, int i, m1e0 m1e0Var, mdm mdmVar) {
        this.f28043a = immVar;
        this.b = a4xVar;
        this.c = i;
        this.d = m1e0Var;
        this.e = mdmVar;
    }

    @Override // a.t3a0
    public final imm a() {
        return this.f28043a;
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
        if (!(obj instanceof q3a0)) {
            return false;
        }
        q3a0 q3a0Var = (q3a0) obj;
        if (!this.f28043a.equals(q3a0Var.f28043a)) {
            return false;
        }
        axh0 axh0Var = axh0.f1625a;
        return axh0Var.equals(axh0Var) && this.b.equals(q3a0Var.b) && this.c == q3a0Var.c && this.d.equals(q3a0Var.d) && this.e.equals(q3a0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + twn.a(this.c, cs0.b(this.b, ((this.f28043a.hashCode() * 31) - 1485121678) * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "ContentEmptySubTabs(dsNavigationBarUiModel=" + this.f28043a + ", segmentedControlStyle=" + axh0.f1625a + ", mainTabsTitleList=" + this.b + ", currentMainTabPosition=" + this.c + ", rankCardUiModel=" + this.d + ", dsEmptyConfig=" + this.e + Separators.RPAREN;
    }
}
