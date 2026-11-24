package a;

import android.content.Context;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.graphics.ColorMatrixColorFilter;
import android.javax.sip.message.Response;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hmw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ClassLoader f13325a;
    public static Thread b;
    public static final ugd c = new ugd(-869223072, false, new wgd(20));
    public static final ugd d = new ugd(-1545644539, false, new bhd(10));
    public static final ugd e = new ugd(63958333, false, new fhd(15));
    public static final ugd f = new ugd(1021654297, false, new ihd(25));
    public static final ugd g = new ugd(-1752860941, false, new shd(3));
    public static final byte[][] h = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}};

    public static final void A(mm40 mm40Var, long j, Function0 function0, fet fetVar, int i) {
        int i2;
        Function0 function1;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1393725227);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function1 = function0;
            i2 |= fetVar2.i(function1) ? 256 : 128;
        } else {
            function1 = function0;
        }
        byte b2 = 0;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.c(j);
                fetVar2.o0(objP);
            }
            egk0 egk0Var = (egk0) objP;
            yhh.a(j, false, 0L, null, u1c.M(-74981868, new qvv(egk0Var, b2), fetVar2), fetVar2, ((i2 >> 3) & 14) | 24624, 12);
            if (egk0Var.l() > 0) {
                fetVar2.e0(-1019015650);
                StaticColors staticColors = StaticColors.INSTANCE;
                e900 e900VarN = yk5.n(q3d.j(new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m62getBlack0d7_KjU())), 0.0f, 0.0f, 14);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarP = i120.P(mm40Var, e900VarN, vgg0.c(0.0f, 0.0f, 4.0f, 4.0f, 3), 4);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarP);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(e7z.u1);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, gqw0.x);
                jpm0.o(fetVar2, bh90VarM, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                Object objP2 = fetVar2.P();
                if (objP2 == cl5Var) {
                    objP2 = androidx.compose.runtime.e.e(new daq0(qmk.p));
                    fetVar2.o0(objP2);
                }
                pz40 pz40Var = (pz40) objP2;
                String strValueOf = String.valueOf(egk0Var.l());
                mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.h);
                long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                long j2 = ((daq0) pz40Var.getValue()).f5764a;
                Object objP3 = fetVar2.P();
                if (objP3 == cl5Var) {
                    objP3 = new y9v(pz40Var, (byte) 2);
                    fetVar2.o0(objP3);
                }
                v8q0.a(strValueOf, mm40VarB, jM123getWhite0d7_KjU, null, j2, null, null, null, 0L, null, 0L, 2, false, 1, 0, (Function1) objP3, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 1597824, 45032);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1017887250);
                fetVar2.r(false);
                function1.invoke();
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xhh((byte) 6, i, j, mm40Var, (Object) function1);
        }
    }

    public static final void B(mm40 mm40Var, uvv uvvVar, boolean z, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(1225353536);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(uvvVar) : fetVar.i(uvvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar2 = fetVar;
            nnw0.g(o7k0.d(mm40Var, 1.0f), null, false, u1c.M(-1966213354, new o3m(z, (Object) uvvVar, (byte) 3), fetVar), fetVar2, 3072, 6);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((byte) 28, i, mm40Var, (Object) uvvVar, z);
        }
    }

    public static final void C(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, boolean z) {
        a4xVar.getClass();
        fetVar.g0(634526202);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -114762500, a4xVar);
            int i3 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                B(new x7z(1.0f, true), (uvv) next, z, fetVar, i2 & 896);
                if (i3 != a4xVar.size() - 1) {
                    fetVar.e0(-1946683040);
                    zcl zclVar2 = qmk.f28987a;
                    qxw.o(fetVar, o7k0.s(mm40Var, 6.0f));
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1946616731);
                    fetVar.r(false);
                }
                i3 = i4;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yvm(mm40Var2, a4xVar, z, i, (byte) 4);
        }
    }

    public static final void D(mm40 mm40Var, uvv uvvVar, float f2, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-908118018);
        int i2 = i | 6 | (fetVar.g(uvvVar) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float f3 = f2 - 24.0f;
            float f4 = f3 - 4.0f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, f2), f3);
            long j = kkg.f;
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            String str = uvvVar.f36367a;
            int i3 = uvvVar.c;
            F(mm40VarC, str, f4, uvvVar.b, fetVar, 6);
            qxw.o(fetVar, o7k0.s(jm40Var, 4.0f));
            j0x.b(a8k0.F(i3, 0, fetVar), null, o2e.e0(o7k0.n(jm40Var, 14.0f), i3 == R.drawable.ic_cyber_lol_position_placeholder ? "LOL_TEAM_HERO_POSITION_PLACEHOLDER" : "LOL_TEAM_HERO_POSITION"), null, gqw0.A, 0.0f, null, fetVar, 24632, 104);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ovv(mm40Var2, uvvVar, f2, i, (byte) 1);
        }
    }

    public static final void E(mm40 mm40Var, uvv uvvVar, float f2, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(28461250);
        int i2 = i | 6 | (fetVar.g(uvvVar) ? 32 : 16) | (fetVar.d(f2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float f3 = f2 - 4.0f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, f2), 24.0f + f2);
            long j = kkg.f;
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            String str = uvvVar.f36367a;
            int i3 = uvvVar.c;
            F(mm40VarD, str, f3, uvvVar.b, fetVar, 6);
            qxw.o(fetVar, o7k0.e(jm40Var, 4.0f));
            j0x.b(a8k0.F(i3, 0, fetVar), null, o2e.e0(o7k0.n(jm40Var, 14.0f), i3 == R.drawable.ic_cyber_lol_position_placeholder ? "LOL_TEAM_HERO_POSITION_PLACEHOLDER" : "LOL_TEAM_HERO_POSITION"), null, gqw0.A, 0.0f, null, fetVar, 24632, 104);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ovv(mm40Var2, uvvVar, f2, i, (byte) 0);
        }
    }

    public static final void F(final mm40 mm40Var, final String str, final float f2, final long j, fet fetVar, final int i) {
        h4d h4dVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-27617019);
        int i2 = i | (fetVar2.g(str) ? 32 : 16) | (fetVar2.d(f2) ? 256 : 128) | (fetVar2.f(j) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                if (j == 0) {
                    h4dVar = null;
                } else {
                    float[] fArrA = g4d.a();
                    g4d.b(fArrA);
                    h4d h4dVar2 = new h4d(new ColorMatrixColorFilter(fArrA));
                    h4dVar2.b = fArrA;
                    h4dVar = h4dVar2;
                }
                objP = androidx.compose.runtime.e.e(h4dVar);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            mm40 mm40VarO = ny9.O(1.0f, mm40Var, false);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarO, 2.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_cyber_lol_hero_placeholder, 0, fetVar2);
            mm40 mm40VarO2 = ny9.O(1.0f, o7k0.c, false);
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            k7x.b(str, null, o2e.e0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarO2), str.length() == 0 ? "LOL_TEAM_HERO_IMAGE_PLACEHOLDER" : "LOL_TEAM_HERO_IMAGE"), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, (a4d) pz40Var.getValue(), fetVar2, ((i2 >> 3) & 14) | 36912, 6, 27616);
            fetVar2 = fetVar2;
            mm40 mm40VarB = jr8.f16991a.b(o7k0.e(o7k0.s(jm40.b, f2), f2 / 2.0f), gqw0.h);
            boolean zG = fetVar2.g(pz40Var);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new rip(pz40Var, (byte) 4);
                fetVar2.o0(objP2);
            }
            A(mm40VarB, j, (Function0) objP2, fetVar2, (i2 >> 6) & 112);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(str, f2, j, i) { // from class: a.pvv
                public final /* synthetic */ String b;
                public final /* synthetic */ float c;
                public final /* synthetic */ long d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(7);
                    hmw0.F(this.f27680a, this.b, this.c, this.d, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void G(mm40 mm40Var, bdz bdzVar, boolean z, a4x a4xVar, boolean z2, boolean z3, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z4;
        fetVar.g0(-1095970758);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(bdzVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z4 = z;
            i2 |= fetVar.h(z4) ? 256 : 128;
        } else {
            z4 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(a4xVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            xcz xczVarB = bdzVar.b("KEY_LAZY_LIST_TEAMS", fetVar);
            int i3 = i2 >> 9;
            pz40 pz40VarF = androidx.compose.runtime.e.f(a4xVar, fetVar);
            wom womVarF = mom.f(fetVar);
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zG = ((i2 & 458752) == 131072) | fetVar.g(xczVarB);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new qa2(z3, xczVarB, null, (byte) 4);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP);
            if (z3) {
                function1.invoke(th2.f33942a);
            }
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            boolean z5 = (i2 & 3670016) == 1048576;
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new zk2(function1, (byte) 7);
                fetVar.o0(objP2);
            }
            mom.c(mm40VarE, z2, womVarF, null, false, null, (Function0) objP2, null, u1c.M(-1945291377, new odv(z4, (Object) xczVarB, (Object) pz40VarF, (Object) function1, (byte) 2), fetVar), fetVar, (i3 & 112) | 100663296, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ij2(mm40Var, bdzVar, z, a4xVar, z2, z3, function1, i, (byte) 1);
        }
    }

    public static final void H(int i, fet fetVar) {
        fetVar.g0(-1706354935);
        if (fetVar.U(i & 1, i != 0)) {
            n0q n0qVar = o7k0.c;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new dcn((byte) 24);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(n0qVar, null, null, false, null, (Function0) objP, 28);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarW, StaticColors.INSTANCE.m70getBlack200d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            kpb.j(null, null, fetVar, 0, 3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f4m(i, (byte) 23);
        }
    }

    public static final void I(int i, fet fetVar) {
        fetVar.g0(-1652176126);
        if (fetVar.U(i & 1, i != 0)) {
            mm40 mm40VarH = k7n0.H(o7k0.c, 2.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new rtj((byte) 8);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarH, gy40Var, null, false, null, (Function0) objP2, 28);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarW, StaticColors.INSTANCE.m109getOverlayBackground400d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            kpb.j(null, new dkm((ycl) null, new y3d(s6t0.b().f33626a.getPrimary()), 3), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new svj(i, (byte) 6);
        }
    }

    public static final void J(vby vbyVar, String str, boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, fet fetVar, int i) {
        pz40 pz40Var;
        boolean z2;
        vbyVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        fetVar.g0(1099327783);
        int i2 = (fetVar.i(function4) ? 8388608 : 4194304) | i | (fetVar.i(vbyVar) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536) | (fetVar.i(function3) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var2 = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new ce10(function2);
                fetVar.o0(objP2);
            }
            ce10 ce10Var = (ce10) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new de10(function1, function3);
                fetVar.o0(objP3);
            }
            de10 de10Var = (de10) objP3;
            if (str.length() > 0) {
                fetVar.e0(949070586);
                mm40 mm40VarE0 = o2e.e0(i120.Q(jm40.b, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n).e(o7k0.c), "LOTTO_WEB_VIEW");
                boolean zI = ((i2 & 896) == 256) | fetVar.i(de10Var) | fetVar.i(ce10Var) | ((29360128 & i2) == 8388608) | ((i2 & 7168) == 2048) | ((i2 & 458752) == 131072) | fetVar.i(vbyVar) | ((i2 & 112) == 32);
                Object objP4 = fetVar.P();
                if (zI || objP4 == cl5Var) {
                    Object sicVar = new sic(z, de10Var, ce10Var, function4, pz40Var2, vbyVar, str, function0, function2);
                    pz40Var = pz40Var2;
                    fetVar.o0(sicVar);
                    objP4 = sicVar;
                } else {
                    pz40Var = pz40Var2;
                }
                dwi0.b((Function1) objP4, mm40VarE0, null, fetVar, 0, 4);
                fetVar.r(false);
            } else {
                pz40Var = pz40Var2;
                cl5Var = cl5Var;
                fetVar.e0(950276827);
                fetVar.r(false);
            }
            boolean z3 = (i2 & 458752) == 131072;
            Object objP5 = fetVar.P();
            if (z3 || objP5 == cl5Var) {
                z2 = true;
                objP5 = new tmm((byte) 1, pz40Var, function2);
                fetVar.o0(objP5);
            } else {
                z2 = true;
            }
            knx.i(z2, (Function0) objP5, fetVar, 6, 0);
            Unit unit = Unit.f46060a;
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = new y9v(pz40Var, (byte) 10);
                fetVar.o0(objP6);
            }
            m0x0.o(unit, (Function1) objP6, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ntm(vbyVar, str, z, function0, function1, function2, function3, function4, i);
        }
    }

    public static final void K(mm40 mm40Var, List list, d9z d9zVar, boolean z, Function1 function1, Function0 function0, fet fetVar, int i) {
        boolean z2;
        ch80 ch80VarF;
        fetVar.g0(614388680);
        byte b2 = 2;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(list) ? 32 : 16) | (fetVar.g(d9zVar) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function0) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            cl5 cl5Var = ukd.f35823a;
            if (function0 != null) {
                fetVar.e0(-1897154891);
                int i3 = i2 >> 6;
                int i4 = (i3 & 14) | 384 | (i2 & 112) | (i3 & 7168);
                boolean z3 = ((((i4 & 7168) ^ 3072) > 2048 && fetVar.g(function0)) || (i4 & 3072) == 2048) | ((((i4 & 14) ^ 6) > 4 && fetVar.g(d9zVar)) || (i4 & 6) == 4);
                Object objP = fetVar.P();
                if (z3 || objP == cl5Var) {
                    objP = new xi1(d9zVar, function0, null, b2);
                    fetVar.o0(objP);
                }
                m0x0.t(fetVar, list, (Function2) objP);
                fetVar.r(false);
            } else {
                fetVar.e0(-1896934822);
                fetVar.r(false);
            }
            ngv ngvVar = new ngv(((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp >= 560 ? 4 : 3);
            zcl zclVar = qmk.f28987a;
            byte b3 = 14;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b3));
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b3));
            fetVar.e0(2017038133);
            lh80 lh80Var = new lh80(qmk.a(fetVar).c, 8.0f, qmk.a(fetVar).c, 24.0f);
            if (z) {
                fetVar.e0(-44883535);
                ch80VarF = knm0.g(lh80Var, fetVar);
                z2 = false;
                fetVar.r(false);
            } else {
                z2 = false;
                fetVar.e0(-44822806);
                ch80VarF = knm0.f(lh80Var, fetVar);
                fetVar.r(false);
            }
            fetVar.r(z2);
            boolean z4 = ((i2 & 112) != 32 ? z2 : true) | ((57344 & i2) == 16384 ? true : z2);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new rb(list, function1, (byte) 5);
                fetVar.o0(objP2);
            }
            g8x.i(ngvVar, mm40Var, d9zVar, ch80VarF, qw3Var2, qw3Var, null, false, null, (Function1) objP2, fetVar, ((i2 << 3) & 112) | (i2 & 896), 912);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw8(mm40Var, list, d9zVar, z, function1, function0, i);
        }
    }

    public static final void L(final int i, final int i2, final int i3, final int i4, int i5, final Function1 function1, fet fetVar, final int i6) {
        int i7;
        final int i8 = i5;
        fetVar.g0(2119291830);
        if ((i6 & 6) == 0) {
            i7 = (fetVar.e(i) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= fetVar.e(i2) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= fetVar.e(i3) ? 256 : 128;
        }
        if ((i6 & 3072) == 0) {
            i7 |= fetVar.e(i4) ? 2048 : 1024;
        }
        if ((i6 & 24576) == 0) {
            i7 |= fetVar.e(i8) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= fetVar.i(function1) ? 131072 : 65536;
        }
        int i9 = i7;
        if (fetVar.U(i9 & 1, (i9 & 74899) != 74898)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            int i10 = i9 & 458752;
            boolean z = i10 == 131072;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new n19(function1, (byte) 13);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(jm40Var, gy40Var, null, false, null, (Function0) objP2, 28);
            pm80 pm80VarF = a8k0.F(i, i9 & 14, fetVar);
            zfn zfnVar = zaq0.b;
            dww.c(pm80VarF, null, mm40VarW, ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = dw9.j(fetVar);
            }
            gy40 gy40Var2 = (gy40) objP3;
            boolean z2 = i10 == 131072;
            Object objP4 = fetVar.P();
            byte b2 = 14;
            if (z2 || objP4 == cl5Var) {
                objP4 = new n19(function1, b2);
                fetVar.o0(objP4);
            }
            dww.c(a8k0.F(i2, (i9 >> 3) & 14, fetVar), null, y860.W(jm40Var, gy40Var2, null, false, null, (Function0) objP4, 28), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = dw9.j(fetVar);
            }
            gy40 gy40Var3 = (gy40) objP5;
            boolean z3 = i10 == 131072;
            Object objP6 = fetVar.P();
            if (z3 || objP6 == cl5Var) {
                objP6 = new n19(function1, (byte) 15);
                fetVar.o0(objP6);
            }
            dww.c(a8k0.F(i3, (i9 >> 6) & 14, fetVar), null, y860.W(jm40Var, gy40Var3, null, false, null, (Function0) objP6, 28), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = dw9.j(fetVar);
            }
            gy40 gy40Var4 = (gy40) objP7;
            boolean z4 = i10 == 131072;
            Object objP8 = fetVar.P();
            if (z4 || objP8 == cl5Var) {
                objP8 = new n19(function1, (byte) 16);
                fetVar.o0(objP8);
            }
            dww.c(a8k0.F(i4, (i9 >> 9) & 14, fetVar), null, y860.W(jm40Var, gy40Var4, null, false, null, (Function0) objP8, 28), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            Object objP9 = fetVar.P();
            if (objP9 == cl5Var) {
                objP9 = dw9.j(fetVar);
            }
            gy40 gy40Var5 = (gy40) objP9;
            boolean z5 = i10 == 131072;
            Object objP10 = fetVar.P();
            if (z5 || objP10 == cl5Var) {
                objP10 = new n19(function1, (byte) 17);
                fetVar.o0(objP10);
            }
            i8 = i5;
            dww.c(a8k0.F(i8, (i9 >> 12) & 14, fetVar), null, y860.W(jm40Var, gy40Var5, null, false, null, (Function0) objP10, 28), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.xt9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hmw0.L(i, i2, i3, i4, i8, function1, (fet) obj, x8x.L(i6 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void M(int i, Function1 function1, fet fetVar, int i2) {
        function1.getClass();
        fetVar.g0(661810409);
        int i3 = (fetVar.e(i) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            int i4 = R.drawable.ic_glyph_favourite_inactive_24;
            int i5 = R.drawable.ic_glyph_favourite_active;
            int i6 = i >= 1 ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive_24;
            int i7 = i >= 2 ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive_24;
            int i8 = i >= 3 ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive_24;
            if (i >= 4) {
                i4 = R.drawable.ic_glyph_favourite_active;
            }
            if (i < 5) {
                i5 = R.drawable.ic_glyph_favourite_inactive_24;
            }
            L(i6, i7, i8, i4, i5, function1, fetVar, 458752 & (i3 << 12));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wt9(i, i2, function1);
        }
    }

    public static final void N(mm40 mm40Var, final e3y e3yVar, vj50 vj50Var, float f2, xcz xczVar, Function2 function2, fet fetVar, int i) {
        vj50Var.getClass();
        xczVar.getClass();
        function2.getClass();
        fetVar.g0(-559989260);
        int i2 = i | (fetVar.g(e3yVar) ? 32 : 16) | (fetVar.g(vj50Var) ? 256 : 128) | (fetVar.d(f2) ? 2048 : 1024) | (fetVar.g(xczVar) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536);
        final byte b2 = 0;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarI = s5x0.I(mm40Var, knm0.f(s5x0.u(0.0f, f2, 0.0f, 0.0f, 13), fetVar));
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40VarI.e(n0qVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(mm40VarE, vgg0.c(24.0f, 24.0f, 0.0f, 0.0f, 12)), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (e3yVar instanceof z2y) {
                fetVar.e0(1472789410);
                O(n0qVar, ((z2y) e3yVar).f43694a, xczVar, vj50Var, function2, fetVar, ((i2 >> 6) & 896) | 6 | ((i2 << 3) & 7168) | ((i2 >> 3) & 57344));
                fetVar.r(false);
            } else if (e3yVar.equals(d3y.f5428a)) {
                fetVar.e0(1473128023);
                nnw0.s(0, 1, fetVar, null);
                fetVar.r(false);
            } else {
                boolean z = e3yVar instanceof b3y;
                jm40 jm40Var = jm40.b;
                cl5 cl5Var = ukd.f35823a;
                if (z) {
                    fetVar.e0(1473235438);
                    boolean z2 = (i2 & 112) == 32;
                    Object objP = fetVar.P();
                    if (z2 || objP == cl5Var) {
                        objP = new Function1() { // from class: a.ie80
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b3 = b2;
                                e3y e3yVar2 = e3yVar;
                                LottieView lottieView = (LottieView) obj;
                                switch (b3) {
                                    case 0:
                                        lottieView.getClass();
                                        lottieView.v(((b3y) e3yVar2).f1930a);
                                        Context context = lottieView.getContext();
                                        context.getClass();
                                        int iB = m5d.b(R.attr.uikitSecondary, context);
                                        Context context2 = lottieView.getContext();
                                        context2.getClass();
                                        lottieView.B(iB, m5d.b(R.attr.uikitPrimaryForeground, context2));
                                        break;
                                    default:
                                        lottieView.getClass();
                                        Context context3 = lottieView.getContext();
                                        context3.getClass();
                                        int iB2 = m5d.b(R.attr.uikitSecondary, context3);
                                        Context context4 = lottieView.getContext();
                                        context4.getClass();
                                        lottieView.B(iB2, m5d.b(R.attr.uikitSecondary, context4));
                                        lottieView.w(((c3y) e3yVar2).f3701a);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP);
                    }
                    vbw0.y(6, 0, fetVar, jm40Var, (Function1) objP);
                    fetVar.r(false);
                } else if (e3yVar instanceof c3y) {
                    fetVar.e0(1473693835);
                    boolean z3 = (i2 & 112) == 32;
                    Object objP2 = fetVar.P();
                    if (z3 || objP2 == cl5Var) {
                        final byte b3 = 1;
                        objP2 = new Function1() { // from class: a.ie80
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b4 = b3;
                                e3y e3yVar2 = e3yVar;
                                LottieView lottieView = (LottieView) obj;
                                switch (b4) {
                                    case 0:
                                        lottieView.getClass();
                                        lottieView.v(((b3y) e3yVar2).f1930a);
                                        Context context = lottieView.getContext();
                                        context.getClass();
                                        int iB = m5d.b(R.attr.uikitSecondary, context);
                                        Context context2 = lottieView.getContext();
                                        context2.getClass();
                                        lottieView.B(iB, m5d.b(R.attr.uikitPrimaryForeground, context2));
                                        break;
                                    default:
                                        lottieView.getClass();
                                        Context context3 = lottieView.getContext();
                                        context3.getClass();
                                        int iB2 = m5d.b(R.attr.uikitSecondary, context3);
                                        Context context4 = lottieView.getContext();
                                        context4.getClass();
                                        lottieView.B(iB2, m5d.b(R.attr.uikitSecondary, context4));
                                        lottieView.w(((c3y) e3yVar2).f3701a);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP2);
                    }
                    vbw0.y(6, 0, fetVar, jm40Var, (Function1) objP2);
                    fetVar.r(false);
                } else {
                    if (!e3yVar.equals(a3y.f196a)) {
                        throw b1j.f(324602598, fetVar, false);
                    }
                    fetVar.e0(1474252486);
                    fetVar.r(false);
                }
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gc3(mm40Var, e3yVar, vj50Var, f2, xczVar, function2, i, (byte) 2);
        }
    }

    public static final void O(mm40 mm40Var, a4x a4xVar, xcz xczVar, vj50 vj50Var, Function2 function2, fet fetVar, int i) {
        int i2;
        xcz xczVar2;
        fetVar.g0(-1811578184);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            xczVar2 = xczVar;
            i2 |= fetVar.g(xczVar2) ? 256 : 128;
        } else {
            xczVar2 = xczVar;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? fetVar.g(vj50Var) : fetVar.i(vj50Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarV = cjx.V(mm40Var.e(o7k0.c), vj50Var, null);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarV, 0.0f, 0.0f, 0.0f, 92.0f, 7);
            lh80 lh80VarU = s5x0.u(xfn.a(fetVar).d, 0.0f, xfn.a(fetVar).d, 12.0f, 2);
            boolean z = ((i2 & 112) == 32) | ((57344 & i2) == 16384);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new qv40(a4xVar, function2, (byte) 1);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarN, xczVar2, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, (i2 >> 3) & 112, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) a4xVar, (Object) xczVar, (Object) vj50Var, (Object) function2, i, (byte) 16);
        }
    }

    public static final void P(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1590059931);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            xsc0 xsc0Var = (xsc0) l7m0Var.getValue();
            if (xsc0Var != null) {
                if (xsc0Var instanceof wsc0) {
                    fetVar.e0(960769566);
                    S(((wsc0) xsc0Var).f39684a, fetVar, 0);
                    fetVar.r(false);
                } else if (xsc0Var instanceof tsc0) {
                    fetVar.e0(960772599);
                    r((tsc0) xsc0Var, function1, fetVar, i2 & 112);
                    fetVar.r(false);
                } else if (xsc0Var instanceof usc0) {
                    fetVar.e0(960776402);
                    x(((usc0) xsc0Var).f36205a, fetVar, 0);
                    fetVar.r(false);
                } else if (xsc0Var instanceof vsc0) {
                    fetVar.e0(960779144);
                    mdm mdmVar = ((vsc0) xsc0Var).f37944a;
                    boolean z = (i2 & 112) == 32;
                    Object objP = fetVar.P();
                    if (z || objP == ukd.f35823a) {
                        objP = new bac0(function1, (byte) 21);
                        fetVar.o0(objP);
                    }
                    y(mdmVar, (Function0) objP, fetVar, 0);
                    fetVar.r(false);
                }
            }
            throw b1j.f(960767649, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i, (byte) 26);
        }
    }

    public static final void Q(List list, Function1 function1, boolean z, xcz xczVar, fet fetVar, int i) {
        list.getClass();
        function1.getClass();
        xczVar.getClass();
        fetVar.g0(-1423227967);
        int i2 = i | (fetVar.g(list) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.g(xczVar) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarL = s5x0.L(o7k0.c, xfn.a(fetVar).d, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = knm0.f(s5x0.u(0.0f, z ? 0.0f : 12.0f, 0.0f, 12.0f, 5), fetVar);
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new rb(list, function1, (byte) 12);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarL, xczVar, ch80VarF, null, null, null, false, null, (Function1) objP, fetVar, (i2 >> 6) & 112, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lfc0(list, function1, z, xczVar, i);
        }
    }

    public static final void R(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1092671410);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 16.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 5);
        }
    }

    public static final void S(String str, fet fetVar, int i) {
        fetVar.g0(749134219);
        int i2 = i & 1;
        if (fetVar.U(i2, i2 != 0)) {
            lc00 lc00VarB = kotlin.collections.a.b();
            lc00VarB.add(dpc0.f6459a);
            for (int i3 = 0; i3 < 4; i3++) {
                lc00VarB.add(rsc0.f31026a);
                lc00VarB.add(fuc0.f10155a);
            }
            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            boolean zI = fetVar.i(lc00VarA);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new gg4(lc00VarA, (byte) 9);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarQ, null, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 510);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 14, i, str);
        }
    }

    public static final void T(long j, fet fetVar, int i) {
        fetVar.g0(-1000292666);
        int i2 = (fetVar.f(j) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), j, jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 8.0f, 18.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            R(0, fetVar, o7k0.s(jm40Var, 70.0f));
            R(0, fetVar, s5x0.N(new x7z(1.0f, true), 16.0f, 0.0f, 0.0f, 0.0f, 14));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e3b0(j, i, (byte) 10);
        }
    }

    public static final void U(int i, fet fetVar) {
        fetVar.g0(2124999968);
        if (fetVar.U(i & 1, i != 0)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            zfn zfnVar = zaq0.b;
            T(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), fetVar, 0);
            T(((ThemeColors) fetVar.k(zfnVar)).getBackground(), fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ofo0(i, (byte) 5);
        }
    }

    public static final void V(int i, fet fetVar) {
        fetVar.g0(998303881);
        if (fetVar.U(i & 1, i != 0)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            fetVar.e0(315077507);
            for (int i2 = 0; i2 < 8; i2++) {
                U(0, fetVar);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ofo0(i, (byte) 4);
        }
    }

    public static final void W(bb00 bb00Var, Function1 function1, fet fetVar, int i) {
        byte b2;
        agk0 agk0Var;
        ppj0 ppj0Var;
        float fL;
        fet fetVar2 = fetVar;
        bb00Var.getClass();
        int i2 = bb00Var.c;
        function1.getClass();
        fetVar2.g0(-1140877060);
        int i3 = i | (fetVar2.g(bb00Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            w6k w6kVar = (w6k) fetVar2.k(bmd.h);
            WeakHashMap weakHashMap = djv0.w;
            bgx bgxVarO = i120.O(zcm0.i(fetVar2).f, fetVar2);
            zcl zclVar = qmk.f28987a;
            float fW0 = w6kVar.w0(20.0f);
            Object[] objArr = new Object[0];
            boolean zG = fetVar2.g(bgxVarO);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new qir0(bgxVarO, (byte) 25);
                fetVar2.o0(objP);
            }
            float fFloatValue = ((Number) e9x.Q(objArr, (Function0) objP, fetVar2, 0)).floatValue();
            float fW1 = w6kVar.w0(56.0f) + w6kVar.w0(fFloatValue);
            Object[] objArr2 = new Object[0];
            Object objP2 = fetVar2.P();
            byte b3 = 5;
            if (objP2 == cl5Var) {
                objP2 = new xns0(b3);
                fetVar2.o0(objP2);
            }
            agk0 agk0Var2 = (agk0) e9x.Q(objArr2, (Function0) objP2, fetVar2, 48);
            Object[] objArr3 = new Object[0];
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new xns0((byte) 6);
                fetVar2.o0(objP3);
            }
            agk0 agk0Var3 = (agk0) e9x.Q(objArr3, (Function0) objP3, fetVar2, 48);
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = androidx.compose.runtime.e.e(null);
                fetVar2.o0(objP4);
            }
            pz40 pz40Var = (pz40) objP4;
            Object[] objArr4 = new Object[0];
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = new xns0((byte) 7);
                fetVar2.o0(objP5);
            }
            agk0 agk0Var4 = (agk0) e9x.Q(objArr4, (Function0) objP5, fetVar2, 48);
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                objP6 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP6);
            }
            vne vneVar = (vne) objP6;
            Object objP7 = fetVar2.P();
            if (objP7 == cl5Var) {
                if (agk0Var2.l() > 0.0f) {
                    fL = agk0Var2.l();
                } else {
                    fL = agk0Var3.l() > 0.0f ? agk0Var3.l() : 0.0f;
                }
                objP7 = xf0.c(fL);
                fetVar2.o0(objP7);
            }
            t33 t33Var = (t33) objP7;
            boolean zG2 = fetVar2.g(vneVar);
            Object objP8 = fetVar2.P();
            if (zG2 || objP8 == cl5Var) {
                ppj0 ppj0Var2 = new ppj0(t33Var, vneVar, fW1, agk0Var3.l());
                fetVar2.o0(ppj0Var2);
                objP8 = ppj0Var2;
            }
            ppj0 ppj0Var3 = (ppj0) objP8;
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objP9 = fetVar2.P();
            if (z || objP9 == cl5Var) {
                objP9 = new cv70(bb00Var, (byte) 1);
                fetVar2.o0(objP9);
            }
            kwj kwjVarB = zk80.b(i2, (Function0) objP9, fetVar2, 0, 2);
            Float fValueOf = Float.valueOf(fW1);
            boolean zG3 = fetVar2.g(ppj0Var3) | fetVar2.d(fW1);
            Object objP10 = fetVar2.P();
            if (zG3 || objP10 == cl5Var) {
                objP10 = new o2d(ppj0Var3, fW1, null, (byte) 2);
                fetVar2.o0(objP10);
            }
            m0x0.t(fetVar2, fValueOf, (Function2) objP10);
            Integer numValueOf = Integer.valueOf(i2);
            boolean zG4 = fetVar2.g(kwjVarB) | (i4 == 4);
            Object objP11 = fetVar2.P();
            if (zG4 || objP11 == cl5Var) {
                objP11 = new dv70(kwjVarB, bb00Var, null, (byte) 1);
                fetVar2.o0(objP11);
            }
            m0x0.t(fetVar2, numValueOf, (Function2) objP11);
            Integer numValueOf2 = Integer.valueOf(kwjVarB.q());
            int i5 = i3 & 112;
            boolean zG5 = (i5 == 32) | fetVar2.g(kwjVarB);
            Object objP12 = fetVar2.P();
            if (zG5 || objP12 == cl5Var) {
                objP12 = new fc30(function1, kwjVarB, (yje) null, (byte) 5);
                fetVar2.o0(objP12);
            }
            m0x0.t(fetVar2, numValueOf2, (Function2) objP12);
            Float f2 = (Float) pz40Var.getValue();
            boolean zI = fetVar2.i(t33Var) | fetVar2.g(ppj0Var3) | fetVar2.g(agk0Var3) | fetVar2.g(agk0Var2);
            Object objP13 = fetVar2.P();
            if (zI || objP13 == cl5Var) {
                agk0Var = agk0Var3;
                ppj0Var = ppj0Var3;
                objP13 = new ods0(t33Var, ppj0Var, pz40Var, agk0Var, agk0Var2, null);
                fetVar2.o0(objP13);
            } else {
                agk0Var = agk0Var3;
                ppj0Var = ppj0Var3;
            }
            m0x0.t(fetVar2, f2, (Function2) objP13);
            boolean zI2 = fetVar2.i(t33Var) | fetVar2.g(agk0Var2);
            Object objP14 = fetVar2.P();
            if (zI2 || objP14 == cl5Var) {
                objP14 = new meq0((Object) t33Var, (Object) agk0Var2, (yje) null, (byte) 28);
                fetVar2.o0(objP14);
            }
            m0x0.t(fetVar2, t33Var, (Function2) objP14);
            mm40 mm40VarR = knm0.r(i120.Q(o7k0.c, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n));
            boolean zG6 = fetVar2.g(agk0Var4) | fetVar2.d(fW0) | fetVar2.i(t33Var);
            Object objP15 = fetVar2.P();
            if (zG6 || objP15 == cl5Var) {
                objP15 = new jxs0(fW0, agk0Var4, pz40Var, t33Var);
                fetVar2.o0(objP15);
            }
            tj30 tj30Var = (tj30) objP15;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarR);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30Var, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK0 = mrv.k0(jm40Var, "lineups");
            int i6 = bb00Var.c;
            a4x a4xVar = bb00Var.f;
            float f3 = fFloatValue + 58.0f;
            boolean z2 = i5 == 32;
            Object objP16 = fetVar2.P();
            if (z2 || objP16 == cl5Var) {
                objP16 = new xar0(function1, (byte) 17);
                fetVar2.o0(objP16);
            }
            Function1 function2 = (Function1) objP16;
            boolean z3 = i5 == 32;
            Object objP17 = fetVar2.P();
            if (z3 || objP17 == cl5Var) {
                objP17 = new xar0(function1, (byte) 18);
                fetVar2.o0(objP17);
            }
            jiq0.I(mm40VarK0, i6, a4xVar, f3, 36.0f, function2, (Function1) objP17, fetVar2, 3078);
            mm40 mm40VarK1 = mrv.k0(yyw.X(o7k0.d(jm40Var, 1.0f), null, fetVar2, 1), "navBar");
            String str = bb00Var.b;
            boolean zG7 = fetVar2.g(str);
            Object objP18 = fetVar2.P();
            if (zG7 || objP18 == cl5Var) {
                pz40 pz40Var2 = s6t0.f31722a;
                StaticColors staticColors = StaticColors.INSTANCE;
                objP18 = new imm(new ilm(staticColors.m123getWhite0d7_KjU()), new plm(str, staticColors.m123getWhite0d7_KjU(), fa50.f9191a), fmm.f9790a, staticColors.m121getTransparent0d7_KjU(), false, null);
                fetVar2.o0(objP18);
            }
            imm immVar = (imm) objP18;
            boolean z4 = i5 == 32;
            Object objP19 = fetVar2.P();
            if (z4 || objP19 == cl5Var) {
                objP19 = new nas0(function1, (byte) 14);
                fetVar2.o0(objP19);
            }
            hlm.c(mm40VarK1, immVar, null, (Function0) objP19, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4084);
            b2 = 2;
            ohq0.G(mrv.k0(epv0.N(jm40Var, (((Float) pz40Var.getValue()) != null || agk0Var.l() > 0.0f) ? 1.0f : 0.0f), "sheet"), ppj0Var, bb00Var, kwjVarB, function1, fetVar, ((i3 << 6) & 896) | ((i3 << 9) & 57344));
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            b2 = 2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new oa00(bb00Var, function1, i, b2);
        }
    }

    public static final void X(lc00 lc00Var, m9s m9sVar, ctf0 ctf0Var, qz7 qz7Var, long j) {
        int i;
        uz7 uz7Var;
        uz7 uz7Var2;
        int i2;
        int i3;
        String strA;
        a4x a4xVarO0;
        String strValueOf;
        String strValueOf2;
        int i4;
        zz7 zz7Var;
        int i5;
        List list;
        Object objPrevious;
        List list2;
        m9sVar.getClass();
        qqs qqsVar = m9sVar.h;
        ctf0Var.getClass();
        kz7 kz7Var = qz7Var.f29568a;
        int i6 = qz7Var.c;
        int i7 = qz7Var.i;
        int i8 = qz7Var.h;
        List list3 = qz7Var.k;
        List list4 = qz7Var.j;
        uz7 uz7Var3 = qz7Var.b;
        uz7 uz7Var4 = uz7.UNKNOWN;
        boolean z = uz7Var3 != uz7Var4 && (kz7Var == kz7.b || kz7Var == kz7.c);
        if (z) {
            uz7Var4 = uz7Var3;
        }
        list4.getClass();
        list3.getClass();
        int iO = hew0.O(list4, list3, uz7Var4);
        int i9 = (int) (j - 100);
        if (i9 >= 1 && i9 <= iO) {
            iO = i9;
        }
        boolean z2 = qz7Var.g && (kz7Var == kz7.b || kz7Var == kz7.c);
        k18 k18Var = new k18(i8, i7);
        boolean z3 = (i8 == 0 || i7 == 0) ? false : true;
        if (kz7Var != kz7.c || z3) {
            i = i6;
        } else {
            lc00 lc00VarB = kotlin.collections.a.b();
            int iMax = Math.max(list4.size(), list3.size());
            int i10 = 0;
            while (i10 < iMax) {
                int i11 = i6;
                n08 n08Var = (n08) CollectionsKt.W(i10, list4);
                if (n08Var != null) {
                    lc00VarB.add(n08Var);
                }
                n08 n08Var2 = (n08) CollectionsKt.W(i10, list3);
                if (n08Var2 != null) {
                    lc00VarB.add(n08Var2);
                }
                i10++;
                i6 = i11;
            }
            i = i6;
            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
            ListIterator listIterator = lc00VarA.listIterator(lc00VarA.b());
            do {
                paw pawVar = (paw) listIterator;
                if (!pawVar.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = pawVar.previous();
            } while (((n08) objPrevious).f22689a.isEmpty());
            n08 n08Var3 = (n08) objPrevious;
            k18 k18Var2 = (n08Var3 == null || (list2 = n08Var3.f22689a) == null) ? null : (k18) CollectionsKt.d0(list2);
            if (k18Var2 != null) {
                k18Var = k18Var2;
            }
        }
        int i12 = k18Var.f17508a;
        int i13 = k18Var.b;
        oqs oqsVar = qqsVar.o;
        if (oqsVar.f25704a >= 100) {
            uz7Var = uz7.FIRST_PLAYER;
        } else {
            uz7Var = oqsVar.b >= 100 ? uz7.SECOND_PLAYER : uz7.UNKNOWN;
        }
        String strJ0 = j0("static/img/ImgDefault/Esports/Virtual/Dice/BigPig/statusPlank.png");
        String strJ1 = j0("static/img/ImgDefault/Esports/Virtual/Dice/BigPig/table.png");
        List list5 = lz7.f20892a;
        ArrayList arrayList = new ArrayList(r3d.q(list5, 10));
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(j0((String) it.next()));
        }
        a4x a4xVarO1 = dyb.o0(arrayList);
        String strB0 = b0(uz7Var3, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPlayerHappyBody.png", "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePlayerHappyBody.png");
        String strB1 = b0(uz7Var3, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPlayerWaitingBody.png", "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePlayerWaitingBody.png");
        String strB2 = b0(uz7Var3, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPlayerWaitingLeftHand.png", "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePlayerWaitingLeftHand.png");
        String strB3 = b0(uz7Var3, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPlayerWaitingRightHand.png", "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePlayerWaitingRightHand.png");
        String strB4 = b0(uz7Var3, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPlayerSadBody.png", "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePlayerSadBody.png");
        String strB5 = b0(uz7Var3, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPlayerShakingDiceLeftHand.png", "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePlayerShakingDiceLeftHand.png");
        String strB6 = b0(uz7Var3, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPlayerThrowDiceLeftHand.png", "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePlayerThrowDiceLeftHand.png");
        String strB7 = b0(uz7Var3, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPlayerLeftForearm.png", "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePlayerLeftForearm.png");
        String strY = Y(i12);
        String strY2 = Y(i13);
        String strB8 = b0(uz7Var, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPlayerHappyBody.png", "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePlayerHappyBody.png");
        String strB9 = b0(uz7Var, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPlayerLeftForearm.png", "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePlayerLeftForearm.png");
        String strB10 = b0(uz7Var, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPlayerLeftHand.png", "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePlayerLeftHand.png");
        String strB11 = b0(uz7Var, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPlayerRightForearm.png", "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePlayerRightForearm.png");
        String strB12 = b0(uz7Var, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPlayerRightHand.png", "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePlayerRightHand.png");
        int iOrdinal = uz7Var.ordinal();
        if (iOrdinal == 0) {
            uz7Var2 = uz7.SECOND_PLAYER;
        } else if (iOrdinal == 1) {
            uz7Var2 = uz7.FIRST_PLAYER;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            uz7Var2 = uz7.UNKNOWN;
        }
        rz7 rz7Var = new rz7(strJ0, strJ1, strB0, strB1, strB2, strB3, strB4, strB5, strB6, strB7, a4xVarO1, strY, strY2, strB8, strB9, strB10, strB11, strB12, b0(uz7Var2, "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/redPlayerSadBody.png", "static/img/ImgDefault/Esports/Virtual/Dice/BigPig/bluePlayerSadBody.png"), uz7Var == uz7.SECOND_PLAYER);
        IntRange intRange = new IntRange(1, hew0.O(list4, list3, uz7Var4), 1);
        ArrayList arrayList2 = new ArrayList(r3d.q(intRange, 10));
        Iterator it2 = intRange.iterator();
        while (((kkx) it2).c) {
            int iNextInt = ((bkx) it2).nextInt();
            ArrayList arrayList3 = arrayList2;
            Iterator it3 = it2;
            arrayList3.add(new lxl(((long) iNextInt) + 100, (dyl) new xxl(ctf0Var.b.a(R.string.synthetic_big_pig_series_v2, Arrays.copyOf(new Object[]{String.valueOf(iNextInt)}, 1))), false, iNextInt == iO ? uxl.b : uxl.f36445a, (cwl) null, 108));
            arrayList2 = arrayList3;
            it2 = it3;
        }
        a4x a4xVarO2 = dyb.o0(arrayList2);
        lsm0 lsm0Var = ctf0Var.b;
        int i14 = iO;
        y3d y3dVar = null;
        boo0 boo0Var = new boo0("BIG_PIG_SERIES_TABS_KEY", new fyl(a4xVarO2, null, null, s5x0.t(xfn.b(ctf0Var.j()).e, 0.0f, 2), new jyl(new y3d(ijg.a0), y3dVar, y3dVar, 126), 6), pno0.b);
        oqs oqsVar2 = qqsVar.o;
        int iOrdinal2 = kz7Var.ordinal();
        String strA2 = "";
        if (iOrdinal2 != 0) {
            if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                if (iOrdinal2 == 3) {
                    if (oqsVar2.f25704a >= 100) {
                        strA = lsm0Var.a(R.string.gold_rush_first_player_win, Arrays.copyOf(new Object[0], 0));
                        i2 = 0;
                    } else if (oqsVar2.b >= 100) {
                        strA = lsm0Var.a(R.string.gold_rush_second_player_win, Arrays.copyOf(new Object[0], 0));
                    } else {
                        i2 = 0;
                        strA = "";
                    }
                    i3 = 1;
                }
                i2 = 0;
                i3 = 1;
            } else if (uz7Var3 != uz7.UNKNOWN) {
                i3 = 1;
                strA = lsm0Var.a(R.string.synthetic_big_pig_player_turn_v2, Arrays.copyOf(new Object[]{String.valueOf((int) uz7Var3.f36524a)}, 1));
                i2 = 0;
            }
            strA = "";
            i2 = 0;
            i3 = 1;
        } else {
            i2 = 0;
            i3 = 1;
            strA = lsm0Var.a(R.string.bet_before_higher_vs_lower_game_start, Arrays.copyOf(new Object[0], 0));
        }
        int i15 = qz7Var.d;
        int iOrdinal3 = kz7Var.ordinal();
        if (iOrdinal3 == i3) {
            strA2 = lsm0Var.a(R.string.synthetic_big_pig_throw_and_series, Arrays.copyOf(new Object[]{String.valueOf(i), String.valueOf(i15)}, 2));
        } else if (iOrdinal3 == 2) {
            strA2 = lsm0Var.a(R.string.synthetic_big_pig_waiting_next_throw, Arrays.copyOf(new Object[i2], i2));
        }
        boolean z4 = kz7Var == kz7.c;
        String strA3 = lsm0Var.a(R.string.synthetic_big_pig_turn_change, Arrays.copyOf(new Object[0], 0));
        kz7 kz7Var2 = kz7.d;
        boolean z5 = kz7Var == kz7Var2;
        int i16 = qz7Var.d;
        int i17 = qz7Var.c;
        n08 n08VarT = hew0.T(i14, list4, list3);
        uz7 uz7Var5 = (i14 + (-1)) % 2 == 0 ? uz7.FIRST_PLAYER : uz7.SECOND_PLAYER;
        int i18 = qz7Var.e;
        int i19 = qz7Var.f;
        boolean z6 = kz7Var != kz7Var2 && i14 == hew0.O(list4, list3, uz7Var4);
        Iterator it4 = l1e0.o(1, i14).iterator();
        int size = 0;
        while (((kkx) it4).c) {
            n08 n08VarT2 = hew0.T(((bkx) it4).nextInt(), list4, list3);
            size += (n08VarT2 == null || (list = n08VarT2.f22689a) == null) ? 0 : list.size();
        }
        int i20 = uz7Var4 == uz7.UNKNOWN ? 0 : i;
        List list6 = y08.f41794a;
        String strA4 = lsm0Var.a(uz7Var5 != uz7.SECOND_PLAYER ? R.string.player_one : R.string.player_two, Arrays.copyOf(new Object[0], 0));
        List list7 = n08VarT != null ? n08VarT.f22689a : null;
        if (list7 == null) {
            list7 = iun.f15405a;
        }
        ArrayList arrayList4 = new ArrayList(r3d.q(list7, 10));
        Iterator it5 = list7.iterator();
        int i21 = 0;
        while (true) {
            boolean zHasNext = it5.hasNext();
            int i22 = i19;
            wz7 wz7Var = wz7.f40010a;
            if (!zHasNext) {
                boolean z7 = z6;
                List list8 = list7;
                boo0 boo0Var2 = boo0Var;
                int i23 = size;
                zz7 zz7Var2 = null;
                if (z7) {
                    int size2 = list8.size() + i23 + 1;
                    if (size2 == i20) {
                        List list9 = y08.f41794a;
                        Integer num = (Integer) CollectionsKt.W(i8 - 1, list9);
                        Integer num2 = (Integer) CollectionsKt.W(i7 - 1, list9);
                        if (num != null && num2 != null) {
                            int iIntValue = num.intValue();
                            int iIntValue2 = num2.intValue();
                            if (i8 == 1 && i7 == 1) {
                                i4 = 25;
                            } else if (i8 == 1 || i7 == 1) {
                                i4 = 0;
                            } else {
                                i4 = i8 == i7 ? (i8 + i7) * 2 : i8 + i7;
                            }
                            zz7Var2 = new zz7(iIntValue, iIntValue2, String.valueOf(i4));
                        }
                    }
                    zz7 zz7Var3 = zz7Var2;
                    a4xVarO0 = dyb.o0(CollectionsKt.r0(arrayList4, new j18(zz7Var3 == null ? wz7Var : new vz7(zz7Var3, i20), lsm0Var.a(R.string.big_pig_throw_v2, Arrays.copyOf(new Object[]{String.valueOf(size2)}, 1)))));
                } else {
                    a4xVarO0 = dyb.o0(arrayList4);
                }
                String strA5 = lsm0Var.a(R.string.synthetic_big_pig_total_points, Arrays.copyOf(new Object[0], 0));
                if (z7) {
                    strValueOf = String.valueOf(i18);
                } else {
                    strValueOf = String.valueOf(n08VarT != null ? n08VarT.b : 0);
                }
                String str = strValueOf;
                if (z7) {
                    strValueOf2 = String.valueOf(i22);
                } else {
                    strValueOf2 = String.valueOf(n08VarT != null ? n08VarT.b : 0);
                }
                lc00Var.add(new p18(rz7Var, boo0Var2, strA, strA2, z, z4, z2, strA3, z5, i16, i17, new x08(strA4, a4xVarO0, strA5, str, strValueOf2, i20)));
                return;
            }
            Object next = it5.next();
            int i24 = i21 + 1;
            if (i21 < 0) {
                q3d.p();
                throw null;
            }
            k18 k18Var3 = (k18) next;
            int i25 = i21 + size + 1;
            int i26 = k18Var3.f17508a;
            List list10 = y08.f41794a;
            boolean z8 = z6;
            Integer num3 = (Integer) CollectionsKt.W(i26 - 1, list10);
            int i27 = k18Var3.b;
            List list11 = list7;
            Integer num4 = (Integer) CollectionsKt.W(i27 - 1, list10);
            if (num3 == null || num4 == null) {
                zz7Var = null;
            } else {
                int iIntValue3 = num3.intValue();
                int iIntValue4 = num4.intValue();
                int i28 = k18Var3.f17508a;
                if (i28 == 1 && i27 == 1) {
                    i5 = 25;
                } else if (i28 == 1 || i27 == 1) {
                    i5 = 0;
                } else {
                    i5 = i28 == i27 ? (i28 + i27) * 2 : i27 + i28;
                }
                zz7Var = new zz7(iIntValue3, iIntValue4, String.valueOf(i5));
            }
            arrayList4.add(new j18(zz7Var == null ? wz7Var : new xz7(zz7Var), lsm0Var.a(R.string.big_pig_throw_v2, Arrays.copyOf(new Object[]{String.valueOf(i25)}, 1))));
            i19 = i22;
            i21 = i24;
            size = size;
            z6 = z8;
            list7 = list11;
            boo0Var = boo0Var;
        }
    }

    public static final String Y(int i) {
        switch (i) {
            case 1:
                return j0("static/img/ImgDefault/Esports/Virtual/Dice/BigPig/dice1.png");
            case 2:
                return j0("static/img/ImgDefault/Esports/Virtual/Dice/BigPig/dice2.png");
            case 3:
                return j0("static/img/ImgDefault/Esports/Virtual/Dice/BigPig/dice3.png");
            case 4:
                return j0("static/img/ImgDefault/Esports/Virtual/Dice/BigPig/dice4.png");
            case 5:
                return j0("static/img/ImgDefault/Esports/Virtual/Dice/BigPig/dice5.png");
            case 6:
                return j0("static/img/ImgDefault/Esports/Virtual/Dice/BigPig/dice6.png");
            default:
                return "";
        }
    }

    public static boolean Z(int i) {
        return (i & 32768) != 0;
    }

    public static final void a(int i, boolean z, boolean z2, String str, String str2, String str3, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(1873169024);
        int i3 = i2 | (fetVar.e(i) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.g(str) ? 2048 : 1024) | (fetVar.g(str2) ? 16384 : 8192) | (fetVar.g(str3) ? 131072 : 65536) | (fetVar.i(function0) ? 1048576 : 524288);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            boolean z3 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((458752 & i3) == 131072);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new se(str, new oe(String.valueOf(i), str2), z2 ? new le(new ue9(str3), lul.e, z) : null);
                fetVar.o0(objP);
            }
            rcb.r(o7k0.d(jm40.b, 1.0f), (se) objP, function0, fetVar, ((i3 >> 12) & 896) | 6, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ag(i, z, z2, str, str2, str3, function0, i2);
        }
    }

    public static boolean a0(int i) {
        int i2 = i & (-65537);
        if (i2 != 15 && i2 != 255) {
            if (i2 == 32768) {
                return Build.VERSION.SDK_INT >= 30;
            }
            if (i2 != 32783) {
                return i2 == 33023 || i2 == 0;
            }
            int i3 = Build.VERSION.SDK_INT;
            return i3 < 28 || i3 > 29;
        }
        return true;
    }

    public static final void b(int i, fet fetVar) {
        fetVar.g0(1456379690);
        if (fetVar.U(i & 1, i != 0)) {
            float f2 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, f2, 16.0f, 0.0f, 10.0f, 4);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 12.0f), 80.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
            mm40 mm40VarS2 = o7k0.s(o7k0.e(jm40Var, 28.0f), 192.0f);
            zcl zclVar3 = qmk.g;
            dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarS2), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t4c0(i, (byte) 29);
        }
    }

    public static final String b0(uz7 uz7Var, String str, String str2) {
        int iOrdinal = uz7Var.ordinal();
        if (iOrdinal == 0) {
            return j0(str);
        }
        if (iOrdinal == 1) {
            return j0(str2);
        }
        if (iOrdinal == 2) {
            return "";
        }
        t9f.b();
        return null;
    }

    public static final void c(mm40 mm40Var, final dx dxVar, final Function1 function1, fet fetVar, int i) {
        int i2;
        xdr xdrVar;
        String str = dxVar.f6823a;
        function1.getClass();
        fetVar.g0(-2127205107);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(dxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            String str2 = dxVar.b;
            int length = str.length();
            Object obj = ukd.f35823a;
            xdr xdrVar2 = null;
            if (length > 0) {
                fetVar.e0(675419628);
                boolean zG = fetVar.g(str);
                Object objP = fetVar.P();
                if (zG || objP == obj) {
                    objP = new ugd(433558804, true, new xdr() { // from class: a.ax
                        @Override // a.xdr
                        public final Object F(Object obj2, Object obj3, Object obj4) {
                            byte b4 = b2;
                            cl5 cl5Var = ukd.f35823a;
                            jm40 jm40Var = jm40.b;
                            dx dxVar2 = dxVar;
                            Function1 function2 = function1;
                            switch (b4) {
                                case 0:
                                    yhg0 yhg0Var = (yhg0) obj2;
                                    fet fetVar2 = (fet) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    yhg0Var.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= fetVar2.g(yhg0Var) ? 4 : 2;
                                    }
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        mm40 mm40VarA = yhg0Var.a(1.0f, jm40Var, true);
                                        boolean zG2 = fetVar2.g(function2);
                                        Object objP2 = fetVar2.P();
                                        if (zG2 || objP2 == cl5Var) {
                                            objP2 = new dn(function2, (byte) 8);
                                            fetVar2.o0(objP2);
                                        }
                                        hmw0.e(R.drawable.ic_glyph_calendar_inactive, 0, fetVar2, y860.W(mm40VarA, null, null, false, null, (Function0) objP2, 28), dxVar2.f6823a);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                default:
                                    yhg0 yhg0Var2 = (yhg0) obj2;
                                    fet fetVar3 = (fet) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    yhg0Var2.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= fetVar3.g(yhg0Var2) ? 4 : 2;
                                    }
                                    if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        mm40 mm40VarA2 = yhg0Var2.a(1.0f, jm40Var, true);
                                        boolean zG3 = fetVar3.g(function2);
                                        Object objP3 = fetVar3.P();
                                        if (zG3 || objP3 == cl5Var) {
                                            objP3 = new dn(function2, (byte) 7);
                                            fetVar3.o0(objP3);
                                        }
                                        hmw0.e(R.drawable.ic_glyph_sell, 0, fetVar3, y860.W(mm40VarA2, null, null, false, null, (Function0) objP3, 28), dxVar2.b);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    fetVar.o0(objP);
                }
                xdrVar = (xdr) objP;
                fetVar.r(false);
            } else {
                fetVar.e0(676173145);
                fetVar.r(false);
                xdrVar = null;
            }
            if (str2.length() > 0) {
                fetVar.e0(676292836);
                boolean zG2 = fetVar.g(str2);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj) {
                    objP2 = new ugd(-1607116301, true, new xdr() { // from class: a.ax
                        @Override // a.xdr
                        public final Object F(Object obj2, Object obj3, Object obj4) {
                            byte b4 = b3;
                            cl5 cl5Var = ukd.f35823a;
                            jm40 jm40Var = jm40.b;
                            dx dxVar2 = dxVar;
                            Function1 function2 = function1;
                            switch (b4) {
                                case 0:
                                    yhg0 yhg0Var = (yhg0) obj2;
                                    fet fetVar2 = (fet) obj3;
                                    int iIntValue = ((Integer) obj4).intValue();
                                    yhg0Var.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= fetVar2.g(yhg0Var) ? 4 : 2;
                                    }
                                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        mm40 mm40VarA = yhg0Var.a(1.0f, jm40Var, true);
                                        boolean zG3 = fetVar2.g(function2);
                                        Object objP3 = fetVar2.P();
                                        if (zG3 || objP3 == cl5Var) {
                                            objP3 = new dn(function2, (byte) 8);
                                            fetVar2.o0(objP3);
                                        }
                                        hmw0.e(R.drawable.ic_glyph_calendar_inactive, 0, fetVar2, y860.W(mm40VarA, null, null, false, null, (Function0) objP3, 28), dxVar2.f6823a);
                                    } else {
                                        fetVar2.X();
                                    }
                                    break;
                                default:
                                    yhg0 yhg0Var2 = (yhg0) obj2;
                                    fet fetVar3 = (fet) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    yhg0Var2.getClass();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= fetVar3.g(yhg0Var2) ? 4 : 2;
                                    }
                                    if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        mm40 mm40VarA2 = yhg0Var2.a(1.0f, jm40Var, true);
                                        boolean zG4 = fetVar3.g(function2);
                                        Object objP4 = fetVar3.P();
                                        if (zG4 || objP4 == cl5Var) {
                                            objP4 = new dn(function2, (byte) 7);
                                            fetVar3.o0(objP4);
                                        }
                                        hmw0.e(R.drawable.ic_glyph_sell, 0, fetVar3, y860.W(mm40VarA2, null, null, false, null, (Function0) objP4, 28), dxVar2.b);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    fetVar.o0(objP2);
                }
                xdrVar2 = (xdr) objP2;
                fetVar.r(false);
            } else {
                fetVar.e0(677023289);
                fetVar.r(false);
            }
            d(mm40Var, xdrVar, xdrVar2, fetVar, i2 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var, (Object) dxVar, (Object) function1, i, (byte) 9);
        }
    }

    public static final void c0(WebView webView, boolean z) {
        WebSettings settings = webView.getSettings();
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setCacheMode(2);
        WebView.setWebContentsDebuggingEnabled(z);
        webView.setScrollbarFadingEnabled(false);
        TypedValue typedValue = j5d.f15927a;
        Context context = webView.getContext();
        context.getClass();
        webView.setBackgroundColor(j5d.a(context, R.attr.uikitBackground, false));
        webView.setLayerType(2, null);
    }

    public static final void d(mm40 mm40Var, xdr xdrVar, xdr xdrVar2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-475071180);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(xdrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar2) ? 256 : 128;
        }
        byte b2 = 0;
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (xdrVar == null && xdrVar2 == null) {
            fetVar.e0(-927530130);
            fetVar.r(false);
        } else {
            fetVar.e0(-928052914);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            boolean zF = fetVar.f(backgroundContent);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new bx(b2, backgroundContent);
                fetVar.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40Var, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(mm40VarK, 12.0f, 0.0f, 12.0f, 12.0f, 2), "AdditionalButtonsTestTag");
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            zhg0 zhg0Var = zhg0.f44392a;
            if (xdrVar == null) {
                fetVar.e0(724905728);
            } else {
                fetVar.e0(1408857377);
                xdrVar.F(zhg0Var, fetVar, Integer.valueOf((i2 & 112) | 6));
            }
            fetVar.r(false);
            if (xdrVar2 == null) {
                fetVar.e0(724936480);
            } else {
                fetVar.e0(1408858369);
                xdrVar2.F(zhg0Var, fetVar, Integer.valueOf(((i2 >> 3) & 112) | 6));
            }
            fetVar.r(false);
            fetVar.r(true);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var, (Object) xdrVar, (Object) xdrVar2, i, (byte) 10);
        }
    }

    public static final hh3 d0(wrd wrdVar) {
        fh3 fh3Var;
        gh3 gh3Var;
        eh3 eh3Var;
        wrdVar.getClass();
        String str = wrdVar.M4.c;
        gh3[] gh3VarArrValues = gh3.values();
        int length = gh3VarArrValues.length;
        int i = 0;
        while (true) {
            fh3Var = null;
            if (i >= length) {
                gh3Var = null;
                break;
            }
            gh3Var = gh3VarArrValues[i];
            if (gh3Var.f11279a.equals(str)) {
                break;
            }
            i++;
        }
        if (gh3Var == null) {
            gh3Var = gh3.LOADER_MIDDLE_LOGO_MIDDLE;
        }
        String str2 = wrdVar.N4.d;
        eh3[] eh3VarArrValues = eh3.values();
        int length2 = eh3VarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                eh3Var = null;
                break;
            }
            eh3Var = eh3VarArrValues[i2];
            if (eh3Var.f7790a.equals(str2)) {
                break;
            }
            i2++;
        }
        if (eh3Var == null) {
            eh3Var = eh3.IMAGE;
        }
        String str3 = wrdVar.O4.e;
        for (fh3 fh3Var2 : fh3.values()) {
            if (fh3Var2.f9524a.equals(str3)) {
                fh3Var = fh3Var2;
                break;
            }
        }
        if (fh3Var == null) {
            fh3Var = fh3.BALLS;
        }
        return new hh3(gh3Var, eh3Var, fh3Var);
    }

    public static final void e(int i, int i2, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(665837319);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.e(i) ? 32 : 16) | (fetVar.g(str) ? 256 : 128);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 36.0f);
            boolean zF = fetVar.f(background);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new bx(b2, background);
                fetVar.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(s5x0.L(rq8.K(mm40VarE, (Function1) objP), 8.0f, 0.0f, 2), "AdditionalContainerTestTag");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            dww.c(a8k0.F(i, (i3 >> 3) & 14, fetVar), null, o7k0.n(jm40Var, 20.0f), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            mm40 mm40VarE1 = o2e.e0(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), "AdditionalButtonTextTestTag");
            long j = qmk.o;
            long j2 = qmk.r;
            str2 = str;
            aad.e(str2, mm40VarE1, ibm0.n(new y9q0(0L, j2, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar), null, 2, false, 1, 0, null, new n05(j, j2, qmk.n), fetVar, ((i3 >> 6) & 14) | 1597440, 424);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, i, str2, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [a.wfp0] */
    /* JADX WARN: Type inference failed for: r18v2, types: [a.v5h0] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [a.mja, java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [a.mja, java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v4, types: [a.mja, java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v5, types: [a.mja, java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v6, types: [a.mja, java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v7, types: [a.mja, java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v8, types: [a.mja, java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v9, types: [a.mja, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.mja, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v30, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v8, types: [a.iun] */
    public static final mja e0(pja pjaVar) {
        ?? r21;
        List list;
        e3n0 e3n0Var;
        c9a0 c9a0Var;
        v40 v40Var;
        ?? v5h0Var;
        pjaVar.getClass();
        List list2 = pjaVar.f27079a;
        ?? r2 = 0;
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                fla flaVar = (fla) it.next();
                Integer num = flaVar.f9728a;
                if (num == null) {
                    ?? r22 = r2;
                    jf4.k(r22);
                    return r22;
                }
                int iIntValue = num.intValue();
                Integer num2 = flaVar.b;
                if (num2 == null) {
                    ?? r23 = r2;
                    jf4.k(r23);
                    return r23;
                }
                int iIntValue2 = num2.intValue();
                Integer num3 = flaVar.c;
                if (num3 == null) {
                    ?? r24 = r2;
                    jf4.k(r24);
                    return r24;
                }
                int iIntValue3 = num3.intValue();
                Integer num4 = flaVar.d;
                if (num4 == null) {
                    ?? r25 = r2;
                    jf4.k(r25);
                    return r25;
                }
                int iIntValue4 = num4.intValue();
                vkl0 vkl0Var = flaVar.e;
                if (vkl0Var == null) {
                    ?? r26 = r2;
                    jf4.k(r26);
                    return r26;
                }
                Integer num5 = vkl0Var.f37580a;
                int iIntValue5 = num5 != null ? num5.intValue() : 0;
                String str = vkl0Var.b;
                if (str == null) {
                    str = "";
                }
                uil0 uil0Var = new uil0(iIntValue5, str);
                w3n0 w3n0Var = flaVar.f;
                if (w3n0Var != null) {
                    Integer num6 = w3n0Var.f38509a;
                    int iIntValue6 = num6 != null ? num6.intValue() : 0;
                    String str2 = w3n0Var.b;
                    if (str2 == null) {
                        jf4.k(r2);
                        return r2;
                    }
                    e3n0Var = new e3n0(iIntValue6, str2);
                } else {
                    e3n0Var = new e3n0(0, "");
                }
                jiz jizVar = flaVar.g;
                if (jizVar == null) {
                    ?? r27 = r2;
                    jf4.k(r27);
                    return r27;
                }
                e3n0 e3n0Var2 = e3n0Var;
                ?? r28 = r2;
                Integer num7 = jizVar.f16597a;
                if (num7 == null) {
                    jf4.k(r28);
                    return r28;
                }
                int iIntValue7 = num7.intValue();
                String str3 = jizVar.b;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = jizVar.c;
                if (str4 == null) {
                    str4 = "";
                }
                giz gizVar = new giz(iIntValue7, str3, str4);
                hip0 hip0Var = flaVar.h;
                if (hip0Var == null) {
                    jf4.k(r28);
                    return r28;
                }
                wfp0 wfp0VarI0 = i0(hip0Var);
                hip0 hip0Var2 = flaVar.i;
                ?? I0 = hip0Var2 != null ? i0(hip0Var2) : r28;
                aho ahoVar = flaVar.j;
                if (ahoVar == null) {
                    jf4.k(r28);
                    return r28;
                }
                Iterator it2 = it;
                Integer num8 = ahoVar.f883a;
                if (num8 == null) {
                    jf4.k(r28);
                    return r28;
                }
                int iIntValue8 = num8.intValue();
                Boolean bool = ahoVar.b;
                if (bool == null) {
                    jf4.k(r28);
                    return r28;
                }
                boolean zBooleanValue = bool.booleanValue();
                jaa0 jaa0Var = ahoVar.c;
                ?? r17 = I0;
                if (jaa0Var != null) {
                    Integer num9 = jaa0Var.f16181a;
                    int iIntValue9 = num9 != null ? num9.intValue() : 0;
                    String str5 = jaa0Var.b;
                    if (str5 == null) {
                        str5 = "";
                    }
                    c9a0Var = new c9a0(iIntValue9, str5);
                } else {
                    c9a0Var = new c9a0(0, "");
                }
                c9a0 c9a0Var2 = c9a0Var;
                Double d2 = ahoVar.d;
                if (d2 == null) {
                    jf4.k(r28);
                    return r28;
                }
                double dDoubleValue = d2.doubleValue();
                Double d3 = ahoVar.e;
                if (d3 == null) {
                    jf4.k(r28);
                    return r28;
                }
                double dDoubleValue2 = d3.doubleValue();
                String str6 = ahoVar.f;
                String str7 = str6 == null ? "" : str6;
                Boolean bool2 = ahoVar.g;
                if (bool2 == null) {
                    jf4.k(r28);
                    return r28;
                }
                boolean zBooleanValue2 = bool2.booleanValue();
                Integer num10 = ahoVar.h;
                if (num10 == null) {
                    jf4.k(r28);
                    return r28;
                }
                int iIntValue10 = num10.intValue();
                Integer num11 = ahoVar.i;
                if (num11 == null) {
                    jf4.k(r28);
                    return r28;
                }
                int iIntValue11 = num11.intValue();
                kfo kfoVar = ahoVar.j;
                ?? r5 = kfoVar != null ? kfoVar.f18205a : r28;
                if (r5 == 0) {
                    r5 = iun.f15405a;
                }
                ?? r3 = kfoVar != null ? kfoVar.b : r28;
                if (r3 == 0) {
                    r3 = iun.f15405a;
                }
                teo teoVar = new teo(iIntValue8, zBooleanValue, c9a0Var2, dDoubleValue, dDoubleValue2, null, str7, zBooleanValue2, iIntValue10, iIntValue11, new bfo(r5, r3));
                y40 y40Var = flaVar.k;
                if (y40Var != null) {
                    Integer num12 = y40Var.f41977a;
                    if (num12 == null) {
                        jf4.k(r28);
                        return r28;
                    }
                    int iIntValue12 = num12.intValue();
                    Integer num13 = y40Var.b;
                    int iIntValue13 = num13 != null ? num13.intValue() : 0;
                    Integer num14 = y40Var.c;
                    if (num14 == null) {
                        jf4.k(r28);
                        return r28;
                    }
                    int iIntValue14 = num14.intValue();
                    Integer num15 = y40Var.d;
                    if (num15 == null) {
                        jf4.k(r28);
                        return r28;
                    }
                    int iIntValue15 = num15.intValue();
                    Integer num16 = y40Var.e;
                    if (num16 == null) {
                        jf4.k(r28);
                        return r28;
                    }
                    int iIntValue16 = num16.intValue();
                    Integer num17 = y40Var.f;
                    if (num17 == null) {
                        jf4.k(r28);
                        return r28;
                    }
                    v40Var = new v40(iIntValue12, iIntValue13, iIntValue14, iIntValue15, iIntValue16, num17.intValue());
                } else {
                    v40Var = new v40(0, 0, 0, 0, 0, 0);
                }
                tqt tqtVar = uoy.b;
                Integer num18 = flaVar.l;
                int iIntValue17 = num18 != null ? num18.intValue() : 0;
                tqtVar.getClass();
                uoy uoyVarJ = tqt.j(iIntValue17);
                g6h0 g6h0Var = flaVar.m;
                if (g6h0Var != null) {
                    String str8 = g6h0Var.f10765a;
                    String strR = str8 != null ? kotlin.text.c.r(str8, "-", " : ", false) : "";
                    String str9 = g6h0Var.b;
                    if (str9 == null) {
                        str9 = "";
                    }
                    v5h0Var = new v5h0(strR, str9);
                } else {
                    iIntValue = iIntValue;
                    iIntValue2 = iIntValue2;
                    v5h0Var = r28;
                }
                String str10 = flaVar.n;
                arrayList.add(new kka(iIntValue, iIntValue2, iIntValue3, iIntValue4, uil0Var, e3n0Var2, gizVar, wfp0VarI0, r17, teoVar, v40Var, uoyVarJ, v5h0Var, null, str10 != null ? str10 : ""));
                r2 = r28;
                it = it2;
            }
            r21 = r2;
            list = arrayList;
        } else {
            r21 = 0;
            list = iun.f15405a;
        }
        Long l = pjaVar.c;
        if (l == null) {
            jf4.k(r21);
            return r21;
        }
        long jLongValue = l.longValue();
        Boolean bool3 = pjaVar.b;
        if (bool3 != null) {
            return new mja(jLongValue, list, bool3.booleanValue());
        }
        jf4.k(r21);
        return r21;
    }

    public static final void f(mm40 mm40Var, bdz bdzVar, fi2 fi2Var, Function1 function1, fet fetVar, int i) {
        boolean z;
        ljc ljcVar = jd8.n;
        bdzVar.getClass();
        function1.getClass();
        fetVar.g0(291101834);
        byte b2 = 4;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(bdzVar) ? 32 : 16) | (fetVar.g(fi2Var) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 7168;
            boolean z2 = i3 == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new zk2(function1, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i3 == 2048;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new zk2(function1, (byte) 5);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mde mdeVar = fi2Var.b;
            boolean z4 = mdeVar instanceof wce;
            jm40 jm40Var = jm40.b;
            if (z4) {
                fetVar.e0(1319666722);
                dub.C(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), ljcVar), (wce) mdeVar, function1, fetVar, (i2 >> 3) & 896, 0);
                fetVar.r(false);
                z = true;
            } else if (mdeVar instanceof bde) {
                fetVar.e0(1319944141);
                z = true;
                G(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), ljcVar), bdzVar, false, ((bde) mdeVar).f2395a, fi2Var.c, fi2Var.d, function1, fetVar, (i2 & 112) | 384 | ((i2 << 9) & 3670016));
                fetVar.r(false);
            } else {
                z = true;
                if (mdeVar instanceof gde) {
                    fetVar.e0(1320429198);
                    G(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), ljcVar), bdzVar, true, ((gde) mdeVar).f11102a, fi2Var.c, fi2Var.d, function1, fetVar, (i2 & 112) | 384 | ((i2 << 9) & 3670016));
                    fetVar.r(false);
                } else {
                    if (!(mdeVar instanceof sce)) {
                        throw b1j.f(1982232144, fetVar, false);
                    }
                    fetVar.e0(1320924020);
                    w(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), ljcVar), bdzVar, fi2Var.c, (sce) mdeVar, function1, fetVar, (i2 & 112) | ((i2 << 3) & 57344));
                    fetVar.r(false);
                }
            }
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 15, i, mm40Var, bdzVar, fi2Var, function1);
        }
    }

    public static final d41 f0(n41 n41Var) {
        n41Var.getClass();
        Long l = n41Var.f22876a;
        BigDecimal bigDecimal = null;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        Integer num = n41Var.c;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        String str = n41Var.g;
        if (str != null) {
            if (StringsKt.W(str)) {
                str = null;
            }
            if (str != null) {
                bigDecimal = new BigDecimal(str);
            }
        }
        return new d41(jLongValue, iIntValue, bigDecimal);
    }

    public static final void g(mm40 mm40Var, azq0 azq0Var, xcz xczVar, Function1 function1, fet fetVar, int i) {
        azq0Var.getClass();
        xczVar.getClass();
        function1.getClass();
        fetVar.g0(1088334615);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(azq0Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = false;
            a4x a4xVar = azq0Var.f1732a;
            lq5 lq5Var = azq0Var.c;
            boolean z2 = azq0Var.b;
            if ((i2 & 7168) == 2048) {
                z = true;
            }
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ag0(function1, (byte) 15);
                fetVar.o0(objP);
            }
            etl.e(mm40Var, a4xVar, lq5Var, z2, xczVar, 0.0f, 0, null, (Function2) objP, fetVar, (i2 & 14) | ((i2 << 6) & 57344), 224);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 24, i, mm40Var, azq0Var, xczVar, function1);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final a.i72 g0(a.g72 r56, a.ctf0 r57) {
        /*
            Method dump skipped, instruction units count: 1660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hmw0.g0(a.g72, a.ctf0):a.i72");
    }

    public static final void h(mm40 mm40Var, wy6 wy6Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fet fetVar, int i) {
        wy6Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar.g0(-1518305096);
        int i2 = i | 6 | (fetVar.g(wy6Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192) | (fetVar.i(function3) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            if (wy6Var instanceof ry6) {
                fetVar.e0(1197694696);
                a8k0.d((ry6) wy6Var, function0, function1, function2, function3, fetVar, i2 & 524286);
                fetVar.r(false);
            } else if (wy6Var instanceof ny6) {
                fetVar.e0(1197707376);
                ntr.k((ny6) wy6Var, fetVar, i2 & 126);
                fetVar.r(false);
            } else if (wy6Var instanceof py6) {
                fetVar.e0(1197713122);
                lmc.u((py6) wy6Var, fetVar, i2 & 126);
                fetVar.r(false);
            } else if (wy6Var instanceof ty6) {
                fetVar.e0(1197724004);
                int i3 = i2 >> 3;
                qxw.k((ty6) wy6Var, function1, function2, fetVar, (i3 & 7168) | (i2 & 126) | (i3 & 896));
                fetVar.r(false);
            } else {
                if (!(wy6Var instanceof uy6)) {
                    throw b1j.f(1197692981, fetVar, false);
                }
                fetVar.e0(1197733244);
                mym0.e((uy6) wy6Var, fetVar, i2 & 126);
                fetVar.r(false);
            }
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jy6(mm40Var, wy6Var, function0, function1, function2, function3, i, (byte) 0);
        }
    }

    public static final List h0(List list) {
        f8b f8bVar;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sz60 sz60Var = (sz60) it.next();
                if (sz60Var == null) {
                    f8bVar = null;
                } else {
                    Integer num = sz60Var.f33056a;
                    if (num == null) {
                        jf4.k(null);
                        return null;
                    }
                    int iIntValue = num.intValue();
                    String str = sz60Var.b;
                    if (str == null) {
                        jf4.k(null);
                        return null;
                    }
                    f8bVar = new f8b(iIntValue, str);
                }
                if (f8bVar != null) {
                    arrayList2.add(f8bVar);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public static final void i(imm immVar, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        imm immVar2;
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-531159037);
        if ((i & 6) == 0) {
            immVar2 = immVar;
            i2 = (fetVar2.g(immVar2) ? 4 : 2) | i;
        } else {
            immVar2 = immVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(mdmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarW = o050.W(jm40.b);
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            boolean z3 = z2;
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new ouh(function1, (byte) 18);
                fetVar2.o0(objP);
            }
            int i3 = i2;
            hlm.c(mm40VarW, immVar2, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, (i2 << 3) & 112, 0, 4084);
            fetVar2 = fetVar;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new rtj((byte) 9);
                fetVar2.o0(objP2);
            }
            jcb.l(null, mdmVar, false, (Function0) objP2, fetVar2, (i3 & 112) | 3072, 5);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cf7(immVar, mdmVar, function1, i, (byte) 1);
        }
    }

    public static final wfp0 i0(hip0 hip0Var) {
        ArrayList arrayList;
        List<i380> list = hip0Var.c;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (i380 i380Var : list) {
                Integer num = i380Var.f14085a;
                int iIntValue = num != null ? num.intValue() : 0;
                String str = i380Var.b;
                if (str == null) {
                    str = "";
                }
                String str2 = i380Var.c;
                if (str2 == null) {
                    str2 = "";
                }
                arrayList.add(new g280(iIntValue, str, str2));
            }
        } else {
            arrayList = null;
        }
        String str3 = hip0Var.f13126a;
        String str4 = str3 != null ? str3 : "";
        Integer num2 = hip0Var.b;
        if (num2 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue2 = num2.intValue();
        List list2 = arrayList;
        if (arrayList == null) {
            list2 = iun.f15405a;
        }
        return new wfp0(str4, list2, iIntValue2);
    }

    public static final void j(mm40 mm40Var, Function2 function2, Function2 function3, fet fetVar, int i) {
        int i2;
        function2.getClass();
        function3.getClass();
        fetVar.g0(1134010322);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function3) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            int iT = w6kVar.T(4.0f);
            boolean zE = fetVar.e(iT);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new mq8(iT, b2);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            function2.invoke(fetVar, Integer.valueOf((i2 >> 3) & 14));
            h97.q((i2 >> 6) & 14, fetVar, function3, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e61(mm40Var, function2, function3, i, (byte) 1);
        }
    }

    public static final String j0(String str) {
        StringBuilder sb = new StringBuilder(ujn.h);
        str.getClass();
        if (str.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
            sb.setLength(0);
            sb.append(str);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str, '/'));
        }
        return sb.toString();
    }

    public static final void k(mm40 mm40Var, mdm mdmVar, boolean z, Function0 function0, fet fetVar, int i, int i2) {
        int i3;
        Function0 function1;
        Function0 function2;
        fetVar.g0(-1235010026);
        byte b2 = 4;
        int i4 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(mdmVar) ? 32 : 16);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
        } else {
            i3 = i4 | (fetVar.i(function0) ? 2048 : 1024);
        }
        if (fetVar.U(i3 & 1, (i3 & 1043) != 1042)) {
            if (i5 != 0) {
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new ej8(b2);
                    fetVar.o0(objP);
                }
                function2 = (Function0) objP;
            } else {
                function2 = function0;
            }
            mm40 mm40VarE = tfx.E(mm40Var.e(o7k0.c));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jcb.l(null, mdmVar, false, function2, fetVar, i3 & 7280, 5);
            fetVar.r(true);
            function1 = function2;
        } else {
            fetVar.X();
            function1 = function0;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bx8(mm40Var, mdmVar, z, function1, i, i2, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b8 A[Catch: all -> 0x00b4, PHI: r2
  0x00b8: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:62:0x00e7, B:12:0x0023, B:52:0x00b7, B:53:0x00b8, B:65:0x00eb, B:54:0x00b9, B:60:0x00e5, B:59:0x00c3, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040), top: B:77:0x0003, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader k0() {
        ClassLoader classLoader;
        SecurityException e2;
        Thread thread;
        ThreadGroup threadGroup;
        classLoader = f13325a;
        if (classLoader == null) {
            Thread thread2 = b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = b.getContextClassLoader();
                    } catch (SecurityException e3) {
                        String message = e3.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
                        sb.append("Failed to get thread context classloader ");
                        sb.append(message);
                        Log.w("DynamiteLoaderV2CL", sb.toString());
                    }
                }
                classLoader = contextClassLoader;
                f13325a = classLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i = 0;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i2];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i++;
                                }
                                if (thread == null) {
                                    try {
                                        i04 i04Var = new i04(threadGroup, "GmsDynamite");
                                        try {
                                            i04Var.setContextClassLoader(null);
                                            i04Var.start();
                                            thread = i04Var;
                                        } catch (SecurityException e4) {
                                            e2 = e4;
                                            thread = i04Var;
                                            String message2 = e2.getMessage();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb2.append("Failed to enumerate thread/threadgroup ");
                                            sb2.append(message2);
                                            Log.w("DynamiteLoaderV2CL", sb2.toString());
                                        }
                                    } catch (SecurityException e5) {
                                        e2 = e5;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (SecurityException e6) {
                            e2 = e6;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = b.getContextClassLoader();
                    }
                }
                classLoader = contextClassLoader;
                f13325a = classLoader;
            }
        }
        return classLoader;
    }

    public static final void l(mm40 mm40Var, cy8 cy8Var, d9z d9zVar, boolean z, Function1 function1, fet fetVar, int i) {
        Function1 function2 = function1;
        fetVar.g0(1536946259);
        int i2 = i | (fetVar.g(cy8Var) ? 32 : 16) | (fetVar.g(d9zVar) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            float fT = fbc.T(fetVar);
            zcl zclVar = qmk.f28987a;
            float f2 = 180.0f + fT;
            float fB = pkd.b(f2, fetVar);
            float f3 = 56.0f + fT;
            boolean z2 = cy8Var.c.b instanceof nlm;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                pel pelVar = new pel();
                qt2 qt2Var = qt2.f29279a;
                pelVar.a(qt2Var, fB);
                pelVar.a(qt2.b, 0.0f);
                float[] fArr = pelVar.b;
                ArrayList arrayList = pelVar.f26860a;
                int size = arrayList.size();
                nx3.a(size, fArr.length);
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                fArrCopyOfRange.getClass();
                objP = new rv2(new vtj(arrayList, fArrCopyOfRange), qt2Var);
                fetVar.o0(objP);
            }
            rv2 rv2Var = (rv2) objP;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zH = fetVar.h(z2) | fetVar.d(fB);
            Object objP2 = fetVar.P();
            if (zH || objP2 == cl5Var) {
                cx8 cx8Var = new cx8(rv2Var, z2, fB, null, (byte) 0);
                fetVar.o0(cx8Var);
                objP2 = cx8Var;
            }
            m0x0.v(rv2Var, boolValueOf, (Function2) objP2, fetVar);
            zfn zfnVar = zaq0.b;
            yw8 yw8Var = new yw8(cy8Var, f2, f3, function2, z, (byte) 0);
            function2 = function2;
            y0x0.d(mm40Var, fB, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ((ThemeColors) fetVar.k(zfnVar)).getBackground(), 0L, 0.0f, !z2, rv2Var, u1c.M(-716528729, yw8Var, fetVar), u1c.M(-629256863, new ax8(function2, cy8Var, d9zVar, z), fetVar), fetVar, 805330950, 192);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0((byte) 4, i, (wdr) function2, (Object) mm40Var, (Object) cy8Var, (Object) d9zVar, z);
        }
    }

    public static void l0(long[] jArr, long[] jArr2, int i) {
        int i2 = -i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = (int) jArr[i3];
            int i5 = (((int) jArr2[i3]) ^ i4) & i2;
            jArr[i3] = i4 ^ i5;
            jArr2[i3] = ((int) jArr2[i3]) ^ i5;
        }
    }

    public static final void m(String str, String str2, Function0 function0, fet fetVar, int i) {
        fetVar.g0(570999093);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                hjm hjmVar = new hjm(str, new ojm(127), null, null, null, null, false, null, null, false, new ue9(str2), null, 7164);
                fetVar.o0(hjmVar);
                objP = hjmVar;
            }
            nkb.h(null, (hjm) objP, kjm.b, null, function0, null, fetVar, ((i2 << 6) & 57344) | 384, 41);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lsc0(str, str2, function0, i, (byte) 0);
        }
    }

    public static final void n(mm40 mm40Var, ud80 ud80Var, Function2 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1572857291);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(ud80Var) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (ud80Var == null) {
                mm40Var2 = mm40Var;
            } else if (ud80Var instanceof rd80) {
                fetVar.e0(-1101418582);
                zcl zclVar = qmk.f28987a;
                mm40Var2 = mm40Var;
                pzw.l(s5x0.N(mm40Var2, 4.0f, 4.0f, 4.0f, 0.0f, 8), (rd80) ud80Var, fetVar, i2 & 112);
                fetVar.r(false);
            } else {
                mm40Var2 = mm40Var;
                if (ud80Var instanceof zd80) {
                    fetVar.e0(-1101106381);
                    yyw.o(mm40Var2, (zd80) ud80Var, function2, fetVar, i2 & 1022);
                    fetVar.r(false);
                }
            }
            fetVar.e0(-1100932905);
            fetVar.r(false);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(mm40Var2, ud80Var, function2, i, (byte) 21);
        }
    }

    public static final void o(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-2071251061);
        if (fetVar.U(i & 1, i != 0)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new muc0(guc0.f11922a, null);
                fetVar.o0(objP);
            }
            muc0 muc0Var = (muc0) objP;
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            x2x.k(s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 6.0f, 7), muc0Var, false, null, fetVar2, 48, 12);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t4c0(i, (byte) 28);
        }
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(700861981);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            g1x.l(mm40Var, p8a.d, fetVar, (i2 & 14) | 48, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 25);
        }
    }

    public static final void q(mm40 mm40Var, bmn bmnVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        fetVar.g0(366800028);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(bmnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 18.0f);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dpl((Object) bmnVar, (Object) function1, (byte) 27);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var2, null, lh80Var, null, null, null, false, null, (Function1) objP, fetVar, i2 & 14, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) bmnVar, (Object) function1, i, (byte) 29);
        }
    }

    public static final void r(tsc0 tsc0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-720135296);
        byte b2 = 4;
        int i2 = (fetVar.g(tsc0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            int i3 = i2 & 112;
            boolean zG = fetVar.g(xczVarA) | (i3 == 32);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new aj6(xczVarA, function1, null, b2);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, xczVarA, (Function2) objP);
            mm40 mm40VarE0 = o2e.e0(i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), "PROMO_SHOP_LAZY_COLUMN");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7), fetVar);
            boolean z = ((i2 & 14) == 4) | (i3 == 32);
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new oac0(tsc0Var, function1, (byte) 8);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarE0, xczVarA, ch80VarG, null, null, null, false, null, (Function1) objP2, fetVar, 0, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(tsc0Var, function1, i, (byte) 26);
        }
    }

    public static final void s(l8k l8kVar, Function1 function1, fet fetVar, int i) {
        l8kVar.getClass();
        function1.getClass();
        fetVar.g0(-586688444);
        byte b2 = 2;
        int i2 = (fetVar.g(l8kVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b3 = 0;
        byte b4 = 1;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else {
            if (l8kVar.f) {
                fetVar.e0(-1813346330);
                i(l8kVar.d, l8kVar.g, function1, fetVar, (i2 << 3) & 896);
                fetVar.r(false);
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new e8k(l8kVar, function1, i, b3);
                    return;
                }
                return;
            }
            fetVar.e0(-1813138754);
            fetVar.r(false);
            n0q n0qVar = o7k0.c;
            ugd ugdVarM = u1c.M(-1145248256, new e8k(l8kVar, function1, b4), fetVar);
            ugd ugdVarM2 = u1c.M(-890858849, new e8k(l8kVar, function1, b2), fetVar);
            pz40 pz40Var = s6t0.f31722a;
            m8x.y(n0qVar, ugdVarM, ugdVarM2, null, null, 0, s6t0.b().f33626a.getBackgroundContent(), 0L, null, u1c.M(1968423957, new ri1(l8kVar, function1, (byte) 7), fetVar), fetVar, 805306806, 440);
            if (l8kVar.f19608a) {
                fetVar.e0(-1810770075);
                I(0, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-1810746050);
                fetVar.r(false);
            }
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new e8k(l8kVar, function1, i, (byte) 3);
        }
    }

    public static final void t(mm40 mm40Var, gmn gmnVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-1407570025);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(gmnVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (gmnVar instanceof bmn) {
                fetVar.e0(-608721730);
                q(o7k0.c, (bmn) gmnVar, function1, fetVar, (i2 & 896) | (i2 & 112) | 6);
                fetVar.r(false);
            } else if (gmnVar instanceof dmn) {
                fetVar.e0(-608713487);
                mdm mdmVar = ((dmn) gmnVar).f6329a;
                boolean z = (i2 & 896) == 256;
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new ylm(function1, (byte) 7);
                    fetVar.o0(objP);
                }
                jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
                fetVar.r(false);
            } else if (Intrinsics.d(gmnVar, fmn.f9792a)) {
                fetVar.e0(-608705682);
                zcl zclVar = qmk.f28987a;
                p(0, fetVar, s5x0.N(jm40.b, 0.0f, 12.0f, 0.0f, 0.0f, 13).e(o7k0.c));
                fetVar.r(false);
            } else if (gmnVar instanceof cmn) {
                fetVar.e0(-608698022);
                jcb.l(null, ((cmn) gmnVar).f4613a, false, null, fetVar, 0, 13);
                fetVar.r(false);
            } else {
                if (!Intrinsics.d(gmnVar, emn.f8055a)) {
                    throw b1j.f(-608724095, fetVar, false);
                }
                fetVar.e0(-1689632445);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var, gmnVar, function1, i, (byte) 29);
        }
    }

    public static final void u(mm40 mm40Var, imm immVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(723282896);
        int i2 = i | 6 | (fetVar.g(immVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ylm(function1, (byte) 10);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ylm(function1, (byte) 11);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z3 = i3 == 256;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new btm(function1, (byte) 8);
                fetVar.o0(objP3);
            }
            jm40 jm40Var = jm40.b;
            hlm.c(jm40Var, immVar, null, function0, function2, (Function1) objP3, null, null, null, null, null, null, fetVar, i2 & 126, 0, 4036);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ymn(mm40Var2, immVar, function1, i, (byte) 0);
        }
    }

    public static final void v(mm40 mm40Var, final onn onnVar, final Function1 function1, fet fetVar, int i) {
        xpj0 xpj0VarY;
        float f2;
        fet fetVar2 = fetVar;
        onnVar.getClass();
        function1.getClass();
        fetVar2.g0(407000013);
        int i2 = i | (fetVar2.g(onnVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jln jlnVar = onnVar.c;
            if (jlnVar == null) {
                fetVar2.e0(1914990282);
                xpj0VarY = epv0.Y(ypj0.f43033a, fetVar2, 390, 2);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1915174453);
                xpj0VarY = epv0.Y(ypj0.b, fetVar2, 6, 6);
                fetVar2.r(false);
            }
            bq8 bq8VarX = epv0.X(xpj0VarY, fetVar2, 2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (jlnVar == null) {
                zcl zclVar = qmk.f28987a;
                f2 = 0.0f;
            } else if (jlnVar.f16724a.c instanceof gln) {
                zcl zclVar2 = qmk.f28987a;
                f2 = 150.0f;
            } else {
                zcl zclVar3 = qmk.f28987a;
                f2 = 132.0f;
            }
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            long backgroundContent2 = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar4 = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            epv0.g(u1c.M(-286714216, new xdr() { // from class: a.zmn
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b3;
                    Function1 function2 = function1;
                    onn onnVar2 = onnVar;
                    switch (b4) {
                        case 0:
                            hh80 hh80Var = (hh80) obj;
                            fet fetVar3 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            hh80Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar3.g(hh80Var) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                hmw0.t(s5x0.I(jm40.b, hh80Var).e(o7k0.c), onnVar2.b, function2, fetVar3, 0);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                jln jlnVar2 = onnVar2.c;
                                if (jlnVar2 == null) {
                                    fetVar4.e0(1186805230);
                                    fetVar4.r(false);
                                } else {
                                    fetVar4.e0(1186805231);
                                    xbc.p(null, jlnVar2, function2, fetVar4, 0);
                                    fetVar4.r(false);
                                }
                            } else {
                                fetVar4.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar2), null, bq8VarX, f2, 0.0f, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4), backgroundContent2, backgroundContent, 0.0f, null, false, u1c.M(1678023073, new d0n((Object) onnVar, (Object) function1, (byte) 23), fetVar2), null, s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getBackground(), u1c.M(946980226, new xdr() { // from class: a.zmn
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b2;
                    Function1 function2 = function1;
                    onn onnVar2 = onnVar;
                    switch (b4) {
                        case 0:
                            hh80 hh80Var = (hh80) obj;
                            fet fetVar3 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            hh80Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar3.g(hh80Var) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                hmw0.t(s5x0.I(jm40.b, hh80Var).e(o7k0.c), onnVar2.b, function2, fetVar3, 0);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((y5d) obj).getClass();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                jln jlnVar2 = onnVar2.c;
                                if (jlnVar2 == null) {
                                    fetVar4.e0(1186805230);
                                    fetVar4.r(false);
                                } else {
                                    fetVar4.e0(1186805231);
                                    xbc.p(null, jlnVar2, function2, fetVar4, 0);
                                    fetVar4.r(false);
                                }
                            } else {
                                fetVar4.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar2), fetVar, 6);
            fetVar2 = fetVar;
            if (jlnVar == null) {
                fetVar2.e0(1092603186);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1092603187);
                mm40 mm40VarB = jr8.f16991a.b(i120.Q(jm40.b, s6t0.b().f33626a.getBackgroundContent(), jd8.n), gqw0.h);
                vul vulVar = vul.f38053a;
                wul wulVar = jlnVar.c;
                wul wulVar2 = jlnVar.d;
                int i3 = i2 & 896;
                boolean z = i3 == 256;
                Object objP = fetVar2.P();
                cl5 cl5Var = ukd.f35823a;
                if (z || objP == cl5Var) {
                    objP = new ylm(function1, (byte) 8);
                    fetVar2.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                boolean z2 = i3 == 256;
                Object objP2 = fetVar2.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new ylm(function1, (byte) 9);
                    fetVar2.o0(objP2);
                }
                gkb.i(mm40VarB, vulVar, wulVar, wulVar2, 0L, function0, (Function0) objP2, fetVar2, 48, 16);
                fetVar2.r(false);
            }
            if (onnVar.d) {
                fetVar2.e0(1093321147);
                H(0, fetVar2);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1093351899);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ann(mm40Var, onnVar, function1, i, (byte) 0);
        }
    }

    public static final void w(mm40 mm40Var, bdz bdzVar, boolean z, sce sceVar, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z2;
        fetVar.g0(-1148170782);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(bdzVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(sceVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            xcz xczVarB = bdzVar.b("KEY_LAZY_LIST_TEAMS", fetVar);
            wom womVarF = mom.f(fetVar);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            boolean z3 = (57344 & i2) == 16384;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new zk2(function1, (byte) 6);
                fetVar.o0(objP);
            }
            mom.c(mm40VarE, z2, womVarF, null, false, null, (Function0) objP, null, u1c.M(-1155325385, new ri1(xczVarB, sceVar, b2), fetVar), fetVar, ((i2 >> 3) & 112) | 100663296, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) mm40Var, (Object) bdzVar, z, (Object) sceVar, (Object) function1, i, (byte) 2);
        }
    }

    public static final void x(mdm mdmVar, fet fetVar, int i) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-1908100948);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, null, fetVar2, (i2 << 3) & 112, 13);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vl0(mdmVar2, i, (byte) 11);
        }
    }

    public static final void y(mdm mdmVar, Function0 function0, fet fetVar, int i) {
        mdm mdmVar2;
        Function0 function1;
        fet fetVar2;
        fetVar.g0(-1648665445);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mdmVar2 = mdmVar;
            function1 = function0;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, function1, fetVar2, ((i2 << 3) & 112) | ((i2 << 6) & 7168), 5);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            function1 = function0;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eu60(mdmVar2, function1, i, b2);
        }
    }

    public static final void z(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-1809656388);
        byte b2 = 0;
        if (fetVar.U(i & 1, i != 0)) {
            fetVar2 = fetVar;
            nkb.h(null, new ijm(new qjm()), kjm.b, null, null, null, fetVar2, 384, 57);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ksc0(i, b2);
        }
    }
}
