package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f5o0 implements l5o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mvm f8973a;
    public final mvm b;
    public final String c;
    public final String d;
    public final a4x e;
    public final zum f;

    public f5o0(mvm mvmVar, mvm mvmVar2, String str, String str2, a4x a4xVar, zum zumVar) {
        a4xVar.getClass();
        this.f8973a = mvmVar;
        this.b = mvmVar2;
        this.c = str;
        this.d = str2;
        this.e = a4xVar;
        this.f = zumVar;
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
        if (!(obj instanceof f5o0)) {
            return false;
        }
        f5o0 f5o0Var = (f5o0) obj;
        if (!this.f8973a.equals(f5o0Var.f8973a) || !this.b.equals(f5o0Var.b) || !this.c.equals(f5o0Var.c) || !this.d.equals(f5o0Var.d) || !Intrinsics.d(this.e, f5o0Var.e)) {
            return false;
        }
        pem pemVar = pem.f26861a;
        return pemVar.equals(pemVar) && this.f.equals(f5o0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((((this.e.hashCode() + ua80.b(ua80.b((this.b.hashCode() + (this.f8973a.hashCode() * 31)) * 961, 31, this.c), 31, this.d)) * 31) - 924445215) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberPoker(firstOpponent=");
        sb.append(this.f8973a);
        sb.append(", secondOpponent=");
        sb.append(this.b);
        sb.append(", infoLabel=, infoLabel2=");
        f140.v(sb, this.c, ", gameLabel=", this.d, ", cardOnTableList=");
        sb.append(this.e);
        sb.append(", eventStatusIndicatorModel=");
        sb.append(pem.f26861a);
        sb.append(", options=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
