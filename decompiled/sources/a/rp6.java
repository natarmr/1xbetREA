package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class rp6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ vp6 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rp6(vp6 vp6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = vp6Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        vp6 vp6Var = this.k;
        switch (b) {
            case 0:
                rp6 rp6Var = new rp6(vp6Var, yjeVar, (byte) 0);
                rp6Var.j = ((Boolean) obj).booleanValue();
                return rp6Var;
            case 1:
                rp6 rp6Var2 = new rp6(vp6Var, yjeVar, (byte) 1);
                rp6Var2.j = ((Boolean) obj).booleanValue();
                return rp6Var2;
            case 2:
                return new rp6(vp6Var, yjeVar, (byte) 2);
            default:
                return new rp6(vp6Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((rp6) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((rp6) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((rp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((rp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        p7m0 p7m0Var;
        Object value2;
        byte b = this.i;
        vp6 vp6Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ocj ocjVar = vp6Var.i;
                if (z) {
                    int i = vp6.W;
                    vp6Var.Q();
                } else {
                    v3c.N(vp6Var.U);
                    if (((jp6) vp6Var.D()).f16886a) {
                        p7m0 p7m0Var2 = ocjVar.f25029a;
                        do {
                            value = p7m0Var2.getValue();
                            value.getClass();
                        } while (!p7m0Var2.m(value, jp6.a((jp6) value, false, true, false, false, null, null, null, null, null, false, null, false, false, false, null, false, null, false, 2097144)));
                    }
                }
                int i2 = vp6.W;
                p7m0 p7m0Var3 = ocjVar.f25029a;
                while (true) {
                    Object value3 = p7m0Var3.getValue();
                    value3.getClass();
                    p7m0 p7m0Var4 = p7m0Var3;
                    boolean z2 = z;
                    if (p7m0Var4.m(value3, jp6.a((jp6) value3, false, false, false, false, null, null, null, null, null, false, null, false, false, false, null, false, null, z2, 1966079))) {
                        return Unit.f46060a;
                    }
                    p7m0Var3 = p7m0Var4;
                    z = z2;
                }
                break;
            case 1:
                boolean z3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i3 = vp6.W;
                p7m0 p7m0Var5 = vp6Var.i.f25029a;
                while (true) {
                    Object value4 = p7m0Var5.getValue();
                    value4.getClass();
                    vp6Var.f.getClass();
                    boolean z4 = z3;
                    if (p7m0Var5.m(value4, jp6.a((jp6) value4, false, false, false, false, null, null, null, null, null, false, null, false, false, z4, null, false, null, false, 2088959))) {
                        return Unit.f46060a;
                    }
                    z3 = z4;
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    if (vp6Var.C.g()) {
                        vpu vpuVar = vp6Var.F;
                        this.j = true;
                        if (vpuVar.b(false, this) == wneVar3) {
                            return wneVar3;
                        }
                    } else {
                        i1w0 i1w0Var = vp6Var.O;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new a1w0(new zo4(vp6Var, (byte) 19))), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                        }
                    }
                    int i4 = vp6.W;
                    p7m0Var = vp6Var.i.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                    } while (!p7m0Var.m(value2, jp6.a((jp6) value2, false, false, false, false, null, null, null, null, null, false, null, false, false, false, null, false, null, false, 2064383)));
                    return Unit.f46060a;
                }
                if (!z5) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                int i5 = vp6.W;
                vp6Var.G(dp6.f6447a);
                int i6 = vp6.W;
                p7m0Var = vp6Var.i.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                } while (!p7m0Var.m(value2, jp6.a((jp6) value2, false, false, false, false, null, null, null, null, null, false, null, false, false, false, null, false, null, false, 2064383)));
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    buo0 buo0Var = vp6Var.I;
                    hae0 hae0Var = hae0.ACTION_DO_BET;
                    this.j = true;
                    if (buo0Var.a(hae0Var, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
