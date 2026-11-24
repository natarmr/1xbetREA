package a;

import java.net.SocketTimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class xu60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ hv60 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xu60(hv60 hv60Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hv60Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hv60 hv60Var = this.k;
        switch (b) {
            case 0:
                return new xu60(hv60Var, yjeVar, (byte) 0);
            case 1:
                xu60 xu60Var = new xu60(hv60Var, yjeVar, (byte) 1);
                xu60Var.j = ((Boolean) obj).booleanValue();
                return xu60Var;
            case 2:
                xu60 xu60Var2 = new xu60(hv60Var, yjeVar, (byte) 2);
                xu60Var2.j = ((Boolean) obj).booleanValue();
                return xu60Var2;
            case 3:
                return new xu60(hv60Var, yjeVar, (byte) 3);
            default:
                return new xu60(hv60Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xu60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((xu60) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((xu60) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((xu60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xu60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object objA;
        byte b = this.i;
        boolean z = true;
        hv60 hv60Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    int i = hv60.i0;
                    if (hv60Var.P(this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                boolean z3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = hv60.i0;
                p7m0 p7m0Var = hv60Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ru60.a((ru60) value, null, z3, false, false, 0L, null, null, null, null, null, null, 0L, 8187)));
                if (z3) {
                    hv60Var.V();
                }
                return Unit.f46060a;
            case 2:
                boolean z4 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                oyg0 oyg0Var = hv60Var.f;
                ocj ocjVar = hv60Var.i;
                boolean z5 = ((ru60) hv60Var.D()).d;
                if (z4 == z5) {
                    return Unit.f46060a;
                }
                hv60Var.H.a(z4);
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, ru60.a((ru60) value2, null, false, z4, z5, 0L, null, null, null, null, null, null, 0L, 8167)));
                if (z4) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value5 = p7m0Var3.getValue();
                        value5.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value5, ru60.a((ru60) value5, null, false, false, false, 0L, null, null, null, iun.f15405a, null, null, 0L, 127)));
                    hv60Var.O(true);
                } else {
                    boolean z6 = ((ru60) hv60Var.D()).h != null;
                    pat patVar = (pat) hv60Var.Y.getValue();
                    patVar.getClass();
                    if (!(patVar instanceof oat)) {
                        pat patVar2 = (pat) hv60Var.Z.getValue();
                        patVar2.getClass();
                        if (!(patVar2 instanceof oat)) {
                            z = false;
                        }
                    }
                    if (!(((ru60) hv60Var.D()).l instanceof sq60)) {
                        if (!z6) {
                            p7m0 p7m0Var4 = ocjVar.f25029a;
                            do {
                                value4 = p7m0Var4.getValue();
                                value4.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var4.m(value4, ru60.a((ru60) value4, null, false, false, false, 0L, null, null, null, null, null, new SocketTimeoutException(), 0L, 2047)));
                        } else if (((ru60) hv60Var.D()).e && z) {
                            p7m0 p7m0Var5 = ocjVar.f25029a;
                            do {
                                value3 = p7m0Var5.getValue();
                                value3.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var5.m(value3, ru60.a((ru60) value3, null, false, false, false, 0L, null, null, null, null, null, new sq60(), 0L, 2047)));
                        } else {
                            c4m0 c4m0Var = hv60Var.d0;
                            if (c4m0Var != null) {
                                v3c.N(c4m0Var);
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 3:
                wsf0 wsf0Var = hv60Var.t;
                wne wneVar4 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    khf0 khf0VarG = ((g45) wsf0Var.b).G();
                    bm5 bm5Var = bm5.d;
                    this.j = true;
                    objA = khf0VarG.A(bm5Var, tl5.c, this);
                    if (objA == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                ql5 ql5Var = (ql5) objA;
                wsf0Var.s().l(bm5.d, ql5Var);
                hv60Var.J.a(hv60Var.o, true, ql5Var.f28916a);
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    o470 o470Var = hv60Var.v;
                    this.j = true;
                    if (((d0b) o470Var.f24619a).e(this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                hv60Var.P.f35083a.c("games_cashback_withdraw_done");
                hv60Var.V.f15516a.a(xun.f41520a, 3337L);
                hv60Var.G(ou60.f25863a);
                return Unit.f46060a;
        }
    }
}
