package a;

/* JADX INFO: loaded from: classes2.dex */
public final class s9g0 extends eby {
    public final gby e;

    public s9g0(gby gbyVar) {
        this.e = gbyVar;
    }

    @Override // a.eby
    public final boolean l() {
        return false;
    }

    @Override // a.eby
    public final void m(Throwable th) {
        Object objH = k().H();
        boolean z = objH instanceof udd;
        gby gbyVar = this.e;
        if (z) {
            e0g0 e0g0Var = j0g0.b;
            gbyVar.resumeWith(z1x.C(((udd) objH).f35472a));
        } else {
            e0g0 e0g0Var2 = j0g0.b;
            gbyVar.resumeWith(qby.a(objH));
        }
    }
}
