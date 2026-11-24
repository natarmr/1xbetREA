package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ugq implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35637a;
    public final pmi b;

    public /* synthetic */ ugq(pmi pmiVar, byte b) {
        this.f35637a = b;
        this.b = pmiVar;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f35637a;
        pmi pmiVar = this.b;
        switch (b) {
            case 0:
                nfq nfqVar = (nfq) pmiVar.b;
                x1x.y(nfqVar);
                return nfqVar;
            case 1:
                dgq dgqVar = (dgq) pmiVar.c;
                x1x.y(dgqVar);
                return dgqVar;
            case 2:
                p5d0 p5d0Var = (p5d0) pmiVar.d;
                x1x.y(p5d0Var);
                return p5d0Var;
            default:
                p5d0 p5d0Var2 = (p5d0) pmiVar.e;
                x1x.y(p5d0Var2);
                return p5d0Var2;
        }
    }
}
