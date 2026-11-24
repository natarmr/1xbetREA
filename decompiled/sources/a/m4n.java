package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m4n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4i f21179a;
    public final u3i b;

    public m4n(c4i c4iVar, u3i u3iVar) {
        this.f21179a = c4iVar;
        this.b = u3iVar;
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
        if (!(obj instanceof m4n)) {
            return false;
        }
        m4n m4nVar = (m4n) obj;
        if (!this.f21179a.equals(m4nVar.f21179a) || !this.b.equals(m4nVar.b)) {
            return false;
        }
        y3i y3iVar = y3i.f41954a;
        return y3iVar.equals(y3iVar);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (this.f21179a.hashCode() * 31)) * 31) - 531637959;
    }

    public final String toString() {
        return "LargeCardLargeSportIcon(labelModel=" + this.f21179a + ", notificationButton=" + this.b + ", favoriteButton=" + y3i.f41954a + Separators.RPAREN;
    }
}
