package a;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class gd3 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11087a;
    public final ArrayDeque b;
    public Runnable c;
    public final Object d;
    public final Executor e;

    public gd3(Executor executor) {
        this.f11087a = (byte) 1;
        executor.getClass();
        this.e = executor;
        this.b = new ArrayDeque();
        this.d = new Object();
    }

    public final void a() {
        switch (this.f11087a) {
            case 0:
                synchronized (this.d) {
                    try {
                        Runnable runnable = (Runnable) this.b.poll();
                        this.c = runnable;
                        if (runnable != null) {
                            ((haw0) this.e).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.d) {
                    Object objPoll = this.b.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.c = runnable2;
                    if (objPoll != null) {
                        this.e.execute(runnable2);
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11087a) {
            case 0:
                synchronized (this.d) {
                    try {
                        this.b.add(new fy2(this, runnable, (byte) 4));
                        if (this.c == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                runnable.getClass();
                synchronized (this.d) {
                    this.b.offer(new qaq0(runnable, this, (byte) 5));
                    if (this.c == null) {
                        a();
                    }
                    break;
                }
                return;
        }
    }

    public gd3(haw0 haw0Var) {
        this.f11087a = (byte) 0;
        this.d = new Object();
        this.b = new ArrayDeque();
        this.e = haw0Var;
    }
}
