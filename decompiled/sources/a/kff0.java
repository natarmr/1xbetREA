package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class kff0 extends kotlin.coroutines.a implements nne {
    public final /* synthetic */ rld b;
    public final /* synthetic */ lff0 c;

    /* JADX WARN: Illegal instructions before constructor call */
    public kff0(rld rldVar, lff0 lff0Var) {
        lwf lwfVar = lwf.h;
        this.b = rldVar;
        this.c = lff0Var;
        super(lwfVar);
    }

    @Override // a.nne
    public final void l(Throwable th, CoroutineContext coroutineContext) throws Throwable {
        rld rldVar = this.b;
        lff0 lff0Var = this.c;
        sac.t0(th, new yw9(rldVar, lff0Var, (byte) 18));
        CoroutineContext coroutineContext2 = lff0Var.b;
        lwf lwfVar = lwf.h;
        nne nneVar = (nne) coroutineContext2.get(lwfVar);
        if (nneVar != null) {
            nneVar.l(th, coroutineContext);
            return;
        }
        nne nneVar2 = (nne) lff0Var.f19953a.get(lwfVar);
        if (nneVar2 == null) {
            throw th;
        }
        nneVar2.l(th, coroutineContext);
    }
}
