package a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class a5w0 extends m8w0 {
    public final /* synthetic */ IBinder g;
    public final /* synthetic */ g5w0 h;

    public a5w0(g5w0 g5w0Var, IBinder iBinder) {
        this.h = g5w0Var;
        this.g = iBinder;
    }

    @Override // a.m8w0
    public final void b() {
        h5w0 h5w0Var = this.h.f10737a;
        h5w0Var.n = (IInterface) h5w0Var.i.a(this.g);
        h8w0 h8w0Var = h5w0Var.b;
        h8w0Var.b("linkToDeath", new Object[0]);
        try {
            h5w0Var.n.asBinder().linkToDeath(h5w0Var.k, 0);
        } catch (RemoteException e) {
            h8w0Var.a(e, "linkToDeath failed", new Object[0]);
        }
        h5w0Var.g = false;
        Iterator it = h5w0Var.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        h5w0Var.d.clear();
    }
}
