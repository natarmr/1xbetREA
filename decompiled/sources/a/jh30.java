package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class jh30 {
    public static final ih30 Companion = new ih30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f16509a;
    public final Float b;
    public final Float c;
    public final Float d;
    public final Float e;
    public final Float f;

    public /* synthetic */ jh30(int i, Float f, Float f2, Float f3, Float f4, Float f5, Float f6) {
        if ((i & 1) == 0) {
            this.f16509a = null;
        } else {
            this.f16509a = f;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = f5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh30)) {
            return false;
        }
        jh30 jh30Var = (jh30) obj;
        return Intrinsics.d(this.f16509a, jh30Var.f16509a) && Intrinsics.d(this.b, jh30Var.b) && Intrinsics.d(this.c, jh30Var.c) && Intrinsics.d(this.d, jh30Var.d) && Intrinsics.d(this.e, jh30Var.e) && Intrinsics.d(this.f, jh30Var.f);
    }

    public final int hashCode() {
        Float f = this.f16509a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.b;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.c;
        int iHashCode3 = (iHashCode2 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.d;
        int iHashCode4 = (iHashCode3 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Float f5 = this.e;
        int iHashCode5 = (iHashCode4 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.f;
        return iHashCode5 + (f6 != null ? f6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MatchesPlayersStatisticsResponse(rating=");
        sb.append(this.f16509a);
        sb.append(", adr=");
        sb.append(this.b);
        sb.append(", kpr=");
        vqd.x(sb, this.c, ", dpr=", this.d, ", kast=");
        sb.append(this.e);
        sb.append(", impact=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
