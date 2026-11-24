package androidx.window.layout.adapter.extensions;

import a.jjv0;
import a.sbe;
import a.tto;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "La/sbe;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MulticastConsumer implements sbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45412a;
    public jjv0 c;
    public final ReentrantLock b = new ReentrantLock();
    public final LinkedHashSet d = new LinkedHashSet();

    public MulticastConsumer(Context context) {
        this.f45412a = context;
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
    public void accept(WindowLayoutInfo value) {
        value.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            jjv0 jjv0VarC = tto.c(this.f45412a, value);
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
