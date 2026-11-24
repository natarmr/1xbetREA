package a;

import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class n9j0 implements z9j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23143a;
    public final boolean b;

    public n9j0(String str, boolean z) {
        this.f23143a = str;
        this.b = z;
    }

    @Override // a.z9j0
    public final boolean M() {
        return this.b;
    }

    @Override // a.z9j0
    public final int b() {
        return R.drawable.ic_glyph_placing_bet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9j0)) {
            return false;
        }
        n9j0 n9j0Var = (n9j0) obj;
        return this.f23143a.equals(n9j0Var.f23143a) && this.b == n9j0Var.b;
    }

    @Override // a.z9j0
    public final String getTitle() {
        return this.f23143a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(twn.a(R.drawable.ic_glyph_placing_bet, this.f23143a.hashCode() * 31, 961), 31, this.b);
    }

    @Override // a.z9j0
    public final boolean k() {
        return true;
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
        return ua80.m(kng0.p(R.drawable.ic_glyph_placing_bet, "PlacingBetUiModel(title=", this.f23143a, ", image=", ", endText="), k9j0.a(""), ", enable=", j9j0.a(this.b), ", clickable=true)");
    }
}
