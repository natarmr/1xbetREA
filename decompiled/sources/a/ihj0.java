package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ihj0 implements rhj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14783a;
    public final boolean b;
    public final String c;

    public ihj0(String str, boolean z, String str2) {
        i8m0 i8m0Var = i8m0.CHECK;
        this.f14783a = str;
        this.b = z;
        this.c = str2;
    }

    @Override // a.rhj0
    public final int b() {
        return R.drawable.ic_glyph_newsletter;
    }

    @Override // a.rhj0
    public final String d0() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihj0)) {
            return false;
        }
        ihj0 ihj0Var = (ihj0) obj;
        if (!this.f14783a.equals(ihj0Var.f14783a) || this.b != ihj0Var.b) {
            return false;
        }
        i8m0 i8m0Var = i8m0.CHECK;
        return this.c.equals(ihj0Var.c);
    }

    @Override // a.rhj0
    public final String getTitle() {
        return this.f14783a;
    }

    public final int hashCode() {
        return brm0.e(ua80.b(w6x.g(i8m0.WARNING_RED, twn.a(R.drawable.ic_glyph_newsletter, brm0.e(this.f14783a.hashCode() * 31, 31, this.b), 31), 31), 31, this.c), 31, true);
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
        String strA = khj0.a(this.b);
        String strA2 = mhj0.a(i8m0.WARNING_RED);
        String strA3 = nhj0.a(this.c);
        String strA4 = lhj0.a("");
        StringBuilder sbN = b1j.n("MailingManagementWithStatusUiModel(title=", this.f14783a, ", enable=", strA, ", image=");
        kng0.w(R.drawable.ic_glyph_newsletter, ", stateStatus=", strA2, ", subTitle=", sbN);
        return ua80.m(sbN, strA3, ", clickable=true, endText=", strA4, Separators.RPAREN);
    }

    @Override // a.rhj0
    public final String u0() {
        return this.c;
    }

    @Override // a.rhj0
    public final i8m0 v0() {
        return i8m0.WARNING_RED;
    }
}
