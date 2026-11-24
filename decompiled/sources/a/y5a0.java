package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y5a0 implements z5a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9m0 f42036a;
    public final String b;

    public y5a0(j9m0 j9m0Var, String str) {
        str.getClass();
        this.f42036a = j9m0Var;
        this.b = str;
    }

    @Override // a.z5a0
    public final String a() {
        return this.b;
    }

    @Override // a.z5a0
    public final j9m0 b() {
        return this.f42036a;
    }

    @Override // a.z5a0
    public final u5a0 c() {
        return s5a0.f31646a;
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
        if (!(obj instanceof y5a0)) {
            return false;
        }
        y5a0 y5a0Var = (y5a0) obj;
        s5a0 s5a0Var = s5a0.f31646a;
        return s5a0Var.equals(s5a0Var) && this.f42036a.equals(y5a0Var.f42036a) && Intrinsics.d(this.b, y5a0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + w6x.h(this.f42036a, -1917922438, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loading(playerMainHeaderUiModel=");
        sb.append(s5a0.f31646a);
        sb.append(", statisticBackgroundUiModel=");
        sb.append(this.f42036a);
        sb.append(", toolbarTitle=");
        return axq.n(sb, this.b, Separators.RPAREN);
    }
}
