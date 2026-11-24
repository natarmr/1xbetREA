package a;

import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class lbp extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ccp k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lbp(ccp ccpVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ccpVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ccp ccpVar = this.k;
        switch (b) {
            case 0:
                return new lbp(ccpVar, yjeVar, (byte) 0);
            case 1:
                return new lbp(ccpVar, yjeVar, (byte) 1);
            default:
                lbp lbpVar = new lbp(ccpVar, yjeVar, (byte) 2);
                lbpVar.j = ((Boolean) obj).booleanValue();
                return lbpVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((lbp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((lbp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((lbp) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        bby bbyVar;
        byte b = this.i;
        ccp ccpVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = ccp.u0;
                    p7m0 p7m0Var = ccpVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, dd80.a((dd80) value, true, false, false, false, false, false, null, null, false, 8189)));
                    peg0 peg0Var = ccpVar.r;
                    a7p a7pVar = a7p.f382a;
                    this.j = true;
                    if (peg0Var.p(this) == wneVar) {
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
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i2 = ccp.u0;
                    p7m0 p7m0Var2 = ccpVar.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, dd80.a((dd80) value2, true, false, false, false, false, false, null, null, false, 8189)));
                    kqc kqcVar = ccpVar.B;
                    this.j = true;
                    Object objB = kqcVar.b.b(this);
                    if (objB != wneVar2) {
                        objB = Unit.f46060a;
                    }
                    if (objB == wneVar2) {
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
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i3 = ccp.u0;
                ocj ocjVar = ccpVar.i;
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, dd80.a((dd80) value3, false, false, false, false, false, false, null, null, z3, 4095)));
                if (z3 && ((bbyVar = ccpVar.q0) == null || !bbyVar.isActive())) {
                    ccpVar.S();
                } else if (!z3 && (((dd80) ccpVar.D()).h instanceof gc80)) {
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var4.getValue();
                        value4.getClass();
                    } while (!p7m0Var4.m(value4, dd80.a((dd80) value4, false, false, false, false, false, true, new dc80(new UnknownHostException(), iun.f15405a), null, false, 7999)));
                }
                return Unit.f46060a;
        }
    }
}
