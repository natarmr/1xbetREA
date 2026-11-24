package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class z240 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ j340 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z240(j340 j340Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = j340Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        j340 j340Var = this.k;
        switch (b) {
            case 0:
                return new z240(j340Var, yjeVar, (byte) 0);
            case 1:
                return new z240(j340Var, yjeVar, (byte) 1);
            case 2:
                return new z240(j340Var, yjeVar, (byte) 2);
            case 3:
                return new z240(j340Var, yjeVar, (byte) 3);
            case 4:
                return new z240(j340Var, yjeVar, (byte) 4);
            default:
                return new z240(j340Var, yjeVar, (byte) 5);
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
            case 4:
                break;
        }
        return ((z240) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objV;
        Object objB;
        Object value;
        Object objA;
        byte b = this.i;
        j340 j340Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    u8u u8uVar = j340Var.B0;
                    this.j = true;
                    objV = u8uVar.v(this);
                    if (objV == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objV = obj;
                }
                j340Var.q.d(new bw20((Object) j340Var, objV, (byte) 19));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ahu ahuVar = j340Var.D;
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
                ot otVar = j340Var.t;
                bm5 bm5Var = bm5.g;
                otVar.a(bm5Var, ql5Var);
                jyg0 jyg0Var = j340Var.u;
                long j = ql5Var.f28916a;
                jyg0Var.getClass();
                jyg0Var.f17359a.z(bm5Var, j);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    if (((m4i0) ((o470) j340Var.P.f42558a).f24619a).f21172a == r040.AGGREGATOR) {
                        ytt yttVar = j340Var.y;
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
                i1w0 i1w0Var = j340Var.q;
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
                    int i = j340.i1;
                    p7m0 p7m0Var = j340Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, d140.a((d140) value, false, false, false, null, null, null, null, null, null, true, false, null, false, null, null, null, null, null, null, 1073739775)));
                    if (((m4i0) ((o470) j340Var.P.f42558a).f24619a).f21172a == r040.AGGREGATOR) {
                        ytt yttVar2 = j340Var.y;
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
                i1w0 i1w0Var2 = j340Var.q;
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
                    this.j = true;
                    int i2 = j340.i1;
                    if (j340Var.W(this) == wneVar5) {
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
                    rou rouVar = j340Var.C;
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
                    int i3 = j340.i1;
                    j340Var.G(z040.f43547a);
                }
                return Unit.f46060a;
        }
    }
}
