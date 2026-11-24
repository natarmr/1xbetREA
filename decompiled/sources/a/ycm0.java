package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.cyber.section.impl.team_details.presentation.main.dialog.model.TeamDetailsDisciplineLineupModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ycm0 {
    public static final acs0 A(bcs0 bcs0Var) {
        long j = bcs0Var.f2368a;
        long j2 = bcs0Var.b;
        long j3 = bcs0Var.c;
        boolean z = bcs0Var.d;
        long j4 = bcs0Var.e;
        String str = bcs0Var.f;
        String str2 = bcs0Var.g;
        String str3 = bcs0Var.h;
        long j5 = bcs0Var.i;
        String str4 = bcs0Var.j;
        long j6 = bcs0Var.k;
        String str5 = bcs0Var.l;
        String str6 = bcs0Var.m;
        String str7 = bcs0Var.n;
        return new acs0(j, j2, j3, z, j4, str, str2, str3, j5, str4, j6, str5, str6, bcs0Var.o, bcs0Var.p, bcs0Var.q, bcs0Var.s, bcs0Var.t, bcs0Var.u, bcs0Var.v, bcs0Var.w, str7, bcs0Var.r, Boolean.valueOf(bcs0Var.x));
    }

    public static File B(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        jf4.n("getFilesDir returned null twice.");
        return null;
    }

    public static final void a(qgn0 qgn0Var, au6 au6Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        int i2;
        boolean z;
        shd shdVar;
        shd shdVar2;
        fet fetVar2 = fetVar;
        qgn0Var.getClass();
        dhn0 dhn0Var = qgn0Var.c;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(1355790333);
        int i3 = i | (fetVar2.g(qgn0Var) ? 4 : 2) | (fetVar2.e(au6Var.ordinal()) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024) | (fetVar2.i(function2) ? 16384 : 8192);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar3 = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar3);
            shd shdVar4 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar5 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar5);
            jpm0.n(fetVar2);
            shd shdVar6 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar6);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            au6 au6Var2 = au6.IMAGE;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(lgb.J(o7k0.g(s5x0.N(mm40VarD2, 0.0f, au6Var == au6Var2 ? 32.0f : 0.0f, 0.0f, 0.0f, 13), 0.0f, 448.0f, 1), vgg0.a(20.0f)), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n), "SUCCESS_BET_ALERT_ACTION_DIALOG");
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE0);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar3);
            jpm0.o(fetVar2, bh90VarM2, shdVar4);
            vqd.u(iHashCode2, fetVar2, shdVar5, fetVar2);
            mm40 mm40VarA0 = wha0.a0(ohs0.i(fetVar2, mm40VarC1, shdVar6, 1.0f, false), wha0.T(fetVar2), false, 14);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarA0);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar3);
            jpm0.o(fetVar2, bh90VarM3, shdVar4);
            vqd.u(iHashCode3, fetVar2, shdVar5, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar6);
            int i4 = i3 >> 3;
            c(au6Var, fetVar2, i4 & 14);
            b(qgn0Var.f28695a, qgn0Var.b, fetVar2, 0);
            if (dhn0Var.f6100a == null && dhn0Var.b.isEmpty()) {
                fetVar2.e0(-789290221);
                fetVar2.r(false);
                shdVar = shdVar4;
                shdVar2 = shdVar6;
                i2 = i3;
                z = true;
            } else {
                fetVar2.e0(-789540081);
                i2 = i3;
                z = true;
                shdVar = shdVar4;
                shdVar2 = shdVar6;
                aem0.b(s5x0.L(jm40Var, 0.0f, 12.0f, 1), dhn0Var, function0, fetVar2, i2 & 896, 0);
                fetVar2.r(false);
            }
            fetVar2.r(z);
            mm40 mm40VarM = s5x0.M(o7k0.d(jm40Var, 1.0f), 16.0f, 12.0f, 16.0f, 16.0f);
            thg0 thg0VarA = shg0.a(new qw3(12.0f, z, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarM);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar3);
            jpm0.o(fetVar2, bh90VarM4, shdVar);
            vqd.u(iHashCode4, fetVar2, shdVar5, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar2);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            qzb.n(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), qgn0Var.d, function1, fetVar2, i4 & 896, 0);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            fetVar2 = fetVar;
            qzb.n(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), qgn0Var.e, function2, fetVar2, (i2 >> 6) & 896, 0);
            fetVar2.r(true);
            fetVar2.r(true);
            if (au6Var == au6Var2) {
                fetVar2.e0(-927152493);
                j0x.b(a8k0.F(R.drawable.ic_success_bet, 0, fetVar2), null, o7k0.n(jr8.f16991a.b(jm40Var, gqw0.b), 68.0f), null, null, 0.0f, null, fetVar, 56, 120);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-926885025);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tvl0((Object) qgn0Var, (Object) au6Var, (Object) function0, (Object) function1, (Object) function2, i, (byte) 2);
        }
    }

    public static final void b(String str, String str2, fet fetVar, int i) {
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1345669632);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 12.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var, 1.0f), "SUCCESS_BET_ALERT_ACTION_DIALOG_TITLE");
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarT = g1t0.t();
            zfn zfnVar2 = zaq0.b;
            v8q0.a(str, mm40VarE0, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0VarT, fetVar, (i2 & 14) | 48, 0, 130040);
            fetVar2 = fetVar;
            if (str2.length() > 0) {
                fetVar2.e0(-674312669);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                str3 = str2;
                v8q0.a(str3, mm40VarD2, ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.k(), fetVar, ((i2 >> 3) & 14) | 48, 0, 130040);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                str3 = str2;
                fetVar2.e0(-674048084);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            str3 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 20, i, str, str3);
        }
    }

    public static final void c(au6 au6Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(670185428);
        if ((i & 6) == 0) {
            i2 = (fetVar.e(au6Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            int iOrdinal = au6Var.ordinal();
            jm40 jm40Var = jm40.b;
            if (iOrdinal == 0) {
                fetVar.e0(-196885562);
                zcl zclVar = qmk.f28987a;
                rz4.t(jm40Var, 12.0f, fetVar, false);
            } else if (iOrdinal == 1) {
                fetVar.e0(-196888219);
                zcl zclVar2 = qmk.f28987a;
                rz4.t(jm40Var, 36.0f, fetVar, false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(-196895662, fetVar, false);
                }
                fetVar.e0(-196894163);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
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
                jpm0.o(fetVar, tj30VarC, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                cem0.f(0, fetVar);
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(au6Var, i, (byte) 16);
        }
    }

    public static final void d(z77 z77Var, Function1 function1, fet fetVar, int i) {
        int i2;
        Function1 function2;
        ugd ugdVar;
        String str;
        byte b;
        fet fetVar2 = fetVar;
        z77Var.getClass();
        function1.getClass();
        fetVar2.g0(2132989055);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(z77Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            llm llmVar = z77Var.f().h;
            tlm tlmVar = z77Var.f().j;
            gmm gmmVar = z77Var.f().i;
            zfn zfnVar = zaq0.b;
            imm immVar = new imm(llmVar, tlmVar, gmmVar, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), false, null);
            if (z77Var.f().j instanceof mlm) {
                fetVar2.e0(-1218355273);
                ugd ugdVarM = u1c.M(523105278, new abn0(z77Var, (byte) 21), fetVar2);
                fetVar2.r(false);
                ugdVar = ugdVarM;
            } else {
                fetVar2.e0(-1217959032);
                fetVar2.r(false);
                ugdVar = null;
            }
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new gno0(function1, b2);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 32;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new zbm0(function1, (byte) 26);
                fetVar2.o0(objP2);
            }
            hlm.c(mm40VarD, immVar, null, function0, null, (Function1) objP2, null, null, null, null, ugdVar, null, fetVar, 6, 0, 3028);
            fetVar2 = fetVar;
            byte b3 = 3;
            byte b4 = 14;
            if (z77Var instanceof y77) {
                fetVar2.e0(-1217849074);
                long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                boolean zF = fetVar2.f(backgroundContent);
                Object objP3 = fetVar2.P();
                if (zF || objP3 == cl5Var) {
                    objP3 = new r2a0(b4, backgroundContent);
                    fetVar2.o0(objP3);
                }
                mm40 mm40VarK = rq8.K(mm40VarD2, (Function1) objP3);
                zcl zclVar = qmk.f28987a;
                xcm0.f(s5x0.M(mm40VarK, 12.0f, 8.0f, 12.0f, 12.0f), ((y77) z77Var).g, function1, fetVar2, (i3 << 3) & 896, 0);
                function2 = function1;
                fetVar2.r(false);
            } else {
                function2 = function1;
                fetVar2.e0(-1217150210);
                ijl ijlVar = ijl.f14880a;
                String strA = z77Var.b().a();
                on5 on5VarB = z77Var.b();
                dn5 dn5Var = on5VarB instanceof dn5 ? (dn5) on5VarB : null;
                String str2 = dn5Var != null ? dn5Var.f6351a : "";
                on5 on5VarB2 = z77Var.b();
                dn5 dn5Var2 = on5VarB2 instanceof dn5 ? (dn5) on5VarB2 : null;
                if (dn5Var2 == null || (str = dn5Var2.b) == null) {
                    str = "";
                }
                jjl jjlVar = new jjl(str2, str, strA, "");
                boolean z3 = i4 == 32;
                Object objP4 = fetVar2.P();
                if (z3 || objP4 == cl5Var) {
                    objP4 = new gno0(function2, b3);
                    fetVar2.o0(objP4);
                }
                Function0 function3 = (Function0) objP4;
                boolean z4 = i4 == 32;
                Object objP5 = fetVar2.P();
                if (z4 || objP5 == cl5Var) {
                    b = 4;
                    objP5 = new gno0(function2, b);
                    fetVar2.o0(objP5);
                } else {
                    b = 4;
                }
                Function0 function4 = (Function0) objP5;
                boolean z5 = i4 == 32;
                Object objP6 = fetVar2.P();
                if (z5 || objP6 == cl5Var) {
                    objP6 = new gno0(function2, (byte) 5);
                    fetVar2.o0(objP6);
                }
                feb.k(ijlVar, jjlVar, null, function3, function4, (Function0) objP6, fetVar2, 6, 4);
                int i5 = z77Var.f().m;
                a4x a4xVar = z77Var.f().n;
                ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                Iterator<E> it = a4xVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((j8w) it.next()).f16107a);
                }
                i4 i4VarR0 = dyb.r0(arrayList);
                aoo0 aoo0Var = aoo0.b;
                boolean z6 = ((i3 & 14) == b) | (i4 == 32);
                Object objP7 = fetVar2.P();
                if (z6 || objP7 == cl5Var) {
                    objP7 = new g57(function2, z77Var);
                    fetVar2.o0(objP7);
                }
                z5n.h(i5, i4VarR0, aoo0Var, null, null, false, (Function1) objP7, fetVar, 384, 56);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            i = i;
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) z77Var, (Object) function2, i, (byte) 20);
        }
    }

    public static final void e(mm40 mm40Var, kmp0 kmp0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        kmp0Var.getClass();
        fetVar2.g0(1850908715);
        int i2 = i | 6 | (fetVar2.g(kmp0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 172.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            mm40 mm40VarN = s5x0.N(o7k0.e(o7k0.d(jm40Var, 1.0f), 132.0f), 0.0f, 0.0f, 0.0f, 2.0f, 7);
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40 mm40VarQ = i120.Q(mm40VarN, staticColors.m73getBlack400d7_KjU(), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12));
            yx7 yx7Var = gqw0.k;
            nw3 nw3Var = uc9.e;
            thg0 thg0VarA = shg0.a(nw3Var, yx7Var, fetVar2, 54);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 36.0f, 0.0f, 11);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN2);
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
            jeb.j(o2e.e0(o7k0.n(jm40Var, 100.0f), "TEAM_STATS_DONUT_CHART_TEST_TAG"), kmp0Var.d, fetVar2, 0);
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            x5d x5dVarA2 = w5d.a(nw3Var, gqw0.n, fetVar2, 54);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarB);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            v8q0.a(kmp0Var.c, o2e.e0(jm40Var, "TEAM_STATS_NUMBER_OF_MATCHES_TEST_TAG"), staticColors.m123getWhite0d7_KjU(), null, qmk.w, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.p(), fetVar, 48, 0, 131048);
            mm40 mm40VarE0 = o2e.e0(jm40Var, "TEAM_STATS_NUMBER_OF_GAMES_TITLE_TEST_TAG");
            String lowerCase = rsm0.w(R.string.number_of_games_title, 0, fetVar).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            v8q0.a(lowerCase, mm40VarE0, staticColors.m123getWhite0d7_KjU(), null, qmk.r, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 48, 0, 131048);
            fetVar.r(true);
            fetVar.r(true);
            dnm0.c(0, fetVar, kmp0Var.e, null);
            fetVar.r(true);
            thg0 thg0VarA2 = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            mm40 mm40VarN3 = s5x0.N(o7k0.d(o7k0.e(jm40Var, 38.0f), 1.0f), 0.0f, 0.0f, 2.0f, 0.0f, 11);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE1 = o2e.e0(s5x0.L(i120.Q(mm40VarN3.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), staticColors.m73getBlack400d7_KjU(), vgg0.c(0.0f, 0.0f, 0.0f, 16.0f, 7)), 0.0f, 12.0f, 1), "TEAM_STATS_POINTS_TEST_TAG");
            String str = kmp0Var.b;
            long j = qmk.q;
            v8q0.a(str, mm40VarE1, staticColors.m123getWhite0d7_KjU(), null, j, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 130024);
            mm40 mm40VarD2 = o7k0.d(o7k0.e(jm40Var, 38.0f), 1.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(kmp0Var.f18553a, o2e.e0(s5x0.L(i120.Q(mm40VarD2.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), staticColors.m73getBlack400d7_KjU(), vgg0.c(0.0f, 0.0f, 16.0f, 0.0f, 11)), 0.0f, 12.0f, 1), "TEAM_STATS_GOAL_DIFFERENCE_TEST_TAG"), staticColors.m123getWhite0d7_KjU(), null, j, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 130024);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0((Object) mm40Var2, (Object) kmp0Var, i, (byte) 5);
        }
    }

    public static final void f(String str, String str2, boolean z, mm40 mm40Var, xdr xdrVar, fet fetVar, int i) {
        int i2;
        long jM98getGreen0d7_KjU;
        str2.getClass();
        fetVar.g0(-1413829311);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= fetVar.i(xdrVar) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            if (z) {
                fetVar.e0(1355631596);
                jM98getGreen0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU();
                fetVar.r(false);
            } else {
                fetVar.e0(1355566341);
                jM98getGreen0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                fetVar.r(false);
            }
            xcm0.d(str, jM98getGreen0d7_KjU, u1c.M(235326800, new h0(str2, (byte) 10), fetVar), xdrVar, fetVar, (i3 & 14) | 3072 | ((i3 >> 3) & 896) | (i3 & 57344));
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ztc0(str, str2, z, mm40Var2, xdrVar, i);
        }
    }

    public static final void g(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        mdmVar.getClass();
        function0.getClass();
        fetVar.g0(-1429222847);
        int i2 = i | 6 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float fT = knm0.t(1, fetVar, false);
            jm40 jm40Var = jm40.b;
            jcb.l(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, fT, 7), mdmVar, false, function0, fetVar, (i2 & 112) | ((i2 << 3) & 7168), 4);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gg8(mm40Var2, mdmVar, function0, i, (byte) 14);
        }
    }

    public static final void h(mm40 mm40Var, me80 me80Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        function0.getClass();
        function1.getClass();
        fetVar.g0(-1472241201);
        int i2 = i | (fetVar.g(me80Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zfn zfnVar = zaq0.b;
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(me80Var.f21632a, ha50.THREE_LINES, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_clear, me80Var.b, ra50.f30118a, ((ThemeColors) fetVar.k(zfnVar)).getSecondary()))), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new xhl0(function0, (byte) 24);
                fetVar.o0(objP);
            }
            Function0 function2 = (Function0) objP;
            boolean z2 = (i2 & 7168) == 2048;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new vpj0(function1, (byte) 13);
                fetVar.o0(objP2);
            }
            hlm.c(mm40Var, immVar, null, function2, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 805306374, 54, 468);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 22, i, mm40Var, me80Var, function0, function1);
        }
    }

    public static final void i(z1u0 z1u0Var, sek sekVar, bek bekVar, z5s z5sVar, qdz qdzVar, xex xexVar, CyberBottomSheetParams cyberBottomSheetParams, Function1 function1, fet fetVar, int i) {
        z1u0Var.getClass();
        sekVar.getClass();
        bekVar.getClass();
        qdzVar.getClass();
        xexVar.getClass();
        function1.getClass();
        fetVar.g0(1778361550);
        byte b = 4;
        int i2 = i | (fetVar.g(z1u0Var) ? 4 : 2) | (fetVar.g(sekVar) ? 32 : 16) | (fetVar.g(bekVar) ? 256 : 128) | (fetVar.g(z5sVar) ? 2048 : 1024) | (fetVar.g(qdzVar) ? 16384 : 8192) | (fetVar.g(xexVar) ? 131072 : 65536) | (fetVar.g(cyberBottomSheetParams) ? 1048576 : 524288) | (fetVar.i(function1) ? 8388608 : 4194304);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            int i3 = 29360128 & i2;
            boolean z = i3 == 8388608;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new zbt0(function1, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 8388608;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new zbt0(function1, (byte) 6);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            l7m0 l7m0Var = z1u0Var.f43640a;
            l7m0 l7m0Var2 = z1u0Var.b;
            l7m0 l7m0Var3 = z1u0Var.c;
            l7m0 l7m0Var4 = z1u0Var.d;
            l7m0 l7m0Var5 = z1u0Var.e;
            l7m0 l7m0Var6 = z1u0Var.f;
            l7m0 l7m0Var7 = z1u0Var.g;
            boolean z3 = i3 == 8388608;
            Object objP3 = fetVar.P();
            byte b2 = 7;
            if (z3 || objP3 == cl5Var) {
                objP3 = new zbt0(function1, b2);
                fetVar.o0(objP3);
            }
            Function0 function2 = (Function0) objP3;
            boolean z4 = i3 == 8388608;
            Object objP4 = fetVar.P();
            boolean z5 = z4;
            byte b3 = 8;
            if (z5 || objP4 == cl5Var) {
                objP4 = new zbt0(function1, b3);
                fetVar.o0(objP4);
            }
            Function0 function3 = (Function0) objP4;
            boolean z6 = i3 == 8388608;
            Object objP5 = fetVar.P();
            boolean z7 = z6;
            byte b4 = 9;
            if (z7 || objP5 == cl5Var) {
                objP5 = new zbt0(function1, b4);
                fetVar.o0(objP5);
            }
            Function0 function4 = (Function0) objP5;
            boolean z8 = i3 == 8388608;
            Object objP6 = fetVar.P();
            if (z8 || objP6 == cl5Var) {
                objP6 = new zbt0(function1, (byte) 10);
                fetVar.o0(objP6);
            }
            Function0 function5 = (Function0) objP6;
            boolean z9 = i3 == 8388608;
            Object objP7 = fetVar.P();
            if (z9 || objP7 == cl5Var) {
                objP7 = new sbt0(function1, (byte) 12);
                fetVar.o0(objP7);
            }
            Function1 function6 = (Function1) objP7;
            boolean z10 = i3 == 8388608;
            Object objP8 = fetVar.P();
            if (z10 || objP8 == cl5Var) {
                objP8 = new sbt0(function1, (byte) 13);
                fetVar.o0(objP8);
            }
            Function1 function7 = (Function1) objP8;
            boolean z11 = i3 == 8388608;
            Object objP9 = fetVar.P();
            if (z11 || objP9 == cl5Var) {
                objP9 = new sbt0(function1, (byte) 7);
                fetVar.o0(objP9);
            }
            Function1 function8 = (Function1) objP9;
            boolean z12 = i3 == 8388608;
            Object objP10 = fetVar.P();
            if (z12 || objP10 == cl5Var) {
                objP10 = new sbt0(function1, (byte) 8);
                fetVar.o0(objP10);
            }
            mrv.x(l7m0Var, l7m0Var2, l7m0Var3, l7m0Var4, l7m0Var5, l7m0Var6, l7m0Var7, sekVar, bekVar, z5sVar, xexVar, cyberBottomSheetParams, null, false, function2, function3, function4, function5, function6, function7, function8, (Function1) objP10, u1c.M(2082127649, new rkb(function1, qdzVar, (byte) 9), fetVar), fetVar, (i2 << 18) & 2143289344, (i2 >> 15) & 126, 12288);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fw6((Object) z1u0Var, sekVar, bekVar, z5sVar, (Object) qdzVar, (Object) xexVar, (Object) cyberBottomSheetParams, function1, i, (byte) 12);
        }
    }

    public static int j() {
        int iK = k(35633, "attribute vec2 position;\nvoid main() {\n    gl_Position = vec4(position, 0.0, 1.0);\n}");
        int iK2 = k(35632, "precision highp float;\nvoid main() {\n    vec2 p = gl_FragCoord.xy;\n    float x = sin(p.x * 0.031415);\n    float y = cos(p.y * 0.027182);\n    float z = sin(p.x * p.y * 0.00001);\n    gl_FragColor = vec4(x, y, z, 1.0);\n}");
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram == 0) {
            throw new tiu0("glCreateProgram failed", null, (byte) 2);
        }
        GLES20.glAttachShader(iGlCreateProgram, iK);
        GLES20.glAttachShader(iGlCreateProgram, iK2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 0) {
            GLES20.glDeleteShader(iK);
            GLES20.glDeleteShader(iK2);
            return iGlCreateProgram;
        }
        String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(iGlCreateProgram);
        GLES20.glDeleteProgram(iGlCreateProgram);
        throw new tiu0(kng0.k("glLinkProgram failed: ", strGlGetProgramInfoLog), null, (byte) 2);
    }

    public static int k(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            throw new tiu0("glCreateShader failed", null, (byte) 2);
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new tiu0(kng0.k("glCompileShader failed: ", strGlGetShaderInfoLog), null, (byte) 2);
    }

    public static String l(byte[] bArr) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.getClass();
        try {
            int[] iArr = new int[65536];
            int i = 0;
            for (int i2 = 0; i2 < 65536; i2++) {
                int i3 = bArr[i] & 255;
                int i4 = bArr[i + 1] & 255;
                int i5 = i + 3;
                int i6 = bArr[i + 2] & 255;
                i += 4;
                iArr[i2] = (i4 << 8) | (i3 << 16) | ((bArr[i5] & 255) << 24) | i6;
            }
            bitmapCreateBitmap.setPixels(iArr, 0, 256, 0, 0, 256, 256);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            strEncodeToString.getClass();
            return strEncodeToString;
        } finally {
            bitmapCreateBitmap.recycle();
        }
    }

    public static final List m(o9p0 o9p0Var, List list, ctf0 ctf0Var) {
        int i;
        String strValueOf;
        String str;
        boolean z;
        String strConcat;
        ihh ihhVar;
        n0x n0xVar;
        o9p0Var.getClass();
        list.getClass();
        ctf0Var.getClass();
        String str2 = o9p0Var.d;
        String str3 = o9p0Var.e;
        String str4 = o9p0Var.f;
        List list2 = o9p0Var.i;
        if (str2.length() == 0 || (o9p0Var.h.length() == 0 && str4.length() == 0 && list2.isEmpty() && str3.length() == 0)) {
            return iun.f15405a;
        }
        if (list2.isEmpty()) {
            strValueOf = "";
        } else {
            if (list2.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((eh) it.next()).e.equals("1") && (i = i + 1) < 0) {
                        q3d.o();
                        throw null;
                    }
                }
            }
            strValueOf = String.valueOf(i);
        }
        if (list2.isEmpty()) {
            str = "";
        } else {
            Iterator it2 = list2.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                i2 += ((eh) it2.next()).f;
            }
            Integer numValueOf = Integer.valueOf(i2);
            DecimalFormat decimalFormat = new DecimalFormat("#,###");
            decimalFormat.setGroupingUsed(true);
            DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            decimalFormatSymbols.setGroupingSeparator('.');
            decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            str = decimalFormat.format(numValueOf);
            str.getClass();
        }
        if (!list2.isEmpty()) {
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z = false;
                    break;
                }
                if (((eh) it3.next()).g) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (str.length() == 0) {
            strConcat = "";
        } else {
            strConcat = z ? "$".concat(str) : str.concat("$");
        }
        n0x n0xVar2 = new n0x(lmc.E(o9p0Var.b));
        lc00 lc00VarB = kotlin.collections.a.b();
        if (strValueOf.length() > 0) {
            lc00VarB.add(new a4m(1L, new d4m(ctf0Var.b.a(R.string.victories, Arrays.copyOf(new Object[0], 0)), strValueOf)));
        }
        if (strConcat.length() > 0) {
            lc00VarB.add(new a4m(2L, new d4m(ctf0Var.b.a(R.string.prizes_money_statistic, Arrays.copyOf(new Object[0], 0)), strConcat)));
        }
        if (str4.length() > 0) {
            String str5 = o9p0Var.g;
            if (str5.length() > 0) {
                StringBuilder sb = new StringBuilder(ujn.h);
                String strConcat2 = "cyberstatistic/v1/image/".concat(str5);
                if (strConcat2.length() == 0) {
                    sb.setLength(0);
                } else {
                    int i3 = 0;
                    if (StringsKt.O(strConcat2, ujn.h, false)) {
                        sb.setLength(i3);
                        sb.append(strConcat2);
                    } else if (kotlin.text.c.x(strConcat2, "https://", false)) {
                        i3 = 0;
                        sb.setLength(i3);
                        sb.append(strConcat2);
                    } else {
                        if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                            sb.append('/');
                        }
                        sb.append(StringsKt.y0(strConcat2, '/'));
                    }
                }
                n0xVar = new n0x(sb.toString());
            } else {
                n0xVar = new n0x("");
            }
            lc00VarB.add(new a4m(3L, new c4m(n0xVar, str4, z3m.f43726a)));
        }
        h0g h0gVar = new h0g(n0xVar2, str2, new g4m(dyb.o0(kotlin.collections.a.a(lc00VarB))));
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.other_lineups, Arrays.copyOf(new Object[0], 0));
        ArrayList arrayList = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            TeamDetailsDisciplineLineupModel teamDetailsDisciplineLineupModel = (TeamDetailsDisciplineLineupModel) it4.next();
            long j = teamDetailsDisciplineLineupModel.f46613a;
            if (j == o9p0Var.c) {
                ihhVar = null;
            } else {
                String str6 = teamDetailsDisciplineLineupModel.c;
                pz40 pz40Var = s6t0.f31722a;
                d2l0 d2l0Var = new d2l0(str6, s6t0.b().f33626a.getTextPrimary());
                zcl zclVar = qmk.f28987a;
                ihhVar = new ihh(j, new zrm(d2l0Var, new t1l0(p1l0.CYBER_ICON, new y3d(s6t0.b().f33626a.getSecondary60()), teamDetailsDisciplineLineupModel.b, null, null, null, 248), new v2l0(fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var))), d4d.BACKGROUND, new l3l0(16.0f), 32));
            }
            ArrayList arrayList2 = arrayList;
            if (ihhVar != null) {
                arrayList2.add(ihhVar);
            }
            arrayList = arrayList2;
        }
        zgh zghVar = new zgh(h0gVar, str3, new jhh(dyb.o0(arrayList), strA));
        lc00 lc00VarB2 = kotlin.collections.a.b();
        if (h0gVar.b.length() > 0 && !h0gVar.c.f10673a.isEmpty()) {
            lc00VarB2.add(new m9p0("HEADER_TEAM_INFO", new hjm(lsm0Var.a(R.string.about_team, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190)));
            lc00VarB2.add(new nbp0("TEAM_TEAM_INFO", zghVar));
        }
        return kotlin.collections.a.a(lc00VarB2);
    }

    public static byte[] n() throws Throwable {
        int iJ;
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        try {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexImage2D(3553, 0, 6408, 256, 256, 0, 6408, 5121, null);
            GLES20.glGenFramebuffers(1, iArr2, 0);
            GLES20.glBindFramebuffer(36160, iArr2[0]);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, iArr[0], 0);
            if (GLES20.glCheckFramebufferStatus(36160) != 36053) {
                throw new tiu0("Framebuffer error", null, (byte) 2);
            }
            iJ = j();
            try {
                GLES20.glUseProgram(iJ);
                GLES20.glViewport(0, 0, 256, 256);
                FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
                int iGlGetAttribLocation = GLES20.glGetAttribLocation(iJ, "position");
                GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
                GLES20.glVertexAttribPointer(iGlGetAttribLocation, 2, 5126, false, 0, (Buffer) floatBufferAsFloatBuffer);
                GLES20.glDrawArrays(5, 0, 4);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(262144);
                GLES20.glReadPixels(0, 0, 256, 256, 6408, 5121, byteBufferAllocate);
                GLES20.glDisableVertexAttribArray(iGlGetAttribLocation);
                byte[] bArrArray = byteBufferAllocate.array();
                bArrArray.getClass();
                if (iJ != 0) {
                    GLES20.glDeleteProgram(iJ);
                }
                if (iArr2[0] != 0) {
                    GLES20.glDeleteFramebuffers(1, iArr2, 0);
                }
                if (iArr[0] != 0) {
                    GLES20.glDeleteTextures(1, iArr, 0);
                }
                return bArrArray;
            } catch (Throwable th) {
                th = th;
                if (iJ != 0) {
                    GLES20.glDeleteProgram(iJ);
                }
                if (iArr2[0] != 0) {
                    GLES20.glDeleteFramebuffers(1, iArr2, 0);
                }
                if (iArr[0] != 0) {
                    GLES20.glDeleteTextures(1, iArr, 0);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            iJ = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x009a  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    public static final y6p0 o(List list, String str, String str2) {
        List<String> list2;
        String str3;
        ?? arrayList;
        String str4;
        String str5;
        String str6;
        char c;
        String str7 = str;
        String str8 = str7.equals("0") ? "" : str7;
        if (!list.isEmpty()) {
            list2 = list;
            str3 = (String) list2.get(0);
            str3.getClass();
            if (!kotlin.text.c.x(str3, ujn.h, false)) {
                if (str3.length() != 0) {
                    List list3 = u0d.f34849a;
                    if (!u0d.c(str3)) {
                        str3 = String.format(Locale.ENGLISH, StringsKt.O(str3, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str3}, 2));
                    }
                }
            }
            if (list2.size() > 1) {
                arrayList = new ArrayList();
                for (String str9 : list2) {
                    if (str7.equals("0")) {
                        str4 = "";
                    } else {
                        str4 = str7;
                    }
                    str9.getClass();
                    if (kotlin.text.c.x(str9, ujn.h, false)) {
                        str5 = str9;
                    } else {
                        if (str9.length() != 0) {
                            List list4 = u0d.f34849a;
                            if (u0d.c(str9)) {
                                if (StringsKt.O(str9, "playerlogo/", true)) {
                                    str6 = "%s/%s";
                                } else {
                                    str6 = "%s/playerlogo/%s";
                                }
                                Locale locale = Locale.ENGLISH;
                                Object[] objArr = {ujn.h, str9};
                                c = 2;
                                str5 = String.format(locale, str6, Arrays.copyOf(objArr, 2));
                            }
                            arrayList.add(new y6p0(iun.f15405a, str4, str2, str5));
                            str7 = str;
                        }
                        str5 = "";
                    }
                    c = 2;
                    arrayList.add(new y6p0(iun.f15405a, str4, str2, str5));
                    str7 = str;
                }
            } else {
                arrayList = iun.f15405a;
            }
            return new y6p0(arrayList, str8, str2, str3);
        }
        list2 = list;
        str3 = "";
        if (list2.size() > 1) {
            arrayList = new ArrayList();
            while (r6.hasNext()) {
                if (str7.equals("0")) {
                    str4 = "";
                } else {
                    str4 = str7;
                }
                str9.getClass();
                if (kotlin.text.c.x(str9, ujn.h, false)) {
                    str5 = str9;
                } else {
                    if (str9.length() != 0) {
                        List list5 = u0d.f34849a;
                        if (u0d.c(str9)) {
                            if (StringsKt.O(str9, "playerlogo/", true)) {
                                str6 = "%s/%s";
                            } else {
                                str6 = "%s/playerlogo/%s";
                            }
                            Locale locale2 = Locale.ENGLISH;
                            Object[] objArr2 = {ujn.h, str9};
                            c = 2;
                            str5 = String.format(locale2, str6, Arrays.copyOf(objArr2, 2));
                        }
                        arrayList.add(new y6p0(iun.f15405a, str4, str2, str5));
                        str7 = str;
                    }
                    str5 = "";
                }
                c = 2;
                arrayList.add(new y6p0(iun.f15405a, str4, str2, str5));
                str7 = str;
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new y6p0(arrayList, str8, str2, str3);
    }

    public static final a2m p(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        c2m c2mVar = c2m.f3631a;
        return z ? new z1m(c2mVar) : new y1m(c2mVar, new x1m(), str, str2, false, false);
    }

    public static final gbn r(Function1 function1) {
        return new gbn(new b4u0((byte) 12), new d8q0(3, (byte) 22), new sbt0(function1, (byte) 15), pfo0.f1);
    }

    public static final Object z(a3h0 a3h0Var, boolean z, Object obj, Function2 function2) throws Throwable {
        Object uddVar;
        Object objO;
        try {
            if (function2 instanceof zw5) {
                zys0.e(2, function2);
                uddVar = function2.invoke(obj, a3h0Var);
            } else {
                uddVar = pnx.c(function2, obj, a3h0Var);
            }
        } catch (mvk e) {
            Throwable th = e.f22460a;
            a3h0Var.N(new udd(th, false));
            throw th;
        } catch (Throwable th2) {
            uddVar = new udd(th2, false);
        }
        wne wneVar = wne.f39444a;
        if (uddVar == wneVar || (objO = a3h0Var.O(uddVar)) == qby.b) {
            return wneVar;
        }
        a3h0Var.e0();
        if (!(objO instanceof udd)) {
            return qby.a(objO);
        }
        if (!z) {
            Throwable th3 = ((udd) objO).f35472a;
            if ((th3 instanceof gmq0) && ((gmq0) th3).f11552a == a3h0Var) {
                if (uddVar instanceof udd) {
                    throw ((udd) uddVar).f35472a;
                }
                return uddVar;
            }
        }
        throw ((udd) objO).f35472a;
    }

    public abstract int q();

    public abstract void s(int i);

    public boolean t() {
        return false;
    }

    public abstract boolean u();

    public abstract void w(boolean z);

    public abstract void x(int i);

    public abstract void y(int i);

    public void v(boolean z) {
    }
}
