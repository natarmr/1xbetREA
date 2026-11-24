package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ydj0 implements zdj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42442a;
    public final boolean b;

    public ydj0(String str, boolean z) {
        str.getClass();
        this.f42442a = str;
        this.b = z;
    }

    @Override // a.zdj0
    public final int b() {
        return R.drawable.ic_glyph_qr_code;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydj0)) {
            return false;
        }
        ydj0 ydj0Var = (ydj0) obj;
        return Intrinsics.d(this.f42442a, ydj0Var.f42442a) && this.b == ydj0Var.b;
    }

    @Override // a.zdj0
    public final String getTitle() {
        return this.f42442a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(twn.a(R.drawable.ic_glyph_qr_code, this.f42442a.hashCode() * 31, 31), 31, this.b);
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return rw2.p(kng0.p(R.drawable.ic_glyph_qr_code, "QrCodeUiModel(title=", this.f42442a, ", image=", ", switched="), this.b, ", enable=true)");
    }

    @Override // a.zdj0
    public final boolean x() {
        return this.b;
    }
}
