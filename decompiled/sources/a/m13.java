package a;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class m13 implements ltb0, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f20984a;
    public boolean c;
    public boolean f;
    public long g;
    public final PriorityQueue b = new PriorityQueue(11, new l13((byte) 0));
    public final Choreographer d = Choreographer.getInstance();
    public final kfn0 e = new kfn0();

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    public m13(View view) {
        float refreshRate;
        this.f20984a = view;
        if (h == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            h = (long) (1.0E9f / refreshRate);
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.f = true;
        }
    }

    @Override // a.ltb0
    public final void a(ktb0 ktb0Var) {
        this.b.add(new qwb0(1, ktb0Var));
        if (this.c) {
            return;
        }
        this.c = true;
        this.f20984a.post(this);
    }

    public final boolean b() {
        kfn0 kfn0Var = this.e;
        long jA = kfn0Var.a();
        ahy.k0(jA, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (jA > 0) {
            PriorityQueue priorityQueue = this.b;
            Object objPeek = priorityQueue.peek();
            objPeek.getClass();
            if (!((qwb0) objPeek).b.c(kfn0Var)) {
                priorityQueue.poll();
                z = false;
            }
            kfn0Var.f18204a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f) {
            this.g = j;
            this.f20984a.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f = false;
        this.f20984a.removeCallbacks(this);
        this.d.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        PriorityQueue priorityQueue = this.b;
        if (!priorityQueue.isEmpty() && this.c && this.f) {
            View view = this.f20984a;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                boolean z = System.nanoTime() > (2 * h) + nanos;
                kfn0 kfn0Var = this.e;
                kfn0Var.f18204a = z;
                kfn0Var.b = Math.max(this.g, nanos) + h;
                boolean zB = false;
                while (!priorityQueue.isEmpty() && !zB) {
                    if (kfn0Var.f18204a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            zB = b();
                            Trace.endSection();
                        } catch (Throwable th) {
                            Trace.endSection();
                            throw th;
                        }
                    } else {
                        zB = b();
                    }
                }
                if (zB) {
                    this.d.postFrameCallback(this);
                } else {
                    this.c = false;
                }
                ahy.k0(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.c = false;
    }
}
