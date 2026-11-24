package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class srq {
    public static final rrq c = new rrq(lwf.h, (byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final phf0 f32691a;
    public final sje b;

    public srq(phf0 phf0Var) {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f46065a;
        this.f32691a = phf0Var;
        vs10 vs10Var = svk.f32871a;
        rrq rrqVar = c;
        rrqVar.getClass();
        CoroutineContext coroutineContextPlus = kotlin.coroutines.e.c(rrqVar, vs10Var).plus(gVar);
        gVar.getClass();
        this.b = d5c.a(coroutineContextPlus.plus(new kin0(null)));
    }
}
