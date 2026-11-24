package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21462a;

    public mal(String str) {
        this.f21462a = str;
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
        if (!(obj instanceof mal) || !this.f21462a.equals(((mal) obj).f21462a)) {
            return false;
        }
        b9b b9bVar = b9b.f2200a;
        return b9bVar.equals(b9bVar);
    }

    public final int hashCode() {
        return (this.f21462a.hashCode() * 31) - 1577472723;
    }

    public final String toString() {
        return "DotaTitleItem(title=" + this.f21462a + ", type=" + b9b.f2200a + Separators.RPAREN;
    }
}
