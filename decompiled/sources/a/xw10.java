package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class xw10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ cx10 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xw10(cx10 cx10Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = cx10Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        cx10 cx10Var = this.k;
        switch (b) {
            case 0:
                xw10 xw10Var = new xw10(cx10Var, yjeVar, (byte) 0);
                xw10Var.j = ((Boolean) obj).booleanValue();
                return xw10Var;
            case 1:
                return new xw10(cx10Var, yjeVar, (byte) 1);
            case 2:
                return new xw10(cx10Var, yjeVar, (byte) 2);
            case 3:
                return new xw10(cx10Var, yjeVar, (byte) 3);
            case 4:
                return new xw10(cx10Var, yjeVar, (byte) 4);
            default:
                return new xw10(cx10Var, yjeVar, (byte) 5);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((xw10) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((xw10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((xw10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((xw10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((xw10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xw10) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objB;
        Object objA;
        byte b = this.i;
        cx10 cx10Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ctf0 ctf0Var = cx10Var.w;
                p7m0 p7m0Var = cx10Var.I;
                if (z) {
                    cx10Var.z();
                } else if (((rw10) p7m0Var.getValue()).f31199a.length() == 0) {
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, rw10.a((rw10) value, ctf0Var.f(R.string.user, new Object[0]), ctf0Var.f(R.string.personal_data, new Object[0]), false, false, false, false, false, null, null, null, null, null, null, 32764)));
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ahu ahuVar = cx10Var.q;
                    this.j = true;
                    objB = ahuVar.b(bm5.f2822a, this);
                    if (objB == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                ql5 ql5Var = (ql5) objB;
                ot otVar = cx10Var.g;
                bm5 bm5Var = bm5.g;
                otVar.a(bm5Var, ql5Var);
                jyg0 jyg0Var = cx10Var.h;
                long j = ql5Var.f28916a;
                jyg0Var.getClass();
                jyg0Var.f17359a.z(bm5Var, j);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (((m4i0) ((o470) cx10Var.D.f42558a).f24619a).f21172a == r040.AGGREGATOR) {
                        ytt yttVar = cx10Var.l;
                        aue0 aue0Var = aue0.d;
                        this.j = true;
                        if (yttVar.a(aue0Var, this) == wneVar3) {
                            return wneVar3;
                        }
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0Var = cx10Var.d;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                c8d c8dVar = new c8d(y7d.f42146a, n0w0.f22721a);
                ListIterator listIterator = cs0.h(copyOnWriteArrayListQ, c8dVar, c8dVar, i1w0Var, copyOnWriteArrayListQ).listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    cx10Var.G.f(new hw10(true));
                    if (((m4i0) ((o470) cx10Var.D.f42558a).f24619a).f21172a == r040.AGGREGATOR) {
                        ytt yttVar2 = cx10Var.l;
                        aue0 aue0Var2 = aue0.d;
                        this.j = true;
                        if (yttVar2.a(aue0Var2, this) == wneVar4) {
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
                i1w0 i1w0Var2 = cx10Var.d;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                c8d c8dVar2 = new c8d(y7d.f42146a, o0w0.f24450a);
                ListIterator listIterator2 = cs0.h(copyOnWriteArrayListQ2, c8dVar2, c8dVar2, i1w0Var2, copyOnWriteArrayListQ2).listIterator(0);
                while (true) {
                    paw pawVar2 = (paw) listIterator2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    tzi tziVar = cx10Var.z;
                    ((ag3) tziVar.h).f809a.c("main_menu_upd_balance_call");
                    ((gg5) tziVar.c).f11237a.a(xun.f41520a, 3144L);
                    this.j = true;
                    if (cx10Var.C(this) == wneVar5) {
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
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    rou rouVar = cx10Var.p;
                    this.j = true;
                    objA = rouVar.a(true, this);
                    if (objA == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                if (((m2c0) objA).e0 != cau0.h) {
                    cx10Var.G.f(lw10.f20740a);
                }
                return Unit.f46060a;
        }
    }
}
