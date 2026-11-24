package okhttp3.internal.concurrent;

import a.jf4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "AwaitIdleTask", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TaskQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskRunner f46132a;
    public final String b;
    public boolean c;
    public Task d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AwaitIdleTask extends Task {
        @Override // okhttp3.internal.concurrent.Task
        public final long b() {
            throw null;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String str) {
        this.f46132a = taskRunner;
        this.b = str;
    }

    public static void c(TaskQueue taskQueue, final String str, long j, final Function0 function0, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        final boolean z = (i & 4) != 0;
        taskQueue.getClass();
        str.getClass();
        function0.getClass();
        taskQueue.d(new Task(str, z) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public final long b() {
                function0.invoke();
                return -1L;
            }
        }, j);
    }

    public final void a() {
        TaskRunner taskRunner = this.f46132a;
        TimeZone timeZone = _UtilJvmKt.f46122a;
        synchronized (taskRunner) {
            if (b()) {
                this.f46132a.kickCoordinator$okhttp(this);
            }
        }
    }

    public final boolean b() {
        Task task = this.d;
        if (task != null && task.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((Task) arrayList.get(size)).b) {
                Logger logger$okhttp = this.f46132a.getLogger();
                Task task2 = (Task) arrayList.get(size);
                if (logger$okhttp.isLoggable(Level.FINE)) {
                    TaskLoggerKt.b(logger$okhttp, task2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void d(Task task, long j) {
        task.getClass();
        synchronized (this.f46132a) {
            if (!this.c) {
                if (f(task, j, false)) {
                    this.f46132a.kickCoordinator$okhttp(this);
                }
                return;
            }
            boolean z = task.b;
            TaskRunner taskRunner = this.f46132a;
            if (z) {
                Logger logger$okhttp = taskRunner.getLogger();
                if (logger$okhttp.isLoggable(Level.FINE)) {
                    TaskLoggerKt.b(logger$okhttp, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger$okhttp2 = taskRunner.getLogger();
                if (logger$okhttp2.isLoggable(Level.FINE)) {
                    TaskLoggerKt.b(logger$okhttp2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x0080 A[LOOP:0: B:23:0x006c->B:28:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0084 A[EDGE_INSN: B:40:0x0084->B:30:0x0084 BREAK  A[LOOP:0: B:23:0x006c->B:28:0x0080], SYNTHETIC] */
    public final boolean f(Task task, long j, boolean z) {
        Logger logger$okhttp;
        Iterator it;
        int size;
        String strConcat;
        task.getClass();
        TaskQueue taskQueue = task.c;
        if (taskQueue != this) {
            if (taskQueue != null) {
                jf4.n("task is in multiple queues");
                return false;
            }
            task.c = this;
        }
        TaskRunner taskRunner = this.f46132a;
        long jE = taskRunner.getBackend().e();
        long j2 = jE + j;
        ArrayList arrayList = this.e;
        int iIndexOf = arrayList.indexOf(task);
        if (iIndexOf == -1) {
            task.d = j2;
            logger$okhttp = taskRunner.getLogger();
            if (logger$okhttp.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(TaskLoggerKt.a(j2 - jE));
                } else {
                    strConcat = "scheduled after ".concat(TaskLoggerKt.a(j2 - jE));
                }
                TaskLoggerKt.b(logger$okhttp, task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((Task) it.next()).d - jE > j) {
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        } else if (task.d <= j2) {
            Logger logger$okhttp2 = taskRunner.getLogger();
            if (logger$okhttp2.isLoggable(Level.FINE)) {
                TaskLoggerKt.b(logger$okhttp2, task, this, "already scheduled");
                return false;
            }
        } else {
            arrayList.remove(iIndexOf);
            task.d = j2;
            logger$okhttp = taskRunner.getLogger();
            if (logger$okhttp.isLoggable(Level.FINE)) {
                if (z) {
                    strConcat = "run again after ".concat(TaskLoggerKt.a(j2 - jE));
                } else {
                    strConcat = "scheduled after ".concat(TaskLoggerKt.a(j2 - jE));
                }
                TaskLoggerKt.b(logger$okhttp, task, this, strConcat);
            }
            it = arrayList.iterator();
            size = 0;
            while (true) {
                if (it.hasNext()) {
                    size = -1;
                    break;
                }
                if (((Task) it.next()).d - jE > j) {
                    break;
                    break;
                }
                size++;
            }
            if (size == -1) {
                size = arrayList.size();
            }
            arrayList.add(size, task);
            if (size == 0) {
                return true;
            }
        }
        return false;
    }

    public final void g() {
        TaskRunner taskRunner = this.f46132a;
        TimeZone timeZone = _UtilJvmKt.f46122a;
        synchronized (taskRunner) {
            this.c = true;
            if (b()) {
                this.f46132a.kickCoordinator$okhttp(this);
            }
        }
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public final String getB() {
        return this.b;
    }
}
