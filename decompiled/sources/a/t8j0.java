package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class t8j0 implements z8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33513a;

    public t8j0(String str) {
        str.getClass();
        this.f33513a = str;
    }

    @Override // a.z8j0
    public final int b() {
        return R.drawable.ic_glyph_qr_share;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8j0) && Intrinsics.d(this.f33513a, ((t8j0) obj).f33513a);
    }

    @Override // a.z8j0
    public final String getTitle() {
        return this.f33513a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(twn.a(R.drawable.ic_glyph_qr_share, this.f33513a.hashCode() * 31, 961), 31, true);
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
        return dw9.n(R.drawable.ic_glyph_qr_share, "ShareAppByQrWidgetsUiModel(title=", this.f33513a, ", image=", ", endText=, enable=true, clickable=true)");
    }
}
