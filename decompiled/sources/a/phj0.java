package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class phj0 implements rhj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27000a;
    public final String b;
    public final i8m0 c;

    public phj0(String str, String str2, i8m0 i8m0Var) {
        this.f27000a = str;
        this.b = str2;
        this.c = i8m0Var;
    }

    @Override // a.rhj0
    public final int b() {
        return R.drawable.ic_glyph_proxy;
    }

    @Override // a.rhj0
    public final String d0() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phj0)) {
            return false;
        }
        phj0 phj0Var = (phj0) obj;
        return this.f27000a.equals(phj0Var.f27000a) && this.b.equals(phj0Var.b) && this.c == phj0Var.c;
    }

    @Override // a.rhj0
    public final String getTitle() {
        return this.f27000a;
    }

    public final int hashCode() {
        return brm0.e(brm0.e(w6x.g(this.c, twn.a(R.drawable.ic_glyph_proxy, ua80.b(this.f27000a.hashCode() * 31, 31, this.b), 31), 31), 31, true), 31, true);
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
        StringBuilder sbN = b1j.n("ProxySettingsUiModel(title=", this.f27000a, ", subTitle=", strA, ", image=");
        kng0.w(R.drawable.ic_glyph_proxy, ", stateStatus=", strA2, ", enable=", sbN);
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
