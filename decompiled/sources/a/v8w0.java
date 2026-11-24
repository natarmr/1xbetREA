package a;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class v8w0 extends m8w0 {
    public final /* synthetic */ TaskCompletionSource g;
    public final /* synthetic */ m8w0 h;
    public final /* synthetic */ h5w0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8w0(h5w0 h5w0Var, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, m8w0 m8w0Var) {
        super(taskCompletionSource);
        this.i = h5w0Var;
        this.g = taskCompletionSource2;
        this.h = m8w0Var;
    }

    @Override // a.m8w0
    public final void b() {
        synchronized (this.i.f) {
            try {
                h5w0 h5w0Var = this.i;
                TaskCompletionSource taskCompletionSource = this.g;
                h5w0Var.e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new hcp0((Object) h5w0Var, (Object) taskCompletionSource, (byte) 15));
                if (this.i.l.getAndIncrement() > 0) {
                    this.i.b.b("Already connected to the service.", new Object[0]);
                }
                h5w0.b(this.i, this.h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
