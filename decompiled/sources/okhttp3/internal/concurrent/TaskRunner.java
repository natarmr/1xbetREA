package okhttp3.internal.concurrent;

import a.axq;
import a.jf4;
import a.m4w0;
import a.twn;
import com.huawei.hms.android.HwBuildEx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0003+,-B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0002J \u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0010H\u0002J\b\u0010%\u001a\u0004\u0018\u00010!J\b\u0010&\u001a\u00020\u001cH\u0002J\u0006\u0010'\u001a\u00020\u0017J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170)J\u0006\u0010*\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\b\f\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/concurrent/Lockable;", "backend", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "logger", "Ljava/util/logging/Logger;", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner$Backend;Ljava/util/logging/Logger;)V", "getBackend", "()Lokhttp3/internal/concurrent/TaskRunner$Backend;", "getLogger$okhttp", "()Ljava/util/logging/Logger;", "logger$1", "nextQueueName", "", "coordinatorWaiting", "", "coordinatorWakeUpAt", "", "executeCallCount", "runCallCount", "busyQueues", "", "Lokhttp3/internal/concurrent/TaskQueue;", "readyQueues", "runnable", "Ljava/lang/Runnable;", "kickCoordinator", "", "taskQueue", "kickCoordinator$okhttp", "beforeRun", "task", "Lokhttp3/internal/concurrent/Task;", "afterRun", "delayNanos", "completedNormally", "awaitTaskToRun", "startAnotherThread", "newQueue", "activeQueues", "", "cancelAll", "Backend", "RealBackend", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TaskRunner implements Lockable {
    public static final TaskRunner INSTANCE;
    private static final Logger logger;
    private final Backend backend;
    private final List<TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int executeCallCount;

    /* JADX INFO: renamed from: logger$1, reason: from kotlin metadata */
    private final Logger logger;
    private int nextQueueName;
    private final List<TaskQueue> readyQueues;
    private int runCallCount;
    private final Runnable runnable;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Backend {
        void a(TaskRunner taskRunner);

        BlockingQueue b(LinkedBlockingDeque linkedBlockingDeque);

        void c(TaskRunner taskRunner, long j);

        void d(TaskRunner taskRunner, Runnable runnable);

        long e();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RealBackend implements Backend {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f46133a;

        public RealBackend(m4w0 m4w0Var) {
            this.f46133a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), m4w0Var);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final void a(TaskRunner taskRunner) {
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final BlockingQueue b(LinkedBlockingDeque linkedBlockingDeque) {
            return linkedBlockingDeque;
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final void c(TaskRunner taskRunner, long j) throws InterruptedException {
            TimeZone timeZone = _UtilJvmKt.f46122a;
            if (j > 0) {
                long j2 = j / 1000000;
                long j3 = j - (1000000 * j2);
                if (j2 > 0 || j > 0) {
                    taskRunner.wait(j2, (int) j3);
                }
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final void d(TaskRunner taskRunner, Runnable runnable) {
            runnable.getClass();
            this.f46133a.execute(runnable);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public final long e() {
            return System.nanoTime();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Logger logger2 = Logger.getLogger(TaskRunner.class.getName());
        logger2.getClass();
        logger = logger2;
        INSTANCE = new TaskRunner(new RealBackend(new m4w0(axq.n(new StringBuilder(), _UtilJvmKt.b, " TaskRunner"), true)), null, 2, 0 == true ? 1 : 0);
    }

    public TaskRunner(Backend backend, Logger logger2) {
        backend.getClass();
        logger2.getClass();
        this.backend = backend;
        this.logger = logger2;
        this.nextQueueName = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                Task taskAwaitTaskToRun;
                long jE;
                Task taskAwaitTaskToRun2;
                TaskRunner taskRunner = this.f46134a;
                synchronized (taskRunner) {
                    taskRunner.runCallCount++;
                    taskAwaitTaskToRun = taskRunner.awaitTaskToRun();
                }
                if (taskAwaitTaskToRun == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                while (true) {
                    try {
                        threadCurrentThread.setName(taskAwaitTaskToRun.f46131a);
                        Logger logger3 = this.f46134a.getLogger();
                        TaskQueue taskQueue = taskAwaitTaskToRun.c;
                        taskQueue.getClass();
                        boolean zIsLoggable = logger3.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jE = taskQueue.f46132a.getBackend().e();
                            TaskLoggerKt.b(logger3, taskAwaitTaskToRun, taskQueue, "starting");
                        } else {
                            jE = -1;
                        }
                        try {
                            long jB = taskAwaitTaskToRun.b();
                            if (zIsLoggable) {
                                TaskLoggerKt.b(logger3, taskAwaitTaskToRun, taskQueue, "finished run in " + TaskLoggerKt.a(taskQueue.f46132a.getBackend().e() - jE));
                            }
                            TaskRunner taskRunner2 = this.f46134a;
                            synchronized (taskRunner2) {
                                taskRunner2.afterRun(taskAwaitTaskToRun, jB, true);
                                taskAwaitTaskToRun2 = taskRunner2.awaitTaskToRun();
                            }
                            if (taskAwaitTaskToRun2 == null) {
                                threadCurrentThread.setName(name);
                                return;
                            }
                            taskAwaitTaskToRun = taskAwaitTaskToRun2;
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                TaskLoggerKt.b(logger3, taskAwaitTaskToRun, taskQueue, "failed a run in " + TaskLoggerKt.a(taskQueue.f46132a.getBackend().e() - jE));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            TaskRunner taskRunner3 = this.f46134a;
                            synchronized (taskRunner3) {
                                taskRunner3.afterRun(taskAwaitTaskToRun, -1L, false);
                                if (!(th2 instanceof InterruptedException)) {
                                    throw th2;
                                }
                                Thread.currentThread().interrupt();
                                threadCurrentThread.setName(name);
                                return;
                            }
                        } catch (Throwable th3) {
                            threadCurrentThread.setName(name);
                            throw th3;
                        }
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void afterRun(Task task, long delayNanos, boolean completedNormally) {
        TimeZone timeZone = _UtilJvmKt.f46122a;
        TaskQueue taskQueue = task.c;
        taskQueue.getClass();
        if (taskQueue.d != task) {
            jf4.n("Check failed.");
            return;
        }
        boolean z = taskQueue.f;
        taskQueue.f = false;
        taskQueue.d = null;
        this.busyQueues.remove(taskQueue);
        if (delayNanos != -1 && !z && !taskQueue.c) {
            taskQueue.f(task, delayNanos, true);
        }
        if (taskQueue.e.isEmpty()) {
            return;
        }
        this.readyQueues.add(taskQueue);
        if (completedNormally) {
            return;
        }
        startAnotherThread();
    }

    private final void beforeRun(Task task) {
        TimeZone timeZone = _UtilJvmKt.f46122a;
        task.d = -1L;
        TaskQueue taskQueue = task.c;
        taskQueue.getClass();
        taskQueue.e.remove(task);
        this.readyQueues.remove(taskQueue);
        taskQueue.d = task;
        this.busyQueues.add(taskQueue);
    }

    private final void startAnotherThread() {
        TimeZone timeZone = _UtilJvmKt.f46122a;
        int i = this.executeCallCount;
        if (i > this.runCallCount) {
            return;
        }
        this.executeCallCount = i + 1;
        this.backend.d(this, this.runnable);
    }

    public final List<TaskQueue> activeQueues() {
        ArrayList arrayListQ0;
        synchronized (this) {
            arrayListQ0 = CollectionsKt.q0(this.busyQueues, this.readyQueues);
        }
        return arrayListQ0;
    }

    public final Task awaitTaskToRun() {
        boolean z;
        TimeZone timeZone = _UtilJvmKt.f46122a;
        while (!this.readyQueues.isEmpty()) {
            long jE = this.backend.e();
            Iterator<TaskQueue> it = this.readyQueues.iterator();
            long jMin = Long.MAX_VALUE;
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Task task2 = (Task) it.next().e.get(0);
                long jMax = Math.max(0L, task2.d - jE);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task != null) {
                        z = true;
                        break;
                    }
                    task = task2;
                }
            }
            if (task != null) {
                beforeRun(task);
                if (z || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
                    startAnotherThread();
                }
                return task;
            }
            if (this.coordinatorWaiting) {
                if (jMin >= this.coordinatorWakeUpAt - jE) {
                    break;
                }
                this.backend.a(this);
                break;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = jE + jMin;
            try {
                try {
                    this.backend.c(this, jMin);
                } catch (InterruptedException unused) {
                    cancelAll();
                }
                this.coordinatorWaiting = false;
            } catch (Throwable th) {
                this.coordinatorWaiting = false;
                throw th;
            }
        }
        return null;
    }

    public final void cancelAll() {
        TimeZone timeZone = _UtilJvmKt.f46122a;
        int size = this.busyQueues.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.busyQueues.get(size).b();
            }
        }
        for (int size2 = this.readyQueues.size() - 1; -1 < size2; size2--) {
            TaskQueue taskQueue = this.readyQueues.get(size2);
            taskQueue.b();
            if (taskQueue.e.isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    public final Backend getBackend() {
        return this.backend;
    }

    /* JADX INFO: renamed from: getLogger$okhttp, reason: from getter */
    public final Logger getLogger() {
        return this.logger;
    }

    public final void kickCoordinator$okhttp(TaskQueue taskQueue) {
        taskQueue.getClass();
        TimeZone timeZone = _UtilJvmKt.f46122a;
        if (taskQueue.d == null) {
            boolean zIsEmpty = taskQueue.e.isEmpty();
            List<TaskQueue> list = this.readyQueues;
            if (zIsEmpty) {
                list.remove(taskQueue);
            } else {
                byte[] bArr = _UtilCommonKt.f46121a;
                list.getClass();
                if (!list.contains(taskQueue)) {
                    list.add(taskQueue);
                }
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.a(this);
        } else {
            startAnotherThread();
        }
    }

    public final TaskQueue newQueue() {
        int i;
        synchronized (this) {
            i = this.nextQueueName;
            this.nextQueueName = i + 1;
        }
        return new TaskQueue(this, twn.m(i, "Q"));
    }

    public /* synthetic */ TaskRunner(Backend backend, Logger logger2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(backend, (i & 2) != 0 ? logger : logger2);
    }
}
