package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class gft {
    public static final fft Companion = new fft();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11221a;
    public final Double b;

    public /* synthetic */ gft(int i, Double d, String str) {
        if ((i & 1) == 0) {
            this.f11221a = null;
        } else {
            this.f11221a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gft)) {
            return false;
        }
        gft gftVar = (gft) obj;
        return Intrinsics.d(this.f11221a, gftVar.f11221a) && Intrinsics.d(this.b, gftVar.b);
    }

    public final int hashCode() {
        String str = this.f11221a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d = this.b;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        return "GemsOdysseyCoeffStartInfoResponse(type=" + this.f11221a + ", coeff=" + this.b + Separators.RPAREN;
    }
}
