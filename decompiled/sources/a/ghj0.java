package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ghj0 implements rhj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11303a;
    public final String b;
    public final i8m0 c;

    public ghj0(String str, String str2, i8m0 i8m0Var) {
        this.f11303a = str;
        this.b = str2;
        this.c = i8m0Var;
    }

    @Override // a.rhj0
    public final int b() {
        return R.drawable.ic_glyph_authenticator;
    }

    @Override // a.rhj0
    public final String d0() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghj0)) {
            return false;
        }
        ghj0 ghj0Var = (ghj0) obj;
        return this.f11303a.equals(ghj0Var.f11303a) && this.b.equals(ghj0Var.b) && this.c == ghj0Var.c;
    }

    @Override // a.rhj0
    public final String getTitle() {
        return this.f11303a;
    }

    public final int hashCode() {
        return brm0.e(brm0.e(w6x.g(this.c, twn.a(R.drawable.ic_glyph_authenticator, ua80.b(this.f11303a.hashCode() * 31, 31, this.b), 31), 31), 31, true), 31, true);
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
        return true;
    }

    public final String toString() {
        String strA = nhj0.a(this.b);
        String strA2 = mhj0.a(this.c);
        String strA3 = khj0.a(true);
        String strA4 = lhj0.a("");
        StringBuilder sbN = b1j.n("AuthenticatorUiModel(title=", this.f11303a, ", subTitle=", strA, ", image=");
        kng0.w(R.drawable.ic_glyph_authenticator, ", stateStatus=", strA2, ", enable=", sbN);
        return ua80.m(sbN, strA3, ", clickable=true, endText=", strA4, Separators.RPAREN);
    }

    @Override // a.rhj0
    public final String u0() {
        return this.b;
    }

    @Override // a.rhj0
    public final i8m0 v0() {
        return this.c;
    }
}
