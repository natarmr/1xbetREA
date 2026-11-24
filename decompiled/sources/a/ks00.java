package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ks00 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ls00 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ks00(ls00 ls00Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ls00Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ls00 ls00Var = this.k;
        switch (b) {
            case 0:
                return new ks00(ls00Var, yjeVar, (byte) 0);
            default:
                return new ks00(ls00Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ks00) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ls00 ls00Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    cpv0 cpv0VarD = cpv0.d(ls00Var.f20556a);
                    cpv0VarD.getClass();
                    r7x.F(cpv0VarD, 0L);
                    long jW0 = ibc.w0(31L, bfn.MINUTES);
                    this.j = true;
                    if (qcc.P(jW0, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    cpv0 cpv0VarD2 = cpv0.d(ls00Var.f20556a);
                    cpv0VarD2.getClass();
                    long jCurrentTimeMillis = 30 - ((System.currentTimeMillis() / 60000) - (((es00) ls00Var.b.f24555a.c).f8306a / 60000));
                    r7x.F(cpv0VarD2, jCurrentTimeMillis >= 0 ? jCurrentTimeMillis : 0L);
                    long jW1 = ibc.w0(31L, bfn.MINUTES);
                    this.j = true;
                    if (qcc.P(jW1, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
