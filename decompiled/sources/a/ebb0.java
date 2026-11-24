package a;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ebb0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ sbb0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ebb0(sbb0 sbb0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = sbb0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        sbb0 sbb0Var = this.k;
        switch (b) {
            case 0:
                ebb0 ebb0Var = new ebb0(sbb0Var, yjeVar, (byte) 0);
                ebb0Var.j = obj;
                return ebb0Var;
            case 1:
                ebb0 ebb0Var2 = new ebb0(sbb0Var, yjeVar, (byte) 1);
                ebb0Var2.j = obj;
                return ebb0Var2;
            case 2:
                ebb0 ebb0Var3 = new ebb0(sbb0Var, yjeVar, (byte) 2);
                ebb0Var3.j = obj;
                return ebb0Var3;
            case 3:
                ebb0 ebb0Var4 = new ebb0(sbb0Var, yjeVar, (byte) 3);
                ebb0Var4.j = obj;
                return ebb0Var4;
            case 4:
                ebb0 ebb0Var5 = new ebb0(sbb0Var, yjeVar, (byte) 4);
                ebb0Var5.j = obj;
                return ebb0Var5;
            case 5:
                ebb0 ebb0Var6 = new ebb0(sbb0Var, yjeVar, (byte) 5);
                ebb0Var6.j = obj;
                return ebb0Var6;
            case 6:
                ebb0 ebb0Var7 = new ebb0(sbb0Var, yjeVar, (byte) 6);
                ebb0Var7.j = obj;
                return ebb0Var7;
            case 7:
                ebb0 ebb0Var8 = new ebb0(sbb0Var, yjeVar, (byte) 7);
                ebb0Var8.j = obj;
                return ebb0Var8;
            default:
                ebb0 ebb0Var9 = new ebb0(sbb0Var, yjeVar, (byte) 8);
                ebb0Var9.j = obj;
                return ebb0Var9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ebb0) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ebb0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ebb0) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ebb0) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ebb0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ebb0) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ebb0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((ebb0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ebb0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        n7b0 n7b0Var;
        ArrayList arrayList;
        String string;
        Object value6;
        byte b = this.i;
        yje yjeVar = null;
        byte b2 = 1;
        sbb0 sbb0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (((sw00) obj2).f32897a) {
                    sac.V(jiu0.a(sbb0Var), dbb0.f5795a, null, sbb0Var.q.b, new mab0(sbb0Var, yjeVar, b2), 10);
                } else {
                    e3c.n(sbb0Var.x0);
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                sbb0Var.l.b((Throwable) obj2, new j3b0((byte) 7));
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean z = ((sw00) obj2).f32897a;
                sje sjeVar = sbb0Var.o0;
                c4m0 c4m0Var = sbb0Var.v0;
                if (z) {
                    e3c.n(c4m0Var);
                    d5c.G(sjeVar, null);
                } else if (c4m0Var == null || !c4m0Var.isActive()) {
                    sbb0Var.v0 = slb.U(bkb.h0(1L, TimeUnit.SECONDS, new xab0(sbb0Var, yjeVar, b2)), sjeVar);
                }
                break;
            case 3:
                ql5 ql5Var = (ql5) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = sbb0Var.B0;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, r9b0.a((r9b0) value, false, null, ql5Var, false, 3967)));
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (((Throwable) obj2) instanceof j7t0) {
                    p7m0 p7m0Var2 = sbb0Var.B0;
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, r9b0.a((r9b0) value2, false, null, null, false, 3839)));
                }
                break;
            case 5:
                sw00 sw00Var = (sw00) obj2;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var3 = sbb0Var.B0;
                do {
                    value3 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value3, r9b0.a((r9b0) value3, false, null, null, sw00Var.f32897a, 3839)));
                break;
            case 6:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var4 = sbb0Var.B0;
                do {
                    value4 = p7m0Var4.getValue();
                    uaq0.f35345a.getClass();
                } while (!p7m0Var4.m(value4, r9b0.a((r9b0) value4, s9m0.l(uaq0Var), null, null, false, 4094)));
                break;
            case 7:
                List<ril0> list = (List) obj2;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var5 = sbb0Var.D0;
                do {
                    value5 = p7m0Var5.getValue();
                    n7b0Var = (n7b0) value5;
                    arrayList = new ArrayList(r3d.q(list, 10));
                    for (ril0 ril0Var : list) {
                        ril0Var.getClass();
                        long j = ril0Var.f30549a;
                        String str = ril0Var.b;
                        if (j != 0) {
                            bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                            rz4.s(j, ".svg", bzuVarD);
                            string = ((StringBuilder) bzuVarD.b).toString();
                        } else {
                            string = "";
                        }
                        arrayList.add(new kql0(new vql0(j, str, new n0x(string))));
                    }
                } while (!p7m0Var5.m(value5, n7b0.a(n7b0Var, new z8l0(arrayList, list), null, null, null, 14)));
                break;
            default:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                p7m0 p7m0Var6 = sbb0Var.D0;
                do {
                    value6 = p7m0Var6.getValue();
                } while (!p7m0Var6.m(value6, n7b0.a((n7b0) value6, x8l0.f40468a, null, null, null, 14)));
                break;
        }
        return Unit.f46060a;
    }
}
