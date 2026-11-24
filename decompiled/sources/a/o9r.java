package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class o9r {
    public static final n9r Companion = new n9r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f24894a;
    public final r9r b;
    public final Integer c;
    public final Double d;
    public final Double e;
    public final Long f;
    public final Double g;
    public final rk10 h;

    public /* synthetic */ o9r(int i, Integer num, r9r r9rVar, Integer num2, Double d, Double d2, Long l, Double d3, rk10 rk10Var) {
        if ((i & 1) == 0) {
            this.f24894a = null;
        } else {
            this.f24894a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = r9rVar;
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
            this.e = d2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = rk10Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9r)) {
            return false;
        }
        o9r o9rVar = (o9r) obj;
        return Intrinsics.d(this.f24894a, o9rVar.f24894a) && Intrinsics.d(this.b, o9rVar.b) && Intrinsics.d(this.c, o9rVar.c) && Intrinsics.d(this.d, o9rVar.d) && Intrinsics.d(this.e, o9rVar.e) && Intrinsics.d(this.f, o9rVar.f) && Intrinsics.d(this.g, o9rVar.g) && Intrinsics.d(this.h, o9rVar.h);
    }

    public final int hashCode() {
        Integer num = this.f24894a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        r9r r9rVar = this.b;
        int iHashCode2 = (iHashCode + (r9rVar == null ? 0 : r9rVar.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d = this.d;
        int iHashCode4 = (iHashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l = this.f;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Double d3 = this.g;
        int iHashCode7 = (iHashCode6 + (d3 == null ? 0 : d3.hashCode())) * 31;
        rk10 rk10Var = this.h;
        return iHashCode7 + (rk10Var != null ? rk10Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FruitBlastGameResponse(actionNumber=");
        sb.append(this.f24894a);
        sb.append(", result=");
        sb.append(this.b);
        sb.append(", state=");
        hne.z(sb, this.c, ", betSum=", this.d, ", sumWin=");
        sb.append(this.e);
        sb.append(", accountId=");
        sb.append(this.f);
        sb.append(", balanceNew=");
        sb.append(this.g);
        sb.append(", bonusInfo=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
