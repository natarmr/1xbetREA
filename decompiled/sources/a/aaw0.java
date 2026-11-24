package a;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class aaw0 extends n9w0 {
    public final s9w0 b;
    public final TaskCompletionSource c;
    public final rek0 d;

    public aaw0(int i, s9w0 s9w0Var, TaskCompletionSource taskCompletionSource, rek0 rek0Var) {
        super(i);
        this.c = taskCompletionSource;
        this.b = s9w0Var;
        this.d = rek0Var;
        if (i == 2 && s9w0Var.b) {
            jf4.o("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // a.caw0
    public final void a(Status status) {
        this.d.getClass();
        this.c.trySetException(status.c != null ? new lsf0(status) : new qa3(status));
    }

    @Override // a.caw0
    public final void b(Exception exc) {
        this.c.trySetException(exc);
    }

    @Override // a.caw0
    public final void c(fuj0 fuj0Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) fuj0Var.b;
        TaskCompletionSource taskCompletionSource = this.c;
        map.put(taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new afm0(fuj0Var, taskCompletionSource));
    }

    @Override // a.caw0
    public final void d(h9w0 h9w0Var) throws DeadObjectException {
        TaskCompletionSource taskCompletionSource = this.c;
        try {
            s9w0 s9w0Var = this.b;
            s9w0Var.d.f8431a.accept(h9w0Var.b, taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(caw0.e(e2));
        } catch (RuntimeException e3) {
            taskCompletionSource.trySetException(e3);
        }
    }

    @Override // a.n9w0
    public final Feature[] f(h9w0 h9w0Var) {
        return this.b.f31868a;
    }

    @Override // a.n9w0
    public final boolean g(h9w0 h9w0Var) {
        return this.b.b;
    }

    @Override // a.n9w0
    public final int h(h9w0 h9w0Var) {
        return this.b.c;
    }
}
