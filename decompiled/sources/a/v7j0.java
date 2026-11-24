package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class v7j0 implements b8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36928a;
    public final boolean b;

    public v7j0(String str, boolean z) {
        str.getClass();
        this.f36928a = str;
        this.b = z;
    }

    @Override // a.b8j0
    public final int b() {
        return R.drawable.ic_glyph_qr_share;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7j0)) {
            return false;
        }
        v7j0 v7j0Var = (v7j0) obj;
        return Intrinsics.d(this.f36928a, v7j0Var.f36928a) && this.b == v7j0Var.b;
    }

    @Override // a.b8j0
    public final boolean getFirst() {
        return this.b;
    }

    @Override // a.b8j0
    public final boolean getLast() {
        return false;
    }

    @Override // a.b8j0
    public final String getTitle() {
        return this.f36928a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(brm0.e(brm0.e(twn.a(R.drawable.ic_glyph_qr_share, this.f36928a.hashCode() * 31, 961), 31, true), 31, true), 31, this.b);
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
        return rw2.p(kng0.p(R.drawable.ic_glyph_qr_share, "ShareAppByQrWidgetsUiModel(title=", this.f36928a, ", image=", ", endText=, enable=true, clickable=true, first="), this.b, ", last=false)");
    }
}
