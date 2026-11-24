package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class r8j0 implements z8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30030a;

    public r8j0(String str) {
        str.getClass();
        this.f30030a = str;
    }

    @Override // a.z8j0
    public final int b() {
        return R.drawable.ic_glyph_qr_scanning;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8j0) && Intrinsics.d(this.f30030a, ((r8j0) obj).f30030a);
    }

    @Override // a.z8j0
    public final String getTitle() {
        return this.f30030a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(twn.a(R.drawable.ic_glyph_qr_scanning, this.f30030a.hashCode() * 31, 961), 31, true);
    }

    @Override // a.z8j0
    public final boolean i() {
        return true;
    }

    @Override // a.z8j0
    public final String l() {
        return "";
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return dw9.n(R.drawable.ic_glyph_qr_scanning, "QRScannerUiModel(title=", this.f30030a, ", image=", ", endText=, enable=true, clickable=true)");
    }
}
