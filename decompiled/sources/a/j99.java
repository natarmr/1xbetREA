package a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class j99 implements nvu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f16126a = s99.p;
    public n5a b;
    public final /* synthetic */ q99 c;

    public j99(q99 q99Var) {
        this.c = q99Var;
    }

    @Override // a.nvu0
    public final void a(wvh0 wvh0Var, int i) {
        n5a n5aVar = this.b;
        if (n5aVar != null) {
            n5aVar.a(wvh0Var, i);
        }
    }

    public final Object b(zje zjeVar) {
        aub aubVarN;
        Boolean bool;
        Object obj = this.f16126a;
        boolean z = true;
        if (obj == s99.p || obj == s99.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q99.i;
            q99 q99Var = this.c;
            aub aubVar = (aub) atomicReferenceFieldUpdater.get(q99Var);
            while (!q99Var.z()) {
                long andIncrement = q99.e.getAndIncrement(q99Var);
                long j = s99.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (aubVar.d != j2) {
                    aubVarN = q99Var.n(j2, aubVar);
                    if (aubVarN == null) {
                        continue;
                    }
                } else {
                    aubVarN = aubVar;
                }
                Object objM = q99Var.M(aubVarN, i, andIncrement, null);
                pfw pfwVar = s99.m;
                ab4 ab4Var = null;
                if (objM == pfwVar) {
                    jf4.n("unreachable");
                    return null;
                }
                pfw pfwVar2 = s99.o;
                if (objM == pfwVar2) {
                    if (andIncrement < q99Var.v()) {
                        aubVarN.a();
                    }
                    aubVar = aubVarN;
                } else {
                    if (objM == s99.n) {
                        q99 q99Var2 = this.c;
                        n5a n5aVarQ = rq8.Q(pnx.b(zjeVar));
                        try {
                            this.b = n5aVarQ;
                            Object objM2 = q99Var2.M(aubVarN, i, andIncrement, this);
                            Function1 function1 = q99Var2.b;
                            if (objM2 != pfwVar) {
                                if (objM2 == pfwVar2) {
                                    if (andIncrement < q99Var2.v()) {
                                        aubVarN.a();
                                    }
                                    aub aubVar2 = (aub) q99.i.get(q99Var2);
                                    while (true) {
                                        if (q99Var2.z()) {
                                            n5a n5aVar = this.b;
                                            n5aVar.getClass();
                                            this.b = null;
                                            this.f16126a = s99.l;
                                            Throwable thQ = q99Var.q();
                                            if (thQ != null) {
                                                e0g0 e0g0Var = j0g0.b;
                                                n5aVar.resumeWith(new g0g0(thQ));
                                                break;
                                            }
                                            e0g0 e0g0Var2 = j0g0.b;
                                            n5aVar.resumeWith(Boolean.FALSE);
                                            break;
                                        }
                                        long andIncrement2 = q99.e.getAndIncrement(q99Var2);
                                        long j3 = s99.b;
                                        long j4 = andIncrement2 / j3;
                                        int i2 = (int) (andIncrement2 % j3);
                                        if (aubVar2.d != j4) {
                                            aub aubVarN2 = q99Var2.n(j4, aubVar2);
                                            if (aubVarN2 != null) {
                                                aubVar2 = aubVarN2;
                                            }
                                        }
                                        Object objM3 = q99Var2.M(aubVar2, i2, andIncrement2, this);
                                        if (objM3 == s99.m) {
                                            a(aubVar2, i2);
                                            break;
                                        }
                                        if (objM3 == s99.o) {
                                            if (andIncrement2 < q99Var2.v()) {
                                                aubVar2.a();
                                            }
                                        } else {
                                            if (objM3 == s99.n) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            aubVar2.a();
                                            this.f16126a = objM3;
                                            this.b = null;
                                            bool = Boolean.TRUE;
                                            if (function1 != null) {
                                                ab4Var = new ab4((byte) 16, objM3, function1);
                                            }
                                        }
                                    }
                                } else {
                                    aubVarN.a();
                                    this.f16126a = objM2;
                                    this.b = null;
                                    bool = Boolean.TRUE;
                                    if (function1 != null) {
                                        ab4Var = new ab4((byte) 16, objM2, function1);
                                    }
                                }
                                n5aVarQ.v(bool, ab4Var);
                                break;
                            }
                            a(aubVarN, i);
                            Object objP = n5aVarQ.p();
                            wne wneVar = wne.f39444a;
                            return objP;
                        } catch (Throwable th) {
                            n5aVarQ.B();
                            throw th;
                        }
                    }
                    aubVarN.a();
                    this.f16126a = objM;
                }
            }
            this.f16126a = s99.l;
            Throwable thQ2 = q99Var.q();
            if (thQ2 != null) {
                int i3 = yul0.f43274a;
                throw thQ2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final Object c() {
        Object obj = this.f16126a;
        pfw pfwVar = s99.p;
        if (obj == pfwVar) {
            jf4.n("`hasNext()` has not been invoked");
            return null;
        }
        this.f16126a = pfwVar;
        if (obj != s99.l) {
            return obj;
        }
        Throwable thS = this.c.s();
        int i = yul0.f43274a;
        throw thS;
    }
}
