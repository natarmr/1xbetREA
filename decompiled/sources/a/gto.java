package a;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class gto extends fto {
    public final ReentrantLock g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public gto(WindowLayoutComponent windowLayoutComponent, rrc rrcVar) {
        super(windowLayoutComponent, rrcVar);
        this.g = new ReentrantLock();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    @Override // a.fto, a.dto, a.jhv0
    public final void a(Context context, Executor executor, sbe sbeVar) {
        LinkedHashMap linkedHashMap = this.h;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            hx40 hx40Var = (hx40) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.i;
            if (hx40Var != null) {
                hx40Var.a(sbeVar);
                linkedHashMap2.put(sbeVar, context);
            } else {
                hx40 hx40Var2 = new hx40(context);
                linkedHashMap.put(context, hx40Var2);
                linkedHashMap2.put(sbeVar, context);
                hx40Var2.a(sbeVar);
                this.f10123a.addWindowLayoutInfoListener(context, hx40Var2);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // a.fto, a.dto, a.jhv0
    public final void b(sbe sbeVar) {
        LinkedHashMap linkedHashMap = this.h;
        LinkedHashMap linkedHashMap2 = this.i;
        ReentrantLock reentrantLock = this.g;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(sbeVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            hx40 hx40Var = (hx40) linkedHashMap.get(context);
            if (hx40Var == null) {
                reentrantLock.unlock();
                return;
            }
            ReentrantLock reentrantLock2 = hx40Var.b;
            reentrantLock2.lock();
            try {
                hx40Var.d.remove(sbeVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(sbeVar);
                if (hx40Var.d.isEmpty()) {
                    linkedHashMap.remove(context);
                    this.f10123a.removeWindowLayoutInfoListener(hx40Var);
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
