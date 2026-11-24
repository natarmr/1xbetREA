package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class yhj0 implements fij0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42640a;
    public final String b;

    public yhj0(String str, String str2) {
        this.f42640a = str;
        this.b = str2;
    }

    @Override // a.fij0
    public final boolean G() {
        return true;
    }

    @Override // a.fij0
    public final int b() {
        return R.drawable.ic_glyph_coefficient;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yhj0)) {
            return false;
        }
        yhj0 yhj0Var = (yhj0) obj;
        return this.f42640a.equals(yhj0Var.f42640a) && this.b.equals(yhj0Var.b);
    }

    @Override // a.fij0
    public final String getTitle() {
        return this.f42640a;
    }

    public final int hashCode() {
        return brm0.e(brm0.e(twn.a(R.drawable.ic_glyph_coefficient, ua80.b(this.f42640a.hashCode() * 31, 31, this.b), 31), 31, true), 31, true);
    }

    @Override // a.fij0
    public final boolean k() {
        return true;
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
        String strA2 = aij0.a(true);
        String strA3 = bij0.a("");
        StringBuilder sbN = b1j.n("CoefTypeUiModel(title=", this.f42640a, ", subTitle=", strA, ", image=");
        kng0.w(R.drawable.ic_glyph_coefficient, ", enable=", strA2, ", clickable=true, endText=", sbN);
        return axq.n(sbN, strA3, Separators.RPAREN);
    }
}
