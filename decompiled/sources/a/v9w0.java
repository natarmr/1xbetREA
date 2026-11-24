package a;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class v9w0 extends caw0 {
    public final zaw0 b;

    public v9w0(zaw0 zaw0Var) {
        super(1);
        this.b = zaw0Var;
    }

    @Override // a.caw0
    public final void a(Status status) {
        try {
            this.b.g(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // a.caw0
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.b.g(new Status(10, rw2.o(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // a.caw0
    public final void c(fuj0 fuj0Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) fuj0Var.f10166a;
        zaw0 zaw0Var = this.b;
        map.put(zaw0Var, boolValueOf);
        zaw0Var.a(new law0(fuj0Var, zaw0Var));
    }

    @Override // a.caw0
    public final void d(h9w0 h9w0Var) throws DeadObjectException {
        try {
            zaw0 zaw0Var = this.b;
            try {
                try {
                    zaw0Var.f(h9w0Var.b);
                } catch (DeadObjectException e) {
                    zaw0Var.g(new Status(8, e.getLocalizedMessage(), null, null));
                    throw e;
                }
            } catch (RemoteException e2) {
                zaw0Var.g(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }
}
