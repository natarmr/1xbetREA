package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class fak0 implements o8w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9212a;
    public final a4x b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final tvw g;
    public final xww h;
    public final xww i;
    public final a4x j;
    public final u180 k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final boolean q;

    public fak0(String str, a4x a4xVar, String str2, String str3, String str4, boolean z, tvw tvwVar, xww xwwVar, xww xwwVar2, a4x a4xVar2, u180 u180Var, String str5, String str6, String str7, String str8, String str9, boolean z2) {
        str.getClass();
        a4xVar.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        a4xVar2.getClass();
        str5.getClass();
        str6.getClass();
        str8.getClass();
        str9.getClass();
        this.f9212a = str;
        this.b = a4xVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = tvwVar;
        this.h = xwwVar;
        this.i = xwwVar2;
        this.j = a4xVar2;
        this.k = u180Var;
        this.l = str5;
        this.m = str6;
        this.n = str7;
        this.o = str8;
        this.p = str9;
        this.q = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fak0)) {
            return false;
        }
        fak0 fak0Var = (fak0) obj;
        return Intrinsics.d(this.f9212a, fak0Var.f9212a) && Intrinsics.d(this.b, fak0Var.b) && Intrinsics.d(this.c, fak0Var.c) && Intrinsics.d(this.d, fak0Var.d) && Intrinsics.d(this.e, fak0Var.e) && this.f == fak0Var.f && this.g.equals(fak0Var.g) && this.h.equals(fak0Var.h) && this.i.equals(fak0Var.i) && Intrinsics.d(this.j, fak0Var.j) && this.k.equals(fak0Var.k) && Intrinsics.d(this.l, fak0Var.l) && Intrinsics.d(this.m, fak0Var.m) && this.n.equals(fak0Var.n) && Intrinsics.d(this.o, fak0Var.o) && Intrinsics.d(this.p, fak0Var.p) && this.q == fak0Var.q;
    }

    @Override // a.o8w
    public final String getKey() {
        return this.f9212a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.q) + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b((this.k.hashCode() + cs0.b(this.j, (this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + brm0.e(ua80.b(ua80.b(ua80.b(cs0.b(this.b, this.f9212a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31)) * 31, 31)) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sbU = kng0.u("SmallHistoryItemUiModel(key=", this.f9212a, ", tagList=", this.b, ", betId=");
        f140.v(sbU, this.c, ", betNumber=", this.d, ", betTitle=");
        brm0.C(this.e, ", isNumberAction=", ", iconBetUiModel=", sbU, this.f);
        sbU.append(this.g);
        sbU.append(", topLeftIcon=");
        sbU.append(this.h);
        sbU.append(", topRightIcon=");
        sbU.append(this.i);
        sbU.append(", itemsDescriptionList=");
        sbU.append(this.j);
        sbU.append(", opponentCardModel=");
        sbU.append(this.k);
        sbU.append(", eventTitle=");
        sbU.append(this.l);
        sbU.append(", marketTitle=");
        f140.v(sbU, this.m, ", subMarketTitle=", this.n, ", coefficient=");
        f140.v(sbU, this.o, ", sellButtonTitle=", this.p, ", isMarketInfoVisible=");
        return rw2.p(sbU, this.q, Separators.RPAREN);
    }
}
