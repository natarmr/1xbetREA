package a;

import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uze extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wze k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uze(wze wzeVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wzeVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        wze wzeVar = this.k;
        switch (b) {
            case 0:
                uze uzeVar = new uze(wzeVar, yjeVar, (byte) 0);
                uzeVar.j = obj;
                return uzeVar;
            case 1:
                uze uzeVar2 = new uze(wzeVar, yjeVar, (byte) 1);
                uzeVar2.j = obj;
                return uzeVar2;
            case 2:
                uze uzeVar3 = new uze(wzeVar, yjeVar, (byte) 2);
                uzeVar3.j = obj;
                return uzeVar3;
            case 3:
                uze uzeVar4 = new uze(wzeVar, yjeVar, (byte) 3);
                uzeVar4.j = obj;
                return uzeVar4;
            default:
                uze uzeVar5 = new uze(wzeVar, yjeVar, (byte) 4);
                uzeVar5.j = obj;
                return uzeVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((uze) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((uze) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((uze) create((lit0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((uze) create((q4f) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((uze) create((en7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        sc7 sc7Var;
        l0d l0dVar;
        Object value3;
        Object value4;
        Object value5;
        byte b = this.i;
        wze wzeVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                Pair pair = (Pair) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                String str = (String) pair.f46059a;
                d680 d680Var = (d680) pair.b;
                tqc tqcVar = wzeVar.b;
                jtj jtjVar = wzeVar.c;
                ppt pptVar = wzeVar.w;
                hsj hsjVar = wzeVar.e;
                p7m0 p7m0Var = wzeVar.A;
                boolean zW = wzeVar.w();
                boolean zK = wzeVar.d.k();
                boolean zB = wzeVar.B(d680Var.f5540a);
                p7m0 p7m0Var2 = wzeVar.E;
                if (zB) {
                    double d = ((sc7) p7m0Var.getValue()).b;
                    Double d2 = ((sc7) p7m0Var.getValue()).l;
                    double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
                    p7m0 p7m0Var3 = p7m0Var;
                    double dI = hsjVar.i();
                    vzc vzcVarT = pptVar.f27385a.t();
                    l0d l0dVarG = jtjVar.g(d, zK);
                    double d3 = d680Var.f5540a;
                    boolean zB2 = wzeVar.B(d3);
                    if (((ave) tqcVar.f34374a.c).h) {
                        l0dVar = l0d.e;
                    } else if (zK || !zB2 || dDoubleValue == 0.0d) {
                        l0dVar = l0d.f19195a;
                    } else if (d3 > dDoubleValue) {
                        l0dVar = l0d.b;
                    } else {
                        l0dVar = d3 < dDoubleValue ? l0d.c : l0d.f19195a;
                    }
                    l0d l0dVar2 = l0dVar;
                    while (true) {
                        Object value6 = p7m0Var3.getValue();
                        p7m0 p7m0Var4 = p7m0Var3;
                        l0d l0dVar3 = l0dVarG;
                        sc7 sc7Var2 = (sc7) value6;
                        String str2 = sc7Var2.c;
                        String str3 = sc7Var2.m;
                        Double dValueOf = zB2 ? Double.valueOf(d3) : yjeVar;
                        String str4 = zB2 ? d680Var.b : null;
                        double d4 = d3;
                        vzc vzcVar = vzcVarT;
                        d680 d680Var2 = d680Var;
                        p7m0 p7m0Var5 = p7m0Var2;
                        double d5 = dI;
                        if (p7m0Var4.m(value6, sc7.a(sc7Var2, 0L, dI, str, str2, l0dVar3, ((Boolean) p7m0Var2.getValue()).booleanValue(), true, vzcVar, false, false, str3, dValueOf, str4, l0dVar2, 16897))) {
                            p7m0Var5.o(null, Boolean.TRUE);
                        } else {
                            l0dVarG = l0dVar3;
                            dI = d5;
                            vzcVarT = vzcVar;
                            d3 = d4;
                            p7m0Var2 = p7m0Var5;
                            p7m0Var3 = p7m0Var4;
                            yjeVar = null;
                            d680Var = d680Var2;
                        }
                    }
                } else {
                    double d6 = ((sc7) p7m0Var.getValue()).b;
                    vzc vzcVar2 = ((sc7) p7m0Var.getValue()).h;
                    double dI2 = hsjVar.i();
                    vzc vzcVarT2 = pptVar.f27385a.t();
                    l0d l0dVarG2 = jtjVar.g(d6, zK);
                    boolean zContains = q3d.j(l0d.d, l0d.f19195a, l0d.e).contains(l0dVarG2);
                    if (zW) {
                        if ((d6 == dI2 && vzcVar2 == vzcVarT2) || zContains) {
                            do {
                                value2 = p7m0Var.getValue();
                                sc7Var = (sc7) value2;
                            } while (!p7m0Var.m(value2, sc7.a(sc7Var, 0L, dI2, str, sc7Var.c, ((ave) tqcVar.f34374a.c).h ? l0d.e : l0d.f19195a, ((Boolean) p7m0Var2.getValue()).booleanValue(), true, vzcVarT2, false, false, null, null, null, l0d.f19195a, 16897)));
                        } else {
                            while (true) {
                                Object value7 = p7m0Var.getValue();
                                l0d l0dVar4 = l0dVarG2;
                                sc7 sc7Var3 = (sc7) value7;
                                double d7 = dI2;
                                if (!p7m0Var.m(value7, sc7.a(sc7Var3, 0L, d7, str, sc7Var3.c, l0dVar4, ((Boolean) p7m0Var2.getValue()).booleanValue(), true, vzcVarT2, false, false, null, null, null, l0d.f19195a, 16897))) {
                                    dI2 = d7;
                                    l0dVarG2 = l0dVar4;
                                }
                            }
                        }
                        Boolean bool = Boolean.TRUE;
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, bool);
                    } else {
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, sc7.a((sc7) value, 0L, 0.0d, "", null, l0d.d, false, false, vzcVarT2, false, false, null, null, null, l0d.f19195a, 16905)));
                    }
                }
                return Unit.f46060a;
            case 1:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z = sw00Var.f32897a;
                wze wzeVar2 = this.k;
                p7m0 p7m0Var6 = wzeVar2.C;
                if (z) {
                    String strZ = wzeVar2.z();
                    p7m0 p7m0Var7 = wzeVar2.B;
                    do {
                        value3 = p7m0Var7.getValue();
                    } while (!p7m0Var7.m(value3, im7.a((im7) value3, strZ, false, false, null, 14)));
                    sac.T(new fnq(wzeVar2.D, new jtb(wzeVar2, yjeVar, (byte) 27), (byte) 4), d5c.S(jiu0.a(wzeVar2), wzeVar2.o.b), new d7e(2, wzeVar2, wze.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 15));
                    mze mzeVar = new mze(1.0f);
                    p7m0Var6.getClass();
                    p7m0Var6.o(null, mzeVar);
                } else {
                    p7m0Var6.getClass();
                    p7m0Var6.o(null, lze.f20901a);
                }
                return Unit.f46060a;
            case 2:
                lit0 lit0Var = (lit0) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(lit0Var, jit0.f16593a)) {
                    bby bbyVar = wzeVar.K;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    p7m0 p7m0Var8 = wzeVar.A;
                    do {
                        value4 = p7m0Var8.getValue();
                    } while (!p7m0Var8.m(value4, sc7.a((sc7) value4, 0L, 0.0d, null, null, null, false, false, null, false, false, null, null, null, null, 32511)));
                    p7m0 p7m0Var9 = wzeVar.B;
                    do {
                        value5 = p7m0Var9.getValue();
                    } while (!p7m0Var9.m(value5, im7.a((im7) value5, null, false, false, null, 11)));
                } else {
                    if (!Intrinsics.d(lit0Var, kit0.f18353a)) {
                        t9f.b();
                        return null;
                    }
                    bby bbyVar2 = wzeVar.K;
                    if (bbyVar2 != null) {
                        bbyVar2.cancel(null);
                    }
                    wzeVar.K = sac.f0(jiu0.a(wzeVar), 500L, TimeUnit.MILLISECONDS, wzeVar.o.f22085a, vze.f38294a, new oze(wzeVar, yjeVar, (byte) 2), 32);
                }
                return Unit.f46060a;
            case 3:
                q4f q4fVar = (q4f) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var10 = wzeVar.E;
                Boolean bool2 = Boolean.FALSE;
                p7m0Var10.getClass();
                p7m0Var10.o(null, bool2);
                wzeVar.D.f(q4fVar);
                return Unit.f46060a;
            default:
                en7 en7Var = (en7) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var11 = wzeVar.E;
                Boolean bool3 = Boolean.FALSE;
                p7m0Var11.getClass();
                p7m0Var11.o(null, bool3);
                wzeVar.C(en7Var, false);
                return Unit.f46060a;
        }
    }
}
