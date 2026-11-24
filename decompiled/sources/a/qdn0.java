package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class qdn0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ rdn0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qdn0(rdn0 rdn0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rdn0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rdn0 rdn0Var = this.k;
        switch (b) {
            case 0:
                return new qdn0(rdn0Var, yjeVar, (byte) 0);
            case 1:
                return new qdn0(rdn0Var, yjeVar, (byte) 1);
            default:
                qdn0 qdn0Var = new qdn0(rdn0Var, yjeVar, (byte) 2);
                qdn0Var.j = ((Boolean) obj).booleanValue();
                return qdn0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((qdn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((qdn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((qdn0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objT;
        Object value2;
        Object value3;
        byte b = this.i;
        rdn0 rdn0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    utb utbVarC = aoq.c(rdn0Var.u.d(rdn0Var.O(), rdn0Var.O(), ((sff0) rdn0Var.E.getValue()).J1), new za60((yje) null, rdn0Var, (byte) 14));
                    r0m0 r0m0Var = new r0m0(rdn0Var, (byte) 17);
                    this.j = true;
                    if (utbVarC.c(r0m0Var, this) == wneVar) {
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
                ocj ocjVar = rdn0Var.i;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i = rdn0.I;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, hdn0.a((hdn0) value, null, false, null, null, null, null, false, true, false, null, false, false, false, 8063)));
                    dj9 dj9Var = rdn0Var.q;
                    this.j = true;
                    objT = dj9Var.f6172a.t(this);
                    if (objT == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objT = obj;
                }
                if (((Boolean) objT).booleanValue()) {
                    int i2 = rdn0.I;
                    rdn0Var.N();
                } else {
                    int i3 = rdn0.I;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, hdn0.a((hdn0) value2, null, false, null, null, null, null, false, false, false, null, false, false, false, 8063)));
                }
                return Unit.f46060a;
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i4 = rdn0.I;
                ocj ocjVar2 = rdn0Var.i;
                p7m0 p7m0Var3 = ocjVar2.f25029a;
                while (true) {
                    Object value4 = p7m0Var3.getValue();
                    value4.getClass();
                    boolean z4 = z3;
                    if (p7m0Var3.m(value4, hdn0.a((hdn0) value4, null, false, null, null, null, null, false, false, false, null, false, z4, false, 6143))) {
                        if (z4) {
                            rdn0Var.N();
                        } else if (((hdn0) rdn0Var.D()).d != cdn0.f4170a || rdn0Var.O()) {
                            p7m0 p7m0Var4 = ocjVar2.f25029a;
                            do {
                                value3 = p7m0Var4.getValue();
                                value3.getClass();
                            } while (!p7m0Var4.m(value3, hdn0.a((hdn0) value3, null, false, null, cdn0.b, null, null, false, false, false, null, false, false, false, 8183)));
                        } else {
                            rdn0Var.N();
                        }
                        return Unit.f46060a;
                    }
                    z3 = z4;
                }
                break;
        }
    }
}
