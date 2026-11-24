package a;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public final class yz3 {
    public static final xz3 h = new xz3((byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fvt0 f43498a;
    public final yzn0 b;
    public final xz3 c;
    public final CopyOnWriteArrayList d;
    public List e;
    public List f;
    public int g;

    public yz3(yge0 yge0Var, dtb dtbVar) {
        ExecutorService executorServiceNewFixedThreadPool;
        fvt0 fvt0Var = new fvt0(yge0Var);
        synchronized (p8a.f26544a) {
            try {
                executorServiceNewFixedThreadPool = p8a.b;
                if (executorServiceNewFixedThreadPool == null) {
                    executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(2);
                    p8a.b = executorServiceNewFixedThreadPool;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this(fvt0Var, new yzn0(executorServiceNewFixedThreadPool, dtbVar));
    }

    public final void a(List list, Runnable runnable) {
        for (fc00 fc00Var : this.d) {
            fc00Var.f9286a.E(list, this.f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i = this.g + 1;
        this.g = i;
        List list2 = this.e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f;
        fvt0 fvt0Var = this.f43498a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.EMPTY_LIST;
            fvt0Var.d(0, size);
            a(list3, runnable);
            return;
        }
        if (list2 != null) {
            ((Executor) this.b.f43523a).execute(new wz3(this, list2, list, i, runnable));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        fvt0Var.c(0, list.size());
        a(list3, runnable);
    }

    public yz3(fvt0 fvt0Var, yzn0 yzn0Var) {
        this.d = new CopyOnWriteArrayList();
        this.f = Collections.EMPTY_LIST;
        this.f43498a = fvt0Var;
        this.b = yzn0Var;
        this.c = h;
    }
}
