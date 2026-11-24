package a;

/* JADX INFO: loaded from: classes2.dex */
public final class gby extends n5a {
    public final pby i;

    public gby(yje yjeVar, pby pbyVar) {
        super(1, yjeVar);
        this.i = pbyVar;
    }

    @Override // a.n5a
    public final String A() {
        return "AwaitContinuation";
    }

    @Override // a.n5a
    public final Throwable o(pby pbyVar) {
        Throwable thB;
        Object objH = this.i.H();
        if (!(objH instanceof iby) || (thB = ((iby) objH).b()) == null) {
            return objH instanceof udd ? ((udd) objH).f35472a : pbyVar.getCancellationException();
        }
        return thB;
    }
}
