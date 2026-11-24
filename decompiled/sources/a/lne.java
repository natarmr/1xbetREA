package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lne extends kotlin.coroutines.a implements kotlin.coroutines.d {
    public static final kne b = new kne(kotlin.coroutines.d.d1, new vzd(7));

    public lne() {
        super(kotlin.coroutines.d.d1);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(kotlin.coroutines.f fVar) {
        CoroutineContext.Element element;
        fVar.getClass();
        if (fVar instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) fVar;
            kotlin.coroutines.f fVar2 = this.f46062a;
            fVar2.getClass();
            if ((fVar2 == bVar || bVar.b == fVar2) && (element = (CoroutineContext.Element) bVar.f46063a.invoke(this)) != null) {
                return element;
            }
        } else if (kotlin.coroutines.d.d1 == fVar) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(kotlin.coroutines.f fVar) {
        fVar.getClass();
        if (!(fVar instanceof kotlin.coroutines.b)) {
            return kotlin.coroutines.d.d1 == fVar ? kotlin.coroutines.g.f46065a : this;
        }
        kotlin.coroutines.b bVar = (kotlin.coroutines.b) fVar;
        kotlin.coroutines.f fVar2 = this.f46062a;
        fVar2.getClass();
        return ((fVar2 == bVar || bVar.b == fVar2) && ((CoroutineContext.Element) bVar.f46063a.invoke(this)) != null) ? kotlin.coroutines.g.f46065a : this;
    }

    public void q(CoroutineContext coroutineContext, Runnable runnable) {
        coroutineContext.getClass();
        runnable.getClass();
        zne.d.q(coroutineContext, runnable);
    }

    public void r(CoroutineContext coroutineContext, Runnable runnable) {
        ovk.b(this, coroutineContext, runnable);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + qjj.R(this);
    }

    public boolean v(CoroutineContext coroutineContext) {
        return !(this instanceof l7t0);
    }

    public lne w(int i) {
        g7x.x(i);
        return new hsz(this, i);
    }
}
