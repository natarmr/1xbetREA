package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ru1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f31103a;
    public final byte b;
    public final dxh0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public ru1(int i, a4x a4xVar, dxh0 dxh0Var) {
        a4xVar.getClass();
        this.f31103a = a4xVar;
        this.b = i;
        this.c = dxh0Var;
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
        if (!(obj instanceof ru1)) {
            return false;
        }
        ru1 ru1Var = (ru1) obj;
        if (!Intrinsics.d(this.f31103a, ru1Var.f31103a) || this.b != ru1Var.b) {
            return false;
        }
        gxh0 gxh0Var = gxh0.f12078a;
        return gxh0Var.equals(gxh0Var) && this.c.equals(ru1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((Integer.hashCode(this.b) + (this.f31103a.hashCode() * 31)) * 31) - 242323901) * 31);
    }

    public final String toString() {
        return "AggregatorTournamentFullInfoSegmentControlUiModel(segments=" + this.f31103a + ", selectedIndex=" + ((int) this.b) + ", type=" + gxh0.f12078a + ", style=" + this.c + Separators.RPAREN;
    }
}
