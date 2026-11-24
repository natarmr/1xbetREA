package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class r2t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f29753a = q7m0.a(null);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) throws Throwable {
        q2t q2tVar;
        Object g0g0Var;
        if (zjeVar instanceof q2t) {
            q2tVar = (q2t) zjeVar;
            int i = q2tVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                q2tVar.k = i - Integer.MIN_VALUE;
            } else {
                q2tVar = new q2t(this, zjeVar);
            }
        } else {
            q2tVar = new q2t(this, zjeVar);
        }
        Object obj = q2tVar.i;
        wne wneVar = wne.f39444a;
        int i2 = q2tVar.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                ndd nddVar = (ndd) this.f29753a.getValue();
                if (nddVar == null) {
                    return Unit.f46060a;
                }
                e0g0 e0g0Var = j0g0.b;
                q2tVar.k = 1;
                if (((odd) nddVar).q(q2tVar) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return Unit.f46060a;
        }
        if (agc.L(thA) || agc.N(thA)) {
            throw new vub0();
        }
        throw thA;
    }
}
