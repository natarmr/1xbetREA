package a;

import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.math.RoundingMode;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hew0 {
    public static final char[] g;
    public static final char[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f12945a = new ugd(-3747935, false, new vgd(0));
    public static final ugd b = new ugd(1210578693, false, new bhd(9));
    public static final ugd c = new ugd(-1760070726, false, new fhd(14));
    public static final ugd d = new ugd(-1574377037, false, new lhd(15));
    public static final ugd e = new ugd(-2141749840, false, new qhd(22));
    public static final char[] f = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public static final char[] h = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static final char[] j = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};
    public static final int[] k = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] l = {-1, JosStatusCodes.RTN_CODE_COMMON_ERROR, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] m = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] n = {JosStatusCodes.RTN_CODE_COMMON_ERROR, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] o = {5, 8, 10, 12};
    public static final int[] p = {6, 9, 12, 15};
    public static final int[] q = {2, 4, 6, 8};
    public static final int[] r = {9, 11, 13, 16};
    public static final int[] s = {5, 8, 10, 12};
    public static final String[] t = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        g = cArr;
        i = cArr;
    }

    public static final void A(mm40 mm40Var, muc0 muc0Var, fet fetVar, int i2) {
        fetVar.g0(-1765434145);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(muc0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
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
            xdx.l(null, fqj0VarD0, fetVar, 0);
            tfx.j(null, fqj0VarD0, fetVar, 0);
            m8x.u(null, muc0Var, fqj0VarD0, fetVar, i3 & 112);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(mm40Var, muc0Var, i2, (byte) 24);
        }
    }

    public static final void B(mm40 mm40Var, String str, Function0 function0, fet fetVar, int i2) {
        mm40 mm40Var2;
        int i3;
        String str2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1291912732);
        if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            str2 = str;
            i3 |= fetVar2.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new tq(function0, (byte) 28);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40Var2, null, null, false, null, (Function0) objP, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            v8q0.a(str2, s5x0.N(jm40Var, 0.0f, 0.0f, 2.0f, 0.0f, 11), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.l(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar, (i3 >> 3) & 14, 0, 131068);
            fetVar2 = fetVar;
            mm40 mm40VarV = yyw.V(o7k0.n(jm40Var, 18.0f), fetVar2.k(bmd.n) == k6z.b);
            pm80 pm80VarF = a8k0.F(R.drawable.glyph_chevron_right_small, 0, fetVar2);
            pz40 pz40Var = s6t0.f31722a;
            dww.c(pm80VarF, null, mm40VarV, s6t0.b().f33626a.getPrimary(), fetVar2, 56, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fg5(mm40Var, str, function0, i2, (byte) 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static final void C(ztv ztvVar, fet fetVar, int i2) {
        fet fetVar2;
        long primary;
        Function0 function0;
        a4x a4xVar;
        boolean z;
        ?? r11;
        fet fetVar3;
        fet fetVar4 = fetVar;
        fetVar4.g0(-1778063453);
        int i3 = i2 | (fetVar4.g(ztvVar) ? 4 : 2);
        if (fetVar4.U(i3 & 1, (i3 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar4, jm40Var);
            mkd.c0.getClass();
            fetVar4.i0();
            boolean z2 = fetVar4.S;
            Function0 function1 = e7z.u1;
            if (z2) {
                fetVar4.l(function1);
            } else {
                fetVar4.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar4, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar4, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar4, numValueOf, shdVar3);
            jpm0.n(fetVar4);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar4, mm40VarC0, shdVar4);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar4, 0);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, jm40Var);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(function1);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, thg0VarA, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar4);
            String strW = rsm0.w(R.string.touches, 0, fetVar4);
            androidx.compose.runtime.d dVar = j1t0.e;
            ((g1t0) fetVar4.k(dVar)).getClass();
            y9q0 y9q0VarN = g1t0.n();
            androidx.compose.runtime.d dVar2 = zaq0.b;
            aad.e(strW, null, y9q0.a(y9q0VarN, ((ThemeColors) fetVar4.k(dVar2)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), null, 2, false, 1, 0, null, null, fetVar, 1597440, 938);
            fet fetVar5 = fetVar;
            lgp0 lgp0Var = ztvVar.b;
            nep0 nep0Var = ztvVar.f44982a;
            a4x a4xVar2 = nep0Var.b;
            if (lgp0Var == lgp0.f20019a) {
                fetVar5.e0(-579147170);
                primary = ((StaticColors) fetVar5.k(m8m0.f21378a)).m113getRed0d7_KjU();
                fetVar5.r(false);
            } else {
                fetVar5.e0(-579082752);
                primary = ((ThemeColors) fetVar5.k(dVar2)).getPrimary();
                fetVar5.r(false);
            }
            long j2 = primary;
            zcl zclVar = qmk.f28987a;
            f(ztvVar.c, 0, j2, fetVar5, s5x0.L(jm40Var, 4.0f, 0.0f, 2));
            fetVar5.r(true);
            mm40 mm40VarN = s5x0.N(o7k0.e(o7k0.d(jm40Var, 1.0f), 210.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            zcl zclVar2 = qmk.i;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode3 = Long.hashCode(fetVar5.T);
            bh90 bh90VarM3 = fetVar5.m();
            mm40 mm40VarC2 = kbc.c0(fetVar5, mm40VarE);
            fetVar5.i0();
            if (fetVar5.S) {
                function0 = function1;
                fetVar5.l(function0);
            } else {
                function0 = function1;
                fetVar5.r0();
            }
            jpm0.o(fetVar5, tj30VarC, shdVar);
            jpm0.o(fetVar5, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar5, shdVar3, fetVar5);
            jpm0.o(fetVar5, mm40VarC2, shdVar4);
            pm80 pm80VarF = a8k0.F(R.drawable.football_field_background, 0, fetVar5);
            pge pgeVar = gqw0.A;
            n0q n0qVar = o7k0.c;
            Function0 function2 = function0;
            j0x.b(pm80VarF, null, lgb.J(n0qVar, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), null, pgeVar, 0.0f, null, fetVar5, 24632, 104);
            if (ztvVar.c == 0) {
                fetVar5.e0(-225357859);
                mm40 mm40VarB = jr8.f16991a.b(i120.Q(n0qVar, ((ThemeColors) fetVar5.k(dVar2)).getBackground(), jd8.n), gqw0.e);
                x5d x5dVarA2 = w5d.a(uc9.e, gqw0.n, fetVar5, 54);
                int iHashCode4 = Long.hashCode(fetVar5.T);
                bh90 bh90VarM4 = fetVar5.m();
                mm40 mm40VarC3 = kbc.c0(fetVar5, mm40VarB);
                fetVar5.i0();
                if (fetVar5.S) {
                    fetVar5.l(function2);
                } else {
                    fetVar5.r0();
                }
                jpm0.o(fetVar5, x5dVarA2, shdVar);
                jpm0.o(fetVar5, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar5, shdVar3, fetVar5);
                jpm0.o(fetVar5, mm40VarC3, shdVar4);
                j0x.b(a8k0.F(R.drawable.ic_empty_data, 0, fetVar5), null, o7k0.y(jm40Var, null, 3), null, null, 0.0f, null, fetVar5, 440, 120);
                String strW2 = rsm0.w(R.string.statistic_empty_data, 0, fetVar5);
                ((g1t0) fetVar5.k(dVar)).getClass();
                a4xVar = a4xVar2;
                aad.e(strW2, null, y9q0.a(g1t0.j(), ((ThemeColors) fetVar5.k(dVar2)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), null, 2, false, 1, 0, null, null, fetVar, 1597440, 938);
                fet fetVar6 = fetVar;
                z = true;
                fetVar6.r(true);
                r11 = 0;
                fetVar6.r(false);
                fetVar3 = fetVar6;
            } else {
                a4xVar = a4xVar2;
                z = true;
                r11 = 0;
                fetVar5.e0(-225546401);
                o(a4xVar, fetVar5, 6);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            fetVar3.r(z);
            if (a4xVar.isEmpty()) {
                fetVar3.e0(1168116213);
                fetVar3.r(r11);
            } else {
                fetVar3.e0(1167845211);
                j0x.b(a8k0.F(nep0Var.c, r11, fetVar3), null, o7k0.w(o7k0.d(jm40Var, 1.0f), null, r11, 3), null, null, 0.0f, null, fetVar3, 440, 120);
                fetVar3.r(r11);
            }
            fetVar3.r(true);
            fetVar2 = fetVar3;
        } else {
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jar(ztvVar, i2, (byte) 29);
        }
    }

    public static final void D(mm40 mm40Var, t89 t89Var, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(-743988639);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.i(function0) ? 256 : 128);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = xf0.c(0.0f);
                fetVar.o0(objP);
            }
            t33 t33Var = (t33) objP;
            Unit unit = Unit.f46060a;
            boolean zI = ((i3 & 896) == 256) | fetVar.i(t33Var);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new lcl0(function0, t33Var, null, (byte) 14);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, unit, (Function2) objP2);
            boolean zI2 = fetVar.i(t33Var);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == obj) {
                objP3 = new m53(t33Var, (byte) 26);
                fetVar.o0(objP3);
            }
            mm40 mm40VarT = i4w0.T(mm40Var, (Function1) objP3);
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = new oi4(t89Var, b2);
                fetVar.o0(objP4);
            }
            zq8.a(0, fetVar, rq8.K(mm40VarT, (Function1) objP4));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, t89Var, function0, i2, (byte) 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void E(mm40 mm40Var, final List list, final a4x a4xVar, final xcz xczVar, final xcz xczVar2, rah0 rah0Var, final Function1 function1, fet fetVar, int i2) {
        final rah0 rah0Var2;
        float f2;
        Iterator it;
        pz40 pz40Var;
        int i3;
        mm40 mm40Var2;
        final byte b2;
        boolean z;
        lw3 lw3Var = uc9.f35418a;
        list.getClass();
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(1453656693);
        int i4 = (i2 & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= (i2 & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.g(a4xVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= fetVar.g(xczVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= fetVar.g(xczVar2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= fetVar.g(rah0Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        int i5 = i4;
        if (fetVar.U(i5 & 1, (i5 & 599187) != 599186)) {
            fetVar.Z();
            if ((i2 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            pz40 pz40Var2 = s6t0.f31722a;
            y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109);
            int i6 = i5 >> 6;
            int i7 = (i6 & 14) | (i5 & 112);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            long jB = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
            float f3 = xfn.a(fetVar).c;
            g9q0 g9q0VarN = pym0.n(fetVar);
            boolean zG = ((((i7 & 14) ^ 6) > 4 && fetVar.g(a4xVar)) || (i7 & 6) == 4) | ((((i7 & 112) ^ 48) > 32 && fetVar.g(list)) || (i7 & 48) == 32) | fetVar.g(y9q0Var) | fetVar.g(w6kVar) | fetVar.f(jB) | fetVar.d(f3) | fetVar.g(g9q0VarN);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                vcr0 vcr0Var = new vcr0(a4xVar, list, y9q0Var, w6kVar, jB, f3, g9q0VarN);
                float f4 = wmo0.f39415a;
                int i8 = (int) (jB >> 32);
                ujv0 ujv0Var = new ujv0(w6kVar.r0(i8), w6kVar.r0((int) (jB & 4294967295L)));
                vmo0 vmo0Var = ujv0Var.a(Response.BAD_REQUEST) ? vmo0.c : ujv0Var.a(360) ? vmo0.b : vmo0.f37682a;
                ycl yclVar = new ycl(w6kVar.r0(i8 / 2));
                int iOrdinal = vmo0Var.ordinal();
                if (iOrdinal == 0) {
                    f2 = 208.0f;
                } else if (iOrdinal == 1) {
                    f2 = 220.0f;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return;
                    }
                    f2 = 232.0f;
                }
                ycl yclVar2 = new ycl(f2);
                if (yclVar.compareTo(yclVar2) < 0) {
                    yclVar = yclVar2;
                }
                HashMap map = new HashMap();
                HashMap map2 = new HashMap(a4xVar.size());
                Iterator<E> it2 = a4xVar.iterator();
                while (it2.hasNext()) {
                    ceo0 ceo0Var = (ceo0) it2.next();
                    map2.put(new kcm0(ceo0Var.f4222a), Integer.valueOf(nsm0.w(map, vcr0Var, ceo0Var.b)));
                    vmo0Var = vmo0Var;
                }
                vmo0 vmo0Var2 = vmo0Var;
                Iterator it3 = vcr0Var.b.iterator();
                while (it3.hasNext()) {
                    for (Map.Entry entry : ((deo0) it3.next()).i.entrySet()) {
                        Integer num = (Integer) map2.get(entry.getKey());
                        if (num != null) {
                            int iIntValue = num.intValue();
                            it = it3;
                            int iW = nsm0.w(map, vcr0Var, (String) entry.getValue());
                            if (iW > iIntValue) {
                                map2.put(entry.getKey(), Integer.valueOf(iW));
                            }
                        } else {
                            it = it3;
                        }
                        it3 = it;
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map2.size()));
                Iterator it4 = map2.entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it4.next();
                    Object key = entry2.getKey();
                    Iterator it5 = it4;
                    ycl yclVar3 = (ycl) l1e0.h(new ycl(w6kVar.r0(((Number) entry2.getValue()).intValue())), new ycl(wmo0.a(vmo0Var2)), new ycl(wmo0.f39415a));
                    float f5 = yclVar3.f42389a;
                    linkedHashMap.put(key, yclVar3);
                    it4 = it5;
                }
                float f6 = wmo0.b;
                float fR0 = w6kVar.r0(i8);
                float f7 = yclVar.f42389a;
                ycl yclVar4 = new ycl((fR0 - f7) - vcr0Var.f);
                zcl zclVar = qmk.f28987a;
                ycl yclVar5 = new ycl(0.0f);
                if (yclVar4.compareTo(yclVar5) < 0) {
                    yclVar4 = yclVar5;
                }
                Iterator it6 = linkedHashMap.values().iterator();
                float f8 = 0.0f;
                while (it6.hasNext()) {
                    f8 += ((ycl) it6.next()).f42389a;
                }
                boolean z2 = ycl.a((((float) (linkedHashMap.size() * 2)) * f6) + f8, yclVar4.f42389a) > 0;
                objP = new ucr0(f7, linkedHashMap, f6, wmo0.a(vmo0Var2), z2, z2 ? lw3Var : uc9.b);
                fetVar.o0(objP);
            }
            final ucr0 ucr0Var = (ucr0) objP;
            final float f9 = xfn.a(fetVar).c;
            boolean z3 = ucr0Var.e;
            float f10 = ucr0Var.f35444a;
            pz40 pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z3), fetVar);
            boolean z4 = ucr0Var.e;
            jm40 jm40Var = jm40.b;
            if (z4) {
                fetVar.e0(-267948375);
                sjj sjjVarA = wzk0.a(fetVar);
                boolean zG2 = fetVar.g(sjjVarA);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj) {
                    objP2 = new iuj(sjjVarA);
                    fetVar.o0(objP2);
                }
                pz40Var = pz40VarF;
                mm40 mm40VarU = wha0.U(jm40Var, rah0Var, false, (iuj) objP2, true, false, false);
                i3 = 0;
                fetVar.r(false);
                mm40Var2 = mm40VarU;
            } else {
                pz40Var = pz40VarF;
                i3 = 0;
                fetVar.e0(-267753323);
                fetVar.r(false);
                mm40Var2 = jm40Var;
            }
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, i3);
            final mm40 mm40Var3 = mm40Var2;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z5 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z5) {
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
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
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarE2 = o7k0.e(mm40VarD2, 44.0f);
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new meo0((byte) 0);
                fetVar.o0(objP3);
            }
            mm40 mm40VarK = rq8.K(mm40VarE2, (Function1) objP3);
            thg0 thg0VarA = shg0.a(lw3Var, gqw0.k, fetVar, 48);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarK);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            mm40 mm40VarS = o7k0.s(jm40Var, f10);
            rah0Var2 = rah0Var;
            q0x.t(0, fetVar, s5x0.N(mm40VarS, f9, 0.0f, 8.0f, 0.0f, 10));
            q8x.n(s5x0.N(new x7z(1.0f, true).e(mm40Var3), 0.0f, 0.0f, f9, 0.0f, 11), a4xVar, ucr0Var, fetVar, (i5 >> 3) & 112);
            fetVar.r(true);
            msm0.c(null, xczVar, xczVar2, u1c.M(-1591113026, new xdr() { // from class: a.neo0
                @Override // a.xdr
                public final Object F(Object obj2, Object obj3, Object obj4) {
                    mm40 mm40Var4 = (mm40) obj2;
                    fet fetVar2 = (fet) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    mm40Var4.getClass();
                    if ((iIntValue2 & 6) == 0) {
                        iIntValue2 |= fetVar2.g(mm40Var4) ? 4 : 2;
                    }
                    if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                        mm40 mm40VarD3 = o7k0.d(mm40Var4, 1.0f);
                        thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
                        int iHashCode5 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM5 = fetVar2.m();
                        mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarD3);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(e7z.u1);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, thg0VarA2, gqw0.x);
                        jpm0.o(fetVar2, bh90VarM5, gqw0.w);
                        jpm0.o(fetVar2, Integer.valueOf(iHashCode5), gqw0.y);
                        jpm0.n(fetVar2);
                        jpm0.o(fetVar2, mm40VarC4, gqw0.v);
                        jm40 jm40Var2 = jm40.b;
                        ucr0 ucr0Var2 = ucr0Var;
                        mm40 mm40VarS2 = o7k0.s(jm40Var2, ucr0Var2.f35444a);
                        zcl zclVar3 = qmk.f28987a;
                        lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
                        List list2 = list;
                        boolean zI = fetVar2.i(list2);
                        Function1 function2 = function1;
                        boolean zG3 = zI | fetVar2.g(function2);
                        float f11 = f9;
                        boolean zD = zG3 | fetVar2.d(f11);
                        Object objP4 = fetVar2.P();
                        cl5 cl5Var = ukd.f35823a;
                        if (zD || objP4 == cl5Var) {
                            objP4 = new ny2(list2, function2, f11, (byte) 17);
                            fetVar2.o0(objP4);
                        }
                        b8k0.e(mm40VarS2, xczVar, lh80VarU, null, null, null, false, null, (Function1) objP4, fetVar2, 12582912, 376);
                        mm40 mm40VarE3 = new x7z(1.0f, true).e(mm40Var3);
                        lh80 lh80VarU2 = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
                        boolean zI2 = fetVar2.i(list2) | fetVar2.g(function2) | fetVar2.d(f11);
                        a4x a4xVar2 = a4xVar;
                        boolean zG4 = zI2 | fetVar2.g(a4xVar2) | fetVar2.g(ucr0Var2);
                        Object objP5 = fetVar2.P();
                        if (zG4 || objP5 == cl5Var) {
                            m9x m9xVar = new m9x(list2, function2, f11, a4xVar2, ucr0Var2);
                            fetVar2.o0(m9xVar);
                            objP5 = m9xVar;
                        }
                        b8k0.e(mm40VarE3, xczVar2, lh80VarU2, null, null, null, false, null, (Function1) objP5, fetVar2, 12582912, 376);
                        fetVar2.r(true);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (i6 & 112) | 3072 | (i6 & 896));
            fetVar.r(true);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarS2 = o7k0.s(o7k0.c(ffb0.R(jr8Var.b(jm40Var, zx7Var), f10, 0.0f, 2), 1.0f), 12.0f);
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                pz40 pz40Var3 = s6t0.f31722a;
                objP4 = yk5.g(q3d.j(new y3d(s6t0.b().f33626a.getTableGradient()), new y3d(StaticColors.INSTANCE.m63getBlack00d7_KjU())), 0.0f, 0.0f, 14);
                fetVar.o0(objP4);
            }
            t89 t89Var = (t89) objP4;
            final pz40 pz40Var4 = pz40Var;
            int i9 = (i5 & 458752) ^ 196608;
            boolean zG3 = fetVar.g(pz40Var4) | ((i9 > 131072 && fetVar.g(rah0Var2)) || (i5 & 196608) == 131072);
            Object objP5 = fetVar.P();
            if (zG3 || objP5 == obj) {
                b2 = 0;
                objP5 = new Function0() { // from class: a.oeo0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        boolean z6 = false;
                        rah0 rah0Var3 = rah0Var2;
                        pz40 pz40Var5 = pz40Var4;
                        switch (b3) {
                            case 0:
                                if (((Boolean) pz40Var5.getValue()).booleanValue() && rah0Var3.c()) {
                                    z6 = true;
                                }
                                return Boolean.valueOf(z6);
                            default:
                                if (((Boolean) pz40Var5.getValue()).booleanValue() && rah0Var3.d()) {
                                    z6 = true;
                                }
                                return Boolean.valueOf(z6);
                        }
                    }
                };
                fetVar.o0(objP5);
            } else {
                b2 = 0;
            }
            D(mm40VarS2, t89Var, (Function0) objP5, fetVar, 48);
            mm40 mm40VarS3 = o7k0.s(o7k0.c(ffb0.R(jr8Var.b(jm40Var, gqw0.c), 0.0f, 0.0f, 2), 1.0f), 36.0f);
            Object objP6 = fetVar.P();
            if (objP6 == obj) {
                pz40 pz40Var5 = s6t0.f31722a;
                objP6 = yk5.g(q3d.j(new y3d(s6t0.b().f33626a.getBackground0()), new y3d(s6t0.b().f33626a.getBackground())), 0.0f, 0.0f, 14);
                fetVar.o0(objP6);
            }
            t89 t89Var2 = (t89) objP6;
            boolean z6 = (fetVar.g(pz40Var4) ? 1 : 0) | (((i9 <= 131072 || !fetVar.g(rah0Var2)) && (i5 & 196608) != 131072) ? b2 : (byte) 1);
            Object objP7 = fetVar.P();
            if (z6 != 0 || objP7 == obj) {
                z = true;
                final char c2 = 1 == true ? 1 : 0;
                objP7 = new Function0() { // from class: a.oeo0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = c2;
                        boolean z7 = false;
                        rah0 rah0Var3 = rah0Var2;
                        pz40 pz40Var6 = pz40Var4;
                        switch (b3) {
                            case 0:
                                if (((Boolean) pz40Var6.getValue()).booleanValue() && rah0Var3.c()) {
                                    z7 = true;
                                }
                                return Boolean.valueOf(z7);
                            default:
                                if (((Boolean) pz40Var6.getValue()).booleanValue() && rah0Var3.d()) {
                                    z7 = true;
                                }
                                return Boolean.valueOf(z7);
                        }
                    }
                };
                fetVar.o0(objP7);
            } else {
                z = true;
            }
            D(mm40VarS3, t89Var2, (Function0) objP7, fetVar, 48);
            fetVar.r(z);
            fetVar.r(z);
        } else {
            rah0Var2 = rah0Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49((Object) mm40Var, (Object) list, (Object) a4xVar, (Object) xczVar, (Object) xczVar2, (Object) rah0Var2, (Object) function1, i2, (byte) 22);
        }
    }

    public static final void F(fus0 fus0Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1500252293);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(fus0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zfn zfnVar = bmd.n;
            k6z k6zVar = (k6z) fetVar.k(zfnVar);
            k6zVar.getClass();
            k6z k6zVar2 = k6z.f17794a;
            if (k6zVar == k6zVar2) {
                k6zVar2 = k6z.b;
            }
            mm40 mm40VarE0 = o2e.e0(o7k0.d(o7k0.e((mm40) fetVar.k(t0h.f33118a), fus0Var.g), 1.0f), "TWENTY_ONE_DOTA_BOX");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            n(fus0Var.f, fetVar, 0);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40.b);
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
            u4n0.i(fus0Var.c, fus0Var.d, fus0Var.e, fetVar, 0);
            j5n0.p(fus0Var.f10181a, fetVar, 0);
            obc.d(zfnVar.a(k6zVar2), u1c.M(-356908745, new p6r0(fus0Var, (byte) 24), fetVar), fetVar, 56);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eus0(fus0Var, i2, b2);
        }
    }

    public static final ArrayList G(HistoryTypeModel historyTypeModel, i0w i0wVar, List list) {
        i0wVar.getClass();
        list.getClass();
        int i2 = (i0wVar != i0w.b || tx3.l0(new HistoryTypeModel[]{HistoryTypeModel.TOTO, HistoryTypeModel.JACKPOT, HistoryTypeModel.AUTO}).contains(historyTypeModel)) ? 0 : 1;
        List listA0 = CollectionsKt.A0(list, new s7f((byte) 10));
        int size = listA0.size() + i2;
        ArrayList arrayList = new ArrayList();
        if (i2 != 0) {
            arrayList.add(HistoryMenuItem.f46392a);
        }
        if (size < 3) {
            arrayList.addAll(CollectionsKt.D0(listA0, i2 == 0 ? 2 : 1));
            return arrayList;
        }
        if (arrayList.contains(HistoryMenuItem.f46392a)) {
            arrayList.add(HistoryMenuItem.m);
            return arrayList;
        }
        HistoryMenuItem historyMenuItem = (HistoryMenuItem) CollectionsKt.firstOrNull(listA0);
        if (historyMenuItem != null) {
            arrayList.add(historyMenuItem);
        }
        arrayList.add(HistoryMenuItem.m);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int H(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        int i4;
        byte b3;
        boolean z = false;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i4 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b3 = bArr[9];
            } else if (b4 != 31) {
                i2 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[7];
            } else {
                i4 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b3 = bArr[8];
            }
            i3 = (((b3 & 60) >> 2) | i4) + 1;
            z = true;
            if (z) {
                return (i3 * 16) / 14;
            }
            return i3;
        }
        i2 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b2 = bArr[6];
        i3 = (((b2 & 240) >> 4) | i2) + 1;
        if (z) {
            return (i3 * 16) / 14;
        }
        return i3;
    }

    public static int I(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static final int J(jh3 jh3Var) {
        iy3 iy3Var = jh3Var.b;
        if (iy3Var instanceof ey3) {
            return R.string.background_image_1_17;
        }
        if (iy3Var instanceof gy3) {
            return R.string.background_image_1_2;
        }
        if ((iy3Var instanceof hy3) || (iy3Var instanceof fy3)) {
            return R.string.background_image_1_12;
        }
        t9f.b();
        return 0;
    }

    public static final int K(r21 r21Var) {
        int iOrdinal = r21Var.ordinal();
        if (iOrdinal == 0) {
            return R.string.other_title;
        }
        if (iOrdinal == 1) {
            return R.string.all;
        }
        if (iOrdinal == 2) {
            return R.string.by_real_money;
        }
        if (iOrdinal == 3) {
            return R.string.free_spins;
        }
        t9f.b();
        return 0;
    }

    public static final int L(v21 v21Var) {
        int iOrdinal = v21Var.ordinal();
        if (iOrdinal == 0) {
            return R.string.other;
        }
        if (iOrdinal == 1) {
            return R.string.all;
        }
        if (iOrdinal == 2) {
            return R.string.cases_slots;
        }
        if (iOrdinal == 3) {
            return R.string.live_casino_title;
        }
        t9f.b();
        return 0;
    }

    public static q8b M(byte[] bArr) {
        byte[] bArr2;
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new q8b(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = bArrCopyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        q8b q8bVar = new q8b(bArrCopyOf, bArrCopyOf.length);
        if (bArrCopyOf[0] == 31) {
            q8b q8bVar2 = new q8b(bArrCopyOf, bArrCopyOf.length);
            while (q8bVar2.b() >= 16) {
                q8bVar2.o(2);
                int iG = q8bVar2.g(14) & 16383;
                int iMin = Math.min(8 - q8bVar.d, 14);
                int i4 = q8bVar.d;
                int i5 = (8 - i4) - iMin;
                byte[] bArr3 = q8bVar.b;
                int i6 = q8bVar.c;
                byte b5 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr3[i6]);
                bArr3[i6] = b5;
                int i7 = 14 - iMin;
                bArr3[i6] = (byte) (b5 | ((iG >>> i7) << i5));
                int i8 = i6 + 1;
                while (true) {
                    bArr2 = q8bVar.b;
                    if (i7 > 8) {
                        bArr2[i8] = (byte) (iG >>> (i7 - 8));
                        i7 -= 8;
                        i8++;
                    }
                }
                int i9 = 8 - i7;
                byte b6 = (byte) (bArr2[i8] & ((1 << i9) - 1));
                bArr2[i8] = b6;
                bArr2[i8] = (byte) (((iG & ((1 << i7) - 1)) << i9) | b6);
                q8bVar.o(14);
                q8bVar.a();
            }
        }
        q8bVar.l(bArrCopyOf, bArrCopyOf.length);
        return q8bVar;
    }

    public static int N(int i2) {
        int i3 = (i2 & 1) != 0 ? 1 : 0;
        if ((i2 & 2) != 0) {
            i3 += 2;
        }
        if ((i2 & 4) != 0) {
            i3 += 2;
        }
        if ((i2 & 8) != 0) {
            i3++;
        }
        if ((i2 & 16) != 0) {
            i3++;
        }
        if ((i2 & 32) != 0) {
            i3 += 2;
        }
        if ((i2 & 64) != 0) {
            i3 += 2;
        }
        if ((i2 & 128) != 0) {
            i3++;
        }
        if ((i2 & 256) != 0) {
            i3++;
        }
        if ((i2 & 512) != 0) {
            i3 += 2;
        }
        if ((i2 & 1024) != 0) {
            i3 += 2;
        }
        if ((i2 & 2048) != 0) {
            i3 += 2;
        }
        if ((i2 & 4096) != 0) {
            i3++;
        }
        if ((i2 & 8192) != 0) {
            i3 += 2;
        }
        if ((i2 & 16384) != 0) {
            i3++;
        }
        return (i2 & 32768) != 0 ? i3 + 2 : i3;
    }

    public static final int O(List list, List list2, uz7 uz7Var) {
        list.getClass();
        list2.getClass();
        int size = list2.size() + list.size();
        int i2 = size + 1;
        if (uz7Var != uz7.UNKNOWN) {
            if ((size % 2 == 0 ? uz7.FIRST_PLAYER : uz7.SECOND_PLAYER) == uz7Var) {
                return i2;
            }
        }
        return Math.max(size, 1);
    }

    public static boolean P(String str) {
        return Objects.equals(str, "audio/vnd.dts") || Objects.equals(str, "audio/vnd.dts.hd");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x021d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0221 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0223  */
    /* JADX WARN: Code duplicated, block: B:108:0x0225  */
    /* JADX WARN: Code duplicated, block: B:110:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0247  */
    /* JADX WARN: Code duplicated, block: B:117:0x024f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0251  */
    /* JADX WARN: Code duplicated, block: B:120:0x0254  */
    /* JADX WARN: Code duplicated, block: B:122:0x0257  */
    /* JADX WARN: Code duplicated, block: B:123:0x025b  */
    /* JADX WARN: Code duplicated, block: B:125:0x026f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0273  */
    /* JADX WARN: Code duplicated, block: B:129:0x0284  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:52:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e A[LOOP:2: B:54:0x011c->B:55:0x011e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x013d A[LOOP:4: B:59:0x013b->B:60:0x013d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x015c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0172  */
    /* JADX WARN: Code duplicated, block: B:69:0x017b  */
    /* JADX WARN: Code duplicated, block: B:78:0x019e  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:89:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ee A[LOOP:8: B:98:0x01ec->B:99:0x01ee, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:108:0x0225, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x025b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    public static ibn Q(byte[] bArr) throws kq80 {
        int i2;
        int i3;
        int i4;
        boolean zF;
        int iG;
        int iG2;
        int[] iArr;
        int i5;
        String str;
        int iG3;
        long jT;
        int i6;
        int i7;
        int i8;
        int i9;
        ?? r19;
        ?? r12;
        boolean zF2;
        int iG4;
        String str2;
        boolean zF3;
        int length;
        int i10;
        int i11;
        int[] iArr2;
        int i12;
        int length2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ?? F;
        ?? F2;
        int iG5;
        int iG6;
        int[] iArr3;
        int i20;
        int i21;
        int iN;
        int iG7;
        int i22;
        q8b q8bVarM = M(bArr);
        q8bVarM.o(40);
        int iG8 = q8bVarM.g(2);
        if (q8bVarM.f()) {
            i2 = 20;
            i3 = 12;
        } else {
            i2 = 16;
            i3 = 8;
        }
        q8bVarM.o(i3);
        int i23 = 1;
        int iG9 = q8bVarM.g(i2) + 1;
        boolean zF4 = q8bVarM.f();
        if (zF4) {
            iG2 = q8bVarM.g(2);
            iG = (q8bVarM.g(3) + 1) * 512;
            if (q8bVarM.f()) {
                q8bVarM.o(36);
            }
            int iG10 = q8bVarM.g(3) + 1;
            int iG11 = q8bVarM.g(3) + 1;
            if (iG10 != 1 || iG11 != 1) {
                throw kq80.e("Multiple audio presentations or assets not supported");
            }
            int i24 = iG8 + 1;
            int iG12 = q8bVarM.g(i24);
            for (int i25 = 0; i25 < i24; i25++) {
                if (((iG12 >> i25) & 1) == 1) {
                    q8bVarM.o(8);
                }
            }
            i4 = 0;
            zF = q8bVarM.f();
            if (zF) {
                q8bVarM.o(2);
                int iG13 = (q8bVarM.g(2) + 1) << 2;
                int iG14 = q8bVarM.g(2) + 1;
                iArr = new int[iG14];
                for (int i26 = 0; i26 < iG14; i26++) {
                    iArr[i26] = N(q8bVarM.g(iG13));
                }
            }
            q8bVarM.o(i2);
            q8bVarM.o(12);
            if (zF4) {
                if (q8bVarM.f()) {
                    q8bVarM.o(4);
                }
                if (q8bVarM.f()) {
                    q8bVarM.o(24);
                }
                if (q8bVarM.f()) {
                    q8bVarM.p(q8bVarM.g(10) + 1);
                }
                i7 = 5;
                q8bVarM.o(5);
                i5 = n[q8bVarM.g(4)];
                iG3 = q8bVarM.g(8) + 1;
                i8 = 6;
                if (q8bVarM.f()) {
                    if (iG3 > 2) {
                        F = q8bVarM.f();
                    } else {
                        F = i4;
                    }
                    if (iG3 > 6) {
                        F2 = q8bVarM.f();
                    } else {
                        F2 = i4;
                    }
                    if (q8bVarM.f()) {
                        iG5 = (q8bVarM.g(2) + 1) << 2;
                        q8bVarM.o(iG5);
                    } else {
                        iG5 = i4;
                    }
                    iG6 = q8bVarM.g(3);
                    iArr3 = new int[iG6];
                    for (i20 = i4; i20 < iG6; i20++) {
                        iArr3[i20] = q8bVarM.g(iG5);
                    }
                    i21 = i4;
                    while (i21 < iG6) {
                        iN = N(iArr3[i21]);
                        int i27 = i7;
                        iG7 = q8bVarM.g(i7) + 1;
                        i22 = i4;
                        while (i22 < iN) {
                            q8bVarM.o(Integer.bitCount(q8bVarM.g(iG7)) * 5);
                            i22++;
                            iArr3 = iArr3;
                        }
                        i21++;
                        i7 = i27;
                    }
                    i9 = i7;
                    r12 = F;
                    r19 = F2;
                } else {
                    i9 = 5;
                    i23 = 1;
                    q8bVarM.o(3);
                    int i28 = i4;
                    r19 = i28 == true ? 1 : 0;
                    r12 = i28;
                }
                zF2 = q8bVarM.f();
                if (zF2) {
                    q8bVarM.o(8);
                }
                if (q8bVarM.f()) {
                    q8bVarM.o(i9);
                }
                if (zF2 && r12 != 0) {
                    q8bVarM.o(8);
                }
                if (zF && q8bVarM.f()) {
                    iArr.getClass();
                    q8bVarM.o(7);
                    if (q8bVarM.g(2) < 3) {
                        q8bVarM.o(3);
                    } else {
                        q8bVarM.o(8);
                    }
                    zF3 = q8bVarM.f();
                    length = iArr.length;
                    i10 = i4;
                    while (i10 < length) {
                        i18 = iArr[i10];
                        if (zF3) {
                            q8bVarM.o(i18 * 6);
                            i19 = i8;
                        } else {
                            i19 = i8;
                            q8bVarM.o(i19);
                        }
                        i10++;
                        i8 = i19;
                    }
                    i11 = i8;
                    iArr2 = new int[3];
                    iArr2[i4] = iG3;
                    if (r19 != 0) {
                        iArr2[i23] = i11;
                        i12 = 2;
                    } else {
                        i12 = i23;
                    }
                    if (r12 != 0) {
                        iArr2[i12] = 2;
                        i12++;
                    }
                    length2 = iArr.length;
                    for (i13 = i4; i13 < length2; i13++) {
                        i14 = iArr[i13];
                        for (i15 = i4; i15 < i12; i15++) {
                            i16 = iArr2[i15];
                            i17 = i4;
                            while (i17 < i16) {
                                q8bVarM.o(Integer.bitCount(q8bVarM.g(i14)) * 6);
                                i17++;
                                iArr2 = iArr2;
                            }
                        }
                    }
                }
                iG4 = q8bVarM.g(2);
                str2 = "audio/vnd.dts.hd";
                if (iG4 != 0) {
                    if (iG4 != i23) {
                        if (iG4 != 2) {
                            throw kq80.a("Unsupported coding mode in DTS HD header: " + iG4, null);
                        }
                        str2 = "audio/vnd.dts.hd;profile=lbr";
                    }
                } else if ((q8bVarM.g(12) & 256) != 0) {
                    str2 = "audio/vnd.dts.hd;profile=lbr";
                }
                str = str2;
            } else {
                i5 = -2147483647;
                str = null;
                iG3 = -1;
            }
            int i29 = i5;
            if (zF4) {
                if (iG2 != 0) {
                    i6 = 32000;
                } else if (iG2 != 1) {
                    i6 = 44100;
                } else {
                    if (iG2 == 2) {
                        throw kq80.a("Unsupported reference clock code in DTS HD header: " + iG2, null);
                    }
                    i6 = 48000;
                }
                long j2 = i6;
                String str3 = vtt0.f38024a;
                jT = vtt0.T(iG, 1000000L, j2, RoundingMode.DOWN);
            } else {
                jT = -9223372036854775807L;
            }
            return new ibn(iG3, i29, iG9, jT, str);
        }
        i4 = 0;
        zF = false;
        iG = 0;
        iG2 = -1;
        iArr = null;
        q8bVarM.o(i2);
        q8bVarM.o(12);
        if (zF4) {
            if (q8bVarM.f()) {
                q8bVarM.o(4);
            }
            if (q8bVarM.f()) {
                q8bVarM.o(24);
            }
            if (q8bVarM.f()) {
                q8bVarM.p(q8bVarM.g(10) + 1);
            }
            i7 = 5;
            q8bVarM.o(5);
            i5 = n[q8bVarM.g(4)];
            iG3 = q8bVarM.g(8) + 1;
            i8 = 6;
            if (q8bVarM.f()) {
                if (iG3 > 2) {
                    F = q8bVarM.f();
                } else {
                    F = i4;
                }
                if (iG3 > 6) {
                    F2 = q8bVarM.f();
                } else {
                    F2 = i4;
                }
                if (q8bVarM.f()) {
                    iG5 = (q8bVarM.g(2) + 1) << 2;
                    q8bVarM.o(iG5);
                } else {
                    iG5 = i4;
                }
                iG6 = q8bVarM.g(3);
                iArr3 = new int[iG6];
                while (i20 < iG6) {
                    iArr3[i20] = q8bVarM.g(iG5);
                }
                i21 = i4;
                while (i21 < iG6) {
                    iN = N(iArr3[i21]);
                    int i210 = i7;
                    iG7 = q8bVarM.g(i7) + 1;
                    i22 = i4;
                    while (i22 < iN) {
                        q8bVarM.o(Integer.bitCount(q8bVarM.g(iG7)) * 5);
                        i22++;
                        iArr3 = iArr3;
                    }
                    i21++;
                    i7 = i210;
                }
                i9 = i7;
                r12 = F;
                r19 = F2;
            } else {
                i9 = 5;
                i23 = 1;
                q8bVarM.o(3);
                int i211 = i4;
                r19 = i211 == true ? 1 : 0;
                r12 = i211;
            }
            zF2 = q8bVarM.f();
            if (zF2) {
                q8bVarM.o(8);
            }
            if (q8bVarM.f()) {
                q8bVarM.o(i9);
            }
            if (zF2) {
                q8bVarM.o(8);
            }
            if (zF) {
                iArr.getClass();
                q8bVarM.o(7);
                if (q8bVarM.g(2) < 3) {
                    q8bVarM.o(3);
                } else {
                    q8bVarM.o(8);
                }
                zF3 = q8bVarM.f();
                length = iArr.length;
                i10 = i4;
                while (i10 < length) {
                    i18 = iArr[i10];
                    if (zF3) {
                        q8bVarM.o(i18 * 6);
                        i19 = i8;
                    } else {
                        i19 = i8;
                        q8bVarM.o(i19);
                    }
                    i10++;
                    i8 = i19;
                }
                i11 = i8;
                iArr2 = new int[3];
                iArr2[i4] = iG3;
                if (r19 != 0) {
                    iArr2[i23] = i11;
                    i12 = 2;
                } else {
                    i12 = i23;
                }
                if (r12 != 0) {
                    iArr2[i12] = 2;
                    i12++;
                }
                length2 = iArr.length;
                while (i13 < length2) {
                    i14 = iArr[i13];
                    while (i15 < i12) {
                        i16 = iArr2[i15];
                        i17 = i4;
                        while (i17 < i16) {
                            q8bVarM.o(Integer.bitCount(q8bVarM.g(i14)) * 6);
                            i17++;
                            iArr2 = iArr2;
                        }
                    }
                }
            }
            iG4 = q8bVarM.g(2);
            str2 = "audio/vnd.dts.hd";
            if (iG4 != 0) {
                if (iG4 != i23) {
                    if (iG4 != 2) {
                        throw kq80.a("Unsupported coding mode in DTS HD header: " + iG4, null);
                    }
                    str2 = "audio/vnd.dts.hd;profile=lbr";
                }
            } else if ((q8bVarM.g(12) & 256) != 0) {
                str2 = "audio/vnd.dts.hd;profile=lbr";
            }
            str = str2;
        } else {
            i5 = -2147483647;
            str = null;
            iG3 = -1;
        }
        int i212 = i5;
        if (zF4) {
            if (iG2 != 0) {
                i6 = 32000;
            } else if (iG2 != 1) {
                i6 = 44100;
            } else {
                if (iG2 == 2) {
                    throw kq80.a("Unsupported reference clock code in DTS HD header: " + iG2, null);
                }
                i6 = 48000;
            }
            long j3 = i6;
            String str4 = vtt0.f38024a;
            jT = vtt0.T(iG, 1000000L, j3, RoundingMode.DOWN);
        } else {
            jT = -9223372036854775807L;
        }
        return new ibn(iG3, i212, iG9, jT, str);
    }

    public static void R(int i2, int i3, int[] iArr) {
        int i4 = ((i2 << 8) + i3) - 1;
        int i5 = i4 / 1600;
        iArr[0] = i5;
        int i6 = i4 - (i5 * 1600);
        int i7 = i6 / 40;
        iArr[1] = i7;
        iArr[2] = i6 - (i7 * 40);
    }

    public static int S(q8b q8bVar, int[] iArr) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && q8bVar.f(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return q8bVar.g(iArr[i2]) + i4;
    }

    public static final n08 T(int i2, List list, List list2) {
        list.getClass();
        list2.getClass();
        int i3 = i2 - 1;
        int i4 = i3 / 2;
        return r08.f29618a[(i3 % 2 == 0 ? uz7.FIRST_PLAYER : uz7.SECOND_PLAYER).ordinal()] == 1 ? (n08) CollectionsKt.W(i4, list) : (n08) CollectionsKt.W(i4, list2);
    }

    public static final iq4 U(hq4 hq4Var) {
        hq4Var.getClass();
        va80 va80Var = hq4Var.g;
        String strU = cww.u(va80Var);
        String str = hq4Var.f13468a;
        Date date = hq4Var.i;
        String str2 = hq4Var.d;
        String str3 = hq4Var.f;
        return new iq4(str, hq4Var.b, hq4Var.c, str2, hq4Var.e, str3, va80Var, hq4Var.h, date, hq4Var.j, ua80.i(strU, " (", str3, Separators.RPAREN));
    }

    public static final lr5 V(kr5 kr5Var) {
        kr5Var.getClass();
        int i2 = kr5Var.b;
        String str = kr5Var.g;
        String str2 = kr5Var.h;
        if (str2.length() == 0) {
            str2 = str;
        }
        String str3 = kr5Var.j;
        if (str3.length() == 0) {
            str3 = str;
        }
        String str4 = kr5Var.k;
        if (str4.length() == 0) {
            str4 = kr5Var.f;
        }
        return new lr5(i2, str2, str3, str4, kr5Var.o, kr5Var.q, kr5Var.z, kr5Var.v, kr5Var.w, kr5Var.l, kr5Var.n, new nr5(kr5Var), kr5Var.d, kr5Var.A);
    }

    public static final lr5 W(uvc uvcVar) {
        uvcVar.getClass();
        int i2 = uvcVar.f36341a;
        String str = uvcVar.c;
        String str2 = uvcVar.g;
        if (str2.length() == 0) {
            str2 = str;
        }
        String str3 = uvcVar.e;
        if (str3.length() == 0) {
            str3 = str;
        }
        String str4 = uvcVar.f;
        if (str4.length() == 0) {
            str4 = uvcVar.b;
        }
        String str5 = str4;
        String str6 = uvcVar.i;
        String str7 = uvcVar.j;
        String str8 = uvcVar.k;
        String str9 = uvcVar.l;
        bj5 bj5Var = oo5.b;
        return new lr5(i2, str2, str3, str5, str6, str7, str8, str9, new mr5(uvcVar), 768);
    }

    public static final qim X(g72 g72Var, ctf0 ctf0Var) {
        String strA;
        gmm dmmVar;
        gmm dmmVar2;
        gmm gmmVar;
        dxh0 dxh0Var;
        pz40 pz40Var = s6t0.f31722a;
        ctf0Var.getClass();
        Date date = g72Var.b;
        h8l0 h8l0Var = g72Var.i;
        if (date == null || ntb.W(date)) {
            strA = ctf0Var.b.a(R.string.results_for_last_24_hours, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = ctf0Var.b.a(R.string.results_for_period_v2, Arrays.copyOf(new Object[]{rdj.c(rdj.f30294a, sdj.UNIVERSAL, date, null, 60)}, 1));
        }
        String str = strA;
        lsm0 lsm0Var = ctf0Var.b;
        String strA2 = lsm0Var.a(R.string.search, Arrays.copyOf(new Object[0], 0));
        boolean z = date == null || ntb.W(date);
        int i2 = z ? R.drawable.ic_glyph_calendar_inactive : R.drawable.ic_glyph_calendar_active;
        boolean z2 = g72Var.j;
        if (x62.f40340a[h8l0Var.ordinal()] == 4) {
            skm skmVar = new skm(2, R.drawable.ic_glyph_search, true, (y3d) null, 48);
            skm skmVar2 = new skm(1, i2, true, (y3d) null, 48);
            if (z2) {
                dmmVar2 = new emm(new la50(skmVar2));
                gmmVar = dmmVar2;
            } else {
                dmmVar = new emm(new na50(skmVar, skmVar2));
                gmmVar = dmmVar;
            }
        } else {
            long secondary = z ? s6t0.b().f33626a.getSecondary() : s6t0.b().f33626a.getPrimary();
            long secondary2 = s6t0.b().f33626a.getSecondary();
            ra50 ra50Var = ra50.f30118a;
            wkm wkmVar = new wkm(2, R.drawable.ic_glyph_search, true, ra50Var, secondary2);
            wkm wkmVar2 = new wkm(1, i2, true, ra50Var, secondary);
            if (z2) {
                dmmVar2 = new dmm(new ta50(wkmVar2));
                gmmVar = dmmVar2;
            } else {
                dmmVar = new dmm(new va50(wkmVar, wkmVar2));
                gmmVar = dmmVar;
            }
        }
        int iOrdinal = h8l0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return new mim(0, gmmVar, (a4x) lak0.c, strA2, g72Var.f10792a, lsm0Var.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), str, g72Var.j, true);
            }
            if (iOrdinal == 2) {
                return new lim(0, gmmVar, lak0.c, lsm0Var.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), strA2, g72Var.f10792a, str, g72Var.j, true);
            }
            if (iOrdinal != 3) {
                t9f.b();
                return null;
            }
            return new nim(0, gmmVar, lak0.c, lsm0Var.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), strA2, g72Var.f10792a, str, g72Var.j, true);
        }
        String strA3 = lsm0Var.a(R.string.champs, Arrays.copyOf(new Object[0], 0));
        gmm gmmVar2 = gmmVar;
        boolean z3 = g72Var.j;
        String str2 = g72Var.f10792a;
        lak0 lak0Var = lak0.c;
        int iOrdinal2 = g72Var.f.ordinal();
        if (iOrdinal2 == 0) {
            dxh0Var = axh0.f1625a;
        } else if (iOrdinal2 == 1) {
            dxh0Var = zwh0.f45106a;
        } else if (iOrdinal2 == 2) {
            dxh0Var = cxh0.f5122a;
        } else {
            if (iOrdinal2 != 3) {
                t9f.b();
                return null;
            }
            dxh0Var = bxh0.f3376a;
        }
        return new oim(strA3, z3, strA2, str2, true, gmmVar2, 0, lak0Var, dxh0Var, str);
    }

    public static int Y(int i2, int i3) {
        int i4 = i2 - (((i3 * 149) % 255) + 1);
        return i4 >= 0 ? i4 : i4 + 256;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    public static androidx.media3.common.b Z(guo guoVar, int i2, androidx.media3.common.b bVar) {
        q8b q8bVarM;
        int i3;
        int iG;
        String str;
        fq80 fq80Var = new fq80(i2);
        if (guoVar.b(fq80Var.f9961a, 0, i2, true)) {
            guoVar.g();
            int i4 = fq80Var.i();
            if (I(i4) != 1) {
                if (I(i4) == 2 && fq80Var.a() >= 7) {
                    int i5 = fq80Var.b;
                    byte[] bArr = new byte[7];
                    fq80Var.k(bArr, 0, 7);
                    fq80Var.M(i5);
                    q8bVarM = M(bArr);
                    q8bVarM.o(42);
                    if (q8bVarM.f()) {
                        i3 = 12;
                    } else {
                        i3 = 8;
                    }
                    iG = q8bVarM.g(i3) + 1;
                    if (iG > 0 && fq80Var.a() >= iG) {
                        byte[] bArr2 = new byte[iG];
                        fq80Var.k(bArr2, 0, iG);
                        str = Q(bArr2).f14496a;
                        if (str == null) {
                            str = "audio/vnd.dts.hd";
                        }
                        if (Objects.equals(bVar.p, str)) {
                            return bVar;
                        }
                        awq awqVarA = bVar.a();
                        awqVarA.o = mg40.n(str);
                        return new androidx.media3.common.b(awqVarA);
                    }
                }
            } else if (fq80Var.a() >= 10) {
                byte[] bArr3 = new byte[10];
                fq80Var.k(bArr3, 0, 10);
                int iH = H(bArr3);
                if (iH > 0 && fq80Var.c >= iH + 4) {
                    fq80Var.M(iH);
                    i4 = fq80Var.i();
                    if (I(i4) == 2) {
                        int i6 = fq80Var.b;
                        byte[] bArr4 = new byte[7];
                        fq80Var.k(bArr4, 0, 7);
                        fq80Var.M(i6);
                        q8bVarM = M(bArr4);
                        q8bVarM.o(42);
                        if (q8bVarM.f()) {
                            i3 = 12;
                        } else {
                            i3 = 8;
                        }
                        iG = q8bVarM.g(i3) + 1;
                        if (iG > 0) {
                            byte[] bArr5 = new byte[iG];
                            fq80Var.k(bArr5, 0, iG);
                            str = Q(bArr5).f14496a;
                            if (str == null) {
                                str = "audio/vnd.dts.hd";
                            }
                            if (Objects.equals(bVar.p, str)) {
                                return bVar;
                            }
                            awq awqVarA2 = bVar.a();
                            awqVarA2.o = mg40.n(str);
                            return new androidx.media3.common.b(awqVarA2);
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public static final void a(mm40 mm40Var, am2 am2Var, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        ugd ugdVar2;
        mm40 mm40Var2;
        am2Var.getClass();
        function1.getClass();
        fetVar.g0(-1084598900);
        int i3 = i2 | 6 | (fetVar.g(am2Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
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
            fyl fylVar = am2Var.f1090a;
            fetVar.e0(2133104063);
            fyl fylVarA = fyl.a(fylVar, s5x0.t(xfn.a(fetVar).d, 0.0f, 2));
            fetVar.r(false);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 4.0f, 1);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new wc2(function1, (byte) 3);
                fetVar.o0(objP);
            }
            ebc.r(mm40VarL, fylVarA, null, (Function1) objP, null, fetVar, 0, 44);
            ugdVar2 = ugdVar;
            ugdVar2.j(y5d.f42040a, am2Var.b, fetVar, 390);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 14, i2, mm40Var2, am2Var, function1, ugdVar2);
        }
    }

    public static Provider a0() {
        for (int i2 = 0; i2 < 3; i2++) {
            Provider provider = Security.getProvider(t[i2]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }

    public static final void b(int i2, ugd ugdVar, xdr xdrVar, xdr xdrVar2, fet fetVar) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1049910168);
        int i4 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 = (fetVar2.g(jm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.i(ugdVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(xdrVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(xdrVar2) ? 2048 : 1024;
        }
        int i5 = i3;
        if (fetVar2.U(i5 & 1, (i5 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 10.0f, 0.0f, 0.0f, 13);
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
            Object objValueOf = Integer.valueOf((i5 & 112) | 6);
            Object obj = y5d.f42040a;
            ugdVar.F(obj, fetVar2, objValueOf);
            wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
            if (xdrVar == null) {
                fetVar2.e0(-1760881609);
            } else {
                fetVar2.e0(-1580823286);
                xdrVar.F(obj, fetVar2, Integer.valueOf(6 | ((i5 >> 3) & 112)));
            }
            fetVar2.r(false);
            if (xdrVar2 != null) {
                fetVar2.e0(-1760819639);
                if (xdrVar == null) {
                    fetVar2.e0(-1760700537);
                    mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), true, fetVar, 438, 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-1760505020);
                    fetVar2.r(false);
                }
                wvb.o(null, 2.0f, 0L, fetVar2, 0, 5);
                xdrVar2.F(obj, fetVar2, Integer.valueOf(6 | ((i5 >> 6) & 112)));
                fetVar2.r(false);
            } else if (xdrVar != null) {
                fetVar2.e0(-1760356902);
                wvb.o(null, 14.0f, 0L, fetVar2, 0, 5);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1760285788);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5(ugdVar, xdrVar, xdrVar2, i2);
        }
    }

    public static bew0 b0() {
        ClassLoader classLoader = hew0.class.getClassLoader();
        if (bew0.class.equals(bew0.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new hew0[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e3) {
                    Logger.getLogger(aew0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(bew0.class.getSimpleName()), (Throwable) e3);
                }
            }
            if (arrayList.size() == 1) {
                return (bew0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (bew0) bew0.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e4) {
                itt0.o(e4);
                return null;
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static final void c(mm40 mm40Var, dln dlnVar, Function0 function0, fet fetVar, int i2) {
        fet fetVar2;
        dlnVar.getClass();
        function0.getClass();
        fetVar.g0(154934);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(dlnVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            x7z x7zVar = new x7z(1.0f, true);
            zcl zclVar = qmk.f28987a;
            v8q0.a(dlnVar.f6291a, s5x0.N(x7zVar, 0.0f, 0.0f, 12.0f, 0.0f, 11), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar), fetVar, 0, 24576, 114684);
            fetVar2 = fetVar;
            B(o7k0.A(jm40.b, null, 3), dlnVar.b, function0, fetVar2, (i3 & 896) | 6);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var, dlnVar, function0, i2, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0218  */
    /* JADX WARN: Code duplicated, block: B:59:0x0233  */
    /* JADX WARN: Code duplicated, block: B:60:0x0235  */
    /* JADX WARN: Code duplicated, block: B:64:0x023e  */
    /* JADX WARN: Code duplicated, block: B:66:0x025b  */
    public static final void d(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        mm40 mm40Var2;
        int i3;
        float f2;
        boolean z;
        boolean z2;
        jm40 jm40Var;
        cl5 cl5Var;
        fet fetVar2;
        boolean z3;
        Object objP;
        fet fetVar3 = fetVar;
        l7m0Var.getClass();
        fetVar3.g0(-1205473149);
        int i4 = i2 | 6 | (fetVar3.g(l7m0Var) ? 32 : 16) | (fetVar3.i(function1) ? 256 : 128);
        if (fetVar3.U(i4 & 1, (i4 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            mm40 mm40VarS = o050.S(o050.W(n0qVar));
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarS, s6t0.b().f33626a.getBackground(), jd8.n);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarQ);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z4 = fetVar3.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            rv8 rv8Var = ((ow8) l7m0Var.getValue()).b;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, shdVar);
            jpm0.o(fetVar3, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar4);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            imm immVar = ((ow8) l7m0Var.getValue()).f25957a;
            int i5 = i4 & 896;
            boolean z5 = i5 == 256;
            Object objP2 = fetVar3.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z5 || objP2 == cl5Var2) {
                objP2 = new tk8(function1, (byte) 19);
                fetVar3.o0(objP2);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar3, 6, 0, 4084);
            boolean z6 = rv8Var instanceof qv8;
            jr8 jr8Var = jr8.f16991a;
            if (z6) {
                f2 = 1.0f;
                z = true;
                function2 = function1;
                i3 = i5;
                m(i3, fetVar3, ((qv8) rv8Var).f29376a, rz4.f(fetVar3, -1427804363, 1.0f, true), function2);
                z2 = false;
                fetVar3.r(false);
            } else {
                function2 = function1;
                i3 = i5;
                f2 = 1.0f;
                z = true;
                z2 = false;
                if (rv8Var instanceof ov8) {
                    m(i3, fetVar3, ((ov8) rv8Var).f25913a, rz4.f(fetVar3, -1427474027, 1.0f, true), function2);
                    fetVar3.r(false);
                } else {
                    if (!(rv8Var instanceof pv8)) {
                        throw b1j.f(-1847175175, fetVar3, false);
                    }
                    fetVar3.e0(-1427135259);
                    mm40 mm40VarE = tfx.E(new x7z(1.0f, true));
                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                    int iHashCode3 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM3 = fetVar3.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarE);
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC2, shdVar);
                    jpm0.o(fetVar3, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar3, shdVar3, fetVar3);
                    jpm0.o(fetVar3, mm40VarC2, shdVar4);
                    jm40Var = jm40Var2;
                    mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                    mdm mdmVar = ((pv8) rv8Var).f27651a;
                    boolean z7 = i3 == 256;
                    Object objP3 = fetVar3.P();
                    if (z7 || objP3 == cl5Var2) {
                        objP3 = new tk8(function2, (byte) 20);
                        fetVar3.o0(objP3);
                    }
                    cl5Var = cl5Var2;
                    fetVar2 = fetVar3;
                    jcb.l(mm40VarB, mdmVar, false, (Function0) objP3, fetVar2, 0, 4);
                    fetVar2.r(true);
                    fetVar2.r(false);
                }
                fetVar2.r(z);
                if (rv8Var instanceof ov8) {
                    fetVar2.e0(920219144);
                    mm40 mm40VarB2 = jr8Var.b(o7k0.d(jm40Var, f2), gqw0.h);
                    mtl mtlVar = ((ov8) rv8Var).b;
                    ma80 ma80Var = ma80.b;
                    if (i3 == 256) {
                        z3 = z;
                    } else {
                        z3 = z2;
                    }
                    objP = fetVar2.P();
                    if (z3 || objP == cl5Var) {
                        objP = new uo6(function2, (byte) 25);
                        fetVar2.o0(objP);
                    }
                    bkb.f(mm40VarB2, mtlVar, ma80Var, false, null, (Function1) objP, fetVar, 3456, 16);
                    fetVar3 = fetVar;
                    fetVar3.r(z2);
                } else {
                    fetVar3 = fetVar2;
                    fetVar3.e0(921004281);
                    fetVar3.r(z2);
                }
                fetVar3.r(z);
                mm40Var2 = jm40Var;
            }
            fetVar2 = fetVar3;
            cl5Var = cl5Var2;
            jm40Var = jm40Var2;
            fetVar2.r(z);
            if (rv8Var instanceof ov8) {
                fetVar2.e0(920219144);
                mm40 mm40VarB3 = jr8Var.b(o7k0.d(jm40Var, f2), gqw0.h);
                mtl mtlVar2 = ((ov8) rv8Var).b;
                ma80 ma80Var2 = ma80.b;
                if (i3 == 256) {
                    z3 = z;
                } else {
                    z3 = z2;
                }
                objP = fetVar2.P();
                if (z3) {
                    objP = new uo6(function2, (byte) 25);
                    fetVar2.o0(objP);
                } else {
                    objP = new uo6(function2, (byte) 25);
                    fetVar2.o0(objP);
                }
                bkb.f(mm40VarB3, mtlVar2, ma80Var2, false, null, (Function1) objP, fetVar, 3456, 16);
                fetVar3 = fetVar;
                fetVar3.r(z2);
            } else {
                fetVar3 = fetVar2;
                fetVar3.e0(921004281);
                fetVar3.r(z2);
            }
            fetVar3.r(z);
            mm40Var2 = jm40Var;
        } else {
            function2 = function1;
            fetVar3.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var2, l7m0Var, function2, i2, (byte) 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0074  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public static final void e(mm40 mm40Var, yjj0 yjj0Var, lca lcaVar, jfa jfaVar, ugd ugdVar, fet fetVar, int i2, int i3) {
        jfa jfaVarQ;
        int i4;
        byte b2;
        boolean z;
        ugd ugdVar2;
        jfa jfaVar2;
        yfe0 yfe0VarU;
        float f2;
        Object objP;
        fetVar.g0(1359693790);
        int i5 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(yjj0Var) ? 32 : 16) | (fetVar.g(lcaVar) ? 256 : 128);
        if ((i3 & 8) == 0) {
            jfaVarQ = jfaVar;
            int i6 = fetVar.g(jfaVarQ) ? 2048 : 1024;
            i4 = i5 | i6 | 24576;
            b2 = 0;
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                fetVar.Z();
                if ((i2 & 1) == 0 && !fetVar.B()) {
                    fetVar.X();
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                } else if ((i3 & 8) != 0) {
                    jfaVarQ = jar0.Q(63);
                    i4 &= -7169;
                }
                fetVar.s();
                long j2 = lcaVar.f19790a;
                long j3 = lcaVar.b;
                f2 = jfaVarQ.f16414a;
                fetVar.e0(-1763481333);
                fetVar.e0(167751211);
                objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = androidx.compose.runtime.e.e(new ycl(f2));
                    fetVar.o0(objP);
                }
                fetVar.r(false);
                fetVar.r(false);
                float f3 = ((ycl) ((pz40) objP).getValue()).f42389a;
                ugdVar2 = ugdVar;
                gmn0.a(mm40Var, yjj0Var, j2, j3, 0.0f, f3, null, u1c.M(-97109725, new hja(ugdVar2, b2), fetVar), fetVar, (i4 & 112) | (i4 & 14) | 12582912 | 1572864, 16);
            } else {
                ugdVar2 = ugdVar;
                fetVar.X();
            }
            jfaVar2 = jfaVarQ;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new gja((byte) 0, i2, i3, ugdVar2, mm40Var, yjj0Var, lcaVar, jfaVar2);
            }
        }
        jfaVarQ = jfaVar;
        i4 = i5 | i6 | 24576;
        b2 = 0;
        if ((74899 & i4) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            fetVar.Z();
            if ((i2 & 1) == 0) {
                if ((i3 & 8) != 0) {
                    jfaVarQ = jar0.Q(63);
                    i4 &= -7169;
                }
            } else if ((i3 & 8) != 0) {
                jfaVarQ = jar0.Q(63);
                i4 &= -7169;
            }
            fetVar.s();
            long j4 = lcaVar.f19790a;
            long j5 = lcaVar.b;
            f2 = jfaVarQ.f16414a;
            fetVar.e0(-1763481333);
            fetVar.e0(167751211);
            objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.e(new ycl(f2));
                fetVar.o0(objP);
            }
            fetVar.r(false);
            fetVar.r(false);
            float f4 = ((ycl) ((pz40) objP).getValue()).f42389a;
            ugdVar2 = ugdVar;
            gmn0.a(mm40Var, yjj0Var, j4, j5, 0.0f, f4, null, u1c.M(-97109725, new hja(ugdVar2, b2), fetVar), fetVar, (i4 & 112) | (i4 & 14) | 12582912 | 1572864, 16);
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
        }
        jfaVar2 = jfaVarQ;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gja((byte) 0, i2, i3, ugdVar2, mm40Var, yjj0Var, lcaVar, jfaVar2);
        }
    }

    public static final void f(int i2, int i3, long j2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(119410453);
        int i4 = i3 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.e(i2) ? 32 : 16) | (fetVar.f(j2) ? 256 : 128);
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarA = o7k0.A(o7k0.e(mm40Var, 18.0f), null, 3);
            zcl zclVar2 = qmk.c;
            mm40 mm40VarL = s5x0.L(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarA), j2, jd8.n), 4.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.a(String.valueOf(i2), null, ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109).d(new y9q0(0L, 0L, null, null, 0L, null, 0, 1, 0L, 16711679)), fetVar, 0, 0, 131066);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w1m(mm40Var, i2, j2, i3, (byte) 1);
        }
    }

    public static final void g(mm40 mm40Var, w6b w6bVar, xcz xczVar, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        xcz xczVar2;
        xczVar.getClass();
        function1.getClass();
        fetVar.g0(-1331948956);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(w6bVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            xczVar2 = xczVar;
            i3 |= fetVar.g(xczVar2) ? 256 : 128;
        } else {
            xczVar2 = xczVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            tke.o(s5x0.L(mm40Var, qmk.a(fetVar).c, 0.0f, 2), w6bVar, xczVar2, knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7), fetVar), ugdVar, u1c.M(702757821, new gn(function1, (byte) 11), fetVar), u1c.M(1997119846, new z1s(w6bVar, function1, b2), fetVar), cjx.e, u1c.M(451339750, new gn(function1, (byte) 12), fetVar), cjx.h, cjx.i, fetVar, (i3 & 896) | (i3 & 112) | 920322048 | (i3 & 57344));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g6b(mm40Var, w6bVar, xczVar, function1, ugdVar, i2, (byte) 3);
        }
    }

    public static final void h(mm40 mm40Var, frc0 frc0Var, w2d w2dVar, nuc0 nuc0Var, Function1 function1, Function1 function2, Function1 function3, fet fetVar, int i2) {
        fetVar.g0(-2105595745);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(frc0Var) ? 32 : 16) | (fetVar.i(w2dVar) ? 256 : 128) | (fetVar.g(nuc0Var) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536) | (fetVar.i(function3) ? 1048576 : 524288);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            mm40 mm40VarE0 = o2e.e0(cjx.V(mm40Var.e(o7k0.c), w2dVar, null), "PROMO_SHOP_DETAIL_LAZY_COLUMN");
            ch80 ch80VarG = knm0.g(s5x0.t(0.0f, 0.0f, 3), fetVar);
            boolean z = ((i3 & 112) == 32) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576) | ((i3 & 7168) == 2048) | ((i3 & 57344) == 16384);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                dg dgVar = new dg(frc0Var, function2, function3, nuc0Var, function1, (byte) 25);
                fetVar.o0(dgVar);
                objP = dgVar;
            }
            b8k0.e(mm40VarE0, null, ch80VarG, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn0((Object) mm40Var, (Object) frc0Var, (Object) w2dVar, (Object) nuc0Var, function1, (wdr) function2, (wdr) function3, i2, (byte) 13);
        }
    }

    public static final void i(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(-1616461501);
        int i3 = i2 | 6 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
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
            jr8 jr8Var = jr8.f16991a;
            zx7 zx7Var = gqw0.e;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new bac0(function1, (byte) 18);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 4);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ld0(mm40Var2, mdmVar, function1, i2, (byte) 5);
        }
    }

    public static final void j(mdm mdmVar, fet fetVar, int i2) {
        int i3;
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-2082201468);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
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
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(jr8.f16991a.b(jm40.b, gqw0.e), mdmVar2, false, null, fetVar2, (i3 << 3) & 112, 12);
            fetVar2.r(true);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new duv(mdmVar2, i2, b2);
        }
    }

    public static final void k(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1893240534);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
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
            mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new i8v(function1, (byte) 7);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i2, (byte) 9);
        }
    }

    public static final void l(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i2) {
        fetVar.g0(-2055300549);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(fqj0Var) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new buv(mm40Var, fqj0Var, i2, b2);
        }
    }

    public static final void m(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        int i3;
        a4x a4xVar2;
        fetVar.g0(-1831594880);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(qmk.a(fetVar).c, 12.0f, qmk.a(fetVar).c, 88.0f);
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                a4xVar2 = a4xVar;
                objP = new or0(a4xVar2, function1, b2);
                fetVar.o0(objP);
            } else {
                a4xVar2 = a4xVar;
            }
            b8k0.e(mm40Var, null, lh80Var, null, null, null, false, null, (Function1) objP, fetVar, i3 & 14, 506);
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(mm40Var, a4xVar2, function1, i2, (byte) 1);
        }
    }

    public static final void n(String str, fet fetVar, int i2) {
        String str2;
        fet fetVar2;
        fetVar.g0(-1232132668);
        int i3 = (fetVar.g(str) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            str2 = str;
            fetVar2 = fetVar;
            k7x.a(str2, null, lgb.J(n0qVar, new ugg0(zclVar, zclVar, zclVar, zclVar)), gqw0.A, null, fetVar2, (i3 & 14) | 1572912, 1976);
        } else {
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f5n0((byte) 11, i2, str2);
        }
    }

    public static final void o(a4x a4xVar, fet fetVar, int i2) {
        fet fetVar2;
        fetVar.g0(-971120497);
        int i3 = (fetVar.g(a4xVar) ? 32 : 16) | i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new umu((byte) 23);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            boolean z = (i3 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new oea(a4xVar, (byte) 13);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            dwi0.b(function1, jm40.b, (Function1) objP2, fetVar2, 54, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eup(a4xVar, i2, (byte) 15);
        }
    }

    public static final void p(nuv nuvVar, boolean z, Function1 function1, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-487764679);
        byte b2 = 2;
        int i3 = i2 | (fetVar2.g(nuvVar) ? 4 : 2) | (fetVar2.h(z) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        byte b3 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z2 = (i3 & 14) == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new bdv(nuvVar, (byte) 10);
                fetVar2.o0(objP);
            }
            kwj kwjVarB = zk80.b(0, (Function0) objP, fetVar2, 6, 2);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            zcl zclVar = qmk.f28987a;
            zcl zclVar2 = qmk.l;
            zcl zclVar3 = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(dw9.i(zclVar2, zclVar2, zclVar3, zclVar3, jm40Var), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarN = s5x0.N(jm40Var, qmk.a(fetVar2).f, 12.0f, qmk.a(fetVar2).f, 0.0f, 8);
            i4 i4Var = nuvVar.e;
            boolean zG = fetVar2.g(kwjVarB);
            Object objP3 = fetVar2.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new s39(kwjVarB, (byte) 8);
                fetVar2.o0(objP3);
            }
            Function0 function0 = (Function0) objP3;
            boolean zI = fetVar2.i(vneVar) | fetVar2.g(kwjVarB);
            Object objP4 = fetVar2.P();
            if (zI || objP4 == cl5Var) {
                objP4 = new euv(b3, vneVar, kwjVarB);
                fetVar2.o0(objP4);
            }
            ibc.o(mm40VarN, i4Var, gxh0.f12078a, z, function0, (Function1) objP4, fetVar2, ((i3 << 6) & 7168) | 384, 0);
            q5x.e(kwjVarB, null, null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(1517284642, new d2s(nuvVar, function1, b2), fetVar2), fetVar, 0, 24576, 16382);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) nuvVar, z, (Object) function1, i2, (byte) 5);
        }
    }

    public static final void q(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(898869146);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            f9m0 f9m0Var = new f9m0(R.string.statistic_heat_map, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0Var = ((ouv) l7m0Var.getValue()).b().f43239a;
            j9m0 j9m0Var = ((ouv) l7m0Var.getValue()).b().b;
            boolean zA = ((ouv) l7m0Var.getValue()).a();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new i8v(function1, (byte) 6);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, zA, (Function0) objP, null, null, u1c.M(23972684, new xs4(l7m0Var, function1, (byte) 27), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i2, (byte) 24);
        }
    }

    public static final void r(final ztv ztvVar, final mdm mdmVar, final Function1 function1, fet fetVar, final int i2) {
        fetVar.g0(-1012790336);
        int i3 = i2 | (fetVar.g(ztvVar) ? 4 : 2) | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            byte b2 = 14;
            if (ztvVar.f44982a.b.isEmpty() && ztvVar.c == 0) {
                fetVar.e0(108525157);
                j(mdmVar, fetVar, (i3 >> 3) & 14);
                fetVar.r(false);
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    final byte b3 = 0;
                    yfe0VarU.d = new Function2(ztvVar, mdmVar, function1, i2, b3) { // from class: a.cuv

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ byte f5003a;
                        public final /* synthetic */ ztv b;
                        public final /* synthetic */ mdm c;
                        public final /* synthetic */ Function1 d;

                        {
                            this.f5003a = b3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b4 = this.f5003a;
                            Function1 function2 = this.d;
                            mdm mdmVar2 = this.c;
                            ztv ztvVar2 = this.b;
                            fet fetVar2 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b4) {
                                case 0:
                                    hew0.r(ztvVar2, mdmVar2, function2, fetVar2, x8x.L(1));
                                    break;
                                default:
                                    hew0.r(ztvVar2, mdmVar2, function2, fetVar2, x8x.L(1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    return;
                }
                return;
            }
            fetVar.e0(108583778);
            fetVar.r(false);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b2));
            float f2 = qmk.a(fetVar).d;
            lh80 lh80Var = new lh80(f2, 12.0f, f2, 12.0f);
            boolean z = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new f3s(ztvVar, function1, (byte) 20);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, 6, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            final byte b4 = 1;
            yfe0VarU2.d = new Function2(ztvVar, mdmVar, function1, i2, b4) { // from class: a.cuv

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f5003a;
                public final /* synthetic */ ztv b;
                public final /* synthetic */ mdm c;
                public final /* synthetic */ Function1 d;

                {
                    this.f5003a = b4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b5 = this.f5003a;
                    Function1 function2 = this.d;
                    mdm mdmVar2 = this.c;
                    ztv ztvVar2 = this.b;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b5) {
                        case 0:
                            hew0.r(ztvVar2, mdmVar2, function2, fetVar2, x8x.L(1));
                            break;
                        default:
                            hew0.r(ztvVar2, mdmVar2, function2, fetVar2, x8x.L(1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void s(int i2, fet fetVar) {
        fetVar.g0(1913817512);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarH = k7n0.H(o7k0.c, 2.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarH, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new t010((byte) 29);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            kpb.j(null, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), 3), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kyz(i2, (byte) 23);
        }
    }

    public static final void t(int i2, fet fetVar) {
        fetVar.g0(1061503487);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ljcVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, qmk.a(fetVar).d, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 32.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0VarD0));
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            l(o7k0.e(o7k0.d(jm40Var, 1.0f), 32.0f), fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            l(o7k0.e(o7k0.s(jm40Var, 152.0f), 12.0f), fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 16.0f));
            l(o7k0.e(o7k0.d(jm40Var, 1.0f), 208.0f), fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            l(o7k0.e(o7k0.d(jm40Var, 1.0f), 38.0f), fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 16.0f));
            l(o7k0.e(o7k0.s(jm40Var, 192.0f), 16.0f), fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 16.0f));
            l(o7k0.e(o7k0.s(jm40Var, 128.0f), 16.0f), fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 16.0f));
            l(o7k0.e(o7k0.s(jm40Var, 192.0f), 16.0f), fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 16.0f));
            l(o7k0.e(o7k0.s(jm40Var, 128.0f), 16.0f), fqj0VarD0, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s3t(i2, (byte) 25);
        }
    }

    public static final void u(vby vbyVar, xd10 xd10Var, Function1 function1, fet fetVar, int i2) {
        boolean z;
        vbyVar.getClass();
        xd10Var.getClass();
        function1.getClass();
        fetVar.g0(-1795816565);
        int i3 = i2 | (fetVar.i(vbyVar) ? 4 : 2) | (fetVar.g(xd10Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o050.W(i120.Q(jm40Var, background, ljcVar)), "LOTTO_SCREEN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            if (xd10Var.equals(wd10.f38950a)) {
                fetVar.e0(1724862973);
                s(0, fetVar);
                fetVar.r(false);
            } else {
                boolean z3 = xd10Var instanceof vd10;
                cl5 cl5Var = ukd.f35823a;
                if (z3) {
                    fetVar.e0(1931202583);
                    n0q n0qVar = o7k0.c;
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar);
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
                    mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
                    mdm mdmVar = ((vd10) xd10Var).f37211a;
                    boolean z4 = (i3 & 896) == 256;
                    Object objP = fetVar.P();
                    if (z4 || objP == cl5Var) {
                        objP = new dg00(function1, (byte) 26);
                        fetVar.o0(objP);
                    }
                    jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, 0, 4);
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    if (!(xd10Var instanceof ud10)) {
                        throw b1j.f(1724862696, fetVar, false);
                    }
                    fetVar.e0(1931659430);
                    ud10 ud10Var = (ud10) xd10Var;
                    String str = ud10Var.f35457a;
                    boolean z5 = ud10Var.b;
                    int i4 = i3 & 896;
                    boolean z6 = i4 == 256;
                    Object objP2 = fetVar.P();
                    if (z6 || objP2 == cl5Var) {
                        objP2 = new dg00(function1, (byte) 27);
                        fetVar.o0(objP2);
                    }
                    Function0 function0 = (Function0) objP2;
                    boolean z7 = i4 == 256;
                    Object objP3 = fetVar.P();
                    if (z7 || objP3 == cl5Var) {
                        objP3 = new dg00(function1, (byte) 28);
                        fetVar.o0(objP3);
                    }
                    Function0 function2 = (Function0) objP3;
                    boolean z8 = i4 == 256;
                    Object objP4 = fetVar.P();
                    if (z8 || objP4 == cl5Var) {
                        objP4 = new dg00(function1, (byte) 29);
                        fetVar.o0(objP4);
                    }
                    Function0 function3 = (Function0) objP4;
                    boolean z9 = i4 == 256;
                    Object objP5 = fetVar.P();
                    if (z9 || objP5 == cl5Var) {
                        objP5 = new pd10(function1, (byte) 0);
                        fetVar.o0(objP5);
                    }
                    Function0 function4 = (Function0) objP5;
                    boolean z10 = i4 == 256;
                    Object objP6 = fetVar.P();
                    if (z10 || objP6 == cl5Var) {
                        z = true;
                        objP6 = new pd10(function1, 1 == true ? 1 : 0);
                        fetVar.o0(objP6);
                    } else {
                        z = true;
                    }
                    hmw0.J(vbyVar, str, z5, function0, function2, function3, function4, (Function0) objP6, fetVar, i3 & 14);
                    fetVar.r(false);
                }
                fetVar.r(z);
            }
            z = true;
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(vbyVar, xd10Var, function1, i2, (byte) 6);
        }
    }

    public static final void v(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(12860687);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            String strW = rsm0.w(R.string.operator_rating_good_mark, 0, fetVar);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, 16.0f, 0.0f, 2), 1.0f);
            zfn zfnVar = zaq0.b;
            v8q0.a(strW, mm40VarD, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.k(), fetVar, 0, 24576, 113656);
            v8q0.a(rsm0.w(R.string.operator_rating_bad_mark, 0, fetVar), o7k0.d(s5x0.L(jm40Var, 16.0f, 0.0f, 2), 1.0f), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.k(), fetVar, 0, 24576, 113656);
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
            int i4 = ((fu9) l7m0Var.getValue()).f10152a;
            int i5 = i3 & 112;
            boolean z = i5 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new xz8(function1, (byte) 10);
                fetVar.o0(objP);
            }
            hmw0.M(i4, (Function1) objP, fetVar, 0);
            wvb.o(null, 2.0f, 0L, fetVar, 0, 5);
            i7n i7nVar = new i7n(new y6q0(((fu9) l7m0Var.getValue()).b, new s7q0(((fu9) l7m0Var.getValue()).c), ((fu9) l7m0Var.getValue()).d, rsm0.w(R.string.operator_rating_comment_placeholder, 0, fetVar)));
            boolean z2 = i5 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new xz8(function1, (byte) 11);
                fetVar.o0(objP2);
            }
            jwb.j(null, i7nVar, (Function1) objP2, fetVar, 0, 5);
            wvb.o(null, 12.0f, 0L, fetVar, 0, 5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i2, (byte) 19);
        }
    }

    public static final void w(mm40 mm40Var, xcz xczVar, iur0 iur0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        boolean z;
        fet fetVar2 = fetVar;
        iur0Var.getClass();
        function1.getClass();
        fetVar2.g0(-411870503);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(xczVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(iur0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z2 = iur0Var instanceof dur0;
            cl5 cl5Var = ukd.f35823a;
            if (z2) {
                fetVar2.e0(-670553418);
                a4x a4xVar = ((dur0) iur0Var).f6711a;
                int i4 = i3 & 7168;
                boolean z3 = i4 == 2048;
                Object objP = fetVar2.P();
                if (z3 || objP == cl5Var) {
                    objP = new x6s(function1, (byte) 27);
                    fetVar2.o0(objP);
                }
                Function2 function2 = (Function2) objP;
                z = i4 == 2048;
                Object objP2 = fetVar2.P();
                if (z || objP2 == cl5Var) {
                    objP2 = new x6s(function1, (byte) 28);
                    fetVar2.o0(objP2);
                }
                g1x.h(mm40Var, xczVar, a4xVar, function2, (Function2) objP2, fetVar2, i3 & 126);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else if (iur0Var instanceof eur0) {
                fetVar2.e0(-670529847);
                jcb.l(mm40Var, ((eur0) iur0Var).f8437a, false, null, fetVar2, i3 & 14, 12);
                fetVar2.r(false);
            } else if (iur0Var instanceof fur0) {
                fetVar2.e0(-670524446);
                mdm mdmVar = ((fur0) iur0Var).f10179a;
                z = (i3 & 7168) == 2048;
                Object objP3 = fetVar2.P();
                if (z || objP3 == cl5Var) {
                    objP3 = new ma70(function1, (byte) 19);
                    fetVar2.o0(objP3);
                }
                jcb.l(mm40Var, mdmVar, false, (Function0) objP3, fetVar2, i3 & 14, 4);
                fetVar2.r(false);
            } else if (iur0Var.equals(hur0.f13695a)) {
                fetVar2.e0(-670516435);
                v2n0.g(6, 0, fetVar2, o7k0.c);
                fetVar2.r(false);
            } else {
                if (!iur0Var.equals(gur0.f11944a)) {
                    throw b1j.f(-670555199, fetVar2, false);
                }
                fetVar2.e0(688947463);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 28, i2, (Object) mm40Var, (Object) xczVar, (Object) iur0Var, (Object) function1);
        }
    }

    public static final void x(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(973808679);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            w2d w2dVarW0 = uzb.w0(0, fetVar);
            long jA = ((jrc0) l7m0Var.getValue()).a().a();
            jm40 jm40Var = jm40.b;
            v2n0.b(o2e.e0(yyw.X(jm40Var, null, fetVar, 1), "PROMO_SHOP_DETAIL_SCREEN"), w2dVarW0, jA, 16.0f, u1c.M(1449166802, new vv50(l7m0Var, w2dVarW0, function1), fetVar), u1c.M(1226846606, new eyn(w2dVarW0, l7m0Var, function1, (byte) 29), fetVar), fetVar, 224320, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mpb0(mm40Var2, l7m0Var, function1, i2, (byte) 1);
        }
    }

    public static final void y(mm40 mm40Var, g0j0 g0j0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1453461302);
        int i3 = i2 | 6;
        byte b2 = 16;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(g0j0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = ((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp < 375 ? 1 : 2;
            boolean zG = fetVar.g(g0j0Var.f10462a) | fetVar.e(i4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = CollectionsKt.K(g0j0Var.f10462a, i4);
                fetVar.o0(objP);
            }
            List list = (List) objP;
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "SETTINGS_COEF_TYPE_LAZY_COLUMN");
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(f2, 12.0f, f3, 12.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean zI = fetVar.i(list) | ((i3 & 896) == 256) | fetVar.e(i4);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new g18(list, i4, function1, b2);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarE0, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 0, 490);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) mm40Var2, (Object) g0j0Var, (Object) function1, i2, (byte) 9);
        }
    }

    public static final void z(mm40 mm40Var, g0j0 g0j0Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        g0j0Var.getClass();
        function1.getClass();
        fetVar.g0(531891699);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(g0j0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n);
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
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(rsm0.w(R.string.coefficient_type, 0, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, ((ThemeColors) fetVar.k(zfnVar)).getSecondary()))), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null);
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            byte b2 = 12;
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new w7i0(function1, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new abh0(function1, b2);
                fetVar.o0(objP2);
            }
            hlm.c(null, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, 0, 0, 4053);
            fetVar2 = fetVar;
            y(null, g0j0Var, function1, fetVar2, i3 & 1008);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(mm40Var, (Object) g0j0Var, function1, i2, (byte) 2);
        }
    }
}
