package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class h7j0 implements b8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12577a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public h7j0(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f12577a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    @Override // a.b8j0
    public final int b() {
        return R.drawable.ic_glyph_clear;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7j0)) {
            return false;
        }
        h7j0 h7j0Var = (h7j0) obj;
        return Intrinsics.d(this.f12577a, h7j0Var.f12577a) && Intrinsics.d(this.b, h7j0Var.b) && this.c == h7j0Var.c && this.d == h7j0Var.d;
    }

    @Override // a.b8j0
    public final boolean getFirst() {
        return false;
    }

    @Override // a.b8j0
    public final boolean getLast() {
        return this.d;
    }

    @Override // a.b8j0
    public final String getTitle() {
        return this.f12577a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(brm0.e(ua80.b(twn.a(R.drawable.ic_glyph_clear, this.f12577a.hashCode() * 31, 31), 31, this.b), 31, this.c), 31, true), 31, false);
    }

    @Override // a.b8j0
    public final boolean i() {
        return this.c;
    }

    @Override // a.b8j0
    public final boolean k() {
        return true;
    }

    @Override // a.b8j0
    public final String l() {
        return this.b;
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_clear, "CleanCacheUiModel(title=", this.f12577a, ", image=", ", endText=");
        brm0.C(this.b, ", enable=", ", clickable=true, first=false, last=", sbP, this.c);
        return rw2.p(sbP, this.d, Separators.RPAREN);
    }
}
