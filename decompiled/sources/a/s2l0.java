package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class s2l0 implements g3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31507a;
    public final u1m b;

    public s2l0(int i, u1m u1mVar) {
        this.f31507a = i;
        this.b = u1mVar;
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
        if (!(obj instanceof s2l0)) {
            return false;
        }
        s2l0 s2l0Var = (s2l0) obj;
        mpe mpeVar = mpe.f22175a;
        return mpeVar.equals(mpeVar) && this.f31507a == s2l0Var.f31507a && this.b == s2l0Var.b;
    }

    public final int hashCode() {
        int iA = twn.a(this.f31507a, -1657005276, 31);
        u1m u1mVar = this.b;
        return iA + (u1mVar == null ? 0 : u1mVar.hashCode());
    }

    public final String toString() {
        return "BadgeWithCounter(counterStyle=" + mpe.f22175a + ", counterValue=" + this.f31507a + ", badgeStyle=" + this.b + Separators.RPAREN;
    }
}
