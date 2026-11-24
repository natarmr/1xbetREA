package a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k3k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17623a;
    public final /* synthetic */ m3k b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ prc d;

    public /* synthetic */ k3k(m3k m3kVar, Runnable runnable, prc prcVar, byte b) {
        this.f17623a = b;
        this.b = m3kVar;
        this.c = runnable;
        this.d = prcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f17623a;
        final prc prcVar = this.d;
        final Runnable runnable = this.c;
        m3k m3kVar = this.b;
        switch (b) {
            case 0:
                final byte b2 = 0;
                m3kVar.f21119a.execute(new Runnable() { // from class: a.i3k
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        byte b3 = b2;
                        prc prcVar2 = prcVar;
                        Runnable runnable2 = runnable;
                        switch (b3) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((o3k) prcVar2.b).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((o3k) prcVar2.b).m(e2);
                                    return;
                                }
                            default:
                                o3k o3kVar = (o3k) prcVar2.b;
                                try {
                                    runnable2.run();
                                    o3kVar.l(null);
                                    return;
                                } catch (Exception e3) {
                                    o3kVar.m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                final byte b3 = 2;
                m3kVar.f21119a.execute(new Runnable() { // from class: a.i3k
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        byte b4 = b3;
                        prc prcVar2 = prcVar;
                        Runnable runnable2 = runnable;
                        switch (b4) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((o3k) prcVar2.b).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((o3k) prcVar2.b).m(e2);
                                    return;
                                }
                            default:
                                o3k o3kVar = (o3k) prcVar2.b;
                                try {
                                    runnable2.run();
                                    o3kVar.l(null);
                                    return;
                                } catch (Exception e3) {
                                    o3kVar.m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                final byte b4 = 1;
                m3kVar.f21119a.execute(new Runnable() { // from class: a.i3k
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        byte b5 = b4;
                        prc prcVar2 = prcVar;
                        Runnable runnable2 = runnable;
                        switch (b5) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e) {
                                    ((o3k) prcVar2.b).m(e);
                                    throw e;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((o3k) prcVar2.b).m(e2);
                                    return;
                                }
                            default:
                                o3k o3kVar = (o3k) prcVar2.b;
                                try {
                                    runnable2.run();
                                    o3kVar.l(null);
                                    return;
                                } catch (Exception e3) {
                                    o3kVar.m(e3);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
