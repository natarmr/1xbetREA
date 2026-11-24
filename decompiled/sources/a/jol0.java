package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jol0 implements kol0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4i f16864a;
    public final u3i b;
    public final u3i c;

    public jol0(c4i c4iVar, u3i u3iVar, u3i u3iVar2) {
        this.f16864a = c4iVar;
        this.b = u3iVar;
        this.c = u3iVar2;
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
        if (!(obj instanceof jol0)) {
            return false;
        }
        jol0 jol0Var = (jol0) obj;
        if (!this.f16864a.equals(jol0Var.f16864a) || !this.b.equals(jol0Var.b) || !this.c.equals(jol0Var.c)) {
            return false;
        }
        w3i w3iVar = w3i.f38503a;
        return w3iVar.equals(w3iVar);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + ((this.b.hashCode() + (this.f16864a.hashCode() * 31)) * 31)) * 31) - 1898647672;
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(labelModel=" + this.f16864a + ", favoriteButton=" + this.b + ", notificationButton=" + this.c + ", broadcastButton=" + w3i.f38503a + Separators.RPAREN;
    }
}
