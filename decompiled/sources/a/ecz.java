package a;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class ecz implements uaz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xcz f7591a;

    public ecz(xcz xczVar) {
        this.f7591a = xczVar;
    }

    @Override // a.uaz
    public final boolean a() {
        return !this.f7591a.j().l.isEmpty();
    }

    @Override // a.uaz
    public final int b() {
        return this.f7591a.j().o;
    }

    @Override // a.uaz
    public final int c() {
        int i;
        xcz xczVar = this.f7591a;
        if (xczVar.j().l.isEmpty()) {
            return 0;
        }
        int iL = vdx.L(xczVar.j());
        int iY = idx.Y(xczVar.j());
        if (iY != 0 && (i = iL / iY) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // a.uaz
    public final int d() {
        return Math.max(0, this.f7591a.h());
    }

    @Override // a.uaz
    public final int e() {
        return Math.min(b() - 1, ((ncz) CollectionsKt.d0(this.f7591a.j().l)).f23317a);
    }
}
