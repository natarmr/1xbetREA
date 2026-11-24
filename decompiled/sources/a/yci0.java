package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class yci0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ldi0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yci0(ldi0 ldi0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ldi0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ldi0 ldi0Var = this.k;
        switch (b) {
            case 0:
                return new yci0(ldi0Var, yjeVar, (byte) 0);
            case 1:
                return new yci0(ldi0Var, yjeVar, (byte) 1);
            case 2:
                return new yci0(ldi0Var, yjeVar, (byte) 2);
            case 3:
                return new yci0(ldi0Var, yjeVar, (byte) 3);
            case 4:
                return new yci0(ldi0Var, yjeVar, (byte) 4);
            default:
                yci0 yci0Var = new yci0(ldi0Var, yjeVar, (byte) 5);
                yci0Var.j = ((Boolean) obj).booleanValue();
                return yci0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yci0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((yci0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((yci0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((yci0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((yci0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((yci0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objY;
        Object value;
        Object value2;
        List list;
        swp0 swp0Var;
        Object value3;
        p7m0 p7m0Var;
        List list2;
        Object value4;
        byte b = this.i;
        ldi0 ldi0Var = this.k;
        yje yjeVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    objY = ldi0Var.y(this);
                    if (objY == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objY = obj;
                }
                pk pkVar = (pk) objY;
                p7m0 p7m0Var2 = ldi0Var.H;
                do {
                    value = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value, uci0.a((uci0) value, false, false, false, false, new eci0(pkVar), false, false, 3967)));
                p7m0 p7m0Var3 = ldi0Var.G;
                do {
                    value2 = p7m0Var3.getValue();
                    kbi0 kbi0Var = (kbi0) value2;
                    list = ldi0Var.c.u() ? pkVar.c : pkVar.b;
                    swp0Var = kbi0Var.f18016a;
                    swp0Var.getClass();
                    list.getClass();
                } while (!p7m0Var3.m(value2, new kbi0(swp0Var, list)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    obk0 obk0Var = obk0.FLASH_CALL;
                    this.j = true;
                    if (ldi0Var.I(obk0Var, this) == wneVar2) {
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
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    obk0 obk0Var2 = obk0.TELEGRAM;
                    this.j = true;
                    if (ldi0Var.I(obk0Var2, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                ldi0 ldi0Var2 = this.k;
                p7m0 p7m0Var4 = ldi0Var2.H;
                dci0 dci0Var = ldi0Var2.c;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    if ((dci0Var instanceof tbi0) || (dci0Var instanceof ubi0)) {
                        byte b3 = 0;
                        fnq fnqVar = new fnq(aoq.a(new vsg0(new nv(new fnq(aoq.c(new vsg0(new fdi0(ldi0Var2, yjeVar, b3)), new edi0(null, ldi0Var2)), new fdi0(ldi0Var2, yjeVar, b2), (byte) 4), yjeVar, (byte) 9)), new fdi0(ldi0Var2, yjeVar, (byte) 2)), new u52((diu0) ldi0Var2, yjeVar, (byte) 23), (byte) 4);
                        rai0 rai0Var = new rai0(ldi0Var2, (byte) 2);
                        ldi0Var2.E = sac.T(new dnq(new fnq(new fnq(fnqVar, new noe(rai0Var, yjeVar, b3)), new noe(rai0Var, yjeVar, b2), (byte) 4), new e00(rai0Var, yjeVar, (byte) 13), (byte) 0), d5c.S(jiu0.a(ldi0Var2), ldi0Var2.e.b), new jbh0(2, ldi0Var2, ldi0.class, "localHandleError", "localHandleError(Ljava/lang/Throwable;)V", 4, (byte) 2));
                    } else if (((uci0) p7m0Var4.getValue()).h instanceof hci0) {
                        do {
                            value3 = p7m0Var4.getValue();
                            zie0 zie0Var = obk0.b;
                            p7m0Var = ldi0Var2.G;
                            list2 = ((kbi0) p7m0Var.getValue()).b;
                            zie0Var.getClass();
                        } while (!p7m0Var4.m(value3, uci0.a((uci0) value3, zie0.d(list2), zie0.f(((kbi0) p7m0Var.getValue()).b), zie0.e(((kbi0) p7m0Var.getValue()).b), zie0.c(((kbi0) p7m0Var.getValue()).b), new eci0(new pk(((kbi0) p7m0Var.getValue()).f18016a, dci0Var.z(), dci0Var.D())), false, false, 3937)));
                    } else {
                        obk0 obk0Var3 = obk0.SMS;
                        this.j = true;
                        if (ldi0Var2.I(obk0Var3, this) == wneVar4) {
                            return wneVar4;
                        }
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    obk0 obk0Var4 = obk0.VOICE_SMS;
                    this.j = true;
                    if (ldi0Var.I(obk0Var4, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                boolean z6 = this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var5 = ldi0Var.H;
                do {
                    value4 = p7m0Var5.getValue();
                } while (!p7m0Var5.m(value4, uci0.a((uci0) value4, false, false, false, false, null, z6, false, 3839)));
                return Unit.f46060a;
        }
    }
}
