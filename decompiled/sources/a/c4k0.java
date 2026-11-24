package a;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class c4k0 extends dw5 {
    public Object c;
    public Object d;
    public iz40 e;
    public iz40 f;
    public jbi0 g;
    public final rai0 h;
    public final jk8 i;

    public c4k0() {
        super((byte) 2);
        this.h = new rai0(this, (byte) 18);
        uph0 uph0Var = new uph0((Object) this, (byte) 27);
        xfk0.b(xfk0.f40794a);
        synchronized (xfk0.c) {
            xfk0.h = CollectionsKt.r0(xfk0.h, uph0Var);
        }
        this.i = new jk8(uph0Var, (byte) 3);
    }

    @Override // a.dw5
    public final void c(jbi0 jbi0Var) {
        this.d = null;
        this.f = null;
    }

    @Override // a.dw5
    public final void d() {
        synchronized (this.b) {
            try {
                this.c = this.d;
                if (this.f == null) {
                    this.e = null;
                } else {
                    iz40 iz40Var = this.e;
                    if (iz40Var == null) {
                        iz40 iz40Var2 = v1h0.f36630a;
                        iz40Var = new iz40();
                        this.e = iz40Var;
                    }
                    this.e = this.f;
                    this.f = iz40Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.dw5
    public final void e() {
        this.i.a();
        this.d = null;
        this.f = null;
        synchronized (this.b) {
            this.g = null;
            this.c = null;
            this.e = null;
        }
    }

    @Override // a.dw5
    public final Function1 f(jbi0 jbi0Var) {
        jbi0 jbi0Var2 = this.g;
        if (jbi0Var2 != null && !jbi0Var2.equals(jbi0Var)) {
            dsb0.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.g = jbi0Var;
        return this.h;
    }

    @Override // a.dw5
    public final void g(htb htbVar) {
        this.g = null;
        this.d = null;
        this.f = null;
        d();
    }
}
