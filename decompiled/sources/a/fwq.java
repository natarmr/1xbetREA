package a;

import android.gov.nist.core.Separators;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class fwq implements CoroutineContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f10270a;

    public fwq(CoroutineContext coroutineContext) {
        this.f10270a = coroutineContext;
    }

    public final boolean equals(Object obj) {
        return Intrinsics.d(this.f10270a, obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.f10270a.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        return this.f10270a.get(fVar);
    }

    public final int hashCode() {
        return this.f10270a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        CoroutineContext coroutineContextMinusKey = this.f10270a.minusKey(fVar);
        int i = iut0.b;
        ake akeVar = kotlin.coroutines.d.d1;
        CoroutineContext.Element element = get(akeVar);
        lne lneVar = element instanceof lne ? (lne) element : null;
        CoroutineContext.Element element2 = coroutineContextMinusKey.get(akeVar);
        lne lneVar2 = element2 instanceof lne ? (lne) element2 : null;
        if ((lneVar instanceof mzj) && lneVar != lneVar2) {
            ((mzj) lneVar).d = 0;
        }
        return new lzj(coroutineContextMinusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextPlus = this.f10270a.plus(coroutineContext);
        int i = iut0.b;
        ake akeVar = kotlin.coroutines.d.d1;
        CoroutineContext.Element element = get(akeVar);
        lne lneVar = element instanceof lne ? (lne) element : null;
        CoroutineContext.Element element2 = coroutineContextPlus.get(akeVar);
        lne lneVar2 = element2 instanceof lne ? (lne) element2 : null;
        if ((lneVar instanceof mzj) && lneVar != lneVar2) {
            ((mzj) lneVar).d = 0;
        }
        return new lzj(coroutineContextPlus);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.f10270a + Separators.RPAREN;
    }
}
