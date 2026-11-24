package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class et30 {
    public static final dt30 Companion = new dt30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f8358a;
    public final Integer b;
    public final Integer c;
    public final wr30 d;
    public final Long e;
    public final Double f;

    static {
        vr30 vr30Var = wr30.Companion;
    }

    public /* synthetic */ et30(int i, Long l, Integer num, Integer num2, wr30 wr30Var, Long l2, Double d) {
        if ((i & 1) == 0) {
            this.f8358a = null;
        } else {
            this.f8358a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = wr30Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et30)) {
            return false;
        }
        et30 et30Var = (et30) obj;
        return Intrinsics.d(this.f8358a, et30Var.f8358a) && Intrinsics.d(this.b, et30Var.b) && Intrinsics.d(this.c, et30Var.c) && Intrinsics.d(this.d, et30Var.d) && Intrinsics.d(this.e, et30Var.e) && Intrinsics.d(this.f, et30Var.f);
    }

    public final int hashCode() {
        Long l = this.f8358a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        wr30 wr30Var = this.d;
        int iHashCode4 = (iHashCode3 + (wr30Var == null ? 0 : wr30Var.hashCode())) * 31;
        Long l2 = this.e;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d = this.f;
        return iHashCode5 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = cs0.q(this.b, this.f8358a, "MemoryResponse(userId=", ", bonusBalance=", ", rotationCount=");
        sbQ.append(this.c);
        sbQ.append(", gameMemory=");
        sbQ.append(this.d);
        sbQ.append(", accountId=");
        sbQ.append(this.e);
        sbQ.append(", balanceNew=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
