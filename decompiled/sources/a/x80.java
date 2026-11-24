package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class x80 {
    public static final w80 Companion = new w80();
    public static final a8z[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f40439a;
    public final List b;
    public final Integer c;
    public final Double d;
    public final List e;
    public final Long f;
    public final Double g;

    static {
        wez wezVar = wez.f39042a;
        h = new a8z[]{null, maz.a(wezVar, new q8((byte) 22)), null, null, maz.a(wezVar, new q8((byte) 23)), null, null};
    }

    public /* synthetic */ x80(int i, Integer num, List list, Integer num2, Double d, List list2, Long l, Double d2) {
        if ((i & 1) == 0) {
            this.f40439a = null;
        } else {
            this.f40439a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x80)) {
            return false;
        }
        x80 x80Var = (x80) obj;
        return Intrinsics.d(this.f40439a, x80Var.f40439a) && Intrinsics.d(this.b, x80Var.b) && Intrinsics.d(this.c, x80Var.c) && Intrinsics.d(this.d, x80Var.d) && Intrinsics.d(this.e, x80Var.e) && Intrinsics.d(this.f, x80Var.f) && Intrinsics.d(this.g, x80Var.g);
    }

    public final int hashCode() {
        Integer num = this.f40439a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Double d2 = this.g;
        return iHashCode6 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AfricanRouletteSpinResponse(coef=");
        sb.append(this.f40439a);
        sb.append(", result=");
        sb.append(this.b);
        sb.append(", gameStatus=");
        hne.z(sb, this.c, ", sumWin=", this.d, ", rouletteWins=");
        sb.append(this.e);
        sb.append(", accountId=");
        sb.append(this.f);
        sb.append(", balanceNew=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
