package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class a3l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ope f178a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public a3l0(ope opeVar, int i, boolean z, boolean z2) {
        this.f178a = opeVar;
        this.b = i;
        this.c = z;
        this.d = z2;
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
        if (!(obj instanceof a3l0)) {
            return false;
        }
        a3l0 a3l0Var = (a3l0) obj;
        if (!this.f178a.equals(a3l0Var.f178a) || this.b != a3l0Var.b) {
            return false;
        }
        tc00 tc00Var = tc00.f33696a;
        return tc00Var.equals(tc00Var) && this.c == a3l0Var.c && this.d == a3l0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e((((Integer.hashCode(this.b) + (this.f178a.hashCode() * 31)) * 31) + 209164535) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CounterWithListCheckbox(counterStyle=");
        sb.append(this.f178a);
        sb.append(", counterValue=");
        sb.append(this.b);
        sb.append(", listCheckboxStyle=");
        sb.append(tc00.f33696a);
        sb.append(", active=");
        sb.append(this.c);
        sb.append(", enabled=");
        return rw2.p(sb, this.d, Separators.RPAREN);
    }
}
