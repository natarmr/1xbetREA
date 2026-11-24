package kotlin.coroutines;

import a.axq;
import a.bqd;
import a.sfc;
import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f46064a;
    public final CoroutineContext.Element b;

    public c(CoroutineContext.Element element, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.f46064a = coroutineContext;
        this.b = element;
    }

    public final boolean equals(Object obj) {
        boolean zD;
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i = 2;
            c cVar2 = cVar;
            int i2 = 2;
            while (true) {
                CoroutineContext coroutineContext = cVar2.f46064a;
                cVar2 = coroutineContext instanceof c ? (c) coroutineContext : null;
                if (cVar2 == null) {
                    break;
                }
                i2++;
            }
            c cVar3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = cVar3.f46064a;
                cVar3 = coroutineContext2 instanceof c ? (c) coroutineContext2 : null;
                if (cVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    CoroutineContext.Element element = this.b;
                    if (!Intrinsics.d(cVar.get(element.getKey()), element)) {
                        zD = false;
                        break;
                    }
                    CoroutineContext coroutineContext3 = this.f46064a;
                    if (!(coroutineContext3 instanceof c)) {
                        coroutineContext3.getClass();
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext3;
                        zD = Intrinsics.d(cVar.get(element2.getKey()), element2);
                        break;
                    }
                    this = (c) coroutineContext3;
                }
                if (zD) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(this.f46064a.fold(obj, function2), this.b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(f fVar) {
        fVar.getClass();
        while (true) {
            CoroutineContext.Element element = this.b.get(fVar);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = this.f46064a;
            if (!(coroutineContext instanceof c)) {
                return coroutineContext.get(fVar);
            }
            this = (c) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + this.f46064a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(f fVar) {
        fVar.getClass();
        CoroutineContext.Element element = this.b;
        CoroutineContext.Element element2 = element.get(fVar);
        CoroutineContext coroutineContext = this.f46064a;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(fVar);
        if (coroutineContextMinusKey == coroutineContext) {
            return this;
        }
        return coroutineContextMinusKey == g.f46065a ? element : new c(element, coroutineContextMinusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        return coroutineContext == g.f46065a ? this : (CoroutineContext) coroutineContext.fold(this, new bqd((byte) 6));
    }

    public final String toString() {
        return axq.m(new StringBuilder("["), (String) fold("", new sfc((byte) 13)), ']');
    }
}
