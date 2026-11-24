package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class lff0 implements vne, jff0 {
    public static final w5a e = new w5a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f19953a;
    public final CoroutineContext b;
    public final lff0 c = this;
    public volatile CoroutineContext d;

    public lff0(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.f19953a = coroutineContext;
        this.b = coroutineContext2;
    }

    public final void a() {
        synchronized (this.c) {
            try {
                CoroutineContext coroutineContext = this.d;
                if (coroutineContext == null) {
                    this.d = e;
                } else {
                    zvw.F(coroutineContext, new pvq((byte) 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.jff0
    public final void f() {
        a();
    }

    @Override // a.jff0
    public final void g() {
        a();
    }

    @Override // a.vne
    public final CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContextPlus;
        CoroutineContext coroutineContext = this.d;
        if (coroutineContext == null || coroutineContext == e) {
            rld rldVar = (rld) this.f19953a.get(rld.b);
            CoroutineContext kff0Var = rldVar != null ? new kff0(rldVar, this) : kotlin.coroutines.g.f46065a;
            synchronized (this.c) {
                try {
                    CoroutineContext coroutineContext2 = this.d;
                    if (coroutineContext2 == null) {
                        CoroutineContext coroutineContext3 = this.f19953a;
                        coroutineContextPlus = coroutineContext3.plus(new dby((bby) coroutineContext3.get(gqw0.o1))).plus(this.b).plus(kff0Var);
                    } else if (coroutineContext2 == e) {
                        CoroutineContext coroutineContext4 = this.f19953a;
                        dby dbyVar = new dby((bby) coroutineContext4.get(gqw0.o1));
                        dbyVar.r(new pvq((byte) 0));
                        coroutineContextPlus = coroutineContext4.plus(dbyVar).plus(this.b).plus(kff0Var);
                    } else {
                        coroutineContextPlus = coroutineContext2;
                    }
                    this.d = coroutineContextPlus;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coroutineContext = coroutineContextPlus;
        }
        coroutineContext.getClass();
        return coroutineContext;
    }

    @Override // a.jff0
    public final void c() {
    }
}
