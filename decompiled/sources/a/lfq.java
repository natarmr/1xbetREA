package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class lfq implements ec5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f19969a = new AtomicReference();

    @Override // a.ec5
    public final void a(boolean z) {
        synchronized (nfq.k) {
            try {
                for (nfq nfqVar : new ArrayList(nfq.l.values())) {
                    if (nfqVar.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = nfqVar.i.iterator();
                        while (it.hasNext()) {
                            nfq nfqVar2 = ((kfq) it.next()).f18207a;
                            if (!z) {
                                ((quj) nfqVar2.h.get()).a();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
