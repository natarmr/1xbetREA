package a;

/* JADX INFO: loaded from: classes2.dex */
public final class jby extends eby {
    public final o2i0 e;
    public final /* synthetic */ pby f;

    public jby(pby pbyVar, o2i0 o2i0Var) {
        this.f = pbyVar;
        this.e = o2i0Var;
    }

    @Override // a.eby
    public final boolean l() {
        return false;
    }

    @Override // a.eby
    public final void m(Throwable th) {
        pby pbyVar = this.f;
        Object objH = pbyVar.H();
        if (!(objH instanceof udd)) {
            objH = qby.a(objH);
        }
        this.e.i(pbyVar, objH);
    }
}
