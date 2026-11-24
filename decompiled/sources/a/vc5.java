package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class vc5 {
    public static final uc5 Companion = new uc5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37171a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public /* synthetic */ vc5(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        if ((i & 1) == 0) {
            this.f37171a = null;
        } else {
            this.f37171a = str;
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
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str9;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str10;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = str11;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc5)) {
            return false;
        }
        vc5 vc5Var = (vc5) obj;
        return Intrinsics.d(this.f37171a, vc5Var.f37171a) && Intrinsics.d(this.b, vc5Var.b) && Intrinsics.d(this.c, vc5Var.c) && Intrinsics.d(this.d, vc5Var.d) && Intrinsics.d(this.e, vc5Var.e) && Intrinsics.d(this.f, vc5Var.f) && Intrinsics.d(this.g, vc5Var.g) && Intrinsics.d(this.h, vc5Var.h) && Intrinsics.d(this.i, vc5Var.i) && Intrinsics.d(this.j, vc5Var.j) && Intrinsics.d(this.k, vc5Var.k);
    }

    public final int hashCode() {
        String str = this.f37171a;
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
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.j;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.k;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BackgroundResourcesResponse(smallVideo=", this.f37171a, ", smallPreview=", this.b, ", smallImage=");
        f140.v(sbN, this.c, ", mediumVideo=", this.d, ", mediumPreview=");
        f140.v(sbN, this.e, ", mediumImage=", this.f, ", largeVideo=");
        f140.v(sbN, this.g, ", largePreview=", this.h, ", largeImage=");
        f140.v(sbN, this.i, ", logo=", this.j, ", partners=");
        return axq.n(sbN, this.k, Separators.RPAREN);
    }
}
