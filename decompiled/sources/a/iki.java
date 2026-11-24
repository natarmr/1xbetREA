package a;

/* JADX INFO: loaded from: classes3.dex */
public final class iki implements giu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14927a;
    public final /* synthetic */ n5d0 b;

    public /* synthetic */ iki(n5d0 n5d0Var, byte b) {
        this.f14927a = b;
        this.b = n5d0Var;
    }

    @Override // a.giu0
    public final diu0 c(Object obj) {
        byte b = this.f14927a;
        n5d0 n5d0Var = this.b;
        switch (b) {
            case 0:
                return new nkc0((i1w0) obj, new tpx(((fki) ((c7i) n5d0Var).c).b, (byte) 1));
            case 1:
                return new nkc0((i1w0) obj, new tpx(((nli) ((c7i) n5d0Var).c).b, (byte) 1));
            default:
                return new nkc0((i1w0) obj, new tpx(((iyi) ((c7i) n5d0Var).c).b, (byte) 1));
        }
    }
}
