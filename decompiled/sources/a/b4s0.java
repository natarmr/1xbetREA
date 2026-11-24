package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b4s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f1974a;
    public final dxh0 b;

    public b4s0(i4 i4Var, dxh0 dxh0Var) {
        i4Var.getClass();
        this.f1974a = i4Var;
        this.b = dxh0Var;
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
        if (!(obj instanceof b4s0)) {
            return false;
        }
        b4s0 b4s0Var = (b4s0) obj;
        if (!Intrinsics.d(this.f1974a, b4s0Var.f1974a)) {
            return false;
        }
        gxh0 gxh0Var = gxh0.f12078a;
        return gxh0Var.equals(gxh0Var) && this.b.equals(b4s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (((this.f1974a.hashCode() * 31) - 242323901) * 31);
    }

    public final String toString() {
        return "TournamentPrizesTabsModel(segments=" + this.f1974a + ", type=" + gxh0.f12078a + ", style=" + this.b + Separators.RPAREN;
    }
}
