package a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wis0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39234a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wis0(Object obj, Object obj2, byte b) {
        this.f39234a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b;
        Drawable drawableQ;
        kr30 kr30VarA;
        dyw dywVar;
        float f;
        a4x a4xVar;
        byte b2 = this.f39234a;
        jm40 jm40Var = jm40.b;
        byte b3 = 2;
        byte b4 = 18;
        byte b5 = 16;
        cl5 cl5Var = ukd.f35823a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        boolean z = false;
        final byte b6 = 1;
        switch (b2) {
            case 0:
                bjs0 bjs0Var = (bjs0) obj5;
                zis0 zis0Var = (zis0) obj4;
                y5d y5dVar = (y5d) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                y2m0 y2m0Var = zis0.m2;
                y5dVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(y5dVar) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var2, 1.0f), gqw0.n);
                    zcl zclVar = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA, 0.0f, 28.0f, 0.0f, 8.0f, 5), rsm0.w(R.string.discipline, 0, fetVar), 0L, 0, 0L, fetVar, 0, 28);
                    String strW = rsm0.w(R.string.search, 0, fetVar);
                    mm40 mm40VarK = s5x0.K(jm40Var2, 16.0f, 8.0f);
                    boolean zI = fetVar.i(bjs0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new lcr0(bjs0Var, b5);
                        fetVar.o0(objP);
                    }
                    Function1 function1 = (Function1) objP;
                    boolean zI2 = fetVar.i(zis0Var);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new vis0(zis0Var, b6);
                        fetVar.o0(objP2);
                    }
                    aac.n(mm40VarK, false, null, null, strW, null, function1, null, (Function0) objP2, fetVar, 0, 174);
                    mbc.o(zfi0.f44303a, s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), false, fetVar, 6, 4);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                woh wohVar = (woh) obj5;
                a4x a4xVar2 = wohVar.c;
                lh80 lh80Var = (lh80) obj4;
                lr8 lr8Var = (lr8) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                lr8Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(lr8Var) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean zD = pkd.d(fetVar2);
                    k6z k6zVar = (k6z) fetVar2.k(bmd.n);
                    boolean zE = fetVar2.e(a4xVar2.size()) | fetVar2.d(lr8Var.d()) | fetVar2.e(k6zVar.ordinal()) | fetVar2.g(lh80Var);
                    Object objP3 = fetVar2.P();
                    Object objJ = objP3;
                    if (zE || objP3 == cl5Var) {
                        float fD = (lr8Var.d() - s5x0.B(lh80Var, k6zVar)) - s5x0.A(lh80Var, k6zVar);
                        if (zD) {
                            if (a4xVar2.size() == 1) {
                                zcl zclVar2 = qmk.f28987a;
                                fD = Math.min(400.0f, fD);
                            } else {
                                zcl zclVar3 = qmk.f28987a;
                                fD = Math.min(400.0f, fD * 0.6f);
                            }
                        } else if (a4xVar2.size() != 1) {
                            fD *= 0.8f;
                        }
                        objJ = twn.j(fD, fetVar2);
                    }
                    float f2 = ((ycl) objJ).f42389a;
                    a4x<o0x> a4xVar3 = wohVar.c;
                    Context context = (Context) fetVar2.k(dy2.b);
                    w6k w6kVar = (w6k) fetVar2.k(bmd.h);
                    boolean zG = fetVar2.g(a4xVar3);
                    Object objP4 = fetVar2.P();
                    if (zG || objP4 == cl5Var) {
                        ArrayList arrayList = new ArrayList();
                        gbe0 gbe0VarA = o5k0.a(context);
                        for (o0x o0xVar : a4xVar3) {
                            if (o0xVar != null) {
                                byte b7 = b6;
                                if (o0xVar instanceof m0x) {
                                    drawableQ = context.getDrawable(((m0x) o0xVar).f20977a);
                                } else if (o0xVar instanceof n0x) {
                                    List list = u0d.f34849a;
                                    String strB = u0d.b(((n0x) o0xVar).f22722a);
                                    jbe0 jbe0VarD = gbe0VarA.d();
                                    if (jbe0VarD == null || (kr30VarA = jbe0VarD.a(new jr30(strB))) == null || (dywVar = kr30VarA.f18747a) == null) {
                                        drawableQ = null;
                                    } else {
                                        Resources resources = context.getResources();
                                        resources.getClass();
                                        drawableQ = c3x.q(dywVar, resources);
                                    }
                                } else if (o0xVar instanceof l0x) {
                                    drawableQ = ((l0x) o0xVar).f19222a;
                                }
                                if (drawableQ != null) {
                                    arrayList.add(drawableQ);
                                }
                                b6 = b7;
                            }
                            t9f.b();
                            return null;
                        }
                        b = b6;
                        objP4 = arrayList.size() == a4xVar3.size() ? dyb.r0(arrayList) : lak0.c;
                        fetVar2.o0(objP4);
                    } else {
                        b = 1;
                    }
                    i4 i4Var = (i4) objP4;
                    boolean zG2 = fetVar2.g(a4xVar3);
                    Object objP5 = fetVar2.P();
                    Object obj6 = objP5;
                    if (zG2 || objP5 == cl5Var) {
                        pz40 pz40VarE = androidx.compose.runtime.e.e(i4Var);
                        fetVar2.o0(pz40VarE);
                        obj6 = pz40VarE;
                    }
                    pz40 pz40Var = (pz40) obj6;
                    boolean zG3 = fetVar2.g(a4xVar3);
                    Object objP6 = fetVar2.P();
                    Object obj7 = objP6;
                    if (zG3 || objP6 == cl5Var) {
                        pz40 pz40VarE2 = androidx.compose.runtime.e.e(Boolean.valueOf((a4xVar3.isEmpty() || i4Var.size() == a4xVar3.size()) ? 0 : b));
                        fetVar2.o0(pz40VarE2);
                        obj7 = pz40VarE2;
                    }
                    pz40 pz40Var2 = (pz40) obj7;
                    boolean zG4 = fetVar2.g(a4xVar3) | fetVar2.g(pz40Var2) | fetVar2.i(context) | fetVar2.g(w6kVar) | fetVar2.d(f2) | fetVar2.g(pz40Var);
                    Object objP7 = fetVar2.P();
                    if (zG4 || objP7 == cl5Var) {
                        f = f2;
                        w1t0 w1t0Var = new w1t0(a4xVar3, pz40Var2, context, w6kVar, f, pz40Var, null);
                        a4xVar = a4xVar3;
                        fetVar2.o0(w1t0Var);
                        objP7 = w1t0Var;
                    } else {
                        f = f2;
                        a4xVar = a4xVar3;
                    }
                    m0x0.t(fetVar2, a4xVar, (Function2) objP7);
                    boolean zG5 = fetVar2.g(pz40Var) | fetVar2.g(pz40Var2);
                    Object objP8 = fetVar2.P();
                    Object obj8 = objP8;
                    if (zG5 || objP8 == cl5Var) {
                        x1t0 x1t0Var = new x1t0(pz40Var, pz40Var2);
                        fetVar2.o0(x1t0Var);
                        obj8 = x1t0Var;
                    }
                    x1t0 x1t0Var2 = (x1t0) obj8;
                    if (((Boolean) x1t0Var2.b.getValue()).booleanValue()) {
                        fetVar2.e0(2099499523);
                        jtt0.d(6, fetVar2, o7k0.d(jm40Var, 1.0f));
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(2099588679);
                        jtm0.a(o7k0.d(jm40Var, 1.0f), wohVar, x1t0Var2.f40136a, f, lh80Var, fetVar2, 6);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                l7m0 l7m0Var = (l7m0) obj5;
                pwu0 pwu0Var = (pwu0) obj4;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                svs0 svs0Var = pwu0.q2;
                ((y5d) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String str = ((twu0) l7m0Var.getValue()).b;
                    String str2 = ((twu0) l7m0Var.getValue()).c;
                    boolean zI3 = fetVar3.i(pwu0Var);
                    Object objP9 = fetVar3.P();
                    if (zI3 || objP9 == cl5Var) {
                        objP9 = new nwu0(pwu0Var, b3);
                        fetVar3.o0(objP9);
                    }
                    Function0 function0 = (Function0) objP9;
                    boolean zI4 = fetVar3.i(pwu0Var);
                    Object objP10 = fetVar3.P();
                    if (zI4 || objP10 == cl5Var) {
                        objP10 = new nwu0(pwu0Var, (byte) 3);
                        fetVar3.o0(objP10);
                    }
                    knm0.e(null, str, str2, function0, (Function0) objP10, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                l7m0 l7m0Var2 = (l7m0) obj5;
                ywu0 ywu0Var = (ywu0) obj4;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                sxs0 sxs0Var = ywu0.s2;
                ((y5d) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    vxu0 vxu0Var = (vxu0) l7m0Var2.getValue();
                    boolean z2 = ((vxu0) l7m0Var2.getValue()).k;
                    k3t0 k3t0VarP0 = ywu0Var.P0();
                    boolean zI5 = fetVar4.i(k3t0VarP0);
                    Object objP11 = fetVar4.P();
                    if (zI5 || objP11 == cl5Var) {
                        objP11 = new las0(1, k3t0VarP0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                        fetVar4.o0(objP11);
                    }
                    iom0.e(null, vxu0Var, z2, (Function1) ((jhy) objP11), fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                imm immVar = (imm) obj5;
                ccv0 ccv0Var = (ccv0) obj4;
                mm40 mm40Var = (mm40) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                uxs0 uxs0Var = ccv0.Q1;
                mm40Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(mm40Var) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                    boolean zI6 = fetVar5.i(ccv0Var);
                    Object objP12 = fetVar5.P();
                    if (zI6 || objP12 == cl5Var) {
                        objP12 = new zbv0(ccv0Var, (byte) 5);
                        fetVar5.o0(objP12);
                    }
                    hlm.c(mm40VarD, immVar, null, (Function0) objP12, null, null, null, null, null, null, null, null, fetVar5, 0, 0, 4084);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            default:
                ifv0 ifv0Var = (ifv0) obj5;
                final i3t0 i3t0Var = (i3t0) obj4;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i = ffv0.k2;
                ((y5d) obj).getClass();
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    mm40 mm40VarA0 = wha0.a0(cjx.V(jm40Var, x0x.a0(fetVar6), null), wha0.T(fetVar6), false, 14);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar6, 0);
                    int iHashCode = Long.hashCode(fetVar6.T);
                    bh90 bh90VarM = fetVar6.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar6, mm40VarA0);
                    mkd.c0.getClass();
                    fetVar6.i0();
                    if (fetVar6.S) {
                        fetVar6.l(e7z.u1);
                    } else {
                        fetVar6.r0();
                    }
                    jpm0.o(fetVar6, x5dVarA, gqw0.x);
                    jpm0.o(fetVar6, bh90VarM, gqw0.w);
                    jpm0.o(fetVar6, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar6);
                    jpm0.o(fetVar6, mm40VarC0, gqw0.v);
                    Object objP13 = fetVar6.P();
                    if (objP13 == cl5Var) {
                        objP13 = androidx.compose.runtime.e.e(null);
                        fetVar6.o0(objP13);
                    }
                    final pz40 pz40Var3 = (pz40) objP13;
                    zcl zclVar4 = qmk.f28987a;
                    wvb.o(null, 28.0f, 0L, fetVar6, 0, 5);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    ao60 ao60Var = ifv0Var.f14706a;
                    Object objP14 = fetVar6.P();
                    if (objP14 == cl5Var) {
                        objP14 = new dbo0(pz40Var3, (byte) 10);
                        fetVar6.o0(objP14);
                    }
                    Function1 function2 = (Function1) objP14;
                    boolean zI7 = fetVar6.i(i3t0Var);
                    Object objP15 = fetVar6.P();
                    if (zI7 || objP15 == cl5Var) {
                        final byte b8 = z ? (byte) 1 : (byte) 0;
                        objP15 = new Function0() { // from class: a.efv0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b9 = b8;
                                pz40 pz40Var4 = pz40Var3;
                                i3t0 i3t0Var2 = i3t0Var;
                                switch (b9) {
                                    case 0:
                                        int i2 = ffv0.k2;
                                        i3t0Var2.x(new cfv0((String) pz40Var4.getValue()));
                                        break;
                                    default:
                                        int i3 = ffv0.k2;
                                        i3t0Var2.x(new cfv0((String) pz40Var4.getValue()));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar6.o0(objP15);
                    }
                    f7k.h(mm40VarD2, ao60Var, function2, (Function0) objP15, fetVar6, 390);
                    wvb.o(null, 6.0f, 0L, fetVar6, 0, 5);
                    wwb.i(o7k0.d(jm40Var, 1.0f), ifv0Var.b, 0L, 0, 0L, fetVar6, 6, 28);
                    wvb.o(null, 4.0f, 0L, fetVar6, 0, 5);
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    vul vulVar = vul.f38053a;
                    wul wulVar = ifv0Var.c;
                    boolean zI8 = fetVar6.i(i3t0Var);
                    Object objP16 = fetVar6.P();
                    if (zI8 || objP16 == cl5Var) {
                        objP16 = new Function0() { // from class: a.efv0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b9 = b6;
                                pz40 pz40Var4 = pz40Var3;
                                i3t0 i3t0Var2 = i3t0Var;
                                switch (b9) {
                                    case 0:
                                        int i2 = ffv0.k2;
                                        i3t0Var2.x(new cfv0((String) pz40Var4.getValue()));
                                        break;
                                    default:
                                        int i3 = ffv0.k2;
                                        i3t0Var2.x(new cfv0((String) pz40Var4.getValue()));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar6.o0(objP16);
                    }
                    ckb.i(mm40VarD3, vulVar, wulVar, 0L, (Function0) objP16, fetVar6, 54, 8);
                    wvb.o(null, 16.0f, 0L, fetVar6, 0, 5);
                    mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                    ymx ymxVar = ymx.INTERVAL_100;
                    mm40 mm40VarH = phu0.H(mm40VarD4, new jtc(), 0);
                    ov60 ov60Var = ifv0Var.d;
                    boolean zI9 = fetVar6.i(i3t0Var);
                    Object objP17 = fetVar6.P();
                    if (zI9 || objP17 == cl5Var) {
                        objP17 = new ui6(i3t0Var, b4);
                        fetVar6.o0(objP17);
                    }
                    Function0 function3 = (Function0) objP17;
                    boolean zI10 = fetVar6.i(i3t0Var);
                    Object objP18 = fetVar6.P();
                    if (zI10 || objP18 == cl5Var) {
                        objP18 = new ggt0(i3t0Var, (byte) 20);
                        fetVar6.o0(objP18);
                    }
                    kpb.h(mm40VarH, ov60Var, function3, (Function2) objP18, fetVar6, 0);
                    wvb.o(null, 12.0f, 0L, fetVar6, 0, 5);
                    fetVar6.r(true);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
        }
    }
}
