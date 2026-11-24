package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class vrh0 {
    public static final orh0 Companion = new orh0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f37898a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final rrh0 h;
    public final Boolean i;
    public final Integer j;
    public final Integer k;
    public final String l;

    public /* synthetic */ vrh0(int i, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, rrh0 rrh0Var, Boolean bool, Integer num8, Integer num9, String str) {
        if ((i & 1) == 0) {
            this.f37898a = null;
        } else {
            this.f37898a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = rrh0Var;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = bool;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = num8;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = num9;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrh0)) {
            return false;
        }
        vrh0 vrh0Var = (vrh0) obj;
        return Intrinsics.d(this.f37898a, vrh0Var.f37898a) && Intrinsics.d(this.b, vrh0Var.b) && Intrinsics.d(this.c, vrh0Var.c) && Intrinsics.d(this.d, vrh0Var.d) && Intrinsics.d(this.e, vrh0Var.e) && Intrinsics.d(this.f, vrh0Var.f) && Intrinsics.d(this.g, vrh0Var.g) && Intrinsics.d(this.h, vrh0Var.h) && Intrinsics.d(this.i, vrh0Var.i) && Intrinsics.d(this.j, vrh0Var.j) && Intrinsics.d(this.k, vrh0Var.k) && Intrinsics.d(this.l, vrh0Var.l);
    }

    public final int hashCode() {
        Integer num = this.f37898a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.e;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.g;
        int iHashCode7 = (iHashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        rrh0 rrh0Var = this.h;
        int iHashCode8 = (iHashCode7 + (rrh0Var == null ? 0 : rrh0Var.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num8 = this.j;
        int iHashCode10 = (iHashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.k;
        int iHashCode11 = (iHashCode10 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str = this.l;
        return iHashCode11 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("SecurityLevelGetResponse(currentAmout=", this.f37898a, ", lastDayChangePass=", this.b, ", dayChangePassCount=");
        rz4.y(sbQ, this.c, ", protectionWeight=", this.d, ", protectionType=");
        rz4.y(sbQ, this.e, ", protectionStage=", this.f, ", totalAmout=");
        sbQ.append(this.g);
        sbQ.append(", typeSecurity=");
        sbQ.append(this.h);
        sbQ.append(", isAvailablePromo=");
        h97.u(this.i, this.j, ", nextAvailableDayPromo=", ", lastDayPromo=", sbQ);
        sbQ.append(this.k);
        sbQ.append(", title=");
        sbQ.append(this.l);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
