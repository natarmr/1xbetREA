package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hvi0 implements pvi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpe f13728a;
    public final int b;
    public final boolean c;

    public hvi0(kpe kpeVar, int i, boolean z) {
        this.f13728a = kpeVar;
        this.b = i;
        this.c = z;
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
        if (!(obj instanceof hvi0)) {
            return false;
        }
        hvi0 hvi0Var = (hvi0) obj;
        if (!this.f13728a.equals(hvi0Var.f13728a) || this.b != hvi0Var.b) {
            return false;
        }
        tc00 tc00Var = tc00.f33696a;
        return tc00Var.equals(tc00Var) && this.c == hvi0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((((Integer.hashCode(this.b) + (this.f13728a.hashCode() * 31)) * 31) + 209164535) * 31);
    }

    public final String toString() {
        return "CounterListCheckbox(counterStyle=" + this.f13728a + ", counterValue=" + this.b + ", listCheckboxStyle=" + tc00.f33696a + ", checked=" + this.c + Separators.RPAREN;
    }
}
