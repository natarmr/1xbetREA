package a;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class y9w0 extends n9w0 {
    public final TaskCompletionSource b;
    public final /* synthetic */ byte c;
    public final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y9w0(qg00 qg00Var, TaskCompletionSource taskCompletionSource) {
        this(4, taskCompletionSource);
        this.c = (byte) 1;
        this.d = qg00Var;
    }

    @Override // a.caw0
    public final void a(Status status) {
        this.b.trySetException(new qa3(status));
    }

    @Override // a.caw0
    public final void b(Exception exc) {
        this.b.trySetException(exc);
    }

    @Override // a.caw0
    public final /* bridge */ /* synthetic */ void c(fuj0 fuj0Var, boolean z) {
        byte b = this.c;
    }

    @Override // a.caw0
    public final void d(h9w0 h9w0Var) throws DeadObjectException {
        try {
            k(h9w0Var);
        } catch (DeadObjectException e) {
            a(caw0.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(caw0.e(e2));
        } catch (RuntimeException e3) {
            this.b.trySetException(e3);
        }
    }

    @Override // a.n9w0
    public final Feature[] f(h9w0 h9w0Var) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return (Feature[]) ((q9w0) obj).f28369a.c;
            default:
                q9w0 q9w0Var = (q9w0) h9w0Var.f.get((qg00) obj);
                if (q9w0Var == null) {
                    return null;
                }
                return (Feature[]) q9w0Var.f28369a.c;
        }
    }

    @Override // a.n9w0
    public final boolean g(h9w0 h9w0Var) {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                return ((q9w0) obj).f28369a.f24513a;
            default:
                q9w0 q9w0Var = (q9w0) h9w0Var.f.get((qg00) obj);
                return q9w0Var != null && q9w0Var.f28369a.f24513a;
        }
    }

    @Override // a.n9w0
    public final int h(h9w0 h9w0Var) {
        switch (this.c) {
            case 0:
                return 0;
            default:
                return ((q9w0) h9w0Var.f.get((qg00) this.d)) != null ? 0 : -1;
        }
    }

    public final void k(h9w0 h9w0Var) {
        switch (this.c) {
            case 0:
                q9w0 q9w0Var = (q9w0) this.d;
                o24 o24Var = q9w0Var.f28369a;
                ((glt0) ((td9) o24Var.d).b).accept(h9w0Var.b, this.b);
                qg00 qg00Var = (qg00) ((fbv) o24Var.b).b;
                if (qg00Var != null) {
                    h9w0Var.f.put(qg00Var, q9w0Var);
                }
                break;
            default:
                q9w0 q9w0Var2 = (q9w0) h9w0Var.f.remove((qg00) this.d);
                if (q9w0Var2 == null) {
                    this.b.trySetResult(Boolean.FALSE);
                } else {
                    b9v b9vVar = h9w0Var.b;
                    ((qow0) ((td9) q9w0Var2.b.b).c).getClass();
                    int i = tzw0.l;
                    ((fbv) q9w0Var2.f28369a.b).b = null;
                }
                break;
        }
    }

    public y9w0(int i, TaskCompletionSource taskCompletionSource) {
        super(i);
        this.b = taskCompletionSource;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y9w0(q9w0 q9w0Var, TaskCompletionSource taskCompletionSource) {
        this(3, taskCompletionSource);
        this.c = (byte) 0;
        this.d = q9w0Var;
    }

    private final /* bridge */ /* synthetic */ void i(fuj0 fuj0Var, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void j(fuj0 fuj0Var, boolean z) {
    }
}
