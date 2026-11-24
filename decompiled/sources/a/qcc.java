package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.os.Build;
import android.util.TypedValue;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit_sport.eventcard.top.EventCardHeader;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qcc {
    public static final void A(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-1958019193);
        int i2 = i | 6 | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40VarC, 36.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2, (i2 >> 3) & 14, 24576, 114682);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var2, str2, i, (byte) 18);
        }
    }

    public static final void B(fqj0 fqj0Var, fet fetVar, int i) {
        fetVar.g0(755564120);
        byte b = 2;
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(o7k0.s(jm40.b, 72.0f), 14.0f), vgg0.a(360.0f)), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7(b, i, fqj0Var);
        }
    }

    public static final void C(final prm prmVar, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        long j;
        agk0 agk0Var;
        float f;
        Float f2;
        float f3;
        boolean z2;
        a4x a4xVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1536154468);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(prmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float fB = pkd.b(24.0f, fetVar2);
            final float fB2 = pkd.b(4.0f, fetVar2);
            final float fB3 = pkd.b(2.0f, fetVar2);
            float fB4 = pkd.b(8.0f, fetVar2);
            boolean z3 = fetVar2.k(bmd.n) == k6z.b;
            pz40 pz40Var = s6t0.f31722a;
            drm drmVar = new drm(s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getPrimary(), s6t0.b().f33626a.getPrimary(), s6t0.b().f33626a.getPrimary(), s6t0.b().f33626a.getBackground());
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.a(0.0f);
                fetVar2.o0(objP);
            }
            agk0 agk0Var2 = (agk0) objP;
            prmVar.getClass();
            float f4 = prmVar.f27473a;
            orm ormVar = prmVar.c;
            boolean zG = fetVar2.g(null);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                fetVar2.o0(drmVar);
                objP2 = drmVar;
            }
            drm drmVar2 = (drm) objP2;
            zfn zfnVar = zaq0.b;
            float f5 = fB4;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            long backgroundContent2 = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            final long j2 = drmVar2.f6567a;
            final long j3 = drmVar2.b;
            long j4 = drmVar2.c;
            boolean z4 = ormVar instanceof nrm;
            boolean z5 = (!z4 || (a4xVar = prmVar.d) == null || a4xVar.isEmpty()) ? false : true;
            if (z4) {
                fetVar2.e0(-700066927);
                fetVar2.r(false);
                j = ((nrm) ormVar).f24008a;
            } else {
                fetVar2.e0(-700008678);
                long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
                fetVar2.r(false);
                j = background;
            }
            final boolean z6 = z5;
            boolean zD = fetVar2.d(f4) | fetVar2.d(0.0f) | fetVar2.d(100.0f);
            Object objP3 = fetVar2.P();
            long j5 = j;
            if (zD || objP3 == cl5Var) {
                objP3 = Float.valueOf(l1e0.c((f4 - 0.0f) / 100.0f, 0.0f, 1.0f));
                fetVar2.o0(objP3);
            }
            final float fFloatValue = ((Number) objP3).floatValue();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.e(o7k0.d(jm40Var, 1.0f), 32.0f), backgroundContent2, jd8.n);
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                agk0Var = agk0Var2;
                objP4 = new fc3(agk0Var, (byte) 5);
                fetVar2.o0(objP4);
            } else {
                agk0Var = agk0Var2;
            }
            mm40 mm40VarE0 = o2e.e0(fre0.Y(mm40VarQ, (Function1) objP4), "SALE_BET_SLIDER_TAG");
            float fL = agk0Var.l();
            int i4 = i3 << 12;
            int i5 = ((i3 << 9) & 7168) | (i4 & 458752) | (i4 & 3670016);
            fetVar2.e0(906773208);
            if (z) {
                Float fValueOf = Float.valueOf(fL);
                Float fValueOf2 = Float.valueOf(fB);
                boolean z7 = (((i5 & 3670016) ^ 1572864) > 1048576 && fetVar2.g(function1)) || (i5 & 1572864) == 1048576;
                boolean z8 = (((i5 & 7168) ^ 3072) > 2048 && fetVar2.g(prmVar)) || (i5 & 3072) == 2048;
                f = fB;
                boolean zD2 = z7 | z8 | fetVar2.d(fL) | fetVar2.d(f) | fetVar2.h(z3);
                Object objP5 = fetVar2.P();
                if (zD2 || objP5 == cl5Var) {
                    f2 = fValueOf2;
                    f3 = 1.0f;
                    hrm hrmVar = new hrm(function1, prmVar, fL, f, z3, (byte) 0);
                    fetVar2.o0(hrmVar);
                    objP5 = hrmVar;
                } else {
                    f2 = fValueOf2;
                    f3 = 1.0f;
                }
                mm40VarE0 = mm40VarE0.e(fnn0.b(jm40Var, fValueOf, f2, (PointerInputEventHandler) objP5));
                z2 = false;
                fetVar2.r(false);
            } else {
                z2 = false;
                fetVar2.r(false);
                agk0Var = agk0Var;
                f = fB;
                f5 = f5;
                backgroundContent = backgroundContent;
                j5 = j5;
                j4 = j4;
                f3 = 1.0f;
            }
            mm40 mm40Var = mm40VarE0;
            float fL2 = agk0Var.l();
            fetVar2.e0(-432011956);
            if (z) {
                boolean zD3 = fetVar2.d(fL2);
                Object objP6 = fetVar2.P();
                if (zD3 || objP6 == cl5Var) {
                    objP6 = mm40Var.e(fnn0.b(jm40Var, Float.valueOf(fL2), Float.valueOf(f), new hrm(function1, prmVar, fL2, f, z3, (byte) 1)));
                    fetVar2.o0(objP6);
                }
                mm40Var = (mm40) objP6;
                z2 = false;
            }
            fetVar2.r(z2);
            tj30 tj30VarC = zq8.c(gqw0.e, z2);
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
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, f3), 24.0f);
            final float f6 = f5;
            final long j6 = j5;
            boolean zH = fetVar2.h(z3) | fetVar2.d(fFloatValue) | fetVar2.d(fB2) | fetVar2.h(z6) | ((i3 & 14) == 4 ? true : z2) | fetVar2.f(j2) | fetVar2.d(f6) | fetVar2.f(j3) | fetVar2.f(j6) | fetVar2.d(fB3) | fetVar2.f(j4);
            final long j7 = backgroundContent;
            boolean zF = zH | fetVar2.f(j7);
            Object objP7 = fetVar2.P();
            if (zF || objP7 == cl5Var) {
                final boolean z9 = z3;
                final long j8 = j4;
                objP7 = new Function1() { // from class: a.frm
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        final boolean z10;
                        List list;
                        pi9 pi9Var = (pi9) obj;
                        pi9Var.getClass();
                        final float fIntBitsToFloat = Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L)) / 2.0f;
                        final float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pi9Var.f27033a.d() & 4294967295L)) / 2.0f;
                        boolean z11 = z9;
                        float f7 = fFloatValue;
                        if (z11) {
                            f7 = 1.0f - f7;
                        }
                        final float fIntBitsToFloat3 = (((Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)) - fIntBitsToFloat) - fIntBitsToFloat) * f7) + fIntBitsToFloat;
                        final float f8 = fB2;
                        float f9 = f8 / 2.0f;
                        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f9)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                        final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32)) - f9) << 32);
                        if (z6) {
                            a4x a4xVar2 = prmVar.d;
                            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (pi9Var.f27033a.d() >> 32));
                            if (a4xVar2.isEmpty()) {
                                z10 = z11;
                                list = iun.f15405a;
                            } else {
                                float f10 = (fIntBitsToFloat4 - f9) - f9;
                                ArrayList arrayList = new ArrayList(r3d.q(a4xVar2, 10));
                                Iterator<E> it = a4xVar2.iterator();
                                while (it.hasNext()) {
                                    boolean z12 = z11;
                                    float fC = (l1e0.c((((Number) it.next()).floatValue() - 0.0f) / 100.0f, 0.0f, 1.0f) * f10) + f9;
                                    if (z12) {
                                        fC = fIntBitsToFloat4 - fC;
                                    }
                                    arrayList.add(Float.valueOf(fC));
                                    z11 = z12;
                                }
                                z10 = z11;
                                list = arrayList;
                            }
                        } else {
                            z10 = z11;
                            list = iun.f15405a;
                        }
                        final List list2 = list;
                        final long j9 = j2;
                        final float f11 = f6;
                        final long j10 = j3;
                        final long j11 = j6;
                        final float f12 = fB3;
                        final long j12 = j8;
                        final long j13 = j7;
                        return pi9Var.a(new Function1() { // from class: a.grm
                            /* JADX WARN: Code duplicated, block: B:22:0x0078  */
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                float f13;
                                fhl fhlVar = (fhl) obj2;
                                fhlVar.getClass();
                                long j14 = j9;
                                long j15 = jFloatToRawIntBits;
                                long j16 = jFloatToRawIntBits2;
                                float f14 = f8;
                                fhl.Q(fhlVar, j14, j15, j16, f14, 1, null, Response.TEMPORARILY_UNAVAILABLE);
                                List list3 = list2;
                                boolean zIsEmpty = list3.isEmpty();
                                float f15 = fIntBitsToFloat3;
                                boolean z13 = z10;
                                long j17 = j10;
                                if (!zIsEmpty) {
                                    float f16 = f11 / 2.0f;
                                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / 2.0f;
                                    zcl zclVar2 = qmk.f28987a;
                                    int i6 = 0;
                                    for (Object obj3 : list3) {
                                        int i7 = i6 + 1;
                                        if (i6 < 0) {
                                            q3d.p();
                                            throw null;
                                        }
                                        float fFloatValue2 = ((Number) obj3).floatValue();
                                        int size = list3.size() - 1;
                                        if (i6 != 0 || z13) {
                                            f13 = -4.0f;
                                            if ((i6 != 0 || !z13) && (i6 != size || z13)) {
                                                if (i6 == size && z13) {
                                                    f13 = 4.0f;
                                                } else {
                                                    f13 = 0.0f;
                                                }
                                            }
                                        } else {
                                            f13 = 4.0f;
                                        }
                                        float f17 = fFloatValue2 + f13;
                                        long j18 = (!z13 ? f17 <= f15 : f17 >= f15) ? j11 : j17;
                                        boolean z14 = z13;
                                        float f18 = f16;
                                        fhlVar = fhlVar;
                                        fhl.E(fhlVar, j18, f18, (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L) | (((long) Float.floatToRawIntBits(f17)) << 32), 0.0f, null, 120);
                                        f16 = f18;
                                        i6 = i7;
                                        f15 = f15;
                                        z13 = z14;
                                        j17 = j17;
                                    }
                                }
                                float f19 = f15;
                                boolean z15 = z13;
                                long j19 = j17;
                                float f20 = fIntBitsToFloat2;
                                fhl.Q(fhlVar, j19, z15 ? (((long) Float.floatToRawIntBits(f20)) & 4294967295L) | (((long) Float.floatToRawIntBits(f19)) << 32) : j15, z15 ? j16 : (((long) Float.floatToRawIntBits(f20)) & 4294967295L) | (((long) Float.floatToRawIntBits(f19)) << 32), f14, 1, null, Response.TEMPORARILY_UNAVAILABLE);
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f19)) << 32) | (((long) Float.floatToRawIntBits(f20)) & 4294967295L);
                                long j20 = j12;
                                float f21 = fIntBitsToFloat;
                                fhl.E(fhlVar, j20, f21, jFloatToRawIntBits3, 0.0f, null, 120);
                                fhl.E(fhlVar, j13, f21, (((long) Float.floatToRawIntBits(f19)) << 32) | (((long) Float.floatToRawIntBits(f20)) & 4294967295L), 0.0f, new vtm0(f12, 0.0f, 0, 0, null, 30), 104);
                                return Unit.f46060a;
                            }
                        });
                    }
                };
                fetVar2 = fetVar;
                fetVar2.o0(objP7);
            }
            zq8.a(0, fetVar2, rq8.L(mm40VarE, (Function1) objP7));
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((Object) prmVar, z, (Object) function1, i, (byte) 12);
        }
    }

    public static final void D(boolean z, g8k0 g8k0Var, g8k0 g8k0Var2, long j, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        lw3 lw3Var = uc9.f35418a;
        lw3 lw3Var2 = uc9.b;
        fetVar2.g0(558198805);
        int i2 = i | (fetVar2.h(z) ? 4 : 2) | (fetVar2.g(g8k0Var) ? 32 : 16) | (fetVar2.g(g8k0Var2) ? 256 : 128) | (fetVar2.f(j) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            int i3 = i2 & 7168;
            w(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), g8k0Var, z ? lw3Var2 : lw3Var, j, fetVar2, i2 & 7280);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            fetVar2 = fetVar;
            w(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), g8k0Var2, z ? lw3Var : lw3Var2, j, fetVar2, ((i2 >> 3) & 112) | i3);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w13(z, g8k0Var, g8k0Var2, j, i);
        }
    }

    public static final void E(int i, fet fetVar) {
        fetVar.g0(-1461428595);
        if (fetVar.U(i & 1, i != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.j, fetVar, 6);
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
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            B(fqj0VarD0, fetVar, 0);
            B(fqj0VarD0, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f4m(i, (byte) 14);
        }
    }

    public static mm40 F(mm40 mm40Var, long j, float f, float f2, float f3, float f4, int i) {
        float f5 = (i & 8) != 0 ? 0.0f : f3;
        float f6 = (i & 32) != 0 ? 0.0f : f4;
        boolean z = (i & 64) == 0;
        mm40Var.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            return rq8.K(mm40Var, new l5d(f6, j, z, f2, f5, f));
        }
        return rq8.K(mm40Var, new l5d(z, f2, f5, f6, f, j));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void G(zje zjeVar) {
        wzj wzjVar;
        if (zjeVar instanceof wzj) {
            wzjVar = (wzj) zjeVar;
            int i = wzjVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                wzjVar.j = i - Integer.MIN_VALUE;
            } else {
                wzjVar = new wzj(zjeVar);
            }
        } else {
            wzjVar = new wzj(zjeVar);
        }
        Object obj = wzjVar.i;
        wne wneVar = wne.f39444a;
        int i2 = wzjVar.j;
        if (i2 == 0) {
            z1x.P(obj);
            wzjVar.j = 1;
            n5a n5aVar = new n5a(1, pnx.b(wzjVar));
            n5aVar.r();
            if (n5aVar.p() == wneVar) {
                return;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            z1x.P(obj);
        }
        csj.b();
    }

    public static final void H(EventCardHeader eventCardHeader, dur durVar) {
        eventCardHeader.getClass();
        durVar.getClass();
        K(eventCardHeader, durVar.g);
        ank0 ank0Var = durVar.h;
        Context context = eventCardHeader.getContext();
        context.getClass();
        eventCardHeader.setTitle(ank0Var.b(context));
        eventCardHeader.setStreamButtonVisible(durVar.i);
        eventCardHeader.setZoneButtonVisible(durVar.j);
        eventCardHeader.setStreamButtonIconRes(R.drawable.ic_video_indicator_new);
        eventCardHeader.setNotificationButtonVisible(durVar.l);
        boolean z = durVar.k;
        eventCardHeader.setNotificationButtonIconRes(z ? R.drawable.ic_notifications_new : R.drawable.ic_notifications_none_new);
        eventCardHeader.setNotificationButtonSelected(z);
        eventCardHeader.setFavoriteButtonVisible(durVar.n);
        boolean z2 = durVar.m;
        eventCardHeader.setFavoriteButtonIconRes(z2 ? R.drawable.ic_star_liked_new : R.drawable.ic_star_unliked_new);
        eventCardHeader.setFavoriteButtonSelected(z2);
    }

    public static final void I(cp cpVar) {
        List list = u0d.f34849a;
        ImageView imageView = ((qth) cpVar.u).b;
        String str = ((m4k0) cpVar.u()).b.f7186a;
        u0d.n(imageView, str, R.drawable.icon_globe_empty, 3);
    }

    public static final void J(EventCardHeader eventCardHeader, cur curVar) {
        eventCardHeader.getClass();
        curVar.getClass();
        if (curVar instanceof ztr) {
            K(eventCardHeader, (ztr) curVar);
            return;
        }
        if (curVar instanceof ttr) {
            ank0 ank0Var = ((ttr) curVar).f34521a;
            Context context = eventCardHeader.getContext();
            context.getClass();
            eventCardHeader.setTitle(ank0Var.b(context));
            return;
        }
        if (curVar instanceof aur) {
            eventCardHeader.setStreamButtonVisible(((aur) curVar).f1492a);
            return;
        }
        if (curVar instanceof bur) {
            eventCardHeader.setZoneButtonVisible(((bur) curVar).f3246a);
            return;
        }
        if (curVar instanceof vtr) {
            eventCardHeader.setNotificationButtonVisible(((vtr) curVar).f38021a);
            return;
        }
        if (curVar instanceof utr) {
            boolean z = ((utr) curVar).f36267a;
            eventCardHeader.setNotificationButtonIconRes(z ? R.drawable.ic_notifications_new : R.drawable.ic_notifications_none_new);
            eventCardHeader.setNotificationButtonSelected(z);
        } else if (curVar instanceof str) {
            eventCardHeader.setFavoriteButtonVisible(((str) curVar).f32785a);
        } else {
            if (!(curVar instanceof rtr)) {
                t9f.b();
                return;
            }
            boolean z2 = ((rtr) curVar).f31089a;
            eventCardHeader.setFavoriteButtonIconRes(z2 ? R.drawable.ic_star_liked_new : R.drawable.ic_star_unliked_new);
            eventCardHeader.setFavoriteButtonSelected(z2);
        }
    }

    public static final void K(EventCardHeader eventCardHeader, ztr ztrVar) {
        ytr ytrVar = ztrVar.f44975a;
        int i = ztrVar.b;
        eventCardHeader.setIconVisible(true);
        eventCardHeader.setTopIconVisible(ztrVar.c);
        if (ytrVar instanceof wtr) {
            Context context = eventCardHeader.getContext();
            context.getClass();
            eventCardHeader.setIconTint(m5d.b(R.attr.uikitSecondary, context));
            eventCardHeader.a(i, ((wtr) ytrVar).f39755a);
            return;
        }
        if (!(ytrVar instanceof xtr)) {
            t9f.b();
            return;
        }
        Drawable drawable = null;
        eventCardHeader.setIconTint((ColorStateList) null);
        Context context2 = eventCardHeader.getContext();
        context2.getClass();
        Drawable drawable2 = context2.getDrawable(i);
        if (drawable2 != null) {
            Context context3 = eventCardHeader.getContext();
            context3.getClass();
            vcc.c0(drawable2, context3, R.attr.uikitSecondary80);
            drawable = drawable2;
        }
        EventCardHeader.b(eventCardHeader, ((xtr) ytrVar).b, drawable);
    }

    public static final List L(xmn xmnVar, boolean z, boolean z2, boolean z3, Map map, Map map2) {
        ArrayList arrayList;
        tb7 tb7Var;
        List<bho> list;
        String strL;
        gho ghoVar;
        xco xcoVar;
        ueo ueoVar;
        ueo ueoVar2;
        String str;
        String strValueOf;
        xco xcoVar2;
        xmnVar.getClass();
        map.getClass();
        map2.getClass();
        List list2 = xmnVar.f41135a;
        if (list2 == null || (tb7Var = (tb7) CollectionsKt.firstOrNull(list2)) == null || (list = tb7Var.k) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            for (bho bhoVar : list) {
                bhoVar.getClass();
                map.getClass();
                map2.getClass();
                Long l = bhoVar.n;
                Long l2 = bhoVar.L;
                Double d = bhoVar.F;
                Long l3 = bhoVar.s;
                Long l4 = bhoVar.l;
                String str2 = (l == null || (xcoVar2 = (xco) map.get(Long.valueOf(l.longValue()))) == null) ? null : xcoVar2.b;
                if (str2 == null) {
                    str2 = "";
                }
                ueo ueoVar3 = l4 != null ? (ueo) map2.get(Long.valueOf(l4.longValue())) : null;
                long jLongValue = l3 != null ? l3.longValue() : 0L;
                long jLongValue2 = l4 != null ? l4.longValue() : 0L;
                Long l5 = bhoVar.p;
                long jLongValue3 = l5 != null ? l5.longValue() : 0L;
                Long l6 = bhoVar.d;
                long jLongValue4 = l6 != null ? l6.longValue() : 0L;
                double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
                Long l7 = bhoVar.x;
                long jLongValue5 = l7 != null ? l7.longValue() : 0L;
                Boolean bool = bhoVar.t;
                boolean z4 = false;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                if (str2.length() <= 0 || ueoVar3 == null || (str = ueoVar3.b) == null || str.length() <= 0) {
                    strL = "";
                } else {
                    String str3 = ueoVar3.b;
                    List list3 = bhoVar.Q;
                    if (list3 == null) {
                        list3 = iun.f15405a;
                    }
                    List list4 = list3;
                    List list5 = bhoVar.R;
                    if (list5 == null) {
                        list5 = iun.f15405a;
                    }
                    strL = kng0.l(str2, ": ", dii0.a(str3, list4, list5, Integer.valueOf(ueoVar3.c), z, (d == null || (strValueOf = String.valueOf(d.doubleValue())) == null) ? null : kotlin.text.b.h(strValueOf), "", Long.valueOf(l2 != null ? l2.longValue() : 0L), ueoVar3.f35538a, nt20.k, z2, z3));
                }
                long jLongValue6 = l2 != null ? l2.longValue() : 0L;
                String str4 = bhoVar.f;
                String str5 = str4 == null ? "" : str4;
                Double d2 = bhoVar.h;
                double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
                String str6 = bhoVar.i;
                String str7 = str6 == null ? "" : str6;
                Long l8 = bhoVar.O;
                long jLongValue7 = l8 != null ? l8.longValue() : 0L;
                String str8 = bhoVar.z;
                String str9 = str8 == null ? "" : str8;
                String str10 = bhoVar.D;
                String str11 = str10 == null ? "" : str10;
                List list6 = bhoVar.y;
                if (list6 == null) {
                    list6 = iun.f15405a;
                }
                List list7 = list6;
                List list8 = bhoVar.C;
                if (list8 == null) {
                    list8 = iun.f15405a;
                }
                List list9 = list8;
                String str12 = bhoVar.G;
                String str13 = str12 == null ? "" : str12;
                String str14 = bhoVar.I;
                String str15 = str14 == null ? "" : str14;
                String str16 = bhoVar.H;
                String str17 = str16 == null ? "" : str16;
                if (l4 != null && (ueoVar2 = (ueo) map2.get(Long.valueOf(l4.longValue()))) != null && ueoVar2.d == 2) {
                    ghoVar = gho.c;
                } else if (l4 == null || (ueoVar = (ueo) map2.get(Long.valueOf(l4.longValue()))) == null || ueoVar.d != 3) {
                    if (l3 != null && (xcoVar = (xco) map.get(Long.valueOf(l3.longValue()))) != null) {
                        z4 = xcoVar.e;
                    }
                    ghoVar = z4 ? gho.b : gho.f11309a;
                } else {
                    ghoVar = gho.d;
                }
                arrayList2.add(new pln(jLongValue, jLongValue2, jLongValue3, jLongValue4, dDoubleValue, jLongValue5, zBooleanValue, false, strL, jLongValue6, str5, dDoubleValue2, 0.0d, str7, false, jLongValue7, str9, str11, list7, list9, str13, str15, str17, false, "", false, ghoVar));
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public static final String M(String str) {
        String string;
        if (str != null) {
            StringBuilder sb = new StringBuilder(ujn.h);
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
            string = sb.toString();
        } else {
            string = null;
        }
        return string == null ? "" : string;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    public static final float N(long j, float f, float f2, a4x a4xVar, boolean z) {
        float fFloatValue;
        Object obj;
        if (f > 0.0f) {
            float f3 = f2 / 2.0f;
            float f4 = f - f3;
            float f5 = f4 - f3;
            if (f5 > 0.0f) {
                float fC = (l1e0.c(Float.intBitsToFloat((int) (j >> 32)), f3, f4) - f3) / f5;
                if (z) {
                    fC = 1.0f - fC;
                }
                fFloatValue = (fC * 100.0f) + 0.0f;
                if (a4xVar != null && !a4xVar.isEmpty()) {
                    Iterator<E> it = a4xVar.iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (it.hasNext()) {
                            float fAbs = Math.abs(((Number) next).floatValue() - fFloatValue);
                            do {
                                Object next2 = it.next();
                                float fAbs2 = Math.abs(((Number) next2).floatValue() - fFloatValue);
                                if (Float.compare(fAbs, fAbs2) > 0) {
                                    next = next2;
                                    fAbs = fAbs2;
                                }
                            } while (it.hasNext());
                        }
                        obj = next;
                    } else {
                        obj = null;
                    }
                    Float f6 = (Float) obj;
                    if (f6 != null) {
                        fFloatValue = f6.floatValue();
                    }
                }
            } else {
                fFloatValue = 0.0f;
            }
        } else {
            fFloatValue = 0.0f;
        }
        return l1e0.c(fFloatValue, 0.0f, 100.0f);
    }

    public static final Object O(long j, yje yjeVar) {
        if (j <= 0) {
            return Unit.f46060a;
        }
        n5a n5aVar = new n5a(1, pnx.b(yjeVar));
        n5aVar.r();
        if (j < Long.MAX_VALUE) {
            T(n5aVar.e).a(j, n5aVar);
        }
        Object objP = n5aVar.p();
        return objP == wne.f39444a ? objP : Unit.f46060a;
    }

    public static final Object P(long j, yje yjeVar) {
        Object objO = O(g0(j), yjeVar);
        return objO == wne.f39444a ? objO : Unit.f46060a;
    }

    public static final void Q(Fragment fragment) {
        fragment.getClass();
        List listP = fragment.F().c.p();
        listP.getClass();
        List listP2 = fragment.C().c.p();
        listP2.getClass();
        ArrayList arrayListQ0 = CollectionsKt.q0(listP, listP2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListQ0) {
            if (obj instanceof sik) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((sik) it.next()).y0();
        }
    }

    public static final void R(fhl fhlVar, float f) {
        fhl fhlVar2 = fhlVar;
        float f2 = f / 11.0f;
        zcl zclVar = qmk.f28987a;
        x03 x03VarK = qjj.K(0.0f, new float[]{fhlVar2.w0(10.0f), fhlVar2.w0(10.0f)});
        int i = 0;
        while (i < 12) {
            float f3 = i * f2;
            pz40 pz40Var = s6t0.f31722a;
            long separator = s6t0.b().f33626a.getSeparator();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (fhlVar2.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
            zcl zclVar2 = qmk.f28987a;
            x03VarK = x03VarK;
            fhl.Q(fhlVar2, separator, jFloatToRawIntBits, jFloatToRawIntBits2, fhlVar2.w0(1.0f), 0, x03VarK, 464);
            i++;
            fhlVar2 = fhlVar;
        }
    }

    public static final long S(int i, fet fetVar) {
        Context context = (Context) fetVar.k(dy2.b);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return obc.O(typedValue.resourceId, fetVar);
    }

    public static final vzj T(CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.d.d1);
        vzj vzjVar = element instanceof vzj ? (vzj) element : null;
        return vzjVar == null ? fuj.f10165a : vzjVar;
    }

    public static final int U(List list, ano0 ano0Var) {
        Object next;
        Integer intOrNull;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((cno0) it.next()).f4666a);
        }
        Iterator it2 = r3d.r(arrayList).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((bno0) next).f2894a != ano0Var);
        bno0 bno0Var = (bno0) next;
        if (bno0Var == null || (intOrNull = StringsKt.toIntOrNull(bno0Var.c)) == null) {
            return 0;
        }
        return intOrNull.intValue();
    }

    public static final int V(List list, ano0 ano0Var) {
        Object next;
        Integer intOrNull;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((cno0) it.next()).f4666a);
        }
        Iterator it2 = r3d.r(arrayList).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((bno0) next).f2894a != ano0Var);
        bno0 bno0Var = (bno0) next;
        if (bno0Var == null || (intOrNull = StringsKt.toIntOrNull(bno0Var.d)) == null) {
            return 0;
        }
        return intOrNull.intValue();
    }

    public static final void W(Fragment fragment, clz clzVar, Function0 function0) {
        fragment.getClass();
        clzVar.getClass();
        function0.getClass();
        byte b = 9;
        v62 v62Var = new v62(function0, b);
        clzVar.x().a(new tvj(new gup(fragment, v62Var, b), new f5o(v62Var, (byte) 29), null, 51));
    }

    public static final void X(Fragment fragment, Function0 function0) {
        fragment.getClass();
        function0.getClass();
        W(fragment, fragment.K(), function0);
    }

    public static final void Y(etr etrVar, dur durVar) {
        etrVar.getClass();
        durVar.getClass();
        etrVar.o(new lia(durVar.d, durVar.l, durVar.f, durVar.b, durVar.f6710a, durVar.c, durVar.e, false));
    }

    public static final void Z(etr etrVar, dur durVar) {
        etrVar.getClass();
        durVar.getClass();
        etrVar.k(new nia(durVar.b, durVar.f6710a, durVar.c, durVar.d, durVar.f, durVar.h.a(), durVar.e));
    }

    public static final void a(mm40 mm40Var, rcc rccVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        rccVar.getClass();
        fetVar.g0(-779249344);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(rccVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new trb(function1, (byte) 6);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z2 = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new lya(rccVar, (byte) 15);
                fetVar.o0(objP2);
            }
            jm40 jm40Var = jm40.b;
            dwi0.b(function2, jm40Var, (Function1) objP2, fetVar, (i2 << 3) & 112, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((byte) 25, i, (Object) mm40Var2, (Object) rccVar, function1);
        }
    }

    public static final void a0(etr etrVar, dur durVar) {
        etrVar.getClass();
        durVar.getClass();
        long j = durVar.b;
        long j2 = durVar.d;
        long j3 = durVar.c;
        long j4 = durVar.f;
        boolean z = durVar.e;
        etrVar.d(new oia(j, j3, j2, j4, durVar.o, durVar.h.a(), z));
    }

    public static final void b(ddh ddhVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-2026040097);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ddhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = eof.f8136a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new v4f(ddhVar, context, (byte) 11);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, null, (Function1) objP2, fetVar2, 6, 2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(ddhVar, i, (byte) 26);
        }
    }

    public static final void b0(etr etrVar, dur durVar) {
        etrVar.getClass();
        durVar.getClass();
        long j = durVar.b;
        long j2 = durVar.d;
        long j3 = durVar.c;
        long j4 = durVar.f;
        boolean z = durVar.e;
        etrVar.m(new oia(j, j3, j2, j4, durVar.o, durVar.h.a(), z));
    }

    public static final void c(mm40 mm40Var, a4x a4xVar, ugd ugdVar, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        a4x a4xVar2;
        ugd ugdVar2;
        yfe0 yfe0VarU;
        rph rphVar;
        jm40 jm40Var;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        a4xVar.getClass();
        fetVar.g0(2140922992);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (a4xVar.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    rphVar = new rph(mm40Var2, a4xVar, ugdVar, i, (byte) 4);
                }
            } else {
                a4xVar2 = a4xVar;
                ugdVar2 = ugdVar;
                mm40 mm40VarV = vic.v(mm40Var);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarJ = s5x0.J(mm40VarV, 8.0f);
                byte b = 14;
                x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4(b)), gqw0.m, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
                mkd.c0.getClass();
                fetVar.i0();
                boolean z = fetVar.S;
                pcy pcyVar = e7z.u1;
                if (z) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA, shdVar4);
                jpm0.o(fetVar, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC0, shdVar);
                fetVar.e0(1071058956);
                Iterator it = CollectionsKt.K(CollectionsKt.D0(a4xVar2, 4), 2).iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    jm40Var = jm40.b;
                    if (!zHasNext) {
                        break;
                    }
                    List list = (List) it.next();
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b)), gqw0.j, fetVar, 0);
                    shd shdVar5 = shdVar;
                    int iHashCode2 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM2 = fetVar.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, shdVar4);
                    jpm0.o(fetVar, bh90VarM2, shdVar3);
                    vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                    for (Iterator itV = kng0.v(fetVar, mm40VarC1, shdVar5, -1082489667, list); itV.hasNext(); itV = itV) {
                        dqh dqhVar = (dqh) itV.next();
                        mbc.h(new x7z(1.0f, true), dqhVar.f6515a, dqhVar.b, null, fetVar, 0, 8);
                        pcyVar = pcyVar;
                    }
                    fetVar.r(false);
                    fetVar.r(true);
                    shdVar = shdVar5;
                    b = 14;
                }
                fetVar.r(false);
                ugdVar2.F(jm40Var, fetVar, Integer.valueOf(((i2 >> 3) & 112) | 6));
                fetVar.r(true);
            }
            yfe0VarU.d = rphVar;
        }
        a4xVar2 = a4xVar;
        ugdVar2 = ugdVar;
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            rphVar = new rph(mm40Var, a4xVar2, ugdVar2, i, (byte) 5);
            yfe0VarU.d = rphVar;
        }
    }

    public static final Boolean c0(Fragment fragment) {
        fragment.getClass();
        i0h0 i0h0Var = fragment.y;
        cg60 cg60Var = i0h0Var instanceof cg60 ? (cg60) i0h0Var : null;
        if (cg60Var != null) {
            return Boolean.valueOf(cg60Var.j());
        }
        return null;
    }

    public static final void d(mm40 mm40Var, n3i n3iVar, fet fetVar, int i) {
        fetVar.g0(-1975171046);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(n3iVar) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (n3iVar instanceof k3i) {
            fetVar.e0(-1268482992);
            xbc.j(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        } else if (n3iVar instanceof l3i) {
            fetVar.e0(236182316);
            vcc.d(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        } else {
            if (!(n3iVar instanceof m3i)) {
                throw b1j.f(236174117, fetVar, false);
            }
            fetVar.e0(236188588);
            tdc.f(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new chh(mm40Var, n3iVar, i, (byte) 23);
        }
    }

    public static final void d0(slh0 slh0Var, boolean z) {
        kxq kxqVarB;
        Window window;
        if (Build.VERSION.SDK_INT >= 30 || (kxqVarB = slh0Var.B()) == null || (window = kxqVarB.getWindow()) == null) {
            return;
        }
        window.setSoftInputMode(z ? 16 : 32);
    }

    public static final void e(final qsk qskVar, final l7m0 l7m0Var, final l7m0 l7m0Var2, final float f, final float f2, final float f3, final float f4, final Function1 function1, fet fetVar, final int i) {
        int i2;
        float f5;
        qskVar.getClass();
        l7m0Var.getClass();
        l7m0Var2.getClass();
        function1.getClass();
        fetVar.g0(1698503396);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(qskVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(l7m0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.d(f3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.d(f4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(function1) ? 8388608 : 4194304;
        }
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z = qskVar instanceof msk;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar.e0(1105379832);
                int i3 = i2 >> 3;
                gnm0.b(l7m0Var, fetVar, i3 & 14);
                msk mskVar = (msk) qskVar;
                int i4 = i2 & 29360128;
                boolean z2 = i4 == 8388608;
                Object objP = fetVar.P();
                if (z2 || objP == cl5Var) {
                    objP = new ynk(function1, (byte) 6);
                    fetVar.o0(objP);
                }
                Function1 function2 = (Function1) objP;
                boolean z3 = i4 == 8388608;
                Object objP2 = fetVar.P();
                if (z3 || objP2 == cl5Var) {
                    objP2 = new ouh(function1, (byte) 25);
                    fetVar.o0(objP2);
                }
                Function0 function0 = (Function0) objP2;
                boolean z4 = i4 == 8388608;
                Object objP3 = fetVar.P();
                if (z4 || objP3 == cl5Var) {
                    objP3 = new ouh(function1, (byte) 26);
                    fetVar.o0(objP3);
                }
                xf0.j(null, mskVar, l7m0Var, f, f2, f4, function2, function0, (Function0) objP3, fetVar, (i2 & 57344) | ((i2 << 3) & 1008) | (i2 & 7168) | (i3 & 458752));
                fetVar.r(false);
            } else if (qskVar instanceof osk) {
                fetVar.e0(1106904536);
                gnm0.d(6, fetVar, false);
                int i5 = i2;
                osk oskVar = (osk) qskVar;
                int i6 = i5 & 29360128;
                boolean z5 = i6 == 8388608;
                Object objP4 = fetVar.P();
                if (z5 || objP4 == cl5Var) {
                    objP4 = new ouh(function1, (byte) 27);
                    fetVar.o0(objP4);
                }
                Function0 function3 = (Function0) objP4;
                boolean z6 = i6 == 8388608;
                Object objP5 = fetVar.P();
                if (z6 || objP5 == cl5Var) {
                    objP5 = new ouh(function1, (byte) 28);
                    fetVar.o0(objP5);
                }
                n4c.f(oskVar, l7m0Var2, function3, (Function0) objP5, fetVar, (i5 & 14) | ((i5 >> 3) & 112));
                fetVar.r(false);
            } else {
                int i7 = i2;
                if (qskVar instanceof nsk) {
                    fetVar.e0(1107481508);
                    gnm0.d(6, fetVar, true);
                    nsk nskVar = (nsk) qskVar;
                    if (nskVar.c) {
                        zcl zclVar = qmk.f28987a;
                        f5 = 276.0f;
                    } else {
                        zcl zclVar2 = qmk.f28987a;
                        f5 = 160.0f;
                    }
                    float f6 = f5 + f3;
                    int i8 = i7 & 29360128;
                    boolean z7 = i8 == 8388608;
                    Object objP6 = fetVar.P();
                    if (z7 || objP6 == cl5Var) {
                        objP6 = new ynk(function1, (byte) 7);
                        fetVar.o0(objP6);
                    }
                    Function1 function4 = (Function1) objP6;
                    boolean z8 = i8 == 8388608;
                    Object objP7 = fetVar.P();
                    if (z8 || objP7 == cl5Var) {
                        objP7 = new ynk(function1, (byte) 8);
                        fetVar.o0(objP7);
                    }
                    Function1 function5 = (Function1) objP7;
                    boolean z9 = i8 == 8388608;
                    Object objP8 = fetVar.P();
                    if (z9 || objP8 == cl5Var) {
                        objP8 = new ouh(function1, (byte) 29);
                        fetVar.o0(objP8);
                    }
                    uzb.n(null, nskVar, l7m0Var, f6, f2, f4, function4, function5, (Function0) objP8, fetVar, ((i7 << 3) & 1008) | (i7 & 57344) | ((i7 >> 3) & 458752));
                    fetVar.r(false);
                } else {
                    if (!(qskVar instanceof psk)) {
                        throw b1j.f(174205237, fetVar, false);
                    }
                    fetVar.e0(1109184090);
                    gnm0.b(l7m0Var, fetVar, (i7 >> 3) & 14);
                    psk pskVar = (psk) qskVar;
                    int i9 = i7 & 29360128;
                    boolean z10 = i9 == 8388608;
                    Object objP9 = fetVar.P();
                    if (z10 || objP9 == cl5Var) {
                        objP9 = new ouh(function1, (byte) 24);
                        fetVar.o0(objP9);
                    }
                    Function0 function6 = (Function0) objP9;
                    boolean z11 = i9 == 8388608;
                    Object objP10 = fetVar.P();
                    if (z11 || objP10 == cl5Var) {
                        objP10 = new ouh(function1, (byte) 23);
                        fetVar.o0(objP10);
                    }
                    mbc.l(null, pskVar, l7m0Var, l7m0Var2, f, f2, f4, function6, (Function0) objP10, fetVar, ((i7 << 3) & 524272) | (i7 & 3670016));
                    fetVar.r(false);
                }
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.lsk
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    qcc.e(qskVar, l7m0Var, l7m0Var2, f, f2, f3, f4, function1, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final boolean e0(vmu0 vmu0Var, vmu0 vmu0Var2, gp00 gp00Var) {
        vmu0Var.getClass();
        if (vmu0Var2 == null || ((vmu0Var2 instanceof umu0) && (vmu0Var instanceof tmu0))) {
            return true;
        }
        if ((vmu0Var instanceof umu0) && (vmu0Var2 instanceof tmu0)) {
            return false;
        }
        return (vmu0Var.c == vmu0Var2.c && vmu0Var.d == vmu0Var2.d && vmu0Var2.a(gp00Var) <= vmu0Var.a(gp00Var)) ? false : true;
    }

    public static final void f(mm40 mm40Var, brl brlVar, fet fetVar, int i) {
        fetVar.g0(-2031260245);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(brlVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (brlVar instanceof zql) {
                fetVar.e0(-1479514556);
                g((zql) brlVar, fetVar, i2 & 126);
                fetVar.r(false);
            } else {
                if (!brlVar.equals(arl.f1351a)) {
                    throw b1j.f(-2125938515, fetVar, false);
                }
                fetVar.e0(-1479375211);
                h(0, fetVar, null);
                fetVar.r(false);
            }
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new oql(mm40Var, brlVar, i, (byte) 2);
        }
    }

    public static final wue f0(qu6 qu6Var, m97 m97Var, String str, String str2, iv10 iv10Var, iwm0 iwm0Var, String str3, q4f q4fVar, p5t p5tVar, List list, List list2, oxk0 oxk0Var) {
        Object obj;
        Object next;
        Object next2;
        fho fhoVar;
        m97Var.getClass();
        long j = m97Var.h;
        str3.getClass();
        q4fVar.getClass();
        list.getClass();
        list2.getClass();
        Iterator it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ueo) next).f35538a != j);
        ueo ueoVar = (ueo) next;
        if (ueoVar != null && ueoVar.d == 2 && (oxk0Var == oxk0.DEFAULT_OPTIONBET || oxk0Var == oxk0.DEFAULT_OPTIONBET_EACHWAY)) {
            fhoVar = fho.c;
        } else {
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (((ueo) next2).f35538a != j);
            ueo ueoVar2 = (ueo) next2;
            if (ueoVar2 != null && ueoVar2.d == 3 && (oxk0Var == oxk0.DEFAULT_EACHWAY || oxk0Var == oxk0.DEFAULT_OPTIONBET_EACHWAY)) {
                fhoVar = fho.d;
            } else {
                for (Object obj2 : list2) {
                    if (((xco) obj2).f40655a == qu6Var.B) {
                        obj = obj2;
                        break;
                    }
                }
                xco xcoVar = (xco) obj;
                fhoVar = xcoVar != null ? xcoVar.e : false ? fho.b : fho.f9552a;
            }
        }
        return new wue(qu6Var, m97Var, str2, q4fVar, str, iv10Var, iwm0Var, p5tVar, fhoVar, str3);
    }

    public static final void g(zql zqlVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1833933390);
        int i3 = i & 6;
        byte b = 2;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(zqlVar) ? 32 : 16;
        }
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (zqlVar instanceof wql) {
            fetVar.e0(1473403912);
            i120.s(jm40Var, (wql) zqlVar, fetVar, i2 & 126);
            fetVar.r(false);
        } else if (zqlVar instanceof xql) {
            fetVar.e0(1473408109);
            i120.t(jm40Var, (xql) zqlVar, fetVar, i2 & 126);
            fetVar.r(false);
        } else {
            if (!(zqlVar instanceof yql)) {
                throw b1j.f(1473401718, fetVar, false);
            }
            fetVar.e0(1473412362);
            xbc.k(jm40Var, (yql) zqlVar, fetVar, i2 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pql(zqlVar, i, b);
        }
    }

    public static final long g0(long j) {
        uen uenVar = wen.b;
        boolean z = j > 0;
        if (z) {
            return wen.e(wen.k(j, ibc.w0(999999L, bfn.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        t9f.b();
        return 0L;
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(178445667);
        int i2 = i | 6;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(10.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 20.0f), 172.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), fqj0VarD0));
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 172.0f), 1.0f);
            zcl zclVar3 = qmk.i;
            dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarD), fqj0VarD0, fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 4);
        }
    }

    public static final void i(mm40 mm40Var, c0m c0mVar, Function0 function0, fet fetVar, int i) {
        int i2;
        t89 skk0Var;
        boolean z = c0mVar.d;
        fetVar.g0(46110280);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(c0mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float f = !z ? 0.5f : 1.0f;
            boolean z2 = fetVar.k(bmd.n) == k6z.b;
            xzl xzlVar = c0mVar.e;
            boolean z3 = xzlVar instanceof vzl;
            cl5 cl5Var = ukd.f35823a;
            if (z3) {
                fetVar.e0(1362318894);
                fetVar.r(false);
                skk0Var = new skk0(((vzl) xzlVar).f38304a);
            } else {
                if (!(xzlVar instanceof wzl)) {
                    throw b1j.f(1362316388, fetVar, false);
                }
                fetVar.e0(-717685409);
                wzl wzlVar = (wzl) xzlVar;
                long j = wzlVar.b;
                long j2 = wzlVar.f40026a;
                boolean zH = fetVar.h(z2) | fetVar.f(j2) | fetVar.f(j);
                Object objP = fetVar.P();
                if (zH || objP == cl5Var) {
                    objP = yk5.g(q3d.j(new y3d(j2), new y3d(j)), 0.0f, 0.0f, 14);
                    fetVar.o0(objP);
                }
                skk0Var = (t89) objP;
                fetVar.r(false);
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.f(mm40Var, 52.0f, 84.0f), 1.0f);
            ene eneVar = c0mVar.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarP = i120.P(mm40VarD, skk0Var, new ugg0(eneVar, eneVar, eneVar, eneVar), 4);
            boolean z4 = z && function0 != null;
            boolean z5 = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new unl(function0, (byte) 12);
                fetVar.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarP, null, null, z4, null, (Function0) objP2, 24), "DS_MENU_CELL");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z6 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z6) {
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
            mm40 mm40VarJ = s5x0.J(epv0.N(jm40Var, f), 12.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarJ);
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
            vcc.g(null, c0mVar.f3532a, fetVar, 0);
            vbc.v(null, c0mVar.b, fetVar, 0);
            fetVar.r(true);
            xbc.l(k7n0.H(epv0.N(ffb0.Q(jr8.f16991a.b(jm40Var, gqw0.c), 4.0f, -4.0f), f), 1.0f), c0mVar.c, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) c0mVar, (Object) function0, i, (byte) 6);
        }
    }

    public static final void j(final dcm dcmVar, fet fetVar, final int i) {
        final dcm dcmVar2;
        final byte b;
        int i2;
        Object obj;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1498655752);
        int i3 = (fetVar2.g(dcmVar) ? 4 : 2) | i;
        if (!fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            dcmVar2 = dcmVar;
            b = 1;
            fetVar2.X();
        } else if (dcmVar instanceof bcm) {
            fetVar2.e0(-268207618);
            zfn zfnVar = m8m0.f21378a;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU();
            long jM127getWhite300d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m127getWhite300d7_KjU();
            Locale locale = ((Configuration) fetVar2.k(dy2.f6873a)).getLocales().get(0);
            locale.getClass();
            boolean zG = fetVar2.g(locale);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = Calendar.getInstance(locale);
                fetVar2.o0(objP);
            }
            Calendar calendar = (Calendar) objP;
            boolean zG2 = fetVar2.g(locale);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = Long.valueOf(calendar.getTimeInMillis());
                fetVar2.o0(objP2);
            }
            long jLongValue = ((Number) objP2).longValue();
            bcm bcmVar = (bcm) dcmVar;
            SimpleDate simpleDate = bcmVar.b;
            SimpleDate simpleDate2 = bcmVar.f2360a;
            boolean zG3 = fetVar2.g(simpleDate2) | fetVar2.g(simpleDate);
            Object objP3 = fetVar2.P();
            if (zG3 || objP3 == cl5Var) {
                calendar.getClass();
                wdx.J(simpleDate2, calendar);
                long timeInMillis = calendar.getTimeInMillis();
                wdx.J(simpleDate, calendar);
                objP3 = Boolean.valueOf(timeInMillis <= calendar.getTimeInMillis());
                fetVar2.o0(objP3);
            }
            if (!((Boolean) objP3).booleanValue()) {
                final byte b2 = 0;
                fetVar2.r(false);
                yfe0 yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2(dcmVar, i, b2) { // from class: a.acm

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ byte f634a;
                        public final /* synthetic */ dcm b;

                        {
                            this.f634a = b2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            byte b3 = this.f634a;
                            dcm dcmVar3 = this.b;
                            fet fetVar3 = (fet) obj2;
                            ((Integer) obj3).getClass();
                            switch (b3) {
                                case 0:
                                    qcc.j(dcmVar3, fetVar3, x8x.L(1));
                                    break;
                                default:
                                    qcc.j(dcmVar3, fetVar3, x8x.L(1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    return;
                }
                return;
            }
            boolean zG4 = fetVar2.g(simpleDate2) | fetVar2.g(simpleDate);
            Object objP4 = fetVar2.P();
            if (zG4 || objP4 == cl5Var) {
                calendar.getClass();
                wdx.J(simpleDate2, calendar);
                long timeInMillis2 = calendar.getTimeInMillis();
                wdx.J(simpleDate, calendar);
                long timeInMillis3 = calendar.getTimeInMillis();
                if (jLongValue <= timeInMillis2) {
                    i2 = 0;
                } else if (jLongValue >= timeInMillis3) {
                    i2 = 100;
                } else {
                    i2 = (int) (((jLongValue - timeInMillis2) / (timeInMillis3 - timeInMillis2)) * 100.0d);
                }
                objP4 = Integer.valueOf(i2);
                fetVar2.o0(objP4);
            }
            int iIntValue = ((Number) objP4).intValue();
            boolean zG5 = fetVar2.g(simpleDate2) | fetVar2.g(simpleDate);
            Object objP5 = fetVar2.P();
            if (zG5 || objP5 == cl5Var) {
                calendar.getClass();
                String str = bcmVar.c;
                objP5 = new Pair(vdx.I(simpleDate2, str, locale, calendar), vdx.I(simpleDate, str, locale, calendar));
                fetVar2.o0(objP5);
            }
            Pair pair = (Pair) objP5;
            String str2 = (String) pair.f46059a;
            String str3 = (String) pair.b;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 12.0f, 0.0f, 0.0f, 13);
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
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar7);
            jpm0.n(fetVar2);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar8);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                shdVar3 = shdVar7;
                shdVar2 = shdVar8;
                unm unmVar = new unm(tnm.f34243a, jM123getWhite0d7_KjU, jM123getWhite0d7_KjU, jM127getWhite300d7_KjU, 6.0f, 360.0f, iIntValue, 0, false, 640);
                fetVar2.o0(unmVar);
                obj = unmVar;
                shdVar4 = shdVar5;
                shdVar = shdVar6;
            } else {
                obj = objP6;
                shdVar = shdVar6;
                shdVar2 = shdVar8;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
            }
            snm.b(mm40VarD2, (unm) obj, fetVar2, 54);
            mm40 mm40VarD3 = o7k0.d(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD3);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM2, shdVar);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar2);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, x7zVar);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar4);
            jpm0.o(fetVar2, bh90VarM3, shdVar);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar2);
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            shd shdVar9 = shdVar3;
            shd shdVar10 = shdVar2;
            shd shdVar11 = shdVar4;
            shd shdVar12 = shdVar;
            b = 1;
            v8q0.a(str2, null, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
            fetVar.r(true);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            tj30 tj30VarC2 = zq8.c(gqw0.f, false);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, x7zVar2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar11);
            jpm0.o(fetVar, bh90VarM4, shdVar12);
            vqd.u(iHashCode4, fetVar, shdVar9, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar10);
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str3, null, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            fetVar2.r(true);
            fetVar2.r(false);
            dcmVar2 = dcmVar;
        } else {
            b = 1;
            dcmVar2 = dcmVar;
            if (!dcmVar2.equals(ccm.f4118a)) {
                throw b1j.f(-1394127195, fetVar2, false);
            }
            fetVar2.e0(-264851992);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU2 = fetVar2.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new Function2(dcmVar2, i, b) { // from class: a.acm

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f634a;
                public final /* synthetic */ dcm b;

                {
                    this.f634a = b;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    byte b3 = this.f634a;
                    dcm dcmVar3 = this.b;
                    fet fetVar3 = (fet) obj2;
                    ((Integer) obj3).getClass();
                    switch (b3) {
                        case 0:
                            qcc.j(dcmVar3, fetVar3, x8x.L(1));
                            break;
                        default:
                            qcc.j(dcmVar3, fetVar3, x8x.L(1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void k(mm40 mm40Var, prm prmVar, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        int i4;
        prmVar.getClass();
        lrm lrmVar = prmVar.b;
        function1.getClass();
        fetVar.g0(-1394366805);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
            i3 |= fetVar.g(prmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i5 != 0 ? jm40Var : mm40Var2;
            boolean z = fetVar.k(bmd.n) == k6z.b;
            Object obj = (omv) fetVar.k(bmd.l);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            boolean zD = fetVar.d(100.0f) | fetVar.d(0.0f) | fetVar.i(obj);
            Object objP2 = fetVar.P();
            if (zD || objP2 == obj2) {
                objP2 = new dpl(obj, (Object) pz40Var, (byte) 19);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z2 = prmVar.e && !(lrmVar instanceof krm);
            boolean zG = fetVar.g(null);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj2) {
                pz40 pz40Var2 = s6t0.f31722a;
                objP3 = androidx.compose.runtime.e.e(new drm(s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getPrimary(), s6t0.b().f33626a.getPrimary(), s6t0.b().f33626a.getPrimary(), s6t0.b().f33626a.getBackground()));
                fetVar.o0(objP3);
            }
            pz40 pz40Var3 = (pz40) objP3;
            float f = z2 ? 1.0f : 0.5f;
            boolean zG2 = fetVar.g(function2) | ((i3 & 896) == 256);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == obj2) {
                i4 = 0;
                objP4 = new erm(function2, function1, (byte) 0);
                fetVar.o0(objP4);
            } else {
                i4 = 0;
            }
            Function1 function3 = (Function1) objP4;
            mm40 mm40VarN = epv0.N(mm40Var4, f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, i4);
            mm40 mm40Var5 = mm40Var4;
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
            C(prmVar, z2, function3, fetVar, (i3 >> 3) & 14);
            jwb.e(lrmVar, o7k0.d(jm40Var, 1.0f), ro4.m0(Response.OK, 0, ihn.d, 2), null, u1c.M(-1851005891, new o3m(z, (Object) pz40Var3, (byte) 1), fetVar), fetVar, 24624, 8);
            fetVar.r(true);
            mm40Var3 = mm40Var5;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var3, (Object) prmVar, (Object) function1, i, i2, (byte) 18);
        }
    }

    public static final void l(mm40 mm40Var, kxm kxmVar, kxm kxmVar2, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-1879302649);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(kxmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(kxmVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(str) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            xcz xczVarA = ddz.a(q3d.i(kxmVar.d), 0, fetVar2, 0, 2);
            xcz xczVarA2 = ddz.a(q3d.i(kxmVar2.d), 0, fetVar2, 0, 2);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP);
            }
            vne vneVar = (vne) objP;
            boolean zI = fetVar2.i(vneVar) | fetVar2.g(xczVarA) | fetVar2.g(xczVarA2);
            Object objP2 = fetVar2.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new gxm(vneVar, xczVarA, xczVarA2, (byte) 2);
                fetVar2.o0(objP2);
            }
            bch0 bch0VarP = piz.P((Function1) objP2, fetVar2);
            int i3 = i2;
            x(null, kxmVar, true, xczVarA, bch0VarP, fetVar2, (i2 & 112) | 384);
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40.b, 1.0f), 4.0f);
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
            mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
            fetVar2 = fetVar;
            fetVar2.r(true);
            x(null, kxmVar2, false, xczVarA2, bch0VarP, fetVar2, ((i3 >> 3) & 112) | 384);
            if (str.length() > 0) {
                fetVar2.e0(671926674);
                sj3.p((i3 >> 6) & 112, 13, fetVar, null, str, null, null);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(671987217);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 19, i, (Object) mm40Var, (Object) kxmVar, (Object) kxmVar2, (Object) str);
        }
    }

    public static final void m(mm40 mm40Var, f3n f3nVar, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        float f = xfn.a(fetVar).d;
        if ((i & 8) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if (f3nVar instanceof y2n) {
            fetVar.e0(843868462);
            y2n y2nVar = (y2n) f3nVar;
            if (false & true) {
                mm40Var = jm40.b;
            }
            mm40 mm40Var2 = mm40Var;
            if (y2nVar instanceof w2n) {
                fetVar.e0(-1721322033);
                fetVar2 = fetVar;
                gfx.c(mm40Var2, (w2n) y2nVar, f, function2, fetVar2, 0 & 8190);
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                if (!(y2nVar instanceof x2n)) {
                    throw b1j.f(221565982, fetVar2, false);
                }
                fetVar2.e0(-1721061633);
                gfx.p(mm40Var2, f, fetVar2, 0);
                fetVar2.r(false);
            }
            fetVar2.r(false);
            return;
        }
        if (f3nVar instanceof b3n) {
            fetVar.e0(844152174);
            ntr.T(mm40Var, (b3n) f3nVar, f, function2, fetVar, 0, 0);
            fetVar.r(false);
        } else {
            if (!(f3nVar instanceof e3n)) {
                throw b1j.f(858504048, fetVar, false);
            }
            fetVar.e0(844430802);
            e3n e3nVar = (e3n) f3nVar;
            if (e3nVar instanceof c3n) {
                fetVar.e0(1956149048);
                mrv.z(mm40Var, (c3n) e3nVar, f, function2, fetVar, 0);
                fetVar.r(false);
            } else {
                if (!(e3nVar instanceof d3n)) {
                    throw b1j.f(-75447794, fetVar, false);
                }
                fetVar.e0(1956405511);
                mrv.X(0, fetVar, s5x0.L(mm40Var, f, 0.0f, 2));
                fetVar.r(false);
            }
            fetVar.r(false);
        }
    }

    public static final void n(vqb0 vqb0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-370332278);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(vqb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.L(mm40VarD, 0.0f, 4.0f, 1), 32.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = x5o.f40327a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            int i3 = i2 & 14;
            boolean zI = (i3 == 4) | fetVar.i(clzVar);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new qzn(vqb0Var, clzVar, (byte) 10);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean zI2 = fetVar.i(clzVar) | (i3 == 4);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new fun(vqb0Var, clzVar, (byte) 8);
                fetVar.o0(objP3);
            }
            idm0.j(mm40VarE, vqb0Var, xdrVar, null, function1, (Function2) objP3, fetVar, ((i2 << 3) & 112) | 384, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(vqb0Var, i, (byte) 16);
        }
    }

    public static final void o(mm40 mm40Var, nfo nfoVar, String str, v3n v3nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-128424734);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.e(nfoVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(v3nVar) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40Var, 32.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarG);
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
            nfo nfoVar2 = nfo.f23446a;
            jm40 jm40Var = jm40.b;
            if (nfoVar == nfoVar2) {
                fetVar.e0(-968691664);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                qxw.o(fetVar, new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                v3c.t(s5x0.N(jm40Var, v3nVar.a().g(), 0.0f, 0.0f, 0.0f, 14), false, v3nVar, str, fetVar, ((i2 >> 3) & 896) | 48 | ((i2 << 3) & 7168));
                fetVar.r(false);
            } else {
                fetVar.e0(-968285006);
                v3c.t(s5x0.N(jm40Var, 0.0f, 0.0f, v3nVar.a().g(), 0.0f, 11), false, v3nVar, str, fetVar, ((i2 >> 3) & 896) | 48 | ((i2 << 3) & 7168));
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                qxw.o(fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 0, i, (Object) mm40Var, (Object) nfoVar, (Object) str, (Object) v3nVar);
        }
    }

    public static final void p(mm40 mm40Var, xcz xczVar, fet fetVar, int i) {
        int i2;
        xczVar.getClass();
        fetVar.g0(-297911514);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xczVar) ? 32 : 16;
        }
        byte b = 3;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 >> 3;
            boolean z = (((i3 & 14) ^ 6) > 4 && fetVar.g(xczVar)) || (i3 & 6) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = jgk0.b(new eb(xczVar, (byte) 27));
                fetVar.o0(objP);
            }
            if (((Boolean) ((l7m0) objP).getValue()).booleanValue()) {
                fetVar.e0(-1679284426);
                boolean z2 = fetVar.k(bmd.n) == k6z.b;
                mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                zq8.a(0, fetVar, i120.P(o7k0.s(mm40VarC, 32.0f), yk5.g(q3d.j(new y3d(((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU()), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent())), z2 ? Float.POSITIVE_INFINITY : 0.0f, z2 ? 0.0f : Float.POSITIVE_INFINITY, 8), null, 6));
                fetVar.r(false);
            } else {
                fetVar.e0(-1678632868);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fta(mm40Var, xczVar, i, b);
        }
    }

    public static final void q(mm40 mm40Var, xcz xczVar, fet fetVar, int i) {
        int i2;
        xczVar.getClass();
        fetVar.g0(31668351);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 >> 3;
            boolean z = (((i3 & 14) ^ 6) > 4 && fetVar.g(xczVar)) || (i3 & 6) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = jgk0.b(new eb(xczVar, (byte) 26));
                fetVar.o0(objP);
            }
            if (((Boolean) ((l7m0) objP).getValue()).booleanValue()) {
                fetVar.e0(-1460757954);
                boolean z2 = fetVar.k(bmd.n) == k6z.b;
                mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                zq8.a(0, fetVar, i120.P(o7k0.s(mm40VarC, 32.0f), yk5.g(q3d.j(new y3d(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent()), new y3d(((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU())), z2 ? Float.POSITIVE_INFINITY : 0.0f, z2 ? 0.0f : Float.POSITIVE_INFINITY, 8), null, 6));
                fetVar.r(false);
            } else {
                fetVar.e0(-1460107357);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fta(mm40Var, xczVar, i, b);
        }
    }

    public static final void r(mm40 mm40Var, igs igsVar, fet fetVar, int i) {
        igs igsVar2;
        mm40 mm40Var2;
        int i2;
        long jM113getRed0d7_KjU;
        fet fetVar2 = fetVar;
        b6q b6qVar = igsVar.c;
        fetVar2.g0(1781190206);
        int i3 = i | 6 | (fetVar2.g(igsVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = b6qVar instanceof z5q;
            if (z) {
                i2 = R.drawable.ic_glyph_arrow_up;
            } else {
                if (!(b6qVar instanceof a6q)) {
                    t9f.b();
                    return;
                }
                i2 = R.drawable.ic_glyph_arrow_down;
            }
            if (z) {
                pz40 pz40Var = s6t0.f31722a;
                jM113getRed0d7_KjU = StaticColors.INSTANCE.m98getGreen0d7_KjU();
            } else if (!(b6qVar instanceof a6q)) {
                t9f.b();
                return;
            } else {
                pz40 pz40Var2 = s6t0.f31722a;
                jM113getRed0d7_KjU = StaticColors.INSTANCE.m113getRed0d7_KjU();
            }
            long j = jM113getRed0d7_KjU;
            zcl zclVar = qmk.f28987a;
            byte b = 14;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4(b)), gqw0.m, fetVar2, 0);
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
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4(b)), gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
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
            int i4 = i2;
            v8q0.a(igsVar.f14748a, null, 0L, new n05(qmk.p, qmk.r, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.t(g1t0.l(), fetVar2), fetVar, 0, 24960, 110582);
            thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            dww.b(jpm0.t(i4, 6, fetVar), null, o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 2.0f, 0.0f, 11), 14.0f), j, fetVar, 48, 0);
            v8q0.a(b6qVar.a(), null, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.m(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            igsVar2 = igsVar;
            dqm0.g(0, fetVar2, null, igsVar2.b);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            igsVar2 = igsVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gup(mm40Var2, igsVar2, i, (byte) 4);
        }
    }

    public static final void s(int i, ugd ugdVar, ugd ugdVar2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(821716228);
        byte b = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            WeakHashMap weakHashMap = djv0.w;
            q33 q33Var = zcm0.i(fetVar).f;
            int i3 = q33Var.e().b;
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new o9s((byte) 13);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) e9x.Q(objArr, (Function0) objP, fetVar, 48);
            if (cgk0Var.l() == 0) {
                cgk0Var.m(i3);
            }
            boolean zG = fetVar.g(cgk0Var);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new qf6(cgk0Var, b);
                fetVar.o0(objP2);
            }
            tj30 tj30Var = (tj30) objP2;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ugdVar.F(new mh00("TOOLBAR_ID"), fetVar, 48);
            ugdVar2.F(new mh00("CONTENT_ID"), fetVar, 48);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p71(mm40Var, ugdVar, ugdVar2, i, (byte) 4);
        }
    }

    public static final void t(mm40 mm40Var, egt egtVar, Function1 function1, fet fetVar, int i) {
        long secondary;
        fet fetVar2 = fetVar;
        egtVar.getClass();
        function1.getClass();
        fetVar2.g0(-627898938);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(egtVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
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
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
            String str = egtVar.f7777a;
            if (egtVar.c) {
                fetVar2.e0(-1290660169);
                secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getWarning();
            } else {
                fetVar2.e0(-1290659175);
                secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
            }
            fetVar2.r(false);
            v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fyl fylVar = egtVar.b;
            vxl vxlVar = vxl.b;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new baq(function1, (byte) 28);
                fetVar2.o0(objP);
            }
            ebc.r(null, fylVar, vxlVar, (Function1) objP, null, fetVar2, 384, 41);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mm40Var, egtVar, function1, i, (byte) 7);
        }
    }

    public static final void u(i9q i9qVar, boolean z, fet fetVar, int i) {
        fetVar.g0(1219582487);
        int i2 = (fetVar.g(i9qVar) ? 32 : 16) | i | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = z03.a();
                fetVar.o0(objP);
            }
            w03 w03Var = (w03) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = z03.a();
                fetVar.o0(objP2);
            }
            w03 w03Var2 = (w03) objP2;
            mm40 mm40VarC = o7k0.c(jm40.b, 1.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            nnw0.g(mm40VarC.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), null, false, u1c.M(509587329, new odv((Object) w03Var, (Object) w03Var2, z, (Object) i9qVar, (byte) 0), fetVar), fetVar, 3072, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jv1(i9qVar, z, i, (byte) 25);
        }
    }

    public static final void v(k3t0 k3t0Var, llm0 llm0Var, fet fetVar, int i) {
        k3t0Var.getClass();
        fetVar.g0(1282084519);
        int i2 = (fetVar.g(k3t0Var) ? 4 : 2) | i | (fetVar.e(llm0Var.ordinal()) ? 32 : 16);
        byte b = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            byte b2 = 14;
            int i3 = i2 & 14;
            i3t0 i3t0Var = (i3t0) k3t0Var;
            lqw lqwVar = (lqw) i3t0Var.y(fetVar).getValue();
            zdm0 zdm0VarC = lqwVar.c();
            j9m0 j9m0VarB = lqwVar.b();
            f9m0 f9m0Var = new f9m0(R.string.statistic, fmm.f9790a, 0L, false, false, null, null, false, 252);
            boolean z = true;
            boolean zA = lqwVar.a();
            if (i3 != 4) {
                z = false;
            }
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dbh(i3t0Var, (byte) 8);
                fetVar.o0(objP);
            }
            ffb0.D(jm40.b, f9m0Var, zdm0VarC, j9m0VarB, zA, (Function0) objP, null, null, u1c.M(-598271819, new eyn(llm0Var, lqwVar, i3t0Var, b2), fetVar), fetVar, 100663302, 192);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(k3t0Var, llm0Var, i, b);
        }
    }

    public static final void w(mm40 mm40Var, g8k0 g8k0Var, ow3 ow3Var, long j, fet fetVar, int i) {
        mm40 mm40Var2;
        g8k0 g8k0Var2;
        long j2;
        fetVar.g0(1300628418);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(g8k0Var) : fetVar.i(g8k0Var) ? 32 : 16;
        }
        int i3 = i2 | (fetVar.g(ow3Var) ? 256 : 128) | (fetVar.f(j) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            lw3 lw3Var = uc9.b;
            boolean zEquals = ow3Var.equals(lw3Var);
            if (!zEquals) {
                lw3Var = uc9.f35418a;
            }
            mm40Var2 = mm40Var;
            g8k0Var2 = g8k0Var;
            j2 = j;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1419511938, new ikl(zEquals ? 6 : 5, j2, lw3Var, mm40Var2, g8k0Var2), fetVar), fetVar, 56);
        } else {
            mm40Var2 = mm40Var;
            g8k0Var2 = g8k0Var;
            j2 = j;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fqh(i, j2, ow3Var, mm40Var2, g8k0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final void x(mm40 mm40Var, kxm kxmVar, boolean z, xcz xczVar, bch0 bch0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2;
        ?? r0;
        boolean z2;
        shd shdVar;
        Object obj;
        shd shdVar2;
        float f;
        Function0 function0;
        shd shdVar3;
        shd shdVar4;
        ?? r2;
        fet fetVar3 = fetVar;
        String str = kxmVar.c;
        a4x a4xVar = kxmVar.d;
        c280 c280Var = kxmVar.b;
        fetVar3.g0(-490443528);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar3.g(kxmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar3.g(xczVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? fetVar3.g(bch0Var) : fetVar3.i(bch0Var) ? 16384 : 8192;
        }
        if (fetVar3.U(i2 & 1, (i2 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 32.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z3 = fetVar3.S;
            Function0 function1 = e7z.u1;
            if (z3) {
                fetVar3.l(function1);
            } else {
                fetVar3.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar3, thg0VarA, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar7);
            jpm0.n(fetVar3);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar8);
            boolean zG = fetVar3.g(c280Var);
            Object objP = fetVar3.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                objP = new u6n(d4d.SECONDARY60, w6n.j, c280Var);
                fetVar3.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG2 = fetVar3.g(u6nVar);
            Object objP2 = fetVar3.P();
            if (zG2 || objP2 == obj2) {
                r0 = 1;
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar3.o0(objP2);
            } else {
                r0 = 1;
            }
            kkb.p(r0, fetVar3, null, (Function0) objP2);
            y(0, fetVar3, new x7z(1.0f, r0), kxmVar.f19062a);
            if (str.length() > 0) {
                fetVar3.e0(-1964386069);
                f = 4.0f;
                z2 = false;
                shdVar4 = shdVar6;
                shdVar3 = shdVar8;
                shdVar2 = shdVar7;
                obj = obj2;
                function0 = function1;
                r2 = 1;
                shdVar = shdVar5;
                v8q0.a(str, s5x0.L(jm40Var, 4.0f, 0.0f, 2), ((ThemeColors) fetVar3.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 0, 131064);
                fetVar3 = fetVar;
                fetVar3.r(false);
            } else {
                z2 = false;
                shdVar = shdVar5;
                obj = obj2;
                shdVar2 = shdVar7;
                f = 4.0f;
                function0 = function1;
                shdVar3 = shdVar8;
                shdVar4 = shdVar6;
                r2 = 1;
                fetVar3.e0(-1964127250);
                fetVar3.r(false);
            }
            jcb.H(s5x0.N(ffb0.R(jm40Var, 0.0f, z ? 6.0f : -6.0f, r2), 0.0f, z ? 0.0f : f, 0.0f, z ? f : 0.0f, 5), 1.0f, ((ThemeColors) fetVar3.k(zaq0.b)).getSeparator60(), fetVar3, 0, 0);
            fet fetVar4 = fetVar3;
            ma80 ma80Var = ma80.b;
            sjj sjjVarA = wzk0.a(fetVar4);
            boolean zG3 = fetVar4.g(sjjVarA);
            Object objP3 = fetVar4.P();
            if (zG3 || objP3 == obj) {
                objP3 = new iuj(sjjVarA);
                fetVar4.o0(objP3);
            }
            mm40 mm40VarA = fbh0.a(jm40Var, bch0Var, ma80Var, false, (iuj) objP3, 44);
            zx7 zx7Var = gqw0.d;
            tj30 tj30VarC = zq8.c(zx7Var, z2);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarA);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(function0);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, tj30VarC, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar4);
            vqd.u(iHashCode2, fetVar4, shdVar2, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar3);
            z(null, a4xVar, xczVar, fetVar4, (i2 >> 3) & 896);
            int size = a4xVar.size();
            jr8 jr8Var = jr8.f16991a;
            if (size > 3) {
                fetVar4.e0(1375778987);
                q(jr8Var.b(jm40Var, zx7Var), xczVar, fetVar4, (i2 >> 6) & 112);
                fetVar4.r(z2);
            } else {
                fetVar4.e0(1375941396);
                fetVar4.r(z2);
            }
            if (a4xVar.size() > 3) {
                fetVar4.e0(1376016943);
                p(jr8Var.b(jm40Var, gqw0.f), xczVar, fetVar4, (i2 >> 6) & 112);
                fetVar4.r(z2);
            } else {
                fetVar4.e0(1376175508);
                fetVar4.r(z2);
            }
            fetVar4.r(r2);
            fetVar4.r(r2);
            mm40Var2 = jm40Var;
            fetVar2 = fetVar4;
        } else {
            fet fetVar5 = fetVar3;
            fetVar5.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) mm40Var2, (Object) kxmVar, z, (Object) xczVar, (Object) bch0Var, i, (byte) 12);
        }
    }

    public static final void y(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(1280151669);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            kc5.N(str2, s5x0.N(mm40Var, 4.0f, 0.0f, 8.0f, 0.0f, 10), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, null, 0L, qmk.q, g1t0.m().f42262a.b, null, g1t0.m().f42262a.f, 0L, null, 2, false, 2, 0, false, null, null, 0.0f, fetVar, (i2 >> 3) & 14, 1597440, 0, 4111160);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var, str2, i, (byte) 17);
        }
    }

    public static final void z(mm40 mm40Var, a4x a4xVar, xcz xczVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1088919023);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarU = o7k0.u(jm40Var, 0.0f, 128.0f, 1);
            yx7 yx7Var = gqw0.k;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new oea(a4xVar, (byte) 9);
                fetVar.o0(objP);
            }
            int i3 = ((i2 >> 3) & 112) | 12779520;
            mm40Var2 = jm40Var;
            b8k0.f(mm40VarU, xczVar, null, false, null, yx7Var, null, false, null, (Function1) objP, fetVar, i3, 348);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t6m(mm40Var2, a4xVar, xczVar, i, (byte) 3);
        }
    }
}
