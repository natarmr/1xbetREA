package a;

import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class b9j0 implements z9j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2213a;
    public final String b;
    public final boolean c;

    public b9j0(String str, String str2, boolean z) {
        this.f2213a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // a.z9j0
    public final boolean M() {
        return this.c;
    }

    @Override // a.z9j0
    public final int b() {
        return R.drawable.ic_glyph_clear;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9j0)) {
            return false;
        }
        b9j0 b9j0Var = (b9j0) obj;
        return this.f2213a.equals(b9j0Var.f2213a) && this.b.equals(b9j0Var.b) && this.c == b9j0Var.c;
    }

    @Override // a.z9j0
    public final String getTitle() {
        return this.f2213a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(ua80.b(twn.a(R.drawable.ic_glyph_clear, this.f2213a.hashCode() * 31, 31), 31, this.b), 31, this.c);
    }

    @Override // a.z9j0
    public final boolean k() {
        return true;
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    @Override // a.z9j0
    public final String s0() {
        return this.b;
    }

    public final String toString() {
        return ua80.m(kng0.p(R.drawable.ic_glyph_clear, "CleanCacheUiModel(title=", this.f2213a, ", image=", ", endText="), k9j0.a(this.b), ", enable=", j9j0.a(this.c), ", clickable=true)");
    }
}
