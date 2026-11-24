package a;

import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.os.Build;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.reflect.Field;
import java.security.GeneralSecurityException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
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

/* JADX INFO: loaded from: classes6.dex */
public abstract class i4w0 {
    public static uag0 l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f14164a = new ugd(210148896, false, new qbd((byte) 10));
    public static final ugd b = new ugd(1434917172, false, new zgd(23));
    public static final ugd c = new ugd(-1291378449, false, new fhd(12));
    public static final ugd d = new ugd(1660121982, false, new mhd(9));
    public static final ugd e = new ugd(112462953, false, new shd(2));
    public static final byte[] f = {53, 54, 43, 44, 45, 46, 47, 48, 37, 38};
    public static final byte[] g = {55, 56, 57, 58, 59, 60, 49, 50, 51, 52};
    public static final byte[] h = {39, 40, 41, 42, 31, 32};
    public static final byte[] i = {33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2};
    public static final byte[][] j = {new byte[]{39, 40, 41, 42, 31, 32}, new byte[]{33, 34, 35, 36, 25, 26}, new byte[]{27, 28, 29, 30, 19, 20}, new byte[]{21, 22, 23, 24, 13, 14}, new byte[]{15, 16, 17, 18, 7, 8}, new byte[]{9, 10, 11, 12, 1, 2}};
    public static final String[] k = {"\rABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001e\ufffbÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8"};
    public static final byte[] m = new byte[0];

