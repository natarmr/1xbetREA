package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.graphics.DashPathEffect;
import android.javax.sip.message.Response;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.webview.FixedWebView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qjj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f28842a = new ugd(129228779, false, new i5b(19));
    public static final ugd b = new ugd(-317275440, false, new chd(16));
    public static final ugd c = new ugd(-911974178, false, new jhd(9));
    public static final ugd d = new ugd(-1829846812, false, new jhd(10));
    public static final ugd e = new ugd(74424443, false, new ihd(16));
    public static final ugd f = new ugd(-2035871283, false, new jhd(11));
    public static final ugd g = new ugd(564959559, false, new ohd(9));
    public static final Object h = new Object();
    public static pvu0 i;

    public static final void A(int i2, fet fetVar) {
        fet fetVar2;
        fetVar.g0(1596548380);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
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
            fetVar2 = fetVar;
            p3c0.a(null, 0L, 0.0f, 0L, 0, 0.0f, fetVar2, 0, 63);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pua(i2, (byte) 19);
        }
    }

    public static final void B(int i2, fet fetVar) {
        fet fetVar2;
        fetVar.g0(1633317410);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
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
            g8x.d(fqj0VarD0, fetVar, 0);
            fetVar2 = fetVar;
            mbc.o(agi0.f827a, null, false, fetVar2, 6, 6);
            zfn zfnVar = zaq0.b;
            g8x.o(((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), fqj0VarD0, fetVar2, 0);
            g8x.o(((ThemeColors) fetVar2.k(zfnVar)).getBackground(), fqj0VarD0, fetVar2, 0);
            g8x.o(((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), fqj0VarD0, fetVar2, 0);
            g8x.o(((ThemeColors) fetVar2.k(zfnVar)).getBackground(), fqj0VarD0, fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new so90(i2, (byte) 25);
        }
    }

    public static final void C(mm40 mm40Var, n250 n250Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        boolean z;
        fet fetVar2 = fetVar;
        mm40Var.getClass();
        n250Var.getClass();
        fetVar2.g0(1825368774);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(n250Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        int i4 = i3;
        if (fetVar2.U(i4 & 1, (i4 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            boolean z2 = n250Var instanceof m250;
            cl5 cl5Var = ukd.f35823a;
            if (z2) {
                fetVar2.e0(-410617076);
                mm40 mm40VarB = jr8.f16991a.b(s5x0.N(mm40Var, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar2, false), 7), gqw0.e);
                mdm mdmVar = ((m250) n250Var).f21040a;
                boolean z3 = (i4 & 896) == 256;
                Object objP = fetVar2.P();
                if (z3 || objP == cl5Var) {
                    objP = new m040(function1, (byte) 26);
                    fetVar2.o0(objP);
                }
                z = true;
                jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar2, 0, 4);
                fetVar2.r(false);
            } else {
                z = true;
                if (!(n250Var instanceof l250)) {
                    throw b1j.f(-1952897549, fetVar2, false);
                }
                fetVar2.e0(-409782494);
                mm40 mm40VarE0 = o2e.e0(n0qVar, "MY_AGGREGATOR_LAZY_COLUMN");
                zcl zclVar = qmk.f28987a;
                ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, 28.0f, 5), fetVar2);
                boolean z4 = ((i4 & 112) == 32) | ((i4 & 896) == 256);
                Object objP2 = fetVar2.P();
                if (z4 || objP2 == cl5Var) {
                    objP2 = new rw40(n250Var, function1, (byte) 2);
                    fetVar2.o0(objP2);
                }
                b8k0.e(mm40VarE0, null, ch80VarG, null, null, null, false, null, (Function1) objP2, fetVar, 6, 506);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var, (Object) n250Var, (Object) function1, i2, (byte) 15);
        }
    }

    public static final void D(int i2, fet fetVar) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1885630605);
        if (fetVar2.U(i2 & 1, i2 != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 52.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarE, s6t0.b().f33626a.getBackground(), jd8.n), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            v8q0.a(rsm0.w(R.string.tournaments, 0, fetVar2), s5x0.N(ohs0.i(fetVar2, mm40VarC0, gqw0.v, 1.0f, true), 0.0f, 0.0f, 18.0f, 0.0f, 11), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24960, 110584);
            j0x.b(a8k0.F(R.drawable.ic_gold_medal, 0, fetVar), null, o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 18.0f, 0.0f, 11), 24.0f), null, null, 0.0f, null, fetVar, 56, 120);
            j0x.b(a8k0.F(R.drawable.ic_silver_medal, 0, fetVar), null, o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 18.0f, 0.0f, 11), 24.0f), null, null, 0.0f, null, fetVar, 56, 120);
            fetVar2 = fetVar;
            j0x.b(a8k0.F(R.drawable.ic_bronze_medal, 0, fetVar), null, o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 18.0f, 0.0f, 11), 24.0f), null, null, 0.0f, null, fetVar2, 56, 120);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new so90(i2, (byte) 26);
        }
    }

    public static final void E(mm40 mm40Var, t7a0 t7a0Var, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(597627972);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(t7a0Var) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40VarD, 50.0f), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            mm40 mm40VarN2 = s5x0.N(new x7z(1.0f, true), 0.0f, 0.0f, 18.0f, 0.0f, 11);
            String str = t7a0Var.f33458a;
            long j = g1t0.d().f42262a.b;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarN2, s6t0.b().f33626a.getSecondary(), null, j, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 110568);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(s5x0.N(jm40Var, 0.0f, 0.0f, 18.0f, 0.0f, 11), 24.0f);
            v8q0.a(t7a0Var.b, mm40VarS, s6t0.b().f33626a.getSecondary(), null, g1t0.d().f42262a.b, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 130024);
            mm40 mm40VarS2 = o7k0.s(s5x0.N(jm40Var, 0.0f, 0.0f, 18.0f, 0.0f, 11), 24.0f);
            v8q0.a(t7a0Var.c, mm40VarS2, s6t0.b().f33626a.getSecondary(), null, g1t0.d().f42262a.b, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 130024);
            mm40 mm40VarS3 = o7k0.s(s5x0.N(jm40Var, 0.0f, 0.0f, 18.0f, 0.0f, 11), 24.0f);
            v8q0.a(t7a0Var.d, mm40VarS3, s6t0.b().f33626a.getSecondary(), null, g1t0.d().f42262a.b, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 130024);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(mm40Var, t7a0Var, i2, (byte) 0);
        }
    }

    public static final void F(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1871318308);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n));
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
            imm immVarA = ((x7a0) l7m0Var.getValue()).a();
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new i0a0(function1, (byte) 7);
                fetVar.o0(objP);
            }
            hlm.c(null, immVarA, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            x7a0 x7a0Var = (x7a0) l7m0Var.getValue();
            if (x7a0Var != null) {
                if (x7a0Var instanceof u7a0) {
                    fetVar.e0(525699985);
                    j((u7a0) x7a0Var, fetVar, 0);
                    fetVar.r(false);
                } else if (x7a0Var instanceof v7a0) {
                    fetVar.e0(525703527);
                    s(((v7a0) x7a0Var).b, function1, fetVar, i4);
                    fetVar.r(false);
                } else if (x7a0Var instanceof w7a0) {
                    fetVar.e0(525708712);
                    B(0, fetVar);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            throw b1j.f(525697438, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i2, (byte) 10);
        }
    }

    public static final void G(mm40 mm40Var, hif0 hif0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        hif0Var.getClass();
        function1.getClass();
        fetVar2.g0(2101576233);
        int i3 = i2 | 6 | (fetVar2.g(hif0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            imm immVar = hif0Var.f13110a;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new pme0(function1, (byte) 10);
                fetVar2.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            fetVar2 = fetVar;
            du90 du90Var = hif0Var.b;
            boolean z2 = i4 == 256;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                function2 = function1;
                objP2 = new pme0(function2, (byte) 11);
                fetVar2.o0(objP2);
            } else {
                function2 = function1;
            }
            Function0 function0 = (Function0) objP2;
            boolean z3 = ((i3 & 112) == 32) | (i4 == 256);
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new dff0(function2, hif0Var, (byte) 5);
                fetVar2.o0(objP3);
            }
            j47.e0(null, du90Var, function0, (Function1) objP3, fetVar2, 6);
            fetVar2.r(true);
            mm40Var2 = jm40.b;
        } else {
            function2 = function1;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var2, hif0Var, function2, i2, (byte) 21);
        }
    }

    public static final void H(mm40 mm40Var, float f2, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1417630323);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.d(f2) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            lh80 lh80VarT = s5x0.t(f2, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ejk0((byte) 27);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarD, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 805306368, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dql(mm40Var, f2, i2, (byte) 7);
        }
    }

    public static final void I(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(646283062);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 64.0f), 56.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarC0 = xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarC0);
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
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i2, (byte) 17);
        }
    }

    public static final void J(mm40 mm40Var, psm psmVar, float f2, Function1 function1, Function0 function0, Function0 function2, xdr xdrVar, fet fetVar, int i2, int i3) {
        psmVar.getClass();
        if ((i3 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        if ((i3 & 16) != 0) {
            function0 = null;
        }
        if ((i3 & 32) != 0) {
            function2 = null;
        }
        if (!(psmVar instanceof nsm)) {
            mm40 mm40Var2 = mm40Var;
            if (!(psmVar instanceof osm)) {
                throw b1j.f(-941862820, fetVar, false);
            }
            fetVar.e0(867490514);
            H(mm40Var2, f2, fetVar, (i2 & 14) | ((i2 >> 3) & 112));
            fetVar.r(false);
            return;
        }
        fetVar.e0(867087049);
        Function0 function3 = function2;
        mm40 mm40Var3 = mm40Var;
        m(mm40Var3, (nsm) psmVar, f2, function1, function0, function3, xdrVar, fetVar, 4194302 & i2);
        fetVar.r(false);
    }

    public static final x03 K(float f2, float[] fArr) {
        return new x03(new DashPathEffect(fArr, f2));
    }

    public static final mm40 L(mm40 mm40Var, a6p0 a6p0Var) {
        return mm40Var.e(new fu(a6p0Var));
    }

    public static kzj M(vne vneVar, CoroutineContext coroutineContext, Function2 function2, int i2) {
        yne yneVar = yne.d;
        if ((i2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f46065a;
        }
        if ((i2 & 2) != 0) {
            yneVar = yne.f42936a;
        }
        CoroutineContext coroutineContextB = jne.b(vneVar, coroutineContext);
        kzj d8zVar = yneVar == yne.b ? new d8z(coroutineContextB, function2) : new kzj(coroutineContextB, true);
        d8zVar.d0(yneVar, d8zVar, function2);
        return d8zVar;
    }

    public static final Object N(Collection collection, zje zjeVar) {
        return collection.isEmpty() ? iun.f15405a : new ja5((jzj[]) collection.toArray(new jzj[0])).a(zjeVar);
    }

    public static void O(Context context) {
        if (i == null) {
            pvu0 pvu0Var = new pvu0(context);
            i = pvu0Var;
            synchronized (pvu0Var.f27679a) {
                pvu0Var.g = true;
            }
        }
    }

    public static void P(Intent intent) {
        synchronized (h) {
            try {
                if (i != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    i.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final mm40 Q(mm40 mm40Var) {
        mm40Var.getClass();
        return mm40Var.e(q3q.b);
    }

    public static final String R(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String S(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((fba) obj).d) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((fba) it.next()).b;
        }
        return String.valueOf(Math.min(i2, 99));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object T(Collection collection, yje yjeVar) {
        na5 na5Var;
        Iterator it;
        int i2;
        if (yjeVar instanceof na5) {
            na5Var = (na5) yjeVar;
            int i3 = na5Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                na5Var.l = i3 - Integer.MIN_VALUE;
            } else {
                na5Var = new na5(yjeVar);
            }
        } else {
            na5Var = new na5(yjeVar);
        }
        Object obj = na5Var.k;
        wne wneVar = wne.f39444a;
        int i4 = na5Var.l;
        if (i4 == 0) {
            z1x.P(obj);
            it = collection.iterator();
            i2 = 0;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = na5Var.j;
            it = na5Var.i;
            z1x.P(obj);
        }
        while (it.hasNext()) {
            bby bbyVar = (bby) it.next();
            na5Var.i = it;
            na5Var.j = i2;
            na5Var.l = 1;
            if (bbyVar.join(na5Var) == wneVar) {
                return wneVar;
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0054 -> B:19:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object U(a.bby[] r6, a.zje r7) {
        /*
            boolean r0 = r7 instanceof a.ma5
            if (r0 == 0) goto L13
            r0 = r7
            a.ma5 r0 = (a.ma5) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.ma5 r0 = new a.ma5
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.m
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L32
            int r6 = r0.l
            int r2 = r0.k
            int r4 = r0.j
            java.lang.Object[] r5 = r0.i
            a.bby[] r5 = (a.bby[]) r5
            a.z1x.P(r7)
            r7 = r5
            goto L57
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L39:
            a.z1x.P(r7)
            int r7 = r6.length
            r2 = 0
            r4 = r7
            r7 = r6
            r6 = r4
            r4 = r2
        L42:
            if (r2 >= r6) goto L59
            r5 = r7[r2]
            r0.i = r7
            r0.j = r4
            r0.k = r2
            r0.l = r6
            r0.n = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L57
            return r1
        L57:
            int r2 = r2 + r3
            goto L42
        L59:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qjj.U(a.bby[], a.zje):java.lang.Object");
    }

    public static final c4m0 V(vne vneVar, CoroutineContext coroutineContext, yne yneVar, Function2 function2) {
        CoroutineContext coroutineContextB = jne.b(vneVar, coroutineContext);
        yneVar.getClass();
        c4m0 nezVar = yneVar == yne.b ? new nez(coroutineContextB, function2) : new c4m0(coroutineContextB, true);
        nezVar.d0(yneVar, nezVar, function2);
        return nezVar;
    }

    public static c4m0 W(vne vneVar, CoroutineContext coroutineContext, yne yneVar, Function2 function2, int i2) {
        if ((i2 & 1) != 0) {
            coroutineContext = kotlin.coroutines.g.f46065a;
        }
        if ((i2 & 2) != 0) {
            yneVar = yne.f42936a;
        }
        return V(vneVar, coroutineContext, yneVar, function2);
    }

    public static ComponentName X(Context context, Intent intent) {
        synchronized (h) {
            try {
                O(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    i.a();
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [a.bzw, a.y3d] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [a.bzw, a.y3d] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v4 a.ky30, still in use, count: 4, list:
          (r12v4 a.ky30) from 0x0549: MOVE (r39v0 a.ky30) = (r12v4 a.ky30) (LINE:1354)
          (r12v4 a.ky30) from 0x01e7: MOVE (r39v16 a.ky30) = (r12v4 a.ky30) (LINE:488)
          (r12v4 a.ky30) from 0x00a4: MOVE (r39v23 a.ky30) = (r12v4 a.ky30) (LINE:165)
          (r12v4 a.ky30) from 0x00a6: PHI (r39v22 a.ky30) = 
          (r39v0 a.ky30)
          (r39v0 a.ky30)
          (r39v0 a.ky30)
          (r39v0 a.ky30)
          (r39v0 a.ky30)
          (r39v0 a.ky30)
          (r39v0 a.ky30)
          (r39v0 a.ky30)
          (r12v4 a.ky30)
          (r39v16 a.ky30)
          (r39v23 a.ky30)
         binds: [B:190:0x090d, B:183:0x08b5, B:176:0x0861, B:155:0x073c, B:147:0x0696, B:140:0x0640, B:129:0x05d5, B:122:0x0581, B:115:0x052b, B:44:0x01e7, B:22:0x00a4] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static final a.uno0 Y(a.d140 r51, a.ctf0 r52, a.qho r53, java.lang.String r54) {
        /*
            Method dump skipped, instruction units count: 2687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qjj.Y(a.d140, a.ctf0, a.qho, java.lang.String):a.uno0");
    }

    public static final an6 Z(azv azvVar) {
        int iOrdinal = azvVar.ordinal();
        if (iOrdinal == 0) {
            return an6.b;
        }
        if (iOrdinal == 1) {
            return an6.c;
        }
        if (iOrdinal == 2) {
            return an6.d;
        }
        if (iOrdinal == 3) {
            return an6.e;
        }
        if (iOrdinal == 4) {
            return an6.f;
        }
        if (iOrdinal == 5) {
            return an6.g;
        }
        t9f.b();
        return null;
    }

    public static final void a(di0 di0Var, Function1 function1, fet fetVar, int i2) {
        ArrayList arrayList;
        di0Var.getClass();
        fetVar.g0(1160879476);
        int i3 = (i2 & 6) == 0 ? (fetVar.g(di0Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            int i4 = pkd.d(fetVar) ? 18 : 12;
            if (di0Var instanceof bi0) {
                arrayList = ((bi0) di0Var).f2634a;
            } else {
                if (!di0Var.equals(ci0.f4388a)) {
                    t9f.b();
                    return;
                }
                arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 < i4; i5++) {
                    arrayList.add(oh0.f25241a);
                }
            }
            int i6 = ((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp;
            int iMin = Math.min(arrayList.size(), i6 < 640 ? 2 : 3);
            int size = ((arrayList.size() + iMin) - 1) / iMin;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(o7k0.e(jm40.b, ((size - 1) * 8.0f) + (64.0f * size)), 1.0f), "LAZY_VERTICAL_GRID_CATEGORIES");
            int i7 = i3;
            ngv ngvVar = new ngv(i6 > 411 ? iMin : 2);
            byte b3 = 14;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b3));
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b3));
            boolean zI = fetVar.i(arrayList);
            boolean z = ((i7 & 112) == 32) | zI;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new rb(arrayList, function1, b2);
                fetVar.o0(objP);
            }
            g8x.i(ngvVar, mm40VarE0, null, null, qw3Var2, qw3Var, null, false, null, (Function1) objP, fetVar, 0, 924);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rh0(di0Var, function1, i2, (byte) 1);
        }
    }

    public static final ah7 a0(tg7 tg7Var, ctf0 ctf0Var) {
        tg7Var.getClass();
        ctf0Var.getClass();
        long j = tg7Var.f33895a;
        long j2 = tg7Var.q;
        String str = tg7Var.h;
        String str2 = tg7Var.k;
        rdj rdjVar = rdj.f30294a;
        String strG = rdj.g(new znq0(j2), efj.UNIQUE_1, Boolean.valueOf(ctf0Var.h()), false, 56);
        String str3 = strG.length() > 0 ? ", " : null;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = str2.length() > 0 ? " - " : null;
        String strK = b1j.k(strG, str3, str, str4 != null ? str4 : "", str2);
        String str5 = tg7Var.l;
        String strF = tg7Var.e;
        if (strF.length() == 0) {
            strF = ctf0Var.f(R.string.main_game, new Object[0]);
        }
        return new ah7(strK, str5 + " (" + ((Object) strF) + Separators.RPAREN, tg7Var.r, tg7Var.p, j);
    }

    public static final void b(mm40 mm40Var, l7m0 l7m0Var, lh80 lh80Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        fetVar.g0(-1884121903);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(lh80Var) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            clo cloVarB = lyq0.b(ob3.d(0, 7, fetVar), fetVar, 24576);
            boolean zG = fetVar.g((w11) l7m0Var.getValue());
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = Boolean.valueOf(!(l7m0Var.getValue() instanceof s11));
                fetVar.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            mm40Var2 = mm40Var;
            mm40 mm40VarI = s5x0.I(mm40Var2.e(o7k0.c), lh80Var);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarV = cjx.V(i120.Q(mm40VarI, background, ljcVar), cloVarB.e, null);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarV);
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
            ahy.b(i120.Q(jm40.b, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar), cloVarB, zBooleanValue, u1c.M(-364049338, new o71(l7m0Var, function1, (byte) 3), fetVar), u1c.M(-1743834651, new o71(l7m0Var, function1, (byte) 4), fetVar), fetVar, 27648, 0);
            u((w11) l7m0Var.getValue(), function1, fetVar, (i3 >> 6) & 112);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new h11(mm40Var2, l7m0Var, lh80Var, function1, i2, (byte) 0);
        }
    }

    public static final String b0(yje yjeVar) {
        Object g0g0Var;
        if (yjeVar instanceof nvk) {
            return ((nvk) yjeVar).toString();
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = yjeVar + '@' + R(yjeVar);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            g0g0Var = yjeVar.getClass().getName() + '@' + R(yjeVar);
        }
        return (String) g0g0Var;
    }

    public static final void c(mm40 mm40Var, cv1 cv1Var, xcz xczVar, d9z d9zVar, xcz xczVar2, xcz xczVar3, Function1 function1, fet fetVar, int i2) {
        cv1Var.getClass();
        bv1 bv1Var = cv1Var.b;
        xczVar.getClass();
        d9zVar.getClass();
        xczVar2.getClass();
        xczVar3.getClass();
        function1.getClass();
        fetVar.g0(-1877191218);
        byte b2 = 16;
        int i3 = i2 | (fetVar.g(cv1Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.g(d9zVar) ? 2048 : 1024) | (fetVar.g(xczVar2) ? 16384 : 8192) | (fetVar.g(xczVar3) ? 131072 : 65536) | (fetVar.i(function1) ? 1048576 : 524288);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            int iOrdinal = bv1Var.ordinal();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new c51(b2);
                fetVar.o0(objP);
            }
            kwj kwjVarB = zk80.b(iOrdinal, (Function0) objP, fetVar, 384, 2);
            boolean zG = fetVar.g(kwjVarB) | ((i3 & 112) == 32);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new wt1(cv1Var, kwjVarB, null, (byte) 3);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, bv1Var, (Function2) objP2);
            q5x.e(kwjVarB, mm40Var, null, null, q3d.i(bv1.g), 0.0f, null, null, false, null, null, null, null, u1c.M(-59915121, new ut1(cv1Var, xczVar, function1, d9zVar, xczVar2, xczVar3, (byte) 3), fetVar), fetVar, 100663344, 24576, 16108);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vt1(mm40Var, cv1Var, xczVar, d9zVar, xczVar2, xczVar3, function1, i2, (byte) 3);
        }
    }

    public static final u4s c0(pe8 pe8Var) {
        pe8Var.getClass();
        long j = pe8Var.f26839a;
        hds hdsVar = pe8Var.j;
        v4s v4sVar = pe8Var.k ? v4s.c : v4s.f36795a;
        String str = hdsVar.f12884a;
        String str2 = hdsVar.b;
        return new u4s(j, v4sVar, new n0x(str2), new n0x(azw.R(str2)), new n0x(str), new n0x(azw.R(hdsVar.f12884a)), pe8Var.b);
    }

    public static final void d(int i2, fet fetVar) {
        fetVar.g0(-1264531164);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(s5x0.L(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 12.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 12.0f), 96.0f);
            zcl zclVar2 = qmk.e;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
            mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 10.0f, 1);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
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
            mm40 mm40VarN2 = o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), 40.0f);
            zcl zclVar3 = qmk.m;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.s(rw2.d(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarN2), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 16.0f), 160.0f)), vbc.d0(null, fetVar, 0, 1)));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o33(i2);
        }
    }

    public static final Object d0(CoroutineContext coroutineContext, Function2 function2, yje yjeVar) {
        Unsafe unsafe;
        long j;
        Object objA;
        CoroutineContext context = yjeVar.getContext();
        CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(Boolean.FALSE, new bqd((byte) 7))).booleanValue() ? context.plus(coroutineContext) : jne.a(context, coroutineContext, false);
        zvw.O(coroutineContextPlus);
        if (coroutineContextPlus == context) {
            a3h0 a3h0Var = new a3h0(yjeVar, coroutineContextPlus);
            objA = ycm0.z(a3h0Var, true, a3h0Var, function2);
        } else {
            ake akeVar = kotlin.coroutines.d.d1;
            if (Intrinsics.d(coroutineContextPlus.get(akeVar), context.get(akeVar))) {
                o7t0 o7t0Var = new o7t0(yjeVar, coroutineContextPlus);
                CoroutineContext coroutineContext2 = o7t0Var.d;
                Object objC = ecq0.c(coroutineContext2, null);
                try {
                    Object objZ = ycm0.z(o7t0Var, true, o7t0Var, function2);
                    ecq0.a(coroutineContext2, objC);
                    objA = objZ;
                } catch (Throwable th) {
                    ecq0.a(coroutineContext2, objC);
                    throw th;
                }
            } else {
                pvk pvkVar = new pvk(yjeVar, coroutineContextPlus);
                uc9.e0(function2, pvkVar, pvkVar);
                do {
                    unsafe = defpackage.a.f0a;
                    j = pvk.f;
                    int intVolatile = unsafe.getIntVolatile(pvkVar, j);
                    if (intVolatile != 0) {
                        if (intVolatile != 2) {
                            jf4.n("Already suspended");
                            return null;
                        }
                        objA = qby.a(pvkVar.H());
                        if (objA instanceof udd) {
                            throw ((udd) objA).f35472a;
                        }
                    }
                } while (!unsafe.compareAndSwapInt(pvkVar, j, 0, 1));
                objA = wne.f39444a;
            }
        }
        wne wneVar = wne.f39444a;
        return objA;
    }

    public static final void e(mm40 mm40Var, ujv0 ujv0Var, l7m0 l7m0Var, Function0 function0, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, xdr xdrVar, xdr xdrVar2, xdr xdrVar3, fet fetVar, int i2) {
        ujv0Var.getClass();
        l7m0Var.getClass();
        function0.getClass();
        fetVar.g0(1770351285);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.i(ujv0Var) ? 32 : 16) | (fetVar.g(l7m0Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(xdrVar) ? 8388608 : 4194304) | (fetVar.i(xdrVar2) ? 67108864 : 33554432) | (fetVar.i(xdrVar3) ? 536870912 : 268435456);
        if (fetVar.U(i3 & 1, (306783379 & i3) != 306783378)) {
            int i4 = i3 & 7168;
            boolean z = i4 == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new tq(function0, (byte) 11);
                fetVar.o0(objP);
            }
            knx.i(false, (Function0) objP, fetVar, 0, 1);
            int iB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() & 4294967295L);
            pz40 pz40VarU = g8x.U((View) fetVar.k(dy2.f), fetVar, 0);
            Object[] objArr = new Object[0];
            int i5 = i3 & 896;
            boolean z2 = i5 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new we4(l7m0Var, (byte) 5);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP2, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z3 = i5 == 256;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new we4(l7m0Var, (byte) 6);
                fetVar.o0(objP3);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP3, fetVar);
            Object[] objArr3 = new Object[0];
            boolean z4 = i5 == 256;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new we4(l7m0Var, (byte) 7);
                fetVar.o0(objP4);
            }
            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP4, fetVar);
            Object[] objArr4 = new Object[0];
            boolean z5 = i5 == 256;
            Object objP5 = fetVar.P();
            byte b2 = 8;
            if (z5 || objP5 == cl5Var) {
                objP5 = new we4(l7m0Var, b2);
                fetVar.o0(objP5);
            }
            l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP5, fetVar);
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                nt2 nt2Var = nt2.b;
                pel pelVar = new pel();
                pelVar.a(nt2.f24075a, iB);
                pelVar.a(nt2Var, 0.0f);
                float[] fArr = pelVar.b;
                ArrayList arrayList = pelVar.f26860a;
                int size = arrayList.size();
                nx3.a(size, fArr.length);
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                fArrCopyOfRange.getClass();
                objP6 = new rv2(new vtj(arrayList, fArrCopyOfRange), nt2Var);
                fetVar.o0(objP6);
            }
            rv2 rv2Var = (rv2) objP6;
            Object value = ((hgk0) rv2Var.c).getValue();
            boolean z6 = i4 == 2048;
            Object objP7 = fetVar.P();
            if (z6 || objP7 == cl5Var) {
                objP7 = new cm3(rv2Var, function0, null, (byte) 8);
                fetVar.o0(objP7);
            }
            m0x0.t(fetVar, value, (Function2) objP7);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            Object objP8 = fetVar.P();
            if (objP8 == cl5Var) {
                objP8 = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP8;
            boolean zG = (i4 == 2048) | fetVar.g(l7m0VarY4);
            Object objP9 = fetVar.P();
            if (zG || objP9 == cl5Var) {
                objP9 = new mc((Object) l7m0VarY4, (Object) function0, (byte) 29);
                fetVar.o0(objP9);
            }
            zq8.a(0, fetVar, y860.W(n0qVar, gy40Var, null, false, null, (Function0) objP9, 28));
            mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.h);
            Object objP10 = fetVar.P();
            if (objP10 == cl5Var) {
                objP10 = new or3((byte) 21);
                fetVar.o0(objP10);
            }
            mm40 mm40VarA = pai0.a(mm40VarB, false, (Function1) objP10);
            boolean zBooleanValue = ((Boolean) l7m0VarY.getValue()).booleanValue();
            zsf zsfVar = ihn.f14788a;
            uts0 uts0VarM0 = ro4.m0(300, 0, zsfVar, 2);
            Object objP11 = fetVar.P();
            byte b3 = 19;
            if (objP11 == cl5Var) {
                objP11 = new or3(b3);
                fetVar.o0(objP11);
            }
            pzn pznVarJ = kzn.j(uts0VarM0, (Function1) objP11);
            uts0 uts0VarM1 = ro4.m0(300, 0, zsfVar, 2);
            Object objP12 = fetVar.P();
            if (objP12 == cl5Var) {
                objP12 = new or3(b3);
                fetVar.o0(objP12);
            }
            b34.h(zBooleanValue, mm40VarA, pznVarJ, kzn.l(uts0VarM1, (Function1) objP12), null, u1c.M(1413470615, new i9x(ujv0Var, pz40VarU, rv2Var, l7m0VarY3, xdrVar3, xdrVar2, ugdVar2, ugdVar3, xdrVar, ugdVar), fetVar), fetVar, 196608, 16);
            if (((Boolean) l7m0VarY2.getValue()).booleanValue()) {
                fetVar.e0(263861850);
                Unit unit = Unit.f46060a;
                Object objP13 = fetVar.P();
                if (objP13 == cl5Var) {
                    objP13 = i54.f;
                    fetVar.o0(objP13);
                }
                zq8.a(0, fetVar, fnn0.a(n0qVar, unit, (PointerInputEventHandler) objP13));
                fetVar.r(false);
            } else {
                fetVar.e0(264224147);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nf4(mm40Var, ujv0Var, l7m0Var, function0, ugdVar, ugdVar2, ugdVar3, xdrVar, xdrVar2, xdrVar3, i2, (byte) 0);
        }
    }

    public static final void f(mm40 mm40Var, ona onaVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        int i3;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(-1256768882);
        if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(onaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new mna(function1, onaVar, b2);
                fetVar2.o0(objP);
            }
            mm40 mm40VarF = phu0.F(mm40Var2, null, null, false, null, (Function0) objP, fetVar2, (i3 & 14) | 24960, 5);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarF);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 56.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), jd8.n);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            lgb.t(o7k0.n(jm40Var, 32.0f), onaVar.b, gqw0.B, fetVar2, 3072);
            fetVar2.r(true);
            mm40 mm40VarD2 = o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 24.0f), 1.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            String str = onaVar.c;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, textPrimary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.e(), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nna(mm40Var, onaVar, function1, i2, (byte) 0);
        }
    }

    public static final void g(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-996633657);
        byte b2 = 2;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 56.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            vqm vqmVar = vqm.f37862a;
            zq8.a(0, fetVar, xbc.c0(mm40VarE2, vbc.d0(vqmVar, fetVar, 6, 0)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 6.0f, 5), 48.0f), 12.0f)), vbc.d0(vqmVar, fetVar, 6, 0), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i2, b2);
        }
    }

    public static final void h(mm40 mm40Var, dsm dsmVar, Function1 function1, Function0 function0, Function0 function2, fet fetVar, int i2) {
        fet fetVar2;
        dsm dsmVar2;
        Object m0xVar;
        String str;
        fetVar.g0(2051880252);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(dsmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var, 64.0f), 56.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
            int i4 = i3 & 112;
            boolean z = ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | (i4 == 32) | ((57344 & i3) == 16384);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                dsmVar2 = dsmVar;
                r3l0 r3l0Var = new r3l0(dsmVar2, function0, function2, function1, (byte) 3);
                fetVar.o0(r3l0Var);
                objP = r3l0Var;
            } else {
                dsmVar2 = dsmVar;
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
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
            boolean z3 = i4 == 32;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                if (dsmVar2 instanceof asm) {
                    m0xVar = new m0x(R.drawable.ic_glyph_all, null, 6);
                } else if (dsmVar2 instanceof bsm) {
                    m0xVar = new m0x(R.drawable.ic_glyph_filter_line_inactive, null, 6);
                } else {
                    if (!(dsmVar2 instanceof csm)) {
                        t9f.b();
                        return;
                    }
                    m0xVar = ((csm) dsmVar2).f4897a.b;
                }
                objP2 = m0xVar;
                fetVar.o0(objP2);
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1256495930, new o9b((o0x) objP2, (byte) 7), fetVar), fetVar, 56);
            boolean z4 = i4 == 32;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                if (dsmVar2 instanceof asm) {
                    str = ((asm) dsmVar2).f1397a;
                } else if (dsmVar2 instanceof bsm) {
                    str = ((bsm) dsmVar2).f3137a;
                } else {
                    if (!(dsmVar2 instanceof csm)) {
                        t9f.b();
                        return;
                    }
                    str = ((csm) dsmVar2).f4897a.c;
                }
                objP3 = str;
                fetVar.o0(objP3);
            }
            String str2 = (String) objP3;
            mm40 mm40VarE2 = s5x0.K(jm40.b, 2.0f, 4.0f).e(o7k0.c);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            kc5.N(str2, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, null, 0L, qmk.o, g1t0.e().f42262a.b, null, null, 0L, zx7Var, 2, false, 2, 0, false, null, g1t0.e(), 0.0f, fetVar, 0, 1600512, 0, 3055418);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s3l0(mm40Var, dsmVar, function1, function0, function2, i2, (byte) 3);
        }
    }

    public static final void i(pib pibVar, FixedWebView fixedWebView, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        Function1 function2;
        FixedWebView fixedWebView2;
        pib pibVar2 = pibVar;
        pibVar2.getClass();
        fixedWebView.getClass();
        function1.getClass();
        fetVar.g0(-716973322);
        int i3 = i2 | (fetVar.g(pibVar2) ? 4 : 2) | (fetVar.i(fixedWebView) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarW = o050.W(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            imm immVar = pibVar2.a().f9343a;
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new n19(function1, (byte) 29);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            fetVar2 = fetVar;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
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
            int i4 = FixedWebView.e;
            int i5 = i3 >> 3;
            fixedWebView2 = fixedWebView;
            k(fixedWebView2, fetVar2, (i5 & 14) | 8);
            pibVar2 = pibVar;
            if (pibVar2 instanceof oib) {
                fetVar2.e0(992654530);
                A(0, fetVar2);
                fetVar2.r(false);
                function2 = function1;
            } else if (pibVar2 instanceof nib) {
                fetVar2.e0(992656012);
                function2 = function1;
                r(((nib) pibVar2).b, function2, fetVar2, i5 & 112);
                fetVar2.r(false);
            } else {
                function2 = function1;
                if (!(pibVar2 instanceof mib)) {
                    throw b1j.f(992653209, fetVar2, false);
                }
                fetVar2.e0(992658806);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            function2 = function1;
            fixedWebView2 = fixedWebView;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(pibVar2, fixedWebView2, function2, i2, (byte) 1);
        }
    }

    public static final void j(u7a0 u7a0Var, fet fetVar, int i2) {
        fetVar.g0(-911154439);
        int i3 = i2 | (fetVar.g(u7a0Var) ? 4 : 2);
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            D(0, fetVar);
            mbc.o(agi0.f827a, null, false, fetVar, 6, 6);
            zcl zclVar = qmk.f28987a;
            byte b2 = 7;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 16.0f, 7);
            boolean z = (i3 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new yr80(u7a0Var, b2);
                fetVar.o0(objP);
            }
            b8k0.e(null, null, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, 507);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cz90(u7a0Var, i2, (byte) 10);
        }
    }

    public static final void k(FixedWebView fixedWebView, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(666131585);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(fixedWebView) : fetVar.i(fixedWebView) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && fetVar.i(fixedWebView));
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new eib(fixedWebView, b2);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            dwi0.b((Function1) objP, n0qVar, null, fetVar2, 48, 4);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fib(fixedWebView, i2, b2);
        }
    }

    public static final void l(ib50 ib50Var, aig aigVar, fet fetVar, int i2) {
        aig aigVar2 = aigVar;
        ib50Var.getClass();
        aigVar2.getClass();
        fetVar.g0(875064883);
        int i3 = (fetVar.i(ib50Var) ? 4 : 2) | i2 | (fetVar.i(aigVar2) ? 32 : 16);
        byte b2 = 18;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            int i4 = aig.x;
            byte b3 = 8;
            int i5 = ((i3 >> 3) & 14) | 8;
            pz40 pz40VarY = aigVar.y(fetVar);
            i4 i4Var = ((xhg) pz40VarY.getValue()).b.f2705a;
            int i6 = ((xhg) pz40VarY.getValue()).b.e;
            boolean zG = fetVar.g(i4Var);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new e8g(i4Var, b3);
                fetVar.o0(objP);
            }
            kwj kwjVarB = zk80.b(i6, (Function0) objP, fetVar, 0, 2);
            Object obj2 = ((xhg) pz40VarY.getValue()).b.d;
            Object obj3 = ((xhg) pz40VarY.getValue()).b.c;
            rzg0 rzg0VarI = tfx.I(ib50Var, fetVar);
            boolean zG2 = fetVar.g(obj2) | fetVar.g(obj3);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                objP2 = new v4f(obj2, obj3, b2);
                fetVar.o0(objP2);
            }
            pv40 pv40VarG = p7x.G(rzg0VarI, null, null, (Function1) objP2, fetVar, 6);
            mm40 mm40VarE0 = o2e.e0(i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), "CYBER_CHAMPS_MAIN_SCREEN_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            xhg xhgVar = (xhg) pz40VarY.getValue();
            xhgVar.getClass();
            int i7 = 8 | (i5 & 14);
            vdb.l(aigVar2, xhgVar, fetVar, i7);
            vdb.m(aigVar2, i4Var, kwjVarB, xhgVar.b.b, fetVar, i7);
            xbc.g(kwjVarB, pv40VarG, i4Var, ib50Var, fetVar, 32774 | ((i3 << 12) & 57344));
            fetVar.r(true);
            aigVar2 = aigVar;
            xbc.h(kwjVarB, i6, i4Var, pv40VarG, aigVar2, fetVar, 32768 | ((i3 << 9) & 57344));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eod(ib50Var, aigVar2, i2, (byte) 19);
        }
    }

    public static final void m(mm40 mm40Var, nsm nsmVar, float f2, Function1 function1, Function0 function0, Function0 function2, xdr xdrVar, fet fetVar, int i2) {
        ngk0 ngk0Var;
        pz40 pz40Var;
        int i3;
        int i4;
        qw3 qw3Var;
        Object v3l0Var;
        fetVar.g0(749043996);
        int i5 = (i2 & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i5 |= fetVar.g(nsmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= fetVar.d(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= fetVar.i(xdrVar) ? 1048576 : 524288;
        }
        if (fetVar.U(i5 & 1, (599187 & i5) != 599186)) {
            boolean z = (i5 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                lc00 lc00VarB = kotlin.collections.a.b();
                String str = nsmVar.b;
                str.getClass();
                lc00VarB.add(new asm(str));
                a4x<usm> a4xVar = nsmVar.c;
                ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                for (usm usmVar : a4xVar) {
                    usmVar.getClass();
                    arrayList.add(new csm(usmVar));
                }
                lc00VarB.addAll(arrayList);
                String str2 = nsmVar.f24057a;
                str2.getClass();
                lc00VarB.add(new bsm(str2));
                objP = dyb.o0(kotlin.collections.a.a(lc00VarB));
                fetVar.o0(objP);
            }
            a4x a4xVar2 = (a4x) objP;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new ngk0();
                fetVar.o0(objP2);
            }
            ngk0 ngk0Var2 = (ngk0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(0L);
                fetVar.o0(objP3);
            }
            pz40 pz40Var2 = (pz40) objP3;
            if (xdrVar != null) {
                i4 = 3670016;
                fetVar.e0(-1879450094);
                boolean zG = ((i5 & 3670016) == 1048576) | fetVar.g(xczVarA);
                Object objP4 = fetVar.P();
                if (zG || objP4 == cl5Var) {
                    ngk0Var = ngk0Var2;
                    pz40Var = pz40Var2;
                    i3 = 131072;
                    v3l0Var = new v3l0(pz40Var, xczVarA, ngk0Var, xdrVar, null, (byte) 3);
                    fetVar.o0(v3l0Var);
                } else {
                    ngk0Var = ngk0Var2;
                    pz40Var = pz40Var2;
                    i3 = 131072;
                    v3l0Var = objP4;
                }
                m0x0.t(fetVar, xczVarA, (Function2) v3l0Var);
                fetVar.r(false);
            } else {
                i5 = i5;
                xczVarA = xczVarA;
                ngk0Var = ngk0Var2;
                cl5Var = cl5Var;
                pz40Var = pz40Var2;
                i3 = 131072;
                i4 = 3670016;
                fetVar.e0(-1879092602);
                fetVar.r(false);
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 64.0f), 1.0f);
            lh80 lh80VarT = s5x0.t(f2, 0.0f, 2);
            qw3 qw3Var2 = new qw3(4.0f, true, new jf4((byte) 14));
            boolean zG2 = fetVar.g(a4xVar2) | ((i5 & i4) == 1048576) | ((i5 & 7168) == 2048) | ((57344 & i5) == 16384) | ((i5 & 458752) == i3);
            Object objP5 = fetVar.P();
            if (zG2 || objP5 == cl5Var) {
                qw3Var = qw3Var2;
                Object q3l0Var = new q3l0(a4xVar2, xdrVar, function1, function0, function2, ngk0Var, pz40Var, (byte) 3);
                fetVar.o0(q3l0Var);
                objP5 = q3l0Var;
            } else {
                qw3Var = qw3Var2;
            }
            b8k0.f(mm40VarD, xczVarA, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP5, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kb3(mm40Var, nsmVar, f2, function1, function0, function2, xdrVar, i2, (byte) 5);
        }
    }

    public static final void n(mm40 mm40Var, gml gmlVar, Function1 function1, Function2 function2, fet fetVar, int i2, int i3) {
        int i4 = i3 & 4;
        cl5 cl5Var = ukd.f35823a;
        if (i4 != 0) {
            Object objP = fetVar.P();
            if (objP == cl5Var) {
                objP = new xjl((byte) 3);
                fetVar.o0(objP);
            }
            function1 = (Function1) objP;
        }
        Function1 function3 = function1;
        if ((i3 & 8) != 0) {
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new j2l((byte) 15);
                fetVar.o0(objP2);
            }
            function2 = (Function2) objP2;
        }
        Function2 function4 = function2;
        if (gmlVar instanceof eml) {
            fetVar.e0(-170760951);
            o(mm40Var, (eml) gmlVar, function3, function4, fetVar, i2 & 8190);
            fetVar.r(false);
        } else {
            if (!gmlVar.equals(fml.f9788a)) {
                throw b1j.f(-1252436560, fetVar, false);
            }
            fetVar.e0(-170469427);
            p(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
    }

    public static final void o(mm40 mm40Var, eml emlVar, Function1 function1, Function2 function2, fet fetVar, int i2) {
        int i3;
        Function1 function3;
        jr8 jr8Var;
        jm40 jm40Var;
        cl5 cl5Var;
        int i4;
        char c2;
        cl5 cl5Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(793692918);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(emlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        int i5 = i3;
        if (fetVar2.U(i5 & 1, (i5 & 1171) != 1170)) {
            Object objP = fetVar2.P();
            cl5 cl5Var3 = ukd.f35823a;
            if (objP == cl5Var3) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(o7k0.e(mm40Var, 230.0f), vgg0.a(16.0f));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            n0q n0qVar = o7k0.c;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var3) {
                objP2 = new wil(pz40Var, b2);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(pai0.a(n0qVar, false, (Function1) objP2), "IMAGE_GAME_CARD_POPULAR");
            n0x n0xVar = emlVar.d;
            String str = emlVar.j;
            m0x m0xVar = emlVar.e;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var3) {
                objP3 = new cml(pz40Var, (byte) 0);
                fetVar2.o0(objP3);
            }
            Function0 function0 = (Function0) objP3;
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var3) {
                objP4 = new cml(pz40Var, (byte) 1);
                fetVar2.o0(objP4);
            }
            Function0 function4 = (Function0) objP4;
            byte b3 = 0;
            j0x.b(lv00.T(n0xVar, m0xVar, function0, function4, fetVar, 3456, 0), null, mm40VarE0, null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
            boolean z2 = emlVar.f;
            byte b4 = 8;
            jr8 jr8Var2 = jr8.f16991a;
            jm40 jm40Var2 = jm40.b;
            if (z2) {
                fetVar.e0(-1296834064);
                m0x m0xVar2 = emlVar.i ? emlVar.g : emlVar.h;
                fetVar.e0(-1296624845);
                pm80 pm80VarF = a8k0.F(m0xVar2.f20977a, 0, fetVar);
                fetVar.r(false);
                mm40 mm40VarQ = ffb0.Q(o7k0.n(jr8Var2.b(jm40Var2, gqw0.c), 32.0f), -8.0f, 8.0f);
                zcl zclVar2 = qmk.f;
                mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarQ);
                StaticColors staticColors = StaticColors.INSTANCE;
                mm40 mm40VarQ2 = i120.Q(mm40VarE, staticColors.m70getBlack200d7_KjU(), jd8.n);
                boolean z3 = ((i5 & 7168) == 2048) | ((i5 & 112) == 32);
                Object objP5 = fetVar.P();
                if (z3) {
                    cl5Var2 = cl5Var3;
                } else {
                    cl5Var2 = cl5Var3;
                    if (objP5 == cl5Var2) {
                    }
                    cl5Var = cl5Var2;
                    jr8Var = jr8Var2;
                    c2 = ' ';
                    jm40Var = jm40Var2;
                    i4 = i5;
                    dww.c(pm80VarF, null, o2e.e0(s5x0.J(y860.W(mm40VarQ2, null, null, false, null, (Function0) objP5, 28), 4.0f), "ICON_GAME_CARD_POPULAR"), staticColors.m123getWhite0d7_KjU(), fetVar, 56, 0);
                    fetVar.r(false);
                }
                objP5 = new lrk(function2, emlVar, b4);
                fetVar.o0(objP5);
                cl5Var = cl5Var2;
                jr8Var = jr8Var2;
                c2 = ' ';
                jm40Var = jm40Var2;
                i4 = i5;
                dww.c(pm80VarF, null, o2e.e0(s5x0.J(y860.W(mm40VarQ2, null, null, false, null, (Function0) objP5, 28), 4.0f), "ICON_GAME_CARD_POPULAR"), staticColors.m123getWhite0d7_KjU(), fetVar, 56, 0);
                fetVar.r(false);
            } else {
                jr8Var = jr8Var2;
                jm40Var = jm40Var2;
                cl5Var = cl5Var3;
                i4 = i5;
                c2 = ' ';
                fetVar.e0(-1295602062);
                fetVar.r(false);
            }
            mm40 mm40VarB = jr8Var.b(o7k0.d(jm40Var, 1.0f), gqw0.h);
            if (emlVar.k) {
                StaticColors staticColors2 = StaticColors.INSTANCE;
                mm40VarB = i120.P(mm40VarB, yk5.n(q3d.j(new y3d(staticColors2.m121getTransparent0d7_KjU()), new y3d(staticColors2.m75getBlack600d7_KjU())), 0.0f, Float.POSITIVE_INFINITY, 8), null, 6);
            }
            mm40 mm40VarM = s5x0.M(mm40VarB, 8.0f, 6.0f, 8.0f, 8.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarM);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            fetVar.e0(-186323982);
            mm40 mm40VarE1 = o2e.e0(o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), "TITLE_GAME_CARD_POPULAR");
            String str2 = emlVar.b;
            StaticColors staticColors3 = StaticColors.INSTANCE;
            jm40 jm40Var3 = jm40Var;
            int i6 = i4;
            v8q0.a(str2, mm40VarE1, staticColors3.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.s, null, j1t0.f15753a, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 48, 24960, 110584);
            fet fetVar3 = fetVar;
            fetVar3.r(false);
            if (emlVar.c != null) {
                fetVar3.e0(-185812172);
                v8q0.a(emlVar.c, o2e.e0(s5x0.N(o7k0.w(o7k0.d(jm40Var3, 1.0f), null, false, 3), 0.0f, 4.0f, 0.0f, 0.0f, 13), "SUBTITLE_GAME_CARD_POPULAR"), staticColors3.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 110584);
                fetVar3 = fetVar;
                fetVar3.r(false);
            } else {
                fetVar3.e0(-185317784);
                fetVar3.r(false);
            }
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var3, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            boolean zG = fetVar3.g(str);
            Object objP6 = fetVar3.P();
            cl5 cl5Var4 = cl5Var;
            if (zG || objP6 == cl5Var4) {
                wul wulVar = new wul(oul.e, oe9.c, new ue9(str), true, false, false);
                fetVar3.o0(wulVar);
                objP6 = wulVar;
            }
            wul wulVar2 = (wul) objP6;
            boolean z4 = ((i6 & 896) == 256) | ((i6 & 112) == 32);
            Object objP7 = fetVar3.P();
            if (z4 || objP7 == cl5Var4) {
                function3 = function1;
                objP7 = new dml(function3, emlVar, b3);
                fetVar3.o0(objP7);
            } else {
                function3 = function1;
            }
            qzb.n(mm40VarN, wulVar2, (Function0) objP7, fetVar, 0, 0);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            function3 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i(mm40Var, (Object) emlVar, function3, (wdr) function2, i2, (byte) 6);
        }
    }

    public static final void p(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(1259036422);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar, xbc.c0(lgb.J(o7k0.e(mm40Var, 230.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i2, b2);
        }
    }

    public static final void q(u11 u11Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1806661190);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(u11Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
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
            mm40 mm40VarE0 = o2e.e0(n0qVar, "AGGREGATOR_GIFTS_LAZY_COLUMN");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 28.0f, 7), fetVar);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new k1(u11Var, function1, (byte) 27);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE0, null, ch80VarG, null, null, null, false, null, (Function1) objP, fetVar, 6, 506);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) u11Var, (Object) function1, i2, (byte) 7);
        }
    }

    public static final void r(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1289899901);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
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
            mm40 mm40VarY = o7k0.y(jm40.b, null, 3);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dib(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarY, mdmVar, false, (Function0) objP, fetVar, ((i3 << 3) & 112) | 6, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wo6(mdmVar, function1, i2, b3);
        }
    }

    public static final void s(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1302550919);
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
                objP = new i0a0(function1, (byte) 8);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, (byte) 17);
        }
    }

    public static final void t(s11 s11Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1496600173);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(s11Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Boolean boolValueOf = Boolean.valueOf(s11Var.c);
            int i4 = i3 & 14;
            int i5 = i3 & 112;
            boolean zG = (i4 == 4) | fetVar.g(xczVarA) | (i5 == 32);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new kz(s11Var, xczVarA, function1, (yje) null);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP);
            mm40 mm40VarE0 = o2e.e0(jm40.b, "AGGREGATOR_GIFTS_LAZY_COLUMN_CARD");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(xfn.a(fetVar).c, 4.0f, xfn.a(fetVar).c, 28.0f, fetVar);
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            boolean z = (i4 == 4) | (i5 == 32);
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new k1(s11Var, function1, (byte) 26);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarE0, xczVarA, ch80VarF, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 6, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) s11Var, (Object) function1, i2, (byte) 3);
        }
    }

    public static final void u(w11 w11Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-428061230);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(w11Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (w11Var != null) {
                if (w11Var instanceof s11) {
                    fetVar.e0(-614018855);
                    t((s11) w11Var, function1, fetVar, i3 & 126);
                    fetVar.r(false);
                } else if (w11Var instanceof t11) {
                    fetVar.e0(-613920709);
                    v((t11) w11Var, function1, fetVar, i3 & 126);
                    fetVar.r(false);
                } else if (w11Var instanceof v11) {
                    fetVar.e0(-613824485);
                    w((v11) w11Var, function1, fetVar, i3 & 126);
                    fetVar.r(false);
                } else if (w11Var instanceof u11) {
                    fetVar.e0(-613716140);
                    q((u11) w11Var, function1, fetVar, i3 & 126);
                    fetVar.r(false);
                }
            }
            throw b1j.f(950022659, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) w11Var, (Object) function1, i2, (byte) 6);
        }
    }

    public static final void v(t11 t11Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(271093755);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(t11Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
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
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7);
            mdm mdmVar = t11Var.c;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new nr0(function1, (byte) 6);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x(t11Var, function1, i2, b2);
        }
    }

    public static final void w(v11 v11Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1488516017);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(v11Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
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
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7);
            mdm mdmVar = v11Var.c;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new nr0(function1, (byte) 7);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) v11Var, (Object) function1, i2, (byte) 5);
        }
    }

    public static final void x(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1173875744);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rsm0.w(R.string.last_fights, 0, fetVar), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), ((Boolean) l7m0Var.getValue()).booleanValue(), null);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new xwy(function1, (byte) 7);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i2, (byte) 2);
        }
    }

    public static final void y(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        boolean z;
        boolean z2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-352979109);
        byte b2 = 2;
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object[] objArr = new Object[0];
            int i4 = i3 & 14;
            boolean z3 = i4 == 4;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z3 || objP == obj) {
                objP = new ziw(l7m0Var, (byte) 17);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            zcl zclVar = qmk.f28987a;
            float fB = pkd.b(8.0f, fetVar);
            Object[] objArr2 = new Object[0];
            boolean zG = fetVar.g(xczVarA) | fetVar.d(fB);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new ckg(xczVarA, fB, b2);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarX = yyw.X(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n), null, fetVar, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarX);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z4) {
                fetVar.l(function0);
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
            int i5 = i3 & 112;
            x(l7m0VarY2, function1, fetVar, i5);
            nyy nyyVar = (nyy) l7m0VarY.getValue();
            if (nyyVar != null) {
                if (nyyVar instanceof lyy) {
                    fetVar.e0(1834593833);
                    Object[] objArr3 = new Object[0];
                    boolean z5 = i4 == 4;
                    Object objP3 = fetVar.P();
                    if (z5 || objP3 == obj) {
                        objP3 = new ziw(l7m0Var, (byte) 18);
                        fetVar.o0(objP3);
                    }
                    z((i3 << 3) & 896, fetVar, xczVarA, v3c.Y(objArr3, (Function0) objP3, fetVar), function1);
                    fetVar.r(false);
                    z2 = true;
                } else if (nyyVar instanceof myy) {
                    fetVar.e0(1834889666);
                    mm40 mm40VarR = knm0.r(n0qVar);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarR);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(function0);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, shdVar);
                    jpm0.o(fetVar, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC1, shdVar4);
                    mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
                    mdm mdmVar = ((myy) nyyVar).f22626a;
                    boolean z6 = i5 == 32;
                    Object objP4 = fetVar.P();
                    if (z6 || objP4 == obj) {
                        objP4 = new xwy(function1, (byte) 6);
                        fetVar.o0(objP4);
                    }
                    jcb.l(mm40VarB, mdmVar, false, (Function0) objP4, fetVar, 0, 4);
                    z2 = true;
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    z = false;
                }
                fetVar.r(z2);
            } else {
                z = false;
            }
            throw b1j.f(-1187747522, fetVar, z);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i2, (byte) 1);
        }
    }

    public static final void z(int i2, fet fetVar, xcz xczVar, l7m0 l7m0Var, Function1 function1) {
        int i3;
        fetVar.g0(-1455153210);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(xczVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3;
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            int i5 = i4 << 3;
            b8k0.d(n0qVar, xczVar, l7m0Var, null, knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, 28.0f, 5), fetVar), false, null, u1c.M(2079855876, new gn(function1, (byte) 21), fetVar), fetVar, (i5 & 112) | 100663302 | (i5 & 896), 216);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kyy(xczVar, l7m0Var, function1, i2);
        }
    }
}
