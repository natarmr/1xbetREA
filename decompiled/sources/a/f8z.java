package a;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class f8z implements uaz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9z f9131a;

    public f8z(d9z d9zVar) {
        this.f9131a = d9zVar;
    }

    @Override // a.uaz
    public final boolean a() {
        return !this.f9131a.j().n.isEmpty();
    }

    @Override // a.uaz
    public final int b() {
        return this.f9131a.j().q;
    }

    @Override // a.uaz
    public final int c() {
        int i;
        d9z d9zVar = this.f9131a;
        if (d9zVar.j().n.isEmpty()) {
            return 0;
        }
        q8z q8zVarJ = d9zVar.j();
        int iH = (int) (q8zVarJ.r == ma80.f21447a ? q8zVarJ.h() & 4294967295L : q8zVarJ.h() >> 32);
        int iD0 = l8x.D0(d9zVar.j());
        if (iD0 != 0 && (i = iH / iD0) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // a.uaz
    public final int d() {
        return this.f9131a.h();
    }

    @Override // a.uaz
    public final int e() {
        return ((r8z) CollectionsKt.d0(this.f9131a.j().n)).f30051a;
    }
}
