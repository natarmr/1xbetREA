package a;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class nao implements v6n0, r7d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f23200a;
    public ArrayDeque b;

    public nao() {
        o6t0 o6t0Var = o6t0.f24755a;
        this.f23200a = new HashMap();
        this.b = new ArrayDeque();
    }

    public final synchronized void a(Executor executor, vdo vdoVar) {
        try {
            if (!this.f23200a.containsKey(saj.class)) {
                this.f23200a.put(saj.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f23200a.get(saj.class)).put(vdoVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
