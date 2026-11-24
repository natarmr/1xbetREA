package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d3i implements h3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u3i f5404a;
    public final u3i b;
    public final String c;

    public d3i(u3i u3iVar, u3i u3iVar2, String str) {
        this.f5404a = u3iVar;
        this.b = u3iVar2;
        this.c = str;
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
        if (!(obj instanceof d3i)) {
            return false;
        }
        d3i d3iVar = (d3i) obj;
        w3i w3iVar = w3i.f38503a;
        return w3iVar.equals(w3iVar) && this.f5404a.equals(d3iVar.f5404a) && this.b.equals(d3iVar.b) && Intrinsics.d(this.c, d3iVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + vqd.c(this.f5404a, 1271464312, 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "V1(broadcastButton=" + w3i.f38503a + ", notificationButton=" + this.f5404a + ", favoriteButton=" + this.b + ", tagText=" + this.c + Separators.RPAREN;
    }
}
