package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.team_logo.DsTeamLogo;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleCyber;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mbc {
    public static final void A(mm40 mm40Var, xyp xypVar, fet fetVar, int i) {
        shd shdVar;
        fet fetVar2;
        fet fetVar3 = fetVar;
        fetVar3.g0(-758224774);
        int i2 = i | (fetVar3.g(mm40Var) ? 4 : 2) | (fetVar3.g(xypVar) ? 32 : 16);
        if (fetVar3.U(i2 & 1, (i2 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40Var);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z = fetVar3.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            shd shdVar2 = gqw0.x;
            jpm0.o(fetVar3, thg0VarA, shdVar2);
            shd shdVar3 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar4 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar4);
            jpm0.n(fetVar3);
            shd shdVar5 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar5);
            int length = xypVar.b.length();
            jm40 jm40Var = jm40.b;
            if (length > 0) {
                fetVar3.e0(602387683);
                String str = xypVar.b;
                zcl zclVar = qmk.f28987a;
                shdVar = shdVar5;
                j6n.h(str, oro0.f25744a, s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 0, 0, fetVar3, 48, 24);
                fetVar2 = fetVar3;
                fetVar2.r(false);
            } else {
                shdVar = shdVar5;
                fetVar2 = fetVar3;
                fetVar2.e0(602603908);
                fetVar2.r(false);
            }
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar2);
            jpm0.o(fetVar2, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar2, shdVar4, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar);
            boolean zH = fetVar2.h(true);
            Object objP = fetVar2.P();
            if (zH || objP == ukd.f35823a) {
                zcl zclVar2 = qmk.f28987a;
                objP = s5x0.N(jm40Var, 0.0f, 0.0f, 18.0f, 0.0f, 11);
                fetVar2.o0(objP);
            }
            String str2 = xypVar.f41714a;
            zfn zfnVar = zaq0.b;
            v8q0.a(str2, (mm40) objP, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110584);
            fetVar3 = fetVar;
            fetVar3.e0(1440728868);
            dww.c(a8k0.F(R.drawable.ic_glyph_broadcast, 0, fetVar3), null, o7k0.n(jr8.f16991a.b(jm40Var, gqw0.f), 14.0f), ((ThemeColors) fetVar3.k(zfnVar)).getSecondary(), fetVar3, 56, 0);
            ohs0.x(fetVar3, false, true, true);
        } else {
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var, xypVar, i, (byte) 11);
        }
    }

    public static final void B(int i, fet fetVar, mm40 mm40Var, List list, Function1 function1) {
        int i2;
        fetVar.g0(830688169);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float f = xfn.a(fetVar).d;
            lh80 lh80Var = new lh80(f, 12.0f, f, 12.0f);
            boolean z = ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(list))) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new rb(list, function1, (byte) 8);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, lh80Var, null, null, null, false, null, (Function1) objP, fetVar, i2 & 14, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nt8(mm40Var, list, function1, i, (byte) 3);
        }
    }

    public static final void C(mm40 mm40Var, o0x o0xVar, String str, String str2, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-702146093);
        int i2 = i | 6 | (fetVar2.g(o0xVar) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), 12.0f, 0.0f, 12.0f, 22.0f, 2), "DS_AGGREGATOR_TOURNAMENT_PROGRESS_CARD_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            k7x.a(o0xVar != null ? o0xVar.a() : null, null, o2e.e0(o7k0.e(o7k0.s(jm40Var, 320.0f), 100.0f), "DS_AGGREGATOR_TOURNAMENT_PROGRESS_IMAGE"), null, null, fetVar2, 48, 2040);
            mm40 mm40VarE1 = o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), "DS_AGGREGATOR_TOURNAMENT_PROGRESS_CARD_TITLE");
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str2, mm40VarE1, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), new n05(qmk.r, qmk.s, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.j(), fetVar, (i2 >> 9) & 14, 24960, 110576);
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str, o2e.e0(jm40Var, "DS_AGGREGATOR_TOURNAMENT_PROGRESS_CARD_SUBTITLE"), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, ((i2 >> 6) & 14) | 48, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 6, i, (Object) mm40Var2, (Object) o0xVar, (Object) str, (Object) str2);
        }
    }

    public static float D(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final void E(mm40 mm40Var, zyp zypVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-701532974);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(zypVar) ? 32 : 16);
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new xwm(zypVar, b);
                fetVar2.o0(objP);
            }
            kkb.p(0, fetVar2, mm40VarN, (Function0) objP);
            String str = zypVar.f45216a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            long j = qmk.p;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            kc5.N(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, null, 0L, j, g1t0.d().f42262a.b, null, null, 0L, null, 2, false, 2, 0, false, null, y9q0VarD, 0.0f, fetVar, 0, 1597440, 0, 3063610);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywm(mm40Var, zypVar, i, (byte) 2);
        }
    }

    public static final void F(mm40 mm40Var, k2n k2nVar, float f, fet fetVar, int i) {
        k2n k2nVar2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-101062050);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(k2nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.d(f) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(2.0f, true, new jf4((byte) 14));
            mm40 mm40VarH = dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true);
            x5d x5dVarA = w5d.a(qw3Var, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarH);
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
            String str = k2nVar.f17582a;
            zfn zfnVar = zaq0.b;
            int i3 = i2;
            mm40Var2 = jm40Var;
            f1t0.a(o7k0.e(jm40Var, 14.0f), str, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), 0L, fetVar, 0, 438264);
            fetVar2 = fetVar;
            mm40 mm40VarU = o7k0.u(s5x0.L(i120.S(o7k0.e(mm40Var2, 18.0f), 1.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator(), vgg0.a(6.0f)), 4.0f, 0.0f, 2), 80.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarU);
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
            k2nVar2 = k2nVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(561304254, new mxm(k2nVar2, (byte) 12), fetVar2), fetVar2, 56);
            fetVar2.r(true);
            fetVar2.r(true);
            H(null, k2nVar2, fetVar2, i3 & 112);
            J(f, (i3 << 3) & 7168, fetVar2, new ecu0(gqw0.l), k2nVar2.d, k2nVar2.e);
            fetVar2.r(true);
        } else {
            k2nVar2 = k2nVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new svm(mm40Var2, (Object) k2nVar2, f, i, (byte) 1);
        }
    }

    public static final void G(mm40 mm40Var, j2n j2nVar, fet fetVar, int i) {
        byte b;
        mm40 mm40Var2;
        String str;
        String str2;
        j2n j2nVar2 = j2nVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(525762985);
        int i2 = i | 6 | (fetVar2.g(j2nVar2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            String str3 = "";
            if (j2nVar2 == null || (str = j2nVar2.f15788a) == null) {
                str = "";
            }
            zfn zfnVar = zaq0.b;
            v8q0.a(str, o7k0.u(jm40Var, 0.0f, 18.0f, 1), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary80(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110584);
            mm40 mm40VarS = i120.S(o7k0.n(jm40Var, 18.0f), 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator(), vgg0.a(6.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
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
            j2nVar2 = j2nVar;
            if (j2nVar != null && (str2 = j2nVar2.b) != null) {
                str3 = str2;
            }
            v8q0.a(str3, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            b = 1;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            b = 1;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b2n(mm40Var2, j2nVar2, i, b);
        }
    }

    public static final void H(mm40 mm40Var, k2n k2nVar, fet fetVar, int i) {
        fetVar.g0(1486834620);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(k2nVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            a4x a4xVar = k2nVar.c;
            G(null, (j2n) CollectionsKt.W(0, a4xVar), fetVar, 0);
            G(null, (j2n) CollectionsKt.W(1, a4xVar), fetVar, 0);
            G(null, (j2n) CollectionsKt.W(2, a4xVar), fetVar, 0);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((Object) mm40Var, (Object) k2nVar, i, (byte) 3);
        }
    }

    public static final void I(mm40 mm40Var, nfo nfoVar, rim rimVar, v3n v3nVar, Function1 function1, fet fetVar, int i) {
        int i2;
        v3n v3nVar2;
        Function1 function2;
        rim rimVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1389456958);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.e(nfoVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(rimVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            v3nVar2 = v3nVar;
            i2 |= fetVar2.g(v3nVar2) ? 2048 : 1024;
        } else {
            v3nVar2 = v3nVar;
        }
        if ((i & 24576) == 0) {
            function2 = function1;
            i2 |= fetVar2.i(function2) ? 16384 : 8192;
        } else {
            function2 = function1;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
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
            obc.u(new x7z(1.0f, true), nfoVar, rimVar, v3nVar2, function2, fetVar2, i3 & 65520);
            rimVar2 = rimVar;
            fetVar2 = fetVar;
            v3c.t(s5x0.N(jm40.b, v3nVar.a().g(), 0.0f, 0.0f, 0.0f, 14), (rimVar2.d == null || rimVar2.i) ? false : true, v3nVar, rimVar2.b, fetVar2, (i3 >> 3) & 896);
            fetVar2.r(true);
        } else {
            rimVar2 = rimVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rfo(mm40Var, nfoVar, rimVar2, v3nVar, function1, i, (byte) 2);
        }
    }

    public static final void J(float f, int i, fet fetVar, mm40 mm40Var, String str, boolean z) {
        int i2;
        fet fetVar2;
        long primary;
        fetVar.g0(1101259650);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                fetVar.e0(-1628744173);
                primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU();
                fetVar.r(false);
            } else {
                fetVar.e0(-1628693705);
                primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                fetVar.r(false);
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.N(mm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 18.0f), f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            v8q0.a(str, null, primary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar, (i2 >> 3) & 14, 0, 130042);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s6m((byte) 1, f, i, mm40Var, str, z);
        }
    }

    public static final void K(int i, fet fetVar) {
        fetVar.g0(739213306);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            xvw.d(7, 48, fetVar, s5x0.N(jm40.b, qmk.a(fetVar).d, 12.0f, qmk.a(fetVar).d, 0.0f, 8));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x2w(i);
        }
    }

    public static final void L(mm40 mm40Var, float f, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(-1916158325);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.d(f) ? 32 : 16) | (fetVar.i(ugdVar) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new b2d(f, b);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            jpm0.o(fetVar, tj30Var, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarK0 = mrv.k0(jm40.b, RemoteMessageConst.Notification.CONTENT);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarK0);
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
            ugdVar.invoke(fetVar, Integer.valueOf((i2 >> 6) & 14));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zv((Object) mm40Var, f, (Object) ugdVar, i, (byte) 6);
        }
    }

    public static final void M(lc00 lc00Var, mrf mrfVar, m9s m9sVar, long j, boolean z, ctf0 ctf0Var) {
        long j2;
        long j3;
        Object next;
        m9sVar.getClass();
        ctf0Var.getClass();
        fof fofVar = mrfVar.f22269a;
        if (V(fofVar)) {
            return;
        }
        trf trfVar = fofVar.b;
        trf trfVar2 = fofVar.c;
        List list = trfVar.f34420a;
        List list2 = trfVar2.f34420a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            nqf nqfVar = ((pqf) obj).h;
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            if (nqfVar.equals(new nqf(false, false, false, "", false, lunVar))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            nqf nqfVar2 = ((pqf) obj2).h;
            lun lunVar2 = lun.f20680a;
            lunVar2.getClass();
            if (nqfVar2.equals(new nqf(false, false, false, "", false, lunVar2))) {
                arrayList2.add(obj2);
            }
        }
        boolean z2 = CollectionsKt.q0(arrayList, arrayList2).size() != 10;
        if (z2) {
            j2 = j;
        } else {
            inf infVar = inf.STATISTIC;
            j2 = 1;
        }
        String str = m9sVar.i;
        String str2 = (String) CollectionsKt.firstOrNull(m9sVar.m);
        if (str2 == null) {
            str2 = "";
        }
        trf trfVar3 = fofVar.b;
        wjf wjfVar = new wjf(str, str2, trfVar3);
        String str3 = m9sVar.j;
        String str4 = (String) CollectionsKt.firstOrNull(m9sVar.n);
        wjf wjfVar2 = new wjf(str3, str4 != null ? str4 : "", trfVar2);
        wjf wjfVar3 = trfVar3.c == wpf.b ? wjfVar : wjfVar2;
        if (trfVar2.c == wpf.f39542a) {
            wjfVar = wjfVar2;
        }
        String str5 = wjfVar3.b;
        trf trfVar4 = wjfVar3.c;
        String str6 = wjfVar.b;
        trf trfVar5 = wjfVar.c;
        if (z) {
            hnf hnfVarI = lgb.I(R.drawable.cs2_statistic_item_counter_terrorist_bg, 1L, trfVar4, ctf0Var, "STATISTIC_TABLET_COUNTER_TERRORIST_KEY", wjfVar3.f39260a, str5, true);
            hnf hnfVarI2 = lgb.I(R.drawable.cs2_statistic_item_terrorist_bg, 2L, trfVar5, ctf0Var, "STATISTIC_TABLET_TERRORIST_KEY", wjfVar.f39260a, str6, false);
            if (hnfVarI == null || hnfVarI2 == null) {
                return;
            }
            lc00Var.add(new psv("STATISTIC_TABLET_HEADER_KEY", R.string.statistic));
            lc00Var.add(hnfVarI);
            lc00Var.add(hnfVarI2);
            return;
        }
        trf trfVar6 = trfVar5;
        Iterable iterable = oix0.f25333a;
        Iterator it = iterable.iterator();
        do {
            if (!it.hasNext()) {
                j3 = 1;
                next = null;
                break;
            } else {
                next = it.next();
                j3 = 1;
            }
        } while (((inf) next).f15071a != j2);
        if (next == null) {
            iterable = iun.f15405a;
        } else if (!z2) {
            iterable = oix0.b;
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            inf infVar2 = (inf) it2.next();
            trf trfVar7 = trfVar6;
            Iterator it3 = it2;
            arrayList3.add(new lxl(infVar2.f15071a, (dyl) new xxl(ctf0Var.b.a(infVar2.b, Arrays.copyOf(new Object[0], 0))), false, ((long) infVar2.f15071a) == j2 ? uxl.b : uxl.f36445a, (cwl) null, 108));
            trfVar6 = trfVar7;
            it2 = it3;
        }
        trf trfVar8 = trfVar6;
        y3d y3dVar = null;
        lc00Var.add(new boo0("STATISTIC_TABS_KEY", new fyl(dyb.o0(arrayList3), null, null, s5x0.t(xfn.b(ctf0Var.j()).e, 0.0f, 2), new jyl(new y3d(ijg.M), y3dVar, y3dVar, 126), 6), pno0.f27299a));
        inf infVar3 = inf.STATISTIC;
        if (j2 == j3) {
            lmf lmfVarU = thb.u(1L, trfVar4, wjfVar3.f39260a, str5, R.drawable.cs2_statistic_item_counter_terrorist_bg, "COUNTER_TERRORIST_STATISTIC_KEY", true);
            lmf lmfVarU2 = thb.u(2L, trfVar8, wjfVar.f39260a, str6, R.drawable.cs2_statistic_item_terrorist_bg, "TERRORIST_STATISTIC_KEY", false);
            if (lmfVarU != null) {
                lc00Var.add(lmfVarU);
            }
            if (lmfVarU2 != null) {
                lc00Var.add(lmfVarU2);
                return;
            }
            return;
        }
        if (j2 == 2) {
            cof cofVarK = ckb.K(R.drawable.cs2_statistic_item_counter_terrorist_bg, 4L, trfVar4, ctf0Var, wjfVar3.f39260a, str5, "COUNTER_TERRORIST_WEAPON_KEY", true);
            cof cofVarK2 = ckb.K(R.drawable.cs2_statistic_item_terrorist_bg, 3L, trfVar8, ctf0Var, wjfVar.f39260a, str6, "TERRORIST_STATISTIC_WEAPON_KEY", false);
            if (cofVarK == null || cofVarK2 == null) {
                return;
            }
            lc00Var.add(cofVarK);
            lc00Var.add(cofVarK2);
        }
    }

    public static final mm40 N(mm40 mm40Var, bzl bzlVar, fet fetVar, int i) {
        mm40Var.getClass();
        bzlVar.getClass();
        sjj sjjVarA = wzk0.a(fetVar);
        nul0 nul0VarG0 = ro4.g0(1.0f, 1600.0f, null, 4);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
            fetVar.o0(objP);
        }
        vne vneVar = (vne) objP;
        boolean zBooleanValue = ((Boolean) ((Function0) ((hgk0) bzlVar.e).getValue()).invoke()).booleanValue();
        ma80 ma80Var = ma80.f21447a;
        int i2 = (i & 112) ^ 48;
        boolean z = true;
        boolean z2 = (i2 > 32 && fetVar.g(bzlVar)) || (i & 48) == 32;
        Object objP2 = fetVar.P();
        if (z2 || objP2 == obj) {
            objP2 = new edl(bzlVar, (byte) 12);
            fetVar.o0(objP2);
        }
        wel welVarB = uel.b((Function1) objP2, fetVar);
        boolean zI = ((i2 > 32 && fetVar.g(bzlVar)) || (i & 48) == 32) | fetVar.i(vneVar) | ((((i & 896) ^ 384) > 256 && fetVar.i(sjjVarA)) || (i & 384) == 256);
        if ((((i & 7168) ^ 3072) <= 2048 || !fetVar.i(nul0VarG0)) && (i & 3072) != 2048) {
            z = false;
        }
        boolean z3 = zI | z;
        Object objP3 = fetVar.P();
        if (z3 || objP3 == obj) {
            Object ezlVar = new ezl(vneVar, bzlVar, sjjVarA, nul0VarG0, null);
            fetVar.o0(ezlVar);
            objP3 = ezlVar;
        }
        return uel.a(mm40Var, welVarB, ma80Var, zBooleanValue, false, null, (xdr) objP3, 184);
    }

    public static final void O(LinearLayout linearLayout, ArrayList arrayList, List list) {
        Iterator it = new ihu0(linearLayout).iterator();
        int i = 0;
        while (true) {
            jhu0 jhu0Var = (jhu0) it;
            if (!jhu0Var.hasNext()) {
                int i2 = 0;
                for (Object obj : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    String str = (String) obj;
                    nth nthVar = (nth) CollectionsKt.W(i2, list);
                    if (nthVar == null) {
                        View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.cybergame_marble_games_header_title_item, (ViewGroup) linearLayout, false);
                        if (viewInflate == null) {
                            hny.u("rootView");
                            return;
                        }
                        TextView textView = (TextView) viewInflate;
                        nth nthVar2 = new nth(textView, textView);
                        linearLayout.addView(textView);
                        list.add(nthVar2);
                        nthVar = nthVar2;
                    }
                    nthVar.b.setText(str);
                    i2 = i3;
                }
                return;
            }
            Object next = jhu0Var.next();
            int i4 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ((View) next).setVisibility(i < arrayList.size() ? 0 : 8);
            i = i4;
        }
    }

    public static final void P(EventCardMiddleCyber eventCardMiddleCyber, nzr nzrVar) {
        eventCardMiddleCyber.setFirstTeamName(nzrVar.b);
        String str = nzrVar.c;
        Context context = eventCardMiddleCyber.getContext();
        context.getClass();
        LoadableShapeableImageView.i((DsTeamLogo) eventCardMiddleCyber.c.b, str, context.getDrawable(R.drawable.no_photo_new), 12);
    }

    public static final void Q(EventCardMiddleCyber eventCardMiddleCyber, ozr ozrVar) {
        eventCardMiddleCyber.setSecondTeamName(ozrVar.b);
        String str = ozrVar.c;
        Context context = eventCardMiddleCyber.getContext();
        context.getClass();
        LoadableShapeableImageView.i((DsTeamLogo) eventCardMiddleCyber.c.h, str, context.getDrawable(R.drawable.no_photo_new), 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object R(vld vldVar, androidx.compose.runtime.d dVar) {
        if (!((lm40) vldVar).f20279a.n) {
            xcx.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        bh90 bh90Var = (bh90) vcc.Z(vldVar).Y;
        bh90Var.getClass();
        return qbc.V(bh90Var, dVar);
    }

    public static int S(int i, float f, int i2) {
        if (i == i2 || f <= 0.0f) {
            return i;
        }
        if (f >= 1.0f) {
            return i2;
        }
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float fR = r(((i >> 16) & 255) / 255.0f);
        float fR2 = r(((i >> 8) & 255) / 255.0f);
        float fR3 = r((i & 255) / 255.0f);
        float fR4 = r(((i2 >> 16) & 255) / 255.0f);
        float fR5 = r(((i2 >> 8) & 255) / 255.0f);
        float fR6 = r((i2 & 255) / 255.0f);
        float fA = rw2.a(f3, f2, f, f2);
        float fA2 = rw2.a(fR4, fR, f, fR);
        float fA3 = rw2.a(fR5, fR2, f, fR2);
        float fA4 = rw2.a(fR6, fR3, f, fR3);
        float fD = D(fA2) * 255.0f;
        float fD2 = D(fA3) * 255.0f;
        return Math.round(D(fA4) * 255.0f) | (Math.round(fD) << 16) | (Math.round(fA * 255.0f) << 24) | (Math.round(fD2) << 8);
    }

    public static vqc T(c1a c1aVar) {
        c1aVar.getClass();
        int i = Build.VERSION.SDK_INT;
        vqc vqcVar = null;
        if (i >= 33) {
            CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES;
            key.getClass();
            DynamicRangeProfiles dynamicRangeProfilesE = r6e.e(((ow9) c1aVar).c(key));
            if (dynamicRangeProfilesE != null) {
                if (i < 33) {
                    c99.v(ua80.e(i, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher. is not supported on API ", " (requires API 33)"));
                    return null;
                }
                vqcVar = new vqc((Object) new egn(dynamicRangeProfilesE), (byte) 28);
            }
        }
        return vqcVar == null ? fgn.f9499a : vqcVar;
    }

    public static final long U(bgi0 bgi0Var, fet fetVar) {
        if (Intrinsics.d(bgi0Var, agi0.f827a)) {
            fetVar.e0(733664790);
            long separator = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator();
            fetVar.r(false);
            return separator;
        }
        if (Intrinsics.d(bgi0Var, zfi0.f44303a)) {
            fetVar.e0(733666776);
            long separator60 = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60();
            fetVar.r(false);
            return separator60;
        }
        if (Intrinsics.d(bgi0Var, yfi0.f42545a)) {
            fetVar.e0(733669042);
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            fetVar.r(false);
            return jM123getWhite0d7_KjU;
        }
        if (Intrinsics.d(bgi0Var, wfi0.f39073a)) {
            fetVar.e0(733671188);
            long jM126getWhite200d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m126getWhite200d7_KjU();
            fetVar.r(false);
            return jM126getWhite200d7_KjU;
        }
        if (Intrinsics.d(bgi0Var, xfi0.f40792a)) {
            fetVar.e0(733673396);
            long jM129getWhite400d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m129getWhite400d7_KjU();
            fetVar.r(false);
            return jM129getWhite400d7_KjU;
        }
        if (!Intrinsics.d(bgi0Var, vfi0.f37334a)) {
            throw b1j.f(733662834, fetVar, false);
        }
        fetVar.e0(733675604);
        long jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU();
        fetVar.r(false);
        return jM125getWhite100d7_KjU;
    }

    public static final boolean V(fof fofVar) {
        Object obj;
        Object next;
        fofVar.getClass();
        List list = fofVar.b.f34420a;
        List list2 = fofVar.c.f34420a;
        if (list.size() != 5 || list2.size() != 5) {
            return true;
        }
        Iterator it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((pqf) next).f27413a.length() != 0);
        if (next != null) {
            return true;
        }
        for (Object obj2 : list2) {
            if (((pqf) obj2).f27413a.length() == 0) {
                obj = obj2;
                break;
            }
        }
        return obj != null;
    }

    public static final boolean W(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= 128 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    public static final float X(String str, String str2, fet fetVar) {
        g9q0 g9q0VarN = pym0.n(fetVar);
        w6k w6kVar = (w6k) fetVar.k(bmd.h);
        boolean zG = fetVar.g(str) | fetVar.g(str2);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = twn.j(Math.max(w6kVar.r0((int) (g9q0.b(g9q0VarN, new j83(str), g1t0.a(), 0, false, 1, 0L, null, null, null, 2028).c >> 32)), w6kVar.r0((int) (g9q0.b(g9q0VarN, new j83(str2), g1t0.a(), 0, false, 1, 0L, null, null, null, 2028).c >> 32))), fetVar);
        }
        return ((ycl) objP).f42389a;
    }

    public static final String Y(String str) {
        str.getClass();
        int length = str.length() - 1;
        if (length < 0) {
            length = -1;
            break;
        }
        while (true) {
            int i = length - 1;
            if (str.charAt(length) == '.') {
                break;
            }
            if (i < 0) {
                length = -1;
                break;
            }
            length = i;
        }
        return length != -1 ? str.substring(length + 1) : "";
    }

    public static final bzl Z(fet fetVar) {
        oyq0 oyq0VarD = ob3.d(0, 7, fetVar);
        sjj sjjVarA = wzk0.a(fetVar);
        nul0 nul0VarG0 = ro4.g0(1.0f, 1600.0f, null, 4);
        boolean zG = fetVar.g(oyq0VarD) | fetVar.g(sjjVarA) | fetVar.g(nul0VarG0);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new bzl(oyq0VarD, sjjVarA, nul0VarG0);
            fetVar.o0(objP);
        }
        return (bzl) objP;
    }

    public static final void a(final String str, final n0x n0xVar, final boolean z, final long j, final long j2, y3d y3dVar, final Boolean bool, final boolean z2, final Function0 function0, xdr xdrVar, xdr xdrVar2, fet fetVar, final int i, final int i2) {
        y3d y3dVar2;
        int i3;
        xdr xdrVar3;
        final xdr xdrVar4;
        final y3d y3dVar3;
        long primary;
        boolean z3;
        Integer num;
        fet fetVar2 = fetVar;
        str.getClass();
        function0.getClass();
        fetVar2.g0(1378891259);
        int i4 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(n0xVar) ? 32 : 16) | (fetVar2.d(0.0f) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024) | (fetVar2.f(j) ? 16384 : 8192) | (fetVar2.f(j2) ? 131072 : 65536) | (fetVar2.g(null) ? 1048576 : 524288);
        int i5 = i2 & 128;
        if (i5 != 0) {
            i3 = i4 | 12582912;
            y3dVar2 = y3dVar;
        } else {
            y3dVar2 = y3dVar;
            i3 = i4 | (fetVar2.g(y3dVar2) ? 8388608 : 4194304);
        }
        int i6 = i3 | (fetVar2.g(bool) ? 67108864 : 33554432) | (fetVar2.h(z2) ? 536870912 : 268435456);
        int i7 = (fetVar2.i(function0) ? 4 : 2) | (fetVar2.i(xdrVar) ? 32 : 16) | (fetVar2.i(xdrVar2) ? 256 : 128);
        if (fetVar2.U(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 147) == 146) ? false : true)) {
            y3d y3dVar4 = i5 != 0 ? null : y3dVar2;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "DS_CHIP");
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarE0, 48.0f, 0.0f, 2);
            boolean z4 = (i6 & 1879048192) == 536870912;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new z((byte) 5, z2);
                fetVar2.o0(objP);
            }
            mm40 mm40VarL = s5x0.L(pai0.a(mm40VarG, true, (Function1) objP), 0.0f, 8.0f, 1);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
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
            mm40 mm40VarQ = i120.Q(o7k0.g(epv0.N(jm40Var, z ? 0.5f : 1.0f), 32.0f, 0.0f, 2), j, vgg0.a(14.0f));
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new zxb((byte) 6);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarY = y860.Y(mm40VarQ, false, null, null, (Function0) objP2, 14);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarY);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 16.0f, 0.0f, 8.0f, 0.0f, 10);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN, j2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, (i6 & 14) | ((i6 >> 9) & 896), 24960, 110584);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11);
            if (y3dVar4 != null) {
                primary = y3dVar4.f41946a;
            } else {
                pz40 pz40Var = s6t0.f31722a;
                primary = s6t0.b().f33626a.getPrimary();
            }
            fetVar2 = fetVar;
            y3d y3dVar5 = y3dVar4;
            ebc.b(mm40VarN2, primary, 0.0f, z, null, null, null, null, n0xVar, null, null, null, bool, function0, fetVar2, (i6 & 8064) | ((i6 << 21) & 234881024) | ((i6 << 9) & 1879048192), ((i6 >> 18) & 896) | ((i7 << 9) & 7168), 3312);
            fetVar2.r(true);
            jr8 jr8Var = jr8.f16991a;
            xdrVar4 = xdrVar;
            if (xdrVar4 == null) {
                fetVar2.e0(668674903);
                z3 = false;
                fetVar2.r(false);
                num = 6;
            } else {
                z3 = false;
                fetVar2.e0(668674904);
                num = 6;
                xdrVar4.F(jr8Var, fetVar2, 6);
                fetVar2.r(false);
            }
            xdrVar3 = xdrVar2;
            if (xdrVar3 == null) {
                fetVar2.e0(668746327);
                fetVar2.r(z3);
            } else {
                fetVar2.e0(668746328);
                xdrVar3.F(jr8Var, fetVar2, num);
                fetVar2.r(z3);
            }
            fetVar2.r(true);
            y3dVar3 = y3dVar5;
        } else {
            xdrVar3 = xdrVar2;
            xdrVar4 = xdrVar;
            fetVar2.X();
            y3dVar3 = y3dVar2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final xdr xdrVar5 = xdrVar3;
            yfe0VarU.d = new Function2(str, n0xVar, z, j, j2, y3dVar3, bool, z2, function0, xdrVar4, xdrVar5, i, i2) { // from class: a.lbc

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f19748a;
                public final /* synthetic */ n0x b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ y3d f;
                public final /* synthetic */ Boolean g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ xdr j;
                public final /* synthetic */ xdr k;
                public final /* synthetic */ short l;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.l = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    mbc.a(this.f19748a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (fet) obj, iL, this.l);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final ddd a0(abm abmVar, fet fetVar) {
        String strL;
        long jM123getWhite0d7_KjU;
        zam zamVar = zam.f44076a;
        boolean zE = fetVar.e(1) | fetVar.g(abmVar);
        Object objP = fetVar.P();
        if (zE || objP == ukd.f35823a) {
            Double d = abmVar.f586a;
            if (d == null) {
                strL = "-";
            } else {
                zam zamVar2 = zam.f44076a;
                strL = ttm0.L(4, StringsKt.e0(String.valueOf(d.doubleValue()), ".0"));
                if (StringsKt.R(strL, '.')) {
                    strL = ttm0.H(1, strL);
                }
            }
            int iOrdinal = abmVar.b.ordinal();
            if (iOrdinal == 0) {
                pz40 pz40Var = s6t0.f31722a;
                jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                pz40 pz40Var2 = s6t0.f31722a;
                jM123getWhite0d7_KjU = ijg.s0;
            }
            objP = new ddd(strL, jM123getWhite0d7_KjU);
            fetVar.o0(objP);
        }
        return (ddd) objP;
    }

    public static final void b(ddd dddVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(104345462);
        int i2 = i | (fetVar2.g(dddVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var, 40.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
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
            mm40 mm40VarT = o7k0.t(jm40Var, 30.0f, 40.0f);
            pz40 pz40Var = s6t0.f31722a;
            long jM125getWhite100d7_KjU = StaticColors.INSTANCE.m125getWhite100d7_KjU();
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarT, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f, 2.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarK);
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
            v8q0.a(dddVar.f5891a, null, dddVar.b, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i3l(dddVar, i, (byte) 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object b0(oyq0 oyq0Var, float f, sjj sjjVar, nul0 nul0Var, zje zjeVar) {
        fzl fzlVar;
        jie0 jie0Var;
        jie0 jie0Var2;
        if (zjeVar instanceof fzl) {
            fzlVar = (fzl) zjeVar;
            int i = fzlVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                fzlVar.n = i - Integer.MIN_VALUE;
            } else {
                fzlVar = new fzl(zjeVar);
            }
        } else {
            fzlVar = new fzl(zjeVar);
        }
        fzl fzlVar2 = fzlVar;
        Object obj = fzlVar2.m;
        wne wneVar = wne.f39444a;
        int i2 = fzlVar2.n;
        byte b = 2;
        if (i2 != 0) {
            if (i2 == 1) {
                f = fzlVar2.l;
                jie0 jie0Var3 = fzlVar2.k;
                nul0Var = fzlVar2.j;
                oyq0 oyq0Var2 = fzlVar2.i;
                z1x.P(obj);
                jie0Var = jie0Var3;
                oyq0Var = oyq0Var2;
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jie0Var2 = fzlVar2.k;
                z1x.P(obj);
            }
            jie0Var = jie0Var2;
            return new g6u0(wpm0.g(0.0f, jie0Var.f16571a));
        }
        z1x.P(obj);
        if (oyq0Var.a() < 0.01f || oyq0Var.a() == 1.0f) {
            return new g6u0(0L);
        }
        jie0Var = new jie0();
        jie0Var.f16571a = f;
        if (sjjVar != null && Math.abs(f) > 1.0f) {
            jie0 jie0Var4 = new jie0();
            l73 l73VarD = x4d0.d(0.0f, f, 28);
            ib3 ib3Var = new ib3(jie0Var4, oyq0Var, jie0Var, b);
            fzlVar2.i = oyq0Var;
            fzlVar2.j = nul0Var;
            fzlVar2.k = jie0Var;
            fzlVar2.l = f;
            fzlVar2.n = 1;
            if (hhm0.o(l73VarD, sjjVar, false, ib3Var, fzlVar2) != wneVar) {
            }
            return wneVar;
        }
        return new g6u0(wpm0.g(0.0f, jie0Var.f16571a));
        nul0 nul0Var2 = nul0Var;
        if (nul0Var2 != null) {
            agk0 agk0Var = oyq0Var.c;
            if (agk0Var.l() < 0.0f && agk0Var.l() > oyq0Var.f26070a) {
                l73 l73VarD2 = x4d0.d(agk0Var.l(), 0.0f, 30);
                Float f2 = new Float(oyq0Var.a() < 0.5f ? 0.0f : oyq0Var.f26070a);
                jb3 jb3Var = new jb3(oyq0Var, b);
                fzlVar2.i = null;
                fzlVar2.j = null;
                fzlVar2.k = jie0Var;
                fzlVar2.l = f;
                fzlVar2.n = 2;
                if (hhm0.q(l73VarD2, f2, nul0Var2, false, jb3Var, fzlVar2, 4) != wneVar) {
                    jie0Var2 = jie0Var;
                    jie0Var = jie0Var2;
                }
                return wneVar;
            }
        }
        return new g6u0(wpm0.g(0.0f, jie0Var.f16571a));
    }

    public static final void c(float f, long j, bzl bzlVar, ugd ugdVar, fet fetVar, int i) {
        int i2;
        bzlVar.getClass();
        fetVar.g0(1227330007);
        if ((i & 6) == 0) {
            i2 = (fetVar.d(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(bzlVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            float fB = pkd.b(f, fetVar);
            if (fB < 0.0f) {
                fB = 0.0f;
            }
            Boolean bool = (Boolean) ((Function0) ((hgk0) bzlVar.e).getValue()).invoke();
            boolean zBooleanValue = bool.booleanValue();
            Float fValueOf = Float.valueOf(fB);
            boolean zH = fetVar.h(zBooleanValue) | ((i2 & 896) == 256) | fetVar.d(fB);
            Object objP = fetVar.P();
            if (zH || objP == ukd.f35823a) {
                objP = new qu2(zBooleanValue, bzlVar, fB, (yje) null);
                fetVar.o0(objP);
            }
            m0x0.v(fValueOf, bool, (Function2) objP, fetVar);
            gmn0.a(null, null, j, 0L, 0.0f, 0.0f, null, u1c.M(1655203698, new zv(f, (Object) bzlVar, ugdVar, (byte) 5), fetVar), fetVar, ((i2 << 3) & 896) | 12582912, 123);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new czl(f, j, bzlVar, ugdVar, i, (byte) 0);
        }
    }

    public static boolean c0() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Google")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Google")) {
                return false;
            }
        }
        String str3 = Build.MODEL;
        str3.getClass();
        String upperCase = str3.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return ExtraSupportedSurfaceCombinationsQuirk.c.contains(upperCase);
    }

    public static final void d(mm40 mm40Var, k7h k7hVar, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(573871646);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(k7hVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Iterator it = k7hVar.b.iterator();
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i3 = -1;
                    break;
                } else if (((q5h) it.next()).c) {
                    break;
                } else {
                    i3++;
                }
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 48.0f), 12.0f, 0.0f, 2);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new nbh0(8.0f, 0.0f, y3d.f);
                fetVar.o0(objP);
            }
            qxw.n(mm40VarL, i3, (nbh0) objP, null, false, x4d0.b, u1c.M(1549581152, new kbg(k7hVar, function1, b), fetVar), fetVar, 1769856);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var, k7hVar, function1, i, (byte) 25);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:? A[LOOP:0: B:7:0x002d->B:16:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    public static boolean d0() {
        String upperCase;
        Iterator it;
        String str = Build.MANUFACTURER;
        str.getClass();
        if (str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.MODEL;
            str2.getClass();
            upperCase = str2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            it = ExtraSupportedSurfaceCombinationsQuirk.d.iterator();
            while (it.hasNext()) {
                if (kotlin.text.c.x(upperCase, (String) it.next(), false)) {
                    return true;
                }
            }
        } else {
            String str3 = Build.BRAND;
            str3.getClass();
            if (str3.equalsIgnoreCase("Samsung")) {
                String str4 = Build.MODEL;
                str4.getClass();
                upperCase = str4.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                it = ExtraSupportedSurfaceCombinationsQuirk.d.iterator();
                while (it.hasNext()) {
                    if (kotlin.text.c.x(upperCase, (String) it.next(), false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final void e(int i, fet fetVar, boolean z) {
        fet fetVar2;
        fetVar.g0(1572276599);
        int i2 = (fetVar.h(z) ? 4 : 2) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40.b, 6.0f, 0.0f, 4.0f, 0.0f, 10), 20.0f);
            pm80 pm80VarF = a8k0.F(R.drawable.cyber_ic_popular, 0, fetVar);
            pz40 pz40Var = s6t0.f31722a;
            fetVar2 = fetVar;
            dww.c(pm80VarF, null, mm40VarN, z ? s6t0.b().f33626a.getPrimaryForeground() : s6t0.b().f33626a.getPrimary(), fetVar2, 56, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new obg(b, i, z);
        }
    }

    public static final a980 e0(qkt qktVar, boolean z) {
        qktVar.getClass();
        int i = qktVar.f28902a;
        StringBuilder sb = new StringBuilder(ujn.h);
        String str = qktVar.f;
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
        String string = sb.toString();
        String str2 = qktVar.c;
        String str3 = qktVar.h.d;
        return new a980(i, string, str2, str3, str3, z);
    }

    public static final void f(mm40 mm40Var, float f, float f2, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, ugd ugdVar5, ugd ugdVar6, ugd ugdVar7, ugd ugdVar8, fet fetVar, int i, int i2, int i3) {
        nw3 nw3Var = uc9.g;
        float f3 = (i3 & 4) != 0 ? 0.65f : f;
        float f4 = (i3 & 8) != 0 ? 0.35f : f2;
        yx7 yx7Var = gqw0.k;
        xdr xdrVar = (i3 & 64) != 0 ? null : ugdVar2;
        xdr xdrVar2 = (i3 & 128) != 0 ? null : ugdVar3;
        ugd ugdVar9 = (i3 & 256) != 0 ? null : ugdVar4;
        ugd ugdVar10 = (i3 & 512) != 0 ? null : ugdVar5;
        ugd ugdVar11 = (i3 & 1024) == 0 ? ugdVar6 : null;
        thg0 thg0VarA = shg0.a(nw3Var, gqw0.j, fetVar, ((i & 126) >> 3) & 14);
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
        jpm0.o(fetVar, thg0VarA, shdVar);
        shd shdVar2 = gqw0.w;
        jpm0.o(fetVar, bh90VarM, shdVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        shd shdVar3 = gqw0.y;
        jpm0.o(fetVar, numValueOf, shdVar3);
        jpm0.n(fetVar);
        shd shdVar4 = gqw0.v;
        jpm0.o(fetVar, mm40VarC0, shdVar4);
        zhg0 zhg0Var = zhg0.f44392a;
        jm40 jm40Var = jm40.b;
        xdr xdrVar3 = ugdVar11;
        mm40 mm40VarA = zhg0Var.a(f3, jm40Var, true);
        xdr xdrVar4 = ugdVar10;
        int i4 = 6 | (((((i >> 6) & 896) | 48) >> 3) & 112);
        thg0 thg0VarA2 = shg0.a(uc9.f35418a, yx7Var, fetVar, i4);
        xdr xdrVar5 = ugdVar9;
        int iHashCode2 = Long.hashCode(fetVar.T);
        bh90 bh90VarM2 = fetVar.m();
        mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarA);
        fetVar.i0();
        if (fetVar.S) {
            fetVar.l(pcyVar);
        } else {
            fetVar.r0();
        }
        jpm0.o(fetVar, thg0VarA2, shdVar);
        jpm0.o(fetVar, bh90VarM2, shdVar2);
        jpm0.o(fetVar, Integer.valueOf(iHashCode2), shdVar3);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC1, shdVar4);
        fetVar.e0(-137791909);
        ugdVar.F(zhg0Var, fetVar, Integer.valueOf(6 | ((i >> 12) & 112)));
        fetVar.r(false);
        if (xdrVar == null) {
            fetVar.e0(23449862);
        } else {
            fetVar.e0(-137790885);
            xdrVar.F(zhg0Var, fetVar, Integer.valueOf(6 | ((i >> 15) & 112)));
        }
        fetVar.r(false);
        if (xdrVar2 == null) {
            fetVar.e0(23481606);
        } else {
            fetVar.e0(-137789861);
            xdrVar2.F(zhg0Var, fetVar, Integer.valueOf(6 | ((i >> 18) & 112)));
        }
        fetVar.r(false);
        fetVar.r(true);
        mm40 mm40VarA2 = zhg0Var.a(f4, jm40Var, true);
        thg0 thg0VarA3 = shg0.a(uc9.b, yx7Var, fetVar, i4);
        int iHashCode3 = Long.hashCode(fetVar.T);
        bh90 bh90VarM3 = fetVar.m();
        mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarA2);
        fetVar.i0();
        if (fetVar.S) {
            fetVar.l(pcyVar);
        } else {
            fetVar.r0();
        }
        jpm0.o(fetVar, thg0VarA3, shdVar);
        jpm0.o(fetVar, bh90VarM3, shdVar2);
        jpm0.o(fetVar, Integer.valueOf(iHashCode3), shdVar3);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC2, shdVar4);
        if (xdrVar5 == null) {
            fetVar.e0(68912125);
        } else {
            fetVar.e0(279317636);
            xdrVar5.F(zhg0Var, fetVar, Integer.valueOf(6 | ((i >> 21) & 112)));
        }
        fetVar.r(false);
        if (xdrVar4 == null) {
            fetVar.e0(68943869);
        } else {
            fetVar.e0(279318660);
            xdrVar4.F(zhg0Var, fetVar, Integer.valueOf(6 | ((i >> 24) & 112)));
        }
        fetVar.r(false);
        if (xdrVar3 == null) {
            fetVar.e0(68975613);
        } else {
            fetVar.e0(279319684);
            xdrVar3.F(zhg0Var, fetVar, Integer.valueOf(6 | ((i2 << 3) & 112)));
        }
        fetVar.r(false);
        fetVar.e0(279320708);
        ugdVar7.F(zhg0Var, fetVar, 54);
        fetVar.r(false);
        fetVar.e0(279321732);
        ugdVar8.F(zhg0Var, fetVar, 54);
        ohs0.x(fetVar, false, true, true);
    }

    public static final dav f0(jav javVar) {
        aav aavVar;
        fav favVar;
        javVar.getClass();
        List list = javVar.f16209a;
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = javVar.b;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        Integer num = javVar.i;
        if (num != null && num.intValue() == 0) {
            aavVar = aav.f550a;
        } else if (num != null && num.intValue() == 1) {
            aavVar = aav.d;
        } else if (num != null && num.intValue() == 2) {
            aavVar = aav.b;
        } else {
            aavVar = (num != null && num.intValue() == 3) ? aav.c : aav.f550a;
        }
        Integer num2 = javVar.c;
        int iIntValue = num2 != null ? num2.intValue() : 0;
        Integer num3 = javVar.j;
        int iIntValue2 = num3 != null ? num3.intValue() : -1;
        Integer num4 = javVar.k;
        int iIntValue3 = num4 != null ? num4.intValue() : -1;
        Integer num5 = javVar.d;
        if (num5 != null && num5.intValue() == 1) {
            favVar = fav.f9228a;
        } else {
            favVar = (num5 != null && num5.intValue() == 2) ? fav.b : fav.c;
        }
        Integer num6 = javVar.e;
        int iIntValue4 = num6 != null ? num6.intValue() : -1;
        Integer num7 = javVar.f;
        int iIntValue5 = num7 != null ? num7.intValue() : 0;
        List list3 = javVar.h;
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        List list4 = javVar.g;
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        return new dav(list, list2, aavVar, iIntValue, iIntValue2, iIntValue3, favVar, iIntValue4, iIntValue5, list3, list4);
    }

    public static final void g(final yhg0 yhg0Var, final mm40 mm40Var, final String str, final boolean z, final long j, final long j2, y9q0 y9q0Var, final y9q0 y9q0Var2, fet fetVar, final int i) {
        int i2;
        y9q0 y9q0Var3;
        y9q0 y9q0Var4;
        str.getClass();
        fetVar.g0(-1170590409);
        if ((i & 48) == 0) {
            i2 = (fetVar.g(mm40Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        long j3 = j;
        if ((i & 24576) == 0) {
            i2 |= fetVar.f(j3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.f(j2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            y9q0Var3 = y9q0Var;
            i2 |= fetVar.g(y9q0Var3) ? 1048576 : 524288;
        } else {
            y9q0Var3 = y9q0Var;
        }
        if ((12582912 & i) == 0) {
            y9q0Var4 = y9q0Var2;
            i2 |= fetVar.g(y9q0Var4) ? 8388608 : 4194304;
        } else {
            y9q0Var4 = y9q0Var2;
        }
        if (fetVar.U(i2 & 1, (4793489 & i2) != 4793488)) {
            if (!z) {
                j3 = j2;
            }
            v8q0.a(str, mm40Var, j3, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, z ? y9q0Var3 : y9q0Var4, fetVar, ((i2 >> 6) & 14) | (i2 & 112), 24576, 114680);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final y9q0 y9q0Var5 = y9q0Var3;
            yfe0VarU.d = new Function2() { // from class: a.nbg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mbc.g(yhg0Var, mm40Var, str, z, j, j2, y9q0Var5, y9q0Var2, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static swq g0(g950 g950Var) {
        g950Var.getClass();
        String strB = g950Var.b();
        strB.getClass();
        return new swq(new twq(strB, swq.c.f32934a, g950Var));
    }

    public static final void h(mm40 mm40Var, String str, String str2, y3d y3dVar, fet fetVar, int i, int i2) {
        int i3;
        y3d y3dVar2;
        int i4;
        fet fetVar2;
        y3d y3dVar3;
        str.getClass();
        str2.getClass();
        fetVar.g0(168553543);
        if ((i & 6) == 0) {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i3 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i4 = i5 | 3072;
            y3dVar2 = y3dVar;
        } else {
            y3dVar2 = y3dVar;
            i4 = i5 | (fetVar.g(y3dVar2) ? 2048 : 1024);
        }
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            y3d y3dVar4 = i6 != 0 ? null : y3dVar2;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(vic.w(o7k0.e(mm40Var, 40.0f)), 8.0f, 6.0f);
            byte b = 14;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b));
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            x7z x7zVar = new x7z(1.0f, true);
            thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4(b)), yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVar);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            if (y3dVar4 == null) {
                fetVar.e0(339096719);
                fetVar.r(false);
            } else {
                fetVar.e0(339096720);
                kbc.e(0, y3dVar4.f41946a, fetVar, null);
                fetVar.r(false);
            }
            y3d y3dVar5 = y3dVar4;
            long j = iph.f;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, (i4 >> 3) & 14, 24960, 110586);
            fetVar.r(true);
            mm40 mm40VarU = o7k0.u(jm40.b, 0.0f, 70.0f, 1);
            long j2 = iph.g;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, mm40VarU, j2, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, (i4 >> 6) & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            y3dVar3 = y3dVar5;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            y3dVar3 = y3dVar2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lph(mm40Var, str, str2, y3dVar3, i, i2, (byte) 0);
        }
    }

    public static final void i(mm40 mm40Var, u3i u3iVar, u3i u3iVar2, String str, Function1 function1, fet fetVar, int i) {
        int i2;
        int i3;
        int i4;
        function1.getClass();
        fetVar.g0(1776820430);
        int i5 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(u3iVar) ? 32 : 16) | (fetVar.g(u3iVar2) ? 256 : 128) | (fetVar.g(str) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i5 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i5 & 1, (i5 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.L(mm40Var, 2.0f, 0.0f, 2), 36.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jm40 jm40Var = jm40.b;
            if (str == null || str.length() == 0) {
                i2 = 0;
                fetVar.e0(-799258770);
                fetVar.r(false);
            } else {
                fetVar.e0(-799629716);
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(1320290735, new g0(str, (byte) 25), fetVar), fetVar, 56);
                qxw.o(fetVar, o7k0.s(jm40Var, 20.0f));
                i2 = 0;
                fetVar.r(false);
            }
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, i2);
            int i6 = i5;
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarB);
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
            boolean z2 = u3iVar instanceof z3i;
            cl5 cl5Var = ukd.f35823a;
            if (z2) {
                fetVar.e0(-1208867262);
                int iOrdinal = ((z3i) u3iVar).f43719a.ordinal();
                if (iOrdinal == 0) {
                    i4 = R.drawable.ic_glyph_notification_active;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    i4 = R.drawable.ic_glyph_notification_inactive;
                }
                boolean z3 = ((i6 & 57344) == 16384) | ((i6 & 112) == 32);
                Object objP = fetVar.P();
                if (z3 || objP == cl5Var) {
                    objP = new brh(function1, u3iVar, (byte) 2);
                    fetVar.o0(objP);
                }
                j(i4, 0, fetVar, null, (Function0) objP);
                fetVar.r(false);
            } else {
                fetVar.e0(-1208459798);
                fetVar.r(false);
            }
            if (u3iVar2 instanceof x3i) {
                fetVar.e0(-1208361776);
                int iOrdinal2 = ((x3i) u3iVar2).f40219a.ordinal();
                if (iOrdinal2 == 0) {
                    i3 = R.drawable.ic_glyph_favourite_active;
                } else {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return;
                    }
                    i3 = R.drawable.ic_glyph_favourite_inactive;
                }
                boolean z4 = ((i6 & 896) == 256) | ((57344 & i6) == 16384);
                Object objP2 = fetVar.P();
                if (z4 || objP2 == cl5Var) {
                    objP2 = new arh(function1, u3iVar2, (byte) 2);
                    fetVar.o0(objP2);
                }
                j(i3, 0, fetVar, null, (Function0) objP2);
                fetVar.r(false);
            } else {
                fetVar.e0(-1207967766);
                fetVar.r(false);
            }
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new geb(mm40Var, u3iVar, u3iVar2, str, function1, i, (byte) 1);
        }
    }

    public static final void j(int i, int i2, fet fetVar, mm40 mm40Var, Function0 function0) {
        mm40 mm40Var2;
        fetVar.g0(-76098654);
        int i3 = i2 | 6 | (fetVar.e(i) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            wul wulVar = new wul(qul.e, oe9.c, new te9(i), true, false, false);
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new b1i(function0, (byte) 4);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            qzb.n(jm40Var, wulVar, (Function0) objP, fetVar, 6, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wb5(mm40Var2, i, function0, i2, (byte) 3);
        }
    }

    public static final void k(String str, String str2, int i, mm40 mm40Var, y9q0 y9q0Var, y9q0 y9q0Var2, long j, fet fetVar, int i2) {
        int i3;
        y9q0 y9q0Var3;
        y9q0 y9q0Var4;
        long j2;
        int i4;
        y9q0 y9q0VarA;
        y9q0 y9q0Var5;
        long j3;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        fetVar2.g0(962647484);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.g(mm40Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= 524288;
        }
        if (fetVar2.U(i3 & 1, (599187 & i3) != 599186)) {
            fetVar2.Z();
            if ((i2 & 1) == 0 || fetVar2.B()) {
                y9q0 y9q0Var6 = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
                StaticColors staticColors = StaticColors.INSTANCE;
                y9q0 y9q0VarA2 = y9q0.a(y9q0Var6, staticColors.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                i4 = i3 & (-4186113);
                y9q0VarA = y9q0.a(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), staticColors.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                y9q0Var5 = y9q0VarA2;
                j3 = qmk.o;
            } else {
                fetVar2.X();
                i4 = i3 & (-4186113);
                y9q0Var5 = y9q0Var;
                y9q0VarA = y9q0Var2;
                j3 = j;
            }
            int i5 = i4;
            fetVar2.s();
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jm40 jm40Var = jm40.b;
            v8q0.a(str, o7k0.d(o7k0.w(jm40Var, null, false, 3), 1.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(i), 0L, 2, false, 1, 0, null, y9q0Var5, fetVar2, (i5 & 14) | 48, ((i5 >> 6) & 14) | 28032, 101372);
            zcl zclVar = qmk.f28987a;
            y9q0 y9q0Var7 = y9q0VarA;
            long j4 = j3;
            fetVar2 = fetVar;
            aad.e(str2, ua80.d(jm40Var, 2.0f, fetVar2, jm40Var, 1.0f), y9q0.a(y9q0VarA, 0L, 0L, null, null, null, 0L, null, null, i, 0, 0L, null, null, 16744447), null, 2, false, 1, 0, null, new n05(j4, y9q0Var7.f42262a.b, idm0.t(1)), fetVar2, ((i5 >> 3) & 14) | 1597488, 424);
            fetVar2.r(true);
            y9q0Var4 = y9q0Var7;
            j2 = j4;
            y9q0Var3 = y9q0Var5;
        } else {
            fetVar2.X();
            y9q0Var3 = y9q0Var;
            y9q0Var4 = y9q0Var2;
            j2 = j;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ayj(str, str2, i, mm40Var, y9q0Var3, y9q0Var4, j2, i2);
        }
    }

    public static final void l(mm40 mm40Var, psk pskVar, l7m0 l7m0Var, l7m0 l7m0Var2, float f, float f2, float f3, Function0 function0, Function0 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        qja qjaVar;
        boolean z;
        Object objJ;
        boolean z2;
        Object objJ2;
        l7m0 l7m0Var3;
        byte b;
        qja qjaVar2 = qja.j;
        pskVar.getClass();
        l7m0Var.getClass();
        l7m0Var2.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-2101929301);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pskVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(l7m0Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.d(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.d(f2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.d(f3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.i(function1) ? 67108864 : 33554432;
        }
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            long jM121getTransparent0d7_KjU = afn0.p(fetVar).m121getTransparent0d7_KjU();
            oms0 oms0VarZ = phu0.Z(l7m0Var.getValue(), null, fetVar, 0, 2);
            pz40 pz40Var = oms0VarZ.d;
            p4 p4Var = oms0VarZ.f25519a;
            hgk0 hgk0Var = (hgk0) pz40Var;
            long jP = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.B(fetVar, 1717400770, fetVar), afn0.m(fetVar).getSecondary());
            fetVar.r(false);
            Object objF = y3d.f(jP);
            boolean zG = fetVar.g(objF);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                s43 s43Var = new s43(objF, (byte) 2);
                qjaVar = qjaVar2;
                objP = kng0.d(qjaVar, s43Var, fetVar);
            } else {
                qjaVar = qjaVar2;
            }
            lxs0 lxs0Var = (lxs0) objP;
            if (oms0VarZ.h()) {
                lxs0Var = lxs0Var;
                z = false;
                objJ = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG2 = fetVar.g(oms0VarZ);
                objJ = fetVar.P();
                if (zG2 || objJ == obj) {
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
                z = false;
                fetVar.r(false);
            }
            int i3 = i2;
            y3d y3dVar = new y3d(twn.i(fetVar, twn.B(fetVar, 1717400770, fetVar), ((Number) objJ).floatValue(), z));
            boolean zG3 = fetVar.g(oms0VarZ);
            Object objP2 = fetVar.P();
            if (zG3 || objP2 == obj) {
                objP2 = jgk0.b(new elb(oms0VarZ, (byte) 16));
                fetVar.o0(objP2);
            }
            y3d y3dVar2 = new y3d(twn.i(fetVar, twn.B(fetVar, 1717400770, fetVar), ((Number) ((l7m0) objP2).getValue()).floatValue(), false));
            boolean zG4 = fetVar.g(oms0VarZ);
            Object objP3 = fetVar.P();
            byte b2 = 17;
            if (zG4 || objP3 == obj) {
                objP3 = jgk0.b(new elb(oms0VarZ, b2));
                fetVar.o0(objP3);
            }
            cms0 cms0VarE = phu0.E(oms0VarZ, y3dVar, y3dVar2, w6x.k((ams0) ((l7m0) objP3).getValue(), fetVar, 734674978, false), lxs0Var, fetVar, 0);
            long jP2 = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.h(fetVar, -983062064, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            Object objF2 = y3d.f(jP2);
            boolean zG5 = fetVar.g(objF2);
            Object objP4 = fetVar.P();
            if (zG5 || objP4 == obj) {
                objP4 = kng0.d(qjaVar, new s43(objF2, (byte) 2), fetVar);
            }
            lxs0 lxs0Var2 = (lxs0) objP4;
            if (oms0VarZ.h()) {
                z2 = false;
                objJ2 = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG6 = fetVar.g(oms0VarZ);
                objJ2 = fetVar.P();
                if (zG6 || objJ2 == obj) {
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
                z2 = false;
                fetVar.r(false);
            }
            long jP3 = fbc.P(((Number) objJ2).floatValue(), twn.h(fetVar, -983062064, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(z2);
            y3d y3dVar3 = new y3d(jP3);
            boolean zG7 = fetVar.g(oms0VarZ);
            Object objP5 = fetVar.P();
            if (zG7 || objP5 == obj) {
                objP5 = jgk0.b(new elb(oms0VarZ, (byte) 18));
                fetVar.o0(objP5);
            }
            long jP4 = fbc.P(((Number) ((l7m0) objP5).getValue()).floatValue(), twn.h(fetVar, -983062064, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            y3d y3dVar4 = new y3d(jP4);
            boolean zG8 = fetVar.g(oms0VarZ);
            Object objP6 = fetVar.P();
            if (zG8 || objP6 == obj) {
                objP6 = jgk0.b(new elb(oms0VarZ, (byte) 19));
                fetVar.o0(objP6);
            }
            cms0 cms0VarE2 = phu0.E(oms0VarZ, y3dVar3, y3dVar4, w6x.k((ams0) ((l7m0) objP6).getValue(), fetVar, -480920272, false), lxs0Var2, fetVar, 0);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var, 1.0f), "DISCIPLINE_DETAILS_ICON_FOCUS_TOOLBAR");
            boolean z3 = (i3 & 896) == 256;
            Object objP7 = fetVar.P();
            if (z3 || objP7 == obj) {
                l7m0Var3 = l7m0Var;
                b = 16;
                objP7 = new x1d(l7m0Var3, b);
                fetVar.o0(objP7);
            } else {
                l7m0Var3 = l7m0Var;
                b = 16;
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP7);
            fbn fbnVar = new fbn(new za3(f, f3, (byte) 17));
            fbn fbnVar2 = new fbn(new za3(f2, f3, b));
            float fFloatValue = ((Number) l7m0Var3.getValue()).floatValue();
            lwf lwfVar = lwf.o;
            Object objP8 = fetVar.P();
            if (objP8 == obj) {
                objP8 = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                fetVar.o0(objP8);
            }
            pz40 pz40Var2 = (pz40) objP8;
            Object objP9 = fetVar.P();
            Object obj2 = objP9;
            if (objP9 == obj) {
                nie0 nie0Var = new nie0();
                nie0Var.f23583a = cmd.f4598a;
                fetVar.o0(nie0Var);
                obj2 = nie0Var;
            }
            nie0 nie0Var2 = (nie0) obj2;
            n6x.b(fbnVar, fbnVar2, fFloatValue, false, false, false, mm40VarA, pz40Var2, nie0Var2, lwfVar, u1c.M(284503157, new qqk(pz40Var2, lwfVar, nie0Var2, pskVar, l7m0Var3, l7m0Var2, jM121getTransparent0d7_KjU, function0, cms0VarE, cms0VarE2, function1), fetVar), fetVar, 24576);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xpk(mm40Var2, pskVar, l7m0Var, l7m0Var2, f, f2, f3, function0, function1, i);
        }
    }

    public static final void m(mm40 mm40Var, yql yqlVar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-637588634);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(yqlVar) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            zcl zclVar = qmk.f28987a;
            nkb.h(s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14), new hjm(yqlVar.c, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar, 384, 56);
            sql sqlVar = yqlVar.f43081a;
            fetVar2 = fetVar;
            C(null, sqlVar.f32635a, sqlVar.b, sqlVar.c, fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nql(mm40Var, yqlVar, i, b);
        }
    }

    public static final void n(xam xamVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        xamVar.getClass();
        fetVar2.g0(-1521444073);
        int i2 = i | (fetVar2.g(xamVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zam zamVar = zam.f44076a;
            ddd dddVarA0 = a0(xamVar.b, fetVar2);
            ddd dddVarA1 = a0(xamVar.c, fetVar2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarT = o7k0.t(o7k0.e(jm40.b, 16.0f), 140.0f, 198.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarT);
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
            b(dddVarA0, fetVar2, 0);
            x7z x7zVar = new x7z(1.0f, true);
            String str = xamVar.f40563a;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, x7zVar, StaticColors.INSTANCE.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 384, 125944);
            fetVar2 = fetVar;
            b(dddVarA1, fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i3l(xamVar, i, (byte) 11);
        }
    }

    public static final void o(bgi0 bgi0Var, mm40 mm40Var, boolean z, fet fetVar, int i, int i2) {
        bgi0Var.getClass();
        if ((i2 & 2) != 0) {
            mm40Var = jm40.b;
        }
        mm40 mm40Var2 = mm40Var;
        if ((i2 & 4) != 0) {
            z = true;
        }
        if (z) {
            fetVar.e0(1581733838);
            zcl zclVar = qmk.f28987a;
            jcb.v(mm40Var2, 1.0f, U(bgi0Var, fetVar), fetVar, (i >> 3) & 14, 0);
            fetVar.r(false);
            return;
        }
        fetVar.e0(1581907376);
        zcl zclVar2 = qmk.f28987a;
        jcb.H(mm40Var2, 1.0f, U(bgi0Var, fetVar), fetVar, (i >> 3) & 14, 0);
        fetVar.r(false);
    }

    public static final void p(mm40 mm40Var, cxm cxmVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-943079990);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(cxmVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40Var, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            byte b = 14;
            qw3 qw3Var = new qw3(4.0f, true, new jf4(b));
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(qw3Var, xx7Var, fetVar, 0);
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
            jm40 jm40Var = jm40.b;
            A(o7k0.e(jm40Var, 16.0f), cxmVar.f5127a, fetVar, 0);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b)), gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
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
            mm40 mm40VarH = dw9.h(1.0f, o7k0.e(jm40Var, 70.0f), true);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, false, new gne(gqw0.l, (byte) 11)), xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarH);
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
            E(o7k0.e(jm40Var, 24.0f), cxmVar.b, fetVar, 0);
            E(o7k0.e(jm40Var, 24.0f), cxmVar.c, fetVar, 0);
            fetVar.r(true);
            v(null, cxmVar.d, cxmVar.e, fetVar, 0);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 12, i, mm40Var, cxmVar);
        }
    }

    public static final void q(mm40 mm40Var, k2n k2nVar, k2n k2nVar2, String str, String str2, fet fetVar, int i) {
        int i2;
        k2n k2nVar3;
        String str3 = k2nVar.d;
        String str4 = k2nVar2.d;
        str.getClass();
        fetVar.g0(-264962309);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(k2nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(k2nVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(true) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            fetVar.e0(-1191375334);
            boolean z2 = ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = twn.j((str.length() <= 0 && str2.length() <= 0) ? 72.0f : 90.0f, fetVar);
            }
            float f = ((ycl) objP).f42389a;
            bhm bhmVar = bhm.b;
            jm40 jm40Var = jm40.b;
            int i3 = i2;
            jeb.r(o7k0.e(s5x0.L(jm40Var, 4.0f, 0.0f, 2), f), bhmVar, fetVar, 48);
            fetVar.r(false);
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(o7k0.d(jm40Var, 1.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14), true);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarH);
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
            x((i3 >> 6) & 1008, fetVar, null, str, str2);
            F(null, k2nVar, X(str3, str4, fetVar), fetVar, i3 & 112);
            k2nVar3 = k2nVar2;
            F(null, k2nVar3, X(str3, str4, fetVar), fetVar, (i3 >> 3) & 112);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            k2nVar3 = k2nVar2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var, (Object) k2nVar, (Object) k2nVar3, (Object) str, (Object) str2, i, (byte) 25);
        }
    }

    public static float r(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static final void s(mdm mdmVar, Function0 function0, fet fetVar, int i) {
        mdm mdmVar2;
        Function0 function1;
        fet fetVar2;
        fetVar.g0(-1159135358);
        byte b = 2;
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mdmVar2 = mdmVar;
            function1 = function0;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, function1, fetVar2, ((i2 << 3) & 112) | ((i2 << 6) & 7168), 5);
        } else {
            mdmVar2 = mdmVar;
            function1 = function0;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dya(mdmVar2, function1, i, b);
        }
    }

    public static final void t(qq20 qq20Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1641651751);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(qq20Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 11;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = twn.s(fetVar);
            }
            List list = (List) objP;
            Context context = (Context) fetVar.k(dy2.b);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = s5o.f31663a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            int i3 = i2 & 14;
            boolean zI = (i3 == 4) | fetVar.i(list) | fetVar.i(context);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new f8m(qq20Var, list, context, b2);
                fetVar.o0(objP3);
            }
            Function1 function1 = (Function1) objP3;
            boolean zI2 = (i3 == 4) | fetVar.i(list) | fetVar.i(context);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == cl5Var) {
                objP4 = new ann(qq20Var, list, context, b);
                fetVar.o0(objP4);
            }
            idm0.j(null, qq20Var, xdrVar, null, function1, (Function2) objP4, fetVar, ((i2 << 3) & 112) | 384, 9);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(qq20Var, i, b2);
        }
    }

    public static final void u(mm40 mm40Var, nfo nfoVar, rim rimVar, v3n v3nVar, Function1 function1, fet fetVar, int i) {
        int i2;
        function1.getClass();
        fetVar.g0(302583598);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.e(nfoVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(rimVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(v3nVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 0.0f, 4.0f, 1);
            if (nfoVar == nfo.f23446a) {
                fetVar.e0(-867914898);
                I(mm40VarL, nfoVar, rimVar, v3nVar, function1, fetVar, i2 & 65520);
                fetVar.r(false);
            } else {
                fetVar.e0(-867649042);
                z(mm40VarL, nfoVar, rimVar, v3nVar, function1, fetVar, i2 & 65520);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rfo(mm40Var, nfoVar, rimVar, v3nVar, function1, i, (byte) 0);
        }
    }

    public static final void v(mm40 mm40Var, a4x a4xVar, azp azpVar, fet fetVar, int i) {
        mm40 mm40Var2;
        azp azpVar2 = azpVar;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        mw3 mw3Var = uc9.c;
        xx7 xx7Var = gqw0.n;
        fetVar2.g0(1269980878);
        int i2 = i | 6 | (fetVar2.g(a4xVar) ? 32 : 16) | (fetVar2.g(azpVar2) ? 256 : 128);
        boolean z = true;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            Iterator itO = h97.o(fetVar2, mm40VarC0, shdVar, -1777545509, a4xVar);
            while (itO.hasNext()) {
                bzp bzpVar = (bzp) itO.next();
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarS = o7k0.s(jm40Var, 32.0f);
                x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 48);
                jm40 jm40Var2 = jm40Var;
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarS);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA, shdVar4);
                jpm0.o(fetVar2, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar);
                String str = bzpVar.f3481a;
                tip0 tip0Var = bzpVar.c;
                tip0 tip0Var2 = bzpVar.b;
                boolean zG = fetVar2.g(str);
                Object objP = fetVar2.P();
                if (zG || objP == ukd.f35823a) {
                    objP = ttm0.L(1, bzpVar.f3481a);
                    fetVar2.o0(objP);
                }
                shd shdVar5 = shdVar3;
                v8q0.a((String) objP, o7k0.e(o7k0.d(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 6.0f, 7), 1.0f), 12.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary80(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                tip0 tip0VarY0 = ibc.y0(tip0Var2, tip0Var, fetVar2);
                tip0 tip0VarY1 = ibc.y0(tip0Var, tip0Var2, fetVar2);
                jm40Var = jm40Var2;
                sac.p(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), fbc.Y(tip0VarY0, fetVar2), fetVar2, 0, 0);
                sac.p(jm40Var, fbc.Y(tip0VarY1, fetVar2), fetVar2, 6, 0);
                fetVar2.r(true);
                xx7Var = xx7Var;
                z = true;
                shdVar = shdVar;
                shdVar2 = shdVar2;
                mw3Var = mw3Var;
                shdVar4 = shdVar4;
                shdVar3 = shdVar5;
                pcyVar = pcyVar;
            }
            shd shdVar6 = shdVar;
            shd shdVar7 = shdVar2;
            shd shdVar8 = shdVar3;
            shd shdVar9 = shdVar4;
            pcy pcyVar2 = pcyVar;
            boolean z3 = z;
            fetVar2.r(false);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarS2 = o7k0.s(jm40Var, 32.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarS2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar9);
            jpm0.o(fetVar2, bh90VarM3, shdVar8);
            vqd.u(iHashCode3, fetVar2, shdVar7, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar6);
            azpVar2 = azpVar;
            String str2 = azpVar2.f1729a;
            oip0 oip0Var = azpVar2.c;
            oip0 oip0Var2 = azpVar2.b;
            jm40 jm40Var3 = jm40Var;
            v8q0.a(str2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7), 1.0f), 12.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary80(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            dyb.r(0, 0, ibc.f0(oip0Var2.b, fetVar2), fetVar2, s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, 4.0f, 7), ttm0.L(z3 ? 1 : 0, oip0Var2.f25323a));
            dyb.r(6, 0, ibc.f0(oip0Var.b, fetVar2), fetVar2, jm40Var3, ttm0.L(z3 ? 1 : 0, oip0Var.f25323a));
            fetVar2.r(z3);
            fetVar2.r(z3);
            mm40Var2 = jm40Var3;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zwm(mm40Var2, a4xVar, azpVar2, i, (byte) 2);
        }
    }

    public static final void w(mm40 mm40Var, q6p0 q6p0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        q6p0Var.getClass();
        fetVar2.g0(-99983066);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(q6p0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "FILTER_TEAM_CARD_DEFAULT_COLUMN_TAG");
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_filter_line_inactive, 0, fetVar2);
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = new jbp((byte) 17);
                fetVar2.o0(objP);
            }
            oil oilVarT = ju70.T(pm80VarF, null, (Function2) objP, 6);
            jm40 jm40Var = jm40.b;
            dww.c(oilVarT, null, o7k0.n(jm40Var, 64.0f), 0L, fetVar2, 56, 8);
            mm40 mm40VarS = o7k0.s(o7k0.g(jm40Var, 24.0f, 0.0f, 2), 64.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarS);
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
            String str = q6p0Var.f28211a;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gup(mm40Var, q6p0Var, i, (byte) 3);
        }
    }

    public static final void x(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2;
        mm40 mm40Var2;
        fetVar.g0(-482577112);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            StringBuilder sb = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            sb.append(str);
            if (str.length() > 0 && str2.length() > 0) {
                sb.append(", ");
            }
            sb.append(str2);
            String string = sb.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(((g83) arrayList.get(i3)).a(sb.length()));
            }
            new j83(string, arrayList2);
            int length = str.length();
            jm40 jm40Var = jm40.b;
            if (length <= 0 && str2.length() <= 0) {
                mm40Var2 = jm40Var;
                fetVar2 = fetVar;
                fetVar2.e0(-1198547174);
                fetVar2.r(false);
            } else {
                fetVar.e0(-1198833738);
                mm40Var2 = jm40Var;
                f1t0.a(o7k0.e(jm40Var, 14.0f), string, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), 0L, fetVar, 0, 438264);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nd8(mm40Var2, str, str2, i, (byte) 6);
        }
    }

    public static final void y(mm40 mm40Var, onw onwVar, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(-635354195);
        int i2 = (fetVar.g(onwVar) ? 32 : 16) | i | (fetVar.i(function1) ? 256 : 128);
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (onwVar instanceof knw) {
            fetVar.e0(-690018954);
            B(i2 & 910, fetVar, mm40Var, ((knw) onwVar).f18605a, function1);
            fetVar.r(false);
        } else {
            boolean z = onwVar instanceof lnw;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar.e0(-690013363);
                mdm mdmVar = ((lnw) onwVar).f20366a;
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new kdw((byte) 6);
                    fetVar.o0(objP);
                }
                s(mdmVar, (Function0) objP, fetVar, 48);
                fetVar.r(false);
            } else if (onwVar instanceof mnw) {
                fetVar.e0(-690008995);
                mdm mdmVar2 = ((mnw) onwVar).f22110a;
                boolean z2 = (i2 & 896) == 256;
                Object objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new i8v(function1, (byte) 22);
                    fetVar.o0(objP2);
                }
                s(mdmVar2, (Function0) objP2, fetVar, 0);
                fetVar.r(false);
            } else {
                if (!(onwVar instanceof nnw)) {
                    throw b1j.f(-690020316, fetVar, false);
                }
                fetVar.e0(-690003210);
                K(0, fetVar);
                fetVar.r(false);
            }
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mm40Var, onwVar, function1, i, (byte) 13);
        }
    }

    public static final void z(mm40 mm40Var, nfo nfoVar, rim rimVar, v3n v3nVar, Function1 function1, fet fetVar, int i) {
        int i2;
        v3n v3nVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-113757398);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.e(nfoVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(rimVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            v3nVar2 = v3nVar;
            i2 |= fetVar2.g(v3nVar2) ? 2048 : 1024;
        } else {
            v3nVar2 = v3nVar;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        boolean z = false;
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
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
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, v3nVar2.a().g(), 0.0f, 11);
            if (rimVar.d != null && !rimVar.i) {
                z = true;
            }
            v3c.t(mm40VarN, z, v3nVar2, rimVar.b, fetVar, (i2 >> 3) & 896);
            fetVar2 = fetVar;
            obc.u(new x7z(1.0f, true), nfoVar, rimVar, v3nVar, function1, fetVar2, i2 & 65520);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rfo(mm40Var, nfoVar, rimVar, v3nVar, function1, i, (byte) 1);
        }
    }
}
