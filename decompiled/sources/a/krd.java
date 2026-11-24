package a;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class krd {
    public static final HashMap d = new HashMap();
    public static final ew3 e = new ew3((byte) 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f18759a;
    public final nsd b;
    public Task c = null;

    public krd(Executor executor, nsd nsdVar) {
        this.f18759a = executor;
        this.b = nsdVar;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        jrd jrdVar = new jrd((byte) 0);
        Executor executor = e;
        task.addOnSuccessListener(executor, jrdVar);
        task.addOnFailureListener(executor, jrdVar);
        task.addOnCanceledListener(executor, jrdVar);
        if (!jrdVar.b.await(5L, TimeUnit.SECONDS)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public final synchronized Task b() {
        try {
            Task task = this.c;
            if (task == null || (task.isComplete() && !this.c.isSuccessful())) {
                this.c = Tasks.call(this.f18759a, new hrd(this.b, (byte) 0));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public final mrd c() {
        synchronized (this) {
            try {
                Task task = this.c;
                if (task != null && task.isSuccessful()) {
                    return (mrd) this.c.getResult();
                }
                try {
                    return (mrd) a(b());
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
