package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class b730 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ f730 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b730(f730 f730Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = f730Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f730 f730Var = this.k;
        switch (b) {
            case 0:
                return new b730(f730Var, yjeVar, (byte) 0);
            case 1:
                return new b730(f730Var, yjeVar, (byte) 1);
            case 2:
                return new b730(f730Var, yjeVar, (byte) 2);
            default:
                return new b730(f730Var, yjeVar, (byte) 3);
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
        }
        return ((b730) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.i;
        int i = 2;
        f730 f730Var = this.k;
        byte b2 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    q430 q430Var = f730Var.c.f21960a;
                    m430 m430Var = new m430(wwb.C(q430Var.f28079a.a().f34491a, new String[]{"market_filter"}, new sax(i, yjeVar, (byte) 28)), q430Var, (byte) 0);
                    xvf xvfVar = f730Var.b;
                    a1g a1gVarF0 = dub.f0(m430Var, new lsa(aoq.c(i120.W(new i89(xvfVar.b.a(), (byte) 12)), new zo1(yjeVar, (Object) xvfVar, (byte) 11)), (byte) 3), f730Var.o, new fl9(f730Var, yjeVar, (byte) 8));
                    xr10 xr10Var = new xr10((Object) f730Var, yjeVar, (byte) 13);
                    this.j = true;
                    Object objC = a1gVarF0.c(new vnq(h660.f12515a, xr10Var, (byte) 2), this);
                    if (objC != wneVar) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                Object obj2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    ArrayList arrayList = f730Var.n;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        if (obj3 instanceof hw20) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList<hw20> arrayList3 = new ArrayList();
                    for (Object obj4 : arrayList2) {
                        if (((hw20) obj4).c == dw20.f6775a) {
                            arrayList3.add(obj4);
                        }
                    }
                    ArrayList<wt20> arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                    for (hw20 hw20Var : arrayList3) {
                        hw20Var.getClass();
                        arrayList4.add(new wt20(hw20Var.e, hw20Var.b, hw20Var.f13751a, hw20Var.c == dw20.b));
                    }
                    mku mkuVar = f730Var.f;
                    this.j = true;
                    eio eioVar = mkuVar.f21960a.f28079a;
                    ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                    for (wt20 wt20Var : arrayList4) {
                        wt20Var.getClass();
                        arrayList5.add(new ut20(wt20Var.c, wt20Var.f39719a, wt20Var.d));
                    }
                    tt20 tt20VarA = eioVar.a();
                    Object objW0 = sj3.w0(this, tt20VarA.f34491a, new v620((Object) tt20VarA, (Object) arrayList5, yjeVar, (byte) 27), false, true);
                    Object obj5 = wne.f39444a;
                    if (objW0 != obj5) {
                        objW0 = Unit.f46060a;
                    }
                    if (objW0 != obj5) {
                        objW0 = Unit.f46060a;
                    }
                    if (objW0 != obj5) {
                        objW0 = Unit.f46060a;
                    }
                    if (objW0 != obj5) {
                        objW0 = Unit.f46060a;
                    }
                    if (objW0 == obj2) {
                        return obj2;
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
                Object obj6 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    nqc nqcVar = f730Var.d;
                    this.j = true;
                    Object objW1 = sj3.w0(this, nqcVar.f23952a.f28079a.a().f34491a, new sax(i, yjeVar, (byte) 29), false, true);
                    if (objW1 != obj6) {
                        objW1 = Unit.f46060a;
                    }
                    if (objW1 != obj6) {
                        objW1 = Unit.f46060a;
                    }
                    if (objW1 != obj6) {
                        objW1 = Unit.f46060a;
                    }
                    if (objW1 != obj6) {
                        objW1 = Unit.f46060a;
                    }
                    if (objW1 == obj6) {
                        return obj6;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                Object obj7 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    nqc nqcVar2 = f730Var.h;
                    this.j = true;
                    Object objW2 = sj3.w0(this, nqcVar2.f23952a.f28079a.a().f34491a, new st20(i, yjeVar, b2), false, true);
                    if (objW2 != obj7) {
                        objW2 = Unit.f46060a;
                    }
                    if (objW2 != obj7) {
                        objW2 = Unit.f46060a;
                    }
                    if (objW2 != obj7) {
                        objW2 = Unit.f46060a;
                    }
                    if (objW2 != obj7) {
                        objW2 = Unit.f46060a;
                    }
                    if (objW2 == obj7) {
                        return obj7;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
