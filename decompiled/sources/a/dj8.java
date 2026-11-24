package a;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.javax.sip.message.Response;
import android.os.Build;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dj8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f6170a = new float[91];
    public static final ugd b = new ugd(1972046023, false, new i5b(16));
    public static final ugd c = new ugd(-1183667745, false, new ahd(4));
    public static final ugd d = new ugd(1760677735, false, new ahd(5));
    public static final ugd e = new ugd(1147102704, false, new fhd(28));
    public static final ugd f = new ugd(-1987914447, false, new fhd(29));
    public static final ugd g = new ugd(1950583873, false, new ohd(1));
    public static final z6k h = new z6k(1.0f, 1.0f);
    public static final kbk0 i = new kbk0((byte) 1);
    public static final qak0 j = new qak0((byte) 0);

    public static final void F(int i2, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(1530926515);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a("•", null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 6, 0, 131066);
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar, o7k0.s(jm40.b, 8.0f));
            v8q0.a(str, new x7z(1.0f, true), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, (i3 >> 3) & 14, 0, 131064);
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var, str2, i2, (byte) 28);
        }
    }

    public static final void G(mm40 mm40Var, wno0 wno0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        Function1 function2;
        function1.getClass();
        fetVar.g0(-2056547431);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(wno0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Boolean boolValueOf = Boolean.valueOf(wno0Var.f39459a);
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean zG = (i5 == 256) | (i4 == 32) | fetVar.g(xczVarA);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                Object w090Var = new w090((Object) wno0Var, (Object) xczVarA, (Object) function1, (yje) null, (byte) 26);
                function2 = function1;
                fetVar.o0(w090Var);
                objP = w090Var;
            } else {
                function2 = function1;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP);
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "MENU_PLAIN_LIST");
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(f2, 8.0f, f3, 24.0f, fetVar);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = (i4 == 32) | (i5 == 256);
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new ka70(wno0Var, function2, (byte) 21);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarE0, xczVarA, ch80VarF, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var2, wno0Var, function1, i2, (byte) 8);
        }
    }

    public static final void H(gc6 gc6Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1001351382);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar.g(gc6Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            pm80 pm80VarF = a8k0.F(R.drawable.best_hero_player_placeholder, 0, fetVar);
            String str = gc6Var.e;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 6.0f, 0.0f, 11), 36.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            k7x.b(str, null, o2e.e0(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), kkg.f, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "PLAYER_PICTURE"), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ac6(gc6Var, i2, (byte) 3);
        }
    }

    public static final void I(gc6 gc6Var, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-96184050);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(gc6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 4.0f, 0.0f, 11), 36.0f);
            long j2 = kkg.f;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.J(i120.Q(mm40VarN, j2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 10.0f), "POSITION_PICTURE");
            ec6 ec6Var = gc6Var.h;
            if (ec6Var instanceof cc6) {
                fetVar2.e0(-675393989);
                j0x.b(a8k0.F(((cc6) gc6Var.h).f4093a, 0, fetVar2), null, mm40VarE0, null, gqw0.A, 0.0f, null, fetVar, 24632, 104);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                if (!(ec6Var instanceof dc6)) {
                    throw b1j.f(2056420684, fetVar2, false);
                }
                fetVar2.e0(-675084020);
                dww.c(a8k0.F(gc6Var.b == wb6.b ? R.drawable.ic_sport_league_of_legends_106 : R.drawable.ic_sport_color_dota_97, 0, fetVar2), null, mm40VarE0, StaticColors.INSTANCE.m126getWhite200d7_KjU(), fetVar2, 56, 0);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ac6(gc6Var, i2, b2);
        }
    }

    public static final void J(mm40 mm40Var, boolean z, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        boolean z2;
        mm40 mm40Var2;
        fetVar.g0(14747149);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            z2 = z;
            i3 |= fetVar.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z3 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new ia30(function1, (byte) 25);
                fetVar.o0(objP);
            }
            mom.c(n0qVar, z2, womVarF, null, false, null, (Function0) objP, null, ugdVar, fetVar, (i3 & 112) | ((i3 << 15) & 234881024), 184);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new an2(mm40Var2, z, function1, ugdVar, i2, (byte) 5);
        }
    }

    public static final void K(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-503607297);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rsm0.w(R.string.player_info_last_games, 0, fetVar), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new evd0(function1, (byte) 24);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            ije0 ije0Var = (ije0) l7m0Var.getValue();
            if (ije0Var instanceof fje0) {
                fetVar.e0(698591525);
                q((fje0) ije0Var, fetVar, 0);
                fetVar.r(false);
            } else if (ije0Var instanceof gje0) {
                fetVar.e0(698593620);
                t(((gje0) ije0Var).f11392a, function1, fetVar, i4);
                fetVar.r(false);
            } else {
                if (!Intrinsics.d(ije0Var, hje0.f13155a)) {
                    throw b1j.f(698589099, fetVar, false);
                }
                fetVar.e0(698597087);
                O(0, fetVar);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i2, (byte) 10);
        }
    }

    public static final void L(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1410429836);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 48.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i2, (byte) 24);
        }
    }

    public static final void M(mm40 mm40Var, gk00 gk00Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-2111006687);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(gk00Var) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(6.0f, true, new jf4((byte) 14));
            lh80 lh80Var = new lh80(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 32.0f);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new tr20(gk00Var, (byte) 19);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i3 & 14) | 12582912, 362);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uwy(mm40Var, gk00Var, i2, b2);
        }
    }

    public static final void O(int i2, fet fetVar) {
        fetVar.g0(-2004460597);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, xfn.a(fetVar).d, 4.0f, xfn.a(fetVar).d, 0.0f, 8);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new bod0((byte) 26);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarN, null, null, null, null, null, false, null, (Function1) objP, fetVar, 817889280, 382);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k8e0(i2, (byte) 9);
        }
    }

    public static final void Q(mm40 mm40Var, hk00 hk00Var, qdz qdzVar, e2d e2dVar, Function1 function1, fet fetVar, int i2) {
        mtl mtlVar = hk00Var.c;
        fetVar.g0(-1558410064);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(hk00Var) ? 32 : 16) | (fetVar.g(qdzVar) ? 256 : 128) | (fetVar.g(e2dVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            xcz xczVarB = qdzVar.b("ALT_LIVE_RESULTS_SCREEN", new ei20((byte) 26), fetVar, (i3 & 896) | 6);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            WeakHashMap weakHashMap = djv0.w;
            int i4 = zcm0.i(fetVar).c.e().d - zcm0.i(fetVar).e.e().d;
            if (i4 < 0) {
                i4 = 0;
            }
            float fR0 = w6kVar.r0(i4);
            zcl zclVar = qmk.f28987a;
            float fMax = Math.max(0.0f, fR0 - 56.0f);
            mm40 mm40VarV = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (e2dVar != null) {
                fetVar.e0(2002953242);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new j6g0((byte) 17);
                    fetVar.o0(objP);
                }
                mm40VarV = cjx.V(mm40VarV, e2d.b(e2dVar, (Function0) objP), null);
                fetVar.r(false);
            } else {
                fetVar.e0(2003044506);
                fetVar.r(false);
            }
            mm40 mm40VarN = s5x0.N(mm40Var.e(o7k0.c), 0.0f, 0.0f, 0.0f, fMax, 7);
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
            mm40 mm40VarE = mm40VarV.e(ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, true));
            qw3 qw3Var = new qw3(6.0f, true, new jf4((byte) 14));
            ch80 ch80VarF = h97.f(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 32.0f, fetVar);
            boolean z = ((i3 & 112) == 32) | ((57344 & i3) == 16384);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new zwy(hk00Var, function1, (byte) 2);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarE, xczVarB, ch80VarF, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            if (mtlVar != null) {
                fetVar.e0(-1396307657);
                cy2.b(null, mtlVar, function1, fetVar, (i3 >> 6) & 896);
                fetVar.r(false);
            } else {
                fetVar.e0(-1396168312);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lwy(mm40Var, hk00Var, qdzVar, e2dVar, function1, i2, (byte) 2);
        }
    }

    public static final void R(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        l7m0Var2.getClass();
        xczVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(1913147979);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(l7m0Var2) ? 256 : 128) | (fetVar.g(xczVar) ? 2048 : 1024) | (fetVar.g(qdzVar) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536) | (fetVar.i(function2) ? 1048576 : 524288);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            mm40 mm40VarE0 = o2e.e0(vtb.U(o7k0.c, ((Boolean) l7m0Var2.getValue()).booleanValue()), "TEAM_DETAILS_ITEMS_LAZY_COLUMN");
            zcl zclVar = qmk.f28987a;
            b8k0.d(mm40VarE0, xczVar, l7m0Var, null, knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 20.0f, 7), fetVar), false, null, u1c.M(-592136951, new u8o(function1, qdzVar, function2), fetVar), fetVar, ((i3 >> 6) & 112) | 113246208 | ((i3 << 3) & 896), 88);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbp0(mm40Var2, l7m0Var, l7m0Var2, xczVar, qdzVar, function1, function2, i2, (byte) 0);
        }
    }

    public static final void S(mm40 mm40Var, sd5 sd5Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        int i4;
        Object h7k0Var;
        boolean z;
        fet fetVar3;
        sd5Var.getClass();
        fetVar.g0(94961346);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(sd5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) fetVar.k(dy2.b);
            zfn zfnVar = bmd.h;
            w6k w6kVar = (w6k) fetVar.k(zfnVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            Object obj = objP;
            if (objP == cl5Var) {
                ulo uloVarA = new elo(context).a();
                uloVarA.Q(2);
                fetVar.o0(uloVarA);
                obj = uloVarA;
            }
            ExoPlayer exoPlayer = (ExoPlayer) obj;
            exoPlayer.getClass();
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                ulo uloVar = (ulo) exoPlayer;
                uloVar.c0();
                objP2 = androidx.compose.runtime.e.e(uloVar.i0);
                fetVar.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            boolean zG = fetVar.g((qfu0) pz40Var.getValue());
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                if (((qfu0) pz40Var.getValue()).f28655a <= 0 || ((qfu0) pz40Var.getValue()).b <= 0) {
                    i4 = 32;
                    h7k0Var = null;
                } else {
                    float fS0 = w6kVar.s0(((qfu0) pz40Var.getValue()).f28655a * ((qfu0) pz40Var.getValue()).c);
                    float fR0 = w6kVar.r0(((qfu0) pz40Var.getValue()).b);
                    long jFloatToRawIntBits = Float.floatToRawIntBits(fS0);
                    int iFloatToRawIntBits = Float.floatToRawIntBits(fR0);
                    i4 = 32;
                    h7k0Var = new h7k0((((long) iFloatToRawIntBits) & 4294967295L) | (jFloatToRawIntBits << 32));
                }
                fetVar.o0(h7k0Var);
            } else {
                h7k0Var = objP3;
                cl5Var = cl5Var;
                i4 = 32;
            }
            h7k0 h7k0Var2 = (h7k0) h7k0Var;
            boolean zI = ((i3 & 896) == 256) | fetVar.i(exoPlayer);
            Object objP4 = fetVar.P();
            byte b2 = 7;
            if (zI || objP4 == cl5Var) {
                objP4 = new m8s0(exoPlayer, function0, pz40Var, b2);
                fetVar.o0(objP4);
            }
            m0x0.o(exoPlayer, (Function1) objP4, fetVar);
            String str = sd5Var.f32015a;
            int i5 = sd5Var.d;
            boolean z2 = sd5Var.c;
            int i6 = i3 & 112;
            boolean zI2 = (i6 == i4) | fetVar.i(exoPlayer);
            Object objP5 = fetVar.P();
            if (zI2 || objP5 == cl5Var) {
                objP5 = new otp0(sd5Var, exoPlayer, (yje) null, b2);
                fetVar.o0(objP5);
            }
            m0x0.t(fetVar, str, (Function2) objP5);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zI3 = (i6 == 32) | fetVar.i(exoPlayer);
            Object objP6 = fetVar.P();
            if (zI3 || objP6 == cl5Var) {
                objP6 = new rtq0(sd5Var, exoPlayer, null, (byte) 20);
                fetVar.o0(objP6);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP6);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            n0q n0qVar = o7k0.c;
            mm40 mm40VarB = jr8.f16991a.b(n0qVar, zx7Var);
            pge pgeVar = gqw0.A;
            mm40VarB.getClass();
            fetVar.e0(-1705174133);
            w6k w6kVar2 = (w6k) fetVar.k(zfnVar);
            if (h7k0Var2 != null) {
                boolean zG2 = fetVar.g(w6kVar2) | fetVar.g(h7k0Var2);
                Object objP7 = fetVar.P();
                if (zG2 || objP7 == cl5Var) {
                    objP7 = new in80(w6kVar2, h7k0Var2, (byte) 16);
                    fetVar.o0(objP7);
                }
                mm40VarB = mm40VarB.e(knx.Q(jm40.b, (xdr) objP7));
            }
            fetVar.r(false);
            e9x.t(exoPlayer, mm40VarB, 2, fetVar, 384);
            if (z2) {
                fet fetVar4 = fetVar;
                z = true;
                fetVar4.e0(545764922);
                fetVar4.r(false);
                fetVar3 = fetVar4;
            } else {
                fetVar.e0(545410003);
                z = true;
                k7x.b(sd5Var.b, null, n0qVar, new i4d(fbc.d(i5)), new i4d(fbc.d(i5)), null, null, null, null, null, pgeVar, null, fetVar, 37296, 6, 31712);
                fet fetVar5 = fetVar;
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            fetVar3.r(z);
            fetVar2 = fetVar3;
        } else {
            fet fetVar6 = fetVar;
            fetVar6.X();
            fetVar2 = fetVar6;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, sd5Var, function0, i2, (byte) 21);
        }
    }

    public static final void T(cpv0 cpv0Var, String str) {
        nqv0 nqv0VarB;
        WorkDatabase workDatabase = cpv0Var.c;
        workDatabase.getClass();
        upv0 upv0VarY = workDatabase.y();
        g7k g7kVarS = workDatabase.s();
        ArrayList arrayListL = q3d.l(str);
        arrayListL.addAll(vic.x(g7kVarS, str));
        ArrayList<String> arrayList = new ArrayList();
        Iterator it = arrayListL.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            zov0 zov0VarD = upv0VarY.d((String) next);
            if (zov0VarD != null ? !zov0VarD.a() : false) {
                arrayList.add(next);
            }
        }
        upv0 upv0VarY2 = cpv0Var.c.y();
        for (String str2 : arrayList) {
            upv0VarY2.getClass();
            str2.getClass();
            ((Number) kpb.h0(upv0VarY2.f36087a, false, true, new ka6(str2, (byte) 22))).intValue();
        }
        ezb0 ezb0Var = cpv0Var.f;
        ezb0Var.getClass();
        synchronized (ezb0Var.k) {
            wv00.f().a(ezb0.l, "Processor cancelling " + str);
            ezb0Var.i.add(str);
            nqv0VarB = ezb0Var.b(str);
        }
        ezb0.d(str, nqv0VarB, 1);
        Iterator it2 = cpv0Var.e.iterator();
        while (it2.hasNext()) {
            ((j2h0) it2.next()).b(str);
        }
        cpv0Var.b.getClass();
    }

    public static z40 U(int i2) {
        Object next;
        Iterator it = z40.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((z40) next).f43743a == i2) {
                return (z40) next;
            }
        }
        next = null;
        return (z40) next;
    }

    public static final mm40 V(gc6 gc6Var, int i2) {
        zcl zclVar = qmk.f28987a;
        float f2 = i2 == 0 ? 4.0f : 0.0f;
        a4x a4xVar = gc6Var.f;
        wb6 wb6Var = gc6Var.b;
        float f3 = 8.0f;
        if (i2 != q3d.i(a4xVar) && wb6Var != wb6.b) {
            f3 = 2.0f;
        }
        float f4 = f3;
        wb6 wb6Var2 = wb6.f38862a;
        Pair pair = wb6Var == wb6Var2 ? new Pair(new ycl(24.0f), new ycl(42.0f)) : new Pair(new ycl(28.0f), new ycl(28.0f));
        float f5 = ((ycl) pair.f46059a).f42389a;
        float f6 = ((ycl) pair.b).f42389a;
        zcl zclVar2 = wb6Var == wb6Var2 ? qmk.c : qmk.e;
        mm40 mm40VarP = o7k0.p(s5x0.N(jm40.b, f2, 0.0f, f4, 0.0f, 10), f6, f5);
        zcl zclVar3 = qmk.c;
        ugg0 ugg0Var = vgg0.f37379a;
        return i120.Q(i120.Q(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarP), StaticColors.INSTANCE.m73getBlack400d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), kkg.f, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
    }

    public static final u3i W(u1w u1wVar, boolean z, boolean z2) {
        if (!u1wVar.t || (cy7.c() && z2)) {
            return t3i.f33268a;
        }
        return new s3i(z ? r8.f30001a : r8.b);
    }

    public static final u3i X(x1w x1wVar, boolean z, boolean z2) {
        x1wVar.getClass();
        if (!x1wVar.s || (cy7.c() && z2)) {
            return t3i.f33268a;
        }
        return new s3i(z ? r8.f30001a : r8.b);
    }

    public static final u3i Z(y1w y1wVar, boolean z, boolean z2) {
        y1wVar.getClass();
        if (!y1wVar.q || (cy7.c() && z2)) {
            return t3i.f33268a;
        }
        return new s3i(z ? r8.f30001a : r8.b);
    }

    public static final void a(int i2, fet fetVar, xcz xczVar, l7m0 l7m0Var, Function1 function1) {
        fetVar.g0(-258974576);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.g(xczVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "ACTIVE_TEAMS_LAZY_COLUMN");
            boolean z = !((nn) l7m0Var.getValue()).e;
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(f2, 8.0f, f3, 36.0f, fetVar);
            qw3 qw3Var = new qw3(6.0f, true, new jf4((byte) 14));
            Object[] objArr = new Object[0];
            boolean z2 = (i3 & 14) == 4;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new jb(l7m0Var, (byte) 3);
                fetVar.o0(objP);
            }
            b8k0.d(mm40VarE0, xczVar, v3c.Y(objArr, (Function0) objP, fetVar), qw3Var, ch80VarF, z, null, u1c.M(-364286702, new gn(function1, b2), fetVar), fetVar, (i3 & 112) | 100663302, 136);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(l7m0Var, xczVar, function1, i2, (byte) 10);
        }
    }

    public static final u3i a0(c2w c2wVar, boolean z, boolean z2) {
        c2wVar.getClass();
        if (!c2wVar.t || (cy7.c() && z2)) {
            return t3i.f33268a;
        }
        return new s3i(z ? r8.f30001a : r8.b);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0168  */
    /* JADX WARN: Code duplicated, block: B:53:0x016a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0187  */
    /* JADX WARN: Code duplicated, block: B:60:0x0195  */
    /* JADX WARN: Code duplicated, block: B:61:0x0197  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01db  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:76:0x0201  */
    /* JADX WARN: Code duplicated, block: B:78:0x020b  */
    /* JADX WARN: Code duplicated, block: B:79:0x020d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0216  */
    /* JADX WARN: Code duplicated, block: B:86:0x022e  */
    public static final void b(l7m0 l7m0Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        Object obj;
        boolean z;
        boolean zI;
        Object objP;
        boolean z2;
        Object objP2;
        Object obj2;
        boolean z3;
        Object objP3;
        boolean zI2;
        Object objP4;
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar.g0(-1766903670);
        byte b2 = 2;
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b3 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
            Object objP5 = fetVar.P();
            Object obj3 = ukd.f35823a;
            if (objP5 == obj3) {
                objP5 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP5);
            }
            vne vneVar = (vne) objP5;
            xcz xczVarB = qdzVar.b("ACTIVE_TEAMS_KEY", new hhd((byte) 24), fetVar, ((i3 << 3) & 896) | 6);
            Boolean boolValueOf = Boolean.valueOf(xczVarB.j.a());
            boolean zG = fetVar.g(xczVarB) | fetVar.g(pkk0Var);
            Object objP6 = fetVar.P();
            yje yjeVar = null;
            if (zG || objP6 == obj3) {
                objP6 = new hn(xczVarB, pkk0Var, yjeVar, b3);
                fetVar.o0(objP6);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP6);
            pz40 pz40VarF = androidx.compose.runtime.e.f(((nn) l7m0Var.getValue()).d, fetVar);
            Object[] objArr = new Object[0];
            int i4 = i3 & 14;
            boolean z4 = i4 == 4;
            Object objP7 = fetVar.P();
            if (z4 || objP7 == obj3) {
                objP7 = new jb(l7m0Var, b2);
                fetVar.o0(objP7);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP7, fetVar);
            mm40 mm40VarQ = i120.Q(yyw.X(o7k0.c, null, fetVar, 1), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            imm immVar = ((nn) l7m0Var.getValue()).f23796a;
            int i5 = i3 & 896;
            boolean z5 = i5 == 256;
            Object objP8 = fetVar.P();
            if (z5) {
                obj = obj3;
            } else {
                obj = obj3;
                if (objP8 == obj) {
                }
                Function0 function0 = (Function0) objP8;
                if (i5 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                zI = z | fetVar.i(vneVar) | fetVar.g(pz40VarF) | fetVar.g(xczVarB);
                objP = fetVar.P();
                if (zI || objP == obj) {
                    objP = new en(function1, vneVar, pz40VarF, xczVarB);
                    fetVar.o0(objP);
                }
                Function1 function2 = (Function1) objP;
                if (i5 == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP2 = fetVar.P();
                if (z2 || objP2 == obj) {
                    objP2 = new dn(function1, (byte) 1);
                    fetVar.o0(objP2);
                }
                Object obj4 = obj;
                ohq0.a(mm40VarD, immVar, function0, function2, (Function0) objP2, fetVar, 6);
                obj2 = (vm) l7m0VarY.getValue();
                if (obj2 instanceof um) {
                    fetVar.e0(237266822);
                    Object[] objArr2 = new Object[0];
                    zI2 = fetVar.i(obj2);
                    objP4 = fetVar.P();
                    if (zI2 || objP4 == obj4) {
                        objP4 = new nc(obj2, (byte) 4);
                        fetVar.o0(objP4);
                    }
                    r(v3c.Y(objArr2, (Function0) objP4, fetVar), function1, fetVar, (i3 >> 3) & 112);
                    fetVar.r(false);
                } else {
                    if (Intrinsics.d(obj2, tm.f34171a)) {
                        throw b1j.f(-407990581, fetVar, false);
                    }
                    fetVar.e0(237506855);
                    if (i5 == 256) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objP3 = fetVar.P();
                    if (z3 || objP3 == obj4) {
                        objP3 = new y7(function1, (byte) 11);
                        fetVar.o0(objP3);
                    }
                    a(i4, fetVar, xczVarB, l7m0Var, (Function1) objP3);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            objP8 = new dn(function1, (byte) 0);
            fetVar.o0(objP8);
            Function0 function3 = (Function0) objP8;
            if (i5 == 256) {
                z = true;
            } else {
                z = false;
            }
            zI = z | fetVar.i(vneVar) | fetVar.g(pz40VarF) | fetVar.g(xczVarB);
            objP = fetVar.P();
            if (zI) {
                objP = new en(function1, vneVar, pz40VarF, xczVarB);
                fetVar.o0(objP);
            } else {
                objP = new en(function1, vneVar, pz40VarF, xczVarB);
                fetVar.o0(objP);
            }
            Function1 function4 = (Function1) objP;
            if (i5 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP2 = fetVar.P();
            if (z2) {
                objP2 = new dn(function1, (byte) 1);
                fetVar.o0(objP2);
            } else {
                objP2 = new dn(function1, (byte) 1);
                fetVar.o0(objP2);
            }
            Object obj5 = obj;
            ohq0.a(mm40VarD, immVar, function3, function4, (Function0) objP2, fetVar, 6);
            obj2 = (vm) l7m0VarY.getValue();
            if (obj2 instanceof um) {
                fetVar.e0(237266822);
                Object[] objArr3 = new Object[0];
                zI2 = fetVar.i(obj2);
                objP4 = fetVar.P();
                if (zI2) {
                    objP4 = new nc(obj2, (byte) 4);
                    fetVar.o0(objP4);
                } else {
                    objP4 = new nc(obj2, (byte) 4);
                    fetVar.o0(objP4);
                }
                r(v3c.Y(objArr3, (Function0) objP4, fetVar), function1, fetVar, (i3 >> 3) & 112);
                fetVar.r(false);
            } else {
                if (Intrinsics.d(obj2, tm.f34171a)) {
                    throw b1j.f(-407990581, fetVar, false);
                }
                fetVar.e0(237506855);
                if (i5 == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP3 = fetVar.P();
                if (z3) {
                    objP3 = new y7(function1, (byte) 11);
                    fetVar.o0(objP3);
                } else {
                    objP3 = new y7(function1, (byte) 11);
                    fetVar.o0(objP3);
                }
                a(i4, fetVar, xczVarB, l7m0Var, (Function1) objP3);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn(l7m0Var, qdzVar, function1, i2, (byte) 0);
        }
    }

    public static final BlendMode b0(int i2) {
        if (i2 == 0) {
            return BlendMode.CLEAR;
        }
        if (i2 == 1) {
            return BlendMode.SRC;
        }
        if (i2 == 2) {
            return BlendMode.DST;
        }
        if (i2 == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i2 == 4) {
            return BlendMode.DST_OVER;
        }
        if (i2 == 5) {
            return BlendMode.SRC_IN;
        }
        if (i2 == 6) {
            return BlendMode.DST_IN;
        }
        if (i2 == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i2 == 8) {
            return BlendMode.DST_OUT;
        }
        if (i2 == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i2 == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i2 == 11) {
            return BlendMode.XOR;
        }
        if (i2 == 12) {
            return BlendMode.PLUS;
        }
        if (i2 == 13) {
            return BlendMode.MODULATE;
        }
        if (i2 == 14) {
            return BlendMode.SCREEN;
        }
        if (i2 == 15) {
            return BlendMode.OVERLAY;
        }
        if (i2 == 16) {
            return BlendMode.DARKEN;
        }
        if (i2 == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i2 == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i2 == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i2 == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i2 == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i2 == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i2 == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i2 == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i2 == 25) {
            return BlendMode.HUE;
        }
        if (i2 == 26) {
            return BlendMode.SATURATION;
        }
        if (i2 == 27) {
            return BlendMode.COLOR;
        }
        return i2 == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    public static final m97 c0(mbs0 mbs0Var) {
        long j2 = mbs0Var.f21523a;
        byte b2 = mbs0Var.b.f36034a;
        izc izcVar = mbs0Var.c;
        boolean z = mbs0Var.d;
        boolean z2 = mbs0Var.e;
        long j3 = mbs0Var.f;
        String str = mbs0Var.g;
        long j4 = mbs0Var.h;
        long j5 = mbs0Var.i;
        Double dI = kotlin.text.b.i(mbs0Var.j);
        return new m97(j2, (int) b2, izcVar, z, z2, j3, str, j4, j5, dI != null ? dI.doubleValue() : 0.0d, mbs0Var.k, mbs0Var.l, mbs0Var.m, mbs0Var.n, mbs0Var.o, mbs0Var.p, false, false, mbs0Var.s, mbs0Var.t, false, (zfa0) null, false, 0.0d, (String) null, 66256896);
    }

    public static final void d(String str, czr0 czr0Var, fet fetVar, int i2) {
        long background;
        long secondary;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-1024358050);
        int i3 = i2 | (fetVar2.g(str) ? 4 : 2) | (fetVar2.e(czr0Var.ordinal()) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarT = o7k0.t(jm40Var, 20.0f, 108.0f);
            int iOrdinal = czr0Var.ordinal();
            if (iOrdinal == 0) {
                fetVar2.e0(-860562360);
                background = afn0.m(fetVar2).getBackground();
                fetVar2.r(false);
            } else if (iOrdinal == 1) {
                background = cs0.e(fetVar2, -860559579, fetVar2, false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(-860565268, fetVar2, false);
                }
                background = cs0.D(fetVar2, -860556637, fetVar2, false);
            }
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(lgb.J(i120.Q(mm40VarT, background, ugg0Var), ugg0Var), 8.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            mm40 mm40VarU = o7k0.u(jm40Var, 20.0f, 0.0f, 2);
            afn0.v(fetVar2).getClass();
            y9q0 y9q0VarI = g1t0.i();
            int iOrdinal2 = czr0Var.ordinal();
            if (iOrdinal2 == 0) {
                fetVar2.e0(-911192063);
                secondary = afn0.m(fetVar2).getSecondary();
                fetVar2.r(false);
            } else {
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw b1j.f(-911194903, fetVar2, false);
                }
                fetVar2.e0(-911188035);
                secondary = afn0.p(fetVar2).m123getWhite0d7_KjU();
                fetVar2.r(false);
            }
            v8q0.a(str, mm40VarU, secondary, new n05(qmk.q, qmk.s, idm0.s(0.25d)), 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0VarI, fetVar, i3 & 14, 24576, 113648);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sr1(str, czr0Var, i2, (byte) 0);
        }
    }

    public static final PorterDuff.Mode d0(int i2) {
        if (i2 == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i2 == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i2 == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i2 == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i2 == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i2 == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i2 == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i2 == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i2 == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i2 == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i2 == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i2 == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i2 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static final void e(final qz3 qz3Var, final String str, final mm40 mm40Var, final Function1 function1, final Function1 function2, final u12 u12Var, final qge qgeVar, final a4d a4dVar, final boolean z, fet fetVar, final int i2, final int i3) {
        int i4;
        Function1 function3;
        Function1 function4;
        u12 u12Var2;
        boolean z2;
        int i5;
        fetVar.g0(1236588022);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.g(qz3Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function3 = function1;
            i4 |= fetVar.i(function3) ? 2048 : 1024;
        } else {
            function3 = function1;
        }
        if ((i2 & 24576) == 0) {
            function4 = function2;
            i4 |= fetVar.i(function4) ? 16384 : 8192;
        } else {
            function4 = function2;
        }
        if ((196608 & i2) == 0) {
            u12Var2 = u12Var;
            i4 |= fetVar.g(u12Var2) ? 131072 : 65536;
        } else {
            u12Var2 = u12Var;
        }
        if ((1572864 & i2) == 0) {
            i4 |= fetVar.g(qgeVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i4 |= fetVar.d(1.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= fetVar.g(a4dVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i4 |= fetVar.e(1) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            z2 = z;
            i5 = i3 | (fetVar.h(z2) ? 4 : 2);
        } else {
            z2 = z;
            i5 = i3;
        }
        if (fetVar.U(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            o1x o1xVarD = iut0.d(qz3Var.f29561a, qgeVar, fetVar, (i4 >> 15) & 112);
            iut0.g(o1xVarD);
            mm40 mm40VarE = mm40Var.e(new nge(o1xVarD, qz3Var.c, qz3Var.b, function3, function4, u12Var2, qgeVar, a4dVar, z2, iut0.a(fetVar), str));
            mu90 mu90Var = mu90.q;
            int iHashCode = Long.hashCode(fetVar.T);
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            bh90 bh90VarM = fetVar.m();
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, mu90Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.az3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dj8.e(qz3Var, str, mm40Var, function1, function2, u12Var, qgeVar, a4dVar, z, (fet) obj, x8x.L(i2 | 1), x8x.L(i3));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void f(int i2, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(1744752523);
        int i3 = i2 | 6 | (fetVar2.g(str) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_move_horizontal_small, 6, fetVar2), fetVar2), null, i120.Q(o7k0.n(jm40Var, 14.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getPrimary(), vgg0.f37379a), ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar2, 56, 0);
            qrq qrqVar = j1t0.c;
            long j2 = qmk.q;
            str2 = str;
            v8q0.a(str2, null, 0L, new n05(qmk.p, j2, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.t(new y9q0(0L, j2, null, qrqVar, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar, 0, 24960, 110582);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var2, str2, i2, (byte) 3);
        }
    }

    public static final void g(gc6 gc6Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        gc6Var.getClass();
        function0.getClass();
        fetVar2.g0(-1093034208);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(gc6Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.i(function0) ? 32 : 16;
        }
        int i4 = i3;
        byte b3 = 1;
        if (fetVar2.U(i4 & 1, (i4 & 19) != 18)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = dw9.j(fetVar2);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarD, (gy40) objP2, null, false, null, function0, 28), "BEST_HERO_PLAYER");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            int i5 = i4 & 14;
            I(gc6Var, fetVar2, i5);
            H(gc6Var, fetVar2, i5);
            String str = gc6Var.d;
            x7z x7zVar = new x7z(1.0f, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE1 = o2e.e0(s5x0.N(x7zVar, 0.0f, 0.0f, 4.0f, 0.0f, 11), "PLAYER_NICK");
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new ca6(pz40Var, b3);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarA = pai0.a(mm40VarE1, false, (Function1) objP3);
            long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = new ca6(pz40Var, b2);
                fetVar2.o0(objP4);
            }
            v8q0.a(str, mm40VarA, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, (Function1) objP4, y9q0Var, fetVar, 0, 1597824, 45048);
            fetVar2 = fetVar;
            w(gc6Var, fetVar2, i5);
            pm80 pm80VarF = a8k0.F(gc6Var.i, 0, fetVar2);
            mm40 mm40VarN = o7k0.n(jm40Var, 36.0f);
            long j2 = kkg.f;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = o2e.e0(i120.Q(mm40VarN, j2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "ARROW_BUTTON");
            boolean z = i5 == 4;
            Object objP5 = fetVar2.P();
            if (z || objP5 == cl5Var) {
                objP5 = new os5(gc6Var, (byte) 5);
                fetVar2.o0(objP5);
            }
            j0x.b(pm80VarF, null, pai0.a(mm40VarE2, false, (Function1) objP5), null, gqw0.f1, 0.0f, null, fetVar2, 24632, 104);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) gc6Var, function0, i2, (byte) 22);
        }
    }

    public static final void h(mm40 mm40Var, cb8 cb8Var, m2o m2oVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-339381986);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(cb8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(m2oVar) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1458595294, new ry2((Object) mm40Var, (Object) m2oVar, (Object) cb8Var, (byte) 28), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((Object) mm40Var, (Object) cb8Var, (Object) m2oVar, i2, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0177 A[EDGE_INSN: B:102:0x0177->B:103:0x0179 BREAK  A[LOOP:0: B:97:0x0162->B:128:?]] */
    public static final void i(final int i2, final int i3, final rab rabVar, final String str, final String str2, final cb8 cb8Var, final boolean z, fet fetVar, final int i4) {
        int i5;
        String str3;
        String str4;
        boolean z2;
        pz40 pz40Var = cb8Var.f4049a;
        fetVar.g0(-1683998530);
        if ((i4 & 6) == 0) {
            i5 = (fetVar.e(i2) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= fetVar.e(i3) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= fetVar.e(rabVar.ordinal()) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= fetVar.g(str) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= fetVar.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i5 |= fetVar.g(cb8Var) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= fetVar.h(z) ? 1048576 : 524288;
        }
        int i6 = i5;
        if (fetVar.U(i6 & 1, (599187 & i6) != 599186)) {
            int iOrdinal = rabVar.ordinal();
            if (iOrdinal == 0) {
                str3 = str;
            } else if (iOrdinal == 1) {
                str3 = str2;
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return;
                }
                str3 = "";
            }
            int iOrdinal2 = rabVar.ordinal();
            if (iOrdinal2 == 0) {
                str4 = "TIC_TAC_TOE_FIELD_CELL_CROSS";
            } else if (iOrdinal2 == 1) {
                str4 = "TIC_TAC_TOE_FIELD_CELL_NOUGHT";
            } else {
                if (iOrdinal2 != 2) {
                    t9f.b();
                    return;
                }
                str4 = null;
            }
            String str5 = str4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                Pair pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
                fetVar.o0(pair);
                objP = pair;
            }
            Pair pair2 = (Pair) objP;
            long j2 = (z && cb8Var.a()) ? ((long) ((i2 * 3) + i3)) * 300 : 0L;
            mm40 mm40VarE0 = o2e.e0(jm40.b, "TIC_TAC_TOE_GAME_FIELD_CELL_" + i2 + i3);
            cgk0 cgk0Var = cb8Var.b;
            pair2.getClass();
            zbk zbkVar = cb8Var.i;
            if (!((Collection) zbkVar.getValue()).isEmpty() && cgk0Var.l() < ((List) zbkVar.getValue()).size()) {
                Iterable iterable = (Iterable) ((List) zbkVar.getValue()).get(cgk0Var.l());
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z2 = false;
                            break;
                        } else if (Intrinsics.d((Pair) it.next(), pair2)) {
                            z2 = true;
                            break;
                        }
                    }
                } else {
                    z2 = false;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
            boolean zContains = ((Set) cb8Var.j.getValue()).contains(pair2);
            k73 k73Var = (k73) ((hgk0) pz40Var).getValue();
            boolean zBooleanValue = ((Boolean) ((hgk0) cb8Var.c).getValue()).booleanValue();
            boolean z3 = ((k73) ((hgk0) pz40Var).getValue()) != k73.b;
            boolean z4 = z && cb8Var.a();
            boolean zBooleanValue2 = ((Boolean) ((hgk0) cb8Var.f).getValue()).booleanValue();
            boolean z5 = (458752 & i6) == 131072;
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new pw4(0, cb8Var, cb8.class, "onCellShowUp", "onCellShowUp()V", 0, (byte) 9);
                fetVar.o0(objP2);
            }
            s5x0.m(mm40VarE0, str3, str5, j2, z2, zContains, k73Var, zBooleanValue, z3, z4, zBooleanValue2, z, (Function0) ((jhy) objP2), fetVar, 0, (i6 >> 15) & 112);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.hb8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dj8.i(i2, i3, rabVar, str, str2, cb8Var, z, (fet) obj, x8x.L(i4 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void j(mm40 mm40Var, ugd ugdVar, fet fetVar, int i2) {
        fetVar.g0(290615768);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(ffb0.Q(jm40Var, 4.0f, 4.0f), 192.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM62getBlack0d7_KjU = staticColors.m62getBlack0d7_KjU();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, i120.S(mm40VarN, 8.0f, jM62getBlack0d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            mm40 mm40VarS = i120.S(i120.Q(o2e.e0(o7k0.n(jm40Var, 192.0f), "TIC_TAC_TOE_GAME_FIELD"), kkg.F, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f, staticColors.m62getBlack0d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            ugdVar.invoke(fetVar, 6);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fb8(mm40Var, ugdVar, i2, b2);
        }
    }

    public static final void k(String str, String str2, cb8 cb8Var, boolean z, fet fetVar, int i2) {
        cb8 cb8Var2 = cb8Var;
        boolean z2 = z;
        fetVar.g0(-759370198);
        String str3 = str;
        String str4 = str2;
        int i3 = i2 | (fetVar.g(str3) ? 4 : 2) | (fetVar.g(str4) ? 32 : 16) | (fetVar.g(cb8Var2) ? 256 : 128) | (fetVar.h(z2) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                IntRange intRangeO = l1e0.o(0, 3);
                int iA = wp20.a(r3d.q(intRangeO, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
                Iterator it = intRangeO.iterator();
                while (((kkx) it).c) {
                    Object next = ((bkx) it).next();
                    ((Number) next).intValue();
                    ArrayList arrayList = new ArrayList(3);
                    for (int i4 = 0; i4 < 3; i4++) {
                        arrayList.add(rab.c);
                    }
                    linkedHashMap.put(next, arrayList);
                }
                fetVar.o0(linkedHashMap);
                objP = linkedHashMap;
            }
            Map map = (Map) objP;
            pz40 pz40Var = cb8Var2.e;
            if (z2) {
                Map map2 = (Map) ((hgk0) pz40Var).getValue();
                if (!map2.isEmpty()) {
                    map = map2;
                }
            } else {
                map = (Map) ((hgk0) pz40Var).getValue();
            }
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
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
            fetVar.e0(1214475884);
            for (Map.Entry entry : CollectionsKt.A0(map.entrySet(), new vt5((byte) 6))) {
                l(((Number) entry.getKey()).intValue(), (List) entry.getValue(), str3, str4, cb8Var2, z2, fetVar, (i3 << 6) & 524160);
                str3 = str;
                str4 = str2;
                cb8Var2 = cb8Var;
                z2 = z;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0((byte) 9, i2, (Object) str, (Object) str2, (Object) cb8Var, z);
        }
    }

    public static final void l(int i2, List list, String str, String str2, cb8 cb8Var, boolean z, fet fetVar, int i3) {
        int i4;
        int i5;
        fetVar.g0(979411531);
        if ((i3 & 6) == 0) {
            i4 = i2;
            i5 = (fetVar.e(i4) ? 4 : 2) | i3;
        } else {
            i4 = i2;
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= (i3 & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        String str3 = str;
        if ((i3 & 384) == 0) {
            i5 |= fetVar.g(str3) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= fetVar.g(str2) ? 2048 : 1024;
        }
        cb8 cb8Var2 = cb8Var;
        if ((i3 & 24576) == 0) {
            i5 |= fetVar.g(cb8Var2) ? 16384 : 8192;
        }
        boolean z2 = z;
        if ((196608 & i3) == 0) {
            i5 |= fetVar.h(z2) ? 131072 : 65536;
        }
        int i6 = i5;
        if (fetVar.U(i6 & 1, (74899 & i6) != 74898)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
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
            Iterator itV = kng0.v(fetVar, mm40VarC0, gqw0.v, -1934477161, list);
            int i7 = 0;
            while (itV.hasNext()) {
                Object next = itV.next();
                int i8 = i7 + 1;
                if (i7 < 0) {
                    q3d.p();
                    throw null;
                }
                int i9 = i6 << 3;
                i(i4, i7, (rab) next, str3, str2, cb8Var2, z2, fetVar, (i6 & 14) | (i9 & 7168) | (57344 & i9) | (458752 & i9) | (i9 & 3670016));
                i4 = i2;
                str3 = str;
                cb8Var2 = cb8Var;
                z2 = z;
                i7 = i8;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gb8(i2, list, str, str2, cb8Var, z, i3);
        }
    }

    public static final void m(mm40 mm40Var, efu0 efu0Var, boolean z, Function0 function0, Function0 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        dfu0 dfu0Var;
        pz40 pz40Var;
        dfu0 dfu0Var2;
        pz40 pz40Var2;
        ExoPlayer exoPlayer;
        String str;
        Object obj;
        Object jv0Var;
        int i4;
        boolean z2;
        dfu0 dfu0Var3;
        Object ah0Var;
        pz40 pz40Var3;
        mm40 mm40VarZ;
        fet fetVar3;
        efu0 efu0Var2 = efu0Var;
        fet fetVar4 = fetVar;
        function0.getClass();
        function1.getClass();
        fetVar4.g0(1429345398);
        if ((i2 & 6) == 0) {
            i3 = (fetVar4.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar4.g(efu0Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar4.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar4.i(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar4.i(function1) ? 16384 : 8192;
        }
        int i5 = 0;
        boolean z3 = false;
        if (fetVar4.U(i3 & 1, (i3 & 9363) != 9362)) {
            Object objP = fetVar4.P();
            yje yjeVar = null;
            cl5 cl5Var = ukd.f35823a;
            Object obj2 = objP;
            if (objP == cl5Var) {
                pz40 pz40VarE = androidx.compose.runtime.e.e(null);
                fetVar4.o0(pz40VarE);
                obj2 = pz40VarE;
            }
            pz40 pz40Var4 = (pz40) obj2;
            Object objP2 = fetVar4.P();
            Object obj3 = objP2;
            if (objP2 == cl5Var) {
                cgk0 cgk0VarB = androidx.compose.runtime.e.b(1);
                fetVar4.o0(cgk0VarB);
                obj3 = cgk0VarB;
            }
            cgk0 cgk0Var = (cgk0) obj3;
            Object objP3 = fetVar4.P();
            Object obj4 = objP3;
            if (objP3 == cl5Var) {
                pz40 pz40VarE2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar4.o0(pz40VarE2);
                obj4 = pz40VarE2;
            }
            pz40 pz40Var5 = (pz40) obj4;
            Context context = (Context) fetVar4.k(dy2.b);
            Object objP4 = fetVar4.P();
            Object obj5 = objP4;
            if (objP4 == cl5Var) {
                context.getClass();
                gwj gwjVar = new gwj(new hsj(context), new huj());
                gwjVar.g(new xx50(i5, z3 ? 1 : 0));
                ulo uloVarA = new elo(context, gwjVar).a();
                nyj nyjVar = (nyj) uloVarA.v();
                nyjVar.getClass();
                myj myjVar = new myj(nyjVar);
                myjVar.v = true;
                uloVarA.R(new nyj(myjVar));
                fetVar4.o0(uloVarA);
                obj5 = uloVarA;
            }
            ExoPlayer exoPlayer2 = (ExoPlayer) obj5;
            exoPlayer2.getClass();
            boolean zI = fetVar4.i(exoPlayer2);
            Object objP5 = fetVar4.P();
            byte b2 = 18;
            Object obj6 = objP5;
            if (zI || objP5 == cl5Var) {
                d38 d38Var = new d38(exoPlayer2, b2);
                fetVar4.o0(d38Var);
                obj6 = d38Var;
            }
            m0x0.o(exoPlayer2, (Function1) obj6, fetVar4);
            Object objP6 = fetVar4.P();
            Object obj7 = objP6;
            if (objP6 == cl5Var) {
                dfu0 dfu0Var4 = new dfu0();
                fetVar4.o0(dfu0Var4);
                obj7 = dfu0Var4;
            }
            dfu0 dfu0Var5 = (dfu0) obj7;
            boolean z4 = efu0Var2 != null && efu0Var2.d;
            pz40 pz40VarF = androidx.compose.runtime.e.f(function0, fetVar4);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(function1, fetVar);
            boolean zI2 = fetVar4.i(dfu0Var5) | fetVar4.g(pz40VarF2) | fetVar4.i(exoPlayer2);
            Object objP7 = fetVar4.P();
            if (zI2 || objP7 == cl5Var) {
                objP7 = new dg(exoPlayer2, cgk0Var, dfu0Var5, pz40Var4, pz40VarF2, (byte) 5);
                fetVar4.o0(objP7);
            }
            m0x0.o(exoPlayer2, (Function1) objP7, fetVar4);
            Integer numValueOf = Integer.valueOf(cgk0Var.l());
            boolean zI3 = fetVar4.i(dfu0Var5) | fetVar4.g(pz40VarF);
            Object objP8 = fetVar4.P();
            if (zI3 || objP8 == cl5Var) {
                objP8 = new jv0(dfu0Var5, cgk0Var, pz40Var4, pz40Var5, pz40VarF, null, (byte) 5);
                dfu0Var = dfu0Var5;
                pz40Var = pz40Var5;
                pz40Var4 = pz40Var4;
                fetVar4.o0(objP8);
            } else {
                dfu0Var = dfu0Var5;
                pz40Var = pz40Var5;
            }
            m0x0.t(fetVar4, numValueOf, (Function2) objP8);
            ay90 ay90Var = (ay90) pz40Var4.getValue();
            boolean zI4 = fetVar4.i(dfu0Var) | fetVar4.i(exoPlayer2);
            Object objP9 = fetVar4.P();
            if (zI4 || objP9 == cl5Var) {
                dfu0 dfu0Var6 = dfu0Var;
                pz40 pz40Var6 = pz40Var4;
                dfu0Var2 = dfu0Var6;
                objP9 = new ic1((Object) dfu0Var6, (Object) pz40Var6, (Object) exoPlayer2, yjeVar, (byte) 10);
                pz40Var2 = pz40Var6;
                exoPlayer = exoPlayer2;
                fetVar4.o0(objP9);
            } else {
                dfu0Var2 = dfu0Var;
                exoPlayer = exoPlayer2;
                pz40Var2 = pz40Var4;
            }
            m0x0.t(fetVar4, ay90Var, (Function2) objP9);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI5 = ((i3 & 896) == 256) | fetVar4.i(dfu0Var2);
            Object objP10 = fetVar4.P();
            if (zI5 || objP10 == cl5Var) {
                str = null;
                d09 d09Var = new d09(z, dfu0Var2, pz40Var2, (yje) null);
                fetVar4.o0(d09Var);
                obj = d09Var;
            } else {
                str = null;
                obj = objP10;
            }
            m0x0.t(fetVar4, boolValueOf, (Function2) obj);
            String str2 = efu0Var2 != null ? efu0Var2.f7734a : str;
            int i6 = i3 & 112;
            ExoPlayer exoPlayer3 = exoPlayer;
            boolean zI6 = (i6 == 32) | fetVar4.i(exoPlayer3) | fetVar4.g(pz40VarF2);
            Object objP11 = fetVar4.P();
            if (zI6 || objP11 == cl5Var) {
                i4 = i6;
                z2 = z4;
                dfu0Var3 = dfu0Var2;
                jv0Var = new jv0(efu0Var2, pz40Var, exoPlayer3, pz40VarF2, null, (byte) 6);
                exoPlayer3 = exoPlayer3;
                fetVar4.o0(jv0Var);
            } else {
                i4 = i6;
                dfu0Var3 = dfu0Var2;
                jv0Var = objP11;
                z2 = z4;
            }
            m0x0.t(fetVar4, str2, (Function2) jv0Var);
            boolean zI7 = fetVar4.i(exoPlayer3) | (i4 == 32) | fetVar4.i(dfu0Var3);
            Object objP12 = fetVar4.P();
            if (zI7 || objP12 == cl5Var) {
                efu0Var2 = efu0Var;
                pz40 pz40Var7 = pz40Var2;
                ah0Var = new ah0((Object) efu0Var2, (Object) exoPlayer3, (Object) dfu0Var3, (Object) pz40Var7, (yje) null, (byte) 6);
                pz40Var3 = pz40Var7;
                fetVar4.o0(ah0Var);
            } else {
                ah0Var = objP12;
                pz40Var3 = pz40Var2;
                efu0Var2 = efu0Var;
            }
            m0x0.t(fetVar4, efu0Var2, (Function2) ah0Var);
            Object objP13 = fetVar4.P();
            Object obj8 = objP13;
            if (objP13 == cl5Var) {
                agk0 agk0VarA = androidx.compose.runtime.e.a(0.0f);
                fetVar4.o0(agk0VarA);
                obj8 = agk0VarA;
            }
            agk0 agk0Var = (agk0) obj8;
            boolean zI8 = fetVar4.i(exoPlayer3);
            Object objP14 = fetVar4.P();
            Object obj9 = objP14;
            if (zI8 || objP14 == cl5Var) {
                op7 op7Var = new op7(exoPlayer3, agk0Var, (byte) 18);
                fetVar4.o0(op7Var);
                obj9 = op7Var;
            }
            m0x0.o(exoPlayer3, (Function1) obj9, fetVar4);
            float fL = agk0Var.l();
            boolean zD = fetVar4.d(fL) | fetVar4.h(z2);
            Object objP15 = fetVar4.P();
            jm40 jm40Var = jm40.b;
            Object obj10 = objP15;
            if (zD || objP15 == cl5Var) {
                boolean z5 = fL > 0.0f;
                if (!z5) {
                    fL = 1.7777778f;
                }
                mm40 mm40VarO = ny9.O(fL, jm40Var, false);
                if (z2) {
                    zcl zclVar = qmk.f28987a;
                    mm40VarZ = jd8.Z(10.0f, 10.0f);
                } else {
                    mm40VarZ = jm40Var;
                }
                mm40 mm40VarN = epv0.N(mm40VarO.e(mm40VarZ), z5 ? 1.0f : 0.0f);
                fetVar4.o0(mm40VarN);
                obj10 = mm40VarN;
            }
            mm40 mm40Var2 = (mm40) obj10;
            boolean zH = fetVar4.h(z2);
            Object objP16 = fetVar4.P();
            Object obj11 = objP16;
            if (zH || objP16 == cl5Var) {
                Integer numValueOf2 = Integer.valueOf((z2 || Build.VERSION.SDK_INT < 28) ? 2 : 1);
                fetVar4.o0(numValueOf2);
                obj11 = numValueOf2;
            }
            int iIntValue = ((Number) obj11).intValue();
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40Var);
            mkd.c0.getClass();
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(e7z.u1);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, tj30VarC, gqw0.x);
            jpm0.o(fetVar4, bh90VarM, gqw0.w);
            jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar4);
            jpm0.o(fetVar4, mm40VarC0, gqw0.v);
            e9x.t(exoPlayer3, mm40Var2, iIntValue, fetVar4, 0);
            if (((ay90) pz40Var3.getValue()) != null || (((Boolean) pz40Var.getValue()).booleanValue() && cgk0Var.l() == 2)) {
                fetVar4.e0(537310483);
                p3c0.a(o7k0.n(jm40Var, 48.0f), y3d.c, 0.0f, 0L, 0, 0.0f, fetVar4, 54, 60);
                fet fetVar5 = fetVar4;
                fetVar5.r(false);
                fetVar3 = fetVar5;
            } else {
                fetVar4.e0(537482502);
                fetVar4.r(false);
                fetVar3 = fetVar4;
            }
            fetVar3.r(true);
            fetVar2 = fetVar3;
        } else {
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) mm40Var, (Object) efu0Var2, z, (Object) function0, (Object) function1, i2, (byte) 3);
        }
    }

    public static final void n(int i2, int i3, fet fetVar, mm40 mm40Var, List list) {
        int i4;
        mm40 mm40Var2;
        Object objJ;
        Object objJ2;
        fetVar.g0(-1190317351);
        if ((i3 & 6) == 0) {
            i4 = i3 | ((i3 & 8) == 0 ? fetVar.g(list) : fetVar.i(list) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar.e(i2) ? 32 : 16;
        }
        int i5 = i4 | 384;
        if (fetVar.U(i5 & 1, (i5 & 147) != 146)) {
            byte b2 = 14;
            oms0 oms0VarZ = phu0.Z(Integer.valueOf(i2), null, fetVar, (i5 >> 3) & 14, 2);
            p4 p4Var = oms0VarZ.f25519a;
            lxs0 lxs0Var = hp4.l;
            boolean zH = oms0VarZ.h();
            Object obj = ukd.f35823a;
            if (zH) {
                objJ = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG = fetVar.g(oms0VarZ);
                objJ = fetVar.P();
                if (zG || objJ == obj) {
                    rfk0 rfk0VarJ = vdx.J();
                    Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                    rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                    try {
                        Object objY0 = p4Var.y0();
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        fetVar.o0(objY0);
                        objJ = objY0;
                    } catch (Throwable th) {
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        throw th;
                    }
                }
                fetVar.r(false);
            }
            int iIntValue = ((Number) objJ).intValue();
            fetVar.e0(-1282720187);
            ycl yclVarG = dw9.g(fetVar, false, ((ado0) list.get(iIntValue)).f689a);
            boolean zG2 = fetVar.g(oms0VarZ);
            Object objP = fetVar.P();
            if (zG2 || objP == obj) {
                objP = jgk0.b(new m6x(oms0VarZ, b2));
                fetVar.o0(objP);
            }
            int iIntValue2 = ((Number) ((l7m0) objP).getValue()).intValue();
            fetVar.e0(-1282720187);
            ycl yclVarG2 = dw9.g(fetVar, false, ((ado0) list.get(iIntValue2)).f689a);
            boolean zG3 = fetVar.g(oms0VarZ);
            Object objP2 = fetVar.P();
            if (zG3 || objP2 == obj) {
                objP2 = jgk0.b(new m6x(oms0VarZ, (byte) 15));
                fetVar.o0(objP2);
            }
            ((ams0) ((l7m0) objP2).getValue()).getClass();
            fetVar.e0(1447165867);
            nul0 nul0VarG0 = ro4.g0(1.0f, 50.0f, null, 4);
            fetVar.r(false);
            cms0 cms0VarE = phu0.E(oms0VarZ, yclVarG, yclVarG2, nul0VarG0, lxs0Var, fetVar, 196608);
            if (oms0VarZ.h()) {
                objJ2 = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG4 = fetVar.g(oms0VarZ);
                objJ2 = fetVar.P();
                if (zG4 || objJ2 == obj) {
                    rfk0 rfk0VarJ2 = vdx.J();
                    Function1 function1E2 = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                    rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                    try {
                        Object objY1 = p4Var.y0();
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        fetVar.o0(objY1);
                        objJ2 = objY1;
                    } catch (Throwable th2) {
                        vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                        throw th2;
                    }
                }
                fetVar.r(false);
            }
            int iIntValue3 = ((Number) objJ2).intValue();
            fetVar.e0(139130924);
            ado0 ado0Var = (ado0) list.get(iIntValue3);
            ycl yclVarG3 = dw9.g(fetVar, false, ado0Var.f689a + ado0Var.b);
            boolean zG5 = fetVar.g(oms0VarZ);
            Object objP3 = fetVar.P();
            if (zG5 || objP3 == obj) {
                objP3 = jgk0.b(new m6x(oms0VarZ, (byte) 16));
                fetVar.o0(objP3);
            }
            int iIntValue4 = ((Number) ((l7m0) objP3).getValue()).intValue();
            fetVar.e0(139130924);
            ado0 ado0Var2 = (ado0) list.get(iIntValue4);
            ycl yclVarG4 = dw9.g(fetVar, false, ado0Var2.f689a + ado0Var2.b);
            boolean zG6 = fetVar.g(oms0VarZ);
            Object objP4 = fetVar.P();
            if (zG6 || objP4 == obj) {
                objP4 = jgk0.b(new m6x(oms0VarZ, (byte) 17));
                fetVar.o0(objP4);
            }
            ((ams0) ((l7m0) objP4).getValue()).getClass();
            fetVar.e0(611244818);
            nul0 nul0VarG1 = ro4.g0(1.0f, 50.0f, null, 4);
            fetVar.r(false);
            cms0 cms0VarE2 = phu0.E(oms0VarZ, yclVarG3, yclVarG4, nul0VarG1, lxs0Var, fetVar, 196608);
            float f2 = ((ycl) cms0VarE.getValue()).f42389a;
            mm40Var2 = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.y(ffb0.R(mm40Var2, f2, 0.0f, 2), gqw0.g, 2), ((ycl) cms0VarE2.getValue()).f42389a - ((ycl) cms0VarE.getValue()).f42389a);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = s5x0.L(mm40VarS, 0.0f, 4.0f, 1).e(o7k0.c);
            long jC = y3d.c(0.1f, ((ThemeColors) fetVar.k(zaq0.b)).getPrimary());
            ugg0 ugg0Var = vgg0.f37379a;
            ld90 ld90VarE = pzb.e(50);
            zq8.a(0, fetVar, i120.Q(mm40VarE, jC, new ugg0(ld90VarE, ld90VarE, ld90VarE, ld90VarE)));
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i6n((byte) 1, i2, i3, (Object) list, (Object) mm40Var2);
        }
    }

    public static final void o(mm40 mm40Var, lfa lfaVar, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        lfaVar.getClass();
        fetVar2.g0(-2144100052);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(lfaVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zx7 zx7Var = gqw0.e;
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 12.0f, 0.0f, 2);
            String str = lfaVar.f19943a;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarL, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, g1t0.j(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(mm40Var, lfaVar, i2, (byte) 2);
        }
    }

    public static final void q(fje0 fje0Var, fet fetVar, int i2) {
        fetVar.g0(200260127);
        int i3 = (fetVar.g(fje0Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 4.0f, 0.0f, 28.0f, 5);
            boolean z = (i3 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new v6d0(fje0Var, (byte) 25);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 6, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nrc0(fje0Var, i2, (byte) 28);
        }
    }

    public static final void r(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1879193181);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mdm mdmVar = (mdm) l7m0Var.getValue();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new e0(function1, (byte) 29);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cn(l7m0Var, function1, i2, b2);
        }
    }

    public static final void s(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1192045876);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ia30(function1, (byte) 28);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var, mdmVar, function1, i2, (byte) 22);
        }
    }

    public static final void t(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(22879647);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new evd0(function1, (byte) 25);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, (byte) 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0377  */
    /* JADX WARN: Code duplicated, block: B:104:0x0380  */
    /* JADX WARN: Code duplicated, block: B:107:0x039a  */
    /* JADX WARN: Code duplicated, block: B:109:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:111:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:115:0x0434 A[LOOP:0: B:113:0x042e->B:115:0x0434, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0459  */
    /* JADX WARN: Code duplicated, block: B:120:0x0483  */
    /* JADX WARN: Code duplicated, block: B:121:0x0485  */
    /* JADX WARN: Code duplicated, block: B:125:0x048e  */
    /* JADX WARN: Code duplicated, block: B:128:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:129:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:133:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:73:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:74:0x02af  */
    /* JADX WARN: Code duplicated, block: B:80:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x0312  */
    /* JADX WARN: Code duplicated, block: B:87:0x0327  */
    /* JADX WARN: Code duplicated, block: B:88:0x0329  */
    /* JADX WARN: Code duplicated, block: B:92:0x0332  */
    /* JADX WARN: Code duplicated, block: B:96:0x0361  */
    /* JADX WARN: Code duplicated, block: B:99:0x0375  */
    public static final void v(yyo yyoVar, Function1 function1, fet fetVar, int i2) {
        yyo yyoVar2;
        Function1 function2;
        fet fetVar2;
        Object maVar;
        pcy pcyVar;
        cl5 cl5Var;
        boolean z;
        Object objP;
        pcy pcyVar2;
        cl5 cl5Var2;
        boolean zI;
        Object objP2;
        boolean z2;
        Object objP3;
        boolean zI2;
        Object objP4;
        final byte b2;
        boolean z3;
        Object objP5;
        jm40 jm40Var;
        boolean z4;
        boolean z5;
        cl5 cl5Var3;
        boolean z6;
        Object objP6;
        boolean z7;
        Object objP7;
        yyoVar.getClass();
        function1.getClass();
        fetVar.g0(467597865);
        int i3 = i2 | (fetVar.g(yyoVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            final wpq wpqVar = (wpq) fetVar.k(bmd.i);
            Object objP8 = fetVar.P();
            cl5 cl5Var4 = ukd.f35823a;
            if (objP8 == cl5Var4) {
                objP8 = new cqq();
                fetVar.o0(objP8);
            }
            cqq cqqVar = (cqq) objP8;
            Object objP9 = fetVar.P();
            if (objP9 == cl5Var4) {
                objP9 = new cqq();
                fetVar.o0(objP9);
            }
            cqq cqqVar2 = (cqq) objP9;
            Object objP10 = fetVar.P();
            if (objP10 == cl5Var4) {
                objP10 = new cqq();
                fetVar.o0(objP10);
            }
            cqq cqqVar3 = (cqq) objP10;
            yxo yxoVar = yyoVar.j;
            int i4 = i3 & 896;
            boolean z8 = (i4 == 256) | ((i3 & 112) == 32);
            Object objP11 = fetVar.P();
            if (z8 || objP11 == cl5Var4) {
                maVar = new ma(yyoVar, cqqVar, cqqVar2, cqqVar3, function1, null);
                cqqVar3 = cqqVar3;
                cqqVar2 = cqqVar2;
                cqqVar = cqqVar;
                fetVar.o0(maVar);
            } else {
                maVar = objP11;
            }
            m0x0.t(fetVar, yxoVar, (Function2) maVar);
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
            WeakHashMap weakHashMap = djv0.w;
            mm40 mm40VarK0 = j120.k0(mm40VarQ, new ujo(zcm0.i(fetVar).c, zcm0.i(fetVar).e));
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z9 = fetVar.S;
            cqq cqqVar4 = cqqVar2;
            pcy pcyVar3 = e7z.u1;
            if (z9) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            imm immVar = yyoVar.f43475a;
            boolean z10 = i4 == 256;
            Object objP12 = fetVar.P();
            if (z10 || objP12 == cl5Var4) {
                objP12 = new s8o(function1, (byte) 12);
                fetVar.o0(objP12);
            }
            cqq cqqVar5 = cqqVar3;
            cqq cqqVar6 = cqqVar;
            hlm.c(null, immVar, null, (Function0) objP12, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            fet fetVar3 = fetVar;
            mm40 mm40VarE0 = o2e.e0(wha0.a0(new x7z(1.0f, true), wha0.T(fetVar3), false, 14), "FAST_CHANGE_PASSWORD_LAZY_COLUMN");
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar3, 0);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarE0);
            fetVar3.i0();
            if (fetVar3.S) {
                pcyVar = pcyVar3;
                fetVar3.l(pcyVar);
            } else {
                pcyVar = pcyVar3;
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA2, shdVar);
            jpm0.o(fetVar3, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar4);
            zcl zclVar = qmk.f28987a;
            float f2 = qmk.a(fetVar3).d;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarK = s5x0.K(jm40Var2, f2, 12.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode3 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM3 = fetVar3.m();
            mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarK);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC, shdVar);
            jpm0.o(fetVar3, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC2, shdVar4);
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var2, 1.0f), null, false, 3);
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarW, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 16.0f);
            x5d x5dVarA3 = w5d.a(mw3Var, xx7Var, fetVar3, 0);
            int iHashCode4 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM4 = fetVar3.m();
            mm40 mm40VarC3 = kbc.c0(fetVar3, mm40VarJ);
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
            mm40 mm40VarB0 = y860.b0(jm40Var2, cqqVar6);
            yyoVar2 = yyoVar;
            c6q0 c6q0Var = yyoVar2.b;
            boolean zI3 = fetVar3.i(wpqVar);
            Object objP13 = fetVar3.P();
            if (zI3) {
                cl5Var = cl5Var4;
            } else {
                cl5Var = cl5Var4;
                if (objP13 == cl5Var) {
                }
                kly klyVar = new kly(null, (Function1) objP13, null, 59);
                if (i4 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar3.P();
                if (z || objP == cl5Var) {
                    objP = new btm(function1, (byte) 29);
                    fetVar3.o0(objP);
                }
                pcyVar2 = pcyVar;
                cl5Var2 = cl5Var;
                function2 = function1;
                wvb.t(mm40VarB0, c6q0Var, 6, klyVar, (Function1) objP, fetVar3, 384, 0);
                qxw.o(fetVar3, o7k0.e(jm40Var2, 12.0f));
                mm40 mm40VarB1 = y860.b0(jm40Var2, cqqVar4);
                c6q0 c6q0Var2 = yyoVar2.c;
                zI = fetVar3.i(wpqVar);
                objP2 = fetVar3.P();
                if (zI || objP2 == cl5Var2) {
                    final byte b3 = 1;
                    objP2 = new Function1() { // from class: a.pyo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            byte b4 = b3;
                            ((jly) obj).getClass();
                            switch (b4) {
                                case 0:
                                    ((ypq) wpqVar).i(6, true);
                                    break;
                                case 1:
                                    ((ypq) wpqVar).i(6, true);
                                    break;
                                default:
                                    ((ypq) wpqVar).b(false);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar3.o0(objP2);
                }
                kly klyVar2 = new kly(null, (Function1) objP2, null, 59);
                if (i4 == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP3 = fetVar3.P();
                if (z2 || objP3 == cl5Var2) {
                    objP3 = new qyo(function2, (byte) 0);
                    fetVar3.o0(objP3);
                }
                wvb.t(mm40VarB1, c6q0Var2, 6, klyVar2, (Function1) objP3, fetVar3, 384, 0);
                qxw.o(fetVar3, o7k0.e(jm40Var2, 12.0f));
                mm40 mm40VarB2 = y860.b0(jm40Var2, cqqVar5);
                c6q0 c6q0Var3 = yyoVar2.d;
                zI2 = fetVar3.i(wpqVar);
                objP4 = fetVar3.P();
                b2 = 2;
                if (zI2 || objP4 == cl5Var2) {
                    objP4 = new Function1() { // from class: a.pyo
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            byte b4 = b2;
                            ((jly) obj).getClass();
                            switch (b4) {
                                case 0:
                                    ((ypq) wpqVar).i(6, true);
                                    break;
                                case 1:
                                    ((ypq) wpqVar).i(6, true);
                                    break;
                                default:
                                    ((ypq) wpqVar).b(false);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar3.o0(objP4);
                }
                kly klyVar3 = new kly((Function1) objP4, null, null, 62);
                if (i4 == 256) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP5 = fetVar3.P();
                if (z3 || objP5 == cl5Var2) {
                    objP5 = new qyo(function2, (byte) 1);
                    fetVar3.o0(objP5);
                }
                wvb.t(mm40VarB2, c6q0Var3, 7, klyVar3, (Function1) objP5, fetVar3, 384, 0);
                if (yyoVar2.e) {
                    fetVar3.e0(1794618644);
                    qxw.o(fetVar3, o7k0.e(jm40Var2, 12.0f));
                    mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, i120.Q(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), s6t0.b().f33626a.getBackground(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
                    x5d x5dVarA4 = w5d.a(mw3Var, xx7Var, fetVar3, 0);
                    int iHashCode5 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM5 = fetVar3.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar3, mm40VarE);
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar2);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA4, shdVar);
                    jpm0.o(fetVar3, bh90VarM5, shdVar2);
                    vqd.u(iHashCode5, fetVar3, shdVar3, fetVar3);
                    jpm0.o(fetVar3, mm40VarC4, shdVar4);
                    cl5Var3 = cl5Var2;
                    agc.r(jm40Var2, yyoVar2.f, null, null, null, null, null, fetVar, 6, 124);
                    fetVar3 = fetVar;
                    fetVar3.e0(1984821539);
                    for (String str : yyoVar2.g) {
                        zcl zclVar3 = qmk.f28987a;
                        F(0, fetVar3, s5x0.N(jm40Var2, 8.0f, 0.0f, 8.0f, 8.0f, 2), str);
                    }
                    jm40Var = jm40Var2;
                    z4 = true;
                    z5 = false;
                    ohs0.x(fetVar3, false, true, false);
                } else {
                    jm40Var = jm40Var2;
                    z4 = true;
                    z5 = false;
                    cl5Var3 = cl5Var2;
                    fetVar3.e0(1795922721);
                    fetVar3.r(false);
                }
                fetVar3.r(z4);
                fetVar3.r(z4);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar4 = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(mm40VarD, qmk.a(fetVar3).d, 0.0f, 2);
                wul wulVar = yyoVar2.h;
                if (i4 == 256) {
                    z6 = true;
                } else {
                    z6 = z5;
                }
                objP6 = fetVar3.P();
                if (z6 || objP6 == cl5Var3) {
                    objP6 = new s8o(function2, (byte) 13);
                    fetVar3.o0(objP6);
                }
                qzb.n(mm40VarL, wulVar, (Function0) objP6, fetVar, 0, 0);
                fetVar.r(true);
                mtl mtlVar = yyoVar2.i;
                if (i4 == 256) {
                    z7 = true;
                } else {
                    z7 = z5;
                }
                objP7 = fetVar.P();
                if (z7 || objP7 == cl5Var3) {
                    objP7 = new qyo(function2, b2);
                    fetVar.o0(objP7);
                }
                bkb.f(null, mtlVar, null, false, null, (Function1) objP7, fetVar, 0, 29);
                fetVar2 = fetVar;
                fetVar2.r(true);
            }
            final byte b4 = 0;
            objP13 = new Function1() { // from class: a.pyo
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    byte b5 = b4;
                    ((jly) obj).getClass();
                    switch (b5) {
                        case 0:
                            ((ypq) wpqVar).i(6, true);
                            break;
                        case 1:
                            ((ypq) wpqVar).i(6, true);
                            break;
                        default:
                            ((ypq) wpqVar).b(false);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            fetVar3.o0(objP13);
            kly klyVar4 = new kly(null, (Function1) objP13, null, 59);
            if (i4 == 256) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar3.P();
            if (z) {
                objP = new btm(function1, (byte) 29);
                fetVar3.o0(objP);
            } else {
                objP = new btm(function1, (byte) 29);
                fetVar3.o0(objP);
            }
            pcyVar2 = pcyVar;
            cl5Var2 = cl5Var;
            function2 = function1;
            wvb.t(mm40VarB0, c6q0Var, 6, klyVar4, (Function1) objP, fetVar3, 384, 0);
            qxw.o(fetVar3, o7k0.e(jm40Var2, 12.0f));
            mm40 mm40VarB3 = y860.b0(jm40Var2, cqqVar4);
            c6q0 c6q0Var4 = yyoVar2.c;
            zI = fetVar3.i(wpqVar);
            objP2 = fetVar3.P();
            if (zI) {
                final byte b5 = 1;
                objP2 = new Function1() { // from class: a.pyo
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b6 = b5;
                        ((jly) obj).getClass();
                        switch (b6) {
                            case 0:
                                ((ypq) wpqVar).i(6, true);
                                break;
                            case 1:
                                ((ypq) wpqVar).i(6, true);
                                break;
                            default:
                                ((ypq) wpqVar).b(false);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar3.o0(objP2);
            } else {
                final byte b6 = 1;
                objP2 = new Function1() { // from class: a.pyo
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b7 = b6;
                        ((jly) obj).getClass();
                        switch (b7) {
                            case 0:
                                ((ypq) wpqVar).i(6, true);
                                break;
                            case 1:
                                ((ypq) wpqVar).i(6, true);
                                break;
                            default:
                                ((ypq) wpqVar).b(false);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar3.o0(objP2);
            }
            kly klyVar5 = new kly(null, (Function1) objP2, null, 59);
            if (i4 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP3 = fetVar3.P();
            if (z2) {
                objP3 = new qyo(function2, (byte) 0);
                fetVar3.o0(objP3);
            } else {
                objP3 = new qyo(function2, (byte) 0);
                fetVar3.o0(objP3);
            }
            wvb.t(mm40VarB3, c6q0Var4, 6, klyVar5, (Function1) objP3, fetVar3, 384, 0);
            qxw.o(fetVar3, o7k0.e(jm40Var2, 12.0f));
            mm40 mm40VarB4 = y860.b0(jm40Var2, cqqVar5);
            c6q0 c6q0Var5 = yyoVar2.d;
            zI2 = fetVar3.i(wpqVar);
            objP4 = fetVar3.P();
            b2 = 2;
            if (zI2) {
                objP4 = new Function1() { // from class: a.pyo
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b7 = b2;
                        ((jly) obj).getClass();
                        switch (b7) {
                            case 0:
                                ((ypq) wpqVar).i(6, true);
                                break;
                            case 1:
                                ((ypq) wpqVar).i(6, true);
                                break;
                            default:
                                ((ypq) wpqVar).b(false);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar3.o0(objP4);
            } else {
                objP4 = new Function1() { // from class: a.pyo
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b7 = b2;
                        ((jly) obj).getClass();
                        switch (b7) {
                            case 0:
                                ((ypq) wpqVar).i(6, true);
                                break;
                            case 1:
                                ((ypq) wpqVar).i(6, true);
                                break;
                            default:
                                ((ypq) wpqVar).b(false);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar3.o0(objP4);
            }
            kly klyVar6 = new kly((Function1) objP4, null, null, 62);
            if (i4 == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            objP5 = fetVar3.P();
            if (z3) {
                objP5 = new qyo(function2, (byte) 1);
                fetVar3.o0(objP5);
            } else {
                objP5 = new qyo(function2, (byte) 1);
                fetVar3.o0(objP5);
            }
            wvb.t(mm40VarB4, c6q0Var5, 7, klyVar6, (Function1) objP5, fetVar3, 384, 0);
            if (yyoVar2.e) {
                fetVar3.e0(1794618644);
                qxw.o(fetVar3, o7k0.e(jm40Var2, 12.0f));
                mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, i120.Q(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), s6t0.b().f33626a.getBackground(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
                x5d x5dVarA5 = w5d.a(mw3Var, xx7Var, fetVar3, 0);
                int iHashCode6 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM6 = fetVar3.m();
                mm40 mm40VarC5 = kbc.c0(fetVar3, mm40VarE2);
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(pcyVar2);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, x5dVarA5, shdVar);
                jpm0.o(fetVar3, bh90VarM6, shdVar2);
                vqd.u(iHashCode6, fetVar3, shdVar3, fetVar3);
                jpm0.o(fetVar3, mm40VarC5, shdVar4);
                cl5Var3 = cl5Var2;
                agc.r(jm40Var2, yyoVar2.f, null, null, null, null, null, fetVar, 6, 124);
                fetVar3 = fetVar;
                fetVar3.e0(1984821539);
                while (r0.hasNext()) {
                    zcl zclVar5 = qmk.f28987a;
                    F(0, fetVar3, s5x0.N(jm40Var2, 8.0f, 0.0f, 8.0f, 8.0f, 2), str);
                }
                jm40Var = jm40Var2;
                z4 = true;
                z5 = false;
                ohs0.x(fetVar3, false, true, false);
            } else {
                jm40Var = jm40Var2;
                z4 = true;
                z5 = false;
                cl5Var3 = cl5Var2;
                fetVar3.e0(1795922721);
                fetVar3.r(false);
            }
            fetVar3.r(z4);
            fetVar3.r(z4);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar6 = qmk.f28987a;
            mm40 mm40VarL2 = s5x0.L(mm40VarD2, qmk.a(fetVar3).d, 0.0f, 2);
            wul wulVar2 = yyoVar2.h;
            if (i4 == 256) {
                z6 = true;
            } else {
                z6 = z5;
            }
            objP6 = fetVar3.P();
            if (z6) {
                objP6 = new s8o(function2, (byte) 13);
                fetVar3.o0(objP6);
            } else {
                objP6 = new s8o(function2, (byte) 13);
                fetVar3.o0(objP6);
            }
            qzb.n(mm40VarL2, wulVar2, (Function0) objP6, fetVar, 0, 0);
            fetVar.r(true);
            mtl mtlVar2 = yyoVar2.i;
            if (i4 == 256) {
                z7 = true;
            } else {
                z7 = z5;
            }
            objP7 = fetVar.P();
            if (z7) {
                objP7 = new qyo(function2, b2);
                fetVar.o0(objP7);
            } else {
                objP7 = new qyo(function2, b2);
                fetVar.o0(objP7);
            }
            bkb.f(null, mtlVar2, null, false, null, (Function1) objP7, fetVar, 0, 29);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            yyoVar2 = yyoVar;
            function2 = function1;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(yyoVar2, function2, i2, (byte) 24);
        }
    }

    public static final void w(gc6 gc6Var, fet fetVar, int i2) {
        float f2;
        fetVar.g0(413455250);
        byte b2 = 4;
        int i3 = (i2 & 6) == 0 ? (fetVar.g(gc6Var) ? 4 : 2) | i2 : i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            boolean z = gc6Var.g;
            wb6 wb6Var = gc6Var.b;
            if (z) {
                fetVar.e0(-719952432);
                fetVar.r(false);
            } else {
                fetVar.e0(-720749101);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = Integer.valueOf(wb6Var == wb6.b ? R.drawable.ic_sport_league_of_legends_106 : R.drawable.ic_sport_color_dota_97);
                    fetVar.o0(objP);
                }
                int iIntValue = ((Number) objP).intValue();
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    if (wb6Var == wb6.b) {
                        zcl zclVar = qmk.f28987a;
                        f2 = 6.0f;
                    } else {
                        zcl zclVar2 = qmk.f28987a;
                        f2 = 4.0f;
                    }
                    objP2 = twn.j(f2, fetVar);
                }
                float f3 = ((ycl) objP2).f42389a;
                int i4 = 0;
                for (Object obj : gc6Var.f) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        q3d.p();
                        throw null;
                    }
                    lgb.v(V(gc6Var, i4), s5x0.J(V(gc6Var, i4), f3), ((zb6) obj).f44099a, iIntValue, StaticColors.INSTANCE.m126getWhite200d7_KjU(), gqw0.A, fetVar, 199680, 0);
                    i4 = i5;
                }
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ac6(gc6Var, i2, b2);
        }
    }

    public static final void x(a4x a4xVar, int i2, Function1 function1, fet fetVar, int i3) {
        int i4;
        int i5;
        xcz xczVar;
        Object seeVar;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(-938473320);
        if ((i3 & 6) == 0) {
            i4 = (fetVar.g(a4xVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 = i2;
            i4 |= fetVar.e(i5) ? 32 : 16;
        } else {
            i5 = i2;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.i(function1) ? 256 : 128;
        }
        int i6 = i4;
        if (fetVar.U(i6 & 1, (i6 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            int i7 = -((int) pkd.b(8.0f, fetVar));
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Integer numValueOf = Integer.valueOf(i5);
            int i8 = i6 & 14;
            boolean zG = (i8 == 4) | ((i6 & 112) == 32) | fetVar.g(xczVarA) | fetVar.e(i7);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                xczVar = xczVarA;
                seeVar = new see(a4xVar, i5, xczVar, i7, (yje) null);
                fetVar.o0(seeVar);
            } else {
                xczVar = xczVarA;
                seeVar = objP;
            }
            m0x0.t(fetVar, numValueOf, (Function2) seeVar);
            n0q n0qVar = o7k0.c;
            ch80 ch80VarG = knm0.g(s5x0.u(xfn.a(fetVar).d, 0.0f, xfn.a(fetVar).d, 28.0f, 2), fetVar);
            boolean z = (i8 == 4) | ((i6 & 896) == 256);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new or0(a4xVar, function1, (byte) 8);
                fetVar.o0(objP2);
            }
            b8k0.e(n0qVar, xczVar, ch80VarG, null, null, null, false, null, (Function1) objP2, fetVar, 6, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a18((byte) 1, i2, i3, a4xVar, function1);
        }
    }

    public static final void y(mm40 mm40Var, ik00 ik00Var, boolean z, qdz qdzVar, e2d e2dVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(-482906764);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(ik00Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(qdzVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(e2dVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            if (ik00Var instanceof fk00) {
                fetVar.e0(1865380401);
                s(mm40Var, ((fk00) ik00Var).f9668a, function1, fetVar, (i4 & 14) | ((i4 >> 9) & 896));
                fetVar.r(false);
            } else if (ik00Var instanceof gk00) {
                fetVar.e0(-216916828);
                M(mm40Var, (gk00) ik00Var, fetVar, i4 & 126);
                fetVar.r(false);
            } else {
                if (!(ik00Var instanceof hk00)) {
                    throw b1j.f(-216922653, fetVar, false);
                }
                fetVar.e0(1865611816);
                fetVar2 = fetVar;
                J(null, z, function1, u1c.M(-1956107515, new jwy(ik00Var, mm40Var, qdzVar, e2dVar, function1, (byte) 2), fetVar), fetVar2, ((i4 >> 3) & 112) | 3072 | ((i4 >> 9) & 896));
                fetVar2.r(false);
            }
            fetVar2 = fetVar;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nwy(mm40Var, ik00Var, z, qdzVar, e2dVar, function1, i2, (byte) 2);
        }
    }
}
