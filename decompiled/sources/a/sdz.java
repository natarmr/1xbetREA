package a;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class sdz implements p5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f32054a;
    public volatile Set b;

    @Override // a.p5d0
    public final Object get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        synchronized (this) {
                            try {
                                Iterator it = this.f32054a.iterator();
                                while (it.hasNext()) {
                                    this.b.add(((p5d0) it.next()).get());
                                }
                                this.f32054a = null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}
