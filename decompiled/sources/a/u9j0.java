package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class u9j0 implements z9j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35287a;
    public final boolean b;

    public u9j0(String str, boolean z) {
        this.f35287a = str;
        this.b = z;
    }

    @Override // a.z9j0
    public final boolean M() {
        return true;
    }

    @Override // a.z9j0
    public final int b() {
        return R.drawable.ic_glyph_share;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9j0)) {
            return false;
        }
        u9j0 u9j0Var = (u9j0) obj;
        return this.f35287a.equals(u9j0Var.f35287a) && this.b == u9j0Var.b;
    }

    @Override // a.z9j0
    public final String getTitle() {
        return this.f35287a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + brm0.e(twn.a(R.drawable.ic_glyph_share, this.f35287a.hashCode() * 31, 961), 31, true);
    }

    @Override // a.z9j0
    public final boolean k() {
        return this.b;
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    @Override // a.z9j0
    public final String s0() {
        return "";
    }

    public final String toString() {
        String strA = k9j0.a("");
        String strA2 = j9j0.a(true);
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_share, "ShareAppUiModel(title=", this.f35287a, ", image=", ", endText=");
        f140.v(sbP, strA, ", enable=", strA2, ", clickable=");
        return rw2.p(sbP, this.b, Separators.RPAREN);
    }
}
