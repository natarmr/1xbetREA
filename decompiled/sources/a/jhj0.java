package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class jhj0 implements rhj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16530a;
    public final String b;
    public final boolean c;

    public jhj0(String str, String str2, boolean z) {
        i8m0 i8m0Var = i8m0.CHECK;
        this.f16530a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // a.rhj0
    public final int b() {
        return R.drawable.ic_glyph_bet_one_click;
    }

    @Override // a.rhj0
    public final String d0() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhj0)) {
            return false;
        }
        jhj0 jhj0Var = (jhj0) obj;
        if (!this.f16530a.equals(jhj0Var.f16530a) || !this.b.equals(jhj0Var.b)) {
            return false;
        }
        i8m0 i8m0Var = i8m0.CHECK;
        return this.c == jhj0Var.c;
    }

    @Override // a.rhj0
    public final String getTitle() {
        return this.f16530a;
    }

    public final int hashCode() {
        return brm0.e(brm0.e(w6x.g(i8m0.CHECK, twn.a(R.drawable.ic_glyph_bet_one_click, ua80.b(this.f16530a.hashCode() * 31, 31, this.b), 31), 31), 31, this.c), 31, true);
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
        return this.c;
    }

    public final String toString() {
        String strA = nhj0.a(this.b);
        String strA2 = mhj0.a(i8m0.CHECK);
        String strA3 = khj0.a(this.c);
        String strA4 = lhj0.a("");
        StringBuilder sbN = b1j.n("OneClickBetUiModel(title=", this.f16530a, ", subTitle=", strA, ", image=");
        kng0.w(R.drawable.ic_glyph_bet_one_click, ", stateStatus=", strA2, ", enable=", sbN);
        return ua80.m(sbN, strA3, ", clickable=true, endText=", strA4, Separators.RPAREN);
    }

    @Override // a.rhj0
    public final String u0() {
        return this.b;
    }

    @Override // a.rhj0
    public final i8m0 v0() {
        return i8m0.CHECK;
    }
}
