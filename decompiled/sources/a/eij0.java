package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class eij0 implements fij0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7863a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public eij0(String str, String str2, boolean z, boolean z2) {
        this.f7863a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    @Override // a.fij0
    public final boolean G() {
        return this.c;
    }

    @Override // a.fij0
    public final int b() {
        return R.drawable.ic_glyph_replenish_account;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eij0)) {
            return false;
        }
        eij0 eij0Var = (eij0) obj;
        return this.f7863a.equals(eij0Var.f7863a) && this.b.equals(eij0Var.b) && this.c == eij0Var.c && this.d == eij0Var.d;
    }

    @Override // a.fij0
    public final String getTitle() {
        return this.f7863a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(twn.a(R.drawable.ic_glyph_replenish_account, ua80.b(this.f7863a.hashCode() * 31, 31, this.b), 961), 31, this.c);
    }

    @Override // a.fij0
    public final boolean k() {
        return this.d;
    }

    @Override // a.fij0
    public final String l0() {
        return this.b;
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    @Override // a.fij0
    public final String r0() {
        return "";
    }

    public final String toString() {
        String strA = cij0.a(this.b);
        String strA2 = bij0.a("");
        String strA3 = aij0.a(this.c);
        StringBuilder sbN = b1j.n("RefillUiModel(title=", this.f7863a, ", subTitle=", strA, ", image=");
        kng0.w(R.drawable.ic_glyph_replenish_account, ", endText=", strA2, ", enable=", sbN);
        return defpackage.c.c(strA3, ", clickable=", Separators.RPAREN, sbN, this.d);
    }
}
