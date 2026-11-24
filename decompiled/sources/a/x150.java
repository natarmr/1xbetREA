package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x150 implements k250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40104a;

    public x150(String str) {
        str.getClass();
        this.f40104a = str;
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
        if (!(obj instanceof x150) || !Intrinsics.d(this.f40104a, ((x150) obj).f40104a)) {
            return false;
        }
        vyh vyhVar = vyh.f38247a;
        return vyhVar.equals(vyhVar);
    }

    @Override // a.k250
    public final String getKey() {
        return this.f40104a;
    }

    public final int hashCode() {
        return (this.f40104a.hashCode() * 31) + 1456381988;
    }

    public final String toString() {
        return "AuthorizationBanner(key=" + this.f40104a + ", model=" + vyh.f38247a + Separators.RPAREN;
    }
}
