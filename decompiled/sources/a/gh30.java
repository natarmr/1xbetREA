package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class gh30 {
    public static final fh30 Companion = new fh30();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f11280a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;
    public final jh30 h;

    public /* synthetic */ gh30(int i, Long l, String str, String str2, Integer num, String str3, String str4, String str5, jh30 jh30Var) {
        if ((i & 1) == 0) {
            this.f11280a = null;
        } else {
            this.f11280a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str5;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = jh30Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh30)) {
            return false;
        }
        gh30 gh30Var = (gh30) obj;
        return Intrinsics.d(this.f11280a, gh30Var.f11280a) && Intrinsics.d(this.b, gh30Var.b) && Intrinsics.d(this.c, gh30Var.c) && Intrinsics.d(this.d, gh30Var.d) && Intrinsics.d(this.e, gh30Var.e) && Intrinsics.d(this.f, gh30Var.f) && Intrinsics.d(this.g, gh30Var.g) && Intrinsics.d(this.h, gh30Var.h);
    }

    public final int hashCode() {
        Long l = this.f11280a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        jh30 jh30Var = this.h;
        return iHashCode7 + (jh30Var != null ? jh30Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f11280a, "MatchesPlayersResponse(id=", ", nick=", this.b, ", name=");
        axq.x(this.d, this.c, ", age=", ", country=", sbS);
        f140.v(sbS, this.e, ", countryImageS3=", this.f, ", image=");
        sbS.append(this.g);
        sbS.append(", statistics=");
        sbS.append(this.h);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
