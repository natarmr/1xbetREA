package a;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class hx40 implements sbe, Consumer2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13796a;
    public jjv0 c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet d = new LinkedHashSet();

    public hx40(Context context) {
        this.f13796a = context;
    }

    public final void a(sbe sbeVar) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            jjv0 jjv0Var = this.c;
            if (jjv0Var != null) {
                sbeVar.accept(jjv0Var);
            }
            this.d.add(sbeVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // a.sbe
    public final void accept(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            jjv0 jjv0VarC = tto.c(this.f13796a, windowLayoutInfo);
            this.c = jjv0VarC;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((sbe) it.next()).accept(jjv0VarC);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
