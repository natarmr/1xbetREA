package a;

import kotlin.coroutines.CoroutineContext;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zje extends zw5 {
    private final CoroutineContext _context;
    private transient yje<Object> intercepted;

    public zje(yje yjeVar) {
        this(yjeVar, yjeVar != null ? yjeVar.getContext() : null);
    }

    @Override // a.yje
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        coroutineContext.getClass();
        return coroutineContext;
    }

    public final yje<Object> intercepted() {
        yje<Object> yjeVar = this.intercepted;
        if (yjeVar != null) {
            return yjeVar;
        }
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) getContext().get(kotlin.coroutines.d.d1);
        yje<Object> nvkVar = dVar != null ? new nvk((lne) dVar, this) : this;
        this.intercepted = nvkVar;
        return nvkVar;
    }

    @Override // a.zw5
    public void releaseIntercepted() {
        Unsafe unsafe;
        long j;
        yje<Object> yjeVar = this.intercepted;
        if (yjeVar != null && yjeVar != this) {
            CoroutineContext.Element element = getContext().get(kotlin.coroutines.d.d1);
            element.getClass();
            ((lne) ((kotlin.coroutines.d) element)).getClass();
            nvk nvkVar = (nvk) yjeVar;
            do {
                unsafe = defpackage.a.f0a;
                j = nvk.h;
            } while (unsafe.getObjectVolatile(nvkVar, j) == ovk.b);
            Object objectVolatile = unsafe.getObjectVolatile(nvkVar, j);
            n5a n5aVar = objectVolatile instanceof n5a ? (n5a) objectVolatile : null;
            if (n5aVar != null) {
                n5aVar.m();
            }
        }
        this.intercepted = tdd.f33763a;
    }

    public zje(yje yjeVar, CoroutineContext coroutineContext) {
        super(yjeVar);
        this._context = coroutineContext;
    }
}
