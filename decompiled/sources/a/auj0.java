package a;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class auj0 implements jhv0 {
    public static volatile auj0 c;
    public static final ReentrantLock d = new ReentrantLock();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kso f1481a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public auj0(ytj0 ytj0Var) {
        this.f1481a = ytj0Var;
        if (ytj0Var != null) {
            ytj0Var.d(new dpi0(this));
        }
    }

    @Override // a.jhv0
    public final void a(Context context, Executor executor, sbe sbeVar) {
        Object next;
        WindowManager.LayoutParams attributes;
        iBinder = null;
        IBinder iBinder = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            sbeVar.accept(new jjv0(iun.f15405a));
            return;
        }
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        try {
            kso ksoVar = this.f1481a;
            if (ksoVar == null) {
                sbeVar.accept(new jjv0(iun.f15405a));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.b;
            boolean z = false;
            if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (((ztj0) it.next()).f44963a.equals(activity)) {
                        z = true;
                        break;
                    }
                }
            }
            ztj0 ztj0Var = new ztj0(activity, executor, sbeVar);
            copyOnWriteArrayList.add(ztj0Var);
            if (z) {
                Iterator it2 = copyOnWriteArrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!activity.equals(((ztj0) next).f44963a));
                ztj0 ztj0Var2 = (ztj0) next;
                jjv0 jjv0Var = ztj0Var2 != null ? ztj0Var2.d : null;
                if (jjv0Var != null) {
                    ztj0Var.d = jjv0Var;
                    ztj0Var.b.execute(new oh60(ztj0Var, jjv0Var, (byte) 20));
                }
            } else {
                ytj0 ytj0Var = (ytj0) ksoVar;
                Window window = activity.getWindow();
                if (window != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (iBinder != null) {
                    ytj0Var.c(iBinder, activity);
                } else {
                    activity.getWindow().getDecorView().addOnAttachStateChangeListener(new j14(ytj0Var, activity));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // a.jhv0
    public final void b(sbe sbeVar) {
        synchronized (d) {
            try {
                if (this.f1481a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.b.iterator();
                it.getClass();
                while (it.hasNext()) {
                    ztj0 ztj0Var = (ztj0) it.next();
                    if (ztj0Var.c == sbeVar) {
                        arrayList.add(ztj0Var);
                    }
                }
                this.b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((ztj0) it2.next()).f44963a;
                    CopyOnWriteArrayList copyOnWriteArrayList = this.b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator it3 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((ztj0) it3.next()).f44963a.equals(activity)) {
                                }
                            }
                        }
                    }
                    kso ksoVar = this.f1481a;
                    if (ksoVar != null) {
                        ((ytj0) ksoVar).b(activity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
