package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class t2l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33222a;
    public final yb b;
    public final boolean c;
    public final u1m d;

    public t2l0(int i, yb ybVar, boolean z, u1m u1mVar) {
        this.f33222a = i;
        this.b = ybVar;
        this.c = z;
        this.d = u1mVar;
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
        if (!(obj instanceof t2l0)) {
            return false;
        }
        t2l0 t2l0Var = (t2l0) obj;
        mpe mpeVar = mpe.f22175a;
        return mpeVar.equals(mpeVar) && this.f33222a == t2l0Var.f33222a && this.b.equals(t2l0Var.b) && this.c == t2l0Var.c && this.d == t2l0Var.d;
    }

    public final int hashCode() {
        int iE = brm0.e((this.b.hashCode() + twn.a(this.f33222a, -1657005276, 31)) * 31, 31, this.c);
        u1m u1mVar = this.d;
        return iE + (u1mVar == null ? 0 : u1mVar.hashCode());
    }

    public final String toString() {
        return "BadgeWithCounterAndAccordion(counterStyle=" + mpe.f22175a + ", counterValue=" + this.f33222a + ", accordionStyle=" + this.b + ", expanded=" + this.c + ", badgeStyle=" + this.d + Separators.RPAREN;
    }
}
