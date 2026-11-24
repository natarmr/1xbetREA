package a;

import android.gov.nist.core.Separators;
import android.javax.sip.header.WarningHeader;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.text.BidiFormatter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.appsflyer.share.attribution.RequestError;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.timerView.SyntheticTimerView;
import org.xplatform.uikit.compose.color.CustomColors;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit_sport.eventcard.bottom.EventCardBottomMarketMultiline;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ibc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Constructor f14479a;

    public static final void A(mm40 mm40Var, float f, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(395371470);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new b2d(f, (byte) 3);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            twn.v((i2 >> 6) & 14, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new svm((Object) mm40Var, f, (wdr) ugdVar, i, (byte) 3);
        }
    }

    public static final void B(String str, long j, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-956800355);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.f(j) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarU = o7k0.u(s5x0.L(jm40.b, 4.0f, 0.0f, 2), 64.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarU);
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
            v8q0.a(str, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, (i2 & 14) | ((i2 << 3) & 896), 24960, 110586);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w9m(str, j, i, (byte) 0);
        }
    }

    public static final void C(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(928613394);
        byte b = 4;
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16) | (fetVar.g(mm40Var) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new l00(str, b);
                fetVar2.o0(objP);
            }
            kkb.p(1, fetVar2, null, (Function0) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            qrq qrqVar = j1t0.b;
            long j = qmk.r;
            v8q0.a(str2, mm40VarN, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.q, j, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.F, 16646109), fetVar2, (i2 >> 3) & 14, 24960, 109552);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(str, str2, mm40Var, i, (byte) 4);
        }
    }

    public static final void D(mm40 mm40Var, i2n i2nVar, boolean z, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(-1519688215);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(i2nVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, z ? gqw0.o : gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            String str = i2nVar.f14057a;
            zfn zfnVar = zaq0.b;
            v8q0.a(str, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 110586);
            String str2 = i2nVar.b;
            long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            y9q0 y9q0VarH = g1t0.h();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            v8q0.a(str2, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarH, fetVar, 0, 24960, 110584);
            mm40 mm40VarU = o7k0.u(s5x0.L(i120.Q(o7k0.e(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), 24.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundLight60(), vgg0.a(6.0f)), 4.0f, 0.0f, 2), 80.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarU);
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
            v8q0.a(i2nVar.c, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(2038831219, new mxm(i2nVar, (byte) 11), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm((byte) 27, i, mm40Var, (Object) i2nVar, z);
        }
    }

    public static final void E(o0x o0xVar, long j, ut90 ut90Var, tt90 tt90Var, long j2, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        int i3;
        fetVar.g0(-802806613);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(o0xVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(ut90Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(tt90Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.f(j2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = i120.S(o7k0.n(jm40Var, 56.0f), 1.0f, j, vgg0.a(12.0f));
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
            mm40 mm40VarJ = lgb.J(o7k0.e(o7k0.s(jm40Var, ut90Var.f36247a), ut90Var.b), vgg0.a(8.0f));
            ut90 ut90Var2 = ut90.Small;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, ut90Var2.f36247a), ut90Var2.b);
            if (tt90Var.equals(st90.f32764a)) {
                i3 = R.drawable.ic_glyph_circle_globe;
            } else if (tt90Var.equals(rt90.f31068a)) {
                i3 = R.drawable.ic_glyph_placeholder_player;
            } else {
                if (!tt90Var.equals(qt90.f29289a) && !tt90Var.equals(pt90.f27553a)) {
                    t9f.b();
                    return;
                }
                i3 = R.drawable.ic_glyph_cyber_gamepad;
            }
            rq8.b(mm40VarJ, mm40VarE, o0xVar, i3, new y3d(j2), null, null, gqw0.B, null, fetVar, ((i2 << 6) & 896) | 12582912 | (i2 & 57344), 352);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p0m(o0xVar, j, ut90Var, tt90Var, j2, i);
        }
    }

    public static final void F(mm40 mm40Var, j2n j2nVar, fet fetVar, int i) {
        mm40 mm40Var2;
        String str;
        String str2;
        j2n j2nVar2 = j2nVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-321513241);
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
            v8q0.a(str, o7k0.u(jm40Var, 0.0f, 24.0f, 1), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 110584);
            mm40 mm40VarQ = i120.Q(o7k0.n(jm40Var, 24.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundLight60(), vgg0.a(6.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
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
            v8q0.a(str3, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131066);
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
            yfe0VarU.d = new b2n(mm40Var2, j2nVar2, i, (byte) 0);
        }
    }

    public static final void G(final mm40 mm40Var, final yvh0 yvh0Var, final float f, long j, final boolean z, ywh0 ywh0Var, fet fetVar, final int i) {
        int i2;
        fet fetVar2;
        y9q0 y9q0VarD;
        boolean z2;
        final long j2 = j;
        ywh0 ywh0Var2 = ywh0Var;
        fetVar.g0(-1625477645);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(yvh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.f(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? fetVar.g(ywh0Var2) : fetVar.i(ywh0Var2) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            String str = yvh0Var.f43319a;
            boolean z3 = ywh0Var2.g;
            boolean zG = fetVar.g(str) | fetVar.h(z3);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                String upperCase = yvh0Var.f43319a;
                if (z3) {
                    upperCase = upperCase.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                }
                objP = upperCase;
                fetVar.o0(objP);
            }
            String str2 = (String) objP;
            if (z3) {
                fetVar.e0(1152189149);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0VarD = g1t0.b();
                fetVar.r(false);
            } else {
                fetVar.e0(1152244763);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0VarD = g1t0.d();
                fetVar.r(false);
            }
            y9q0 y9q0VarE = y9q0.e(y9q0VarD, 0L, 0L, null, null, null, 0L, 3, 0L, 16744447);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
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
            mm40 mm40VarA = o7k0.A(jm40Var, null, 3);
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarA, zx7Var);
            nw3 nw3Var = uc9.h;
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(nw3Var, yx7Var, fetVar, 54);
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
            fetVar.e0(-1111762529);
            zcl zclVar = qmk.f28987a;
            I(o7k0.n(s5x0.L(jm40Var, 4.0f, 0.0f, 2), f), yvh0Var.b, j, fetVar, (i3 >> 6) & 896);
            j2 = j;
            fetVar.r(false);
            mm40 mm40VarE0 = o2e.e0(s5x0.L(new ecu0(yx7Var).e(new x7z(1.0f, false)), 4.0f, 0.0f, 2), "SEGMENT_BASIC_TEXT");
            boolean z5 = (i3 & 57344) == 16384;
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new f15((byte) 8, j2);
                fetVar.o0(objP2);
            }
            aad.e(str2, mm40VarE0, y9q0VarE, null, 2, false, 1, 0, (n4d) objP2, null, fetVar, 1597440, 680);
            fetVar2 = fetVar;
            fetVar2.e0(-1110687387);
            fetVar2.r(false);
            fetVar2.r(true);
            if (z) {
                fetVar2.e0(-682041219);
                mm40 mm40VarB2 = jr8Var.b(o7k0.s(jm40Var, 1.0f), gqw0.f);
                thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarB2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA2, shdVar);
                jpm0.o(fetVar2, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar4);
                ywh0Var2 = ywh0Var;
                zq8.a(0, fetVar2, i120.Q(o7k0.p(jm40Var, 1.0f, 16.0f), ywh0Var2.c, jd8.n));
                z2 = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                ywh0Var2 = ywh0Var;
                z2 = true;
                fetVar2.e0(-681660663);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final ywh0 ywh0Var3 = ywh0Var2;
            yfe0VarU.d = new Function2() { // from class: a.kqm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ibc.G(mm40Var, yvh0Var, f, j2, z, ywh0Var3, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void H(final mm40 mm40Var, final a4x a4xVar, final float f, final float f2, final ywh0 ywh0Var, final ugg0 ugg0Var, final y9q0 y9q0Var, final int i, ugg0 ugg0Var2, final Function1 function1, fet fetVar, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        ugg0 ugg0Var3;
        int i7;
        final ugg0 ugg0Var4;
        mm40 mm40VarS;
        fet fetVar2 = fetVar;
        fetVar2.g0(601444206);
        if ((i2 & 6) == 0) {
            i5 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= fetVar2.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= fetVar2.d(f) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= fetVar2.h(true) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= fetVar2.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= (262144 & i2) == 0 ? fetVar2.g(ywh0Var) : fetVar2.i(ywh0Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i5 |= fetVar2.g(ugg0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i5 |= fetVar2.g(y9q0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i5 |= fetVar2.e(i) ? 67108864 : 33554432;
        }
        int i8 = i2 & 805306368;
        int i9 = i5;
        jm40 jm40Var = jm40.b;
        if (i8 == 0) {
            i6 = i9 | (fetVar2.g(jm40Var) ? 536870912 : 268435456);
        } else {
            i6 = i9;
        }
        int i10 = i4 & 1024;
        if (i10 != 0) {
            i7 = i3 | 6;
            ugg0Var3 = ugg0Var2;
        } else {
            ugg0Var3 = ugg0Var2;
            if ((i3 & 6) == 0) {
                i7 = i3 | (fetVar2.g(ugg0Var3) ? 4 : 2);
            } else {
                i7 = i3;
            }
        }
        if ((i3 & 48) == 0) {
            i7 |= fetVar2.i(function1) ? 32 : 16;
        }
        if (fetVar2.U(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 19) == 18) ? false : true)) {
            if (i10 != 0) {
                ugg0Var3 = null;
            }
            ugg0 ugg0Var5 = ugg0Var3;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.b, false);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarQ = i120.Q(o7k0.e(o7k0.d(o7k0.u(jm40Var, 0.0f, 512.0f, 1), 1.0f), f2), ywh0Var.f43369a, ugg0Var);
            y3d y3dVar = ywh0Var.f;
            if (y3dVar == null || !ywh0Var.h) {
                mm40VarS = jm40Var;
            } else {
                zcl zclVar = qmk.f28987a;
                mm40VarS = i120.S(jm40Var, 1.0f, y3dVar.f41946a, ugg0Var);
            }
            mm40 mm40VarE = mm40VarQ.e(mm40VarS);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarE, 2.0f);
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarJ);
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
            L(a4xVar.size(), ugg0Var5 == null ? ugg0Var : ugg0Var5, ywh0Var.b, i, fetVar2, (i6 >> 15) & 7168);
            int i11 = i6 >> 3;
            int i12 = i6 << 3;
            fetVar2 = fetVar;
            J(jm40Var, a4xVar, f, ywh0Var, f2, y9q0Var, i, function1, fetVar2, ((i6 >> 27) & 14) | (i6 & 112) | (i11 & 896) | (i12 & 7168) | (57344 & i11) | (i12 & 458752) | (3670016 & i11) | (i11 & 29360128) | ((i7 << 21) & 234881024));
            fetVar2.r(true);
            fetVar2.r(true);
            ugg0Var4 = ugg0Var5;
        } else {
            fetVar2.X();
            ugg0Var4 = ugg0Var3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.hqm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i2 | 1);
                    int iL2 = x8x.L(i3);
                    ibc.H(mm40Var, a4xVar, f, f2, ywh0Var, ugg0Var, y9q0Var, i, ugg0Var4, function1, (fet) obj, iL, iL2, i4);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void I(mm40 mm40Var, dwh0 dwh0Var, long j, fet fetVar, int i) {
        int i2;
        fetVar.g0(167886643);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(dwh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j) ? 256 : 128;
        }
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (dwh0Var.equals(bwh0.f3325a)) {
            fetVar.e0(-2125775315);
            fetVar.r(false);
        } else {
            if (!(dwh0Var instanceof cwh0)) {
                throw b1j.f(-1869689529, fetVar, false);
            }
            fetVar.e0(-2125424023);
            dww.c(a8k0.F(((cwh0) dwh0Var).f5080a, 0, fetVar), null, mm40Var, j, fetVar, ((i2 << 6) & 896) | 56 | ((i2 << 3) & 7168), 0);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xhh((Object) mm40Var, (Object) dwh0Var, j, i, (byte) 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void J(final mm40 mm40Var, final a4x a4xVar, final float f, final ywh0 ywh0Var, final float f2, final y9q0 y9q0Var, final int i, final Function1 function1, fet fetVar, final int i2) {
        int i3;
        a4x a4xVar2 = a4xVar;
        ywh0 ywh0Var2 = ywh0Var;
        float f3 = f2;
        yx7 yx7Var = gqw0.k;
        fetVar.g0(-1711916188);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar2) ? 32 : 16;
        }
        int i4 = 1;
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(true) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.d(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? fetVar.g(ywh0Var2) : fetVar.i(ywh0Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.d(f3) ? 131072 : 65536;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.e(i) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 67108864 : 33554432;
        }
        if (fetVar.U(i3 & 1, (37823635 & i3) != 37823634)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "SEGMENT_ROW");
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 616691304, a4xVar2);
            int i5 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    q3d.p();
                    throw null;
                }
                yvh0 yvh0Var = (yvh0) next;
                fetVar.b0(1837793304, yvh0Var);
                int i7 = i5 == i ? i4 : 0;
                boolean z = (!ywh0Var2.i || i5 == a4xVar2.size() - i4 || (i + (-1) <= i5 && i5 <= i)) ? 0 : i4;
                long j = i7 != 0 ? ywh0Var2.d : ywh0Var2.e;
                mm40 mm40VarL = twn.l(yx7Var, o7k0.e(new x7z(1.0f, true), f3));
                ucg0 ucg0Var = new ucg0(4);
                boolean zE = ((i3 & 234881024) == 67108864) | fetVar.e(i5);
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (zE || objP == obj) {
                    objP = new re1(function1, i5, (byte) 4);
                    fetVar.o0(objP);
                }
                mm40 mm40VarW = y860.W(mm40VarL, null, null, false, ucg0Var, (Function0) objP, 12);
                boolean z2 = i7;
                boolean zH = fetVar.h(z2);
                Object objP2 = fetVar.P();
                if (zH || objP2 == obj) {
                    objP2 = new z((byte) 25, z2);
                    fetVar.o0(objP2);
                }
                G(o2e.e0(pai0.a(mm40VarW, false, (Function1) objP2), "SEGMENT"), yvh0Var, f, j, z, ywh0Var2, fetVar, (i3 & 8064) | (3670016 & (i3 << 6)));
                fetVar.r(false);
                ywh0Var2 = ywh0Var;
                i3 = i3;
                i4 = 1;
                i5 = i6;
                a4xVar2 = a4xVar;
                f3 = f2;
            }
            fetVar.r(false);
            fetVar.r(i4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.jqm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ibc.J(mm40Var, a4xVar, f, ywh0Var, f2, y9q0Var, i, function1, (fet) obj2, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void K(mm40 mm40Var, dxh0 dxh0Var, hxh0 hxh0Var, a4x a4xVar, int i, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-744225169);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(dxh0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(hxh0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(a4xVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.e(i) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (!fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            fetVar.X();
        } else if (Intrinsics.d(dxh0Var, axh0.f1625a)) {
            fetVar.e0(-590459352);
            mm40 mm40VarE0 = o2e.e0(mm40Var, "SEGMENT_CONTROL_GROUP");
            zfn zfnVar = zaq0.b;
            ywh0 ywh0VarG0 = g0(hxh0Var, new ywh0(((ThemeColors) fetVar.k(zfnVar)).getBackgroundLight60(), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary20(), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 192), fetVar);
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(12.0f);
            ugg0 ugg0VarA2 = vgg0.a(10.0f);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            H(mm40VarE0, a4xVar, 14.0f, 32.0f, ywh0VarG0, ugg0VarA, g1t0.d(), i, ugg0VarA2, function1, fetVar, ((i3 >> 6) & 112) | 805309440 | ((i3 << 12) & 234881024), (i3 >> 12) & 112, 0);
            fetVar.r(false);
        } else if (Intrinsics.d(dxh0Var, zwh0.f45106a)) {
            fetVar.e0(-589759682);
            zfn zfnVar2 = zaq0.b;
            ywh0 ywh0VarG1 = g0(hxh0Var, new ywh0(((ThemeColors) fetVar.k(zfnVar2)).getBackgroundGroup(), ((ThemeColors) fetVar.k(zfnVar2)).getPrimary(), ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundGroup(), ((ThemeColors) fetVar.k(zfnVar2)).getPrimaryForeground(), ((ThemeColors) fetVar.k(zfnVar2)).getSecondary(), null, 448), fetVar);
            zcl zclVar2 = qmk.f28987a;
            ugg0 ugg0VarA3 = vgg0.a(360.0f);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            H(mm40Var, a4xVar, 16.0f, 36.0f, ywh0VarG1, ugg0VarA3, g1t0.d(), i, null, function1, fetVar, ((i3 >> 6) & 112) | (i3 & 14) | 805309440 | ((i3 << 12) & 234881024), (i3 >> 12) & 112, 1024);
            fetVar.r(false);
        } else if (Intrinsics.d(dxh0Var, bxh0.f3376a)) {
            fetVar.e0(-589145789);
            zfn zfnVar3 = zaq0.b;
            ywh0 ywh0VarG2 = g0(hxh0Var, new ywh0(((ThemeColors) fetVar.k(zfnVar3)).getBackgroundContent(), ((ThemeColors) fetVar.k(zfnVar3)).getPrimary(), ((ThemeColors) fetVar.k(zfnVar3)).getBackgroundContent(), ((ThemeColors) fetVar.k(zfnVar3)).getPrimaryForeground(), ((ThemeColors) fetVar.k(zfnVar3)).getSecondary(), new y3d(((ThemeColors) fetVar.k(zfnVar3)).getSeparator()), 256), fetVar);
            zcl zclVar3 = qmk.f28987a;
            ugg0 ugg0VarA4 = vgg0.a(360.0f);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            H(mm40Var, a4xVar, 16.0f, 36.0f, ywh0VarG2, ugg0VarA4, g1t0.d(), i, null, function1, fetVar, (i3 & 14) | 805309440 | ((i3 >> 6) & 112) | ((i3 << 12) & 234881024), (i3 >> 12) & 112, 1024);
            fetVar.r(false);
        } else {
            if (!Intrinsics.d(dxh0Var, cxh0.f5122a)) {
                throw b1j.f(2059162712, fetVar, false);
            }
            fetVar.e0(-588533942);
            zfn zfnVar4 = zaq0.b;
            ywh0 ywh0VarG3 = g0(hxh0Var, new ywh0(((ThemeColors) fetVar.k(zfnVar4)).getBackgroundGroup(), ((ThemeColors) fetVar.k(zfnVar4)).getBackgroundContent(), ((ThemeColors) fetVar.k(zfnVar4)).getBackgroundGroup(), ((ThemeColors) fetVar.k(zfnVar4)).getTextPrimary(), ((ThemeColors) fetVar.k(zfnVar4)).getSecondary(), null, 448), fetVar);
            zcl zclVar4 = qmk.f28987a;
            ugg0 ugg0VarA5 = vgg0.a(14.0f);
            ugg0 ugg0VarA6 = vgg0.a(12.0f);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            H(mm40Var, a4xVar, 16.0f, 40.0f, ywh0VarG3, ugg0VarA5, g1t0.b(), i, ugg0VarA6, function1, fetVar, ((i3 >> 6) & 112) | (i3 & 14) | 805309440 | ((i3 << 12) & 234881024), (i3 >> 12) & 112, 0);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xnl((byte) 1, i, i2, (wdr) function1, mm40Var, (Object) dxh0Var, (Object) hxh0Var, (Object) a4xVar);
        }
    }

    public static final void L(final int i, final ugg0 ugg0Var, final long j, final int i2, fet fetVar, final int i3) {
        int i4;
        int i5;
        ugg0 ugg0Var2;
        long j2;
        fet fetVar2;
        yfe0 yfe0VarU;
        Function2 function2;
        fetVar.g0(1726662047);
        if ((i3 & 6) == 0) {
            i4 = (fetVar.e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar.g(ugg0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= fetVar.e(i2) ? 2048 : 1024;
        }
        byte b = 1;
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            if (i <= 0) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b2 = 0;
                function2 = new Function2() { // from class: a.iqm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b2;
                        int i6 = i3;
                        switch (b3) {
                            case 0:
                                ((Integer) obj2).getClass();
                                ibc.L(i, ugg0Var, j, i2, (fet) obj, x8x.L(i6 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                ibc.L(i, ugg0Var, j, i2, (fet) obj, x8x.L(i6 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                i5 = i;
                ugg0Var2 = ugg0Var;
                j2 = j;
                boolean z = (i4 & 14) == 4;
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (z || objP == cl5Var) {
                    objP = Float.valueOf(1.0f / i5);
                    fetVar.o0(objP);
                }
                float fFloatValue = ((Number) objP).floatValue();
                boolean zD = ((i4 & 7168) == 2048) | fetVar.d(fFloatValue);
                Object objP2 = fetVar.P();
                if (zD || objP2 == cl5Var) {
                    objP2 = Float.valueOf(i2 * fFloatValue);
                    fetVar.o0(objP2);
                }
                float fFloatValue2 = ((Number) objP2).floatValue();
                Object objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = ro4.g0(1.0f, 400.0f, null, 4);
                    fetVar.o0(objP3);
                }
                fetVar2 = fetVar;
                l7m0 l7m0VarB = d43.b(fFloatValue2, (nul0) objP3, "segment_indicator_offset_fraction", null, fetVar2, 3120, 20);
                boolean zD2 = fetVar2.d(fFloatValue) | fetVar2.g(l7m0VarB);
                Object objP4 = fetVar2.P();
                if (zD2 || objP4 == cl5Var) {
                    objP4 = new h7m(fFloatValue, l7m0VarB, b);
                    fetVar2.o0(objP4);
                }
                zq8.a(0, fetVar2, i120.Q(o7k0.c(knx.Q(jm40.b, (xdr) objP4), 1.0f), j2, ugg0Var2));
            }
            yfe0VarU.d = function2;
        }
        i5 = i;
        ugg0Var2 = ugg0Var;
        j2 = j;
        fetVar2 = fetVar;
        fetVar2.X();
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final byte b3 = 1;
            final int i6 = i5;
            final ugg0 ugg0Var3 = ugg0Var2;
            final long j3 = j2;
            function2 = new Function2() { // from class: a.iqm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b3;
                    int i7 = i3;
                    switch (b4) {
                        case 0:
                            ((Integer) obj2).getClass();
                            ibc.L(i6, ugg0Var3, j3, i2, (fet) obj, x8x.L(i7 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            ibc.L(i6, ugg0Var3, j3, i2, (fet) obj, x8x.L(i7 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void M(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-924758346);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(mm40VarD, 280.0f), vgg0.a(12.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 10);
        }
    }

    public static final void N(bvq bvqVar, Function0 function0, fet fetVar, int i) {
        vuq vuqVar = bvqVar.f3290a;
        fetVar.g0(1643885643);
        int i2 = (fetVar.g(bvqVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = fetVar.k(bmd.n) == k6z.f17794a;
            String strValueOf = String.valueOf(vuqVar.f38061a);
            String strValueOf2 = String.valueOf(vuqVar.b);
            String str = z ? strValueOf : strValueOf2;
            if (z) {
                strValueOf = strValueOf2;
            }
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
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
            ufp0 ufp0Var = bvqVar.b;
            String str2 = ufp0Var.b;
            String str3 = ufp0Var.d;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            zcl zclVar = qmk.f28987a;
            C(0, fetVar, s5x0.N(x7zVar, 16.0f, 0.0f, 0.0f, 0.0f, 14), str3, str2);
            xdx.t(s5x0.N(jm40Var, 8.0f, 12.0f, 8.0f, 0.0f, 8), new n5h0(str, strValueOf, false, false), 0, fetVar, 0);
            ufp0 ufp0Var2 = bvqVar.c;
            String str4 = ufp0Var2.b;
            String str5 = ufp0Var2.d;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            C(0, fetVar, s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 0.0f, 16.0f, 0.0f, 11), str5, str4);
            fetVar.r(true);
            x1x.l(6, 0, fetVar, s5x0.M(jm40Var, 12.0f, 24.0f, 12.0f, 12.0f), function0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gup(bvqVar, function0, i, (byte) 8);
        }
    }

    public static final void O(jam jamVar, a4x a4xVar, p9m p9mVar, l7m0 l7m0Var, fet fetVar, int i) {
        int i2;
        shd shdVar;
        s9m s9mVar;
        long j;
        boolean z;
        boolean z2;
        pcy pcyVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(618340266);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(jamVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar2.g(a4xVar) ? 32 : 16) | (fetVar2.g(p9mVar) ? 256 : 128) | (fetVar2.g(l7m0Var) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            rah0 rah0VarT = wha0.T(fetVar2);
            s9m s9mVar2 = jamVar.f16196a;
            int size = s9mVar2.a().size();
            zfn zfnVar = zaq0.b;
            long secondary80 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary80();
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            long j2 = p9mVar.b;
            long j3 = p9mVar.c;
            boolean z3 = fetVar2.k(bmd.n) == k6z.f17794a;
            final e900 e900VarG = yk5.g(p9mVar.e, 0.0f, 0.0f, 14);
            final e900 e900VarG2 = yk5.g(p9mVar.f, 0.0f, 0.0f, 14);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = lgb.K(o7k0.d(jm40Var, 1.0f));
            int i4 = i3 & 112;
            boolean zE = (i4 == 32) | fetVar2.e(5) | fetVar2.e(size) | ((i3 & 7168) == 2048);
            Object objP = fetVar2.P();
            if (zE || objP == ukd.f35823a) {
                objP = new nu7(a4xVar, size, l7m0Var);
                fetVar2.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z4) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar2 = gqw0.x;
            jpm0.o(fetVar2, tj30Var, shdVar2);
            shd shdVar3 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar4 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar4);
            jpm0.n(fetVar2);
            shd shdVar5 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar5);
            long j4 = j2;
            long j5 = p9mVar.d;
            if (s9mVar2 instanceof q9m) {
                fetVar2.e0(134614774);
                s9mVar = s9mVar2;
                shdVar = shdVar5;
                j = secondary80;
                z = false;
                u((q9m) s9mVar2, a4xVar, j, textPrimary, j3, j5, j4, fetVar2, i4);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                shdVar = shdVar5;
                s9mVar = s9mVar2;
                j = secondary80;
                z = false;
                if (!(s9mVar instanceof r9m)) {
                    throw b1j.f(4340147, fetVar2, false);
                }
                fetVar2.e0(135039939);
                v((r9m) s9mVar, a4xVar, j, j3, j5, j4, fetVar2, i4);
                fetVar2 = fetVar2;
                j4 = j4;
                fetVar2.r(false);
            }
            if (size > 0) {
                fetVar2.e0(-1527809683);
                zx7 zx7Var = gqw0.f11754a;
                tj30 tj30VarC = zq8.c(zx7Var, z);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
                fetVar2.i0();
                if (fetVar2.S) {
                    pcyVar = pcyVar2;
                    fetVar2.l(pcyVar);
                } else {
                    pcyVar = pcyVar2;
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar2);
                jpm0.o(fetVar2, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar2, shdVar4, fetVar2);
                shd shdVar6 = shdVar;
                jpm0.o(fetVar2, mm40VarC1, shdVar6);
                pcy pcyVar3 = pcyVar;
                fet fetVar3 = fetVar2;
                Q(wha0.P(jm40Var, rah0VarT, z, 14), s9mVar.a(), a4xVar, j, secondary, p9mVar.d, j4, fetVar3, (i3 << 3) & 896);
                fetVar2 = fetVar3;
                jr8 jr8Var = jr8.f16991a;
                mm40 mm40VarA = jr8Var.a(jm40Var);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarA);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar3);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC2, shdVar2);
                jpm0.o(fetVar2, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar2, shdVar4, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar6);
                final boolean z5 = z3;
                final byte b = 0;
                b34.h(rah0VarT.d(), jr8Var.b(jm40Var, gqw0.f), null, null, null, u1c.M(1020081632, new xdr() { // from class: a.x9m
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        byte b2 = b;
                        jm40 jm40Var2 = jm40.b;
                        e900 e900Var = e900VarG;
                        e900 e900Var2 = e900VarG2;
                        boolean z6 = z5;
                        u63 u63Var = (u63) obj;
                        fet fetVar4 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (b2) {
                            case 0:
                                u63Var.getClass();
                                if (fetVar4.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar = qmk.f28987a;
                                    mm40 mm40VarC = o7k0.c(o7k0.s(jm40Var2, 24.0f), 1.0f);
                                    if (z6) {
                                        e900Var = e900Var2;
                                    }
                                    qxw.o(fetVar4, i120.P(mm40VarC, e900Var, null, 6));
                                } else {
                                    fetVar4.X();
                                }
                                break;
                            default:
                                u63Var.getClass();
                                if (fetVar4.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar2 = qmk.f28987a;
                                    mm40 mm40VarC3 = o7k0.c(o7k0.s(jm40Var2, 24.0f), 1.0f);
                                    if (z6) {
                                        e900Var = e900Var2;
                                    }
                                    qxw.o(fetVar4, i120.P(mm40VarC3, e900Var, null, 6));
                                } else {
                                    fetVar4.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar2), fetVar2, 196608, 28);
                mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.d);
                boolean zC = rah0VarT.c();
                z2 = true;
                final char c = 1 == true ? 1 : 0;
                b34.h(zC, mm40VarB, null, null, null, u1c.M(-603210665, new xdr() { // from class: a.x9m
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        byte b2 = c;
                        jm40 jm40Var2 = jm40.b;
                        e900 e900Var = e900VarG2;
                        e900 e900Var2 = e900VarG;
                        boolean z6 = z5;
                        u63 u63Var = (u63) obj;
                        fet fetVar4 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (b2) {
                            case 0:
                                u63Var.getClass();
                                if (fetVar4.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar = qmk.f28987a;
                                    mm40 mm40VarC = o7k0.c(o7k0.s(jm40Var2, 24.0f), 1.0f);
                                    if (z6) {
                                        e900Var = e900Var2;
                                    }
                                    qxw.o(fetVar4, i120.P(mm40VarC, e900Var, null, 6));
                                } else {
                                    fetVar4.X();
                                }
                                break;
                            default:
                                u63Var.getClass();
                                if (fetVar4.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    zcl zclVar2 = qmk.f28987a;
                                    mm40 mm40VarC3 = o7k0.c(o7k0.s(jm40Var2, 24.0f), 1.0f);
                                    if (z6) {
                                        e900Var = e900Var2;
                                    }
                                    qxw.o(fetVar4, i120.P(mm40VarC3, e900Var, null, 6));
                                } else {
                                    fetVar4.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar2), fetVar2, 196608, 28);
                ohs0.x(fetVar2, true, true, false);
            } else {
                boolean z6 = z;
                z2 = true;
                fetVar2.e0(-1525607071);
                fetVar2.r(z6);
            }
            fetVar2.r(z2);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pr9((Object) jamVar, a4xVar, (Object) p9mVar, (Object) l7m0Var, i, (byte) 1);
        }
    }

    public static final void P(String str, long j, long j2, y9q0 y9q0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-18858760);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(y9q0Var) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(i120.S(jm40.b, 1.0f, j2, vgg0.a(12.0f)), 4.0f, 0.0f, 2);
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
            v8q0.a(str, null, j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i2 & 14) | ((i2 << 3) & 896), ((i2 << 12) & 29360128) | 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z9m((Object) str, j, j2, (Object) y9q0Var, i, (byte) 0);
        }
    }

    public static final void Q(final mm40 mm40Var, final a4x a4xVar, final a4x a4xVar2, final long j, final long j2, final long j3, final long j4, fet fetVar, final int i) {
        boolean z;
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1172963508);
        int i3 = (i & 6) == 0 ? (fetVar2.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.g(a4xVar2) ? 256 : 128;
        }
        long j5 = j;
        if ((i & 3072) == 0) {
            i3 |= fetVar2.f(j5) ? 2048 : 1024;
        }
        long j6 = j2;
        if ((i & 24576) == 0) {
            i3 |= fetVar2.f(j6) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar2.f(j3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= fetVar2.f(j4) ? 1048576 : 524288;
        }
        if (fetVar2.U(i3 & 1, (599187 & i3) != 599186)) {
            int size = a4xVar.size();
            int size2 = a4xVar2.size();
            boolean zE = fetVar2.e(size) | fetVar2.e(size2);
            Object objP = fetVar2.P();
            if (zE || objP == ukd.f35823a) {
                objP = new eam(size, size2, (byte) 0);
                fetVar2.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar2, tj30Var, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            fetVar2.e0(1972096729);
            Iterator it = a4xVar.iterator();
            while (it.hasNext()) {
                z((String) it.next(), j5, 0, fetVar2, (i3 >> 6) & 112, 4);
                j5 = j;
            }
            boolean z2 = false;
            fetVar2.r(false);
            fetVar2.e0(1972101643);
            Iterator it2 = a4xVar2.iterator();
            while (it2.hasNext()) {
                fam famVar = (fam) it2.next();
                fetVar2.e0(1972102745);
                for (iam iamVar : famVar.f) {
                    if (iamVar != null) {
                        if (iamVar instanceof gam) {
                            fetVar2.e0(1005763853);
                            gam gamVar = (gam) iamVar;
                            m0x m0xVar = gamVar.f10974a;
                            ut90 ut90Var = gamVar.b;
                            int i4 = ((i3 >> 15) & 112) | ((i3 >> 3) & 57344);
                            i2 = i3;
                            z = z2;
                            E(m0xVar, j4, ut90Var, pt90.f27553a, j3, fetVar, i4);
                            fetVar2 = fetVar;
                            fetVar2.r(z);
                        } else {
                            i2 = i3;
                            z = z2;
                            if (iamVar instanceof ham) {
                                fetVar2.e0(1006250026);
                                fet fetVar3 = fetVar2;
                                P(((ham) iamVar).f12730a, j6, j4, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar3, ((i2 >> 9) & 112) | ((i2 >> 12) & 896));
                                fetVar2 = fetVar3;
                                fetVar2.r(z);
                                j6 = j2;
                            }
                        }
                        z2 = z;
                        i3 = i2;
                    } else {
                        z = z2;
                    }
                    throw b1j.f(1972104463, fetVar2, z);
                }
                fetVar2.r(z2);
                j6 = j2;
                i3 = i3;
            }
            fetVar2.r(z2);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.y9m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ibc.Q(mm40Var, a4xVar, a4xVar2, j, j2, j3, j4, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v24, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v25, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
    public static final void R(lc00 lc00Var, m9s m9sVar, mpa0 mpa0Var, boolean z) {
        ?? arrayList;
        ?? arrayList2;
        m9sVar.getClass();
        String str = mpa0Var.f22169a;
        List list = mpa0Var.g;
        List list2 = mpa0Var.f;
        List list3 = mpa0Var.e;
        List list4 = mpa0Var.d;
        int i = 0;
        String strR = kotlin.text.c.r(str, Separators.DOUBLE_QUOTE, "", false);
        String str2 = m9sVar.i;
        String str3 = m9sVar.j;
        rah rahVarM0 = m0(m9sVar);
        int[] iArr = tah.f33611a;
        float f = iArr[rahVarM0.ordinal()] == 1 ? 0.5f : 1.0f;
        float f2 = iArr[m0(m9sVar).ordinal()] == 2 ? 0.5f : 1.0f;
        String strR2 = kotlin.text.c.r(mpa0Var.b, Separators.DOUBLE_QUOTE, "", false);
        String strR3 = kotlin.text.c.r(mpa0Var.c, Separators.DOUBLE_QUOTE, "", false);
        tna0 tna0Var = (tna0) CollectionsKt.firstOrNull(list4);
        int iF = tna0Var != null ? z1x.F(tna0Var) : 0;
        tna0 tna0Var2 = (tna0) CollectionsKt.f0(list4);
        int iF2 = tna0Var2 != null ? z1x.F(tna0Var2) : 0;
        tna0 tna0Var3 = (tna0) CollectionsKt.firstOrNull(list3);
        int iF3 = tna0Var3 != null ? z1x.F(tna0Var3) : 0;
        tna0 tna0Var4 = (tna0) CollectionsKt.f0(list3);
        int iF4 = tna0Var4 != null ? z1x.F(tna0Var4) : 0;
        if (list2.size() > 5) {
            arrayList = iun.f15405a;
        } else {
            arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new una0(z1x.F((tna0) it.next())));
            }
        }
        ?? r22 = arrayList;
        if (list.size() > 5) {
            arrayList2 = iun.f15405a;
        } else {
            arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new una0(z1x.F((tna0) it2.next())));
            }
        }
        ?? r23 = arrayList2;
        List list5 = mpa0Var.h;
        ArrayList arrayList3 = new ArrayList(r3d.q(list5, 10));
        Iterator it3 = list5.iterator();
        while (it3.hasNext()) {
            arrayList3.add(new una0(z1x.F((tna0) it3.next())));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        if (arrayList4.size() < 5) {
            int size = 5 - arrayList4.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList4.add(new una0(i));
            }
        }
        lc00Var.add(new sah(strR, str2, str3, f, f2, strR2, strR3, iF, iF2, iF3, iF4, r22, r23, arrayList4, z));
    }

    public static final long S(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : l1e0.f(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final void T(EventCardBottomMarketMultiline eventCardBottomMarketMultiline, qtr qtrVar) {
        eventCardBottomMarketMultiline.getClass();
        qtrVar.getClass();
        V(eventCardBottomMarketMultiline, qtrVar.d);
    }

    public static final void U(f6o0 f6o0Var, poy poyVar) {
        List list = u0d.f34849a;
        ShapeableImageView shapeableImageView = f6o0Var.c;
        ioy ioyVar = poyVar.h;
        u0d.j(shapeableImageView, ioyVar.f15137a, 0, 0, null, null, null, 510);
        u0d.j(f6o0Var.b, ioyVar.b, 0, 0, null, null, null, 510);
    }

    public static final void V(EventCardBottomMarketMultiline eventCardBottomMarketMultiline, ptr ptrVar) {
        cwr0 ho8Var;
        bbo bboVar;
        j0d j0dVar;
        eventCardBottomMarketMultiline.getClass();
        ptrVar.getClass();
        List<i07> list = ptrVar.d;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (i07 i07Var : list) {
            lc00 lc00VarB = kotlin.collections.a.b();
            for (u8d u8dVar : i07Var.d) {
                if (u8dVar != null) {
                    if (u8dVar instanceof r8d) {
                        wyc wycVar = ((r8d) u8dVar).f30019a;
                        String str = wycVar.c;
                        String str2 = wycVar.d;
                        int iOrdinal = wycVar.g.ordinal();
                        if (iOrdinal == 0) {
                            j0dVar = j0d.f15678a;
                        } else if (iOrdinal == 1) {
                            j0dVar = j0d.b;
                        } else {
                            if (iOrdinal != 2) {
                                t9f.b();
                                return;
                            }
                            j0dVar = j0d.c;
                        }
                        bboVar = new bbo(str, str2, j0dVar, wycVar.e, wycVar.i != 0, wycVar.f, 960);
                    } else if (u8dVar instanceof t8d) {
                        bboVar = new bbo(null, null, null, false, false, false, 895);
                    } else if (u8dVar instanceof s8d) {
                        bboVar = new bbo(null, null, null, false, false, false, 959);
                    }
                    lc00VarB.add(bboVar);
                }
                t9f.b();
                return;
            }
            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
            e07 e07Var = i07Var.b;
            if (e07Var instanceof c07) {
                c07 c07Var = (c07) e07Var;
                ho8Var = new io8(c07Var.f3509a, c07Var.b);
            } else {
                if (!(e07Var instanceof d07)) {
                    t9f.b();
                    return;
                }
                ho8Var = new ho8(null);
            }
            arrayList.add(new ev20(ho8Var, lc00VarA, i07Var.c));
        }
        eventCardBottomMarketMultiline.setMarkets(new jo8(arrayList, ptrVar.e, ptrVar.f, ptrVar.b));
    }

    public static final void W(f6o0 f6o0Var, poy poyVar) {
        TextView textView = f6o0Var.e;
        koy koyVar = poyVar.i;
        textView.setText(koyVar.f18651a);
        textView.setVisibility((f6o0Var.f.getDealing() || koyVar.b) ? 0 : 8);
    }

    public static final void X(f6o0 f6o0Var, tkz tkzVar, poy poyVar) {
        SyntheticTimerView syntheticTimerView = f6o0Var.d;
        noy noyVar = poyVar.d;
        syntheticTimerView.setTimerDescription(noyVar.b);
        SyntheticTimerView.b(syntheticTimerView, noyVar.f23887a, tkzVar, noyVar.d, 4);
        syntheticTimerView.setVisibility((f6o0Var.f.getDealing() || !noyVar.c) ? 8 : 0);
    }

    public static final long Y(d4d d4dVar, fet fetVar) {
        d4dVar.getClass();
        switch (d4dVar.ordinal()) {
            case 0:
                fetVar.e0(1602376925);
                long primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
                fetVar.t();
                return primary;
            case 1:
                fetVar.e0(1602378719);
                long primary80 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary80();
                fetVar.t();
                return primary80;
            case 2:
                fetVar.e0(1602380575);
                long primary60 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary60();
                fetVar.t();
                return primary60;
            case 3:
                fetVar.e0(1602382431);
                long primary20 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary20();
                fetVar.t();
                return primary20;
            case 4:
                fetVar.e0(1602384287);
                long primary10 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary10();
                fetVar.t();
                return primary10;
            case 5:
                fetVar.e0(1602386110);
                long primary0 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary0();
                fetVar.t();
                return primary0;
            case 6:
                fetVar.e0(1602388198);
                long primaryHighlight = ((ThemeColors) fetVar.k(zaq0.b)).getPrimaryHighlight();
                fetVar.t();
                return primaryHighlight;
            case 7:
                fetVar.e0(1602390567);
                long primaryForeground = ((ThemeColors) fetVar.k(zaq0.b)).getPrimaryForeground();
                fetVar.t();
                return primaryForeground;
            case 8:
                fetVar.e0(1602393033);
                long primaryForeground80 = ((ThemeColors) fetVar.k(zaq0.b)).getPrimaryForeground80();
                fetVar.t();
                return primaryForeground80;
            case 9:
                fetVar.e0(1602395166);
                long commerce = ((ThemeColors) fetVar.k(zaq0.b)).getCommerce();
                fetVar.t();
                return commerce;
            case 10:
                fetVar.e0(1602397287);
                long commerceHighlight = ((ThemeColors) fetVar.k(zaq0.b)).getCommerceHighlight();
                fetVar.t();
                return commerceHighlight;
            case 11:
                fetVar.e0(1602399522);
                long commerceTint = ((ThemeColors) fetVar.k(zaq0.b)).getCommerceTint();
                fetVar.t();
                return commerceTint;
            case 12:
                fetVar.e0(1602401800);
                long commerceForeground = ((ThemeColors) fetVar.k(zaq0.b)).getCommerceForeground();
                fetVar.t();
                return commerceForeground;
            case 13:
                fetVar.e0(1602404330);
                long commerceForeground80 = ((ThemeColors) fetVar.k(zaq0.b)).getCommerceForeground80();
                fetVar.t();
                return commerceForeground80;
            case 14:
                fetVar.e0(1602406461);
                long warning = ((ThemeColors) fetVar.k(zaq0.b)).getWarning();
                fetVar.t();
                return warning;
            case 15:
                fetVar.e0(1602408353);
                long warningTint = ((ThemeColors) fetVar.k(zaq0.b)).getWarningTint();
                fetVar.t();
                return warningTint;
            case 16:
                fetVar.e0(1602410698);
                long warningTintHighlight = ((ThemeColors) fetVar.k(zaq0.b)).getWarningTintHighlight();
                fetVar.t();
                return warningTintHighlight;
            case 17:
                fetVar.e0(1602412895);
                long secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.t();
                return secondary;
            case 18:
                fetVar.e0(1602414817);
                long secondary80 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary80();
                fetVar.t();
                return secondary80;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fetVar.e0(1602416641);
                fetVar.t();
                pz40 pz40Var = s6t0.f31722a;
                return s6t0.a().getSecondary60();
            case 20:
                fetVar.e0(1602418625);
                long secondary40 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary40();
                fetVar.t();
                return secondary40;
            case 21:
                fetVar.e0(1602420609);
                long secondary20 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary20();
                fetVar.t();
                return secondary20;
            case 22:
                fetVar.e0(1602422593);
                long secondary10 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary10();
                fetVar.t();
                return secondary10;
            case 23:
                fetVar.e0(1602424544);
                long secondary0 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary0();
                fetVar.t();
                return secondary0;
            case 24:
                fetVar.e0(1602426529);
                long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                fetVar.t();
                return textPrimary;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fetVar.e0(1602428480);
                long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
                fetVar.t();
                return background;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fetVar.e0(1602430433);
                long background0 = ((ThemeColors) fetVar.k(zaq0.b)).getBackground0();
                fetVar.t();
                return background0;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fetVar.e0(1602432647);
                long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                fetVar.t();
                return backgroundContent;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fetVar.e0(1602435080);
                long backgroundContent0 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent0();
                fetVar.t();
                return backgroundContent0;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                fetVar.e0(1602437445);
                long backgroundGroup = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundGroup();
                fetVar.t();
                return backgroundGroup;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                fetVar.e0(1602440046);
                long backgroundGroupSecondary = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundGroupSecondary();
                fetVar.t();
                return backgroundGroupSecondary;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                fetVar.e0(1602442564);
                long backgroundDark = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundDark();
                fetVar.t();
                return backgroundDark;
            case 32:
                fetVar.e0(1602444871);
                long backgroundLight60 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundLight60();
                fetVar.t();
                return backgroundLight60;
            case 33:
                fetVar.e0(1602447567);
                long secondaryButtonBackground = ((ThemeColors) fetVar.k(zaq0.b)).getSecondaryButtonBackground();
                fetVar.t();
                return secondaryButtonBackground;
            case 34:
                fetVar.e0(1602450840);
                long secondaryButtonBackgroundHighlight = ((ThemeColors) fetVar.k(zaq0.b)).getSecondaryButtonBackgroundHighlight();
                fetVar.t();
                return secondaryButtonBackgroundHighlight;
            case 35:
                fetVar.e0(1602454063);
                long secondaryButtonForeground = ((ThemeColors) fetVar.k(zaq0.b)).getSecondaryButtonForeground();
                fetVar.t();
                return secondaryButtonForeground;
            case 36:
                fetVar.e0(1602456711);
                long inputBackground60 = ((ThemeColors) fetVar.k(zaq0.b)).getInputBackground60();
                fetVar.t();
                return inputBackground60;
            case 37:
                fetVar.e0(1602459275);
                long snackbarAltBackground = ((ThemeColors) fetVar.k(zaq0.b)).getSnackbarAltBackground();
                fetVar.t();
                return snackbarAltBackground;
            case 38:
                fetVar.e0(1602461535);
                long switchOff = ((ThemeColors) fetVar.k(zaq0.b)).getSwitchOff();
                fetVar.t();
                return switchOff;
            case 39:
                fetVar.e0(1602463391);
                long separator = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator();
                fetVar.t();
                return separator;
            case 40:
                fetVar.e0(1602465313);
                long separator30 = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator30();
                fetVar.t();
                return separator30;
            case 41:
                fetVar.e0(1602467297);
                long separator60 = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60();
                fetVar.t();
                return separator60;
            case 42:
                fetVar.e0(1602469445);
                long promoBackground = ((ThemeColors) fetVar.k(zaq0.b)).getPromoBackground();
                fetVar.t();
                return promoBackground;
            case 43:
                fetVar.e0(1602472012);
                long promoCardGradientStart = ((ThemeColors) fetVar.k(zaq0.b)).getPromoCardGradientStart();
                fetVar.t();
                return promoCardGradientStart;
            case 44:
                fetVar.e0(1602474730);
                long promoCardGradientEnd = ((ThemeColors) fetVar.k(zaq0.b)).getPromoCardGradientEnd();
                fetVar.t();
                return promoCardGradientEnd;
            case 45:
                fetVar.e0(1602476828);
                long ripple = ((ThemeColors) fetVar.k(zaq0.b)).getRipple();
                fetVar.t();
                return ripple;
            case 46:
                fetVar.e0(1602478755);
                long tableGradient = ((ThemeColors) fetVar.k(zaq0.b)).getTableGradient();
                fetVar.t();
                return tableGradient;
            case 47:
                fetVar.e0(1602480800);
                long shadowSoft = ((ThemeColors) fetVar.k(zaq0.b)).getShadowSoft();
                fetVar.t();
                return shadowSoft;
            case 48:
                fetVar.e0(1602482818);
                long shadowStrong = ((ThemeColors) fetVar.k(zaq0.b)).getShadowStrong();
                fetVar.t();
                return shadowStrong;
            case 49:
                fetVar.e0(1602487144);
                long webGamesBackground = ((IndividualColors) fetVar.k(j7x.f16059a)).getWebGamesBackground();
                fetVar.t();
                return webGamesBackground;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                fetVar.e0(1602490223);
                long webGamesControlBackground = ((IndividualColors) fetVar.k(j7x.f16059a)).getWebGamesControlBackground();
                fetVar.t();
                return webGamesControlBackground;
            case 51:
                fetVar.e0(1602493157);
                long webGamesShimmer = ((IndividualColors) fetVar.k(j7x.f16059a)).getWebGamesShimmer();
                fetVar.t();
                return webGamesShimmer;
            case 52:
                fetVar.e0(1602495782);
                long splashBackground = ((IndividualColors) fetVar.k(j7x.f16059a)).getSplashBackground();
                fetVar.t();
                return splashBackground;
            case 53:
                fetVar.e0(1602498569);
                long updateGradientStart = ((IndividualColors) fetVar.k(j7x.f16059a)).getUpdateGradientStart();
                fetVar.t();
                return updateGradientStart;
            case 54:
                fetVar.e0(1602501383);
                long updateGradientEnd = ((IndividualColors) fetVar.k(j7x.f16059a)).getUpdateGradientEnd();
                fetVar.t();
                return updateGradientEnd;
            case 55:
                fetVar.e0(1602503872);
                long coefHigher = ((IndividualColors) fetVar.k(j7x.f16059a)).getCoefHigher();
                fetVar.t();
                return coefHigher;
            case 56:
                fetVar.e0(1602506111);
                long coefLower = ((IndividualColors) fetVar.k(j7x.f16059a)).getCoefLower();
                fetVar.t();
                return coefLower;
            case 57:
                fetVar.e0(1602509403);
                long jM42getItsme0d7_KjU = ((CustomColors) fetVar.k(gxf.f12075a)).m42getItsme0d7_KjU();
                fetVar.t();
                return jM42getItsme0d7_KjU;
            case 58:
                fetVar.e0(1602511195);
                long jM47getQatar0d7_KjU = ((CustomColors) fetVar.k(gxf.f12075a)).m47getQatar0d7_KjU();
                fetVar.t();
                return jM47getQatar0d7_KjU;
            case 59:
                fetVar.e0(1602513480);
                long jM46getPromoGradientStart0d7_KjU = ((CustomColors) fetVar.k(gxf.f12075a)).m46getPromoGradientStart0d7_KjU();
                fetVar.t();
                return jM46getPromoGradientStart0d7_KjU;
            case 60:
                fetVar.e0(1602516102);
                long jM45getPromoGradientEnd0d7_KjU = ((CustomColors) fetVar.k(gxf.f12075a)).m45getPromoGradientEnd0d7_KjU();
                fetVar.t();
                return jM45getPromoGradientEnd0d7_KjU;
            case 61:
                fetVar.e0(1602519018);
                long jM41getDarkBlueBackground800d7_KjU = ((CustomColors) fetVar.k(gxf.f12075a)).m41getDarkBlueBackground800d7_KjU();
                fetVar.t();
                return jM41getDarkBlueBackground800d7_KjU;
            case 62:
                fetVar.e0(1602522058);
                long jM40getDarkBlueBackground650d7_KjU = ((CustomColors) fetVar.k(gxf.f12075a)).m40getDarkBlueBackground650d7_KjU();
                fetVar.t();
                return jM40getDarkBlueBackground650d7_KjU;
            case 63:
                fetVar.e0(1602525915);
                long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                fetVar.t();
                return jM123getWhite0d7_KjU;
            case 64:
                fetVar.e0(1602527964);
                long jM124getWhite00d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m124getWhite00d7_KjU();
                fetVar.t();
                return jM124getWhite00d7_KjU;
            case 65:
                fetVar.e0(1602530044);
                long jM128getWhite40d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m128getWhite40d7_KjU();
                fetVar.t();
                return jM128getWhite40d7_KjU;
            case 66:
                fetVar.e0(1602532157);
                long jM131getWhite800d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m131getWhite800d7_KjU();
                fetVar.t();
                return jM131getWhite800d7_KjU;
            case 67:
                fetVar.e0(1602534301);
                long jM130getWhite600d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                fetVar.t();
                return jM130getWhite600d7_KjU;
            case 68:
                fetVar.e0(1602536445);
                long jM129getWhite400d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m129getWhite400d7_KjU();
                fetVar.t();
                return jM129getWhite400d7_KjU;
            case 69:
                fetVar.e0(1602538589);
                long jM127getWhite300d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m127getWhite300d7_KjU();
                fetVar.t();
                return jM127getWhite300d7_KjU;
            case 70:
                fetVar.e0(1602540733);
                long jM126getWhite200d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m126getWhite200d7_KjU();
                fetVar.t();
                return jM126getWhite200d7_KjU;
            case 71:
                fetVar.e0(1602542877);
                long jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU();
                fetVar.t();
                return jM125getWhite100d7_KjU;
            case 72:
                fetVar.e0(1602544955);
                long jM62getBlack0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m62getBlack0d7_KjU();
                fetVar.t();
                return jM62getBlack0d7_KjU;
            case 73:
                fetVar.e0(1602547037);
                long jM78getBlack800d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m78getBlack800d7_KjU();
                fetVar.t();
                return jM78getBlack800d7_KjU;
            case 74:
                fetVar.e0(1602549181);
                long jM76getBlack700d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m76getBlack700d7_KjU();
                fetVar.t();
                return jM76getBlack700d7_KjU;
            case 75:
                fetVar.e0(1602551325);
                long jM75getBlack600d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m75getBlack600d7_KjU();
                fetVar.t();
                return jM75getBlack600d7_KjU;
            case 76:
                fetVar.e0(1602553469);
                long jM73getBlack400d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m73getBlack400d7_KjU();
                fetVar.t();
                return jM73getBlack400d7_KjU;
            case 77:
                fetVar.e0(1602555613);
                long jM70getBlack200d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m70getBlack200d7_KjU();
                fetVar.t();
                return jM70getBlack200d7_KjU;
            case 78:
                fetVar.e0(1602557757);
                long jM68getBlack180d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m68getBlack180d7_KjU();
                fetVar.t();
                return jM68getBlack180d7_KjU;
            case 79:
                fetVar.e0(1602559901);
                long jM67getBlack160d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m67getBlack160d7_KjU();
                fetVar.t();
                return jM67getBlack160d7_KjU;
            case 80:
                fetVar.e0(1602562045);
                long jM66getBlack140d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m66getBlack140d7_KjU();
                fetVar.t();
                return jM66getBlack140d7_KjU;
            case 81:
                fetVar.e0(1602564189);
                long jM65getBlack120d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m65getBlack120d7_KjU();
                fetVar.t();
                return jM65getBlack120d7_KjU;
            case 82:
                fetVar.e0(1602566333);
                long jM64getBlack100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m64getBlack100d7_KjU();
                fetVar.t();
                return jM64getBlack100d7_KjU;
            case 83:
                fetVar.e0(1602568444);
                long jM77getBlack80d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m77getBlack80d7_KjU();
                fetVar.t();
                return jM77getBlack80d7_KjU;
            case 84:
                fetVar.e0(1602570524);
                long jM74getBlack60d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m74getBlack60d7_KjU();
                fetVar.t();
                return jM74getBlack60d7_KjU;
            case 85:
                fetVar.e0(1602572604);
                long jM72getBlack40d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m72getBlack40d7_KjU();
                fetVar.t();
                return jM72getBlack40d7_KjU;
            case 86:
                fetVar.e0(1602574684);
                long jM69getBlack20d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m69getBlack20d7_KjU();
                fetVar.t();
                return jM69getBlack20d7_KjU;
            case 87:
                fetVar.e0(1602576698);
                long jM95getGray0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m95getGray0d7_KjU();
                fetVar.t();
                return jM95getGray0d7_KjU;
            case 88:
                fetVar.e0(1602578716);
                long jM97getGray400d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m97getGray400d7_KjU();
                fetVar.t();
                return jM97getGray400d7_KjU;
            case 89:
                fetVar.e0(1602580697);
                long jM113getRed0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU();
                fetVar.t();
                return jM113getRed0d7_KjU;
            case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                fetVar.e0(1602588699);
                long jM114getRed100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m114getRed100d7_KjU();
                fetVar.t();
                return jM114getRed100d7_KjU;
            case 91:
                fetVar.e0(1602586683);
                long jM115getRed200d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m115getRed200d7_KjU();
                fetVar.t();
                return jM115getRed200d7_KjU;
            case 92:
                fetVar.e0(1602584667);
                long jM116getRed300d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m116getRed300d7_KjU();
                fetVar.t();
                return jM116getRed300d7_KjU;
            case 93:
                fetVar.e0(1602582651);
                long jM117getRed400d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m117getRed400d7_KjU();
                fetVar.t();
                return jM117getRed400d7_KjU;
            case 94:
                fetVar.e0(1602590715);
                long jM98getGreen0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU();
                fetVar.t();
                return jM98getGreen0d7_KjU;
            case 95:
                fetVar.e0(1602599229);
                long jM99getGreen100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m99getGreen100d7_KjU();
                fetVar.t();
                return jM99getGreen100d7_KjU;
            case 96:
                fetVar.e0(1602597085);
                long jM100getGreen200d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m100getGreen200d7_KjU();
                fetVar.t();
                return jM100getGreen200d7_KjU;
            case 97:
                fetVar.e0(1602594941);
                long jM101getGreen300d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m101getGreen300d7_KjU();
                fetVar.t();
                return jM101getGreen300d7_KjU;
            case 98:
                fetVar.e0(1602592797);
                long jM102getGreen400d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m102getGreen400d7_KjU();
                fetVar.t();
                return jM102getGreen400d7_KjU;
            case 99:
                fetVar.e0(1602601340);
                long jM122getViolet0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m122getViolet0d7_KjU();
                fetVar.t();
                return jM122getViolet0d7_KjU;
            case Response.TRYING /* 100 */:
                fetVar.e0(1602603420);
                long jM111getPurple0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m111getPurple0d7_KjU();
                fetVar.t();
                return jM111getPurple0d7_KjU;
            case 101:
                fetVar.e0(1602605566);
                long jM112getPurple100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m112getPurple100d7_KjU();
                fetVar.t();
                return jM112getPurple100d7_KjU;
            case 102:
                fetVar.e0(1602607806);
                long jM81getDarkBlue0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m81getDarkBlue0d7_KjU();
                fetVar.t();
                return jM81getDarkBlue0d7_KjU;
            case 103:
                fetVar.e0(1602610112);
                long jM84getDarkBlue300d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m84getDarkBlue300d7_KjU();
                fetVar.t();
                return jM84getDarkBlue300d7_KjU;
            case 104:
                fetVar.e0(1602612480);
                long jM85getDarkBlue400d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m85getDarkBlue400d7_KjU();
                fetVar.t();
                return jM85getDarkBlue400d7_KjU;
            case 105:
                fetVar.e0(1602614618);
                long jM79getBlue0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m79getBlue0d7_KjU();
                fetVar.t();
                return jM79getBlue0d7_KjU;
            case 106:
                fetVar.e0(1602616636);
                long jM80getBlue100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m80getBlue100d7_KjU();
                fetVar.t();
                return jM80getBlue100d7_KjU;
            case 107:
                fetVar.e0(1602618650);
                long jM119getTeal0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m119getTeal0d7_KjU();
                fetVar.t();
                return jM119getTeal0d7_KjU;
            case 108:
                fetVar.e0(1602620668);
                long jM120getTeal100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m120getTeal100d7_KjU();
                fetVar.t();
                return jM120getTeal100d7_KjU;
            case 109:
                fetVar.e0(1602622748);
                long jM132getYellow0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m132getYellow0d7_KjU();
                fetVar.t();
                return jM132getYellow0d7_KjU;
            case 110:
                fetVar.e0(1602624894);
                long jM135getYellow300d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m135getYellow300d7_KjU();
                fetVar.t();
                return jM135getYellow300d7_KjU;
            case 111:
                fetVar.e0(1602627102);
                long jM134getYellow200d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m134getYellow200d7_KjU();
                fetVar.t();
                return jM134getYellow200d7_KjU;
            case 112:
                fetVar.e0(1602629310);
                long jM133getYellow100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m133getYellow100d7_KjU();
                fetVar.t();
                return jM133getYellow100d7_KjU;
            case 113:
                fetVar.e0(1602631452);
                long jM104getOrange0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m104getOrange0d7_KjU();
                fetVar.t();
                return jM104getOrange0d7_KjU;
            case 114:
                fetVar.e0(1602633696);
                long jM87getDarkOrange0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m87getDarkOrange0d7_KjU();
                fetVar.t();
                return jM87getDarkOrange0d7_KjU;
            case 115:
                fetVar.e0(1602636130);
                long jM89getDarkOrange200d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m89getDarkOrange200d7_KjU();
                fetVar.t();
                return jM89getDarkOrange200d7_KjU;
            case 116:
                fetVar.e0(1602638626);
                long jM88getDarkOrange100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m88getDarkOrange100d7_KjU();
                fetVar.t();
                return jM88getDarkOrange100d7_KjU;
            case 117:
                fetVar.e0(1602641056);
                long jM103getLightBrown0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m103getLightBrown0d7_KjU();
                fetVar.t();
                return jM103getLightBrown0d7_KjU;
            case 118:
                fetVar.e0(1602643194);
                long jM110getPink0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m110getPink0d7_KjU();
                fetVar.t();
                return jM110getPink0d7_KjU;
            case 119:
                fetVar.e0(1602645310);
                long jM92getDarkPink0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m92getDarkPink0d7_KjU();
                fetVar.t();
                return jM92getDarkPink0d7_KjU;
            case 120:
                fetVar.e0(1602647846);
                long jM94getGamesTextVictory0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m94getGamesTextVictory0d7_KjU();
                fetVar.t();
                return jM94getGamesTextVictory0d7_KjU;
            case 121:
                fetVar.e0(1602650598);
                long jM93getGamesCoefficient0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m93getGamesCoefficient0d7_KjU();
                fetVar.t();
                return jM93getGamesCoefficient0d7_KjU;
            case 122:
                fetVar.e0(1602653153);
                long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                fetVar.t();
                return jM121getTransparent0d7_KjU;
            case 123:
                fetVar.e0(1602656902);
                long j = ((idv0) fetVar.k(jdv0.f16348a)).f14604a;
                fetVar.t();
                return j;
            case 124:
                fetVar.e0(1602659331);
                long j2 = ((idv0) fetVar.k(jdv0.f16348a)).b;
                fetVar.t();
                return j2;
            case 125:
                fetVar.e0(1602661568);
                long j3 = ((idv0) fetVar.k(jdv0.f16348a)).c;
                fetVar.t();
                return j3;
            case 126:
                fetVar.e0(1602663712);
                long j4 = ((idv0) fetVar.k(jdv0.f16348a)).d;
                fetVar.t();
                return j4;
            case 127:
                fetVar.e0(1602666152);
                long j5 = ((idv0) fetVar.k(jdv0.f16348a)).e;
                fetVar.t();
                return j5;
            case 128:
                fetVar.e0(1602670183);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j6 = ijg.b;
                fetVar.t();
                return j6;
            case 129:
                fetVar.e0(1602672806);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j7 = ijg.c;
                fetVar.t();
                return j7;
            case 130:
                fetVar.e0(1602675235);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j8 = ijg.d;
                fetVar.t();
                return j8;
            case 131:
                fetVar.e0(1602677670);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j9 = ijg.e;
                fetVar.t();
                return j9;
            case 132:
                fetVar.e0(1602680099);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j10 = ijg.f;
                fetVar.t();
                return j10;
            case 133:
                fetVar.e0(1602682435);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j11 = ijg.g;
                fetVar.t();
                return j11;
            case 134:
                fetVar.e0(1602684771);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j12 = ijg.h;
                fetVar.t();
                return j12;
            case 135:
                fetVar.e0(1602687107);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j13 = ijg.i;
                fetVar.t();
                return j13;
            case 136:
                fetVar.e0(1602689443);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j14 = ijg.j;
                fetVar.t();
                return j14;
            case 137:
                fetVar.e0(1602691779);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j15 = ijg.k;
                fetVar.t();
                return j15;
            case 138:
                fetVar.e0(1602694115);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j16 = ijg.l;
                fetVar.t();
                return j16;
            case 139:
                fetVar.e0(1602696484);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j17 = ijg.m;
                fetVar.t();
                return j17;
            case 140:
                fetVar.e0(1602698983);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j18 = ijg.n;
                fetVar.t();
                return j18;
            case 141:
                fetVar.e0(1602701575);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j19 = ijg.o;
                fetVar.t();
                return j19;
            case 142:
                fetVar.e0(1602704101);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j20 = ijg.p;
                fetVar.t();
                return j20;
            case 143:
                fetVar.e0(1602706565);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j21 = ijg.q;
                fetVar.t();
                return j21;
            case 144:
                fetVar.e0(1602709029);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j22 = ijg.r;
                fetVar.t();
                return j22;
            case 145:
                fetVar.e0(1602711493);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j23 = ijg.s;
                fetVar.t();
                return j23;
            case 146:
                fetVar.e0(1602713957);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j24 = ijg.t;
                fetVar.t();
                return j24;
            case 147:
                fetVar.e0(1602716421);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j25 = ijg.u;
                fetVar.t();
                return j25;
            case 148:
                fetVar.e0(1602718885);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j26 = ijg.v;
                fetVar.t();
                return j26;
            case 149:
                fetVar.e0(1602721349);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j27 = ijg.w;
                fetVar.t();
                return j27;
            case 150:
                fetVar.e0(1602723813);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j28 = ijg.x;
                fetVar.t();
                return j28;
            case 151:
                fetVar.e0(1602726310);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j29 = ijg.y;
                fetVar.t();
                return j29;
            case 152:
                fetVar.e0(1602728838);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j30 = ijg.z;
                fetVar.t();
                return j30;
            case 153:
                fetVar.e0(1602731465);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j31 = ijg.A;
                fetVar.t();
                return j31;
            case 154:
                fetVar.e0(1602734086);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j32 = ijg.B;
                fetVar.t();
                return j32;
            case 155:
                fetVar.e0(1602736614);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j33 = ijg.C;
                fetVar.t();
                return j33;
            case 156:
                fetVar.e0(1602739142);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j34 = ijg.D;
                fetVar.t();
                return j34;
            case 157:
                fetVar.e0(1602741670);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j35 = ijg.E;
                fetVar.t();
                return j35;
            case 158:
                fetVar.e0(1602744099);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j36 = ijg.F;
                fetVar.t();
                return j36;
            case 159:
                fetVar.e0(1602746435);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j37 = ijg.G;
                fetVar.t();
                return j37;
            case 160:
                fetVar.e0(1602748771);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j38 = ijg.H;
                fetVar.t();
                return j38;
            case 161:
                fetVar.e0(1602751107);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j39 = ijg.I;
                fetVar.t();
                return j39;
            case 162:
                fetVar.e0(1602753509);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j40 = ijg.J;
                fetVar.t();
                return j40;
            case 163:
                fetVar.e0(1602755973);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j41 = ijg.K;
                fetVar.t();
                return j41;
            case 164:
                fetVar.e0(1602758437);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j42 = ijg.L;
                fetVar.t();
                return j42;
            case 165:
                fetVar.e0(1602760901);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j43 = ijg.M;
                fetVar.t();
                return j43;
            case 166:
                fetVar.e0(1602763365);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j44 = ijg.N;
                fetVar.t();
                return j44;
            case 167:
                fetVar.e0(1602765829);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j45 = ijg.O;
                fetVar.t();
                return j45;
            case 168:
                fetVar.e0(1602768293);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j46 = ijg.P;
                fetVar.t();
                return j46;
            case 169:
                fetVar.e0(1602770757);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j47 = ijg.Q;
                fetVar.t();
                return j47;
            case 170:
                fetVar.e0(1602773221);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j48 = ijg.R;
                fetVar.t();
                return j48;
            case 171:
                fetVar.e0(1602775685);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j49 = ijg.S;
                fetVar.t();
                return j49;
            case 172:
                fetVar.e0(1602778149);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j50 = ijg.T;
                fetVar.t();
                return j50;
            case 173:
                fetVar.e0(1602780514);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j51 = ijg.U;
                fetVar.t();
                return j51;
            case 174:
                fetVar.e0(1602782786);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j52 = ijg.V;
                fetVar.t();
                return j52;
            case 175:
                fetVar.e0(1602785058);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j53 = ijg.W;
                fetVar.t();
                return j53;
            case 176:
                fetVar.e0(1602787330);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j54 = ijg.X;
                fetVar.t();
                return j54;
            case 177:
                fetVar.e0(1602789701);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j55 = ijg.Y;
                fetVar.t();
                return j55;
            case 178:
                fetVar.e0(1602792066);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j56 = ijg.Z;
                fetVar.t();
                return j56;
            case 179:
                fetVar.e0(1602794338);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j57 = ijg.a0;
                fetVar.t();
                return j57;
            case 180:
                fetVar.e0(1602796610);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j58 = ijg.b0;
                fetVar.t();
                return j58;
            case Response.CALL_IS_BEING_FORWARDED /* 181 */:
                fetVar.e0(1602798981);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j59 = ijg.d0;
                fetVar.t();
                return j59;
            case Response.QUEUED /* 182 */:
                fetVar.e0(1602801379);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j60 = ijg.e0;
                fetVar.t();
                return j60;
            case Response.SESSION_PROGRESS /* 183 */:
                fetVar.e0(1602803715);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j61 = ijg.f0;
                fetVar.t();
                return j61;
            case 184:
                fetVar.e0(1602806150);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j62 = ijg.g0;
                fetVar.t();
                return j62;
            case ModuleDescriptor.MODULE_VERSION /* 185 */:
                fetVar.e0(1602808579);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j63 = ijg.h0;
                fetVar.t();
                return j63;
            case 186:
                fetVar.e0(1602811014);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j64 = ijg.i0;
                fetVar.t();
                return j64;
            case 187:
                fetVar.e0(1602813443);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j65 = ijg.j0;
                fetVar.t();
                return j65;
            case 188:
                fetVar.e0(1602815779);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j66 = ijg.k0;
                fetVar.t();
                return j66;
            case 189:
                fetVar.e0(1602818115);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j67 = ijg.l0;
                fetVar.t();
                return j67;
            case 190:
                fetVar.e0(1602820451);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j68 = ijg.m0;
                fetVar.t();
                return j68;
            case 191:
                fetVar.e0(1602822820);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j69 = ijg.n0;
                fetVar.t();
                return j69;
            case 192:
                fetVar.e0(1602825220);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j70 = ijg.o0;
                fetVar.t();
                return j70;
            case 193:
                fetVar.e0(1602827620);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j71 = ijg.p0;
                fetVar.t();
                return j71;
            case 194:
                fetVar.e0(1602830020);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j72 = ijg.q0;
                fetVar.t();
                return j72;
            case 195:
                fetVar.e0(1602832420);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j73 = ijg.r0;
                fetVar.t();
                return j73;
            case 196:
                fetVar.e0(1602834820);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j74 = ijg.s0;
                fetVar.t();
                return j74;
            case 197:
                fetVar.e0(1602837319);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j75 = ijg.t0;
                fetVar.t();
                return j75;
            case 198:
                fetVar.e0(1602839812);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j76 = ijg.u0;
                fetVar.t();
                return j76;
            case 199:
                fetVar.e0(1602842212);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j77 = ijg.v0;
                fetVar.t();
                return j77;
            case Response.OK /* 200 */:
                fetVar.e0(1602844645);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j78 = ijg.w0;
                fetVar.t();
                return j78;
            case 201:
                fetVar.e0(1602847109);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j79 = ijg.x0;
                fetVar.t();
                return j79;
            case Response.ACCEPTED /* 202 */:
                fetVar.e0(1602849573);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j80 = ijg.y0;
                fetVar.t();
                return j80;
            case 203:
                fetVar.e0(1602852037);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j81 = ijg.z0;
                fetVar.t();
                return j81;
            case 204:
                fetVar.e0(1602854501);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j82 = ijg.A0;
                fetVar.t();
                return j82;
            case 205:
                fetVar.e0(1602856965);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j83 = ijg.B0;
                fetVar.t();
                return j83;
            case 206:
                fetVar.e0(1602859429);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j84 = ijg.C0;
                fetVar.t();
                return j84;
            case 207:
                fetVar.e0(1602861893);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j85 = ijg.D0;
                fetVar.t();
                return j85;
            case 208:
                fetVar.e0(1602864357);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j86 = ijg.E0;
                fetVar.t();
                return j86;
            case 209:
                fetVar.e0(1602866821);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j87 = ijg.F0;
                fetVar.t();
                return j87;
            case 210:
                fetVar.e0(1602869318);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j88 = ijg.G0;
                fetVar.t();
                return j88;
            case 211:
                fetVar.e0(1602871747);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j89 = ijg.H0;
                fetVar.t();
                return j89;
            case 212:
                fetVar.e0(1602874083);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j90 = ijg.I0;
                fetVar.t();
                return j90;
            case 213:
                fetVar.e0(1602876419);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j91 = ijg.J0;
                fetVar.t();
                return j91;
            case 214:
                fetVar.e0(1602878854);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j92 = ijg.K0;
                fetVar.t();
                return j92;
            case 215:
                fetVar.e0(1602881283);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j93 = ijg.L0;
                fetVar.t();
                return j93;
            case 216:
                fetVar.e0(1602883619);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j94 = ijg.M0;
                fetVar.t();
                return j94;
            case 217:
                fetVar.e0(1602886054);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j95 = ijg.N0;
                fetVar.t();
                return j95;
            case 218:
                fetVar.e0(1602888483);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j96 = ijg.O0;
                fetVar.t();
                return j96;
            case 219:
                fetVar.e0(1602890852);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j97 = ijg.P0;
                fetVar.t();
                return j97;
            case 220:
                fetVar.e0(1602893252);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j98 = ijg.Q0;
                fetVar.t();
                return j98;
            case 221:
                fetVar.e0(1602895652);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j99 = ijg.R0;
                fetVar.t();
                return j99;
            case 222:
                fetVar.e0(1602898052);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j100 = ijg.S0;
                fetVar.t();
                return j100;
            case 223:
                fetVar.e0(1602900452);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j101 = ijg.T0;
                fetVar.t();
                return j101;
            case 224:
                fetVar.e0(1602902852);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j102 = ijg.U0;
                fetVar.t();
                return j102;
            case 225:
                fetVar.e0(1602905252);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j103 = ijg.V0;
                fetVar.t();
                return j103;
            case 226:
                fetVar.e0(1602907652);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j104 = ijg.W0;
                fetVar.t();
                return j104;
            case 227:
                fetVar.e0(1602910052);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j105 = ijg.X0;
                fetVar.t();
                return j105;
            case 228:
                fetVar.e0(1602912551);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j106 = ijg.Y0;
                fetVar.t();
                return j106;
            case 229:
                fetVar.e0(1602915044);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j107 = ijg.Z0;
                fetVar.t();
                return j107;
            case 230:
                fetVar.e0(1602917444);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j108 = ijg.a1;
                fetVar.t();
                return j108;
            case 231:
                fetVar.e0(1602919844);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j109 = ijg.b1;
                fetVar.t();
                return j109;
            case 232:
                fetVar.e0(1602922343);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j110 = ijg.c1;
                fetVar.t();
                return j110;
            case 233:
                fetVar.e0(1602924836);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j111 = ijg.d1;
                fetVar.t();
                return j111;
            case 234:
                fetVar.e0(1602927236);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j112 = ijg.e1;
                fetVar.t();
                return j112;
            case 235:
                fetVar.e0(1602929636);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j113 = ijg.f1;
                fetVar.t();
                return j113;
            case 236:
                fetVar.e0(1602932036);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j114 = ijg.g1;
                fetVar.t();
                return j114;
            case 237:
                fetVar.e0(1602934436);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j115 = ijg.h1;
                fetVar.t();
                return j115;
            case 238:
                fetVar.e0(1602936836);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j116 = ijg.i1;
                fetVar.t();
                return j116;
            case 239:
                fetVar.e0(1602939236);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j117 = ijg.k1;
                fetVar.t();
                return j117;
            case 240:
                fetVar.e0(1602941636);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j118 = ijg.l1;
                fetVar.t();
                return j118;
            case 241:
                fetVar.e0(1602944135);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j119 = ijg.m1;
                fetVar.t();
                return j119;
            case 242:
                fetVar.e0(1602946628);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j120 = ijg.n1;
                fetVar.t();
                return j120;
            case 243:
                fetVar.e0(1602949028);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j121 = ijg.o1;
                fetVar.t();
                return j121;
            case 244:
                fetVar.e0(1602951428);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j122 = ijg.p1;
                fetVar.t();
                return j122;
            case 245:
                fetVar.e0(1602953828);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j123 = ijg.q1;
                fetVar.t();
                return j123;
            case 246:
                fetVar.e0(1602956228);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j124 = ijg.r1;
                fetVar.t();
                return j124;
            case 247:
                fetVar.e0(1602958628);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j125 = ijg.s1;
                fetVar.t();
                return j125;
            case 248:
                fetVar.e0(1602961061);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j126 = ijg.t1;
                fetVar.t();
                return j126;
            case 249:
                fetVar.e0(1602963525);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j127 = ijg.u1;
                fetVar.t();
                return j127;
            case 250:
                fetVar.e0(1602965989);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j128 = ijg.v1;
                fetVar.t();
                return j128;
            case 251:
                fetVar.e0(1602968453);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j129 = ijg.w1;
                fetVar.t();
                return j129;
            case 252:
                fetVar.e0(1602970917);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j130 = ijg.x1;
                fetVar.t();
                return j130;
            case 253:
                fetVar.e0(1602973381);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j131 = ijg.y1;
                fetVar.t();
                return j131;
            case 254:
                fetVar.e0(1602975845);
                ((ijg) fetVar.k(jjg.f16616a)).getClass();
                long j132 = ijg.z1;
                fetVar.t();
                return j132;
            case 255:
                fetVar.e0(1602979908);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j133 = hi0.b;
                fetVar.t();
                return j133;
            case 256:
                fetVar.e0(1602982502);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j134 = hi0.c;
                fetVar.t();
                return j134;
            case 257:
                fetVar.e0(1602985125);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j135 = hi0.d;
                fetVar.t();
                return j135;
            case 258:
                fetVar.e0(1602987717);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j136 = hi0.e;
                fetVar.t();
                return j136;
            case 259:
                fetVar.e0(1602990375);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j137 = hi0.f;
                fetVar.t();
                return j137;
            case 260:
                fetVar.e0(1602993095);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j138 = hi0.g;
                fetVar.t();
                return j138;
            case 261:
                fetVar.e0(1602995782);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j139 = hi0.h;
                fetVar.t();
                return j139;
            case 262:
                fetVar.e0(1602998504);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j140 = hi0.i;
                fetVar.t();
                return j140;
            case 263:
                fetVar.e0(1603001255);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j141 = hi0.j;
                fetVar.t();
                return j141;
            case 264:
                fetVar.e0(1603003843);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j142 = hi0.k;
                fetVar.t();
                return j142;
            case 265:
                fetVar.e0(1603006373);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j143 = hi0.l;
                fetVar.t();
                return j143;
            case 266:
                fetVar.e0(1603008964);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j144 = hi0.m;
                fetVar.t();
                return j144;
            case 267:
                fetVar.e0(1603011558);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j145 = hi0.n;
                fetVar.t();
                return j145;
            case 268:
                fetVar.e0(1603014280);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j146 = hi0.o;
                fetVar.t();
                return j146;
            case 269:
                fetVar.e0(1603017064);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j147 = hi0.p;
                fetVar.t();
                return j147;
            case SubsamplingScaleImageView.ORIENTATION_270 /* 270 */:
                fetVar.e0(1603019815);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j148 = hi0.q;
                fetVar.t();
                return j148;
            case 271:
                fetVar.e0(1603022568);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j149 = hi0.r;
                fetVar.t();
                return j149;
            case 272:
                fetVar.e0(1603025253);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j150 = hi0.s;
                fetVar.t();
                return j150;
            case 273:
                fetVar.e0(1603027812);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j151 = hi0.t;
                fetVar.t();
                return j151;
            case 274:
                fetVar.e0(1603030406);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j152 = hi0.u;
                fetVar.t();
                return j152;
            case 275:
                fetVar.e0(1603033259);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j153 = hi0.v;
                fetVar.t();
                return j153;
            case 276:
                fetVar.e0(1603036201);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j154 = hi0.w;
                fetVar.t();
                return j154;
            case 277:
                fetVar.e0(1603039311);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j155 = hi0.x;
                fetVar.t();
                return j155;
            case 278:
                fetVar.e0(1603042541);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j156 = hi0.y;
                fetVar.t();
                return j156;
            case 279:
                fetVar.e0(1603045414);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j157 = hi0.z;
                fetVar.t();
                return j157;
            case 280:
                fetVar.e0(1603048267);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j158 = hi0.A;
                fetVar.t();
                return j158;
            case 281:
                fetVar.e0(1603051209);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j159 = hi0.B;
                fetVar.t();
                return j159;
            case 282:
                fetVar.e0(1603054319);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j160 = hi0.C;
                fetVar.t();
                return j160;
            case 283:
                fetVar.e0(1603057549);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j161 = hi0.D;
                fetVar.t();
                return j161;
            case 284:
                fetVar.e0(1603060422);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j162 = hi0.E;
                fetVar.t();
                return j162;
            case 285:
                fetVar.e0(1603063275);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j163 = hi0.F;
                fetVar.t();
                return j163;
            case 286:
                fetVar.e0(1603066217);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j164 = hi0.G;
                fetVar.t();
                return j164;
            case 287:
                fetVar.e0(1603069327);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j165 = hi0.H;
                fetVar.t();
                return j165;
            case 288:
                fetVar.e0(1603072557);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j166 = hi0.I;
                fetVar.t();
                return j166;
            case 289:
                fetVar.e0(1603075364);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j167 = hi0.J;
                fetVar.t();
                return j167;
            case 290:
                fetVar.e0(1603078089);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j168 = hi0.K;
                fetVar.t();
                return j168;
            case 291:
                fetVar.e0(1603080903);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j169 = hi0.L;
                fetVar.t();
                return j169;
            case 292:
                fetVar.e0(1603083885);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j170 = hi0.M;
                fetVar.t();
                return j170;
            case 293:
                fetVar.e0(1603086987);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j171 = hi0.N;
                fetVar.t();
                return j171;
            case 294:
                fetVar.e0(1603089732);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j172 = hi0.O;
                fetVar.t();
                return j172;
            case 295:
                fetVar.e0(1603092457);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j173 = hi0.P;
                fetVar.t();
                return j173;
            case 296:
                fetVar.e0(1603095271);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j174 = hi0.Q;
                fetVar.t();
                return j174;
            case 297:
                fetVar.e0(1603098253);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j175 = hi0.R;
                fetVar.t();
                return j175;
            case 298:
                fetVar.e0(1603101355);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j176 = hi0.S;
                fetVar.t();
                return j176;
            case 299:
                fetVar.e0(1603104232);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j177 = hi0.T;
                fetVar.t();
                return j177;
            case 300:
                fetVar.e0(1603107213);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j178 = hi0.U;
                fetVar.t();
                return j178;
            case 301:
                fetVar.e0(1603110283);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j179 = hi0.V;
                fetVar.t();
                return j179;
            case 302:
                fetVar.e0(1603113521);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j180 = hi0.W;
                fetVar.t();
                return j180;
            case WarningHeader.INCOMPATIBLE_BANDWIDTH_UNITS /* 303 */:
                fetVar.e0(1603116879);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j181 = hi0.X;
                fetVar.t();
                return j181;
            case WarningHeader.MEDIA_TYPE_NOT_AVAILABLE /* 304 */:
                fetVar.e0(1603119913);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j182 = hi0.Y;
                fetVar.t();
                return j182;
            case 305:
                fetVar.e0(1603122958);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j183 = hi0.Z;
                fetVar.t();
                return j183;
            case WarningHeader.ATTRIBUTE_NOT_UNDERSTOOD /* 306 */:
                fetVar.e0(1603126092);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j184 = hi0.a0;
                fetVar.t();
                return j184;
            case WarningHeader.SESSION_DESCRIPTION_PARAMETER_NOT_UNDERSTOOD /* 307 */:
                fetVar.e0(1603129394);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j185 = hi0.b0;
                fetVar.t();
                return j185;
            case 308:
                fetVar.e0(1603132816);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j186 = hi0.c0;
                fetVar.t();
                return j186;
            case 309:
                fetVar.e0(1603135683);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j187 = hi0.d0;
                fetVar.t();
                return j187;
            case 310:
                fetVar.e0(1603138344);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j188 = hi0.e0;
                fetVar.t();
                return j188;
            case 311:
                fetVar.e0(1603141094);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j189 = hi0.f0;
                fetVar.t();
                return j189;
            case 312:
                fetVar.e0(1603144012);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j190 = hi0.g0;
                fetVar.t();
                return j190;
            case 313:
                fetVar.e0(1603147050);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j191 = hi0.h0;
                fetVar.t();
                return j191;
            case 314:
                fetVar.e0(1603149863);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j192 = hi0.i0;
                fetVar.t();
                return j192;
            case 315:
                fetVar.e0(1603152780);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j193 = hi0.j0;
                fetVar.t();
                return j193;
            case 316:
                fetVar.e0(1603155786);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j194 = hi0.k0;
                fetVar.t();
                return j194;
            case 317:
                fetVar.e0(1603158960);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j195 = hi0.l0;
                fetVar.t();
                return j195;
            case 318:
                fetVar.e0(1603162254);
                ((hi0) fetVar.k(ii0.f14805a)).getClass();
                long j196 = hi0.m0;
                fetVar.t();
                return j196;
            default:
                fetVar.e0(1602398358);
                fetVar.t();
                throw new m460();
        }
    }

    public static final long Z(long j) {
        long j2 = (j << 1) + 1;
        wen.b.getClass();
        int i = yen.f42494a;
        return j2;
    }

    public static final void a(int i, kpm kpmVar, fet fetVar, mm40 mm40Var, String str, String str2, boolean z) {
        fet fetVar2 = fetVar;
        fetVar2.g0(163762977);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(kpmVar) ? 2048 : 1024) | (fetVar2.h(z) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(mm40VarD2, 0.0f, 0.0f, 0.0f, 8.0f, 7), 28.0f);
            zx7 zx7Var = gqw0.b;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            zfn zfnVar = zaq0.b;
            v8q0.a(str, jr8.f16991a.b(jm40Var, zx7Var), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.g(), fetVar2, (i2 >> 3) & 14, 24960, 109560);
            fetVar2.r(true);
            int i3 = i2 >> 6;
            n4c.l(null, kpmVar, z, fetVar2, 1);
            mm40 mm40VarE2 = o7k0.e(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), 28.0f);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE2);
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
            v8q0.a(str2, null, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.g(), fetVar2, i3 & 14, 24960, 109562);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dtm(mm40Var, str, str2, kpmVar, z, i);
        }
    }

    public static final long a0(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? Z(l1e0.f(j, -4611686018427387903L, 4611686018427387903L)) : b0(j * 1000000);
    }

    public static final void b(final String str, final boolean z, final long j, final long j2, final int i, final boolean z2, final Function0 function0, final xdr xdrVar, xdr xdrVar2, fet fetVar, final int i2) {
        fet fetVar2;
        final xdr xdrVar3;
        boolean z3;
        Object obj;
        boolean z4;
        Object obj2;
        xdr xdrVar4;
        xdr xdrVar5 = xdrVar2;
        str.getClass();
        function0.getClass();
        fetVar.g0(295046025);
        int i3 = i2 | (fetVar.g(str) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.f(j) ? 256 : 128) | (fetVar.f(j2) ? 2048 : 1024) | (fetVar.e(i) ? 16384 : 8192) | (fetVar.h(z2) ? 131072 : 65536) | (fetVar.i(function0) ? 1048576 : 524288) | (fetVar.i(xdrVar) ? 8388608 : 4194304) | (fetVar.i(xdrVar5) ? 67108864 : 33554432);
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "DS_CHIP");
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarE0, 48.0f, 0.0f, 2);
            boolean z5 = ((3670016 & i3) == 1048576) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            Object obj3 = objP;
            if (z5 || objP == cl5Var) {
                jw7 jw7Var = new jw7(z, function0, (byte) 3);
                fetVar.o0(jw7Var);
                obj3 = jw7Var;
            }
            mm40 mm40VarF = phu0.F(mm40VarG, null, null, false, null, (Function0) obj3, fetVar, 0, 15);
            boolean z6 = ((458752 & i3) == 131072) | ((i3 & 896) == 256);
            Object objP2 = fetVar.P();
            if (z6 || objP2 == cl5Var) {
                z3 = false;
                gbc gbcVar = new gbc(z2, j, false ? 1 : 0);
                fetVar.o0(gbcVar);
                obj = gbcVar;
            } else {
                z3 = false;
                obj = objP2;
            }
            mm40 mm40VarL = s5x0.L(pai0.a(mm40VarF, true, (Function1) obj), 0.0f, 8.0f, 1);
            tj30 tj30VarC = zq8.c(gqw0.e, z3);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z7 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z7) {
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
            mm40 mm40VarG2 = o7k0.g(epv0.N(jm40Var, z ? 0.5f : 1.0f), 32.0f, 0.0f, 2);
            zx7 zx7Var = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarQ = i120.Q(jr8Var.b(mm40VarG2, zx7Var), j, vgg0.a(14.0f));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
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
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, s5x0.K(jm40Var, 12.0f, 6.0f), j2, null, 0L, null, null, null, 0L, null, 0L, 2, false, i, 0, null, g1t0.n(), fetVar, (i3 & 14) | ((i3 >> 3) & 896), (i3 & 57344) | 384, 110584);
            fet fetVar3 = fetVar;
            fetVar3.r(true);
            if (xdrVar == null) {
                fetVar3.e0(-1643329699);
                z4 = false;
                fetVar3.r(false);
                obj2 = 6;
            } else {
                z4 = false;
                fetVar3.e0(-1643329698);
                obj2 = 6;
                xdrVar.F(jr8Var, fetVar3, 6);
                fetVar3.r(false);
            }
            if (xdrVar2 == null) {
                fetVar3.e0(-1643258275);
                fetVar3.r(z4);
                xdrVar4 = xdrVar2;
            } else {
                fetVar3.e0(-1643258274);
                xdr xdrVar6 = xdrVar2;
                xdrVar6.F(jr8Var, fetVar3, obj2);
                fetVar3.r(z4);
                xdrVar4 = xdrVar6;
            }
            fetVar3.r(true);
            xdrVar3 = xdrVar4;
            fetVar2 = fetVar3;
        } else {
            fet fetVar4 = fetVar;
            fetVar4.X();
            xdrVar3 = xdrVar5;
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(str, z, j, j2, i, z2, function0, xdrVar, xdrVar3, i2) { // from class: a.hbc

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f12763a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ int e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ Function0 g;
                public final /* synthetic */ xdr h;
                public final /* synthetic */ xdr i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iL = x8x.L(1);
                    ibc.b(this.f12763a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (fet) obj4, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final long b0(long j) {
        long j2 = j << 1;
        wen.b.getClass();
        int i = yen.f42494a;
        return j2;
    }

    public static final void c(tvw tvwVar, String str, boolean z, String str2, String str3, fet fetVar, int i) {
        int i2;
        boolean z2;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1116040444);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(tvwVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(str3) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = r71.t;
                fetVar2.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var2);
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
            mm40 mm40VarK0 = mrv.k0(jm40Var2, "sportIconId");
            if (tvwVar.equals(qvw.f29409a)) {
                fetVar2.e0(719135622);
                zcl zclVar = qmk.f28987a;
                jm40Var = jm40Var2;
                z2 = false;
                j0x.b(a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar2), null, o7k0.n(mm40VarK0, 16.0f), null, null, 0.0f, new m78(((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), 5), fetVar2, 56, 56);
                fetVar2.r(false);
            } else {
                z2 = false;
                jm40Var = jm40Var2;
                if (tvwVar instanceof rvw) {
                    fetVar2.e0(719492463);
                    zcl zclVar2 = qmk.f28987a;
                    lgb.s(o7k0.n(mm40VarK0, 16.0f), ((rvw) tvwVar).f31190a, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), fetVar2);
                    fetVar2.r(false);
                } else {
                    if (!(tvwVar instanceof svw)) {
                        throw b1j.f(854480456, fetVar2, false);
                    }
                    fetVar2.e0(719839446);
                    zcl zclVar3 = qmk.f28987a;
                    j0x.b(a8k0.F(((svw) tvwVar).f32891a, 0, fetVar2), null, o7k0.n(mm40VarK0, 16.0f), null, null, 0.0f, new m78(((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), 5), fetVar2, 56, 56);
                    fetVar2.r(false);
                }
            }
            mm40 mm40VarL = s5x0.L(mrv.k0(jm40Var, "typeTitle"), 4.0f, 0.0f, 2);
            y9q0 y9q0VarT = ibm0.t(g1t0.m(), fetVar2);
            long j = qmk.q;
            long j2 = qmk.r;
            long j3 = qmk.n;
            boolean z3 = z2;
            v8q0.a(str, mm40VarL, 0L, new n05(j, j2, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarT, fetVar, (i2 >> 3) & 14, 24960, 110580);
            if (z) {
                fetVar.e0(-1018698055);
                s(((i2 >> 6) & 112) | 6, fetVar, mrv.k0(jm40Var, "expressCount"), str2);
                fetVar.r(z3);
            } else {
                fetVar.e0(-1514734091);
                fetVar.r(z3);
            }
            v8q0.a(str3, mrv.k0(jm40Var, "coefficient"), 0L, new n05(j, j2, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, ((i2 >> 12) & 14) | 48, 24960, 110580);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) tvwVar, (Object) str, z, (Object) str2, (Object) str3, i, (byte) 18);
        }
    }

    public static final int c0(View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj != null) {
                    if (!tag.equals(obj)) {
                        break;
                    }
                } else {
                    obj = tag;
                }
                i3 = i2;
            }
            i2++;
            Object objV = k7n0.v(view);
            view = objV instanceof View ? (View) objV : null;
        }
        return i3;
    }

    public static final void d(final float f, final long j, fet fetVar, final int i) {
        int i2;
        fetVar.g0(437681351);
        if ((i & 48) == 0) {
            i2 = (fetVar.d(f) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.f(j) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarC = o7k0.c(new x7z(f <= Float.MAX_VALUE ? f : Float.MAX_VALUE, true), 1.0f);
            zcl zclVar = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarC), j, jd8.n));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.kph
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i | 1);
                    ibc.d(f, j, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static int d0(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            int i4 = byteBuffer.get(i) & 255;
            if (i3 >= 2 && i4 == 1) {
                return i - 2;
            }
            i3 = i4 == 0 ? i3 + 1 : 0;
            i++;
        }
        return i2;
    }

    public static final void e(mm40 mm40Var, jam jamVar, p9m p9mVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1864196760);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(jamVar) ? 32 : 16) | (fetVar2.g(p9mVar) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            a4x a4xVar = jamVar.b;
            String str = jamVar.c;
            int size = a4xVar.size();
            a4x a4xVar2 = jamVar.b;
            boolean z = str != null && size > 5;
            Object[] objArr = new Object[0];
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new knl((byte) 29);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP, fetVar2, 48);
            l7m0 l7m0VarB = d43.b(((Boolean) pz40Var.getValue()).booleanValue() ? 1.0f : 0.0f, null, "expanded_progress_label", null, fetVar, 3072, 22);
            long j = p9mVar.f26613a;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(lgb.J(i120.Q(mm40Var, j, vgg0.a(16.0f)), vgg0.a(16.0f)), 8.0f);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = r71.p;
                fetVar.o0(objP2);
            }
            tj30 tj30Var = (tj30) objP2;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            O(jamVar, a4xVar2, p9mVar, l7m0VarB, fetVar, ((i2 >> 3) & 14) | (i2 & 896));
            fetVar2 = fetVar;
            if (z) {
                fetVar2.e0(396426585);
                mm40 mm40VarE = o7k0.e(o7k0.d(jm40.b, 1.0f), 32.0f);
                wul wulVar = new wul(qul.e, oe9.c, new we9(str, ((Boolean) pz40Var.getValue()).booleanValue() ? R.drawable.ic_glyph_chevron_up_small : R.drawable.ic_glyph_chevron_down_small), true, false, false);
                boolean zG = fetVar2.g(pz40Var);
                Object objP3 = fetVar2.P();
                if (zG || objP3 == cl5Var) {
                    objP3 = new cml(pz40Var, (byte) 22);
                    fetVar2.o0(objP3);
                }
                qzb.n(mm40VarE, wulVar, (Function0) objP3, fetVar2, 0, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(397387585);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var, jamVar, p9mVar, i, (byte) 1);
        }
    }

    public static final View e0(View view) {
        if (!view.isAttachedToWindow()) {
            return view;
        }
        int iMin = Math.min(c0(view, R.id.view_tree_lifecycle_owner), c0(view, R.id.view_tree_saved_state_registry_owner));
        View view2 = view;
        int i = 0;
        View view3 = view2;
        while (view != null) {
            if (i == iMin) {
                if (!(view.getParent() instanceof ViewGroup)) {
                    return view2;
                }
            } else if (h0(view) == null) {
                i++;
                Object objV = k7n0.v(view);
                View view4 = view2;
                view2 = view;
                view = objV instanceof View ? (View) objV : null;
                view3 = view4;
            }
            return view;
        }
        return view3;
    }

    public static final void f(mm40 mm40Var, szv szvVar, fet fetVar, int i) {
        szvVar.getClass();
        fetVar.g0(-975788204);
        byte b = 16;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(szvVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            l7m0 l7m0VarB = d43.b(szvVar.c, cwr0.h, "Progress Animation", null, fetVar, 3072, 20);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            boolean zG = fetVar.g(szvVar.f33087a + "COMPACT_TITLE_REMEMBER_ID");
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new ugd(-1370562588, true, new cnc(szvVar, b));
                fetVar.o0(objP);
            }
            Function2 function2 = (Function2) objP;
            boolean zG2 = fetVar.g(szvVar.b + "COMPACT_DESCRIPTION_REMEMBER_ID");
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new ugd(1884112869, true, new eod(szvVar, l7m0VarB, (byte) 6));
                fetVar.o0(objP2);
            }
            hmw0.j(mm40VarD, function2, (Function2) objP2, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eod(mm40Var, szvVar, i, (byte) 7);
        }
    }

    public static final long f0(f3g0 f3g0Var, fet fetVar) {
        int iOrdinal = f3g0Var.ordinal();
        if (iOrdinal == 0) {
            fetVar.e0(-539260766);
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            fetVar.r(false);
            return textPrimary;
        }
        if (iOrdinal != 1) {
            throw b1j.f(-539263014, fetVar, false);
        }
        fetVar.e0(-539258308);
        long jM98getGreen0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU();
        fetVar.r(false);
        return jM98getGreen0d7_KjU;
    }

    public static final void g(mm40 mm40Var, int i, int i2, fet fetVar, int i3) {
        fetVar.g0(-2049011574);
        int i4 = (fetVar.e(i) ? 32 : 16) | i3 | (fetVar.e(i2) ? 256 : 128);
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            int i5 = i + i2;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 6.0f);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (i5 <= 0) {
                fetVar.e0(-1892343667);
                long j = iph.d;
                d(0.5f, j, fetVar, 54);
                d(0.5f, j, fetVar, 54);
                fetVar.r(false);
            } else {
                fetVar.e0(-1891976968);
                if (i > 0) {
                    fetVar.e0(-1891949471);
                    d(i / i5, iph.j, fetVar, 6);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1891746700);
                    fetVar.r(false);
                }
                if (i2 > 0) {
                    fetVar.e0(-1891703393);
                    d(i2 / i5, iph.k, fetVar, 6);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1891498700);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s48(mm40Var, i, i2, i3, (byte) 2);
        }
    }

    public static final ywh0 g0(hxh0 hxh0Var, ywh0 ywh0Var, fet fetVar) {
        if (hxh0Var instanceof exh0) {
            fetVar.e0(81056418);
            fetVar.r(false);
            exh0 exh0Var = (exh0) hxh0Var;
            long j = exh0Var.f8577a.f41946a;
            long j2 = exh0Var.b.f41946a;
            long j3 = exh0Var.c.f41946a;
            long j4 = exh0Var.d.f41946a;
            boolean z = ywh0Var.h;
            boolean z2 = ywh0Var.g;
            boolean z3 = ywh0Var.i;
            if ((4 & 1) != 0) {
                j = ywh0Var.f43369a;
            }
            if ((4 & 2) != 0) {
                j2 = ywh0Var.b;
            }
            long j5 = j2;
            long j6 = ywh0Var.c;
            if ((4 & 8) != 0) {
                j3 = ywh0Var.d;
            }
            long j7 = j3;
            if ((4 & 16) != 0) {
                j4 = ywh0Var.e;
            }
            return new ywh0(j, j5, j6, j7, j4, (4 & 32) != 0 ? ywh0Var.f : null, z2, z, z3);
        }
        if (!Intrinsics.d(hxh0Var, fxh0.f10310a)) {
            if (!Intrinsics.d(hxh0Var, gxh0.f12078a)) {
                throw b1j.f(972444180, fetVar, false);
            }
            fetVar.e0(972473841);
            fetVar.r(false);
            return ywh0Var;
        }
        fetVar.e0(81721275);
        zfn zfnVar = m8m0.f21378a;
        long jM75getBlack600d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m75getBlack600d7_KjU();
        long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU();
        long jM126getWhite200d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m126getWhite200d7_KjU();
        long jM62getBlack0d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m62getBlack0d7_KjU();
        long jM130getWhite600d7_KjU = ((StaticColors) fetVar.k(zfnVar)).m130getWhite600d7_KjU();
        y3d y3dVar = new y3d(((StaticColors) fetVar.k(zfnVar)).m126getWhite200d7_KjU());
        boolean z4 = ywh0Var.h;
        boolean z5 = ywh0Var.g;
        boolean z6 = ywh0Var.i;
        if ((63 & 1) == 0) {
            jM75getBlack600d7_KjU = 0;
        }
        if ((63 & 2) == 0) {
            jM123getWhite0d7_KjU = 0;
        }
        if ((63 & 8) == 0) {
            jM62getBlack0d7_KjU = 0;
        }
        ywh0 ywh0Var2 = new ywh0(jM75getBlack600d7_KjU, jM123getWhite0d7_KjU, jM126getWhite200d7_KjU, jM62getBlack0d7_KjU, (63 & 16) != 0 ? jM130getWhite600d7_KjU : 0L, (63 & 32) != 0 ? y3dVar : null, z5, z4, z6);
        fetVar.r(false);
        return ywh0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r23v0, types: [a.fet] */
    public static final void h(mm40 mm40Var, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, String str, Function1 function1, fet fetVar, int i) {
        u3i u3iVar4;
        Function1 function2;
        boolean z;
        ?? r13;
        int i2;
        int i3;
        int i4;
        boolean z2;
        Object obj;
        function1.getClass();
        fetVar.g0(411296725);
        int i5 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(u3iVar) ? 32 : 16) | (fetVar.g(u3iVar2) ? 256 : 128) | (fetVar.g(u3iVar3) ? 2048 : 1024) | (fetVar.g(str) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i5 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i5 & 1, (74899 & i5) != 74898)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 40.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            if (str == null || str.length() == 0) {
                fetVar.e0(1709670855);
                fetVar.r(false);
            } else {
                fetVar.e0(1709359491);
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(1874432566, new g0(str, (byte) 24), fetVar), fetVar, 56);
                fetVar.r(false);
            }
            zx7 zx7Var = gqw0.f;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            boolean z4 = u3iVar instanceof v3i;
            cl5 cl5Var = ukd.f35823a;
            if (z4) {
                fetVar.e0(-736738355);
                tj30 tj30VarC2 = zq8.c(gqw0.b, false);
                i2 = 458752;
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
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
                f2i f2iVar = ((v3i) u3iVar).f36733a;
                int i6 = f2iVar instanceof e2i ? R.drawable.ic_glyph_video_zone : R.drawable.ic_glyph_broadcast;
                boolean z5 = f2iVar instanceof d2i;
                boolean z6 = !z5;
                boolean z7 = ((i5 & 458752) == 131072) | ((i5 & 112) == 32);
                Object objP = fetVar.P();
                if (z7 || objP == cl5Var) {
                    function2 = function1;
                    z2 = false;
                    a3i a3iVar = new a3i(function2, u3iVar, (byte) 0);
                    fetVar.o0(a3iVar);
                    obj = a3iVar;
                } else {
                    function2 = function1;
                    z2 = false;
                    obj = objP;
                }
                Function0 function0 = (Function0) obj;
                z = z2;
                r13 = 1;
                i(i6, 0, fetVar, null, function0, z6);
                if (z5) {
                    fetVar.e0(-1996034143);
                    acb.p(z ? 1 : 0, fetVar, null);
                    fetVar.r(z);
                } else {
                    fetVar.e0(-1995971678);
                    fetVar.r(z);
                }
                fetVar.r(true);
                fetVar.r(z);
            } else {
                function2 = function1;
                z = false;
                r13 = 1;
                i2 = 458752;
                fetVar.e0(-735948413);
                fetVar.r(false);
            }
            if (u3iVar2 instanceof z3i) {
                fetVar.e0(-735840750);
                int iOrdinal = ((z3i) u3iVar2).f43719a.ordinal();
                if (iOrdinal == 0) {
                    i4 = R.drawable.ic_glyph_notification_active;
                } else {
                    if (iOrdinal != r13) {
                        t9f.b();
                        return;
                    }
                    i4 = R.drawable.ic_glyph_notification_inactive;
                }
                int i7 = i4;
                int i8 = ((i5 & 896) == 256 ? r13 : z) | ((i5 & i2) == 131072 ? r13 : z);
                Object objP2 = fetVar.P();
                Object obj2 = objP2;
                if (i8 != 0 || objP2 == cl5Var) {
                    brh brhVar = new brh(function2, u3iVar2, r13);
                    fetVar.o0(brhVar);
                    obj2 = brhVar;
                }
                i(i7, 384, fetVar, null, (Function0) obj2, true);
                fetVar.r(z);
            } else {
                fetVar.e0(-735393885);
                fetVar.r(z);
            }
            u3iVar4 = u3iVar3;
            if (u3iVar4 instanceof x3i) {
                fetVar.e0(-735294592);
                int iOrdinal2 = ((x3i) u3iVar4).f40219a.ordinal();
                if (iOrdinal2 == 0) {
                    i3 = R.drawable.ic_glyph_favourite_active;
                } else {
                    if (iOrdinal2 != r13) {
                        t9f.b();
                        return;
                    }
                    i3 = R.drawable.ic_glyph_favourite_inactive;
                }
                int i9 = ((i5 & 7168) == 2048 ? r13 : z) | ((i5 & i2) == 131072 ? r13 : z);
                Object objP3 = fetVar.P();
                Object obj3 = objP3;
                if (i9 != 0 || objP3 == cl5Var) {
                    arh arhVar = new arh(function2, u3iVar4, r13);
                    fetVar.o0(arhVar);
                    obj3 = arhVar;
                }
                i(i3, 384, fetVar, null, (Function0) obj3, true);
                fetVar.r(z);
            } else {
                fetVar.e0(-734861181);
                fetVar.r(z);
            }
            fetVar.r(r13);
            fetVar.r(r13);
        } else {
            u3iVar4 = u3iVar3;
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b3i(mm40Var, u3iVar, u3iVar2, u3iVar4, str, function2, i, (byte) 0);
        }
    }

    public static final skd h0(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        WeakReference weakReference = tag instanceof WeakReference ? (WeakReference) tag : null;
        if (weakReference != null) {
            return (skd) weakReference.get();
        }
        return null;
    }

    public static final void i(int i, int i2, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        mm40 mm40Var2;
        long secondary20;
        fetVar.g0(1892123814);
        int i3 = i2 | 6 | (fetVar.e(i) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        int i4 = i3 | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(o7k0.s(o7k0.e(jm40Var, 36.0f), 40.0f), 6.0f, 4.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarW = y860.W(i120.Q(mm40VarK, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), vgg0.f37379a), null, null, z, null, function0, 24);
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
            mm40 mm40VarJ = s5x0.J(jm40Var, 4.0f);
            pm80 pm80VarF = a8k0.F(i, (i4 >> 3) & 14, fetVar);
            if (z) {
                fetVar.e0(-1531437209);
                secondary20 = ((ThemeColors) fetVar.k(zfnVar)).getPrimary();
            } else {
                fetVar.e0(-1531436213);
                secondary20 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary20();
            }
            fetVar.r(false);
            dww.c(pm80VarF, null, mm40VarJ, secondary20, fetVar, 56, 0);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new h2i(mm40Var2, i, z, function0, i2, (byte) 1);
        }
    }

    public static final String i0(xgo xgoVar, boolean z, List list, List list2, boolean z2, boolean z3) {
        Object next;
        Object next2;
        xgoVar.getClass();
        list.getClass();
        list2.getClass();
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ueo ueoVar = (ueo) next;
            Integer num = xgoVar.q;
            if (num != null && ueoVar.f35538a == num.intValue()) {
                break;
            }
        }
        ueo ueoVar2 = (ueo) next;
        if (ueoVar2 == null) {
            String str = xgoVar.r;
            return str == null ? "" : str;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            long j = ((xco) next2).f40655a;
            Long l = xgoVar.F;
            if (l != null && j == l.longValue()) {
                break;
            }
        }
        xco xcoVar = (xco) next2;
        String str2 = xcoVar != null ? xcoVar.b : null;
        String str3 = str2 != null ? str2 : "";
        String str4 = ueoVar2.b;
        List list3 = xgoVar.W;
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        List list4 = xgoVar.X;
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        Integer numValueOf = Integer.valueOf(ueoVar2.c);
        Double d = xgoVar.E;
        String strA = dii0.a(str4, list3, list4, numValueOf, z, d != null ? new BigDecimal(String.valueOf(d.doubleValue())) : null, xgoVar.C, xgoVar.e, ueoVar2.f35538a, nt20.l, z2, z3);
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        return StringsKt.u0(bidiFormatter.unicodeWrap(str3) + " \n" + bidiFormatter.unicodeWrap(strA)).toString();
    }

    public static final void j(mm40 mm40Var, urk urkVar, qdz qdzVar, Function1 function1, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        urkVar.getClass();
        String str = urkVar.f36167a;
        qdzVar.getClass();
        function1.getClass();
        function0.getClass();
        fetVar2.g0(81500508);
        int i2 = i | 6 | (fetVar2.g(urkVar) ? 32 : 16) | (fetVar2.g(qdzVar) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar2.b0(1012586292, str);
            xcz xczVarB = qdzVar.b(str, new svj((byte) 20), fetVar2, i2 & 896);
            fetVar2.r(false);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.l;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(h97.e(zclVar, zclVar, zclVar, zclVar, i120.Q(jm40Var, backgroundContent, ugg0Var2)), 0.0f, 8.0f, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarE = o7k0.e(jm40Var, 40.0f);
            b8m b8mVar = urkVar.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            r7m r7mVar = new r7m(textPrimary, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary());
            boolean z = (57344 & i2) == 16384;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new b1i(function0, (byte) 16);
                fetVar2.o0(objP);
            }
            wwb.j(mm40VarE, b8mVar, 16.0f, r7mVar, (Function0) objP, fetVar2, 0, 16);
            zvw.k(null, urkVar.c, true, xczVarB, s5x0.t(8.0f, 0.0f, 2), function1, fetVar, ((i2 << 6) & 458752) | 384, 1);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var2, urkVar, qdzVar, function1, function0, i);
        }
    }

    public static final String j0(yos0 yos0Var) {
        Uri uriFromFile;
        yos0Var.getClass();
        if (yos0Var instanceof vos0) {
            uriFromFile = Uri.fromFile(((vos0) yos0Var).b);
        } else if (yos0Var instanceof wos0) {
            uriFromFile = Uri.fromFile(((wos0) yos0Var).b);
        } else if (yos0Var instanceof xos0) {
            uriFromFile = Uri.fromFile(((xos0) yos0Var).b);
        } else {
            uriFromFile = yos0Var instanceof tos0 ? Uri.fromFile(((tos0) yos0Var).b) : Uri.EMPTY;
        }
        String string = uriFromFile.toString();
        string.getClass();
        return string;
    }

    public static final void k(zlp0 zlp0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-904432687);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(zlp0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 4.0f, 7), "DOTA_TEAM_STATISTICS");
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new n2l((byte) 19);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new n2l((byte) 20);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new n2l((byte) 21);
                fetVar.o0(objP3);
            }
            Function1 function3 = (Function1) objP3;
            boolean z = (i2 & 14) == 4;
            Object objP4 = fetVar.P();
            if (z || objP4 == cl5Var) {
                objP4 = new e3j(zlp0Var, (byte) 28);
                fetVar.o0(objP4);
            }
            dwi0.c(function1, mm40VarE0, function2, function3, (Function1) objP4, fetVar, 3462, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(zlp0Var, i, (byte) 6);
        }
    }

    public static final int k0(uyp uypVar) {
        int iOrdinal = uypVar.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.ic_glyph_cyber_fighting_b;
        }
        if (iOrdinal == 1) {
            return R.drawable.ic_glyph_cyber_fighting_f;
        }
        if (iOrdinal == 2) {
            return R.drawable.ic_glyph_cyber_fighting_fs;
        }
        if (iOrdinal == 3) {
            return R.drawable.ic_glyph_cyber_fighting_ko;
        }
        if (iOrdinal == 4) {
            return R.drawable.ic_glyph_cyber_fighting_r;
        }
        t9f.b();
        return 0;
    }

    public static final void l(mm40 mm40Var, cw1 cw1Var, fw1 fw1Var, hh80 hh80Var, fet fetVar, int i) {
        hh80 hh80Var2;
        hh80 lh80Var;
        int i2;
        fetVar.g0(-1785369048);
        int i3 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.e(cw1Var.ordinal()) ? 32 : 16) | (fetVar.g(fw1Var) ? 256 : 128) | 25600;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                zcl zclVar = qmk.f28987a;
                lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
                i2 = i3 & (-7169);
            } else {
                fetVar.X();
                i2 = i3 & (-7169);
                lh80Var = hh80Var;
            }
            fetVar.s();
            mm40 mm40VarI = s5x0.I(mm40Var, lh80Var);
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
            int iOrdinal = cw1Var.ordinal();
            jm40 jm40Var = jm40.b;
            if (iOrdinal == 0) {
                fetVar.e0(-783541200);
                zcl zclVar2 = qmk.f28987a;
                ebc.q(o7k0.e(jm40Var, 108.0f), fw1Var, fetVar, ((i2 >> 3) & 112) | 384);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(-783242887);
                zcl zclVar3 = qmk.f28987a;
                kbc.j(o7k0.e(jm40Var, 152.0f), fw1Var, fetVar, ((i2 >> 3) & 112) | 384);
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(-782957284);
                zcl zclVar4 = qmk.f28987a;
                knx.x(o7k0.e(jm40Var, 164.0f), fw1Var, fetVar, ((i2 >> 3) & 112) | 384);
                fetVar.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(667459431, fetVar, false);
                }
                fetVar.e0(-782656491);
                zcl zclVar5 = qmk.f28987a;
                fbc.v(o7k0.e(jm40Var, 164.0f), fw1Var, fetVar, ((i2 >> 3) & 112) | 384);
                fetVar.r(false);
            }
            fetVar.r(true);
            hh80Var2 = lh80Var;
        } else {
            fetVar.X();
            hh80Var2 = hh80Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 5, i, (Object) mm40Var, (Object) cw1Var, (Object) fw1Var, (Object) hh80Var2);
        }
    }

    public static final float l0(a4x a4xVar) {
        if (a4xVar == null || !a4xVar.isEmpty()) {
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                if (((fam) it.next()).c == ut90.Rectangle) {
                    zcl zclVar = qmk.f28987a;
                    return 64.0f;
                }
            }
        }
        zcl zclVar2 = qmk.f28987a;
        return 40.0f;
    }

    public static final void m(mm40 mm40Var, lam lamVar, p9m p9mVar, fet fetVar, int i) {
        p9m p9mVar2 = (i & 4) != 0 ? new p9m(afn0.m(fetVar).getBackgroundContent(), afn0.m(fetVar).getSeparator60(), afn0.m(fetVar).getTextPrimary(), afn0.m(fetVar).getSecondary60(), q3d.j(new y3d(afn0.m(fetVar).getBackgroundContent()), new y3d(afn0.m(fetVar).getBackgroundContent0())), q3d.j(new y3d(afn0.m(fetVar).getBackgroundContent0()), new y3d(afn0.m(fetVar).getBackgroundContent()))) : p9mVar;
        if (lamVar instanceof jam) {
            fetVar.e0(-998943379);
            e(mm40Var, (jam) lamVar, p9mVar2, fetVar, 0);
            fetVar.r(false);
        } else {
            if (!(lamVar instanceof kam)) {
                throw b1j.f(1076152809, fetVar, false);
            }
            fetVar.e0(1076160832);
            M(0, fetVar, mm40Var);
            fetVar.r(false);
        }
    }

    public static final rah m0(m9s m9sVar) {
        List listSplit$default = StringsKt__StringsKt.split$default(m9sVar.h.b, new String[]{"-"}, false, 0, 6, null);
        String str = (String) CollectionsKt.firstOrNull(listSplit$default);
        if (str == null) {
            str = "";
        }
        String str2 = (String) CollectionsKt.f0(listSplit$default);
        String str3 = str2 != null ? str2 : "";
        if (str.equals("1") && str3.equals("1")) {
            return rah.c;
        }
        if (str.equals("1")) {
            return rah.f30132a;
        }
        return str3.equals("1") ? rah.b : rah.d;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0102  */
    /* JADX WARN: Code duplicated, block: B:83:0x0106  */
    /* JADX WARN: Code duplicated, block: B:84:0x0135  */
    /* JADX WARN: Code duplicated, block: B:86:0x0163  */
    /* JADX WARN: Code duplicated, block: B:89:0x016e  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void n(mm40 mm40Var, final a4x a4xVar, final hxh0 hxh0Var, final dxh0 dxh0Var, boolean z, final Function0 function0, final Function1 function1, fet fetVar, final int i, final int i2) {
        final mm40 mm40Var2;
        int i3;
        a4x a4xVar2;
        final dxh0 dxh0Var2;
        boolean z2;
        Function0 function2;
        Function1 function3;
        boolean z3;
        fet fetVar2;
        final boolean z4;
        yfe0 yfe0VarU;
        mm40 mm40Var3;
        final boolean z5;
        int iIntValue;
        boolean z6;
        yfe0 yfe0VarU2;
        int i4;
        int i5;
        a4xVar.getClass();
        hxh0Var.getClass();
        dxh0Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(1549684502);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            a4xVar2 = a4xVar;
            i3 |= fetVar.g(a4xVar2) ? 32 : 16;
        } else {
            a4xVar2 = a4xVar;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(hxh0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            dxh0Var2 = dxh0Var;
            i3 |= fetVar.g(dxh0Var2) ? 2048 : 1024;
        } else {
            dxh0Var2 = dxh0Var;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                z2 = z;
                i3 |= fetVar.h(z2) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                function2 = function0;
                if (fetVar.i(function2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            } else {
                function2 = function0;
            }
            if ((1572864 & i) == 0) {
                function3 = function1;
                if (fetVar.i(function3)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            } else {
                function3 = function1;
            }
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i3 & 1, z3)) {
                if (i6 != 0) {
                    mm40Var3 = jm40.b;
                } else {
                    mm40Var3 = mm40Var2;
                }
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                iIntValue = ((Number) function2.invoke()).intValue();
                if (a4xVar2.isEmpty()) {
                    yfe0VarU2 = fetVar.u();
                    if (yfe0VarU2 != null) {
                        final mm40 mm40Var4 = mm40Var3;
                        final byte b = 0;
                        final a4x a4xVar3 = a4xVar2;
                        final Function1 function4 = function3;
                        yfe0VarU2.d = new Function2() { // from class: a.gqm
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                switch (b) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        ibc.n(mm40Var4, a4xVar3, hxh0Var, dxh0Var2, z5, function0, function4, (fet) obj, x8x.L(i | 1), i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        ibc.n(mm40Var4, a4xVar3, hxh0Var, dxh0Var2, z5, function0, function4, (fet) obj, x8x.L(i | 1), i2);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        return;
                    }
                    return;
                }
                mm40Var2 = mm40Var3;
                z6 = z5;
                if (z6) {
                    fetVar.e0(47916920);
                    K(mm40Var2, dxh0Var, hxh0Var, a4xVar, iIntValue, function1, fetVar, (i3 & 14) | ((i3 >> 6) & 112) | (i3 & 896) | ((i3 << 6) & 7168) | ((i3 >> 3) & 458752));
                    mm40Var2 = mm40Var2;
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    fetVar2 = fetVar;
                    fetVar2.e0(48168888);
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(621017393, new zf(mm40Var2, dxh0Var, hxh0Var, a4xVar, iIntValue, function1), fetVar2), fetVar2, 56);
                    fetVar2.r(false);
                }
                z4 = z6;
            } else {
                fetVar2 = fetVar;
                fetVar2.X();
                z4 = z2;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                final byte b2 = 1;
                yfe0VarU.d = new Function2() { // from class: a.gqm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (b2) {
                            case 0:
                                ((Integer) obj2).getClass();
                                ibc.n(mm40Var2, a4xVar, hxh0Var, dxh0Var, z4, function0, function1, (fet) obj, x8x.L(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                ibc.n(mm40Var2, a4xVar, hxh0Var, dxh0Var, z4, function0, function1, (fet) obj, x8x.L(i | 1), i2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 24576;
        z2 = z;
        if ((196608 & i) == 0) {
            function2 = function0;
            if (fetVar.i(function2)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        } else {
            function2 = function0;
        }
        if ((1572864 & i) == 0) {
            function3 = function1;
            if (fetVar.i(function3)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        } else {
            function3 = function1;
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i3 & 1, z3)) {
            if (i6 != 0) {
                mm40Var3 = jm40.b;
            } else {
                mm40Var3 = mm40Var2;
            }
            if (i7 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            iIntValue = ((Number) function2.invoke()).intValue();
            if (a4xVar2.isEmpty()) {
                yfe0VarU2 = fetVar.u();
                if (yfe0VarU2 != null) {
                    final mm40 mm40Var5 = mm40Var3;
                    final byte b3 = 0;
                    final a4x a4xVar4 = a4xVar2;
                    final Function1 function5 = function3;
                    yfe0VarU2.d = new Function2() { // from class: a.gqm
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (b3) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    ibc.n(mm40Var5, a4xVar4, hxh0Var, dxh0Var2, z5, function0, function5, (fet) obj, x8x.L(i | 1), i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    ibc.n(mm40Var5, a4xVar4, hxh0Var, dxh0Var2, z5, function0, function5, (fet) obj, x8x.L(i | 1), i2);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    return;
                }
                return;
            }
            mm40Var2 = mm40Var3;
            z6 = z5;
            if (z6) {
                fetVar.e0(47916920);
                K(mm40Var2, dxh0Var, hxh0Var, a4xVar, iIntValue, function1, fetVar, (i3 & 14) | ((i3 >> 6) & 112) | (i3 & 896) | ((i3 << 6) & 7168) | ((i3 >> 3) & 458752));
                mm40Var2 = mm40Var2;
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                fetVar2.e0(48168888);
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(621017393, new zf(mm40Var2, dxh0Var, hxh0Var, a4xVar, iIntValue, function1), fetVar2), fetVar2, 56);
                fetVar2.r(false);
            }
            z4 = z6;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            z4 = z2;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final byte b4 = 1;
            yfe0VarU.d = new Function2() { // from class: a.gqm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (b4) {
                        case 0:
                            ((Integer) obj2).getClass();
                            ibc.n(mm40Var2, a4xVar, hxh0Var, dxh0Var, z4, function0, function1, (fet) obj, x8x.L(i | 1), i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            ibc.n(mm40Var2, a4xVar, hxh0Var, dxh0Var, z4, function0, function1, (fet) obj, x8x.L(i | 1), i2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final int n0(Integer num) {
        if (num != null && num.intValue() == 0) {
            return R.drawable.ic_all_killed;
        }
        if (num != null && num.intValue() == 1) {
            return R.drawable.ic_bomb_exploded;
        }
        if (num != null && num.intValue() == 2) {
            return R.drawable.ic_all_killed;
        }
        if (num != null && num.intValue() == 3) {
            return R.drawable.ic_bomb_defused;
        }
        if (num != null && num.intValue() == 4) {
            return R.drawable.ic_time_win;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1 A[LOOP:0: B:71:0x00cb->B:73:0x00d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0108  */
    /* JADX WARN: Code duplicated, block: B:79:0x0113  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void o(mm40 mm40Var, a4x a4xVar, hxh0 hxh0Var, boolean z, Function0 function0, Function1 function1, fet fetVar, int i, int i2) {
        int i3;
        hxh0 hxh0Var2;
        int i4;
        boolean z2;
        int i5;
        Function0 function2;
        Function1 function3;
        boolean z3;
        mm40 mm40Var2;
        hxh0 hxh0Var3;
        boolean z4;
        yfe0 yfe0VarU;
        ArrayList arrayList;
        Iterator<E> it;
        int i6;
        int i7;
        a4xVar.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-1950178544);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                hxh0Var2 = hxh0Var;
                i3 |= fetVar.g(hxh0Var2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    if (fetVar.h(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    function2 = function0;
                    if (fetVar.i(function2)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                } else {
                    function2 = function0;
                }
                if ((196608 & i) == 0) {
                    function3 = function1;
                    if (fetVar.i(function3)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i3 |= i6;
                } else {
                    function3 = function1;
                }
                if ((74899 & i3) != 74898) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i3 & 1, z3)) {
                    if (i8 != 0) {
                        mm40Var = jm40.b;
                    }
                    if (i9 != 0) {
                        hxh0Var2 = gxh0.f12078a;
                    }
                    if (i4 != 0) {
                        z2 = true;
                    }
                    arrayList = new ArrayList(r3d.q(a4xVar, 10));
                    it = a4xVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new yvh0((String) it.next(), bwh0.f3325a));
                    }
                    i4 i4VarR0 = dyb.r0(arrayList);
                    int i10 = (i3 & 14) | 3072 | (i3 & 896);
                    int i11 = i3 << 3;
                    int i12 = i10 | (57344 & i11) | (458752 & i11) | (i11 & 3670016);
                    mm40 mm40Var3 = mm40Var;
                    n(mm40Var3, i4VarR0, hxh0Var2, axh0.f1625a, z2, function2, function3, fetVar, i12, 0);
                    mm40Var2 = mm40Var3;
                } else {
                    fetVar.X();
                    mm40Var2 = mm40Var;
                }
                hxh0Var3 = hxh0Var2;
                z4 = z2;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new ltl(mm40Var2, a4xVar, hxh0Var3, z4, function0, function1, i, i2, (byte) 1);
                }
            }
            i3 |= 3072;
            z2 = z;
            if ((i & 24576) == 0) {
                function2 = function0;
                if (fetVar.i(function2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            } else {
                function2 = function0;
            }
            if ((196608 & i) == 0) {
                function3 = function1;
                if (fetVar.i(function3)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            } else {
                function3 = function1;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i3 & 1, z3)) {
                if (i8 != 0) {
                    mm40Var = jm40.b;
                }
                if (i9 != 0) {
                    hxh0Var2 = gxh0.f12078a;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                arrayList = new ArrayList(r3d.q(a4xVar, 10));
                it = a4xVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(new yvh0((String) it.next(), bwh0.f3325a));
                }
                i4 i4VarR1 = dyb.r0(arrayList);
                int i13 = (i3 & 14) | 3072 | (i3 & 896);
                int i14 = i3 << 3;
                int i15 = i13 | (57344 & i14) | (458752 & i14) | (i14 & 3670016);
                mm40 mm40Var4 = mm40Var;
                n(mm40Var4, i4VarR1, hxh0Var2, axh0.f1625a, z2, function2, function3, fetVar, i15, 0);
                mm40Var2 = mm40Var4;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
            }
            hxh0Var3 = hxh0Var2;
            z4 = z2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new ltl(mm40Var2, a4xVar, hxh0Var3, z4, function0, function1, i, i2, (byte) 1);
            }
        }
        i3 |= 384;
        hxh0Var2 = hxh0Var;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z2 = z;
                if (fetVar.h(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                function2 = function0;
                if (fetVar.i(function2)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            } else {
                function2 = function0;
            }
            if ((196608 & i) == 0) {
                function3 = function1;
                if (fetVar.i(function3)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i3 |= i6;
            } else {
                function3 = function1;
            }
            if ((74899 & i3) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i3 & 1, z3)) {
                if (i8 != 0) {
                    mm40Var = jm40.b;
                }
                if (i9 != 0) {
                    hxh0Var2 = gxh0.f12078a;
                }
                if (i4 != 0) {
                    z2 = true;
                }
                arrayList = new ArrayList(r3d.q(a4xVar, 10));
                it = a4xVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(new yvh0((String) it.next(), bwh0.f3325a));
                }
                i4 i4VarR2 = dyb.r0(arrayList);
                int i16 = (i3 & 14) | 3072 | (i3 & 896);
                int i17 = i3 << 3;
                int i18 = i16 | (57344 & i17) | (458752 & i17) | (i17 & 3670016);
                mm40 mm40Var5 = mm40Var;
                n(mm40Var5, i4VarR2, hxh0Var2, axh0.f1625a, z2, function2, function3, fetVar, i18, 0);
                mm40Var2 = mm40Var5;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
            }
            hxh0Var3 = hxh0Var2;
            z4 = z2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new ltl(mm40Var2, a4xVar, hxh0Var3, z4, function0, function1, i, i2, (byte) 1);
            }
        }
        i3 |= 3072;
        z2 = z;
        if ((i & 24576) == 0) {
            function2 = function0;
            if (fetVar.i(function2)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        } else {
            function2 = function0;
        }
        if ((196608 & i) == 0) {
            function3 = function1;
            if (fetVar.i(function3)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        } else {
            function3 = function1;
        }
        if ((74899 & i3) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i3 & 1, z3)) {
            if (i8 != 0) {
                mm40Var = jm40.b;
            }
            if (i9 != 0) {
                hxh0Var2 = gxh0.f12078a;
            }
            if (i4 != 0) {
                z2 = true;
            }
            arrayList = new ArrayList(r3d.q(a4xVar, 10));
            it = a4xVar.iterator();
            while (it.hasNext()) {
                arrayList.add(new yvh0((String) it.next(), bwh0.f3325a));
            }
            i4 i4VarR3 = dyb.r0(arrayList);
            int i19 = (i3 & 14) | 3072 | (i3 & 896);
            int i110 = i3 << 3;
            int i111 = i19 | (57344 & i110) | (458752 & i110) | (i110 & 3670016);
            mm40 mm40Var6 = mm40Var;
            n(mm40Var6, i4VarR3, hxh0Var2, axh0.f1625a, z2, function2, function3, fetVar, i111, 0);
            mm40Var2 = mm40Var6;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        hxh0Var3 = hxh0Var2;
        z4 = z2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ltl(mm40Var2, a4xVar, hxh0Var3, z4, function0, function1, i, i2, (byte) 1);
        }
    }

    public static final wpf o0(Pair pair) {
        pair.getClass();
        List listJ = q3d.j(pair.f46059a, pair.b);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listJ) {
            Integer num = (Integer) obj;
            if (num == null || num.intValue() != 5) {
                arrayList.add(obj);
            }
        }
        Integer num2 = (Integer) CollectionsKt.firstOrNull(arrayList);
        if ((num2 != null && num2.intValue() == 0) || (num2 != null && num2.intValue() == 1)) {
            return wpf.f39542a;
        }
        return ((num2 != null && num2.intValue() == 2) || (num2 != null && num2.intValue() == 3) || (num2 != null && num2.intValue() == 4)) ? wpf.b : wpf.c;
    }

    public static final void p(mm40 mm40Var, fxm fxmVar, fet fetVar, int i) {
        if (fxmVar instanceof axm) {
            fetVar.e0(-477219050);
            fbc.x(mm40Var, (axm) fxmVar, fetVar, i & 126);
            fetVar.r(false);
            return;
        }
        if (fxmVar instanceof bxm) {
            fetVar.e0(-477021797);
            kbc.n(mm40Var, (bxm) fxmVar, fetVar, i & 126);
            fetVar.r(false);
            return;
        }
        if (fxmVar instanceof cxm) {
            fetVar.e0(-476829349);
            mbc.p(mm40Var, (cxm) fxmVar, fetVar, i & 126);
            fetVar.r(false);
        } else if (fxmVar instanceof dxm) {
            fetVar.e0(-476636901);
            obc.r(mm40Var, (dxm) fxmVar, fetVar, i & 126);
            fetVar.r(false);
        } else {
            if (!(fxmVar instanceof exm)) {
                throw b1j.f(-1123774394, fetVar, false);
            }
            fetVar.e0(-476444453);
            qbc.m(mm40Var, (exm) fxmVar, fetVar, i & 126);
            fetVar.r(false);
        }
    }

    public static final boolean p0(fof fofVar) {
        fofVar.getClass();
        trf trfVar = fofVar.b;
        Map map = trfVar.d;
        Map map2 = trfVar.e;
        trf trfVar2 = fofVar.c;
        return (!map.isEmpty() && map.size() == trfVar2.d.size() && map2.size() == trfVar2.e.size()) ? false : true;
    }

    public static final void q(mm40 mm40Var, i2n i2nVar, i2n i2nVar2, kpm kpmVar, String str, String str2, boolean z, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        str.getClass();
        fetVar.g0(-2085063503);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(i2nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(i2nVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(kpmVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.h(z) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            if (z) {
                fetVar.e0(2003713752);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(2003714676);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-637872143, new ecc((Object) mm40Var, (Object) i2nVar, str, str2, (Object) kpmVar, z, (Object) i2nVar2, (byte) 8), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(mm40Var, (Object) i2nVar, (Object) i2nVar2, (Object) kpmVar, str, (Object) str2, z, i, (byte) 11);
        }
    }

    public static Object q0(Method method, Class cls, Object obj, Object[] objArr) throws NoSuchMethodException {
        Constructor declaredConstructor = f14479a;
        if (declaredConstructor == null) {
            declaredConstructor = c0g.g().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            f14479a = declaredConstructor;
        }
        return c0g.m(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public static final void r(poy poyVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-55408158);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(poyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = q5o.f28161a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            int i3 = i2 & 14;
            boolean zI = fetVar.i(clzVar) | (i3 == 4);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new qzn(clzVar, poyVar, (byte) 8);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean zI2 = fetVar.i(clzVar) | (i3 == 4);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new fun(clzVar, poyVar, (byte) 7);
                fetVar.o0(objP3);
            }
            idm0.j(mm40Var, poyVar, xdrVar, null, function1, (Function2) objP3, fetVar, ((i2 << 3) & 112) | 384, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(poyVar, i, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0195 A[LOOP:7: B:105:0x0193->B:106:0x0195, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:135:0x021b  */
    /* JADX WARN: Code duplicated, block: B:137:0x021f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0223  */
    /* JADX WARN: Code duplicated, block: B:141:0x0227  */
    /* JADX WARN: Code duplicated, block: B:142:0x0229  */
    /* JADX WARN: Code duplicated, block: B:143:0x022c  */
    /* JADX WARN: Code duplicated, block: B:144:0x022f  */
    /* JADX WARN: Code duplicated, block: B:145:0x0232  */
    /* JADX WARN: Code duplicated, block: B:147:0x0236  */
    /* JADX WARN: Code duplicated, block: B:148:0x0238  */
    /* JADX WARN: Code duplicated, block: B:155:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x024b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:160:0x0259  */
    /* JADX WARN: Code duplicated, block: B:162:0x026c  */
    /* JADX WARN: Code duplicated, block: B:193:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x029a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x020f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x0282 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0155 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x018e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x011c  */
    /* JADX WARN: Code duplicated, block: B:87:0x012b  */
    /* JADX WARN: Code duplicated, block: B:89:0x013b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0143  */
    /* JADX WARN: Code duplicated, block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0172  */
    public static long r0(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        long j2;
        char cCharAt;
        bfn bfnVar;
        long jS;
        int i8;
        int iMin;
        int i9;
        int i10;
        int i11;
        int iMin2;
        int i12;
        int i13;
        double d;
        long jC;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        int i14;
        int i15;
        char cCharAt6;
        if (str.length() == 0) {
            jf4.o("The string is empty");
            return 0L;
        }
        char cCharAt7 = str.charAt(0);
        int i16 = 1;
        char c = '-';
        char c2 = '+';
        if (cCharAt7 != '+') {
            i2 = cCharAt7 != '-' ? 0 : 1;
            i = i2;
        } else {
            i = 0;
            i2 = 1;
        }
        if (str.length() <= i2) {
            jf4.o("No components");
            return 0L;
        }
        if (str.charAt(i2) != 'P') {
            jf4.o("");
            return 0L;
        }
        int i17 = i2 + 1;
        if (i17 == str.length()) {
            jf4.o("");
            return 0L;
        }
        int i18 = 0;
        bfn bfnVar2 = null;
        long jD = 0;
        long j3 = 0;
        while (i17 < str.length()) {
            char cCharAt8 = str.charAt(i17);
            if (cCharAt8 != 'T') {
                g710 g710Var = g710.c;
                int i19 = i16;
                char cCharAt9 = str.charAt(i17);
                if (cCharAt9 != c2) {
                    if (cCharAt9 != c) {
                        i3 = i17;
                    } else {
                        i3 = i17 + 1;
                        i4 = -1;
                    }
                    while (i3 < str.length() && str.charAt(i3) == '0') {
                        i3++;
                    }
                    j = 0;
                    while (true) {
                        if (i3 < str.length()) {
                            cCharAt5 = str.charAt(i3);
                            i5 = i17;
                            if ('0' > cCharAt5 && cCharAt5 < ':') {
                                i14 = cCharAt5 - '0';
                                i15 = i;
                                long j4 = g710Var.f10791a;
                                if (j > j4 || (j == j4 && i14 > g710Var.b)) {
                                    i6 = i15;
                                    while (i3 < str.length() && '0' <= (cCharAt6 = str.charAt(i3)) && cCharAt6 < ':') {
                                        i3++;
                                    }
                                    if (i3 != str.length()) {
                                        if (i3 != i5 + ((cCharAt8 == '+' || cCharAt8 == '-') ? i19 : 0)) {
                                            j = 4611686018427387903L;
                                        }
                                    }
                                    jf4.o("");
                                    return 0L;
                                }
                                j = (j << 3) + (j << i19) + ((long) i14);
                                i3++;
                                i17 = i5;
                                g710Var = g710Var;
                                i = i15;
                            }
                            j2 = j;
                            if (str.charAt(i3) == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                for (i9 = i8; i9 < iMin; i9++) {
                                    cCharAt4 = str.charAt(i9);
                                    if ('0' <= cCharAt4 || cCharAt4 >= ':') {
                                        for (i11 = 0; i11 < 6 - (i9 - i8); i11++) {
                                            i10 = (i10 << 1) + (i10 << 3);
                                        }
                                        iMin2 = Math.min(i9 + 9, str.length());
                                        i3 = i9;
                                        i12 = 0;
                                        while (i3 < iMin2) {
                                            cCharAt3 = str.charAt(i3);
                                            int i20 = iMin2;
                                            if ('0' <= cCharAt3 || cCharAt3 >= ':') {
                                                for (i13 = 0; i13 < 9 - (i3 - i9); i13++) {
                                                    i12 = (i12 << 1) + (i12 << 3);
                                                }
                                                while (i3 < str.length() && '0' <= (cCharAt2 = str.charAt(i3)) && cCharAt2 < ':') {
                                                    i3++;
                                                }
                                                if (i3 != i8 || i3 == str.length() || str.charAt(i3) != 'S') {
                                                    jf4.o("");
                                                    return 0L;
                                                }
                                                long j5 = (((long) i10) * 1000000000) + ((long) i12);
                                                long j6 = i4;
                                                bfn bfnVar3 = bfn.SECONDS;
                                                double d2 = j5;
                                                switch (bfnVar3) {
                                                    case NANOSECONDS:
                                                        d = 1.0E-15d;
                                                        jC = si30.c(d2 * d);
                                                        break;
                                                    case MICROSECONDS:
                                                        d = 1.0E-12d;
                                                        jC = si30.c(d2 * d);
                                                        break;
                                                    case MILLISECONDS:
                                                        d = 1.0E-9d;
                                                        jC = si30.c(d2 * d);
                                                        break;
                                                    case SECONDS:
                                                        d = 1.0E-6d;
                                                        jC = si30.c(d2 * d);
                                                        break;
                                                    case MINUTES:
                                                        d = 6.0E-5d;
                                                        jC = si30.c(d2 * d);
                                                        break;
                                                    case HOURS:
                                                        d = 0.0036d;
                                                        jC = si30.c(d2 * d);
                                                        break;
                                                    case DAYS:
                                                        d = 0.0864d;
                                                        jC = si30.c(d2 * d);
                                                        break;
                                                    default:
                                                        udk.e(bfnVar3, "Unknown unit: ");
                                                        jC = 0;
                                                        break;
                                                }
                                                j3 = jC * j6;
                                            } else {
                                                i12 = (cCharAt3 - '0') + (i12 << 3) + (i12 << 1);
                                                i3++;
                                                iMin2 = i20;
                                            }
                                        }
                                        while (i13 < 9 - (i3 - i9)) {
                                            i12 = (i12 << 1) + (i12 << 3);
                                        }
                                        while (i3 < str.length()) {
                                            i3++;
                                        }
                                        if (i3 != i8) {
                                        }
                                        jf4.o("");
                                        return 0L;
                                    }
                                    i10 = (cCharAt4 - '0') + (i10 << 3) + (i10 << 1);
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i3 = i9;
                                i12 = 0;
                                while (i3 < iMin2) {
                                    cCharAt3 = str.charAt(i3);
                                    int i21 = iMin2;
                                    if ('0' <= cCharAt3) {
                                    }
                                    while (i13 < 9 - (i3 - i9)) {
                                        i12 = (i12 << 1) + (i12 << 3);
                                    }
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    jf4.o("");
                                    return 0L;
                                }
                                while (i13 < 9 - (i3 - i9)) {
                                    i12 = (i12 << 1) + (i12 << 3);
                                }
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                jf4.o("");
                                return 0L;
                            }
                            cCharAt = str.charAt(i3);
                            if (cCharAt == 'D') {
                                bfnVar = bfn.DAYS;
                            } else if (cCharAt == 'H') {
                                bfnVar = bfn.HOURS;
                            } else if (cCharAt == 'M') {
                                bfnVar = bfn.MINUTES;
                            } else if (cCharAt != 'S') {
                                bfnVar = null;
                            } else {
                                bfnVar = bfn.SECONDS;
                            }
                            if (bfnVar == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (bfnVar2 == null && bfnVar2.compareTo(bfnVar) <= 0) {
                                jf4.o("Unexpected order of duration components");
                                return 0L;
                            }
                            if (bfnVar == bfn.DAYS) {
                                if (i18 != 0) {
                                    jf4.o("");
                                    return 0L;
                                }
                                jD = efn.d(j2, bfnVar) * ((long) i4);
                            } else {
                                if (i18 == 0) {
                                    jf4.o("");
                                    return 0L;
                                }
                                jS = S(jD, efn.d(j2, bfnVar) * ((long) i4));
                                if (jS == 9223372036854759646L) {
                                    jf4.o("");
                                    return 0L;
                                }
                                jD = jS;
                            }
                            i17 = i3 + 1;
                            bfnVar2 = bfnVar;
                            i16 = i19;
                            i = i6;
                            c = '-';
                            c2 = '+';
                        } else {
                            i5 = i17;
                        }
                        i6 = i;
                        if (i3 == str.length()) {
                            if (cCharAt8 != '+' || cCharAt8 == '-') {
                                i7 = i19;
                            } else {
                                i7 = 0;
                            }
                            if (i3 == i5 + i7) {
                            }
                            j2 = j;
                            if (str.charAt(i3) == '.') {
                                i8 = i3 + 1;
                                iMin = Math.min(i3 + 7, str.length());
                                i10 = 0;
                                while (i9 < iMin) {
                                    cCharAt4 = str.charAt(i9);
                                    if ('0' <= cCharAt4) {
                                    }
                                    while (i11 < 6 - (i9 - i8)) {
                                        i10 = (i10 << 1) + (i10 << 3);
                                    }
                                    iMin2 = Math.min(i9 + 9, str.length());
                                    i3 = i9;
                                    i12 = 0;
                                    while (i3 < iMin2) {
                                        cCharAt3 = str.charAt(i3);
                                        int i22 = iMin2;
                                        if ('0' <= cCharAt3) {
                                        }
                                        while (i13 < 9 - (i3 - i9)) {
                                            i12 = (i12 << 1) + (i12 << 3);
                                        }
                                        while (i3 < str.length()) {
                                            i3++;
                                        }
                                        if (i3 != i8) {
                                        }
                                        jf4.o("");
                                        return 0L;
                                    }
                                    while (i13 < 9 - (i3 - i9)) {
                                        i12 = (i12 << 1) + (i12 << 3);
                                    }
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    jf4.o("");
                                    return 0L;
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i3 = i9;
                                i12 = 0;
                                while (i3 < iMin2) {
                                    cCharAt3 = str.charAt(i3);
                                    int i23 = iMin2;
                                    if ('0' <= cCharAt3) {
                                    }
                                    while (i13 < 9 - (i3 - i9)) {
                                        i12 = (i12 << 1) + (i12 << 3);
                                    }
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    jf4.o("");
                                    return 0L;
                                }
                                while (i13 < 9 - (i3 - i9)) {
                                    i12 = (i12 << 1) + (i12 << 3);
                                }
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                jf4.o("");
                                return 0L;
                            }
                            cCharAt = str.charAt(i3);
                            if (cCharAt == 'D') {
                                bfnVar = bfn.DAYS;
                            } else if (cCharAt == 'H') {
                                bfnVar = bfn.HOURS;
                            } else if (cCharAt == 'M') {
                                bfnVar = bfn.MINUTES;
                            } else if (cCharAt != 'S') {
                                bfnVar = null;
                            } else {
                                bfnVar = bfn.SECONDS;
                            }
                            if (bfnVar == null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                            }
                            if (bfnVar2 == null) {
                            }
                            if (bfnVar == bfn.DAYS) {
                                if (i18 != 0) {
                                    jf4.o("");
                                    return 0L;
                                }
                                jD = efn.d(j2, bfnVar) * ((long) i4);
                            } else {
                                if (i18 == 0) {
                                    jf4.o("");
                                    return 0L;
                                }
                                jS = S(jD, efn.d(j2, bfnVar) * ((long) i4));
                                if (jS == 9223372036854759646L) {
                                    jf4.o("");
                                    return 0L;
                                }
                                jD = jS;
                            }
                            i17 = i3 + 1;
                            bfnVar2 = bfnVar;
                            i16 = i19;
                            i = i6;
                            c = '-';
                            c2 = '+';
                        }
                        jf4.o("");
                        return 0L;
                    }
                }
                i3 = i17 + 1;
                i4 = i19;
                while (i3 < str.length()) {
                    i3++;
                }
                j = 0;
                while (true) {
                    if (i3 < str.length()) {
                        cCharAt5 = str.charAt(i3);
                        i5 = i17;
                        if ('0' > cCharAt5) {
                        }
                    } else {
                        i5 = i17;
                    }
                    i6 = i;
                    if (i3 == str.length()) {
                        if (cCharAt8 != '+') {
                            i7 = i19;
                        } else {
                            i7 = i19;
                        }
                        if (i3 == i5 + i7) {
                        }
                        j2 = j;
                        if (str.charAt(i3) == '.') {
                            i8 = i3 + 1;
                            iMin = Math.min(i3 + 7, str.length());
                            i10 = 0;
                            while (i9 < iMin) {
                                cCharAt4 = str.charAt(i9);
                                if ('0' <= cCharAt4) {
                                }
                                while (i11 < 6 - (i9 - i8)) {
                                    i10 = (i10 << 1) + (i10 << 3);
                                }
                                iMin2 = Math.min(i9 + 9, str.length());
                                i3 = i9;
                                i12 = 0;
                                while (i3 < iMin2) {
                                    cCharAt3 = str.charAt(i3);
                                    int i24 = iMin2;
                                    if ('0' <= cCharAt3) {
                                    }
                                    while (i13 < 9 - (i3 - i9)) {
                                        i12 = (i12 << 1) + (i12 << 3);
                                    }
                                    while (i3 < str.length()) {
                                        i3++;
                                    }
                                    if (i3 != i8) {
                                    }
                                    jf4.o("");
                                    return 0L;
                                }
                                while (i13 < 9 - (i3 - i9)) {
                                    i12 = (i12 << 1) + (i12 << 3);
                                }
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                jf4.o("");
                                return 0L;
                            }
                            while (i11 < 6 - (i9 - i8)) {
                                i10 = (i10 << 1) + (i10 << 3);
                            }
                            iMin2 = Math.min(i9 + 9, str.length());
                            i3 = i9;
                            i12 = 0;
                            while (i3 < iMin2) {
                                cCharAt3 = str.charAt(i3);
                                int i25 = iMin2;
                                if ('0' <= cCharAt3) {
                                }
                                while (i13 < 9 - (i3 - i9)) {
                                    i12 = (i12 << 1) + (i12 << 3);
                                }
                                while (i3 < str.length()) {
                                    i3++;
                                }
                                if (i3 != i8) {
                                }
                                jf4.o("");
                                return 0L;
                            }
                            while (i13 < 9 - (i3 - i9)) {
                                i12 = (i12 << 1) + (i12 << 3);
                            }
                            while (i3 < str.length()) {
                                i3++;
                            }
                            if (i3 != i8) {
                            }
                            jf4.o("");
                            return 0L;
                        }
                        cCharAt = str.charAt(i3);
                        if (cCharAt == 'D') {
                            bfnVar = bfn.DAYS;
                        } else if (cCharAt == 'H') {
                            bfnVar = bfn.HOURS;
                        } else if (cCharAt == 'M') {
                            bfnVar = bfn.MINUTES;
                        } else if (cCharAt != 'S') {
                            bfnVar = null;
                        } else {
                            bfnVar = bfn.SECONDS;
                        }
                        if (bfnVar == null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i3));
                        }
                        if (bfnVar2 == null) {
                        }
                        if (bfnVar == bfn.DAYS) {
                            if (i18 != 0) {
                                jf4.o("");
                                return 0L;
                            }
                            jD = efn.d(j2, bfnVar) * ((long) i4);
                        } else {
                            if (i18 == 0) {
                                jf4.o("");
                                return 0L;
                            }
                            jS = S(jD, efn.d(j2, bfnVar) * ((long) i4));
                            if (jS == 9223372036854759646L) {
                                jf4.o("");
                                return 0L;
                            }
                            jD = jS;
                        }
                        i17 = i3 + 1;
                        bfnVar2 = bfnVar;
                        i16 = i19;
                        i = i6;
                        c = '-';
                        c2 = '+';
                    }
                    jf4.o("");
                    return 0L;
                    j = (j << 3) + (j << i19) + ((long) i14);
                    i3++;
                    i17 = i5;
                    g710Var = g710Var;
                    i = i15;
                }
            } else {
                if (i18 != 0 || (i17 = i17 + 1) == str.length()) {
                    jf4.o("");
                    return 0L;
                }
                i18 = i16;
            }
        }
        int i26 = i;
        long jK = wen.k(w0(jD, bfn.MILLISECONDS), w0(j3, bfn.NANOSECONDS));
        if (i26 == 0) {
            return jK;
        }
        wen.b.getClass();
        return !wen.d(jK, wen.e) ? wen.n(jK) : jK;
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(1232090628);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str2) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(mm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 20.0f);
            long separator = ((ThemeColors) fetVar2.k(zaq0.b)).getSeparator();
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(mm40VarE, 1.0f, separator, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
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
            v8q0.a(str, s5x0.J(jm40.b, 4.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.l(new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109), fetVar2), fetVar2, (i2 >> 3) & 14, 0, 131068);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str2, i, (byte) 14);
        }
    }

    public static final l7g s0(uag uagVar, ril0 ril0Var) {
        String str;
        Object next;
        lel0 lel0Var;
        ril0Var.getClass();
        Iterator it = ril0Var.f.iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((f3n0) next).f8872a != uagVar.b);
        f3n0 f3n0Var = (f3n0) next;
        long j = uagVar.k;
        long j2 = uagVar.l;
        Date date = new Date(ynq0.e(j));
        Date date2 = new Date(ynq0.e(j2));
        rdj rdjVar = rdj.f30294a;
        ynq0 ynq0Var = new ynq0(j);
        sdj sdjVar = sdj.UNIVERSAL;
        String strF = rdj.f(ynq0Var, sdjVar, null, 60);
        String strF2 = rdj.f(new ynq0(j2), sdjVar, null, 60);
        if (strF.length() <= 0 || !ntb.V(date, date2)) {
            strF = kng0.l(strF, " - ", strF2);
        }
        String str2 = strF;
        String str3 = f3n0Var != null ? f3n0Var.b : null;
        String strK = "";
        String str4 = str3 == null ? "" : str3;
        if (f3n0Var != null && (lel0Var = f3n0Var.c) != null) {
            str = lel0Var.j;
        }
        String str5 = str == null ? "" : str;
        long j3 = uagVar.g;
        boolean z = uagVar.n;
        if (j3 > 0) {
            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
            decimalFormatSymbols.setGroupingSeparator('.');
            DecimalFormat decimalFormat = new DecimalFormat("#,###", decimalFormatSymbols);
            strK = z ? kng0.k("$", decimalFormat.format(j3)) : ohs0.n(decimalFormat.format(j3), "$");
        }
        return new l7g(uagVar.c, uagVar.b, str2, str4, str5, strK, uagVar.f);
    }

    public static final void t(mm40 mm40Var, tvw tvwVar, String str, boolean z, String str2, String str3, a4x a4xVar, fet fetVar, int i) {
        w6x.x(a4xVar, str, str3);
        fetVar.g0(-779776008);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(tvwVar) ? 32 : 16) | (fetVar.g(str) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.g(str2) ? 16384 : 8192) | (fetVar.g(str3) ? 131072 : 65536) | (fetVar.g(a4xVar) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            c(tvwVar, str, z, str2, str3, fetVar, (i2 >> 3) & 65534);
            fetVar.e0(-832750986);
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                x680 x680Var = (x680) it.next();
                fetVar.b0(237606299, x680Var.f40350a);
                wdx.h(x680Var.b, x680Var.c, u1c.M(-414290969, new elm(x680Var, (byte) 29), fetVar), fetVar, 384);
                fetVar.r(false);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ecc(mm40Var, (Object) tvwVar, (Object) str, z, (Object) str2, (Object) str3, (Object) a4xVar, i, (byte) 9);
        }
    }

    public static final mxl t0(twl twlVar) {
        fxl dxlVar;
        zwl zwlVar;
        String str = twlVar.f34655a;
        nwl nwlVar = twlVar.b;
        if (nwlVar != null) {
            if (nwlVar instanceof mwl) {
                dxlVar = exl.f8583a;
            } else {
                if ((nwlVar instanceof kwl) || (nwlVar instanceof iwl)) {
                    throw null;
                }
                if (nwlVar instanceof jwl) {
                    dxlVar = new bxl();
                } else if (nwlVar instanceof lwl) {
                    dxlVar = new dxl(((lwl) nwlVar).f20769a);
                }
            }
            swl swlVar = twlVar.c;
            if (swlVar != null) {
                if (swlVar instanceof rwl) {
                    hwl hwlVar = twlVar.d;
                    if (hwlVar != null) {
                        if (hwlVar instanceof fwl) {
                            zwlVar = xwl.f41614a;
                        } else if (hwlVar instanceof gwl) {
                            zwlVar = ywl.f43374a;
                        } else if (hwlVar instanceof ewl) {
                            throw null;
                        }
                        return new mxl(str, dxlVar, jxl.f17311a, zwlVar, twlVar.e);
                    }
                    t9f.b();
                    return null;
                }
                if ((swlVar instanceof qwl) || (swlVar instanceof owl) || (swlVar instanceof pwl)) {
                    throw null;
                }
            }
            t9f.b();
            return null;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void u(final q9m q9mVar, final a4x a4xVar, final long j, final long j2, final long j3, final long j4, final long j5, fet fetVar, final int i) {
        fet fetVar2;
        byte b;
        fet fetVar3 = fetVar;
        fetVar3.g0(275382234);
        long j6 = j2;
        int i2 = i | (fetVar3.g(q9mVar) ? 4 : 2) | (fetVar3.g(a4xVar) ? 32 : 16) | (fetVar3.f(j) ? 256 : 128) | (fetVar3.f(j6) ? 2048 : 1024) | (fetVar3.f(j3) ? 16384 : 8192) | (fetVar3.f(j4) ? 131072 : 65536) | (fetVar3.f(j5) ? 1048576 : 524288);
        if (fetVar3.U(i2 & 1, (599187 & i2) != 599186)) {
            int size = a4xVar.size();
            float fL0 = l0(a4xVar);
            boolean zD = fetVar3.d(fL0) | fetVar3.e(size);
            Object objP = fetVar3.P();
            if (zD || objP == ukd.f35823a) {
                b = 0;
                objP = new aam(fL0, size, b);
                fetVar3.o0(objP);
            } else {
                b = 0;
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, jm40.b);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30Var, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            int i3 = i2 >> 3;
            int i4 = i3 & 112;
            boolean z = b;
            z(q9mVar.f28355a, j, 0, fetVar3, i4, 4);
            fet fetVar4 = fetVar;
            z(q9mVar.b, j, 5, fetVar4, i4, 0);
            fetVar4.e0(-785091995);
            Iterator it = a4xVar.iterator();
            fet fetVar5 = fetVar4;
            while (it.hasNext()) {
                fam famVar = (fam) it.next();
                P(famVar.f9215a, j6, j5, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar5, ((i2 >> 6) & 112) | ((i2 >> 12) & 896));
                E(famVar.b, j5, famVar.c, famVar.d, j4, fetVar, ((i2 >> 15) & 112) | (57344 & i3));
                fet fetVar6 = fetVar;
                B(famVar.e, j3, fetVar6, (i2 >> 9) & 112);
                j6 = j2;
                fetVar5 = fetVar6;
            }
            fetVar5.r(z);
            fetVar5.r(true);
            fetVar2 = fetVar5;
        } else {
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(a4xVar, j, j2, j3, j4, j5, i) { // from class: a.u9m
                public final /* synthetic */ a4x b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long g;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    ibc.u(this.f35290a, this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final long u0(double d, bfn bfnVar) {
        bfnVar.getClass();
        double dA = dfn.a(d, bfnVar, bfn.NANOSECONDS);
        if (Double.isNaN(dA)) {
            jf4.o("Duration value cannot be NaN.");
            return 0L;
        }
        long jC = si30.c(dA);
        return (-4611686018426999999L > jC || jC >= 4611686018427000000L) ? a0(si30.c(dfn.a(d, bfnVar, bfn.MILLISECONDS))) : b0(jC);
    }

    public static final void v(final r9m r9mVar, final a4x a4xVar, final long j, final long j2, final long j3, final long j4, fet fetVar, final int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(992799791);
        long j5 = j3;
        int i2 = i | (fetVar2.g(r9mVar) ? 4 : 2) | (fetVar2.g(a4xVar) ? 32 : 16) | (fetVar2.f(j) ? 256 : 128) | (fetVar2.f(j2) ? 2048 : 1024) | (fetVar2.f(j5) ? 16384 : 8192) | (fetVar2.f(j4) ? 131072 : 65536);
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            int size = a4xVar.size();
            float fL0 = l0(a4xVar);
            boolean zD = fetVar2.d(fL0) | fetVar2.e(size);
            Object objP = fetVar2.P();
            if (zD || objP == ukd.f35823a) {
                objP = new aam(fL0, size, (byte) 1);
                fetVar2.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40.b);
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
            z(r9mVar.f30089a, j, 5, fetVar2, (i2 >> 3) & 112, 0);
            fetVar2.e0(-2076602803);
            Iterator it = a4xVar.iterator();
            while (it.hasNext()) {
                fam famVar = (fam) it.next();
                E(famVar.b, j4, famVar.c, famVar.d, j5, fetVar, ((i2 >> 12) & 112) | (57344 & i2));
                fetVar2 = fetVar;
                B(famVar.e, j2, fetVar2, (i2 >> 6) & 112);
                j5 = j3;
            }
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(a4xVar, j, j2, j3, j4, i) { // from class: a.t9m
                public final /* synthetic */ a4x b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    ibc.v(this.f33571a, this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final long v0(int i, bfn bfnVar) {
        if (bfnVar.compareTo(bfn.SECONDS) > 0) {
            return w0(i, bfnVar);
        }
        long j = i;
        bfn bfnVar2 = bfn.NANOSECONDS;
        return b0(TimeUnit.NANOSECONDS.convert(j, bfnVar.f2510a));
    }

    public static final void w(mm40 mm40Var, ehm0 ehm0Var, boolean z, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(665811808);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ehm0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = ehm0Var.f7815a;
            boolean z3 = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new z9q(function1, (byte) 7);
                fetVar.o0(objP);
            }
            tfx.p(R.string.statistic_info_forecast, R.drawable.ic_glyph_odds_movement, z2, (Function0) objP, o7k0.y(mm40Var, null, 3), u1c.M(1514567602, new kfe(ehm0Var, z, function1, (byte) 12), fetVar), fetVar, 196608);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new euq(mm40Var, ehm0Var, z, function1, i, (byte) 0);
        }
    }

    public static final long w0(long j, bfn bfnVar) {
        bfnVar.getClass();
        bfn bfnVar2 = bfn.NANOSECONDS;
        TimeUnit timeUnit = bfnVar.f2510a;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j && j <= jConvert) {
            return b0(timeUnit2.convert(j, timeUnit));
        }
        bfn bfnVar3 = bfn.MILLISECONDS;
        if (bfnVar.compareTo(bfnVar3) < 0) {
            return Z(l1e0.f(dfn.b(j, bfnVar, bfnVar3), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        return Z(efn.d(Math.abs(j), bfnVar) * jSignum);
    }

    public static final void x(th90 th90Var, x9v x9vVar, x9v x9vVar2, w9v w9vVar, String str, float f, l7m0 l7m0Var, Function2 function2, fet fetVar, int i) {
        Function2 function3;
        fet fetVar2 = fetVar;
        th90Var.getClass();
        l7m0Var.getClass();
        function2.getClass();
        fetVar2.g0(-145167822);
        int i2 = i | (fetVar2.g(th90Var) ? 4 : 2) | (fetVar2.g(x9vVar) ? 32 : 16) | (fetVar2.g(x9vVar2) ? 256 : 128) | (fetVar2.g(w9vVar) ? 2048 : 1024) | (fetVar2.g(str) ? 16384 : 8192) | (fetVar2.d(f) ? 131072 : 65536);
        if (fetVar2.U(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar2.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(lak0.c);
                fetVar2.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP3);
            }
            pz40 pz40Var2 = (pz40) objP3;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(jm40.b, f, 16.0f, f, 16.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = new nw6(cgk0Var, (byte) 20);
                fetVar2.o0(objP4);
            }
            phu0.p(th90Var, (Function1) objP4, pz40Var, str, w9vVar, pz40Var2, fetVar2, ((i2 << 3) & 112) | 1576326 | (i2 & 57344) | (458752 & (i2 << 6)));
            Pair pair = new Pair(Float.valueOf(x9vVar.b), Float.valueOf(x9vVar.f40527a));
            int iL = cgk0Var.l();
            i4 i4Var = o1a0.f24471a;
            int i3 = x9vVar.c;
            int i4 = x9vVar.d;
            eav eavVar = x9vVar.e;
            fav favVar = fav.f9228a;
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = new wil(pz40Var, (byte) 29);
                fetVar2.o0(objP5);
            }
            Function1 function1 = (Function1) objP5;
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                function3 = function2;
                objP6 = new z9n(function3, pz40Var2, (byte) 1);
                fetVar2.o0(objP6);
            } else {
                function3 = function2;
            }
            aac.a(pair, eavVar, iL, i4Var, i3, i4, function1, (Function1) objP6, l7m0Var, favVar, fetVar2, 907542528);
            Pair pair2 = new Pair(Float.valueOf(x9vVar2.b), Float.valueOf(x9vVar2.f40527a));
            int iL2 = cgk0Var.l();
            i4 i4Var2 = o1a0.b;
            int i5 = x9vVar2.c;
            int i6 = x9vVar2.d;
            eav eavVar2 = x9vVar2.e;
            fav favVar2 = fav.b;
            Object objP7 = fetVar2.P();
            if (objP7 == cl5Var) {
                objP7 = new y9v(pz40Var, (byte) 0);
                fetVar2.o0(objP7);
            }
            Function1 function4 = (Function1) objP7;
            Object objP8 = fetVar2.P();
            if (objP8 == cl5Var) {
                objP8 = new z9n(function3, pz40Var2, (byte) 2);
                fetVar2.o0(objP8);
            }
            aac.a(pair2, eavVar2, iL2, i4Var2, i5, i6, function4, (Function1) objP8, l7m0Var, favVar2, fetVar2, 907542528);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            function3 = function2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z9v(th90Var, x9vVar, x9vVar2, w9vVar, str, f, l7m0Var, function3, i);
        }
    }

    public static final k7t x0(n9t n9tVar, boolean z) {
        n9tVar.getClass();
        int i = n9tVar.f23156a;
        i9t i9tVar = n9tVar.i;
        i9t i9tVar2 = n9tVar.h;
        List list = n9tVar.b;
        int i2 = n9tVar.d;
        List list2 = n9tVar.f;
        List list3 = (z ? i9tVar2 : i9tVar).f14404a;
        if (z) {
            i9tVar = i9tVar2;
        }
        List<r9b> list4 = i9tVar.b;
        ArrayList arrayList = new ArrayList(r3d.q(list4, 10));
        for (r9b r9bVar : list4) {
            arrayList.add(new e7t(r9bVar.f, r9bVar.e, r9bVar.d));
        }
        return new k7t(i, list, i2, list2, list3, arrayList);
    }

    public static final void y(String str, String str2, String str3, String str4, String str5, String str6, fet fetVar, int i) {
        cs0.x(str, str2, str3, str4);
        fetVar.g0(-1116154259);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16) | (fetVar.g(str3) ? 256 : 128) | (fetVar.g(str4) ? 2048 : 1024) | (fetVar.g(str5) ? 16384 : 8192) | (fetVar.g(str6) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), "TIC_TAC_TOE_GAME_HEADER");
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            int i3 = i2 & 7168;
            pzb.t(o7k0.e(o7k0.s(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 80.0f), 32.0f), str, rab.f30127a, str4, str5, fetVar, ((i2 << 3) & 112) | 384 | i3 | (i2 & 57344));
            int i4 = i2 >> 3;
            vzb.o(i4 & 112, fetVar, o7k0.e(new x7z(1.0f, true), 32.0f), str3);
            pzb.t(o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 80.0f), 32.0f), str2, rab.b, str4, str6, fetVar, (i2 & 112) | 384 | i3 | (i4 & 57344));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(str, str2, str3, str4, str5, str6, i, (byte) 20);
        }
    }

    public static final tip0 y0(tip0 tip0Var, tip0 tip0Var2, fet fetVar) {
        tip0Var.getClass();
        tip0Var2.getClass();
        boolean zG = fetVar.g(tip0Var) | fetVar.g(tip0Var2);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            if (tip0Var2 instanceof qip0) {
                tip0Var = qip0.f28803a;
            }
            fetVar.o0(tip0Var);
            objP = tip0Var;
        }
        return (tip0) objP;
    }

    public static final void z(final String str, final long j, int i, fet fetVar, final int i2, final int i3) {
        int i4;
        int i5;
        final int i6;
        fet fetVar2 = fetVar;
        fetVar2.g0(1880304518);
        if ((i2 & 6) == 0) {
            i4 = (fetVar2.g(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar2.f(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                i5 = i;
                int i7 = fetVar2.e(i5) ? 256 : 128;
                i4 |= i7;
            } else {
                i5 = i;
            }
            i4 |= i7;
        } else {
            i5 = i;
        }
        if (fetVar2.U(i4 & 1, (i4 & 147) != 146)) {
            fetVar2.Z();
            if ((i2 & 1) != 0 && !fetVar2.B()) {
                fetVar2.X();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
            } else if ((i3 & 4) != 0) {
                i4 &= -897;
                i5 = 3;
            }
            int i8 = i5;
            int i9 = i4;
            fetVar2.s();
            tj30 tj30VarC = zq8.c(i8 == 5 ? gqw0.d : gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40.b);
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
            v8q0.a(str, null, j, null, 0L, null, null, null, 0L, new f2q0(i8), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, (i9 & 14) | ((i9 << 3) & 896), ((i9 >> 6) & 14) | 24960, 109562);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            i6 = i8;
        } else {
            fetVar2.X();
            i6 = i5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.v9m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ibc.z(str, j, i6, (fet) obj, x8x.L(i2 | 1), i3);
                    return Unit.f46060a;
                }
            };
        }
    }
}
