package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sma0 implements vma0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gma0 f32435a;
    public final f9m0 b;
    public final boolean c;
    public final a4x d;
    public final int e;
    public final rma0 f;

    public sma0(gma0 gma0Var, f9m0 f9m0Var, boolean z, a4x a4xVar, int i, rma0 rma0Var) {
        a4xVar.getClass();
        this.f32435a = gma0Var;
        this.b = f9m0Var;
        this.c = z;
        this.d = a4xVar;
        this.e = i;
        this.f = rma0Var;
    }

    @Override // a.vma0
    public final boolean a() {
        return this.c;
    }

    @Override // a.vma0
    public final gma0 b() {
        return this.f32435a;
    }

    @Override // a.vma0
    public final f9m0 c() {
        return this.b;
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
        if (!(obj instanceof sma0)) {
            return false;
        }
        sma0 sma0Var = (sma0) obj;
        if (!this.f32435a.equals(sma0Var.f32435a) || !this.b.equals(sma0Var.b) || this.c != sma0Var.c) {
            return false;
        }
        axh0 axh0Var = axh0.f1625a;
        return axh0Var.equals(axh0Var) && Intrinsics.d(this.d, sma0Var.d) && this.e == sma0Var.e && this.f.equals(sma0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + twn.a(this.e, cs0.b(this.d, (((Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f32435a.hashCode() * 31)) * 31)) * 31) - 1485121678) * 31, 31), 31);
    }

    public final String toString() {
        return "Content(headerUiState=" + this.f32435a + ", statisticAppBarUiModel=" + this.b + ", rtlSupport=" + this.c + ", segmentedControlStyle=" + axh0.f1625a + ", tabsTitleList=" + this.d + ", currentTabPosition=" + this.e + ", tableCellsUiModel=" + this.f + Separators.RPAREN;
    }
}