    public static final void A(int i2, fet fetVar) {
        fetVar.g0(1048592088);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            float f2 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.K(jm40.b, f2, 4.0f), 1.0f), 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(vqm.f37862a, fetVar, 6, 0)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t4c0(i2, (byte) 18);
        }
    }

    public static final void B(anc0 anc0Var, fet fetVar, int i2) {
        fetVar.g0(-220478309);
        int i3 = (fetVar.g(anc0Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            nkb.h(s5x0.N(mm40VarD, xfn.a(fetVar).d, 8.0f, xfn.a(fetVar).d, 0.0f, 8), new hjm(anc0Var.f1144a, new mjm(127), null, null, null, null, false, null, null, false, null, null, 8188), kjm.f18392a, null, null, null, fetVar, 384, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lma0(anc0Var, i2, (byte) 27);
        }
    }

    public static final void C(int i2, fet fetVar) {
        fetVar.g0(-1305467197);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            nkb.h(s5x0.N(mm40VarD, xfn.a(fetVar).d, 8.0f, xfn.a(fetVar).d, 0.0f, 8), new ijm(new qjm()), kjm.f18392a, null, null, null, fetVar, 384, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t4c0(i2, (byte) 22);
        }
    }

    public static final void D(mm40 mm40Var, List list, Function2 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        list.getClass();
        function2.getClass();
        fetVar.g0(-1063111131);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        int i4 = 256;
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function2) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            enx enxVar = enx.b;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(q8a.k0(jm40Var, enxVar), 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            Iterator itV = kng0.v(fetVar, mm40VarC0, gqw0.v, -1720602022, list);
            while (itV.hasNext()) {
                pd80 pd80Var = (pd80) itV.next();
                String str = pd80Var.b;
                boolean z = pd80Var.d;
                mm40 mm40VarE = new x7z(1.0f, true).e(o7k0.c);
                boolean zG = ((i3 & 896) == i4) | fetVar.g(pd80Var);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new a540((Object) function2, (Object) pd80Var, (byte) 28);
                    fetVar.o0(objP);
                }
                E(0, fetVar, mm40VarE, str, (Function0) objP, z);
                i4 = 256;
            }
            fetVar.r(false);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var2, list, function2, i2, (byte) 5);
        }
    }

    public static final void E(int i2, fet fetVar, mm40 mm40Var, String str, Function0 function0, boolean z) {
        Pair pair;
        str.getClass();
        function0.getClass();
        fetVar.g0(1687066701);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            if (z) {
                fetVar.e0(-303010395);
                zfn zfnVar = zaq0.b;
                pair = new Pair(new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimaryForeground()));
                fetVar.r(false);
            } else {
                fetVar.e0(-302924277);
                zfn zfnVar2 = zaq0.b;
                pair = new Pair(new y3d(((ThemeColors) fetVar.k(zfnVar2)).getSecondaryButtonBackground()), new y3d(((ThemeColors) fetVar.k(zfnVar2)).getSecondaryButtonForeground()));
                fetVar.r(false);
            }
            long j2 = ((y3d) pair.f46059a).f41946a;
            long j3 = ((y3d) pair.b).f41946a;
            zcl zclVar = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), j2, jd8.n);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            mm40 mm40VarK = s5x0.K(y860.W(mm40VarQ, (gy40) objP, null, false, null, function0, 28), 8.0f, 10.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean zF = fetVar.f(j3);
            Object objP2 = fetVar.P();
            if (zF || objP2 == cl5Var) {
                objP2 = new f15((byte) 11, j3);
                fetVar.o0(objP2);
            }
            mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
            qrq qrqVar = j1t0.b;
            long j4 = qmk.s;
            aad.e(str, mm40VarB, y9q0.a(new y9q0(0L, j4, null, qrqVar, 0L, null, 0, 0, qmk.G, 16646109), 0L, 0L, null, null, null, 0L, null, null, 3, 0, qmk.B, null, null, 16613375), null, 2, false, 3, 0, (n4d) objP2, new n05(qmk.o, j4, idm0.t(1)), fetVar, ((i3 >> 3) & 14) | 1597440, 168);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b0y(mm40Var, str, z, function0, i2, (byte) 1);
        }
    }

    public static final void F(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-2036433536);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            cnc0 cnc0Var = (cnc0) l7m0Var.getValue();
            if (cnc0Var != null) {
                if (cnc0Var instanceof bnc0) {
                    fetVar.e0(1492465906);
                    I((bnc0) cnc0Var, function1, fetVar, i3 & 112);
                    fetVar.r(false);
                } else if (cnc0Var instanceof wmc0) {
                    fetVar.e0(1492469067);
                    o((wmc0) cnc0Var, function1, fetVar, i3 & 112);
                    fetVar.r(false);
                }
            }
            throw b1j.f(1492463431, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i2, (byte) 24);
        }
    }

    public static final void G(String str, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        fetVar.g0(436617998);
        int i3 = i2 | (fetVar.g(str) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            mm40 mm40VarE0 = o2e.e0(i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n), "PROMO_LIST_WITH_GAMES_SCREEN_COLUMN");
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
            imm immVar = new imm(new ilm(secondary), new plm(str, secondary, fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), false, null);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new bac0(function1, (byte) 14);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            twn.v(6, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(str, function1, ugdVar, i2);
        }
    }

    public static final void H(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-259958891);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (((tli0) l7m0Var.getValue()).c || ((tli0) l7m0Var.getValue()).d) {
            fetVar.e0(-609002790);
            h(((tli0) l7m0Var.getValue()).h, ((tli0) l7m0Var.getValue()).i, function1, fetVar, (i3 << 3) & 896);
            fetVar.r(false);
        } else {
            fetVar.e0(-609075826);
            p(l7m0Var, function1, fetVar, i3 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i2, (byte) 6);
        }
    }

    public static final void I(bnc0 bnc0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-552880562);
        int i3 = (fetVar.g(bnc0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            G(bnc0Var.f2876a, function1, u1c.M(-777791628, new iob0((Object) bnc0Var, (byte) 3), fetVar), fetVar, (i3 & 112) | 384);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(bnc0Var, function1, i2, (byte) 23);
        }
    }

    public static final void J(mm40 mm40Var, int i2, pdz pdzVar, fet fetVar, int i3, int i4) {
        mm40 mm40Var2;
        int i5;
        pdzVar.getClass();
        fetVar.g0(-830110498);
        int i6 = i4 & 1;
        if (i6 != 0) {
            i5 = i3 | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i5 = i3 | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        if ((i3 & 48) == 0) {
            i5 |= fetVar.e(i2) ? 32 : 16;
        }
        int i7 = i5 | (fetVar.g(pdzVar) ? 256 : 128);
        if (fetVar.U(i7 & 1, (i7 & 147) != 146)) {
            mm40 mm40Var3 = i6 != 0 ? jm40.b : mm40Var2;
            Object objK = fetVar.k(r9r0.f30099a);
            if (objK == null) {
                throw new ss3(ohs0.n(sre0.f32672a.b(txi.class).J(), " не предоставлен (нет CompositionLocalProvider выше)"));
            }
            sxi sxiVar = (sxi) ((txi) objK).q.get();
            sgy sgyVarB = sre0.f32672a.b(zeo0.class);
            q0h0 q0h0Var = new q0h0(sxiVar);
            int i8 = zeo0.u;
            k3t0 k3t0VarX = n4c.X(sgyVarB, null, q0h0Var, fetVar, 14);
            boolean zI = fetVar.i(k3t0VarX) | ((i7 & 112) == 32);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zI || objP == obj) {
                objP = new x9c(k3t0VarX, i2, (byte) 11);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(k3t0VarX);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == obj) {
                objP2 = new dbh(k3t0VarX, (byte) 26);
                fetVar.o0(objP2);
            }
            v3c.A(function0, (Function0) objP2, null, fetVar, 0, 4);
            int i9 = (i7 >> 3) & 112;
            xcz xczVarB = pdzVar.b(twn.m(i2, "LEFT_"), fetVar, i9);
            xcz xczVarB2 = pdzVar.b("RIGHT_" + i2, fetVar, i9);
            String strM = twn.m(i2, "HORIZONTAL_");
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new hvy((byte) 15);
                fetVar.o0(objP3);
            }
            rah0 rah0Var = (rah0) pdzVar.c(strM, (Function2) objP3);
            i3t0 i3t0Var = (i3t0) k3t0VarX;
            xeo0 xeo0Var = (xeo0) i3t0Var.y(fetVar).getValue();
            if (Intrinsics.d(xeo0Var, veo0.f37296a)) {
                fetVar.e0(1127761030);
                n0q n0qVar = o7k0.c;
                Object objP4 = fetVar.P();
                if (objP4 == obj) {
                    objP4 = new rgn0((byte) 29);
                    fetVar.o0(objP4);
                }
                mm40 mm40VarK = rq8.K(n0qVar, (Function1) objP4);
                float f2 = xfn.a(fetVar).c;
                float f3 = xfn.a(fetVar).c;
                zcl zclVar = qmk.f28987a;
                mym0.d(0, fetVar, s5x0.N(mm40VarK, f2, 8.0f, f3, 0.0f, 8));
                fetVar.r(false);
            } else if (xeo0Var instanceof ueo0) {
                fetVar.e0(1127775852);
                ueo0 ueo0Var = (ueo0) xeo0Var;
                boolean zI3 = fetVar.i(i3t0Var);
                Object objP5 = fetVar.P();
                if (zI3 || objP5 == obj) {
                    Object ndn0Var = new ndn0(1, i3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 29);
                    fetVar.o0(ndn0Var);
                    objP5 = ndn0Var;
                }
                vbw0.K(mm40Var3, ueo0Var, xczVarB, xczVarB2, rah0Var, (Function1) ((jhy) objP5), fetVar, i7 & 14);
                fetVar.r(false);
            } else {
                if (!(xeo0Var instanceof weo0)) {
                    throw b1j.f(1127759259, fetVar, false);
                }
                fetVar.e0(1127785944);
                n0q n0qVar2 = o7k0.c;
                pz40 pz40Var = s6t0.f31722a;
                iym0.d(i120.Q(n0qVar2, s6t0.b().f33626a.getBackground(), jd8.n), (weo0) xeo0Var, fetVar, 0);
                fetVar.r(false);
            }
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m8n(mm40Var2, i2, pdzVar, i3, i4);
        }
    }

    public static final void K(mm40 mm40Var, final nts0 nts0Var, final boolean z, final Function1 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(242919615);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(nts0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            int iB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32);
            float f2 = ((Resources) fetVar.k(dy2.c)).getDisplayMetrics().density;
            zcl zclVar = qmk.f28987a;
            float fT = fbc.T(fetVar);
            boolean zE = fetVar.e(iB) | fetVar.d(f2);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                objP = androidx.compose.runtime.e.a(((iB / f2) / 2.6f) + 24.0f);
                fetVar.o0(objP);
            }
            agk0 agk0Var = (agk0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                pel pelVar = new pel();
                qt2 qt2Var = qt2.f29279a;
                pelVar.a(qt2Var, agk0Var.l());
                pelVar.a(qt2.b, 0.0f);
                float[] fArr = pelVar.b;
                ArrayList arrayList = pelVar.f26860a;
                int size = arrayList.size();
                nx3.a(size, fArr.length);
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
                fArrCopyOfRange.getClass();
                objP2 = new rv2(new vtj(arrayList, fArrCopyOfRange), qt2Var);
                fetVar.o0(objP2);
            }
            rv2 rv2Var = (rv2) objP2;
            Float fValueOf = Float.valueOf(agk0Var.l());
            boolean zG = fetVar.g(agk0Var);
            Object objP3 = fetVar.P();
            yje yjeVar = null;
            if (zG || objP3 == cl5Var) {
                objP3 = new rtq0(rv2Var, agk0Var, yjeVar, (byte) 14);
                fetVar.o0(objP3);
            }
            m0x0.v(rv2Var, fValueOf, (Function2) objP3, fetVar);
            hyl hylVar = nts0Var.d;
            boolean z2 = (i3 & 112) == 32;
            Object objP4 = fetVar.P();
            if (z2 || objP4 == cl5Var) {
                objP4 = new meq0((Object) nts0Var, (Object) rv2Var, yjeVar, (byte) 26);
                fetVar.o0(objP4);
            }
            m0x0.t(fetVar, hylVar, (Function2) objP4);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarE, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n), 0.0f, fT, 0.0f, 0.0f, 13);
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
            y0x0.d(jm40.b, agk0Var.l(), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), 0L, 24.0f, true, rv2Var, u1c.M(-89887263, new ah10(nts0Var, function1, agk0Var), fetVar), u1c.M(-1529918489, new zdr() { // from class: a.dts0
                @Override // a.zdr
                public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    fet fetVar3 = (fet) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    ((hh80) obj).getClass();
                    ((l7m0) obj2).getClass();
                    ((l7m0) obj3).getClass();
                    if (fetVar3.U(iIntValue & 1, (iIntValue & 1025) != 1024)) {
                        n0q n0qVar = o7k0.c;
                        long backgroundContent = ((ThemeColors) fetVar3.k(zaq0.b)).getBackgroundContent();
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarL = s5x0.L(i120.Q(n0qVar, backgroundContent, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), 0.0f, 4.0f, 1);
                        x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                        int iHashCode2 = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM2 = fetVar3.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarL);
                        mkd.c0.getClass();
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(e7z.u1);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, x5dVarA2, gqw0.x);
                        jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                        jpm0.o(fetVar3, Integer.valueOf(iHashCode2), gqw0.y);
                        jpm0.n(fetVar3);
                        jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                        nts0 nts0Var2 = nts0Var;
                        hyl hylVar2 = nts0Var2.d;
                        vxl vxlVar = vxl.b;
                        Function1 function2 = function1;
                        boolean zG2 = fetVar3.g(function2);
                        Object objP5 = fetVar3.P();
                        if (zG2 || objP5 == ukd.f35823a) {
                            objP5 = new xar0(function2, (byte) 14);
                            fetVar3.o0(objP5);
                        }
                        ebc.r(null, hylVar2, vxlVar, (Function1) objP5, null, fetVar3, 0, 41);
                        ewm0.k(s5x0.M(jm40.b, xfn.a(fetVar3).c, 4.0f, xfn.a(fetVar3).c, 12.0f), nts0Var2.e, fetVar3, 0);
                        vbw0.L(null, z, nts0Var2.b, fetVar3, 0);
                        fetVar3.r(true);
                    } else {
                        fetVar3.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 905994246, 64);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040((byte) 16, i2, (Object) mm40Var, (Object) nts0Var, (Object) function1, z);
        }
    }

    public static final void L(mm40 mm40Var, ots0 ots0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        ots0 ots0Var2 = ots0Var;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        fetVar2.g0(-723920517);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(ots0Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function2) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            float fT = fbc.T(fetVar2);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarN = s5x0.N(o050.S(i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n)), 0.0f, fT, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            imm immVar = ots0Var2.f25845a;
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new nas0(function2, (byte) 11);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i4 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new xar0(function2, (byte) 15);
                fetVar2.o0(objP2);
            }
            hlm.c(null, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 0, 0, 4053);
            fetVar2 = fetVar;
            jcb.v(null, 0.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60(), fetVar2, 0, 3);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            ots0Var2 = ots0Var;
            mdm mdmVar = ots0Var2.b;
            boolean z4 = i4 == 256;
            Object objP3 = fetVar2.P();
            if (z4 || objP3 == cl5Var) {
                function2 = function1;
                objP3 = new nas0(function2, (byte) 12);
                fetVar2.o0(objP3);
            } else {
                function2 = function1;
            }
            jcb.l(null, mdmVar, false, (Function0) objP3, fetVar2, 0, 5);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s0n0(mm40Var, ots0Var2, function2, i2, (byte) 17);
        }
    }

    public static final void M(mm40 mm40Var, l7m0 l7m0Var, boolean z, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        fetVar.g0(-1959243676);
        int i3 = (fetVar.g(l7m0Var) ? 32 : 16) | i2 | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            pts0 pts0Var = (pts0) l7m0Var.getValue();
            if (pts0Var != null) {
                if (pts0Var instanceof nts0) {
                    fetVar.e0(777470533);
                    K(mm40Var, (nts0) pts0Var, z, function1, fetVar, i3 & 8078);
                    fetVar.r(false);
                } else if (pts0Var instanceof ots0) {
                    fetVar.e0(777722842);
                    L(mm40Var, (ots0) pts0Var, function1, fetVar, ((i3 >> 3) & 896) | 6);
                    fetVar.r(false);
                }
            }
            throw b1j.f(-1637490531, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new az8(mm40Var, l7m0Var, z, function1, i2, (byte) 2);
        }
    }

    public static final i4 N(c01 c01Var) {
        lc00 lc00VarB = kotlin.collections.a.b();
        for (int i2 = 0; i2 < 2; i2++) {
            lc00VarB.add(new r11(vzh.f38299a, nkb.N(c01Var), null, null, null, null, 0));
        }
        return dyb.r0(kotlin.collections.a.a(lc00VarB));
    }

    public static final String O(elt eltVar, String str, long j2, ctf0 ctf0Var) {
        int i2;
        eltVar.getClass();
        str.getClass();
        ctf0Var.getClass();
        int i3 = eltVar.e;
        String str2 = eltVar.b;
        String str3 = eltVar.d;
        boolean z = i3 != 215;
        String strConcat = str2.concat((!z || str3.length() <= 0) ? "" : ", ");
        if (!z || str3.length() <= 0) {
            str3 = "";
        }
        String strConcat2 = strConcat.concat(str3);
        String str4 = Build.MANUFACTURER;
        String str5 = Build.MODEL;
        str5.getClass();
        str4.getClass();
        String strM = kotlin.text.c.x(str5, str4, false) ? ckb.M(str5) : w6x.q(ckb.M(str4), Separators.SP, str5);
        String strK = kng0.k("Android ", Build.VERSION.RELEASE);
        Field[] fields = Build.VERSION_CODES.class.getFields();
        fields.getClass();
        String str6 = strK;
        for (Field field : fields) {
            String name = field.getName();
            name.getClass();
            try {
                i2 = field.getInt(new Object());
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                i2 = -1;
            } catch (IllegalArgumentException e3) {
                e3.printStackTrace();
                i2 = -1;
            } catch (NullPointerException e4) {
                e4.printStackTrace();
                i2 = -1;
            }
            if (i2 == Build.VERSION.SDK_INT) {
                str6 = str6 + Separators.SP + name + " (" + i2 + Separators.RPAREN;
            }
        }
        rdj rdjVar = rdj.f30294a;
        String strG = rdj.g(new znq0(j2), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56);
        return b1j.k(P(ctf0Var.f(R.string.app_version_info, new Object[0]), str, false), P(ctf0Var.f(R.string.device_info, new Object[0]), strM, false), P(ctf0Var.f(R.string.os_version_info, new Object[0]), str6, strConcat2.length() == 0), strConcat2.length() > 0 ? P(ctf0Var.f(R.string.geo_data_info, new Object[0]), strConcat2, strG.length() == 0) : "", strG.length() > 0 ? P(ctf0Var.f(R.string.installation_date, new Object[0]), strG, true) : "");
    }

    public static final String P(String str, String str2, boolean z) {
        return b1j.k("<b>", str, ":</b><br/>- ", str2, !z ? ";<br/><br/>" : Separators.DOT);
    }

    public static final mtl Q(g72 g72Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        boolean z = g72Var.o;
        Set set = g72Var.p;
        if (!z) {
            return null;
        }
        lul lulVar = lul.e;
        oe9 oe9Var = oe9.f25112a;
        Set set2 = set;
        Object[] objArr = {Integer.valueOf(set2.size()), 10};
        lsm0 lsm0Var = ctf0Var.b;
        return new mtl(dyb.g0(new itl(new wul(lulVar, oe9Var, new ue9(lsm0Var.a(R.string.select_items_max, Arrays.copyOf(objArr, 2))), !set2.isEmpty(), false, false), tbb.f33655a), new itl(new wul(nul.e, oe9Var, new ue9(lsm0Var.a(R.string.cancel, Arrays.copyOf(new Object[0], 0))), true, false, false), sbb.f31924a)));
    }

    public static int R(byte[] bArr, byte[] bArr2) {
        int length = 0;
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            int i3 = bArr2[i2] - 1;
            length += (((1 << (5 - (i3 % 6))) & bArr[i3 / 6]) == 0 ? 0 : 1) << ((bArr2.length - i2) - 1);
        }
        return length;
    }

    public static String S(byte[] bArr, int i2, int i3) {
        StringBuilder sb = new StringBuilder();
        int i4 = i2;
        int i5 = -1;
        int i6 = 0;
        int i7 = 0;
        while (i4 < i2 + i3) {
            char cCharAt = k[i6].charAt(bArr[i4]);
            switch (cCharAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i7 = i6;
                    i6 = cCharAt - 65520;
                    i5 = 1;
                    break;
                case 65525:
                    i5 = 2;
                    i7 = i6;
                    i6 = 0;
                    break;
                case 65526:
                    i5 = 3;
                    i7 = i6;
                    i6 = 0;
                    break;
                case 65527:
                    i5 = -1;
                    i6 = 0;
                    break;
                case 65528:
                    i5 = -1;
                    i6 = 1;
                    break;
                case 65529:
                    i5 = -1;
                    break;
                case 65530:
                default:
                    sb.append(cCharAt);
                    break;
                case 65531:
                    int i8 = (bArr[i4 + 1] << 24) + (bArr[i4 + 2] << 18) + (bArr[i4 + 3] << 12) + (bArr[i4 + 4] << 6);
                    i4 += 5;
                    sb.append(new DecimalFormat("000000000").format(i8 + bArr[i4]));
                    break;
            }
            int i9 = i5 - 1;
            if (i5 == 0) {
                i6 = i7;
            }
            i4++;
            i5 = i9;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static final mm40 T(mm40 mm40Var, Function1 function1) {
        return mm40Var.e(new h88(function1));
    }

    public static mm40 U(mm40 mm40Var, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long j2, yjj0 yjj0Var, boolean z, long j3, long j4, int i2, z5z z5zVar, int i3) {
        return mm40Var.e(new efv((i3 & 1) != 0 ? 1.0f : f2, (i3 & 2) != 0 ? 1.0f : f3, (i3 & 4) != 0 ? 1.0f : f4, (i3 & 8) != 0 ? 0.0f : f5, (i3 & 16) != 0 ? 0.0f : f6, (i3 & 32) != 0 ? 0.0f : f7, (i3 & 64) != 0 ? 0.0f : f8, 0.0f, (i3 & 256) != 0 ? 0.0f : f9, 8.0f, (i3 & 1024) != 0 ? ils0.b : j2, (i3 & 2048) != 0 ? jd8.n : yjj0Var, (i3 & 4096) != 0 ? false : z, null, (i3 & 16384) != 0 ? hfv.f12988a : j3, (32768 & i3) != 0 ? hfv.f12988a : j4, (65536 & i3) != 0 ? 0 : i2, 3, null, (i3 & 524288) != 0 ? z5z.c : z5zVar));
    }

    public static mm40 V(mm40 mm40Var, float f2, float f3, float f4, float f5, yjj0 yjj0Var, int i2) {
        float f6 = (i2 & 1) != 0 ? 1.0f : f2;
        float f7 = (i2 & 2) != 0 ? 1.0f : f3;
        float f8 = (i2 & 4) != 0 ? 1.0f : f4;
        float f9 = (i2 & 32) != 0 ? 0.0f : f5;
        long j2 = ils0.b;
        yjj0 yjj0Var2 = (i2 & 2048) != 0 ? jd8.n : yjj0Var;
        long j3 = hfv.f12988a;
        return U(mm40Var, f6, f7, f8, 0.0f, 0.0f, f9, 0.0f, 0.0f, j2, yjj0Var2, false, j3, j3, 0, null, 524288);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    public static final n08 W(q08 q08Var) {
        ?? arrayList;
        List<o18> list = q08Var.f27884a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (o18 o18Var : list) {
                Integer num = o18Var.f24467a;
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = o18Var.b;
                arrayList.add(new k18(iIntValue, num2 != null ? num2.intValue() : 0));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        Integer num3 = q08Var.b;
        int iIntValue2 = num3 != null ? num3.intValue() : 0;
        Integer num4 = q08Var.c;
        return new n08(iIntValue2, num4 != null ? num4.intValue() : 0, arrayList);
    }

    public static s1x0 X(xzw0 xzw0Var) throws GeneralSecurityException {
        fpw0 fpw0Var = xzw0Var.e;
        if (!(fpw0Var instanceof mrw0)) {
            if (fpw0Var instanceof brw0) {
                return new y78((brw0) fpw0Var);
            }
            if (fpw0Var instanceof zyw0) {
                return new y78((zyw0) fpw0Var);
            }
            throw new GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(fpw0Var)));
        }
        mrw0 mrw0Var = (mrw0) fpw0Var;
        x860 x860Var = new x860();
        if (mrw0Var.b != 12) {
            hny.o("invalid IV size");
            throw null;
        }
        if (mrw0Var.c != 16) {
            hny.o("invalid tag size");
            throw null;
        }
        if (mrw0Var.d == p50.k) {
            x860Var.f40449a = mrw0Var.f22292a;
            return x860Var;
        }
        hny.o("invalid variant");
        throw null;
    }

    public static final void a(ow owVar, Function1 function1, fet fetVar, int i2) {
        owVar.getClass();
        function1.getClass();
        fetVar.g0(-1638146772);
        int i3 = (fetVar.g(owVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            WeakHashMap weakHashMap = djv0.w;
            q33 q33Var = zcm0.i(fetVar).e;
            float f2 = q33Var.e().d;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dn(function1, (byte) 4);
                fetVar.o0(objP);
            }
            knx.i(false, (Function0) objP, fetVar, 0, 1);
            m8x.y(jm40.b, u1c.M(-923194384, new yv(owVar, function1), fetVar), u1c.M(-750780303, new zv(owVar, f2, function1, b2), fetVar), null, null, 0, background, 0L, null, u1c.M(269300283, new aw(background, owVar, backgroundContent, function1), fetVar), fetVar, 805306806, 440);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yv(owVar, function1, i2);
        }
    }

    public static final void b(mm40 mm40Var, bdz bdzVar, bzl bzlVar, qj2 qj2Var, float f2, Function1 function1, fet fetVar, int i2) {
        bdz bdzVar2;
        bzl bzlVar2;
        mm40 mm40Var2;
        mm40 mm40Var3;
        mm40 mm40Var4;
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        bdzVar.getClass();
        function1.getClass();
        fetVar2.g0(-309518175);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            bdzVar2 = bdzVar;
            i3 |= fetVar2.g(bdzVar2) ? 32 : 16;
        } else {
            bdzVar2 = bdzVar;
        }
        if ((i2 & 384) == 0) {
            bzlVar2 = bzlVar;
            i3 |= fetVar2.g(bzlVar2) ? 256 : 128;
        } else {
            bzlVar2 = bzlVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.g(qj2Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar2.Z();
            if ((i2 & 1) == 0 || fetVar2.B()) {
                mm40Var3 = jm40.b;
            } else {
                fetVar2.X();
                mm40Var3 = mm40Var;
            }
            fetVar2.s();
            int i4 = 458752 & i3;
            boolean z3 = i4 == 131072;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new ja2(function1, (byte) 25);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = i4 == 131072;
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new ja2(function1, (byte) 26);
                fetVar2.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar2, 0, 4);
            mm40 mm40VarE = mm40Var3.e(o7k0.c);
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
            nde ndeVar = qj2Var.b;
            if (ndeVar instanceof xce) {
                fetVar2.e0(-1571175995);
                wvb.u(null, (xce) ndeVar, function1, fetVar2, (i3 >> 9) & 896, 1);
                fetVar2.r(false);
                z = true;
                mm40Var4 = mm40Var3;
            } else {
                if (ndeVar instanceof cde) {
                    fetVar2.e0(-1570967458);
                    bdz bdzVar3 = bdzVar2;
                    mm40Var4 = mm40Var3;
                    z2 = true;
                    w(f2, ((i3 << 3) & 896) | ((i3 >> 9) & 112) | 3072 | (57344 & (i3 << 6)) | ((i3 << 9) & 234881024), bzlVar2, fetVar2, ((cde) ndeVar).f4159a, bdzVar3, null, function1, false, qj2Var.c, qj2Var.d);
                    fetVar2.r(false);
                } else {
                    mm40Var4 = mm40Var3;
                    if (ndeVar instanceof hde) {
                        fetVar2.e0(-1570458593);
                        int i5 = ((i3 << 9) & 234881024) | (57344 & (i3 << 6)) | ((i3 >> 9) & 112) | 3072 | ((i3 << 3) & 896);
                        z2 = true;
                        w(f2, i5, bzlVar, fetVar2, ((hde) ndeVar).f12865a, bdzVar, null, function1, true, qj2Var.c, qj2Var.d);
                        fetVar2.r(false);
                    } else {
                        z = true;
                        if (!(ndeVar instanceof tce)) {
                            throw b1j.f(1750431826, fetVar2, false);
                        }
                        fetVar2.e0(-1569958904);
                        s(null, bdzVar, bzlVar, qj2Var.c, (tce) ndeVar, function1, fetVar, i3 & 459760);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    }
                }
                z = z2;
            }
            fetVar2.r(z);
            mm40Var2 = mm40Var4;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zh2(mm40Var2, bdzVar, bzlVar, qj2Var, f2, function1, i2, (byte) 1);
        }
    }

    public static final void c(Function0 function0, String str, jkm jkmVar, fet fetVar, int i2) {
        function0.getClass();
        str.getClass();
        jkmVar.getClass();
        fetVar.g0(-509743521);
        byte b2 = 4;
        int i3 = i2 | (fetVar.i(function0) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(jkmVar) ? 256 : 128);
        byte b3 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            m8x.y(null, u1c.M(-1529709533, new wr4(function0, b3), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(-1048820818, new ri1(jkmVar, str, b2), fetVar), fetVar, 805306416, 445);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2((Object) function0, (Object) str, (Object) jkmVar, i2, (byte) 9);
        }
    }

    public static final void d(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(58547579);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 188.0f);
            lh80 lh80VarT = s5x0.t(qmk.a(fetVar).c, 0.0f, 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean zG = fetVar.g(fqj0VarD0);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new yq5(fqj0VarD0, b2);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 12582912, 362);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i2, (byte) 10);
        }
    }

    public static final void e(vmc0 vmc0Var, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(1889641494);
        int i3 = (fetVar.g(vmc0Var) ? 4 : 2) | i2 | (fetVar.i(function0) ? 32 : 16);
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (vmc0Var.equals(umc0.f35914a)) {
            fetVar.e0(-825686022);
            fetVar.r(false);
        } else {
            if (!(vmc0Var instanceof tmc0)) {
                throw b1j.f(-825687327, fetVar, false);
            }
            fetVar.e0(173580062);
            m8x.t(s5x0.L(jm40.b, xfn.a(fetVar).d, 0.0f, 2), ((tmc0) vmc0Var).f34187a, function0, fetVar, (i3 << 3) & 896);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(vmc0Var, function0, i2, (byte) 22);
        }
    }

    public static final void f(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1042966298);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(mm40Var, 72.0f), vgg0.a(16.0f)), vbc.d0(vqm.f37862a, fetVar, 6, 0)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i2, (byte) 12);
        }
    }

    public static final void g(mm40 mm40Var, j43 j43Var, dy6 dy6Var, fet fetVar, int i2) {
        int i3;
        j43Var.getClass();
        fetVar.g0(-1947457018);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(j43Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(dy6Var) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            kkb.q(mm40Var, j43Var, dy6Var, fetVar, i3 & 1022);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((Object) mm40Var, (Object) j43Var, (Object) dy6Var, i2, (byte) 8);
        }
    }

    public static final void h(imm immVar, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        imm immVar2;
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(986224490);
        if ((i2 & 6) == 0) {
            immVar2 = immVar;
            i3 = (fetVar2.g(immVar2) ? 4 : 2) | i2;
        } else {
            immVar2 = immVar;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
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
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new w7i0(function1, (byte) 4);
                fetVar2.o0(objP);
            }
            int i5 = i3;
            hlm.c(mm40VarW, immVar2, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, ((i3 << 3) & 112) | 805306368, 54, 500);
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
            boolean z3 = i4 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new w7i0(function1, (byte) 5);
                fetVar2.o0(objP2);
            }
            jcb.l(null, mdmVar, false, (Function0) objP2, fetVar2, i5 & 112, 5);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cf7(immVar, mdmVar, function1, i2, (byte) 7);
        }
    }

    public static final void i(mm40 mm40Var, cln clnVar, fet fetVar, int i2) {
        boolean z;
        fet fetVar2 = fetVar;
        clnVar.getClass();
        fetVar2.g0(1945935449);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(clnVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            x7z x7zVar = new x7z(1.0f, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(x7zVar, 0.0f, 0.0f, 12.0f, 0.0f, 11);
            String str = clnVar.f4567a;
            rmn rmnVar = clnVar.b;
            v8q0.a(str, mm40VarN, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(g1t0.n(), fetVar2), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            boolean zEquals = rmnVar.equals(pmn.f27244a);
            jm40 jm40Var = jm40.b;
            if (zEquals) {
                fetVar2.e0(958327132);
                mm40 mm40VarP = o7k0.p(jm40Var, 60.0f, 14.0f);
                zcl zclVar2 = qmk.m;
                ugg0 ugg0Var = vgg0.f37379a;
                dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), vbc.d0(null, fetVar2, 0, 1), fetVar2, 0, false);
                z = true;
            } else {
                if (!(rmnVar instanceof qmn)) {
                    throw b1j.f(958324266, fetVar2, false);
                }
                fetVar2.e0(-356203077);
                z = true;
                v8q0.a((String) ((qmn) rmnVar).f28992a, o7k0.A(jm40Var, null, 3), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar2), fetVar2, 48, 24576, 114684);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(mm40Var, clnVar, i2, (byte) 21);
        }
    }

    public static final void j(final mm40 mm40Var, final BottomSheetBehavior bottomSheetBehavior, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, lel lelVar, final long j2, final xdr xdrVar, final xdr xdrVar2, xdr xdrVar3, fet fetVar, final int i2) {
        jm40 jm40Var;
        mm40 mm40VarN;
        mm40 mm40Var2;
        boolean z6;
        mm40 mm40Var3;
        zx7 zx7Var;
        int i3;
        boolean z7;
        final lel lelVar2 = lelVar;
        final xdr xdrVar4 = xdrVar3;
        zx7 zx7Var2 = gqw0.b;
        bottomSheetBehavior.getClass();
        xdrVar4.getClass();
        fetVar.g0(924582735);
        int i4 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.i(bottomSheetBehavior) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.h(z2) ? 2048 : 1024) | (fetVar.h(z3) ? 16384 : 8192) | (fetVar.h(z4) ? 131072 : 65536) | (fetVar.h(z5) ? 1048576 : 524288) | (fetVar.g(lelVar2) ? 8388608 : 4194304) | (fetVar.f(j2) ? 67108864 : 33554432) | (fetVar.i(xdrVar) ? 536870912 : 268435456);
        int i5 = (fetVar.i(xdrVar2) ? 4 : 2) | (fetVar.i(xdrVar4) ? 32 : 16);
        if (fetVar.U(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 19) == 18) ? false : true)) {
            jm40 jm40Var2 = jm40.b;
            if (xdrVar != null) {
                zcl zclVar = qmk.f28987a;
                mm40VarN = s5x0.N(jm40Var2, 0.0f, 48.0f, 0.0f, 0.0f, 13);
                jm40Var = jm40Var2;
            } else {
                jm40Var = jm40Var2;
                mm40VarN = jm40Var;
            }
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                zcl zclVar2 = qmk.f28987a;
                objP = vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12);
                fetVar.o0(objP);
            }
            ugg0 ugg0Var = (ugg0) objP;
            mm40 mm40VarE0 = o2e.e0(mm40Var, "BOTTOM_SHEET_SCREEN_BOX");
            if (z) {
                fetVar.e0(619887271);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarC0 = qbc.c0(jm40Var, new sqm(0.0f, -4.0f, 32.0f, ((ThemeColors) fetVar.k(zaq0.b)).getShadowSoft(), new zcl(16.0f)));
                fetVar.r(false);
                mm40Var2 = mm40VarC0;
            } else {
                fetVar.e0(-534177513);
                fetVar.r(false);
                mm40Var2 = jm40Var;
            }
            mm40 mm40VarE = i120.Q(lgb.J(mm40VarE0.e(mm40Var2), ugg0Var), j2, jd8.n).e(z5 ? new wf80(bottomSheetBehavior) : jm40Var).e(z2 ? hp4.B(jm40Var) : jm40Var).e(z3 ? o050.P(jm40Var) : jm40Var);
            if (z4) {
                fetVar.e0(620790611);
                WeakHashMap weakHashMap = djv0.w;
                mm40 mm40VarK0 = j120.k0(jm40Var, new dnz(zcm0.i(fetVar).e, 32));
                z6 = false;
                fetVar.r(false);
                mm40Var3 = mm40VarK0;
            } else {
                z6 = false;
                fetVar.e0(-534159657);
                fetVar.r(false);
                mm40Var3 = jm40Var;
            }
            mm40 mm40VarE2 = mm40VarE.e(mm40Var3);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, z6);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE2);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z8 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z8) {
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
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            jr8 jr8Var = jr8.f16991a;
            if (xdrVar != null) {
                fetVar.e0(1276861915);
                mm40 mm40VarA0 = wha0.a0(cjx.V(o7k0.d(jm40Var, 1.0f), x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
                tj30 tj30VarC2 = zq8.c(zx7Var2, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarA0);
                fetVar.i0();
                zx7Var = zx7Var2;
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC2, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar4);
                xdrVar.F(jr8Var, fetVar, Integer.valueOf(6 | ((i4 >> 24) & 112)));
                fetVar.r(true);
                i3 = 0;
                fetVar.r(false);
            } else {
                zx7Var = zx7Var2;
                i3 = 0;
                fetVar.e0(1277217485);
                fetVar.r(false);
            }
            mm40 mm40VarD = o7k0.d(mm40VarN, 1.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, i3);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarD);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            y5d y5dVar = y5d.f42040a;
            if (xdrVar2 != null) {
                fetVar.e0(-379074997);
                mm40 mm40VarA1 = wha0.a0(cjx.V(o7k0.d(jm40Var, 1.0f), x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
                int iHashCode4 = Long.hashCode(fetVar.T);
                bh90 bh90VarM4 = fetVar.m();
                mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarA1);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar);
                jpm0.o(fetVar, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC4, shdVar4);
                xdrVar2.F(y5dVar, fetVar, Integer.valueOf(6 | ((i5 << 3) & 112)));
                z7 = true;
                fetVar.r(true);
                fetVar.r(false);
            } else {
                z7 = true;
                fetVar.e0(-378755945);
                fetVar.r(false);
            }
            xdrVar4 = xdrVar3;
            xdrVar4.F(y5dVar, fetVar, Integer.valueOf(6 | (i5 & 112)));
            fetVar.r(z7);
            if (z5) {
                lelVar2 = lelVar;
                if (!lelVar2.equals(iel.f14638a)) {
                    fetVar.e0(1277780817);
                    q(o2e.e0(jr8Var.b(jm40Var, zx7Var), "DRAG_HANDLE_TAG"), lelVar2, fetVar, (i4 >> 18) & 112);
                    fetVar.r(false);
                }
                fetVar.r(true);
            } else {
                lelVar2 = lelVar;
            }
            fetVar.e0(1277961485);
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(bottomSheetBehavior, z, z2, z3, z4, z5, lelVar2, j2, xdrVar, xdrVar2, xdrVar4, i2) { // from class: a.cq8
                public final /* synthetic */ BottomSheetBehavior b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ boolean g;
                public final /* synthetic */ lel h;
                public final /* synthetic */ long i;
                public final /* synthetic */ xdr j;
                public final /* synthetic */ xdr k;
                public final /* synthetic */ xdr l;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    i4w0.j(this.f4780a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void k(int i2, int i3, fet fetVar) {
        fetVar.g0(-2114829468);
        byte b2 = 2;
        int i4 = (fetVar.e(i2) ? 4 : 2) | i3;
        if (fetVar.U(i4 & 1, (i4 & 3) != 2)) {
            int iD = l1e0.d(i2, 1, 5);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(970764619);
            if (1 <= iD) {
                int i5 = 1;
                while (true) {
                    zcl zclVar2 = qmk.f28987a;
                    dww.c(a8k0.F(R.drawable.ic_glyph_favourite_active, 0, fetVar), null, o7k0.n(jm40Var, 16.0f), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary40(), fetVar, 56, 0);
                    if (i5 == iD) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u49(i2, i3, b2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r14v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r14v3, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r14v5, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [boolean, int] */
    public static final void l(mm40 mm40Var, fr5 fr5Var, int i2, Integer num, Function2 function2, fet fetVar, int i3) {
        mm40 mm40Var2;
        ?? r14;
        boolean z;
        Object obj;
        zx7 zx7Var;
        ?? r8;
        boolean z2;
        zfn zfnVar;
        ?? r15;
        ?? r1;
        ?? r16;
        fr5 fr5Var2 = fr5Var;
        ?? r17 = fetVar;
        zx7 zx7Var2 = gqw0.h;
        fr5Var2.getClass();
        function2.getClass();
        r17.g0(-1607253053);
        int i4 = i3 | 6 | (r17.g(fr5Var2) ? 32 : 16) | (r17.e(i2) ? 256 : 128) | (r17.g(num) ? 2048 : 1024) | (r17.i(function2) ? 16384 : 8192);
        if (r17.U(i4 & 1, (i4 & 9363) != 9362)) {
            Object objP = r17.P();
            cl5 cl5Var = ukd.f35823a;
            Object obj2 = objP;
            if (objP == cl5Var) {
                pz40 pz40VarE = androidx.compose.runtime.e.e(null);
                r17.o0(pz40VarE);
                obj2 = pz40VarE;
            }
            pz40 pz40Var = (pz40) obj2;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, 272.0f, 172.0f);
            zfn zfnVar2 = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarP, ((ThemeColors) r17.k(zfnVar2)).getBackgroundContent(), vgg0.a(16.0f));
            boolean z3 = ((i4 & 57344) == 16384) | ((i4 & 112) == 32);
            Object objP2 = r17.P();
            if (z3 || objP2 == cl5Var) {
                z = false;
                pia piaVar = new pia(function2, fr5Var2, pz40Var, (byte) 0);
                r17.o0(piaVar);
                obj = piaVar;
            } else {
                z = false;
                obj = objP2;
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) obj, 28);
            zx7 zx7Var3 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var3, z);
            int iHashCode = Long.hashCode(r17.T);
            bh90 bh90VarM = r17.m();
            mm40 mm40VarC0 = kbc.c0(r17, mm40VarW);
            mkd.c0.getClass();
            r17.i0();
            boolean z4 = r17.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
                r17.l(pcyVar);
            } else {
                r17.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(r17, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(r17, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(r17, numValueOf, shdVar3);
            jpm0.n(r17);
            shd shdVar4 = gqw0.v;
            jpm0.o(r17, mm40VarC0, shdVar4);
            zx7 zx7Var4 = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarP2 = o7k0.p(s5x0.N(s5x0.L(jr8Var.b(jm40Var, zx7Var4), 8.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 0.0f, 13), 256.0f, 92.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var3, false);
            int iHashCode2 = Long.hashCode(r17.T);
            bh90 bh90VarM2 = r17.m();
            mm40 mm40VarC1 = kbc.c0(r17, mm40VarP2);
            r17.i0();
            if (r17.S) {
                r17.l(pcyVar);
            } else {
                r17.r0();
            }
            jpm0.o(r17, tj30VarC2, shdVar);
            jpm0.o(r17, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, r17, shdVar3, r17);
            jpm0.o(r17, mm40VarC1, shdVar4);
            mm40 mm40VarJ = lgb.J(jr8Var.a(jm40Var), vgg0.a(12.0f));
            o0x o0xVar = fr5Var2.b;
            String str = fr5Var2.e;
            o0x o0xVar2 = fr5Var2.g;
            er5 er5Var = fr5Var2.f;
            o0x o0xVar3 = fr5Var2.c;
            Object objP3 = r17.P();
            Object obj3 = objP3;
            if (objP3 == cl5Var) {
                ca6 ca6Var = new ca6(pz40Var, (byte) 10);
                r17.o0(ca6Var);
                obj3 = ca6Var;
            }
            int i5 = i4 << 3;
            etl.a(mm40VarJ, o0xVar, o0xVar3, i2, num, null, 0.0f, (Function1) obj3, r17, (i5 & 7168) | 12582912 | (i5 & 57344), 96);
            if (o0xVar2 != null) {
                r17.e0(83071313);
                zx7Var = zx7Var2;
                r8 = 0;
                etl.d(lgb.J(jr8Var.b(jm40Var, zx7Var), vgg0.c(0.0f, 0.0f, 12.0f, 12.0f, 3)), o0xVar2, r17, 0);
                r17.r(false);
            } else {
                zx7Var = zx7Var2;
                r8 = 0;
                r17.e0(83373067);
                r17.r(false);
            }
            if (er5Var != null) {
                r17.e0(83417397);
                z2 = true;
                etl.c(null, er5.a(er5Var, new gro0(er5Var.b.f11790a, d4d.BACKGROUND_CONTENT)), r17, r8, 1);
                r17.r(r8);
            } else {
                z2 = true;
                r17.e0(83684555);
                r17.r(r8);
            }
            r17.r(z2);
            mm40 mm40VarN = s5x0.N(s5x0.L(o7k0.d(o7k0.g(jr8Var.b(jm40Var, zx7Var), 64.0f, 0.0f, 2), 1.0f), 12.0f, 0.0f, 2), 0.0f, 4.0f, 0.0f, 8.0f, 5);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, r17, 48);
            int iHashCode3 = Long.hashCode(r17.T);
            bh90 bh90VarM3 = r17.m();
            mm40 mm40VarC2 = kbc.c0(r17, mm40VarN);
            r17.i0();
            if (r17.S) {
                r17.l(pcyVar);
            } else {
                r17.r0();
            }
            jpm0.o(r17, x5dVarA, shdVar);
            jpm0.o(r17, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, r17, shdVar3, r17);
            jpm0.o(r17, mm40VarC2, shdVar4);
            fr5Var2 = fr5Var;
            if (fr5Var2.d.length() > 0) {
                r17.e0(-1363931805);
                String str2 = fr5Var2.d;
                zfnVar = zfnVar2;
                long textPrimary = ((ThemeColors) r17.k(zfnVar)).getTextPrimary();
                ((g1t0) r17.k(j1t0.e)).getClass();
                y9q0 y9q0VarL = g1t0.l();
                int i6 = (str == null || str.length() == 0) ? 2 : 1;
                boolean z5 = r8 == true ? 1 : 0;
                v8q0.a(str2, null, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, i6, 0, null, y9q0VarL, fetVar, 0, 384, 110586);
                fet fetVar2 = fetVar;
                fetVar2.r(z5);
                r1 = z5;
                r15 = fetVar2;
            } else {
                ?? r2 = r8;
                zfnVar = zfnVar2;
                r17.e0(-1363618085);
                r17.r(r2);
                r1 = r2;
                r15 = r17;
            }
            if (str == null || str.length() == 0) {
                r15.e0(-1363261957);
                r15.r(r1);
                r16 = r15;
            } else {
                r15.e0(-1363542042);
                String str3 = fr5Var2.e;
                long secondary = ((ThemeColors) r15.k(zfnVar)).getSecondary();
                ((g1t0) r15.k(j1t0.e)).getClass();
                v8q0.a(str3, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
                ?? r18 = fetVar;
                r18.r(r1);
                r16 = r18;
            }
            r16.r(true);
            r16.r(true);
            mm40Var2 = jm40Var;
            r14 = r16;
        } else {
            r17.X();
            mm40Var2 = mm40Var;
            r14 = r17;
        }
        yfe0 yfe0VarU = r14.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qia(mm40Var2, fr5Var2, i2, num, function2, i3, (byte) 0);
        }
    }

    public static final void m(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-476759537);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            etl.b(0, fetVar, lgb.J(o7k0.p(jm40Var, 272.0f, 172.0f), vgg0.a(16.0f)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i2, (byte) 29);
        }
    }

    public static final void n(mm40 mm40Var, w6b w6bVar, xcz xczVar, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        w6b w6bVar2;
        Function1 function2;
        xczVar.getClass();
        function1.getClass();
        fetVar.g0(-1454834574);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            w6bVar2 = w6bVar;
            i3 |= fetVar.g(w6bVar2) ? 32 : 16;
        } else {
            w6bVar2 = w6bVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        int i4 = i3;
        byte b2 = 0;
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            function2 = function1;
            tke.o(mm40Var, w6bVar, xczVar, h97.f(8.0f, 8.0f, 8.0f, 20.0f, fetVar), ugdVar, u1c.M(349699851, new gn(function1, (byte) 7), fetVar), u1c.M(786153972, new f6b(backgroundContent, w6bVar2, function1, (byte) 1), fetVar), u1c.M(-902085212, new i6b(b2, backgroundContent), fetVar), u1c.M(1406379636, new j6b(b2, backgroundContent, function2), fetVar), ntr.e, ntr.f, fetVar, (i4 & 14) | 920322048 | (i4 & 112) | (i4 & 896) | (57344 & i4));
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g6b(mm40Var, w6bVar, xczVar, function2, ugdVar, i2, (byte) 1);
        }
    }

    public static final void o(wmc0 wmc0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1007713493);
        int i3 = (fetVar.g(wmc0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            G(wmc0Var.f39400a, function1, u1c.M(1388167365, new omc0(wmc0Var, function1), fetVar), fetVar, (i3 & 112) | 384);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new omc0(wmc0Var, function1, i2);
        }
    }

    public static final void p(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(997561188);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            ugd ugdVarM = u1c.M(445896736, new u7i0(l7m0Var, function1, (byte) 7), fetVar);
            ugd ugdVarM2 = u1c.M(313572991, new u7i0(l7m0Var, function1, (byte) 8), fetVar);
            pz40 pz40Var = s6t0.f31722a;
            m8x.y(null, ugdVarM, ugdVarM2, null, null, 0, s6t0.b().f33626a.getBackground(), 0L, null, u1c.M(-1223655051, new xs4(l7m0Var, function1, (byte) 11), fetVar), fetVar, 805306800, 441);
            if (((tli0) l7m0Var.getValue()).b) {
                fetVar.e0(1469400102);
                x(0, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(1469423166);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i2, (byte) 9);
        }
    }

    public static final void q(final mm40 mm40Var, final lel lelVar, fet fetVar, final int i2) {
        int i3;
        Function2 function2;
        yfe0 yfe0VarU;
        long separator;
        fetVar.g0(-1409011718);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(lelVar) ? 32 : 16;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (!lelVar.equals(jel.f16379a)) {
                if (lelVar.equals(kel.f18158a)) {
                    fetVar.e0(-1145555101);
                    separator = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator();
                    fetVar.r(false);
                } else {
                    if (!lelVar.equals(iel.f14638a)) {
                        throw b1j.f(-1145559148, fetVar, false);
                    }
                    fetVar.e0(-1152428190);
                    fetVar.r(false);
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU == null) {
                        return;
                    } else {
                        function2 = new Function2() { // from class: a.dq8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                byte b4 = b2;
                                int i4 = i2;
                                lel lelVar2 = lelVar;
                                mm40 mm40Var2 = mm40Var;
                                fet fetVar2 = (fet) obj;
                                ((Integer) obj2).getClass();
                                switch (b4) {
                                    case 0:
                                        i4w0.q(mm40Var2, lelVar2, fetVar2, x8x.L(i4 | 1));
                                        break;
                                    default:
                                        i4w0.q(mm40Var2, lelVar2, fetVar2, x8x.L(i4 | 1));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                yfe0VarU.d = function2;
            }
            fetVar.e0(-1145556991);
            separator = ((StaticColors) fetVar.k(m8m0.f21378a)).m129getWhite400d7_KjU();
            fetVar.r(false);
            mm40 mm40VarA0 = wha0.a0(cjx.V(mm40Var, x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, i120.Q(o7k0.e(o7k0.s(s5x0.N(mm40VarA0, 0.0f, 8.0f, 0.0f, 0.0f, 13), 36.0f), 4.0f), separator, vgg0.f37379a));
        } else {
            fetVar.X();
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            function2 = new Function2() { // from class: a.dq8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b3;
                    int i4 = i2;
                    lel lelVar2 = lelVar;
                    mm40 mm40Var2 = mm40Var;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b4) {
                        case 0:
                            i4w0.q(mm40Var2, lelVar2, fetVar2, x8x.L(i4 | 1));
                            break;
                        default:
                            i4w0.q(mm40Var2, lelVar2, fetVar2, x8x.L(i4 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [a.mm40] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r7v18, types: [a.jm40] */
    public static final void r(mm40 mm40Var, wim wimVar, w2v0 w2v0Var, gy40 gy40Var, Function0 function0, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        ?? r4;
        long j2;
        boolean z;
        function0.getClass();
        fetVar.g0(-1281830622);
        int i3 = i2 | 6 | (fetVar.g(wimVar) ? 32 : 16) | (fetVar.g(w2v0Var) ? 256 : 128) | (fetVar.g(gy40Var) ? 2048 : 1024) | (fetVar.i(function0) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            ucg0 ucg0Var = new ucg0(0);
            boolean z2 = (57344 & i3) == 16384;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new unl(function0, (byte) 29);
                fetVar.o0(objP);
            }
            Function0 function2 = (Function0) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.o(kna.f18575a, jm40Var).e(y860.W(jm40Var, gy40Var, null, false, ucg0Var, function2, 12));
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            z(null, wimVar, w2v0Var, function1, fetVar, (i3 & 1008) | ((i3 >> 6) & 7168));
            mm40 mm40VarG = o7k0.g(ua80.d(jm40Var, kna.h, fetVar, jm40Var, 1.0f), kna.i, 0.0f, 2);
            zx7 zx7Var2 = gqw0.h;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarG, zx7Var2);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarB);
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
            String str = wimVar.c;
            if (str == null) {
                fetVar.e0(-2100552191);
                fetVar.r(false);
                fetVar2 = fetVar;
                z = true;
            } else {
                fetVar.e0(-2100552190);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0 y9q0VarD = g1t0.d();
                bjm bjmVar = wimVar.b;
                if (bjmVar instanceof zim) {
                    j2 = w2v0Var.f38470a.d;
                } else if (bjmVar instanceof yim) {
                    j2 = w2v0Var.b.c;
                } else {
                    if (!(bjmVar instanceof ajm)) {
                        t9f.b();
                        return;
                    }
                    j2 = w2v0Var.c.f;
                }
                z = true;
                v8q0.a(str, jr8Var.b(o7k0.d(jm40Var, 1.0f), gqw0.e), j2, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, y9q0VarD, fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(z);
            fetVar2.r(z);
            r4 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            r4 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tan(r4, wimVar, w2v0Var, gy40Var, function0, function1, i2, (byte) 2);
        }
    }

    public static final void s(mm40 mm40Var, bdz bdzVar, bzl bzlVar, boolean z, tce tceVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(722415954);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bdzVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(bzlVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(tceVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            xcz xczVarB = bdzVar.b("KEY_LAZY_LIST_TOURNAMENTS", fetVar);
            fetVar.e0(-587045032);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new j6g0((byte) 17);
                fetVar.o0(objP);
            }
            azl azlVarA = bzlVar.a((Function0) objP);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarV = cjx.V(jm40Var, azlVarA, null);
            fetVar.r(false);
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z2 = (i3 & 458752) == 131072;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ja2(function1, (byte) 27);
                fetVar.o0(objP2);
            }
            mm40Var2 = jm40Var;
            mom.c(n0qVar, z, womVarF, null, false, null, (Function0) objP2, null, u1c.M(264196061, new hj2(mm40VarV, xczVarB, tceVar, b2), fetVar), fetVar, ((i3 >> 6) & 112) | 100663296, 184);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2((Object) mm40Var2, (Object) bdzVar, (Object) bzlVar, z, (Object) tceVar, (wdr) function1, i2, (byte) 2);
        }
    }

    public static final void t(int i2, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-1233852774);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            djm djmVar = new djm(xim.d);
            float f2 = xfn.a(fetVar).d;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new t4c0((byte) 19);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            v3c.r(mm40VarD, djmVar, f2, null, null, (Function2) objP, fetVar2, 196614, 24);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t4c0(i2, (byte) 20);
        }
    }

    public static final void u(int i2, fet fetVar) {
        fetVar.g0(-307791351);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            nkb.h(s5x0.N(mm40VarD, xfn.a(fetVar).d, 8.0f, xfn.a(fetVar).d, 0.0f, 8), new ijm(new qjm()), kjm.f18392a, null, null, null, fetVar, 384, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t4c0(i2, (byte) 21);
        }
    }

    public static final void v(zmc0 zmc0Var, Function2 function2, Function0 function0, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1054328696);
        int i3 = i2 | (fetVar2.g(zmc0Var) ? 4 : 2) | (fetVar2.i(function2) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (!fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar2.X();
        } else if (zmc0Var.equals(ymc0.f42881a)) {
            fetVar2.e0(402412812);
            fetVar2.r(false);
        } else {
            if (!(zmc0Var instanceof xmc0)) {
                throw b1j.f(402412292, fetVar2, false);
            }
            fetVar2.e0(-410024920);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            xmc0 xmc0Var = (xmc0) zmc0Var;
            nkb.h(s5x0.N(mm40VarD, xfn.a(fetVar2).d, 8.0f, xfn.a(fetVar2).d, 0.0f, 8), new hjm(xmc0Var.f41119a, new mjm(127), null, null, null, null, false, null, null, false, new ue9(xmc0Var.b), null, 7164), kjm.f18392a, null, function0, null, fetVar2, ((i3 << 6) & 57344) | 384, 40);
            fetVar2 = fetVar;
            v3c.r(o7k0.d(jm40Var, 1.0f), new cjm(xmc0Var.c, xim.d), xfn.a(fetVar).d, null, v3c.X(fetVar), function2, fetVar2, ((i3 << 12) & 458752) | 6, 8);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(zmc0Var, function2, function0, i2, (byte) 26);
        }
    }

    public static final void w(float f2, int i2, bzl bzlVar, fet fetVar, a4x a4xVar, bdz bdzVar, mm40 mm40Var, Function1 function1, boolean z, boolean z2, boolean z3) {
        mm40 mm40Var2;
        xcz xczVarB;
        fetVar.g0(-993764006);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.d(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(bdzVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(bzlVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.g(a4xVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.h(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.h(z3) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= fetVar.i(function1) ? 67108864 : 33554432;
        }
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            if (z) {
                fetVar.e0(-13547295);
                xczVarB = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
            } else {
                fetVar.e0(-13501415);
                xczVarB = bdzVar.b("KEY_LAZY_LIST_TOURNAMENTS", fetVar);
                fetVar.r(false);
            }
            fetVar.e0(-13369324);
            boolean z4 = (i3 & 7168) == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new kg2((byte) 2, z);
                fetVar.o0(objP);
            }
            azl azlVarA = bzlVar.a((Function0) objP);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarV = cjx.V(jm40Var, azlVarA, null);
            fetVar.r(false);
            int i4 = i3 >> 15;
            pz40 pz40VarF = androidx.compose.runtime.e.f(a4xVar, fetVar);
            wom womVarF = mom.f(fetVar);
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i5 = i3;
            boolean zG = ((i5 & 29360128) == 8388608) | fetVar.g(xczVarB);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new qa2(z3, xczVarB, null, (byte) 3);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP2);
            if (z3) {
                function1.invoke(bj2.f2684a);
            }
            n0q n0qVar = o7k0.c;
            boolean z5 = (i5 & 234881024) == 67108864;
            Object objP3 = fetVar.P();
            if (z5 || objP3 == cl5Var) {
                objP3 = new ja2(function1, (byte) 28);
                fetVar.o0(objP3);
            }
            mom.c(n0qVar, z2, womVarF, null, false, null, (Function0) objP3, null, u1c.M(-1301250065, new ai2(mm40VarV, z, f2, xczVarB, pz40VarF, function1, (byte) 1), fetVar), fetVar, (i4 & 112) | 100663296, 184);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lg2(mm40Var2, f2, bdzVar, z, bzlVar, a4xVar, z2, z3, function1, i2, (byte) 2);
        }
    }

    public static final void x(int i2, fet fetVar) {
        fetVar.g0(-1092585282);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarH = k7n0.H(o7k0.c, 2.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new gei0((byte) 10);
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
            kpb.j(jm40.b, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d1i0(i2, (byte) 26);
        }
    }

    public static final void y(mm40 mm40Var, qd5 qd5Var, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        pge pgeVar = gqw0.A;
        qd5Var.getClass();
        fetVar2.g0(-246079906);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(qd5Var) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            xyw xywVar = qd5Var.b;
            if (xywVar instanceof vyw) {
                fetVar2.e0(-1872303620);
                zq8.a(0, fetVar2, i120.Q(o7k0.c, fbc.d(((vyw) xywVar).f38269a), jd8.n));
                fetVar2.r(false);
            } else {
                if (!(xywVar instanceof wyw)) {
                    throw b1j.f(-1872306780, fetVar2, false);
                }
                fetVar2.e0(2088343020);
                j0x.b(a8k0.F(((wyw) xywVar).f39993a, 0, fetVar2), null, o7k0.c, null, pgeVar, 0.0f, null, fetVar, 25016, 104);
                pgeVar = pgeVar;
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            Integer num = qd5Var.f28518a;
            if (num == null) {
                fetVar2.e0(2088642417);
                fetVar2.r(false);
            } else {
                fetVar2.e0(2088642418);
                na10 na10VarW = x8x.w(new pa10(num.intValue()), fetVar2);
                u910 u910VarA0 = gq80.a0(na10VarW.getValue(), fetVar2, 700);
                fa10 fa10VarB = na10VarW.getValue();
                boolean zG = fetVar2.g(u910VarA0);
                Object objP = fetVar2.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new u4h(u910VarA0, (byte) 2);
                    fetVar2.o0(objP);
                }
                piz.j(fa10VarB, (Function0) objP, null, pgeVar, fetVar2, 0, 48, 129020);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(mm40Var, qd5Var, i2, (byte) 14);
        }
    }

    public static final void z(mm40 mm40Var, wim wimVar, w2v0 w2v0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        boolean z;
        u2v0 u2v0Var = w2v0Var.b;
        zx7 zx7Var = gqw0.e;
        fetVar.g0(-444396727);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(wimVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(w2v0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            float f2 = kna.e;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, f2), kna.b);
            zx7 zx7Var2 = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var2, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            bjm bjmVar = wimVar.b;
            if (bjmVar instanceof zim) {
                fetVar.e0(-1024069548);
                zim zimVar = (zim) bjmVar;
                ibm0.e(zimVar.f44446a, zimVar.b, function1, uc9.j, u1c.M(1281356121, new uan(bjmVar, w2v0Var, (byte) 4), fetVar), fetVar, ((i3 >> 3) & 896) | 27648);
                fetVar.r(false);
                mm40Var2 = jm40Var;
            } else {
                int i4 = i3;
                boolean z3 = bjmVar instanceof yim;
                jr8 jr8Var = jr8.f16991a;
                if (z3) {
                    fetVar.e0(-1022877226);
                    mm40 mm40VarP = i120.P(o7k0.c, u2v0Var.f34965a, null, 6);
                    tj30 tj30VarC2 = zq8.c(zx7Var2, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarP);
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
                    mm40Var2 = jm40Var;
                    dww.c(a8k0.F(((yim) bjmVar).f42699a, 0, fetVar), null, o7k0.n(jr8Var.b(mm40Var2, zx7Var), kna.d), u2v0Var.b, fetVar, 56, 0);
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    mm40Var2 = jm40Var;
                    if (!(bjmVar instanceof ajm)) {
                        throw b1j.f(-448676117, fetVar, false);
                    }
                    fetVar.e0(-1022156228);
                    ajm ajmVar = (ajm) bjmVar;
                    ibm0.e(ajmVar.f983a, ajmVar.b, function1, uc9.k, u1c.M(-333930863, new uan(bjmVar, w2v0Var, (byte) 5), fetVar), fetVar, ((i4 >> 3) & 896) | 27648);
                    mm40 mm40VarE = jr8Var.b(mm40Var2, zx7Var).e(o7k0.c);
                    g3v0 g3v0Var = w2v0Var.c;
                    long j2 = g3v0Var.f10631a;
                    ljc ljcVar = jd8.n;
                    mm40 mm40VarQ = i120.Q(mm40VarE, j2, ljcVar);
                    tj30 tj30VarC3 = zq8.c(zx7Var, false);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarQ);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC3, shdVar);
                    jpm0.o(fetVar, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC2, shdVar4);
                    mm40 mm40VarQ2 = i120.Q(lgb.J(o7k0.n(mm40Var2, kna.f), vgg0.f37379a), g3v0Var.c, ljcVar);
                    tj30 tj30VarC4 = zq8.c(zx7Var, false);
                    int iHashCode4 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM4 = fetVar.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarQ2);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC4, shdVar);
                    jpm0.o(fetVar, bh90VarM4, shdVar2);
                    vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                    jpm0.o(fetVar, mm40VarC3, shdVar4);
                    dww.c(a8k0.F(R.drawable.ic_glyph_technical_works, 0, fetVar), null, o7k0.n(mm40Var2, kna.g), g3v0Var.b, fetVar, 440, 0);
                    z = true;
                    ohs0.x(fetVar, true, true, false);
                }
                fetVar.r(z);
            }
            z = true;
            fetVar.r(z);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new van(mm40Var2, wimVar, w2v0Var, function1, i2, (byte) 1);
        }
    }
}
