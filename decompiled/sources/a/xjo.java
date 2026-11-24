package a;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class xjo {
    public static final nek c = new nek();
    public static final LinkedHashMap d = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f40995a;
    public final jtj b;

    public xjo(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f40995a = reentrantLock;
        this.b = z ? new jtj(str) : null;
    }
}
