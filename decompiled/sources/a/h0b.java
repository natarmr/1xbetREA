package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class h0b {
    public static final g0b Companion = new g0b();
    public static final a8z[] k = {maz.a(wez.f39042a, new e0b(0)), null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12226a;
    public final Double b;
    public final Double c;
    public final Double d;
    public final Double e;
    public final Double f;
    public final Double g;
    public final k0b h;
    public final Long i;
    public final Long j;

    public /* synthetic */ h0b(int i, List list, Double d, Double d2, Double d3, Double d4, Double d5, Double d6, k0b k0bVar, Long l, Long l2) {
        if ((i & 1) == 0) {
            this.f12226a = null;
        } else {
            this.f12226a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = k0bVar;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = l;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = l2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0b)) {
            return false;
        }
        h0b h0bVar = (h0b) obj;
        return Intrinsics.d(this.f12226a, h0bVar.f12226a) && Intrinsics.d(this.b, h0bVar.b) && Intrinsics.d(this.c, h0bVar.c) && Intrinsics.d(this.d, h0bVar.d) && Intrinsics.d(this.e, h0bVar.e) && Intrinsics.d(this.f, h0bVar.f) && Intrinsics.d(this.g, h0bVar.g) && Intrinsics.d(this.h, h0bVar.h) && Intrinsics.d(this.i, h0bVar.i) && Intrinsics.d(this.j, h0bVar.j);
    }

    public final int hashCode() {
        List list = this.f12226a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.d;
        int iHashCode4 = (iHashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.e;
        int iHashCode5 = (iHashCode4 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.f;
        int iHashCode6 = (iHashCode5 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.g;
        int iHashCode7 = (iHashCode6 + (d6 == null ? 0 : d6.hashCode())) * 31;
        k0b k0bVar = this.h;
        int iHashCode8 = (iHashCode7 + (k0bVar == null ? 0 : k0bVar.hashCode())) * 31;
        Long l = this.i;
        int iHashCode9 = (iHashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.j;
        return iHashCode9 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashbackResponse(userGamesChoice=");
        sb.append(this.f12226a);
        sb.append(", balanceInEuro=");
        sb.append(this.b);
        sb.append(", balanceInCurrency=");
        vqd.w(sb, this.c, ", progressBar=", this.d, ", betsInMonth=");
        vqd.w(sb, this.e, ", limit=", this.f, ", limitInEuro=");
        sb.append(this.g);
        sb.append(", cashbackRules=");
        sb.append(this.h);
        sb.append(", nextPayoutDate=");
        sb.append(this.i);
        sb.append(", serverTime=");
        sb.append(this.j);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
