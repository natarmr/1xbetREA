package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e21 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ n21 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e21(n21 n21Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = n21Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        n21 n21Var = this.k;
        switch (b) {
            case 0:
                return new e21(n21Var, yjeVar, (byte) 0);
            case 1:
                e21 e21Var = new e21(n21Var, yjeVar, (byte) 1);
                e21Var.j = ((Boolean) obj).booleanValue();
                return e21Var;
            case 2:
                e21 e21Var2 = new e21(n21Var, yjeVar, (byte) 2);
                e21Var2.j = ((Boolean) obj).booleanValue();
                return e21Var2;
            case 3:
                return new e21(n21Var, yjeVar, (byte) 3);
            default:
                return new e21(n21Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((e21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((e21) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((e21) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((e21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((e21) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objZ;
        Object value;
        Object value2;
        byte b = this.i;
        n21 n21Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    boolean zA = n21Var.z.f15225a.a();
                    wdu wduVar = n21Var.t;
                    this.j = true;
                    objZ = wduVar.z(false, false, zA, 8, false, true, this);
                    if (objZ == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objZ = ((j0g0) obj).f15681a;
                }
                iun iunVar = iun.f15405a;
                e0g0 e0g0Var = j0g0.b;
                if (objZ instanceof g0g0) {
                    objZ = iunVar;
                }
                bo0 bo0Var = new bo0((List) objZ, (byte) 2);
                String str = n21.a0;
                n21Var.H(bo0Var);
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                String str2 = n21.a0;
                p7m0 p7m0Var = n21Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, q11.a((q11) value, 0L, null, null, null, null, null, null, null, null, false, z2, false, null, false, null, null, null, 536838143)));
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (!((q11) n21Var.D()).l && z3) {
                    n21Var.P();
                }
                p7m0 p7m0Var2 = n21Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, q11.a((q11) value2, 0L, null, null, null, null, null, null, null, null, z3, false, false, null, false, null, null, null, 536854527)));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    n21Var.E.l("my_aggregator");
                    s64 s64Var = n21Var.G;
                    y1p y1pVar = y1p.MAIN;
                    s64Var.c("my_aggregator");
                    ytt yttVar = n21Var.K;
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
                i1w0 i1w0VarC = n21Var.q.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                c8d c8dVar = new c8d(y7d.f42146a, n0w0.f22721a);
                ListIterator listIterator = cs0.h(copyOnWriteArrayListQ, c8dVar, c8dVar, i1w0VarC, copyOnWriteArrayListQ).listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC.a((oe50) pawVar.next());
                }
                break;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    n21Var.E.m("aggregator_gifts");
                    n21Var.G.d(y1p.AGGREGATOR_PROMO, n21Var.H.g());
                    ytt yttVar2 = n21Var.K;
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
                i1w0 i1w0VarC2 = n21Var.q.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0VarC2);
                c8d c8dVar2 = new c8d(y7d.f42146a, o0w0.f24450a);
                ListIterator listIterator2 = cs0.h(copyOnWriteArrayListQ2, c8dVar2, c8dVar2, i1w0VarC2, copyOnWriteArrayListQ2).listIterator(0);
                while (true) {
                    paw pawVar2 = (paw) listIterator2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0VarC2.a((oe50) pawVar2.next());
                }
                break;
        }
    }
}
