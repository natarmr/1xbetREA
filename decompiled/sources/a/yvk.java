package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yvk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f43324a;
    public final int b;

    public yvk(int i, a4x a4xVar) {
        a4xVar.getClass();
        this.f43324a = a4xVar;
        this.b = i;
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
        if (!(obj instanceof yvk)) {
            return false;
        }
        yvk yvkVar = (yvk) obj;
        if (!Intrinsics.d(this.f43324a, yvkVar.f43324a)) {
            return false;
        }
        cxh0 cxh0Var = cxh0.f5122a;
        if (!cxh0Var.equals(cxh0Var) || this.b != yvkVar.b) {
            return false;
        }
        gxh0 gxh0Var = gxh0.f12078a;
        return gxh0Var.equals(gxh0Var);
    }

    public final int hashCode() {
        return ((Integer.hashCode(this.b) + (((this.f43324a.hashCode() * 31) - 1510701217) * 31)) * 31) - 242323901;
    }

    public final String toString() {
        return "DisplayOrderTabsUiModel(segments=" + this.f43324a + ", style=" + cxh0.f5122a + ", selectedPosition=" + this.b + ", type=" + gxh0.f12078a + Separators.RPAREN;
    }
}
