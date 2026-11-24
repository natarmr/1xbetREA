package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigDecimal;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class elm implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8006a;
    public final /* synthetic */ Object b;

    public /* synthetic */ elm(Object obj, byte b) {
        this.f8006a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        boolean z;
        atv atvVar = (atv) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bpq) obj).getClass();
        boolean z2 = false;
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            for (uoo0 uoo0Var : ((xsv) atvVar).f41436a.d) {
                fetVar.b0(-167982164, uoo0Var.a());
                if (uoo0Var instanceof too0) {
                    fetVar.e0(-912332660);
                    boolean z3 = z2;
                    fet fetVar2 = fetVar;
                    v8q0.a(((too0) uoo0Var).b, null, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar2, 0, 24960, 110586);
                    fetVar = fetVar2;
                    fetVar.r(z3);
                    z = z3;
                } else {
                    z = z2;
                    if (uoo0Var instanceof ioo0) {
                        fetVar.e0(-911800700);
                        j6n.h(((ioo0) uoo0Var).f15128a, tqo0.f34390a, null, 0, 0, fetVar, 48, 28);
                        fetVar.r(z);
                    } else if (uoo0Var instanceof soo0) {
                        fetVar.e0(-911430405);
                        soo0 soo0Var = (soo0) uoo0Var;
                        j6n.h(soo0Var.f32554a, soo0Var.b, null, 0, 0, fetVar, 0, 28);
                        fetVar.r(z);
                    } else {
                        fetVar.e0(-167937720);
                        fetVar.r(z);
                    }
                }
                fetVar.r(z);
                z2 = z;
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        c4w c4wVar = (c4w) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        tqt tqtVar = c4w.n2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            mm40 mm40VarE0 = o2e.e0(cjx.V(jm40.b, a8k0.G(xczVarA, fetVar), null), "HISTORY_ITEM_MENU_BOTTOM_TEST_TAG");
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarT = s5x0.t(0.0f, 8.0f, 1);
            boolean zI = fetVar.i(c4wVar);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new t3t(c4wVar, (byte) 26);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE0, xczVarA, lh80VarT, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        beo beoVar = (beo) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bpq) obj).getClass();
        boolean z2 = false;
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            for (uoo0 uoo0Var : beoVar.e) {
                fetVar.b0(-1358425078, uoo0Var.a());
                if (uoo0Var instanceof too0) {
                    fetVar.e0(838633122);
                    boolean z3 = z2;
                    fet fetVar2 = fetVar;
                    v8q0.a(((too0) uoo0Var).b, null, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, 0, 24960, 110586);
                    fetVar = fetVar2;
                    fetVar.r(z3);
                    z = z3;
                } else {
                    z = z2;
                    if (uoo0Var instanceof ioo0) {
                        fetVar.e0(839120008);
                        j6n.h(((ioo0) uoo0Var).f15128a, tqo0.f34390a, null, 0, 0, fetVar, 48, 28);
                        fetVar.r(z);
                    } else if (uoo0Var instanceof soo0) {
                        fetVar.e0(839466495);
                        soo0 soo0Var = (soo0) uoo0Var;
                        j6n.h(soo0Var.f32554a, soo0Var.b, null, 0, 0, fetVar, 0, 28);
                        fetVar.r(z);
                    } else {
                        fetVar.e0(-1358383912);
                        fetVar.r(z);
                    }
                }
                fetVar.r(z);
                z2 = z;
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        lhx lhxVar = (lhx) this.b;
        long jLongValue = ((Long) obj).longValue();
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        ihx ihxVar = lhx.Y1;
        str.getClass();
        lhxVar.G0().x(new chx(new iv20(str, jLongValue, zBooleanValue)));
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        eoa0 eoa0Var = (eoa0) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bpq) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            Iterator<E> it = eoa0Var.l.iterator();
            while (it.hasNext()) {
                m7x.a((voa0) it.next(), fetVar, 0);
            }
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        h1y h1yVar = (h1y) this.b;
        a8z a8zVar = h1yVar.p2;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = h1y.q2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(h1yVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                g1y g1yVar = new g1y(1, h1yVar, h1y.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/toto_jackpot/impl/presentation/compose/simple_bet_dialog/fullscreen_slider/model/JackpotFullscreenSliderSideEffect;)V", 0, (byte) 0);
                fetVar.o0(g1yVar);
                objP = g1yVar;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(h1yVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                bio bioVar = new bio(k3t0Var, h1yVar, pz40VarF, null, (byte) 16);
                fetVar.o0(bioVar);
                objP2 = bioVar;
            }
            m0x0.t(fetVar, h1yVar, (Function2) objP2);
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
            mm40 mm40VarS = o050.S(o050.P(jm40.b));
            t1y t1yVar = (t1y) pz40VarY.getValue();
            k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
            boolean zI3 = fetVar.i(k3t0Var2);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                g1y g1yVar2 = new g1y(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 1);
                fetVar.o0(g1yVar2);
                objP3 = g1yVar2;
            }
            r8x.k(mm40VarS, t1yVar, (Function1) ((jhy) objP3), fetVar, 0);
            boolean zI4 = fetVar.i(h1yVar);
            Object objP4 = fetVar.P();
            if (zI4 || objP4 == cl5Var) {
                objP4 = new f1y(h1yVar, (byte) 1);
                fetVar.o0(objP4);
            }
            ccq0.V(h1yVar, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", (Function0) objP4);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        o3y o3yVar = (o3y) this.b;
        a8z a8zVar = o3yVar.p2;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = o3y.q2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(o3yVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                g1y g1yVar = new g1y(1, o3yVar, o3y.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/toto_jackpot/impl/presentation/compose/simple_bet_dialog/lite_no_tab/model/JackpotLiteNoTabBetSideEffect;)V", 0, (byte) 2);
                fetVar.o0(g1yVar);
                objP = g1yVar;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(o3yVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                bio bioVar = new bio(k3t0Var, o3yVar, pz40VarF, null, (byte) 17);
                fetVar.o0(bioVar);
                objP2 = bioVar;
            }
            m0x0.t(fetVar, o3yVar, (Function2) objP2);
            mm40 mm40VarS = o050.S(o050.P(jm40.b));
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
            k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
            boolean zI3 = fetVar.i(k3t0Var2);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                g1y g1yVar2 = new g1y(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 3);
                fetVar.o0(g1yVar2);
                objP3 = g1yVar2;
            }
            c9x.a(0, fetVar, mm40VarS, pz40VarY, (Function1) ((jhy) objP3));
            boolean zI4 = fetVar.i(o3yVar);
            Object objP4 = fetVar.P();
            if (zI4 || objP4 == cl5Var) {
                objP4 = new n3y(o3yVar, (byte) 1);
                fetVar.o0(objP4);
            }
            ccq0.V(o3yVar, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", (Function0) objP4);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        p4y p4yVar = (p4y) this.b;
        a8z a8zVar = p4yVar.p2;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = p4y.q2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(p4yVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                g1y g1yVar = new g1y(1, p4yVar, p4y.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/toto_jackpot/impl/presentation/compose/simple_bet_dialog/medium_custom_background/model/JackpotMediumCustomBackgroundSideEffect;)V", 0, (byte) 4);
                fetVar.o0(g1yVar);
                objP = g1yVar;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(p4yVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                bio bioVar = new bio(k3t0Var, p4yVar, pz40VarF, null, (byte) 18);
                fetVar.o0(bioVar);
                objP2 = bioVar;
            }
            m0x0.t(fetVar, p4yVar, (Function2) objP2);
            mm40 mm40VarS = o050.S(o050.P(jm40.b));
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
            k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
            boolean zI3 = fetVar.i(k3t0Var2);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                g1y g1yVar2 = new g1y(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 5);
                fetVar.o0(g1yVar2);
                objP3 = g1yVar2;
            }
            d9x.c(0, fetVar, mm40VarS, pz40VarY, (Function1) ((jhy) objP3));
            boolean zI4 = fetVar.i(p4yVar);
            Object objP4 = fetVar.P();
            if (zI4 || objP4 == cl5Var) {
                objP4 = new o4y(p4yVar, (byte) 1);
                fetVar.o0(objP4);
            }
            ccq0.V(p4yVar, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", (Function0) objP4);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        o5y o5yVar = (o5y) this.b;
        a8z a8zVar = o5yVar.p2;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        int i = o5y.q2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(o5yVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                g1y g1yVar = new g1y(1, o5yVar, o5y.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/toto_jackpot/impl/presentation/compose/simple_bet_dialog/medium_no_game_info/model/JackpotMediumNoGameInfoSideEffect;)V", 0, (byte) 6);
                fetVar.o0(g1yVar);
                objP = g1yVar;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(o5yVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                bio bioVar = new bio(k3t0Var, o5yVar, pz40VarF, null, (byte) 19);
                fetVar.o0(bioVar);
                objP2 = bioVar;
            }
            m0x0.t(fetVar, o5yVar, (Function2) objP2);
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
            mm40 mm40VarS = o050.S(o050.P(jm40.b));
            y5y y5yVar = (y5y) pz40VarY.getValue();
            k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
            boolean zI3 = fetVar.i(k3t0Var2);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                g1y g1yVar2 = new g1y(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 7);
                fetVar.o0(g1yVar2);
                objP3 = g1yVar2;
            }
            e9x.b(mm40VarS, y5yVar, (Function1) ((jhy) objP3), fetVar, 0);
            boolean zI4 = fetVar.i(o5yVar);
            Object objP4 = fetVar.P();
            if (zI4 || objP4 == cl5Var) {
                objP4 = new n5y(o5yVar, (byte) 1);
                fetVar.o0(objP4);
            }
            ccq0.V(o5yVar, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", (Function0) objP4);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        long separator60;
        sso0 sso0Var;
        long primary;
        ugd ugdVar;
        ugd ugdVar2;
        byte b = this.f8006a;
        pcy pcyVar = e7z.u1;
        byte b2 = 3;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        ugd ugdVarM = null;
        byte b3 = 4;
        byte b4 = 6;
        final byte b5 = 2;
        final byte b6 = 0;
        Object obj4 = this.b;
        final byte b7 = 1;
        switch (b) {
            case 0:
                imm immVar = (imm) obj4;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    y3d y3dVar = immVar.f;
                    if (y3dVar == null) {
                        fetVar.e0(-1204628101);
                        separator60 = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60();
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1204629868);
                        fetVar.r(false);
                        separator60 = y3dVar.f41946a;
                    }
                    jcb.v(mm40VarD, 1.0f, separator60, fetVar, 6, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                ny1 ny1Var = (ny1) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bpq) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    my1 my1Var = ny1Var.f24309a;
                    fetVar2.e0(-847942882);
                    String str = my1Var.f22584a;
                    int iOrdinal = my1Var.b.ordinal();
                    if (iOrdinal == 0) {
                        sso0Var = nso0.f24059a;
                    } else if (iOrdinal == 1) {
                        sso0Var = bqo0.f3042a;
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return null;
                        }
                        sso0Var = xpo0.f41280a;
                    }
                    j6n.h(str, sso0Var, null, 0, 0, fetVar2, 0, 28);
                    fetVar2.r(false);
                    String str2 = ny1Var.b;
                    String str3 = (str2 == null || str2.length() <= 0) ? null : str2;
                    if (str3 == null) {
                        fetVar2.e0(-847399608);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-847399607);
                        j6n.h(str3, qro0.f29220a, null, 0, 0, fetVar2, 48, 28);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                c6q0 c6q0Var = (c6q0) obj4;
                cqq cqqVar = (cqq) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                cqqVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(cqqVar) ? (byte) 4 : (byte) 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    f6q0 f6q0Var = c6q0Var.b;
                    q7q0 q7q0Var = c6q0Var.h;
                    boolean z = c6q0Var.e;
                    Object objP = fetVar3.P();
                    if (objP == cl5Var) {
                        objP = dw9.j(fetVar3);
                    }
                    gy40 gy40Var = (gy40) objP;
                    boolean z2 = (fetVar3.g(c6q0Var) ? 1 : 0) | ((iIntValue3 & 14) != 4 ? (byte) 0 : (byte) 1);
                    Object objP2 = fetVar3.P();
                    if (z2 != 0 || objP2 == cl5Var) {
                        objP2 = new gnm(c6q0Var, cqqVar, (byte) 19);
                        fetVar3.o0(objP2);
                    }
                    qxw.e(y860.W(jm40.b, gy40Var, null, z, null, (Function0) objP2, 24), f6q0Var, q7q0Var, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                s6q0 s6q0Var = (s6q0) obj4;
                cqq cqqVar2 = (cqq) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                cqqVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(cqqVar2) ? (byte) 4 : (byte) 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    f6q0 f6q0Var2 = s6q0Var.b;
                    boolean z3 = s6q0Var.e;
                    Object objP3 = fetVar4.P();
                    if (objP3 == cl5Var) {
                        objP3 = dw9.j(fetVar4);
                    }
                    gy40 gy40Var2 = (gy40) objP3;
                    boolean z4 = (fetVar4.g(s6q0Var) ? 1 : 0) | ((iIntValue4 & 14) == 4 ? (byte) 1 : (byte) 0);
                    Object objP4 = fetVar4.P();
                    if (z4 != 0 || objP4 == cl5Var) {
                        objP4 = new gnm(s6q0Var, cqqVar2, (byte) 20);
                        fetVar4.o0(objP4);
                    }
                    qxw.e(y860.W(jm40.b, gy40Var2, null, z3, null, (Function0) objP4, 24), f6q0Var2, q7q0.f28265a, fetVar4, 384);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                x6q0 x6q0Var = (x6q0) obj4;
                cqq cqqVar3 = (cqq) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                cqqVar3.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar5.g(cqqVar3) ? (byte) 4 : (byte) 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x6q0Var.getClass();
                    q7q0 q7q0Var2 = x6q0Var.g;
                    boolean z5 = x6q0Var.d;
                    Object objP5 = fetVar5.P();
                    if (objP5 == cl5Var) {
                        objP5 = dw9.j(fetVar5);
                    }
                    gy40 gy40Var3 = (gy40) objP5;
                    boolean zG = fetVar5.g(x6q0Var) | ((iIntValue5 & 14) == 4);
                    Object objP6 = fetVar5.P();
                    if (zG != 0 || objP6 == cl5Var) {
                        objP6 = new gnm(x6q0Var, cqqVar3, (byte) 21);
                        fetVar5.o0(objP6);
                    }
                    qxw.e(y860.W(jm40.b, gy40Var3, null, z5, null, (Function0) objP6, 24), e6q0.f7299a, q7q0Var2, fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                y6q0 y6q0Var = (y6q0) obj4;
                cqq cqqVar4 = (cqq) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                cqqVar4.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= fetVar6.g(cqqVar4) ? (byte) 4 : (byte) 2;
                }
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    Object objP7 = fetVar6.P();
                    if (objP7 == cl5Var) {
                        objP7 = dw9.j(fetVar6);
                    }
                    gy40 gy40Var4 = (gy40) objP7;
                    boolean zG2 = fetVar6.g(y6q0Var) | ((iIntValue6 & 14) == 4);
                    Object objP8 = fetVar6.P();
                    if (zG2 != 0 || objP8 == cl5Var) {
                        objP8 = new f7n(y6q0Var, cqqVar4);
                        fetVar6.o0(objP8);
                    }
                    qxw.e(y860.W(jm40.b, gy40Var4, null, true, null, (Function0) objP8, 24), e6q0.f7299a, q7q0.f28265a, fetVar6, 384);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case 6:
                k3p k3pVar = (k3p) obj4;
                fet fetVar7 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((yhg0) obj).getClass();
                if (!fetVar7.U(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    fetVar7.X();
                } else if (k3pVar instanceof j3p) {
                    fetVar7.e0(-1641182890);
                    fbc.i(((j3p) k3pVar).f15847a.size(), 0, fetVar7);
                    fetVar7.r(false);
                } else {
                    fetVar7.e0(-1641108552);
                    fetVar7.r(false);
                }
                return Unit.f46060a;
            case 7:
                p5q p5qVar = (p5q) obj4;
                y5d y5dVar = (y5d) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                nek nekVar = m5q.o2;
                y5dVar.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= fetVar8.g(y5dVar) ? (byte) 4 : (byte) 2;
                }
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                    zcl zclVar2 = qmk.f28987a;
                    wwb.i(s5x0.N(mm40VarA, 16.0f, 16.0f, 16.0f, 0.0f, 8), p5qVar.e, 0L, 0, 0L, fetVar8, 0, 28);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 8:
                paq paqVar = (paq) obj4;
                lr8 lr8Var = (lr8) obj;
                fet fetVar9 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                lr8Var.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar9.g(lr8Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    i9q i9qVar = paqVar.d;
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i9qVar.i);
                    bigDecimalValueOf.getClass();
                    float fB = pkd.b(lr8Var.d(), fetVar9) - pkd.b(124.0f, fetVar9);
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(i9qVar.g);
                    bigDecimalValueOf2.getClass();
                    BigDecimal bigDecimalValueOf3 = BigDecimal.valueOf(i9qVar.j);
                    bigDecimalValueOf3.getClass();
                    float fS0 = ((w6k) fetVar9.k(bmd.h)).s0((float) tdc.P(bigDecimalValueOf, fB, bigDecimalValueOf3, bigDecimalValueOf2));
                    jm40 jm40Var2 = jm40.b;
                    mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD2, 0.0f, 0.0f, 124.0f, 4.0f, 3);
                    thg0 thg0VarA = shg0.a(uc9.g, gqw0.j, fetVar9, 6);
                    int iHashCode = Long.hashCode(fetVar9.T);
                    bh90 bh90VarM = fetVar9.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar9, mm40VarN);
                    mkd.c0.getClass();
                    fetVar9.i0();
                    if (fetVar9.S) {
                        fetVar9.l(pcyVar);
                    } else {
                        fetVar9.r0();
                    }
                    jpm0.o(fetVar9, thg0VarA, gqw0.x);
                    jpm0.o(fetVar9, bh90VarM, gqw0.w);
                    jpm0.o(fetVar9, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar9);
                    jpm0.o(fetVar9, mm40VarC0, gqw0.v);
                    mm40 mm40VarS = o7k0.s(s5x0.N(jm40Var2, fS0 - 34.0f, 0.0f, 0.0f, 0.0f, 14), 68.0f);
                    String str4 = i9qVar.h;
                    y9q0 y9q0VarH = g1t0.h();
                    long j = g1t0.h().f42262a.b;
                    pz40 pz40Var = s6t0.f31722a;
                    v8q0.a(str4, mm40VarS, s6t0.b().f33626a.getSecondary(), null, j, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0VarH, fetVar9, 0, 24960, 109544);
                    v8q0.a(i9qVar.k, o7k0.s(jm40Var2, 68.0f), s6t0.b().f33626a.getSecondary(), null, g1t0.h().f42262a.b, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar9, 0, 24960, 109544);
                    fetVar9.r(true);
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 9:
                k680 k680Var = (k680) obj4;
                fet fetVar10 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    vvw.f(null, k680Var, fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case 10:
                jxb0 jxb0Var = (jxb0) obj4;
                yhg0 yhg0Var = (yhg0) obj;
                fet fetVar11 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                yhg0Var.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= fetVar11.g(yhg0Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    String strS = xsm0.s(R.string.full_statistic, fetVar11);
                    mm40 mm40VarA2 = yhg0Var.a(1.0f, jm40Var, true);
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(mm40VarA2, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                    y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
                    if (jxb0Var.f17298a) {
                        fetVar11.e0(-1233643864);
                        primary = ((ThemeColors) fetVar11.k(zaq0.b)).getSecondary();
                    } else {
                        fetVar11.e0(-1233642810);
                        primary = ((ThemeColors) fetVar11.k(zaq0.b)).getPrimary();
                    }
                    fetVar11.r(false);
                    v8q0.a(strS, mm40VarN2, primary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar11, 0, 0, 131064);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 11:
                fkr fkrVar = (fkr) obj4;
                fet fetVar12 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar12.U(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(mm40VarD3, 16.0f, 0.0f, 16.0f, 4.0f, 2);
                    String str5 = fkrVar.b;
                    pz40 pz40Var2 = s6t0.f31722a;
                    v8q0.a(str5, mm40VarN3, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar12, 0, 0, 131064);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 12:
                xrr xrrVar = (xrr) obj4;
                mm40 mm40Var = (mm40) obj;
                fet fetVar13 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                mm40Var.getClass();
                if ((iIntValue13 & 6) == 0) {
                    iIntValue13 |= fetVar13.g(mm40Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar13.U(iIntValue13 & 1, (iIntValue13 & 19) != 18)) {
                    final iul0 iul0Var = xrrVar.e;
                    Object objP9 = fetVar13.P();
                    if (objP9 == cl5Var) {
                        zcl zclVar6 = qmk.f28987a;
                        objP9 = rq8.L(s5x0.J(o7k0.n(jm40Var, 28.0f), 1.0f), new f8l0((byte) 7));
                        fetVar13.o0(objP9);
                    }
                    final mm40 mm40Var2 = (mm40) objP9;
                    Object objP10 = fetVar13.P();
                    if (objP10 == cl5Var) {
                        zcl zclVar7 = qmk.f28987a;
                        objP10 = o7k0.e(o7k0.s(jm40Var, 32.0f), 12.0f);
                        fetVar13.o0(objP10);
                    }
                    final mm40 mm40Var3 = (mm40) objP10;
                    pz40 pz40VarF = androidx.compose.runtime.e.f(iul0Var.b, fetVar13);
                    if (iul0Var.d != null) {
                        fetVar13.e0(-1279665572);
                        ugd ugdVarM2 = u1c.M(-288398748, new xdr() { // from class: a.cul0
                            @Override // a.xdr
                            public final Object F(Object obj5, Object obj6, Object obj7) {
                                byte b8 = b6;
                                final mm40 mm40Var4 = mm40Var3;
                                final iul0 iul0Var2 = iul0Var;
                                boolean z6 = false;
                                final byte b9 = 2;
                                char c = 1;
                                switch (b8) {
                                    case 0:
                                        y5d y5dVar2 = (y5d) obj5;
                                        fet fetVar14 = (fet) obj6;
                                        int iIntValue14 = ((Integer) obj7).intValue();
                                        y5dVar2.getClass();
                                        if ((iIntValue14 & 6) == 0) {
                                            iIntValue14 |= fetVar14.g(y5dVar2) ? 4 : 2;
                                        }
                                        if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                                            yd90 yd90Var = iul0Var2.d;
                                            j83 j83Var = yd90Var.f42423a;
                                            j83 j83Var2 = yd90Var.b;
                                            ((g1t0) fetVar14.k(j1t0.e)).getClass();
                                            xvw.s(y5dVar2, mm40Var2, j83Var, j83Var2, g1t0.d(), u1c.M(-1066848648, new xdr() { // from class: a.ful0
                                                @Override // a.xdr
                                                public final Object F(Object obj8, Object obj9, Object obj10) {
                                                    byte b10 = b9;
                                                    iul0 iul0Var3 = iul0Var2;
                                                    y5d y5dVar3 = (y5d) obj8;
                                                    fet fetVar15 = (fet) obj9;
                                                    int iIntValue15 = ((Integer) obj10).intValue();
                                                    switch (b10) {
                                                        case 0:
                                                            y5dVar3.getClass();
                                                            if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar15.k(zaq0.b)).getSecondary(), fetVar15, mm40Var4, iul0Var3.e.c);
                                                            } else {
                                                                fetVar15.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            y5dVar3.getClass();
                                                            if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar15.k(zaq0.b)).getTextPrimary(), fetVar15, mm40Var4, iul0Var3.c.c);
                                                            } else {
                                                                fetVar15.X();
                                                            }
                                                            break;
                                                        default:
                                                            y5dVar3.getClass();
                                                            if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar15.k(zaq0.b)).getSecondary(), fetVar15, mm40Var4, iul0Var3.d.c);
                                                            } else {
                                                                fetVar15.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar14), fetVar14, (iIntValue14 & 14) | 196656);
                                        } else {
                                            fetVar14.X();
                                        }
                                        break;
                                    case 1:
                                        y5d y5dVar3 = (y5d) obj5;
                                        fet fetVar15 = (fet) obj6;
                                        int iIntValue15 = ((Integer) obj7).intValue();
                                        y5dVar3.getClass();
                                        if ((iIntValue15 & 6) == 0) {
                                            iIntValue15 |= fetVar15.g(y5dVar3) ? 4 : 2;
                                        }
                                        if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                                            yd90 yd90Var2 = iul0Var2.e;
                                            j83 j83Var3 = yd90Var2.f42423a;
                                            j83 j83Var4 = yd90Var2.b;
                                            ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                            y9q0 y9q0VarD = g1t0.d();
                                            final byte b10 = z6 ? (byte) 1 : (byte) 0;
                                            xvw.s(y5dVar3, mm40Var2, j83Var3, j83Var4, y9q0VarD, u1c.M(-52469848, new xdr() { // from class: a.ful0
                                                @Override // a.xdr
                                                public final Object F(Object obj8, Object obj9, Object obj10) {
                                                    byte b11 = b10;
                                                    iul0 iul0Var3 = iul0Var2;
                                                    y5d y5dVar4 = (y5d) obj8;
                                                    fet fetVar16 = (fet) obj9;
                                                    int iIntValue16 = ((Integer) obj10).intValue();
                                                    switch (b11) {
                                                        case 0:
                                                            y5dVar4.getClass();
                                                            if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar16.k(zaq0.b)).getSecondary(), fetVar16, mm40Var4, iul0Var3.e.c);
                                                            } else {
                                                                fetVar16.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            y5dVar4.getClass();
                                                            if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar16.k(zaq0.b)).getTextPrimary(), fetVar16, mm40Var4, iul0Var3.c.c);
                                                            } else {
                                                                fetVar16.X();
                                                            }
                                                            break;
                                                        default:
                                                            y5dVar4.getClass();
                                                            if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar16.k(zaq0.b)).getSecondary(), fetVar16, mm40Var4, iul0Var3.d.c);
                                                            } else {
                                                                fetVar16.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar15), fetVar15, 196656 | (iIntValue15 & 14));
                                        } else {
                                            fetVar15.X();
                                        }
                                        break;
                                    default:
                                        y5d y5dVar4 = (y5d) obj5;
                                        fet fetVar16 = (fet) obj6;
                                        int iIntValue16 = ((Integer) obj7).intValue();
                                        y5dVar4.getClass();
                                        if ((iIntValue16 & 6) == 0) {
                                            iIntValue16 |= fetVar16.g(y5dVar4) ? 4 : 2;
                                        }
                                        if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                                            yd90 yd90Var3 = iul0Var2.c;
                                            j83 j83Var5 = yd90Var3.f42423a;
                                            j83 j83Var6 = yd90Var3.b;
                                            ((g1t0) fetVar16.k(j1t0.e)).getClass();
                                            y9q0 y9q0VarA = g1t0.a();
                                            final char c2 = c == true ? 1 : 0;
                                            xvw.s(y5dVar4, mm40Var2, j83Var5, j83Var6, y9q0VarA, u1c.M(1279392680, new xdr() { // from class: a.ful0
                                                @Override // a.xdr
                                                public final Object F(Object obj8, Object obj9, Object obj10) {
                                                    byte b11 = c2;
                                                    iul0 iul0Var3 = iul0Var2;
                                                    y5d y5dVar5 = (y5d) obj8;
                                                    fet fetVar17 = (fet) obj9;
                                                    int iIntValue17 = ((Integer) obj10).intValue();
                                                    switch (b11) {
                                                        case 0:
                                                            y5dVar5.getClass();
                                                            if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getSecondary(), fetVar17, mm40Var4, iul0Var3.e.c);
                                                            } else {
                                                                fetVar17.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            y5dVar5.getClass();
                                                            if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getTextPrimary(), fetVar17, mm40Var4, iul0Var3.c.c);
                                                            } else {
                                                                fetVar17.X();
                                                            }
                                                            break;
                                                        default:
                                                            y5dVar5.getClass();
                                                            if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getSecondary(), fetVar17, mm40Var4, iul0Var3.d.c);
                                                            } else {
                                                                fetVar17.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar16), fetVar16, (iIntValue16 & 14) | 196656);
                                        } else {
                                            fetVar16.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar13);
                        fetVar13.r(false);
                        ugdVar = ugdVarM2;
                    } else {
                        fetVar13.e0(-1279026414);
                        fetVar13.r(false);
                        ugdVar = null;
                    }
                    if (iul0Var.e != null) {
                        fetVar13.e0(-1278915527);
                        ugdVarM = u1c.M(713574548, new xdr() { // from class: a.cul0
                            @Override // a.xdr
                            public final Object F(Object obj5, Object obj6, Object obj7) {
                                byte b8 = b7;
                                final mm40 mm40Var4 = mm40Var3;
                                final iul0 iul0Var2 = iul0Var;
                                boolean z6 = false;
                                final byte b9 = 2;
                                char c = 1;
                                switch (b8) {
                                    case 0:
                                        y5d y5dVar2 = (y5d) obj5;
                                        fet fetVar14 = (fet) obj6;
                                        int iIntValue14 = ((Integer) obj7).intValue();
                                        y5dVar2.getClass();
                                        if ((iIntValue14 & 6) == 0) {
                                            iIntValue14 |= fetVar14.g(y5dVar2) ? 4 : 2;
                                        }
                                        if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                                            yd90 yd90Var = iul0Var2.d;
                                            j83 j83Var = yd90Var.f42423a;
                                            j83 j83Var2 = yd90Var.b;
                                            ((g1t0) fetVar14.k(j1t0.e)).getClass();
                                            xvw.s(y5dVar2, mm40Var2, j83Var, j83Var2, g1t0.d(), u1c.M(-1066848648, new xdr() { // from class: a.ful0
                                                @Override // a.xdr
                                                public final Object F(Object obj8, Object obj9, Object obj10) {
                                                    byte b11 = b9;
                                                    iul0 iul0Var3 = iul0Var2;
                                                    y5d y5dVar5 = (y5d) obj8;
                                                    fet fetVar17 = (fet) obj9;
                                                    int iIntValue17 = ((Integer) obj10).intValue();
                                                    switch (b11) {
                                                        case 0:
                                                            y5dVar5.getClass();
                                                            if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getSecondary(), fetVar17, mm40Var4, iul0Var3.e.c);
                                                            } else {
                                                                fetVar17.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            y5dVar5.getClass();
                                                            if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getTextPrimary(), fetVar17, mm40Var4, iul0Var3.c.c);
                                                            } else {
                                                                fetVar17.X();
                                                            }
                                                            break;
                                                        default:
                                                            y5dVar5.getClass();
                                                            if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getSecondary(), fetVar17, mm40Var4, iul0Var3.d.c);
                                                            } else {
                                                                fetVar17.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar14), fetVar14, (iIntValue14 & 14) | 196656);
                                        } else {
                                            fetVar14.X();
                                        }
                                        break;
                                    case 1:
                                        y5d y5dVar3 = (y5d) obj5;
                                        fet fetVar15 = (fet) obj6;
                                        int iIntValue15 = ((Integer) obj7).intValue();
                                        y5dVar3.getClass();
                                        if ((iIntValue15 & 6) == 0) {
                                            iIntValue15 |= fetVar15.g(y5dVar3) ? 4 : 2;
                                        }
                                        if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                                            yd90 yd90Var2 = iul0Var2.e;
                                            j83 j83Var3 = yd90Var2.f42423a;
                                            j83 j83Var4 = yd90Var2.b;
                                            ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                            y9q0 y9q0VarD = g1t0.d();
                                            final byte b10 = z6 ? (byte) 1 : (byte) 0;
                                            xvw.s(y5dVar3, mm40Var2, j83Var3, j83Var4, y9q0VarD, u1c.M(-52469848, new xdr() { // from class: a.ful0
                                                @Override // a.xdr
                                                public final Object F(Object obj8, Object obj9, Object obj10) {
                                                    byte b11 = b10;
                                                    iul0 iul0Var3 = iul0Var2;
                                                    y5d y5dVar5 = (y5d) obj8;
                                                    fet fetVar17 = (fet) obj9;
                                                    int iIntValue17 = ((Integer) obj10).intValue();
                                                    switch (b11) {
                                                        case 0:
                                                            y5dVar5.getClass();
                                                            if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getSecondary(), fetVar17, mm40Var4, iul0Var3.e.c);
                                                            } else {
                                                                fetVar17.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            y5dVar5.getClass();
                                                            if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getTextPrimary(), fetVar17, mm40Var4, iul0Var3.c.c);
                                                            } else {
                                                                fetVar17.X();
                                                            }
                                                            break;
                                                        default:
                                                            y5dVar5.getClass();
                                                            if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getSecondary(), fetVar17, mm40Var4, iul0Var3.d.c);
                                                            } else {
                                                                fetVar17.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar15), fetVar15, 196656 | (iIntValue15 & 14));
                                        } else {
                                            fetVar15.X();
                                        }
                                        break;
                                    default:
                                        y5d y5dVar4 = (y5d) obj5;
                                        fet fetVar16 = (fet) obj6;
                                        int iIntValue16 = ((Integer) obj7).intValue();
                                        y5dVar4.getClass();
                                        if ((iIntValue16 & 6) == 0) {
                                            iIntValue16 |= fetVar16.g(y5dVar4) ? 4 : 2;
                                        }
                                        if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                                            yd90 yd90Var3 = iul0Var2.c;
                                            j83 j83Var5 = yd90Var3.f42423a;
                                            j83 j83Var6 = yd90Var3.b;
                                            ((g1t0) fetVar16.k(j1t0.e)).getClass();
                                            y9q0 y9q0VarA = g1t0.a();
                                            final byte c2 = c == true ? 1 : 0;
                                            xvw.s(y5dVar4, mm40Var2, j83Var5, j83Var6, y9q0VarA, u1c.M(1279392680, new xdr() { // from class: a.ful0
                                                @Override // a.xdr
                                                public final Object F(Object obj8, Object obj9, Object obj10) {
                                                    byte b11 = c2;
                                                    iul0 iul0Var3 = iul0Var2;
                                                    y5d y5dVar5 = (y5d) obj8;
                                                    fet fetVar17 = (fet) obj9;
                                                    int iIntValue17 = ((Integer) obj10).intValue();
                                                    switch (b11) {
                                                        case 0:
                                                            y5dVar5.getClass();
                                                            if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getSecondary(), fetVar17, mm40Var4, iul0Var3.e.c);
                                                            } else {
                                                                fetVar17.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            y5dVar5.getClass();
                                                            if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getTextPrimary(), fetVar17, mm40Var4, iul0Var3.c.c);
                                                            } else {
                                                                fetVar17.X();
                                                            }
                                                            break;
                                                        default:
                                                            y5dVar5.getClass();
                                                            if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                                kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getSecondary(), fetVar17, mm40Var4, iul0Var3.d.c);
                                                            } else {
                                                                fetVar17.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar16), fetVar16, (iIntValue16 & 14) | 196656);
                                        } else {
                                            fetVar16.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar13);
                        fetVar13.r(false);
                    } else {
                        fetVar13.e0(-1278273486);
                        fetVar13.r(false);
                    }
                    cww.n(mm40Var, u1c.M(1564802360, new rqc0(iul0Var, (byte) 26), fetVar13), ugdVar, ugdVarM, u1c.M(-272036012, new tja(pz40VarF, mm40Var3, mm40Var2, b5), fetVar13), u1c.M(-1177669828, new xdr() { // from class: a.cul0
                        @Override // a.xdr
                        public final Object F(Object obj5, Object obj6, Object obj7) {
                            byte b8 = b5;
                            final mm40 mm40Var4 = mm40Var3;
                            final iul0 iul0Var2 = iul0Var;
                            boolean z6 = false;
                            final byte b9 = 2;
                            char c = 1;
                            switch (b8) {
                                case 0:
                                    y5d y5dVar2 = (y5d) obj5;
                                    fet fetVar14 = (fet) obj6;
                                    int iIntValue14 = ((Integer) obj7).intValue();
                                    y5dVar2.getClass();
                                    if ((iIntValue14 & 6) == 0) {
                                        iIntValue14 |= fetVar14.g(y5dVar2) ? 4 : 2;
                                    }
                                    if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                                        yd90 yd90Var = iul0Var2.d;
                                        j83 j83Var = yd90Var.f42423a;
                                        j83 j83Var2 = yd90Var.b;
                                        ((g1t0) fetVar14.k(j1t0.e)).getClass();
                                        xvw.s(y5dVar2, mm40Var2, j83Var, j83Var2, g1t0.d(), u1c.M(-1066848648, new xdr() { // from class: a.ful0
                                            @Override // a.xdr
                                            public final Object F(Object obj8, Object obj9, Object obj10) {
                                                byte b11 = b9;
                                                iul0 iul0Var3 = iul0Var2;
                                                y5d y5dVar5 = (y5d) obj8;
                                                fet fetVar17 = (fet) obj9;
                                                int iIntValue17 = ((Integer) obj10).intValue();
                                                switch (b11) {
                                                    case 0:
                                                        y5dVar5.getClass();
                                                        if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                            kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getSecondary(), fetVar17, mm40Var4, iul0Var3.e.c);
                                                        } else {
                                                            fetVar17.X();
                                                        }
                                                        break;
                                                    case 1:
                                                        y5dVar5.getClass();
                                                        if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                            kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getTextPrimary(), fetVar17, mm40Var4, iul0Var3.c.c);
                                                        } else {
                                                            fetVar17.X();
                                                        }
                                                        break;
                                                    default:
                                                        y5dVar5.getClass();
                                                        if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                            kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getSecondary(), fetVar17, mm40Var4, iul0Var3.d.c);
                                                        } else {
                                                            fetVar17.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar14), fetVar14, (iIntValue14 & 14) | 196656);
                                    } else {
                                        fetVar14.X();
                                    }
                                    break;
                                case 1:
                                    y5d y5dVar3 = (y5d) obj5;
                                    fet fetVar15 = (fet) obj6;
                                    int iIntValue15 = ((Integer) obj7).intValue();
                                    y5dVar3.getClass();
                                    if ((iIntValue15 & 6) == 0) {
                                        iIntValue15 |= fetVar15.g(y5dVar3) ? 4 : 2;
                                    }
                                    if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                                        yd90 yd90Var2 = iul0Var2.e;
                                        j83 j83Var3 = yd90Var2.f42423a;
                                        j83 j83Var4 = yd90Var2.b;
                                        ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                        y9q0 y9q0VarD = g1t0.d();
                                        final byte b10 = z6 ? (byte) 1 : (byte) 0;
                                        xvw.s(y5dVar3, mm40Var2, j83Var3, j83Var4, y9q0VarD, u1c.M(-52469848, new xdr() { // from class: a.ful0
                                            @Override // a.xdr
                                            public final Object F(Object obj8, Object obj9, Object obj10) {
                                                byte b11 = b10;
                                                iul0 iul0Var3 = iul0Var2;
                                                y5d y5dVar5 = (y5d) obj8;
                                                fet fetVar17 = (fet) obj9;
                                                int iIntValue17 = ((Integer) obj10).intValue();
                                                switch (b11) {
                                                    case 0:
                                                        y5dVar5.getClass();
                                                        if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                            kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getSecondary(), fetVar17, mm40Var4, iul0Var3.e.c);
                                                        } else {
                                                            fetVar17.X();
                                                        }
                                                        break;
                                                    case 1:
                                                        y5dVar5.getClass();
                                                        if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                            kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getTextPrimary(), fetVar17, mm40Var4, iul0Var3.c.c);
                                                        } else {
                                                            fetVar17.X();
                                                        }
                                                        break;
                                                    default:
                                                        y5dVar5.getClass();
                                                        if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                            kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getSecondary(), fetVar17, mm40Var4, iul0Var3.d.c);
                                                        } else {
                                                            fetVar17.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar15), fetVar15, 196656 | (iIntValue15 & 14));
                                    } else {
                                        fetVar15.X();
                                    }
                                    break;
                                default:
                                    y5d y5dVar4 = (y5d) obj5;
                                    fet fetVar16 = (fet) obj6;
                                    int iIntValue16 = ((Integer) obj7).intValue();
                                    y5dVar4.getClass();
                                    if ((iIntValue16 & 6) == 0) {
                                        iIntValue16 |= fetVar16.g(y5dVar4) ? 4 : 2;
                                    }
                                    if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 19) != 18)) {
                                        yd90 yd90Var3 = iul0Var2.c;
                                        j83 j83Var5 = yd90Var3.f42423a;
                                        j83 j83Var6 = yd90Var3.b;
                                        ((g1t0) fetVar16.k(j1t0.e)).getClass();
                                        y9q0 y9q0VarA = g1t0.a();
                                        final byte c2 = c == true ? 1 : 0;
                                        xvw.s(y5dVar4, mm40Var2, j83Var5, j83Var6, y9q0VarA, u1c.M(1279392680, new xdr() { // from class: a.ful0
                                            @Override // a.xdr
                                            public final Object F(Object obj8, Object obj9, Object obj10) {
                                                byte b11 = c2;
                                                iul0 iul0Var3 = iul0Var2;
                                                y5d y5dVar5 = (y5d) obj8;
                                                fet fetVar17 = (fet) obj9;
                                                int iIntValue17 = ((Integer) obj10).intValue();
                                                switch (b11) {
                                                    case 0:
                                                        y5dVar5.getClass();
                                                        if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                            kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getSecondary(), fetVar17, mm40Var4, iul0Var3.e.c);
                                                        } else {
                                                            fetVar17.X();
                                                        }
                                                        break;
                                                    case 1:
                                                        y5dVar5.getClass();
                                                        if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                            kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getTextPrimary(), fetVar17, mm40Var4, iul0Var3.c.c);
                                                        } else {
                                                            fetVar17.X();
                                                        }
                                                        break;
                                                    default:
                                                        y5dVar5.getClass();
                                                        if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                            kpb.n(6, ((ThemeColors) fetVar17.k(zaq0.b)).getSecondary(), fetVar17, mm40Var4, iul0Var3.d.c);
                                                        } else {
                                                            fetVar17.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar16), fetVar16, (iIntValue16 & 14) | 196656);
                                    } else {
                                        fetVar16.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar13), fetVar13, (iIntValue13 & 14) | 221232);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 13:
                yrr yrrVar = (yrr) obj4;
                mm40 mm40Var4 = (mm40) obj;
                fet fetVar14 = (fet) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                mm40Var4.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= fetVar14.g(mm40Var4) ? (byte) 4 : (byte) 2;
                }
                if (fetVar14.U(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    final jul0 jul0Var = yrrVar.e;
                    Object objP11 = fetVar14.P();
                    if (objP11 == cl5Var) {
                        zcl zclVar8 = qmk.f28987a;
                        objP11 = rq8.L(s5x0.J(o7k0.n(jm40Var, 28.0f), 1.0f), new f8l0(b4));
                        fetVar14.o0(objP11);
                    }
                    final mm40 mm40Var5 = (mm40) objP11;
                    Object objP12 = fetVar14.P();
                    if (objP12 == cl5Var) {
                        zcl zclVar9 = qmk.f28987a;
                        objP12 = o7k0.e(o7k0.s(jm40Var, 32.0f), 12.0f);
                        fetVar14.o0(objP12);
                    }
                    final mm40 mm40Var6 = (mm40) objP12;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f(jul0Var.b, fetVar14);
                    if (jul0Var.d != null) {
                        fetVar14.e0(1372194113);
                        ugd ugdVarM3 = u1c.M(-394302766, new xdr() { // from class: a.bul0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // a.xdr
                            public final Object F(Object obj5, Object obj6, Object obj7) {
                                byte b8 = b6;
                                final mm40 mm40Var7 = mm40Var6;
                                final jul0 jul0Var2 = jul0Var;
                                Object[] objArr = 0;
                                final byte b9 = 2;
                                char c = 1;
                                switch (b8) {
                                    case 0:
                                        y5d y5dVar2 = (y5d) obj5;
                                        fet fetVar15 = (fet) obj6;
                                        int iIntValue15 = ((Integer) obj7).intValue();
                                        y5dVar2.getClass();
                                        if ((iIntValue15 & 6) == 0) {
                                            iIntValue15 |= fetVar15.g(y5dVar2) ? 4 : 2;
                                        }
                                        if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                                            xd90 xd90Var = jul0Var2.d;
                                            j83 j83Var = xd90Var.f40683a;
                                            j83 j83Var2 = xd90Var.b;
                                            ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                            y9q0 y9q0VarD = g1t0.d();
                                            final Object[] objArr2 = objArr == true ? 1 : 0;
                                            vvw.m(y5dVar2, mm40Var5, j83Var, j83Var2, y9q0VarD, u1c.M(1833306942, new xdr() { // from class: a.ztl0
                                                @Override // a.xdr
                                                public final Object F(Object obj8, Object obj9, Object obj10) {
                                                    byte b10 = objArr2;
                                                    jul0 jul0Var3 = jul0Var2;
                                                    mm40 mm40Var8 = mm40Var7;
                                                    y5d y5dVar3 = (y5d) obj8;
                                                    fet fetVar16 = (fet) obj9;
                                                    int iIntValue16 = ((Integer) obj10).intValue();
                                                    switch (b10) {
                                                        case 0:
                                                            y5dVar3.getClass();
                                                            if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                                                                f7k.n(6, fetVar16, mm40Var8, jul0Var3.d.c);
                                                            } else {
                                                                fetVar16.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            y5dVar3.getClass();
                                                            if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                                                                f7k.n(6, fetVar16, mm40Var8, jul0Var3.e.c);
                                                            } else {
                                                                fetVar16.X();
                                                            }
                                                            break;
                                                        default:
                                                            y5dVar3.getClass();
                                                            if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                                                                f7k.n(6, fetVar16, mm40Var8, jul0Var3.c.c);
                                                            } else {
                                                                fetVar16.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar15), fetVar15, 196656 | (iIntValue15 & 14));
                                        } else {
                                            fetVar15.X();
                                        }
                                        break;
                                    case 1:
                                        y5d y5dVar3 = (y5d) obj5;
                                        boolean z6 = false;
                                        fet fetVar16 = (fet) obj6;
                                        int iIntValue16 = ((Integer) obj7).intValue();
                                        y5dVar3.getClass();
                                        if ((iIntValue16 & 6) == 0) {
                                            iIntValue16 |= fetVar16.g(y5dVar3) ? 4 : 2;
                                        }
                                        if ((iIntValue16 & 19) != 18) {
                                            z6 = true;
                                        }
                                        if (fetVar16.U(iIntValue16 & 1, z6)) {
                                            xd90 xd90Var2 = jul0Var2.e;
                                            j83 j83Var3 = xd90Var2.f40683a;
                                            j83 j83Var4 = xd90Var2.b;
                                            ((g1t0) fetVar16.k(j1t0.e)).getClass();
                                            y9q0 y9q0VarD2 = g1t0.d();
                                            final char c2 = c == true ? 1 : 0;
                                            vvw.m(y5dVar3, mm40Var5, j83Var3, j83Var4, y9q0VarD2, u1c.M(2045712398, new xdr() { // from class: a.ztl0
                                                @Override // a.xdr
                                                public final Object F(Object obj8, Object obj9, Object obj10) {
                                                    byte b10 = c2;
                                                    jul0 jul0Var3 = jul0Var2;
                                                    mm40 mm40Var8 = mm40Var7;
                                                    y5d y5dVar4 = (y5d) obj8;
                                                    fet fetVar17 = (fet) obj9;
                                                    int iIntValue17 = ((Integer) obj10).intValue();
                                                    switch (b10) {
                                                        case 0:
                                                            y5dVar4.getClass();
                                                            if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                                f7k.n(6, fetVar17, mm40Var8, jul0Var3.d.c);
                                                            } else {
                                                                fetVar17.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            y5dVar4.getClass();
                                                            if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                                f7k.n(6, fetVar17, mm40Var8, jul0Var3.e.c);
                                                            } else {
                                                                fetVar17.X();
                                                            }
                                                            break;
                                                        default:
                                                            y5dVar4.getClass();
                                                            if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                                                                f7k.n(6, fetVar17, mm40Var8, jul0Var3.c.c);
                                                            } else {
                                                                fetVar17.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar16), fetVar16, 196656 | (iIntValue16 & 14));
                                        } else {
                                            fetVar16.X();
                                        }
                                        break;
                                    default:
                                        y5d y5dVar4 = (y5d) obj5;
                                        fet fetVar17 = (fet) obj6;
                                        int iIntValue17 = ((Integer) obj7).intValue();
                                        y5dVar4.getClass();
                                        if ((iIntValue17 & 6) == 0) {
                                            iIntValue17 |= fetVar17.g(y5dVar4) ? 4 : 2;
                                        }
                                        if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                                            xd90 xd90Var3 = jul0Var2.c;
                                            j83 j83Var5 = xd90Var3.f40683a;
                                            j83 j83Var6 = xd90Var3.b;
                                            ((g1t0) fetVar17.k(j1t0.e)).getClass();
                                            vvw.m(y5dVar4, mm40Var5, j83Var5, j83Var6, g1t0.a(), u1c.M(-1412563954, new xdr() { // from class: a.ztl0
                                                @Override // a.xdr
                                                public final Object F(Object obj8, Object obj9, Object obj10) {
                                                    byte b10 = b9;
                                                    jul0 jul0Var3 = jul0Var2;
                                                    mm40 mm40Var8 = mm40Var7;
                                                    y5d y5dVar5 = (y5d) obj8;
                                                    fet fetVar18 = (fet) obj9;
                                                    int iIntValue18 = ((Integer) obj10).intValue();
                                                    switch (b10) {
                                                        case 0:
                                                            y5dVar5.getClass();
                                                            if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                                f7k.n(6, fetVar18, mm40Var8, jul0Var3.d.c);
                                                            } else {
                                                                fetVar18.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            y5dVar5.getClass();
                                                            if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                                f7k.n(6, fetVar18, mm40Var8, jul0Var3.e.c);
                                                            } else {
                                                                fetVar18.X();
                                                            }
                                                            break;
                                                        default:
                                                            y5dVar5.getClass();
                                                            if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                                f7k.n(6, fetVar18, mm40Var8, jul0Var3.c.c);
                                                            } else {
                                                                fetVar18.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar17), fetVar17, (iIntValue17 & 14) | 196656);
                                        } else {
                                            fetVar17.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar14);
                        fetVar14.r(false);
                        ugdVar2 = ugdVarM3;
                    } else {
                        fetVar14.e0(1372692004);
                        fetVar14.r(false);
                        ugdVar2 = null;
                    }
                    if (jul0Var.e != null) {
                        fetVar14.e0(1372798334);
                        ugdVarM = u1c.M(206496418, new xdr() { // from class: a.bul0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // a.xdr
                            public final Object F(Object obj5, Object obj6, Object obj7) {
                                byte b8 = b7;
                                final mm40 mm40Var7 = mm40Var6;
                                final jul0 jul0Var2 = jul0Var;
                                Object[] objArr = 0;
                                final byte b9 = 2;
                                char c = 1;
                                switch (b8) {
                                    case 0:
                                        y5d y5dVar2 = (y5d) obj5;
                                        fet fetVar15 = (fet) obj6;
                                        int iIntValue15 = ((Integer) obj7).intValue();
                                        y5dVar2.getClass();
                                        if ((iIntValue15 & 6) == 0) {
                                            iIntValue15 |= fetVar15.g(y5dVar2) ? 4 : 2;
                                        }
                                        if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                                            xd90 xd90Var = jul0Var2.d;
                                            j83 j83Var = xd90Var.f40683a;
                                            j83 j83Var2 = xd90Var.b;
                                            ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                            y9q0 y9q0VarD = g1t0.d();
                                            final byte objArr2 = objArr == true ? 1 : 0;
                                            vvw.m(y5dVar2, mm40Var5, j83Var, j83Var2, y9q0VarD, u1c.M(1833306942, new xdr() { // from class: a.ztl0
                                                @Override // a.xdr
                                                public final Object F(Object obj8, Object obj9, Object obj10) {
                                                    byte b10 = objArr2;
                                                    jul0 jul0Var3 = jul0Var2;
                                                    mm40 mm40Var8 = mm40Var7;
                                                    y5d y5dVar5 = (y5d) obj8;
                                                    fet fetVar18 = (fet) obj9;
                                                    int iIntValue18 = ((Integer) obj10).intValue();
                                                    switch (b10) {
                                                        case 0:
                                                            y5dVar5.getClass();
                                                            if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                                f7k.n(6, fetVar18, mm40Var8, jul0Var3.d.c);
                                                            } else {
                                                                fetVar18.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            y5dVar5.getClass();
                                                            if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                                f7k.n(6, fetVar18, mm40Var8, jul0Var3.e.c);
                                                            } else {
                                                                fetVar18.X();
                                                            }
                                                            break;
                                                        default:
                                                            y5dVar5.getClass();
                                                            if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                                f7k.n(6, fetVar18, mm40Var8, jul0Var3.c.c);
                                                            } else {
                                                                fetVar18.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar15), fetVar15, 196656 | (iIntValue15 & 14));
                                        } else {
                                            fetVar15.X();
                                        }
                                        break;
                                    case 1:
                                        y5d y5dVar3 = (y5d) obj5;
                                        boolean z6 = false;
                                        fet fetVar16 = (fet) obj6;
                                        int iIntValue16 = ((Integer) obj7).intValue();
                                        y5dVar3.getClass();
                                        if ((iIntValue16 & 6) == 0) {
                                            iIntValue16 |= fetVar16.g(y5dVar3) ? 4 : 2;
                                        }
                                        if ((iIntValue16 & 19) != 18) {
                                            z6 = true;
                                        }
                                        if (fetVar16.U(iIntValue16 & 1, z6)) {
                                            xd90 xd90Var2 = jul0Var2.e;
                                            j83 j83Var3 = xd90Var2.f40683a;
                                            j83 j83Var4 = xd90Var2.b;
                                            ((g1t0) fetVar16.k(j1t0.e)).getClass();
                                            y9q0 y9q0VarD2 = g1t0.d();
                                            final byte c2 = c == true ? 1 : 0;
                                            vvw.m(y5dVar3, mm40Var5, j83Var3, j83Var4, y9q0VarD2, u1c.M(2045712398, new xdr() { // from class: a.ztl0
                                                @Override // a.xdr
                                                public final Object F(Object obj8, Object obj9, Object obj10) {
                                                    byte b10 = c2;
                                                    jul0 jul0Var3 = jul0Var2;
                                                    mm40 mm40Var8 = mm40Var7;
                                                    y5d y5dVar5 = (y5d) obj8;
                                                    fet fetVar18 = (fet) obj9;
                                                    int iIntValue18 = ((Integer) obj10).intValue();
                                                    switch (b10) {
                                                        case 0:
                                                            y5dVar5.getClass();
                                                            if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                                f7k.n(6, fetVar18, mm40Var8, jul0Var3.d.c);
                                                            } else {
                                                                fetVar18.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            y5dVar5.getClass();
                                                            if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                                f7k.n(6, fetVar18, mm40Var8, jul0Var3.e.c);
                                                            } else {
                                                                fetVar18.X();
                                                            }
                                                            break;
                                                        default:
                                                            y5dVar5.getClass();
                                                            if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                                f7k.n(6, fetVar18, mm40Var8, jul0Var3.c.c);
                                                            } else {
                                                                fetVar18.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar16), fetVar16, 196656 | (iIntValue16 & 14));
                                        } else {
                                            fetVar16.X();
                                        }
                                        break;
                                    default:
                                        y5d y5dVar4 = (y5d) obj5;
                                        fet fetVar17 = (fet) obj6;
                                        int iIntValue17 = ((Integer) obj7).intValue();
                                        y5dVar4.getClass();
                                        if ((iIntValue17 & 6) == 0) {
                                            iIntValue17 |= fetVar17.g(y5dVar4) ? 4 : 2;
                                        }
                                        if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                                            xd90 xd90Var3 = jul0Var2.c;
                                            j83 j83Var5 = xd90Var3.f40683a;
                                            j83 j83Var6 = xd90Var3.b;
                                            ((g1t0) fetVar17.k(j1t0.e)).getClass();
                                            vvw.m(y5dVar4, mm40Var5, j83Var5, j83Var6, g1t0.a(), u1c.M(-1412563954, new xdr() { // from class: a.ztl0
                                                @Override // a.xdr
                                                public final Object F(Object obj8, Object obj9, Object obj10) {
                                                    byte b10 = b9;
                                                    jul0 jul0Var3 = jul0Var2;
                                                    mm40 mm40Var8 = mm40Var7;
                                                    y5d y5dVar5 = (y5d) obj8;
                                                    fet fetVar18 = (fet) obj9;
                                                    int iIntValue18 = ((Integer) obj10).intValue();
                                                    switch (b10) {
                                                        case 0:
                                                            y5dVar5.getClass();
                                                            if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                                f7k.n(6, fetVar18, mm40Var8, jul0Var3.d.c);
                                                            } else {
                                                                fetVar18.X();
                                                            }
                                                            break;
                                                        case 1:
                                                            y5dVar5.getClass();
                                                            if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                                f7k.n(6, fetVar18, mm40Var8, jul0Var3.e.c);
                                                            } else {
                                                                fetVar18.X();
                                                            }
                                                            break;
                                                        default:
                                                            y5dVar5.getClass();
                                                            if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                                f7k.n(6, fetVar18, mm40Var8, jul0Var3.c.c);
                                                            } else {
                                                                fetVar18.X();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            }, fetVar17), fetVar17, (iIntValue17 & 14) | 196656);
                                        } else {
                                            fetVar17.X();
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        }, fetVar14);
                        fetVar14.r(false);
                    } else {
                        fetVar14.e0(1373299108);
                        fetVar14.r(false);
                    }
                    fww.p(mm40Var4, u1c.M(1866298494, new rqc0(jul0Var, (byte) 25), fetVar14), ugdVar2, ugdVarM, u1c.M(-1237560350, new tja(pz40VarF2, mm40Var6, mm40Var5, b2), fetVar14), u1c.M(-646519558, new xdr() { // from class: a.bul0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // a.xdr
                        public final Object F(Object obj5, Object obj6, Object obj7) {
                            byte b8 = b5;
                            final mm40 mm40Var7 = mm40Var6;
                            final jul0 jul0Var2 = jul0Var;
                            Object[] objArr = 0;
                            final byte b9 = 2;
                            char c = 1;
                            switch (b8) {
                                case 0:
                                    y5d y5dVar2 = (y5d) obj5;
                                    fet fetVar15 = (fet) obj6;
                                    int iIntValue15 = ((Integer) obj7).intValue();
                                    y5dVar2.getClass();
                                    if ((iIntValue15 & 6) == 0) {
                                        iIntValue15 |= fetVar15.g(y5dVar2) ? 4 : 2;
                                    }
                                    if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 19) != 18)) {
                                        xd90 xd90Var = jul0Var2.d;
                                        j83 j83Var = xd90Var.f40683a;
                                        j83 j83Var2 = xd90Var.b;
                                        ((g1t0) fetVar15.k(j1t0.e)).getClass();
                                        y9q0 y9q0VarD = g1t0.d();
                                        final byte objArr2 = objArr == true ? 1 : 0;
                                        vvw.m(y5dVar2, mm40Var5, j83Var, j83Var2, y9q0VarD, u1c.M(1833306942, new xdr() { // from class: a.ztl0
                                            @Override // a.xdr
                                            public final Object F(Object obj8, Object obj9, Object obj10) {
                                                byte b10 = objArr2;
                                                jul0 jul0Var3 = jul0Var2;
                                                mm40 mm40Var8 = mm40Var7;
                                                y5d y5dVar5 = (y5d) obj8;
                                                fet fetVar18 = (fet) obj9;
                                                int iIntValue18 = ((Integer) obj10).intValue();
                                                switch (b10) {
                                                    case 0:
                                                        y5dVar5.getClass();
                                                        if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                            f7k.n(6, fetVar18, mm40Var8, jul0Var3.d.c);
                                                        } else {
                                                            fetVar18.X();
                                                        }
                                                        break;
                                                    case 1:
                                                        y5dVar5.getClass();
                                                        if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                            f7k.n(6, fetVar18, mm40Var8, jul0Var3.e.c);
                                                        } else {
                                                            fetVar18.X();
                                                        }
                                                        break;
                                                    default:
                                                        y5dVar5.getClass();
                                                        if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                            f7k.n(6, fetVar18, mm40Var8, jul0Var3.c.c);
                                                        } else {
                                                            fetVar18.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar15), fetVar15, 196656 | (iIntValue15 & 14));
                                    } else {
                                        fetVar15.X();
                                    }
                                    break;
                                case 1:
                                    y5d y5dVar3 = (y5d) obj5;
                                    boolean z6 = false;
                                    fet fetVar16 = (fet) obj6;
                                    int iIntValue16 = ((Integer) obj7).intValue();
                                    y5dVar3.getClass();
                                    if ((iIntValue16 & 6) == 0) {
                                        iIntValue16 |= fetVar16.g(y5dVar3) ? 4 : 2;
                                    }
                                    if ((iIntValue16 & 19) != 18) {
                                        z6 = true;
                                    }
                                    if (fetVar16.U(iIntValue16 & 1, z6)) {
                                        xd90 xd90Var2 = jul0Var2.e;
                                        j83 j83Var3 = xd90Var2.f40683a;
                                        j83 j83Var4 = xd90Var2.b;
                                        ((g1t0) fetVar16.k(j1t0.e)).getClass();
                                        y9q0 y9q0VarD2 = g1t0.d();
                                        final byte c2 = c == true ? 1 : 0;
                                        vvw.m(y5dVar3, mm40Var5, j83Var3, j83Var4, y9q0VarD2, u1c.M(2045712398, new xdr() { // from class: a.ztl0
                                            @Override // a.xdr
                                            public final Object F(Object obj8, Object obj9, Object obj10) {
                                                byte b10 = c2;
                                                jul0 jul0Var3 = jul0Var2;
                                                mm40 mm40Var8 = mm40Var7;
                                                y5d y5dVar5 = (y5d) obj8;
                                                fet fetVar18 = (fet) obj9;
                                                int iIntValue18 = ((Integer) obj10).intValue();
                                                switch (b10) {
                                                    case 0:
                                                        y5dVar5.getClass();
                                                        if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                            f7k.n(6, fetVar18, mm40Var8, jul0Var3.d.c);
                                                        } else {
                                                            fetVar18.X();
                                                        }
                                                        break;
                                                    case 1:
                                                        y5dVar5.getClass();
                                                        if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                            f7k.n(6, fetVar18, mm40Var8, jul0Var3.e.c);
                                                        } else {
                                                            fetVar18.X();
                                                        }
                                                        break;
                                                    default:
                                                        y5dVar5.getClass();
                                                        if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                            f7k.n(6, fetVar18, mm40Var8, jul0Var3.c.c);
                                                        } else {
                                                            fetVar18.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar16), fetVar16, 196656 | (iIntValue16 & 14));
                                    } else {
                                        fetVar16.X();
                                    }
                                    break;
                                default:
                                    y5d y5dVar4 = (y5d) obj5;
                                    fet fetVar17 = (fet) obj6;
                                    int iIntValue17 = ((Integer) obj7).intValue();
                                    y5dVar4.getClass();
                                    if ((iIntValue17 & 6) == 0) {
                                        iIntValue17 |= fetVar17.g(y5dVar4) ? 4 : 2;
                                    }
                                    if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 19) != 18)) {
                                        xd90 xd90Var3 = jul0Var2.c;
                                        j83 j83Var5 = xd90Var3.f40683a;
                                        j83 j83Var6 = xd90Var3.b;
                                        ((g1t0) fetVar17.k(j1t0.e)).getClass();
                                        vvw.m(y5dVar4, mm40Var5, j83Var5, j83Var6, g1t0.a(), u1c.M(-1412563954, new xdr() { // from class: a.ztl0
                                            @Override // a.xdr
                                            public final Object F(Object obj8, Object obj9, Object obj10) {
                                                byte b10 = b9;
                                                jul0 jul0Var3 = jul0Var2;
                                                mm40 mm40Var8 = mm40Var7;
                                                y5d y5dVar5 = (y5d) obj8;
                                                fet fetVar18 = (fet) obj9;
                                                int iIntValue18 = ((Integer) obj10).intValue();
                                                switch (b10) {
                                                    case 0:
                                                        y5dVar5.getClass();
                                                        if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                            f7k.n(6, fetVar18, mm40Var8, jul0Var3.d.c);
                                                        } else {
                                                            fetVar18.X();
                                                        }
                                                        break;
                                                    case 1:
                                                        y5dVar5.getClass();
                                                        if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                            f7k.n(6, fetVar18, mm40Var8, jul0Var3.e.c);
                                                        } else {
                                                            fetVar18.X();
                                                        }
                                                        break;
                                                    default:
                                                        y5dVar5.getClass();
                                                        if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                                                            f7k.n(6, fetVar18, mm40Var8, jul0Var3.c.c);
                                                        } else {
                                                            fetVar18.X();
                                                        }
                                                        break;
                                                }
                                                return Unit.f46060a;
                                            }
                                        }, fetVar17), fetVar17, (iIntValue17 & 14) | 196656);
                                    } else {
                                        fetVar17.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar14), fetVar14, (iIntValue14 & 14) | 221232);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
            case 14:
                f0s f0sVar = (f0s) obj4;
                hwe hweVar = (hwe) obj;
                zxj0 zxj0Var = (zxj0) obj2;
                m0k0 m0k0Var = (m0k0) obj3;
                hweVar.getClass();
                zxj0Var.getClass();
                m0k0Var.getClass();
                int iOrdinal2 = hweVar.ordinal();
                if (iOrdinal2 == 0) {
                    f0sVar.q(zxj0Var, m0k0Var);
                } else {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return null;
                    }
                    f0sVar.e(zxj0Var, m0k0Var);
                }
                return Unit.f46060a;
            case 15:
                ztv ztvVar = (ztv) obj4;
                fet fetVar15 = (fet) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar15.U(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    hew0.C(ztvVar, fetVar15, 0);
                } else {
                    fetVar15.X();
                }
                return Unit.f46060a;
            case 16:
                gvv gvvVar = (gvv) obj4;
                fet fetVar16 = (fet) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                gst gstVar = gvv.m2;
                ((y5d) obj).getClass();
                if (fetVar16.U(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    zcl zclVar10 = qmk.f28987a;
                    jm40 jm40Var3 = jm40.b;
                    mm40 mm40VarL = s5x0.L(jm40Var3, 16.0f, 0.0f, 2);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar16, 0);
                    int iHashCode2 = Long.hashCode(fetVar16.T);
                    bh90 bh90VarM2 = fetVar16.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar16, mm40VarL);
                    mkd.c0.getClass();
                    fetVar16.i0();
                    if (fetVar16.S) {
                        fetVar16.l(pcyVar);
                    } else {
                        fetVar16.r0();
                    }
                    jpm0.o(fetVar16, x5dVarA, gqw0.x);
                    jpm0.o(fetVar16, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar16, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar16);
                    jpm0.o(fetVar16, mm40VarC1, gqw0.v);
                    mm40 mm40VarN4 = s5x0.N(jm40Var3, 0.0f, 24.0f, 0.0f, 0.0f, 13);
                    phf0 phf0Var = gvvVar.k2;
                    iiy[] iiyVarArr = gvv.n2;
                    v8q0.a(phf0Var.n(gvvVar, iiyVarArr[0]), mm40VarN4, 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, ibm0.t(g1t0.q(), fetVar16), fetVar16, 0, 0, 130044);
                    v8q0.a(gvvVar.l2.n(gvvVar, iiyVarArr[1]), s5x0.N(s5x0.N(jm40Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0.0f, 0.0f, 0.0f, 16.0f, 7), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, ibm0.n(g1t0.k(), fetVar16), fetVar16, 0, 0, 130044);
                    fetVar16.r(true);
                } else {
                    fetVar16.X();
                }
                return Unit.f46060a;
            case 17:
                q0w q0wVar = (q0w) obj4;
                fet fetVar17 = (fet) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                tqt tqtVar = q0w.m2;
                ((y5d) obj).getClass();
                if (fetVar17.U(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    xcz xczVarA = ddz.a(0, 0, fetVar17, 0, 3);
                    zcl zclVar11 = qmk.f28987a;
                    lh80 lh80Var = new lh80(4.0f, 8.0f, 4.0f, 16.0f);
                    mm40 mm40VarE0 = o2e.e0(cjx.V(jm40Var, a8k0.G(xczVarA, fetVar17), null), "HISTORY_DATE_BOTTOM_SHEET_LAZY_COLUMN");
                    boolean zI = fetVar17.i(q0wVar);
                    Object objP13 = fetVar17.P();
                    if (zI || objP13 == cl5Var) {
                        objP13 = new t3t(q0wVar, (byte) 22);
                        fetVar17.o0(objP13);
                    }
                    b8k0.e(mm40VarE0, xczVarA, lh80Var, null, null, null, false, null, (Function1) objP13, fetVar17, 0, Response.SERVER_TIMEOUT);
                } else {
                    fetVar17.X();
                }
                return Unit.f46060a;
            case 18:
                return a(obj, obj2, obj3);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return b(obj, obj2, obj3);
            case 20:
                cdw cdwVar = (cdw) obj4;
                hwe hweVar2 = (hwe) obj;
                zxj0 zxj0Var2 = (zxj0) obj2;
                m0k0 m0k0Var2 = (m0k0) obj3;
                rqt rqtVar = cdw.R1;
                hweVar2.getClass();
                zxj0Var2.getClass();
                m0k0Var2.getClass();
                int iOrdinal3 = hweVar2.ordinal();
                if (iOrdinal3 == 0) {
                    cdwVar.G0().x(new ecw(zxj0Var2, m0k0Var2));
                } else {
                    if (iOrdinal3 != 1) {
                        t9f.b();
                        return null;
                    }
                    cdwVar.G0().x(new bcw(zxj0Var2, m0k0Var2));
                }
                return Unit.f46060a;
            case 21:
                xmw xmwVar = (xmw) obj4;
                fet fetVar18 = (fet) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar18.U(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    kbc.v(xmwVar, fetVar18, 0);
                } else {
                    fetVar18.X();
                }
                return Unit.f46060a;
            case 22:
                return c(obj, obj2, obj3);
            case 23:
                return g(obj, obj2, obj3);
            case 24:
                return h(obj, obj2, obj3);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return i(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return l(obj, obj2, obj3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return m(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return o(obj, obj2, obj3);
            default:
                x680 x680Var = (x680) obj4;
                mm40 mm40Var7 = (mm40) obj;
                fet fetVar19 = (fet) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                mm40Var7.getClass();
                if ((iIntValue19 & 6) == 0) {
                    iIntValue19 |= fetVar19.g(mm40Var7) ? (byte) 4 : (byte) 2;
                }
                if (fetVar19.U(iIntValue19 & 1, (iIntValue19 & 19) != 18)) {
                    buy buyVar = x680Var.c;
                    if (buyVar instanceof auy) {
                        fetVar19.e0(1593882171);
                        v8q0.a(((auy) buyVar).f1501a, mm40Var7, 0L, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar19), fetVar19, (iIntValue19 << 3) & 112, 24960, 109564);
                        fetVar19.r(false);
                    } else if (buyVar instanceof yty) {
                        fetVar19.e0(1298353968);
                        obc.d(bmd.n.a(k6z.f17794a), u1c.M(2108186933, new r7y((yty) buyVar, mm40Var7, b3), fetVar19), fetVar19, 56);
                        fetVar19.r(false);
                    } else {
                        if (!(buyVar instanceof zty)) {
                            throw b1j.f(1298338962, fetVar19, false);
                        }
                        fetVar19.e0(1298359749);
                        wdx.e(iIntValue19 & 14, fetVar19, mm40Var7, ((zty) buyVar).f44984a);
                        fetVar19.r(false);
                    }
                } else {
                    fetVar19.X();
                }
                return Unit.f46060a;
        }
    }
}
