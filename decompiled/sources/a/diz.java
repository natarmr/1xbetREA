package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class diz extends bnn0 implements Function2 {
    public kzj i;
    public byte j;
    public /* synthetic */ Object k;
    public final /* synthetic */ eiz l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diz(eiz eizVar, long j, long j2, int i, yje yjeVar) {
        super(2, yjeVar);
        this.l = eizVar;
        this.m = j;
        this.n = j2;
        this.o = i;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        diz dizVar = new diz(this.l, this.m, this.n, this.o, yjeVar);
        dizVar.k = obj;
        return dizVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((diz) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        kzj kzjVarM;
        Object objQ;
        byte b;
        eiz eizVar;
        wne wneVar;
        kzj kzjVar;
        Object objAwait;
        vne vneVar = (vne) this.k;
        wne wneVar2 = wne.f39444a;
        byte b2 = this.j;
        long j = this.n;
        eiz eizVar2 = this.l;
        byte b3 = 2;
        if (b2 != 0) {
            if (b2 == 1) {
                kzjVarM = this.i;
                z1x.P(obj);
                objQ = obj;
            } else {
                if (b2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objAwait = obj;
                eizVar = eizVar2;
            }
            ub4 ub4Var = new ub4(((j0g0) objAwait).f15681a, j, (byte) 4);
            int i = eiz.E;
            eizVar.H(ub4Var);
            return Unit.f46060a;
        }
        z1x.P(obj);
        kzj kzjVarM2 = qjj.M(vneVar, null, new tr(eizVar2, this.m, this.n, null, (byte) 10), 3);
        kzjVarM = qjj.M(vneVar, null, new n6f(eizVar2, this.n, this.o, null), 3);
        this.k = null;
        this.i = kzjVarM;
        this.j = (byte) 1;
        objQ = kzjVarM2.q(this);
        if (objQ == wneVar2) {
            return wneVar2;
        }
        ypl0 ypl0Var = (ypl0) objQ;
        int i2 = eiz.E;
        p7m0 p7m0Var = eizVar2.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            b = b3;
            p7m0 p7m0Var2 = p7m0Var;
            eizVar = eizVar2;
            wneVar = wneVar2;
            kzjVar = kzjVarM;
            if (p7m0Var2.m(value, ihz.a((ihz) value, j, 0, null, null, null, ypl0Var, null, null, null, null, null, null, null, false, false, false, 131005))) {
                break;
            }
            b3 = b;
            p7m0Var = p7m0Var2;
            wneVar2 = wneVar;
            kzjVarM = kzjVar;
            eizVar2 = eizVar;
        }
        this.k = null;
        this.i = null;
        this.j = b;
        objAwait = kzjVar.await(this);
        if (objAwait == wneVar) {
            return wneVar;
        }
        ub4 ub4Var2 = new ub4(((j0g0) objAwait).f15681a, j, (byte) 4);
        int i3 = eiz.E;
        eizVar.H(ub4Var2);
        return Unit.f46060a;
    }
}
