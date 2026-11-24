package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class sxb0 {
    public static final rxb0 Companion = new rxb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f32969a;
    public final Integer b;
    public final String c;
    public final String d;
    public final Integer e;
    public final Double f;
    public final Integer g;

    public /* synthetic */ sxb0(int i, Integer num, Integer num2, String str, String str2, Integer num3, Double d, Integer num4) {
        if ((i & 1) == 0) {
            this.f32969a = null;
        } else {
            this.f32969a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = num4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxb0)) {
            return false;
        }
        sxb0 sxb0Var = (sxb0) obj;
        return Intrinsics.d(this.f32969a, sxb0Var.f32969a) && Intrinsics.d(this.b, sxb0Var.b) && Intrinsics.d(this.c, sxb0Var.c) && Intrinsics.d(this.d, sxb0Var.d) && Intrinsics.d(this.e, sxb0Var.e) && Intrinsics.d(this.f, sxb0Var.f) && Intrinsics.d(this.g, sxb0Var.g);
    }

    public final int hashCode() {
        Integer num = this.f32969a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.e;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d = this.f;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num4 = this.g;
        return iHashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("PrizeItemResponse(placeFrom=", this.f32969a, ", placeTo=", this.b, ", prize=");
        f140.v(sbQ, this.c, ", prizesCount=", this.d, ", type=");
        hne.z(sbQ, this.e, ", amount=", this.f, ", freeSpinCountSpins=");
        return dw9.q(sbQ, this.g, Separators.RPAREN);
    }
}
