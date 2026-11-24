package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class qhj0 implements rhj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28743a;
    public final String b;
    public final i8m0 c;
    public final boolean d;

    public qhj0(String str, String str2, i8m0 i8m0Var, boolean z) {
        this.f28743a = str;
        this.b = str2;
        this.c = i8m0Var;
        this.d = z;
    }

    @Override // a.rhj0
    public final int b() {
        return R.drawable.ic_glyph_lock;
    }

    @Override // a.rhj0
    public final String d0() {
        return "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhj0)) {
            return false;
        }
        qhj0 qhj0Var = (qhj0) obj;
        return this.f28743a.equals(qhj0Var.f28743a) && this.b.equals(qhj0Var.b) && this.c == qhj0Var.c && this.d == qhj0Var.d;
    }

    @Override // a.rhj0
    public final String getTitle() {
        return this.f28743a;
    }

    public final int hashCode() {
        return brm0.e(brm0.e(w6x.g(this.c, twn.a(R.drawable.ic_glyph_lock, ua80.b(this.f28743a.hashCode() * 31, 31, this.b), 31), 31), 31, this.d), 31, true);
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
        return this.d;
    }

    public final String toString() {
        String strA = nhj0.a(this.b);
        String strA2 = mhj0.a(this.c);
        String strA3 = khj0.a(this.d);
        String strA4 = lhj0.a("");
        StringBuilder sbN = b1j.n("SettingsSecurityUiModel(title=", this.f28743a, ", subTitle=", strA, ", image=");
        kng0.w(R.drawable.ic_glyph_lock, ", stateStatus=", strA2, ", enable=", sbN);
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
