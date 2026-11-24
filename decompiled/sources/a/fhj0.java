package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class fhj0 implements rhj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9544a;
    public final boolean b;

    public fhj0(String str, boolean z) {
        i8m0 i8m0Var = i8m0.CHECK;
        this.f9544a = str;
        this.b = z;
    }

    @Override // a.rhj0
    public final int b() {
        return R.drawable.ic_glyph_authorization_history;
    }

    @Override // a.rhj0
    public final String d0() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhj0)) {
            return false;
        }
        fhj0 fhj0Var = (fhj0) obj;
        if (!this.f9544a.equals(fhj0Var.f9544a)) {
            return false;
        }
        i8m0 i8m0Var = i8m0.CHECK;
        return this.b == fhj0Var.b;
    }

    @Override // a.rhj0
    public final String getTitle() {
        return this.f9544a;
    }

    public final int hashCode() {
        return brm0.e(brm0.e(w6x.g(i8m0.CHECK, twn.a(R.drawable.ic_glyph_authorization_history, this.f9544a.hashCode() * 961, 31), 31), 31, this.b), 31, true);
    }

    @Override // a.rhj0
    public final boolean k() {
        return true;
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    @Override // a.rhj0
    public final boolean q0() {
        return this.b;
    }

    public final String toString() {
        String strA = nhj0.a("");
        String strA2 = mhj0.a(i8m0.CHECK);
        String strA3 = khj0.a(this.b);
        String strA4 = lhj0.a("");
        StringBuilder sbN = b1j.n("AuthHistoryUiModel(title=", this.f9544a, ", subTitle=", strA, ", image=");
        kng0.w(R.drawable.ic_glyph_authorization_history, ", stateStatus=", strA2, ", enable=", sbN);
        return ua80.m(sbN, strA3, ", clickable=true, endText=", strA4, Separators.RPAREN);
    }

    @Override // a.rhj0
    public final String u0() {
        return "";
    }

    @Override // a.rhj0
    public final i8m0 v0() {
        return i8m0.CHECK;
    }
}
