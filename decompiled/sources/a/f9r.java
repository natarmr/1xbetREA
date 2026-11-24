package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class f9r {
    public static final e9r Companion = new e9r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f9168a;
    public final Double b;
    public final Double c;
    public final Double d;
    public final Double e;
    public final Double f;

    public /* synthetic */ f9r(int i, Double d, Double d2, Double d3, Double d4, Double d5, Double d6) {
        if ((i & 1) == 0) {
            this.f9168a = null;
        } else {
            this.f9168a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d5;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d6;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9r)) {
            return false;
        }
        f9r f9rVar = (f9r) obj;
        return Intrinsics.d(this.f9168a, f9rVar.f9168a) && Intrinsics.d(this.b, f9rVar.b) && Intrinsics.d(this.c, f9rVar.c) && Intrinsics.d(this.d, f9rVar.d) && Intrinsics.d(this.e, f9rVar.e) && Intrinsics.d(this.f, f9rVar.f);
    }

    public final int hashCode() {
        Double d = this.f9168a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.d;
        int iHashCode4 = (iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.e;
        int iHashCode5 = (iHashCode4 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Double d6 = this.f;
        return iHashCode5 + (d6 != null ? d6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FruitBlastCoefInfoResponse(one=");
        sb.append(this.f9168a);
        sb.append(", two=");
        sb.append(this.b);
        sb.append(", three=");
        vqd.w(sb, this.c, ", four=", this.d, ", five=");
        sb.append(this.e);
        sb.append(", six=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
