package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lzb0 {
    public static final kzb0 Companion = new kzb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20897a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ lzb0(int i, Integer num, Integer num2, String str, String str2) {
        if ((i & 1) == 0) {
            this.f20897a = null;
        } else {
            this.f20897a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzb0)) {
            return false;
        }
        lzb0 lzb0Var = (lzb0) obj;
        return Intrinsics.d(this.f20897a, lzb0Var.f20897a) && Intrinsics.d(this.b, lzb0Var.b) && Intrinsics.d(this.c, lzb0Var.c) && Intrinsics.d(this.d, lzb0Var.d);
    }

    public final int hashCode() {
        String str = this.f20897a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(b1j.n("ProductItemResponse(img=", this.f20897a, ", name=", this.b, ", position="), this.c, ", productId=", this.d, Separators.RPAREN);
    }
}
