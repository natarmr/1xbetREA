package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r1a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bby f29668a;
    public final Object b;
    public final ArrayList c;
    public final Object d;
    public final ArrayList e;
    public final Object f;
    public final ArrayList g;

    public r1a(bby bbyVar) {
        bbyVar.getClass();
        this.f29668a = bbyVar;
        this.b = new Object();
        this.c = new ArrayList();
        this.d = new Object();
        this.e = new ArrayList();
        this.f = new Object();
        this.g = new ArrayList();
    }

    public final void a(p1a p1aVar, Runnable runnable) {
        boolean zAdd;
        int iOrdinal = p1aVar.ordinal();
        if (iOrdinal == 0) {
            synchronized (this.b) {
                zAdd = this.c.add(runnable);
            }
        } else if (iOrdinal == 1) {
            synchronized (this.d) {
                zAdd = this.e.add(runnable);
            }
        } else if (iOrdinal != 2) {
            t9f.b();
            return;
        } else {
            synchronized (this.f) {
                zAdd = this.g.add(runnable);
            }
        }
        if (zAdd) {
            return;
        }
        Log.e("CXCP", "CameraPipeLifetime already shut down. This is unexpected. Executing " + p1aVar + " shutdown action immediately...");
        runnable.run();
    }

    public final void b() {
        synchronized (this.b) {
            Log.d("CXCP", "Shutting down cameras...");
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        synchronized (this.d) {
            try {
                Log.d("CXCP", "Shutting down scopes...");
                Iterator it2 = this.e.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f) {
            Log.d("CXCP", "Shutting down threads...");
            Iterator it3 = this.g.iterator();
            while (it3.hasNext()) {
                ((Runnable) it3.next()).run();
            }
        }
    }
}
