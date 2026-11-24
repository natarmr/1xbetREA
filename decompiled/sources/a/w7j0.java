package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class w7j0 implements b8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38676a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public w7j0(String str, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.f38676a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // a.b8j0
    public final int b() {
        return R.drawable.ic_glyph_share;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7j0)) {
            return false;
        }
        w7j0 w7j0Var = (w7j0) obj;
        return Intrinsics.d(this.f38676a, w7j0Var.f38676a) && this.b == w7j0Var.b && this.c == w7j0Var.c && this.d == w7j0Var.d;
    }

    @Override // a.b8j0
    public final boolean getFirst() {
        return this.d;
    }

    @Override // a.b8j0
    public final boolean getLast() {
        return false;
    }

    @Override // a.b8j0
    public final String getTitle() {
        return this.f38676a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(brm0.e(brm0.e(twn.a(R.drawable.ic_glyph_share, this.f38676a.hashCode() * 31, 961), 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // a.b8j0
    public final boolean i() {
        return this.b;
    }

    @Override // a.b8j0
    public final boolean k() {
        return this.c;
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
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_share, "ShareAppUiModel(title=", this.f38676a, ", image=", ", endText=, enable=");
        ua80.u(", clickable=", ", first=", sbP, this.b, this.c);
        return rw2.p(sbP, this.d, ", last=false)");
    }
}
