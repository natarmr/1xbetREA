package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ug1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ mh1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug1(mh1 mh1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = mh1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        mh1 mh1Var = this.k;
        switch (b) {
            case 0:
                ug1 ug1Var = new ug1(mh1Var, yjeVar, (byte) 0);
                ug1Var.j = ((Boolean) obj).booleanValue();
                return ug1Var;
            case 1:
                ug1 ug1Var2 = new ug1(mh1Var, yjeVar, (byte) 1);
                ug1Var2.j = ((Boolean) obj).booleanValue();
                return ug1Var2;
            case 2:
                return new ug1(mh1Var, yjeVar, (byte) 2);
            case 3:
                return new ug1(mh1Var, yjeVar, (byte) 3);
            case 4:
                return new ug1(mh1Var, yjeVar, (byte) 4);
            case 5:
                return new ug1(mh1Var, yjeVar, (byte) 5);
            case 6:
                return new ug1(mh1Var, yjeVar, (byte) 6);
            case 7:
                return new ug1(mh1Var, yjeVar, (byte) 7);
            case 8:
                return new ug1(mh1Var, yjeVar, (byte) 8);
            default:
                return new ug1(mh1Var, yjeVar, (byte) 9);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ug1) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((ug1) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ug1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ug1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ug1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ug1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ug1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((ug1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((ug1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ug1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objG;
        Object value2;
        byte b = this.i;
        mh1 mh1Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                String str = mh1.E0;
                p7m0 p7m0Var = mh1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, pf1.a((pf1) value, null, 0, 0, z, 0L, null, false, null, null, null, null, null, null, false, null, false, -262145, 15)));
                mh1Var.O();
                return Unit.f46060a;
            case 1:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!((pf1) mh1Var.D()).G && z2) {
                    mh1Var.O();
                }
                p7m0 p7m0Var2 = mh1Var.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    value3.getClass();
                    boolean z3 = z2;
                    if (p7m0Var2.m(value3, pf1.a((pf1) value3, null, 0, 0, false, 0L, null, false, null, null, null, null, null, null, false, null, z3, -1, 13))) {
                        return Unit.f46060a;
                    }
                    z2 = z3;
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    kb0 kb0Var = mh1Var.J;
                    cb0 cb0Var = new cb0(mh1.E0, "aggregator_promo");
                    this.j = true;
                    kb0Var.getClass();
                    if (kb0Var.o(cb0Var, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    kb0 kb0Var2 = mh1Var.J;
                    db0 db0Var = new db0(mh1.E0, k7k.AggregatorPromo, mh1Var.e0.g());
                    this.j = true;
                    kb0Var2.getClass();
                    if (kb0Var2.o(db0Var, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    mh1Var.A.d("aggregator_promo");
                    mh1Var.B.l(y1p.AGGREGATOR_PROMO);
                    ytt yttVar = mh1Var.O;
                    aue0 aue0Var = aue0.d;
                    this.j = true;
                    if (yttVar.a(aue0Var, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                mh1Var.Y.c().d(new og1(mh1Var, (byte) 13));
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    ytt yttVar2 = mh1Var.O;
                    aue0 aue0Var2 = aue0.d;
                    this.j = true;
                    if (yttVar2.a(aue0Var2, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0VarC = mh1Var.Y.c();
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
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    ytt yttVar3 = mh1Var.O;
                    aue0 aue0Var3 = aue0.d;
                    this.j = true;
                    if (yttVar3.a(aue0Var3, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0VarC2 = mh1Var.Y.c();
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
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    khf0 khf0Var = mh1Var.t;
                    bm5 bm5Var = bm5.e;
                    this.j = true;
                    objG = khf0.G(khf0Var, bm5Var, this);
                    if (objG == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objG = obj;
                }
                ql5 ql5Var = (ql5) objG;
                mh1Var.u.l(bm5.e, ql5Var);
                mh1Var.N(ql5Var);
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(1000L, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                String str2 = mh1.E0;
                p7m0 p7m0Var3 = mh1Var.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, pf1.a((pf1) value2, null, 0, 0, false, 0L, null, false, ilc0.f14971a, null, null, null, null, null, false, null, false, -16777217, 15)));
                return Unit.f46060a;
            default:
                wne wneVar10 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    i89 i89VarA = mh1Var.v.a(bm5.e);
                    vg1 vg1Var = new vg1(mh1Var, null, (byte) 2);
                    this.j = true;
                    if (slb.O(i89VarA, vg1Var, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
