package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class lzd0 {
    public static final kzd0 Companion = new kzd0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f20900a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;

    public /* synthetic */ lzd0(int i, Integer num, Integer num2, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f20900a = null;
        } else {
            this.f20900a = num;
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
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzd0)) {
            return false;
        }
        lzd0 lzd0Var = (lzd0) obj;
        return Intrinsics.d(this.f20900a, lzd0Var.f20900a) && Intrinsics.d(this.b, lzd0Var.b) && Intrinsics.d(this.c, lzd0Var.c) && Intrinsics.d(this.d, lzd0Var.d) && Intrinsics.d(this.e, lzd0Var.e);
    }

    public final int hashCode() {
        Integer num = this.f20900a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f20900a, "RainbowStatisticMatchesMapPicksResponse(id=", ", name=", this.b, ", image=");
        axq.x(this.d, this.c, ", type=", ", teamName=", sbN);
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
