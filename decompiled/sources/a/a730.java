package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class a730 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ e730 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a730(e730 e730Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = e730Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        e730 e730Var = this.k;
        switch (b) {
            case 0:
                return new a730(e730Var, yjeVar, (byte) 0);
            case 1:
                return new a730(e730Var, yjeVar, (byte) 1);
            case 2:
                return new a730(e730Var, yjeVar, (byte) 2);
            default:
                return new a730(e730Var, yjeVar, (byte) 3);
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
        return ((a730) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.i;
        int i = 2;
        e730 e730Var = this.k;
        byte b2 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ewt ewtVarA = e730Var.c.a();
                    jtj jtjVar = e730Var.b;
                    a1g a1gVarF0 = dub.f0(ewtVarA, aoq.c(((r1u) jtjVar.b).a(), new sot(yjeVar, jtjVar, b2)), e730Var.q, new fl9(e730Var, yjeVar, (byte) 7));
                    xr10 xr10Var = new xr10((Object) e730Var, yjeVar, (byte) 12);
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
                    ArrayList arrayList = e730Var.p;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        if (obj3 instanceof gw20) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList<gw20> arrayList3 = new ArrayList();
                    for (Object obj4 : arrayList2) {
                        if (((gw20) obj4).c == cw20.f5060a) {
                            arrayList3.add(obj4);
                        }
                    }
                    ArrayList<vt20> arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                    for (gw20 gw20Var : arrayList3) {
                        gw20Var.getClass();
                        arrayList4.add(new vt20(gw20Var.e, gw20Var.b, gw20Var.f12005a, gw20Var.c == cw20.b));
                    }
                    ani0 ani0Var = e730Var.f;
                    this.j = true;
                    he1 he1Var = ((p430) ani0Var.f1155a).f26331a;
                    ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
                    for (vt20 vt20Var : arrayList4) {
                        vt20Var.getClass();
                        arrayList5.add(new ut20(vt20Var.c, vt20Var.f37982a, vt20Var.d));
                    }
                    tt20 tt20VarA = he1Var.a();
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
                    mqc mqcVar = e730Var.d;
                    this.j = true;
                    Object objW1 = sj3.w0(this, mqcVar.f22218a.f26331a.a().f34491a, new sax(i, yjeVar, (byte) 29), false, true);
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
                    mqc mqcVar2 = e730Var.h;
                    this.j = true;
                    Object objW2 = sj3.w0(this, mqcVar2.f22218a.f26331a.a().f34491a, new st20(i, yjeVar, b2), false, true);
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
