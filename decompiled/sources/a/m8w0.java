package a;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m8w0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TaskCompletionSource f21390a;

    public m8w0() {
        this.f21390a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f21390a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f21390a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e) {
            a(e);
        }
    }

    public m8w0(TaskCompletionSource taskCompletionSource) {
        this.f21390a = taskCompletionSource;
    }
}
