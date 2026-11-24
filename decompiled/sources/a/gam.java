package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gam implements iam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0x f10974a;
    public final ut90 b;

    public gam(m0x m0xVar, ut90 ut90Var) {
        ut90Var.getClass();
        this.f10974a = m0xVar;
        this.b = ut90Var;
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
        if (!(obj instanceof gam)) {
            return false;
        }
        gam gamVar = (gam) obj;
        if (!this.f10974a.equals(gamVar.f10974a) || this.b != gamVar.b) {
            return false;
        }
        pt90 pt90Var = pt90.f27553a;
        return pt90Var.equals(pt90Var);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.f10974a.hashCode() * 31)) * 31) - 1897666901;
    }

    public final String toString() {
        return "Picture(picture=" + this.f10974a + ", pictureSize=" + this.b + ", picturePlaceholder=" + pt90.f27553a + Separators.RPAREN;
    }
}
