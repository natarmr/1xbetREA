package a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.javax.sip.message.Response;
import android.util.Log;
import android.util.Xml;
import android.view.Window;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class jd8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f16316a = new Object();
    public static final ugd b = new ugd(1950186028, false, new i5b(15));
    public static final ugd c = new ugd(2064936018, false, new ehd(1));
    public static final ugd d = new ugd(329674302, false, new fhd(26));
    public static final ugd e = new ugd(-1649733313, false, new fhd(27));
    public static final ugd f = new ugd(2118997006, false, new ihd(29));
    public static final ugd g = new ugd(-1034809382, false, new ohd(0));
    public static final int[] h = new int[0];
    public static final long[] i = new long[0];
    public static final Object[] j = new Object[0];
    public static final zzc0 k = new zzc0("image-destination");
    public static final zzc0 l = new zzc0("image-replacement-text-is-link");
    public static final zzc0 m = new zzc0("image-size");
    public static final ljc n = new ljc(3);

    public static final void A(mm40 mm40Var, zce zceVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(-1570947301);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(zceVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(new qkx(0L));
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            n0q n0qVar = o7k0.c;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new wil(pz40Var, (byte) 21);
                fetVar.o0(objP2);
            }
            mm40 mm40VarY = fre0.Y(n0qVar, (Function1) objP2);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
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
            float fT = f7k.T((int) (((qkx) pz40Var.getValue()).f28908a >> 32));
            float fT2 = f7k.T((int) (((qkx) pz40Var.getValue()).f28908a & 4294967295L));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, fT, fT2);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int i4 = i3;
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            mdm mdmVar = zceVar.f44162a;
            boolean z2 = (i4 & 896) == 256;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new s8o(function1, (byte) 6);
                fetVar.o0(objP3);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP3, fetVar, 0, 4);
            fetVar.r(true);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var2, (Object) zceVar, (Object) function1, i2, (byte) 4);
        }
    }

    public static final void B(qqo qqoVar, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        fet fetVar2 = fetVar;
        qqoVar.getClass();
        function1.getClass();
        fetVar2.g0(927385780);
        int i3 = i2 | (fetVar2.g(qqoVar) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new s8o(function1, (byte) 5);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 32;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new s8o(function1, (byte) 8);
                fetVar2.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar2, 0, 4);
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "EXPRESS_DAY_SCREEN_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            imm immVar = qqoVar.f29176a;
            pde pdeVar = qqoVar.c;
            boolean z3 = i4 == 32;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new s8o(function1, (byte) 9);
                fetVar2.o0(objP3);
            }
            Function0 function3 = (Function0) objP3;
            boolean z4 = i4 == 32;
            Object objP4 = fetVar2.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new btm(function1, (byte) 27);
                fetVar2.o0(objP4);
            }
            hlm.c(null, immVar, null, function3, null, (Function1) objP4, null, null, null, null, null, null, fetVar, 0, 0, 4053);
            mm40 mm40VarQ = i120.Q(jm40.b, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 12.0f, 8.0f);
            wro wroVar = qqoVar.b;
            a4x a4xVar = wroVar.f39653a;
            dxh0 dxh0Var = wroVar.b;
            boolean z5 = (i3 & 14) == 4;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new ntl(qqoVar, (byte) 19);
                fetVar.o0(objP5);
            }
            Function0 function4 = (Function0) objP5;
            boolean z6 = i4 == 32;
            Object objP6 = fetVar.P();
            if (z6 || objP6 == cl5Var) {
                function2 = function1;
                objP6 = new btm(function2, (byte) 28);
                fetVar.o0(objP6);
            } else {
                function2 = function1;
            }
            ibc.n(mm40VarK, a4xVar, gxh0.f12078a, dxh0Var, false, function4, (Function1) objP6, fetVar, 384, 16);
            fetVar2 = fetVar;
            mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
            if (pdeVar instanceof zce) {
                fetVar2.e0(-500545138);
                A(null, (zce) pdeVar, function2, fetVar2, (i3 << 3) & 896);
                fetVar2.r(false);
            } else if (pdeVar instanceof fde) {
                fetVar2.e0(-500361711);
                G((i3 << 3) & 896, fetVar2, ((fde) pdeVar).f9354a, null, function2);
                fetVar2.r(false);
            } else {
                if (!(pdeVar instanceof kde)) {
                    throw b1j.f(1507872643, fetVar2, false);
                }
                fetVar2.e0(-500181167);
                G((i3 << 3) & 896, fetVar2, ((kde) pdeVar).f18102a, null, function2);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(qqoVar, function2, i2, (byte) 23);
        }
    }

    public static final void C(mm40 mm40Var, String str, String str2, String str3, long j2, String str4, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-141509564);
        int i3 = i2 | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(str3) ? 2048 : 1024) | (fetVar2.f(j2) ? 16384 : 8192) | (fetVar2.g(str4) ? 131072 : 65536);
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            Context context = (Context) fetVar2.k(dy2.b);
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = j1t0.f15753a;
                context.getClass();
                str4.getClass();
                objP.getClass();
                if (str4.length() != 0) {
                    try {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(new File(context.getCacheDir(), str4));
                        typefaceCreateFromFile.getClass();
                        objP = lv00.E(typefaceCreateFromFile);
                    } catch (Exception unused) {
                    }
                }
                fetVar2.o0(objP);
            }
            nrq nrqVar = (nrq) objP;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = rq8.K(o7k0.e(o7k0.s(jm40Var, 88.0f), 44.0f), new bx((byte) 21, j2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            n0q n0qVar = o7k0.c;
            k7x.a(str, null, n0qVar, null, null, fetVar2, ((i3 >> 3) & 14) | 432, 2040);
            mm40 mm40VarE = s5x0.N(jm40Var, 0.0f, 0.0f, 12.0f, 0.0f, 11).e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.o, fetVar2, 54);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
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
            mm40 mm40VarS = o7k0.s(jm40Var, 32.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str2, mm40VarS, staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.f(), fetVar2, (i3 >> 6) & 14, 24960, 109560);
            v8q0.a(str3, o7k0.s(jm40Var, 32.0f), staticColors.m123getWhite0d7_KjU(), null, qmk.t, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0.a(g1t0.f(), 0L, 0L, null, null, nrqVar, 0L, null, null, 0, 1, 0L, null, null, 16711647), fetVar, (i3 >> 9) & 14, 24960, 109544);
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
            yfe0VarU.d = new mea(mm40Var2, str, str2, str3, j2, str4, i2, (byte) 1);
        }
    }

    public static final void D(mm40 mm40Var, jea jeaVar, fet fetVar, int i2) {
        byte b2;
        fet fetVar2 = fetVar;
        fetVar2.g0(831525806);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(jeaVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
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
            C(null, jeaVar.f16364a, jeaVar.b, jeaVar.c, jeaVar.g, jeaVar.j, fetVar2, 0);
            b2 = 1;
            v8q0.a(jeaVar.i, null, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            N(null, jeaVar.d, jeaVar.e, jeaVar.f, jeaVar.h, jeaVar.j, fetVar2, 0);
            fetVar2.r(true);
        } else {
            b2 = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(mm40Var, jeaVar, i2, b2);
        }
    }

    public static final void E(mm40 mm40Var, hjm hjmVar, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1574185730);
        int i3 = i2 | 6 | (fetVar.g(hjmVar) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var2);
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
            nkb.h(null, hjmVar, kjm.b, null, null, null, fetVar, (i3 & 112) | 384, 57);
            mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iak0(mm40Var2, hjmVar, i2, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    public static final void F(mm40 mm40Var, sfl0 sfl0Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(-7581824);
        int i3 = i2 | 6 | (fetVar.e(sfl0Var.ordinal()) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            int iOrdinal = sfl0Var.ordinal();
            zfi0 zfi0Var = zfi0.f44303a;
            mm40Var2 = jm40.b;
            if (iOrdinal == 0) {
                fetVar.e0(1303808686);
                mbc.o(zfi0Var, null, false, fetVar, 6, 6);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(1763756932);
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(1303808686);
                mbc.o(zfi0Var, null, false, fetVar, 6, 6);
                fetVar.r(false);
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    throw b1j.f(1303805074, fetVar, false);
                }
                fetVar.e0(1303808686);
                mbc.o(zfi0Var, null, false, fetVar, 6, 6);
                fetVar.r(false);
            } else {
                fetVar.e0(1763481652);
                mm40 mm40VarN = s5x0.N(mm40Var2, xfn.a(fetVar).e, 0.0f, 0.0f, 0.0f, 14);
                zcl zclVar = qmk.f28987a;
                mbc.o(zfi0Var, s5x0.N(mm40VarN, 20.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar, 6, 4);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(mm40Var2, sfl0Var, i2, (byte) 5);
        }
    }

    public static final void G(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        mm40 mm40Var2;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(1027061216);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), n), "EXPRESS_ITEMS_LAZY_COLUMN");
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(f2, 12.0f, f3, 24.0f, fetVar);
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new or0(a4xVar, function1, (byte) 14);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE0, null, ch80VarF, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(mm40Var2, a4xVar, function1, i2, (byte) 6);
        }
    }

    public static final void H(int i2, fet fetVar) {
        fetVar.g0(-1394568729);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarQ = i120.Q(n0qVar, ((StaticColors) fetVar.k(zfnVar)).m109getOverlayBackground400d7_KjU(), n);
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
            kpb.j(null, new dkm((ycl) null, new y3d(((StaticColors) fetVar.k(zfnVar)).m131getWhite800d7_KjU()), 3), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b4u0(i2, (byte) 10);
        }
    }

    public static final void I(mm40 mm40Var, p6w p6wVar, boolean z, qdz qdzVar, e2d e2dVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(-217933432);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(p6wVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(qdzVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(e2dVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            if (p6wVar instanceof m6w) {
                fetVar.e0(1536032893);
                x(mm40Var, ((m6w) p6wVar).f21291a, function1, fetVar, (i4 & 14) | ((i4 >> 9) & 896));
                fetVar.r(false);
            } else if (p6wVar instanceof n6w) {
                fetVar.e0(1019385144);
                R(mm40Var, (n6w) p6wVar, fetVar, i4 & 126);
                fetVar.r(false);
            } else {
                if (!(p6wVar instanceof o6w)) {
                    throw b1j.f(1019379136, fetVar, false);
                }
                fetVar.e0(1536270260);
                fetVar2 = fetVar;
                L(null, z, function1, u1c.M(-1487329703, new iwy(p6wVar, mm40Var, qdzVar, e2dVar, function1, (byte) 2), fetVar), fetVar2, ((i4 >> 3) & 112) | 3072 | ((i4 >> 9) & 896));
                fetVar2.r(false);
            }
            fetVar2 = fetVar;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mwy(mm40Var, p6wVar, z, qdzVar, e2dVar, function1, i2, (byte) 2);
        }
    }

    public static final void J(mm40 mm40Var, my30 my30Var, p6t0 p6t0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        mm40 mm40VarN;
        mm40 mm40VarQ;
        mm40 mm40VarN2;
        fetVar.g0(990843038);
        int i3 = i2 | 6 | (fetVar.g(my30Var) ? 32 : 16) | (fetVar.g(p6t0Var) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = p6t0Var == null || (p6t0Var instanceof pqv);
            boolean z2 = ((my30Var instanceof hy30) || p6t0Var == null || (p6t0Var instanceof pqv) || (p6t0Var instanceof hy30)) ? false : true;
            boolean zY0 = my30Var.y0();
            mm40Var2 = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (zY0) {
                fetVar.e0(-1104833452);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN3 = s5x0.N(mm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                boolean z3 = (i3 & 7168) == 2048;
                Object objP = fetVar.P();
                if (z3 || objP == cl5Var) {
                    objP = new y7(function1, (byte) 6);
                    fetVar.o0(objP);
                }
                zvw.i(mm40VarN3, my30Var, (Function1) objP, fetVar, i3 & 112, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-1104559567);
                if (z) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40VarN = s5x0.N(mm40Var2, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                } else {
                    mm40VarN = mm40Var2;
                }
                if (z) {
                    fetVar.e0(-1104277064);
                    long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                    zcl zclVar3 = qmk.f28987a;
                    zcl zclVar4 = qmk.i;
                    mm40VarQ = i120.Q(mm40Var2, backgroundContent, new ugg0(zclVar3, zclVar3, zclVar4, zclVar4));
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1103793123);
                    mm40VarQ = i120.Q(mm40Var2, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), n);
                    fetVar.r(false);
                }
                mm40 mm40VarE = mm40VarN.e(mm40VarQ);
                if (my30Var instanceof hy30) {
                    zcl zclVar5 = qmk.f28987a;
                    mm40VarN2 = s5x0.N(s5x0.L(mm40Var2, 12.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, z ? 8.0f : 0.0f, 5);
                } else {
                    zcl zclVar6 = qmk.f28987a;
                    mm40VarN2 = s5x0.N(mm40Var2, 24.0f, 0.0f, 0.0f, 0.0f, 14);
                }
                mm40 mm40VarE2 = mm40VarE.e(mm40VarN2).e(z ? s5x0.N(mm40Var2, 0.0f, 0.0f, 0.0f, 4.0f, 7) : mm40Var2);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE2);
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
                boolean z4 = (r12 & 7168) == 2048;
                Object objP2 = fetVar.P();
                if (z4 || objP2 == cl5Var) {
                    objP2 = new y7(function1, (byte) 7);
                    fetVar.o0(objP2);
                }
                zvw.i(null, my30Var, (Function1) objP2, fetVar, i3 & 112, 1);
                if (z2) {
                    fetVar.e0(-1462956550);
                    mbc.o(zfi0.f44303a, jr8.f16991a.b(s5x0.N(mm40Var2, 48.0f, 0.0f, 0.0f, 0.0f, 14), gqw0.i), false, fetVar, 6, 4);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1462708178);
                    fetVar.r(false);
                }
                fetVar.r(true);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 5, i2, mm40Var2, my30Var, p6t0Var, function1);
        }
    }

    public static final void K(mm40 mm40Var, vno0 vno0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        Function1 function2;
        function1.getClass();
        fetVar.g0(1790687361);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(vno0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            d9z d9zVarA = f9z.a(fetVar);
            Boolean boolValueOf = Boolean.valueOf(vno0Var.f37729a);
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean zG = (i5 == 256) | (i4 == 32) | fetVar.g(d9zVarA);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                Object w090Var = new w090((Object) vno0Var, (Object) d9zVarA, (Object) function1, (yje) null, (byte) 25);
                function2 = function1;
                fetVar.o0(w090Var);
                objP = w090Var;
            } else {
                function2 = function1;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP);
            n0q n0qVar = o7k0.c;
            ngv ngvVar = new ngv(2);
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(f2, 8.0f, f3, 20.0f, fetVar);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = (i4 == 32) | (i5 == 256);
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new ka70(vno0Var, function2, (byte) 20);
                fetVar.o0(objP2);
            }
            g8x.i(ngvVar, n0qVar, d9zVarA, ch80VarF, null, qw3Var, null, false, null, (Function1) objP2, fetVar, 0, 944);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var2, vno0Var, function1, i2, (byte) 7);
        }
    }

    public static final void L(mm40 mm40Var, boolean z, Function1 function1, ugd ugdVar, fet fetVar, int i2) {
        boolean z2;
        mm40 mm40Var2;
        fetVar.g0(1945124461);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            z2 = z;
            i3 |= fetVar.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z3 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new ia30(function1, (byte) 27);
                fetVar.o0(objP);
            }
            mom.c(n0qVar, z2, womVarF, null, false, null, (Function0) objP, null, ugdVar, fetVar, (i3 & 112) | ((i3 << 15) & 234881024), 184);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new an2(mm40Var2, z, function1, ugdVar, i2, (byte) 6);
        }
    }

    public static final void M(mm40 mm40Var, xcz xczVar, qdz qdzVar, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1094952841);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(qdzVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(l7m0Var2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            n0q n0qVar = o7k0.c;
            boolean z = !((Boolean) l7m0Var2.getValue()).booleanValue();
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var, null, knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 28.0f, 7), fetVar), z, null, u1c.M(1667422987, new rkb(qdzVar, function1, (byte) 7), fetVar), fetVar, (i3 & 112) | 100663296 | ((i3 >> 3) & 896), 152);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uap0(mm40Var2, xczVar, qdzVar, l7m0Var, l7m0Var2, function1, i2, (byte) 0);
        }
    }

    public static final void N(mm40 mm40Var, String str, String str2, String str3, long j2, String str4, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(994584676);
        int i3 = i2 | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(str3) ? 2048 : 1024) | (fetVar2.f(j2) ? 16384 : 8192) | (fetVar2.g(str4) ? 131072 : 65536);
        if (fetVar2.U(i3 & 1, (74899 & i3) != 74898)) {
            Context context = (Context) fetVar2.k(dy2.b);
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = j1t0.f15753a;
                context.getClass();
                str4.getClass();
                objP.getClass();
                if (str4.length() != 0) {
                    try {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(new File(context.getCacheDir(), str4));
                        typefaceCreateFromFile.getClass();
                        objP = lv00.E(typefaceCreateFromFile);
                    } catch (Exception unused) {
                    }
                }
                fetVar2.o0(objP);
            }
            nrq nrqVar = (nrq) objP;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = rq8.K(o7k0.e(o7k0.s(jm40Var, 88.0f), 44.0f), new bx((byte) 21, j2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            n0q n0qVar = o7k0.c;
            k7x.a(str, null, n0qVar, null, null, fetVar2, ((i3 >> 3) & 14) | 432, 2040);
            mm40 mm40VarE = s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14).e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 54);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
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
            mm40 mm40VarS = o7k0.s(jm40Var, 32.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str2, mm40VarS, staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.f(), fetVar2, (i3 >> 6) & 14, 24960, 109560);
            v8q0.a(str3, o7k0.s(jm40Var, 32.0f), staticColors.m123getWhite0d7_KjU(), null, qmk.t, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0.a(g1t0.f(), 0L, 0L, null, null, nrqVar, 0L, null, null, 0, 1, 0L, null, null, 16711647), fetVar, (i3 >> 9) & 14, 24960, 109544);
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
            yfe0VarU.d = new mea(mm40Var2, str, str2, str3, j2, str4, i2, (byte) 0);
        }
    }

    public static final void O(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(249285286);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 48.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i2, (byte) 23);
        }
    }

    public static final void P(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-902050519);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), 1.0f), 24.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i2, (byte) 10);
        }
    }

    public static final void Q(mm40 mm40Var, zeb zebVar, fet fetVar, int i2) {
        fetVar.g0(-647555108);
        int i3 = i2 | 6 | (fetVar.g(zebVar) ? 32 : 16);
        byte b2 = 2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            float f2 = xfn.a(fetVar).e;
            float f3 = xfn.a(fetVar).e;
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(f2, 6.0f, f3, 16.0f);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new vwy(zebVar, b2);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            b8k0.e(jm40Var, null, lh80Var, null, null, null, false, null, (Function1) objP, fetVar, 12582918, 378);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywy(mm40Var, zebVar, i2, b2);
        }
    }

    public static final void R(mm40 mm40Var, n6w n6wVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1389591591);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(n6wVar) ? 32 : 16;
        }
        byte b3 = 18;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(6.0f, true, new jf4((byte) 14));
            lh80 lh80Var = new lh80(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 32.0f);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new tr20(n6wVar, b3);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i3 & 14) | 12582912, 362);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kwy(mm40Var, n6wVar, i2, b2);
        }
    }

    public static final void S(mm40 mm40Var, k72 k72Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(85729608);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(k72Var) ? 32 : 16) | (fetVar2.g(qdzVar) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) fetVar2.k(dy2.b);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            boolean zC = pkd.c(fetVar2);
            byte b2 = 7;
            e2d e2dVarD = nip.d(null, null, fetVar2, 7);
            Boolean boolValueOf = Boolean.valueOf(zC);
            boolean zI = fetVar2.i(window) | fetVar2.i(context) | fetVar2.h(zC);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new la2(window, context, zC, b2);
                fetVar2.o0(objP);
            }
            s0x.d(boolValueOf, null, (Function1) objP, fetVar2, 0);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
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
            mm40 mm40VarX = yyw.X(jm40.b, null, fetVar2, 1);
            qim qimVar = k72Var.f17797a;
            boolean z2 = (i3 & 7168) == 2048;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new abh0(function1, (byte) 20);
                fetVar2.o0(objP2);
            }
            ckb.k(mm40VarX, qimVar, true, e2dVarD, null, (Function1) objP2, fetVar, 24960, 0);
            fetVar2 = fetVar;
            mm40 mm40VarC = nip.c(i120.Q(n0qVar, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), n), e2dVarD, fetVar2, 0);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarC);
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
            afb afbVar = k72Var.b;
            if (afbVar instanceof yeb) {
                fetVar2.e0(1238704958);
                y(null, ((yeb) afbVar).f42477a, function1, fetVar2, (i3 >> 3) & 896);
                fetVar2.r(false);
            } else if (afbVar instanceof zeb) {
                fetVar2.e0(-375679353);
                Q(null, (zeb) afbVar, fetVar2, 0);
                fetVar2.r(false);
            } else {
                if (!(afbVar instanceof xeb)) {
                    throw b1j.f(-375686177, fetVar2, false);
                }
                fetVar2.e0(1238928840);
                p(null, (xeb) afbVar, k72Var.c, k72Var.d, e2dVarD, qdzVar, function1, fetVar2, (i3 << 9) & 4128768);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0(mm40Var, (Object) k72Var, (Object) qdzVar, function1, i2, (byte) 23);
        }
    }

    public static final void T(mm40 mm40Var, fql0 fql0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        mm40 mm40VarN;
        fetVar.g0(852441586);
        int i3 = i2 | 6 | (fetVar.g(fql0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            int iOrdinal = fql0Var.g.ordinal();
            if (iOrdinal == 3 || iOrdinal == 4) {
                fetVar.e0(155501143);
                mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar).b, 0.0f, 2);
                zcl zclVar = qmk.f28987a;
                mm40VarN = s5x0.N(mm40VarL, 20.0f, 0.0f, 0.0f, 0.0f, 14);
                fetVar.r(false);
            } else {
                fetVar.e0(1251948632);
                mm40VarN = s5x0.L(jm40Var, xfn.a(fetVar).b, 0.0f, 2);
                fetVar.r(false);
            }
            b8l0 b8l0Var = fql0Var.d;
            d4d d4dVar = fql0Var.e;
            n3l0 n3l0Var = fql0Var.f;
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean z = (i4 == 32) | (i5 == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new qwy(fql0Var, function1, (byte) 6);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = (i4 == 32) | (i5 == 256);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new qwy(fql0Var, function1, (byte) 7);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z3 = (i5 == 256) | (i4 == 32);
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new qwy(function1, fql0Var);
                fetVar.o0(objP3);
            }
            Function0 function3 = (Function0) objP3;
            boolean z4 = (i5 == 256) | (i4 == 32);
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new rwy(fql0Var, function1, (byte) 3);
                fetVar.o0(objP4);
            }
            xbc.o(mm40VarN, b8l0Var, n3l0Var, d4dVar, false, function0, function2, function3, (Function1) objP4, fetVar, 0, 16);
            F(null, fql0Var.g, fetVar, 0);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new swy(mm40Var2, fql0Var, function1, i2, (byte) 3);
        }
    }

    public static final void U(mm40 mm40Var, o6w o6wVar, qdz qdzVar, e2d e2dVar, Function1 function1, fet fetVar, int i2) {
        mtl mtlVar = o6wVar.c;
        fetVar.g0(-1593241366);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(o6wVar) ? 32 : 16) | (fetVar.g(qdzVar) ? 256 : 128) | (fetVar.g(e2dVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            xcz xczVarB = qdzVar.b("ALT_HISTORY_RESULTS_SCREEN", new ei20((byte) 28), fetVar, (i3 & 896) | 6);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            WeakHashMap weakHashMap = djv0.w;
            int i4 = zcm0.i(fetVar).c.e().d - zcm0.i(fetVar).e.e().d;
            if (i4 < 0) {
                i4 = 0;
            }
            float fR0 = w6kVar.r0(i4);
            zcl zclVar = qmk.f28987a;
            float fMax = Math.max(0.0f, fR0 - 56.0f);
            mm40 mm40VarV = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (e2dVar != null) {
                fetVar.e0(-569237376);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new j6g0((byte) 17);
                    fetVar.o0(objP);
                }
                mm40VarV = cjx.V(mm40VarV, e2d.b(e2dVar, (Function0) objP), null);
                fetVar.r(false);
            } else {
                fetVar.e0(-569146112);
                fetVar.r(false);
            }
            mm40 mm40VarE0 = o2e.e0(s5x0.N(mm40Var.e(o7k0.c), 0.0f, 0.0f, 0.0f, fMax, 7), "TAG_RESULTS_SPORTS_ROOT");
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
            mm40 mm40VarE = mm40VarV.e(ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, true));
            qw3 qw3Var = new qw3(6.0f, true, new jf4((byte) 14));
            ch80 ch80VarF = h97.f(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 32.0f, fetVar);
            boolean z = ((i3 & 112) == 32) | ((57344 & i3) == 16384);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new twy(o6wVar, function1, (byte) 2);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarE, xczVarB, ch80VarF, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            if (mtlVar != null) {
                fetVar.e0(-62029234);
                cfx0.b(null, mtlVar, function1, fetVar, (i3 >> 6) & 896);
                fetVar.r(false);
            } else {
                fetVar.e0(-61887006);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wwy(mm40Var, o6wVar, qdzVar, e2dVar, function1, i2, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:76:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x0201  */
    /* JADX WARN: Code duplicated, block: B:84:0x020a  */
    public static final void V(l7m0 l7m0Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        boolean z;
        cl5 cl5Var;
        boolean z2;
        Object objP;
        boolean z3;
        Object objP2;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        qdzVar.getClass();
        function2.getClass();
        fetVar2.g0(55332773);
        int i3 = i2 | (fetVar2.g(l7m0Var) ? 4 : 2) | (fetVar2.g(qdzVar) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = new Object[0];
            int i4 = i3 & 14;
            boolean z4 = i4 == 4;
            Object objP3 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z4 || objP3 == cl5Var2) {
                objP3 = new g7o0(l7m0Var, (byte) 12);
                fetVar2.o0(objP3);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP3, fetVar2);
            Object[] objArr2 = new Object[0];
            boolean z5 = i4 == 4;
            Object objP4 = fetVar2.P();
            if (z5 || objP4 == cl5Var2) {
                objP4 = new g7o0(l7m0Var, (byte) 13);
                fetVar2.o0(objP4);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP4, fetVar2);
            Object[] objArr3 = new Object[0];
            boolean z6 = i4 == 4;
            Object objP5 = fetVar2.P();
            if (z6 || objP5 == cl5Var2) {
                objP5 = new g7o0(l7m0Var, (byte) 14);
                fetVar2.o0(objP5);
            }
            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP5, fetVar2);
            int i5 = (i3 << 3) & 896;
            xcz xczVarB = qdzVar.b(((r8p0) l7m0VarY2.getValue()).f30039a, new ofo0((byte) 24), fetVar2, i5);
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), n);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            imm immVar = ((p9p0) l7m0VarY.getValue()).f26619a;
            int i6 = i3 & 896;
            boolean z7 = i6 == 256;
            Object objP6 = fetVar2.P();
            byte b2 = 6;
            if (z7 || objP6 == cl5Var2) {
                objP6 = new g4p0(function2, b2);
                fetVar2.o0(objP6);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP6, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            fetVar2 = fetVar;
            qap0 qap0Var = (qap0) l7m0VarY3.getValue();
            byte b3 = 9;
            if (Intrinsics.d(qap0Var, oap0.f24939a)) {
                fetVar2.e0(1101127464);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 8.0f, 1);
                cpm cpmVar = ((r8p0) l7m0VarY2.getValue()).b;
                boolean z8 = i6 == 256;
                Object objP7 = fetVar2.P();
                if (z8) {
                    cl5Var = cl5Var2;
                } else {
                    cl5Var = cl5Var2;
                    if (objP7 == cl5Var) {
                    }
                    u1c.i(mm40VarL, cpmVar, (Function1) objP7, fetVar2, 0, 4);
                    Object[] objArr4 = new Object[0];
                    if (i4 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = fetVar2.P();
                    if (z2 || objP == cl5Var) {
                        objP = new g7o0(l7m0Var, (byte) 15);
                        fetVar2.o0(objP);
                    }
                    l7m0 l7m0VarY4 = v3c.Y(objArr4, (Function0) objP, fetVar2);
                    Object[] objArr5 = new Object[0];
                    if (i4 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objP2 = fetVar2.P();
                    if (z3 || objP2 == cl5Var) {
                        objP2 = new g7o0(l7m0Var, (byte) 16);
                        fetVar2.o0(objP2);
                    }
                    z = true;
                    M(null, xczVarB, qdzVar, l7m0VarY4, v3c.Y(objArr5, (Function0) objP2, fetVar2), function2, fetVar2, i5 | (458752 & (i3 << 9)));
                    function2 = function2;
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                }
                objP7 = new coo0(function2, (byte) 6);
                fetVar2.o0(objP7);
                u1c.i(mm40VarL, cpmVar, (Function1) objP7, fetVar2, 0, 4);
                Object[] objArr6 = new Object[0];
                if (i4 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = fetVar2.P();
                if (z2) {
                    objP = new g7o0(l7m0Var, (byte) 15);
                    fetVar2.o0(objP);
                } else {
                    objP = new g7o0(l7m0Var, (byte) 15);
                    fetVar2.o0(objP);
                }
                l7m0 l7m0VarY5 = v3c.Y(objArr6, (Function0) objP, fetVar2);
                Object[] objArr7 = new Object[0];
                if (i4 == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP2 = fetVar2.P();
                if (z3) {
                    objP2 = new g7o0(l7m0Var, (byte) 16);
                    fetVar2.o0(objP2);
                } else {
                    objP2 = new g7o0(l7m0Var, (byte) 16);
                    fetVar2.o0(objP2);
                }
                z = true;
                M(null, xczVarB, qdzVar, l7m0VarY5, v3c.Y(objArr7, (Function0) objP2, fetVar2), function2, fetVar2, i5 | (458752 & (i3 << 9)));
                function2 = function2;
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                z = true;
                if (!(qap0Var instanceof pap0)) {
                    throw b1j.f(1420990904, fetVar2, false);
                }
                fetVar2.e0(1101939447);
                Object[] objArr8 = new Object[0];
                boolean zI = fetVar2.i(qap0Var);
                Object objP8 = fetVar2.P();
                if (zI || objP8 == cl5Var2) {
                    objP8 = new nxo0((pap0) qap0Var, b3);
                    fetVar2.o0(objP8);
                }
                r(v3c.Y(objArr8, (Function0) objP8, fetVar2), function2, fetVar2, (i3 >> 3) & 112);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn(l7m0Var, qdzVar, function2, i2, (byte) 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final void W(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        ?? r0;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1508446602);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), n);
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
            if (((gbu0) l7m0Var.getValue()).c) {
                fetVar.e0(367638122);
                mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                imm immVar = ((gbu0) l7m0Var.getValue()).f11030a;
                boolean z = (i3 & 112) == 32;
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    objP = new zbt0(function1, (byte) 14);
                    fetVar.o0(objP);
                }
                r0 = 0;
                hlm.c(mm40VarD, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
                fetVar.r(false);
            } else {
                r0 = 0;
                fetVar.e0(367949486);
                fetVar.r(false);
            }
            bau0 bau0Var = ((gbu0) l7m0Var.getValue()).b;
            if (bau0Var instanceof z9u0) {
                fetVar.e0(1951535864);
                z((z9u0) bau0Var, function1, fetVar, i3 & 112);
                fetVar.r(r0);
            } else if (bau0Var instanceof y9u0) {
                fetVar.e0(1951540986);
                q((y9u0) bau0Var, function1, fetVar, ((i3 << 3) & 896) | 6);
                fetVar.r(r0);
            } else {
                if (!bau0Var.equals(aau0.f549a)) {
                    throw b1j.f(1951532723, fetVar, r0);
                }
                fetVar.e0(1951545981);
                H(r0, fetVar);
                fetVar.r(r0);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function1, i2, (byte) 13);
        }
    }

    public static final int X(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int Y(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final mm40 Z(final float f2, final float f3) {
        if (ycl.a(f2, 0.0f) > 0) {
            ycl.a(f3, 0.0f);
        }
        final int i2 = 0;
        final boolean z = true;
        return i4w0.T(jm40.b, new Function1() { // from class: a.za8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ljc ljcVar = jd8.n;
                uag0 uag0Var = (uag0) obj;
                float density = uag0Var.t.getDensity() * f2;
                float density2 = uag0Var.t.getDensity() * f3;
                uag0Var.j((density <= 0.0f || density2 <= 0.0f) ? null : new wa8(density, density2, i2));
                uag0Var.D(ljcVar);
                uag0Var.g(z);
                return Unit.f46060a;
            }
        });
    }

    public static final void a(mm40 mm40Var, uno0 uno0Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        Function1 function2;
        function1.getClass();
        fetVar.g0(-785306032);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(uno0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Boolean boolValueOf = Boolean.valueOf(uno0Var.f35974a);
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean zG = (i5 == 256) | (i4 == 32) | fetVar.g(xczVarA);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                Object m1Var = new m1((Object) uno0Var, (Object) xczVarA, (Object) function1, (yje) null, (byte) 7);
                function2 = function1;
                fetVar.o0(m1Var);
                objP = m1Var;
            } else {
                function2 = function1;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP);
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "MENU_ACCORDION_GRID");
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(f2, 8.0f, f3, 20.0f, fetVar);
            boolean z = (i4 == 32) | (i5 == 256);
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new k1(uno0Var, function2, (byte) 4);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarE0, xczVarA, ch80VarF, null, null, null, false, null, (Function1) objP2, fetVar, 0, Response.SERVER_TIMEOUT);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var2, (Object) uno0Var, (Object) function1, i2, (byte) 4);
        }
    }

    public static final void b(mm40 mm40Var, pqv pqvVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        mm40 mm40VarN;
        fetVar.g0(-722623442);
        int i3 = i2 | 6 | (fetVar.g(pqvVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean zF0 = pqvVar.f0();
            jm40 jm40Var = jm40.b;
            if (zF0) {
                mm40VarN = jm40Var;
            } else {
                zcl zclVar = qmk.f28987a;
                mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            }
            boolean z = (i3 & 896) == 256;
            int i4 = i3 & 112;
            boolean z2 = z | (i4 == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new n8(function1, pqvVar, b2);
                fetVar.o0(objP);
            }
            zvw.c(mm40VarN, pqvVar, (Function0) objP, fetVar, i4, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o8(mm40Var2, pqvVar, function1, i2, (byte) 1);
        }
    }

    public static final void c(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(1294329775);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarQ, qmk.a(fetVar).d, 0.0f, 2);
            ch80 ch80VarG = knm0.g(s5x0.t(0.0f, 8.0f, 1), fetVar);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new b5((byte) 12);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarL, null, ch80VarG, null, null, null, false, null, (Function1) objP, fetVar, 817889280, 378);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i2, b2);
        }
    }

    public static final void d(mm40 mm40Var, vr1 vr1Var, Function2 function2, fet fetVar, int i2, int i3) {
        int i4;
        fetVar.g0(-1399441772);
        int i5 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(vr1Var) ? 32 : 16);
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 = i5 | 384;
        } else {
            i4 = i5 | (fetVar.i(function2) ? 256 : 128);
        }
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            if (i6 != 0) {
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new xg1((byte) 6);
                    fetVar.o0(objP);
                }
                function2 = (Function2) objP;
            }
            if (vr1Var instanceof tr1) {
                fetVar.e0(477960374);
                e(mm40Var, (tr1) vr1Var, function2, fetVar, i4 & 1022);
                fetVar.r(false);
            } else {
                if (!vr1Var.equals(ur1.f36143a)) {
                    throw b1j.f(-538773330, fetVar, false);
                }
                fetVar.e0(478190797);
                f(i4 & 14, fetVar, mm40Var);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        Function2 function3 = function2;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51(mm40Var, (Object) vr1Var, (Object) function3, i2, i3, (byte) 1);
        }
    }

    public static final void e(mm40 mm40Var, tr1 tr1Var, Function2 function2, fet fetVar, int i2) {
        int i3;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        pcy pcyVar;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        String str = tr1Var.c;
        fetVar2.g0(1762916001);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 16;
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(tr1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function2) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 52.0f);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new dj1((byte) 5);
                fetVar2.o0(objP);
            }
            mm40 mm40VarJ = lgb.J(rq8.K(mm40VarE, (Function1) objP), vgg0.a(16.0f));
            boolean z = tr1Var.e;
            rr1 rr1Var = tr1Var.f;
            boolean z2 = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new mc(function2, tr1Var, b2);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(s5x0.L(y860.Y(mm40VarJ, z, null, null, (Function0) objP2, 14), 8.0f, 0.0f, 2), "TOURNAMENT_CARD_ROW");
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar7);
            jpm0.n(fetVar2);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar8);
            boolean z4 = rr1Var instanceof or1;
            jm40 jm40Var2 = jm40.b;
            if (z4) {
                fetVar2.e0(-1050282128);
                shdVar3 = shdVar7;
                pcyVar = pcyVar2;
                shdVar2 = shdVar8;
                shdVar = shdVar6;
                shdVar4 = shdVar5;
                k7x.a(((or1) rr1Var).f25715a.a(), "", o2e.e0(o7k0.n(jm40Var2, 36.0f), "TOURNAMENT_CARD_NUMBER_IMAGE"), gqw0.h1, null, fetVar2, 1572912, 1976);
                fetVar2.r(false);
            } else {
                shdVar = shdVar6;
                shdVar2 = shdVar8;
                shdVar3 = shdVar7;
                shdVar4 = shdVar5;
                pcyVar = pcyVar2;
                if (rr1Var instanceof pr1) {
                    fetVar2.e0(-1049900363);
                    pr1 pr1Var = (pr1) rr1Var;
                    j120.d(pr1Var.f27442a, pr1Var.b, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    if (!(rr1Var instanceof qr1)) {
                        throw b1j.f(-1419367438, fetVar2, false);
                    }
                    fetVar2.e0(-1049633918);
                    qr1 qr1Var = (qr1) rr1Var;
                    dj8.d(qr1Var.f29188a, qr1Var.b, fetVar2, 0);
                    fetVar2.r(false);
                }
            }
            mm40 mm40VarE1 = o2e.e0(new x7z(1.0f, true).e(new ecu0(yx7Var)), "TOURNAMENT_CARD_COLUMN");
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE1);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM2, shdVar);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar2);
            String str2 = tr1Var.b;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarL = g1t0.l();
            zfn zfnVar2 = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary();
            long j2 = qmk.q;
            v8q0.a(str2, o2e.e0(jm40Var2, "TOURNAMENT_CARD_TITLE"), textPrimary, gfk0.b(j2, qmk.r), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarL, fetVar, 48, 24960, 110576);
            fetVar2 = fetVar;
            if (str.length() == 0) {
                fetVar2.e0(607010011);
                fetVar2.r(false);
                jm40Var = jm40Var2;
            } else {
                fetVar2.e0(606478144);
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                jm40Var = jm40Var2;
                v8q0.a(str, o2e.e0(jm40Var2, "TOURNAMENT_CARD_SUBTITLE"), ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), gfk0.b(qmk.p, j2), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 48, 24960, 110576);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(true);
            if (tr1Var.e) {
                fetVar2.e0(-1047984005);
                mm40 mm40VarV = yyw.V(o7k0.n(jm40Var, 18.0f), fetVar2.k(bmd.n) == k6z.b);
                pm80 pm80VarF = a8k0.F(R.drawable.glyph_chevron_right_small, 0, fetVar2);
                pz40 pz40Var = s6t0.f31722a;
                dww.c(pm80VarF, null, mm40VarV, s6t0.b().f33626a.getPrimary(), fetVar2, 56, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1047656955);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var, (Object) tr1Var, (Object) function2, i2, (byte) 17);
        }
    }

    public static final void f(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(-1916242786);
        byte b2 = 2;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 52.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i2, b2);
        }
    }

    public static final boolean f0(nai0 nai0Var) {
        zai0 zai0Var = xai0.s;
        hz40 hz40Var = nai0Var.f23193a;
        Object objG = hz40Var.g(zai0Var);
        if (objG == null) {
            objG = null;
        }
        if (Intrinsics.d(objG, rv00.h)) {
            return false;
        }
        return hz40Var.b(mai0.g) || hz40Var.b(mai0.h);
    }

    public static final void g(mm40 mm40Var, String str, b15 b15Var, fet fetVar, int i2) {
        str.getClass();
        fetVar.g0(-1700156758);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(str) ? 32 : 16);
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
            h(null, b15Var, fetVar, 48);
            i(null, str, b15Var, fetVar, i3 & 1008);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2((Object) mm40Var, (Object) str, (Object) b15Var, i2, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void g0(Context context, String str) {
        synchronized (f16316a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e2);
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
            } catch (FileNotFoundException unused3) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    public static final void h(mm40 mm40Var, b15 b15Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        long jM123getWhite0d7_KjU;
        long jE;
        fetVar.g0(-37494648);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(b15Var.ordinal()) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarN = o7k0.n(mm40Var2, 14.0f);
            int iOrdinal = b15Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-1672608179);
                jM123getWhite0d7_KjU = afn0.p(fetVar).m123getWhite0d7_KjU();
                fetVar.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(-1672611481, fetVar, false);
                }
                jM123getWhite0d7_KjU = cs0.e(fetVar, -1672605361, fetVar, false);
            }
            mm40 mm40VarQ = i120.Q(mm40VarN, jM123getWhite0d7_KjU, vgg0.f37379a);
            s4u0 s4u0VarR = iom0.r(jpm0.t(R.drawable.ic_glyph_move_horizontal_small, 6, fetVar), fetVar);
            int iOrdinal2 = b15Var.ordinal();
            if (iOrdinal2 == 0) {
                jE = cs0.e(fetVar, -1672594897, fetVar, false);
            } else {
                if (iOrdinal2 != 1) {
                    throw b1j.f(-1672597777, fetVar, false);
                }
                fetVar.e0(-1672592083);
                jE = afn0.p(fetVar).m123getWhite0d7_KjU();
                fetVar.r(false);
            }
            dww.c(s4u0VarR, null, mm40VarQ, jE, fetVar, 56, 0);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) mm40Var2, (Object) b15Var, i2, (byte) 21);
        }
    }

    public static final void i(mm40 mm40Var, String str, b15 b15Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        y9q0 y9q0VarA;
        fetVar.g0(878676604);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(b15Var.ordinal()) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            int iOrdinal = b15Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-1700329337);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0VarA = y9q0.a(g1t0.g(), ((StaticColors) fetVar.k(m8m0.f21378a)).m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                fetVar.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(-1700332756, fetVar, false);
                }
                fetVar.e0(-1700323900);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                y9q0VarA = y9q0.a(g1t0.g(), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                fetVar.r(false);
            }
            v8q0.a(str, mm40VarN, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0VarA, fetVar, (i3 >> 3) & 14, 24960, 110588);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var2, (Object) str, (Object) b15Var, i2, (byte) 29);
        }
    }

    public static final void j(gc6 gc6Var, mm40 mm40Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        mm40 mm40Var2;
        float f2;
        gc6Var.getClass();
        String str = gc6Var.c;
        function0.getClass();
        fetVar.g0(-1003670067);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(gc6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if ((i2 & 384) == 0) {
            i4 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = androidx.compose.runtime.e.e(str);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            if (gc6Var.j) {
                zcl zclVar = qmk.f28987a;
                f2 = 0.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f2 = 4.0f;
            }
            float f3 = f2;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var, 0.0f, f3, 0.0f, 0.0f, 13), 1.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar3 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.J(i120.Q(mm40VarD, jM73getBlack400d7_KjU, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), 8.0f), "BEST_HERO_COLUMN");
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
            int i5 = i4 & 14;
            dj8.g(gc6Var, function0, fetVar, ((i4 >> 3) & 112) | i5);
            if (Intrinsics.d((String) pz40Var.getValue(), str)) {
                fetVar.e0(849586854);
                k(gc6Var, fetVar, i4 & 126);
                fetVar.r(false);
            } else {
                fetVar.e0(849681931);
                if (gc6Var.g) {
                    fetVar.e0(581599482);
                    l(gc6Var, fetVar, i5);
                } else {
                    fetVar.e0(849736863);
                }
                fetVar.r(false);
                pz40Var.setValue(str);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((Object) gc6Var, (Object) mm40Var2, (Object) function0, i2, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
  0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public static String j0(Context context) {
        String attributeValue;
        synchronized (f16316a) {
            attributeValue = "";
            try {
                FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                        int depth = xmlPullParserNewPullParser.getDepth();
                        while (true) {
                            int next = xmlPullParserNewPullParser.next();
                            if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                    attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException | XmlPullParserException unused2) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th) {
                    if (fileInputStreamOpenFileInput != null) {
                        try {
                            fileInputStreamOpenFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    public static final void k(gc6 gc6Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-906242599);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(gc6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i2 & 48;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 |= fetVar.g(jm40Var) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            b34.h(gc6Var.g, o2e.e0(jm40Var, "BEST_HERO_LIST_WITH_ANIMATION"), kzn.c(ro4.m0(250, 0, null, 6), null, 14), kzn.i(ro4.m0(250, 0, null, 6), null, 14), null, u1c.M(-1232881151, new un6(gc6Var), fetVar), fetVar, 200112, 16);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ac6(gc6Var, i2);
        }
    }

    public static final iy3 k0(float f2) {
        if (f2 >= 2.0f) {
            return new gy3(f2);
        }
        if (f2 >= 1.7f) {
            return new ey3(f2);
        }
        return f2 >= 1.2f ? new fy3(f2) : new hy3(f2);
    }

    public static final void l(gc6 gc6Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-689102880);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(gc6Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            hp4.e(0, fetVar);
            Iterator<E> it = gc6Var.f.iterator();
            while (it.hasNext()) {
                kc5.P((zb6) it.next(), gc6Var.b, fetVar, 0);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ac6(gc6Var, i2, b2);
        }
    }

    public static final m97 l0(dao daoVar) {
        Double dI;
        daoVar.getClass();
        long j2 = daoVar.c;
        double dDoubleValue = daoVar.f;
        byte b2 = daoVar.q.f36034a;
        sh7 sh7Var = daoVar.m;
        String str = sh7Var.b;
        long j3 = sh7Var.f32198a;
        long j4 = daoVar.b;
        long j5 = daoVar.e;
        String str2 = daoVar.g;
        if (str2.length() != 0 && (dI = kotlin.text.b.i(str2)) != null) {
            dDoubleValue = dI.doubleValue();
        }
        return new m97(j2, (int) b2, (izc) null, false, false, j3, str, j4, j5, dDoubleValue, daoVar.f, daoVar.d, daoVar.i, daoVar.j, daoVar.l, daoVar.k, false, false, false, 0L, false, (zfa0) null, false, 0.0d, (String) null, 67043356);
    }

    public static final void m(mm40 mm40Var, eke ekeVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, fet fetVar, int i2) {
        int i3;
        Function0 function5;
        Function0 function6;
        Function0 function7;
        Function0 function8;
        Function0 function9;
        ekeVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        fetVar.g0(-865604685);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(ekeVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function5 = function0;
            i3 |= fetVar.i(function5) ? 256 : 128;
        } else {
            function5 = function0;
        }
        if ((i2 & 3072) == 0) {
            function6 = function1;
            i3 |= fetVar.i(function6) ? 2048 : 1024;
        } else {
            function6 = function1;
        }
        if ((i2 & 24576) == 0) {
            function7 = function2;
            i3 |= fetVar.i(function7) ? 16384 : 8192;
        } else {
            function7 = function2;
        }
        if ((196608 & i2) == 0) {
            function8 = function3;
            i3 |= fetVar.i(function8) ? 131072 : 65536;
        } else {
            function8 = function3;
        }
        if ((1572864 & i2) == 0) {
            function9 = function4;
            i3 |= fetVar.i(function9) ? 1048576 : 524288;
        } else {
            function9 = function4;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (599187 & i4) != 599186)) {
            b34.h(ekeVar.f7947a, mm40Var, kzn.d(null, 0.0f, 3), kzn.e(null, 3), null, u1c.M(-974158373, new s49(function5, ekeVar, function6, function7, function8, function9), fetVar), fetVar, ((i4 << 3) & 112) | 200064, 16);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49((Object) mm40Var, (Object) ekeVar, (Object) function0, (Object) function1, (Object) function2, (Object) function3, (Object) function4, i2, (byte) 0);
        }
    }

    public static final g5a0 m0(String str, long j2, List list, boolean z, z9p z9pVar) {
        zfp zfpVar;
        c280 c280Var = new c280(vsm0.s(j2, str), R.drawable.ic_glyph_placeholder_player);
        if (z) {
            zfpVar = null;
        } else {
            boolean z2 = false;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((xcp) it.next()).f40657a == j2) {
                        z2 = true;
                        break;
                    }
                }
            }
            zfpVar = new zfp(j2, z2, z9pVar);
        }
        return new g5a0(c280Var, zfpVar);
    }

    public static final void n(mm40 mm40Var, boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fet fetVar, int i2) {
        fetVar.g0(1398405453);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192) | (fetVar.i(function3) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = yk5.n(q3d.j(new y3d(y3d.f), new y3d(y3d.b)), 0.0f, 0.0f, 14);
                fetVar.o0(objP);
            }
            mm40 mm40VarP = i120.P(o7k0.d(mm40Var, 1.0f), (t89) objP, null, 6);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarP, 16.0f, 8.0f);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar, 54);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            s(R.drawable.ic_broadcasting_to_window, (i3 >> 3) & 112, fetVar, function0);
            s(z ? R.drawable.ic_broadcasting_pause : R.drawable.ic_broadcasting_play, (i3 >> 6) & 112, fetVar, function1);
            s(R.drawable.ic_broadcasting_stop, (i3 >> 9) & 112, fetVar, function2);
            s(R.drawable.ic_broadcasting_from_fullscreen, (i3 >> 12) & 112, fetVar, function3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw8(mm40Var, z, function0, function1, function2, function3, i2);
        }
    }

    public static final void o(int i2, int i3, fet fetVar, mm40 mm40Var, Function0 function0) {
        int i4;
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(-921021175);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        }
        int i6 = i4 | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i6 & 1, (i6 & 19) != 18)) {
            mm40 mm40Var3 = i5 != 0 ? jm40.b : mm40Var;
            mm40 mm40VarW = y860.W(mm40Var3, null, null, false, null, function0, 28);
            mm40Var2 = mm40Var3;
            zcl zclVar = qmk.f28987a;
            dww.c(a8k0.F(R.drawable.ic_glyph_cancel, 0, fetVar), null, o2e.e0(s5x0.J(o7k0.n(mm40VarW, 40.0f), 8.0f), "FAVORITE_EVENT_CARD_ICON"), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), fetVar, 56, 0);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5a(i2, i3, mm40Var2, function0);
        }
    }

    public static final void p(mm40 mm40Var, xeb xebVar, boolean z, boolean z2, e2d e2dVar, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        xeb xebVar2 = xebVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(69694725);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(xebVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.g(e2dVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.g(qdzVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar2.i(function1) ? 1048576 : 524288;
        }
        int i4 = i3;
        byte b2 = 1;
        if (fetVar2.U(i4 & 1, (599187 & i4) != 599186)) {
            xcz xczVarB = qdzVar.b("ALT_CHAMP_RESULTS_SCREEN", new jak0(b2), fetVar2, ((i4 >> 9) & 896) | 6);
            w6k w6kVar = (w6k) fetVar2.k(bmd.h);
            WeakHashMap weakHashMap = djv0.w;
            int i5 = zcm0.i(fetVar2).c.e().d - zcm0.i(fetVar2).e.e().d;
            if (i5 < 0) {
                i5 = 0;
            }
            float fR0 = w6kVar.r0(i5);
            zcl zclVar = qmk.f28987a;
            float fMax = Math.max(0.0f, fR0 - 56.0f);
            wom womVarF = mom.f(fetVar2);
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean zG = ((i4 & 7168) == 2048) | fetVar2.g(xczVarB);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            yje yjeVar = null;
            if (zG || objP == cl5Var) {
                objP = new qa2(z2, xczVarB, yjeVar, (byte) 10);
                fetVar2.o0(objP);
            }
            m0x0.t(fetVar2, boolValueOf, (Function2) objP);
            if (z2) {
                function1.invoke(n62.f22974a);
            }
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new j6g0((byte) 17);
                fetVar2.o0(objP2);
            }
            azl azlVarB = e2d.b(e2dVar, (Function0) objP2);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarV = cjx.V(jm40Var, azlVarB, null);
            mm40 mm40VarN = s5x0.N(o7k0.c, 0.0f, 0.0f, 0.0f, fMax, 7);
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
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC0, gqw0.v, 1.0f, true);
            int i6 = i4 & 3670016;
            boolean z3 = i6 == 1048576;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new nrj0(function1, (byte) 26);
                fetVar2.o0(objP3);
            }
            Function0 function0 = (Function0) objP3;
            xebVar2 = xebVar;
            mom.c(x7zVarI, z, womVarF, null, false, null, function0, null, u1c.M(-243403322, new axy(mm40VarV, function1, xczVarB, xebVar, (byte) 3), fetVar2), fetVar, ((i4 >> 3) & 112) | 100663296, 184);
            fetVar2 = fetVar;
            if (xebVar2.b != null) {
                fetVar2.e0(-1574867834);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 56.0f, 7);
                mtl mtlVar = xebVar2.b;
                boolean z4 = i6 == 1048576;
                Object objP4 = fetVar2.P();
                if (z4 || objP4 == cl5Var) {
                    objP4 = new abh0(function1, (byte) 21);
                    fetVar2.o0(objP4);
                }
                Function1 function2 = (Function1) objP4;
                mm40Var2 = jm40Var;
                bkb.f(mm40VarN2, mtlVar, null, false, null, function2, fetVar2, 0, 28);
                boolean zD = fetVar2.d(fR0);
                Object objP5 = fetVar2.P();
                if (zD || objP5 == cl5Var) {
                    objP5 = jgk0.b(new rt2(fR0, (byte) 11));
                    fetVar2.o0(objP5);
                }
                zq8.a(0, fetVar2, i120.Q(o7k0.d(o7k0.e(mm40Var2, l7x.O(12.0f, 0.0f, ((Number) ((l7m0) objP5).getValue()).floatValue())), 1.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), n));
                fetVar2.r(false);
            } else {
                mm40Var2 = jm40Var;
                fetVar2.e0(-1573882809);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new owy(mm40Var2, xebVar2, z, z2, e2dVar, qdzVar, function1, i2, (byte) 3);
        }
    }

    public static final void q(y9u0 y9u0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        Function1 function2;
        int i4;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-606514319);
        int i5 = i2 & 6;
        y5d y5dVar = y5d.f42040a;
        if (i5 == 0) {
            i3 = (fetVar2.g(y5dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(y9u0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        int i6 = i3;
        if (fetVar2.U(i6 & 1, (i6 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarB = y5dVar.b(s5x0.L(mm40VarD, qmk.a(fetVar2).e, 0.0f, 2), true);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarB);
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
            j0x.b(iom0.r(jpm0.t(y9u0Var.f42266a, 6, fetVar2), fetVar2), null, o7k0.n(jm40Var, 100.0f), null, gqw0.h1, 0.0f, null, fetVar, 24632, 104);
            fetVar2 = fetVar;
            if (y9u0Var.b == null) {
                fetVar2.e0(1653001283);
                fetVar2.r(false);
                z = false;
                i4 = i6;
            } else {
                fetVar2.e0(1653001284);
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 20.0f, 0.0f, 0.0f, 13);
                String str = y9u0Var.b;
                pz40 pz40Var = s6t0.f31722a;
                i4 = i6;
                z = false;
                v8q0.a(str, mm40VarN, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 0, 130040);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            if (y9u0Var.c == null) {
                fetVar2.e0(1653351645);
                fetVar2.r(z);
            } else {
                fetVar2.e0(1653351646);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                String str2 = y9u0Var.c;
                pz40 pz40Var2 = s6t0.f31722a;
                v8q0.a(str2, mm40VarN2, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 0, 130040);
                fetVar2 = fetVar;
                fetVar2.r(z);
            }
            fetVar2.r(true);
            if (y9u0Var.d == null) {
                fetVar2.e0(260794471);
                fetVar2.r(z);
                function2 = function1;
            } else {
                fetVar2.e0(260794472);
                mtl mtlVar = y9u0Var.d;
                boolean z2 = (i4 & 896) == 256 ? true : z;
                Object objP = fetVar2.P();
                if (z2 || objP == ukd.f35823a) {
                    function2 = function1;
                    objP = new sbt0(function2, (byte) 14);
                    fetVar2.o0(objP);
                } else {
                    function2 = function1;
                }
                bkb.f(null, mtlVar, null, false, null, (Function1) objP, fetVar2, 0, 29);
                fetVar2.r(z);
            }
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) y9u0Var, (Object) function2, i2, (byte) 16);
        }
    }

    public static final void r(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(788543329);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarR = knm0.r(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mdm mdmVar = (mdm) l7m0Var.getValue();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new g4p0(function1, (byte) 5);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cn(l7m0Var, function1, i2, (byte) 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(int i2, int i3, fet fetVar, Function0 function0) {
        int i4;
        fetVar.g0(-1168249898);
        if ((i3 & 6) == 0) {
            i4 = (fetVar.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= fetVar.i(function0) ? 32 : 16;
        }
        byte b2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            zvw.d(function0, null, false, null, null, u1c.M(-2133611020, new u49(b2, i2, (boolean) (objArr2 == true ? 1 : 0)), fetVar), fetVar, ((i4 >> 3) & 14) | 1572864, 62);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v49(i2, function0, i3, objArr == true ? 1 : 0);
        }
    }

    public static final void t(d4l d4lVar, fet fetVar, int i2) {
        fetVar.g0(-1523617720);
        int i3 = (i2 & 6) == 0 ? (fetVar.g(d4lVar) ? 4 : 2) | i2 : i2;
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40.b, 1.0f), null, false, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(-1412911820);
            for (a5l a5lVar : d4lVar.f5460a) {
                fetVar.b0(-1129013206, a5lVar.f275a);
                u(a5lVar, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(d4lVar, i2, b2);
        }
    }

    public static final void u(a5l a5lVar, fet fetVar, int i2) {
        fetVar.g0(-1978046934);
        int i3 = (fetVar.g(a5lVar) ? 4 : 2) | i2;
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(mm40VarD, 0.0f, 4.0f, 0.0f, 0.0f, 13), 32.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            v(o7k0.n(jm40Var, 32.0f), u1c.M(-617227723, new b4l(a5lVar, b2), fetVar), fetVar, 48);
            v(o7k0.c(o7k0.s(s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), 50.0f), 1.0f), u1c.M(-700188642, new b4l(a5lVar, b3), fetVar), fetVar, 48);
            w(o7k0.c(s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14).e(new x7z(1.0f, true)), 1.0f), a5lVar.d, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b4l(a5lVar, i2);
        }
    }

    public static final void v(mm40 mm40Var, ugd ugdVar, fet fetVar, int i2) {
        fetVar.g0(-954036548);
        byte b2 = 4;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(lgb.J(mm40Var, vgg0.a(8.0f)), StaticColors.INSTANCE.m73getBlack400d7_KjU(), n), 4.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            twn.v(6, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fb8(mm40Var, ugdVar, i2, b2);
        }
    }

    public static final void w(mm40 mm40Var, a4l a4lVar, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(376674233);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(a4lVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40VarE, vgg0.a(8.0f));
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarJ, staticColors.m73getBlack400d7_KjU(), n), 8.0f, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarI = hne.i(1.0f, true, "ROW_TEST_TAG");
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarI);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            String str = a4lVar.f229a;
            long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
            long j2 = qmk.q;
            y9q0 y9q0VarD = g1t0.d();
            jm40 jm40Var = jm40.b;
            v8q0.a(str, o2e.e0(jm40Var, "FIRST_VALUE_TEXT_TAG"), jM123getWhite0d7_KjU, null, j2, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarD, fetVar, 48, 24960, 110568);
            v8q0.a(a4lVar.b, o2e.e0(jm40Var, "SECOND_VALUE_TEXT_TAG"), staticColors.m123getWhite0d7_KjU(), null, j2, null, null, null, 0L, null, 0L, 1, false, 1, 0, null, g1t0.d(), fetVar, 48, 24960, 110568);
            fetVar2 = fetVar;
            fetVar2.r(true);
            zq8.a(0, fetVar2, o2e.e0(i120.Q(o7k0.n(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 8.0f), a4lVar.c, vgg0.f37379a), "TEAM_SIDE_INDICATOR_TAG"));
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(mm40Var, a4lVar, i2, (byte) 14);
        }
    }

    public static final void x(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-749615794);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = tfx.E(mm40Var.e(o7k0.c));
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ia30(function1, (byte) 24);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var, mdmVar, function1, i2, (byte) 20);
        }
    }

    public static final void y(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-756458543);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = tfx.E(o7k0.c);
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new nrj0(function1, (byte) 22);
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
            yfe0VarU.d = new hak0(mm40Var2, mdmVar, function1, i2, (byte) 1);
        }
    }

    public static final void z(z9u0 z9u0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1613604831);
        int i3 = (fetVar.g(z9u0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
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
            mdm mdmVar = z9u0Var.f44039a;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new zbt0(function1, (byte) 15);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(z9u0Var, function1, i2, (byte) 28);
        }
    }

    public boolean a0(l2 l2Var, i2 i2Var, i2 i2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m2.r;
        while (!atomicReferenceFieldUpdater.compareAndSet(l2Var, i2Var, i2Var2)) {
            if (atomicReferenceFieldUpdater.get(l2Var) != i2Var) {
                return false;
            }
        }
        return true;
    }

    public boolean b0(r2 r2Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m2.s;
        while (!atomicReferenceFieldUpdater.compareAndSet(r2Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(r2Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public boolean c0(r2 r2Var, q2 q2Var, q2 q2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m2.q;
        while (!atomicReferenceFieldUpdater.compareAndSet(r2Var, q2Var, q2Var2)) {
            if (atomicReferenceFieldUpdater.get(r2Var) != q2Var) {
                return false;
            }
        }
        return true;
    }

    public i2 d0(l2 l2Var) {
        return (i2) m2.r.getAndSet(l2Var, i2.d);
    }

    public q2 e0(l2 l2Var) {
        return (q2) m2.q.getAndSet(l2Var, q2.c);
    }

    public void h0(q2 q2Var, q2 q2Var2) {
        m2.p.lazySet(q2Var, q2Var2);
    }

    public void i0(q2 q2Var, Thread thread) {
        m2.o.lazySet(q2Var, thread);
    }
}
