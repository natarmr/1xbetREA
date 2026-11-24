package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class t7j0 implements b8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33470a;
    public final boolean b;
    public final boolean c;

    public t7j0(String str, boolean z, boolean z2) {
        str.getClass();
        this.f33470a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // a.b8j0
    public final int b() {
        return R.drawable.ic_glyph_qr_scanning;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7j0)) {
            return false;
        }
        t7j0 t7j0Var = (t7j0) obj;
        return Intrinsics.d(this.f33470a, t7j0Var.f33470a) && this.b == t7j0Var.b && this.c == t7j0Var.c;
    }

    @Override // a.b8j0
    public final boolean getFirst() {
        return this.b;
    }

    @Override // a.b8j0
    public final boolean getLast() {
        return this.c;
    }

    @Override // a.b8j0
    public final String getTitle() {
        return this.f33470a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(brm0.e(brm0.e(twn.a(R.drawable.ic_glyph_qr_scanning, this.f33470a.hashCode() * 31, 961), 31, true), 31, true), 31, this.b);
    }

    @Override // a.b8j0
    public final boolean i() {
        return true;
    }

    @Override // a.b8j0
    public final boolean k() {
        return true;
    }

    @Override // a.b8j0
    public final String l() {
        return "";
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return ohs0.p(", last=", Separators.RPAREN, kng0.p(R.drawable.ic_glyph_qr_scanning, "QRScannerUiModel(title=", this.f33470a, ", image=", ", endText=, enable=true, clickable=true, first="), this.b, this.c);
    }
}
