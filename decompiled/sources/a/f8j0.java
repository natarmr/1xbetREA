package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class f8j0 implements z8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9108a;
    public final String b;
    public final boolean c;

    public f8j0(String str, String str2, boolean z) {
        str.getClass();
        this.f9108a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // a.z8j0
    public final int b() {
        return R.drawable.ic_glyph_clear;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8j0)) {
            return false;
        }
        f8j0 f8j0Var = (f8j0) obj;
        return Intrinsics.d(this.f9108a, f8j0Var.f9108a) && this.b.equals(f8j0Var.b) && this.c == f8j0Var.c;
    }

    @Override // a.z8j0
    public final String getTitle() {
        return this.f9108a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(ua80.b(twn.a(R.drawable.ic_glyph_clear, this.f9108a.hashCode() * 31, 31), 31, this.b), 31, this.c);
    }

    @Override // a.z8j0
    public final boolean i() {
        return this.c;
    }

    @Override // a.z8j0
    public final String l() {
        return this.b;
    }

    @Override // a.p6t0
    public final /* bridge */ /* synthetic */ Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return o(p6t0Var, p6t0Var2);
    }

    public final String toString() {
        return defpackage.c.c(this.b, ", enable=", ", clickable=true)", kng0.p(R.drawable.ic_glyph_clear, "CleanCacheUiModel(title=", this.f9108a, ", image=", ", endText="), this.c);
    }
}
