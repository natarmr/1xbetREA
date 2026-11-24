package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dz10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cz10 f6919a;

    public dz10(cz10 cz10Var) {
        this.f6919a = cz10Var;
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
        if (!(obj instanceof dz10) || !this.f6919a.equals(((dz10) obj).f6919a)) {
            return false;
        }
        ez10 ez10Var = ez10.f8651a;
        return ez10Var.equals(ez10Var);
    }

    public final int hashCode() {
        return (this.f6919a.hashCode() * 31) + 814471031;
    }

    public final String toString() {
        return "MainMenuTypeClickUiModel(mainMenuType=" + this.f6919a + ", mainMenuTypeParams=" + ez10.f8651a + Separators.RPAREN;
    }
}
