package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fvd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10208a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final jkm f;
    public final boolean g;
    public final String h;

    public fvd(jkm jkmVar, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f10208a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = jkmVar;
        this.g = z6;
        this.h = str;
    }

    public static fvd a(fvd fvdVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, int i) {
        if ((i & 1) != 0) {
            z = fvdVar.f10208a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z2 = fvdVar.b;
        }
        boolean z7 = z2;
        if ((i & 4) != 0) {
            z3 = fvdVar.c;
        }
        boolean z8 = z3;
        if ((i & 8) != 0) {
            z4 = fvdVar.d;
        }
        boolean z9 = z4;
        boolean z10 = (i & 16) != 0 ? fvdVar.e : z5;
        jkm jkmVar = fvdVar.f;
        boolean z11 = (i & 64) != 0 ? fvdVar.g : false;
        String str2 = (i & 128) != 0 ? fvdVar.h : str;
        fvdVar.getClass();
        return new fvd(jkmVar, str2, z6, z7, z8, z9, z10, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvd)) {
            return false;
        }
        fvd fvdVar = (fvd) obj;
        return this.f10208a == fvdVar.f10208a && this.b == fvdVar.b && this.c == fvdVar.c && this.d == fvdVar.d && this.e == fvdVar.e && this.f.equals(fvdVar.f) && this.g == fvdVar.g && this.h.equals(fvdVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.e((this.f.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(Boolean.hashCode(this.f10208a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("UiState(loading=", ", resendPushButtonVisible=", ", confirmEnabled=", this.f10208a, this.b);
        ua80.u(", switchToSMSEnabled=", ", showSocketErrorLottie=", sbQ, this.c, this.d);
        sbQ.append(this.e);
        sbQ.append(", socketErrorLottie=");
        sbQ.append(this.f);
        sbQ.append(", skipSocketRefreshError=");
        return twn.q(", code=", this.h, Separators.RPAREN, sbQ, this.g);
    }
}
