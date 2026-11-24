package a;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class pff0 implements ec5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f26902a = new AtomicReference();

    @Override // a.ec5
    public final void a(boolean z) {
        Random random = qff0.j;
        synchronized (qff0.class) {
            Iterator it = qff0.k.values().iterator();
            while (it.hasNext()) {
                ((xgq) it.next()).c(z);
            }
        }
    }
}
