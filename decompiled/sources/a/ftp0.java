package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ftp0 implements itp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final csp0 f10125a;
    public final a4x b;
    public final a4x c;
    public final int d;
    public final mdm e;
    public final boolean f;

    public ftp0(csp0 csp0Var, a4x a4xVar, a4x a4xVar2, int i, mdm mdmVar, boolean z) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f10125a = csp0Var;
        this.b = a4xVar;
        this.c = a4xVar2;
        this.d = i;
        this.e = mdmVar;
        this.f = z;
    }

    @Override // a.itp0
    public final boolean a() {
        return this.f;
    }

    @Override // a.itp0
    public final csp0 b() {
        return this.f10125a;
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
        if (!(obj instanceof ftp0)) {
            return false;
        }
        ftp0 ftp0Var = (ftp0) obj;
        if (!this.f10125a.equals(ftp0Var.f10125a)) {
            return false;
        }
        axh0 axh0Var = axh0.f1625a;
        return axh0Var.equals(axh0Var) && Intrinsics.d(this.b, ftp0Var.b) && Intrinsics.d(this.c, ftp0Var.c) && this.d == ftp0Var.d && this.e.equals(ftp0Var.e) && this.f == ftp0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + f140.d(this.e, twn.a(this.d, cs0.b(this.c, cs0.b(this.b, ((this.f10125a.hashCode() * 31) - 1485121678) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(headerUiState=");
        sb.append(this.f10125a);
        sb.append(", segmentedControlStyle=");
        sb.append(axh0.f1625a);
        sb.append(", tabsTitleList=");
        hne.y(sb, this.b, ", menuList=", this.c, ", pageCount=");
        sb.append(this.d);
        sb.append(", emptyPageLottieConfig=");
        sb.append(this.e);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.f, Separators.RPAREN);
    }
}
