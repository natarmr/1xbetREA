package a;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.javax.sip.message.Response;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes.dex */
public abstract class y9a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f42235a = new ugd(-1180568212, false, new wgd(25));
    public static final ugd b = new ugd(-1065648545, false, new ehd(2));
    public static final ugd c = new ugd(-1301293701, false, new ihd(11));
    public static final ugd d = new ugd(-650727129, false, new mhd(27));
    public static final ugd e = new ugd(-1480029570, false, new ohd(5));
    public static final byte[] f = new byte[0];
    public static final StackTraceElement[] g = new StackTraceElement[0];
    public static final jcq0 h = new jcq0(0, new long[0], new Object[0]);
    public static Method i;
    public static Method j;
    public static boolean k;

    public static final void A(Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1172962446);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.i(function1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            F(6, fetVar, false);
            n0q n0qVar = o7k0.c;
            zfn zfnVar = zaq0.b;
            mm40 mm40VarS = o050.S(i120.Q(n0qVar, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            kpb.j(jr8.f16991a.b(jm40.b, gqw0.e), new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), 3), fetVar, 0, 0);
            B(false, function1, fetVar, ((i3 << 3) & 112) | 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wt9(function1, i2, b2);
        }
    }

    public static final void B(boolean z, Function1 function1, fet fetVar, int i2) {
        int i3;
        long secondary;
        long backgroundContent;
        fetVar.g0(1891485312);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar.h(z) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (z) {
                fetVar.e0(-731855435);
                secondary = afn0.p(fetVar).m123getWhite0d7_KjU();
                fetVar.r(false);
            } else {
                fetVar.e0(-731804905);
                secondary = afn0.m(fetVar).getSecondary();
                fetVar.r(false);
            }
            if (z) {
                fetVar.e0(-731715935);
                fetVar.r(false);
                backgroundContent = y3d.f;
            } else {
                fetVar.e0(-731676689);
                backgroundContent = afn0.m(fetVar).getBackgroundContent();
                fetVar.r(false);
            }
            mm40 mm40VarW = o050.W(o7k0.d(jm40.b, 1.0f));
            imm immVar = new imm(new ilm(secondary), new plm(rsm0.w(R.string.promo_jackpot, 0, fetVar), secondary, fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, secondary))), backgroundContent, false, null);
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new u9x(function1, (byte) 28);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i4 == 32;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new i1y(function1, (byte) 10);
                fetVar.o0(objP2);
            }
            hlm.c(mm40VarW, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 0, 0, 4052);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ooh(z, function1, i2);
        }
    }

    public static final void C(v6y v6yVar, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1952225007);
        int i3 = i2 | (fetVar2.g(v6yVar) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.g(mm40VarD, 48.0f, 0.0f, 2), 4.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            mm40 mm40VarM = s5x0.M(ohs0.i(fetVar2, mm40VarC0, gqw0.v, 1.0f, true), 12.0f, 10.0f, 16.0f, 10.0f);
            String strW = rsm0.w(v6yVar.f36898a, 0, fetVar2);
            y9q0 y9q0Var = new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109);
            zfn zfnVar = m8m0.f21378a;
            v8q0.a(strW, mm40VarM, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, y9q0Var, fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            e(s5x0.N(jm40Var, 0.0f, 6.0f, 8.0f, 6.0f, 1), v6yVar.b, v6yVar.c, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xxv(v6yVar, i2, (byte) 23);
        }
    }

    public static final void D(String str, ArrayList arrayList, fet fetVar, int i2) {
        fetVar.g0(-428092537);
        int i3 = (fetVar.g(str) ? 4 : 2) | i2 | (fetVar.g(arrayList) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.u(jm40Var, 0.0f, 400.0f, 1), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            k7x.a(str, null, o7k0.d(jm40Var, 1.0f), gqw0.Z, null, fetVar, (i3 & 14) | 1573296, 1976);
            mm40 mm40VarM = s5x0.M(o7k0.d(jm40Var, 1.0f), 16.0f, 16.0f, 20.0f, 16.0f);
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
            fetVar.e0(241692374);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C((v6y) it.next(), fetVar, 0);
            }
            ohs0.x(fetVar, false, true, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(str, arrayList, i2, (byte) 2);
        }
    }

    public static final void E(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-893007610);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            e8y e8yVar = (e8y) l7m0Var.getValue();
            if (Intrinsics.d(e8yVar, d8y.f5673a)) {
                fetVar.e0(813151504);
                A(function1, fetVar, (i3 >> 3) & 14);
                fetVar.r(false);
            } else if (e8yVar instanceof c8y) {
                fetVar.e0(813154048);
                z((c8y) e8yVar, function1, fetVar, i3 & 112);
                fetVar.r(false);
            } else {
                if (!(e8yVar instanceof b8y)) {
                    throw b1j.f(813149620, fetVar, false);
                }
                fetVar.e0(813158139);
                y((b8y) e8yVar, function1, fetVar, (i3 & 112) | 8);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i2, b2);
        }
    }

    public static final void F(int i2, fet fetVar, boolean z) {
        fet fetVar2;
        fetVar.g0(-757875879);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            View view = (View) fetVar.k(dy2.f);
            Configuration configuration = (Configuration) fetVar.k(dy2.f6873a);
            boolean zC = pkd.c(fetVar);
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(zC);
            boolean zI = fetVar.i(view) | fetVar.h(zC);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new cj((byte) 3, (Object) view, z, zC);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            fetVar2 = fetVar;
            s0x.c(6, fetVar2, null, boolValueOf, boolValueOf2, configuration, function1);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new obg((byte) 15, i2, z);
        }
    }

    public static final void G(mdm mdmVar, fet fetVar, int i2) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-113965502);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fetVar.b0(-2146663467, Integer.valueOf(mdmVar.f21603a));
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarH = o7k0.h(mm40VarD, 220.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, null, fetVar2, (i3 << 3) & 112, 13);
            fetVar2.r(true);
            fetVar2.r(false);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vl0(mdmVar2, i2, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:72:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:76:0x0302  */
    /* JADX WARN: Code duplicated, block: B:79:0x033a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0342  */
    public static final void H(mm40 mm40Var, ia40 ia40Var, uz40 uz40Var, fet fetVar, int i2) {
        uz40 uz40Var2;
        mm40 mm40Var2;
        int i3;
        boolean z;
        Object objP;
        boolean z2;
        Object objP2;
        fet fetVar2 = fetVar;
        uz40Var.getClass();
        fetVar2.g0(1158155215);
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            i4 |= fetVar2.g(ia40Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= (i2 & 512) == 0 ? fetVar2.g(uz40Var) : fetVar2.i(uz40Var) ? 256 : 128;
        }
        if (fetVar2.U(i4 & 1, (i4 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            mm40 mm40VarD2 = o7k0.d(s5x0.N(jm40Var, 12.0f, 0.0f, 4.0f, 0.0f, 10), 1.0f);
            int i5 = i4 & 896;
            boolean z4 = i5 == 256 || ((i4 & 512) != 0 && fetVar2.i(uz40Var));
            Object objP3 = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP3 == cl5Var) {
                objP3 = new ca40(uz40Var, (byte) 0);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarO = feb.O(mm40VarD2, (Function0) objP3);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int i6 = i4;
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarO);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            zfn zfnVar = zaq0.b;
            long separator60 = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.S(mm40VarN, 1.0f, separator60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarJ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            n0q n0qVar = o7k0.c;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar3 = qmk.e;
            zq8.a(0, fetVar2, i120.Q(n0qVar, background, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)));
            ba40 ba40Var = ia40Var.b;
            byte b2 = 1;
            lgb.w(lgb.J(o7k0.n(jm40Var, 32.0f), vgg0.a(8.0f)), jr8.f16991a.b(o7k0.n(jm40Var, 22.0f), gqw0.e), ba40Var.b, new m0x(R.drawable.ic_glyph_cyber_gamepad, null, 6), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary60(), null, null, gqw0.A, fetVar2, 12582912, 96);
            fetVar2.r(true);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(1.0f, mm40VarN2, true);
            String str = ba40Var.f2241a;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            mm40Var2 = jm40Var;
            v8q0.a(str, mm40VarA, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.i(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            if (ba40Var.i.isEmpty()) {
                fetVar2.e0(-1061174503);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1061346522);
                String upperCase = ia40Var.c.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                j6n.h(upperCase, kro0.f18776a, null, 0, 0, fetVar2, 48, 28);
                fetVar2.r(false);
            }
            byte b3 = 7;
            zb zbVar = new zb(null, null, 7);
            uz40Var2 = uz40Var;
            boolean zBooleanValue = ((Boolean) ((hgk0) uz40Var2.d).getValue()).booleanValue();
            if (i5 != 256) {
                i3 = i6;
                if ((i3 & 512) == 0 || !fetVar2.i(uz40Var2)) {
                    z = false;
                }
                objP = fetVar2.P();
                if (z || objP == cl5Var) {
                    objP = new ca40(uz40Var2, b2);
                    fetVar2.o0(objP);
                }
                acb.n(zbVar, zBooleanValue, (Function0) objP, null, fetVar2, 0, 8);
                fetVar2.r(true);
                mm40 mm40VarL = s5x0.L(mm40Var2, 12.0f, 0.0f, 2);
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP2 = fetVar2.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new b530(ia40Var, b3);
                    fetVar2.o0(objP2);
                }
                mm40 mm40VarT = i4w0.T(mm40VarL, (Function1) objP2);
                thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
                int iHashCode4 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM4 = fetVar2.m();
                mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarT);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA2, shdVar);
                jpm0.o(fetVar2, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC3, shdVar4);
                m2x.b(0, fetVar2, zhg0Var.a(1.0f, mm40Var2, true), ba40Var.c, ba40Var.d);
                m2x.b(0, fetVar2, zhg0Var.a(1.0f, mm40Var2, true), ba40Var.e, ba40Var.f);
                fetVar2.r(true);
                fetVar2.r(true);
            } else {
                i3 = i6;
            }
            z = true;
            objP = fetVar2.P();
            if (z) {
                objP = new ca40(uz40Var2, b2);
                fetVar2.o0(objP);
            } else {
                objP = new ca40(uz40Var2, b2);
                fetVar2.o0(objP);
            }
            acb.n(zbVar, zBooleanValue, (Function0) objP, null, fetVar2, 0, 8);
            fetVar2.r(true);
            mm40 mm40VarL2 = s5x0.L(mm40Var2, 12.0f, 0.0f, 2);
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP2 = fetVar2.P();
            if (z2) {
                objP2 = new b530(ia40Var, b3);
                fetVar2.o0(objP2);
            } else {
                objP2 = new b530(ia40Var, b3);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarT2 = i4w0.T(mm40VarL2, (Function1) objP2);
            thg0 thg0VarA3 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode5 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM5 = fetVar2.m();
            mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarT2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA3, shdVar);
            jpm0.o(fetVar2, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC4, shdVar4);
            m2x.b(0, fetVar2, zhg0Var.a(1.0f, mm40Var2, true), ba40Var.c, ba40Var.d);
            m2x.b(0, fetVar2, zhg0Var.a(1.0f, mm40Var2, true), ba40Var.e, ba40Var.f);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            uz40Var2 = uz40Var;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var2, (Object) ia40Var, (Object) uz40Var2, i2, (byte) 9);
        }
    }

    public static final void I(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        boolean z;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(1259975140);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new b4f0(b3);
                fetVar2.o0(objP);
            }
            knx.i(false, (Function0) objP, fetVar2, 54, 0);
            float f2 = ((Resources) fetVar2.k(dy2.c)).getDisplayMetrics().density;
            long jB = ((yez) ((rhv0) fetVar2.k(bmd.u))).b();
            boolean zF = fetVar2.f(jB) | fetVar2.d(f2);
            Object objP2 = fetVar2.P();
            if (zF || objP2 == cl5Var) {
                int i4 = (int) (jB >> 32);
                int i5 = (int) (jB & 4294967295L);
                objP2 = new ujv0(Math.min(i4, i5) / f2, Math.max(i4, i5) / f2);
                fetVar2.o0(objP2);
            }
            ujv0 ujv0Var = (ujv0) objP2;
            Object[] objArr = new Object[0];
            int i6 = i3 & 112;
            boolean z2 = i6 == 32;
            Object objP3 = fetVar2.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new f7f0(l7m0Var, b2);
                fetVar2.o0(objP3);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP3, fetVar2);
            Object[] objArr2 = new Object[0];
            boolean z3 = i6 == 32;
            Object objP4 = fetVar2.P();
            if (z3 || objP4 == cl5Var) {
                objP4 = new f7f0(l7m0Var, b3);
                fetVar2.o0(objP4);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP4, fetVar2);
            pz40 pz40VarZ = v3c.Z(Boolean.FALSE, new Object[0], fetVar2);
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP5);
            }
            vne vneVar = (vne) objP5;
            int i7 = i3 & 896;
            boolean zG = (i7 == 256) | fetVar2.g(pz40VarZ);
            Object objP6 = fetVar2.P();
            if (zG || objP6 == cl5Var) {
                objP6 = new rw1(function1, pz40VarZ, (byte) 5);
                fetVar2.o0(objP6);
            }
            Function0 function0 = (Function0) objP6;
            boolean z4 = i7 == 256;
            Object objP7 = fetVar2.P();
            byte b4 = 3;
            if (z4 || objP7 == cl5Var) {
                objP7 = new pme0(function1, b4);
                fetVar2.o0(objP7);
            }
            v3c.z(function0, (Function0) objP7, null, fetVar2, 0, 4);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z5 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z5) {
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
            mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.h);
            Object objP8 = fetVar2.P();
            if (objP8 == cl5Var) {
                objP8 = new bue0((byte) 11);
                fetVar2.o0(objP8);
            }
            mm40 mm40VarA = pai0.a(mm40VarB, false, (Function1) objP8);
            boolean z6 = ((Boolean) pz40VarZ.getValue()).booleanValue() && ((Boolean) l7m0VarY2.getValue()).booleanValue();
            zsf zsfVar = ihn.f14788a;
            uts0 uts0VarM0 = ro4.m0(300, 0, zsfVar, 2);
            Object objP9 = fetVar2.P();
            byte b5 = 19;
            if (objP9 == cl5Var) {
                objP9 = new or3(b5);
                fetVar2.o0(objP9);
            }
            pzn pznVarJ = kzn.j(uts0VarM0, (Function1) objP9);
            uts0 uts0VarM1 = ro4.m0(300, 0, zsfVar, 2);
            Object objP10 = fetVar2.P();
            if (objP10 == cl5Var) {
                objP10 = new or3(b5);
                fetVar2.o0(objP10);
            }
            b34.h(z6, mm40VarA, pznVarJ, kzn.l(uts0VarM1, (Function1) objP10), null, u1c.M(236994246, new hgs0(ujv0Var, l7m0Var, vneVar, pz40VarZ, function1), fetVar), fetVar, 196608, 16);
            fetVar2 = fetVar;
            if (((Boolean) l7m0VarY.getValue()).booleanValue()) {
                fetVar2.e0(-1242831800);
                n0q n0qVar = o7k0.c;
                n0qVar.getClass();
                mm40 mm40VarE = n0qVar.e(lnk.b);
                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar);
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar4);
                kpb.j(null, null, fetVar2, 0, 3);
                z = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2.e0(-1242589628);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mpb0(mm40Var, l7m0Var, function1, i2, (byte) 3);
        }
    }

    public static final void J(l7m0 l7m0Var, xcz xczVar, bru0 bru0Var, gru0 gru0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2 = function1;
        fetVar.g0(-1365902801);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.g(xczVar) ? 32 : 16) | (fetVar.i(bru0Var) ? 256 : 128) | (fetVar.g(gru0Var) ? 2048 : 1024);
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40 mm40VarE0 = o2e.e0(i120.Q(o7k0.c, qcc.S(R.attr.uikitBackground, fetVar), jd8.n), "VIRTUAL_GAMES_CATEGORIES_LIST_SCREEN_COLUMN");
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
            mm40 mm40VarX = yyw.X(jm40.b, null, fetVar, 1);
            int i4 = 57344 & i3;
            boolean z = i4 == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new zbt0(function2, (byte) 27);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 16384;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new sbt0(function2, (byte) 22);
                fetVar.o0(objP2);
            }
            Function1 function3 = (Function1) objP2;
            boolean z3 = i4 == 16384;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new sbt0(function2, (byte) 23);
                fetVar.o0(objP3);
            }
            int i5 = (i3 << 3) & 896;
            ofm0.i(mm40VarX, gru0Var, xczVar, function0, function3, (Function1) objP3, fetVar, ((i3 >> 6) & 112) | i5);
            byte b2 = 13;
            if (Intrinsics.d(bru0Var, zqu0.f44825a)) {
                fetVar.e0(1048133196);
                Object objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = jgk0.b(new ybt0(l7m0Var, b2));
                    fetVar.o0(objP4);
                }
                l7m0 l7m0Var2 = (l7m0) objP4;
                Object objP5 = fetVar.P();
                if (objP5 == cl5Var) {
                    objP5 = jgk0.b(new ybt0(l7m0Var, (byte) 10));
                    fetVar.o0(objP5);
                }
                K(l7m0Var2, (l7m0) objP5, xczVar, function2, fetVar, i5 | 54 | ((i3 >> 3) & 7168));
                function2 = function2;
                fetVar.r(false);
            } else {
                if (!(bru0Var instanceof aru0)) {
                    throw b1j.f(1973471068, fetVar, false);
                }
                fetVar.e0(1048618997);
                Object objP6 = fetVar.P();
                if (objP6 == cl5Var) {
                    objP6 = jgk0.b(new rbt0(bru0Var, b2));
                    fetVar.o0(objP6);
                }
                o((l7m0) objP6, function2, fetVar, ((i3 >> 9) & 112) | 6);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new geb(l7m0Var, xczVar, bru0Var, gru0Var, function2, i2, (byte) 6);
        }
    }

    public static final void K(l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, Function1 function1, fet fetVar, int i2) {
        l7m0 l7m0Var3;
        int i3;
        l7m0 l7m0Var4;
        fetVar.g0(1147238263);
        if ((i2 & 6) == 0) {
            l7m0Var3 = l7m0Var;
            i3 = (fetVar.g(l7m0Var3) ? 4 : 2) | i2;
        } else {
            l7m0Var3 = l7m0Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l7m0Var4 = l7m0Var2;
            i3 |= fetVar.g(l7m0Var4) ? 32 : 16;
        } else {
            l7m0Var4 = l7m0Var2;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            n0q n0qVar = o7k0.c;
            boolean z = !((Boolean) l7m0Var4.getValue()).booleanValue();
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var3, new qw3(6.0f, true, new jf4((byte) 14)), h97.f(xfn.a(fetVar).d, 8.0f, xfn.a(fetVar).d, 28.0f, fetVar), z, null, u1c.M(-1341788107, new nc40(function1, (byte) 24), fetVar), fetVar, ((i3 >> 3) & 112) | 100663302 | ((i3 << 6) & 896), 136);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xgz(l7m0Var, l7m0Var4, xczVar, function1, i2, (byte) 4);
        }
    }

    public static final void L(oyp0 oyp0Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        oyp0Var.getClass();
        function1.getClass();
        fetVar2.g0(-1817135739);
        int i3 = i2 | (fetVar2.g(oyp0Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rsm0.w(R.string.rating_selectors_title, 0, fetVar2), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(1, R.drawable.ic_glyph_refresh, oyp0Var.d, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new g4p0(function1, (byte) 22);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 32;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new coo0(function1, (byte) 19);
                fetVar2.o0(objP2);
            }
            hlm.c(null, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar2, 0, 0, 4053);
            mbc.o(zfi0.f44303a, jm40.b, false, fetVar, 54, 4);
            fetVar2 = fetVar;
            p(oyp0Var, function1, fetVar2, i3 & 126);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new myp0(oyp0Var, function1, i2, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1, types: [int] */
    /* JADX WARN: Type inference failed for: r41v2 */
    public static final void M(mm40 mm40Var, fkl fklVar, fet fetVar, int i2) {
        int i3;
        yx7 yx7Var;
        yx7 yx7Var2;
        int i4;
        String str;
        String str2;
        boolean z;
        float f2;
        String str3;
        fet fetVar2 = fetVar;
        yx7 yx7Var3 = gqw0.k;
        fetVar2.g0(-786490907);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(fklVar) ? 32 : 16;
        }
        boolean z2 = false;
        boolean z3 = true;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            String str4 = fklVar.c;
            String str5 = fklVar.f;
            String str6 = fklVar.d;
            a4x a4xVar = fklVar.h;
            boolean z4 = (str4 == null || str4.length() == 0 || !a4xVar.contains(dkl.c)) ? false : true;
            boolean z5 = (str6 == null || str6.length() == 0 || !a4xVar.contains(dkl.f6236a)) ? false : true;
            boolean z6 = (str5 == null || str5.length() == 0 || !a4xVar.contains(dkl.b)) ? false : true;
            if (z4 && z5 && z6) {
                yx7Var = yx7Var3;
            } else {
                int iOrdinal = fklVar.g.ordinal();
                if (iOrdinal == 0) {
                    yx7Var = gqw0.j;
                } else if (iOrdinal == 1) {
                    yx7Var = yx7Var3;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return;
                    }
                    yx7Var = gqw0.l;
                }
            }
            zcl zclVar = qmk.f28987a;
            float f3 = 0.0f;
            mm40 mm40VarL = s5x0.L(mm40Var, 0.0f, 16.0f, 1);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(yx7Var, (byte) 11)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            Iterator itO = h97.o(fetVar2, mm40VarC0, gqw0.v, 1717851968, a4xVar);
            while (itO.hasNext()) {
                dkl dklVar = (dkl) itO.next();
                if (dklVar != dkl.f6236a || str6 == null || str6.length() == 0) {
                    yx7Var2 = yx7Var3;
                    i4 = i5;
                    str = str5;
                    str2 = str6;
                    z = z2;
                    f2 = f3;
                    if (dklVar == dkl.b && str != null && str.length() != 0) {
                        fetVar2.e0(-1045635480);
                        v8q0.a(fklVar.f, null, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 110586);
                        fetVar2 = fetVar;
                        fetVar2.r(z);
                    } else if (dklVar != dkl.c || (str3 = fklVar.c) == null || str3.length() == 0) {
                        fetVar2.e0(-1045048526);
                        fetVar2.r(z);
                    } else {
                        fetVar2.e0(-1045229628);
                        j6n.h(fklVar.c, dqo0.f6527a, null, 0, 0, fetVar2, 0, 28);
                        fetVar2.r(z);
                    }
                } else {
                    fetVar2.e0(-1046816611);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarE0 = o2e.e0(o7k0.w(o7k0.g(jm40.b, 28.0f, f3, i5), yx7Var3, z2, i5), "MY_AGGREGATOR_BANNER_TEXT");
                    yx7 yx7Var4 = yx7Var3;
                    String str7 = fklVar.d;
                    f2 = f3;
                    yx7Var2 = yx7Var4;
                    str2 = str6;
                    str = str5;
                    z = z2;
                    i4 = 2;
                    v8q0.a(str7, mm40VarE0, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), new n05(qmk.q, g1t0.p().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.p(), 0L, 0L, null, null, null, 0L, null, null, 0, fklVar.e == ekl.b ? z3 : z2, 0L, null, null, 16711679), fetVar, 0, 24960, 110576);
                    fetVar2 = fetVar;
                    fetVar2.r(z);
                }
                z3 = true;
                z2 = z;
                i5 = i4;
                f3 = f2;
                yx7Var3 = yx7Var2;
                str6 = str2;
                str5 = str;
            }
            fetVar2.r(z2);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var, fklVar, i2, (byte) 28);
        }
    }

    public static final void N(l7m0 l7m0Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar.g0(434475195);
        byte b2 = 2;
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new zbt0(function1, (byte) 24);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = new zbt0(function1, (byte) 26);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = jgk0.b(new ybt0(l7m0Var, (byte) 11));
                fetVar.o0(objP3);
            }
            l7m0 l7m0Var2 = (l7m0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = jgk0.b(new ybt0(l7m0Var, (byte) 12));
                fetVar.o0(objP4);
            }
            l7m0 l7m0Var3 = (l7m0) objP4;
            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
            xcz xczVarB = qdzVar.b(((bru0) l7m0Var3.getValue()).getClass().getSimpleName(), new b4u0((byte) 19), fetVar, (i3 << 3) & 896);
            Boolean boolValueOf = Boolean.valueOf(xczVarB.j.a());
            boolean zG = fetVar.g(xczVarB) | fetVar.g(pkk0Var);
            Object objP5 = fetVar.P();
            if (zG || objP5 == obj) {
                objP5 = new hn(xczVarB, pkk0Var, null, b2);
                fetVar.o0(objP5);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP5);
            J(l7m0Var, xczVarB, (bru0) l7m0Var3.getValue(), (gru0) l7m0Var2.getValue(), function1, fetVar, (i3 & 14) | 512 | ((i3 << 6) & 57344));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn(l7m0Var, qdzVar, function1, i2, (byte) 12);
        }
    }

    public static final List O(sgy sgyVar) {
        sgyVar.getClass();
        return pgi0.t(pgi0.l(lgi0.e(i13.n, sgyVar), i13.o));
    }

    public static void P(Canvas canvas, boolean z) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!k) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    i = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    j = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    i = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    j = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = i;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = j;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            k = true;
        }
        if (z) {
            try {
                Method method4 = i;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = j) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static boolean Q(yzs0 yzs0Var, dcg0 dcg0Var, dcg0 dcg0Var2) {
        if (yzs0Var.L(dcg0Var) == yzs0Var.L(dcg0Var2) && yzs0Var.l0(dcg0Var) == yzs0Var.l0(dcg0Var2) && yzs0Var.v(dcg0Var) == yzs0Var.v(dcg0Var2) && yzs0Var.Q(yzs0Var.N(dcg0Var), yzs0Var.N(dcg0Var2))) {
            if (yzs0Var.J(dcg0Var, dcg0Var2)) {
                return true;
            }
            int iL = yzs0Var.L(dcg0Var);
            for (int i2 = 0; i2 < iL; i2++) {
                zxs0 zxs0VarE = yzs0Var.E(dcg0Var, i2);
                zxs0 zxs0VarE2 = yzs0Var.E(dcg0Var2, i2);
                if (yzs0Var.q0(zxs0VarE) == yzs0Var.q0(zxs0VarE2)) {
                    if (!yzs0Var.q0(zxs0VarE)) {
                        if (yzs0Var.k0(zxs0VarE) == yzs0Var.k0(zxs0VarE2)) {
                            aty atyVarC0 = yzs0Var.C0(zxs0VarE);
                            atyVarC0.getClass();
                            aty atyVarC1 = yzs0Var.C0(zxs0VarE2);
                            atyVarC1.getClass();
                            if (!S(yzs0Var, atyVarC0, atyVarC1)) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static boolean R(yzs0 yzs0Var, aty atyVar, aty atyVar2) {
        yzs0Var.getClass();
        atyVar.getClass();
        atyVar2.getClass();
        return S(yzs0Var, atyVar, atyVar2);
    }

    public static boolean S(yzs0 yzs0Var, aty atyVar, aty atyVar2) {
        if (atyVar == atyVar2) {
            return true;
        }
        dcg0 dcg0VarA = yzs0Var.a(atyVar);
        dcg0 dcg0VarA2 = yzs0Var.a(atyVar2);
        if (dcg0VarA != null && dcg0VarA2 != null) {
            return Q(yzs0Var, dcg0VarA, dcg0VarA2);
        }
        nkq nkqVarS = yzs0Var.S(atyVar);
        nkq nkqVarS2 = yzs0Var.S(atyVar2);
        return nkqVarS != null && nkqVarS2 != null && Q(yzs0Var, yzs0Var.d(nkqVarS), yzs0Var.d(nkqVarS2)) && Q(yzs0Var, yzs0Var.e(nkqVarS), yzs0Var.e(nkqVarS2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r3 == a.e40.e) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a.x30 T(a.an5 r3, java.lang.String r4, a.fo7 r5, boolean r6) {
        /*
            a.g40 r3 = r3.d
            double r0 = r3.f10638a
            a.e40 r3 = r3.b
            a.e40 r2 = a.e40.f7159a
            if (r3 == r2) goto L71
            boolean r5 = r5 instanceof a.co7
            if (r5 != 0) goto Lf
            goto L71
        Lf:
            if (r6 == 0) goto L12
            goto L6e
        L12:
            a.e40 r5 = a.e40.b
            if (r3 != r5) goto L19
            a.l30 r3 = a.l30.f19337a
            return r3
        L19:
            a.e40 r5 = a.e40.c
            if (r3 != r5) goto L3a
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 != 0) goto L26
            a.c30 r3 = a.c30.f3649a
            return r3
        L26:
            a.u30 r3 = new a.u30
            int r5 = a.cy7.f5159a
            a.pn40 r5 = a.pn40.f27267a
            a.p3u0 r5 = a.p3u0.c
            java.lang.String r5 = a.pn40.c(r0, r5)
            java.lang.String r5 = a.cy7.e(r5)
            r3.<init>(r5, r4)
            return r3
        L3a:
            a.e40 r5 = a.e40.d
            if (r3 != r5) goto L52
            a.r30 r3 = new a.r30
            int r5 = a.cy7.f5159a
            a.pn40 r5 = a.pn40.f27267a
            a.p3u0 r5 = a.p3u0.c
            java.lang.String r5 = a.pn40.c(r0, r5)
            java.lang.String r5 = a.cy7.e(r5)
            r3.<init>(r5, r4)
            return r3
        L52:
            a.e40 r5 = a.e40.f
            if (r3 != r5) goto L6a
            a.o30 r3 = new a.o30
            int r5 = a.cy7.f5159a
            a.pn40 r5 = a.pn40.f27267a
            a.p3u0 r5 = a.p3u0.c
            java.lang.String r5 = a.pn40.c(r0, r5)
            java.lang.String r5 = a.cy7.e(r5)
            r3.<init>(r5, r4)
            return r3
        L6a:
            a.e40 r4 = a.e40.e
            if (r3 != r4) goto L71
        L6e:
            a.f30 r3 = a.f30.f8838a
            return r3
        L71:
            a.i30 r3 = a.i30.f14073a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y9a.T(a.an5, java.lang.String, a.fo7, boolean):a.x30");
    }

    public static final ob7 U(m97 m97Var) {
        long j2 = m97Var.f21398a;
        String str = m97Var.o;
        long j3 = m97Var.i;
        long j4 = m97Var.h;
        boolean z = m97Var.e;
        double d2 = m97Var.k;
        long j5 = m97Var.f;
        String str2 = m97Var.p;
        return new ob7(j2, j3, j4, z, d2, j5, (str2.length() <= 0 || str.length() <= 0) ? "" : kng0.l(str2, ": ", str), m97Var.d, m97Var.x, m97Var.l, m97Var.m, iun.f15405a);
    }

    public static final fem V(y1w y1wVar, boolean z, boolean z2) {
        y1wVar.getClass();
        if (!y1wVar.q || !z) {
            return null;
        }
        if (cy7.c() && z2) {
            return null;
        }
        return new fem(cfx0.N(y1wVar.n));
    }

    public static final void a(mm40 mm40Var, jwa jwaVar, Function0 function0, Function0 function1, fet fetVar, int i2) {
        int i3;
        jwa jwaVar2;
        fetVar.g0(-360414450);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(jwaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (jwaVar instanceof gwa) {
                fetVar.e0(311609261);
                qzb.n(mm40Var, new wul(lul.e, oe9.b, new ue9(((gwa) jwaVar).f12016a), true, false, true), function0, fetVar, i3 & 910, 0);
                fetVar.r(false);
            } else {
                boolean z = jwaVar instanceof hwa;
                byte b2 = 27;
                cl5 cl5Var = ukd.f35823a;
                if (z) {
                    fetVar.e0(312138679);
                    wul wulVar = new wul(lul.e, oe9.b, new ue9(((hwa) jwaVar).f13760a), false, false, true);
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = new mn9(b2);
                        fetVar.o0(objP);
                    }
                    qzb.n(mm40Var, wulVar, (Function0) objP, fetVar, (i3 & 14) | 384, 0);
                    fetVar.r(false);
                } else {
                    if (!(jwaVar instanceof iwa)) {
                        throw b1j.f(1534072944, fetVar, false);
                    }
                    fetVar.e0(312690417);
                    iwa iwaVar = (iwa) jwaVar;
                    Date date = iwaVar.f15479a;
                    Long lValueOf = Long.valueOf(date.getTime());
                    int i4 = i3 & 112;
                    boolean z2 = (i4 == 32) | ((i3 & 7168) == 2048);
                    Object objP2 = fetVar.P();
                    if (z2 || objP2 == cl5Var) {
                        objP2 = new yp6(jwaVar, function1, null, b2);
                        fetVar.o0(objP2);
                    }
                    m0x0.t(fetVar, lValueOf, (Function2) objP2);
                    mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40VarD, 36.0f);
                    zcl zclVar2 = qmk.f;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
                    pz40 pz40Var = s6t0.f31722a;
                    mm40 mm40VarQ = i120.Q(mm40VarE2, s6t0.b().f33626a.getSecondary20(), jd8.n);
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
                    Object[] objArr = {iwaVar.c};
                    boolean z3 = i4 == 32;
                    Object objP3 = fetVar.P();
                    if (z3 || objP3 == cl5Var) {
                        jwaVar2 = jwaVar;
                        objP3 = new h8a(jwaVar2, (byte) 2);
                        fetVar.o0(objP3);
                    } else {
                        jwaVar2 = jwaVar;
                    }
                    l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP3, fetVar);
                    fxb.i(date.getTime(), new qol(iwaVar.b, 14), jm40.b, tol.c, sol.f32548a, (iol) l7m0VarY.getValue(), function1, fetVar, 28032 | ((i3 << 9) & 3670016), 0);
                    fetVar.r(true);
                    fetVar.r(false);
                }
            }
            jwaVar2 = jwaVar;
        } else {
            jwaVar2 = jwaVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 10, i2, (Object) mm40Var, (Object) jwaVar2, (Object) function0, (Object) function1);
        }
    }

    public static final void b(mm40 mm40Var, yxq0 yxq0Var, xcz xczVar, Function1 function1, fet fetVar, int i2) {
        yxq0Var.getClass();
        xczVar.getClass();
        function1.getClass();
        fetVar.g0(123125673);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(yxq0Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            bvl bvlVar = yxq0Var.f43437a;
            boolean z = (i3 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new y7(function1, (byte) 21);
                fetVar.o0(objP);
            }
            ju70.p(mm40Var, bvlVar, xczVar, 0.0f, (Function1) objP, fetVar, i3 & 910, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 8, i2, mm40Var, yxq0Var, xczVar, function1);
        }
    }

    public static final void c(mm40 mm40Var, final on0 on0Var, d9z d9zVar, xcz xczVar, final Function1 function1, Function0 function0, fet fetVar, int i2, int i3) {
        Function0 function2;
        int i4;
        d9z d9zVar2;
        Function0 function3;
        int i5;
        Function0 function4;
        fet fetVar2 = fetVar;
        on0Var.getClass();
        d9zVar.getClass();
        xczVar.getClass();
        fetVar2.g0(1768253382);
        int i6 = i2 | (fetVar2.g(on0Var) ? 32 : 16) | (fetVar2.g(d9zVar) ? 256 : 128) | (fetVar2.g(xczVar) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        int i7 = i3 & 32;
        if (i7 != 0) {
            i4 = i6 | 196608;
            function2 = function0;
        } else {
            function2 = function0;
            i4 = i6 | (fetVar2.i(function2) ? 131072 : 65536);
        }
        if (fetVar2.U(i4 & 1, (74899 & i4) != 74898)) {
            if (i7 != 0) {
                function4 = null;
                i5 = 256;
            } else {
                i5 = 256;
                function4 = function2;
            }
            boolean z = on0Var instanceof nn0;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar2.e0(263026521);
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                zll zllVar = ((nn0) on0Var).f23797a.f42817a;
                float f2 = xfn.a(fetVar2).c;
                zcl zclVar = qmk.f28987a;
                ch80 ch80VarF = h97.f(f2, 8.0f, xfn.a(fetVar2).c, 24.0f, fetVar2);
                int i8 = i4 & 57344;
                int i9 = i4 & 112;
                boolean z2 = (i9 == 32) | (i8 == 16384);
                Object objP = fetVar2.P();
                if (z2 || objP == cl5Var) {
                    final byte b2 = 0;
                    objP = new Function1() { // from class: a.sl0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            byte b3 = b2;
                            on0 on0Var2 = on0Var;
                            Function1 function5 = function1;
                            st0 st0Var = (st0) obj;
                            switch (b3) {
                                case 0:
                                    st0Var.getClass();
                                    long j2 = st0Var.f32750a;
                                    long j3 = ((nn0) on0Var2).f23797a.b.f16074a;
                                    mtr mtrVar = st0Var.d;
                                    function5.invoke(new gl0(j2, mtrVar != null ? mtrVar.b : false, j3));
                                    break;
                                default:
                                    st0Var.getClass();
                                    function5.invoke(new hl0(st0Var.f32750a, ((nn0) on0Var2).f23797a.b.f16074a));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP);
                }
                Function1 function5 = (Function1) objP;
                boolean z3 = (i8 == 16384) | (i9 == 32);
                Object objP2 = fetVar2.P();
                if (z3 || objP2 == cl5Var) {
                    final byte b3 = 1;
                    objP2 = new Function1() { // from class: a.sl0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            byte b4 = b3;
                            on0 on0Var2 = on0Var;
                            Function1 function6 = function1;
                            st0 st0Var = (st0) obj;
                            switch (b4) {
                                case 0:
                                    st0Var.getClass();
                                    long j2 = st0Var.f32750a;
                                    long j3 = ((nn0) on0Var2).f23797a.b.f16074a;
                                    mtr mtrVar = st0Var.d;
                                    function6.invoke(new gl0(j2, mtrVar != null ? mtrVar.b : false, j3));
                                    break;
                                default:
                                    st0Var.getClass();
                                    function6.invoke(new hl0(st0Var.f32750a, ((nn0) on0Var2).f23797a.b.f16074a));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP2);
                }
                ckb.f(mm40VarD, zllVar, d9zVar, ch80VarF, function4, null, function5, (Function1) objP2, fetVar2, (i4 & 896) | ((i4 >> 3) & 57344), 32);
                d9zVar2 = d9zVar;
                fetVar2.r(false);
            } else {
                d9zVar2 = d9zVar;
                if (!(on0Var instanceof mn0)) {
                    throw b1j.f(-1515537371, fetVar2, false);
                }
                fetVar2.e0(264369255);
                mm40 mm40VarE = mm40Var.e(o7k0.c);
                zcl zclVar2 = qmk.f28987a;
                ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 28.0f, 7), fetVar2);
                boolean z4 = ((i4 & 896) == i5) | ((i4 & 112) == 32) | ((i4 & 57344) == 16384);
                Object objP3 = fetVar2.P();
                if (z4 || objP3 == cl5Var) {
                    objP3 = new on((Object) on0Var, (Object) d9zVar2, (Object) function1, (byte) 4);
                    fetVar2.o0(objP3);
                }
                b8k0.e(mm40VarE, xczVar, ch80VarG, null, null, null, false, null, (Function1) objP3, fetVar, (i4 >> 6) & 112, Response.SERVER_TIMEOUT);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            function3 = function4;
        } else {
            d9zVar2 = d9zVar;
            fetVar2.X();
            function3 = function2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tl0(mm40Var, on0Var, d9zVar2, xczVar, function1, function3, i2, i3);
        }
    }

    public static final void d(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, d9z d9zVar, xcz xczVar2, xcz xczVar3, Function1 function1, fet fetVar, int i2) {
        d9z d9zVar2;
        xcz xczVar4;
        mm40 mm40Var2;
        l7m0Var.getClass();
        xczVar.getClass();
        d9zVar.getClass();
        xczVar2.getClass();
        xczVar3.getClass();
        function1.getClass();
        fetVar.g0(-371932756);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            d9zVar2 = d9zVar;
            i3 |= fetVar.g(d9zVar2) ? 2048 : 1024;
        } else {
            d9zVar2 = d9zVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(xczVar2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            xczVar4 = xczVar3;
            i3 |= fetVar.g(xczVar4) ? 131072 : 65536;
        } else {
            xczVar4 = xczVar3;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            float fT = fbc.T(fetVar);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarH = phu0.H(i120.Q(jm40Var, background, ljcVar), null, 1);
            zcl zclVar = qmk.f28987a;
            zfn zfnVar = m8m0.f21378a;
            y0x0.e(mm40VarH, 180.0f + fT, ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), 0.0f, ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), 0.0f, u1c.M(-2000515963, new qt1(fT, l7m0Var, function1, b2), fetVar), u1c.M(282159073, new rt1(d9zVar2, xczVar, xczVar2, xczVar4, l7m0Var, function1), fetVar), fetVar, 905994240, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new st1(mm40Var2, l7m0Var, xczVar, d9zVar, xczVar2, xczVar3, function1, i2, (byte) 0);
        }
    }

    public static final void e(mm40 mm40Var, String str, String str2, long j2, fet fetVar, int i2) {
        fetVar.g0(-211103659);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.f(j2) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(895440149, new qnv(mm40Var, str, j2, str2), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qnv(mm40Var, str, str2, j2, i2, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00be  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:64:0x010a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0116  */
    /* JADX WARN: Code duplicated, block: B:67:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x0129  */
    /* JADX WARN: Code duplicated, block: B:73:0x0146  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:78:0x016f  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public static final void f(o0x o0xVar, o0x o0xVar2, m0x m0xVar, Function1 function1, ugd ugdVar, fet fetVar, int i2, int i3) {
        Function1 function2;
        boolean z;
        Function1 function3;
        yfe0 yfe0VarU;
        cl5 cl5Var;
        Object objP;
        pz40 pz40Var;
        Object objP2;
        pz40 pz40Var2;
        Pair pair;
        o0x o0xVar3;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objP3;
        Function1 function4;
        mz3 mz3VarX;
        boolean z5;
        boolean zG;
        Object objP4;
        Object objP5;
        o0xVar.getClass();
        o0xVar2.getClass();
        m0xVar.getClass();
        fetVar.g0(-450016643);
        int i4 = (fetVar.g(o0xVar) ? 4 : 2) | i2 | (fetVar.g(o0xVar2) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i4 |= fetVar.g(m0xVar) ? 256 : 128;
        }
        int i5 = i3 & 8;
        if (i5 == 0) {
            if ((i2 & 3072) == 0) {
                function2 = function1;
                i4 |= fetVar.i(function2) ? 2048 : 1024;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                cl5Var = ukd.f35823a;
                if (i5 != 0) {
                    objP5 = fetVar.P();
                    if (objP5 == cl5Var) {
                        objP5 = new or3((byte) 11);
                        fetVar.o0(objP5);
                    }
                    function2 = (Function1) objP5;
                }
                objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = androidx.compose.runtime.e.e(hz3.f13888a);
                    fetVar.o0(objP);
                }
                pz40Var = (pz40) objP;
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                    fetVar.o0(objP2);
                }
                pz40Var2 = (pz40) objP2;
                if (((Boolean) pz40Var2.getValue()).booleanValue()) {
                    pair = new Pair(o0xVar2.a(), o0xVar2);
                } else {
                    pair = new Pair(o0xVar.a(), o0xVar);
                }
                o0xVar3 = (o0x) pair.b;
                if ((i4 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i4 & 112) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z3 | z2;
                objP3 = fetVar.P();
                if (z4 || objP3 == cl5Var) {
                    objP3 = new dc0(o0xVar, o0xVar2, pz40Var, pz40Var2);
                    fetVar.o0(objP3);
                }
                Object obj = pair.f46059a;
                function4 = function2;
                mz3VarX = l7x.X(obj, (Function1) objP3, null, fetVar, 0, 26);
                if (((lz3) pz40Var.getValue()) instanceof kz3) {
                    fetVar.e0(-1851793625);
                    if ((i4 & 7168) == 2048) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    zG = z5 | fetVar.g(o0xVar3);
                    objP4 = fetVar.P();
                    if (zG || objP4 == cl5Var) {
                        objP4 = new cm3(function4, o0xVar3, null, (byte) 4);
                        fetVar.o0(objP4);
                    }
                    m0x0.t(fetVar, o0xVar3, (Function2) objP4);
                    ugdVar.j(mz3VarX, o0xVar3, fetVar, 384);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1851621978);
                    ugdVar.j(a8k0.F(m0xVar.f20977a, 0, fetVar), m0xVar, fetVar, Integer.valueOf(((i4 >> 3) & 112) | 392));
                    fetVar.r(false);
                }
                function3 = function4;
            } else {
                fetVar.X();
                function3 = function2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new g04(o0xVar, o0xVar2, m0xVar, function3, ugdVar, i2, i3, (byte) 0);
            }
        }
        i4 |= 3072;
        function2 = function1;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            cl5Var = ukd.f35823a;
            if (i5 != 0) {
                objP5 = fetVar.P();
                if (objP5 == cl5Var) {
                    objP5 = new or3((byte) 11);
                    fetVar.o0(objP5);
                }
                function2 = (Function1) objP5;
            }
            objP = fetVar.P();
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar.o0(objP);
            }
            pz40Var = (pz40) objP;
            objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP2);
            }
            pz40Var2 = (pz40) objP2;
            if (((Boolean) pz40Var2.getValue()).booleanValue()) {
                pair = new Pair(o0xVar2.a(), o0xVar2);
            } else {
                pair = new Pair(o0xVar.a(), o0xVar);
            }
            o0xVar3 = (o0x) pair.b;
            if ((i4 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i4 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z3 | z2;
            objP3 = fetVar.P();
            if (z4) {
                objP3 = new dc0(o0xVar, o0xVar2, pz40Var, pz40Var2);
                fetVar.o0(objP3);
            } else {
                objP3 = new dc0(o0xVar, o0xVar2, pz40Var, pz40Var2);
                fetVar.o0(objP3);
            }
            Object obj2 = pair.f46059a;
            function4 = function2;
            mz3VarX = l7x.X(obj2, (Function1) objP3, null, fetVar, 0, 26);
            if (((lz3) pz40Var.getValue()) instanceof kz3) {
                fetVar.e0(-1851793625);
                if ((i4 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zG = z5 | fetVar.g(o0xVar3);
                objP4 = fetVar.P();
                if (zG) {
                    objP4 = new cm3(function4, o0xVar3, null, (byte) 4);
                    fetVar.o0(objP4);
                } else {
                    objP4 = new cm3(function4, o0xVar3, null, (byte) 4);
                    fetVar.o0(objP4);
                }
                m0x0.t(fetVar, o0xVar3, (Function2) objP4);
                ugdVar.j(mz3VarX, o0xVar3, fetVar, 384);
                fetVar.r(false);
            } else {
                fetVar.e0(-1851621978);
                ugdVar.j(a8k0.F(m0xVar.f20977a, 0, fetVar), m0xVar, fetVar, Integer.valueOf(((i4 >> 3) & 112) | 392));
                fetVar.r(false);
            }
            function3 = function4;
        } else {
            fetVar.X();
            function3 = function2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g04(o0xVar, o0xVar2, m0xVar, function3, ugdVar, i2, i3, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void g(mm40 mm40Var, p54 p54Var, Function1 function1, ugd ugdVar, ugd ugdVar2, fet fetVar, int i2) {
        p54 p54Var2;
        View view;
        byte b2;
        boolean z;
        boolean z2;
        p54 p54Var3 = p54Var;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        p54Var3.getClass();
        xn4 xn4Var = p54Var3.f26387a;
        function2.getClass();
        fetVar2.g0(1735277317);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(p54Var3) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128);
        byte b3 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 & 896;
            Object[] objArr = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objArr != false || objP == cl5Var) {
                objP = new zk2(function2, (byte) 13);
                fetVar2.o0(objP);
            }
            knx.i(false, (Function0) objP, fetVar2, 0, 1);
            pkk0 pkk0Var = (pkk0) fetVar2.k(bmd.q);
            boolean zG = fetVar2.g(pkk0Var) | (i4 == 256);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new e54(pkk0Var, function2, b3);
                fetVar2.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z3 = p54Var3.b;
            oms0 oms0VarZ = phu0.Z(xn4Var, null, fetVar2, 0, 2);
            if (p54Var3.c) {
                oms0VarZ = oms0VarZ;
                p54Var3 = p54Var3;
                function2 = function2;
                view = null;
                fetVar2.e0(1421155197);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1420839989);
                Boolean boolValueOf = Boolean.valueOf(z3);
                Object objY0 = oms0VarZ.f25519a.y0();
                Object value = ((hgk0) oms0VarZ.d).getValue();
                boolean zG2 = fetVar2.g(oms0VarZ) | ((i3 & 112) == 32) | (i4 == 256);
                Object objP3 = fetVar2.P();
                if (zG2 || objP3 == cl5Var) {
                    view = null;
                    ee0 ee0Var = new ee0(oms0VarZ, p54Var3, function2, 0 == true ? 1 : 0, (byte) 11);
                    fetVar2.o0(ee0Var);
                    objP3 = ee0Var;
                } else {
                    view = null;
                }
                m0x0.u(boolValueOf, objY0, value, (Function2) objP3, fetVar2);
                fetVar2.r(false);
            }
            pz40 pz40VarU = g8x.U(view, fetVar2, 1);
            Object objP4 = fetVar2.P();
            float f2 = 0.0f;
            if (objP4 == cl5Var) {
                objP4 = androidx.compose.runtime.e.a(0.0f);
                fetVar2.o0(objP4);
            }
            agk0 agk0Var = (agk0) objP4;
            w6k w6kVar = (w6k) fetVar2.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            float fW0 = w6kVar.w0(8.0f);
            if (((tly) pz40VarU.getValue()).f34169a && xn4Var == xn4.f41154a && agk0Var.l() > 0.0f) {
                float fL = (((tly) pz40VarU.getValue()).b - agk0Var.l()) + fW0;
                if (fL >= 0.0f) {
                    f2 = fL;
                }
            }
            mm40 mm40VarS = o050.S(mm40Var);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40VarS.e(n0qVar);
            long background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarE, background, ljcVar);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
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
            boolean zD = fetVar2.d(f2);
            Object objP5 = fetVar2.P();
            if (zD || objP5 == cl5Var) {
                b2 = 0;
                objP5 = new f54(f2, b2);
                fetVar2.o0(objP5);
            } else {
                b2 = 0;
            }
            mm40 mm40VarE0 = o2e.e0(i4w0.T(n0qVar, (Function1) objP5), "AUTH_DEFAULT_SCREEN_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, b2);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE0);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            mm40 mm40VarD = o7k0.d(ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true), 1.0f);
            xn4 xn4Var2 = p54Var3.f26387a;
            boolean z5 = p54Var3.b;
            boolean z6 = p54Var3.c;
            boolean z7 = i4 == 256;
            Object objP6 = fetVar2.P();
            if (z7 || objP6 == cl5Var) {
                objP6 = new zk2(function2, (byte) 14);
                fetVar2.o0(objP6);
            }
            p54 p54Var4 = p54Var3;
            zgc.e(mm40VarD, xn4Var2, z5, z6, (Function0) objP6, function0, fetVar2, 0);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD2 = o7k0.d(o7k0.e(jm40Var, 436.0f), 1.0f);
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
            Object objP7 = fetVar2.P();
            if (objP7 == cl5Var) {
                objP7 = new or3((byte) 12);
                fetVar2.o0(objP7);
            }
            ay3.e(oms0VarZ, n0qVar, (Function1) objP7, null, null, u1c.M(880866288, new g54((Object) ugdVar2, (Object) ugdVar, (Object) pz40VarU, (Object) agk0Var, (byte) 0), fetVar2), fetVar2, 197040, 12);
            if (z3) {
                fetVar2.e0(1383318902);
                Unit unit = Unit.f46060a;
                Object objP8 = fetVar2.P();
                if (objP8 == cl5Var) {
                    objP8 = i54.b;
                    fetVar2.o0(objP8);
                }
                z = false;
                zq8.a(0, fetVar2, fnn0.a(n0qVar, unit, (PointerInputEventHandler) objP8));
                fetVar2.r(false);
            } else {
                z = false;
                fetVar2.e0(1383631227);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
            mm40 mm40VarD3 = o7k0.d(jr8.f16991a.b(jm40Var, gqw0.b), 1.0f);
            WeakHashMap weakHashMap = djv0.w;
            mm40 mm40VarK0 = j120.k0(mm40VarD3, new dnz(zcm0.i(fetVar2).l, 16));
            imm immVar = p54Var4.d;
            boolean z8 = i4 == 256 ? true : z;
            Object objP9 = fetVar2.P();
            if (z8 || objP9 == cl5Var) {
                objP9 = new zk2(function1, (byte) 15);
                fetVar2.o0(objP9);
            }
            hlm.c(mm40VarK0, immVar, null, (Function0) objP9, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4084);
            p54Var2 = p54Var;
            fetVar2 = fetVar;
            if (p54Var2.e) {
                fetVar2.e0(584609605);
                StaticColors staticColors = StaticColors.INSTANCE;
                mm40 mm40VarQ2 = i120.Q(n0qVar, staticColors.m109getOverlayBackground400d7_KjU(), ljcVar);
                Unit unit2 = Unit.f46060a;
                Object objP10 = fetVar2.P();
                if (objP10 == cl5Var) {
                    objP10 = i54.c;
                    fetVar2.o0(objP10);
                }
                mm40 mm40VarA = fnn0.a(mm40VarQ2, unit2, (PointerInputEventHandler) objP10);
                tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                int iHashCode4 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM4 = fetVar2.m();
                mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarA);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC3, shdVar);
                jpm0.o(fetVar2, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC3, shdVar4);
                p3c0.a(null, staticColors.m123getWhite0d7_KjU(), 0.0f, 0L, 0, 0.0f, fetVar, 0, 61);
                fetVar2 = fetVar;
                z2 = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z2 = true;
                fetVar2.e0(585057431);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
        } else {
            p54Var2 = p54Var3;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00(mm40Var, p54Var2, function1, ugdVar, ugdVar2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x007e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:41:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00da  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:73:0x0126  */
    /* JADX WARN: Code duplicated, block: B:76:0x0133  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public static final void h(mm40 mm40Var, final String str, final String str2, final long j2, long j3, long j4, y9q0 y9q0Var, fet fetVar, final int i2, final int i3) {
        mm40 mm40Var2;
        int i4;
        long j5;
        long j6;
        y9q0 y9q0Var2;
        int i5;
        boolean z;
        final mm40 mm40Var3;
        final long j7;
        final long j8;
        final y9q0 y9q0Var3;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        mm40 mm40Var5;
        str.getClass();
        str2.getClass();
        fetVar.g0(-1854642765);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = i2 | (fetVar.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        int i7 = i4 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.f(j2) ? 16384 : 8192);
        if ((i3 & 32) == 0) {
            j5 = j3;
            int i8 = fetVar.f(j5) ? 131072 : 65536;
            int i9 = i7 | i8;
            if ((i3 & 64) == 0) {
                j6 = j4;
                int i10 = fetVar.f(j6) ? 1048576 : 524288;
                int i11 = i9 | i10;
                if ((i3 & 128) == 0) {
                    y9q0Var2 = y9q0Var;
                    int i12 = fetVar.g(y9q0Var2) ? 8388608 : 4194304;
                    i5 = i11 | i12;
                    if ((4793491 & i5) != 4793490) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i5 & 1, z)) {
                        fetVar.Z();
                        if ((i2 & 1) != 0 || fetVar.B()) {
                            if (i6 != 0) {
                                mm40Var4 = jm40.b;
                            } else {
                                mm40Var4 = mm40Var2;
                            }
                            if ((i3 & 32) != 0) {
                                j5 = qmk.q;
                            }
                            if ((i3 & 64) != 0) {
                                j6 = qmk.s;
                            }
                            if ((i3 & 128) != 0) {
                                y9q0Var2 = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 6, 0, qmk.G, 16613341);
                            }
                            mm40Var5 = mm40Var4;
                        } else {
                            fetVar.X();
                            mm40Var5 = mm40Var2;
                        }
                        long j9 = j5;
                        long j10 = j6;
                        y9q0 y9q0Var4 = y9q0Var2;
                        fetVar.s();
                        obc.d(bmd.n.a(k6z.f17794a), u1c.M(1642682611, new h15(mm40Var5, j10, j2, j9, str, y9q0Var4, str2), fetVar), fetVar, 56);
                        mm40Var3 = mm40Var5;
                        j8 = j10;
                        j7 = j9;
                        y9q0Var3 = y9q0Var4;
                    } else {
                        fetVar.X();
                        mm40Var3 = mm40Var2;
                        j7 = j5;
                        j8 = j6;
                        y9q0Var3 = y9q0Var2;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.i15
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                y9a.h(mm40Var3, str, str2, j2, j7, j8, y9q0Var3, (fet) obj, x8x.L(i2 | 1), i3);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                y9q0Var2 = y9q0Var;
                i5 = i11 | i12;
                if ((4793491 & i5) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i5 & 1, z)) {
                    fetVar.Z();
                    if ((i2 & 1) != 0) {
                        if (i6 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j5 = qmk.q;
                        }
                        if ((i3 & 64) != 0) {
                            j6 = qmk.s;
                        }
                        if ((i3 & 128) != 0) {
                            y9q0Var2 = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 6, 0, qmk.G, 16613341);
                        }
                        mm40Var5 = mm40Var4;
                    } else {
                        if (i6 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j5 = qmk.q;
                        }
                        if ((i3 & 64) != 0) {
                            j6 = qmk.s;
                        }
                        if ((i3 & 128) != 0) {
                            y9q0Var2 = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 6, 0, qmk.G, 16613341);
                        }
                        mm40Var5 = mm40Var4;
                    }
                    long j11 = j5;
                    long j12 = j6;
                    y9q0 y9q0Var5 = y9q0Var2;
                    fetVar.s();
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(1642682611, new h15(mm40Var5, j12, j2, j11, str, y9q0Var5, str2), fetVar), fetVar, 56);
                    mm40Var3 = mm40Var5;
                    j8 = j12;
                    j7 = j11;
                    y9q0Var3 = y9q0Var5;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    j7 = j5;
                    j8 = j6;
                    y9q0Var3 = y9q0Var2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.i15
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            y9a.h(mm40Var3, str, str2, j2, j7, j8, y9q0Var3, (fet) obj, x8x.L(i2 | 1), i3);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            j6 = j4;
            int i13 = i9 | i10;
            if ((i3 & 128) == 0) {
                y9q0Var2 = y9q0Var;
                if (fetVar.g(y9q0Var2)) {
                }
                i5 = i13 | i12;
                if ((4793491 & i5) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i5 & 1, z)) {
                    fetVar.Z();
                    if ((i2 & 1) != 0) {
                        if (i6 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j5 = qmk.q;
                        }
                        if ((i3 & 64) != 0) {
                            j6 = qmk.s;
                        }
                        if ((i3 & 128) != 0) {
                            y9q0Var2 = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 6, 0, qmk.G, 16613341);
                        }
                        mm40Var5 = mm40Var4;
                    } else {
                        if (i6 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j5 = qmk.q;
                        }
                        if ((i3 & 64) != 0) {
                            j6 = qmk.s;
                        }
                        if ((i3 & 128) != 0) {
                            y9q0Var2 = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 6, 0, qmk.G, 16613341);
                        }
                        mm40Var5 = mm40Var4;
                    }
                    long j13 = j5;
                    long j14 = j6;
                    y9q0 y9q0Var6 = y9q0Var2;
                    fetVar.s();
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(1642682611, new h15(mm40Var5, j14, j2, j13, str, y9q0Var6, str2), fetVar), fetVar, 56);
                    mm40Var3 = mm40Var5;
                    j8 = j14;
                    j7 = j13;
                    y9q0Var3 = y9q0Var6;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    j7 = j5;
                    j8 = j6;
                    y9q0Var3 = y9q0Var2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.i15
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            y9a.h(mm40Var3, str, str2, j2, j7, j8, y9q0Var3, (fet) obj, x8x.L(i2 | 1), i3);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            y9q0Var2 = y9q0Var;
            i5 = i13 | i12;
            if ((4793491 & i5) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i5 & 1, z)) {
                fetVar.Z();
                if ((i2 & 1) != 0) {
                    if (i6 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j5 = qmk.q;
                    }
                    if ((i3 & 64) != 0) {
                        j6 = qmk.s;
                    }
                    if ((i3 & 128) != 0) {
                        y9q0Var2 = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 6, 0, qmk.G, 16613341);
                    }
                    mm40Var5 = mm40Var4;
                } else {
                    if (i6 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j5 = qmk.q;
                    }
                    if ((i3 & 64) != 0) {
                        j6 = qmk.s;
                    }
                    if ((i3 & 128) != 0) {
                        y9q0Var2 = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 6, 0, qmk.G, 16613341);
                    }
                    mm40Var5 = mm40Var4;
                }
                long j15 = j5;
                long j16 = j6;
                y9q0 y9q0Var7 = y9q0Var2;
                fetVar.s();
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(1642682611, new h15(mm40Var5, j16, j2, j15, str, y9q0Var7, str2), fetVar), fetVar, 56);
                mm40Var3 = mm40Var5;
                j8 = j16;
                j7 = j15;
                y9q0Var3 = y9q0Var7;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                j7 = j5;
                j8 = j6;
                y9q0Var3 = y9q0Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.i15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        y9a.h(mm40Var3, str, str2, j2, j7, j8, y9q0Var3, (fet) obj, x8x.L(i2 | 1), i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        j5 = j3;
        int i14 = i7 | i8;
        if ((i3 & 64) == 0) {
            j6 = j4;
            if (fetVar.f(j6)) {
            }
            int i15 = i14 | i10;
            if ((i3 & 128) == 0) {
                y9q0Var2 = y9q0Var;
                if (fetVar.g(y9q0Var2)) {
                }
                i5 = i15 | i12;
                if ((4793491 & i5) != 4793490) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i5 & 1, z)) {
                    fetVar.Z();
                    if ((i2 & 1) != 0) {
                        if (i6 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j5 = qmk.q;
                        }
                        if ((i3 & 64) != 0) {
                            j6 = qmk.s;
                        }
                        if ((i3 & 128) != 0) {
                            y9q0Var2 = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 6, 0, qmk.G, 16613341);
                        }
                        mm40Var5 = mm40Var4;
                    } else {
                        if (i6 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if ((i3 & 32) != 0) {
                            j5 = qmk.q;
                        }
                        if ((i3 & 64) != 0) {
                            j6 = qmk.s;
                        }
                        if ((i3 & 128) != 0) {
                            y9q0Var2 = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 6, 0, qmk.G, 16613341);
                        }
                        mm40Var5 = mm40Var4;
                    }
                    long j17 = j5;
                    long j18 = j6;
                    y9q0 y9q0Var8 = y9q0Var2;
                    fetVar.s();
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(1642682611, new h15(mm40Var5, j18, j2, j17, str, y9q0Var8, str2), fetVar), fetVar, 56);
                    mm40Var3 = mm40Var5;
                    j8 = j18;
                    j7 = j17;
                    y9q0Var3 = y9q0Var8;
                } else {
                    fetVar.X();
                    mm40Var3 = mm40Var2;
                    j7 = j5;
                    j8 = j6;
                    y9q0Var3 = y9q0Var2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.i15
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            y9a.h(mm40Var3, str, str2, j2, j7, j8, y9q0Var3, (fet) obj, x8x.L(i2 | 1), i3);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            y9q0Var2 = y9q0Var;
            i5 = i15 | i12;
            if ((4793491 & i5) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i5 & 1, z)) {
                fetVar.Z();
                if ((i2 & 1) != 0) {
                    if (i6 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j5 = qmk.q;
                    }
                    if ((i3 & 64) != 0) {
                        j6 = qmk.s;
                    }
                    if ((i3 & 128) != 0) {
                        y9q0Var2 = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 6, 0, qmk.G, 16613341);
                    }
                    mm40Var5 = mm40Var4;
                } else {
                    if (i6 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j5 = qmk.q;
                    }
                    if ((i3 & 64) != 0) {
                        j6 = qmk.s;
                    }
                    if ((i3 & 128) != 0) {
                        y9q0Var2 = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 6, 0, qmk.G, 16613341);
                    }
                    mm40Var5 = mm40Var4;
                }
                long j19 = j5;
                long j110 = j6;
                y9q0 y9q0Var9 = y9q0Var2;
                fetVar.s();
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(1642682611, new h15(mm40Var5, j110, j2, j19, str, y9q0Var9, str2), fetVar), fetVar, 56);
                mm40Var3 = mm40Var5;
                j8 = j110;
                j7 = j19;
                y9q0Var3 = y9q0Var9;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                j7 = j5;
                j8 = j6;
                y9q0Var3 = y9q0Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.i15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        y9a.h(mm40Var3, str, str2, j2, j7, j8, y9q0Var3, (fet) obj, x8x.L(i2 | 1), i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        j6 = j4;
        int i16 = i14 | i10;
        if ((i3 & 128) == 0) {
            y9q0Var2 = y9q0Var;
            if (fetVar.g(y9q0Var2)) {
            }
            i5 = i16 | i12;
            if ((4793491 & i5) != 4793490) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i5 & 1, z)) {
                fetVar.Z();
                if ((i2 & 1) != 0) {
                    if (i6 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j5 = qmk.q;
                    }
                    if ((i3 & 64) != 0) {
                        j6 = qmk.s;
                    }
                    if ((i3 & 128) != 0) {
                        y9q0Var2 = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 6, 0, qmk.G, 16613341);
                    }
                    mm40Var5 = mm40Var4;
                } else {
                    if (i6 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i3 & 32) != 0) {
                        j5 = qmk.q;
                    }
                    if ((i3 & 64) != 0) {
                        j6 = qmk.s;
                    }
                    if ((i3 & 128) != 0) {
                        y9q0Var2 = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 6, 0, qmk.G, 16613341);
                    }
                    mm40Var5 = mm40Var4;
                }
                long j111 = j5;
                long j112 = j6;
                y9q0 y9q0Var10 = y9q0Var2;
                fetVar.s();
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(1642682611, new h15(mm40Var5, j112, j2, j111, str, y9q0Var10, str2), fetVar), fetVar, 56);
                mm40Var3 = mm40Var5;
                j8 = j112;
                j7 = j111;
                y9q0Var3 = y9q0Var10;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var2;
                j7 = j5;
                j8 = j6;
                y9q0Var3 = y9q0Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.i15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        y9a.h(mm40Var3, str, str2, j2, j7, j8, y9q0Var3, (fet) obj, x8x.L(i2 | 1), i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        y9q0Var2 = y9q0Var;
        i5 = i16 | i12;
        if ((4793491 & i5) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i5 & 1, z)) {
            fetVar.Z();
            if ((i2 & 1) != 0) {
                if (i6 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if ((i3 & 32) != 0) {
                    j5 = qmk.q;
                }
                if ((i3 & 64) != 0) {
                    j6 = qmk.s;
                }
                if ((i3 & 128) != 0) {
                    y9q0Var2 = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 6, 0, qmk.G, 16613341);
                }
                mm40Var5 = mm40Var4;
            } else {
                if (i6 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if ((i3 & 32) != 0) {
                    j5 = qmk.q;
                }
                if ((i3 & 64) != 0) {
                    j6 = qmk.s;
                }
                if ((i3 & 128) != 0) {
                    y9q0Var2 = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 6, 0, qmk.G, 16613341);
                }
                mm40Var5 = mm40Var4;
            }
            long j113 = j5;
            long j114 = j6;
            y9q0 y9q0Var11 = y9q0Var2;
            fetVar.s();
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1642682611, new h15(mm40Var5, j114, j2, j113, str, y9q0Var11, str2), fetVar), fetVar, 56);
            mm40Var3 = mm40Var5;
            j8 = j114;
            j7 = j113;
            y9q0Var3 = y9q0Var11;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
            j7 = j5;
            j8 = j6;
            y9q0Var3 = y9q0Var2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.i15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    y9a.h(mm40Var3, str, str2, j2, j7, j8, y9q0Var3, (fet) obj, x8x.L(i2 | 1), i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void i(mm40 mm40Var, bh8 bh8Var, fet fetVar, int i2) {
        bh8 bh8Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1802841824);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(bh8Var) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                pz40 pz40Var = s6t0.f31722a;
                objP = new i4d(StaticColors.INSTANCE.m73getBlack400d7_KjU());
                fetVar2.o0(objP);
            }
            i4d i4dVar = (i4d) objP;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = jr8Var.a(jm40Var);
            boolean z2 = (i3 & 112) == 32;
            Object objP2 = fetVar2.P();
            byte b2 = 5;
            if (z2 || objP2 == cl5Var) {
                objP2 = new d38(bh8Var, b2);
                fetVar2.o0(objP2);
            }
            k7x.b(bh8Var.f.f22722a, null, rq8.L(mm40VarA, (Function1) objP2), i4dVar, i4dVar, i4dVar, null, null, null, null, gqw0.A, null, fetVar2, 299056, 6, 31680);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(jm40Var, 12.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarJ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 36.0f, 0.0f, 11);
            y9q0 y9q0VarI = g1t0.i();
            bh8Var2 = bh8Var;
            String str = bh8Var2.b;
            pz40 pz40Var2 = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarN, staticColors.m123getWhite0d7_KjU(), new n05(qmk.q, qmk.s, qmk.n), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, y9q0VarI, fetVar, 0, 24960, 109552);
            v8q0.a(bh8Var2.c, o7k0.w(s5x0.N(new x7z(1.0f, true), 0.0f, 0.0f, 36.0f, 0.0f, 11), gqw0.l, false, 2), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 4, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            tf5 tf5Var = bh8Var2.e;
            fetVar2.e0(1853600344);
            mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.c);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new nk7((byte) 13);
                fetVar2.o0(objP3);
            }
            b34.h(bh8Var2.d, ffb0.P(mm40VarB, (Function1) objP3), kzn.d(null, 0.0f, 3), kzn.e(null, 3), null, u1c.M(842430221, new sd8(tf5Var, (byte) 0), fetVar2), fetVar2, 200064, 16);
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            bh8Var2 = bh8Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(mm40Var, bh8Var2, i2, (byte) 14);
        }
    }

    public static final void j(int i2, long j2, fet fetVar, mm40 mm40Var) {
        mm40Var.getClass();
        fetVar.g0(-747298767);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | 16;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                j2 = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator();
            } else {
                fetVar.X();
            }
            fetVar.s();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 1.0f);
            boolean zF = fetVar.f(j2);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new bx((byte) 20, j2);
                fetVar.o0(objP);
            }
            p8a.k(mm40VarE, (Function1) objP, fetVar, 0);
        } else {
            fetVar.X();
        }
        long j3 = j2;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ly2(mm40Var, j3, i2, (byte) 1);
        }
    }

    public static final void k(mwa mwaVar, Function0 function0, Function0 function1, fet fetVar, int i2) {
        fetVar.g0(1625917842);
        int i3 = (fetVar.g(mwaVar) ? 32 : 16) | i2 | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (!fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.X();
        } else if (mwaVar instanceof lwa) {
            fetVar.e0(-861042642);
            m((lwa) mwaVar, fetVar, i3 & 126);
            fetVar.r(false);
        } else {
            if (!(mwaVar instanceof kwa)) {
                throw b1j.f(-861044248, fetVar, false);
            }
            fetVar.e0(-861038178);
            l((kwa) mwaVar, function0, function1, fetVar, i3 & 8190);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mwaVar, function0, function1, i2);
        }
    }

    public static final void l(kwa kwaVar, Function0 function0, Function0 function1, fet fetVar, int i2) {
        int i3;
        kwa kwaVar2;
        int i4;
        Function0 function2 = function0;
        Function0 function3 = function1;
        fet fetVar2 = fetVar;
        fetVar2.g0(437234855);
        int i5 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i5 == 0) {
            i3 = (fetVar2.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(kwaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function3) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarI = dw9.i(zclVar, zclVar, zclVar, zclVar, jm40Var);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarI, backgroundContent, ljcVar), 12.0f);
            qw3 qw3Var = new qw3(10.0f, true, new jf4((byte) 14));
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(qw3Var, xx7Var, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 38.0f);
            zcl zclVar2 = qmk.e;
            mm40 mm40VarJ2 = s5x0.J(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), s6t0.b().f33626a.getBackground(), ljcVar), 8.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarJ2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            int i6 = i3;
            j0x.b(lv00.T(kwaVar.c, null, null, null, fetVar2, 0, 14), null, o2e.e0(o7k0.c, "CASHBACK_BUTTON_IMAGE"), null, gqw0.A, 0.0f, new m78(s6t0.b().f33626a.getPrimary(), 5), fetVar, 25008, 40);
            fetVar.r(true);
            mm40 mm40VarW2 = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            x5d x5dVarA2 = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 0);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarW2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            v8q0.a(kwaVar.f18991a, o2e.e0(o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), "CASHBACK_BUTTON_TITLE"), s6t0.b().f33626a.getTextPrimary(), new n05(qmk.q, qmk.t, qmk.n), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.v(), fetVar, 48, 24960, 109552);
            v8q0.a(kwaVar.b, o2e.e0(o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), "CASHBACK_BUTTON_SUBTITLE"), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 48, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            function3 = function1;
            i4 = i2;
            kwaVar2 = kwaVar;
            function2 = function0;
            a(o7k0.d(jm40Var, 1.0f), kwaVar.d, function2, function3, fetVar2, (i6 & 896) | 6 | (i6 & 7168));
            fetVar2.r(true);
        } else {
            kwaVar2 = kwaVar;
            i4 = i2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5(kwaVar2, function2, function3, i4);
        }
    }

    public static final void m(lwa lwaVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-100945857);
        int i4 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 = (fetVar.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(lwaVar) ? 32 : 16;
        }
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (lwaVar.f20756a == fwa.b) {
            fetVar.e0(-800754044);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 108.0f), 1.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar, 0, 1), fetVar, 0, false);
        } else {
            fetVar.e0(-800474238);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar3 = qmk.i;
            ugg0 ugg0Var2 = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarD2);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarE, s6t0.b().f33626a.getBackgroundContent(), jd8.n), 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), 20.0f), 128.0f);
            zcl zclVar4 = qmk.m;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
            mm40 mm40VarD3 = o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), 36.0f), 1.0f);
            zcl zclVar5 = qmk.f;
            dw9.x(h97.e(zclVar5, zclVar5, zclVar5, zclVar5, mm40VarD3), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(lwaVar, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(mm40 mm40Var, final xl0 xl0Var, d9z d9zVar, final Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        final byte b2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(77248827);
        int i3 = i2 | 6 | (fetVar2.g(xl0Var) ? 32 : 16) | (fetVar2.g(d9zVar) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
            jjm jjmVar = xl0Var.b;
            kjm kjmVar = kjm.f18392a;
            int i4 = i3 & 7168;
            int i5 = i3 & 112;
            boolean z2 = (i4 == 2048) | (i5 == 32);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new mc((Object) function1, (Object) xl0Var, (byte) 7);
                fetVar2.o0(objP);
            }
            nkb.h(mm40VarL, jjmVar, kjmVar, null, (Function0) objP, null, fetVar2, 384, 40);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zll zllVar = xl0Var.f41050a;
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar2).c, 0.0f, 2);
            boolean z3 = (i4 == 2048) | (i5 == 32);
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                b2 = 0;
                objP2 = new Function1() { // from class: a.ul0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = b2;
                        xl0 xl0Var2 = xl0Var;
                        Function1 function2 = function1;
                        st0 st0Var = (st0) obj;
                        switch (b3) {
                            case 0:
                                st0Var.getClass();
                                long j2 = st0Var.f32750a;
                                long j3 = xl0Var2.c.f16074a;
                                mtr mtrVar = st0Var.d;
                                function2.invoke(new gl0(j2, mtrVar != null ? mtrVar.b : false, j3));
                                break;
                            default:
                                st0Var.getClass();
                                function2.invoke(new hl0(st0Var.f32750a, xl0Var2.c.f16074a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP2);
            } else {
                b2 = 0;
            }
            Function1 function2 = (Function1) objP2;
            byte b3 = i4 == 2048 ? (byte) 1 : b2;
            if (i5 == 32) {
                b2 = 1;
            }
            boolean z4 = b3 | b2;
            Object objP3 = fetVar2.P();
            if (z4 != 0 || objP3 == cl5Var) {
                z = true;
                final char c2 = 1 == true ? 1 : 0;
                objP3 = new Function1() { // from class: a.ul0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = c2;
                        xl0 xl0Var2 = xl0Var;
                        Function1 function3 = function1;
                        st0 st0Var = (st0) obj;
                        switch (b4) {
                            case 0:
                                st0Var.getClass();
                                long j2 = st0Var.f32750a;
                                long j3 = xl0Var2.c.f16074a;
                                mtr mtrVar = st0Var.d;
                                function3.invoke(new gl0(j2, mtrVar != null ? mtrVar.b : false, j3));
                                break;
                            default:
                                st0Var.getClass();
                                function3.invoke(new hl0(st0Var.f32750a, xl0Var2.c.f16074a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP3);
            } else {
                z = true;
            }
            ckb.f(mm40VarD, zllVar, d9zVar, lh80VarT, null, null, function2, (Function1) objP3, fetVar2, (i3 & 896) | 6, 48);
            fetVar2 = fetVar2;
            fetVar2.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 9, i2, mm40Var2, xl0Var, d9zVar, function1);
        }
    }

    public static final void o(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(295673496);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
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
            mdm mdmVar = (mdm) l7m0Var.getValue();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new zbt0(function1, (byte) 25);
                fetVar.o0(objP);
            }
            jcb.l(jm40.b, mdmVar, false, (Function0) objP, fetVar, 6, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cn(l7m0Var, function1, i2, (byte) 12);
        }
    }

    public static final void p(oyp0 oyp0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(2001933225);
        int i3 = (fetVar.g(oyp0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarL = s5x0.L(o7k0.c, xfn.a(fetVar).d, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            String strW = rsm0.w(R.string.season_header, 0, fetVar);
            String str = oyp0Var.f26068a;
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new g4p0(function1, (byte) 24);
                fetVar.o0(objP);
            }
            x(strW, str, (Function0) objP, fetVar, 0);
            String strW2 = rsm0.w(R.string.tennis_surface_type, 0, fetVar);
            String str2 = oyp0Var.b;
            boolean z2 = i4 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new g4p0(function1, (byte) 25);
                fetVar.o0(objP2);
            }
            x(strW2, str2, (Function0) objP2, fetVar, 0);
            qxw.o(fetVar, new x7z(1.0f, true));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(rsm0.w(R.string.apply_settings, 0, fetVar)), oyp0Var.c, false, false);
            boolean z3 = i4 == 32;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new g4p0(function1, (byte) 26);
                fetVar.o0(objP3);
            }
            qzb.n(mm40VarD, wulVar, (Function0) objP3, fetVar, 6, 0);
            zcl zclVar = qmk.f28987a;
            rz4.t(jm40Var, 24.0f, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new myp0(oyp0Var, function1, i2, b2);
        }
    }

    public static final void q(Function0 function0, fjk fjkVar, ugd ugdVar, fet fetVar, int i2) {
        fetVar.g0(826668973);
        int i3 = i2 | (fetVar.i(function0) ? 4 : 2) | (fetVar.g(fjkVar) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            View view = (View) fetVar.k(dy2.f);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            k6z k6zVar = (k6z) fetVar.k(bmd.n);
            androidx.compose.runtime.a aVarG = e3c.G(fetVar);
            pz40 pz40VarF = androidx.compose.runtime.e.f(ugdVar, fetVar);
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new t32((byte) 24);
                fetVar.o0(objP);
            }
            UUID uuid = (UUID) e9x.Q(objArr, (Function0) objP, fetVar, 48);
            boolean zE = fetVar.e(2) | fetVar.g(view) | fetVar.g(w6kVar) | fetVar.g(null);
            Object objP2 = fetVar.P();
            if (zE || objP2 == obj) {
                xjk xjkVar = new xjk(function0, fjkVar, view, k6zVar, w6kVar, uuid);
                ugd ugdVar2 = new ugd(-1338939603, true, new fa2((Object) pz40VarF, (byte) 6));
                xik xikVar = xjkVar.h;
                xikVar.setParentCompositionContext(aVarG);
                ((hgk0) xikVar.k).setValue(ugdVar2);
                xikVar.o = true;
                xikVar.d();
                fetVar.o0(xjkVar);
                objP2 = xjkVar;
            }
            xjk xjkVar2 = (xjk) objP2;
            boolean zI = fetVar.i(xjkVar2);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new qy2(xjkVar2, b2);
                fetVar.o0(objP3);
            }
            m0x0.o(xjkVar2, (Function1) objP3, fetVar);
            boolean zI2 = fetVar.i(xjkVar2) | ((i3 & 14) == 4) | ((i3 & 112) == 32) | fetVar.e(k6zVar.ordinal());
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == obj) {
                objP4 = new mr0(xjkVar2, function0, fjkVar, k6zVar, (byte) 3);
                fetVar.o0(objP4);
            }
            m0x0.D((Function0) objP4, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2((Object) function0, (Object) fjkVar, (Object) ugdVar, i2, (byte) 0);
        }
    }

    public static final void r(mm40 mm40Var, Function2 function2, fet fetVar, int i2) {
        fetVar.g0(1090521195);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.i(function2) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.c;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            int i4 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
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
            h97.q((i4 >> 6) & 14, fetVar, function2, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sr1(mm40Var, function2, i2, (byte) 11);
        }
    }

    public static final void s(mm40 mm40Var, hkl hklVar, ene eneVar, Function0 function0, fet fetVar, int i2, int i3) {
        int i4;
        ene eneVar2;
        ene eneVar3;
        ene eneVar4;
        hklVar.getClass();
        fetVar.g0(1490550667);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(hklVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= ((i3 & 4) == 0 && fetVar.g(eneVar)) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                if ((i3 & 4) != 0) {
                    eneVar3 = qmk.i;
                    i4 &= -897;
                } else {
                    eneVar3 = eneVar;
                }
                eneVar4 = eneVar3;
            } else {
                fetVar.X();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                eneVar4 = eneVar;
            }
            fetVar.s();
            if (hklVar instanceof gkl) {
                fetVar.e0(-2099878668);
                u(o7k0.d(mm40Var, 1.0f), eneVar4, fetVar, (i4 >> 3) & 112);
                fetVar.r(false);
            } else {
                if (!(hklVar instanceof fkl)) {
                    throw b1j.f(-2099879617, fetVar, false);
                }
                fetVar.e0(-2099873485);
                t(o7k0.d(mm40Var, 1.0f), (fkl) hklVar, eneVar4, function0, fetVar, i4 & 8176);
                fetVar.r(false);
            }
            eneVar2 = eneVar4;
        } else {
            fetVar.X();
            eneVar2 = eneVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g13(mm40Var, hklVar, eneVar2, function0, i2, i3);
        }
    }

    public static final void t(mm40 mm40Var, fkl fklVar, ene eneVar, Function0 function0, fet fetVar, int i2) {
        int i3;
        Function0 function1;
        fet fetVar2 = fetVar;
        fetVar2.g0(680686110);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(fklVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(eneVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function1 = function0;
            i3 |= fetVar2.i(function1) ? 2048 : 1024;
        } else {
            function1 = function0;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar2.Z();
            if ((i2 & 1) != 0 && !fetVar2.B()) {
                fetVar2.X();
            }
            fetVar2.s();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = y860.W(o7k0.e(mm40Var, 114.0f), null, null, false, null, function1, 28);
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(lgb.J(mm40VarW, new ugg0(eneVar, eneVar, eneVar, eneVar)), fklVar.f9699a, jd8.n), "MY_AGGREGATOR_BANNER_BOX");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarV = yyw.V(n0qVar, fetVar2.k(bmd.n) == k6z.b);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new edl(fklVar, (byte) 7);
                fetVar2.o0(objP);
            }
            fetVar2 = fetVar;
            j0x.b(l7x.X(fklVar.b.a(), null, null, fetVar2, 0, 30), null, o2e.e0(pai0.a(mm40VarV, false, (Function1) objP), "DS_AGGREGATOR_BANNER_IMAGE"), null, gqw0.A, 0.0f, null, fetVar2, 24624, 104);
            M(s5x0.N(jm40.b, 16.0f, 0.0f, 80.0f, 0.0f, 10).e(n0qVar), fklVar, fetVar2, i4);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 4, i2, (Object) mm40Var, (Object) fklVar, (Object) eneVar, (Object) function0);
        }
    }

    public static final void u(mm40 mm40Var, ene eneVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1093295285);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(eneVar) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.Z();
            if ((i2 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 114.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(mm40VarE, new ugg0(eneVar, eneVar, eneVar, eneVar)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var, eneVar, i2, (byte) 27);
        }
    }

    public static final void v(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-333246461);
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
                objP = new mfp(function1, (byte) 5);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, (byte) 6);
        }
    }

    public static final void w(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0 l7m0Var2;
        int i3;
        Unit unit;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1226885117);
        byte b2 = 4;
        int i4 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
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
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rsm0.w(R.string.upcoming_events, 0, fetVar), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new mfp(function1, b2);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            mdm mdmVar = ((vgp) l7m0Var.getValue()).f37392a;
            if (mdmVar == null) {
                fetVar.e0(-729506316);
                fetVar.r(false);
                unit = null;
                i3 = i5;
            } else {
                fetVar.e0(-729506315);
                i3 = i5;
                v(mdmVar, function1, fetVar, i3);
                fetVar.r(false);
                unit = Unit.f46060a;
            }
            if (unit == null) {
                fetVar.e0(-1270453822);
                boolean z2 = (i3 == 32) | ((i4 & 14) == 4);
                Object objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    l7m0Var2 = l7m0Var;
                    objP2 = new ys4(l7m0Var2, function1, (byte) 8);
                    fetVar.o0(objP2);
                } else {
                    l7m0Var2 = l7m0Var;
                }
                b8k0.e(n0qVar, xczVarA, null, null, null, null, false, null, (Function1) objP2, fetVar, 6, 508);
                fetVar.r(false);
            } else {
                l7m0Var2 = l7m0Var;
                fetVar.e0(-1270457821);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            l7m0Var2 = l7m0Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var2, function1, i2, (byte) 12);
        }
    }

    public static final void x(String str, String str2, Function0 function0, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1434099517);
        int i3 = i2 | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 48.0f);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 6);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.j, fetVar2, 6);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            y9q0 y9q0VarK = g1t0.k();
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarK, fetVar2, i3 & 14, 0, 131066);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = dw9.j(fetVar);
            }
            v8q0.a(str2, y860.W(jm40Var, (gy40) objP, null, false, null, function0, 28), s6t0.b().f33626a.getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.k(), fetVar, (i3 >> 3) & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lsc0(str, str2, function0, i2, (byte) 2);
        }
    }

    public static final void y(b8y b8yVar, Function1 function1, fet fetVar, int i2) {
        byte b2;
        fetVar.g0(-2108148693);
        int i3 = (fetVar.i(b8yVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            F(6, fetVar, true);
            n0q n0qVar = o7k0.c;
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            k7x.a(b8yVar.f2181a, null, n0qVar, gqw0.A, null, fetVar, 1573296, 1976);
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarD);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            zq8.a(0, fetVar, i120.P(jr8.f16991a.a(jm40Var), yk5.n(q3d.j(new y3d(((StaticColors) fetVar.k(m8m0.f21378a)).m78getBlack800d7_KjU()), new y3d(y3d.f)), 0.0f, 0.0f, 14), null, 6));
            B(true, function1, fetVar, (i3 & 112) | 6);
            fetVar.r(true);
            mm40 mm40VarS = o050.S(o7k0.d(jm40Var, 1.0f).e(new x7z(1.0f, true)));
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarS, 0.0f, 0.0f, 0.0f, 40.0f, 7);
            x5d x5dVarA2 = w5d.a(mw3Var, gqw0.n, fetVar, 48);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            k7x.a(b8yVar.c, null, s5x0.L(dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true), 16.0f, 0.0f, 2), gqw0.B, null, fetVar, 1572912, 1976);
            b2 = 0;
            D(b8yVar.b, b8yVar.d, fetVar, 0);
            ohs0.x(fetVar, true, true, true);
        } else {
            b2 = 0;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(b8yVar, function1, i2, b2);
        }
    }

    public static final void z(c8y c8yVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1272831650);
        int i3 = (fetVar.g(c8yVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            F(6, fetVar, false);
            mm40 mm40VarS = o050.S(i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            mm40 mm40VarD = o7k0.d(jr8.f16991a.b(jm40.b, gqw0.e), 1.0f);
            mdm mdmVar = c8yVar.f3937a;
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new u9x(function1, (byte) 27);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarD, mdmVar, true, (Function0) objP, fetVar, 384, 0);
            B(false, function1, fetVar, i4 | 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(c8yVar, function1, i2, b2);
        }
    }
}
