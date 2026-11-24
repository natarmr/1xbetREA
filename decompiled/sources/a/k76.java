package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k76 implements m76 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qws0 f17803a;
    public final qws0 b;
    public final p0n c;
    public final String d;

    public k76(qws0 qws0Var, qws0 qws0Var2, p0n p0nVar, String str) {
        str.getClass();
        this.f17803a = qws0Var;
        this.b = qws0Var2;
        this.c = p0nVar;
        this.d = str;
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
        if (!(obj instanceof k76)) {
            return false;
        }
        k76 k76Var = (k76) obj;
        if (!this.f17803a.equals(k76Var.f17803a) || !this.b.equals(k76Var.b) || !Intrinsics.d(this.c, k76Var.c) || !Intrinsics.d(this.d, k76Var.d)) {
            return false;
        }
        pem pemVar = pem.f26861a;
        return pemVar.equals(pemVar);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f17803a.f29450a.hashCode() * 31, 31, this.b.f29450a);
        p0n p0nVar = this.c;
        return ((this.d.hashCode() + ((iB + (p0nVar == null ? 0 : p0nVar.hashCode())) * 31)) * 31) - 924445215;
    }

    public final String toString() {
        return "TwoOpponents(firstOpponentModel=" + this.f17803a + ", secondOpponentModel=" + this.b + ", timer=" + this.c + ", infoLabel=" + this.d + ", eventStatusIndicatorModel=" + pem.f26861a + Separators.RPAREN;
    }
}
