package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tnl0 implements xnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34242a;
    public final uxm b;
    public final String c;

    public tnl0(String str, uxm uxmVar, String str2) {
        str.getClass();
        this.f34242a = str;
        this.b = uxmVar;
        this.c = str2;
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
        if (!(obj instanceof tnl0)) {
            return false;
        }
        tnl0 tnl0Var = (tnl0) obj;
        if (!Intrinsics.d(this.f34242a, tnl0Var.f34242a) || !Intrinsics.d(this.b, tnl0Var.b) || !this.c.equals(tnl0Var.c)) {
            return false;
        }
        qem qemVar = qem.f28591a;
        return qemVar.equals(qemVar);
    }

    public final int hashCode() {
        int iHashCode = this.f34242a.hashCode() * 31;
        uxm uxmVar = this.b;
        return ((this.c.hashCode() + ((iHashCode + (uxmVar == null ? 0 : uxmVar.hashCode())) * 31)) * 31) - 924444967;
    }

    public final String toString() {
        return "OneOpponent(opponentName=" + this.f34242a + ", timer=" + this.b + ", infoLabel=" + this.c + ", eventStatusIndicatorModel=" + qem.f28591a + Separators.RPAREN;
    }
}
