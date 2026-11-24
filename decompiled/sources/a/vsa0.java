package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class vsa0 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ata0 k;
    public final /* synthetic */ xgl0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vsa0(ata0 ata0Var, xgl0 xgl0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = ata0Var;
        this.l = xgl0Var;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        xgl0 xgl0Var = this.l;
        ata0 ata0Var = this.k;
        switch (b) {
            case 0:
                return new vsa0(ata0Var, xgl0Var, yjeVar, (byte) 0);
            default:
                return new vsa0(ata0Var, xgl0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((vsa0) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ata0 ata0Var = this.k;
        xgl0 xgl0Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    hao haoVarO = wdx.O(rsa0.a((nsa0) ata0Var.D()), xgl0Var);
                    if (haoVarO == null) {
                        return Unit.f46060a;
                    }
                    l9s l9sVarB = rsa0.b((nsa0) ata0Var.D());
                    if (l9sVarB == null) {
                        return Unit.f46060a;
                    }
                    long j = haoVarO.c;
                    boolean z2 = haoVarO.h;
                    rh7 rh7Var = haoVarO.m;
                    long j2 = rh7Var.f30476a;
                    String str = rh7Var.b;
                    long j3 = haoVarO.b;
                    long j4 = haoVarO.e;
                    double d = haoVarO.f;
                    double d2 = haoVarO.d;
                    String str2 = haoVarO.i;
                    m97 m97Var = new m97(j, (int) haoVarO.q.f36034a, (izc) null, z2, false, j2, str, j3, j4, d, d, d2, str2, haoVarO.j, haoVarO.l, haoVarO.k, false, haoVarO.p, false, 0L, false, haoVarO.t, false, 0.0d, (String) null, 62717972);
                    m0k0 m0k0VarI0 = wdx.i0(l9sVarB, xgl0Var.i);
                    if (ata0Var.v.a().f32117a.g) {
                        ctc ctcVar = ctc.f4929a;
                        this.j = true;
                        if (ata0Var.M(m0k0VarI0, haoVarO, ctcVar, this) == wneVar) {
                            return wneVar;
                        }
                    } else {
                        ata0Var.G(new isa0(ojd.f25352a));
                        ata0Var.G(new isa0(new pjd(ata0Var.R, m97Var, m0k0VarI0)));
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
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    hao haoVarO2 = wdx.O(rsa0.a((nsa0) ata0Var.D()), xgl0Var);
                    if (haoVarO2 == null) {
                        return Unit.f46060a;
                    }
                    l9s l9sVarB2 = rsa0.b((nsa0) ata0Var.D());
                    if (l9sVarB2 == null) {
                        return Unit.f46060a;
                    }
                    m0k0 m0k0VarI1 = wdx.i0(l9sVarB2, xgl0Var.i);
                    ctc ctcVar2 = ctc.b;
                    this.j = true;
                    if (ata0Var.M(m0k0VarI1, haoVarO2, ctcVar2, this) == wneVar2) {
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
        }
    }
}
