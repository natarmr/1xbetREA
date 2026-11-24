package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class n8j0 implements z8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23092a;

    public n8j0(String str) {
        str.getClass();
        this.f23092a = str;
    }

    @Override // a.z8j0
    public final int b() {
        return R.drawable.ic_glyph_block;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8j0) && Intrinsics.d(this.f23092a, ((n8j0) obj).f23092a);
    }

    @Override // a.z8j0
    public final String getTitle() {
        return this.f23092a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(twn.a(R.drawable.ic_glyph_block, this.f23092a.hashCode() * 31, 961), 31, true);
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
        return dw9.n(R.drawable.ic_glyph_block, "PinCodeUiModel(title=", this.f23092a, ", image=", ", endText=, enable=true, clickable=true)");
    }
}
