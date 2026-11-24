package a;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class uii0 implements vii0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f35731a = new AtomicBoolean(false);
    public final vii0 b;

    public uii0(vii0 vii0Var) {
        this.b = vii0Var;
    }

    @Override // a.vii0
    public final void a(xii0 xii0Var) {
        if (this.f35731a.get()) {
            return;
        }
        this.b.a(xii0Var);
    }

    public final void b() {
        this.f35731a.set(true);
    }
}
