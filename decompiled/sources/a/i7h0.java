package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class i7h0 {
    public static final h7h0 Companion = new h7h0();
    public static final a8z[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f14291a;
    public final Double b;
    public final Double c;
    public final String d;
    public final Double e;
    public final List f;
    public final List g;

    static {
        wez wezVar = wez.f39042a;
        h = new a8z[]{null, null, null, null, null, maz.a(wezVar, new yxg0((byte) 20)), maz.a(wezVar, new yxg0((byte) 21))};
    }

    public /* synthetic */ i7h0(int i, Long l, Double d, Double d2, String str, Double d3, List list, List list2) {
        if ((i & 1) == 0) {
            this.f14291a = null;
        } else {
            this.f14291a = l;
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
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7h0)) {
            return false;
        }
        i7h0 i7h0Var = (i7h0) obj;
        return Intrinsics.d(this.f14291a, i7h0Var.f14291a) && Intrinsics.d(this.b, i7h0Var.b) && Intrinsics.d(this.c, i7h0Var.c) && Intrinsics.d(this.d, i7h0Var.d) && Intrinsics.d(this.e, i7h0Var.e) && Intrinsics.d(this.f, i7h0Var.f) && Intrinsics.d(this.g, i7h0Var.g);
    }

    public final int hashCode() {
        Long l = this.f14291a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        int iHashCode3 = (iHashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str = this.d;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Double d3 = this.e;
        int iHashCode5 = (iHashCode4 + (d3 == null ? 0 : d3.hashCode())) * 31;
        List list = this.f;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.g;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScratchCardResponse(accountId=");
        sb.append(this.f14291a);
        sb.append(", newBalance=");
        sb.append(this.b);
        sb.append(", winSum=");
        ua80.w(sb, this.c, ", gameStatus=", this.d, ", coefficient=");
        sb.append(this.e);
        sb.append(", gameField=");
        sb.append(this.f);
        sb.append(", winLines=");
        return dw9.r(sb, this.g, Separators.RPAREN);
    }
}
