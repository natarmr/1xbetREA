package a;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xh00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40865a;
    public final /* synthetic */ cyu b;

    public /* synthetic */ xh00(cyu cyuVar, byte b) {
        this.f40865a = b;
        this.b = cyuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f40865a;
        cyu cyuVar = this.b;
        switch (b) {
            case 0:
                xoq xoqVar = (xoq) cyuVar.c;
                if (xoqVar != null) {
                    ((hy40) cyuVar.f5196a).j(xoqVar);
                }
                break;
            default:
                xoq xoqVar2 = (xoq) cyuVar.c;
                if (xoqVar2 == null) {
                    xoqVar2 = new xoq(cyuVar, (byte) 1);
                    cyuVar.c = xoqVar2;
                }
                ((hy40) cyuVar.f5196a).f(xoqVar2);
                break;
        }
    }
}
