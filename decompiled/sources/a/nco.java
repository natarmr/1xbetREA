package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nco implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final diw f23304a;

    public nco(diw diwVar) {
        this.f23304a = diwVar;
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
        if (!(obj instanceof nco) || !this.f23304a.equals(((nco) obj).f23304a)) {
            return false;
        }
        k3g k3gVar = k3g.f17616a;
        return k3gVar.equals(k3gVar);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "EventFocusVirtualGameCategoriesUiModel";
    }

    public final int hashCode() {
        return ((this.f23304a.hashCode() + 1634930310) * 31) + 217771776;
    }

    public final String toString() {
        return "EventFocusVirtualGameCategoriesUiModel(key=EventFocusVirtualGameCategoriesUiModel, gameCategories=" + this.f23304a + ", cyberButtonBlockState=" + k3g.f17616a + Separators.RPAREN;
    }
}
