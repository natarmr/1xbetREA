package a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class j050 implements m5a, nvu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n5a f15666a;
    public final /* synthetic */ k050 b;

    public j050(k050 k050Var, n5a n5aVar) {
        this.b = k050Var;
        this.f15666a = n5aVar;
    }

    @Override // a.nvu0
    public final void a(wvh0 wvh0Var, int i) {
        this.f15666a.a(wvh0Var, i);
    }

    @Override // a.m5a
    public final pfw b(Object obj, xdr xdrVar) {
        k050 k050Var = this.b;
        p0z p0zVar = new p0z(k050Var, this);
        pfw pfwVarF = this.f15666a.F((Unit) obj, p0zVar);
        if (pfwVarF != null) {
            k050.i.set(k050Var, null);
        }
        return pfwVarF;
    }

    @Override // a.yje
    public final CoroutineContext getContext() {
        return this.f15666a.e;
    }

    @Override // a.m5a
    public final boolean h(Throwable th) {
        return this.f15666a.h(th);
    }

    @Override // a.yje
    public final void resumeWith(Object obj) {
        this.f15666a.resumeWith(obj);
    }

    @Override // a.m5a
    public final void v(Object obj, xdr xdrVar) throws mvk {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k050.i;
        k050 k050Var = this.b;
        atomicReferenceFieldUpdater.set(k050Var, null);
        b530 b530Var = new b530(k050Var, this);
        n5a n5aVar = this.f15666a;
        n5aVar.C((Unit) obj, n5aVar.c, new sd8(b530Var, (byte) 3));
    }

    @Override // a.m5a
    public final void w(Object obj) throws mvk {
        this.f15666a.w(obj);
    }
}
