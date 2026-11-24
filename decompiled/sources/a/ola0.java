package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ola0 implements rla0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xka0 f25443a;
    public final f9m0 b;
    public final boolean c;
    public final a4x d;
    public final int e;
    public final boolean f;
    public final fyl g;
    public final int h;
    public final nla0 i;
    public final mtl j;

    public ola0(xka0 xka0Var, f9m0 f9m0Var, boolean z, a4x a4xVar, int i, boolean z2, fyl fylVar, int i2, nla0 nla0Var, mtl mtlVar) {
        a4xVar.getClass();
        this.f25443a = xka0Var;
        this.b = f9m0Var;
        this.c = z;
        this.d = a4xVar;
        this.e = i;
        this.f = z2;
        this.g = fylVar;
        this.h = i2;
        this.i = nla0Var;
        this.j = mtlVar;
    }

    @Override // a.rla0
    public final boolean a() {
        return this.c;
    }

    @Override // a.rla0
    public final xka0 b() {
        return this.f25443a;
    }

    @Override // a.rla0
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
        if (!(obj instanceof ola0)) {
            return false;
        }
        ola0 ola0Var = (ola0) obj;
        if (!this.f25443a.equals(ola0Var.f25443a) || !this.b.equals(ola0Var.b) || this.c != ola0Var.c) {
            return false;
        }
        axh0 axh0Var = axh0.f1625a;
        return axh0Var.equals(axh0Var) && Intrinsics.d(this.d, ola0Var.d) && this.e == ola0Var.e && this.f == ola0Var.f && this.g.equals(ola0Var.g) && this.h == ola0Var.h && this.i.equals(ola0Var.i) && Intrinsics.d(this.j, ola0Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.i.hashCode() + twn.a(this.h, (this.g.hashCode() + brm0.e(twn.a(this.e, cs0.b(this.d, (((Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f25443a.hashCode() * 31)) * 31)) * 31) - 1485121678) * 31, 31), 31), 31, this.f)) * 31, 31)) * 31;
        mtl mtlVar = this.j;
        return iHashCode + (mtlVar == null ? 0 : mtlVar.f22376a.hashCode());
    }

    public final String toString() {
        return "Content(headerUiState=" + this.f25443a + ", statisticAppBarUiModel=" + this.b + ", rtlSupport=" + this.c + ", teamSegmentedControlStyle=" + axh0.f1625a + ", teamTabsTitleList=" + this.d + ", currentTeamTabPosition=" + this.e + ", inningsVisibility=" + this.f + ", inningsList=" + this.g + ", currentInningPosition=" + this.h + ", tableCellsUiModel=" + this.i + ", resultsButton=" + this.j + Separators.RPAREN;
    }
}
