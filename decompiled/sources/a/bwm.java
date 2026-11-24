package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bwm implements fwm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3332a;
    public final String b;
    public final a4x c;
    public final a4x d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final String k;
    public final String l;

    public bwm(String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, String str5, String str6, boolean z, boolean z2, String str7, String str8) {
        ohs0.z(str, str2, str5, str6, str8);
        this.f3332a = str;
        this.b = str2;
        this.c = a4xVar;
        this.d = a4xVar2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = z;
        this.j = z2;
        this.k = str7;
        this.l = str8;
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
        if (!(obj instanceof bwm)) {
            return false;
        }
        bwm bwmVar = (bwm) obj;
        if (!Intrinsics.d(this.f3332a, bwmVar.f3332a) || !Intrinsics.d(this.b, bwmVar.b) || !this.c.equals(bwmVar.c) || !this.d.equals(bwmVar.d) || !this.e.equals(bwmVar.e) || !this.f.equals(bwmVar.f) || !Intrinsics.d(this.g, bwmVar.g) || !Intrinsics.d(this.h, bwmVar.h) || this.i != bwmVar.i || this.j != bwmVar.j || !this.k.equals(bwmVar.k) || !Intrinsics.d(this.l, bwmVar.l)) {
            return false;
        }
        r2n r2nVar = r2n.f29744a;
        return r2nVar.equals(r2nVar);
    }

    public final int hashCode() {
        return ((Boolean.hashCode(true) + ua80.b(ua80.b(brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(cs0.b(this.d, cs0.b(this.c, ua80.b(this.f3332a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31) + 363200150;
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("V1(firstOpponentLabel=", this.f3332a, ", secondOpponentLabel=", this.b, ", firstOpponentDiceList=");
        hne.y(sbN, this.c, ", secondOpponentDiceList=", this.d, ", firstOpponentCombinationLabel=");
        f140.v(sbN, this.e, ", secondOpponentCombinationLabel=", this.f, ", firstOpponentScore=");
        f140.v(sbN, this.g, ", secondOpponentScore=", this.h, ", isFirstOpponentScoreChanged=");
        ua80.u(", isSecondOpponentScoreChanged=", ", infoLabel=", sbN, this.i, this.j);
        f140.v(sbN, this.k, ", gameLabel=", this.l, ", enableEventStatusIndicator=true, options=");
        sbN.append(r2n.f29744a);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
