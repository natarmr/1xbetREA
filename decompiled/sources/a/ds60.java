package a;

import android.os.Bundle;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ds60 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6598a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ds60(Object obj, byte b) {
        this.f6598a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2) {
        kb90 kb90Var = (kb90) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK0 = mrv.k0(jm40Var, "DESCRIPTION_TEXT");
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
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
            v8q0.a(kb90Var.b, ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, false), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.l(g1t0.q(), fetVar), fetVar, 0, 24960, 110588);
            v8q0.a(kb90Var.c, jm40Var, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.l(g1t0.q(), fetVar), fetVar, 48, 24960, 110588);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        ep90 ep90Var = (ep90) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        jh70 jh70Var = ep90.c2;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            Unit unit = Unit.f46060a;
            boolean zI = fetVar.i(ep90Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new z210(ep90Var, null, (byte) 27);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, unit, (Function2) objP);
            pz40 pz40VarY = ((i3t0) ep90Var.K0()).y(fetVar);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = jgk0.b(new gg90(xczVarA, (byte) 6));
                fetVar.o0(objP2);
            }
            l7m0 l7m0Var = (l7m0) objP2;
            boolean zI2 = fetVar.i(ep90Var);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new bp90(ep90Var, (byte) 1);
                fetVar.o0(objP3);
            }
            v3c.A((Function0) objP3, null, null, fetVar, 0, 6);
            bee beeVar = ((ur90) pz40VarY.getValue()).f36153a;
            boolean zI3 = fetVar.i(ep90Var);
            Object objP4 = fetVar.P();
            if (zI3 || objP4 == cl5Var) {
                objP4 = new bp90(ep90Var, (byte) 2);
                fetVar.o0(objP4);
            }
            phu0.e(null, beeVar, l7m0Var, (Function0) objP4, u1c.M(284518050, new qb((Object) pz40VarY, (Object) xczVarA, (Object) ep90Var, false, (byte) 9), fetVar), fetVar, 24960);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Exception {
        Object value;
        d980 d980Var;
        byte b = this.f6598a;
        byte b2 = 7;
        byte b3 = 4;
        cl5 cl5Var = ukd.f35823a;
        byte b4 = 2;
        byte b5 = 3;
        boolean z = false;
        byte b6 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                gs60 gs60Var = (gs60) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                uuz uuzVar = gs60.R1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d9z d9zVarA = f9z.a(fetVar);
                    Unit unit = Unit.f46060a;
                    boolean zI = fetVar.i(gs60Var) | fetVar.g(d9zVarA);
                    Object objP = fetVar.P();
                    yje yjeVar = null;
                    if (zI || objP == cl5Var) {
                        objP = new nf60(gs60Var, d9zVarA, yjeVar, b2);
                        fetVar.o0(objP);
                    }
                    m0x0.t(fetVar, unit, (Function2) objP);
                    gmq gmqVarW = ((k370) gs60Var.P1.getValue()).w();
                    boolean zI2 = fetVar.i(gs60Var);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new nf60(gs60Var, yjeVar, (byte) 8);
                        fetVar.o0(objP2);
                    }
                    lkz lkzVar = lkz.f20223a;
                    clz clzVarW = aac.W(gs60Var);
                    qjj.W(x0x.Q(clzVarW.x()), null, null, new ji60((i89) gmqVarW, clzVarW, (Function2) objP2, null, (byte) 1), 3);
                    pz40 pz40VarY = ((i3t0) gs60Var.G0()).y(fetVar);
                    k3t0 k3t0VarG0 = gs60Var.G0();
                    boolean zI3 = fetVar.i(k3t0VarG0);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        jw50 jw50Var = new jw50(1, k3t0VarG0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                        fetVar.o0(jw50Var);
                        objP3 = jw50Var;
                    }
                    Function1 function1 = (Function1) ((jhy) objP3);
                    boolean zI4 = fetVar.i(gs60Var);
                    Object objP4 = fetVar.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new cs60(gs60Var, b4);
                        fetVar.o0(objP4);
                    }
                    rsr0.G(d9zVarA, pz40VarY, function1, (Function1) objP4, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                xt60 xt60Var = (xt60) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                xuz xuzVar = xt60.V1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Unit unit2 = Unit.f46060a;
                    boolean zI5 = fetVar2.i(xt60Var);
                    Object objP5 = fetVar2.P();
                    if (zI5 || objP5 == cl5Var) {
                        objP5 = new vt60(xt60Var, z ? (byte) 1 : (byte) 0);
                        fetVar2.o0(objP5);
                    }
                    m0x0.o(unit2, (Function1) objP5, fetVar2);
                    boolean zI6 = fetVar2.i(xt60Var);
                    Object objP6 = fetVar2.P();
                    if (zI6 || objP6 == cl5Var) {
                        objP6 = new ut60(xt60Var, (byte) 5);
                        fetVar2.o0(objP6);
                    }
                    Function0 function0 = (Function0) objP6;
                    boolean zI7 = fetVar2.i(xt60Var);
                    Object objP7 = fetVar2.P();
                    if (zI7 || objP7 == cl5Var) {
                        objP7 = new ut60(xt60Var, (byte) 6);
                        fetVar2.o0(objP7);
                    }
                    v3c.A(function0, (Function0) objP7, null, fetVar2, 0, 4);
                    k3t0 k3t0VarG1 = xt60Var.G0();
                    boolean zI8 = fetVar2.i(xt60Var);
                    Object objP8 = fetVar2.P();
                    if (zI8 || objP8 == cl5Var) {
                        objP8 = new vt60(xt60Var, b6);
                        fetVar2.o0(objP8);
                    }
                    clz clzVar = (clz) fetVar2.k(or00.f25714a);
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP8, fetVar2);
                    boolean zI9 = fetVar2.i(k3t0VarG1) | fetVar2.i(clzVar) | fetVar2.e(3) | fetVar2.g(pz40VarF);
                    Object objP9 = fetVar2.P();
                    if (zI9 || objP9 == cl5Var) {
                        objP9 = new pc(k3t0VarG1, clzVar, pz40VarF, null, (byte) 26);
                        fetVar2.o0(objP9);
                    }
                    m0x0.t(fetVar2, clzVar, (Function2) objP9);
                    pz40 pz40VarY2 = ((i3t0) xt60Var.G0()).y(fetVar2);
                    k3t0 k3t0VarG2 = xt60Var.G0();
                    boolean zI10 = fetVar2.i(k3t0VarG2);
                    Object objP10 = fetVar2.P();
                    if (zI10 || objP10 == cl5Var) {
                        jw50 jw50Var2 = new jw50(1, k3t0VarG2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 24);
                        fetVar2.o0(jw50Var2);
                        objP10 = jw50Var2;
                    }
                    jiq0.N(pz40VarY2, (Function1) ((jhy) objP10), fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                wwa wwaVar = (wwa) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str = ((vwa) wwaVar).f38140a;
                    pz40 pz40Var = s6t0.f31722a;
                    jiq0.j(str, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), s6t0.b().f33626a.getSecondary(), null, null, fetVar3, 0, 24);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                gx60 gx60Var = (gx60) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                atz atzVar = gx60.R1;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Unit unit3 = Unit.f46060a;
                    boolean zI11 = fetVar4.i(gx60Var);
                    Object objP11 = fetVar4.P();
                    if (zI11 || objP11 == cl5Var) {
                        objP11 = new cx60(gx60Var, b5);
                        fetVar4.o0(objP11);
                    }
                    m0x0.o(unit3, (Function1) objP11, fetVar4);
                    boolean zI12 = fetVar4.i(gx60Var);
                    Object objP12 = fetVar4.P();
                    if (zI12 || objP12 == cl5Var) {
                        objP12 = new dx60(gx60Var, b3);
                        fetVar4.o0(objP12);
                    }
                    Function0 function2 = (Function0) objP12;
                    boolean zI13 = fetVar4.i(gx60Var);
                    Object objP13 = fetVar4.P();
                    if (zI13 || objP13 == cl5Var) {
                        objP13 = new dx60(gx60Var, (byte) 5);
                        fetVar4.o0(objP13);
                    }
                    v3c.A(function2, (Function0) objP13, null, fetVar4, 0, 4);
                    d9z d9zVarA2 = f9z.a(fetVar4);
                    k3t0 k3t0VarG3 = gx60Var.G0();
                    boolean zI14 = fetVar4.i(gx60Var);
                    Object objP14 = fetVar4.P();
                    if (zI14 || objP14 == cl5Var) {
                        objP14 = new cx60(gx60Var, b3);
                        fetVar4.o0(objP14);
                    }
                    clz clzVar2 = (clz) fetVar4.k(or00.f25714a);
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) objP14, fetVar4);
                    boolean zI15 = fetVar4.i(k3t0VarG3) | fetVar4.i(clzVar2) | fetVar4.e(3) | fetVar4.g(pz40VarF2);
                    Object objP15 = fetVar4.P();
                    if (zI15 || objP15 == cl5Var) {
                        pc pcVar = new pc(k3t0VarG3, clzVar2, pz40VarF2, null, (byte) 27);
                        fetVar4.o0(pcVar);
                        objP15 = pcVar;
                    }
                    m0x0.t(fetVar4, clzVar2, (Function2) objP15);
                    pz40 pz40VarY3 = ((i3t0) gx60Var.G0()).y(fetVar4);
                    k3t0 k3t0VarG4 = gx60Var.G0();
                    boolean zI16 = fetVar4.i(k3t0VarG4);
                    Object objP16 = fetVar4.P();
                    if (zI16 || objP16 == cl5Var) {
                        jw50 jw50Var3 = new jw50(1, k3t0VarG4, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                        fetVar4.o0(jw50Var3);
                        objP16 = jw50Var3;
                    }
                    jar0.w(0, fetVar4, d9zVarA2, pz40VarY3, (Function1) ((jhy) objP16));
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                py60 py60Var = (py60) obj3;
                a8z a8zVar = py60Var.O1;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                iiy[] iiyVarArr = py60.P1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI17 = fetVar5.i(py60Var);
                    Object objP17 = fetVar5.P();
                    if (zI17 || objP17 == cl5Var) {
                        cy60 cy60Var = new cy60(1, py60Var, py60.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/games_list/features/games/filter/compose/models/OneXGamesFilterSideEffect;)V", 0, (byte) 3);
                        fetVar5.o0(cy60Var);
                        objP17 = cy60Var;
                    }
                    lkz lkzVar4 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP17), fetVar5);
                    boolean zI18 = fetVar5.i(k3t0Var) | fetVar5.i(py60Var) | fetVar5.e(3) | fetVar5.g(pz40VarF3);
                    Object objP18 = fetVar5.P();
                    if (zI18 || objP18 == cl5Var) {
                        p000 p000Var = new p000(k3t0Var, py60Var, pz40VarF3, null, (byte) 26);
                        fetVar5.o0(p000Var);
                        objP18 = p000Var;
                    }
                    m0x0.t(fetVar5, py60Var, (Function2) objP18);
                    uy60 uy60Var = (uy60) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar5).getValue();
                    boolean zI19 = fetVar5.i(py60Var);
                    Object objP19 = fetVar5.P();
                    if (zI19 || objP19 == cl5Var) {
                        objP19 = new cd60((Object) py60Var, (byte) 9);
                        fetVar5.o0(objP19);
                    }
                    yyw.m(uy60Var, (Function1) objP19, fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 5:
                vzg0 vzg0Var = (vzg0) obj3;
                c270 c270Var = (c270) obj2;
                ((oyg0) obj).getClass();
                c270Var.getClass();
                String str2 = (String) vzg0Var.a("OneXGamesPromo.BUNDLE_UM_RESULT_KEY");
                String str3 = str2 == null ? "" : str2;
                String str4 = (String) vzg0Var.a("OneXGamesPromo.BUNDLE_SCREEN_NAME");
                String str5 = str4 == null ? "" : str4;
                d270 d270Var = (d270) vzg0Var.d("OPEN_PROMO_KEY");
                if (d270Var == null) {
                    d270Var = d270.UNKNOWN;
                }
                return c270.a(c270Var, str5, str3, d270Var, false, false, null, null, null, 248);
            case 6:
                ((Integer) obj2).getClass();
                x2x.f((s970) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                x2x.g((t970) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                b5x.j((tc70) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                b5x.i((sc70) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                xb70 xb70Var = (xb70) obj2;
                ((oyg0) obj).getClass();
                xb70Var.getClass();
                return xb70.a(xb70Var, null, null, null, false, false, false, false, false, null, false, false, 0, false, null, null, null, z870.a(xb70Var.q, 0, null, false, ((e870) obj3).f7360a.c, null, false, 55), 65535);
            case 11:
                ck60 ck60Var = (ck60) obj3;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ((Integer) obj2).getClass();
                xuz xuzVar2 = dg70.Q1;
                if (!zBooleanValue) {
                    ck60Var.invoke();
                }
                return Unit.f46060a;
            case 12:
                ck60 ck60Var2 = (ck60) obj3;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ((Integer) obj2).getClass();
                jh70 jh70Var = mh70.Q1;
                if (!zBooleanValue2) {
                    ck60Var2.invoke();
                }
                return Unit.f46060a;
            case 13:
                bn70 bn70Var = (bn70) obj3;
                Bundle bundle = (Bundle) obj2;
                iiy[] iiyVarArr2 = bn70.S1;
                if (!h97.B(bundle, (String) obj, "REQUEST_SELECT_BONUS_KEY")) {
                    return Unit.f46060a;
                }
                if (!bundle.containsKey("RESULT_ON_ITEM_SELECTED_LISTENER_KEY")) {
                    return Unit.f46060a;
                }
                Serializable serializable = bundle.getSerializable("RESULT_ON_ITEM_SELECTED_LISTENER_KEY");
                csr csrVar = serializable instanceof csr ? (csr) serializable : null;
                if (csrVar != null) {
                    to70 to70VarQ0 = bn70Var.Q0();
                    to70VarQ0.getClass();
                    to70VarQ0.w(new iy5(csrVar));
                }
                return Unit.f46060a;
            case 14:
                String str6 = (String) obj;
                Bundle bundle2 = (Bundle) obj2;
                jh70 jh70Var2 = kr70.S1;
                str6.getClass();
                bundle2.getClass();
                ((kr70) obj3).G0().x(new nq70(bundle2.getInt(str6)));
                return Unit.f46060a;
            case 15:
                n880 n880Var = (n880) obj3;
                Throwable th = (Throwable) obj;
                String str7 = (String) obj2;
                th.getClass();
                str7.getClass();
                if (th instanceof orv0) {
                    String strA = n880Var.D.b.a(R.string.callback_wrong_format, Arrays.copyOf(new Object[0], 0));
                    p7m0 p7m0Var = n880Var.i.f25029a;
                    while (true) {
                        Object value2 = p7m0Var.getValue();
                        value2.getClass();
                        n880Var.f.getClass();
                        String str8 = strA;
                        if (!p7m0Var.m(value2, y780.a((y780) value2, null, 0, null, null, strA, null, null, null, null, null, false, null, false, false, false, false, 262111))) {
                            strA = str8;
                        }
                    }
                } else if (th instanceof zhi0) {
                    String message = th.getMessage();
                    if (message == null || message.length() == 0) {
                        n880Var.G(new u780(n880Var.D.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0)), ""));
                    } else {
                        String strA2 = n880Var.D.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0));
                        String message2 = th.getMessage();
                        n880Var.G(new u780(strA2, message2 != null ? message2 : ""));
                    }
                } else {
                    n880Var.G(new u780(n880Var.D.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0)), str7));
                }
                return Unit.f46060a;
            case 16:
                aa80 aa80Var = (aa80) obj3;
                Throwable th2 = (Throwable) obj;
                String str9 = (String) obj2;
                th2.getClass();
                str9.getClass();
                if (th2 instanceof orv0) {
                    p7m0 p7m0Var2 = aa80Var.z;
                    do {
                        value = p7m0Var2.getValue();
                        d980Var = (d980) value;
                    } while (!p7m0Var2.m(value, d980.a(d980Var, false, null, c980.a(d980Var.c, null, aa80Var.q.b.a(R.string.callback_wrong_format, Arrays.copyOf(new Object[0], 0)), 3), null, null, false, false, 123)));
                } else if (th2 instanceof zhi0) {
                    String message3 = th2.getMessage();
                    if (message3 == null || message3.length() == 0) {
                        p7m0 p7m0Var3 = aa80Var.A;
                        t880 t880Var = new t880(aa80Var.q.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0)), "");
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, t880Var);
                    } else {
                        p7m0 p7m0Var4 = aa80Var.A;
                        String strA3 = aa80Var.q.b.a(R.string.caution, Arrays.copyOf(new Object[0], 0));
                        String message4 = th2.getMessage();
                        t880 t880Var2 = new t880(strA3, message4 != null ? message4 : "");
                        p7m0Var4.getClass();
                        p7m0Var4.o(null, t880Var2);
                    }
                } else {
                    p7m0 p7m0Var5 = aa80Var.A;
                    t880 t880Var3 = new t880(aa80Var.q.b.a(R.string.error_something_went_wrong, Arrays.copyOf(new Object[0], 0)), str9);
                    p7m0Var5.getClass();
                    p7m0Var5.o(null, t880Var3);
                }
                return Unit.f46060a;
            case 17:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ((ag80) obj3).r.m(fFloatValue);
                return Unit.f46060a;
            case 18:
                gn80 gn80Var = (gn80) obj3;
                fet fetVar6 = (fet) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                mi70 mi70Var = gn80.N1;
                if (fetVar6.U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    pz40 pz40VarQ = gkb.Q(((tn80) gn80Var.M1.getValue()).i, null, fetVar6, 0, 7);
                    dem0.e(((ln80) pz40VarQ.getValue()).b, false, u1c.M(-791148011, new xd80(gn80Var, pz40VarQ, b4), fetVar6), fetVar6, 384, 2);
                } else {
                    fetVar6.X();
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ou80 ou80Var = (ou80) obj3;
                fet fetVar7 = (fet) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                rl70 rl70Var = ou80.V1;
                if (fetVar7.U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    float fT = fbc.T(fetVar7);
                    boolean zD = fetVar7.d(fT);
                    Object objP20 = fetVar7.P();
                    Object obj4 = objP20;
                    if (zD || objP20 == cl5Var) {
                        lh80 lh80VarU = s5x0.u(0.0f, fT, 0.0f, 0.0f, 13);
                        fetVar7.o0(lh80VarU);
                        obj4 = lh80VarU;
                    }
                    hh80 hh80Var = (hh80) obj4;
                    dv80 dv80Var = (dv80) ((i3t0) ou80Var.G0()).y(fetVar7).getValue();
                    k3t0 k3t0VarG5 = ou80Var.G0();
                    boolean zI20 = fetVar7.i(ou80Var);
                    Object objP21 = fetVar7.P();
                    if (zI20 || objP21 == cl5Var) {
                        xj80 xj80Var = new xj80(1, ou80Var, ou80.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/impl/part_type_two/presentation/models/PartTypeTwoGamesSideEffect;)V", 0, (byte) 7);
                        fetVar7.o0(xj80Var);
                        objP21 = xj80Var;
                    }
                    lkz lkzVar5 = lkz.f20223a;
                    pz40 pz40VarF4 = androidx.compose.runtime.e.f((Function1) ((jhy) objP21), fetVar7);
                    boolean zI21 = fetVar7.i(k3t0VarG5) | fetVar7.i(ou80Var) | fetVar7.e(3) | fetVar7.g(pz40VarF4);
                    Object objP22 = fetVar7.P();
                    if (zI21 || objP22 == cl5Var) {
                        nu80 nu80Var = new nu80(k3t0VarG5, ou80Var, pz40VarF4, null, (byte) 0);
                        fetVar7.o0(nu80Var);
                        objP22 = nu80Var;
                    }
                    m0x0.t(fetVar7, ou80Var, (Function2) objP22);
                    boolean zBooleanValue3 = ou80Var.S1.n(ou80Var, ou80.W1[3]).booleanValue();
                    k3t0 k3t0VarG6 = ou80Var.G0();
                    boolean zI22 = fetVar7.i(k3t0VarG6);
                    Object objP23 = fetVar7.P();
                    if (zI22 || objP23 == cl5Var) {
                        objP23 = new xj80(1, k3t0VarG6, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 8);
                        fetVar7.o0(objP23);
                    }
                    aad.u(hh80Var, dv80Var, zBooleanValue3, (Function1) ((jhy) objP23), fetVar7, 0);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 20:
                uy80 uy80Var = (uy80) obj3;
                fet fetVar8 = (fet) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                jh70 jh70Var3 = uy80.W1;
                if (fetVar8.U(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zI23 = fetVar8.i(uy80Var);
                    Object objP24 = fetVar8.P();
                    Object obj5 = objP24;
                    if (zI23 || objP24 == cl5Var) {
                        sy80 sy80Var = new sy80(uy80Var, b4);
                        fetVar8.o0(sy80Var);
                        obj5 = sy80Var;
                    }
                    Function0 function3 = (Function0) obj5;
                    boolean zI24 = fetVar8.i(uy80Var);
                    Object objP25 = fetVar8.P();
                    Object obj6 = objP25;
                    if (zI24 || objP25 == cl5Var) {
                        sy80 sy80Var2 = new sy80(uy80Var, b5);
                        fetVar8.o0(sy80Var2);
                        obj6 = sy80Var2;
                    }
                    v3c.z(function3, (Function0) obj6, null, fetVar8, 0, 4);
                    pz40 pz40VarY4 = ((i3t0) uy80Var.G0()).y(fetVar8);
                    qdz qdzVar = uy80Var.P1;
                    boolean zI25 = fetVar8.i(uy80Var);
                    Object objP26 = fetVar8.P();
                    Object obj7 = objP26;
                    if (zI25 || objP26 == cl5Var) {
                        yr80 yr80Var = new yr80(uy80Var, b6);
                        fetVar8.o0(yr80Var);
                        obj7 = yr80Var;
                    }
                    dwi0.u(pz40VarY4, qdzVar, (Function1) obj7, fetVar8, 0);
                    k3t0 k3t0VarG7 = uy80Var.G0();
                    boolean zI26 = fetVar8.i(uy80Var);
                    Object objP27 = fetVar8.P();
                    if (zI26 || objP27 == cl5Var) {
                        xj80 xj80Var2 = new xj80(1, uy80Var, uy80.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/cyber/section/impl/partners/presentation/model/PartnersTeamsSideEffect;)V", 0, (byte) 9);
                        fetVar8.o0(xj80Var2);
                        objP27 = xj80Var2;
                    }
                    lkz lkzVar6 = lkz.f20223a;
                    pz40 pz40VarF5 = androidx.compose.runtime.e.f((Function1) ((jhy) objP27), fetVar8);
                    boolean zI27 = fetVar8.i(k3t0VarG7) | fetVar8.i(uy80Var) | fetVar8.e(3) | fetVar8.g(pz40VarF5);
                    Object objP28 = fetVar8.P();
                    if (zI27 || objP28 == cl5Var) {
                        nu80 nu80Var2 = new nu80(k3t0VarG7, uy80Var, pz40VarF5, null, (byte) 1);
                        fetVar8.o0(nu80Var2);
                        objP28 = nu80Var2;
                    }
                    m0x0.t(fetVar8, uy80Var, (Function2) objP28);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 21:
                b190 b190Var = (b190) obj3;
                Bundle bundle3 = (Bundle) obj2;
                fl70 fl70Var = b190.V1;
                ((String) obj).getClass();
                bundle3.getClass();
                String string = bundle3.getString("BAD_TOKEN_MESSAGE_RESULT");
                b190Var.H0().u.f(new j190(string != null ? string : ""));
                return Unit.f46060a;
            case 22:
                String str10 = (String) obj2;
                ((Throwable) obj).getClass();
                str10.getClass();
                ((t190) obj3).u.f(new i190(str10));
                return Unit.f46060a;
            case 23:
                l590 l590Var = (l590) obj3;
                fet fetVar9 = (fet) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                nh70 nh70Var = l590.Y1;
                if (fetVar9.U(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    pz40 pz40VarY5 = ((i3t0) l590Var.L0()).y(fetVar9);
                    boolean zI28 = fetVar9.i(l590Var);
                    Object objP29 = fetVar9.P();
                    if (zI28 || objP29 == cl5Var) {
                        xj80 xj80Var3 = new xj80(1, l590Var, l590.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/promotions/paymentconsultant/presentation/compose/models/PaymentConsultantSideEffect;)V", 0, (byte) 12);
                        fetVar9.o0(xj80Var3);
                        objP29 = xj80Var3;
                    }
                    l590Var.G0((Function1) ((jhy) objP29), fetVar9, 0);
                    FixedWebView fixedWebView = l590Var.N1;
                    if (fixedWebView == null) {
                        fetVar9.e0(582411369);
                        fetVar9.r(false);
                    } else {
                        fetVar9.e0(582411370);
                        d790 d790Var = (d790) pz40VarY5.getValue();
                        k3t0 k3t0VarL0 = l590Var.L0();
                        boolean zI29 = fetVar9.i(k3t0VarL0);
                        Object objP30 = fetVar9.P();
                        if (zI29 || objP30 == cl5Var) {
                            xj80 xj80Var4 = new xj80(1, k3t0VarL0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 13);
                            fetVar9.o0(xj80Var4);
                            objP30 = xj80Var4;
                        }
                        int i = FixedWebView.e;
                        xf0.t(d790Var, fixedWebView, (Function1) ((jhy) objP30), fetVar9, 64);
                        fetVar9.r(false);
                    }
                } else {
                    fetVar9.X();
                }
                return Unit.f46060a;
            case 24:
                x790 x790Var = (x790) obj3;
                a8z a8zVar2 = x790Var.O1;
                fet fetVar10 = (fet) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                fl70 fl70Var2 = x790.V1;
                if (fetVar10.U(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    k3t0 k3t0Var2 = (k3t0) a8zVar2.getValue();
                    boolean zI30 = fetVar10.i(x790Var);
                    Object objP31 = fetVar10.P();
                    if (zI30 || objP31 == cl5Var) {
                        xj80 xj80Var5 = new xj80(1, x790Var, x790.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/rules/impl/presentation/web/models/PaymentInfoSideEffect;)V", 0, (byte) 21);
                        fetVar10.o0(xj80Var5);
                        objP31 = xj80Var5;
                    }
                    lkz lkzVar7 = lkz.f20223a;
                    pz40 pz40VarF6 = androidx.compose.runtime.e.f((Function1) ((jhy) objP31), fetVar10);
                    boolean zI31 = fetVar10.i(k3t0Var2) | fetVar10.i(x790Var) | fetVar10.e(3) | fetVar10.g(pz40VarF6);
                    Object objP32 = fetVar10.P();
                    if (zI31 || objP32 == cl5Var) {
                        nu80 nu80Var3 = new nu80(k3t0Var2, x790Var, pz40VarF6, null, (byte) 3);
                        fetVar10.o0(nu80Var3);
                        objP32 = nu80Var3;
                    }
                    m0x0.t(fetVar10, x790Var, (Function2) objP32);
                    zz2 zz2Var = x790Var.P1;
                    iiy[] iiyVarArr3 = x790.W1;
                    String strH = x790Var.H(zz2Var.n(x790Var, iiyVarArr3[1]).intValue());
                    strH.getClass();
                    boolean zBooleanValue4 = x790Var.S1.n(x790Var, iiyVarArr3[4]).booleanValue();
                    g890 g890Var = (g890) ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar10).getValue();
                    k3t0 k3t0Var3 = (k3t0) a8zVar2.getValue();
                    boolean zI32 = fetVar10.i(k3t0Var3);
                    Object objP33 = fetVar10.P();
                    if (zI32 || objP33 == cl5Var) {
                        objP33 = new xj80(1, k3t0Var3, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 22);
                        fetVar10.o0(objP33);
                    }
                    Function1 function4 = (Function1) ((jhy) objP33);
                    boolean zI33 = fetVar10.i(x790Var);
                    Object objP34 = fetVar10.P();
                    if (zI33 || objP34 == cl5Var) {
                        objP34 = new xj80(1, x790Var, x790.class, "onWebViewInit", "onWebViewInit(Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;)V", 0, (byte) 23);
                        fetVar10.o0(objP34);
                    }
                    b34.F(null, strH, zBooleanValue4, g890Var, function4, (Function1) ((jhy) objP34), fetVar10, 0);
                } else {
                    fetVar10.X();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return a(obj, obj2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                kk90 kk90Var = (kk90) obj3;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((String) obj2).getClass();
                if ((th3 instanceof SocketTimeoutException) || (th3 instanceof UnknownHostException)) {
                    kk90Var.H();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return b(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                ucx.L((mom0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                tdm0 tdm0Var = (tdm0) obj3;
                fet fetVar11 = (fet) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (fetVar11.U(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    ucx.f(tdm0Var.f33776a, fetVar11, 0);
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarL = s5x0.L(mm40VarD, 0.0f, 8.0f, 1);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar11.T);
                    bh90 bh90VarM = fetVar11.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar11, mm40VarL);
                    mkd.c0.getClass();
                    fetVar11.i0();
                    if (fetVar11.S) {
                        fetVar11.l(e7z.u1);
                    } else {
                        fetVar11.r0();
                    }
                    jpm0.o(fetVar11, tj30VarC, gqw0.x);
                    jpm0.o(fetVar11, bh90VarM, gqw0.w);
                    jpm0.o(fetVar11, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar11);
                    jpm0.o(fetVar11, mm40VarC0, gqw0.v);
                    ucx.S(tdm0Var.c, tdm0Var.d, tdm0Var.e, tdm0Var.f, jeb.X(tdm0Var.b), fetVar11, 0);
                    fetVar11.r(true);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ds60(Object obj, int i, byte b) {
        this.f6598a = b;
        this.b = obj;
    }
}
