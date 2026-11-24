package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o4e0 implements r4e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f24630a;

    public o4e0(mdm mdmVar) {
        this.f24630a = mdmVar;
    }

    @Override // a.r4e0
    public final gmm a() {
        return fmm.f9790a;
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
        if (!(obj instanceof o4e0) || !this.f24630a.equals(((o4e0) obj).f24630a)) {
            return false;
        }
        fmm fmmVar = fmm.f9790a;
        return fmmVar.equals(fmmVar);
    }

    public final int hashCode() {
        return (this.f24630a.hashCode() * 31) - 1078683807;
    }

    public final String toString() {
        return "Error(config=" + this.f24630a + ", appBarIconStyle=" + fmm.f9790a + Separators.RPAREN;
    }
}
