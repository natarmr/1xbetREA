package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class oz1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ wz1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oz1(wz1 wz1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wz1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wz1 wz1Var = this.k;
        switch (b) {
            case 0:
                oz1 oz1Var = new oz1(wz1Var, yjeVar, (byte) 0);
                oz1Var.j = ((Boolean) obj).booleanValue();
                return oz1Var;
            case 1:
                return new oz1(wz1Var, yjeVar, (byte) 1);
            case 2:
                return new oz1(wz1Var, yjeVar, (byte) 2);
            case 3:
                return new oz1(wz1Var, yjeVar, (byte) 3);
            default:
                return new oz1(wz1Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((oz1) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((oz1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((oz1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((oz1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((oz1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        wz1 wz1Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (!((dz1) wz1Var.D()).g && z) {
                    wz1Var.N();
                }
                p7m0 p7m0Var = wz1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, dz1.a((dz1) value, false, false, false, null, z, null, null, false, null, 4031)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    kb0 kb0Var = wz1Var.o;
                    String str = wz1.T;
                    y1p y1pVar = y1p.MAIN;
                    cb0 cb0Var = new cb0(str, "aggregator_tournaments");
                    this.j = true;
                    kb0Var.getClass();
                    if (kb0Var.o(cb0Var, this) == wneVar2) {
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
                    kb0 kb0Var2 = wz1Var.o;
                    db0 db0Var = new db0(wz1.T, k7k.AggregatorTournaments, wz1Var.F.g());
                    this.j = true;
                    kb0Var2.getClass();
                    if (kb0Var2.o(db0Var, this) == wneVar3) {
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
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    i8i.D("screen", "aggregator_tournaments", wz1Var.r.f29324a, "login_page_call");
                    s64 s64Var = wz1Var.E;
                    y1p y1pVar2 = y1p.MAIN;
                    s64Var.c("aggregator_tournaments");
                    ytt yttVar = wz1Var.G;
                    aue0 aue0Var = aue0.d;
                    this.j = true;
                    if (yttVar.a(aue0Var, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0VarB = wz1Var.t.b();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
                c8d c8dVar = new c8d(y7d.f42146a, n0w0.f22721a);
                ListIterator listIterator = cs0.h(copyOnWriteArrayListQ, c8dVar, c8dVar, i1w0VarB, copyOnWriteArrayListQ).listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarB.a((oe50) pawVar.next());
                }
                break;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    i8i.D("screen", "aggregator_tournaments", wz1Var.r.f29324a, "reg_page_call");
                    wz1Var.E.d(y1p.AGGREGATOR_TOURNAMENTS, wz1Var.F.g());
                    ytt yttVar2 = wz1Var.G;
                    aue0 aue0Var2 = aue0.d;
                    this.j = true;
                    if (yttVar2.a(aue0Var2, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0VarB2 = wz1Var.t.b();
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarB2);
                c8d c8dVar2 = new c8d(y7d.f42146a, o0w0.f24450a);
                ListIterator listIterator2 = cs0.h(copyOnWriteArrayListQ2, c8dVar2, c8dVar2, i1w0VarB2, copyOnWriteArrayListQ2).listIterator(0);
                while (true) {
                    paw pawVar2 = (paw) listIterator2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarB2.a((oe50) pawVar2.next());
                }
                break;
        }
    }
}
