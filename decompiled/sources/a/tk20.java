package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class tk20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ln20 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tk20(ln20 ln20Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ln20Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ln20 ln20Var = this.k;
        switch (b) {
            case 0:
                return new tk20(ln20Var, yjeVar, (byte) 0);
            case 1:
                return new tk20(ln20Var, yjeVar, (byte) 1);
            case 2:
                tk20 tk20Var = new tk20(ln20Var, yjeVar, (byte) 2);
                tk20Var.j = ((Boolean) obj).booleanValue();
                return tk20Var;
            case 3:
                tk20 tk20Var2 = new tk20(ln20Var, yjeVar, (byte) 3);
                tk20Var2.j = ((Boolean) obj).booleanValue();
                return tk20Var2;
            default:
                tk20 tk20Var3 = new tk20(ln20Var, yjeVar, (byte) 4);
                tk20Var3.j = ((Boolean) obj).booleanValue();
                return tk20Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((tk20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((tk20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((tk20) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((tk20) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((tk20) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        sg20 sg20Var;
        Object value2;
        sg20 sg20Var2;
        ifc0 ifc0Var;
        Object value3;
        byte b = this.i;
        byte b2 = 1;
        yje yjeVar = null;
        ln20 ln20Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = ln20.o0;
                    ln20 ln20Var2 = this.k;
                    bby bbyVar = ln20Var2.m0;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    ln20Var2.m0 = sac.f0(jiu0.a(ln20Var2), 500L, TimeUnit.MILLISECONDS, ln20Var2.E.f22085a, um20.f35901a, new nm20(ln20Var2, yjeVar, b2), 32);
                    double d = ((sg20) ln20Var2.D()).e.f29389a.b.f36378a;
                    double d2 = ((sg20) ln20Var2.D()).e.d.f5262a;
                    String str = ((sg20) ln20Var2.D()).e.f29389a.b.e;
                    p0z p0zVar = new p0z((Object) ln20Var2, (byte) 7);
                    this.j = true;
                    if (ln20Var2.N(d, d2, str, p0zVar, this) == wneVar) {
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
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    mrt mrtVar = ln20Var.v;
                    this.j = true;
                    objA = mrtVar.a(this);
                    if (objA == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                boolean zBooleanValue = ((Boolean) objA).booleanValue();
                int i2 = ln20.o0;
                p7m0 p7m0Var = ln20Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    sg20Var = (sg20) value;
                } while (!p7m0Var.m(value, sg20.a(sg20Var, null, null, null, null, ifc0.a(sg20Var.f, null, null, zBooleanValue, false, false, false, 119), false, false, false, 0, 2015)));
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ky6 ky6Var = ((sg20) ln20Var.D()).b;
                bzc bzcVarO = ln20.O(((sg20) ln20Var.D()).b.b.f, ((sg20) ln20Var.D()).b.b.e);
                String str2 = (String) ((sg20) ln20Var.D()).f.f14680a.f1710a.getValue();
                if (str2 == null) {
                    str2 = "";
                }
                ln20Var.H(new q2n(z3, (Object) str2, (Object) bzcVarO, (byte) 10));
                return Unit.f46060a;
            case 3:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (z4) {
                    int i3 = ln20.o0;
                    p7m0 p7m0Var2 = ln20Var.i.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                        sg20Var2 = (sg20) value2;
                        ifc0Var = sg20Var2.f;
                        wyc0 wyc0Var = wyc0.f39969a;
                    } while (!p7m0Var2.m(value2, sg20.a(sg20Var2, null, null, null, null, ifc0.a(ifc0Var, null, null, false, false, false, false, 125), false, false, false, 0, 2015)));
                    sac.V(jiu0.a(ln20Var), new mh20(ln20Var, (byte) 2), null, ln20Var.E.b, new e3p(ln20Var, yjeVar, (byte) 17), 10);
                }
                obg obgVar = new obg((byte) 22, z4);
                int i4 = ln20.o0;
                ln20Var.H(obgVar);
                return Unit.f46060a;
            default:
                boolean z5 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                int i5 = ln20.o0;
                p7m0 p7m0Var3 = ln20Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, sg20.a((sg20) value3, null, null, null, null, null, z5, false, false, 0, 1919)));
                if (z5) {
                    ln20Var.c0();
                }
                ln20Var.H(new eh20(ln20Var, (byte) 5));
                return Unit.f46060a;
        }
    }
}
