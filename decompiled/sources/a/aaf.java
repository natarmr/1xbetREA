package a;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class aaf implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f520a;
    public final Object b = new Object();
    public Task c = Tasks.forResult(null);

    public aaf(ExecutorService executorService) {
        this.f520a = executorService;
    }

    public final Task a(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.b) {
            taskContinueWithTask = this.c.continueWithTask(this.f520a, new z9f(runnable, (byte) 1));
            this.c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public final Task b(Callable callable) {
        Task taskContinueWithTask;
        synchronized (this.b) {
            taskContinueWithTask = this.c.continueWithTask(this.f520a, new z9f(callable, (byte) 0));
            this.c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f520a.execute(runnable);
    }
}
