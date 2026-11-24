package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class nda0 {
    public static final mda0 Companion = new mda0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23330a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final Boolean g;

    public /* synthetic */ nda0(int i, String str, String str2, String str3, String str4, String str5, Integer num, Boolean bool) {
        if ((i & 1) == 0) {
            this.f23330a = null;
        } else {
            this.f23330a = str;
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
            this.e = str5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = num;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nda0)) {
            return false;
        }
        nda0 nda0Var = (nda0) obj;
        return Intrinsics.d(this.f23330a, nda0Var.f23330a) && Intrinsics.d(this.b, nda0Var.b) && Intrinsics.d(this.c, nda0Var.c) && Intrinsics.d(this.d, nda0Var.d) && Intrinsics.d(this.e, nda0Var.e) && Intrinsics.d(this.f, nda0Var.f) && Intrinsics.d(this.g, nda0Var.g);
    }

    public final int hashCode() {
        String str = this.f23330a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.g;
        return iHashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PlayerTransfersPlayerResponse(nickname=", this.f23330a, ", realName=", this.b, ", country=");
        f140.v(sbN, this.c, ", playerImageS3=", this.d, ", flagImageS3=");
        axq.x(this.f, this.e, ", totalWinnings=", ", lngSideLeft=", sbN);
        return defpackage.c.e(sbN, this.g, Separators.RPAREN);
    }
}
