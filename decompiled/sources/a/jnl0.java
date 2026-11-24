package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jnl0 implements pnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1n f16820a;
    public final a1n b;
    public final String c;
    public final String d;
    public final r0n e;
    public final String f;
    public final String g;
    public final f2i h;

    public jnl0(a1n a1nVar, a1n a1nVar2, String str, String str2, r0n r0nVar, String str3, String str4, f2i f2iVar) {
        brm0.B(str, str2, str4);
        this.f16820a = a1nVar;
        this.b = a1nVar2;
        this.c = str;
        this.d = str2;
        this.e = r0nVar;
        this.f = str3;
        this.g = str4;
        this.h = f2iVar;
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
        if (!(obj instanceof jnl0)) {
            return false;
        }
        jnl0 jnl0Var = (jnl0) obj;
        if (!this.f16820a.equals(jnl0Var.f16820a) || !this.b.equals(jnl0Var.b) || !Intrinsics.d(this.c, jnl0Var.c) || !Intrinsics.d(this.d, jnl0Var.d) || !this.e.equals(jnl0Var.e) || !Intrinsics.d(this.f, jnl0Var.f)) {
            return false;
        }
        uem uemVar = uem.f35536a;
        return uemVar.equals(uemVar) && Intrinsics.d(this.g, jnl0Var.g) && Intrinsics.d(this.h, jnl0Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ua80.b(ua80.b((this.b.hashCode() + (this.f16820a.hashCode() * 31)) * 961, 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        int iB = ua80.b((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + 1419988970) * 31, 31, this.g);
        f2i f2iVar = this.h;
        return iB + (f2iVar != null ? f2iVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cyber(teamOneModel=");
        sb.append(this.f16820a);
        sb.append(", teamTwoModel=");
        sb.append(this.b);
        sb.append(", scoreGameTitle=, scoreSetTitle=");
        f140.v(sb, this.c, ", scoreResultTitle=", this.d, ", options=");
        sb.append(this.e);
        sb.append(", infoLabel=");
        sb.append(this.f);
        sb.append(", gameIndicator=");
        sb.append(uem.f35536a);
        sb.append(", tagLiveText=");
        sb.append(this.g);
        sb.append(", broadcastIndicatorModel=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
