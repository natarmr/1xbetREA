package a;

import android.content.res.Configuration;
import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.special_event.impl.alleventsgames.presentation.AllEventGamesScreenParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ri1 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30516a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ri1(vl8 vl8Var, Function1 function1) {
        this.f30516a = (byte) 6;
        this.b = vl8Var;
        this.c = function1;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        l0 l0Var = (l0) this.b;
        Function1 function1 = (Function1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((y5d) obj).getClass();
        byte b = 0;
        if (!fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            fetVar.X();
        } else if (l0Var.e instanceof i0) {
            fetVar.e0(2029889977);
            boolean z = ((i0) l0Var.e).b;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new e0(function1, b);
                fetVar.o0(objP);
            }
            ay3.i(z, (Function0) objP, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.e0(2030042776);
            fetVar.r(false);
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        qc qcVar = (qc) this.b;
        l7m0 l7m0Var = (l7m0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        hfk0 hfk0Var = qc.n2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            tc tcVar = (tc) l7m0Var.getValue();
            k3t0 k3t0Var = (k3t0) qcVar.l2.getValue();
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                t0 t0Var = new t0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 10);
                fetVar.o0(t0Var);
                objP = t0Var;
            }
            lv00.b(null, tcVar, (Function1) ((jhy) objP), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        g3b g3bVar = (g3b) this.b;
        Function1 function1 = (Function1) this.c;
        g9z g9zVar = (g9z) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        g9zVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(g9zVar) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            mm40 mm40VarB = g9z.b(g9zVar, jm40.b, null, 7);
            zh0 zh0Var = g3bVar.f10602a;
            di0 di0Var = g3bVar.b;
            zcl zclVar = qmk.f28987a;
            float f = xfn.a(fetVar).c;
            lh80 lh80Var = new lh80(f, 8.0f, f, 8.0f);
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new y7(function1, (byte) 19);
                fetVar.o0(objP);
            }
            ahb.g(mm40VarB, zh0Var, di0Var, lh80Var, (Function1) objP, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        b3b b3bVar = (b3b) this.b;
        Function1 function1 = (Function1) this.c;
        g9z g9zVar = (g9z) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        g9zVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(g9zVar) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarB = g9z.b(g9zVar, s5x0.L(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).c, 0.0f, 2), null, 7);
            cc0 cc0Var = b3bVar.f1893a;
            akl aklVar = b3bVar.b;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new y7(function1, (byte) 20);
                fetVar.o0(objP);
            }
            bfb.m(mm40VarB, cc0Var, aklVar, (Function1) objP, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        uu0 uu0Var = (uu0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        gfk0 gfk0Var = uu0.o2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            fetVar.e0(1252741124);
            ListIterator listIterator = ((xu0) l7m0Var.getValue()).b.listIterator(0);
            int i = 0;
            while (true) {
                boolean zHasNext = listIterator.hasNext();
                jm40 jm40Var = jm40.b;
                if (!zHasNext) {
                    fet fetVar2 = fetVar;
                    fetVar2.r(false);
                    zcl zclVar = qmk.f28987a;
                    qxw.o(fetVar2, o7k0.s(jm40Var, 16.0f));
                    break;
                }
                Object next = listIterator.next();
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                pu0 pu0Var = (pu0) next;
                StringBuilder sb = new StringBuilder();
                sb.append(pu0Var);
                sb.append(i);
                fetVar.b0(-1406254143, sb.toString());
                String str = pu0Var.f27588a;
                wui0 wui0Var = pu0Var.e;
                zfn zfnVar = zaq0.b;
                rqm rqmVar = new rqm((vui0) new tui0(str, new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary())), (pui0) new oui0(Integer.valueOf(pu0Var.d), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), pu0Var.c, new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), 16), (pvi0) null, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 444);
                boolean zI = fetVar.i(uu0Var) | fetVar.i(pu0Var);
                Object objP = fetVar.P();
                if (zI || objP == ukd.f35823a) {
                    objP = new mc((Object) uu0Var, (Object) pu0Var, (byte) 8);
                    fetVar.o0(objP);
                }
                fet fetVar3 = fetVar;
                obc.q(jm40Var, rqmVar, false, null, (Function0) objP, null, null, null, fetVar3, 390, 232);
                if (wui0Var == wui0.c || wui0Var == wui0.b) {
                    fetVar3.e0(-642905920);
                    vtb.t(null, qqm.f29173a, null, 0L, fetVar3, 48, 13);
                    fetVar3.r(false);
                } else {
                    fetVar3.e0(-642796366);
                    fetVar3.r(false);
                }
                fetVar3.r(false);
                fetVar = fetVar3;
                i = i2;
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        kv0 kv0Var = (kv0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        hfk0 hfk0Var = kv0.n2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new cqq();
                fetVar.o0(objP);
            }
            cqq cqqVar = (cqq) objP;
            wpq wpqVar = (wpq) fetVar.k(bmd.i);
            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
            rhv0 rhv0Var = (rhv0) fetVar.k(bmd.u);
            rah0 rah0VarT = wha0.T(fetVar);
            Boolean boolValueOf = Boolean.valueOf(((nv0) l7m0Var.getValue()).c);
            yez yezVar = (yez) rhv0Var;
            Boolean boolValueOf2 = Boolean.valueOf(yezVar.c());
            boolean zG = fetVar.g(l7m0Var) | fetVar.g(yezVar) | fetVar.g(pkk0Var) | fetVar.i(wpqVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                jv0 jv0Var = new jv0(l7m0Var, yezVar, cqqVar, pkk0Var, wpqVar, null, (byte) 0);
                fetVar.o0(jv0Var);
                objP2 = jv0Var;
            }
            m0x0.v(boolValueOf, boolValueOf2, (Function2) objP2, fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA0 = wha0.a0(cjx.V(o7k0.d(jm40Var, 1.0f), x0x.a0(fetVar), null), rah0VarT, false, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarB0 = y860.b0(jm40Var, cqqVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarB0, 0.0f, 16.0f, 1);
            j7n j7nVar = ((nv0) l7m0Var.getValue()).b;
            boolean zI = fetVar.i(kv0Var);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new t1(kv0Var, (byte) 25);
                fetVar.o0(objP3);
            }
            jwb.j(mm40VarL, j7nVar, (Function1) objP3, fetVar, 0, 4);
            vbw0.i(0, fetVar, ((nv0) l7m0Var.getValue()).d, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7));
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            vul vulVar = vul.b;
            wul wulVar = ((nv0) l7m0Var.getValue()).e;
            boolean zI2 = fetVar.i(kv0Var);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == cl5Var) {
                objP4 = new iv0(kv0Var, (byte) 2);
                fetVar.o0(objP4);
            }
            ckb.i(mm40VarN, vulVar, wulVar, 0L, (Function0) objP4, fetVar, 48, 8);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        u11 u11Var = (u11) this.b;
        Function1 function1 = (Function1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarD, xfn.a(fetVar).c, 4.0f, xfn.a(fetVar).c, 28.0f);
            hyl hylVar = ((h7v) u11Var.c).f12594a;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new y7(function1, (byte) 27);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean zG2 = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new y7(function1, (byte) 28);
                fetVar.o0(objP2);
            }
            ebc.r(mm40VarM, hylVar, null, function2, (Function1) objP2, fetVar, 0, 12);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        s11 s11Var = (s11) this.b;
        Function1 function1 = (Function1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            hyl hylVar = ((h7v) s11Var.d).f12594a;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new y7(function1, (byte) 25);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean zG2 = fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new y7(function1, (byte) 26);
                fetVar.o0(objP2);
            }
            ebc.r(mm40VarD, hylVar, null, function2, (Function1) objP2, fetVar, 6, 12);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        r11 r11Var = (r11) this.b;
        Function1 function1 = (Function1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((g9z) obj).getClass();
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            wzh wzhVar = r11Var.f29655a;
            boolean zI = fetVar.i(r11Var) | fetVar.g(function1);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new g11(r11Var, function1, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(r11Var) | fetVar.g(function1);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new g11(r11Var, function1, b2);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean zG = fetVar.g(function1) | fetVar.i(r11Var);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new g11(function1, r11Var, (byte) 2);
                fetVar.o0(objP3);
            }
            Function0 function3 = (Function0) objP3;
            boolean zI3 = fetVar.i(r11Var) | fetVar.g(function1);
            Object objP4 = fetVar.P();
            if (zI3 || objP4 == cl5Var) {
                objP4 = new g11(r11Var, function1, (byte) 3);
                fetVar.o0(objP4);
            }
            Function0 function4 = (Function0) objP4;
            boolean zI4 = fetVar.i(r11Var) | fetVar.g(function1);
            Object objP5 = fetVar.P();
            if (zI4 || objP5 == cl5Var) {
                objP5 = new g11(r11Var, function1, (byte) 4);
                fetVar.o0(objP5);
            }
            Function0 function5 = (Function0) objP5;
            boolean zG2 = fetVar.g(function1) | fetVar.i(r11Var);
            Object objP6 = fetVar.P();
            if (zG2 || objP6 == cl5Var) {
                objP6 = new g11(function1, r11Var, (byte) 5);
                fetVar.o0(objP6);
            }
            slb.k(mm40VarN, wzhVar, null, function0, function2, function3, function4, function5, (Function0) objP6, fetVar, 0, 4);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        b41 b41Var = (b41) this.b;
        z31 z31Var = (z31) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        jdk0 jdk0Var = z31.n2;
        ((ir8) obj).getClass();
        byte b = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            vul vulVar = vul.b;
            lul lulVar = lul.e;
            oe9 oe9Var = oe9.f25112a;
            wul wulVar = new wul(lulVar, oe9Var, new ue9(b41Var.d), true, false, false);
            wul wulVar2 = new wul(nul.e, oe9Var, new ue9(b41Var.e), true, false, false);
            boolean zI = fetVar.i(z31Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new y31(z31Var, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(z31Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new y31(z31Var, (byte) 2);
                fetVar.o0(objP2);
            }
            gkb.i(null, vulVar, wulVar, wulVar2, 0L, function0, (Function0) objP2, fetVar, 48, 17);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        ea1 ea1Var = (ea1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        gfk0 gfk0Var = ea1.n2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 28.0f, 0L, fetVar, 0, 5);
            wwb.i(null, ((ha1) l7m0Var.getValue()).f12702a, 0L, 0, 0L, fetVar, 0, 29);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            kkb.m(null, ((ha1) l7m0Var.getValue()).b, null, 0, 0L, 0L, fetVar, 0, 61);
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
            vul vulVar = vul.f38053a;
            wul wulVar = ((ha1) l7m0Var.getValue()).c;
            wul wulVar2 = ((ha1) l7m0Var.getValue()).d;
            boolean zI = fetVar.i(ea1Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new da1(ea1Var, (byte) 1);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(ea1Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new da1(ea1Var, (byte) 2);
                fetVar.o0(objP2);
            }
            gkb.i(null, vulVar, wulVar, wulVar2, 0L, function0, (Function0) objP2, fetVar, 48, 17);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        l7m0 l7m0Var = (l7m0) this.b;
        ae1 ae1Var = (ae1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        gfk0 gfk0Var = ae1.n2;
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            vul vulVar = vul.b;
            wul wulVar = ((yec0) l7m0Var.getValue()).c;
            wul wulVar2 = ((yec0) l7m0Var.getValue()).d;
            boolean zI = fetVar.i(ae1Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new xd1(ae1Var, (byte) 1);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(ae1Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new xd1(ae1Var, (byte) 2);
                fetVar.o0(objP2);
            }
            gkb.i(null, vulVar, wulVar, wulVar2, 0L, function0, (Function0) objP2, fetVar, 48, 17);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        y5d y5dVar = (y5d) this.b;
        cl1 cl1Var = (cl1) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        gfk0 gfk0Var = cl1.o2;
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            mm40 mm40VarA = y5dVar.a(o7k0.d(jm40.b, 1.0f), gqw0.n);
            String strH = cl1Var.H(R.string.congratulations);
            strH.getClass();
            wwb.i(mm40VarA, strH, 0L, 0, 0L, fetVar, 0, 28);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2, Object obj3) {
        imm immVar = (imm) this.b;
        org.xplatform.special_event.impl.alleventsgames.presentation.a aVar = (org.xplatform.special_event.impl.alleventsgames.presentation.a) this.c;
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        hfk0 hfk0Var = org.xplatform.special_event.impl.alleventsgames.presentation.a.U1;
        mm40Var.getClass();
        byte b = 4;
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean zI = fetVar.i(aVar);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new w22(aVar, b);
                fetVar.o0(objP);
            }
            hlm.c(mm40Var, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, iIntValue & 14, 0, 4084);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object v(Object obj, Object obj2, Object obj3) {
        pz40 pz40Var = (pz40) this.b;
        t42 t42Var = (t42) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        jdk0 jdk0Var = t42.p2;
        ((ir8) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(jm40.b, 16.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            wul wulVar = ((d52) pz40Var.getValue()).c;
            boolean zI = fetVar.i(t42Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new r42(t42Var, (byte) 1);
                fetVar.o0(objP);
            }
            qzb.n(x7zVar, wulVar, (Function0) objP, fetVar, 0, 0);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            wul wulVar2 = ((d52) pz40Var.getValue()).d;
            boolean zI2 = fetVar.i(t42Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new r42(t42Var, (byte) 2);
                fetVar.o0(objP2);
            }
            qzb.n(x7zVar2, wulVar2, (Function0) objP2, fetVar, 0, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object w(Object obj, Object obj2, Object obj3) {
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        l7m0 l7m0Var = (l7m0) this.b;
        nta0 nta0Var = (nta0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = nta0.m2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            boolean zI = fetVar.i(nta0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new mta0(nta0Var, (byte) 2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            l7m0Var.getClass();
            function0.getClass();
            float f = ((Configuration) fetVar.k(dy2.f6873a)).screenHeightDp / 2.0f;
            mua0 mua0Var = (mua0) l7m0Var.getValue();
            if (mua0Var instanceof jua0) {
                fetVar.e0(1634621407);
                ArrayList arrayList = ((jua0) mua0Var).f17144a;
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                mm40 mm40VarE = cjx.V(mm40VarN, a8k0.G(xczVarA, fetVar), null).e(o7k0.c);
                boolean zI2 = fetVar.i(arrayList);
                Object objP2 = fetVar.P();
                if (zI2 || objP2 == cl5Var) {
                    objP2 = new uy2(arrayList, (byte) 13);
                    fetVar.o0(objP2);
                }
                b8k0.e(mm40VarE, xczVarA, null, null, null, null, false, null, (Function1) objP2, fetVar, 0, 508);
                fetVar.r(false);
            } else {
                boolean z = mua0Var instanceof kua0;
                pcy pcyVar = e7z.u1;
                if (z) {
                    fetVar.e0(1636204732);
                    mm40 mm40VarE2 = o7k0.e(wha0.a0(cjx.V(o7k0.d(jm40Var, 1.0f), x0x.a0(fetVar), null), wha0.T(fetVar), false, 14), f);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE2);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, shdVar4);
                    jpm0.o(fetVar, bh90VarM, shdVar3);
                    vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                    jpm0.o(fetVar, mm40VarC0, shdVar);
                    jcb.l(null, ((kua0) mua0Var).f18903a, false, function0, fetVar, 0, 5);
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    if (!Intrinsics.d(mua0Var, lua0.f20665a)) {
                        throw b1j.f(329823087, fetVar, false);
                    }
                    fetVar.e0(1636681667);
                    mm40 mm40VarE3 = o7k0.e(wha0.a0(cjx.V(o7k0.d(jm40Var, 1.0f), x0x.a0(fetVar), null), wha0.T(fetVar), false, 14), f);
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE3);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC2, shdVar4);
                    jpm0.o(fetVar, bh90VarM2, shdVar3);
                    vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar);
                    sj3.m(0, 0L, fetVar, null);
                    fetVar.r(true);
                    fetVar.r(false);
                }
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        boolean z;
        fet fetVar;
        boolean z2;
        byte b = this.f30516a;
        byte b2 = 5;
        pcy pcyVar = e7z.u1;
        byte b3 = 18;
        byte b4 = 2;
        cl5 cl5Var = ukd.f35823a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj5;
                li1 li1Var = (li1) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((hh80) obj).getClass();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    long background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
                    mm40 mm40VarE = mm40Var.e(o7k0.c);
                    boolean zF = fetVar2.f(background);
                    Object objP = fetVar2.P();
                    if (zF || objP == cl5Var) {
                        objP = new bx(b4, background);
                        fetVar2.o0(objP);
                    }
                    mm40 mm40VarS = o050.S(rq8.K(mm40VarE, (Function1) objP));
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarP = o050.P(s5x0.N(mm40VarS, 0.0f, 0.0f, 0.0f, 56.0f, 7));
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarP);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    jcb.l(null, ((ii1) li1Var).b, false, null, fetVar2, 0, 13);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
                l7m0 l7m0Var = (l7m0) obj5;
                org.xplatform.special_event.impl.alleventsgames.presentation.a aVar = (org.xplatform.special_event.impl.alleventsgames.presentation.a) obj4;
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                hfk0 hfk0Var = org.xplatform.special_event.impl.alleventsgames.presentation.a.U1;
                mm40Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar3.g(mm40Var2) ? (byte) 4 : (byte) 2;
                }
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    int i = iIntValue2 & 14;
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40Var2);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar3, tj30VarC2, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar3, bh90VarM2, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar3, numValueOf, shdVar3);
                    jpm0.n(fetVar3);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar3, mm40VarC1, shdVar4);
                    r32 r32Var = (r32) l7m0Var.getValue();
                    if (r32Var != null) {
                        if (r32Var instanceof q32) {
                            fetVar3.e0(1548236134);
                            jar0.d(0, fetVar3, null, aVar.G0() instanceof AllEventGamesScreenParams.ParticipantGames);
                            fetVar3.r(false);
                        } else {
                            if (r32Var instanceof o32) {
                                fetVar3.e0(1548468572);
                                a4x a4xVar = ((o32) r32Var).f24560a;
                                k3t0 k3t0VarH0 = aVar.H0();
                                boolean zI = fetVar3.i(k3t0VarH0);
                                Object objP2 = fetVar3.P();
                                if (zI || objP2 == cl5Var) {
                                    ln1 ln1Var = new ln1(1, k3t0VarH0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 9);
                                    fetVar3.o0(ln1Var);
                                    objP2 = ln1Var;
                                }
                                jiq0.a(i, fetVar3, a4xVar, mm40Var2, (Function1) ((jhy) objP2));
                                fetVar3.r(false);
                            } else if (r32Var instanceof p32) {
                                fetVar3.e0(1548841750);
                                n0q n0qVar = o7k0.c;
                                tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                                int iHashCode3 = Long.hashCode(fetVar3.T);
                                bh90 bh90VarM3 = fetVar3.m();
                                mm40 mm40VarC2 = kbc.c0(fetVar3, n0qVar);
                                fetVar3.i0();
                                if (fetVar3.S) {
                                    fetVar3.l(pcyVar);
                                } else {
                                    fetVar3.r0();
                                }
                                jpm0.o(fetVar3, tj30VarC3, shdVar);
                                jpm0.o(fetVar3, bh90VarM3, shdVar2);
                                vqd.u(iHashCode3, fetVar3, shdVar3, fetVar3);
                                jpm0.o(fetVar3, mm40VarC2, shdVar4);
                                mdm mdmVar = ((p32) r32Var).f26278a;
                                boolean zI2 = fetVar3.i(aVar);
                                Object objP3 = fetVar3.P();
                                if (zI2 || objP3 == cl5Var) {
                                    objP3 = new w22(aVar, b2);
                                    fetVar3.o0(objP3);
                                }
                                jcb.l(null, mdmVar, false, (Function0) objP3, fetVar3, 0, 5);
                                fetVar = fetVar3;
                                z2 = true;
                                fetVar.r(true);
                                fetVar.r(false);
                            } else {
                                z = false;
                            }
                            fetVar.r(z2);
                        }
                        fetVar = fetVar3;
                        z2 = true;
                        fetVar.r(z2);
                    } else {
                        z = false;
                    }
                    throw b1j.f(-1058437508, fetVar3, z);
                }
                fetVar3.X();
                return Unit.f46060a;
            case 2:
                xcz xczVar = (xcz) obj5;
                sce sceVar = (sce) obj4;
                fet fetVar4 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    n0q n0qVar2 = o7k0.c;
                    float f = xfn.a(fetVar4).c;
                    float f2 = xfn.a(fetVar4).c;
                    zcl zclVar2 = qmk.f28987a;
                    ch80 ch80VarG = knm0.g(s5x0.u(f, 0.0f, f2, 24.0f, 2), fetVar4);
                    nw3 nw3Var = uc9.e;
                    boolean zG = fetVar4.g(sceVar);
                    Object objP4 = fetVar4.P();
                    if (zG || objP4 == cl5Var) {
                        objP4 = new xh2(sceVar, (byte) 1);
                        fetVar4.o0(objP4);
                    }
                    b8k0.e(n0qVar2, xczVar, ch80VarG, nw3Var, null, null, false, null, (Function1) objP4, fetVar4, 24582, Response.NOT_ACCEPTABLE_HERE);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 3:
                mm40 mm40Var3 = (mm40) obj5;
                fie fieVar = (fie) obj4;
                fet fetVar5 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    mm40 mm40VarE2 = mm40Var3.e(o7k0.c);
                    nw3 nw3Var2 = uc9.e;
                    boolean zG2 = fetVar5.g(fieVar);
                    Object objP5 = fetVar5.P();
                    if (zG2 || objP5 == cl5Var) {
                        objP5 = new m51(fieVar, (byte) 22);
                        fetVar5.o0(objP5);
                    }
                    b8k0.e(mm40VarE2, null, null, nw3Var2, null, null, false, null, (Function1) objP5, fetVar5, 24576, 494);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 4:
                jkm jkmVar = (jkm) obj5;
                String str = (String) obj4;
                hh80 hh80Var = (hh80) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar6.g(hh80Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    mm40 mm40VarI = s5x0.I(o7k0.c, hh80Var);
                    Object objP6 = fetVar6.P();
                    if (objP6 == cl5Var) {
                        objP6 = xr4.f41351a;
                        fetVar6.o0(objP6);
                    }
                    xdr xdrVar = (xdr) ((jhy) objP6);
                    boolean zI3 = fetVar6.i(jkmVar) | fetVar6.g(str);
                    Object objP7 = fetVar6.P();
                    if (zI3 || objP7 == cl5Var) {
                        objP7 = new ys3(jkmVar, str, (byte) 23);
                        fetVar6.o0(objP7);
                    }
                    y860.f(xdrVar, mm40VarI, (Function1) objP7, fetVar6, 6, 0);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 5:
                if7 if7Var = (if7) obj5;
                Function1 function1 = (Function1) obj4;
                hh80 hh80Var2 = (hh80) obj;
                fet fetVar7 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                hh80Var2.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar7.g(hh80Var2) ? 4 : 2;
                }
                if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    n0q n0qVar3 = o7k0.c;
                    zfn zfnVar = zaq0.b;
                    mm40 mm40VarL = s5x0.L(s5x0.I(i120.Q(n0qVar3, ((ThemeColors) fetVar7.k(zfnVar)).getBackground(), jd8.n), hh80Var2), xfn.a(fetVar7).d, 0.0f, 2);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar7, 0);
                    int iHashCode4 = Long.hashCode(fetVar7.T);
                    bh90 bh90VarM4 = fetVar7.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar7, mm40VarL);
                    mkd.c0.getClass();
                    fetVar7.i0();
                    if (fetVar7.S) {
                        fetVar7.l(pcyVar);
                    } else {
                        fetVar7.r0();
                    }
                    jpm0.o(fetVar7, x5dVarA, gqw0.x);
                    jpm0.o(fetVar7, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar7, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar7);
                    jpm0.o(fetVar7, mm40VarC3, gqw0.v);
                    x6q0 x6q0Var = if7Var.c;
                    jm40 jm40Var = jm40.b;
                    if (x6q0Var != null) {
                        fetVar7.e0(-234503461);
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarL2 = s5x0.L(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 4.0f, 5), 16.0f, 0.0f, 2);
                        String str2 = if7Var.b;
                        ((g1t0) fetVar7.k(j1t0.e)).getClass();
                        v8q0.a(str2, mm40VarL2, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(g1t0.n(), ((ThemeColors) fetVar7.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar7, 0, 0, 131068);
                        jm40Var = jm40Var;
                        mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        long backgroundContent = ((ThemeColors) fetVar7.k(zfnVar)).getBackgroundContent();
                        zcl zclVar4 = qmk.i;
                        ugg0 ugg0Var = vgg0.f37379a;
                        mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarN, backgroundContent, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4)), 16.0f);
                        x6q0 x6q0Var2 = if7Var.c;
                        boolean zG3 = fetVar7.g(function1);
                        Object objP8 = fetVar7.P();
                        if (zG3 || objP8 == cl5Var) {
                            objP8 = new uo6(function1, (byte) 10);
                            fetVar7.o0(objP8);
                        }
                        wwb.n(mm40VarJ, x6q0Var2, null, (Function1) objP8, fetVar7, 0, 4);
                        fetVar7.r(false);
                    } else {
                        fetVar7.e0(-233338729);
                        fetVar7.r(false);
                    }
                    if (if7Var.f != null) {
                        fetVar7.e0(-233240118);
                        zcl zclVar5 = qmk.f28987a;
                        mm40 mm40VarL3 = s5x0.L(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 4.0f, 5), 16.0f, 0.0f, 2);
                        String str3 = if7Var.d;
                        ((g1t0) fetVar7.k(j1t0.e)).getClass();
                        v8q0.a(str3, mm40VarL3, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(g1t0.n(), ((ThemeColors) fetVar7.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar7, 0, 0, 131068);
                        mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        long backgroundContent2 = ((ThemeColors) fetVar7.k(zfnVar)).getBackgroundContent();
                        zcl zclVar6 = qmk.i;
                        ugg0 ugg0Var2 = vgg0.f37379a;
                        mm40 mm40VarJ2 = s5x0.J(i120.Q(mm40VarN2, backgroundContent2, new ugg0(zclVar6, zclVar6, zclVar6, zclVar6)), 16.0f);
                        x6q0 x6q0Var3 = if7Var.f;
                        boolean zG4 = fetVar7.g(function1);
                        Object objP9 = fetVar7.P();
                        if (zG4 || objP9 == cl5Var) {
                            objP9 = new uo6(function1, (byte) 11);
                            fetVar7.o0(objP9);
                        }
                        wwb.n(mm40VarJ2, x6q0Var3, null, (Function1) objP9, fetVar7, 0, 4);
                        fetVar7.r(false);
                    } else {
                        fetVar7.e0(-232059049);
                        fetVar7.r(false);
                    }
                    fetVar7.r(true);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 6:
                vl8 vl8Var = (vl8) obj5;
                Function1 function2 = (Function1) obj4;
                fet fetVar8 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    n0q n0qVar4 = o7k0.c;
                    x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar8, 0);
                    int iHashCode5 = Long.hashCode(fetVar8.T);
                    bh90 bh90VarM5 = fetVar8.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar8, n0qVar4);
                    mkd.c0.getClass();
                    fetVar8.i0();
                    if (fetVar8.S) {
                        fetVar8.l(pcyVar);
                    } else {
                        fetVar8.r0();
                    }
                    jpm0.o(fetVar8, x5dVarA2, gqw0.x);
                    jpm0.o(fetVar8, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar8, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar8);
                    jpm0.o(fetVar8, mm40VarC4, gqw0.v);
                    tl8 tl8Var = (tl8) vl8Var;
                    boolean z3 = tl8Var.l;
                    jm40 jm40Var2 = jm40.b;
                    if (z3) {
                        fetVar8.e0(1904609580);
                        mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                        hyl hylVar = tl8Var.k;
                        boolean zG5 = fetVar8.g(function2);
                        Object objP10 = fetVar8.P();
                        if (zG5 || objP10 == cl5Var) {
                            objP10 = new uo6(function2, (byte) 17);
                            fetVar8.o0(objP10);
                        }
                        ebc.r(mm40VarD, hylVar, null, (Function1) objP10, null, fetVar8, 6, 44);
                        fetVar8.r(false);
                    } else {
                        fetVar8.e0(1904980526);
                        fetVar8.r(false);
                    }
                    mm40 mm40VarE0 = o2e.e0(n0qVar4, "LAZY_COLUMN_BONUSES_SCREEN");
                    zcl zclVar7 = qmk.f28987a;
                    qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                    lh80 lh80Var = new lh80(qmk.a(fetVar8).c, z3 ? 0.0f : 12.0f, qmk.a(fetVar8).c, 24.0f);
                    boolean zG6 = fetVar8.g(vl8Var) | fetVar8.g(function2) | fetVar8.g(jm40Var2);
                    Object objP11 = fetVar8.P();
                    if (zG6 || objP11 == cl5Var) {
                        objP11 = new op7(vl8Var, function2);
                        fetVar8.o0(objP11);
                    }
                    b8k0.e(mm40VarE0, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP11, fetVar8, 6, 490);
                    fetVar8.r(true);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 7:
                l8k l8kVar = (l8k) obj5;
                Function1 function3 = (Function1) obj4;
                hh80 hh80Var3 = (hh80) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                hh80Var3.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar9.g(hh80Var3) ? 4 : 2;
                }
                if (fetVar9.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    n0q n0qVar5 = o7k0.c;
                    pz40 pz40Var = s6t0.f31722a;
                    mm40 mm40VarL4 = s5x0.L(s5x0.I(i120.Q(n0qVar5, s6t0.b().f33626a.getBackground(), jd8.n), hh80Var3), xfn.a(fetVar9).d, 0.0f, 2);
                    x5d x5dVarA3 = w5d.a(uc9.c, gqw0.m, fetVar9, 0);
                    int iHashCode6 = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM6 = fetVar9.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar9, mm40VarL4);
                    mkd.c0.getClass();
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(pcyVar);
                    } else {
                        fetVar9.r0();
                    }
                    jpm0.o(fetVar9, x5dVarA3, gqw0.x);
                    jpm0.o(fetVar9, bh90VarM6, gqw0.w);
                    jpm0.o(fetVar9, Integer.valueOf(iHashCode6), gqw0.y);
                    jpm0.n(fetVar9);
                    jpm0.o(fetVar9, mm40VarC5, gqw0.v);
                    if (l8kVar.c != null) {
                        fetVar9.e0(-216793831);
                        zcl zclVar8 = qmk.f28987a;
                        jm40 jm40Var3 = jm40.b;
                        v8q0.a(l8kVar.b, s5x0.L(s5x0.N(jm40Var3, 0.0f, 12.0f, 0.0f, 4.0f, 5), 16.0f, 0.0f, 2), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), s6t0.b().f33626a.getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar9, 0, 0, 131068);
                        mm40 mm40VarN3 = s5x0.N(jm40Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        long backgroundContent3 = s6t0.b().f33626a.getBackgroundContent();
                        zcl zclVar9 = qmk.i;
                        ugg0 ugg0Var3 = vgg0.f37379a;
                        mm40 mm40VarJ3 = s5x0.J(i120.Q(mm40VarN3, backgroundContent3, new ugg0(zclVar9, zclVar9, zclVar9, zclVar9)), 16.0f);
                        x6q0 x6q0Var4 = l8kVar.c;
                        boolean zG7 = fetVar9.g(function3);
                        Object objP12 = fetVar9.P();
                        if (zG7 || objP12 == cl5Var) {
                            objP12 = new olh(function3, (byte) 26);
                            fetVar9.o0(objP12);
                        }
                        wwb.n(mm40VarJ3, x6q0Var4, null, (Function1) objP12, fetVar9, 0, 4);
                        fetVar9.r(false);
                    } else {
                        fetVar9.e0(-215627177);
                        fetVar9.r(false);
                    }
                    fetVar9.r(true);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 8:
                fkr fkrVar = (fkr) obj5;
                Function1 function4 = (Function1) obj4;
                hh80 hh80Var4 = (hh80) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                hh80Var4.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar10.g(hh80Var4) ? 4 : 2;
                }
                if (fetVar10.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    n0q n0qVar6 = o7k0.c;
                    pz40 pz40Var2 = s6t0.f31722a;
                    mm40 mm40VarL5 = s5x0.L(s5x0.I(i120.Q(n0qVar6, s6t0.b().f33626a.getBackground(), jd8.n), hh80Var4), xfn.a(fetVar10).d, 0.0f, 2);
                    zcl zclVar10 = qmk.f28987a;
                    lh80 lh80VarU = s5x0.u(0.0f, 12.0f, 0.0f, 24.0f, 5);
                    boolean zG8 = fetVar10.g(fkrVar) | fetVar10.g(function4);
                    Object objP13 = fetVar10.P();
                    if (zG8 || objP13 == cl5Var) {
                        objP13 = new f5p(fkrVar, function4, (byte) 22);
                        fetVar10.o0(objP13);
                    }
                    b8k0.e(mm40VarL5, null, lh80VarU, null, null, null, false, null, (Function1) objP13, fetVar10, 0, 506);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 9:
                pz40 pz40Var3 = (pz40) obj5;
                nv10 nv10Var = (nv10) obj4;
                hh80 hh80Var5 = (hh80) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                hh80Var5.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= fetVar11.g(hh80Var5) ? (byte) 4 : (byte) 2;
                }
                if (fetVar11.U(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    n0q n0qVar7 = o7k0.c;
                    mm40 mm40VarQ = i120.Q(s5x0.N(n0qVar7, 0.0f, hh80Var5.d(), 0.0f, 0.0f, 13), ((ThemeColors) fetVar11.k(zaq0.b)).getBackground(), jd8.n);
                    tj30 tj30VarC4 = zq8.c(gqw0.f11754a, false);
                    int iHashCode7 = Long.hashCode(fetVar11.T);
                    bh90 bh90VarM7 = fetVar11.m();
                    mm40 mm40VarC6 = kbc.c0(fetVar11, mm40VarQ);
                    mkd.c0.getClass();
                    fetVar11.i0();
                    if (fetVar11.S) {
                        fetVar11.l(pcyVar);
                    } else {
                        fetVar11.r0();
                    }
                    shd shdVar5 = gqw0.x;
                    jpm0.o(fetVar11, tj30VarC4, shdVar5);
                    shd shdVar6 = gqw0.w;
                    jpm0.o(fetVar11, bh90VarM7, shdVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode7);
                    shd shdVar7 = gqw0.y;
                    jpm0.o(fetVar11, numValueOf2, shdVar7);
                    jpm0.n(fetVar11);
                    shd shdVar8 = gqw0.v;
                    jpm0.o(fetVar11, mm40VarC6, shdVar8);
                    x5d x5dVarA4 = w5d.a(uc9.c, gqw0.m, fetVar11, 0);
                    int iHashCode8 = Long.hashCode(fetVar11.T);
                    bh90 bh90VarM8 = fetVar11.m();
                    mm40 mm40VarC7 = kbc.c0(fetVar11, n0qVar7);
                    fetVar11.i0();
                    if (fetVar11.S) {
                        fetVar11.l(pcyVar);
                    } else {
                        fetVar11.r0();
                    }
                    jpm0.o(fetVar11, x5dVarA4, shdVar5);
                    jpm0.o(fetVar11, bh90VarM8, shdVar6);
                    vqd.u(iHashCode8, fetVar11, shdVar7, fetVar11);
                    jpm0.o(fetVar11, mm40VarC7, shdVar8);
                    Object objP14 = fetVar11.P();
                    if (objP14 == cl5Var) {
                        objP14 = new y9v(pz40Var3, b3);
                        fetVar11.o0(objP14);
                    }
                    xbc.c(null, (Function1) objP14, fetVar11, 48);
                    m7x.f(null, (l4b) pz40Var3.getValue(), nv10Var, fetVar11, 0);
                    fetVar11.r(true);
                    fetVar11.r(true);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 10:
                hp40 hp40Var = (hp40) obj5;
                Function1 function5 = (Function1) obj4;
                hh80 hh80Var6 = (hh80) obj;
                fet fetVar12 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                hh80Var6.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= fetVar12.g(hh80Var6) ? (byte) 4 : (byte) 2;
                }
                if (fetVar12.U(1 & iIntValue11, (iIntValue11 & 19) != 18)) {
                    mm40 mm40VarQ2 = i120.Q(o7k0.c, ((ThemeColors) fetVar12.k(zaq0.b)).getBackground(), jd8.n);
                    float fD = hh80Var6.d();
                    float fA = hh80Var6.a();
                    zcl zclVar11 = qmk.f28987a;
                    lh80 lh80VarU2 = s5x0.u(0.0f, fD, 0.0f, fA + 24.0f, 5);
                    boolean zG9 = fetVar12.g(hp40Var) | fetVar12.g(function5);
                    Object objP15 = fetVar12.P();
                    if (zG9 || objP15 == cl5Var) {
                        objP15 = new bw20((Object) hp40Var, (Object) function5, (byte) 27);
                        fetVar12.o0(objP15);
                    }
                    b8k0.e(mm40VarQ2, null, lh80VarU2, null, null, null, false, null, (Function1) objP15, fetVar12, 0, 506);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 11:
                return w(obj, obj2, obj3);
            case 12:
                rah0 rah0Var = (rah0) obj5;
                mch0 mch0Var = (mch0) obj4;
                lr8 lr8Var = (lr8) obj;
                fet fetVar13 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                lr8Var.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= fetVar13.g(lr8Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar13.U(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    float fD2 = lr8Var.d() - 72.0f;
                    zcl zclVar12 = qmk.f28987a;
                    jm40 jm40Var4 = jm40.b;
                    mm40 mm40VarP2 = wha0.P(s5x0.N(jm40Var4, 0.0f, 0.0f, 48.0f, 0.0f, 11).e(o7k0.c), rah0Var, false, 14);
                    tj30 tj30VarC5 = zq8.c(gqw0.f11754a, false);
                    int iHashCode9 = Long.hashCode(fetVar13.T);
                    bh90 bh90VarM9 = fetVar13.m();
                    mm40 mm40VarC8 = kbc.c0(fetVar13, mm40VarP2);
                    mkd.c0.getClass();
                    fetVar13.i0();
                    if (fetVar13.S) {
                        fetVar13.l(pcyVar);
                    } else {
                        fetVar13.r0();
                    }
                    jpm0.o(fetVar13, tj30VarC5, gqw0.x);
                    jpm0.o(fetVar13, bh90VarM9, gqw0.w);
                    jpm0.o(fetVar13, Integer.valueOf(iHashCode9), gqw0.y);
                    jpm0.n(fetVar13);
                    jpm0.o(fetVar13, mm40VarC8, gqw0.v);
                    pzw.f(mch0Var, fD2, fetVar13, 0);
                    fetVar13.r(true);
                    pzw.x(lr8Var.b(jm40Var4, gqw0.c), mch0Var, fetVar13, 0);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 13:
                n0v0 n0v0Var = (n0v0) obj5;
                Function1 function6 = (Function1) obj4;
                fet fetVar14 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar14.U(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    mm40 mm40VarE1 = o2e.e0(o7k0.c, "LAZY_COLUMN");
                    float f3 = xfn.a(fetVar14).d;
                    float f4 = xfn.a(fetVar14).d;
                    zcl zclVar13 = qmk.f28987a;
                    ch80 ch80VarF = knm0.f(s5x0.u(f3, 0.0f, f4, 24.0f, 2), fetVar14);
                    boolean zG10 = fetVar14.g(n0v0Var) | fetVar14.g(function6);
                    Object objP16 = fetVar14.P();
                    if (zG10 || objP16 == cl5Var) {
                        objP16 = new xis0((Object) n0v0Var, (Object) function6, (byte) 25);
                        fetVar14.o0(objP16);
                    }
                    b8k0.e(mm40VarE1, null, ch80VarF, null, null, null, false, null, (Function1) objP16, fetVar14, 6, 506);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 14:
                return a(obj, obj2, obj3);
            case 15:
                return b(obj, obj2, obj3);
            case 16:
                return c(obj, obj2, obj3);
            case 17:
                return g(obj, obj2, obj3);
            case 18:
                return h(obj, obj2, obj3);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return i(obj, obj2, obj3);
            case 20:
                return l(obj, obj2, obj3);
            case 21:
                return m(obj, obj2, obj3);
            case 22:
                return o(obj, obj2, obj3);
            case 23:
                return p(obj, obj2, obj3);
            case 24:
                return r(obj, obj2, obj3);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return s(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return t(obj, obj2, obj3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return u(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return v(obj, obj2, obj3);
            default:
                f94 f94Var = (f94) obj5;
                Function0 function0 = (Function0) obj4;
                fet fetVar15 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar15.U(1 & iIntValue14, (iIntValue14 & 17) != 16)) {
                    fww.i(null, ((e84) f94Var).f7355a, function0, fetVar15, 0);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ri1(Object obj, Object obj2, byte b) {
        this.f30516a = b;
        this.b = obj;
        this.c = obj2;
    }
}
