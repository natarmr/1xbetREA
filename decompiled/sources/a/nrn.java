package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nrn implements prn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f24010a;
    public final double b;
    public final String c;
    public final double d;
    public final boolean e;
    public final String f;
    public final String g;

    public nrn(double d, double d2, String str, double d3, boolean z, String str2, String str3) {
        str.getClass();
        str3.getClass();
        this.f24010a = d;
        this.b = d2;
        this.c = str;
        this.d = d3;
        this.e = z;
        this.f = str2;
        this.g = str3;
    }

    public static nrn a(nrn nrnVar, double d, String str, boolean z) {
        double d2 = nrnVar.f24010a;
        double d3 = nrnVar.d;
        String str2 = nrnVar.f;
        String str3 = nrnVar.g;
        str.getClass();
        str3.getClass();
        return new nrn(d2, d, str, d3, z, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrn)) {
            return false;
        }
        nrn nrnVar = (nrn) obj;
        return Double.compare(this.f24010a, nrnVar.f24010a) == 0 && Double.compare(this.b, nrnVar.b) == 0 && Intrinsics.d(this.c, nrnVar.c) && Double.compare(this.d, nrnVar.d) == 0 && this.e == nrnVar.e && this.f.equals(nrnVar.f) && Intrinsics.d(this.g, nrnVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(brm0.e(brm0.d(this.d, ua80.b(brm0.d(this.b, Double.hashCode(this.f24010a) * 31, 31), 31, this.c), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbP = brm0.p(this.f24010a, "Content(initialSumValue=", ", editedSum=");
        hne.w(sbP, this.b, ", editedSumView=", this.c);
        ohs0.A(sbP, this.d, ", minBetSum=", ", isSaveButtonEnabled=");
        f140.s(", currencyIconResName=", this.f, ", currencySymbol=", sbP, this.e);
        return axq.n(sbP, this.g, Separators.RPAREN);
    }
}
