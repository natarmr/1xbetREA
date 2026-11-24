package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import androidx.work.impl.WorkDatabase;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes3.dex */
public abstract class slb {
    public static final void A(mm40 mm40Var, wmh wmhVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1505559086);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(wmhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.L(mm40Var, 8.0f, 0.0f, 2), 1.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            fetVar.e0(2095077112);
            int i3 = 0;
            for (Object obj : wmhVar.f39406a) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                smh smhVar = (smh) obj;
                long j = smhVar.f32446a;
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append(i3);
                fetVar.b0(1426612573, sb.toString());
                mm40 mm40VarD2 = o7k0.d(jm40.b, 1.0f);
                boolean zG = ((i2 & 896) == 256) | fetVar.g(smhVar);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new tmh(function1, smhVar, b);
                    fetVar.o0(objP);
                }
                xkb.i(mm40VarD2, smhVar, (Function0) objP, fetVar, 6);
                fetVar.r(false);
                i3 = i4;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var, wmhVar, function1, i, (byte) 19);
        }
    }

    public static final void B(mm40 mm40Var, String str, a4x a4xVar, boolean z, fet fetVar, int i) {
        fet fetVar2;
        float f;
        fetVar.g0(1494828932);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            xx7 xx7Var = z ? gqw0.m : gqw0.o;
            byte b = 3;
            if (a4xVar.size() <= 3) {
                zcl zclVar = qmk.f28987a;
                f = 2.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = -8.0f;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 0);
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
            v8q0.a(str, null, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, (i2 >> 3) & 14, 24960, 110586);
            fetVar2 = fetVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(661964602, new etm(f, xx7Var, a4xVar, b), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ftm(mm40Var, str, a4xVar, z, i, (byte) 2);
        }
    }

    public static final void C(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(1872939712);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.g(s5x0.N(jm40Var, 12.0f, 4.0f, 40.0f, 0.0f, 8), 28.0f, 0.0f, 2), gqw0.k, false, 2);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarW, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, (i2 >> 3) & 14, 24960, 110584);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var2, str2, i, (byte) 16);
        }
    }

    public static final void D(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1367914824);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, 120.0f, 124.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 6);
        }
    }

    public static final void E(mm40 mm40Var, qjm qjmVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1497287234);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(qjmVar) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 36.0f);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
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
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40.b, 12.0f), 96.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(qjmVar.f28846a, fetVar, 0, 0), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gjm(mm40Var, qjmVar, i, b);
        }
    }

    public static final void F(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(1870976237);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 40.0f), 6.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar2, (i2 >> 3) & 14, 24960, 109562);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var, str2, i, (byte) 13);
        }
    }

    public static final void G(mm40 mm40Var, c280 c280Var, fet fetVar, int i) {
        fetVar.g0(-788496755);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(c280Var) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(o7k0.n(mm40Var, 48.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundGroup(), vgg0.f37379a);
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
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new t6n(d4d.SECONDARY60, w6n.g, c280Var);
                fetVar.o0(objP);
            }
            t6n t6nVar = (t6n) objP;
            boolean zG = fetVar.g(t6nVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new h8a(t6nVar, (byte) 8);
                fetVar.o0(objP2);
            }
            kkb.p(1, fetVar, null, (Function0) objP2);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rlb(mm40Var, c280Var, i, b);
        }
    }

    public static final void H(mm40 mm40Var, o0x o0xVar, String str, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(896406791);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(o0xVar) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
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
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar2);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 16.0f);
            Object objA = o0xVar.a();
            zfn zfnVar = zaq0.b;
            k7x.b(objA, null, mm40VarN, pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, new m78(((ThemeColors) fetVar2.k(zfnVar)).getSecondary80(), 5), fetVar2, 36912, 6, 27616);
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), "TRACKED_CARD_TITLE");
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarE0, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i2 >> 6) & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var, o0xVar, str, i, (byte) 9);
        }
    }

    public static final void I(mm40 mm40Var, long j, String str, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        Object obj;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2073833918);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = str;
            i2 |= fetVar2.g(obj) ? 256 : 128;
        } else {
            obj = str;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar2);
            int i3 = z ? R.drawable.ic_glyph_favourite_active : R.drawable.ic_glyph_favourite_inactive;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 36.0f);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            int i4 = i3;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 20.0f);
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = lgb.J(mm40VarN, ugg0Var);
            zfn zfnVar = zaq0.b;
            int i5 = i2;
            k7x.b(obj, null, mm40VarJ, pm80VarF, pm80VarF, null, null, null, null, null, null, new m78(((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), 5), fetVar, ((i5 >> 6) & 14) | 36912, 0, 28640);
            mm40 mm40VarQ = i120.Q(s5x0.J(o7k0.n(jm40Var, 36.0f), 4.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackground(), ugg0Var);
            boolean z3 = ((i5 & 57344) == 16384) | ((i5 & 112) == 32);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new i11((byte) 6, j, function1);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = yyw.W(0, 1, fetVar, mm40VarQ, (Function0) objP, false);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarW);
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
            dww.c(a8k0.F(i4, 0, fetVar), null, o7k0.n(jm40Var, 20.0f), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qlb(mm40Var, j, str, z, function1, i, (byte) 0);
        }
    }

    public static final void J(mm40 mm40Var, d9z d9zVar, wmh wmhVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1073225181);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(d9zVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(wmhVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            nnw0.g(o7k0.w(o7k0.d(mm40Var, 1.0f), null, false, 3), null, false, u1c.M(1984371015, new qb((Object) d9zVar, (Object) wmhVar, (Object) function1, false, (byte) 27), fetVar), fetVar, 3072, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 24, i, (Object) mm40Var, (Object) d9zVar, (Object) wmhVar, (Object) function1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    public static final qgm0 K(long j, ctf0 ctf0Var, String str, String str2) {
        ctf0Var.getClass();
        str.getClass();
        if (!kotlin.text.c.x(str2, ujn.h, false)) {
            if (str2.length() == 0) {
                str2 = "";
            } else {
                List list = u0d.f34849a;
                if (u0d.c(str2)) {
                    str2 = "";
                } else {
                    str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                }
            }
        }
        ngm0 ngm0Var = new ngm0(j, str, str2, "");
        lsm0 lsm0Var = ctf0Var.b;
        return new qgm0(ngm0Var, dyb.g0(new vem0(lsm0Var.a(R.string.valorant_open_kill, Arrays.copyOf(new Object[0], 0)), new eko0(j)), new vem0(lsm0Var.a(R.string.valorant_open_death, Arrays.copyOf(new Object[0], 0)), new eko0(j)), new vem0(lsm0Var.a(R.string.valorant_multi_kills, Arrays.copyOf(new Object[0], 0)), new eko0(j)), new uem0(lsm0Var.a(R.string.valorant_form, Arrays.copyOf(new Object[0], 0)), new eko0(j))));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    public static final k4l L(dal dalVar, long j, j6l j6lVar, y9l y9lVar) {
        String str;
        String str2;
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        List<z4l> list = y9lVar.b;
        if (dalVar.e == j6lVar) {
            str = dalVar.f5753a;
            str2 = dalVar.b;
            i = dalVar.c;
            i2 = dalVar.d;
        } else {
            str = dalVar.f;
            str2 = dalVar.g;
            i = dalVar.h;
            i2 = dalVar.i;
        }
        boolean z = false;
        if (!kotlin.text.c.x(str2, ujn.h, false)) {
            if (str2.length() == 0) {
                str2 = "";
            } else {
                List list2 = u0d.f34849a;
                if (u0d.c(str2)) {
                    str2 = "";
                } else {
                    str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                }
            }
        }
        xnp0 xnp0Var = new xnp0(str2, str, j6lVar == j6l.f15993a, false);
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (z4l z4lVar : list) {
            int i4 = z4lVar.f43775a;
            StringBuilder sb = new StringBuilder(ujn.h);
            String strE = ua80.e(i4, "/sfiles/dota2/128/", ".jpg");
            if (strE.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(strE, ujn.h, false) || kotlin.text.c.x(strE, "https://", false)) {
                sb.setLength(0);
                sb.append(strE);
            } else {
                if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                    c2 = '/';
                } else {
                    c2 = '/';
                    sb.append('/');
                }
                sb.append(StringsKt.y0(strE, c2));
            }
            String string = sb.toString();
            String str3 = z4lVar.d;
            String upperCase = z4lVar.b.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            arrayList.add(new l4l(string, str3, upperCase));
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        for (z4l z4lVar2 : list) {
            arrayList2.add(new v4l(q3d.j(new u9b((z4lVar2.m || z4lVar2.i.contains(108)) ? true : z ? R.drawable.cyber_game_dota_aghanim_enable : R.drawable.cyber_game_dota_aghanim_disable, new d9b()), new u9b(z4lVar2.n ? R.drawable.cyber_game_dota_aghanim_shard_enable : R.drawable.cyber_game_dota_aghanim_shard_disable, new d9b()), new u9b(R.drawable.cyber_game_dota_neutral_item_disable, b9b.f2200a))));
            z = false;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        if (i2 > 0) {
            i3 = 2;
            lc00VarB.add(new h00(R.drawable.dota_tormentor_active_ic, "x".concat(ttm0.L(2, String.valueOf(i2)))));
        } else {
            i3 = 2;
        }
        if (i > 0) {
            lc00VarB.add(new h00(R.drawable.dota_roshan_ic, "x".concat(ttm0.L(i3, String.valueOf(i)))));
        }
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            List listA0 = CollectionsKt.A0(((z4l) it.next()).i, new e3l((byte) 7));
            ArrayList arrayList4 = new ArrayList(r3d.q(listA0, 10));
            Iterator it2 = listA0.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                StringBuilder sb2 = new StringBuilder(ujn.h);
                String strE2 = ua80.e(iIntValue, "sfiles/dota2/items/88/", ".png");
                if (strE2.length() == 0) {
                    sb2.setLength(0);
                } else {
                    int i5 = 0;
                    if (StringsKt.O(strE2, ujn.h, false)) {
                        sb2.setLength(i5);
                        sb2.append(strE2);
                    } else if (kotlin.text.c.x(strE2, "https://", false)) {
                        i5 = 0;
                        sb2.setLength(i5);
                        sb2.append(strE2);
                    } else {
                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                            c = '/';
                        } else {
                            c = '/';
                            sb2.append('/');
                        }
                        sb2.append(StringsKt.y0(strE2, c));
                    }
                }
                arrayList4.add(sb2.toString());
            }
            if (arrayList4.isEmpty()) {
                arrayList4 = new ArrayList(5);
                for (int i6 = 0; i6 < 5; i6++) {
                    arrayList4.add("");
                }
            }
            ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(new v9b((String) it3.next(), new a9b()));
            }
            arrayList3.add(new k5l(arrayList5));
        }
        String str4 = "HERO_ITEMS" + j;
        lc00VarA.getClass();
        return new k4l(str4, j, xnp0Var, arrayList, arrayList2, lc00VarA, arrayList3);
    }

    public static final void M(WorkDatabase workDatabase, wsd wsdVar, qov0 qov0Var) {
        int i;
        workDatabase.getClass();
        wsdVar.getClass();
        ArrayList arrayListL = q3d.l(qov0Var);
        int i2 = 0;
        while (!arrayListL.isEmpty()) {
            List list = ((qov0) w3d.z(arrayListL)).d;
            list.getClass();
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((lpv0) it.next()).b.j.i.isEmpty() && (i = i + 1) < 0) {
                        q3d.o();
                        throw null;
                    }
                }
            }
            i2 += i;
        }
        if (i2 == 0) {
            return;
        }
        int iIntValue = ((Number) kpb.h0(workDatabase.y().f36087a, true, false, new ejv0((byte) 7))).intValue();
        if (iIntValue + i2 <= 8) {
            return;
        }
        jf4.o(ohs0.m("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: 8;\nalready enqueued count: ", iIntValue, ";\ncurrent enqueue operation count: ", ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", i2));
    }

    public static final Object N(gmq gmqVar, yje yjeVar) {
        Object objC = gmqVar.c(h660.f12515a, yjeVar);
        return objC == wne.f39444a ? objC : Unit.f46060a;
    }

    public static final Object O(gmq gmqVar, Function2 function2, yje yjeVar) {
        Object objN = N(ulb.D(aoq.a(gmqVar, function2), 0), yjeVar);
        return objN == wne.f39444a ? objN : Unit.f46060a;
    }

    public static final File P(Context context, String str) {
        context.getClass();
        return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(str));
    }

    public static final Object Q(kmq kmqVar, gmq gmqVar, yje yjeVar) {
        f7k.J(kmqVar);
        Object objC = gmqVar.c(kmqVar, yjeVar);
        return objC == wne.f39444a ? objC : Unit.f46060a;
    }

    public static final String[] R(oie oieVar) {
        oieVar.getClass();
        return (String[]) ((ky2) oieVar).b.toArray(new String[0]);
    }

    public static final eao S(Long l, Double d, boolean z, long j, ArrayList arrayList, udl0 udl0Var, aw20 aw20Var) {
        udl0Var.getClass();
        aw20Var.getClass();
        Iterator it = arrayList.iterator();
        eao eaoVarB0 = null;
        while (it.hasNext()) {
            hao haoVar = (hao) it.next();
            long j2 = haoVar.b;
            if (l != null && j2 == l.longValue() && Intrinsics.a(haoVar.f, d)) {
                eaoVarB0 = b0(haoVar, z, j, aw20Var);
            }
        }
        return eaoVarB0 == null ? b0((hao) CollectionsKt.U(arrayList), z, j, aw20Var) : eaoVarB0;
    }

    public static final String T(z0w z0wVar, List list) {
        list.getClass();
        int iA = wp20.a(r3d.q(list, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj : list) {
            linkedHashMap.put(Integer.valueOf(((lok0) obj).f20396a), obj);
        }
        lok0 lok0Var = (lok0) linkedHashMap.get(Integer.valueOf(z0wVar.c));
        return lok0Var == null ? "" : lok0Var.b;
    }

    public static final c4m0 U(gmq gmqVar, vne vneVar) {
        return qjj.W(vneVar, null, null, new hij(gmqVar, null, (byte) 26), 3);
    }

    public static final ypy V(Collection collection, zpy zpyVar) {
        Iterator it = collection.iterator();
        ypy ypyVar = null;
        while (it.hasNext()) {
            ypy ypyVar2 = (ypy) it.next();
            if (Intrinsics.d(ypyVar2.getType(), zpyVar)) {
                if (ypyVar != null) {
                    e9d0.v(zpyVar, "Multiple extensions handle the same extension type: ");
                    return null;
                }
                ypyVar = ypyVar2;
            }
        }
        if (ypyVar != null) {
            return ypyVar;
        }
        e9d0.v(zpyVar, "No extensions handle the extension type: ");
        return null;
    }

    public static final Pair W(List list, List list2) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            arrayList.add(new Pair((zjk) obj, Integer.valueOf(list2.contains(Integer.valueOf(i2)) ? i2 : 0)));
            i = i2;
        }
        ArrayList arrayListQ0 = CollectionsKt.q0(CollectionsKt.A0(CollectionsKt.D0(arrayList, 3), new vt5((byte) 27)), CollectionsKt.O(arrayList, 3));
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayListQ0, 10));
        Iterator it = arrayListQ0.iterator();
        while (it.hasNext()) {
            arrayList2.add((zjk) ((Pair) it.next()).f46059a);
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayListQ0, 10));
        Iterator it2 = arrayListQ0.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Integer.valueOf(((Number) ((Pair) it2.next()).b).intValue()));
        }
        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
        int i3 = 0;
        for (Object obj2 : arrayList3) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            arrayList4.add(Integer.valueOf(((Number) obj2).intValue() != 0 ? i4 : 0));
            i3 = i4;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            if (((Number) obj3).intValue() != 0) {
                arrayList5.add(obj3);
            }
        }
        return new Pair(arrayList2, arrayList5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r37v0, types: [a.f2i] */
    public static final w56 X(y78 y78Var, d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Object next;
        w56 r56Var;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        d0tVar.getClass();
        f0t f0tVar = d0tVar.r;
        f0t f0tVar2 = d0tVar.q;
        rqs rqsVar = d0tVar.p;
        ctf0Var.getClass();
        y78Var.getClass();
        str.getClass();
        list.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        ptm ptmVar = ptm.f27572a;
        rtm rtmVar = rtm.f31086a;
        Object obj = null;
        if (iOrdinal == 0) {
            long j = d0tVar.f5282a;
            i4i i4iVarQ = w7n0.q(d0tVar, str, list, z4, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
            Iterator it = f0tVar2.d.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((String) next).length() <= 0);
            String str3 = (String) next;
            if (str3 == null) {
                str3 = "";
            }
            for (Object obj2 : f0tVar.d) {
                if (((String) obj2).length() > 0) {
                    obj = obj2;
                    break;
                }
            }
            String str4 = (String) obj;
            String str5 = str4 == null ? "" : str4;
            boolean z6 = rqsVar.t;
            boolean z7 = rqsVar.u;
            r56Var = new r56(j, i4iVarQ, new u76(y78.n(y78Var, d0tVar, kpb.j0(d0tVar), z5, 4).toString(), qzb.c0(d0tVar), (String) xkb.h0(d0tVar, ctf0Var).f46059a, xkb.T(ctf0Var, z6), new c280(vsm0.s(f0tVar2.f8731a, str3), R.drawable.ic_glyph_placeholder_player), new c280(vsm0.s(f0tVar.f8731a, str5), R.drawable.ic_glyph_placeholder_player), qzb.r0(d0tVar), (String) xkb.h0(d0tVar, ctf0Var).b, xkb.T(ctf0Var, z7), kpb.e0(d0tVar) ? rtmVar : ptmVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal != 1) {
            wem wemVar = wem.f39025a;
            vem vemVar = vem.f37292a;
            if (iOrdinal == 2) {
                long j2 = d0tVar.f5282a;
                k4i k4iVarT = w7n0.t(d0tVar, str, list, z4, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                boolean zA0 = kpb.a0(d0tVar, z, z2);
                boolean zF0 = kpb.f0(d0tVar, z);
                Iterator it2 = f0tVar2.d.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (((String) next2).length() <= 0);
                String str6 = (String) next2;
                if (str6 == null) {
                    str6 = "";
                }
                Iterator it3 = f0tVar.d.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (((String) next3).length() <= 0);
                String str7 = (String) next3;
                if (str7 == null) {
                    str7 = "";
                }
                boolean z8 = rqsVar.t;
                boolean z9 = rqsVar.u;
                String string = y78.n(y78Var, d0tVar, kpb.j0(d0tVar), z5, 4).toString();
                String strC0 = qzb.c0(d0tVar);
                c280 c280Var = new c280(vsm0.s(f0tVar2.f8731a, str6), R.drawable.ic_glyph_placeholder_player);
                String str8 = (String) xkb.h0(d0tVar, ctf0Var).f46059a;
                long jT = xkb.T(ctf0Var, z8);
                boolean zEquals = xkb.c0(d0tVar).equals(vemVar);
                boolean zEquals2 = xkb.c0(d0tVar).equals(wemVar);
                String strR0 = qzb.r0(d0tVar);
                c280 c280Var2 = new c280(vsm0.s(f0tVar.f8731a, str7), R.drawable.ic_glyph_placeholder_player);
                String str9 = (String) xkb.h0(d0tVar, ctf0Var).b;
                long jT2 = xkb.T(ctf0Var, z9);
                stm stmVar = kpb.e0(d0tVar) ? rtmVar : ptmVar;
                String strA = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
                if (zA0) {
                    obj = c2i.f3624a;
                } else if (zF0) {
                    obj = e2i.f7087a;
                }
                r56Var = new u56(j2, k4iVarT, new s86(string, strC0, zEquals, str8, jT, c280Var, c280Var2, strR0, zEquals2, str9, jT2, obj, strA, stmVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            } else if (iOrdinal == 3) {
                long j3 = d0tVar.f5282a;
                n0x n0xVar = new n0x(dtb.F(str));
                l4i l4iVarS = w7n0.s(null, d0tVar, str, y78.n(y78Var, d0tVar, kpb.j0(d0tVar), z5, 4).toString(), ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), str2, list, z4, z3, kpb.e0(d0tVar), kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
                Iterator it4 = f0tVar2.d.iterator();
                do {
                    if (!it4.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it4.next();
                } while (((String) next4).length() <= 0);
                String str10 = (String) next4;
                if (str10 == null) {
                    str10 = "";
                }
                for (Object obj3 : f0tVar.d) {
                    if (((String) obj3).length() > 0) {
                        obj = obj3;
                        break;
                    }
                }
                String str11 = (String) obj;
                String str12 = str11 == null ? "" : str11;
                boolean z10 = rqsVar.t;
                boolean z11 = rqsVar.u;
                String strC1 = qzb.c0(d0tVar);
                c280 c280Var3 = new c280(vsm0.s(f0tVar2.f8731a, str10), R.drawable.ic_glyph_placeholder_player);
                r56Var = new t56(j3, l4iVarS, new k86(strC1, xkb.c0(d0tVar).equals(vemVar), (String) xkb.h0(d0tVar, ctf0Var).f46059a, xkb.T(ctf0Var, z10), c280Var3, new c280(vsm0.s(f0tVar.f8731a, str12), R.drawable.ic_glyph_placeholder_player), qzb.r0(d0tVar), xkb.c0(d0tVar).equals(wemVar), (String) xkb.h0(d0tVar, ctf0Var).b, xkb.T(ctf0Var, z11)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                long j4 = d0tVar.f5282a;
                k4i k4iVarR = w7n0.r(d0tVar, str, list, z4, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
                Iterator it5 = f0tVar2.d.iterator();
                do {
                    if (!it5.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it5.next();
                } while (((String) next5).length() <= 0);
                String str13 = (String) next5;
                if (str13 == null) {
                    str13 = "";
                }
                for (Object obj4 : f0tVar.d) {
                    if (((String) obj4).length() > 0) {
                        obj = obj4;
                        break;
                    }
                }
                String str14 = (String) obj;
                String str15 = str14 == null ? "" : str14;
                boolean z12 = rqsVar.t;
                boolean z13 = rqsVar.u;
                String string2 = y78.n(y78Var, d0tVar, kpb.j0(d0tVar), z5, 4).toString();
                String strC2 = qzb.c0(d0tVar);
                c280 c280Var4 = new c280(vsm0.s(f0tVar2.f8731a, str13), R.drawable.ic_glyph_placeholder_player);
                String str16 = (String) xkb.h0(d0tVar, ctf0Var).f46059a;
                long jT3 = xkb.T(ctf0Var, z12);
                boolean zEquals3 = xkb.c0(d0tVar).equals(vemVar);
                boolean zEquals4 = xkb.c0(d0tVar).equals(wemVar);
                r56Var = new s56(j4, k4iVarR, new c86(jT3, xkb.T(ctf0Var, z13), kpb.e0(d0tVar) ? rtmVar : ptmVar, c280Var4, new c280(vsm0.s(f0tVar.f8731a, str15), R.drawable.ic_glyph_placeholder_player), string2, strC2, str16, qzb.r0(d0tVar), (String) xkb.h0(d0tVar, ctf0Var).b, ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), zEquals3, zEquals4), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            }
        } else {
            long j5 = d0tVar.f5282a;
            j4i j4iVarU = w7n0.u(new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), d0tVar, str, str2, list, z4, z3, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            boolean z14 = rqsVar.t;
            boolean z15 = rqsVar.u;
            r56Var = new v56(j5, j4iVarU, new a96(qzb.c0(d0tVar), (String) xkb.h0(d0tVar, ctf0Var).f46059a, z14 ? fbc.d(ctf0Var.a(R.color.static_green)) : fbc.d(ctf0.b(R.attr.uikitPrimary, ctf0Var)), qzb.r0(d0tVar), (String) xkb.h0(d0tVar, ctf0Var).b, z15 ? fbc.d(ctf0Var.a(R.color.static_green)) : fbc.d(ctf0.b(R.attr.uikitPrimary, ctf0Var)), y78.n(y78Var, d0tVar, kpb.j0(d0tVar), z5, 4).toString(), qem.f28591a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return r56Var;
    }

    public static final String Y(xuf xufVar) {
        xufVar.getClass();
        String lowerCase = xufVar.b.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return "ic_currency_" + lowerCase + BundleUtil.UNDERLINE_TAG + xufVar.f41508a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final List Z(jyg jygVar) {
        ?? arrayList;
        List<myg> list = jygVar.f17358a;
        ArrayList arrayList2 = null;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
            for (myg mygVar : list) {
                mygVar.getClass();
                Long l = mygVar.f22601a;
                long jLongValue = l != null ? l.longValue() : 0L;
                String str = mygVar.b;
                String str2 = str == null ? "" : str;
                String strE = lmc.E(mygVar.d);
                Integer num = mygVar.e;
                int iIntValue = num != null ? num.intValue() : 0;
                Long l2 = mygVar.f;
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                List<fyg> list2 = mygVar.g;
                if (list2 != null) {
                    arrayList = new ArrayList(r3d.q(list2, 10));
                    for (fyg fygVar : list2) {
                        fygVar.getClass();
                        String str3 = fygVar.f10357a;
                        String str4 = str3 == null ? "" : str3;
                        String strE2 = lmc.E(fygVar.c);
                        String str5 = fygVar.d;
                        String str6 = str5 == null ? "" : str5;
                        String str7 = fygVar.f;
                        String str8 = str7 == null ? "" : str7;
                        String str9 = fygVar.e;
                        arrayList.add(new cyg(str4, strE2, str6, str9 == null ? "" : str9, str8));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                arrayList3.add(new gyg(iIntValue, jLongValue, jLongValue2, str2, strE, arrayList));
            }
            arrayList2 = arrayList3;
        }
        return arrayList2 == null ? iun.f15405a : arrayList2;
    }

    public static final void a(mm40 mm40Var, pjb pjbVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(552076782);
        int i2 = i | 6 | (fetVar2.g(pjbVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, 120.0f, 124.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new yw9(function1, pjbVar, (byte) 8);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = yyw.W(0, 1, fetVar2, mm40VarQ, (Function0) objP, false);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zx7 zx7Var = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            I(jr8Var.b(jm40Var, zx7Var), pjbVar.f27081a, pjbVar.d, pjbVar.f, function1, fetVar, (i2 << 6) & 57344);
            fetVar2 = fetVar;
            G(jr8Var.b(jm40Var, gqw0.e), pjbVar.e, fetVar2, 0);
            F(0, fetVar2, jr8Var.b(jm40Var, gqw0.h), pjbVar.c);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var2, pjbVar, function1, i, (byte) 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public static final mwh a0(qvh qvhVar) {
        ?? arrayList;
        List<pcc> list;
        ?? arrayList2;
        haa0 haa0Var;
        List list2 = qvhVar.f29386a;
        b9a0 b9a0VarS = (list2 == null || (haa0Var = (haa0) CollectionsKt.firstOrNull(list2)) == null) ? b9a0.g : q0x.S(haa0Var);
        rwh rwhVar = qvhVar.b;
        if (rwhVar == null || (list = rwhVar.f31216a) == null) {
            arrayList = iun.f15405a;
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (pcc pccVar : list) {
                pccVar.getClass();
                List<z8g0> list3 = pccVar.f26752a;
                String str = "";
                List list4 = null;
                if (list3 != null) {
                    ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                    for (z8g0 z8g0Var : list3) {
                        z8g0Var.getClass();
                        Long l = z8g0Var.f43965a;
                        long jLongValue = l != null ? l.longValue() : 0L;
                        Long l2 = z8g0Var.b;
                        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                        Integer num = z8g0Var.c;
                        int iIntValue = num != null ? num.intValue() : 0;
                        pek pekVar = lho.b;
                        Integer num2 = z8g0Var.d;
                        int iIntValue2 = num2 != null ? num2.intValue() : 0;
                        pekVar.getClass();
                        lho lhoVarG = pek.g(iIntValue2);
                        String str2 = z8g0Var.e;
                        String str3 = str2 == null ? "" : str2;
                        String str4 = z8g0Var.f;
                        String str5 = str4 == null ? "" : str4;
                        List<f6u0> list5 = z8g0Var.g;
                        if (list5 != null) {
                            arrayList2 = new ArrayList(r3d.q(list5, 10));
                            for (f6u0 f6u0Var : list5) {
                                f6u0Var.getClass();
                                String str6 = f6u0Var.f9031a;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                Integer num3 = f6u0Var.b;
                                arrayList2.add(new c6u0(str6, num3 != null ? num3.intValue() : 0));
                            }
                        } else {
                            arrayList2 = 0;
                        }
                        if (arrayList2 == 0) {
                            arrayList2 = iun.f15405a;
                        }
                        arrayList3.add(new s8g0(jLongValue, jLongValue2, iIntValue, lhoVarG, str3, str5, arrayList2));
                    }
                    list4 = arrayList3;
                }
                if (list4 == null) {
                    list4 = iun.f15405a;
                }
                String str7 = pccVar.b;
                if (str7 != null) {
                    str = str7;
                }
                arrayList.add(new mvh(list4, str));
            }
        }
        return new mwh(b9a0VarS, arrayList);
    }

    public static final void b(String str, Function0 function0, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1596057661);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar2.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(ugdVar) ? 2048 : 1024;
        }
        int i4 = i2;
        if (fetVar2.U(i4 & 1, (i4 & 1171) != 1170)) {
            mm40 mm40VarW = yyw.W(i4 & 896, 1, fetVar2, o7k0.d(jm40Var, 1.0f), function0, false);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarW, 8.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            ugdVar.invoke(fetVar2, Integer.valueOf((i4 >> 9) & 14));
            x7z x7zVar = new x7z(1.0f, false);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarG = g1t0.g();
            zfn zfnVar2 = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary();
            long j = qmk.p;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, x7zVar, textPrimary, new n05(j, g1t0.g().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarG, fetVar, (i4 >> 3) & 14, 24960, 110576);
            dww.c(a8k0.F(R.drawable.ic_glyph_info_circle, 0, fetVar), null, o7k0.n(jm40Var, 14.0f), ((ThemeColors) fetVar.k(zfnVar2)).getSecondary(), fetVar, 56, 0);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(str, function0, ugdVar, i);
        }
    }

    public static final eao b0(hao haoVar, boolean z, long j, aw20 aw20Var) {
        k0d k0dVar;
        int i = haoVar.f12733a;
        long j2 = haoVar.b;
        double d = haoVar.f;
        tqt tqtVar = uoy.b;
        uoy uoyVar = haoVar.q;
        byte b = uoyVar.f36034a;
        tqtVar.getClass();
        uoy uoyVarJ = tqt.j(b);
        long j3 = haoVar.c;
        String strL = kng0.l(haoVar.k, Separators.SP, haoVar.l);
        String str = haoVar.j;
        if (haoVar.h) {
            k0dVar = k0d.b;
        } else {
            ur20 ur20Var = haoVar.n;
            if (ur20Var == ur20.b) {
                k0dVar = k0d.c;
            } else {
                k0dVar = ur20Var == ur20.c ? k0d.d : k0d.f17460a;
            }
        }
        return new eao(i, j2, d, z, j, uoyVarJ, new chl0(strL, str, k0dVar, j2e.U(haoVar.w), haoVar.o, haoVar.p, false, false, new xgl0(haoVar.b, haoVar.f, haoVar.d, haoVar.l, haoVar.f12733a, j, uoyVar.f36034a, haoVar.c, false)), j3, x8x.G(aw20Var));
    }

    public static final void c(mm40 mm40Var, p7p p7pVar, final Function1 function1, fet fetVar, int i) {
        fetVar.g0(1309637127);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(p7pVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            final zia ziaVar = p7pVar.i;
            if (ziaVar instanceof wia) {
                fetVar.e0(-82964620);
                if (p7pVar.f) {
                    fetVar.e0(135872284);
                    r(0, fetVar);
                } else {
                    fetVar.e0(-82906309);
                }
                fetVar.r(false);
                fetVar.r(false);
            } else {
                boolean z = ziaVar instanceof via;
                Object obj = ukd.f35823a;
                if (z) {
                    fetVar.e0(-82808969);
                    String str = ((via) ziaVar).f37469a;
                    int i3 = (fetVar.g(ziaVar) ? 1 : 0) | ((i2 & 896) != 256 ? (byte) 0 : (byte) 1);
                    Object objP = fetVar.P();
                    Object obj2 = objP;
                    if (i3 != 0 || objP == obj) {
                        Object obj3 = new Function0() { // from class: a.wzc
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b3 = b;
                                zia ziaVar2 = ziaVar;
                                Function1 function2 = function1;
                                switch (b3) {
                                    case 0:
                                        function2.invoke(ziaVar2);
                                        break;
                                    case 1:
                                        function2.invoke(ziaVar2);
                                        break;
                                    default:
                                        function2.invoke(ziaVar2);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(obj3);
                        obj2 = obj3;
                    }
                    b(str, (Function0) obj2, o050.f24406a, fetVar, (i2 & 14) | 3072);
                    fetVar.r(false);
                } else if (ziaVar instanceof xia) {
                    fetVar.e0(-82042959);
                    String str2 = ((xia) ziaVar).f40935a;
                    boolean zG = ((i2 & 896) == 256) | fetVar.g(ziaVar);
                    Object objP2 = fetVar.P();
                    Object obj4 = objP2;
                    if (zG || objP2 == obj) {
                        Object obj5 = new Function0() { // from class: a.wzc
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b3 = b2;
                                zia ziaVar2 = ziaVar;
                                Function1 function2 = function1;
                                switch (b3) {
                                    case 0:
                                        function2.invoke(ziaVar2);
                                        break;
                                    case 1:
                                        function2.invoke(ziaVar2);
                                        break;
                                    default:
                                        function2.invoke(ziaVar2);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(obj5);
                        obj4 = obj5;
                    }
                    b(str2, (Function0) obj4, o050.b, fetVar, (i2 & 14) | 3072);
                    fetVar.r(false);
                } else {
                    if (!(ziaVar instanceof yia)) {
                        throw b1j.f(135870850, fetVar, false);
                    }
                    fetVar.e0(-81383868);
                    String str3 = ((yia) ziaVar).f42678a;
                    int i4 = (fetVar.g(ziaVar) ? 1 : 0) | ((i2 & 896) != 256 ? (byte) 0 : (byte) 1);
                    Object objP3 = fetVar.P();
                    Object obj6 = objP3;
                    if (i4 != 0 || objP3 == obj) {
                        final byte b3 = 2;
                        Object obj7 = new Function0() { // from class: a.wzc
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b4 = b3;
                                zia ziaVar2 = ziaVar;
                                Function1 function2 = function1;
                                switch (b4) {
                                    case 0:
                                        function2.invoke(ziaVar2);
                                        break;
                                    case 1:
                                        function2.invoke(ziaVar2);
                                        break;
                                    default:
                                        function2.invoke(ziaVar2);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(obj7);
                        obj6 = obj7;
                    }
                    b(str3, (Function0) obj6, o050.c, fetVar, (i2 & 14) | 3072);
                    fetVar.r(false);
                }
            }
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var2, p7pVar, function1, i, (byte) 2);
        }
    }

    public static final zzr c0(d0t d0tVar, boolean z, boolean z2, String str, boolean z3, ArrayList arrayList, boolean z4, boolean z5, String str2) {
        d0tVar.getClass();
        str.getClass();
        long j = d0tVar.f5282a;
        dur durVarY = xbc.Y(d0tVar, str, str2, arrayList, z, z2, true, z4, z5);
        qtr qtrVarF0 = vbc.f0(d0tVar, false, z3, false);
        f0t f0tVar = d0tVar.q;
        String str3 = (String) CollectionsKt.W(0, f0tVar.d);
        if (str3 == null) {
            str3 = "";
        }
        vzr vzrVar = new vzr(f0tVar.f8731a, qzb.c0(d0tVar), vsm0.s(f0tVar.f8731a, str3), d0tVar.B);
        f0t f0tVar2 = d0tVar.r;
        String str4 = (String) CollectionsKt.W(0, f0tVar2.d);
        return new zzr(j, durVarY, qtrVarF0, vzrVar, new wzr(f0tVar2.f8731a, qzb.r0(d0tVar), vsm0.s(f0tVar2.f8731a, str4 != null ? str4 : ""), d0tVar.B), new uzr(d0tVar.c, d0tVar.s, qzb.E0(d0tVar)), new fus(d0tVar.C ? d0tVar.p.j : d0tVar.t, d0tVar.P.getTime(), qzb.E0(d0tVar), true));
    }

    public static final void d(int i, y1m y1mVar, fet fetVar, mm40 mm40Var, String str, boolean z) {
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1272205213);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(y1mVar) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            int i3 = i2 >> 3;
            obb.q(null, y1mVar, z, fetVar2, i3 & 1008, 1);
            if (str.length() > 0) {
                fetVar2.e0(-418418024);
                mm40 mm40VarE = o7k0.e(s5x0.N(o7k0.d(jm40.b, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), 28.0f);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
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
                v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, i3 & 14, 24960, 109562);
                fetVar2 = fetVar;
                z2 = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z2 = true;
                fetVar2.e0(-417836619);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new otm(mm40Var, str, y1mVar, z, i, (byte) 0);
        }
    }

    public static final r6w d0(HistoryTypeModel historyTypeModel) {
        historyTypeModel.getClass();
        switch (historyTypeModel.ordinal()) {
            case 0:
                return r6w.f29954a;
            case 1:
                return r6w.b;
            case 2:
                return r6w.d;
            case 3:
                return r6w.e;
            case 4:
                return r6w.k;
            case 5:
                return r6w.f;
            case 6:
                return r6w.c;
            case 7:
                return r6w.f29954a;
            default:
                t9f.b();
                return null;
        }
    }

    public static final void e(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        boolean z;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(1264156350);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            boolean z2 = false;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            if (!a4xVar.isEmpty()) {
                Iterator<E> it = a4xVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (!(((sjb) it.next()) instanceof rjb)) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            boolean z3 = (i2 & 112) == 32;
            if ((i2 & 896) == 256) {
                z2 = true;
            }
            boolean z4 = z2 | z3;
            Object objP = fetVar.P();
            if (z4 || objP == ukd.f35823a) {
                objP = new or0(a4xVar, function1, (byte) 5);
                fetVar.o0(objP);
            }
            b8k0.f(mm40Var, null, lh80VarT, false, qw3Var, null, null, z, null, (Function1) objP, fetVar, i2 & 14, 362);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r93(mm40Var, a4xVar, function1, i, (byte) 3);
        }
    }

    public static final void f(mm40 mm40Var, p7p p7pVar, Function0 function0, Function0 function1, Function1 function2, Function0 function3, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        Function0 function4;
        Function1 function5;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar.g0(1974596917);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        int i5 = i3 | (fetVar.g(p7pVar) ? 32 : 16);
        if ((i & 384) == 0) {
            function4 = function0;
            i5 |= fetVar.i(function4) ? 256 : 128;
        } else {
            function4 = function0;
        }
        if ((i & 3072) == 0) {
            i5 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= fetVar.i(function3) ? 131072 : 65536;
        }
        if (fetVar.U(i5 & 1, (74899 & i5) != 74898)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var3 = i4 != 0 ? jm40Var : mm40Var2;
            boolean zH = fetVar.h(p7pVar.g);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                objP = Float.valueOf(p7pVar.h ? 0.5f : 1.0f);
                fetVar.o0(objP);
            }
            float fFloatValue = ((Number) objP).floatValue();
            mm40 mm40Var4 = mm40Var3;
            mm40 mm40VarD = o7k0.d(y860.W(mm40Var3, null, null, false, null, function4, 28), 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), "FAVORITE_EVENT_CARD");
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.c);
            boolean z2 = (458752 & i5) == 131072;
            Object objP2 = fetVar.P();
            boolean z3 = z2;
            byte b = 10;
            if (z3 || objP2 == cl5Var) {
                objP2 = new pk9(function3, b);
                fetVar.o0(objP2);
            }
            jd8.o(0, 0, fetVar, mm40VarB, (Function0) objP2);
            boolean zD = fetVar.d(fFloatValue);
            Object objP3 = fetVar.P();
            byte b2 = 6;
            if (zD || objP3 == cl5Var) {
                objP3 = new f54(fFloatValue, b2);
                fetVar.o0(objP3);
            }
            mm40 mm40VarT = i4w0.T(jm40Var, (Function1) objP3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarT);
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
            H(s5x0.N(jm40Var, 12.0f, 12.0f, 40.0f, 0.0f, 8), p7pVar.b, p7pVar.f26517a, fetVar, 0);
            C(0, fetVar, null, p7pVar.c);
            z(0, fetVar, null, p7pVar.d);
            mm40 mm40VarL = s5x0.L(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 0.0f, 2.0f, 1);
            pz40 pz40VarF = androidx.compose.runtime.e.f(p7pVar.e, fetVar);
            gil0 gil0Var = new gil0(1, null, null, new zgl0(), 6);
            int i6 = i5 & 112;
            boolean z4 = (i6 == 32) | ((i5 & 7168) == 2048);
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new h6c(p7pVar, function1, (byte) 10);
                fetVar.o0(objP4);
            }
            vfc.q(mm40VarL, pz40VarF, gil0Var, (Function1) objP4, null, fetVar, 0, 16);
            function5 = function2;
            c(null, p7pVar, function5, fetVar, ((i5 >> 6) & 896) | i6);
            fetVar.r(true);
            fetVar.r(true);
            mm40Var2 = mm40Var4;
        } else {
            function5 = function2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(mm40Var2, p7pVar, function0, function1, function5, function3, i, i2);
        }
    }

    public static final void g(Function0 function0, Function2 function2, ugd ugdVar, Function2 function3, fet fetVar, int i) {
        int i2;
        ugd ugdVar2 = nia0.f23575a;
        fetVar.g0(1510235534);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function3) ? 131072 : 65536;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            ycl yclVar = new ycl(8.0f);
            if (function2 != null) {
                yclVar = null;
            }
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, yclVar != null ? yclVar.f42389a : 0.0f, 0.0f, 0.0f, 13);
            boolean zF = fetVar.f(backgroundContent) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new icd(backgroundContent, function2, b);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(rq8.K(mm40VarN, (Function1) objP), null, null, false, null, function0, 28);
            ycl yclVar2 = new ycl(8.0f);
            if (function2 != null) {
                yclVar2 = null;
            }
            mm40 mm40VarN2 = s5x0.N(mm40VarW, 0.0f, yclVar2 != null ? yclVar2.f42389a : 0.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN2);
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
            if (function2 == null) {
                fetVar.e0(-573366815);
                fetVar.r(false);
            } else {
                fetVar.e0(-295590368);
                h97.q((i2 >> 6) & 14, fetVar, function2, false);
            }
            ugdVar.invoke(fetVar, Integer.valueOf((i2 >> 9) & 14));
            ugdVar2.invoke(fetVar, Integer.valueOf((i2 >> 12) & 14));
            if (function3 == null) {
                fetVar.e0(-573263647);
                fetVar.r(false);
            } else {
                fetVar.e0(-295587040);
                h97.q((i2 >> 15) & 14, fetVar, function3, false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0(function0, function2, ugdVar, function3, i);
        }
    }

    public static final void h(fak0 fak0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        ugd ugdVarM;
        function1.getClass();
        fetVar.g0(-1735012116);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(fak0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean zG = fetVar.g(fak0Var.c) | (i3 == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new ecd(b, fak0Var, function1);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z = i3 == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                fetVar.o0(function1);
                objP2 = function1;
            }
            Function1 function2 = (Function1) objP2;
            ugd ugdVarM2 = null;
            if (fak0Var.b.isEmpty()) {
                fetVar.e0(-2108575334);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(-2108803184);
                ugdVarM = u1c.M(454305988, new fcd(fak0Var, b), fetVar);
                fetVar.r(false);
            }
            ugd ugdVarM3 = u1c.M(1936330794, new gcd(b, fak0Var, function2), fetVar);
            if (fak0Var.j.isEmpty()) {
                fetVar.e0(-2104439686);
                fetVar.r(false);
            } else {
                fetVar.e0(-2107855173);
                ugdVarM2 = u1c.M(-349917753, new fcd(fak0Var, b2), fetVar);
                fetVar.r(false);
            }
            g(function0, ugdVarM, ugdVarM3, ugdVarM2, fetVar, (i2 & 14) | 27648);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hcd(fak0Var, function1, i, b);
        }
    }

    public static final ky2 i(String str) {
        return new ky2(cui0.b(str));
    }

    public static final void j(mm40 mm40Var, ymh ymhVar, d9z d9zVar, Function1 function1, fet fetVar, int i) {
        int i2;
        function1.getClass();
        fetVar.g0(1161029598);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ymhVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(d9zVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            if (ymhVar instanceof wmh) {
                fetVar.e0(861491394);
                wmh wmhVar = (wmh) ymhVar;
                if (wmhVar.f39406a.size() <= 3) {
                    fetVar.e0(861540002);
                    A(mm40Var, wmhVar, function1, fetVar, ((i2 >> 3) & 896) | (i2 & 126));
                    fetVar.r(false);
                } else {
                    fetVar.e0(861739983);
                    J(mm40Var, d9zVar, wmhVar, function1, fetVar, (i2 & 14) | ((i2 >> 3) & 112) | ((i2 << 3) & 896) | (i2 & 7168));
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else {
                if (!(ymhVar instanceof xmh)) {
                    throw b1j.f(-942043727, fetVar, false);
                }
                fetVar.e0(862058260);
                tlb.f(i2 & 14, 0, fetVar, mm40Var);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 23, i, (Object) mm40Var, (Object) ymhVar, (Object) d9zVar, (Object) function1);
        }
    }

    public static final void k(mm40 mm40Var, wzh wzhVar, hnl hnlVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, fet fetVar, int i, int i2) {
        int i3;
        Function0 function6;
        int i4;
        Function0 function7;
        int i5;
        Function0 function8;
        int i6;
        Function0 function9;
        int i7;
        int i8;
        hnl hnlVar2;
        Function0 function10;
        Function0 function11;
        Function0 function12;
        Function0 function13;
        Function0 function14;
        Function0 function15;
        Function0 function16;
        Function0 function17;
        Function0 function18;
        Function0 function19;
        Function0 function20;
        boolean z;
        fetVar.g0(2111189082);
        int i9 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(wzhVar) ? 32 : 16);
        int i10 = i9 | 384;
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 = i9 | 3456;
        } else {
            i3 = i10 | (fetVar.i(function0) ? 2048 : 1024);
        }
        int i12 = i2 & 16;
        if (i12 != 0) {
            i4 = i3 | 24576;
            function6 = function1;
        } else {
            function6 = function1;
            i4 = i3 | (fetVar.i(function6) ? 16384 : 8192);
        }
        int i13 = i2 & 32;
        if (i13 != 0) {
            i5 = i4 | 196608;
            function7 = function2;
        } else {
            function7 = function2;
            i5 = i4 | (fetVar.i(function7) ? 131072 : 65536);
        }
        int i14 = i2 & 64;
        if (i14 != 0) {
            i6 = i5 | 1572864;
            function8 = function3;
        } else {
            function8 = function3;
            i6 = i5 | (fetVar.i(function8) ? 1048576 : 524288);
        }
        int i15 = i2 & 128;
        if (i15 != 0) {
            i7 = i6 | 12582912;
            function9 = function4;
        } else {
            function9 = function4;
            i7 = i6 | (fetVar.i(function9) ? 8388608 : 4194304);
        }
        int i16 = i2 & 256;
        if (i16 != 0) {
            i8 = i7 | 100663296;
        } else {
            i8 = i7 | (fetVar.i(function5) ? 67108864 : 33554432);
        }
        int i17 = i8;
        if (fetVar.U(i17 & 1, (i8 & 38347923) != 38347922)) {
            cl5 cl5Var = ukd.f35823a;
            if (i11 != 0) {
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new xal((byte) 25);
                    fetVar.o0(objP);
                }
                function15 = (Function0) objP;
            } else {
                function15 = function0;
            }
            if (i12 != 0) {
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new xal((byte) 26);
                    fetVar.o0(objP2);
                }
                function16 = (Function0) objP2;
            } else {
                function16 = function6;
            }
            if (i13 != 0) {
                Object objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = new xal((byte) 27);
                    fetVar.o0(objP3);
                }
                function17 = (Function0) objP3;
            } else {
                function17 = function7;
            }
            if (i14 != 0) {
                Object objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = new xal((byte) 28);
                    fetVar.o0(objP4);
                }
                function18 = (Function0) objP4;
            } else {
                function18 = function8;
            }
            if (i15 != 0) {
                Object objP5 = fetVar.P();
                if (objP5 == cl5Var) {
                    objP5 = new xal((byte) 29);
                    fetVar.o0(objP5);
                }
                function19 = (Function0) objP5;
            } else {
                function19 = function9;
            }
            if (i16 != 0) {
                Object objP6 = fetVar.P();
                if (objP6 == cl5Var) {
                    objP6 = new knl((byte) 0);
                    fetVar.o0(objP6);
                }
                function20 = (Function0) objP6;
            } else {
                function20 = function5;
            }
            boolean z2 = wzhVar instanceof vzh;
            dnl dnlVar = dnl.f6375a;
            if (z2) {
                fetVar.e0(-1066597857);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 320.0f), 354.0f);
                zcl zclVar2 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, false);
            } else {
                if (!(wzhVar instanceof uzh)) {
                    throw b1j.f(1628162834, fetVar, false);
                }
                fetVar.e0(-1066147923);
                if (Intrinsics.d(dnlVar, dnlVar)) {
                    fetVar.e0(-1066129199);
                    int i18 = i17 >> 3;
                    kkb.l(mm40Var, (uzh) wzhVar, function15, function16, function17, function18, function19, function20, fetVar, (i18 & 29360128) | (i18 & 896) | (i17 & 126) | (i18 & 7168) | (57344 & i18) | (458752 & i18) | (i18 & 3670016));
                    z = false;
                    fetVar.r(false);
                } else if (Intrinsics.d(dnlVar, cnl.f4661a)) {
                    fetVar.e0(-1065486228);
                    int i19 = i17 >> 3;
                    eeq.u(mm40Var, (uzh) wzhVar, function15, function16, function17, function18, function19, function20, fetVar, (i19 & 29360128) | (i17 & 126) | (i19 & 896) | (i19 & 7168) | (i19 & 57344) | (i19 & 458752) | (i19 & 3670016));
                    z = false;
                    fetVar.r(false);
                } else if (Intrinsics.d(dnlVar, enl.f8099a)) {
                    fetVar.e0(-1064856866);
                    int i20 = i17 >> 3;
                    xkb.l(mm40Var, (uzh) wzhVar, function15, function16, function17, function18, function19, function20, fetVar, (i20 & 29360128) | (i17 & 126) | (i20 & 896) | (i20 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016));
                    z = false;
                    fetVar.r(false);
                } else if (Intrinsics.d(dnlVar, fnl.f9842a)) {
                    fetVar.e0(-1064235595);
                    int i21 = i17 >> 3;
                    ntr.w(mm40Var, (uzh) wzhVar, function15, function16, function17, function18, function19, function20, fetVar, (i21 & 29360128) | (i17 & 126) | (i21 & 896) | (i21 & 7168) | (i21 & 57344) | (i21 & 458752) | (i21 & 3670016));
                    z = false;
                    fetVar.r(false);
                } else if (Intrinsics.d(dnlVar, gnl.f11594a)) {
                    fetVar.e0(-1063603629);
                    int i22 = i17 >> 3;
                    mrv.A(mm40Var, (uzh) wzhVar, function15, function16, function17, function18, function19, function20, fetVar, (i22 & 29360128) | (i17 & 126) | (i22 & 896) | (i22 & 7168) | (i22 & 57344) | (i22 & 458752) | (i22 & 3670016));
                    z = false;
                    fetVar.r(false);
                } else {
                    z = false;
                    fetVar.e0(-1063046776);
                    fetVar.r(false);
                }
                fetVar.r(z);
            }
            function14 = function19;
            function11 = function20;
            function12 = function17;
            function13 = function18;
            function10 = function15;
            function6 = function16;
            hnlVar2 = dnlVar;
        } else {
            fetVar.X();
            hnlVar2 = hnlVar;
            function10 = function0;
            function11 = function5;
            function12 = function7;
            function13 = function8;
            function14 = function9;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lnl(mm40Var, wzhVar, hnlVar2, function10, function6, function12, function13, function14, function11, i, i2);
        }
    }

    public static final void l(mm40 mm40Var, String str, String str2, long j, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        String str3;
        long j2;
        Function0 function1;
        sjm[] sjmVarArr = sjm.f32310a;
        str.getClass();
        fetVar.g0(695044522);
        int i2 = i | 6 | (fetVar.g(str) ? 256 : 128) | 920349696;
        if (fetVar.U(i2 & 1, (306783379 & i2) != 306783378)) {
            long j3 = y3d.f;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new knl((byte) 18);
                fetVar.o0(objP);
            }
            Function0 function2 = (Function0) objP;
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, j3, ljcVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarQ, 16.0f, 0.0f, 2);
            fetVar.e0(35077616);
            nkb.h(mm40VarL, new hjm(str, new ojm(127), null, null, null, null, false, null, null, false, new ue9(""), null, 5108), kjm.b, null, function2, null, fetVar, 24960, 40);
            fetVar.r(false);
            function1 = function2;
            j2 = j3;
            mm40Var2 = jm40Var;
            str3 = "";
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            str3 = str2;
            j2 = j;
            function1 = function0;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new si6(mm40Var2, str, str3, j2, function1, i);
        }
    }

    public static final void m(mm40 mm40Var, final d8n d8nVar, boolean z, long j, final Function1 function1, final Function1 function2, fet fetVar, int i) {
        int i2;
        boolean z2;
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1018162379);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(d8nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        final byte b = 0;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 132.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), j, jd8.n);
            int i3 = i2 & 112;
            boolean z3 = ((57344 & i2) == 16384) | (i3 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new Function0() { // from class: a.i6m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b2 = b;
                        d8n d8nVar2 = d8nVar;
                        Function1 function3 = function1;
                        switch (b2) {
                            case 0:
                                function3.invoke(Long.valueOf(d8nVar2.f5658a));
                                break;
                            default:
                                function3.invoke(Long.valueOf(d8nVar2.f5658a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            mm40 mm40VarO = feb.O(mm40VarQ, (Function0) objP);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarO);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.c(jm40Var, 1.0f), 96.0f);
            zx7 zx7Var2 = gqw0.h;
            jr8 jr8Var = jr8.f16991a;
            w(s5x0.N(jr8Var.b(mm40VarS, zx7Var2), 0.0f, 4.0f, 0.0f, 0.0f, 13), d8nVar, fetVar, i3);
            u(0, fetVar, jr8Var.b(jm40Var, gqw0.g));
            if (z) {
                zx7Var = gqw0.c;
            }
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
            boolean z4 = d8nVar.d;
            boolean z5 = ((458752 & i2) == 131072) | (i3 == 32);
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                z2 = true;
                final char c = 1 == true ? 1 : 0;
                objP2 = new Function0() { // from class: a.i6m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b2 = c;
                        d8n d8nVar2 = d8nVar;
                        Function1 function3 = function2;
                        switch (b2) {
                            case 0:
                                function3.invoke(Long.valueOf(d8nVar2.f5658a));
                                break;
                            default:
                                function3.invoke(Long.valueOf(d8nVar2.f5658a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            } else {
                z2 = true;
            }
            i5m.a(0, fetVar, mm40VarB, (Function0) objP2, z4);
            t(d8nVar, fetVar, 6 | i3);
            fetVar.r(z2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j6m(mm40Var, d8nVar, z, j, function1, function2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0126  */
    /* JADX WARN: Code duplicated, block: B:102:0x0133  */
    /* JADX WARN: Code duplicated, block: B:105:0x0139  */
    /* JADX WARN: Code duplicated, block: B:106:0x0156  */
    /* JADX WARN: Code duplicated, block: B:108:0x015a  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:120:0x0210  */
    /* JADX WARN: Code duplicated, block: B:123:0x0251  */
    /* JADX WARN: Code duplicated, block: B:125:0x025c  */
    /* JADX WARN: Code duplicated, block: B:127:0x0269  */
    /* JADX WARN: Code duplicated, block: B:128:0x0273  */
    /* JADX WARN: Code duplicated, block: B:130:0x027c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0297  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:141:0x02df  */
    /* JADX WARN: Code duplicated, block: B:143:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:146:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:149:0x0309  */
    /* JADX WARN: Code duplicated, block: B:151:0x0333  */
    /* JADX WARN: Code duplicated, block: B:153:0x033c  */
    /* JADX WARN: Code duplicated, block: B:157:0x037b  */
    /* JADX WARN: Code duplicated, block: B:159:0x039c  */
    /* JADX WARN: Code duplicated, block: B:162:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:167:0x0426  */
    /* JADX WARN: Code duplicated, block: B:168:0x042a  */
    /* JADX WARN: Code duplicated, block: B:171:0x043f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0457  */
    /* JADX WARN: Code duplicated, block: B:176:0x048e  */
    /* JADX WARN: Code duplicated, block: B:179:0x049e  */
    /* JADX WARN: Code duplicated, block: B:180:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:186:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:189:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:190:0x0533  */
    /* JADX WARN: Code duplicated, block: B:193:0x054c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0556  */
    /* JADX WARN: Code duplicated, block: B:198:0x0564  */
    /* JADX WARN: Code duplicated, block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x011c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    /* JADX WARN: Instruction removed from duplicated block: B:108:0x015a, please report this as an issue */
    public static final void n(mm40 mm40Var, CharSequence charSequence, o0x o0xVar, o0x o0xVar2, xe9 xe9Var, boolean z, y3d y3dVar, rjm rjmVar, Function0 function0, Function0 function1, fet fetVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        fet fetVar2;
        Function0 function2;
        Function0 function3;
        yfe0 yfe0VarU;
        cl5 cl5Var;
        Function0 function4;
        Function0 function5;
        boolean z3;
        pcy pcyVar;
        shd shdVar;
        shd shdVar2;
        jm40 jm40Var;
        fet fetVar3;
        shd shdVar3;
        shd shdVar4;
        boolean z4;
        boolean z5;
        long jY;
        Object objP;
        cl5 cl5Var2;
        boolean z6;
        Object objP2;
        Function0 function6;
        boolean z7;
        boolean z8;
        Function0 function7;
        boolean z9;
        m78 m78Var;
        oil oilVar;
        Drawable drawable;
        c78 c78VarV;
        boolean z10;
        oil oilVar2;
        m78 m78Var2;
        Drawable drawable2;
        long jY2;
        long jY3;
        Object objP3;
        Object objP4;
        charSequence.getClass();
        rjmVar.getClass();
        fetVar.g0(-677978335);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? fetVar.g(charSequence) : fetVar.i(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(o0xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.g(o0xVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.g(xe9Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= fetVar.g(y3dVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= fetVar.g(rjmVar) ? 8388608 : 4194304;
        }
        int i7 = i2 & 256;
        if (i7 == 0) {
            if ((100663296 & i) == 0) {
                i3 |= fetVar.i(function0) ? 67108864 : 33554432;
            }
            i4 = i2 & 512;
            if (i4 != 0) {
                i3 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (fetVar.i(function1)) {
                    i5 = 536870912;
                } else {
                    i5 = 268435456;
                }
                i3 |= i5;
            }
            i6 = i3;
            if ((i6 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i6 & 1, z2)) {
                cl5Var = ukd.f35823a;
                if (i7 != 0) {
                    objP4 = fetVar.P();
                    if (objP4 == cl5Var) {
                        objP4 = new ndm((byte) 12);
                        fetVar.o0(objP4);
                    }
                    function4 = (Function0) objP4;
                } else {
                    function4 = function0;
                }
                if (i4 != 0) {
                    objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = new ndm((byte) 13);
                        fetVar.o0(objP3);
                    }
                    function5 = (Function0) objP3;
                } else {
                    function5 = function1;
                }
                if (rjmVar instanceof qjm) {
                    fetVar.e0(1297861563);
                    E(mm40Var, (qjm) rjmVar, fetVar, (i6 & 14) | ((i6 >> 18) & 112));
                    fetVar.r(false);
                    fetVar2 = fetVar;
                    function6 = function5;
                    function7 = function4;
                } else {
                    if (rjmVar instanceof pjm) {
                        throw b1j.f(1297864943, fetVar, false);
                    }
                    fetVar.e0(1579281326);
                    mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarB = o7k0.b(mm40VarD, 0.0f, 36.0f, 1);
                    yx7 yx7Var = gqw0.k;
                    mm40 mm40VarE0 = o2e.e0(o7k0.w(mm40VarB, yx7Var, false, 2), "TAG_DS_HEADER_SMALL" + ((Object) charSequence));
                    thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar.i0();
                    z3 = fetVar.S;
                    pcyVar = e7z.u1;
                    if (z3) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar5 = gqw0.x;
                    jpm0.o(fetVar, thg0VarA, shdVar5);
                    shd shdVar6 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM, shdVar6);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    shdVar = gqw0.y;
                    jpm0.o(fetVar, numValueOf, shdVar);
                    jpm0.n(fetVar);
                    shdVar2 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC0, shdVar2);
                    jm40Var = jm40.b;
                    if (o0xVar != null) {
                        fetVar.e0(415808433);
                        if (o0xVar instanceof m0x) {
                            fetVar.e0(5171224);
                            pm80 pm80VarF = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar);
                            if (z) {
                                fetVar.e0(415813667);
                                jY3 = ibc.Y(((pjm) rjmVar).a(), fetVar);
                                fetVar.r(false);
                            } else {
                                fetVar.e0(415814279);
                                fetVar.r(false);
                                jY3 = y3d.g;
                            }
                            shdVar4 = shdVar;
                            shdVar3 = shdVar2;
                            dww.c(pm80VarF, null, s5x0.N(o7k0.p(jm40Var, 28.0f, 20.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), jY3, fetVar, 56, 0);
                            fetVar3 = fetVar;
                            z4 = false;
                            fetVar3.r(false);
                        } else {
                            fetVar3 = fetVar;
                            shdVar3 = shdVar2;
                            shdVar4 = shdVar;
                            z4 = false;
                            if (o0xVar instanceof l0x) {
                                fetVar3.e0(5793053);
                                drawable2 = ((l0x) o0xVar).f19222a;
                                if (drawable2 == null) {
                                    fetVar3.e0(5793052);
                                    fetVar3.r(false);
                                } else {
                                    fetVar3.e0(5793053);
                                    c78 c78VarV2 = u7x.v(drawable2);
                                    if (z) {
                                        fetVar3.e0(1759823192);
                                        jY2 = ibc.Y(((pjm) rjmVar).a(), fetVar3);
                                        fetVar3.r(false);
                                    } else {
                                        fetVar3.e0(1759823804);
                                        fetVar3.r(false);
                                        jY2 = y3d.g;
                                    }
                                    dww.c(c78VarV2, null, s5x0.N(o7k0.p(jm40Var, 28.0f, 20.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), jY2, fetVar3, 56, 0);
                                    fetVar3 = fetVar3;
                                    z4 = false;
                                    fetVar3.r(false);
                                }
                                fetVar3.r(z4);
                            } else {
                                if (o0xVar instanceof n0x) {
                                    throw b1j.f(415808433, fetVar3, false);
                                }
                                fetVar3.e0(6478308);
                                if (o0xVar2 == null) {
                                    cl5Var = cl5Var;
                                    function5 = function5;
                                    z9 = false;
                                } else {
                                    if (o0xVar2 instanceof l0x) {
                                        fetVar3.e0(6636315);
                                        drawable = ((l0x) o0xVar2).f19222a;
                                        if (drawable != null) {
                                            c78VarV = u7x.v(drawable);
                                        } else {
                                            c78VarV = null;
                                        }
                                        if (c78VarV == null) {
                                            fetVar3.e0(6636314);
                                            fetVar3.r(false);
                                            z10 = false;
                                            oilVar2 = null;
                                        } else {
                                            fetVar3.e0(6636315);
                                            oil oilVarT = ju70.T(c78VarV, new m78(ibc.Y(((pjm) rjmVar).a(), fetVar3), 5), null, 10);
                                            z10 = false;
                                            fetVar3.r(false);
                                            oilVar2 = oilVarT;
                                        }
                                        fetVar3.r(z10);
                                        oilVar = oilVar2;
                                        m78Var = null;
                                    } else {
                                        cl5Var = cl5Var;
                                        function5 = function5;
                                        z9 = false;
                                        if (o0xVar2 instanceof m0x) {
                                            fetVar3.e0(415868267);
                                            m78Var = null;
                                            oil oilVarT2 = ju70.T(a8k0.F(((m0x) o0xVar2).f20977a, 0, fetVar3), new m78(ibc.Y(((pjm) rjmVar).a(), fetVar3), 5), null, 10);
                                            fetVar3.r(false);
                                            oilVar = oilVarT2;
                                        }
                                    }
                                    String str = ((n0x) o0xVar).f22722a;
                                    if (z) {
                                        fetVar3.e0(7652464);
                                        m78 m78Var3 = new m78(ibc.Y(((pjm) rjmVar).a(), fetVar3), 5);
                                        fetVar3.r(false);
                                        m78Var2 = m78Var3;
                                    } else {
                                        fetVar3.e0(7774170);
                                        fetVar3.r(false);
                                        m78Var2 = m78Var;
                                    }
                                    k7x.b(str, null, s5x0.N(o7k0.p(jm40Var, 28.0f, 20.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), oilVar, oilVar, null, null, null, null, null, null, m78Var2, fetVar3, 36912, 0, 28640);
                                    fetVar3 = fetVar3;
                                    z4 = false;
                                    fetVar3.r(false);
                                }
                                m78Var = null;
                                fetVar3.e0(7284865);
                                fetVar3.r(z9);
                                oilVar = null;
                                String str2 = ((n0x) o0xVar).f22722a;
                                if (z) {
                                    fetVar3.e0(7652464);
                                    m78 m78Var4 = new m78(ibc.Y(((pjm) rjmVar).a(), fetVar3), 5);
                                    fetVar3.r(false);
                                    m78Var2 = m78Var4;
                                } else {
                                    fetVar3.e0(7774170);
                                    fetVar3.r(false);
                                    m78Var2 = m78Var;
                                }
                                k7x.b(str2, null, s5x0.N(o7k0.p(jm40Var, 28.0f, 20.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), oilVar, oilVar, null, null, null, null, null, null, m78Var2, fetVar3, 36912, 0, 28640);
                                fetVar3 = fetVar3;
                                z4 = false;
                                fetVar3.r(false);
                            }
                            fetVar3.r(z4);
                        }
                        cl5Var = cl5Var;
                        function5 = function5;
                        fetVar3.r(z4);
                    } else {
                        fetVar3 = fetVar;
                        shdVar3 = shdVar2;
                        cl5Var = cl5Var;
                        function5 = function5;
                        shdVar4 = shdVar;
                        z4 = false;
                        fetVar3.e0(8149766);
                        fetVar3.r(false);
                    }
                    mm40 mm40VarL = s5x0.L(new x7z(1.0f, true), 0.0f, 8.0f, 1);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, z4);
                    int iHashCode2 = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarL);
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC, shdVar5);
                    jpm0.o(fetVar3, bh90VarM2, shdVar6);
                    vqd.u(iHashCode2, fetVar3, shdVar4, fetVar3);
                    jpm0.o(fetVar3, mm40VarC1, shdVar3);
                    String string = charSequence.toString();
                    if (y3dVar == null) {
                        fetVar3.e0(1629780893);
                        jY = ibc.Y(((pjm) rjmVar).c(), fetVar3);
                        z5 = false;
                        fetVar3.r(false);
                    } else {
                        z5 = false;
                        fetVar3.e0(1629779777);
                        fetVar3.r(false);
                        jY = y3dVar.f41946a;
                    }
                    long j = jY;
                    y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109);
                    mm40 mm40VarB2 = jr8.f16991a.b(jm40Var, gqw0.d);
                    objP = fetVar3.P();
                    cl5Var2 = cl5Var;
                    if (objP == cl5Var2) {
                        objP = dw9.j(fetVar3);
                    }
                    gy40 gy40Var = (gy40) objP;
                    if ((i6 & 1879048192) == 536870912) {
                        z6 = true;
                    } else {
                        z6 = z5;
                    }
                    objP2 = fetVar3.P();
                    if (!z6 || objP2 == cl5Var2) {
                        function6 = function5;
                        objP2 = new unl(function6, (byte) 16);
                        fetVar3.o0(objP2);
                    } else {
                        function6 = function5;
                    }
                    fet fetVar4 = fetVar3;
                    v8q0.a(string, y860.W(mm40VarB2, gy40Var, null, false, null, (Function0) objP2, 28), j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0Var, fetVar4, 0, 24960, 110584);
                    fetVar2 = fetVar4;
                    fetVar2.r(true);
                    if (xe9Var != null) {
                        fetVar2.e0(9126514);
                        mm40 mm40VarE1 = o2e.e0(jm40Var, "TAG_DS_BUTTON");
                        pjm pjmVar = (pjm) rjmVar;
                        sul sulVarB = pjmVar.b();
                        oe9 oe9VarD = pjmVar.d();
                        z8 = z5;
                        z7 = true;
                        function7 = function4;
                        qzb.n(mm40VarE1, new wul(sulVarB, oe9VarD, xe9Var, true, false, false), function7, fetVar2, ((i6 >> 18) & 896) | 6, 0);
                        fetVar2.r(z8);
                    } else {
                        z7 = true;
                        z8 = z5;
                        function7 = function4;
                        fetVar2.e0(9686374);
                        fetVar2.r(z8);
                    }
                    fetVar2.r(z7);
                    fetVar2.r(z8);
                }
                function2 = function7;
                function3 = function6;
            } else {
                fetVar2 = fetVar;
                fetVar2.X();
                function2 = function0;
                function3 = function1;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new zbc(mm40Var, charSequence, o0xVar, o0xVar2, xe9Var, z, y3dVar, rjmVar, function2, function3, i, i2);
            }
        }
        i3 |= 100663296;
        i4 = i2 & 512;
        if (i4 != 0) {
            i3 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (fetVar.i(function1)) {
                i5 = 536870912;
            } else {
                i5 = 268435456;
            }
            i3 |= i5;
        }
        i6 = i3;
        if ((i6 & 306783379) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fetVar.U(i6 & 1, z2)) {
            cl5Var = ukd.f35823a;
            if (i7 != 0) {
                objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = new ndm((byte) 12);
                    fetVar.o0(objP4);
                }
                function4 = (Function0) objP4;
            } else {
                function4 = function0;
            }
            if (i4 != 0) {
                objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = new ndm((byte) 13);
                    fetVar.o0(objP3);
                }
                function5 = (Function0) objP3;
            } else {
                function5 = function1;
            }
            if (rjmVar instanceof qjm) {
                fetVar.e0(1297861563);
                E(mm40Var, (qjm) rjmVar, fetVar, (i6 & 14) | ((i6 >> 18) & 112));
                fetVar.r(false);
                fetVar2 = fetVar;
                function6 = function5;
                function7 = function4;
            } else {
                if (rjmVar instanceof pjm) {
                    throw b1j.f(1297864943, fetVar, false);
                }
                fetVar.e0(1579281326);
                mm40 mm40VarD2 = o7k0.d(mm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarB3 = o7k0.b(mm40VarD2, 0.0f, 36.0f, 1);
                yx7 yx7Var2 = gqw0.k;
                mm40 mm40VarE2 = o2e.e0(o7k0.w(mm40VarB3, yx7Var2, false, 2), "TAG_DS_HEADER_SMALL" + ((Object) charSequence));
                thg0 thg0VarA2 = shg0.a(uc9.f35418a, yx7Var2, fetVar, 48);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE2);
                mkd.c0.getClass();
                fetVar.i0();
                z3 = fetVar.S;
                pcyVar = e7z.u1;
                if (z3) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                shd shdVar7 = gqw0.x;
                jpm0.o(fetVar, thg0VarA2, shdVar7);
                shd shdVar8 = gqw0.w;
                jpm0.o(fetVar, bh90VarM3, shdVar8);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                shdVar = gqw0.y;
                jpm0.o(fetVar, numValueOf2, shdVar);
                jpm0.n(fetVar);
                shdVar2 = gqw0.v;
                jpm0.o(fetVar, mm40VarC2, shdVar2);
                jm40Var = jm40.b;
                if (o0xVar != null) {
                    fetVar.e0(415808433);
                    if (o0xVar instanceof m0x) {
                        fetVar.e0(5171224);
                        pm80 pm80VarF2 = a8k0.F(((m0x) o0xVar).f20977a, 0, fetVar);
                        if (z) {
                            fetVar.e0(415813667);
                            jY3 = ibc.Y(((pjm) rjmVar).a(), fetVar);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(415814279);
                            fetVar.r(false);
                            jY3 = y3d.g;
                        }
                        shdVar4 = shdVar;
                        shdVar3 = shdVar2;
                        dww.c(pm80VarF2, null, s5x0.N(o7k0.p(jm40Var, 28.0f, 20.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), jY3, fetVar, 56, 0);
                        fetVar3 = fetVar;
                        z4 = false;
                        fetVar3.r(false);
                    } else {
                        fetVar3 = fetVar;
                        shdVar3 = shdVar2;
                        shdVar4 = shdVar;
                        z4 = false;
                        if (o0xVar instanceof l0x) {
                            fetVar3.e0(5793053);
                            drawable2 = ((l0x) o0xVar).f19222a;
                            if (drawable2 == null) {
                                fetVar3.e0(5793052);
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(5793053);
                                c78 c78VarV3 = u7x.v(drawable2);
                                if (z) {
                                    fetVar3.e0(1759823192);
                                    jY2 = ibc.Y(((pjm) rjmVar).a(), fetVar3);
                                    fetVar3.r(false);
                                } else {
                                    fetVar3.e0(1759823804);
                                    fetVar3.r(false);
                                    jY2 = y3d.g;
                                }
                                dww.c(c78VarV3, null, s5x0.N(o7k0.p(jm40Var, 28.0f, 20.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), jY2, fetVar3, 56, 0);
                                fetVar3 = fetVar3;
                                z4 = false;
                                fetVar3.r(false);
                            }
                            fetVar3.r(z4);
                        } else {
                            if (o0xVar instanceof n0x) {
                                throw b1j.f(415808433, fetVar3, false);
                            }
                            fetVar3.e0(6478308);
                            if (o0xVar2 == null) {
                                cl5Var = cl5Var;
                                function5 = function5;
                                z9 = false;
                            } else {
                                if (o0xVar2 instanceof l0x) {
                                    fetVar3.e0(6636315);
                                    drawable = ((l0x) o0xVar2).f19222a;
                                    if (drawable != null) {
                                        c78VarV = u7x.v(drawable);
                                    } else {
                                        c78VarV = null;
                                    }
                                    if (c78VarV == null) {
                                        fetVar3.e0(6636314);
                                        fetVar3.r(false);
                                        z10 = false;
                                        oilVar2 = null;
                                    } else {
                                        fetVar3.e0(6636315);
                                        oil oilVarT3 = ju70.T(c78VarV, new m78(ibc.Y(((pjm) rjmVar).a(), fetVar3), 5), null, 10);
                                        z10 = false;
                                        fetVar3.r(false);
                                        oilVar2 = oilVarT3;
                                    }
                                    fetVar3.r(z10);
                                    oilVar = oilVar2;
                                    m78Var = null;
                                } else {
                                    cl5Var = cl5Var;
                                    function5 = function5;
                                    z9 = false;
                                    if (o0xVar2 instanceof m0x) {
                                        fetVar3.e0(415868267);
                                        m78Var = null;
                                        oil oilVarT4 = ju70.T(a8k0.F(((m0x) o0xVar2).f20977a, 0, fetVar3), new m78(ibc.Y(((pjm) rjmVar).a(), fetVar3), 5), null, 10);
                                        fetVar3.r(false);
                                        oilVar = oilVarT4;
                                    }
                                }
                                String str3 = ((n0x) o0xVar).f22722a;
                                if (z) {
                                    fetVar3.e0(7652464);
                                    m78 m78Var5 = new m78(ibc.Y(((pjm) rjmVar).a(), fetVar3), 5);
                                    fetVar3.r(false);
                                    m78Var2 = m78Var5;
                                } else {
                                    fetVar3.e0(7774170);
                                    fetVar3.r(false);
                                    m78Var2 = m78Var;
                                }
                                k7x.b(str3, null, s5x0.N(o7k0.p(jm40Var, 28.0f, 20.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), oilVar, oilVar, null, null, null, null, null, null, m78Var2, fetVar3, 36912, 0, 28640);
                                fetVar3 = fetVar3;
                                z4 = false;
                                fetVar3.r(false);
                            }
                            m78Var = null;
                            fetVar3.e0(7284865);
                            fetVar3.r(z9);
                            oilVar = null;
                            String str4 = ((n0x) o0xVar).f22722a;
                            if (z) {
                                fetVar3.e0(7652464);
                                m78 m78Var6 = new m78(ibc.Y(((pjm) rjmVar).a(), fetVar3), 5);
                                fetVar3.r(false);
                                m78Var2 = m78Var6;
                            } else {
                                fetVar3.e0(7774170);
                                fetVar3.r(false);
                                m78Var2 = m78Var;
                            }
                            k7x.b(str4, null, s5x0.N(o7k0.p(jm40Var, 28.0f, 20.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11), oilVar, oilVar, null, null, null, null, null, null, m78Var2, fetVar3, 36912, 0, 28640);
                            fetVar3 = fetVar3;
                            z4 = false;
                            fetVar3.r(false);
                        }
                        fetVar3.r(z4);
                    }
                    cl5Var = cl5Var;
                    function5 = function5;
                    fetVar3.r(z4);
                } else {
                    fetVar3 = fetVar;
                    shdVar3 = shdVar2;
                    cl5Var = cl5Var;
                    function5 = function5;
                    shdVar4 = shdVar;
                    z4 = false;
                    fetVar3.e0(8149766);
                    fetVar3.r(false);
                }
                mm40 mm40VarL2 = s5x0.L(new x7z(1.0f, true), 0.0f, 8.0f, 1);
                tj30 tj30VarC2 = zq8.c(gqw0.f11754a, z4);
                int iHashCode4 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM4 = fetVar3.m();
                mm40 mm40VarC3 = kbc.c0(fetVar3, mm40VarL2);
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(pcyVar);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, tj30VarC2, shdVar7);
                jpm0.o(fetVar3, bh90VarM4, shdVar8);
                vqd.u(iHashCode4, fetVar3, shdVar4, fetVar3);
                jpm0.o(fetVar3, mm40VarC3, shdVar3);
                String string2 = charSequence.toString();
                if (y3dVar == null) {
                    fetVar3.e0(1629780893);
                    jY = ibc.Y(((pjm) rjmVar).c(), fetVar3);
                    z5 = false;
                    fetVar3.r(false);
                } else {
                    z5 = false;
                    fetVar3.e0(1629779777);
                    fetVar3.r(false);
                    jY = y3dVar.f41946a;
                }
                long j2 = jY;
                y9q0 y9q0Var2 = new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109);
                mm40 mm40VarB4 = jr8.f16991a.b(jm40Var, gqw0.d);
                objP = fetVar3.P();
                cl5Var2 = cl5Var;
                if (objP == cl5Var2) {
                    objP = dw9.j(fetVar3);
                }
                gy40 gy40Var2 = (gy40) objP;
                if ((i6 & 1879048192) == 536870912) {
                    z6 = true;
                } else {
                    z6 = z5;
                }
                objP2 = fetVar3.P();
                if (z6) {
                    function6 = function5;
                    objP2 = new unl(function6, (byte) 16);
                    fetVar3.o0(objP2);
                } else {
                    function6 = function5;
                    objP2 = new unl(function6, (byte) 16);
                    fetVar3.o0(objP2);
                }
                fet fetVar5 = fetVar3;
                v8q0.a(string2, y860.W(mm40VarB4, gy40Var2, null, false, null, (Function0) objP2, 28), j2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0Var2, fetVar5, 0, 24960, 110584);
                fetVar2 = fetVar5;
                fetVar2.r(true);
                if (xe9Var != null) {
                    fetVar2.e0(9126514);
                    mm40 mm40VarE3 = o2e.e0(jm40Var, "TAG_DS_BUTTON");
                    pjm pjmVar2 = (pjm) rjmVar;
                    sul sulVarB2 = pjmVar2.b();
                    oe9 oe9VarD2 = pjmVar2.d();
                    z8 = z5;
                    z7 = true;
                    function7 = function4;
                    qzb.n(mm40VarE3, new wul(sulVarB2, oe9VarD2, xe9Var, true, false, false), function7, fetVar2, ((i6 >> 18) & 896) | 6, 0);
                    fetVar2.r(z8);
                } else {
                    z7 = true;
                    z8 = z5;
                    function7 = function4;
                    fetVar2.e0(9686374);
                    fetVar2.r(z8);
                }
                fetVar2.r(z7);
                fetVar2.r(z8);
            }
            function2 = function7;
            function3 = function6;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            function2 = function0;
            function3 = function1;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zbc(mm40Var, charSequence, o0xVar, o0xVar2, xe9Var, z, y3dVar, rjmVar, function2, function3, i, i2);
        }
    }

    public static final void o(mm40 mm40Var, String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, y1m y1mVar, boolean z, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str3.getClass();
        fetVar.g0(1743271863);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(a4xVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(a4xVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(str3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(y1mVar) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.h(z) ? 8388608 : 4194304;
        }
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            if (z) {
                fetVar.e0(247027198);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(247028122);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(53648503, new ntm(mm40Var, str, a4xVar, str3, y1mVar, z, str2, a4xVar2), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gw6(mm40Var, str, str2, a4xVar, a4xVar2, str3, y1mVar, z, i);
        }
    }

    public static final void p(mm40 mm40Var, q3o0 q3o0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        q3o0Var.getClass();
        fetVar.g0(-1273435683);
        int i2 = i | 6 | (fetVar.g(q3o0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = q3o0Var instanceof j3o0;
            mm40Var2 = jm40.b;
            if (z) {
                fetVar.e0(523995226);
                j3o0 j3o0Var = (j3o0) q3o0Var;
                kkb.n(mm40Var2, new htm(j3o0Var.f15846a, j3o0Var.b, j3o0Var.c, j3o0Var.d, j3o0Var.e, j3o0Var.f, j3o0Var.g, j3o0Var.h, j3o0Var.i, j3o0Var.j), fetVar, 6);
                fetVar.r(false);
            } else if (q3o0Var instanceof k3o0) {
                fetVar.e0(525061316);
                k3o0 k3o0Var = (k3o0) q3o0Var;
                ntb.q(mm40Var2, new bvm(k3o0Var.f17629a, k3o0Var.b, "", k3o0Var.c, k3o0Var.d, qem.f28591a, k3o0Var.e), fetVar, 6);
                fetVar.r(false);
            } else if (q3o0Var instanceof l3o0) {
                fetVar.e0(525864030);
                l3o0 l3o0Var = (l3o0) q3o0Var;
                d5c.l(mm40Var2, new nwm(l3o0Var.f19368a, l3o0Var.b, l3o0Var.c, l3o0Var.d, l3o0Var.e, l3o0Var.f), fetVar, 6);
                fetVar.r(false);
            } else if (q3o0Var instanceof n3o0) {
                fetVar.e0(526611533);
                n3o0 n3o0Var = (n3o0) q3o0Var;
                ibc.p(mm40Var2, new bxm(n3o0Var.f22860a, n3o0Var.b, n3o0Var.c, n3o0Var.d, n3o0Var.e), fetVar, 6);
                fetVar.r(false);
            } else if (q3o0Var instanceof p3o0) {
                fetVar.e0(527257046);
                p3o0 p3o0Var = (p3o0) q3o0Var;
                kbc.o(mm40Var2, new d2n(p3o0Var.f26308a, p3o0Var.b, p3o0Var.c, p3o0Var.d), fetVar, 6);
                fetVar.r(false);
            } else if (q3o0Var instanceof m3o0) {
                fetVar.e0(527881293);
                m3o0 m3o0Var = (m3o0) q3o0Var;
                pzb.o(mm40Var2, new bwm(m3o0Var.f21126a, m3o0Var.b, m3o0Var.c, m3o0Var.d, m3o0Var.e, m3o0Var.f, m3o0Var.g, m3o0Var.h, m3o0Var.i, m3o0Var.j, m3o0Var.k, m3o0Var.l), fetVar, 6);
                fetVar.r(false);
            } else {
                if (!(q3o0Var instanceof o3o0)) {
                    throw b1j.f(293999833, fetVar, false);
                }
                fetVar.e0(529208124);
                o3o0 o3o0Var = (o3o0) q3o0Var;
                thb.i(mm40Var2, new kym(o3o0Var.f24595a, o3o0Var.b, o3o0Var.c, o3o0Var.d, o3o0Var.e, o3o0Var.f, o3o0Var.g, o3o0Var.h), fetVar, 6);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var2, q3o0Var, i, (byte) 21);
        }
    }

    public static final void q(mm40 mm40Var, xgm xgmVar, xgm xgmVar2, ugd ugdVar, fet fetVar, int i) {
        xgmVar.getClass();
        xgmVar2.getClass();
        fetVar.g0(-1495458036);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(xgmVar) ? 32 : 16) | (fetVar.g(xgmVar2) ? 256 : 128);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            fetVar.e0(-1003410150);
            fetVar.e0(212064437);
            fetVar.r(false);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new bk30(w6kVar);
                fetVar.o0(objP);
            }
            bk30 bk30Var = (bk30) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new g3e();
                fetVar.o0(objP2);
            }
            g3e g3eVar = (g3e) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP3);
            }
            pz40 pz40Var = (pz40) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = new v3e(g3eVar);
                fetVar.o0(objP4);
            }
            v3e v3eVar = (v3e) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                fetVar.o0(objP5);
            }
            pz40 pz40Var2 = (pz40) objP5;
            boolean zI = fetVar.i(bk30Var) | fetVar.e(257);
            Object objP6 = fetVar.P();
            if (zI || objP6 == obj) {
                Object a5nVar = new a5n(pz40Var2, bk30Var, v3eVar, pz40Var, (byte) 0);
                fetVar.o0(a5nVar);
                objP6 = a5nVar;
            }
            tj30 tj30Var = (tj30) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == obj) {
                objP7 = new b5n(pz40Var, v3eVar, b);
                fetVar.o0(objP7);
            }
            Function0 function0 = (Function0) objP7;
            boolean zI2 = fetVar.i(bk30Var);
            Object objP8 = fetVar.P();
            if (zI2 || objP8 == obj) {
                objP8 = new c5n(bk30Var, b);
                fetVar.o0(objP8);
            }
            l7x.s(pai0.a(mm40VarD, false, (Function1) objP8), u1c.M(1200550679, new o63(pz40Var2, g3eVar, function0, xgmVar, xgmVar2, ugdVar), fetVar), tj30Var, fetVar, 48);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 21, i, (Object) mm40Var, (Object) xgmVar, (Object) xgmVar2, (Object) ugdVar);
        }
    }

    public static final void r(int i, fet fetVar) {
        fetVar.g0(-1318787711);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, o7k0.e(jm40.b, 22.0f));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sfc(i, (byte) 8);
        }
    }

    public static final void s(mm40 mm40Var, b5a0 b5a0Var, Function2 function2, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        function2.getClass();
        fetVar2.g0(105709358);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(b5a0Var) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128);
        byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = b5a0Var.c;
            boolean zH = fetVar2.h(z);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                objP = z ? new y9p(R.drawable.ic_glyph_favourite_active, d4d.STATIC_WHITE, d4d.PRIMARY) : new y9p(R.drawable.ic_glyph_favourite_inactive, d4d.STATIC_WHITE80, d4d.PRIMARY80);
                fetVar2.o0(objP);
            }
            y9p y9pVar = (y9p) objP;
            l7m0 l7m0VarB = m5k0.b(ibc.Y(y9pVar.c, fetVar2), null, fetVar2, 0, 14);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 24.0f);
            boolean zG = fetVar2.g(l7m0VarB);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new ufp(l7m0VarB, b);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarJ = lgb.J(rq8.K(mm40VarN, (Function1) objP2), vgg0.f37379a);
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP3 = fetVar2.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new gmo(function2, b5a0Var, (byte) 9);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarW = y860.W(mm40VarJ, null, null, false, null, (Function0) objP3, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarN2 = o7k0.n(jm40.b, 14.0f);
            s4u0 s4u0VarR = iom0.r(jpm0.t(y9pVar.f42260a, 6, fetVar2), fetVar2);
            fetVar2 = fetVar;
            j0x.b(s4u0VarR, null, mm40VarN2, null, null, 0.0f, null, fetVar2, 56, 120);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ann(mm40Var, b5a0Var, function2, i, (byte) 19);
        }
    }

    public static final void t(d8n d8nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1775879101);
        int i3 = i & 6;
        jr8 jr8Var = jr8.f16991a;
        if (i3 == 0) {
            i2 = (fetVar.g(jr8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(d8nVar) ? 32 : 16;
        }
        byte b = 14;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarB = jr8Var.b(jm40.b, gqw0.h);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarB, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4(b)), gqw0.n, fetVar, 48);
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
            String str = d8nVar.e;
            if (str == null) {
                fetVar.e0(1972983698);
                fetVar.r(false);
            } else {
                fetVar.e0(1972983699);
                j6n.h(str, dqo0.f6527a, null, 0, 0, fetVar, 48, 28);
                fetVar.r(false);
            }
            v(d8nVar.b, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(d8nVar, i, b);
        }
    }

    public static final void u(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(391290602);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 64.0f);
            zfn zfnVar = m8m0.f21378a;
            zq8.a(0, fetVar, i120.P(mm40VarE, yk5.n(q3d.j(new y3d(((StaticColors) fetVar.k(zfnVar)).m63getBlack00d7_KjU()), new y3d(((StaticColors) fetVar.k(zfnVar)).m62getBlack0d7_KjU())), 0.0f, 0.0f, 14), null, 6));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 8);
        }
    }

    public static final void v(String str, fet fetVar, int i) {
        fetVar.g0(-388433752);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = o7k0.w(s5x0.L(o7k0.g(mm40VarD, 28.0f, 0.0f, 2), 4.0f, 0.0f, 2), gqw0.k, false, 2);
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarW, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, i2 & 14, 24960, 109560);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 3, i, str);
        }
    }

    public static final void w(mm40 mm40Var, d8n d8nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1693737745);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(d8nVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            rq8.b(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), mm40Var, d8nVar.c, R.drawable.cybergames_ufc_fighter_placeholder, new y3d(y3d.g), null, gqw0.b, gqw0.A, null, fetVar, ((i2 << 3) & 112) | 14180352, 288);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) d8nVar, i, (byte) 15);
        }
    }

    public static final void x(gws gwsVar, sek sekVar, bek bekVar, z5s z5sVar, xex xexVar, CyberBottomSheetParams cyberBottomSheetParams, Function1 function1, fet fetVar, int i) {
        gwsVar.getClass();
        sekVar.getClass();
        bekVar.getClass();
        xexVar.getClass();
        function1.getClass();
        fetVar.g0(1669792491);
        int i2 = i | (fetVar.g(gwsVar) ? 4 : 2) | (fetVar.g(sekVar) ? 32 : 16) | (fetVar.g(bekVar) ? 256 : 128) | (fetVar.g(z5sVar) ? 2048 : 1024) | (fetVar.g(xexVar) ? 16384 : 8192) | (fetVar.g(cyberBottomSheetParams) ? 131072 : 65536) | (fetVar.i(function1) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            int i3 = 3670016 & i2;
            boolean z = i3 == 1048576;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new hcr(function1, (byte) 20);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 1048576;
            Object objP2 = fetVar.P();
            byte b = 21;
            if (z2 || objP2 == cl5Var) {
                objP2 = new hcr(function1, b);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            l7m0 l7m0Var = gwsVar.f12042a;
            l7m0 l7m0Var2 = gwsVar.b;
            l7m0 l7m0Var3 = gwsVar.c;
            l7m0 l7m0Var4 = gwsVar.d;
            l7m0 l7m0Var5 = gwsVar.e;
            l7m0 l7m0Var6 = gwsVar.f;
            l7m0 l7m0Var7 = gwsVar.g;
            boolean z3 = i3 == 1048576;
            Object objP3 = fetVar.P();
            byte b2 = 22;
            if (z3 || objP3 == cl5Var) {
                objP3 = new hcr(function1, b2);
                fetVar.o0(objP3);
            }
            Function0 function2 = (Function0) objP3;
            boolean z4 = i3 == 1048576;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new hcr(function1, (byte) 23);
                fetVar.o0(objP4);
            }
            Function0 function3 = (Function0) objP4;
            boolean z5 = i3 == 1048576;
            Object objP5 = fetVar.P();
            boolean z6 = z5;
            byte b3 = 24;
            if (z6 || objP5 == cl5Var) {
                objP5 = new hcr(function1, b3);
                fetVar.o0(objP5);
            }
            Function0 function4 = (Function0) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = new sqs((byte) 1);
                fetVar.o0(objP6);
            }
            Function0 function5 = (Function0) objP6;
            boolean z7 = i3 == 1048576;
            Object objP7 = fetVar.P();
            if (z7 || objP7 == cl5Var) {
                objP7 = new baq(function1, (byte) 24);
                fetVar.o0(objP7);
            }
            Function1 function6 = (Function1) objP7;
            boolean z8 = i3 == 1048576;
            Object objP8 = fetVar.P();
            if (z8 || objP8 == cl5Var) {
                objP8 = new baq(function1, (byte) 25);
                fetVar.o0(objP8);
            }
            Function1 function7 = (Function1) objP8;
            boolean z9 = i3 == 1048576;
            Object objP9 = fetVar.P();
            if (z9 || objP9 == cl5Var) {
                objP9 = new baq(function1, (byte) 21);
                fetVar.o0(objP9);
            }
            Function1 function8 = (Function1) objP9;
            boolean z10 = i3 == 1048576;
            Object objP10 = fetVar.P();
            if (z10 || objP10 == cl5Var) {
                objP10 = new baq(function1, (byte) 22);
                fetVar.o0(objP10);
            }
            int i4 = i2 >> 12;
            mrv.x(l7m0Var, l7m0Var2, l7m0Var3, l7m0Var4, l7m0Var5, l7m0Var6, l7m0Var7, sekVar, bekVar, z5sVar, xexVar, cyberBottomSheetParams, null, false, function2, function3, function4, function5, function6, function7, function8, (Function1) objP10, u1c.M(1072085560, new gn(function1, (byte) 19), fetVar), fetVar, (i2 << 18) & 2143289344, (i4 & 14) | 12582912 | (i4 & 112), 12288);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn0((Object) gwsVar, (Object) sekVar, (Object) bekVar, (Object) z5sVar, (Object) xexVar, (Object) cyberBottomSheetParams, (wdr) function1, i, (byte) 9);
        }
    }

    public static final void y(vpv vpvVar, Function2 function2, Function1 function1, fet fetVar, int i) {
        function2.getClass();
        function1.getClass();
        jm40 jm40Var = jm40.b;
        mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
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
        mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
        zcl zclVar = qmk.f28987a;
        nkb.h(s5x0.L(mm40VarD2, 8.0f, 0.0f, 2), vpvVar.b, kjm.b, null, null, null, fetVar, 384, 56);
        fyl fylVar = vpvVar.c;
        fetVar.e0(-2102505929);
        mm40 mm40VarD3 = o7k0.d(knx.Q(jm40Var, new k82(xfn.a(fetVar).c, (byte) 2)), 1.0f);
        vxl vxlVar = vxl.c;
        boolean z = ((((i & 896) ^ 384) > 256 && fetVar.g(function2)) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && fetVar.g(vpvVar)) || (i & 48) == 32);
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            objP = new nrk(function2, vpvVar);
            fetVar.o0(objP);
        }
        ebc.r(mm40VarD3, fylVar, vxlVar, (Function1) objP, null, fetVar, 3456, 32);
        fetVar.r(false);
        vzb.b(jm40Var, vpvVar.d, vpvVar.f37826a, function1, fetVar, (i & 7168) | 6, 0);
        fetVar.r(true);
    }

    public static final void z(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(-642812176);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40Var, 12.0f, 4.0f, 40.0f, 0.0f, 8), "EVENT_CARD_INFO_LABEL");
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarE0, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i2 >> 3) & 14, 24960, 110584);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var2, str2, i, (byte) 15);
        }
    }
}
