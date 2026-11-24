package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class b91 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ n91 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b91(n91 n91Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = n91Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        n91 n91Var = this.k;
        switch (b) {
            case 0:
                return new b91(n91Var, yjeVar, (byte) 0);
            case 1:
                return new b91(n91Var, yjeVar, (byte) 1);
            case 2:
                return new b91(n91Var, yjeVar, (byte) 2);
            case 3:
                return new b91(n91Var, yjeVar, (byte) 3);
            default:
                return new b91(n91Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((b91) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objG;
        byte b = this.i;
        n0w0 n0w0Var = n0w0.f22721a;
        n91 n91Var = this.k;
        yje yjeVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = n91.f0;
                    e3c.n(n91Var.X);
                    n91Var.X = sac.f0(jiu0.a(n91Var), 2000L, TimeUnit.MILLISECONDS, null, k91.f17895a, new j91(n91Var, yjeVar, b2), 36);
                    hcp0 hcp0Var = n91Var.s;
                    this.j = true;
                    if (hcp0Var.q(this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                e3c.n(n91Var.X);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ytt yttVar = n91Var.W;
                    aue0 aue0Var = aue0.d;
                    this.j = true;
                    if (yttVar.a(aue0Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0Var = n91Var.r;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                c8d c8dVar = new c8d(y7d.f42146a, n0w0Var);
                ListIterator listIterator = cs0.h(copyOnWriteArrayListQ, c8dVar, c8dVar, i1w0Var, copyOnWriteArrayListQ).listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    ytt yttVar2 = n91Var.W;
                    aue0 aue0Var2 = aue0.d;
                    this.j = true;
                    if (yttVar2.a(aue0Var2, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0Var2 = n91Var.r;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                c8d c8dVar2 = new c8d(y7d.f42146a, n0w0Var);
                ListIterator listIterator2 = cs0.h(copyOnWriteArrayListQ2, c8dVar2, c8dVar2, i1w0Var2, copyOnWriteArrayListQ2).listIterator(0);
                while (true) {
                    paw pawVar2 = (paw) listIterator2;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    int i2 = n91.f0;
                    p7m0 p7m0Var = n91Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, u81.a((u81) value, null, false, true, false, null, null, 0L, false, false, null, false, false, true, 0, null, 2031599)));
                    khf0 khf0Var = n91Var.t;
                    bm5 bm5Var = bm5.e;
                    this.j = true;
                    objG = khf0.G(khf0Var, bm5Var, this);
                    if (objG == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objG = obj;
                }
                n91Var.M.a(n91Var.r, true, ((ql5) objG).f28916a);
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    ytt yttVar3 = n91Var.W;
                    aue0 aue0Var3 = aue0.d;
                    this.j = true;
                    if (yttVar3.a(aue0Var3, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                i1w0 i1w0Var3 = n91Var.r;
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var3);
                c8d c8dVar3 = new c8d(y7d.f42146a, o0w0.f24450a);
                ListIterator listIterator3 = cs0.h(copyOnWriteArrayListQ3, c8dVar3, c8dVar3, i1w0Var3, copyOnWriteArrayListQ3).listIterator(0);
                while (true) {
                    paw pawVar3 = (paw) listIterator3;
                    if (!pawVar3.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var3.a((oe50) pawVar3.next());
                }
                break;
        }
    }
}
