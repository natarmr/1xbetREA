package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class tkz implements zkz, vne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final glz f34120a;
    public final CoroutineContext b;

    public tkz(glz glzVar, CoroutineContext coroutineContext) {
        glzVar.getClass();
        coroutineContext.getClass();
        this.f34120a = glzVar;
        this.b = coroutineContext;
        if (glzVar.i == lkz.f20223a) {
            zvw.F(coroutineContext, null);
        }
    }

    @Override // a.vne
    public final CoroutineContext getCoroutineContext() {
        return this.b;
    }

    @Override // a.zkz
    public final void l(clz clzVar, kkz kkzVar) {
        glz glzVar = this.f34120a;
        if (glzVar.i.compareTo(lkz.f20223a) <= 0) {
            glzVar.f(this);
            zvw.F(this.b, null);
        }
    }
}
