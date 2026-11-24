package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class rk10 implements Serializable {
    public static final qk10 Companion = new qk10();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uk10 f30625a;
    public final String b;
    public final long c;
    public final de8 d;
    public final long e;
    public final Long f;
    public final Double g;

    static {
        new rk10(null, 0L, null, 0L, Double.valueOf(0.0d), 47);
    }

    public /* synthetic */ rk10(int i, uk10 uk10Var, String str, long j, de8 de8Var, long j2, Long l, Double d) {
        if ((i & 1) == 0) {
            this.f30625a = null;
        } else {
            this.f30625a = uk10Var;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = 0L;
        } else {
            this.c = j;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = de8Var;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j2;
        }
        if ((i & 32) == 0) {
            this.f = 0L;
        } else {
            this.f = l;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!rk10.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        rk10 rk10Var = (rk10) obj;
        if (this.f30625a == rk10Var.f30625a) {
            Double d = rk10Var.g;
            Double d2 = this.g;
            if (d2 != null ? !(d == null || d2.doubleValue() != d.doubleValue()) : d == null) {
                if (this.c == rk10Var.c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        uk10 uk10Var = this.f30625a;
        int iHashCode = (uk10Var != null ? uk10Var.hashCode() : 0) * 31;
        Double d = this.g;
        return Long.hashCode(this.c) + ((iHashCode + (d != null ? d.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LuckyWheelBonus(bonusType=");
        sb.append(this.f30625a);
        sb.append(", bonusDescription=");
        sb.append(this.b);
        sb.append(", gameTypeId=");
        sb.append(this.c);
        sb.append(", bonusEnabled=");
        sb.append(this.d);
        kng0.A(sb, ", count=", this.e, ", remainingTime=");
        sb.append(this.f);
        sb.append(", freeBetSum=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public rk10(uk10 uk10Var, long j, de8 de8Var, long j2, Double d, int i) {
        uk10Var = (i & 1) != 0 ? null : uk10Var;
        j = (i & 4) != 0 ? 0L : j;
        de8Var = (i & 8) != 0 ? null : de8Var;
        this.f30625a = uk10Var;
        this.b = "";
        this.c = j;
        this.d = de8Var;
        this.e = j2;
        this.f = 0L;
        this.g = d;
    }
}
