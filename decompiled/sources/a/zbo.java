package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zbo implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9m f44125a;

    public zbo(g9m g9mVar) {
        this.f44125a = g9mVar;
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
        if (!(obj instanceof zbo) || !this.f44125a.equals(((zbo) obj).f44125a)) {
            return false;
        }
        k3g k3gVar = k3g.f17616a;
        return k3gVar.equals(k3gVar);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "EventFocusPartnerTeamsUiModel";
    }

    public final int hashCode() {
        return ((this.f44125a.f10921a.hashCode() + 1539194167) * 31) + 217771776;
    }

    public final String toString() {
        return "EventFocusPartnerTeamsUiModel(key=EventFocusPartnerTeamsUiModel, partnersList=" + this.f44125a + ", cyberButtonBlockState=" + k3g.f17616a + Separators.RPAREN;
    }
}
