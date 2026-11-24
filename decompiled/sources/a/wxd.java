package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wxd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39926a;
    public final String b;
    public final boolean c;
    public final jkm d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public wxd(jkm jkmVar, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f39926a = z;
        this.b = str;
        this.c = z2;
        this.d = jkmVar;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
    }

    public static wxd a(wxd wxdVar, boolean z, String str, boolean z2, boolean z3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = wxdVar.f39926a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            str = wxdVar.b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z2 = wxdVar.c;
        }
        boolean z6 = z2;
        jkm jkmVar = wxdVar.d;
        boolean z7 = (i & 16) != 0 ? wxdVar.e : false;
        if ((i & 32) != 0) {
            z3 = wxdVar.f;
        }
        boolean z8 = z3;
        if ((i & 64) != 0) {
            z4 = wxdVar.g;
        }
        boolean z9 = wxdVar.h;
        wxdVar.getClass();
        return new wxd(jkmVar, str2, z5, z6, z7, z8, z4, z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxd)) {
            return false;
        }
        wxd wxdVar = (wxd) obj;
        return this.f39926a == wxdVar.f39926a && this.b.equals(wxdVar.b) && this.c == wxdVar.c && this.d.equals(wxdVar.d) && this.e == wxdVar.e && this.f == wxdVar.f && this.g == wxdVar.g && this.h == wxdVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + brm0.e(brm0.e(brm0.e((this.d.hashCode() + brm0.e(ua80.b(Boolean.hashCode(this.f39926a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("UiState(loading=", ", inputCode=", this.b, this.f39926a, ", showSocketErrorLottie=");
        sbQ.append(this.c);
        sbQ.append(", socketErrorLottie=");
        sbQ.append(this.d);
        sbQ.append(", skipSocketRefreshError=");
        ua80.u(", showResendButton=", ", enableConfirmButton=", sbQ, this.e, this.f);
        return ohs0.p(", switchToSMSButtonVisible=", Separators.RPAREN, sbQ, this.g, this.h);
    }
}
