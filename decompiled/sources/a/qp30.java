package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qp30 implements o8w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29097a;
    public final String b;
    public final String c;
    public final tvw d;
    public final String e;
    public final boolean f;
    public final a4x g;
    public final ec h;
    public final kb30 i;
    public final String j;
    public final String k;
    public final String l;
    public final a4x m;
    public final l3w n;
    public final nom0 o;
    public final String p;
    public final so30 q;
    public final so30 r;

    public qp30(String str, String str2, String str3, tvw tvwVar, String str4, boolean z, a4x a4xVar, ec ecVar, kb30 kb30Var, String str5, String str6, String str7, a4x a4xVar2, l3w l3wVar, nom0 nom0Var, String str8, so30 so30Var, so30 so30Var2) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        a4xVar.getClass();
        str6.getClass();
        str7.getClass();
        a4xVar2.getClass();
        str8.getClass();
        this.f29097a = str;
        this.b = str2;
        this.c = str3;
        this.d = tvwVar;
        this.e = str4;
        this.f = z;
        this.g = a4xVar;
        this.h = ecVar;
        this.i = kb30Var;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = a4xVar2;
        this.n = l3wVar;
        this.o = nom0Var;
        this.p = str8;
        this.q = so30Var;
        this.r = so30Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp30)) {
            return false;
        }
        qp30 qp30Var = (qp30) obj;
        return Intrinsics.d(this.f29097a, qp30Var.f29097a) && Intrinsics.d(this.b, qp30Var.b) && this.c.equals(qp30Var.c) && this.d.equals(qp30Var.d) && Intrinsics.d(this.e, qp30Var.e) && this.f == qp30Var.f && Intrinsics.d(this.g, qp30Var.g) && this.h.equals(qp30Var.h) && this.i.equals(qp30Var.i) && this.j.equals(qp30Var.j) && Intrinsics.d(this.k, qp30Var.k) && Intrinsics.d(this.l, qp30Var.l) && Intrinsics.d(this.m, qp30Var.m) && Intrinsics.d(this.n, qp30Var.n) && this.o.equals(qp30Var.o) && Intrinsics.d(this.p, qp30Var.p) && Intrinsics.d(this.q, qp30Var.q) && Intrinsics.d(this.r, qp30Var.r);
    }

    @Override // a.o8w
    public final String getKey() {
        return this.f29097a;
    }

    public final int hashCode() {
        int iB = cs0.b(this.m, ua80.b(ua80.b(ua80.b((this.i.hashCode() + ((this.h.hashCode() + cs0.b(this.g, brm0.e(ua80.b((this.d.hashCode() + ua80.b(ua80.b(this.f29097a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31)) * 31)) * 31, 31, this.j), 31, this.k), 31, this.l), 31);
        l3w l3wVar = this.n;
        int iB2 = ua80.b((this.o.hashCode() + ((iB + (l3wVar == null ? 0 : l3wVar.hashCode())) * 31)) * 31, 31, this.p);
        so30 so30Var = this.q;
        int iHashCode = (iB2 + (so30Var == null ? 0 : so30Var.hashCode())) * 31;
        so30 so30Var2 = this.r;
        return iHashCode + (so30Var2 != null ? so30Var2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("MediumHistoryItemUiModel(key=", this.f29097a, ", betId=", this.b, ", dateIdNumber=");
        sbN.append(this.c);
        sbN.append(", iconBet=");
        sbN.append(this.d);
        sbN.append(", typeTitle=");
        brm0.C(this.e, ", isLive=", ", tagList=", sbN, this.f);
        sbN.append(this.g);
        sbN.append(", accordionUiModel=");
        sbN.append(this.h);
        sbN.append(", matchInfoUiModel=");
        sbN.append(this.i);
        sbN.append(", submarket=");
        sbN.append(this.j);
        sbN.append(", market=");
        f140.v(sbN, this.k, ", coef=", this.l, ", optionLabelItemList=");
        sbN.append(this.m);
        sbN.append(", infoBlock=");
        sbN.append(this.n);
        sbN.append(", statusUiModel=");
        sbN.append(this.o);
        sbN.append(", sellButtonTitle=");
        sbN.append(this.p);
        sbN.append(", firstButtonUiModel=");
        sbN.append(this.q);
        sbN.append(", secondButtonUiModel=");
        sbN.append(this.r);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
