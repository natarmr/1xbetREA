package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class udj0 implements vdj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35482a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public udj0(String str, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.f35482a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // a.vdj0
    public final int b() {
        return R.drawable.ic_glyph_qr_code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udj0)) {
            return false;
        }
        udj0 udj0Var = (udj0) obj;
        return Intrinsics.d(this.f35482a, udj0Var.f35482a) && this.b == udj0Var.b && this.c == udj0Var.c && this.d == udj0Var.d;
    }

    @Override // a.vdj0
    public final boolean getFirst() {
        return this.c;
    }

    @Override // a.vdj0
    public final boolean getLast() {
        return this.d;
    }

    @Override // a.vdj0
    public final String getTitle() {
        return this.f35482a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(brm0.e(twn.a(R.drawable.ic_glyph_qr_code, this.f35482a.hashCode() * 31, 31), 31, this.b), 31, true), 31, this.c);
    }

    @Override // a.vdj0
    public final boolean i() {
        return true;
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_qr_code, "QrCodeUiModel(title=", this.f35482a, ", image=", ", switched=");
        ua80.u(", enable=true, first=", ", last=", sbP, this.b, this.c);
        return rw2.p(sbP, this.d, Separators.RPAREN);
    }

    @Override // a.vdj0
    public final boolean x() {
        return this.b;
    }
}
