package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u2l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ope f34951a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final u1m e;

    public u2l0(ope opeVar, int i, boolean z, boolean z2, u1m u1mVar) {
        this.f34951a = opeVar;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = u1mVar;
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
        if (!(obj instanceof u2l0)) {
            return false;
        }
        u2l0 u2l0Var = (u2l0) obj;
        if (!this.f34951a.equals(u2l0Var.f34951a) || this.b != u2l0Var.b) {
            return false;
        }
        tc00 tc00Var = tc00.f33696a;
        return tc00Var.equals(tc00Var) && this.c == u2l0Var.c && this.d == u2l0Var.d && this.e == u2l0Var.e;
    }

    public final int hashCode() {
        int iE = brm0.e(brm0.e((((Integer.hashCode(this.b) + (this.f34951a.hashCode() * 31)) * 31) + 209164535) * 31, 31, this.c), 31, this.d);
        u1m u1mVar = this.e;
        return iE + (u1mVar == null ? 0 : u1mVar.hashCode());
    }

    public final String toString() {
        return "BadgeWithCounterAndListCheckbox(counterStyle=" + this.f34951a + ", counterValue=" + this.b + ", listCheckboxStyle=" + tc00.f33696a + ", active=" + this.c + ", enabled=" + this.d + ", badgeStyle=" + this.e + Separators.RPAREN;
    }
}
