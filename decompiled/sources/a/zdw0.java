package a;

import com.google.firebase.auth.FirebaseAuth;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class zdw0 implements gmx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfq f44228a;
    public final p5d0 b;
    public final p5d0 c;
    public final Executor d;
    public final Executor e;
    public final Executor f;
    public final ScheduledExecutorService g;
    public final Executor h;
    public final ConcurrentHashMap i = new ConcurrentHashMap();

    public zdw0(nfq nfqVar, p5d0 p5d0Var, p5d0 p5d0Var2, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, Executor executor4) {
        this.f44228a = nfqVar;
        this.b = p5d0Var;
        this.c = p5d0Var2;
        this.d = executor;
        this.e = executor2;
        this.f = executor3;
        this.g = scheduledExecutorService;
        this.h = executor4;
    }

    public final synchronized FirebaseAuth a() {
        if (this.i.containsKey("default")) {
            FirebaseAuth firebaseAuth = (FirebaseAuth) this.i.get("default");
            if (firebaseAuth != null) {
                return firebaseAuth;
            }
            this.i.remove("default");
        }
        if (!this.i.isEmpty()) {
            throw new IllegalStateException("FirebaseAuth instance has already been instantiated with different configuration.");
        }
        ncw0 ncw0Var = new ncw0(this.f44228a, this.b, this.e, this.f, this.g, this.h);
        this.i.put("default", ncw0Var);
        return ncw0Var;
    }
}
