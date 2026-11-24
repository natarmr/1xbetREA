package a;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class h5w0 {
    public static final HashMap o = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12502a;
    public final h8w0 b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final c9w0 i;
    public g5w0 m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final p8w0 k = new IBinder.DeathRecipient() { // from class: a.p8w0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            h5w0 h5w0Var = this.f26580a;
            h5w0Var.b.b("reportBinderDeath", new Object[0]);
            if (h5w0Var.j.get() != null) {
                hny.b();
                return;
            }
            h5w0Var.b.b("%s : Binder has died.", h5w0Var.c);
            Iterator it = h5w0Var.d.iterator();
            while (it.hasNext()) {
                ((m8w0) it.next()).a(new RemoteException(String.valueOf(h5w0Var.c).concat(" : Binder has died.")));
            }
            h5w0Var.d.clear();
            synchronized (h5w0Var.f) {
                h5w0Var.e();
            }
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [a.p8w0] */
    public h5w0(Context context, h8w0 h8w0Var, String str, Intent intent, c9w0 c9w0Var) {
        this.f12502a = context;
        this.b = h8w0Var;
        this.c = str;
        this.h = intent;
        this.i = c9w0Var;
    }

    public static void b(h5w0 h5w0Var, m8w0 m8w0Var) {
        IInterface iInterface = h5w0Var.n;
        h8w0 h8w0Var = h5w0Var.b;
        ArrayList arrayList = h5w0Var.d;
        if (iInterface != null || h5w0Var.g) {
            if (!h5w0Var.g) {
                m8w0Var.run();
                return;
            } else {
                h8w0Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(m8w0Var);
                return;
            }
        }
        h8w0Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(m8w0Var);
        g5w0 g5w0Var = new g5w0(h5w0Var);
        h5w0Var.m = g5w0Var;
        h5w0Var.g = true;
        if (h5w0Var.f12502a.bindService(h5w0Var.h, g5w0Var, 1)) {
            return;
        }
        h8w0Var.b("Failed to bind to the service.", new Object[0]);
        h5w0Var.g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((m8w0) it.next()).a(new i5w0("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(m8w0 m8w0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new v8w0(this, m8w0Var.c(), taskCompletionSource, m8w0Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new c5w0(this, (byte) 1));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
