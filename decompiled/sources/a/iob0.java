package a;

import android.app.Application;
import android.content.Context;
import android.view.Window;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iob0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15110a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iob0(dh dhVar, int i) {
        this.f15110a = (byte) 26;
        this.b = dhVar;
    }

    private final Object a(Object obj, Object obj2) {
        x1 x1Var = (x1) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1Var.a(0, fetVar);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        lbh0 lbh0Var = (lbh0) this.b;
        qjj.W(lbh0Var.N0(), null, null, new z4(lbh0Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), null), 3);
        return Boolean.TRUE;
    }

    private final Object c(Object obj, Object obj2) {
        l8 l8Var = (l8) this.b;
        u4s u4sVar = (u4s) obj;
        pek0 pek0Var = l8.P1;
        u4sVar.getClass();
        l8Var.H0().I(u4sVar, (String) obj2);
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2) {
        y8 y8Var = (y8) this.b;
        u4s u4sVar = (u4s) obj;
        qek0 qek0Var = y8.P1;
        u4sVar.getClass();
        y8Var.H0().I(u4sVar, (String) obj2);
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2) {
        f9 f9Var = (f9) this.b;
        u4s u4sVar = (u4s) obj;
        rek0 rek0Var = f9.P1;
        u4sVar.getClass();
        f9Var.H0().I(u4sVar, (String) obj2);
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2) {
        t9 t9Var = (t9) this.b;
        u4s u4sVar = (u4s) obj;
        gfk0 gfk0Var = t9.P1;
        u4sVar.getClass();
        t9Var.H0().I(u4sVar, (String) obj2);
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        fre0.a((dh) this.b, (fet) obj, x8x.L(1));
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2) {
        xm xmVar = (xm) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        jdk0 jdk0Var = xm.Q1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zI = fetVar.i(xmVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new wm(xmVar, (byte) 3);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(xmVar);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new wm(xmVar, (byte) 4);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            pz40 pz40VarY = ((i3t0) ((k3t0) xmVar.N1.getValue())).y(fetVar);
            qdz qdzVar = xmVar.P1;
            boolean zI3 = fetVar.i(xmVar);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                objP3 = new t1(xmVar, (byte) 13);
                fetVar.o0(objP3);
            }
            dj8.b(pz40VarY, qdzVar, (Function1) objP3, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2) {
        ft ftVar = (ft) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        qek0 qek0Var = ft.N1;
        byte b = 0;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            k3t0 k3t0VarG0 = ftVar.G0();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            boolean zI = fetVar.i(ftVar);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                t0 t0Var = new t0(1, ftVar, ft.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/pin_code/impl/presentation/add/compose/models/AddPinCodeSideEffect;)V", 0, (byte) 16);
                fetVar.o0(t0Var);
                objP2 = t0Var;
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI2 = fetVar.i(vneVar) | fetVar.i(k3t0VarG0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new et(vneVar, k3t0VarG0, function1, b);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            lt ltVar = (lt) ((i3t0) ftVar.G0()).y(fetVar).getValue();
            mm40 mm40VarE0 = o2e.e0(jm40.b, "ADD_PIN_CODE_SCREEN");
            k3t0 k3t0VarG1 = ftVar.G0();
            boolean zI3 = fetVar.i(k3t0VarG1);
            Object objP4 = fetVar.P();
            if (zI3 || objP4 == cl5Var) {
                t0 t0Var2 = new t0(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 17);
                fetVar.o0(t0Var2);
                objP4 = t0Var2;
            }
            rq8.a(mm40VarE0, ltVar, (Function1) ((jhy) objP4), fetVar, 6);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2) {
        Object w82Var;
        Window window;
        fpk0 fpk0Var = (fpk0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        zie0 zie0Var = fpk0.V1;
        byte b = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            kxq kxqVarB = fpk0Var.B();
            yje yjeVar = null;
            cjv0 cjv0Var = (kxqVarB == null || (window = kxqVarB.getWindow()) == null) ? null : new cjv0(window, window.getDecorView());
            zcl zclVar = qmk.f28987a;
            float fB = pkd.b(16.0f, fetVar);
            f3d f3dVarH0 = vzb.h0(fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new qno0();
                fetVar.o0(objP);
            }
            qno0 qno0Var = (qno0) objP;
            boolean zI = fetVar.i(fpk0Var);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new cpk0(fpk0Var, (byte) 6);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean zI2 = fetVar.i(fpk0Var);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new cpk0(fpk0Var, (byte) 7);
                fetVar.o0(objP3);
            }
            v3c.A(function0, (Function0) objP3, null, fetVar, 0, 4);
            pz40 pz40VarY = ((i3t0) fpk0Var.I0()).y(fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(pz40VarY);
            Object objP4 = fetVar.P();
            if (zG || objP4 == cl5Var) {
                objP4 = new f7f0(pz40VarY, (byte) 15);
                fetVar.o0(objP4);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP4, fetVar);
            Object[] objArr2 = new Object[0];
            boolean zG2 = fetVar.g(pz40VarY);
            Object objP5 = fetVar.P();
            if (zG2 || objP5 == cl5Var) {
                objP5 = new f7f0(pz40VarY, (byte) 16);
                fetVar.o0(objP5);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP5, fetVar);
            Object[] objArr3 = new Object[0];
            boolean zG3 = fetVar.g(pz40VarY);
            Object objP6 = fetVar.P();
            if (zG3 || objP6 == cl5Var) {
                objP6 = new f7f0(pz40VarY, (byte) 17);
                fetVar.o0(objP6);
            }
            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP6, fetVar);
            Object[] objArr4 = new Object[0];
            boolean zG4 = fetVar.g(pz40VarY);
            Object objP7 = fetVar.P();
            if (zG4 || objP7 == cl5Var) {
                objP7 = new f7f0(pz40VarY, (byte) 18);
                fetVar.o0(objP7);
            }
            l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP7, fetVar);
            Object[] objArr5 = new Object[0];
            boolean zG5 = fetVar.g(pz40VarY);
            Object objP8 = fetVar.P();
            if (zG5 || objP8 == cl5Var) {
                objP8 = new f7f0(pz40VarY, (byte) 13);
                fetVar.o0(objP8);
            }
            l7m0 l7m0VarY5 = v3c.Y(objArr5, (Function0) objP8, fetVar);
            boolean zI3 = fetVar.i(fpk0Var);
            Object objP9 = fetVar.P();
            if (zI3 || objP9 == cl5Var) {
                objP9 = new cpk0(fpk0Var, b);
                fetVar.o0(objP9);
            }
            knx.i(false, (Function0) objP9, fetVar, 0, 1);
            Object objP10 = fetVar.P();
            if (objP10 == cl5Var) {
                objP10 = new yjt(new h7m(fB, f3dVarH0, (byte) 3));
                fetVar.o0(objP10);
            }
            yjt yjtVar = (yjt) objP10;
            Unit unit = Unit.f46060a;
            boolean zG6 = fetVar.g(f3dVarH0) | fetVar.g(l7m0VarY5) | fetVar.i(qno0Var);
            Object objP11 = fetVar.P();
            if (zG6 || objP11 == cl5Var) {
                w82Var = new w82(f3dVarH0, l7m0VarY5, qno0Var, yjeVar, (byte) 1);
                fetVar.o0(w82Var);
            } else {
                w82Var = objP11;
            }
            m0x0.t(fetVar, unit, (Function2) w82Var);
            Float fValueOf = Float.valueOf(f3dVarH0.d());
            boolean zG7 = fetVar.g(f3dVarH0) | fetVar.i(cjv0Var);
            Object objP12 = fetVar.P();
            if (zG7 || objP12 == cl5Var) {
                objP12 = new bai0(f3dVarH0, cjv0Var, yjeVar, (byte) 25);
                fetVar.o0(objP12);
            }
            m0x0.t(fetVar, fValueOf, (Function2) objP12);
            jwb.c(fww.z(o7k0.c, true, (vj50) f3dVarH0.g.getValue()), 16.0f, u1c.M(-1437008496, new hgs0(f3dVarH0, fpk0Var, l7m0VarY3, l7m0VarY2, l7m0VarY), fetVar), u1c.M(1522585071, new s49(l7m0VarY5, yjtVar, l7m0VarY4, fpk0Var, f3dVarH0, qno0Var, (byte) 8), fetVar), fetVar, 3456);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2) {
        v3s0 v3s0Var = (v3s0) this.b;
        a8z a8zVar = v3s0Var.R1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        y2m0 y2m0Var = v3s0.S1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zI = fetVar.i(v3s0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new r3s0(v3s0Var, (byte) 1);
                fetVar.o0(objP);
            }
            knx.i(false, (Function0) objP, fetVar, 0, 1);
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI2 = fetVar.i(v3s0Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                mjr0 mjr0Var = new mjr0(1, v3s0Var, v3s0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/impl/tournaments/presentation/models/tournament_prizes/TournamentPrizesSideEffect;)V", 0, (byte) 23);
                fetVar.o0(mjr0Var);
                objP2 = mjr0Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP2), fetVar);
            boolean zI3 = fetVar.i(k3t0Var) | fetVar.i(v3s0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                tmj0 tmj0Var = new tmj0(k3t0Var, v3s0Var, pz40VarF, null, (byte) 17);
                fetVar.o0(tmj0Var);
                objP3 = tmj0Var;
            }
            m0x0.t(fetVar, v3s0Var, (Function2) objP3);
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
            n0q n0qVar = o7k0.c;
            k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
            boolean zI4 = fetVar.i(k3t0Var2);
            Object objP4 = fetVar.P();
            if (zI4 || objP4 == cl5Var) {
                mjr0 mjr0Var2 = new mjr0(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 24);
                fetVar.o0(mjr0Var2);
                objP4 = mjr0Var2;
            }
            ccq0.R(6, fetVar, n0qVar, pz40VarY, (Function1) ((jhy) objP4));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2) {
        a6s0 a6s0Var = (a6s0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        j6m0 j6m0Var = a6s0.S1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            k3t0 k3t0VarG0 = a6s0Var.G0();
            boolean zI = fetVar.i(a6s0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                mjr0 mjr0Var = new mjr0(1, a6s0Var, a6s0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/impl/tournaments/presentation/models/tournament_stage_prizes/TournamentStagePrizesSideEffect;)V", 0, (byte) 25);
                fetVar.o0(mjr0Var);
                objP = mjr0Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(a6s0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                tmj0 tmj0Var = new tmj0(k3t0VarG0, a6s0Var, pz40VarF, null, (byte) 18);
                fetVar.o0(tmj0Var);
                objP2 = tmj0Var;
            }
            m0x0.t(fetVar, a6s0Var, (Function2) objP2);
            pz40 pz40VarY = ((i3t0) a6s0Var.G0()).y(fetVar);
            n0q n0qVar = o7k0.c;
            k3t0 k3t0VarG1 = a6s0Var.G0();
            boolean zI3 = fetVar.i(k3t0VarG1);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                mjr0 mjr0Var2 = new mjr0(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 26);
                fetVar.o0(mjr0Var2);
                objP3 = mjr0Var2;
            }
            jiq0.g0(6, fetVar, n0qVar, pz40VarY, (Function1) ((jhy) objP3));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2) {
        z6s0 z6s0Var = (z6s0) this.b;
        a8z a8zVar = z6s0Var.R1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        m6m0 m6m0Var = z6s0.S1;
        byte b = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zI = fetVar.i(z6s0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new w6s0(z6s0Var, b);
                fetVar.o0(objP);
            }
            knx.i(false, (Function0) objP, fetVar, 0, 1);
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI2 = fetVar.i(z6s0Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                mjr0 mjr0Var = new mjr0(1, z6s0Var, z6s0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/impl/tournaments/presentation/models/tournament_stages/TournamentStagesSideEffect;)V", 0, (byte) 27);
                fetVar.o0(mjr0Var);
                objP2 = mjr0Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP2), fetVar);
            boolean zI3 = fetVar.i(k3t0Var) | fetVar.i(z6s0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                tmj0 tmj0Var = new tmj0(k3t0Var, z6s0Var, pz40VarF, null, (byte) 19);
                fetVar.o0(tmj0Var);
                objP3 = tmj0Var;
            }
            m0x0.t(fetVar, z6s0Var, (Function2) objP3);
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
            n0q n0qVar = o7k0.c;
            k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
            boolean zI4 = fetVar.i(k3t0Var2);
            Object objP4 = fetVar.P();
            if (zI4 || objP4 == cl5Var) {
                mjr0 mjr0Var2 = new mjr0(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 28);
                fetVar.o0(mjr0Var2);
                objP4 = mjr0Var2;
            }
            bsr0.R(6, fetVar, n0qVar, pz40VarY, (Function1) ((jhy) objP4));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2) {
        mas0 mas0Var = (mas0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        g9m0 g9m0Var = mas0.Q1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            k3t0 k3t0VarG0 = mas0Var.G0();
            boolean zI = fetVar.i(mas0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                las0 las0Var = new las0(1, mas0Var, mas0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/impl/tournaments/presentation/tournament_providers/models/TournamentsProvidersSideEffect;)V", 0, (byte) 0);
                fetVar.o0(las0Var);
                objP = las0Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(mas0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                tmj0 tmj0Var = new tmj0(k3t0VarG0, mas0Var, pz40VarF, null, (byte) 20);
                fetVar.o0(tmj0Var);
                objP2 = tmj0Var;
            }
            m0x0.t(fetVar, mas0Var, (Function2) objP2);
            pz40 pz40VarY = ((i3t0) mas0Var.G0()).y(fetVar);
            mm40 mm40VarQ = i120.Q(yyw.X(o7k0.c, null, fetVar, 1), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            k3t0 k3t0VarG1 = mas0Var.G0();
            boolean zI3 = fetVar.i(k3t0VarG1);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                las0 las0Var2 = new las0(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 1);
                fetVar.o0(las0Var2);
                objP3 = las0Var2;
            }
            rsr0.T(0, fetVar, mm40VarQ, pz40VarY, (Function1) ((jhy) objP3));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object v(Object obj, Object obj2) {
        zcs0 zcs0Var = (zcs0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        s2m0 s2m0Var = zcs0.O1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            k3t0 k3t0VarG0 = zcs0Var.G0();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            boolean zI = fetVar.i(zcs0Var);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                las0 las0Var = new las0(1, zcs0Var, zcs0.class, "handleAltSportTrackedSideEffect", "handleAltSportTrackedSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_tracked/models/AltSportTrackedSideEffect;)V", 0, (byte) 2);
                fetVar.o0(las0Var);
                objP2 = las0Var;
            }
            Function1 function1 = (Function1) ((jhy) objP2);
            Unit unit = Unit.f46060a;
            boolean zI2 = fetVar.i(vneVar) | fetVar.i(k3t0VarG0) | fetVar.g(function1) | fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new ggc0(vneVar, k3t0VarG0, function1, (byte) 14);
                fetVar.o0(objP3);
            }
            m0x0.o(unit, (Function1) objP3, fetVar);
            ol2 ol2Var = (ol2) ((i3t0) zcs0Var.G0()).y(fetVar).getValue();
            mm40 mm40VarH = phu0.H(jm40.b, null, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarH);
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
            imm immVar = ol2Var.f25433a;
            boolean zI3 = fetVar.i(zcs0Var);
            Object objP4 = fetVar.P();
            if (zI3 || objP4 == cl5Var) {
                objP4 = new xcs0(zcs0Var, (byte) 4);
                fetVar.o0(objP4);
            }
            Function0 function0 = (Function0) objP4;
            boolean zI4 = fetVar.i(zcs0Var);
            Object objP5 = fetVar.P();
            if (zI4 || objP5 == cl5Var) {
                objP5 = new lcr0(zcs0Var, (byte) 12);
                fetVar.o0(objP5);
            }
            hlm.c(null, immVar, null, function0, null, (Function1) objP5, null, null, null, null, null, null, fetVar, 0, 0, 4053);
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            bdz bdzVar = (bdz) zcs0Var.K1.getValue();
            zcl zclVar = qmk.f28987a;
            k3t0 k3t0VarG1 = zcs0Var.G0();
            boolean zI5 = fetVar.i(k3t0VarG1);
            Object objP6 = fetVar.P();
            if (zI5 || objP6 == cl5Var) {
                las0 las0Var2 = new las0(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                fetVar.o0(las0Var2);
                objP6 = las0Var2;
            }
            vbw0.c(mm40VarQ, bdzVar, null, ol2Var, 12.0f, (Function1) ((jhy) objP6), fetVar, 384, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object w(Object obj, Object obj2) {
        qss0 qss0Var = (qss0) this.b;
        a8z a8zVar = qss0Var.Q1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        j6m0 j6m0Var = qss0.R1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z = qss0Var.M1;
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                las0 las0Var = new las0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 6);
                fetVar.o0(las0Var);
                objP = las0Var;
            }
            i4w0.M(n0qVar, pz40VarY, z, (Function1) ((jhy) objP), fetVar, 6);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object x(Object obj, Object obj2) {
        nmu0 nmu0Var = (nmu0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        svs0 svs0Var = nmu0.O1;
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(nmu0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new lmu0(nmu0Var, b);
                fetVar.o0(objP);
            }
            m0x0.o(unit, (Function1) objP, fetVar);
            k3t0 k3t0VarH0 = nmu0Var.H0();
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            boolean zI2 = fetVar.i(nmu0Var);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                las0 las0Var = new las0(1, nmu0Var, nmu0.class, "handleViewedTabSideEffect", "handleViewedTabSideEffect(Lorg/xplatform/favorites/impl/presentation/viewed/compose/models/AltViewedSideEffect;)V", 0, (byte) 21);
                fetVar.o0(las0Var);
                objP3 = las0Var;
            }
            Function1 function1 = (Function1) ((jhy) objP3);
            boolean zI3 = fetVar.i(vneVar) | fetVar.i(k3t0VarH0) | fetVar.g(function1) | fetVar.g(null);
            Object objP4 = fetVar.P();
            if (zI3 || objP4 == cl5Var) {
                objP4 = new ggc0(vneVar, k3t0VarH0, function1, (byte) 15);
                fetVar.o0(objP4);
            }
            m0x0.o(unit, (Function1) objP4, fetVar);
            pn2 pn2Var = (pn2) ((i3t0) nmu0Var.H0()).y(fetVar).getValue();
            mm40 mm40VarH = phu0.H(jm40.b, null, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarH);
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
            imm immVar = pn2Var.f27263a;
            boolean zI4 = fetVar.i(nmu0Var);
            Object objP5 = fetVar.P();
            if (zI4 || objP5 == cl5Var) {
                objP5 = new kmu0(nmu0Var, (byte) 3);
                fetVar.o0(objP5);
            }
            Function0 function0 = (Function0) objP5;
            boolean zI5 = fetVar.i(nmu0Var);
            Object objP6 = fetVar.P();
            if (zI5 || objP6 == cl5Var) {
                objP6 = new lmu0(nmu0Var, b2);
                fetVar.o0(objP6);
            }
            hlm.c(null, immVar, null, function0, null, (Function1) objP6, null, null, null, null, null, null, fetVar, 0, 0, 4053);
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            zcl zclVar = qmk.f28987a;
            bdz bdzVar = (bdz) nmu0Var.K1.getValue();
            k3t0 k3t0VarH1 = nmu0Var.H0();
            boolean zI6 = fetVar.i(k3t0VarH1);
            Object objP7 = fetVar.P();
            if (zI6 || objP7 == cl5Var) {
                las0 las0Var2 = new las0(1, k3t0VarH1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                fetVar.o0(las0Var2);
                objP7 = las0Var2;
            }
            nnw0.o(mm40VarQ, null, bdzVar, pn2Var, 12.0f, (Function1) ((jhy) objP7), fetVar, 48, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object y(Object obj, Object obj2) {
        long j;
        ccv0 ccv0Var = (ccv0) this.b;
        n0o0 n0o0Var = ccv0Var.P1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        uxs0 uxs0Var = ccv0.Q1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zI = fetVar.i(ccv0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new zbv0(ccv0Var, (byte) 3);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(ccv0Var);
            Object objP2 = fetVar.P();
            byte b = 4;
            if (zI2 || objP2 == cl5Var) {
                objP2 = new zbv0(ccv0Var, b);
                fetVar.o0(objP2);
            }
            v3c.A(function0, (Function0) objP2, null, fetVar, 0, 4);
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                ((qzi) n0o0Var.getValue()).getClass();
                objP3 = new y3k0();
                fetVar.o0(objP3);
            }
            y3k0 y3k0Var = (y3k0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                ((qzi) n0o0Var.getValue()).getClass();
                objP4 = new xhv();
                fetVar.o0(objP4);
            }
            xhv xhvVar = (xhv) objP4;
            pz40 pz40VarY = ((i3t0) ccv0Var.H0()).y(fetVar);
            String strW = rsm0.w(R.string.special_events_who_win, 0, fetVar);
            pz40 pz40Var = s6t0.f31722a;
            long secondary = s6t0.b().f33626a.getSecondary();
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            boolean zG = fetVar.g(strW) | fetVar.f(secondary) | fetVar.f(backgroundContent);
            Object objP5 = fetVar.P();
            if (zG || objP5 == cl5Var) {
                j = backgroundContent;
                objP5 = new imm(new ilm(secondary), new plm(strW, secondary, fa50.f9191a), fmm.f9790a, j, false, null);
                fetVar.o0(objP5);
            } else {
                j = backgroundContent;
            }
            ltt0.k(438, u1c.M(1408379387, new wis0((imm) objP5, ccv0Var, b), fetVar), u1c.M(-597111492, new acv0(pz40VarY, ccv0Var, j, xhvVar, y3k0Var), fetVar), fetVar, o7k0.c);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object z(Object obj, Object obj2) {
        bgv0 bgv0Var = (bgv0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        wxs0 wxs0Var = bgv0.L1;
        byte b = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objP = fetVar.P();
            Object obj3 = ukd.f35823a;
            if (objP == obj3) {
                objP = a4n0.f(bgv0Var);
                fetVar.o0(objP);
            }
            i1w0 i1w0Var = (i1w0) objP;
            String name = szi.class.getName();
            Context applicationContext = ((Context) fetVar.k(dy2.b)).getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application == null) {
                throw new ss3((byte) 0);
            }
            riu0 riu0VarA = ms00.a(fetVar);
            if (riu0VarA == null) {
                throw new tiu0();
            }
            Object objP2 = fetVar.P();
            if (objP2 == obj3) {
                objP2 = new rlb0(application, i1w0Var, (byte) 5);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean zG = fetVar.g(riu0VarA) | fetVar.g(name);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj3) {
                ojg ojgVar = new ojg((byte) 1);
                zfc zfcVar = new zfc(function0, (byte) 12);
                tre0 tre0Var = sre0.f32672a;
                ojgVar.a(tre0Var.b(kgd.class), zfcVar);
                qbx qbxVarB = ojgVar.b();
                piu0 piu0VarG = riu0VarA.g();
                vbf vbfVar = vbf.b;
                piu0VarG.getClass();
                vbfVar.getClass();
                objP3 = (kgd) new h0q0(piu0VarG, qbxVarB, vbfVar).t(tre0Var.b(kgd.class), name);
                fetVar.o0(objP3);
            }
            Object obj4 = ((kgd) objP3).b;
            if (obj4 == null) {
                hny.u("null cannot be cast to non-null type org.xplatform.wild_free_bet.impl.di.WildFreeBetComponent");
                return null;
            }
            szi sziVar = (szi) obj4;
            Object objP4 = fetVar.P();
            if (objP4 == obj3) {
                objP4 = sziVar.a();
                fetVar.o0(objP4);
            }
            i3t0 i3t0Var = (i3t0) n4c.Y(sre0.f32672a.b(mgv0.class), null, (fiu0) objP4, fetVar, 14);
            ggv0 ggv0Var = (ggv0) i3t0Var.y(fetVar).getValue();
            Object objP5 = fetVar.P();
            if (objP5 == obj3) {
                objP5 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP5);
            }
            vne vneVar = (vne) objP5;
            boolean zI = fetVar.i(i3t0Var);
            Object objP6 = fetVar.P();
            if (zI || objP6 == obj3) {
                objP6 = new d4u0(i3t0Var, (byte) 29);
                fetVar.o0(objP6);
            }
            Function1 function1 = (Function1) objP6;
            Unit unit = Unit.f46060a;
            boolean zI2 = fetVar.i(vneVar) | fetVar.i(i3t0Var) | fetVar.g(function1) | fetVar.g(null);
            Object objP7 = fetVar.P();
            if (zI2 || objP7 == obj3) {
                objP7 = new abo0(vneVar, i3t0Var, function1, b);
                fetVar.o0(objP7);
            }
            m0x0.o(unit, (Function1) objP7, fetVar);
            n0q n0qVar = o7k0.c;
            boolean zI3 = fetVar.i(i3t0Var);
            Object objP8 = fetVar.P();
            if (zI3 || objP8 == obj3) {
                Object wzu0Var = new wzu0(1, i3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                fetVar.o0(wzu0Var);
                objP8 = wzu0Var;
            }
            lv00.P(n0qVar, ggv0Var, (Function1) ((jhy) objP8), fetVar, 6);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        clz clzVar;
        boolean z;
        m6f0 m6f0Var;
        avg0 avg0Var;
        Object value;
        jv jvVar;
        byte b = this.f15110a;
        byte b2 = 21;
        byte b3 = 10;
        jm40 jm40Var = jm40.b;
        byte b4 = 4;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        Object obj3 = this.b;
        byte b5 = 2;
        byte b6 = 1;
        byte b7 = 3;
        switch (b) {
            case 0:
                kob0 kob0Var = (kob0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                rl70 rl70Var = kob0.R1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40VarY = ((i3t0) kob0Var.G0()).y(fetVar);
                    k3t0 k3t0VarG0 = kob0Var.G0();
                    boolean zI = fetVar.i(kob0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        e9b0 e9b0Var = new e9b0(1, kob0Var, kob0.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/bet_history/powerbet/presentation/model/PowerBetSideEffect;)V", 0, (byte) 14);
                        fetVar.o0(e9b0Var);
                        objP = e9b0Var;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                    boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(kob0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        nu80 nu80Var = new nu80(k3t0VarG0, kob0Var, pz40VarF, null, (byte) 9);
                        fetVar.o0(nu80Var);
                        objP2 = nu80Var;
                    }
                    m0x0.t(fetVar, kob0Var, (Function2) objP2);
                    n0q n0qVar = o7k0.c;
                    k3t0 k3t0VarG1 = kob0Var.G0();
                    boolean zI3 = fetVar.i(k3t0VarG1);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        e9b0 e9b0Var2 = new e9b0(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 15);
                        fetVar.o0(e9b0Var2);
                        objP3 = e9b0Var2;
                    }
                    x4d0.Q(6, fetVar, n0qVar, pz40VarY, (Function1) ((jhy) objP3));
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                xls xlsVar = (xls) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40VarD, 88.0f), "PREVIOUS_MAPS_ITEM_ROW");
                    thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    mm40 mm40VarC = o7k0.c(s5x0.N(jm40Var2, 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f);
                    zhg0 zhg0Var = zhg0.f44392a;
                    unh0.a0(gqw0.m, zhg0Var.a(1.0f, mm40VarC, true), xlsVar.f41090a, xlsVar.b, xlsVar.c, fetVar2, 6);
                    unh0.Z(0, xlsVar, fetVar2, zhg0Var.a(1.0f, jm40Var2, true).e(o7k0.c));
                    unh0.a0(gqw0.o, zhg0Var.a(1.0f, o7k0.c(s5x0.N(jm40Var2, 0.0f, 0.0f, 16.0f, 0.0f, 11), 1.0f), true), xlsVar.d, xlsVar.e, xlsVar.f, fetVar2, 6);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                n9c0 n9c0Var = (n9c0) obj3;
                a8z a8zVar = n9c0Var.R1;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                fl70 fl70Var = n9c0.S1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pz40 pz40VarY2 = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar3);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI4 = fetVar3.i(n9c0Var);
                    Object objP4 = fetVar3.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new l8c0(1, n9c0Var, n9c0.class, "handleSideEffects", "handleSideEffects(Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/models/PromoCheckSideEffect;)V", 0, (byte) 5);
                        fetVar3.o0(objP4);
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) ((jhy) objP4), fetVar3);
                    boolean zI5 = fetVar3.i(k3t0Var) | fetVar3.i(n9c0Var) | fetVar3.e(3) | fetVar3.g(pz40VarF2);
                    Object objP5 = fetVar3.P();
                    if (zI5 || objP5 == cl5Var) {
                        objP5 = new nu80(k3t0Var, n9c0Var, pz40VarF2, null, (byte) 10);
                        fetVar3.o0(objP5);
                    }
                    m0x0.t(fetVar3, n9c0Var, (Function2) objP5);
                    nac0 nac0Var = (nac0) pz40VarY2.getValue();
                    k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
                    boolean zI6 = fetVar3.i(k3t0Var2);
                    Object objP6 = fetVar3.P();
                    if (zI6 || objP6 == cl5Var) {
                        objP6 = new l8c0(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 6);
                        fetVar3.o0(objP6);
                    }
                    Function1 function1 = (Function1) ((jhy) objP6);
                    nac0Var.getClass();
                    function1.getClass();
                    boolean z2 = ((tly) g8x.U(0, fetVar3, 1).getValue()).f34169a;
                    Object[] objArr = new Object[0];
                    Object objP7 = fetVar3.P();
                    if (objP7 == cl5Var) {
                        objP7 = new npa0((byte) 27);
                        fetVar3.o0(objP7);
                    }
                    pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP7, fetVar3, 48);
                    pkk0 pkk0Var = (pkk0) fetVar3.k(bmd.q);
                    Object objP8 = fetVar3.P();
                    if (objP8 == cl5Var) {
                        objP8 = new cqq();
                        fetVar3.o0(objP8);
                    }
                    cqq cqqVar = (cqq) objP8;
                    Object[] objArr2 = new Object[0];
                    Object objP9 = fetVar3.P();
                    if (objP9 == cl5Var) {
                        objP9 = new npa0((byte) 29);
                        fetVar3.o0(objP9);
                    }
                    pz40 pz40Var2 = (pz40) e9x.Q(objArr2, (Function0) objP9, fetVar3, 48);
                    clz clzVar2 = (clz) fetVar3.k(or00.f25714a);
                    Boolean bool = (Boolean) pz40Var2.getValue();
                    bool.booleanValue();
                    boolean z3 = nac0Var.c;
                    fdc0 fdc0Var = nac0Var.b;
                    Boolean boolValueOf = Boolean.valueOf(z3);
                    boolean zG = fetVar3.g(pz40Var2) | fetVar3.i(nac0Var) | fetVar3.g(pkk0Var) | fetVar3.i(clzVar2);
                    Object objP10 = fetVar3.P();
                    if (zG || objP10 == cl5Var) {
                        objP10 = new dg(clzVar2, nac0Var, cqqVar, pkk0Var, pz40Var2, (byte) 24);
                        clzVar = clzVar2;
                        fetVar3.o0(objP10);
                    } else {
                        clzVar = clzVar2;
                    }
                    m0x0.m(clzVar, bool, boolValueOf, (Function1) objP10, fetVar3);
                    boolean zG2 = fetVar3.g(function1);
                    Object objP11 = fetVar3.P();
                    if (zG2 || objP11 == cl5Var) {
                        objP11 = new bac0(function1, b6);
                        fetVar3.o0(objP11);
                    }
                    Function0 function0 = (Function0) objP11;
                    boolean zG3 = fetVar3.g(function1);
                    Object objP12 = fetVar3.P();
                    if (zG3 || objP12 == cl5Var) {
                        objP12 = new bac0(function1, (byte) 3);
                        fetVar3.o0(objP12);
                    }
                    v3c.z(function0, (Function0) objP12, null, fetVar3, 0, 4);
                    mm40 mm40VarS = o050.S(o050.W(o2e.e0(o7k0.c, "PROMO_CHECK_SCREEN")));
                    pz40 pz40Var3 = s6t0.f31722a;
                    long background = s6t0.b().f33626a.getBackground();
                    ljc ljcVar = jd8.n;
                    mm40 mm40VarQ = i120.Q(mm40VarS, background, ljcVar);
                    mw3 mw3Var = uc9.c;
                    xx7 xx7Var = gqw0.m;
                    x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar3, 0);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarQ);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    shd shdVar = gqw0.x;
                    jpm0.o(fetVar3, x5dVarA, shdVar);
                    shd shdVar2 = gqw0.w;
                    jpm0.o(fetVar3, bh90VarM2, shdVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    shd shdVar3 = gqw0.y;
                    jpm0.o(fetVar3, numValueOf, shdVar3);
                    jpm0.n(fetVar3);
                    shd shdVar4 = gqw0.v;
                    jpm0.o(fetVar3, mm40VarC1, shdVar4);
                    imm immVar = nac0Var.f23184a;
                    boolean zG4 = fetVar3.g(function1);
                    Object objP13 = fetVar3.P();
                    if (zG4 || objP13 == cl5Var) {
                        objP13 = new bac0(function1, (byte) 4);
                        fetVar3.o0(objP13);
                    }
                    hlm.c(null, immVar, null, (Function0) objP13, null, null, null, null, null, null, null, null, fetVar3, 0, 0, 4085);
                    if (fdc0Var != null) {
                        boolean z4 = fdc0Var instanceof edc0;
                        mm40 mm40VarP = jm40.b;
                        if (z4) {
                            fetVar3.e0(319403762);
                            zcl zclVar2 = qmk.f28987a;
                            mm40 mm40VarH = dw9.h(1.0f, s5x0.L(mm40VarP, 12.0f, 0.0f, 2), true);
                            xx7 xx7Var2 = gqw0.n;
                            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var2, fetVar3, 48);
                            int iHashCode3 = Long.hashCode(fetVar3.T);
                            bh90 bh90VarM3 = fetVar3.m();
                            mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarH);
                            fetVar3.i0();
                            if (fetVar3.S) {
                                fetVar3.l(pcyVar);
                            } else {
                                fetVar3.r0();
                            }
                            jpm0.o(fetVar3, x5dVarA2, shdVar);
                            jpm0.o(fetVar3, bh90VarM3, shdVar2);
                            vqd.u(iHashCode3, fetVar3, shdVar3, fetVar3);
                            mm40 mm40VarD2 = o7k0.d(s5x0.L(ohs0.i(fetVar3, mm40VarC2, shdVar4, 1.0f, false), 0.0f, 12.0f, 1), 1.0f);
                            zcl zclVar3 = qmk.k;
                            ugg0 ugg0Var = vgg0.f37379a;
                            mm40 mm40VarE = h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarD2);
                            zfn zfnVar = zaq0.b;
                            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarE, ((ThemeColors) fetVar3.k(zfnVar)).getBackgroundContent(), ljcVar), 16.0f);
                            qw3 qw3Var = new qw3(16.0f, true, new jf4((byte) 14));
                            boolean zI7 = fetVar3.i(nac0Var);
                            Object objP14 = fetVar3.P();
                            if (zI7 || objP14 == cl5Var) {
                                objP14 = new ppb0(nac0Var, (byte) 11);
                                fetVar3.o0(objP14);
                            }
                            b8k0.e(mm40VarJ, null, null, qw3Var, xx7Var2, null, false, null, (Function1) objP14, fetVar3, 196608, 462);
                            edc0 edc0Var = (edc0) fdc0Var;
                            v8q0.a(edc0Var.c, s5x0.N(mm40VarP, 0.0f, 0.0f, 0.0f, 12.0f, 7), ((ThemeColors) fetVar3.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, 0, 384, 125944);
                            fetVar3.r(true);
                            WeakHashMap weakHashMap = djv0.w;
                            mm40 mm40VarL = j120.L(mm40VarP, zcm0.i(fetVar3).e);
                            if (z2) {
                                mm40VarP = o050.P(mm40VarP);
                            }
                            mm40 mm40VarE2 = mm40VarL.e(mm40VarP);
                            mtl mtlVar = edc0Var.d;
                            boolean zG5 = fetVar3.g(function1) | fetVar3.g(pz40Var);
                            Object objP15 = fetVar3.P();
                            if (zG5 || objP15 == cl5Var) {
                                objP15 = new jg2(function1, pz40Var, (byte) 22);
                                fetVar3.o0(objP15);
                            }
                            bkb.f(mm40VarE2, mtlVar, null, false, null, (Function1) objP15, fetVar3, 3072, 20);
                            fetVar3.r(false);
                        } else if (fdc0Var instanceof ddc0) {
                            x7z x7zVarF = rz4.f(fetVar3, 322516193, 1.0f, true);
                            x5d x5dVarA3 = w5d.a(mw3Var, xx7Var, fetVar3, 0);
                            int iHashCode4 = Long.hashCode(fetVar3.T);
                            bh90 bh90VarM4 = fetVar3.m();
                            mm40 mm40VarC3 = kbc.c0(fetVar3, x7zVarF);
                            fetVar3.i0();
                            if (fetVar3.S) {
                                fetVar3.l(pcyVar);
                            } else {
                                fetVar3.r0();
                            }
                            jpm0.o(fetVar3, x5dVarA3, shdVar);
                            jpm0.o(fetVar3, bh90VarM4, shdVar2);
                            vqd.u(iHashCode4, fetVar3, shdVar3, fetVar3);
                            jpm0.o(fetVar3, mm40VarC3, shdVar4);
                            zcl zclVar4 = qmk.f28987a;
                            mm40 mm40VarD3 = o7k0.d(s5x0.K(mm40VarP, 12.0f, 16.0f), 1.0f);
                            zcl zclVar5 = qmk.k;
                            ugg0 ugg0Var2 = vgg0.f37379a;
                            mm40 mm40VarE3 = h97.e(zclVar5, zclVar5, zclVar5, zclVar5, mm40VarD3);
                            zfn zfnVar2 = zaq0.b;
                            mm40 mm40VarJ2 = s5x0.J(i120.Q(mm40VarE3, ((ThemeColors) fetVar3.k(zfnVar2)).getBackgroundContent(), ljcVar), 16.0f);
                            x5d x5dVarA4 = w5d.a(mw3Var, xx7Var, fetVar3, 0);
                            int iHashCode5 = Long.hashCode(fetVar3.T);
                            bh90 bh90VarM5 = fetVar3.m();
                            mm40 mm40VarC4 = kbc.c0(fetVar3, mm40VarJ2);
                            fetVar3.i0();
                            if (fetVar3.S) {
                                fetVar3.l(pcyVar);
                            } else {
                                fetVar3.r0();
                            }
                            jpm0.o(fetVar3, x5dVarA4, shdVar);
                            jpm0.o(fetVar3, bh90VarM5, shdVar2);
                            vqd.u(iHashCode5, fetVar3, shdVar3, fetVar3);
                            jpm0.o(fetVar3, mm40VarC4, shdVar4);
                            ddc0 ddc0Var = (ddc0) fdc0Var;
                            v8q0.a(ddc0Var.b, null, ((ThemeColors) fetVar3.k(zfnVar2)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, 0, 384, 126970);
                            p6q0 h6q0Var = ((String) pz40Var.getValue()).length() > 0 ? new h6q0() : o6q0.f24750a;
                            mm40 mm40VarB0 = y860.b0(s5x0.N(mm40VarP, 0.0f, 12.0f, 0.0f, 0.0f, 13), cqqVar);
                            boolean zG6 = fetVar3.g(pz40Var2) | fetVar3.g(function1);
                            Object objP16 = fetVar3.P();
                            if (zG6 || objP16 == cl5Var) {
                                objP16 = new jg2(function1, pz40Var2, (byte) 20);
                                fetVar3.o0(objP16);
                            }
                            mm40 mm40VarB1 = j120.b0(mm40VarB0, (Function1) objP16);
                            c6q0 c6q0Var = new c6q0(ddc0Var.f5890a, e6q0.f7299a, h6q0Var, new s7q0(ddc0Var.d ? ddc0Var.e : ""), true, ddc0Var.d, null, ddc0Var.c, "", false, 0, null, 260224);
                            boolean zG7 = fetVar3.g(function1) | fetVar3.g(pz40Var);
                            Object objP17 = fetVar3.P();
                            if (zG7 || objP17 == cl5Var) {
                                objP17 = new jg2(function1, pz40Var, (byte) 21);
                                fetVar3.o0(objP17);
                            }
                            wvb.t(mm40VarB1, c6q0Var, 0, null, (Function1) objP17, fetVar3, 0, 12);
                            fetVar3.r(true);
                            fetVar3.r(true);
                            WeakHashMap weakHashMap2 = djv0.w;
                            mm40 mm40VarL2 = j120.L(mm40VarP, zcm0.i(fetVar3).e);
                            if (z2) {
                                mm40VarP = o050.P(mm40VarP);
                            }
                            mm40 mm40VarE4 = mm40VarL2.e(mm40VarP);
                            mtl mtlVar2 = ddc0Var.f;
                            boolean zG8 = fetVar3.g(pkk0Var) | fetVar3.g(function1) | fetVar3.g(pz40Var);
                            Object objP18 = fetVar3.P();
                            if (zG8 || objP18 == cl5Var) {
                                objP18 = new zlb0(pkk0Var, function1, pz40Var, (byte) 4);
                                fetVar3.o0(objP18);
                            }
                            bkb.f(mm40VarE4, mtlVar2, null, false, null, (Function1) objP18, fetVar3, 3072, 20);
                            fetVar3.r(false);
                        } else {
                            z = false;
                        }
                        fetVar3.r(true);
                    } else {
                        z = false;
                    }
                    throw b1j.f(980136596, fetVar3, z);
                }
                fetVar3.X();
                return Unit.f46060a;
            case 3:
                bnc0 bnc0Var = (bnc0) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    n0q n0qVar2 = o7k0.c;
                    zcl zclVar6 = qmk.f28987a;
                    lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
                    boolean zG9 = fetVar4.g(bnc0Var);
                    Object objP19 = fetVar4.P();
                    if (zG9 || objP19 == cl5Var) {
                        objP19 = new ppb0(bnc0Var, b2);
                        fetVar4.o0(objP19);
                    }
                    b8k0.e(n0qVar2, null, lh80VarU, null, null, null, false, null, (Function1) objP19, fetVar4, 6, 506);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                qrd0 qrd0Var = (qrd0) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    n0q n0qVar3 = o7k0.c;
                    Object objP20 = fetVar5.P();
                    if (objP20 == cl5Var) {
                        objP20 = new bod0(b4);
                        fetVar5.o0(objP20);
                    }
                    Function1 function2 = (Function1) objP20;
                    boolean zI8 = fetVar5.i(qrd0Var);
                    Object objP21 = fetVar5.P();
                    if (zI8 || objP21 == cl5Var) {
                        objP21 = new v6d0(qrd0Var, b3);
                        fetVar5.o0(objP21);
                    }
                    dwi0.b(function2, n0qVar3, (Function1) objP21, fetVar5, 54, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                m6f0 m6f0Var2 = (m6f0) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                gle0 gle0Var = m6f0.f2;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    d7f0 d7f0VarL0 = m6f0Var2.L0();
                    int i = d7f0.M;
                    pz40 pz40VarY3 = d7f0VarL0.y(fetVar6);
                    d7f0 d7f0VarL1 = m6f0Var2.L0();
                    boolean zI9 = fetVar6.i(m6f0Var2);
                    Object objP22 = fetVar6.P();
                    if (zI9 || objP22 == cl5Var) {
                        m6f0Var = m6f0Var2;
                        qye0 qye0Var = new qye0(1, m6f0Var, m6f0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/registration/success/impl/presentation/models/RegistrationSuccessSideEffect;)V", 0, (byte) 12);
                        fetVar6.o0(qye0Var);
                        objP22 = qye0Var;
                    } else {
                        m6f0Var = m6f0Var2;
                    }
                    clz clzVar3 = (clz) fetVar6.k(or00.f25714a);
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP22), fetVar6);
                    boolean zE = fetVar6.e(3) | fetVar6.i(d7f0VarL1) | fetVar6.i(clzVar3) | fetVar6.g(pz40VarF3);
                    Object objP23 = fetVar6.P();
                    if (zE || objP23 == cl5Var) {
                        kc70 kc70Var = new kc70(d7f0VarL1, clzVar3, pz40VarF3, null, (byte) 13);
                        fetVar6.o0(kc70Var);
                        objP23 = kc70Var;
                    }
                    m0x0.t(fetVar6, clzVar3, (Function2) objP23);
                    mm40 mm40VarS2 = o050.S(o7k0.c);
                    Object objP24 = fetVar6.P();
                    if (objP24 == cl5Var) {
                        objP24 = new bue0(b3);
                        fetVar6.o0(objP24);
                    }
                    mm40 mm40VarK = rq8.K(mm40VarS2, (Function1) objP24);
                    d7f0 d7f0VarL2 = m6f0Var.L0();
                    boolean zI10 = fetVar6.i(d7f0VarL2);
                    Object objP25 = fetVar6.P();
                    if (zI10 || objP25 == cl5Var) {
                        qye0 qye0Var2 = new qye0(1, d7f0VarL2, d7f0.class, "onAction", "onAction(Lorg/xplatform/registration/success/impl/presentation/models/RegistrationSuccessAction;)V", 0, (byte) 13);
                        fetVar6.o0(qye0Var2);
                        objP25 = qye0Var2;
                    }
                    y9a.I(0, fetVar6, mm40VarK, pz40VarY3, (Function1) ((jhy) objP25));
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                fdf0 fdf0Var = (fdf0) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                lme0 lme0Var = fdf0.R1;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    zcl zclVar7 = qmk.f28987a;
                    float f = qmk.a(fetVar7).c;
                    if (fdf0Var.L1 == null) {
                        Intrinsics.h("relatedGamesListFactory");
                        throw null;
                    }
                    cge0.b(s5x0.L(i120.Q(jm40Var, ((ThemeColors) fetVar7.k(zaq0.b)).getBackground(), jd8.n).e(o7k0.c), f, 0.0f, 2), fdf0Var, (RelatedParams) fdf0Var.O1.n(fdf0Var, fdf0.S1[0]), fetVar7);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 7:
                avg0 avg0Var2 = (avg0) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                cge0 cge0Var = avg0.P1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    pz40 pz40VarY4 = ((i3t0) avg0Var2.H0()).y(fetVar8);
                    k3t0 k3t0VarH0 = avg0Var2.H0();
                    boolean zI11 = fetVar8.i(avg0Var2);
                    Object objP26 = fetVar8.P();
                    if (zI11 || objP26 == cl5Var) {
                        avg0Var = avg0Var2;
                        aif0 aif0Var = new aif0(1, avg0Var, avg0.class, "collectSideEffect", "collectSideEffect(Lorg/xplatform/bet_history/sale/presentation/model/viewmodel/SaleSideEffect;)V", 0, (byte) 21);
                        fetVar8.o0(aif0Var);
                        objP26 = aif0Var;
                    } else {
                        avg0Var = avg0Var2;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) objP26), fetVar8);
                    boolean zE2 = fetVar8.e(3) | fetVar8.i(k3t0VarH0) | fetVar8.i(avg0Var) | fetVar8.g(pz40VarF4);
                    Object objP27 = fetVar8.P();
                    if (zE2 || objP27 == cl5Var) {
                        nu80 nu80Var2 = new nu80(k3t0VarH0, avg0Var, pz40VarF4, null, (byte) 20);
                        fetVar8.o0(nu80Var2);
                        objP27 = nu80Var2;
                    }
                    m0x0.t(fetVar8, avg0Var, (Function2) objP27);
                    mm40 mm40VarE1 = o2e.e0(o7k0.c, "BET_SALE_ROOT_TAG");
                    k3t0 k3t0VarH1 = avg0Var.H0();
                    boolean zI12 = fetVar8.i(k3t0VarH1);
                    Object objP28 = fetVar8.P();
                    if (zI12 || objP28 == cl5Var) {
                        aif0 aif0Var2 = new aif0(1, k3t0VarH1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                        fetVar8.o0(aif0Var2);
                        objP28 = aif0Var2;
                    }
                    xia0.i(6, fetVar8, mm40VarE1, pz40VarY4, (Function1) ((jhy) objP28));
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                xfh0 xfh0Var = (xfh0) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                cge0 cge0Var2 = xfh0.V1;
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zI13 = fetVar9.i(xfh0Var);
                    Object objP29 = fetVar9.P();
                    if (zI13 || objP29 == cl5Var) {
                        objP29 = new ufh0(xfh0Var, b5);
                        fetVar9.o0(objP29);
                    }
                    Function0 function3 = (Function0) objP29;
                    boolean zI14 = fetVar9.i(xfh0Var);
                    Object objP30 = fetVar9.P();
                    if (zI14 || objP30 == cl5Var) {
                        objP30 = new ufh0(xfh0Var, b7);
                        fetVar9.o0(objP30);
                    }
                    v3c.z(function3, (Function0) objP30, null, fetVar9, 0, 4);
                    k3t0 k3t0VarG2 = xfh0Var.G0();
                    boolean zI15 = fetVar9.i(xfh0Var);
                    Object objP31 = fetVar9.P();
                    if (zI15 || objP31 == cl5Var) {
                        aif0 aif0Var3 = new aif0(1, xfh0Var, xfh0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/special_event/impl/search/presentation/SearchSideEffect;)V", 0, (byte) 28);
                        fetVar9.o0(aif0Var3);
                        objP31 = aif0Var3;
                    }
                    lkz lkzVar5 = lkz.f20223a;
                    pz40 pz40VarF5 = androidx.compose.runtime.e.f((Function1) ((jhy) objP31), fetVar9);
                    boolean zI16 = fetVar9.i(k3t0VarG2) | fetVar9.i(xfh0Var) | fetVar9.e(3) | fetVar9.g(pz40VarF5);
                    Object objP32 = fetVar9.P();
                    if (zI16 || objP32 == cl5Var) {
                        nu80 nu80Var3 = new nu80(k3t0VarG2, xfh0Var, pz40VarF5, null, (byte) 21);
                        fetVar9.o0(nu80Var3);
                        objP32 = nu80Var3;
                    }
                    m0x0.t(fetVar9, xfh0Var, (Function2) objP32);
                    pz40 pz40VarY5 = ((i3t0) xfh0Var.G0()).y(fetVar9);
                    xcz xczVarA = ddz.a(0, 0, fetVar9, 0, 3);
                    yhh0 yhh0Var = (yhh0) pz40VarY5.getValue();
                    q5x.w(438, u1c.M(-165466948, new sqc0((Object) yhh0Var, (Object) xfh0Var, fetVar9.k(bmd.q), (byte) 8), fetVar9), u1c.M(1016765787, new sqc0((Object) yhh0Var, (Object) xczVarA, (Object) xfh0Var, (byte) 9), fetVar9), fetVar9, o7k0.c);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                return p(obj, obj2);
            case 10:
                jpp0 jpp0Var = (jpp0) obj3;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                s2m0 s2m0Var = jpp0.O1;
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    fi2 fi2Var = (fi2) ((i3t0) jpp0Var.G0()).y(fetVar10).getValue();
                    k3t0 k3t0VarG3 = jpp0Var.G0();
                    boolean zI17 = fetVar10.i(jpp0Var);
                    Object objP33 = fetVar10.P();
                    if (zI17 || objP33 == cl5Var) {
                        objP33 = new g0p0(1, jpp0Var, jpp0.class, "handleAltSportTeamsSideEffect", "handleAltSportTeamsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_teams/models/AltSportTeamsSideEffect;)V", 0, (byte) 16);
                        fetVar10.o0(objP33);
                    }
                    lkz lkzVar6 = lkz.f20223a;
                    pz40 pz40VarF6 = androidx.compose.runtime.e.f((Function1) ((jhy) objP33), fetVar10);
                    boolean zI18 = fetVar10.i(k3t0VarG3) | fetVar10.i(jpp0Var) | fetVar10.e(3) | fetVar10.g(pz40VarF6);
                    Object objP34 = fetVar10.P();
                    if (zI18 || objP34 == cl5Var) {
                        objP34 = new tmj0(k3t0VarG3, jpp0Var, pz40VarF6, null, (byte) 12);
                        fetVar10.o0(objP34);
                    }
                    m0x0.t(fetVar10, jpp0Var, (Function2) objP34);
                    mm40 mm40VarH2 = phu0.H(jm40Var, 0, 1);
                    x5d x5dVarA5 = w5d.a(uc9.c, gqw0.m, fetVar10, 0);
                    int iHashCode6 = Long.hashCode(fetVar10.T);
                    bh90 bh90VarM6 = fetVar10.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar10, mm40VarH2);
                    mkd.c0.getClass();
                    fetVar10.i0();
                    if (fetVar10.S) {
                        fetVar10.l(pcyVar);
                    } else {
                        fetVar10.r0();
                    }
                    jpm0.o(fetVar10, x5dVarA5, gqw0.x);
                    jpm0.o(fetVar10, bh90VarM6, gqw0.w);
                    jpm0.o(fetVar10, Integer.valueOf(iHashCode6), gqw0.y);
                    jpm0.n(fetVar10);
                    jpm0.o(fetVar10, mm40VarC5, gqw0.v);
                    imm immVar2 = fi2Var.f9567a;
                    boolean zI19 = fetVar10.i(jpp0Var);
                    Object objP35 = fetVar10.P();
                    if (zI19 || objP35 == cl5Var) {
                        objP35 = new hpp0(jpp0Var, b7);
                        fetVar10.o0(objP35);
                    }
                    Function0 function4 = (Function0) objP35;
                    boolean zI20 = fetVar10.i(jpp0Var);
                    Object objP36 = fetVar10.P();
                    if (zI20 || objP36 == cl5Var) {
                        objP36 = new nop0(jpp0Var, b5);
                        fetVar10.o0(objP36);
                    }
                    hlm.c(null, immVar2, null, function4, null, (Function1) objP36, null, null, null, null, null, null, fetVar10, 0, 0, 4053);
                    mm40 mm40VarQ2 = i120.Q(o7k0.c, ((ThemeColors) fetVar10.k(zaq0.b)).getBackground(), jd8.n);
                    bdz bdzVar = (bdz) jpp0Var.K1.getValue();
                    k3t0 k3t0VarG4 = jpp0Var.G0();
                    boolean zI21 = fetVar10.i(k3t0VarG4);
                    Object objP37 = fetVar10.P();
                    if (zI21 || objP37 == cl5Var) {
                        g0p0 g0p0Var = new g0p0(1, k3t0VarG4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 17);
                        fetVar10.o0(g0p0Var);
                        objP37 = g0p0Var;
                    }
                    hmw0.f(mm40VarQ2, bdzVar, fi2Var, (Function1) ((jhy) objP37), fetVar10, 0);
                    fetVar10.r(true);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 11:
                return r(obj, obj2);
            case 12:
                return s(obj, obj2);
            case 13:
                return t(obj, obj2);
            case 14:
                return u(obj, obj2);
            case 15:
                return v(obj, obj2);
            case 16:
                return w(obj, obj2);
            case 17:
                return x(obj, obj2);
            case 18:
                return y(obj, obj2);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return z(obj, obj2);
            case 20:
                return a(obj, obj2);
            case 21:
                return b(obj, obj2);
            case 22:
                return c(obj, obj2);
            case 23:
                return g(obj, obj2);
            case 24:
                return h(obj, obj2);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return i(obj, obj2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return l(obj, obj2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return m(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return o(obj, obj2);
            default:
                pv pvVar = (pv) obj3;
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                if (th instanceof dwq0) {
                    pvVar.p.f(hv.f13703a);
                } else if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                    pvVar.p.f(gv.f11953a);
                } else {
                    p7m0 p7m0Var = pvVar.o;
                    do {
                        value = p7m0Var.getValue();
                        jvVar = (jv) value;
                    } while (!p7m0Var.m(value, jv.a(jvVar, false, null, null, false, false, c6q0.a(jvVar.f, null, new s7q0(str), true, 262103), 31)));
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ iob0(Object obj, byte b) {
        this.f15110a = b;
        this.b = obj;
    }
}
