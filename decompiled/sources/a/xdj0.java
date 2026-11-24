package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xdj0 implements zdj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40696a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public xdj0(boolean z, boolean z2, String str, int i) {
        str.getClass();
        this.f40696a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    @Override // a.zdj0
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdj0)) {
            return false;
        }
        xdj0 xdj0Var = (xdj0) obj;
        return Intrinsics.d(this.f40696a, xdj0Var.f40696a) && this.b == xdj0Var.b && this.c == xdj0Var.c && this.d == xdj0Var.d;
    }

    @Override // a.zdj0
    public final String getTitle() {
        return this.f40696a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(twn.a(this.b, this.f40696a.hashCode() * 31, 31), 31, this.c);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return ohs0.p(", enable=", Separators.RPAREN, kng0.p(this.b, "GameCurrencyPopUpUiModel(title=", this.f40696a, ", image=", ", switched="), this.c, this.d);
    }

    @Override // a.zdj0
    public final boolean x() {
        return this.c;
    }
}
