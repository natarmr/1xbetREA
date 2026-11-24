package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ipb0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ lpb0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ipb0(lpb0 lpb0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = lpb0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        lpb0 lpb0Var = this.k;
        switch (b) {
            case 0:
                return new ipb0(lpb0Var, yjeVar, (byte) 0);
            default:
                ipb0 ipb0Var = new ipb0(lpb0Var, yjeVar, (byte) 1);
                ipb0Var.j = ((Boolean) obj).booleanValue();
                return ipb0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ipb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ipb0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object value;
        Object value2;
        Object value3;
        ipb0 ipb0Var = this;
        byte b = ipb0Var.i;
        lpb0 lpb0Var = ipb0Var.k;
        switch (b) {
            case 0:
                ocj ocjVar = lpb0Var.i;
                wne wneVar = wne.f39444a;
                boolean z = ipb0Var.j;
                if (!z) {
                    z1x.P(obj);
                    int i = lpb0.G;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    while (true) {
                        Object value4 = p7m0Var.getValue();
                        value4.getClass();
                        if (p7m0Var.m(value4, zob0.a((zob0) value4, false, true, null, null, null, null, null, null, 32765))) {
                            g320 g320Var = lpb0Var.w;
                            cit0 cit0Var = ((zob0) lpb0Var.D()).h;
                            if (cit0Var == null) {
                                return Unit.f46060a;
                            }
                            ouj0 ouj0VarA0 = r8x.a0(cit0Var, lpb0Var.z.a(), lpb0Var.p, lpb0Var.x.f17841a.b().getId(), lpb0Var.o);
                            byte b2 = lpb0Var.v.a().I1.f26017a;
                            ipb0Var.j = true;
                            objB = g320Var.b(ouj0VarA0, 0L, b2, ipb0Var);
                            if (objB == wneVar) {
                                return wneVar;
                            }
                        } else {
                            ipb0Var = this;
                        }
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                pa20 pa20Var = (pa20) objB;
                int i2 = lpb0.G;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, zob0.a((zob0) value, false, false, null, null, null, null, null, null, 32765)));
                i3t0.K(lpb0Var, lpb0Var.s.c, null, new r72(pa20Var, lpb0Var, null, (byte) 14), 2);
                return Unit.f46060a;
            default:
                boolean z2 = ipb0Var.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ocj ocjVar2 = lpb0Var.i;
                if (!((zob0) lpb0Var.D()).k.equals(rob0.f30829a)) {
                    sob0 sob0Var = ((zob0) lpb0Var.D()).k;
                    qob0 qob0Var = qob0.f29066a;
                    if (sob0Var.equals(qob0Var) && z2) {
                        lpb0Var.M();
                    } else {
                        pob0 pob0Var = pob0.f27321a;
                        if (!z2 && ((zob0) lpb0Var.D()).k.equals(qob0Var)) {
                            p7m0 p7m0Var3 = ocjVar2.f25029a;
                            do {
                                value3 = p7m0Var3.getValue();
                                value3.getClass();
                            } while (!p7m0Var3.m(value3, zob0.a((zob0) value3, false, false, null, null, null, pob0Var, null, null, 30719)));
                        } else if (((zob0) lpb0Var.D()).k.equals(pob0Var) && ((zob0) lpb0Var.D()).h == null) {
                            lpb0Var.M();
                        }
                    }
                }
                p7m0 p7m0Var4 = ocjVar2.f25029a;
                do {
                    value2 = p7m0Var4.getValue();
                    value2.getClass();
                } while (!p7m0Var4.m(value2, zob0.a((zob0) value2, z2, false, null, null, null, null, null, null, 32766)));
                return Unit.f46060a;
        }
    }
}
