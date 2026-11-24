package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class wl7 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ fm7 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wl7(fm7 fm7Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fm7Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        fm7 fm7Var = this.k;
        switch (b) {
            case 0:
                return new wl7(fm7Var, yjeVar, (byte) 0);
            case 1:
                return new wl7(fm7Var, yjeVar, (byte) 1);
            case 2:
                wl7 wl7Var = new wl7(fm7Var, yjeVar, (byte) 2);
                wl7Var.j = ((Boolean) obj).booleanValue();
                return wl7Var;
            case 3:
                return new wl7(fm7Var, yjeVar, (byte) 3);
            default:
                return new wl7(fm7Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((wl7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wl7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((wl7) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((wl7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((wl7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objN;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object objM;
        byte b = this.i;
        yje yjeVar = null;
        fm7 fm7Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    int i = fm7.p0;
                    objN = fm7Var.N(this);
                    if (objN == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objN = obj;
                }
                ql5 ql5Var = (ql5) objN;
                int i2 = fm7.p0;
                p7m0 p7m0Var = fm7Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, jk7.a((jk7) value, false, false, 0L, false, ql5Var, false, false, null, null, false, null, false, false, null, null, false, null, false, null, false, 33554399)));
                fm7Var.O();
                byte b2 = 2;
                fm7Var.m0 = sac.V(jiu0.a(fm7Var), null, null, fm7Var.p.b, new b04(b2, yjeVar, b2), 11);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    int i3 = fm7.p0;
                    if (fm7Var.M(this) == wneVar2) {
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
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ocj ocjVar = fm7Var.i;
                if ((!((jk7) fm7Var.D()).v || !z3) && ((jk7) fm7Var.D()).j.isEmpty()) {
                    if (((jk7) fm7Var.D()).v && !z3) {
                        p7m0 p7m0Var2 = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var2.getValue();
                            value3.getClass();
                        } while (!p7m0Var2.m(value3, jk7.a((jk7) value3, false, true, 0L, false, null, false, false, null, null, false, null, false, false, null, null, false, null, false, null, false, 33554428)));
                    } else if (!((jk7) fm7Var.D()).v && z3) {
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var3.getValue();
                            value2.getClass();
                        } while (!p7m0Var3.m(value2, jk7.a((jk7) value2, true, false, 0L, false, null, false, false, null, null, false, null, false, false, null, null, false, null, false, null, false, 33554430)));
                        e3c.n(fm7Var.l0);
                        fm7Var.O();
                    }
                }
                p7m0 p7m0Var4 = ocjVar.f25029a;
                while (true) {
                    Object value5 = p7m0Var4.getValue();
                    value5.getClass();
                    boolean z4 = z3;
                    if (p7m0Var4.m(value5, jk7.a((jk7) value5, false, false, 0L, false, null, false, false, null, null, false, null, false, false, null, null, false, null, z4, null, false, 31457279))) {
                        return Unit.f46060a;
                    }
                    z3 = z4;
                }
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    uen uenVar = wen.b;
                    long jW0 = ibc.w0(1000L, bfn.MILLISECONDS);
                    this.j = true;
                    if (qcc.P(jW0, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i4 = fm7.p0;
                p7m0 p7m0Var5 = fm7Var.i.f25029a;
                do {
                    value4 = p7m0Var5.getValue();
                    value4.getClass();
                } while (!p7m0Var5.m(value4, jk7.a((jk7) value4, false, false, 0L, false, null, false, false, null, null, false, null, false, false, null, null, false, null, false, null, false, 33554415)));
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    this.j = true;
                    int i5 = fm7.p0;
                    objM = fm7Var.M(this);
                    if (objM == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objM = obj;
                }
                if (((ql5) objM).i.a()) {
                    i1w0 i1w0Var = fm7Var.i0;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}
