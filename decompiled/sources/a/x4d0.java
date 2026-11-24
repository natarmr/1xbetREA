package a;

import android.R;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import com.google.android.gms.common.Feature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class x4d0 implements dhi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i5d0 f40260a = new i5d0(new os7(3));
    public static final ugd b = new ugd(-384496961, false, new zgd(18));
    public static final ugd c = new ugd(-1934256339, false, new ehd(16));
    public static final ugd d = new ugd(-947415372, false, new jhd(26));
    public static final ugd e = new ugd(29073805, false, new qhd(12));
    public static final int[] f = {R.attr.targetClass, R.attr.targetId, R.attr.excludeId, R.attr.excludeClass, R.attr.targetName, R.attr.excludeName};
    public static final int[] g = {R.attr.interpolator, R.attr.duration, R.attr.startDelay, R.attr.matchOrder};
    public static final int[] h = {R.attr.resizeClip};
    public static final int[] i = {R.attr.transitionVisibilityMode};
    public static final int[] j = {R.attr.fadingMode};
    public static final int[] k = {R.attr.reparent, R.attr.reparentWithOverlay};
    public static final int[] l = {R.attr.slideEdge};
    public static final int[] m = {R.attr.transitionOrdering};
    public static final int[] n = {R.attr.minimumHorizontalAngle, R.attr.minimumVerticalAngle, R.attr.maximumAngle};
    public static final int[] o = {R.attr.patternPathData};
    public static final Feature p;
    public static final Feature q;
    public static final Feature[] r;

    static {
        Feature feature = new Feature("auth_api_credentials_begin_sign_in", 9L);
        Feature feature2 = new Feature("auth_api_credentials_sign_out", 2L);
        p = feature2;
        Feature feature3 = new Feature("auth_api_credentials_authorize", 1L);
        Feature feature4 = new Feature("auth_api_credentials_revoke_access", 1L);
        Feature feature5 = new Feature("auth_api_credentials_save_password", 4L);
        Feature feature6 = new Feature("auth_api_credentials_get_sign_in_intent", 6L);
        q = feature6;
        r = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, new Feature("auth_api_credentials_save_account_linking_token", 3L), new Feature("auth_api_credentials_get_phone_number_hint_intent", 3L)};
    }

    public static final void A(xo4 xo4Var, mm40 mm40Var, fet fetVar, int i2) {
        int i3;
        mm40 mm40Var2;
        int i4;
        fet fetVar2 = fetVar;
        fetVar2.g0(1281548943);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(xo4Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i5 = i3 | 48;
        if (fetVar2.U(i5 & 1, (i5 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 0.0f, 12.0f, 1), 12.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), vgg0.f37379a), 8.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarJ);
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
            switch (xo4Var.h.ordinal()) {
                case 0:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    i4 = org.xbet.client1.R.drawable.ic_os_unknown_phone;
                    break;
                case 1:
                case 16:
                case 17:
                    i4 = org.xbet.client1.R.drawable.ic_os_unknown_device;
                    break;
                case 2:
                    i4 = org.xbet.client1.R.drawable.ic_os_windows;
                    break;
                case 3:
                    i4 = org.xbet.client1.R.drawable.ic_os_mac_os;
                    break;
                case 4:
                    i4 = org.xbet.client1.R.drawable.ic_os_android_new;
                    break;
                case 5:
                    i4 = org.xbet.client1.R.drawable.ic_os_apple;
                    break;
                default:
                    t9f.b();
                    return;
            }
            dww.c(a8k0.F(i4, 0, fetVar2), null, o7k0.n(jm40Var, 24.0f), ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar2, 56, 0);
            fetVar2.r(true);
            mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 12.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            v8q0.a(wwb.I(xo4Var.k, fetVar2), null, ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131066);
            v8q0.a(xo4Var.n, s5x0.L(jm40Var, 0.0f, 4.0f, 1), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.k(), fetVar, 0, 0, 131064);
            v8q0.a(xsm0.t(org.xbet.client1.R.string.ip_title_v2, new Object[]{xo4Var.g}, fetVar), null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 131066);
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
            yfe0VarU.d = new x((Object) xo4Var, (Object) mm40Var2, i2, (byte) 18);
        }
    }

    public static final void B(ibm ibmVar, boolean z, long j2, Function1 function1, fet fetVar, int i2) {
        long j3;
        boolean z2;
        fet fetVar2 = fetVar;
        ibmVar.getClass();
        function1.getClass();
        fetVar2.g0(1884755846);
        int i3 = i2 | (fetVar2.g(ibmVar) ? 4 : 2) | (fetVar2.h(z) ? 32 : 16) | (fetVar2.f(j2) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, 72.0f, 100.0f);
            byte b2 = 14;
            boolean z3 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048);
            Object objP = fetVar2.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new lrk(function1, ibmVar, (byte) 22);
                fetVar2.o0(objP);
            }
            mm40 mm40VarO = feb.O(mm40VarP, (Function0) objP);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4(b2)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarO);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarN = o7k0.n(jm40Var, 72.0f);
            boolean z5 = ibmVar.e;
            hbm hbmVar = ibmVar.c;
            float f2 = z5 ? 2.0f : 1.0f;
            if (z5) {
                fetVar2.e0(214137217);
                fetVar2.r(false);
                j3 = j2;
            } else {
                fetVar2.e0(214138711);
                long jM125getWhite100d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m125getWhite100d7_KjU();
                fetVar2.r(false);
                j3 = jM125getWhite100d7_KjU;
            }
            zcl zclVar2 = qmk.h;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.S(mm40VarN, f2, j3, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f);
            zfn zfnVar = m8m0.f21378a;
            long jM128getWhite40d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m128getWhite40d7_KjU();
            zcl zclVar3 = qmk.f;
            mm40 mm40VarQ = i120.Q(mm40VarJ, jM128getWhite40d7_KjU, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            n0q n0qVar = o7k0.c;
            rq8.b(lgb.J(n0qVar, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), s5x0.J(n0qVar, 16.0f), ibmVar.b, org.xbet.client1.R.drawable.ic_glyph_placeholder_player, new y3d(((StaticColors) fetVar2.k(zfnVar)).m126getWhite200d7_KjU()), null, null, gqw0.A, dyb.g0(new mrs0(), new aef()), fetVar, 113246208, 96);
            if ((hbmVar instanceof fbm) && z) {
                fetVar.e0(947912443);
                k7x.a(((fbm) hbmVar).f9266a.a(), null, lgb.J(jr8.f16991a.b(o7k0.n(s5x0.J(jm40Var, 2.0f), 16.0f), gqw0.g), vgg0.f37379a), null, null, fetVar, 48, 2040);
                z2 = false;
                fetVar.r(false);
            } else {
                z2 = false;
                fetVar.e0(948352054);
                fetVar.r(false);
            }
            fetVar.r(true);
            tj30 tj30VarC2 = zq8.c(gqw0.e, z2);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, n0qVar);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(ibmVar.d, mm40VarD, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 48, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w13(ibmVar, z, j2, function1, i2);
        }
    }

    public static final void C(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1947145828);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dng0(function1, (byte) 20);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var2, mdmVar, function1, i2, (byte) 29);
        }
    }

    public static final void D(int i2, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(736072105);
        int i3 = i2 | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            hkb.k(i3 & 112, 0, fetVar, s5x0.L(jm40Var, f2, 0.0f, 2), str);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str, i2, (byte) 20);
        }
    }

    public static final void E(fkr fkrVar, Function1 function1, fet fetVar, int i2) {
        fkrVar.getClass();
        function1.getClass();
        fetVar.g0(28039090);
        int i3 = i2 | (fetVar.g(fkrVar) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            ugd ugdVarM = u1c.M(-1591202706, new zjr(fkrVar, function1, b2), fetVar);
            ugd ugdVarM2 = u1c.M(-1355032883, new zjr(fkrVar, function1, b3), fetVar);
            pz40 pz40Var = s6t0.f31722a;
            m8x.y(n0qVar, ugdVarM, ugdVarM2, null, null, 0, s6t0.b().f33626a.getBackgroundContent(), 0L, null, u1c.M(-2124267069, new ri1(fkrVar, function1, (byte) 8), fetVar), fetVar, 805306806, 440);
            if (fkrVar.f9707a) {
                fetVar.e0(2091426967);
                L(0, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(2091450992);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zjr(fkrVar, function1, i2);
        }
    }

    public static final void F(String str, String str2, fet fetVar, int i2) {
        String str3;
        fet fetVar2;
        String str4;
        fetVar.g0(2055155633);
        int i3 = i2 | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean zW = StringsKt.W(str2);
            jm40 jm40Var = jm40.b;
            if (zW) {
                fetVar.e0(383242048);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                str4 = str2;
                str3 = str;
                fetVar2 = fetVar;
                nkb.h(s5x0.L(s5x0.N(mm40VarD, 16.0f, 4.0f, 0.0f, 0.0f, 12), xfn.a(fetVar).d, 0.0f, 2), new hjm(str, new ojm(127), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()), null, null, null, false, null, null, false, null, null, 8184), kjm.b, null, null, null, fetVar2, 384, 56);
                fetVar2.r(false);
            } else {
                fetVar.e0(382759409);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD2);
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
                zcl zclVar2 = qmk.f28987a;
                fetVar2 = fetVar;
                nkb.h(s5x0.N(jm40Var, 16.0f, 4.0f, 0.0f, 0.0f, 12), new hjm(str, null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()), null, null, null, false, null, null, false, null, null, 8186), kjm.b, null, null, null, fetVar2, 384, 56);
                z(i3 & 112, fetVar2, s5x0.L(jm40Var, xfn.a(fetVar2).d, 0.0f, 2), str2);
                fetVar2.r(true);
                fetVar2.r(false);
                str3 = str;
                str4 = str2;
            }
        } else {
            str3 = str;
            fetVar2 = fetVar;
            str4 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 13, i2, str3, str4);
        }
    }

    public static final void G(int i2, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-271521017);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, background, new ugg0(zclVar, zclVar, zclVar, zclVar));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            dww.c(a8k0.F(org.xbet.client1.R.drawable.ic_glyph_info_circle_filled, 0, fetVar2), null, s5x0.M(jm40Var, 12.0f, 12.0f, 8.0f, 12.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            mm40 mm40VarM = s5x0.M(jm40Var, 4.0f, 10.0f, 16.0f, 10.0f);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarM, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.h(), fetVar, (i3 >> 3) & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            str2 = str;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str2, i2, (byte) 22);
        }
    }

    public static final void H(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(444986987);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (((uyz) l7m0Var.getValue()).h) {
            fetVar.e0(-1956481742);
            i(((uyz) l7m0Var.getValue()).i, function1, fetVar, i3 & 112);
            fetVar.r(false);
        } else {
            fetVar.e0(-1956551368);
            t(l7m0Var, function1, fetVar, i3 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i2, (byte) 27);
        }
    }

    public static final void I(mm40 mm40Var, xcz xczVar, a4x a4xVar, Function1 function1, Function1 function2, xdr xdrVar, fet fetVar, int i2) {
        int i3;
        Object obj;
        Object obj2;
        fetVar.g0(1098563971);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            obj = function1;
            i3 |= fetVar.i(obj) ? 2048 : 1024;
        } else {
            obj = function1;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            obj2 = xdrVar;
            i3 |= fetVar.i(obj2) ? 131072 : 65536;
        } else {
            obj2 = xdrVar;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            lh80 lh80VarU = s5x0.u(xfn.a(fetVar).d, 0.0f, xfn.a(fetVar).d, 0.0f, 10);
            boolean z = ((i4 & 896) == 256 || ((i4 & 512) != 0 && fetVar.i(a4xVar))) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384) | ((458752 & i4) == 131072);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                l0i0 l0i0Var = new l0i0((Object) a4xVar, obj, (Object) function2, obj2, (byte) 10);
                fetVar.o0(l0i0Var);
                objP = l0i0Var;
            }
            b8k0.e(mm40VarE, xczVar, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, i4 & 112, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fer0(mm40Var, xczVar, (Object) a4xVar, function1, function2, xdrVar, i2, (byte) 4);
        }
    }

    public static final void J(int i2, fet fetVar) {
        fetVar.g0(-2021601700);
        byte b2 = 0;
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
                objP2 = new jtz((byte) 4);
                fetVar.o0(objP2);
            }
            mm40 mm40VarQ = i120.Q(y860.W(mm40VarH, gy40Var, null, false, null, (Function0) objP2, 28), ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), jd8.n);
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
            kpb.j(null, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kyz(i2, b2);
        }
    }

    public static final void K(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-667835106);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), jd8.n);
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
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i2, (byte) 23);
        }
    }

    public static final void L(int i2, fet fetVar) {
        fetVar.g0(777209936);
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
                objP2 = new s9r((byte) 18);
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
            yfe0VarU.d = new nuq(i2, (byte) 5);
        }
    }

    public static final void M(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-821260047);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.L(s5x0.N(mm40VarD, 0.0f, 12.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).d, 0.0f, 2), 164.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i2, (byte) 24);
        }
    }

    public static final void N(mm40 mm40Var, xx30 xx30Var, bmh0 bmh0Var, x6q0 x6q0Var, cqq cqqVar, Function1 function1, fet fetVar, int i2) {
        kly klyVar;
        ugg0 ugg0Var;
        lh80 lh80VarT;
        fetVar.g0(367794877);
        byte b2 = 2;
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.e(xx30Var.ordinal()) ? 32 : 16) | (fetVar.g(bmh0Var) ? 256 : 128) | (fetVar.g(x6q0Var) ? 2048 : 1024) | (fetVar.g(cqqVar) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            if (bmh0Var instanceof amh0) {
                fetVar.e0(1263570941);
                int i4 = 458752 & i3;
                boolean z = i4 == 131072;
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (z || objP == cl5Var) {
                    objP = new abh0(function1, b2);
                    fetVar.o0(objP);
                }
                Function1 function2 = (Function1) objP;
                boolean z2 = ((i3 & 896) == 256) | (i4 == 131072);
                Object objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new fmh0(function1, bmh0Var);
                    fetVar.o0(objP2);
                }
                klyVar = new kly(function2, (Function1) objP2, null, 58);
                fetVar.r(false);
            } else {
                if (!(bmh0Var instanceof xlh0)) {
                    throw b1j.f(1263568813, fetVar, false);
                }
                fetVar.e0(1263579812);
                fetVar.r(false);
                klyVar = kly.d;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            int iOrdinal = xx30Var.ordinal();
            if (iOrdinal == 0) {
                zcl zclVar = qmk.f28987a;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar, zclVar, zclVar, zclVar);
            } else if (iOrdinal == 1) {
                zcl zclVar2 = qmk.i;
                zcl zclVar3 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar3, zclVar3);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    t9f.b();
                    return;
                }
                zcl zclVar4 = qmk.f28987a;
                ugg0 ugg0Var3 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar4, zclVar4, zclVar4, zclVar4);
            } else {
                zcl zclVar5 = qmk.f28987a;
                zcl zclVar6 = qmk.i;
                ugg0Var = new ugg0(zclVar5, zclVar5, zclVar6, zclVar6);
            }
            mm40 mm40VarL = s5x0.L(i120.Q(lgb.J(mm40VarD, ugg0Var), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), 16.0f, 0.0f, 2);
            int iOrdinal2 = xx30Var.ordinal();
            if (iOrdinal2 == 0) {
                lh80VarT = s5x0.t(0.0f, 12.0f, 1);
            } else if (iOrdinal2 == 1) {
                lh80VarT = s5x0.u(0.0f, 16.0f, 0.0f, 0.0f, 13);
            } else if (iOrdinal2 != 2) {
                if (iOrdinal2 != 3) {
                    t9f.b();
                    return;
                }
                lh80VarT = s5x0.t(0.0f, 12.0f, 1);
            } else {
                lh80VarT = s5x0.u(0.0f, 0.0f, 0.0f, 16.0f, 7);
            }
            mm40 mm40VarI = s5x0.I(mm40VarL, lh80VarT);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarI);
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
            obc.d(h36.f12370a.a(cqqVar), u1c.M(-1178079689, new dfc0(x6q0Var, klyVar, bmh0Var, function1), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var, xx30Var, bmh0Var, x6q0Var, cqqVar, function1, i2, (byte) 27);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void O(final iyz iyzVar, final Function1 function1, fet fetVar, int i2) {
        final byte b2;
        yjj0 yjj0VarA;
        ljc ljcVar = jd8.n;
        fetVar.g0(142197108);
        int i3 = (fetVar.g(iyzVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        final byte b3 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            ry ryVar = iyzVar.e;
            wui0 wui0Var = iyzVar.d;
            jm40 jm40Var = jm40.b;
            Object obj = ukd.f35823a;
            if (ryVar == null) {
                fetVar.e0(1356447372);
                mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2);
                rqm rqmVar = new rqm((vui0) new rui0(iyzVar.c, null, iyzVar.b, null, 58), (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 446);
                boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
                Object objP = fetVar.P();
                if (z || objP == obj) {
                    objP = new Function0() { // from class: a.lyz
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b3;
                            iyz iyzVar2 = iyzVar;
                            Function1 function2 = function1;
                            switch (b4) {
                                case 0:
                                    function2.invoke(new gxz(iyzVar2.f15610a));
                                    break;
                                default:
                                    function2.invoke(new gxz(iyzVar2.f15610a));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP);
                }
                obc.q(mm40VarL, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 384, 232);
                fetVar.r(false);
            } else {
                fetVar.e0(1357058041);
                mm40 mm40VarL2 = s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).d, 0.0f, 2);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL2);
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
                rqm rqmVar2 = new rqm((vui0) new rui0(iyzVar.c, null, iyzVar.b, null, 58), (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 446);
                boolean z2 = ((i3 & 14) == 4) | ((i3 & 112) == 32);
                Object objP2 = fetVar.P();
                if (z2 || objP2 == obj) {
                    b2 = 1;
                    objP2 = new Function0() { // from class: a.lyz
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b2;
                            iyz iyzVar2 = iyzVar;
                            Function1 function2 = function1;
                            switch (b4) {
                                case 0:
                                    function2.invoke(new gxz(iyzVar2.f15610a));
                                    break;
                                default:
                                    function2.invoke(new gxz(iyzVar2.f15610a));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP2);
                } else {
                    b2 = 1;
                }
                boolean z3 = b2;
                obc.q(null, rqmVar2, false, null, (Function0) objP2, null, null, null, fetVar, 384, 233);
                androidx.compose.runtime.d dVar = zaq0.b;
                long backgroundContent = ((ThemeColors) fetVar.k(dVar)).getBackgroundContent();
                int iOrdinal = ryVar.b.ordinal();
                if (iOrdinal == 0) {
                    zcl zclVar = qmk.f28987a;
                    yjj0VarA = vgg0.a(16.0f);
                } else if (iOrdinal == z3) {
                    zcl zclVar2 = qmk.f28987a;
                    yjj0VarA = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                } else if (iOrdinal == 2) {
                    yjj0VarA = ljcVar;
                } else if (iOrdinal != 3) {
                    t9f.b();
                    return;
                } else {
                    zcl zclVar3 = qmk.f28987a;
                    yjj0VarA = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                }
                mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, yjj0VarA);
                zcl zclVar4 = qmk.f28987a;
                G(0, fetVar, s5x0.N(mm40VarQ, 16.0f, 0.0f, 16.0f, 12.0f, 2), ryVar.f31287a);
                if (ryVar.b != wui0.d) {
                    fetVar.e0(-1642631318);
                    jcb.v(s5x0.N(i120.Q(jm40Var, ((ThemeColors) fetVar.k(dVar)).getBackgroundContent(), ljcVar), 16.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f, ((ThemeColors) fetVar.k(dVar)).getSeparator(), fetVar, 0, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1642294968);
                    fetVar.r(false);
                }
                fetVar.r(z3);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(iyzVar, function1, i2, (byte) 17);
        }
    }

    public static final void P(mm40 mm40Var, i4 i4Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(-1893386756);
        int i3 = i2 | 6 | (fetVar.g(i4Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            n0q n0qVar = o7k0.c;
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ktz(i4Var, function1, (byte) 7);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ltz(mm40Var2, i4Var, function1, i2, (byte) 7);
        }
    }

    public static final void Q(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(-828951064);
        byte b2 = 16;
        int i3 = i2 | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            w2d w2dVarW0 = uzb.w0(0, fetVar2);
            xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
            boolean zG = fetVar2.g(w2dVarW0);
            Object objP = fetVar2.P();
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = cjx.V(jm40Var, w2dVarW0, null);
                fetVar2.o0(objP);
            }
            mm40 mm40Var2 = (mm40) objP;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new wta0(function1, (byte) 17);
                fetVar2.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z2 = i4 == 256;
            Object objP3 = fetVar2.P();
            byte b3 = 19;
            if (z2 || objP3 == cl5Var) {
                objP3 = new wta0(function1, b3);
                fetVar2.o0(objP3);
            }
            v3c.z(function0, (Function0) objP3, null, fetVar2, 0, 4);
            Object[] objArr = new Object[0];
            int i5 = i3 & 112;
            boolean z3 = i5 == 32;
            Object objP4 = fetVar2.P();
            if (z3 || objP4 == cl5Var) {
                objP4 = new wda0(l7m0Var, (byte) 14);
                fetVar2.o0(objP4);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP4, fetVar2);
            Object[] objArr2 = new Object[0];
            boolean z4 = i5 == 32;
            Object objP5 = fetVar2.P();
            if (z4 || objP5 == cl5Var) {
                objP5 = new wda0(l7m0Var, (byte) 15);
                fetVar2.o0(objP5);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP5, fetVar2);
            Object[] objArr3 = new Object[0];
            boolean z5 = i5 == 32;
            Object objP6 = fetVar2.P();
            if (z5 || objP6 == cl5Var) {
                objP6 = new wda0(l7m0Var, b2);
                fetVar2.o0(objP6);
            }
            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP6, fetVar2);
            Object objP7 = fetVar2.P();
            if (objP7 == cl5Var) {
                objP7 = jgk0.b(new ok7(w2dVarW0, (byte) 5));
                fetVar2.o0(objP7);
            }
            v2n0.c(mm40Var, w2dVarW0, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), 0.0f, u1c.M(286132039, new npb0(w2dVarW0, l7m0VarY2, l7m0VarY3, (l7m0) objP7, function1, (byte) 0), fetVar), u1c.M(571267942, new zs70(function1, l7m0VarY2, b3), fetVar), u1c.M(1838169890, new x2g((Object) mm40Var2, (Object) function1, (Object) xczVarA, (Object) l7m0VarY2, (byte) 5), fetVar), fetVar, 1797190, 0);
            fetVar2 = fetVar;
            if (((Boolean) ((l7m0) l7m0VarY.getValue()).getValue()).booleanValue()) {
                fetVar2.e0(787005773);
                n0q n0qVar = o7k0.c;
                Object objP8 = fetVar2.P();
                if (objP8 == cl5Var) {
                    objP8 = new npa0((byte) 18);
                    fetVar2.o0(objP8);
                }
                mm40 mm40VarY = y860.Y(n0qVar, false, null, null, (Function0) objP8, 14);
                zfn zfnVar = m8m0.f21378a;
                mm40 mm40VarQ = i120.Q(mm40VarY, ((StaticColors) fetVar2.k(zfnVar)).m109getOverlayBackground400d7_KjU(), jd8.n);
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
                kpb.j(jr8.f16991a.b(jm40Var, gqw0.e), new dkm((ycl) null, new y3d(((StaticColors) fetVar2.k(zfnVar)).m131getWhite800d7_KjU()), 3), fetVar2, 0, 0);
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                fetVar2.e0(787418042);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mpb0(mm40Var, l7m0Var, function1, i2, (byte) 0);
        }
    }

    public static final void R(mm40 mm40Var, okr okrVar, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        okr okrVar2 = okrVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(1816910554);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(okrVar2) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarE, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 0.0f, 16.0f, 0.0f, 8.0f, 5);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
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
            jm40 jm40Var = jm40.b;
            v8q0.a(okrVar2.b, s5x0.L(jm40Var, 16.0f, 0.0f, 2), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), s6t0.b().f33626a.getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 0, 131068);
            fetVar2 = fetVar;
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            okrVar2 = okrVar;
            rqm rqmVar = okrVar2.c;
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new hcr(function1, (byte) 4);
                fetVar2.o0(objP);
            }
            function2 = function1;
            obc.q(null, rqmVar, true, null, (Function0) objP, null, null, null, fetVar2, 384, 233);
            rqm rqmVar2 = okrVar2.d;
            boolean z3 = i4 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new hcr(function2, (byte) 5);
                fetVar2.o0(objP2);
            }
            obc.q(null, rqmVar2, false, null, (Function0) objP2, null, null, null, fetVar2, 0, 237);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ann(mm40Var, okrVar2, function2, i2, (byte) 27);
        }
    }

    public static final void S(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        mm40 mm40Var2;
        Object obj;
        a4x a4xVar2;
        fetVar.g0(-950124550);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object obj2 = (pkk0) fetVar.k(bmd.q);
            int i4 = i3 & 112;
            boolean z = i4 == 32 || ((i3 & 64) != 0 && fetVar.g(a4xVar));
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            Object obj3 = objP;
            if (z || objP == cl5Var) {
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : a4xVar) {
                    if (((pkh0) obj4).f27134a instanceof amh0) {
                        arrayList.add(obj4);
                    }
                }
                int iA = wp20.a(r3d.q(arrayList, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashMap.put(((pkh0) it.next()).f27134a.toString(), new cqq());
                }
                fetVar.o0(linkedHashMap);
                obj3 = linkedHashMap;
            }
            Object obj5 = (Map) obj3;
            boolean zI = (i4 == 32 || ((i3 & 64) != 0 && fetVar.i(a4xVar))) | fetVar.i(obj5) | fetVar.g(obj2);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                obj = obj5;
                a4xVar2 = a4xVar;
                objP2 = new ah0(a4xVar2, obj, obj2, null, (byte) 16);
                fetVar.o0(objP2);
            } else {
                obj = obj5;
                a4xVar2 = a4xVar;
            }
            m0x0.t(fetVar, a4xVar2, (Function2) objP2);
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(s5x0.L(jm40Var, f2, 0.0f, 2), "SECRET_QUESTION_LAZY_COLUMN");
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 12.0f, 0.0f, 88.0f, 5);
            boolean zI2 = (i4 == 32 || ((i3 & 64) != 0 && fetVar.i(a4xVar))) | fetVar.i(obj) | ((i3 & 896) == 256);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new zlb0(a4xVar2, obj, function1, (byte) 23);
                fetVar.o0(objP3);
            }
            b8k0.e(mm40VarE0, null, lh80VarU, null, null, null, false, null, (Function1) objP3, fetVar, 0, 506);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(mm40Var2, a4xVar, function1, i2, (byte) 13);
        }
    }

    public static final void T(mm40 mm40Var, nmh0 nmh0Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        nmh0 nmh0Var2;
        mm40 mm40Var2;
        nmh0Var.getClass();
        function1.getClass();
        fetVar.g0(1712621774);
        int i3 = i2 | 6 | (fetVar.g(nmh0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(o050.P(o050.X(o050.W(i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n)))), "SECRET_QUESTION_COLUMN");
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
            imm immVar = nmh0Var.f23773a;
            plh0 plh0Var = nmh0Var.c;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dng0(function1, (byte) 19);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            fetVar2 = fetVar;
            if (plh0Var instanceof olh0) {
                fetVar2.e0(923879816);
                M(0, fetVar2, null);
                fetVar2.r(false);
            } else if (plh0Var instanceof nlh0) {
                fetVar2.e0(-1424422684);
                C(null, ((nlh0) plh0Var).f23728a, function1, fetVar2, i4);
                fetVar2.r(false);
            } else {
                if (!(plh0Var instanceof mlh0)) {
                    throw b1j.f(923877137, fetVar2, false);
                }
                fetVar2.e0(-1424201499);
                S(i4, fetVar2, ((mlh0) plh0Var).f21990a, null, function1);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            boolean z2 = plh0Var instanceof mlh0;
            jm40 jm40Var = jm40.b;
            if (z2) {
                fetVar2.e0(800036756);
                WeakHashMap weakHashMap = djv0.w;
                nmh0Var2 = nmh0Var;
                j(o050.P(j120.L(jm40Var, zcm0.i(fetVar2).e)), nmh0Var2.b, function1, fetVar2, i4);
                fetVar2.r(false);
            } else {
                nmh0Var2 = nmh0Var;
                fetVar2.e0(800282772);
                fetVar2.r(false);
            }
            if (nmh0Var2.d) {
                fetVar2.e0(800311509);
                K(0, fetVar2, null);
                fetVar2.r(false);
            } else {
                fetVar2.e0(800341300);
                fetVar2.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            nmh0Var2 = nmh0Var;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var2, nmh0Var2, function1, i2, (byte) 27);
        }
    }

    public static final void U(mm40 mm40Var, syz syzVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        boolean z;
        pvi0 jvi0Var;
        fetVar.g0(-687550197);
        int i3 = i2 | 6 | (fetVar.g(syzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, f2, 0.0f, 2);
            String str = syzVar.f33045a;
            String str2 = syzVar.b;
            boolean z2 = syzVar.d;
            tui0 tui0Var = new tui0(str, null);
            if (z2) {
                z = true;
                fetVar.e0(-108162056);
                jvi0Var = new jvi0(str2, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()));
                fetVar.r(false);
            } else {
                fetVar.e0(-108383861);
                zfn zfnVar = zaq0.b;
                z = true;
                jvi0Var = new kvi0(str2, new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()));
                fetVar.r(false);
            }
            rqm rqmVar = new rqm(tui0Var, (pui0) null, jvi0Var, (d4d) null, (tvi0) null, syzVar.c, !z2, (e900) null, 314);
            boolean z3 = (i3 & 896) == 256 ? z : false;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new yqz(function1, (byte) 16);
                fetVar.o0(objP);
            }
            obc.q(mm40VarL, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 384, 232);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var2, syzVar, function1, i2, (byte) 3);
        }
    }

    public static final void V(mm40 mm40Var, i4 i4Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(-48953883);
        int i3 = i2 | 6 | (fetVar.g(i4Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ktz(i4Var, function1, (byte) 6);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ltz(mm40Var2, i4Var, function1, i2, (byte) 6);
        }
    }

    public static final void W(mm40 mm40Var, xcz xczVar, l7m0 l7m0Var, Function1 function1, Function1 function2, xdr xdrVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-2040963908);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(xdrVar) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            plr0 plr0Var = (plr0) l7m0Var.getValue();
            if (Intrinsics.d(plr0Var, nlr0.f23742a)) {
                fetVar.e0(1433752816);
                ahy.S(0, fetVar, null);
                fetVar.r(false);
            } else if (plr0Var instanceof olr0) {
                fetVar.e0(1496739110);
                I(mm40Var, xczVar, ((olr0) plr0Var).f25472a, function1, function2, xdrVar, fetVar, i3 & 523390);
                fetVar.r(false);
            } else if (plr0Var instanceof llr0) {
                fetVar.e0(1433766610);
                ibm0.c(null, ((llr0) plr0Var).f20263a, fetVar, 0);
                fetVar.r(false);
            } else {
                if (!(plr0Var instanceof mlr0)) {
                    throw b1j.f(1433750749, fetVar, false);
                }
                fetVar.e0(1433769746);
                ibm0.c(null, ((mlr0) plr0Var).f22007a, fetVar, 0);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fer0(mm40Var, xczVar, (Object) l7m0Var, function1, function2, xdrVar, i2, (byte) 3);
        }
    }

    public static final void X(mm40 mm40Var, l7m0 l7m0Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        fetVar.g0(233297913);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            erq0 erq0Var = (erq0) l7m0Var.getValue();
            if (erq0Var instanceof brq0) {
                fetVar.e0(861003086);
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(rsm0.w(org.xbet.client1.R.string.tournaments_take_part_confirm, 0, fetVar)), true, false, false);
                boolean z = (i3 & 896) == 256;
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new xhl0(function0, (byte) 25);
                    fetVar.o0(objP);
                }
                qzb.n(mm40VarD, wulVar, (Function0) objP, fetVar, 0, 0);
                fetVar.r(false);
            } else if (Intrinsics.d(erq0Var, crq0.f4858a)) {
                fetVar.e0(861028911);
                mm40 mm40VarD2 = o7k0.d(mm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(mm40VarD2, 40.0f);
                long jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
                zcl zclVar2 = qmk.f;
                ugg0 ugg0Var = vgg0.f37379a;
                zq8.a(0, fetVar, i120.Q(mm40VarE, jM75getBlack600d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
                fetVar.r(false);
            } else {
                if (!Intrinsics.d(erq0Var, drq0.f6576a)) {
                    throw b1j.f(861000781, fetVar, false);
                }
                fetVar.e0(861040454);
                zcl zclVar3 = qmk.f28987a;
                zq8.a(0, fetVar, o7k0.e(mm40Var, 0.0f));
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mam(mm40Var, l7m0Var, function0, i2, (byte) 1);
        }
    }

    public static final void Y(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, Function0 function0, fet fetVar, int i2) {
        int i3;
        l7m0 l7m0Var3;
        float f2;
        fetVar.g0(-315432209);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            l7m0Var3 = l7m0Var2;
            i3 |= fetVar.g(l7m0Var3) ? 256 : 128;
        } else {
            l7m0Var3 = l7m0Var2;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            int i4 = i3 & 112;
            qem0.i(i4, fetVar, null, l7m0Var);
            if (((Boolean) l7m0Var3.getValue()).booleanValue()) {
                zcl zclVar = qmk.f28987a;
                f2 = 0.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f2 = 8.0f;
            }
            X(s5x0.N(jm40.b, 0.0f, f2, 0.0f, 0.0f, 13), l7m0Var, function0, fetVar, ((i3 >> 3) & 896) | i4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rmr0(mm40Var, l7m0Var, l7m0Var2, function0, i2, (byte) 1);
        }
    }

    public static final void Z(mm40 mm40Var, k3t0 k3t0Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        k3t0Var.getClass();
        fetVar.g0(-1052995303);
        int i3 = i2 | 6 | (fetVar.g(k3t0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            i3t0 i3t0Var = (i3t0) k3t0Var;
            pz40 pz40VarY = i3t0Var.y(fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new ojr0(pz40VarY, (byte) 6));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = jgk0.b(new ojr0(l7m0Var, (byte) 7));
                fetVar.o0(objP2);
            }
            l7m0 l7m0Var2 = (l7m0) objP2;
            Object objP3 = fetVar.P();
            byte b2 = 8;
            if (objP3 == cl5Var) {
                objP3 = jgk0.b(new ojr0(l7m0Var, b2));
                fetVar.o0(objP3);
            }
            l7m0 l7m0Var3 = (l7m0) objP3;
            Object objP4 = fetVar.P();
            byte b3 = 9;
            if (objP4 == cl5Var) {
                objP4 = jgk0.b(new ojr0(pz40VarY, b3));
                fetVar.o0(objP4);
            }
            l7m0 l7m0Var4 = (l7m0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = jgk0.b(new ojr0(l7m0Var2, (byte) 10));
                fetVar.o0(objP5);
            }
            l7m0 l7m0Var5 = (l7m0) objP5;
            n0q n0qVar = o7k0.c;
            String str = ((vvr0) l7m0Var.getValue()).f38116a;
            boolean z = ((bwr0) pz40VarY.getValue()).c;
            boolean zBooleanValue = ((Boolean) l7m0Var5.getValue()).booleanValue();
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object objP6 = fetVar.P();
            if (z2 || objP6 == cl5Var) {
                objP6 = new s9r0(i3t0Var, b2);
                fetVar.o0(objP6);
            }
            Function0 function0 = (Function0) objP6;
            boolean z3 = i4 == 32;
            Object objP7 = fetVar.P();
            if (z3 || objP7 == cl5Var) {
                objP7 = new s9r0(i3t0Var, (byte) 9);
                fetVar.o0(objP7);
            }
            xia0.Y(n0qVar, str, z, zBooleanValue, function0, (Function0) objP7, null, u1c.M(276912918, new nhl0(l7m0Var3, i3t0Var, (byte) 29), fetVar), u1c.M(855679063, new sqc0((Object) l7m0Var2, (Object) l7m0Var5, (Object) i3t0Var, (byte) 20), fetVar), u1c.M(-1680974139, new d2s(l7m0Var4, i3t0Var, (byte) 26), fetVar), fetVar, 918552576, 64);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var2, k3t0Var, i2, (byte) 2);
        }
    }

    public static final void a(Function0 function0, Function0 function1, mm40 mm40Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1915955358);
        int i3 = i2 | (fetVar.i(function0) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16) | 384;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 12.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String strS = xsm0.s(org.xbet.client1.R.string.reject, fetVar);
            zfn zfnVar = zaq0.b;
            long secondaryButtonBackground = ((ThemeColors) fetVar.k(zfnVar)).getSecondaryButtonBackground();
            long secondaryButtonForeground = ((ThemeColors) fetVar.k(zfnVar)).getSecondaryButtonForeground();
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            s5x0.e(strS, function1, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), secondaryButtonForeground, secondaryButtonBackground, true, fetVar, (i3 & 112) | 196608);
            qxw.o(fetVar, o7k0.n(jm40Var, 8.0f));
            String strS2 = xsm0.s(org.xbet.client1.R.string.allow, fetVar);
            long primary = ((ThemeColors) fetVar.k(zfnVar)).getPrimary();
            long primaryForeground = ((ThemeColors) fetVar.k(zfnVar)).getPrimaryForeground();
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            s5x0.e(strS2, function0, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), primaryForeground, primary, true, fetVar, ((i3 << 3) & 112) | 196608);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2((Object) function0, (Object) function1, (Object) mm40Var2, i2, (byte) 6);
        }
    }

    public static l73 a0(l73 l73Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) ((hgk0) l73Var.b).getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((p73) l73Var.c).f26486a;
        }
        return new l73(l73Var.f19537a, Float.valueOf(f2), new p73(f3), l73Var.d, l73Var.e, l73Var.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r9v3, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static final void b(mm40 mm40Var, ou1 ou1Var, xcz xczVar, mtl mtlVar, Function1 function1, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        Function1 function2;
        mm40 mm40Var3;
        ?? r9;
        cl5 cl5Var;
        float f2;
        jm40 jm40Var;
        boolean z;
        float f3;
        float f4;
        ?? r12;
        ?? r10;
        fet fetVar2 = fetVar;
        ou1Var.getClass();
        xczVar.getClass();
        function1.getClass();
        fetVar2.g0(595785654);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = i2 | (fetVar2.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        int i6 = i4 | (fetVar2.g(ou1Var) ? 32 : 16) | (fetVar2.g(xczVar) ? 256 : 128) | (fetVar2.g(mtlVar) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i6 & 1, (i6 & 9363) != 9362)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40Var4 = i5 != 0 ? jm40Var2 : mm40Var2;
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40Var4.e(n0qVar), ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n), "FULL_INFO_RESULTS_BOX");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            boolean z3 = ou1Var instanceof mu1;
            cl5 cl5Var2 = ukd.f35823a;
            if (z3) {
                fetVar2.e0(-1571055799);
                mm40 mm40VarE1 = o2e.e0(n0qVar, "FULL_INFO_RESULTS_LAZY_COLUMN");
                zcl zclVar = qmk.f28987a;
                ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, mtlVar != null ? 100.0f : 24.0f, 5), fetVar2);
                boolean z4 = (i6 & 112) == 32;
                Object objP = fetVar2.P();
                if (z4 || objP == cl5Var2) {
                    objP = new m51(ou1Var, (byte) 9);
                    fetVar2.o0(objP);
                }
                jm40Var = jm40Var2;
                cl5Var = cl5Var2;
                z = false;
                f3 = 1.0f;
                b8k0.e(mm40VarE1, xczVar, ch80VarG, null, null, null, false, null, (Function1) objP, fetVar, ((i6 >> 3) & 112) | 6, Response.SERVER_TIMEOUT);
                fet fetVar3 = fetVar;
                fetVar3.r(false);
                f2 = 0.0f;
                r12 = 1;
                r10 = fetVar3;
            } else {
                cl5Var = cl5Var2;
                f2 = 0.0f;
                jm40Var = jm40Var2;
                z = false;
                f3 = 1.0f;
                if (!(ou1Var instanceof nu1)) {
                    throw b1j.f(364961466, fetVar2, false);
                }
                fetVar2.e0(-1568823024);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
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
                nu1 nu1Var = (nu1) ou1Var;
                ju1 ju1Var = nu1Var.b;
                if (ju1Var == null) {
                    fetVar2.e0(-1306455799);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-1306455798);
                    vfc.l(o7k0.d(jm40Var, 1.0f), ju1Var.f17128a, ju1Var.b, 0.0f, fetVar2, 6);
                    fetVar2.r(false);
                }
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                if (ju1Var != null) {
                    zcl zclVar2 = qmk.f28987a;
                    f4 = 40.0f;
                } else {
                    zcl zclVar3 = qmk.f28987a;
                    f4 = f2;
                }
                jcb.l(s5x0.N(mm40VarD, 0.0f, f4, 0.0f, ju1Var != null ? 24.0f : f2, 5), nu1Var.f24126a, true, null, fetVar2, 384, 8);
                r12 = 1;
                fetVar2.r(true);
                fetVar2.r(false);
                r10 = fetVar2;
            }
            if (mtlVar == null) {
                r10.e0(-1567546538);
                r10.r(z);
                function2 = function1;
            } else {
                r10.e0(-1567546537);
                mm40 mm40VarE2 = o2e.e0(s5x0.N(o7k0.d(jr8.f16991a.b(jm40Var, gqw0.h), f3), 0.0f, 0.0f, 0.0f, knm0.t(r12, r10, z), 7), "FULL_INFO_RESULTS_BOTTOM_BAR");
                lh80 lh80VarU = s5x0.u(f2, f2, f2, 12.0f, 7);
                ?? r0 = (i6 & 57344) == 16384 ? r12 : z;
                Object objP2 = r10.P();
                if (r0 != 0 || objP2 == cl5Var) {
                    function2 = function1;
                    objP2 = new h61(function2, (byte) 26);
                    r10.o0(objP2);
                } else {
                    function2 = function1;
                }
                bkb.f(mm40VarE2, mtlVar, null, false, lh80VarU, (Function1) objP2, r10, 3072, 4);
                r10.r(z);
            }
            r10.r(r12);
            mm40Var3 = mm40Var4;
            r9 = r10;
        } else {
            function2 = function1;
            fetVar2.X();
            mm40Var3 = mm40Var2;
            r9 = fetVar2;
        }
        yfe0 yfe0VarU = r9.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vs1(mm40Var3, (Object) ou1Var, xczVar, mtlVar, function2, i2, i3, (byte) 3);
        }
    }

    public static final lc00 b0(long j2, List list) {
        String str = (String) CollectionsKt.firstOrNull(list);
        String str2 = (String) CollectionsKt.W(1, list);
        lc00 lc00VarB = kotlin.collections.a.b();
        if (str != null) {
            lc00VarB.add(vsm0.s(j2, str));
        }
        if (str2 != null) {
            lc00VarB.add(vsm0.s(j2, str2));
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final void c(w02 w02Var, Function1 function1, fet fetVar, int i2) {
        w02Var.getClass();
        function1.getClass();
        fetVar.g0(1875721411);
        int i3 = (fetVar.g(w02Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 3;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40.b, 260.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar, 6);
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
            ffb0.b(w02Var.f38327a, w02Var.c, function1, fetVar, (i3 << 3) & 896);
            fre0.d(w02Var.b, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sr1(w02Var, function1, i2, b2);
        }
    }

    public static final boolean c0(long j2, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((pbv) next).f26728a != j2);
        pbv pbvVar = (pbv) next;
        if (pbvVar != null) {
            return pbvVar.k;
        }
        return false;
    }

    public static l73 d(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new l73(hp4.j, Float.valueOf(f2), new p73(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final boolean d0(qu20 qu20Var) {
        return qu20Var.a() == 1315 || qu20Var.a() == 1316;
    }

    public static final void e(xo4 xo4Var, Function1 function1, Function1 function2, Function1 function3, mm40 mm40Var, fet fetVar, int i2) {
        boolean z;
        xo4Var.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar.g0(665759170);
        int i3 = i2 | (fetVar.g(xo4Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128) | (fetVar.i(function3) ? 2048 : 1024) | (fetVar.g(mm40Var) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar));
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
            int i4 = i3 & 14;
            A(xo4Var, null, fetVar, i4);
            boolean z2 = ((i3 & 7168) == 2048) | (i4 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new ys3(function3, xo4Var, (byte) 18);
                fetVar.o0(objP);
            }
            y(xo4Var, (Function1) objP, null, fetVar, i4);
            boolean z3 = ((i3 & 112) == 32) | (i4 == 4);
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new wo4(function1, xo4Var, (byte) 0);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z4 = ((i3 & 896) == 256) | (i4 == 4);
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                z = true;
                objP3 = new wo4(function2, xo4Var, (byte) 1);
                fetVar.o0(objP3);
            } else {
                z = true;
            }
            a(function0, (Function0) objP3, null, fetVar, 0);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) xo4Var, function1, function2, (wdr) function3, (Object) mm40Var, i2, (byte) 6);
        }
    }

    public static final mm40 e0(mm40 mm40Var, Function1 function1) {
        return mm40Var.e(new ih60(function1));
    }

    public static final void f(mm40 mm40Var, u2k0 u2k0Var, nyq0 nyq0Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i2) {
        nyq0Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(125479051);
        int i3 = i2 | (fetVar.g(u2k0Var) ? 32 : 16) | (fetVar.g(nyq0Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            u1c.a(mm40Var, nyq0Var, u1c.M(912612251, new iop(u2k0Var, function0, function1, function2, (byte) 22), fetVar), fetVar, ((i3 >> 3) & 112) | 390);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var, u2k0Var, nyq0Var, function0, function1, function2, i2, (byte) 4);
        }
    }

    public static final scq0 f0(lm40 lm40Var, Function1 function1) {
        e7z e7zVarZ = vcc.Z(lm40Var);
        int i2 = e7zVarZ.b;
        oge0 rectManager = h7z.a(e7zVarZ).getRectManager();
        vn00 vn00Var = rectManager.d;
        vn00Var.getClass();
        ey40 ey40Var = (ey40) vn00Var.e;
        scq0 scq0Var = new scq0(vn00Var, i2, lm40Var, function1);
        Object objB = ey40Var.b(i2);
        if (objB == null) {
            ey40Var.j(i2, scq0Var);
            objB = scq0Var;
        }
        scq0 scq0Var2 = (scq0) objB;
        if (scq0Var2 != scq0Var) {
            while (true) {
                scq0 scq0Var3 = scq0Var2.d;
                if (scq0Var3 == null) {
                    break;
                }
                scq0Var2 = scq0Var3;
            }
            scq0Var2.d = scq0Var;
        }
        e7z e7zVarZ2 = vcc.Z(lm40Var.f20279a);
        if (e7zVarZ2.g != -4) {
            zz2 zz2Var = rectManager.c;
            int iD = rectManager.d(e7zVarZ2);
            long[] jArr = (long[]) zz2Var.b;
            int i3 = iD + 2;
            jArr[i3] = (jArr[i3] & 8070450532247928831L) | (-8070450532247928832L);
        }
        rectManager.f = true;
        rectManager.j();
        return scq0Var;
    }

    public static final void g(mm40 mm40Var, tvw tvwVar, fet fetVar, int i2) {
        fet fetVar2;
        fetVar.g0(-1664068543);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(tvwVar) ? 32 : 16);
        byte b2 = 0;
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar2 = fetVar;
            fetVar2.X();
        } else if (tvwVar instanceof svw) {
            fetVar.e0(-1753247087);
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            dww.c(a8k0.F(((svw) tvwVar).f32891a, 0, fetVar), null, o7k0.n(mm40Var, 24.0f), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(false);
        } else {
            fetVar2 = fetVar;
            fetVar2.e0(-1442021371);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kv7(mm40Var, tvwVar, i2, b2);
        }
    }

    public static final pt0 g0(ot0 ot0Var) {
        ot0Var.getClass();
        int iOrdinal = ot0Var.ordinal();
        if (iOrdinal == 0) {
            return pt0.f27539a;
        }
        if (iOrdinal == 1) {
            return pt0.b;
        }
        if (iOrdinal == 2) {
            return pt0.c;
        }
        if (iOrdinal == 3) {
            return pt0.d;
        }
        if (iOrdinal == 4) {
            return pt0.e;
        }
        t9f.b();
        return null;
    }

    public static final void h(mm40 mm40Var, dn7 dn7Var, Function0 function0, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        mm40 mm40Var3;
        float f2;
        fet fetVar2 = fetVar;
        tvw tvwVar = dn7Var.d;
        function0.getClass();
        fetVar2.g0(1610387176);
        int i5 = i3 & 1;
        byte b2 = 4;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2 | (fetVar2.g(mm40Var2) ? 4 : 2);
        }
        int i6 = i4 | (fetVar2.g(dn7Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i6 & 1, (i6 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40Var3 = i5 != 0 ? jm40Var : mm40Var2;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                if (tvwVar instanceof svw) {
                    zcl zclVar = qmk.f28987a;
                    f2 = 8.0f;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    f2 = 12.0f;
                }
                objP = twn.j(f2, fetVar2);
            }
            float f3 = ((ycl) objP).f42389a;
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var3, 52.0f);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new nk7(b2);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(rq8.K(mm40VarE, (Function1) objP2), null, null, false, null, function0, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            g(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), tvwVar, fetVar2, 0);
            mm40 mm40VarN = s5x0.N(new x7z(1.0f, true), f3, 0.0f, 4.0f, 0.0f, 10);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
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
            v8q0.a(dn7Var.f6354a, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(g1t0.g(), fetVar2), fetVar, 0, 24960, 110590);
            v8q0.a(kng0.k("\u200e", dn7Var.b), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(ibm0.t(g1t0.d(), fetVar), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 24960, 110590);
            fetVar2 = fetVar;
            fetVar2.r(true);
            dww.c(a8k0.F(org.xbet.client1.R.drawable.ic_glyph_chevron_right_small, 0, fetVar2), null, o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 16.0f, 0.0f, 11), 24.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getPrimary(), fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0(mm40Var3, (Object) dn7Var, (Object) function0, i2, i3, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    public static final jza h0(h0b h0bVar, List list) {
        a570 a570VarA;
        ?? arrayList;
        ?? arrayList2;
        List list2;
        c1s c1sVar;
        Double d2;
        List list3;
        h0bVar.getClass();
        list.getClass();
        k0b k0bVar = h0bVar.h;
        List list4 = h0bVar.f12226a;
        if (k0bVar == null || (list3 = k0bVar.e) == null) {
            a570.Companion.getClass();
            a570VarA = t470.a(false, 0L);
        } else {
            ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList3.add(((c1s) it.next()).f3589a);
            }
            Long l2 = (Long) CollectionsKt.firstOrNull(arrayList3);
            if (l2 != null) {
                long jLongValue = l2.longValue();
                t470 t470Var = a570.Companion;
                boolean zC0 = c0(jLongValue, list);
                t470Var.getClass();
                a570VarA = t470.a(zC0, jLongValue);
            } else {
                a570.Companion.getClass();
                a570VarA = t470.a(false, 0L);
            }
        }
        a570 a570Var = a570VarA;
        if (list4 != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                Long l3 = ((c1s) it2.next()).f3589a;
                if (l3 != null) {
                    arrayList4.add(l3);
                }
            }
            arrayList = new ArrayList(r3d.q(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                long jLongValue2 = ((Number) it3.next()).longValue();
                t470 t470Var2 = a570.Companion;
                boolean zC1 = c0(jLongValue2, list);
                t470Var2.getClass();
                arrayList.add(t470.a(zC1, jLongValue2));
            }
        } else {
            arrayList = iun.f15405a;
        }
        ?? r10 = arrayList;
        Double d3 = h0bVar.d;
        double dDoubleValue = d3 != null ? d3.doubleValue() : 0.0d;
        Double d4 = h0bVar.b;
        String strValueOf = String.valueOf(d4 != null ? d4.doubleValue() : 0.0d);
        Double d5 = h0bVar.c;
        double dDoubleValue2 = d5 != null ? d5.doubleValue() : 0.0d;
        if (list4 != null) {
            arrayList2 = new ArrayList();
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                Double d6 = ((c1s) it4.next()).c;
                if (d6 != null) {
                    arrayList2.add(d6);
                }
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        ?? r16 = arrayList2;
        double dDoubleValue3 = (k0bVar == null || (list2 = k0bVar.e) == null || (c1sVar = (c1s) CollectionsKt.firstOrNull(list2)) == null || (d2 = c1sVar.c) == null) ? 0.0d : d2.doubleValue();
        Double d7 = h0bVar.e;
        double dDoubleValue4 = d7 != null ? d7.doubleValue() : 0.0d;
        Double d8 = h0bVar.f;
        double dDoubleValue5 = d8 != null ? d8.doubleValue() : 0.0d;
        Double d9 = h0bVar.g;
        double dDoubleValue6 = d9 != null ? d9.doubleValue() : 0.0d;
        Long l4 = h0bVar.i;
        long jLongValue3 = l4 != null ? l4.longValue() : 0L;
        Long l5 = h0bVar.j;
        long jLongValue4 = jLongValue3 - (l5 != null ? l5.longValue() : 0L);
        return new jza(a570Var, r10, dDoubleValue, strValueOf, dDoubleValue2, r16, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, jLongValue4 < 0 ? 0L : jLongValue4);
    }

    public static final void i(ra10 ra10Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1863048032);
        byte b2 = 2;
        int i3 = (fetVar.g(ra10Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
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
            boolean z = (i3 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new bvn(ra10Var, (byte) 3);
                fetVar.o0(objP);
            }
            vbw0.y(0, 1, fetVar, null, (Function1) objP);
            gq80.k(jr8.f16991a.b(jm40.b, gqw0.h), u1c.M(-1060336053, new gn(function1, (byte) 26), fetVar), fetVar, 48);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new otz(ra10Var, function1, i2, b2);
        }
    }

    public static final void j(mm40 mm40Var, mtl mtlVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(335209852);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mtlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.h, false);
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
                objP = new abh0(function1, (byte) 3);
                fetVar.o0(objP);
            }
            bkb.f(null, mtlVar, null, false, null, (Function1) objP, fetVar, i3 & 112, 29);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vb2(mm40Var, mtlVar, function1, i2, (byte) 3);
        }
    }

    public static final void k(mom0 mom0Var, mm40 mm40Var, fet fetVar, int i2) {
        String strQ;
        fet fetVar2 = fetVar;
        fetVar2.g0(175995448);
        int i3 = i2 | (fetVar2.g(mom0Var) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            if (mom0Var instanceof kom0) {
                strQ = ((kom0) mom0Var).f18638a;
            } else if (mom0Var instanceof jom0) {
                strQ = ((jom0) mom0Var).f16866a;
            } else if (!(mom0Var instanceof lom0)) {
                t9f.b();
                return;
            } else {
                lom0 lom0Var = (lom0) mom0Var;
                strQ = w6x.q(lom0Var.f20400a, Separators.SP, lom0Var.b);
            }
            if (strQ.length() > 0) {
                fetVar2.e0(-1074218680);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(mm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                long j2 = qmk.p;
                long j3 = qmk.q;
                v8q0.a(strQ, mm40VarN, 0L, new n05(j2, j3, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, j3, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar, 0, 24960, 109556);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1073780278);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new un8(mom0Var, mm40Var, i2, (byte) 1);
        }
    }

    public static final void l(mm40 mm40Var, final qk9 qk9Var, gy40 gy40Var, final Function1 function1, fet fetVar, int i2) {
        int i3;
        gy40 gy40Var2;
        gy40 gy40Var3;
        function1.getClass();
        fetVar.g0(-1161816259);
        final byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(qk9Var) : fetVar.i(qk9Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= fetVar.i(function1) ? 2048 : 1024;
        }
        final byte b3 = 0;
        final byte b4 = 1;
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var4 = (gy40) objP;
            vk9 vk9Var = qk9Var.b;
            if (vk9Var instanceof sk9) {
                fetVar.e0(186081690);
                mm40 mm40VarD = defpackage.b.d(mm40Var, false);
                String str = qk9Var.f28875a;
                byte b5 = (i4 & 7168) == 2048 ? (byte) 1 : (byte) 0;
                if ((i4 & 112) != 32 && ((i4 & 64) == 0 || !fetVar.i(qk9Var))) {
                    b4 = 0;
                }
                int i5 = b5 | b4;
                Object objP2 = fetVar.P();
                if (i5 != 0 || objP2 == cl5Var) {
                    objP2 = new Function0() { // from class: a.nk9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b6 = b3;
                            qk9 qk9Var2 = qk9Var;
                            Function1 function2 = function1;
                            switch (b6) {
                                case 0:
                                    function2.invoke(qk9Var2);
                                    break;
                                case 1:
                                    function2.invoke(qk9Var2);
                                    break;
                                case 2:
                                    function2.invoke(qk9Var2);
                                    break;
                                default:
                                    function2.invoke(qk9Var2);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP2);
                }
                gy40Var3 = gy40Var4;
                n(mm40VarD, str, gy40Var3, (Function0) objP2, fetVar, i4 & 896);
                fetVar.r(false);
            } else if (vk9Var instanceof uk9) {
                fetVar.e0(186090170);
                mm40 mm40VarD2 = defpackage.b.d(mm40Var, true);
                String str2 = qk9Var.f28875a;
                boolean z = ((i4 & 112) == 32 || ((i4 & 64) != 0 && fetVar.i(qk9Var))) | ((i4 & 7168) == 2048);
                Object objP3 = fetVar.P();
                if (z || objP3 == cl5Var) {
                    objP3 = new Function0() { // from class: a.nk9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b6 = b4;
                            qk9 qk9Var2 = qk9Var;
                            Function1 function2 = function1;
                            switch (b6) {
                                case 0:
                                    function2.invoke(qk9Var2);
                                    break;
                                case 1:
                                    function2.invoke(qk9Var2);
                                    break;
                                case 2:
                                    function2.invoke(qk9Var2);
                                    break;
                                default:
                                    function2.invoke(qk9Var2);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP3);
                }
                gy40Var3 = gy40Var4;
                p(mm40VarD2, str2, gy40Var3, (Function0) objP3, fetVar, i4 & 896);
                fetVar.r(false);
            } else if (vk9Var instanceof rk9) {
                fetVar.e0(186098618);
                mm40 mm40VarD3 = defpackage.b.d(mm40Var, false);
                String str3 = qk9Var.f28875a;
                byte b6 = (i4 & 7168) == 2048 ? (byte) 1 : (byte) 0;
                if ((i4 & 112) != 32 && ((i4 & 64) == 0 || !fetVar.i(qk9Var))) {
                    b4 = 0;
                }
                int i6 = b6 | b4;
                Object objP4 = fetVar.P();
                if (i6 != 0 || objP4 == cl5Var) {
                    objP4 = new Function0() { // from class: a.nk9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b7 = b2;
                            qk9 qk9Var2 = qk9Var;
                            Function1 function2 = function1;
                            switch (b7) {
                                case 0:
                                    function2.invoke(qk9Var2);
                                    break;
                                case 1:
                                    function2.invoke(qk9Var2);
                                    break;
                                case 2:
                                    function2.invoke(qk9Var2);
                                    break;
                                default:
                                    function2.invoke(qk9Var2);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP4);
                }
                gy40Var3 = gy40Var4;
                m(mm40VarD3, str3, gy40Var3, (Function0) objP4, fetVar, i4 & 896);
                fetVar.r(false);
            } else {
                if (!(vk9Var instanceof tk9)) {
                    throw b1j.f(186080476, fetVar, false);
                }
                fetVar.e0(186107099);
                mm40 mm40VarD4 = defpackage.b.d(mm40Var, false);
                String str4 = qk9Var.f28875a;
                byte b7 = (i4 & 7168) == 2048 ? (byte) 1 : (byte) 0;
                if ((i4 & 112) != 32 && ((i4 & 64) == 0 || !fetVar.i(qk9Var))) {
                    b4 = 0;
                }
                int i7 = b7 | b4;
                Object objP5 = fetVar.P();
                if (i7 != 0 || objP5 == cl5Var) {
                    final byte b8 = 3;
                    objP5 = new Function0() { // from class: a.nk9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b9 = b8;
                            qk9 qk9Var2 = qk9Var;
                            Function1 function2 = function1;
                            switch (b9) {
                                case 0:
                                    function2.invoke(qk9Var2);
                                    break;
                                case 1:
                                    function2.invoke(qk9Var2);
                                    break;
                                case 2:
                                    function2.invoke(qk9Var2);
                                    break;
                                default:
                                    function2.invoke(qk9Var2);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP5);
                }
                gy40Var3 = gy40Var4;
                o(mm40VarD4, str4, gy40Var3, (Function0) objP5, fetVar, i4 & 896);
                fetVar.r(false);
            }
            gy40Var2 = gy40Var3;
        } else {
            fetVar.X();
            gy40Var2 = gy40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 9, i2, (Object) mm40Var, (Object) qk9Var, (Object) gy40Var2, (Object) function1);
        }
    }

    public static final void m(mm40 mm40Var, String str, gy40 gy40Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        String str2;
        fetVar.g0(700982669);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i3 |= fetVar.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(gy40Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function0) ? 2048 : 1024;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zx7 zx7Var = gqw0.e;
            mm40 mm40VarT = o7k0.t(o7k0.e(mm40Var, mk9.f21935a), mk9.b, mk9.c);
            zcl zclVar = qmk.f28987a;
            zfn zfnVar = zaq0.b;
            long separator = ((ThemeColors) fetVar.k(zfnVar)).getSeparator();
            ugg0 ugg0Var = mk9.d;
            mm40 mm40VarJ = lgb.J(i120.S(mm40VarT, 1.0f, separator, ugg0Var), ugg0Var);
            boolean z = (i3 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new pk9(function0, b2);
                fetVar.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarJ, gy40Var, null, false, null, (Function0) objP, 28), "CALENDAR_CELL");
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.m(), fetVar, (i3 >> 3) & 14, 24576, 114682);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ok9(mm40Var, str, gy40Var, function0, i2, (byte) 2);
        }
    }

    public static final void n(mm40 mm40Var, String str, gy40 gy40Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        String str2;
        fetVar.g0(1336387013);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i3 |= fetVar.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(gy40Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zx7 zx7Var = gqw0.e;
            mm40 mm40VarJ = lgb.J(o7k0.t(o7k0.e(mm40Var, mk9.f21935a), mk9.b, mk9.c), mk9.d);
            boolean z = (i3 & 7168) == 2048;
            Object objP = fetVar.P();
            byte b2 = 3;
            if (z || objP == ukd.f35823a) {
                objP = new pk9(function0, b2);
                fetVar.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarJ, gy40Var, null, false, null, (Function0) objP, 28), "CALENDAR_CELL");
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str2, null, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.m(), fetVar, (i3 >> 3) & 14, 24576, 114682);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ok9(mm40Var, str, gy40Var, function0, i2, (byte) 0);
        }
    }

    public static final void o(mm40 mm40Var, String str, gy40 gy40Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        String str2;
        fetVar.g0(-534394994);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i3 |= fetVar.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(gy40Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function0) ? 2048 : 1024;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zx7 zx7Var = gqw0.e;
            mm40 mm40VarJ = lgb.J(o7k0.t(o7k0.e(mm40Var, mk9.f21935a), mk9.b, mk9.c), mk9.d);
            boolean z = (i3 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new pk9(function0, b2);
                fetVar.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarJ, gy40Var, null, false, null, (Function0) objP, 28), "CALENDAR_CELL");
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str2, null, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary40(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.m(), fetVar, (i3 >> 3) & 14, 24576, 114682);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ok9(mm40Var, str, gy40Var, function0, i2, (byte) 1);
        }
    }

    public static final void p(mm40 mm40Var, String str, gy40 gy40Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1199570097);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(gy40Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zx7 zx7Var = gqw0.e;
            mm40 mm40VarJ = lgb.J(o7k0.t(o7k0.e(mm40Var, mk9.f21935a), mk9.b, mk9.c), mk9.d);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), jd8.n);
            boolean z = (i3 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new pk9(function0, b2);
                fetVar.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP, 28), "CALENDAR_CELL");
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar.k(zfnVar)).getPrimaryForeground(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.m(), fetVar, (i3 >> 3) & 14, 24576, 114682);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ok9(mm40Var, str, gy40Var, function0, i2, (byte) 3);
        }
    }

    public static final void q(mm40 mm40Var, lea leaVar, fet fetVar, int i2) {
        fetVar.g0(87451537);
        int i3 = i2 | 6 | (fetVar.g(leaVar) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1617392943, new m87(leaVar), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(mm40Var, leaVar, i2, b2);
        }
    }

    public static final void r(mm40 mm40Var, r2k0 r2k0Var, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(275614893);
        int i3 = i2 | 6 | (fetVar.g(r2k0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            float f2 = xfn.a(fetVar).e;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, f2, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.N(mm40VarL, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0.0f, 0.0f, 0.0f, 12.0f, 7);
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
            rcb.r(null, r2k0Var.f29739a, function0, fetVar, i3 & 896, 1);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            cem0.k(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), r2k0Var.b, function1, fetVar, (i3 >> 3) & 896);
            qxw.o(fetVar, o7k0.s(jm40Var, 8.0f));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            cem0.k(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), r2k0Var.c, function2, fetVar, (i3 >> 6) & 896);
            fetVar.r(true);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) mm40Var2, (Object) r2k0Var, (Object) function0, (Object) function1, (Object) function2, i2, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120  */
    /* JADX WARN: Code duplicated, block: B:52:0x0128  */
    /* JADX WARN: Code duplicated, block: B:55:0x0132  */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    public static final void s(mm40 mm40Var, vcd vcdVar, u12 u12Var, fet fetVar, int i2, int i3) {
        int i4;
        u12 u12Var2;
        boolean z;
        u12 u12Var3;
        yfe0 yfe0VarU;
        Object objP;
        u12 u12Var4;
        u12 u12Var5;
        fet fetVar2 = fetVar;
        pge pgeVar = gqw0.B;
        vcdVar.getClass();
        fetVar2.g0(-1773978186);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i4 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar2.g(vcdVar) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 == 0) {
            if ((i2 & 384) == 0) {
                u12Var2 = u12Var;
                i4 |= fetVar2.g(u12Var2) ? 256 : 128;
            }
            if ((i4 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i4 & 1, z)) {
                if (i5 != 0) {
                    u12Var2 = gqw0.e;
                }
                objP = fetVar2.P();
                if (objP == ukd.f35823a) {
                    objP = new i5b(b2);
                    fetVar2.o0(objP);
                }
                mm40 mm40VarQ = knx.Q(mm40Var, (xdr) objP);
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
                if (vcdVar instanceof tcd) {
                    fetVar2.e0(-452554870);
                    u12Var5 = u12Var2;
                    j0x.b(a8k0.F(((tcd) vcdVar).f33714a, 0, fetVar2), null, o7k0.c, u12Var5, pgeVar, 0.0f, null, fetVar2, 25016 | ((i4 << 3) & 7168), 96);
                    fetVar2.r(false);
                } else {
                    u12Var4 = u12Var2;
                    if (vcdVar instanceof ucd) {
                        throw b1j.f(262494603, fetVar2, false);
                    }
                    fetVar2.e0(262505877);
                    oja0.k(o7k0.c, ((ucd) vcdVar).f35423a, null, pgeVar, u12Var4, fetVar, ((i4 << 9) & 458752) | 24582, 12);
                    u12Var5 = u12Var4;
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
                fetVar2.r(true);
                u12Var3 = u12Var5;
            } else {
                fetVar2.X();
                u12Var3 = u12Var2;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new z23(mm40Var, (Object) vcdVar, (Object) u12Var3, i2, i3, (byte) 3);
            }
        }
        i4 |= 384;
        u12Var2 = u12Var;
        if ((i4 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar2.U(i4 & 1, z)) {
            if (i5 != 0) {
                u12Var2 = gqw0.e;
            }
            objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = new i5b(b2);
                fetVar2.o0(objP);
            }
            mm40 mm40VarQ2 = knx.Q(mm40Var, (xdr) objP);
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, gqw0.x);
            jpm0.o(fetVar2, bh90VarM2, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC1, gqw0.v);
            if (vcdVar instanceof tcd) {
                fetVar2.e0(-452554870);
                u12Var5 = u12Var2;
                j0x.b(a8k0.F(((tcd) vcdVar).f33714a, 0, fetVar2), null, o7k0.c, u12Var5, pgeVar, 0.0f, null, fetVar2, 25016 | ((i4 << 3) & 7168), 96);
                fetVar2.r(false);
            } else {
                u12Var4 = u12Var2;
                if (vcdVar instanceof ucd) {
                    throw b1j.f(262494603, fetVar2, false);
                }
                fetVar2.e0(262505877);
                oja0.k(o7k0.c, ((ucd) vcdVar).f35423a, null, pgeVar, u12Var4, fetVar, ((i4 << 9) & 458752) | 24582, 12);
                u12Var5 = u12Var4;
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(true);
            u12Var3 = u12Var5;
        } else {
            fetVar2.X();
            u12Var3 = u12Var2;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z23(mm40Var, (Object) vcdVar, (Object) u12Var3, i2, i3, (byte) 3);
        }
    }

    public static final void t(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-166699646);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            m8x.y(o7k0.c, u1c.M(125820734, new x6s(function1, (byte) 12), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0L, i120.m, u1c.M(-1011389357, new xs4(l7m0Var, function1, (byte) 5), fetVar), fetVar, 805306422, 188);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i2, (byte) 28);
        }
    }

    public static final void u(mm40 mm40Var, vpl vplVar, Function2 function2, fet fetVar, int i2) {
        mm40 mm40Var2;
        vpl vplVar2 = vplVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1583848566);
        int i3 = i2 | 6 | (fetVar2.g(vplVar2) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            long backgroundContent = afn0.m(fetVar2).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 280.0f);
            boolean zF = fetVar2.f(backgroundContent);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                objP = new nme((byte) 4, backgroundContent);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarN, (Function1) objP);
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new x53(function2, vplVar2, (byte) 1);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarF = phu0.F(mm40VarK, null, null, false, null, (Function0) objP2, fetVar, 0, 15);
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarF);
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
            mm40 mm40VarN2 = s5x0.N(o7k0.d(o7k0.e(jm40Var, 180.0f), 1.0f), 4.0f, 4.0f, 4.0f, 0.0f, 8);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
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
            n0q n0qVar = o7k0.c;
            k7x.b(vplVar2.f.a(), null, yyw.V(lgb.J(n0qVar, vgg0.a(16.0f)), fetVar.k(bmd.n) == k6z.b), a8k0.F(org.xbet.client1.R.drawable.aggregator_tournament_card_banner_placeholder, 0, fetVar), a8k0.F(org.xbet.client1.R.drawable.aggregator_tournament_card_banner_placeholder, 0, fetVar), null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 31712);
            byte b2 = 14;
            mm40 mm40VarM = s5x0.M(i120.P(n0qVar, yk5.n(q3d.j(new y3d(afn0.p(fetVar).m121getTransparent0d7_KjU()), new y3d(afn0.p(fetVar).m78getBlack800d7_KjU())), 0.0f, 0.0f, 14), null, 6), 8.0f, 12.0f, 8.0f, 8.0f);
            x5d x5dVarA2 = w5d.a(uc9.g, xx7Var, fetVar, 6);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarM);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            jwb.p(null, new qw3(4.0f, true, new jf4(b2)), new qw3(4.0f, true, new jf4(b2)), null, 0, 0, u1c.M(-954861101, new n0i(vplVar, (byte) 0), fetVar), fetVar, 1572864, 57);
            String str = vplVar.b;
            long jM123getWhite0d7_KjU = afn0.p(fetVar).m123getWhite0d7_KjU();
            afn0.v(fetVar).getClass();
            v8q0.a(str, jm40Var, jM123getWhite0d7_KjU, new n05(qmk.u, qmk.w, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(g1t0.p(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 48, 24960, 110576);
            fetVar.r(true);
            fetVar.r(true);
            mm40 mm40VarJ = s5x0.J(o7k0.c(jm40Var, 1.0f), 8.0f);
            yx7 yx7Var = gqw0.k;
            x5d x5dVarA3 = w5d.a(new qw3(8.0f, false, new gne(yx7Var, (byte) 11)), xx7Var, fetVar, 0);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarJ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA3, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            String str2 = vplVar.c;
            long textPrimary = afn0.m(fetVar).getTextPrimary();
            afn0.v(fetVar).getClass();
            v8q0.a(str2, jm40Var, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.i(), fetVar, 48, 24960, 110584);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            dww.c(a8k0.F(org.xbet.client1.R.drawable.ic_glyph_history, 0, fetVar), null, o7k0.n(jm40Var, 18.0f), afn0.m(fetVar).getSecondary(), fetVar, 56, 0);
            vplVar2 = vplVar;
            v8q0.a(vplVar2.g, jm40Var, afn0.m(fetVar).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, h97.g(fetVar), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, true, true, true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k0i(mm40Var2, vplVar2, function2, i2, (byte) 0);
        }
    }

    public static final void v(mm40 mm40Var, bql bqlVar, Function0 function0, Function2 function2, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1495339883);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bqlVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (!fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.X();
        } else if (bqlVar instanceof zpl) {
            fetVar.e0(1792428276);
            w(mm40Var, (zpl) bqlVar, function0, function2, fetVar, i3 & 8190);
            fetVar.r(false);
        } else {
            if (!bqlVar.equals(aql.f1301a)) {
                throw b1j.f(1792425808, fetVar, false);
            }
            fetVar.e0(1792437334);
            x(i3 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j0i(mm40Var, bqlVar, function0, function2, i2, (byte) 0);
        }
    }

    public static final void w(mm40 mm40Var, zpl zplVar, Function0 function0, Function2 function2, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1520816668);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(zplVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarL = s5x0.L(jm40.b, xfn.a(fetVar2).e, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            int i4 = i3;
            nkb.h(ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true), new hjm(zplVar.f44764a, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar2, 384, 56);
            wul wulVar = new wul(mul.e, oe9.d, new ue9(zplVar.b), true, false, false);
            boolean z2 = (i4 & 896) == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new pk9(function0, (byte) 22);
                fetVar2.o0(objP);
            }
            qzb.n(null, wulVar, (Function0) objP, fetVar2, 0, 1);
            fetVar2.r(true);
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar2).c, 0.0f, 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z3 = ((i4 & 7168) == 2048) | ((i4 & 112) == 32);
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new l0i(zplVar, function2, (byte) 0);
                fetVar2.o0(objP2);
            }
            b8k0.f(null, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 0, Response.REQUEST_PENDING);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m0i(mm40Var, zplVar, function0, function2, i2, (byte) 0);
        }
    }

    public static final void x(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(434141715);
        int i3 = (i2 & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i2 : i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            byte b2 = 14;
            qw3 qw3Var = new qw3(10.0f, true, new jf4(b2));
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(qw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, f2, 0.0f, 0.0f, 0.0f, 14), 128.0f), 20.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0VarD0));
            mm40 mm40VarN = s5x0.N(o7k0.z(jm40Var, xx7Var, true), xfn.a(fetVar).c, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b2)), gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
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
            fetVar.e0(-711064010);
            for (int i4 = 0; i4 < 3; i4++) {
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarE2 = o7k0.e(o7k0.s(jm40Var, 280.0f), 280.0f);
                zcl zclVar4 = qmk.i;
                qxw.o(fetVar, xbc.c0(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarE2), fqj0VarD0));
            }
            ohs0.x(fetVar, false, true, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i2, (byte) 21);
        }
    }

    public static final void y(xo4 xo4Var, Function1 function1, mm40 mm40Var, fet fetVar, int i2) {
        int i3;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(757830400);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(xo4Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.i(function1) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (fetVar2.U(i4 & 1, (i4 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 4.0f, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
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
            String str = xo4Var.c;
            zfn zfnVar = zaq0.b;
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.s(), fetVar, 0, 0, 131066);
            boolean z2 = (i4 & 112) == 32;
            int i5 = i4 & 14;
            boolean z3 = (i5 == 4) | z2;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new wo4(function1, xo4Var, (byte) 2);
                fetVar.o0(objP);
            }
            Function0 function0G = phu0.G(0, 1, fetVar, (Function0) objP);
            ugg0 ugg0Var = vgg0.f37379a;
            lh80 lh80Var = ee9.f7659a;
            o050.g(function0G, o7k0.n(jm40Var, 32.0f), false, ugg0Var, ee9.a(((ThemeColors) fetVar.k(zfnVar)).getBackground(), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), 0L, 0L, fetVar, 12), null, s5x0.t(0.0f, 0.0f, 3), cfx0.g, fetVar, 817889280, 356);
            fetVar.r(true);
            long primary = ((ThemeColors) fetVar.k(zfnVar)).getPrimary();
            long backgroundLight60 = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundLight60();
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13);
            boolean z4 = i5 == 4;
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new a13(xo4Var, (byte) 29);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new ij4((byte) 6);
                fetVar.o0(objP3);
            }
            p3c0.c(function0, mm40VarN, primary, backgroundLight60, 0, 0.0f, (Function1) objP3, fetVar, 1572864, 16);
            v8q0.a(xo4Var.d, s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((byte) 28, i2, (Object) xo4Var, (Object) mm40Var2, function1);
        }
    }

    public static final void z(int i2, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(1683250500);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var, 16.0f, 0.0f, 16.0f, 16.0f, 2);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarN, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, (i3 >> 3) & 14, 0, 131064);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str2, i2, (byte) 21);
        }
    }
}
