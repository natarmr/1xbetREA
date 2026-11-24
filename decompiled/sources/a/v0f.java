package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v0f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36579a;
    public final q4f b;
    public final String c;
    public final double d;
    public final double e;
    public final ozc f;
    public final double g;
    public final String h;
    public final List i;
    public final double j;
    public final boolean k;
    public final double l;
    public final oln m;

    public v0f(String str, q4f q4fVar, String str2, double d, double d2, ozc ozcVar, double d3, String str3, List list, double d4, boolean z, double d5, oln olnVar) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f36579a = str;
        this.b = q4fVar;
        this.c = str2;
        this.d = d;
        this.e = d2;
        this.f = ozcVar;
        this.g = d3;
        this.h = str3;
        this.i = list;
        this.j = d4;
        this.k = z;
        this.l = d5;
        this.m = olnVar;
    }

    public static v0f a(v0f v0fVar, q4f q4fVar, double d, ozc ozcVar, double d2, String str, ArrayList arrayList, double d3, boolean z, double d4, oln olnVar, int i) {
        String str2 = v0fVar.f36579a;
        q4f q4fVar2 = (i & 2) != 0 ? v0fVar.b : q4fVar;
        String str3 = v0fVar.c;
        q4f q4fVar3 = q4fVar2;
        double d5 = v0fVar.d;
        double d6 = (i & 16) != 0 ? v0fVar.e : d;
        ozc ozcVar2 = (i & 32) != 0 ? v0fVar.f : ozcVar;
        double d7 = (i & 64) != 0 ? v0fVar.g : d2;
        String str4 = (i & 128) != 0 ? v0fVar.h : str;
        List list = (i & 256) != 0 ? v0fVar.i : arrayList;
        double d8 = (i & 512) != 0 ? v0fVar.j : d3;
        boolean z2 = (i & 1024) != 0 ? v0fVar.k : z;
        double d9 = (i & 2048) != 0 ? v0fVar.l : d4;
        oln olnVar2 = (i & 4096) != 0 ? v0fVar.m : olnVar;
        v0fVar.getClass();
        str2.getClass();
        q4fVar3.getClass();
        str3.getClass();
        list.getClass();
        return new v0f(str2, q4fVar3, str3, d5, d6, ozcVar2, d7, str4, list, d8, z2, d9, olnVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0f)) {
            return false;
        }
        v0f v0fVar = (v0f) obj;
        return Intrinsics.d(this.f36579a, v0fVar.f36579a) && this.b == v0fVar.b && Intrinsics.d(this.c, v0fVar.c) && Double.compare(this.d, v0fVar.d) == 0 && Double.compare(this.e, v0fVar.e) == 0 && this.f == v0fVar.f && Double.compare(this.g, v0fVar.g) == 0 && this.h.equals(v0fVar.h) && Intrinsics.d(this.i, v0fVar.i) && Double.compare(this.j, v0fVar.j) == 0 && this.k == v0fVar.k && Double.compare(this.l, v0fVar.l) == 0 && this.m.equals(v0fVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + brm0.d(this.l, brm0.e(brm0.d(this.j, dw9.a(ua80.b(brm0.d(this.g, (this.f.hashCode() + brm0.d(this.e, brm0.d(this.d, ua80.b(vqd.b(this.b, this.f36579a.hashCode() * 31, 31), 31, this.c), 31), 31)) * 31, 31), 31, this.h), 31, this.i), 31), 31, this.k), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CouponParamsModel(betId=");
        sb.append(this.f36579a);
        sb.append(", couponType=");
        sb.append(this.b);
        sb.append(", currencySymbol=");
        hne.A(sb, this.c, ", initialBetSum=", this.d);
        ohs0.A(sb, this.e, ", actualBetSum=", ", coefType=");
        sb.append(this.f);
        sb.append(", antiExpressCoef=");
        sb.append(this.g);
        ua80.t(", updateCouponExceptionText=", this.h, ", availableCouponTypesList=", sb, this.i);
        ohs0.A(sb, this.j, ", possibleWinCoef=", ", isEachWayBet=");
        sb.append(this.k);
        sb.append(", winSum=");
        sb.append(this.l);
        sb.append(", coefficientState=");
        sb.append(this.m);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
