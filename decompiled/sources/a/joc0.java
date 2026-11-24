package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class joc0 {
    public static final ioc0 Companion = new ioc0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16852a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final String f;

    public /* synthetic */ joc0(int i, String str, String str2, String str3, Integer num, Integer num2, String str4) {
        if ((i & 1) == 0) {
            this.f16852a = null;
        } else {
            this.f16852a = str;
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
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joc0)) {
            return false;
        }
        joc0 joc0Var = (joc0) obj;
        return Intrinsics.d(this.f16852a, joc0Var.f16852a) && Intrinsics.d(this.b, joc0Var.b) && Intrinsics.d(this.c, joc0Var.c) && Intrinsics.d(this.d, joc0Var.d) && Intrinsics.d(this.e, joc0Var.e) && Intrinsics.d(this.f, joc0Var.f);
    }

    public final int hashCode() {
        String str = this.f16852a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PromoProductResponse(imgPathDefault=", this.f16852a, ", imgPathDarkTheme=", this.b, ", imgPathLightTheme=");
        axq.x(this.d, this.c, ", error=", ", productId=", sbN);
        sbN.append(this.e);
        sbN.append(", productName=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
