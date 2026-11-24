package a;

import android.gov.nist.core.Separators;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public final class bej0 implements gej0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2454a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public bej0(boolean z, boolean z2, String str, int i) {
        this.f2454a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    @Override // a.gej0
    public final boolean a0() {
        return this.d;
    }

    @Override // a.gej0
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bej0)) {
            return false;
        }
        bej0 bej0Var = (bej0) obj;
        return this.f2454a.equals(bej0Var.f2454a) && this.b == bej0Var.b && this.c == bej0Var.c && this.d == bej0Var.d;
    }

    @Override // a.gej0
    public final String getTitle() {
        return this.f2454a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(twn.a(this.b, this.f2454a.hashCode() * 31, 31), 31, this.c);
    }

    @Override // a.gej0
    public final boolean j0() {
        return this.c;
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return ua80.m(kng0.p(this.b, "GameCurrencyPopUpUiModel(title=", this.f2454a, ", image=", ", switched="), dej0.a(this.c), ", enable=", cej0.a(this.d), Separators.RPAREN);
    }
}
