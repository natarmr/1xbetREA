package a;

import android.app.Application;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Typeface;
import android.javax.sip.message.Response;
import androidx.fragment.app.Fragment;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class oja0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f25350a = new ugd(1067984415, false, new zgd(16));
    public static final ugd b = new ugd(242011914, false, new fhd(1));
    public static final ugd c = new ugd(-1778062482, false, new jhd(23));
    public static final ugd d = new ugd(940377717, false, new lhd(25));
    public static final String[] e = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] f = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] g = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static final void A(mm40 mm40Var, final String str, final String str2, final boolean z, final float f2, fet fetVar, final int i) {
        final mm40 mm40Var2;
        long j;
        fet fetVar2 = fetVar;
        u6m u6mVar = u6m.f35142a;
        fetVar2.g0(1131614165);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.e(5) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.d(f2) ? 131072 : 65536) | (fetVar2.d(32.0f) ? 1048576 : 524288);
        if (fetVar2.U(i2 & 1, (599187 & i2) != 599186)) {
            String str3 = z ? "BAN" : "PICK";
            if (z) {
                fetVar2.e0(854497570);
                ((ijg) fetVar2.k(jjg.f16616a)).getClass();
                j = ijg.e0;
            } else {
                fetVar2.e0(854498915);
                ((ijg) fetVar2.k(jjg.f16616a)).getClass();
                j = ijg.s0;
            }
            fetVar2.r(false);
            long j2 = j;
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(n0qVar, 4.0f, 4.0f, 6.0f, 4.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
            zx7 zx7Var = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            String str4 = str3;
            int i3 = i2 >> 3;
            B(f2, (i2 & 1008) | 3072 | (i3 & 57344) | (i3 & 458752), fetVar2, jr8Var.b(jm40Var, zx7Var), str, z);
            f7k.i((i2 >> 6) & 112, fetVar2, jr8Var.b(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), gqw0.c), str2);
            mm40 mm40VarB = jr8Var.b(s5x0.N(o7k0.s(jm40Var, 20.0f), 0.0f, 0.0f, 0.0f, 2.0f, 7), gqw0.i);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
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
            afn0.v(fetVar2).getClass();
            mm40Var2 = jm40Var;
            v8q0.a(str4, null, j2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.c(), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(mm40Var2, str, str2, z, f2, i) { // from class: a.r6m

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ mm40 f29940a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ float e;

                {
                    u6m u6mVar2 = u6m.f35142a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    u6m u6mVar2 = u6m.f35142a;
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(24577);
                    oja0.A(this.f29940a, this.b, this.c, this.d, this.e, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b4  */
    public static final void B(float f2, int i, fet fetVar, mm40 mm40Var, String str, boolean z) {
        int i2;
        Object obj;
        Object obj2;
        u6m u6mVar = u6m.f35142a;
        fetVar.g0(-851624347);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(5) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.d(32.0f) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            boolean z2 = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z2) {
                if (z) {
                    float[] fArrA = g4d.a();
                    g4d.b(fArrA);
                    h4d h4dVar = new h4d(new ColorMatrixColorFilter(fArrA));
                    h4dVar.b = fArrA;
                    obj = h4dVar;
                } else {
                    obj = null;
                }
                fetVar.o0(obj);
                obj2 = obj;
            } else {
                obj2 = objP;
                if (objP == ukd.f35823a) {
                    if (z) {
                        float[] fArrA2 = g4d.a();
                        g4d.b(fArrA2);
                        h4d h4dVar2 = new h4d(new ColorMatrixColorFilter(fArrA2));
                        h4dVar2.b = fArrA2;
                        obj = h4dVar2;
                    } else {
                        obj = null;
                    }
                    fetVar.o0(obj);
                    obj2 = obj;
                }
            }
            a4d a4dVar = (a4d) obj2;
            mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var, 32.0f), f2);
            zcl zclVar = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarS);
            androidx.compose.runtime.d dVar = m8m0.f21378a;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((StaticColors) fetVar.k(dVar)).m125getWhite100d7_KjU(), jd8.n);
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
            rq8.c(o7k0.c, o7k0.n(jm40.b, 20.0f), str, R.drawable.ic_glyph_mobile_legends, new y3d(((StaticColors) fetVar.k(dVar)).m126getWhite200d7_KjU()), null, a4dVar, null, gqw0.A, null, fetVar, ((i2 << 3) & 896) | 100859910, 640);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s6m((byte) 0, f2, i, mm40Var, str, z);
        }
    }

    public static final void C(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fet fetVar2 = fetVar;
        fetVar2.g0(965350381);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
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
            dww.c(a8k0.F(R.drawable.ic_glyph_info_circle_filled, 0, fetVar2), null, s5x0.M(jm40Var, 12.0f, 12.0f, 8.0f, 12.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
            mm40 mm40VarM = s5x0.M(jm40Var, 4.0f, 10.0f, 16.0f, 10.0f);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarM, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.h(), fetVar, (i2 >> 3) & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            str2 = str;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str2, i, (byte) 15);
        }
    }

    public static final void D(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1263467879);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (((wtz) l7m0Var.getValue()).h) {
            fetVar.e0(-1121564586);
            h(((wtz) l7m0Var.getValue()).i, function1, fetVar, i2 & 112);
            fetVar.r(false);
        } else {
            fetVar.e0(-1121634212);
            r(l7m0Var, function1, fetVar, i2 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i, (byte) 19);
        }
    }

    public static final void E(int i, fet fetVar) {
        fetVar.g0(-1529973246);
        byte b2 = 0;
        if (fetVar.U(i & 1, i != 0)) {
            mm40 mm40VarH = k7n0.H(o7k0.c, 2.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new jtz(b2);
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
            yfe0VarU.d = new hvy(i, (byte) 27);
        }
    }

    public static final void F(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(2015034009);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarE = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n).e(o7k0.c);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE2 = o7k0.e(s5x0.N(mm40VarD, 16.0f, 0.0f, 16.0f, 0.0f, 10), 168.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE2), vbc.d0(null, fetVar, 0, 1)));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(s5x0.N(o7k0.d(jm40Var, 1.0f), 16.0f, 8.0f, 16.0f, 0.0f, 8), 168.0f)), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(s5x0.N(o7k0.d(jm40Var, 1.0f), 16.0f, 8.0f, 16.0f, 0.0f, 8), 168.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i, (byte) 23);
        }
    }

    public static final void G(final ftz ftzVar, final Function1 function1, fet fetVar, int i) {
        yjj0 yjj0VarA;
        ljc ljcVar = jd8.n;
        fetVar.g0(-197642176);
        int i2 = (fetVar.g(ftzVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        final byte b2 = 1;
        final byte b3 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            py pyVar = ftzVar.e;
            wui0 wui0Var = ftzVar.d;
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (pyVar == null) {
                fetVar.e0(442267327);
                mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar).d, 0.0f, 2);
                rqm rqmVar = new rqm((vui0) new rui0(ftzVar.c, null, ftzVar.b, null, 58), (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 446);
                int i3 = ((i2 & 112) == 32 ? (byte) 1 : (byte) 0) | ((i2 & 14) != 4 ? (byte) 0 : (byte) 1);
                Object objP = fetVar.P();
                if (i3 != 0 || objP == cl5Var) {
                    objP = new Function0() { // from class: a.ntz
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b3;
                            ftz ftzVar2 = ftzVar;
                            Function1 function2 = function1;
                            switch (b4) {
                                case 0:
                                    function2.invoke(new osz(ftzVar2.f10139a));
                                    break;
                                default:
                                    function2.invoke(new osz(ftzVar2.f10139a));
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
                fetVar.e0(442879670);
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
                rqm rqmVar2 = new rqm((vui0) new rui0(ftzVar.c, null, ftzVar.b, null, 58), (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 446);
                boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objP2 = fetVar.P();
                if (z || objP2 == cl5Var) {
                    objP2 = new Function0() { // from class: a.ntz
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b2;
                            ftz ftzVar2 = ftzVar;
                            Function1 function2 = function1;
                            switch (b4) {
                                case 0:
                                    function2.invoke(new osz(ftzVar2.f10139a));
                                    break;
                                default:
                                    function2.invoke(new osz(ftzVar2.f10139a));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP2);
                }
                obc.q(null, rqmVar2, false, null, (Function0) objP2, null, null, null, fetVar, 384, 233);
                zfn zfnVar = zaq0.b;
                long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
                int iOrdinal = pyVar.b.ordinal();
                if (iOrdinal == 0) {
                    zcl zclVar = qmk.f28987a;
                    yjj0VarA = vgg0.a(16.0f);
                } else if (iOrdinal == 1) {
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
                C(0, fetVar, s5x0.N(mm40VarQ, 16.0f, 0.0f, 16.0f, 12.0f, 2), pyVar.f27781a);
                if (pyVar.b != wui0.d) {
                    fetVar.e0(2093336628);
                    jcb.v(s5x0.N(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar), 16.0f, 0.0f, 36.0f, 0.0f, 10), 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator(), fetVar, 0, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(2093694120);
                    fetVar.r(false);
                }
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(ftzVar, function1, i, (byte) 14);
        }
    }

    public static final void H(mm40 mm40Var, i4 i4Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1425503650);
        int i2 = i | 6 | (fetVar.g(i4Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            n0q n0qVar = o7k0.c;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ktz(i4Var, function1, b2);
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
            yfe0VarU.d = new ltz(mm40Var2, i4Var, function1, i, (byte) 0);
        }
    }

    public static final void I(String str, Function0 function0, Function0 function1, fet fetVar, int i) {
        fetVar.g0(851011183);
        jm40 jm40Var = jm40.b;
        int i2 = i | (fetVar.g(jm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            androidx.compose.runtime.d dVar = zaq0.b;
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(dVar)).getSecondary()), new plm(str, ha50.THREE_LINES, ((ThemeColors) fetVar.k(dVar)).getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, ((ThemeColors) fetVar.k(dVar)).getSecondary()))), ((ThemeColors) fetVar.k(dVar)).getBackgroundContent(), true, null);
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new tq(function1, (byte) 20);
                fetVar.o0(objP);
            }
            Function0 function2 = (Function0) objP;
            boolean z2 = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = new y(function0, (byte) 9);
                fetVar.o0(objP2);
            }
            hlm.c(jm40Var, immVar, null, function2, null, (Function1) objP2, null, null, null, null, null, null, fetVar, (i2 & 14) | 805306368, 54, 468);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2(str, function0, function1, i);
        }
    }

    public static final void J(m960 m960Var, fet fetVar, int i) {
        int i2;
        g960 g960Var = m960Var.e;
        fetVar.g0(-636874881);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(m960Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                String str = m960Var.d;
                Object objE = j1t0.f15753a;
                context.getClass();
                str.getClass();
                objE.getClass();
                if (str.length() != 0) {
                    try {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(new File(context.getCacheDir(), str));
                        typefaceCreateFromFile.getClass();
                        objE = lv00.E(typefaceCreateFromFile);
                    } catch (Exception unused) {
                    }
                }
                objP = objE;
                fetVar.o0(objP);
            }
            nrq nrqVar = (nrq) objP;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13).e((mm40) fetVar.k(t0h.f33118a));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            y(g960Var, m960Var.f21397a, m960Var.b, nrqVar, fetVar, 3584);
            c(m960Var.c, g960Var, nrqVar, fetVar, 392);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(m960Var, i, b2);
        }
    }

    public static final void K(int i, fet fetVar) {
        fetVar.g0(395360080);
        byte b2 = 0;
        if (fetVar.U(i & 1, i != 0)) {
            Fragment fragment = (Fragment) fetVar.k(mr00.f22246a);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = a4n0.f(fragment);
                fetVar.o0(objP);
            }
            i1w0 i1w0Var = (i1w0) objP;
            String name = roi.class.getName();
            Context applicationContext = ((Context) fetVar.k(dy2.b)).getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application == null) {
                throw new ss3((byte) 0);
            }
            riu0 riu0VarA = ms00.a(fetVar);
            if (riu0VarA == null) {
                throw new tiu0();
            }
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new rlb0(application, i1w0Var, b2);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean zG = fetVar.g(riu0VarA) | fetVar.g(name);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                ojg ojgVar = new ojg((byte) 1);
                zfc zfcVar = new zfc(function0, (byte) 5);
                tre0 tre0Var = sre0.f32672a;
                ojgVar.a(tre0Var.b(kgd.class), zfcVar);
                qbx qbxVarB = ojgVar.b();
                piu0 piu0VarG = riu0VarA.g();
                vbf vbfVar = vbf.b;
                piu0VarG.getClass();
                vbfVar.getClass();
                objP3 = (kgd) new h0q0(piu0VarG, qbxVarB, vbfVar).t(tre0Var.b(kgd.class), name);
                fetVar.o0(objP3);
            }
            Object obj2 = ((kgd) objP3).b;
            if (obj2 == null) {
                hny.u("null cannot be cast to non-null type org.xplatform.aggregator.popular.dashboard.impl.di.PopularAggregatorComponent");
                return;
            }
            roi roiVar = (roi) obj2;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = new fiu0(Collections.singletonMap(f1b0.class, roiVar.O));
                fetVar.o0(objP4);
            }
            fiu0 fiu0Var = (fiu0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = roiVar.b;
                fetVar.o0(objP5);
            }
            Object obj3 = (ii) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == obj) {
                objP6 = new q5j();
                fetVar.o0(objP6);
            }
            Object obj4 = (q5j) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == obj) {
                objP7 = new roq0();
                fetVar.o0(objP7);
            }
            Object obj5 = (roq0) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == obj) {
                objP8 = roiVar.f30838a;
                fetVar.o0(objP8);
            }
            Object obj6 = (wdk0) objP8;
            k3t0 k3t0VarY = n4c.Y(sre0.f32672a.b(f1b0.class), null, fiu0Var, fetVar, 14);
            boolean zI = fetVar.i(k3t0VarY) | fetVar.i(obj3) | fetVar.i(obj4) | fetVar.i(obj6) | fetVar.i(obj5) | fetVar.i(fragment);
            Object objP9 = fetVar.P();
            if (zI || objP9 == obj) {
                Object bg0Var = new bg0(k3t0VarY, obj3, obj4, obj6, obj5, fragment, (byte) 13);
                fetVar.o0(bg0Var);
                objP9 = bg0Var;
            }
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP9, fetVar);
            boolean zI2 = fetVar.i(k3t0VarY) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP10 = fetVar.P();
            if (zI2 || objP10 == obj) {
                Object kc70Var = new kc70(k3t0VarY, clzVar, pz40VarF, null, (byte) 4);
                fetVar.o0(kc70Var);
                objP10 = kc70Var;
            }
            m0x0.t(fetVar, clzVar, (Function2) objP10);
            i3t0 i3t0Var = (i3t0) k3t0VarY;
            pz40 pz40VarY = i3t0Var.y(fetVar);
            n0q n0qVar = o7k0.c;
            Object objP11 = fetVar.P();
            if (objP11 == obj) {
                objP11 = new peb0((byte) 8);
                fetVar.o0(objP11);
            }
            mm40 mm40VarK = rq8.K(n0qVar, (Function1) objP11);
            boolean zI3 = fetVar.i(i3t0Var);
            Object objP12 = fetVar.P();
            if (zI3 || objP12 == obj) {
                objP12 = new e9b0(1, i3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 12);
                fetVar.o0(objP12);
            }
            xia0.P(0, fetVar, mm40VarK, pz40VarY, (Function1) ((jhy) objP12));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j3b0(i, (byte) 9);
        }
    }

    public static final void L(int i, u12 u12Var, ugd ugdVar, xdr xdrVar, fet fetVar, mm40 mm40Var, d9d0 d9d0Var, Function0 function0, boolean z, boolean z2) {
        xdr xdrVar2;
        mm40 mm40Var2;
        fetVar.g0(1861644948);
        int i2 = (fetVar.h(z) ? 4 : 2) | i | (fetVar.h(z2) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.g(d9d0Var) ? 16384 : 8192) | 196608;
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                u12Var = gqw0.f11754a;
            } else {
                fetVar.X();
            }
            fetVar.s();
            mm40Var2 = mm40Var;
            mm40 mm40VarN = idx.N(mm40Var2, z, d9d0Var, z2, function0);
            tj30 tj30VarC = zq8.c(u12Var, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jr8 jr8Var = jr8.f16991a;
            ugdVar.F(jr8Var, fetVar, 54);
            xdrVar2 = xdrVar;
            xdrVar2.F(jr8Var, fetVar, 54);
            fetVar.r(true);
        } else {
            xdrVar2 = xdrVar;
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iad(z, z2, function0, mm40Var2, d9d0Var, u12Var, xdrVar2, ugdVar, i);
        }
    }

    public static final void M(a4x a4xVar, boolean z, xcz xczVar, qdz qdzVar, Function1 function1, fet fetVar, int i) {
        a4x a4xVar2;
        int i2;
        int i3;
        cl5 cl5Var;
        boolean z2;
        int i4;
        boolean z3;
        xcz xczVar2 = xczVar;
        fet fetVar2 = fetVar;
        a4xVar.getClass();
        xczVar2.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar2.g0(-1488966231);
        if ((i & 6) == 0) {
            a4xVar2 = a4xVar;
            i2 = (fetVar2.g(a4xVar2) ? 4 : 2) | i;
        } else {
            a4xVar2 = a4xVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(xczVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(qdzVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            h5m h5mVarL = zjb.L(1, fetVar2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : a4xVar2) {
                if (obj instanceof zog) {
                    arrayList.add(obj);
                }
            }
            zog zogVar = (zog) CollectionsKt.firstOrNull(arrayList);
            float f2 = xfn.a(fetVar2).c;
            mm40 mm40VarV = cjx.V(o7k0.c, h5mVarL.e, null);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarV);
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
            m5m m5mVar = zogVar != null ? zogVar.b : null;
            if (m5mVar == null) {
                m5mVar = null;
            }
            b6m b6mVar = m5mVar != null ? m5mVar.f21226a.i : null;
            byte b2 = 13;
            cl5 cl5Var2 = ukd.f35823a;
            if (b6mVar != null) {
                fetVar2.e0(-1588340286);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40.b, f2, 4.0f, f2, 0.0f, 8);
                m5m m5mVar2 = zogVar.b;
                int i5 = i2 & 57344;
                boolean z4 = i5 == 16384;
                Object objP = fetVar2.P();
                if (z4 || objP == cl5Var2) {
                    objP = new a9g0(function1, b2);
                    fetVar2.o0(objP);
                }
                Function1 function2 = (Function1) objP;
                boolean z5 = i5 == 16384;
                Object objP2 = fetVar2.P();
                if (z5 || objP2 == cl5Var2) {
                    objP2 = new dng0(function1, (byte) 12);
                    fetVar2.o0(objP2);
                }
                Function0 function0 = (Function0) objP2;
                boolean zG = (i5 == 16384) | fetVar2.g(zogVar);
                Object objP3 = fetVar2.P();
                if (zG || objP3 == cl5Var2) {
                    objP3 = new mk40(function1, zogVar, (byte) 2);
                    fetVar2.o0(objP3);
                }
                Function0 function3 = (Function0) objP3;
                boolean z6 = i5 == 16384;
                Object objP4 = fetVar2.P();
                if (z6 || objP4 == cl5Var2) {
                    objP4 = new a9g0(function1, (byte) 19);
                    fetVar2.o0(objP4);
                }
                Function1 function4 = (Function1) objP4;
                boolean z7 = i5 == 16384;
                Object objP5 = fetVar2.P();
                if (z7 || objP5 == cl5Var2) {
                    objP5 = new a9g0(function1, (byte) 20);
                    fetVar2.o0(objP5);
                }
                Function1 function5 = (Function1) objP5;
                i3 = i2;
                cl5Var = cl5Var2;
                i4 = 32;
                z2 = false;
                j5m.a(mm40VarN, m5mVar2, h5mVarL, function2, function0, function3, null, function4, function5, fetVar2, 0, 64);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                i3 = i2;
                cl5Var = cl5Var2;
                z2 = false;
                i4 = 32;
                fetVar2.e0(-1587159217);
                fetVar2.r(false);
            }
            x7z x7zVar = new x7z(1.0f, true);
            zcl zclVar2 = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(f2, 0.0f, r20, 28.0f, 2);
            int i6 = i3 & 896;
            boolean zG2 = ((i3 & 112) == i4 ? true : z2) | ((i3 & 14) == 4 ? true : z2) | (i6 == 256 ? true : z2) | ((i3 & 7168) == 2048 ? true : z2) | fetVar2.g(m5mVar) | ((i3 & 57344) == 16384 ? true : z2);
            Object objP6 = fetVar2.P();
            cl5 cl5Var3 = cl5Var;
            if (zG2 || objP6 == cl5Var3) {
                z3 = true;
                xah0 xah0Var = new xah0(a4xVar, z, xczVar, qdzVar, m5mVar, function1, (byte) 1);
                fetVar2.o0(xah0Var);
                objP6 = xah0Var;
            } else {
                z3 = true;
            }
            b8k0.e(x7zVar, xczVar, lh80VarU, null, null, null, false, null, (Function1) objP6, fetVar2, (i3 >> 3) & 112, Response.SERVER_TIMEOUT);
            xczVar2 = xczVar;
            fetVar2.r(z3);
            Unit unit = Unit.f46060a;
            boolean z8 = i6 == 256 ? z3 : z2;
            Object objP7 = fetVar2.P();
            if (z8 || objP7 == cl5Var3) {
                objP7 = new wi6(xczVar2, null, (byte) 13);
                fetVar2.o0(objP7);
            }
            m0x0.t(fetVar2, unit, (Function2) objP7);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yah0(a4xVar, z, xczVar2, qdzVar, function1, i, (byte) 1);
        }
    }

    public static final void N(mm40 mm40Var, int i, ebm0 ebm0Var, jbm0 jbm0Var, fet fetVar, int i2) {
        int i3;
        jbm0Var.getClass();
        fetVar.g0(788777032);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar.g(ebm0Var) : fetVar.i(ebm0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(jbm0Var) ? 2048 : 1024;
        }
        if (!fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.X();
        } else if (ebm0Var instanceof cbm0) {
            fetVar.e0(690739896);
            j((cbm0) ebm0Var, jbm0Var, fetVar, (i3 >> 6) & 126);
            fetVar.r(false);
        } else {
            if (!(ebm0Var instanceof dbm0)) {
                throw b1j.f(2100489902, fetVar, false);
            }
            fetVar.e0(690887797);
            R(mm40Var, i, (dbm0) ebm0Var, jbm0Var, fetVar, i3 & 8190);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z23(mm40Var, i, ebm0Var, jbm0Var, i2, (byte) 10);
        }
    }

    public static final void O(mm40 mm40Var, n0x n0xVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1584595194);
        int i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i | (fetVar2.g(n0xVar) ? 32 : 16);
        byte b2 = 0;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objA = n0xVar.a();
            pge pgeVar = gqw0.A;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new ca6(pz40Var, (byte) 11);
                fetVar2.o0(objP2);
            }
            mz3 mz3VarX = l7x.X(objA, (Function1) objP2, pgeVar, fetVar2, 3456, 18);
            lz3 lz3Var = (lz3) pz40Var.getValue();
            if (lz3Var != null) {
                if (lz3Var instanceof kz3) {
                    fetVar2.e0(-689397677);
                    mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    j0x.b(mz3VarX, null, o2e.e0(o7k0.e(mm40VarD, 140.0f), "CASHBACK_CARD_STATUS_PICTURE"), null, pgeVar, 0.0f, null, fetVar, 24624, 104);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else if ((lz3Var instanceof hz3) || (lz3Var instanceof iz3) || (lz3Var instanceof jz3)) {
                    fetVar2.e0(-688913364);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarJ = lgb.J(o7k0.n(s5x0.J(mm40Var, 6.0f), 128.0f), vgg0.f37379a);
                    pz40 pz40Var2 = s6t0.f31722a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    dww.c(a8k0.F(R.drawable.ic_glyph_favourite_active, 0, fetVar2), null, s5x0.J(i120.Q(mm40VarJ, staticColors.m126getWhite200d7_KjU(), jd8.n), 28.0f), staticColors.m131getWhite800d7_KjU(), fetVar2, 56, 0);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                }
            }
            throw b1j.f(1917422108, fetVar2, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nwa(mm40Var, n0xVar, i, b2);
        }
    }

    public static final void P(mm40 mm40Var, utz utzVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        boolean z;
        pvi0 jvi0Var;
        fetVar.g0(-2052832093);
        int i2 = i | 6 | (fetVar.g(utzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, f2, 0.0f, 2);
            String str = utzVar.f36278a;
            String str2 = utzVar.b;
            boolean z2 = utzVar.d;
            tui0 tui0Var = new tui0(str, null);
            if (z2) {
                z = true;
                fetVar.e0(119169312);
                jvi0Var = new jvi0(str2, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()));
                fetVar.r(false);
            } else {
                fetVar.e0(118947507);
                zfn zfnVar = zaq0.b;
                z = true;
                jvi0Var = new kvi0(str2, new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()));
                fetVar.r(false);
            }
            rqm rqmVar = new rqm(tui0Var, (pui0) null, jvi0Var, (d4d) null, (tvi0) null, utzVar.c, !z2, (e900) null, 314);
            boolean z3 = (i2 & 896) == 256 ? z : false;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new yqz(function1, (byte) 2);
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
            yfe0VarU.d = new mtz(mm40Var2, utzVar, function1, i, (byte) 0);
        }
    }

    public static final void Q(mm40 mm40Var, i4 i4Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(104001355);
        int i2 = i | 6 | (fetVar.g(i4Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ktz(i4Var, function1, b2);
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
            yfe0VarU.d = new ltz(mm40Var2, i4Var, function1, i, (byte) 1);
        }
    }

    public static final void R(mm40 mm40Var, int i, dbm0 dbm0Var, jbm0 jbm0Var, fet fetVar, int i2) {
        int i3;
        Object obj;
        fet fetVar2;
        long j;
        fetVar.g0(1439256321);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar.g(dbm0Var) : fetVar.i(dbm0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            obj = jbm0Var;
            i3 |= fetVar.g(obj) ? 2048 : 1024;
        } else {
            obj = jbm0Var;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 88.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            String str = dbm0Var.f5813a;
            int iOrdinal = dbm0Var.b.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(1281548992);
                obj.getClass();
                fetVar.e0(-1073026481);
                pz40 pz40VarF = androidx.compose.runtime.e.f(new y3d(ijg.k1), fetVar);
                fetVar.r(false);
                j = ((y3d) pz40VarF.getValue()).f41946a;
                fetVar.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(1281545498, fetVar, false);
                }
                fetVar.e0(1281551808);
                obj.getClass();
                fetVar.e0(1111271260);
                pz40 pz40VarF2 = androidx.compose.runtime.e.f(new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU()), fetVar);
                fetVar.r(false);
                j = ((y3d) pz40VarF2.getValue()).f41946a;
                fetVar.r(false);
            }
            v8q0.a(str, mm40VarD, j, null, 0L, null, null, null, 0L, new f2q0(i), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.u, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 48, ((i3 >> 3) & 14) | 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z23(mm40Var, i, (ebm0) dbm0Var, jbm0Var, i2, (byte) 11);
        }
    }

    public static final void S(int i, int i2, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        mm40 mm40Var2;
        long secondary40;
        function0.getClass();
        fetVar.g0(43644329);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            int i4 = i3 >> 3;
            mm40 mm40VarW = yyw.W(i4 & 1008, 0, fetVar, o7k0.n(jm40Var, 24.0f), function0, z);
            pm80 pm80VarF = a8k0.F(i, i4 & 14, fetVar);
            if (z) {
                pz40 pz40Var = s6t0.f31722a;
                secondary40 = s6t0.b().f33626a.getPrimary();
            } else {
                pz40 pz40Var2 = s6t0.f31722a;
                secondary40 = s6t0.b().f33626a.getSecondary40();
            }
            dww.c(pm80VarF, null, mm40VarW, secondary40, fetVar, 56, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sda(mm40Var2, i, z, function0, i2, (byte) 0);
        }
    }

    public static final void T(k3t0 k3t0Var, int i, fet fetVar, int i2) {
        k3t0Var.getClass();
        fetVar.g0(833920970);
        byte b2 = 4;
        int i3 = (fetVar.g(k3t0Var) ? 4 : 2) | i2 | (fetVar.e(i) ? 32 : 16);
        byte b3 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 14;
            i3t0 i3t0Var = (i3t0) k3t0Var;
            pz40 pz40VarY = i3t0Var.y(fetVar);
            boolean z = i4 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ebh(i3t0Var, (byte) 14);
                fetVar.o0(objP);
            }
            q(pz40VarY, i, (Function1) objP, fetVar, i3 & 112);
            Unit unit = Unit.f46060a;
            boolean z2 = i4 == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new w480(i3t0Var, null, b2);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, unit, (Function2) objP2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lqr0(k3t0Var, i, i2, b3);
        }
    }

    public static final void U(mm40 mm40Var, an90 an90Var, fet fetVar, int i) {
        mm40 mm40Var2;
        String str;
        fet fetVar2 = fetVar;
        fetVar2.g0(-457543337);
        int i2 = i | 6 | (fetVar2.g(an90Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(n0qVar, 4.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarJ);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((StaticColors) fetVar2.k(zfnVar)).m125getWhite100d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            if (an90Var.equals(ym90.f42878a)) {
                str = "BAN";
            } else {
                if (!an90Var.equals(zm90.f44614a)) {
                    t9f.b();
                    return;
                }
                str = "PICK";
            }
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((StaticColors) fetVar2.k(zfnVar)).m126getWhite200d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.b(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40.b;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var2, an90Var, i, (byte) 5);
        }
    }

    public static hac V(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!u4n0.r(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw kq80.a("Couldn't find xmp metadata", null);
        }
        v3x v3xVar = b4x.b;
        rcf0 rcf0VarW = rcf0.e;
        long j = -9223372036854775807L;
        loop0: do {
            xmlPullParserNewPullParser.next();
            if (u4n0.r(xmlPullParserNewPullParser, "rdf:Description")) {
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    String strN = u4n0.n(xmlPullParserNewPullParser, e[i2]);
                    if (strN != null) {
                        if (Integer.parseInt(strN) != 1) {
                            break loop0;
                        }
                        int i3 = 0;
                        while (true) {
                            if (i3 < 4) {
                                String strN2 = u4n0.n(xmlPullParserNewPullParser, f[i3]);
                                if (strN2 != null) {
                                    j = Long.parseLong(strN2);
                                    if (j != -1) {
                                        break;
                                    }
                                    break;
                                }
                                i3++;
                            }
                            j = -9223372036854775807L;
                            break;
                        }
                        while (true) {
                            if (i >= 2) {
                                v3x v3xVar2 = b4x.b;
                                rcf0VarW = rcf0.e;
                                break;
                            }
                            String strN3 = u4n0.n(xmlPullParserNewPullParser, g[i]);
                            if (strN3 != null) {
                                rcf0VarW = b4x.v(new rt40(0L, 0L, "image/jpeg"), new rt40(Long.parseLong(strN3), 0L, "video/mp4"));
                                break;
                            }
                            i++;
                        }
                    }
                }
                return null;
            }
            if (u4n0.r(xmlPullParserNewPullParser, "Container:Directory")) {
                rcf0VarW = W(xmlPullParserNewPullParser, "Container", "Item");
            } else if (u4n0.r(xmlPullParserNewPullParser, "GContainer:Directory")) {
                rcf0VarW = W(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!u4n0.q(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (rcf0VarW.isEmpty()) {
            break loop0;
        }
        return new hac(j, rcf0VarW, (byte) 1);
        return null;
    }

    public static rcf0 W(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        u3x u3xVarL = b4x.l();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (u4n0.r(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strN = u4n0.n(xmlPullParser, strConcat3);
                String strN2 = u4n0.n(xmlPullParser, strConcat4);
                String strN3 = u4n0.n(xmlPullParser, strConcat5);
                String strN4 = u4n0.n(xmlPullParser, strConcat6);
                if (strN == null || strN2 == null) {
                    return rcf0.e;
                }
                u3xVarL.b(new rt40(strN3 != null ? Long.parseLong(strN3) : 0L, strN4 != null ? Long.parseLong(strN4) : 0L, strN));
            }
        } while (!u4n0.q(xmlPullParser, strConcat2));
        return u3xVarL.g();
    }

    public static final s4u0 X(final t53 t53Var, final boolean z, fet fetVar) {
        r2x r2xVar = t53Var.f33349a;
        float f2 = r2xVar.b;
        float f3 = r2xVar.c;
        float f4 = r2xVar.d;
        float f5 = r2xVar.e;
        String str = r2xVar.f29760a;
        long j = r2xVar.g;
        int i = r2xVar.h;
        ugd ugdVarM = u1c.M(-1895266590, new ydr() { // from class: a.m63
            @Override // a.ydr
            public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                ugd ugdVar = hmw0.c;
                ((Float) obj).getClass();
                ((Float) obj2).getClass();
                fet fetVar2 = (fet) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 129) != 128)) {
                    Boolean boolValueOf = Boolean.valueOf(z);
                    t53 t53Var2 = t53Var;
                    oms0 oms0VarZ = phu0.Z(boolValueOf, t53Var2.f33349a.f29760a, fetVar2, 0, 0);
                    long[] jArr = u1h0.f34903a;
                    hz40 hz40Var = new hz40();
                    fetVar2.e0(-285052463);
                    ArrayList arrayList = t53Var2.b;
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        n63 n63Var = (n63) arrayList.get(i2);
                        v73 v73Var = n63Var.b;
                        String str2 = n63Var.f22976a;
                        int i3 = t53Var2.c;
                        fetVar2.e0(-675540879);
                        Object objP = fetVar2.P();
                        if (objP == ukd.f35823a) {
                            objP = new j8m0();
                            fetVar2.o0(objP);
                        }
                        j8m0 j8m0Var = (j8m0) objP;
                        v73Var.a(oms0VarZ, j8m0Var, i3, fetVar2, 0);
                        fetVar2.r(false);
                        j8m0 j8m0Var2 = (j8m0) hz40Var.g(str2);
                        if (j8m0Var2 != null) {
                            l7m0 l7m0Var = j8m0Var.f16091a;
                            if (l7m0Var != null) {
                                j8m0Var2.f16091a = l7m0Var;
                            }
                            l7m0 l7m0Var2 = j8m0Var.b;
                            if (l7m0Var2 != null) {
                                j8m0Var2.b = l7m0Var2;
                            }
                            l7m0 l7m0Var3 = j8m0Var.c;
                            if (l7m0Var3 != null) {
                                j8m0Var2.c = l7m0Var3;
                            }
                            l7m0 l7m0Var4 = j8m0Var.d;
                            if (l7m0Var4 != null) {
                                j8m0Var2.d = l7m0Var4;
                            }
                            l7m0 l7m0Var5 = j8m0Var.e;
                            if (l7m0Var5 != null) {
                                j8m0Var2.e = l7m0Var5;
                            }
                            l7m0 l7m0Var6 = j8m0Var.f;
                            if (l7m0Var6 != null) {
                                j8m0Var2.f = l7m0Var6;
                            }
                            l7m0 l7m0Var7 = j8m0Var.g;
                            if (l7m0Var7 != null) {
                                j8m0Var2.g = l7m0Var7;
                            }
                            l7m0 l7m0Var8 = j8m0Var.h;
                            if (l7m0Var8 != null) {
                                j8m0Var2.h = l7m0Var8;
                            }
                            l7m0 l7m0Var9 = j8m0Var.i;
                            if (l7m0Var9 != null) {
                                j8m0Var2.i = l7m0Var9;
                            }
                            l7m0 l7m0Var10 = j8m0Var.j;
                            if (l7m0Var10 != null) {
                                j8m0Var2.j = l7m0Var10;
                            }
                            l7m0 l7m0Var11 = j8m0Var.k;
                            if (l7m0Var11 != null) {
                                j8m0Var2.k = l7m0Var11;
                            }
                            l7m0 l7m0Var12 = j8m0Var.l;
                            if (l7m0Var12 != null) {
                                j8m0Var2.l = l7m0Var12;
                            }
                            l7m0 l7m0Var13 = j8m0Var.m;
                            if (l7m0Var13 != null) {
                                j8m0Var2.m = l7m0Var13;
                            }
                            l7m0 l7m0Var14 = j8m0Var.n;
                            if (l7m0Var14 != null) {
                                j8m0Var2.n = l7m0Var14;
                            }
                            l7m0 l7m0Var15 = j8m0Var.o;
                            if (l7m0Var15 != null) {
                                j8m0Var2.o = l7m0Var15;
                            }
                            l7m0 l7m0Var16 = j8m0Var.p;
                            if (l7m0Var16 != null) {
                                j8m0Var2.p = l7m0Var16;
                            }
                        } else {
                            hz40Var.n(str2, j8m0Var);
                        }
                    }
                    fetVar2.r(false);
                    p4u0 p4u0Var = t53Var2.f33349a.f;
                    qp20 qp20Var = hz40Var.f;
                    if (qp20Var == null) {
                        qp20Var = new qp20(hz40Var);
                        hz40Var.f = qp20Var;
                    }
                    ugdVar.j(p4u0Var, qp20Var, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            }
        }, fetVar);
        w6k w6kVar = (w6k) fetVar.k(bmd.h);
        float fW0 = w6kVar.w0(f2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(w6kVar.w0(f3))) & 4294967295L) | (((long) Float.floatToRawIntBits(fW0)) << 32);
        long jQ = iom0.q(f4, f5, jFloatToRawIntBits);
        boolean zF = fetVar.f(j) | fetVar.e(i);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zF || objP == obj) {
            objP = j != 16 ? new m78(j, i) : null;
            fetVar.o0(objP);
        }
        a4d a4dVar = (a4d) objP;
        fetVar.e0(789579543);
        Object objP2 = fetVar.P();
        if (objP2 == obj) {
            objP2 = new s4u0(new wgv());
            fetVar.o0(objP2);
        }
        s4u0 s4u0Var = (s4u0) objP2;
        iom0.j(s4u0Var, jFloatToRawIntBits, jQ, str, a4dVar, true);
        androidx.compose.runtime.a aVarG = e3c.G(fetVar);
        boolean zD = fetVar.d(f4) | fetVar.d(f5);
        Object objP3 = fetVar.P();
        Object obj2 = objP3;
        if (zD || objP3 == obj) {
            mld mldVar = s4u0Var.i;
            mld tldVar = (mldVar == null || mldVar.c()) ? new tld(aVarG, new w3u0(s4u0Var.h.b)) : mldVar;
            tldVar.d(new ugd(1749374910, true, new ub4((Object) ugdVarM, jQ, (byte) 9)));
            fetVar.o0(tldVar);
            obj2 = tldVar;
        }
        mld mldVar2 = (mld) obj2;
        s4u0Var.i = mldVar2;
        boolean zI = fetVar.i(mldVar2);
        Object objP4 = fetVar.P();
        if (zI || objP4 == obj) {
            objP4 = new npt0(mldVar2, (byte) 2);
            fetVar.o0(objP4);
        }
        m0x0.o(s4u0Var, (Function1) objP4, fetVar);
        fetVar.r(false);
        return s4u0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public static final mi1 Y(long j, List list, boolean z) {
        ?? arrayList;
        List list2;
        List<f3q> list3;
        l3q o3qVar;
        String str;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                xo0 xo0Var = (xo0) it.next();
                Integer num = xo0Var != null ? xo0Var.c : null;
                w3q w3qVar = (num != null && num.intValue() == 1) ? w3q.b : w3q.f38514a;
                String str2 = xo0Var != null ? xo0Var.f41193a : null;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = xo0Var != null ? xo0Var.b : null;
                if (str3 == null) {
                    str3 = "";
                }
                if (xo0Var == null || (list3 = xo0Var.d) == null) {
                    list2 = null;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (f3q f3qVar : list3) {
                        if (f3qVar != null) {
                            String str4 = f3qVar.b;
                            w3q w3qVar2 = w3q.b;
                            String str5 = f3qVar.f8876a;
                            if (w3qVar == w3qVar2) {
                                String str6 = str5 == null ? "" : str5;
                                String str7 = str4 == null ? "" : str4;
                                StringBuilder sb = new StringBuilder(ujn.h);
                                if (!z ? (str = f3qVar.e) == null : (str = f3qVar.f) == null) {
                                    str = "";
                                }
                                int iIntValue = 0;
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
                                    iIntValue = 0;
                                }
                                String string = sb.toString();
                                String str8 = f3qVar.d;
                                String str9 = str8 == null ? "" : str8;
                                gz8 gz8Var = gz8.f12169a;
                                iun iunVar = iun.f15405a;
                                Integer num2 = f3qVar.g;
                                if (num2 != null) {
                                    iIntValue = num2.intValue();
                                }
                                o3qVar = new s5d0(str6, str7, string, str9, gz8Var, iunVar, "", iIntValue, null);
                            } else {
                                if (str5 == null) {
                                    str5 = "";
                                }
                                if (str4 == null) {
                                    str4 = "";
                                }
                                o3qVar = new o3q(str5, str4);
                            }
                        } else {
                            o3qVar = null;
                        }
                        if (o3qVar != null) {
                            arrayList2.add(o3qVar);
                        }
                    }
                    list2 = arrayList2;
                }
                if (list2 == null) {
                    list2 = iun.f15405a;
                }
                arrayList.add(new x2q(str2, str3, w3qVar, list2));
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new mi1(j, arrayList);
    }

    public static final ao4 Z(bo4 bo4Var, ctf0 ctf0Var, wui0 wui0Var) {
        String strG;
        int i;
        bo4Var.getClass();
        ctf0Var.getClass();
        String strR = kotlin.text.c.r(StringsKt.u0(bo4Var.d + Separators.SP + bo4Var.c).toString(), Separators.SP, ", ", false);
        String str = bo4Var.f2913a;
        boolean z = bo4Var.f;
        String strConcat = bo4Var.b.concat(strR.length() == 0 ? " ()" : kng0.l(" (", strR, Separators.RPAREN));
        if (bo4Var.f) {
            strG = ctf0Var.b.a(R.string.current_session, Arrays.copyOf(new Object[0], 0));
        } else {
            rdj rdjVar = rdj.f30294a;
            strG = rdj.g(new znq0(bo4Var.g), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56);
        }
        String str2 = strG;
        int iOrdinal = bo4Var.e.ordinal();
        if (iOrdinal == 0) {
            i = R.drawable.ic_glyph_device_placeholder;
        } else if (iOrdinal == 1) {
            i = R.drawable.ic_glyph_windows;
        } else if (iOrdinal == 2) {
            i = R.drawable.ic_glyph_mac;
        } else if (iOrdinal == 3) {
            i = R.drawable.ic_glyph_android;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            i = R.drawable.ic_glyph_apple;
        }
        return new ao4(str, i, z, strConcat, wui0Var, str2);
    }

    public static final void a(mm40 mm40Var, l7m0 l7m0Var, ru1 ru1Var, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        l7m0 l7m0Var2;
        mm40 mm40Var2;
        ugd ugdVar2 = ugdVar;
        function1.getClass();
        fetVar.g0(-1196315469);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(ru1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(s5x0.N(n0qVar, 0.0f, ((Number) l7m0Var2.getValue()).floatValue() * 24.0f, 0.0f, 0.0f, 13), vgg0.c((1.0f - ((Number) l7m0Var2.getValue()).floatValue()) * 16.0f, (1.0f - ((Number) l7m0Var2.getValue()).floatValue()) * 16.0f, 0.0f, 0.0f, 12));
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarJ, backgroundContent, ljcVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            mm40 mm40VarM = s5x0.M(i120.Q(lgb.J(o7k0.d(jm40Var, 1.0f), vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar), 8.0f, 12.0f, 8.0f, 12.0f);
            a4x a4xVar = ru1Var.f31103a;
            dxh0 dxh0Var = ru1Var.c;
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new nc((Object) ru1Var, (byte) 25);
                fetVar.o0(objP);
            }
            int i3 = i2;
            ibc.n(mm40VarM, a4xVar, gxh0.f12078a, dxh0Var, false, (Function0) objP, function1, fetVar, (i2 << 9) & 3670016, 16);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarH);
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
            ugdVar2 = ugdVar;
            ugdVar2.invoke(fetVar, Integer.valueOf((i3 >> 12) & 14));
            fetVar.r(true);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var2, (Object) l7m0Var, (Object) ru1Var, (Object) function1, (Object) ugdVar2, i, (byte) 1);
        }
    }

    public static final ru6 a0(pu6 pu6Var) {
        pu6Var.getClass();
        long j = pu6Var.f27599a;
        String str = pu6Var.o;
        long j2 = pu6Var.b;
        tqt tqtVar = uoy.b;
        byte b2 = pu6Var.u.f34306a;
        tqtVar.getClass();
        return new ru6(j, str, 0.0d, j2, tqt.j(b2), pu6Var.p, pu6Var.d, pu6Var.v, pu6Var.x, (Double) null, (String) null, 3328);
    }

    public static final void b(mm40 mm40Var, float f2, float f3, float f4, fet fetVar, int i) {
        fetVar.g0(-352383459);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.d(f2) ? 32 : 16) | (fetVar.d(f3) ? 256 : 128) | (fetVar.d(f4) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1054584099, new p02(mm40Var, f2, f3, f4), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p02(mm40Var, f2, f3, f4, i);
        }
    }

    public static final ijl b0(kg kgVar) {
        int iOrdinal = kgVar.ordinal();
        if (iOrdinal == 0) {
            return ijl.f14880a;
        }
        if (iOrdinal == 1) {
            return ijl.b;
        }
        if (iOrdinal == 2) {
            return ijl.c;
        }
        if (iOrdinal == 3) {
            return ijl.d;
        }
        if (iOrdinal == 4) {
            return ijl.e;
        }
        t9f.b();
        return null;
    }

    public static final void c(a4x a4xVar, g960 g960Var, nrq nrqVar, fet fetVar, int i) {
        fetVar.g0(1964046149);
        int i2 = (fetVar.i(a4xVar) ? 4 : 2) | i | (fetVar.g(g960Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = fetVar.k(bmd.n) == k6z.b;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), 62.0f);
            long jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarE, jM75getBlack600d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "NUMBERS_ALL_GAME_NUMBERS_BOX");
            boolean zH = fetVar.h(z);
            Object objP = fetVar.P();
            if (zH || objP == ukd.f35823a) {
                objP = new kp2((byte) 8, z);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 251342041, a4xVar);
            while (itO.hasNext()) {
                dak0.c((e960) itO.next(), g960Var, nrqVar, fetVar, (i2 & 112) | 392);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(a4xVar, g960Var, nrqVar, i, (byte) 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(mm40 mm40Var, ql5 ql5Var, boolean z, boolean z2, Function1 function1, fet fetVar, int i) {
        zfn zfnVar;
        long secondary;
        long textPrimary;
        boolean z3;
        boolean z4;
        fet fetVar2 = fetVar;
        function1.getClass();
        fetVar2.g0(939514423);
        int i2 = i | (fetVar2.i(ql5Var) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.h(z2) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (z2) {
                fetVar2.e0(-1227476677);
                zfnVar = zaq0.b;
                secondary = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1227423047);
                zfnVar = zaq0.b;
                secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                fetVar2.r(false);
            }
            zfn zfnVar2 = zfnVar;
            if (z2) {
                fetVar2.e0(-1227338789);
                textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1227285097);
                textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
                fetVar2.r(false);
            }
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            pn40 pn40Var = pn40.f27267a;
            rui0 rui0Var = new rui0(pn40.d(ql5Var.b, ql5Var.f, p3u0.c), new y3d(textPrimary), ql5Var.m, new y3d(((ThemeColors) fetVar2.k(zfnVar2)).getSecondary()), 48);
            Integer numValueOf = Integer.valueOf(R.drawable.ic_cash_placeholder);
            y3d y3dVar = new y3d(secondary);
            long j = ql5Var.e;
            bzu bzuVarE = rz4.e("static", "img", "android", "icons_currency");
            rz4.s(j, ".svg", bzuVarE);
            rqm rqmVar = new rqm((vui0) rui0Var, (pui0) new oui0(numValueOf, y3dVar, new n0x(((StringBuilder) bzuVarE.b).toString()), new y3d(secondary), 16), (pvi0) new nvi0(z2), (d4d) null, (tvi0) null, z ? wui0.c : wui0.d, false, (e900) null, 440);
            int i3 = i2 & 57344;
            boolean zI = (i3 == 16384) | fetVar2.i(ql5Var);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                z3 = false;
                objP = new pg5(function1, ql5Var, 0 == true ? 1 : 0);
                fetVar2.o0(objP);
            } else {
                z3 = false;
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = (i3 == 16384 ? true : z3) | fetVar2.i(ql5Var);
            Object objP2 = fetVar2.P();
            if (zI2 != 0 || objP2 == cl5Var) {
                z4 = true;
                objP2 = new pg5(function1, ql5Var, 1 == true ? 1 : 0);
                fetVar2.o0(objP2);
            } else {
                z4 = true;
            }
            obc.q(mm40Var, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 390, 168);
            fetVar2 = fetVar;
            if (z) {
                fetVar2.e0(1639695981);
                mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.g);
                zcl zclVar = qmk.f28987a;
                vtb.t(o7k0.d(s5x0.L(mm40VarB, 12.0f, 0.0f, 2), 1.0f), qqm.b, null, 0L, fetVar2, 48, 12);
                fetVar2.r(z3);
            } else {
                fetVar2.e0(1639976593);
                fetVar2.r(z3);
            }
            fetVar2.r(z4);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qg5((Object) mm40Var, (Object) ql5Var, z, z2, (wdr) function1, i, (byte) 0);
        }
    }

    public static final void e(mm40 mm40Var, eq7 eq7Var, w2d w2dVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        fetVar.g0(533330477);
        int i2 = i | 6 | (fetVar.g(eq7Var) ? 32 : 16) | (fetVar.i(w2dVar) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            pzb.c(u1c.M(-1228079449, new m87(eq7Var, (byte) 6), fetVar), w2dVar, null, u1c.M(966859882, new ry2(eq7Var, function0, function1), fetVar), fetVar, 3142 | ((i2 >> 3) & 112), 4);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) mm40Var2, (Object) eq7Var, (Object) w2dVar, (Object) function0, (Object) function1, i, (byte) 13);
        }
    }

    public static final void f(pz40 pz40Var, w2d w2dVar, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(599663298);
        int i2 = (fetVar.g(pz40Var) ? 4 : 2) | i | (fetVar.i(w2dVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float fA = w2dVar.f38442a.a();
            zcl zclVar = qmk.f28987a;
            v2n0.b(o7k0.c, w2dVar, 0L, 0.0f, u1c.M(-1021763465, new sp7(pz40Var, w2dVar, function1), fetVar), u1c.M(1074175547, new tp7(w2dVar, (1.0f - fA) * 24.0f, pz40Var, function1, (byte) 0), fetVar), fetVar, (i2 & 112) | 221254, 12);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sp7(pz40Var, w2dVar, function1, i);
        }
    }

    public static final void g(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, ugd ugdVar5, fet fetVar, int i) {
        mm40 mm40Var2;
        ugd ugdVar6;
        ugd ugdVar7;
        ugd ugdVar8;
        ugd ugdVar9;
        fetVar.g0(-544054569);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i & 1, (i & 74899) != 74898)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.a(0.0f);
                fetVar.o0(objP);
            }
            agk0 agk0Var = (agk0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            Object objP3 = fetVar.P();
            yje yjeVar = null;
            if (objP3 == obj) {
                objP3 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP3);
            }
            pz40 pz40Var2 = (pz40) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = xf0.c(0.0f);
                fetVar.o0(objP4);
            }
            t33 t33Var = (t33) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = jgk0.b(new fu7(t33Var, b2));
                fetVar.o0(objP5);
            }
            l7m0 l7m0Var = (l7m0) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == obj) {
                objP6 = jgk0.b(new fu7(t33Var, b3));
                fetVar.o0(objP6);
            }
            l7m0 l7m0Var2 = (l7m0) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == obj) {
                objP7 = androidx.compose.runtime.e.a(0.0f);
                fetVar.o0(objP7);
            }
            agk0 agk0Var2 = (agk0) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == obj) {
                objP8 = new hx7(pz40Var2, agk0Var2, agk0Var);
                fetVar.o0(objP8);
            }
            hx7 hx7Var = (hx7) objP8;
            boolean zI = fetVar.i(hx7Var);
            Object objP9 = fetVar.P();
            if (zI || objP9 == obj) {
                objP9 = new os5(hx7Var, (byte) 25);
                fetVar.o0(objP9);
            }
            wel welVarB = uel.b((Function1) objP9, fetVar);
            Unit unit = Unit.f46060a;
            boolean zI2 = fetVar.i(t33Var);
            Object objP10 = fetVar.P();
            if (zI2 || objP10 == obj) {
                Object c43Var = new c43(pz40Var, agk0Var, agk0Var2, t33Var, pz40Var2, (yje) null);
                fetVar.o0(c43Var);
                objP10 = c43Var;
            }
            m0x0.t(fetVar, unit, (Function2) objP10);
            Object objP11 = fetVar.P();
            if (objP11 == obj) {
                objP11 = new fc3(agk0Var2, b3);
                fetVar.o0(objP11);
            }
            Function1 function1 = (Function1) objP11;
            WeakHashMap weakHashMap = djv0.w;
            q33 q33Var = zcm0.i(fetVar).f;
            int i2 = q33Var.e().b;
            boolean zE = fetVar.e(i2);
            Object objP12 = fetVar.P();
            if (zE || objP12 == obj) {
                objP12 = new nu7(i2, l7m0Var, function1);
                fetVar.o0(objP12);
            }
            tj30 tj30Var = (tj30) objP12;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40Var2 = mm40Var;
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var2);
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
            jm40 jm40Var = jm40.b;
            ugdVar8 = ugdVar3;
            ugdVar8.F(mrv.k0(jm40Var, "BACKGROUND_ID"), fetVar, 54);
            ugdVar6 = ugdVar;
            ugdVar6.F(mrv.k0(jm40Var, "TOOLBAR_ID"), fetVar, 54);
            ugdVar7 = ugdVar2;
            ugdVar7.F(mrv.k0(jm40Var, "SEGMENT_CONTROL_ID"), fetVar, 54);
            ugdVar9 = ugdVar4;
            ugdVar9.F(epv0.N(mrv.k0(jm40Var, "MIDDLE_CONTENT_ID"), ((Number) l7m0Var2.getValue()).floatValue()), fetVar, 48);
            mm40 mm40VarV = cjx.V(mrv.k0(jm40Var, "BETTING_ID"), hx7Var, null);
            ma80 ma80Var = ma80.f21447a;
            Object objP13 = fetVar.P();
            if (objP13 == obj) {
                objP13 = new a63(pz40Var, yjeVar, b3);
                fetVar.o0(objP13);
            }
            xdr xdrVar = (xdr) objP13;
            Object objP14 = fetVar.P();
            if (objP14 == obj) {
                objP14 = new a63(pz40Var, yjeVar, (byte) 2);
                fetVar.o0(objP14);
            }
            mm40 mm40VarA = uel.a(jm40Var, welVarB, ma80Var, false, false, xdrVar, (xdr) objP14, 156);
            Object objP15 = fetVar.P();
            if (objP15 == obj) {
                objP15 = new ca6(pz40Var, (byte) 3);
                fetVar.o0(objP15);
            }
            ugdVar5.O(mm40VarV, mm40VarA, (Function1) objP15, fetVar, 3456);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            ugdVar6 = ugdVar;
            ugdVar7 = ugdVar2;
            ugdVar8 = ugdVar3;
            ugdVar9 = ugdVar4;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var2, ugdVar6, ugdVar7, ugdVar8, ugdVar9, ugdVar5, i, (byte) 7);
        }
    }

    public static final void h(ra10 ra10Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-708161018);
        int i2 = (fetVar.g(ra10Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
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
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new bvn(ra10Var, b3);
                fetVar.o0(objP);
            }
            vbw0.y(0, 1, fetVar, null, (Function1) objP);
            xia0.k(jr8.f16991a.b(jm40.b, gqw0.h), u1c.M(-1171655119, new gn(function1, (byte) 24), fetVar), fetVar, 48);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new otz(ra10Var, function1, i, b2);
        }
    }

    public static final void i(mm40 mm40Var, zbr zbrVar, Function1 function1, fet fetVar, int i, int i2) {
        int i3;
        float f2;
        zbrVar.getClass();
        function1.getClass();
        fetVar.g0(-247400499);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = i | (fetVar.g(mm40Var) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(zbrVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i5 & 1, (i5 & 147) != 146)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            if (zbrVar.b instanceof o820) {
                zcl zclVar = qmk.f28987a;
                f2 = 12.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f2 = 0.0f;
            }
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, f2, 7);
            mtl mtlVar = zbrVar.h;
            boolean z = ((i5 & 112) == 32) | ((i5 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new op7(zbrVar, function1, (byte) 11);
                fetVar.o0(objP);
            }
            bkb.f(mm40VarQ, mtlVar, null, false, lh80VarU, (Function1) objP, fetVar, 3072, 4);
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0(mm40Var2, (Object) zbrVar, function1, i, i2, (byte) 10);
        }
    }

    public static final void j(cbm0 cbm0Var, jbm0 jbm0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-548677298);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? fetVar2.g(cbm0Var) : fetVar2.i(cbm0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(jbm0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 96.0f), 88.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarQ = i120.Q(o7k0.n(jm40Var, 88.0f), ((y3d) jbm0Var.a(fetVar).getValue()).f41946a, jd8.n);
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            String str = cbm0Var.f4068a;
            fetVar2.e0(-498526051);
            pz40 pz40VarF = androidx.compose.runtime.e.f(Integer.valueOf(R.drawable.ic_sport_color_rainbow_six_168), fetVar2);
            fetVar2.r(false);
            int iIntValue = ((Number) pz40VarF.getValue()).intValue();
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
            pge pgeVar = gqw0.A;
            mm40 mm40VarN = o7k0.n(jm40Var, 88.0f);
            mm40 mm40VarN2 = o7k0.n(jm40Var, 56.0f);
            jr8 jr8Var = jr8.f16991a;
            lgb.v(mm40VarN, jr8Var.b(mm40VarN2, zx7Var), str, iIntValue, jM126getWhite200d7_KjU, pgeVar, fetVar2, 196608, 0);
            zq8.a(0, fetVar2, i120.P(o7k0.c, yk5.n(q3d.j(new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(kkg.t)), 0.0f, 0.0f, 14), null, 6));
            v8q0.a(cbm0Var.b, jr8Var.b(s5x0.N(o7k0.s(jm40Var, 88.0f), 2.0f, 0.0f, 2.0f, 4.0f, 2), gqw0.h), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) cbm0Var, (Object) jbm0Var, i, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:79:0x010b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0113  */
    /* JADX WARN: Code duplicated, block: B:82:0x012d  */
    /* JADX WARN: Code duplicated, block: B:85:0x013e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0146  */
    /* JADX WARN: Code duplicated, block: B:89:0x014e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0168  */
    /* JADX WARN: Code duplicated, block: B:92:0x0176  */
    /* JADX WARN: Code duplicated, block: B:94:0x017a  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01bb  */
    public static final void k(mm40 mm40Var, String str, Integer num, qge qgeVar, u12 u12Var, fet fetVar, int i, int i2) {
        int i3;
        Integer num2;
        int i4;
        u12 u12Var2;
        int i5;
        int i6;
        boolean z;
        String str2;
        u12 u12Var3;
        yfe0 yfe0VarU;
        Integer num3;
        u12 u12Var4;
        Context context;
        gbe0 gbe0VarA;
        int i7;
        boolean z2;
        Object objP;
        b2x b2xVar;
        pz40 pz40Var;
        boolean z3;
        boolean zI;
        Object ic1Var;
        pz40 pz40Var2;
        d2x d2xVar;
        u12 u12Var5;
        boolean z4;
        boolean z5;
        int i8;
        fet fetVar2 = fetVar;
        ljc ljcVar = jd8.n;
        str.getClass();
        fetVar2.g0(229724528);
        if ((i & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(str) ? 32 : 16;
        }
        int i9 = i3 | 384;
        int i10 = i2 & 8;
        if (i10 == 0) {
            if ((i & 3072) == 0) {
                num2 = num;
                i9 |= fetVar2.g(num2) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if (fetVar2.g(qgeVar)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i9 |= i8;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    u12Var2 = u12Var;
                    if (fetVar2.g(u12Var2)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i9 |= i5;
                }
                i6 = i9;
                if ((74899 & i6) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar2.U(i6 & 1, z)) {
                    if (i10 != 0) {
                        num2 = null;
                    }
                    num3 = num2;
                    if (i4 != 0) {
                        u12Var4 = gqw0.e;
                    } else {
                        u12Var4 = u12Var2;
                    }
                    context = (Context) fetVar2.k(dy2.b);
                    gbe0VarA = o5k0.a(context);
                    i7 = i6 & 112;
                    if (i7 == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = fetVar2.P();
                    b2xVar = b2x.f1875a;
                    cl5 cl5Var = ukd.f35823a;
                    if (z2 || objP == cl5Var) {
                        objP = androidx.compose.runtime.e.e(b2xVar);
                        fetVar2.o0(objP);
                    }
                    pz40Var = (pz40) objP;
                    boolean zI2 = fetVar2.i(context);
                    if (i7 == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    zI = z3 | zI2 | fetVar2.i(gbe0VarA) | fetVar2.g(pz40Var);
                    Object objP2 = fetVar2.P();
                    if (!zI || objP2 == cl5Var) {
                        pz40Var2 = pz40Var;
                        ic1Var = new ic1((Object) context, (Object) str, (Object) gbe0VarA, (Object) pz40Var2, (yje) null, (byte) 11);
                        str2 = str;
                        fetVar2.o0(ic1Var);
                    } else {
                        str2 = str;
                        ic1Var = objP2;
                        pz40Var2 = pz40Var;
                    }
                    m0x0.t(fetVar2, str2, (Function2) ic1Var);
                    d2xVar = (d2x) pz40Var2.getValue();
                    if (Intrinsics.d(d2xVar, b2xVar)) {
                        fetVar2.e0(1841900170);
                        if (num3 != null) {
                            fetVar2.e0(1841937339);
                            z5 = false;
                            zq8.a(0, fetVar2, i120.Q(mm40Var, fbc.d(num3.intValue()), ljcVar));
                            fetVar2.r(false);
                        } else {
                            z5 = false;
                            fetVar2.e0(1842020946);
                            fetVar2.r(false);
                        }
                        fetVar2.r(z5);
                    } else {
                        if (Intrinsics.d(d2xVar, c2x.f3645a)) {
                            fetVar2.e0(1842073305);
                            if (num3 != null) {
                                fetVar2.e0(1722000903);
                                z4 = false;
                                zq8.a(0, fetVar2, i120.Q(mm40Var, fbc.d(num3.intValue()), ljcVar));
                                fetVar2.r(false);
                            } else {
                                z4 = false;
                                fetVar2.e0(1842487186);
                                fetVar2.r(false);
                            }
                            fetVar2.r(z4);
                        } else {
                            if (d2xVar instanceof a2x) {
                                throw b1j.f(1721982688, fetVar2, false);
                            }
                            fetVar2.e0(1842536941);
                            u12Var5 = u12Var4;
                            j0x.b(x0x.r(((a2x) d2xVar).f145a, context, 1), null, mm40Var, u12Var5, qgeVar, 0.0f, null, fetVar2, ((i6 << 6) & 896) | 56 | ((i6 >> 6) & 7168) | (57344 & i6), 96);
                            fetVar2 = fetVar2;
                            fetVar2.r(false);
                        }
                        u12Var3 = u12Var5;
                        num2 = num3;
                    }
                    u12Var5 = u12Var4;
                    u12Var3 = u12Var5;
                    num2 = num3;
                } else {
                    str2 = str;
                    fetVar2.X();
                    u12Var3 = u12Var2;
                }
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new a33(mm40Var, (Object) str2, (Object) num2, (Object) qgeVar, (Object) u12Var3, i, i2, (byte) 4);
                }
            }
            i9 |= 196608;
            u12Var2 = u12Var;
            i6 = i9;
            if ((74899 & i6) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i6 & 1, z)) {
                if (i10 != 0) {
                    num2 = null;
                }
                num3 = num2;
                if (i4 != 0) {
                    u12Var4 = gqw0.e;
                } else {
                    u12Var4 = u12Var2;
                }
                context = (Context) fetVar2.k(dy2.b);
                gbe0VarA = o5k0.a(context);
                i7 = i6 & 112;
                if (i7 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = fetVar2.P();
                b2xVar = b2x.f1875a;
                cl5 cl5Var2 = ukd.f35823a;
                if (z2) {
                    objP = androidx.compose.runtime.e.e(b2xVar);
                    fetVar2.o0(objP);
                } else {
                    objP = androidx.compose.runtime.e.e(b2xVar);
                    fetVar2.o0(objP);
                }
                pz40Var = (pz40) objP;
                boolean zI3 = fetVar2.i(context);
                if (i7 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zI = z3 | zI3 | fetVar2.i(gbe0VarA) | fetVar2.g(pz40Var);
                Object objP3 = fetVar2.P();
                if (zI) {
                    pz40Var2 = pz40Var;
                    ic1Var = new ic1((Object) context, (Object) str, (Object) gbe0VarA, (Object) pz40Var2, (yje) null, (byte) 11);
                    str2 = str;
                    fetVar2.o0(ic1Var);
                } else {
                    pz40Var2 = pz40Var;
                    ic1Var = new ic1((Object) context, (Object) str, (Object) gbe0VarA, (Object) pz40Var2, (yje) null, (byte) 11);
                    str2 = str;
                    fetVar2.o0(ic1Var);
                }
                m0x0.t(fetVar2, str2, (Function2) ic1Var);
                d2xVar = (d2x) pz40Var2.getValue();
                if (Intrinsics.d(d2xVar, b2xVar)) {
                    fetVar2.e0(1841900170);
                    if (num3 != null) {
                        fetVar2.e0(1841937339);
                        z5 = false;
                        zq8.a(0, fetVar2, i120.Q(mm40Var, fbc.d(num3.intValue()), ljcVar));
                        fetVar2.r(false);
                    } else {
                        z5 = false;
                        fetVar2.e0(1842020946);
                        fetVar2.r(false);
                    }
                    fetVar2.r(z5);
                } else {
                    if (Intrinsics.d(d2xVar, c2x.f3645a)) {
                        fetVar2.e0(1842073305);
                        if (num3 != null) {
                            fetVar2.e0(1722000903);
                            z4 = false;
                            zq8.a(0, fetVar2, i120.Q(mm40Var, fbc.d(num3.intValue()), ljcVar));
                            fetVar2.r(false);
                        } else {
                            z4 = false;
                            fetVar2.e0(1842487186);
                            fetVar2.r(false);
                        }
                        fetVar2.r(z4);
                    } else {
                        if (d2xVar instanceof a2x) {
                            throw b1j.f(1721982688, fetVar2, false);
                        }
                        fetVar2.e0(1842536941);
                        u12Var5 = u12Var4;
                        j0x.b(x0x.r(((a2x) d2xVar).f145a, context, 1), null, mm40Var, u12Var5, qgeVar, 0.0f, null, fetVar2, ((i6 << 6) & 896) | 56 | ((i6 >> 6) & 7168) | (57344 & i6), 96);
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                    }
                    u12Var3 = u12Var5;
                    num2 = num3;
                }
                u12Var5 = u12Var4;
                u12Var3 = u12Var5;
                num2 = num3;
            } else {
                str2 = str;
                fetVar2.X();
                u12Var3 = u12Var2;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new a33(mm40Var, (Object) str2, (Object) num2, (Object) qgeVar, (Object) u12Var3, i, i2, (byte) 4);
            }
        }
        i9 = i3 | 3456;
        num2 = num;
        if ((i & 24576) == 0) {
            if (fetVar2.g(qgeVar)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i9 |= i8;
        }
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                u12Var2 = u12Var;
                if (fetVar2.g(u12Var2)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i9 |= i5;
            }
            i6 = i9;
            if ((74899 & i6) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i6 & 1, z)) {
                if (i10 != 0) {
                    num2 = null;
                }
                num3 = num2;
                if (i4 != 0) {
                    u12Var4 = gqw0.e;
                } else {
                    u12Var4 = u12Var2;
                }
                context = (Context) fetVar2.k(dy2.b);
                gbe0VarA = o5k0.a(context);
                i7 = i6 & 112;
                if (i7 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = fetVar2.P();
                b2xVar = b2x.f1875a;
                cl5 cl5Var3 = ukd.f35823a;
                if (z2) {
                    objP = androidx.compose.runtime.e.e(b2xVar);
                    fetVar2.o0(objP);
                } else {
                    objP = androidx.compose.runtime.e.e(b2xVar);
                    fetVar2.o0(objP);
                }
                pz40Var = (pz40) objP;
                boolean zI4 = fetVar2.i(context);
                if (i7 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zI = z3 | zI4 | fetVar2.i(gbe0VarA) | fetVar2.g(pz40Var);
                Object objP4 = fetVar2.P();
                if (zI) {
                    pz40Var2 = pz40Var;
                    ic1Var = new ic1((Object) context, (Object) str, (Object) gbe0VarA, (Object) pz40Var2, (yje) null, (byte) 11);
                    str2 = str;
                    fetVar2.o0(ic1Var);
                } else {
                    pz40Var2 = pz40Var;
                    ic1Var = new ic1((Object) context, (Object) str, (Object) gbe0VarA, (Object) pz40Var2, (yje) null, (byte) 11);
                    str2 = str;
                    fetVar2.o0(ic1Var);
                }
                m0x0.t(fetVar2, str2, (Function2) ic1Var);
                d2xVar = (d2x) pz40Var2.getValue();
                if (Intrinsics.d(d2xVar, b2xVar)) {
                    fetVar2.e0(1841900170);
                    if (num3 != null) {
                        fetVar2.e0(1841937339);
                        z5 = false;
                        zq8.a(0, fetVar2, i120.Q(mm40Var, fbc.d(num3.intValue()), ljcVar));
                        fetVar2.r(false);
                    } else {
                        z5 = false;
                        fetVar2.e0(1842020946);
                        fetVar2.r(false);
                    }
                    fetVar2.r(z5);
                } else {
                    if (Intrinsics.d(d2xVar, c2x.f3645a)) {
                        fetVar2.e0(1842073305);
                        if (num3 != null) {
                            fetVar2.e0(1722000903);
                            z4 = false;
                            zq8.a(0, fetVar2, i120.Q(mm40Var, fbc.d(num3.intValue()), ljcVar));
                            fetVar2.r(false);
                        } else {
                            z4 = false;
                            fetVar2.e0(1842487186);
                            fetVar2.r(false);
                        }
                        fetVar2.r(z4);
                    } else {
                        if (d2xVar instanceof a2x) {
                            throw b1j.f(1721982688, fetVar2, false);
                        }
                        fetVar2.e0(1842536941);
                        u12Var5 = u12Var4;
                        j0x.b(x0x.r(((a2x) d2xVar).f145a, context, 1), null, mm40Var, u12Var5, qgeVar, 0.0f, null, fetVar2, ((i6 << 6) & 896) | 56 | ((i6 >> 6) & 7168) | (57344 & i6), 96);
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                    }
                    u12Var3 = u12Var5;
                    num2 = num3;
                }
                u12Var5 = u12Var4;
                u12Var3 = u12Var5;
                num2 = num3;
            } else {
                str2 = str;
                fetVar2.X();
                u12Var3 = u12Var2;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new a33(mm40Var, (Object) str2, (Object) num2, (Object) qgeVar, (Object) u12Var3, i, i2, (byte) 4);
            }
        }
        i9 |= 196608;
        u12Var2 = u12Var;
        i6 = i9;
        if ((74899 & i6) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar2.U(i6 & 1, z)) {
            if (i10 != 0) {
                num2 = null;
            }
            num3 = num2;
            if (i4 != 0) {
                u12Var4 = gqw0.e;
            } else {
                u12Var4 = u12Var2;
            }
            context = (Context) fetVar2.k(dy2.b);
            gbe0VarA = o5k0.a(context);
            i7 = i6 & 112;
            if (i7 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP = fetVar2.P();
            b2xVar = b2x.f1875a;
            cl5 cl5Var4 = ukd.f35823a;
            if (z2) {
                objP = androidx.compose.runtime.e.e(b2xVar);
                fetVar2.o0(objP);
            } else {
                objP = androidx.compose.runtime.e.e(b2xVar);
                fetVar2.o0(objP);
            }
            pz40Var = (pz40) objP;
            boolean zI5 = fetVar2.i(context);
            if (i7 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            zI = z3 | zI5 | fetVar2.i(gbe0VarA) | fetVar2.g(pz40Var);
            Object objP5 = fetVar2.P();
            if (zI) {
                pz40Var2 = pz40Var;
                ic1Var = new ic1((Object) context, (Object) str, (Object) gbe0VarA, (Object) pz40Var2, (yje) null, (byte) 11);
                str2 = str;
                fetVar2.o0(ic1Var);
            } else {
                pz40Var2 = pz40Var;
                ic1Var = new ic1((Object) context, (Object) str, (Object) gbe0VarA, (Object) pz40Var2, (yje) null, (byte) 11);
                str2 = str;
                fetVar2.o0(ic1Var);
            }
            m0x0.t(fetVar2, str2, (Function2) ic1Var);
            d2xVar = (d2x) pz40Var2.getValue();
            if (Intrinsics.d(d2xVar, b2xVar)) {
                fetVar2.e0(1841900170);
                if (num3 != null) {
                    fetVar2.e0(1841937339);
                    z5 = false;
                    zq8.a(0, fetVar2, i120.Q(mm40Var, fbc.d(num3.intValue()), ljcVar));
                    fetVar2.r(false);
                } else {
                    z5 = false;
                    fetVar2.e0(1842020946);
                    fetVar2.r(false);
                }
                fetVar2.r(z5);
            } else {
                if (Intrinsics.d(d2xVar, c2x.f3645a)) {
                    fetVar2.e0(1842073305);
                    if (num3 != null) {
                        fetVar2.e0(1722000903);
                        z4 = false;
                        zq8.a(0, fetVar2, i120.Q(mm40Var, fbc.d(num3.intValue()), ljcVar));
                        fetVar2.r(false);
                    } else {
                        z4 = false;
                        fetVar2.e0(1842487186);
                        fetVar2.r(false);
                    }
                    fetVar2.r(z4);
                } else {
                    if (d2xVar instanceof a2x) {
                        throw b1j.f(1721982688, fetVar2, false);
                    }
                    fetVar2.e0(1842536941);
                    u12Var5 = u12Var4;
                    j0x.b(x0x.r(((a2x) d2xVar).f145a, context, 1), null, mm40Var, u12Var5, qgeVar, 0.0f, null, fetVar2, ((i6 << 6) & 896) | 56 | ((i6 >> 6) & 7168) | (57344 & i6), 96);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                }
                u12Var3 = u12Var5;
                num2 = num3;
            }
            u12Var5 = u12Var4;
            u12Var3 = u12Var5;
            num2 = num3;
        } else {
            str2 = str;
            fetVar2.X();
            u12Var3 = u12Var2;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a33(mm40Var, (Object) str2, (Object) num2, (Object) qgeVar, (Object) u12Var3, i, i2, (byte) 4);
        }
    }

    public static final void l(mm40 mm40Var, twa twaVar, fet fetVar, int i) {
        mm40Var.getClass();
        fetVar.g0(755847786);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(twaVar) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (twaVar instanceof swa) {
            fetVar.e0(520253799);
            n(i2 & 14, fetVar, mm40Var);
            fetVar.r(false);
        } else {
            if (!(twaVar instanceof rwa)) {
                throw b1j.f(520252171, fetVar, false);
            }
            fetVar.e0(520256164);
            m(mm40Var, (rwa) twaVar, fetVar, i2 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(mm40Var, twaVar, i, (byte) 5);
        }
    }

    public static final void m(mm40 mm40Var, rwa rwaVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-164915355);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(rwaVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarW = o7k0.w(mm40Var, null, false, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40VarW, 210.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), "CASHBACK_CARD_LEVEL_TITLE");
            String str = rwaVar.f31209a;
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarE0, staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 48, 24960, 109560);
            v8q0.a(rwaVar.b, o2e.e0(o7k0.w(o7k0.d(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), 1.0f), null, false, 3), "CASHBACK_CARD_LEVEL_VALUE"), staticColors.m123getWhite0d7_KjU(), new n05(qmk.q, qmk.w, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.t(), fetVar, 0, 24960, 109552);
            fetVar2 = fetVar;
            O(s5x0.N(jm40Var, 0.0f, 20.0f, 0.0f, 0.0f, 13), rwaVar.c, fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(mm40Var, rwaVar, i, (byte) 6);
        }
    }

    public static final void n(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(727541178);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarW = o7k0.w(mm40Var, null, false, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40VarW, 210.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS2 = o7k0.s(o7k0.e(s5x0.L(jm40Var, 0.0f, 2.0f, 1), 10.0f), 104.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS2);
            vqm vqmVar = vqm.b;
            zq8.a(0, fetVar, xbc.c0(mm40VarE, vbc.d0(vqmVar, fetVar, 6, 0)));
            mm40 mm40VarS3 = o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 4.0f, 5), 20.0f), 180.0f);
            zcl zclVar3 = qmk.f;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarS3), vbc.d0(vqmVar, fetVar, 6, 0)));
            dw9.x(lgb.J(o7k0.n(s5x0.M(jm40Var, 6.0f, 26.0f, 6.0f, 6.0f), 128.0f), vgg0.f37379a), vbc.d0(vqmVar, fetVar, 6, 0), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 5);
        }
    }

    public static final void o(dk5 dk5Var, Function0 function0, Function1 function1, fet fetVar, int i) {
        dk5Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-1691796859);
        int i2 = i | (fetVar.i(dk5Var) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jh5 jh5Var = null;
            pz40 pz40VarQ = gkb.Q(vtb.N(dk5Var.c0), null, fetVar, 0, 7);
            pz40 pz40VarQ2 = gkb.Q(vtb.N(dk5Var.e0), null, fetVar, 0, 7);
            pz40 pz40VarO = gkb.O(new sj5(dk5Var.U, dk5Var, b2), iun.f15405a, null, fetVar, 48, 14);
            pz40 pz40VarQ3 = gkb.Q(vtb.N(dk5Var.h0), null, fetVar, 0, 7);
            gkb.O(vtb.M(dk5Var.g0), jk5.f16650a, null, fetVar, 48, 14);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP2);
            }
            cgk0 cgk0Var2 = (cgk0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP3);
            }
            cgk0 cgk0Var3 = (cgk0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP4;
            d9d0 d9d0VarO = idx.O(fetVar);
            lh5 lh5Var = (lh5) pz40VarQ.getValue();
            if (lh5Var instanceof jh5) {
                lh5 lh5Var2 = (lh5) pz40VarQ.getValue();
                lh5Var2.getClass();
                jh5Var = (jh5) lh5Var2;
            } else if (!Intrinsics.d(lh5Var, kh5.f18273a)) {
                t9f.b();
                return;
            }
            rah0 rah0VarT = wha0.T(fetVar);
            m8x.y(o2e.e0(jm40.b, "CARD_COMPACT_MAIN_COMPONENT"), u1c.M(119131209, new ywa((Object) rah0VarT, (Object) jh5Var, (Object) dk5Var, (byte) 12), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0L, null, u1c.M(-1254273324, new jad(cgk0Var, cgk0Var3, rah0VarT, pz40VarQ3, cgk0Var2, dk5Var, d9d0VarO, gy40Var, function0, jh5Var, pz40VarQ2, function1, pz40VarO), fetVar), fetVar, 805306422, 444);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(dk5Var, function0, function1, i, (byte) 13);
        }
    }

    public static final void p(mm40 mm40Var, boolean z, aq7 aq7Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-1139386862);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.g(aq7Var) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            Context context = (Context) fetVar.k(dy2.b);
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, z ? 0.0f : 12.0f, 0.0f, 32.0f, 5), fetVar);
            float f2 = pkd.d(fetVar) ? 36.0f : 12.0f;
            mm40 mm40VarN = s5x0.N(jm40.b, f2, 0.0f, f2, 8.0f, 2);
            int i3 = aq7Var.c;
            ch30[] ch30VarArr = ch30.f4345a;
            boolean z2 = i3 == 1;
            boolean zI = ((i2 & 896) == 256) | fetVar.i(context) | fetVar.h(z2) | fetVar.g(mm40VarN) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                cw6 cw6Var = new cw6((Object) aq7Var, (Object) context, z2, (Object) mm40VarN, (Object) function1, (byte) 2);
                fetVar.o0(cw6Var);
                objP = cw6Var;
            }
            b8k0.e(null, null, ch80VarG, null, null, null, false, null, (Function1) objP, fetVar, 0, 507);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0(mm40Var, z, aq7Var, function1, i);
        }
    }

    public static final void q(l7m0 l7m0Var, int i, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        float f2;
        agk0 agk0Var;
        float f3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1587418060);
        int i3 = i2 | (fetVar2.g(l7m0Var) ? 4 : 2) | (fetVar2.e(i) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = new Object[0];
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new y02(i, (byte) 6);
                fetVar2.o0(objP);
            }
            float fIntValue = ((Number) e9x.Q(objArr, (Function0) objP, fetVar2, 0)).intValue();
            zfn zfnVar = bmd.h;
            float fCeil = (int) Math.ceil(fIntValue / ((w6k) fetVar2.k(zfnVar)).getDensity());
            xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
            zcl zclVar = qmk.f28987a;
            float fB = pkd.b(196.0f, fetVar2);
            Object[] objArr2 = new Object[0];
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new dfr0((byte) 29);
                fetVar2.o0(objP2);
            }
            agk0 agk0Var2 = (agk0) e9x.Q(objArr2, (Function0) objP2, fetVar2, 48);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.a(fB);
                fetVar2.o0(objP3);
            }
            agk0 agk0Var3 = (agk0) objP3;
            boolean zG = fetVar2.g(((qsr0) l7m0Var.getValue()).f.name());
            Object objP4 = fetVar2.P();
            if (zG || objP4 == cl5Var) {
                int iOrdinal = ((qsr0) l7m0Var.getValue()).f.ordinal();
                if (iOrdinal == 0) {
                    f2 = fB;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    f2 = 0.0f;
                }
                agk0Var3.m(f2);
                objP4 = androidx.compose.runtime.e.e(((qsr0) l7m0Var.getValue()).f);
                fetVar2.o0(objP4);
            }
            pz40 pz40Var = (pz40) objP4;
            kfk0 kfk0Var = (kfk0) pz40Var.getValue();
            boolean zG2 = fetVar2.g(pz40Var) | fetVar2.g(xczVarA);
            Object objP5 = fetVar2.P();
            yje yjeVar = null;
            if (zG2 || objP5 == cl5Var) {
                objP5 = new bz0(xczVarA, pz40Var, yjeVar, (byte) 10);
                fetVar2.o0(objP5);
            }
            m0x0.t(fetVar2, kfk0Var, (Function2) objP5);
            l7m0 l7m0VarB = d43.b(agk0Var3.l(), null, null, null, fetVar2, 0, 30);
            l7m0 l7m0VarB2 = d43.b(agk0Var2.l(), null, null, null, fetVar, 0, 30);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            h8x.g(((qsr0) l7m0Var.getValue()).d, fetVar, 0);
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), fCeil);
            boolean zG3 = fetVar.g(l7m0VarB2);
            Object objP6 = fetVar.P();
            if (zG3 || objP6 == cl5Var) {
                objP6 = new mqr0(l7m0VarB2, (byte) 0);
                fetVar.o0(objP6);
            }
            mm40 mm40VarT = i4w0.T(mm40VarE, (Function1) objP6);
            zfn zfnVar2 = zaq0.b;
            long backgroundDark = ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundDark();
            ljc ljcVar = jd8.n;
            zq8.a(0, fetVar, i120.Q(mm40VarT, backgroundDark, ljcVar));
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, fCeil, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
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
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 64.0f), 1.0f);
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
            n0q n0qVar = o7k0.c;
            boolean zG4 = fetVar.g(l7m0VarB2);
            Object objP7 = fetVar.P();
            if (zG4 || objP7 == cl5Var) {
                objP7 = new mqr0(l7m0VarB2, (byte) 1);
                fetVar.o0(objP7);
            }
            zq8.a(0, fetVar, i120.Q(i4w0.T(n0qVar, (Function1) objP7), ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundDark(), ljcVar));
            k9x.c(null, function1, fetVar, (i3 >> 3) & 112);
            fetVar.r(true);
            tj30 tj30VarC3 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC3, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            boolean zE = fetVar.e(((kfk0) pz40Var.getValue()).ordinal());
            Object objP8 = fetVar.P();
            if (zE || objP8 == cl5Var) {
                agk0Var = agk0Var3;
                f3 = fB;
                objP8 = new eh80(agk0Var3.l(), f3, xczVarA, new fc3(agk0Var, (byte) 7), new xar0(function1, (byte) 4));
                fetVar.o0(objP8);
            } else {
                f3 = fB;
                agk0Var = agk0Var3;
            }
            eh80 eh80Var = (eh80) objP8;
            agk0Var2.m(1.0f - (agk0Var.l() / f3));
            tj30 tj30VarC4 = zq8.c(zx7Var, false);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC4, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            l8x.v(s5x0.N(s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).d, 0.0f, 2), 0.0f, 8.0f, 0.0f, 16.0f, 5), ((qsr0) l7m0Var.getValue()).f29270a, fetVar, 0);
            fetVar.r(true);
            boolean zG5 = fetVar.g(l7m0VarB2);
            Object objP9 = fetVar.P();
            if (zG5 || objP9 == cl5Var) {
                objP9 = new mqr0(l7m0VarB2, (byte) 2);
                fetVar.o0(objP9);
            }
            zq8.a(0, fetVar, i120.Q(i4w0.T(n0qVar, (Function1) objP9), ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundDark(), ljcVar));
            float fS0 = ((w6k) fetVar.k(zfnVar)).s0(((Number) l7m0VarB.getValue()).floatValue());
            e3y e3yVar = ((qsr0) l7m0Var.getValue()).b;
            float f4 = ycl.a(fS0, 0.0f) >= 0 ? fS0 : 0.0f;
            int i4 = i3 & 896;
            boolean z3 = i4 == 256;
            Object objP10 = fetVar.P();
            if (z3 || objP10 == cl5Var) {
                function2 = function1;
                objP10 = new ru80(function2, (byte) 17);
                fetVar.o0(objP10);
            } else {
                function2 = function1;
            }
            hmw0.N(jm40Var, e3yVar, eh80Var, f4, xczVarA, (Function2) objP10, fetVar, 6);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            if (((qsr0) l7m0Var.getValue()).e) {
                fetVar2.e0(-918713758);
                m8x.k(jr8.f16991a.b(jm40Var, gqw0.h), ((qsr0) l7m0Var.getValue()).c, function2, fetVar2, i4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-918492728);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cn(l7m0Var, i, function2, i2);
        }
    }

    public static final void r(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-1380527192);
        byte b2 = 2;
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            m8x.y(o7k0.c, u1c.M(558683748, new x6s(function1, (byte) 11), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0L, i120.m, u1c.M(-1378520519, new xs4(l7m0Var, function1, b2), fetVar), fetVar, 805306422, 188);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i, (byte) 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static final void s(mm40 mm40Var, lzh lzhVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        shd shdVar;
        shd shdVar2;
        ?? r2;
        float f2;
        fet fetVar3;
        Function0 function2;
        jm40 jm40Var;
        fet fetVar4;
        fet fetVar5;
        lzh lzhVar2 = lzhVar;
        fet fetVar6 = fetVar;
        function0.getClass();
        function1.getClass();
        fetVar6.g0(254035199);
        if ((i & 6) == 0) {
            i2 = (fetVar6.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar6.g(lzhVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar6.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar6.i(function1) ? 2048 : 1024;
        }
        if (fetVar6.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object obj = lzhVar2.h;
            String str = lzhVar2.f20905a;
            boolean zG = fetVar6.g(obj);
            Object objP = fetVar6.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                objP = new wul(oul.e, oe9.d, new ue9(lzhVar2.i), true, false, true);
                fetVar6.o0(objP);
            }
            wul wulVar = (wul) objP;
            boolean zG2 = fetVar6.g(str);
            Object objP2 = fetVar6.P();
            if (zG2 || objP2 == obj2) {
                if (str == null) {
                    str = "";
                }
                objP2 = new hjm(str, null, null, null, null, null, false, null, null, false, null, null, 8190);
                fetVar6.o0(objP2);
            }
            hjm hjmVar = (hjm) objP2;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar6, 0);
            int iHashCode = Long.hashCode(fetVar6.T);
            bh90 bh90VarM = fetVar6.m();
            mm40 mm40VarC0 = kbc.c0(fetVar6, mm40VarD);
            mkd.c0.getClass();
            fetVar6.i0();
            boolean z = fetVar6.S;
            Function0 function3 = e7z.u1;
            if (z) {
                fetVar6.l(function3);
            } else {
                fetVar6.r0();
            }
            shd shdVar3 = gqw0.x;
            jpm0.o(fetVar6, x5dVarA, shdVar3);
            shd shdVar4 = gqw0.w;
            jpm0.o(fetVar6, bh90VarM, shdVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar5 = gqw0.y;
            jpm0.o(fetVar6, numValueOf, shdVar5);
            jpm0.n(fetVar6);
            shd shdVar6 = gqw0.v;
            jpm0.o(fetVar6, mm40VarC0, shdVar6);
            boolean zW = StringsKt.W(hjmVar.f13167a);
            jm40 jm40Var2 = jm40.b;
            if (zW) {
                shdVar = shdVar4;
                shdVar2 = shdVar6;
                fet fetVar7 = fetVar6;
                r2 = 0;
                f2 = 1.0f;
                fetVar7.e0(-1390539527);
                fetVar7.r(false);
                fetVar3 = fetVar7;
            } else {
                fetVar6.e0(-1390796114);
                zcl zclVar = qmk.f28987a;
                shdVar2 = shdVar6;
                shdVar = shdVar4;
                r2 = 0;
                f2 = 1.0f;
                nkb.h(s5x0.L(o7k0.e(jm40Var2, 40.0f), 8.0f, 0.0f, 2), hjmVar, kjm.f18392a, null, null, null, fetVar, 384, 56);
                fet fetVar8 = fetVar;
                fetVar8.r(false);
                fetVar3 = fetVar8;
            }
            mm40 mm40VarD2 = o7k0.d(jm40Var2, f2);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(o7k0.e(mm40VarD2, 128.0f), vgg0.a(16.0f));
            ((hi0) fetVar3.k(ii0.f14805a)).getClass();
            mm40 mm40VarQ = i120.Q(mm40VarJ, hi0.e, jd8.n);
            Object objP3 = fetVar3.P();
            if (objP3 == obj2) {
                objP3 = dw9.j(fetVar3);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, (gy40) objP3, null, false, null, function1, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, r2);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarW);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(function3);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC, shdVar3);
            jpm0.o(fetVar3, bh90VarM2, shdVar);
            vqd.u(iHashCode2, fetVar3, r20, fetVar3);
            shd shdVar7 = shdVar2;
            jpm0.o(fetVar3, mm40VarC1, shdVar7);
            n0x n0xVar = lzhVar.k;
            fetVar3.e0(-1298267087);
            j0x.b(lv00.T(n0xVar, null, null, null, fetVar, 48, 12), null, yyw.V(jr8.f16991a.b(lgb.J(o7k0.e(o7k0.s(jm40Var2, 256.0f), 128.0f), vgg0.c(0.0f, 16.0f, 0.0f, 0.0f, 13)), gqw0.c), fetVar3.k(bmd.n) == k6z.b ? 1 : r2), null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
            fetVar.r(r2);
            wvb.A(null, hi0.g, hi0.f, fetVar, 6);
            mm40 mm40VarM = s5x0.M(o7k0.c, 16.0f, 12.0f, 16.0f, 8.0f);
            x5d x5dVarA2 = w5d.a(uc9.g, xx7Var, fetVar, 6);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarM);
            fetVar.i0();
            if (fetVar.S) {
                function2 = function3;
                fetVar.l(function2);
            } else {
                function2 = function3;
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar3);
            jpm0.o(fetVar, bh90VarM3, shdVar);
            vqd.u(iHashCode3, fetVar, r20, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar7);
            x5d x5dVarA3 = w5d.a(mw3Var, xx7Var, fetVar, r2);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, jm40Var2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA3, shdVar3);
            jpm0.o(fetVar, bh90VarM4, shdVar);
            vqd.u(iHashCode4, fetVar, shdVar5, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar7);
            lzhVar2 = lzhVar;
            if (lzhVar2.n) {
                fetVar.e0(-1086011479);
                mm40 mm40VarD3 = o7k0.d(o7k0.g(jm40Var2, 20.0f, 0.0f, 2), 1.0f);
                long j = qmk.q;
                long j2 = qmk.s;
                long j3 = qmk.n;
                n05 n05Var = new n05(j, j2, j3);
                String str2 = lzhVar2.c;
                y9q0 y9q0VarJ = g1t0.j();
                zfn zfnVar = m8m0.f21378a;
                jm40Var = jm40Var2;
                v8q0.a(str2, mm40VarD3, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarJ, fetVar, 0, 24960, 110576);
                v8q0.a(lzhVar2.f, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), new n05(qmk.p, j, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 2, null, g1t0.g(), fetVar, 0, 221568, 77808);
                fet fetVar9 = fetVar;
                fetVar9.r(r2);
                fetVar4 = fetVar9;
            } else {
                jm40Var = jm40Var2;
                fetVar.e0(-1084448459);
                mm40 mm40VarD4 = o7k0.d(o7k0.e(jm40Var, 20.0f), 1.0f);
                long j4 = qmk.q;
                long j5 = qmk.s;
                long j6 = qmk.n;
                n05 n05Var2 = new n05(j4, j5, j6);
                String str3 = lzhVar2.d;
                y9q0 y9q0VarJ2 = g1t0.j();
                zfn zfnVar2 = m8m0.f21378a;
                v8q0.a(str3, mm40VarD4, ((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU(), n05Var2, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarJ2, fetVar, 0, 24960, 110576);
                v8q0.a(lzhVar2.e, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), ((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU(), new n05(qmk.p, j4, j6), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 2, null, g1t0.g(), fetVar, 0, 221568, 77808);
                fet fetVar10 = fetVar;
                fetVar10.r(r2);
                fetVar4 = fetVar10;
            }
            fetVar4.r(true);
            if (lzhVar2.m) {
                fetVar4.e0(1995585317);
                qzb.n(o7k0.d(jm40Var, 1.0f), wulVar, function0, fetVar, (i2 & 896) | 6, 0);
                fet fetVar11 = fetVar;
                fetVar11.r(r2);
                fetVar5 = fetVar11;
            } else {
                fetVar4.e0(1995815957);
                fetVar4.r(r2);
                fetVar5 = fetVar4;
            }
            ohs0.x(fetVar5, true, true, true);
            fetVar2 = fetVar5;
        } else {
            fetVar6.X();
            fetVar2 = fetVar6;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 29, i, (Object) mm40Var, (Object) lzhVar2, (Object) function0, (Object) function1);
        }
    }

    public static final void t(String str, fet fetVar, int i) {
        int i2;
        fetVar.g0(1486186033);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 16.0f, 0.0f, 16.0f, 16.0f, 2);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, i2 & 14, 0, 131064);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v((byte) 10, i, str);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void u(mm40 mm40Var, b7m b7mVar, fet fetVar, int i) {
        Object q6mVar;
        b7mVar.getClass();
        fetVar.g0(-1934289993);
        int i2 = i | 6;
        w6m w6mVar = w6m.f38630a;
        int i3 = i2 | (fetVar.g(w6mVar) ? 32 : 16) | (fetVar.g(b7mVar) ? 256 : 128);
        byte b2 = 4;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 >> 3;
            boolean z = (((i4 & 14) ^ 6) > 4 && fetVar.g(w6mVar)) || (i4 & 6) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                if (w6mVar.equals(v6m.f36885a)) {
                    zcl zclVar = qmk.f28987a;
                    q6mVar = new q6m(90.0f, 56.0f);
                } else if (!w6mVar.equals(w6mVar)) {
                    t9f.b();
                    return;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    q6mVar = new q6m(66.0f, 32.0f);
                }
                objP = q6mVar;
                fetVar.o0(objP);
            }
            q6m q6mVar2 = (q6m) objP;
            float f2 = q6mVar2.f28205a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, f2), 40.0f);
            zcl zclVar3 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(mm40VarE, 1.0f, ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU(), new ugg0(zclVar3, zclVar3, zclVar3, zclVar3));
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
            if (b7mVar instanceof y6m) {
                fetVar.e0(-426259260);
                y6m y6mVar = (y6m) b7mVar;
                String str = y6mVar.f42105a;
                u6m u6mVar = u6m.f35142a;
                A(null, str, y6mVar.b, true, q6mVar2.b, fetVar, 24576);
                fetVar.r(false);
            } else if (b7mVar instanceof z6m) {
                fetVar.e0(-425842589);
                z6m z6mVar = (z6m) b7mVar;
                String str2 = z6mVar.f43876a;
                u6m u6mVar2 = u6m.f35142a;
                A(null, str2, z6mVar.b, false, q6mVar2.b, fetVar, 24576);
                fetVar.r(false);
            } else {
                if (!(b7mVar instanceof a7m)) {
                    throw b1j.f(817531604, fetVar, false);
                }
                fetVar.e0(-425446006);
                U(null, ((a7m) b7mVar).f378a, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var, b7mVar, i, b2);
        }
    }

    public static final void v(jkm jkmVar, float f2, Function0 function0, fet fetVar, int i) {
        float f3;
        int i2;
        float f4;
        float f5;
        function0.getClass();
        fetVar.g0(-2061544805);
        int i3 = i | (fetVar.g(jkmVar) ? 4 : 2) | 16 | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                zcl zclVar = qmk.f28987a;
                i2 = i3 & (-113);
                f4 = 48.0f;
            } else {
                fetVar.X();
                i2 = i3 & (-113);
                f4 = f2;
            }
            fetVar.s();
            Context context = (Context) fetVar.k(dy2.b);
            context.getClass();
            boolean z = context.getResources().getBoolean(R.bool.isTablet);
            n0q n0qVar = o7k0.c;
            if (z) {
                zcl zclVar2 = qmk.f28987a;
                f5 = 0.0f;
            } else {
                f5 = f4;
            }
            mm40 mm40VarN = s5x0.N(n0qVar, 0.0f, f5, 0.0f, 0.0f, 13);
            boolean zH = fetVar.h(z);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                objP = new z((byte) 10, z);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new h6c(jkmVar, function0, (byte) 12);
                fetVar.o0(objP2);
            }
            dwi0.b(function1, mm40VarN, (Function1) objP2, fetVar, 0, 0);
            f3 = f4;
        } else {
            fetVar.X();
            f3 = f2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zv((Object) jkmVar, f3, (Object) function0, i, (byte) 3);
        }
    }

    public static final void w(int i, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(-1400268273);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            float f2 = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            hkb.k(i2 & 112, 0, fetVar, s5x0.L(jm40Var, f2, 0.0f, 2), str);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str, i, (byte) 14);
        }
    }

    public static final void x(mm40 mm40Var, hdz hdzVar, l4b l4bVar, Function1 function1, fet fetVar, int i) {
        l4b l4bVar2;
        mm40 mm40Var2;
        l4bVar.getClass();
        function1.getClass();
        fetVar.g0(-929745153);
        int i2 = i | 6 | (fetVar.i(hdzVar) ? 32 : 16) | (fetVar.e(l4bVar.ordinal()) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            n0q n0qVar = o7k0.c;
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(n0qVar, background, vgg0.a(16.0f)), "TRANSACTION_CELL_LAZY_COLUMN");
            ch80 ch80VarG = knm0.g(s5x0.u(xfn.a(fetVar).d, 0.0f, xfn.a(fetVar).d, 12.0f, 2), fetVar);
            boolean z = ((i2 & 112) == 32 || fetVar.i(hdzVar)) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                l4bVar2 = l4bVar;
                objP = new f8m((Object) hdzVar, (Object) l4bVar2, (Object) function1, (byte) 24);
                fetVar.o0(objP);
            } else {
                l4bVar2 = l4bVar;
            }
            b8k0.e(mm40VarE0, null, ch80VarG, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
            mm40Var2 = jm40.b;
        } else {
            l4bVar2 = l4bVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((byte) 0, i, (Object) mm40Var2, (Object) hdzVar, (Object) l4bVar2, (Object) function1);
        }
    }

    public static final void y(g960 g960Var, String str, e960 e960Var, nrq nrqVar, fet fetVar, int i) {
        g960 g960Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1821890501);
        int i2 = i | (fetVar2.g(g960Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.i(e960Var) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 280.0f);
            long jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarE, jM75getBlack600d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "NUMBERS_GAME_TABLE_BOX");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            mm40 mm40VarE2 = o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 210.0f), 38.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE2);
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
            k7x.a(g960Var.b, null, o7k0.c, null, null, fetVar, 432, 2040);
            int i3 = i2 >> 3;
            v8q0.a(str, o7k0.d(jm40Var, 1.0f), ijg.x1, null, qmk.r, null, null, nrqVar, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, null, fetVar, (i3 & 14) | 12582960, 24960, 240488);
            fetVar.r(true);
            ry7.a(k7n0.H(s5x0.N(jm40Var, 0.0f, 20.0f, 0.0f, 0.0f, 13), 1.0f), e960Var, g960Var, nrqVar, fetVar, ((i2 << 6) & 896) | (i3 & 112) | 64 | 3072);
            g960Var2 = g960Var;
            k7x.a(g960Var2.f10898a, null, o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 138.0f), 318.0f), null, null, fetVar, 48, 2040);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            g960Var2 = g960Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 9, i, (Object) g960Var2, (Object) str, (Object) e960Var, (Object) nrqVar);
        }
    }

    public static final void z(String str, String str2, fet fetVar, int i) {
        String str3;
        fet fetVar2;
        fetVar.g0(-776350185);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean zW = StringsKt.W(str2);
            jm40 jm40Var = jm40.b;
            if (zW) {
                fetVar.e0(151275378);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                str3 = str;
                fetVar2 = fetVar;
                nkb.h(s5x0.L(s5x0.N(mm40VarD, 0.0f, 4.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).d, 0.0f, 2), new hjm(str, new ojm(127), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()), null, null, null, false, null, null, false, null, null, 8184), kjm.b, null, null, null, fetVar2, 384, 56);
                fetVar2.r(false);
            } else {
                fetVar.e0(150633957);
                mm40 mm40VarL = s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).f39080a, 0.0f, 2);
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
                zcl zclVar2 = qmk.f28987a;
                fetVar2 = fetVar;
                nkb.h(s5x0.N(jm40Var, 16.0f, 4.0f, 0.0f, 0.0f, 12), new hjm(str, new ojm(127), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary()), null, null, null, false, null, null, false, null, null, 8184), kjm.b, null, null, null, fetVar2, 384, 56);
                t(str2, fetVar2, (i2 >> 3) & 14);
                fetVar2.r(true);
                fetVar2.r(false);
                str3 = str;
            }
        } else {
            str3 = str;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 12, i, str3, str2);
        }
    }
}
