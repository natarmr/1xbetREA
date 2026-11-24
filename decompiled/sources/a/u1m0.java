package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class u1m0 {
    public static final t1m0 Companion = new t1m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34907a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final Long f;
    public final String g;

    public /* synthetic */ u1m0(int i, String str, String str2, String str3, String str4, Long l, Long l2, String str5) {
        if ((i & 1) == 0) {
            this.f34907a = null;
        } else {
            this.f34907a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1m0)) {
            return false;
        }
        u1m0 u1m0Var = (u1m0) obj;
        return Intrinsics.d(this.f34907a, u1m0Var.f34907a) && Intrinsics.d(this.b, u1m0Var.b) && Intrinsics.d(this.c, u1m0Var.c) && Intrinsics.d(this.d, u1m0Var.d) && Intrinsics.d(this.e, u1m0Var.e) && Intrinsics.d(this.f, u1m0Var.f) && Intrinsics.d(this.g, u1m0Var.g);
    }

    public final int hashCode() {
        String str = this.f34907a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.e;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str5 = this.g;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("StageResponse(id=", this.f34907a, ", title=", this.b, ", city=");
        f140.v(sbN, this.c, ", logo=", this.d, ", dateStart=");
        cs0.A(sbN, this.e, ", dateEnd=", this.f, ", season=");
        return axq.n(sbN, this.g, Separators.RPAREN);
    }
}
