package com.google.android.recaptcha.internal;

import a.bby;
import a.cby;
import a.fac;
import a.gqw0;
import a.h1i0;
import a.i1i0;
import a.jac;
import a.jzj;
import a.lbk;
import a.ndd;
import a.nwk;
import a.odd;
import a.pby;
import a.wne;
import a.yje;
import defpackage.a;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbw implements jzj {
    private final /* synthetic */ ndd zza;

    public zzbw(ndd nddVar) {
        this.zza = nddVar;
    }

    @Override // a.bby
    public final fac attachChild(jac jacVar) {
        return this.zza.attachChild(jacVar);
    }

    @Override // a.jzj
    public final Object await(yje yjeVar) {
        Object objQ = ((odd) this.zza).q(yjeVar);
        wne wneVar = wne.f39444a;
        return objQ;
    }

    @lbk
    public final /* synthetic */ boolean cancel(Throwable th) {
        Throwable cbyVar;
        pby pbyVar = (pby) this.zza;
        if (th != null) {
            pbyVar.getClass();
            cbyVar = pby.Y(pbyVar, th);
        } else {
            cbyVar = new cby(pbyVar.u(), null, pbyVar);
        }
        pbyVar.s(cbyVar);
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        pby pbyVar = (pby) this.zza;
        pbyVar.getClass();
        function2.getClass();
        return function2.invoke(obj, pbyVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        pby pbyVar = (pby) this.zza;
        pbyVar.getClass();
        return e.a(pbyVar, fVar);
    }

    @Override // a.bby
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // a.bby
    public final Sequence getChildren() {
        return this.zza.getChildren();
    }

    @Override // a.jzj
    public final Object getCompleted() {
        return ((odd) this.zza).B();
    }

    @Override // a.jzj
    public final Throwable getCompletionExceptionOrNull() {
        return ((pby) this.zza).getCompletionExceptionOrNull();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final f getKey() {
        this.zza.getClass();
        return gqw0.o1;
    }

    @Override // a.jzj
    public final i1i0 getOnAwait() {
        return ((odd) this.zza).E();
    }

    @Override // a.bby
    public final h1i0 getOnJoin() {
        return ((pby) this.zza).getOnJoin();
    }

    public final bby getParent() {
        pby pbyVar = (pby) this.zza;
        pbyVar.getClass();
        fac facVar = (fac) a.f0a.getObjectVolatile(pbyVar, pby.f26732a);
        if (facVar != null) {
            return facVar.getParent();
        }
        return null;
    }

    @Override // a.bby
    public final nwk invokeOnCompletion(boolean z, boolean z2, Function1 function1) {
        return ((pby) this.zza).invokeOnCompletion(z, z2, function1);
    }

    @Override // a.bby
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // a.bby
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // a.bby
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // a.bby
    public final Object join(yje yjeVar) {
        return this.zza.join(yjeVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        return this.zza.minusKey(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.zza.plus(coroutineContext);
    }

    @Override // a.bby
    public final boolean start() {
        return this.zza.start();
    }

    @lbk
    public final bby plus(bby bbyVar) {
        this.zza.getClass();
        return bbyVar;
    }

    @Override // a.bby
    public final nwk invokeOnCompletion(Function1 function1) {
        return this.zza.invokeOnCompletion(function1);
    }

    @Override // a.bby, a.htb
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @lbk
    public final /* synthetic */ void cancel() {
        bby bbyVar = this.zza;
        bbyVar.getClass();
        ((pby) bbyVar).cancel(null);
    }
}
