package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cuo implements o8w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4996a;
    public final String b;
    public final String c;
    public final wm7 d;
    public final a4x e;
    public final yto f;
    public final yto g;
    public final wul h;
    public final tvw i;
    public final String j;
    public final boolean k;
    public final String l;
    public final String m;
    public final a4x n;
    public final l3w o;

    public cuo(String str, String str2, String str3, wm7 wm7Var, a4x a4xVar, yto ytoVar, yto ytoVar2, wul wulVar, tvw tvwVar, String str4, boolean z, String str5, String str6, a4x a4xVar2, l3w l3wVar) {
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        str4.getClass();
        str6.getClass();
        a4xVar2.getClass();
        this.f4996a = str;
        this.b = str2;
        this.c = str3;
        this.d = wm7Var;
        this.e = a4xVar;
        this.f = ytoVar;
        this.g = ytoVar2;
        this.h = wulVar;
        this.i = tvwVar;
        this.j = str4;
        this.k = z;
        this.l = str5;
        this.m = str6;
        this.n = a4xVar2;
        this.o = l3wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuo)) {
            return false;
        }
        cuo cuoVar = (cuo) obj;
        return Intrinsics.d(this.f4996a, cuoVar.f4996a) && Intrinsics.d(this.b, cuoVar.b) && this.c.equals(cuoVar.c) && this.d.equals(cuoVar.d) && Intrinsics.d(this.e, cuoVar.e) && Intrinsics.d(this.f, cuoVar.f) && Intrinsics.d(this.g, cuoVar.g) && Intrinsics.d(this.h, cuoVar.h) && this.i.equals(cuoVar.i) && Intrinsics.d(this.j, cuoVar.j) && this.k == cuoVar.k && this.l.equals(cuoVar.l) && Intrinsics.d(this.m, cuoVar.m) && Intrinsics.d(this.n, cuoVar.n) && Intrinsics.d(this.o, cuoVar.o);
    }

    @Override // a.o8w
    public final String getKey() {
        return this.f4996a;
    }

    public final int hashCode() {
        int iB = cs0.b(this.e, (this.d.hashCode() + ua80.b(ua80.b(this.f4996a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31);
        yto ytoVar = this.f;
        int iHashCode = (iB + (ytoVar == null ? 0 : ytoVar.hashCode())) * 31;
        yto ytoVar2 = this.g;
        int iHashCode2 = (iHashCode + (ytoVar2 == null ? 0 : ytoVar2.hashCode())) * 31;
        wul wulVar = this.h;
        int iB2 = cs0.b(this.n, ua80.b(ua80.b(brm0.e(ua80.b((this.i.hashCode() + ((iHashCode2 + (wulVar == null ? 0 : wulVar.hashCode())) * 31)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31);
        l3w l3wVar = this.o;
        return iB2 + (l3wVar != null ? l3wVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ExtraSmallHistoryItemUiModel(key=", this.f4996a, ", betId=", this.b, ", dateIdNumber=");
        sbN.append(this.c);
        sbN.append(", status=");
        sbN.append(this.d);
        sbN.append(", tagList=");
        sbN.append(this.e);
        sbN.append(", firstButtonUiModel=");
        sbN.append(this.f);
        sbN.append(", secondButtonUiModel=");
        sbN.append(this.g);
        sbN.append(", sellButtonUiModel=");
        sbN.append(this.h);
        sbN.append(", iconBetUiModel=");
        sbN.append(this.i);
        sbN.append(", typeTitle=");
        sbN.append(this.j);
        sbN.append(", hasExpressCounter=");
        f140.s(", expressEventCount=", this.l, ", coefficient=", sbN, this.k);
        cs0.B(sbN, this.m, ", optionalLabelList=", this.n, ", infoBlockUiModel=");
        sbN.append(this.o);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
