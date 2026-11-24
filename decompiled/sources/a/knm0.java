package a;

import android.javax.sip.message.Response;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class knm0 {
    public static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = Payload.TYPE;
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final void b(long j, fqj0 fqj0Var, fet fetVar, int i) {
        fqj0Var.getClass();
        fetVar.g0(1118465413);
        int i2 = i | (fetVar.f(j) ? 4 : 2) | (fetVar.g(fqj0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), j, jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 8.0f, 18.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 70.0f), 16.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 16.0f)), fqj0Var, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yxh(j, fqj0Var, i, (byte) 8);
        }
    }

    public static final void c(mm40 mm40Var, n3l0 n3l0Var, b3q b3qVar, Function1 function1, fet fetVar, int i) {
        b3qVar.getClass();
        function1.getClass();
        fetVar.g0(1291181148);
        byte b = 2;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(n3l0Var) ? 32 : 16) | (fetVar.g(b3qVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zrm zrmVar = new zrm(new b2l0(b3qVar.b, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary()), (u1l0) null, new d3l0(b3qVar.e, true), (d4d) null, n3l0Var, 42);
            int i3 = i2 & 7168;
            int i4 = i2 & 896;
            boolean z = (i3 == 2048) | (i4 == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new o0k0((Object) function1, (Object) b3qVar, (byte) 20);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = (i3 == 2048) | (i4 == 256);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new itn0(function1, b3qVar, b);
                fetVar.o0(objP2);
            }
            agc.r(mm40Var, zrmVar, function0, null, null, (Function1) objP2, null, fetVar, i2 & 14, 88);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 9, i, mm40Var, n3l0Var, b3qVar, function1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x01e3  */
    public static final void d(mm40 mm40Var, adr0 adr0Var, Function1 function1, fet fetVar, int i) {
        boolean z;
        fet fetVar2 = fetVar;
        adr0Var.getClass();
        function1.getClass();
        fetVar2.g0(-187552506);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(adr0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            Object[] objArr = new Object[0];
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new hvy((byte) 17);
                fetVar2.o0(objP);
            }
            Function2 function2 = (Function2) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new z8z((byte) 6);
                fetVar2.o0(objP2);
            }
            v0h0 v0h0VarL = qxw.L((Function1) objP2, function2);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new pcy((byte) 20);
                fetVar2.o0(objP3);
            }
            pdz pdzVar = (pdz) e9x.R(objArr, v0h0VarL, (Function0) objP3, fetVar2, 384);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            xcr0 xcr0Var = adr0Var.b;
            if (xcr0Var != null) {
                fetVar2.e0(1769133423);
                mm40 mm40VarN = jm40.b;
                mm40 mm40VarD = o7k0.d(mm40VarN, 1.0f);
                Object objP4 = fetVar2.P();
                if (objP4 == cl5Var) {
                    objP4 = new t6q0((byte) 28);
                    fetVar2.o0(objP4);
                }
                mm40 mm40VarK = rq8.K(mm40VarD, (Function1) objP4);
                if (xcr0Var.c instanceof gyl) {
                    zcl zclVar = qmk.f28987a;
                    mm40VarN = s5x0.N(mm40VarN, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                }
                mm40 mm40VarE = mm40VarK.e(mm40VarN);
                hyl hylVar = xcr0Var.c;
                boolean z2 = (i2 & 896) == 256;
                Object objP5 = fetVar2.P();
                if (z2 || objP5 == cl5Var) {
                    objP5 = new coo0(function1, (byte) 29);
                    fetVar2.o0(objP5);
                }
                osm0.c(mm40VarE, hylVar, (Function1) objP5, fetVar2, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1769597586);
                fetVar2.r(false);
            }
            if (xcr0Var != null) {
                int i3 = xcr0Var.f40661a;
                if (xcr0Var.b > 0) {
                    fetVar2.e0(1769702025);
                    yje yjeVar = null;
                    xiu0 xiu0VarK = w9x.K(null, fetVar2, 15);
                    int i4 = i2 & 112;
                    boolean z3 = i4 == 32;
                    Object objP6 = fetVar2.P();
                    if (z3 || objP6 == cl5Var) {
                        objP6 = new h3q0((Object) adr0Var, (byte) 26);
                        fetVar2.o0(objP6);
                    }
                    kwj kwjVarB = zk80.b(i3, (Function0) objP6, fetVar2, 0, 2);
                    Integer numValueOf = Integer.valueOf(i3);
                    boolean zG = (i4 == 32) | fetVar2.g(kwjVarB);
                    Object objP7 = fetVar2.P();
                    if (zG || objP7 == cl5Var) {
                        objP7 = new meq0((Object) kwjVarB, (Object) adr0Var, yjeVar, (byte) 11);
                        fetVar2.o0(objP7);
                    }
                    m0x0.t(fetVar2, numValueOf, (Function2) objP7);
                    z = true;
                    q5x.e(kwjVarB, new x7z(1.0f, true), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-1556215625, new d2s(xiu0VarK, pdzVar, (byte) 23), fetVar2), fetVar, 100663296, 24576, 16124);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    z = true;
                    fetVar2.e0(-1051258642);
                    i4w0.J(new x7z(1.0f, true), 0, pdzVar, fetVar2, 48, 0);
                    fetVar2.r(false);
                }
            } else {
                z = true;
                fetVar2.e0(-1051258642);
                i4w0.J(new x7z(1.0f, true), 0, pdzVar, fetVar2, 48, 0);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, adr0Var, function1, i, (byte) 25);
        }
    }

    public static final void e(mm40 mm40Var, String str, String str2, Function0 function0, Function0 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        function0.getClass();
        function1.getClass();
        fetVar2.g0(-181529402);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_replenish_account);
            m0x m0xVar = new m0x(R.drawable.ic_glyph_replenish_account, null, 6);
            zfn zfnVar = zaq0.b;
            nui0 nui0Var = new nui0(numValueOf, null, m0xVar, new y3d(((ThemeColors) fetVar2.k(zfnVar)).getSecondary()), null, new pc5(new y3d(((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent())), 0.0f, 210);
            tui0 tui0Var = new tui0(str, null);
            wui0 wui0Var = wui0.f39793a;
            qvi0 qvi0Var = qvi0.f29388a;
            obc.q(null, new rqm((vui0) tui0Var, (pui0) nui0Var, (pvi0) null, (d4d) null, (tvi0) qvi0Var, wui0Var, false, (e900) null, Response.CONDITIONAL_REQUEST_FAILED), false, null, function0, null, null, null, fetVar2, ((i2 << 3) & 57344) | 384, 233);
            zcl zclVar = qmk.f28987a;
            mbc.o(zfi0.f44303a, s5x0.L(jm40Var, 16.0f, 0.0f, 2), false, fetVar, 6, 4);
            obc.q(null, new rqm((vui0) new tui0(str2, null), (pui0) new nui0(Integer.valueOf(R.drawable.ic_glyph_withdraw_account), null, new m0x(R.drawable.ic_glyph_withdraw_account, null, 6), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), null, new pc5(new y3d(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent())), 0.0f, 210), (pvi0) null, (d4d) null, (tvi0) qvi0Var, wui0Var, false, (e900) null, Response.CONDITIONAL_REQUEST_FAILED), false, null, function1, null, null, null, fetVar, (i2 & 57344) | 384, 233);
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tvl0(mm40Var2, str, str2, (Object) function0, (Object) function1, i, (byte) 8);
        }
    }

    public static final ch80 f(hh80 hh80Var, fet fetVar) {
        pz40 pz40VarF;
        float f;
        hh80Var.getClass();
        vfx vfxVarH = tfx.H(fetVar);
        ycl yclVar = null;
        p7m0 p7m0Var = vfxVarH != null ? vfxVarH.f37357a : null;
        if (p7m0Var == null) {
            fetVar.e0(1730824416);
            fetVar.r(false);
            pz40VarF = null;
        } else {
            fetVar.e0(-636903615);
            pz40VarF = ydx.F(p7m0Var, fetVar);
            fetVar.r(false);
        }
        cgx cgxVar = pz40VarF != null ? (cgx) pz40VarF.getValue() : null;
        Integer numValueOf = cgxVar != null ? Integer.valueOf(cgxVar.f4335a) : null;
        if (numValueOf == null) {
            fetVar.e0(1730912456);
            fetVar.r(false);
        } else {
            fetVar.e0(-636900775);
            float fE = pkd.e(numValueOf.intValue(), fetVar);
            fetVar.r(false);
            yclVar = new ycl(fE);
        }
        if (yclVar != null) {
            f = yclVar.f42389a;
        } else {
            zcl zclVar = qmk.f28987a;
            f = 0.0f;
        }
        return new ch80(hh80Var, s5x0.u(0.0f, 0.0f, 0.0f, f, 7));
    }

    public static final ch80 g(hh80 hh80Var, fet fetVar) {
        pz40 pz40VarF;
        float f;
        hh80Var.getClass();
        vfx vfxVarH = tfx.H(fetVar);
        ycl yclVar = null;
        p7m0 p7m0Var = vfxVarH != null ? vfxVarH.f37357a : null;
        if (p7m0Var == null) {
            fetVar.e0(1438450319);
            fetVar.r(false);
            pz40VarF = null;
        } else {
            fetVar.e0(-1200524366);
            pz40VarF = ydx.F(p7m0Var, fetVar);
            fetVar.r(false);
        }
        cgx cgxVar = pz40VarF != null ? (cgx) pz40VarF.getValue() : null;
        Integer numValueOf = cgxVar != null ? Integer.valueOf(cgxVar.f4335a) : null;
        if (numValueOf == null) {
            fetVar.e0(1438538359);
            fetVar.r(false);
        } else {
            fetVar.e0(-1200521526);
            float fE = pkd.e(numValueOf.intValue(), fetVar);
            fetVar.r(false);
            yclVar = new ycl(fE);
        }
        if (yclVar != null) {
            f = yclVar.f42389a;
        } else {
            zcl zclVar = qmk.f28987a;
            f = 0.0f;
        }
        zcl zclVar2 = qmk.f28987a;
        return new ch80(hh80Var, s5x0.u(0.0f, 0.0f, 0.0f, f + 56.0f, 7));
    }

    public static final void h(View view, boolean z) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        sj3.L0(view, 0, 0, 0, (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0) + ((cgx) tfx.B(view).f37357a.getValue()).f4335a + (z ? view.getResources().getDimensionPixelSize(R.dimen.bottom_navigation_view_height) : 0), 7);
    }

    public static final void i(View view, boolean z) {
        view.getClass();
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom() + ((cgx) tfx.B(view).f37357a.getValue()).f4335a + (z ? view.getResources().getDimensionPixelSize(R.dimen.bottom_navigation_view_height) : 0));
    }

    public static cit0 j() {
        iun iunVar = iun.f15405a;
        return new cit0(0, 0, 0, 0, iunVar, 0, 0, iunVar, "", false, 0, 0, 0.0d, "", 0, 0, 0, 0, false, false, "", false, 0, false, false, 0, "", 0.0d, 0.0d, iunVar, 0.0d, 0.0d, iunVar, false, false, 0.0d, "", 0.0d, false, 0.0d, iunVar, 0, 0.0d, 0.0d, "", false, ozc.POSSIBLE_PAYOUT, "", iunVar, 0, "", false, 0, oxk0.DEFAULT, 0.0d, "", 0.0d, false, null);
    }

    public static final boolean k(long j, long j2) {
        return j == j2;
    }

    public static final Object l(iva0 iva0Var, String str, zje zjeVar) {
        Object objA = iva0Var.a(str, new tri0(2, null, (byte) 22), zjeVar);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    public static final int m(HashMap map, Map map2) {
        Integer num = (Integer) CollectionsKt.g0(map.values());
        return ((num == null && (num = (Integer) CollectionsKt.g0(map2.values())) == null) ? 1 : num.intValue()) + 2;
    }

    public static final m9p0 n(String str) {
        return new m9p0(str, new ijm());
    }

    public static final int o(jnm0 jnm0Var, xiv0 xiv0Var) {
        jnm0Var.getClass();
        if (jnm0Var.equals(hnm0.f13359a)) {
            return xiv0Var.f40966a.i(1).b;
        }
        if (jnm0Var.equals(inm0.f15081a)) {
            return 0;
        }
        t9f.b();
        return 0;
    }

    public static final String p(ctf0 ctf0Var, sba0 sba0Var, huo0 huo0Var, suo0 suo0Var) {
        ctf0Var.getClass();
        sba0 sba0Var2 = sba0.GAMING;
        if (sba0Var == sba0Var2 && (huo0Var instanceof wdt) && (suo0Var instanceof puo0)) {
            wdt wdtVar = (wdt) huo0Var;
            wqd wqdVar = wdtVar.f38989a;
            String str = wdtVar.b.b;
            pn40 pn40Var = pn40.f27267a;
            puo0 puo0Var = (puo0) suo0Var;
            return ctf0Var.b.a(R.string.daily_task_description_sum, Arrays.copyOf(new Object[]{str, "\u200e".concat(pn40.i(wqdVar.e, 2)), wqdVar.b, "\u200e".concat(pn40.i(puo0Var.f27627a, 0)), puo0Var.b.b, puo0Var.c.b}, 6));
        }
        if (sba0Var == sba0Var2 && (huo0Var instanceof ydt) && (suo0Var instanceof puo0)) {
            ydt ydtVar = (ydt) huo0Var;
            pn40 pn40Var2 = pn40.f27267a;
            puo0 puo0Var2 = (puo0) suo0Var;
            return ctf0Var.b.a(R.string.daily_task_description_bets, Arrays.copyOf(new Object[]{pn40.i(ydtVar.f42456a.e, 0), ydtVar.b.b, "\u200e".concat(pn40.i(puo0Var2.f27627a, 0)), puo0Var2.b.b, puo0Var2.c.b}, 5));
        }
        if (sba0Var == sba0Var2 && (huo0Var instanceof xdt) && (suo0Var instanceof puo0)) {
            xdt xdtVar = (xdt) huo0Var;
            wqd wqdVar2 = xdtVar.f40712a;
            String str2 = xdtVar.b.b;
            pn40 pn40Var3 = pn40.f27267a;
            puo0 puo0Var3 = (puo0) suo0Var;
            return ctf0Var.b.a(R.string.daily_task_description_2, Arrays.copyOf(new Object[]{str2, "\u200e".concat(pn40.i(wqdVar2.e, 2)), wqdVar2.b, "\u200e".concat(pn40.i(puo0Var3.f27627a, 0)), puo0Var3.b.b, puo0Var3.c.b}, 6));
        }
        if (sba0Var != sba0Var2 || !(huo0Var instanceof zdt) || !(suo0Var instanceof puo0)) {
            return ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
        }
        zdt zdtVar = (zdt) huo0Var;
        pn40 pn40Var4 = pn40.f27267a;
        puo0 puo0Var4 = (puo0) suo0Var;
        return ctf0Var.b.a(R.string.daily_task_description_4, Arrays.copyOf(new Object[]{pn40.i(zdtVar.f44224a.e, 0), zdtVar.b.b, "\u200e".concat(pn40.i(puo0Var4.f27627a, 0)), puo0Var4.b.b, puo0Var4.c.b}, 5));
    }

    public static final String q(ctf0 ctf0Var, suo0 suo0Var) {
        ctf0Var.getClass();
        if (suo0Var instanceof ouo0) {
            pn40 pn40Var = pn40.f27267a;
            ouo0 ouo0Var = (ouo0) suo0Var;
            return ctf0Var.b.a(R.string.daily_task_prize_description_bonus, Arrays.copyOf(new Object[]{"\u200e".concat(pn40.i(ouo0Var.f25886a, 2)), ouo0Var.b}, 2));
        }
        if (!(suo0Var instanceof puo0)) {
            return ctf0Var.b.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
        }
        pn40 pn40Var2 = pn40.f27267a;
        return ctf0Var.b.a(R.string.daily_task_prize_description_frsp, Arrays.copyOf(new Object[]{"\u200e".concat(pn40.i(((puo0) suo0Var).f27627a, 0))}, 1));
    }

    public static final mm40 r(mm40 mm40Var) {
        mm40Var.getClass();
        mm40 mm40VarS = o050.S(mm40Var);
        zcl zclVar = qmk.f28987a;
        return s5x0.N(mm40VarS, 0.0f, 0.0f, 0.0f, 56.0f, 7);
    }

    public static final mm40 s(int i, fet fetVar, mm40 mm40Var) {
        mm40Var.getClass();
        WeakHashMap weakHashMap = djv0.w;
        mm40 mm40VarE = mm40Var.e(new hp80(zcm0.i(fetVar).e));
        zcl zclVar = qmk.f28987a;
        return s5x0.N(mm40VarE, 0.0f, 0.0f, 0.0f, 56.0f, 7);
    }

    public static final float t(int i, fet fetVar, boolean z) {
        pz40 pz40VarF;
        float f;
        if ((i & 1) != 0) {
            z = true;
        }
        vfx vfxVarH = tfx.H(fetVar);
        ycl yclVar = null;
        p7m0 p7m0Var = vfxVarH != null ? vfxVarH.f37357a : null;
        if (p7m0Var == null) {
            fetVar.e0(-512422144);
            fetVar.r(false);
            pz40VarF = null;
        } else {
            fetVar.e0(-432171743);
            pz40VarF = ydx.F(p7m0Var, fetVar);
            fetVar.r(false);
        }
        cgx cgxVar = pz40VarF != null ? (cgx) pz40VarF.getValue() : null;
        Integer numValueOf = cgxVar != null ? Integer.valueOf(cgxVar.f4335a) : null;
        if (numValueOf == null) {
            fetVar.e0(-512337080);
            fetVar.r(false);
        } else {
            fetVar.e0(-432168999);
            float fE = pkd.e(numValueOf.intValue(), fetVar);
            fetVar.r(false);
            yclVar = new ycl(fE);
        }
        float f2 = 0.0f;
        if (yclVar != null) {
            f = yclVar.f42389a;
        } else {
            zcl zclVar = qmk.f28987a;
            f = 0.0f;
        }
        if (z) {
            zcl zclVar2 = qmk.f28987a;
            f2 = 56.0f;
        } else {
            zcl zclVar3 = qmk.f28987a;
        }
        return f + f2;
    }

    public static String u(int i) {
        if (i == 0) {
            return "Clamp";
        }
        if (i == 1) {
            return "Repeated";
        }
        if (i == 2) {
            return "Mirror";
        }
        return i == 3 ? "Decal" : "Unknown";
    }

    public static final List v(ctf0 ctf0Var, List list) {
        list.getClass();
        ctf0Var.getClass();
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        lsm0 lsm0Var = ctf0Var.b;
        q6p0 q6p0Var = new q6p0(lsm0Var.a(R.string.change, Arrays.copyOf(new Object[0], 0)));
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rfp0 rfp0Var = (rfp0) it.next();
            rfp0Var.getClass();
            int i = rfp0Var.b;
            arrayList.add(new r6p0(i, vsm0.s(i, rfp0Var.d), rfp0Var.c));
        }
        String strA = lsm0Var.a(R.string.my_special_event_teams, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        eok0 eok0Var = new eok0(new hjm(strA, null, new y3d(s6t0.b().f33626a.getTextPrimary()), null, null, null, false, null, null, false, null, null, 8186), null, i9h0.f14386a);
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(q6p0Var);
        lc00VarB.addAll(arrayList);
        return q3d.j(eok0Var, new sqp0(dyb.r0(kotlin.collections.a.a(lc00VarB))));
    }

    public static udw0 w(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        StringBuilder sbN = b1j.n("Failed to parse ", str, " for string [", str2, "] with exception: ");
        sbN.append(message);
        Log.e(str, sbN.toString());
        return new udw0(b1j.k("Failed to parse ", str, " for string [", str2, "]"), exc);
    }

    public static void x(JSONObject jSONObject, String str, String str2) throws JSONException {
        jSONObject.put(str, str2);
        jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }
}
