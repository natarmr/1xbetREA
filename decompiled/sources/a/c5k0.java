package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c5k0 implements f5k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z4k0 f3776a;
    public final a4x b;
    public final boolean c;

    public c5k0(z4k0 z4k0Var, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f3776a = z4k0Var;
        this.b = a4xVar;
        this.c = z;
    }

    @Override // a.f5k0
    public final boolean a() {
        return this.c;
    }

    @Override // a.f5k0
    public final z4k0 b() {
        return this.f3776a;
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
        if (!(obj instanceof c5k0)) {
            return false;
        }
        c5k0 c5k0Var = (c5k0) obj;
        if (!this.f3776a.equals(c5k0Var.f3776a)) {
            return false;
        }
        axh0 axh0Var = axh0.f1625a;
        return axh0Var.equals(axh0Var) && Intrinsics.d(this.b, c5k0Var.b) && this.c == c5k0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cs0.b(this.b, ((this.f3776a.hashCode() * 31) - 1485121678) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(headerUiState=");
        sb.append(this.f3776a);
        sb.append(", segmentedControlStyle=");
        sb.append(axh0.f1625a);
        sb.append(", menuList=");
        return rz4.m(sb, this.b, ", rtlSupport=", this.c, Separators.RPAREN);
    }
}
