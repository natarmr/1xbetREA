package a;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class q7j0 implements b8j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28252a;
    public final boolean b;
    public final boolean c;

    public q7j0(String str, boolean z, boolean z2) {
        str.getClass();
        this.f28252a = str;
        this.b = z;
        this.c = z2;
    }

    @Override // a.b8j0
    public final int b() {
        return R.drawable.ic_glyph_placing_bet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7j0)) {
            return false;
        }
        q7j0 q7j0Var = (q7j0) obj;
        return Intrinsics.d(this.f28252a, q7j0Var.f28252a) && this.b == q7j0Var.b && this.c == q7j0Var.c;
    }

    @Override // a.b8j0
    public final boolean getFirst() {
        return this.c;
    }

    @Override // a.b8j0
    public final boolean getLast() {
        return false;
    }

    @Override // a.b8j0
    public final String getTitle() {
        return this.f28252a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(brm0.e(brm0.e(twn.a(R.drawable.ic_glyph_placing_bet, this.f28252a.hashCode() * 31, 961), 31, this.b), 31, true), 31, this.c);
    }

    @Override // a.b8j0
    public final boolean i() {
        return this.b;
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
        return ohs0.p(", clickable=true, first=", ", last=false)", kng0.p(R.drawable.ic_glyph_placing_bet, "PlacingBetUiModel(title=", this.f28252a, ", image=", ", endText=, enable="), this.b, this.c);
    }
}
