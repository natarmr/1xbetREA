package a;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public class fto extends dto {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f10123a;
    public final rrc b;
    public final ReentrantLock c = new ReentrantLock();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();

    public fto(WindowLayoutComponent windowLayoutComponent, rrc rrcVar) {
        this.f10123a = windowLayoutComponent;
        this.b = rrcVar;
    }

    @Override // a.dto, a.jhv0
    public void a(Context context, Executor executor, sbe sbeVar) {
        LinkedHashMap linkedHashMap = this.d;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.e;
            if (multicastConsumer != null) {
                multicastConsumer.a(sbeVar);
                linkedHashMap2.put(sbeVar, context);
            } else {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(sbeVar, context);
                multicastConsumer2.a(sbeVar);
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(iun.f15405a));
                } else {
                    this.f.put(multicastConsumer2, this.b.v(this.f10123a, sre0.f32672a.b(WindowLayoutInfo.class), (Activity) context, new eto(1, multicastConsumer2, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0)));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // a.dto, a.jhv0
    public void b(sbe sbeVar) {
        LinkedHashMap linkedHashMap = this.d;
        LinkedHashMap linkedHashMap2 = this.e;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            Context context = (Context) linkedHashMap2.get(sbeVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashSet linkedHashSet = multicastConsumer.d;
            ReentrantLock reentrantLock2 = multicastConsumer.b;
            reentrantLock2.lock();
            try {
                linkedHashSet.remove(sbeVar);
                reentrantLock2.unlock();
                linkedHashMap2.remove(sbeVar);
                if (linkedHashSet.isEmpty()) {
                    linkedHashMap.remove(context);
                    ube ubeVar = (ube) this.f.remove(multicastConsumer);
                    if (ubeVar != null) {
                        ubeVar.f35376a.invoke(ubeVar.b, ubeVar.c);
                    }
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
