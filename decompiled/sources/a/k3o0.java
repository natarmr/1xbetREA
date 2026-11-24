package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k3o0 implements q3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hvm f17629a;
    public final hvm b;
    public final String c;
    public final a4x d;
    public final zum e;

    public k3o0(hvm hvmVar, hvm hvmVar2, String str, a4x a4xVar, zum zumVar) {
        a4xVar.getClass();
        this.f17629a = hvmVar;
        this.b = hvmVar2;
        this.c = str;
        this.d = a4xVar;
        this.e = zumVar;
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
        if (!(obj instanceof k3o0)) {
            return false;
        }
        k3o0 k3o0Var = (k3o0) obj;
        if (!this.f17629a.equals(k3o0Var.f17629a) || !this.b.equals(k3o0Var.b) || !this.c.equals(k3o0Var.c) || !Intrinsics.d(this.d, k3o0Var.d)) {
            return false;
        }
        qem qemVar = qem.f28591a;
        return qemVar.equals(qemVar) && this.e.equals(k3o0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((((this.d.hashCode() + ua80.b((this.b.hashCode() + (this.f17629a.hashCode() * 31)) * 29791, 31, this.c)) * 31) - 924444967) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberPoker(firstOpponent=");
        sb.append(this.f17629a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", infoLabel=, infoLabel2=, gameLabel=");
        cs0.B(sb, this.c, ", cardOnTableList=", this.d, ", eventStatusIndicatorModel=");
        sb.append(qem.f28591a);
        sb.append(", options=");
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
