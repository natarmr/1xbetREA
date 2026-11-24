package a;

import java.util.Collection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class o9j0 implements z9j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24883a;

    public o9j0(String str) {
        this.f24883a = str;
    }

    @Override // a.z9j0
    public final boolean M() {
        return true;
    }

    @Override // a.z9j0
    public final int b() {
        return R.drawable.ic_glyph_popular;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o9j0) && this.f24883a.equals(((o9j0) obj).f24883a);
    }

    @Override // a.z9j0
    public final String getTitle() {
        return this.f24883a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(twn.a(R.drawable.ic_glyph_popular, this.f24883a.hashCode() * 31, 961), 31, true);
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
        return "";
    }

    public final String toString() {
        return ua80.m(kng0.p(R.drawable.ic_glyph_popular, "PopularUiModel(title=", this.f24883a, ", image=", ", endText="), k9j0.a(""), ", enable=", j9j0.a(true), ", clickable=true)");
    }
}
