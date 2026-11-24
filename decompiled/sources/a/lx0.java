package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lx0 {
    public static final kx0 Companion = new kx0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20789a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public /* synthetic */ lx0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if ((i & 1) == 0) {
            this.f20789a = null;
        } else {
            this.f20789a = str;
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
            this.f = str6;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str7;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str8;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx0)) {
            return false;
        }
        lx0 lx0Var = (lx0) obj;
        return Intrinsics.d(this.f20789a, lx0Var.f20789a) && Intrinsics.d(this.b, lx0Var.b) && Intrinsics.d(this.c, lx0Var.c) && Intrinsics.d(this.d, lx0Var.d) && Intrinsics.d(this.e, lx0Var.e) && Intrinsics.d(this.f, lx0Var.f) && Intrinsics.d(this.g, lx0Var.g) && Intrinsics.d(this.h, lx0Var.h);
    }

    public final int hashCode() {
        String str = this.f20789a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.h;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AggregatorGamesImagesResponse(imgOverlayPath=", this.f20789a, ", imgOverlayWebpPath=", this.b, ", logoUrl=");
        f140.v(sbN, this.c, ", imgBackgroundImgPath=", this.d, ", imgBackgroundImgWebpPath=");
        f140.v(sbN, this.e, ", imgWebpPath=", this.f, ", imgVerticalPath=");
        return ua80.m(sbN, this.g, ", imgVerticalWebpPath=", this.h, Separators.RPAREN);
    }
}
