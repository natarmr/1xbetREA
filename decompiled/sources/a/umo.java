package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class umo implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f35927a;

    public umo(long j) {
        this.f35927a = j;
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
        if (!(obj instanceof umo) || this.f35927a != ((umo) obj).f35927a) {
            return false;
        }
        qwe qweVar = qwe.f29431a;
        return qweVar.equals(qweVar);
    }

    @Override // a.p6t0
    public final String getKey() {
        return String.valueOf(this.f35927a);
    }

    public final int hashCode() {
        return (Long.hashCode(this.f35927a) * 31) - 2013499621;
    }

    public final String toString() {
        return "ExpandableCardShimmerUiItem(id=" + this.f35927a + ", model=" + qwe.f29431a + Separators.RPAREN;
    }
}
