package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class tfs0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ wfs0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tfs0(wfs0 wfs0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wfs0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wfs0 wfs0Var = this.k;
        switch (b) {
            case 0:
                return new tfs0(wfs0Var, yjeVar, (byte) 0);
            case 1:
                return new tfs0(wfs0Var, yjeVar, (byte) 1);
            case 2:
                return new tfs0(wfs0Var, yjeVar, (byte) 2);
            default:
                tfs0 tfs0Var = new tfs0(wfs0Var, yjeVar, (byte) 3);
                tfs0Var.j = ((Boolean) obj).booleanValue();
                return tfs0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tfs0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((tfs0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((tfs0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((tfs0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objO;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        byte b = this.i;
        wfs0 wfs0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    hnu hnuVar = wfs0Var.u;
                    String str = wfs0Var.p;
                    String str2 = wfs0Var.o;
                    this.j = true;
                    objO = ((hcp0) hnuVar.f13365a).o(str2, str, this);
                    if (objO == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objO = obj;
                }
                List list = (List) objO;
                int i = wfs0.A;
                p7m0 p7m0Var = wfs0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ifs0.a((ifs0) value, false, kgs0.f18256a, null, false, null, null, list, 237)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    uen uenVar = wen.b;
                    long jW0 = ibc.w0(1000L, bfn.MILLISECONDS);
                    this.j = true;
                    if (qcc.P(jW0, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = wfs0.A;
                p7m0 p7m0Var2 = wfs0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, ifs0.a((ifs0) value2, false, null, null, false, null, null, null, 495)));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    uen uenVar2 = wen.b;
                    long jW1 = ibc.w0(30000L, bfn.MILLISECONDS);
                    this.j = true;
                    if (qcc.P(jW1, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                bby bbyVar = wfs0Var.z;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                return Unit.f46060a;
            default:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                ocj ocjVar = wfs0Var.i;
                if (!((ifs0) wfs0Var.D()).b.equals(kgs0.f18256a)) {
                    lgs0 lgs0Var = ((ifs0) wfs0Var.D()).b;
                    jgs0 jgs0Var = jgs0.f16495a;
                    if (lgs0Var.equals(jgs0Var)) {
                        wfs0Var.M();
                    } else if (!((ifs0) wfs0Var.D()).f14704a && z4) {
                        wfs0Var.M();
                    } else if (!z4 && ((ifs0) wfs0Var.D()).b.equals(jgs0Var)) {
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        do {
                            value4 = p7m0Var3.getValue();
                            value4.getClass();
                        } while (!p7m0Var3.m(value4, ifs0.a((ifs0) value4, false, igs0.f14749a, null, false, null, null, null, 509)));
                    }
                }
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                } while (!p7m0Var4.m(value3, ifs0.a((ifs0) value3, z4, null, null, false, null, null, null, 510)));
                return Unit.f46060a;
        }
    }
}
