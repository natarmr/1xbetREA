package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class opk0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ tpk0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ opk0(tpk0 tpk0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = tpk0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        tpk0 tpk0Var = this.k;
        switch (b) {
            case 0:
                return new opk0(tpk0Var, yjeVar, (byte) 0);
            case 1:
                return new opk0(tpk0Var, yjeVar, (byte) 1);
            default:
                return new opk0(tpk0Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((opk0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        tpk0 tpk0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    yhi yhiVar = tpk0Var.t;
                    int i = ((jpk0) tpk0Var.D()).f16907a;
                    bvc bvcVarA = jiu0.a(tpk0Var);
                    n0w n0wVar = n0w.f22720a;
                    boolean z2 = tpk0Var.R.J1;
                    this.j = true;
                    if (yhiVar.e(i, bvcVarA, n0wVar, z2, this) == wneVar) {
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
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    i6m0 i6m0Var = tpk0Var.F;
                    long j = ((jpk0) tpk0Var.D()).j;
                    this.j = true;
                    Object objA = i6m0Var.f14248a.f5514a.a(j, this);
                    if (objA != wneVar2) {
                        objA = Unit.f46060a;
                    }
                    if (objA != wneVar2) {
                        objA = Unit.f46060a;
                    }
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                sff0 sff0Var = tpk0Var.R;
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    pwi pwiVar = tpk0Var.P;
                    int i2 = ((jpk0) tpk0Var.D()).f16907a;
                    boolean z5 = sff0Var.J1;
                    bvc bvcVarA2 = jiu0.a(tpk0Var);
                    boolean z6 = tpk0Var.Q.a() || sff0Var.O1;
                    this.j = true;
                    if (pwiVar.n(i2, bvcVarA2, z5, z6, true, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
