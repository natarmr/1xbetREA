package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vg0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ eh0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg0(eh0 eh0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = eh0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        eh0 eh0Var = this.k;
        switch (b) {
            case 0:
                return new vg0(eh0Var, yjeVar, (byte) 0);
            case 1:
                return new vg0(eh0Var, yjeVar, (byte) 1);
            case 2:
                vg0 vg0Var = new vg0(eh0Var, yjeVar, (byte) 2);
                vg0Var.j = ((Boolean) obj).booleanValue();
                return vg0Var;
            case 3:
                vg0 vg0Var2 = new vg0(eh0Var, yjeVar, (byte) 3);
                vg0Var2.j = ((Boolean) obj).booleanValue();
                return vg0Var2;
            case 4:
                vg0 vg0Var3 = new vg0(eh0Var, yjeVar, (byte) 4);
                vg0Var3.j = ((Boolean) obj).booleanValue();
                return vg0Var3;
            case 5:
                return new vg0(eh0Var, yjeVar, (byte) 5);
            case 6:
                return new vg0(eh0Var, yjeVar, (byte) 6);
            case 7:
                return new vg0(eh0Var, yjeVar, (byte) 7);
            default:
                return new vg0(eh0Var, yjeVar, (byte) 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((vg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((vg0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((vg0) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((vg0) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((vg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((vg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((vg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((vg0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objX;
        Object value;
        Object value2;
        byte b = this.i;
        byte b2 = 6;
        eh0 eh0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    lr lrVar = eh0Var.F.a().O0 ? new lr(eh0Var.K.b(mvc.CMS_CODE_DEALS_CASINO), (byte) 5) : new lr(eh0Var.O.a(nw80.t.getId()), (byte) 6);
                    this.j = true;
                    objX = ntb.X(lrVar, this);
                    if (objX == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objX = obj;
                }
                List list = (List) objX;
                String str = eh0.e0;
                p7m0 p7m0Var = eh0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, hg0.a((hg0) value, null, list, null, null, null, false, false, false, false, false, false, null, null, 261117)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    swt swtVar = eh0Var.L;
                    lhf0 lhf0Var = swtVar.b;
                    dnq dnqVarJ = u1c.J(uvw.Q(new a1t(ulb.L(new rf0(new fnq(new vsg0(new lv(lhf0Var, swtVar.f32940a.f15748a.a(), (yje) null, (byte) 1)), sf0.h, (byte) 4), (byte) 0), ((mne) lhf0Var.d).b), (byte) 5), true));
                    l80 l80Var = new l80(eh0Var, b2);
                    this.j = true;
                    if (dnqVarJ.c(l80Var, this) == wneVar2) {
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
                String str2 = eh0.e0;
                p7m0 p7m0Var2 = eh0Var.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    value3.getClass();
                    boolean z4 = z3;
                    if (p7m0Var2.m(value3, hg0.a((hg0) value3, null, null, null, null, null, false, z4, false, false, false, false, null, null, 261631))) {
                        eh0Var.M();
                        return Unit.f46060a;
                    }
                    z3 = z4;
                }
                break;
            case 3:
                boolean z5 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                String str3 = eh0.e0;
                p7m0 p7m0Var3 = eh0Var.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                } while (!p7m0Var3.m(value2, hg0.a((hg0) value2, null, null, null, null, null, z5, false, false, false, false, false, null, null, 262015)));
                return Unit.f46060a;
            case 4:
                boolean z6 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (z6) {
                    String str4 = eh0.e0;
                    eh0Var.M();
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    kb0 kb0Var = eh0Var.x;
                    cb0 cb0Var = new cb0(eh0.e0, "aggregator_category");
                    this.j = true;
                    kb0Var.getClass();
                    if (kb0Var.o(cb0Var, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    kb0 kb0Var2 = eh0Var.x;
                    db0 db0Var = new db0(eh0.e0, k7k.AggregatorCategory, eh0Var.C.g());
                    this.j = true;
                    kb0Var2.getClass();
                    if (kb0Var2.o(db0Var, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    ytt yttVar = eh0Var.G;
                    aue0 aue0Var = aue0.d;
                    this.j = true;
                    if (yttVar.a(aue0Var, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0VarC = eh0Var.p.c();
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
                wne wneVar9 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    ytt yttVar2 = eh0Var.G;
                    aue0 aue0Var2 = aue0.d;
                    this.j = true;
                    if (yttVar2.a(aue0Var2, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0VarC2 = eh0Var.p.c();
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
