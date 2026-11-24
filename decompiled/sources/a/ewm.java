package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ewm implements fwm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8534a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final y1m j;
    public final boolean k;

    public ewm(String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, String str5, String str6, String str7, y1m y1mVar, boolean z) {
        ohs0.z(str, str2, str5, str6, str7);
        this.f8534a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = y1mVar;
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
        if (!(obj instanceof ewm)) {
            return false;
        }
        ewm ewmVar = (ewm) obj;
        if (!Intrinsics.d(this.f8534a, ewmVar.f8534a) || !Intrinsics.d(this.b, ewmVar.b) || !this.c.equals(ewmVar.c) || !this.d.equals(ewmVar.d) || !this.e.equals(ewmVar.e) || !this.f.equals(ewmVar.f) || !Intrinsics.d(this.g, ewmVar.g) || !Intrinsics.d(this.h, ewmVar.h) || !Intrinsics.d(this.i, ewmVar.i) || !this.j.equals(ewmVar.j)) {
            return false;
        }
        r2n r2nVar = r2n.f29744a;
        return r2nVar.equals(r2nVar) && this.k == ewmVar.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + ((((this.j.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f8534a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31) + 363200150) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V4(firstOpponentLabel=", this.f8534a, ", secondOpponentLabel=", this.b, ", firstOpponentDiceList=");
        hne.y(sbN, this.c, ", secondOpponentDiceList=", this.d, ", firstOpponentCombinationLabel=");
        f140.v(sbN, this.e, ", secondOpponentCombinationLabel=", this.f, ", gameLabel=");
        f140.v(sbN, this.g, ", infoLabel=", this.h, ", tagLiveText=");
        sbN.append(this.i);
        sbN.append(", scoreModel=");
        sbN.append(this.j);
        sbN.append(", options=");
        sbN.append(r2n.f29744a);
        sbN.append(", supportRtl=");
        sbN.append(this.k);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
