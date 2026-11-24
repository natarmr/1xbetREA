package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class snl0 implements xnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0n f32501a;
    public final z0n b;
    public final String c;
    public final p0n d;
    public final String e;
    public final String f;

    public snl0(z0n z0nVar, z0n z0nVar2, String str, p0n p0nVar, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        this.f32501a = z0nVar;
        this.b = z0nVar2;
        this.c = str;
        this.d = p0nVar;
        this.e = str2;
        this.f = str3;
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
        if (!(obj instanceof snl0)) {
            return false;
        }
        snl0 snl0Var = (snl0) obj;
        if (!this.f32501a.equals(snl0Var.f32501a) || !this.b.equals(snl0Var.b) || !Intrinsics.d(this.c, snl0Var.c) || !Intrinsics.d(this.d, snl0Var.d) || !Intrinsics.d(this.e, snl0Var.e) || !Intrinsics.d(this.f, snl0Var.f)) {
            return false;
        }
        uem uemVar = uem.f35536a;
        return uemVar.equals(uemVar);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f32501a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        p0n p0nVar = this.d;
        return ((this.f.hashCode() + ua80.b((iHashCode2 + (p0nVar != null ? p0nVar.hashCode() : 0)) * 961, 31, this.e)) * 31) + 1419988970;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiTeams(teamOneModel=");
        sb.append(this.f32501a);
        sb.append(", teamTwoModel=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        sb.append(this.c);
        sb.append(", timer=");
        sb.append(this.d);
        sb.append(", scoreGameTitle=, scoreSetTitle=");
        f140.v(sb, this.e, ", scoreResultTitle=", this.f, ", gameIndicator=");
        sb.append(uem.f35536a);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
