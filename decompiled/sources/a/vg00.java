package a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class vg00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread f37360a;
    public final q9o0 b;
    public final tg00 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public vg00(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, l9o0 l9o0Var, tg00 tg00Var, boolean z) {
        this.f37360a = thread;
        this.d = copyOnWriteArraySet;
        this.c = tg00Var;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        if (looper == null || l9o0Var == null || tg00Var == null) {
            this.b = null;
        } else {
            this.b = l9o0Var.a(looper, new rg00(this, (byte) 0));
        }
        this.i = z;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new ug00(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (this.i) {
            x0x.K(Thread.currentThread() == this.f37360a);
        }
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.c != null) {
            q9o0 q9o0Var = this.b;
            q9o0Var.getClass();
            Handler handler = q9o0Var.f28360a;
            if (!handler.hasMessages(1)) {
                p9o0 p9o0VarA = q9o0Var.a(1);
                Message message = p9o0VarA.f26617a;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                p9o0VarA.a();
            }
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, sg00 sg00Var) {
        if (this.i) {
            x0x.K(Thread.currentThread() == this.f37360a);
        }
        this.f.add(new f58((Object) new CopyOnWriteArraySet(this.d), i, (Object) sg00Var, (byte) 7));
    }

    public final void d() {
        if (this.i) {
            x0x.K(Thread.currentThread() == this.f37360a);
        }
        synchronized (this.g) {
            this.h = true;
        }
        for (ug00 ug00Var : this.d) {
            tg00 tg00Var = this.c;
            ug00Var.d = true;
            if (tg00Var != null && ug00Var.c) {
                ug00Var.c = false;
                tg00Var.b(ug00Var.f35600a, ug00Var.b.e());
            }
        }
        this.d.clear();
    }

    public final void e(int i, sg00 sg00Var) {
        c(i, sg00Var);
        b();
    }

    public vg00(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
