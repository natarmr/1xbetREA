package a;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qsg0 extends zje implements kmq {
    public final kmq i;
    public final CoroutineContext j;
    public final int k;
    public CoroutineContext l;
    public yje m;

    public qsg0(kmq kmqVar, CoroutineContext coroutineContext) {
        super(vx50.f38185a, kotlin.coroutines.g.f46065a);
        this.i = kmqVar;
        this.j = coroutineContext;
        this.k = ((Number) coroutineContext.fold(0, new vtf0((byte) 27))).intValue();
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        try {
            Object objL = l(yjeVar, obj);
            return objL == wne.f39444a ? objL : Unit.f46060a;
        } catch (Throwable th) {
            this.l = new xcl(th, yjeVar.getContext());
            throw th;
        }
    }

    @Override // a.zw5, a.xne
    public final xne getCallerFrame() {
        yje yjeVar = this.m;
        if (yjeVar instanceof xne) {
            return (xne) yjeVar;
        }
        return null;
    }

    @Override // a.zje, a.yje
    public final CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.l;
        return coroutineContext == null ? kotlin.coroutines.g.f46065a : coroutineContext;
    }

    @Override // a.zw5
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Throwable thA = j0g0.a(obj);
        if (thA != null) {
            this.l = new xcl(thA, getContext());
        }
        yje yjeVar = this.m;
        if (yjeVar != null) {
            yjeVar.resumeWith(obj);
        }
        return wne.f39444a;
    }

    public final Object l(yje yjeVar, Object obj) {
        CoroutineContext context = yjeVar.getContext();
        zvw.O(context);
        CoroutineContext coroutineContext = this.l;
        if (coroutineContext != context) {
            if (coroutineContext instanceof xcl) {
                throw new IllegalStateException(ntm0.c("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((xcl) coroutineContext).b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new dke0(this, (byte) 25))).intValue() != this.k) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.j + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.l = context;
        }
        this.m = yjeVar;
        xdr xdrVar = ssg0.f32724a;
        kmq kmqVar = this.i;
        kmqVar.getClass();
        Object objF = xdrVar.F(kmqVar, obj, this);
        if (!Intrinsics.d(objF, wne.f39444a)) {
            this.m = null;
        }
        return objF;
    }
}
