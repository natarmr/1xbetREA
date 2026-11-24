package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class fej0 implements gej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9411a;
    public final boolean b;

    public fej0(String str, boolean z) {
        this.f9411a = str;
        this.b = z;
    }

    @Override // a.gej0
    public final boolean a0() {
        return true;
    }

    @Override // a.gej0
    public final int b() {
        return R.drawable.ic_glyph_qr_code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fej0)) {
            return false;
        }
        fej0 fej0Var = (fej0) obj;
        return this.f9411a.equals(fej0Var.f9411a) && this.b == fej0Var.b;
    }

    @Override // a.gej0
    public final String getTitle() {
        return this.f9411a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(twn.a(R.drawable.ic_glyph_qr_code, this.f9411a.hashCode() * 31, 31), 31, this.b);
    }

    @Override // a.gej0
    public final boolean j0() {
        return this.b;
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return ua80.m(kng0.p(R.drawable.ic_glyph_qr_code, "QrCodeUiModel(title=", this.f9411a, ", image=", ", switched="), dej0.a(this.b), ", enable=", cej0.a(true), Separators.RPAREN);
    }
}
