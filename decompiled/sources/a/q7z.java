package a;

import android.gov.nist.core.Separators;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class q7z implements a5n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fy40 f28274a;
    public final /* synthetic */ r7z b;
    public final /* synthetic */ Object c;

    public q7z(r7z r7zVar, Object obj) {
        this.b = r7zVar;
        this.c = obj;
        int[] iArr = pkx.f27156a;
        this.f28274a = new fy40();
    }

    @Override // a.a5n0
    public final void a() {
        this.b.h(this.c);
    }

    @Override // a.a5n0
    public final long b(int i) {
        e7z e7zVar = (e7z) this.b.j.g(this.c);
        if (e7zVar == null || !e7zVar.I()) {
            return 0L;
        }
        int i2 = ((xz40) ((ty40) e7zVar.o()).b).c;
        if (i < 0 || i >= i2) {
            xcx.d("Index (" + i + ") is out of bound of [0, " + i2 + Separators.RPAREN);
        }
        if (!this.f28274a.c(i)) {
            return 0L;
        }
        int i3 = ((e7z) ((ty40) e7zVar.o()).get(i)).i1.p.f27604a;
        return (((long) ((e7z) ((ty40) e7zVar.o()).get(i)).i1.p.b) & 4294967295L) | (((long) i3) << 32);
    }

    @Override // a.a5n0
    public final int c() {
        e7z e7zVar = (e7z) this.b.j.g(this.c);
        if (e7zVar != null) {
            return ((xz40) ((ty40) e7zVar.o()).b).c;
        }
        return 0;
    }

    @Override // a.a5n0
    public final void d(int i, long j) {
        r7z r7zVar = this.b;
        e7z e7zVar = (e7z) r7zVar.j.g(this.c);
        if (e7zVar == null || !e7zVar.I()) {
            return;
        }
        int i2 = ((xz40) ((ty40) e7zVar.o()).b).c;
        if (i < 0 || i >= i2) {
            xcx.d("Index (" + i + ") is out of bound of [0, " + i2 + Separators.RPAREN);
        }
        if (e7zVar.J()) {
            xcx.a("Pre-measure called on node that is not placed");
        }
        e7z e7zVar2 = r7zVar.f30000a;
        e7zVar2.r = true;
        ((AndroidComposeView) h7z.a(e7zVar)).t((e7z) ((ty40) e7zVar.o()).get(i), j);
        e7zVar2.r = false;
        this.f28274a.a(i);
    }

    @Override // a.a5n0
    public final void e(cx2 cx2Var) {
        tzi tziVar;
        e7z e7zVar = (e7z) this.b.j.g(this.c);
        lm40 lm40Var = (e7zVar == null || (tziVar = e7zVar.h1) == null) ? null : (lm40) tziVar.g;
        if (lm40Var == null || !lm40Var.n) {
            return;
        }
        etm0.v(lm40Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", cx2Var);
    }
}
