package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class p3a0 implements t3a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f26291a;
    public final a4x b;
    public final int c;
    public final fyl d;
    public final int e;
    public final m1e0 f;
    public final String g;
    public final mdm h;

    public p3a0(imm immVar, a4x a4xVar, int i, fyl fylVar, int i2, m1e0 m1e0Var, String str, mdm mdmVar) {
        this.f26291a = immVar;
        this.b = a4xVar;
        this.c = i;
        this.d = fylVar;
        this.e = i2;
        this.f = m1e0Var;
        this.g = str;
        this.h = mdmVar;
    }

    @Override // a.t3a0
    public final imm a() {
        return this.f26291a;
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
        if (!(obj instanceof p3a0)) {
            return false;
        }
        p3a0 p3a0Var = (p3a0) obj;
        if (!this.f26291a.equals(p3a0Var.f26291a)) {
            return false;
        }
        axh0 axh0Var = axh0.f1625a;
        return axh0Var.equals(axh0Var) && this.b.equals(p3a0Var.b) && this.c == p3a0Var.c && this.d.equals(p3a0Var.d) && this.e == p3a0Var.e && this.f.equals(p3a0Var.f) && this.g.equals(p3a0Var.g) && this.h.equals(p3a0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b((this.f.hashCode() + twn.a(this.e, (this.d.hashCode() + twn.a(this.c, cs0.b(this.b, ((this.f26291a.hashCode() * 31) - 1485121678) * 31, 31), 31)) * 31, 31)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentEmptyBreakdown(dsNavigationBarUiModel=");
        sb.append(this.f26291a);
        sb.append(", segmentedControlStyle=");
        sb.append(axh0.f1625a);
        sb.append(", mainTabsTitleList=");
        sb.append(this.b);
        sb.append(", currentMainTabPosition=");
        sb.append(this.c);
        sb.append(", subTabsChipItems=");
        sb.append(this.d);
        sb.append(", currentSubTabPosition=");
        sb.append(this.e);
        sb.append(", rankCardUiModel=");
        sb.append(this.f);
        sb.append(", selectedSubTabTitle=");
        sb.append(this.g);
        sb.append(", dsEmptyConfig=");
        return cs0.m(sb, this.h, Separators.RPAREN);
    }
}
