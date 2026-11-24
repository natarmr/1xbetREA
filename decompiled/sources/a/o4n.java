package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o4n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4i f24646a;
    public final String b;
    public final u3i c;

    public o4n(c4i c4iVar, String str, u3i u3iVar) {
        str.getClass();
        this.f24646a = c4iVar;
        this.b = str;
        this.c = u3iVar;
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
        if (!(obj instanceof o4n)) {
            return false;
        }
        o4n o4nVar = (o4n) obj;
        if (!this.f24646a.equals(o4nVar.f24646a) || !Intrinsics.d(this.b, o4nVar.b) || !this.c.equals(o4nVar.c)) {
            return false;
        }
        y3i y3iVar = y3i.f41954a;
        return y3iVar.equals(y3iVar);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + ua80.b(this.f24646a.hashCode() * 31, 31, this.b)) * 31) - 531637959;
    }

    public final String toString() {
        return "LargeCardWatermark(labelModel=" + this.f24646a + ", infoLabel=" + this.b + ", notificationButton=" + this.c + ", favoriteButton=" + y3i.f41954a + Separators.RPAREN;
    }
}
