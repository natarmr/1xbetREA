package a;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class x5z implements jff0, nne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f40338a;
    public final Function2 b;
    public final sje c;
    public bby d;

    public x5z(CoroutineContext coroutineContext, Function2 function2) {
        this.f40338a = coroutineContext;
        this.b = function2;
        this.c = d5c.a(coroutineContext.plus(this));
    }

    @Override // a.jff0
    public final void c() {
        bby bbyVar = this.d;
        if (bbyVar != null) {
            zvw.G(bbyVar, "Old job was still running!");
        }
        this.d = qjj.W(this.c, null, null, this.b, 3);
    }

    @Override // a.jff0
    public final void f() {
        bby bbyVar = this.d;
        if (bbyVar != null) {
            bbyVar.cancel(new pvq((byte) 1));
        }
        this.d = null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // a.jff0
    public final void g() {
        bby bbyVar = this.d;
        if (bbyVar != null) {
            bbyVar.cancel(new pvq((byte) 1));
        }
        this.d = null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return lwf.h;
    }

    @Override // a.nne
    public final void l(Throwable th, CoroutineContext coroutineContext) throws Throwable {
        rld rldVar = (rld) coroutineContext.get(rld.b);
        if (rldVar != null) {
            sac.t0(th, new yw9(rldVar, this, (byte) 18));
        }
        nne nneVar = (nne) this.f40338a.get(lwf.h);
        if (nneVar == null) {
            throw th;
        }
        nneVar.l(th, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }
}
