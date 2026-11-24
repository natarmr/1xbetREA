package a;

/* JADX INFO: loaded from: classes2.dex */
public final class c5w0 extends m8w0 {
    public final /* synthetic */ byte g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c5w0(Object obj, byte b) {
        this.g = b;
        this.h = obj;
    }

    @Override // a.m8w0
    public final void b() {
        switch (this.g) {
            case 0:
                h5w0 h5w0Var = ((g5w0) this.h).f10737a;
                h5w0Var.b.b("unlinkToDeath", new Object[0]);
                h5w0Var.n.asBinder().unlinkToDeath(h5w0Var.k, 0);
                h5w0Var.n = null;
                h5w0Var.g = false;
                return;
            default:
                synchronized (((h5w0) this.h).f) {
                    try {
                        if (((h5w0) this.h).l.get() > 0 && ((h5w0) this.h).l.decrementAndGet() > 0) {
                            ((h5w0) this.h).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        h5w0 h5w0Var2 = (h5w0) this.h;
                        if (h5w0Var2.n != null) {
                            h5w0Var2.b.b("Unbind from service.", new Object[0]);
                            h5w0 h5w0Var3 = (h5w0) this.h;
                            h5w0Var3.f12502a.unbindService(h5w0Var3.m);
                            h5w0Var2 = (h5w0) this.h;
                            h5w0Var2.g = false;
                            h5w0Var2.n = null;
                            h5w0Var2.m = null;
                        }
                        h5w0Var2.e();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
