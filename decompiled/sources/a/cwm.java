package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cwm implements fwm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5088a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final kpm i;
    public final String j;
    public final boolean k;

    public cwm(String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, String str5, String str6, kpm kpmVar, String str7, boolean z) {
        cs0.x(str, str2, str6, str7);
        this.f5088a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = kpmVar;
        this.j = str7;
        this.k = z;
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
        if (!(obj instanceof cwm)) {
            return false;
        }
        cwm cwmVar = (cwm) obj;
        if (!Intrinsics.d(this.f5088a, cwmVar.f5088a) || !Intrinsics.d(this.b, cwmVar.b) || !this.c.equals(cwmVar.c) || !this.d.equals(cwmVar.d) || !this.e.equals(cwmVar.e) || !this.f.equals(cwmVar.f) || !this.g.equals(cwmVar.g) || !Intrinsics.d(this.h, cwmVar.h) || !this.i.equals(cwmVar.i) || !Intrinsics.d(this.j, cwmVar.j)) {
            return false;
        }
        r2n r2nVar = r2n.f29744a;
        return r2nVar.equals(r2nVar) && this.k == cwmVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ((((this.j.hashCode() + dw9.c(this.i, ua80.b(ua80.b(ua80.b(ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f5088a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31)) * 31) + 363200150) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V2(firstOpponentLabel=", this.f5088a, ", secondOpponentLabel=", this.b, ", firstOpponentDiceList=");
        hne.y(sbN, this.c, ", secondOpponentDiceList=", this.d, ", firstOpponentCombinationLabel=");
        f140.v(sbN, this.e, ", secondOpponentCombinationLabel=", this.f, ", infoLabel=");
        f140.v(sbN, this.g, ", gameLabel=", this.h, ", scoreModel=");
        sbN.append(this.i);
        sbN.append(", tagLiveText=");
        sbN.append(this.j);
        sbN.append(", options=");
        sbN.append(r2n.f29744a);
        sbN.append(", supportRtl=");
        sbN.append(this.k);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
