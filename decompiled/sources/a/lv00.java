package a;

import android.app.Activity;
import android.gov.nist.core.Separators;
import android.graphics.Typeface;
import android.javax.sip.message.Response;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Window;
import androidx.cardview.widget.CardView;
import java.io.Serializable;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lv00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f20699a = {-75, 0, 60, 0, 1, 4};
    public static final ugd b = new ugd(1575986983, false, new i5b(24));
    public static final ugd c = new ugd(-605549438, false, new i5b(25));
    public static final ugd d = new ugd(1237005739, false, new ehd(7));
    public static final ugd e = new ugd(275380524, false, new ehd(8));
    public static final ugd f = new ugd(-686244691, false, new ehd(9));
    public static final ugd g = new ugd(1963330976, false, new jhd(20));
    public static final ugd h = new ugd(44170130, false, new lhd(23));
    public static final Object i = new Object();
    public static final zaz[] j = new zaz[0];
    public static final jiy[] k = new jiy[0];
    public static final zen[] l = {new zen(120000000000L), new zen(300000000000L)};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [int] */
    /* JADX WARN: Type inference failed for: r8v21 */
    public static final void A(xql xqlVar, fet fetVar, int i2) {
        int i3;
        pcy pcyVar;
        jm40 jm40Var;
        pcy pcyVar2;
        tql tqlVar;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        zhg0 zhg0Var;
        boolean z;
        ?? r8;
        fet fetVar2;
        boolean z2;
        fet fetVar3;
        fet fetVar4 = fetVar;
        sql sqlVar = xqlVar.f41326a;
        fetVar4.g0(1312715411);
        int i4 = i2 & 6;
        jm40 jm40Var2 = jm40.b;
        if (i4 == 0) {
            i3 = i2 | (fetVar4.g(jm40Var2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar4.g(xqlVar) ? 32 : 16;
        }
        if (fetVar4.U(i3 & 1, (i3 & 19) != 18)) {
            k6z k6zVar = (k6z) fetVar4.k(bmd.n);
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            long primary = afn0.m(fetVar4).getPrimary();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarE, primary, ljcVar);
            xx7 xx7Var = gqw0.n;
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar4, 48);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarQ);
            mkd.c0.getClass();
            fetVar4.i0();
            boolean z3 = fetVar4.S;
            pcy pcyVar3 = e7z.u1;
            if (z3) {
                fetVar4.l(pcyVar3);
            } else {
                fetVar4.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar4, x5dVarA, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar4, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar4, numValueOf, shdVar6);
            jpm0.n(fetVar4);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar4, mm40VarC0, shdVar7);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar4, 48);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, jm40Var2);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(pcyVar3);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, thg0VarA, shdVar4);
            jpm0.o(fetVar4, bh90VarM2, shdVar5);
            vqd.u(iHashCode2, fetVar4, shdVar6, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar7);
            mm40 mm40VarN = s5x0.N(jm40Var2, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            zhg0 zhg0Var2 = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var2.a(1.0f, mm40VarN, true);
            kjm kjmVar = kjm.f18392a;
            String str = xqlVar.e;
            tql tqlVar2 = xqlVar.d;
            boolean zG = fetVar4.g(str);
            Object objP = fetVar4.P();
            if (zG || objP == ukd.f35823a) {
                ljm ljmVar = new ljm();
                String str2 = xqlVar.e;
                pz40 pz40Var = s6t0.f31722a;
                objP = new hjm(str2, ljmVar, new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU()), null, null, null, false, null, null, false, null, null, 8184);
                fetVar4.o0(objP);
            }
            nkb.h(mm40VarA, (hjm) objP, kjmVar, null, null, null, fetVar, 384, 56);
            mm40 mm40VarE2 = o7k0.e(o7k0.s(jm40Var2, 144.0f), 68.0f);
            k6z k6zVar2 = k6z.b;
            mm40 mm40VarV = yyw.V(mm40VarE2, k6zVar == k6zVar2);
            o0x o0xVar = sqlVar.f32635a;
            k7x.a(o0xVar != null ? o0xVar.a() : null, null, mm40VarV, null, null, fetVar, 48, 2040);
            fetVar.r(true);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var2);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar3;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar3;
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar4);
            jpm0.o(fetVar, bh90VarM3, shdVar5);
            vqd.u(iHashCode3, fetVar, shdVar6, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar7);
            mm40 mm40VarV2 = yyw.V(jr8.f16991a.b(o7k0.n(jm40Var2, 72.0f), gqw0.i), k6zVar == k6zVar2);
            o0x o0xVar2 = xqlVar.b;
            pcy pcyVar4 = pcyVar;
            shd shdVar8 = shdVar4;
            k7x.a(o0xVar2 != null ? o0xVar2.a() : null, null, mm40VarV2, null, null, fetVar, 48, 2040);
            fet fetVar5 = fetVar;
            mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var2, 1.0f), 12.0f, 0.0f, 12.0f, 12.0f, 2);
            zcl zclVar2 = qmk.e;
            mm40 mm40VarJ = s5x0.J(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN2), afn0.m(fetVar5).getBackgroundContent(), ljcVar), 12.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar5, 48);
            int iHashCode4 = Long.hashCode(fetVar5.T);
            bh90 bh90VarM4 = fetVar5.m();
            mm40 mm40VarC3 = kbc.c0(fetVar5, mm40VarJ);
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(pcyVar4);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, x5dVarA2, shdVar8);
            jpm0.o(fetVar5, bh90VarM4, shdVar5);
            vqd.u(iHashCode4, fetVar5, shdVar6, fetVar5);
            jpm0.o(fetVar5, mm40VarC3, shdVar7);
            d(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 16.0f, 7), sqlVar, xqlVar.c, fetVar5, 0);
            if (tqlVar2.f == uql.f36124a) {
                fetVar5.e0(1276427124);
                mm40 mm40VarN3 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 10.0f, 7);
                thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar5, 48);
                int iHashCode5 = Long.hashCode(fetVar5.T);
                bh90 bh90VarM5 = fetVar5.m();
                mm40 mm40VarC4 = kbc.c0(fetVar5, mm40VarN3);
                fetVar5.i0();
                if (fetVar5.S) {
                    fetVar5.l(pcyVar4);
                } else {
                    fetVar5.r0();
                }
                jpm0.o(fetVar5, thg0VarA2, shdVar8);
                jpm0.o(fetVar5, bh90VarM5, shdVar5);
                vqd.u(iHashCode5, fetVar5, shdVar6, fetVar5);
                jpm0.o(fetVar5, mm40VarC4, shdVar7);
                String str3 = tqlVar2.f34386a;
                if (str3 == null) {
                    fetVar5.e0(-57733518);
                    fetVar5.r(false);
                    jm40Var = jm40Var2;
                    z2 = false;
                    pcyVar2 = pcyVar4;
                    tqlVar = tqlVar2;
                    shdVar = shdVar7;
                    shdVar2 = shdVar5;
                    shdVar3 = shdVar6;
                    zhg0Var = zhg0Var2;
                    z = true;
                    fetVar3 = fetVar5;
                } else {
                    fetVar5.e0(-57733517);
                    mm40 mm40VarA2 = zhg0Var2.a(1.0f, jm40Var2, false);
                    y9q0 y9q0VarG = h97.g(fetVar5);
                    long secondary = afn0.m(fetVar5).getSecondary();
                    long j2 = qmk.q;
                    long j3 = qmk.r;
                    long j4 = qmk.n;
                    tqlVar = tqlVar2;
                    zhg0Var = zhg0Var2;
                    shdVar2 = shdVar5;
                    shdVar3 = shdVar6;
                    shdVar = shdVar7;
                    pcyVar2 = pcyVar4;
                    v8q0.a(str3, mm40VarA2, secondary, new n05(j2, j3, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarG, fetVar, 0, 24960, 110576);
                    mm40 mm40VarU = o7k0.u(jm40Var2, 0.0f, 68.0f, 1);
                    String str4 = tqlVar.e;
                    y9q0 y9q0VarG2 = h97.g(fetVar);
                    long secondary2 = afn0.m(fetVar).getSecondary();
                    n05 n05Var = new n05(j2, j3, j4);
                    jm40Var = jm40Var2;
                    z = true;
                    v8q0.a(str4, mm40VarU, secondary2, n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarG2, fetVar, 0, 24960, 110576);
                    fet fetVar6 = fetVar;
                    z2 = false;
                    fetVar6.r(false);
                    fetVar3 = fetVar6;
                }
                fetVar3.r(z);
                fetVar3.r(z2);
                fetVar2 = fetVar3;
                r8 = z2;
            } else {
                jm40Var = jm40Var2;
                pcyVar2 = pcyVar4;
                tqlVar = tqlVar2;
                shdVar = shdVar7;
                shdVar8 = shdVar8;
                shdVar2 = shdVar5;
                shdVar3 = shdVar6;
                zhg0Var = zhg0Var2;
                z = true;
                r8 = 0;
                fetVar5.e0(1278284737);
                fetVar5.r(false);
                fetVar2 = fetVar5;
            }
            n0q n0qVar = o7k0.c;
            tnm tnmVar = tnm.f34243a;
            StaticColors staticColors = StaticColors.INSTANCE;
            snm.b(n0qVar, new unm(tnmVar, staticColors.m132getYellow0d7_KjU(), staticColors.m132getYellow0d7_KjU(), afn0.m(fetVar2).getBackground(), 6.0f, 6.0f, tqlVar.b, 0, true, 640), fetVar2, 6);
            jm40 jm40Var3 = jm40Var;
            tql tqlVar3 = tqlVar;
            mm40 mm40VarN4 = s5x0.N(jm40Var3, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA3 = shg0.a(new qw3(8.0f, z, new jf4((byte) 14)), gqw0.j, fetVar2, r8);
            int iHashCode6 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM6 = fetVar2.m();
            mm40 mm40VarC5 = kbc.c0(fetVar2, mm40VarN4);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA3, shdVar8);
            jpm0.o(fetVar2, bh90VarM6, shdVar2);
            vqd.u(iHashCode6, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC5, shdVar);
            mm40 mm40VarA3 = zhg0Var.a(1.0f, jm40Var3, z);
            String str5 = tqlVar3.c;
            afn0.v(fetVar).getClass();
            y9q0 y9q0VarL = g1t0.l();
            long textPrimary = afn0.m(fetVar).getTextPrimary();
            long j5 = qmk.q;
            long j6 = qmk.r;
            long j7 = qmk.n;
            v8q0.a(str5, mm40VarA3, textPrimary, new n05(j5, j6, j7), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarL, fetVar, 0, 24960, 110576);
            v8q0.a(tqlVar3.d, zhg0Var.a(1.0f, jm40Var3, z), afn0.m(fetVar).getSecondary(), new n05(j5, j6, j7), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, h97.g(fetVar), fetVar, 0, 24960, 109552);
            fetVar4 = fetVar;
            fetVar4.r(z);
            fetVar4.r(z);
            fetVar4.r(z);
            fetVar4.r(z);
        } else {
            fetVar4.X();
        }
        yfe0 yfe0VarU = fetVar4.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(xqlVar, i2);
        }
    }

    public static final void B(int i2, fet fetVar) {
        fetVar.g0(1178523144);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, i2 != 0)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarA0 = wha0.a0(cjx.V(s5x0.N(n0qVar, 0.0f, 16.0f, 0.0f, 0.0f, 13), x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
            tj30 tj30VarC = zq8.c(gqw0.b, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA0);
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
            jcb.l(o7k0.e(jm40.b, 52.0f), new mdm(R.string.lottie_search_nothing, pdm.c, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 988), false, null, fetVar, 0, 12);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sfc(i2, b2);
        }
    }

    public static final void C(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(443956746);
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
                objP = new yhl0(function1, (byte) 4);
                fetVar.o0(objP);
            }
            int i4 = i3 & 126;
            jm40 jm40Var = jm40.b;
            jcb.l(jm40Var, mdmVar, false, (Function0) objP, fetVar, i4, 4);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hak0(mm40Var2, mdmVar, function1, i2, (byte) 4);
        }
    }

    public static final void D(int i2, fet fetVar, mm40 mm40Var, Function0 function0) {
        fetVar.g0(-341927908);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            hlm.c(o7k0.w(o7k0.d(mm40Var, 1.0f), null, false, 3), new imm(jlm.f16723a, mlm.f21997a, fmm.f9790a, ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), false, null), null, function0, null, null, null, null, null, null, null, null, fetVar, (i3 << 6) & 7168, 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(mm40Var, function0, i2, (byte) 9);
        }
    }

    public static final hq00 E(Typeface typeface) {
        return new hq00(new r7v(typeface));
    }

    public static final void F(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        int i3;
        a4x a4xVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1345672374);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            byte b3 = 14;
            mm40 mm40VarA0 = wha0.a0(s5x0.N(mm40Var, xfn.a(fetVar2).e, 8.0f, xfn.a(fetVar2).e, 0.0f, 8), wha0.T(fetVar2), false, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA0);
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
            String strW = rsm0.w(R.string.popular_search, 0, fetVar2);
            boolean zG = fetVar2.g(strW);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                m0x m0xVar = new m0x(R.drawable.ic_glyph_popular, null, 6);
                pz40 pz40Var = s6t0.f31722a;
                objP = new hjm(strW, null, null, m0xVar, new y3d(s6t0.b().f33626a.getSecondary()), null, false, null, null, false, null, null, 8166);
                fetVar2.o0(objP);
            }
            kjm kjmVar = kjm.f18392a;
            jm40 jm40Var = jm40.b;
            nkb.h(jm40Var, (hjm) objP, kjmVar, null, null, null, fetVar2, 390, 56);
            mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 24.0f, 5), 1.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b3));
            qw3 qw3Var2 = new qw3(16.0f, true, new jf4(b3));
            a4xVar2 = a4xVar;
            jwb.p(mm40VarD, qw3Var, qw3Var2, null, 0, 0, u1c.M(1736600401, new r3g0(a4xVar2, function1, b2), fetVar2), fetVar2, 1572864, 56);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            a4xVar2 = a4xVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(mm40Var, a4xVar2, function1, i2, (byte) 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    public static final void G(mm40 mm40Var, final kwj kwjVar, final ArrayList arrayList, final int i2, final Function2 function2, final Function2 function3, fet fetVar, int i3) {
        mm40 mm40Var2;
        fetVar.g0(-480514066);
        int i4 = i3 | 6 | (fetVar.g(kwjVar) ? 32 : 16) | (fetVar.g(arrayList) ? 256 : 128) | (fetVar.e(i2) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            final int iB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() >> 32);
            bik bikVarF = pkd.f(fetVar);
            jm40 jm40Var = jm40.b;
            float f2 = 1.0f;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            bikVarF.getClass();
            if (bikVarF instanceof yhk) {
                f2 = 2.7692308f;
            } else {
                uhk uhkVar = bikVarF instanceof uhk ? (uhk) bikVarF : null;
                if (uhkVar != null && !uhkVar.f35683a) {
                    f2 = 2.7692308f;
                }
            }
            q5x.e(kwjVar, ny9.O(f2, mm40VarD, false), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-2048219187, new ydr() { // from class: a.vo50
                @Override // a.ydr
                public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                    int iIntValue = ((Integer) obj2).intValue();
                    fet fetVar2 = (fet) obj3;
                    int iIntValue2 = ((Integer) obj4).intValue();
                    ((rk80) obj).getClass();
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= fetVar2.e(iIntValue) ? 32 : 16;
                    }
                    if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                        kwj kwjVar2 = kwjVar;
                        float fL = kwjVar2.l() + (kwjVar2.k() - iIntValue);
                        int i5 = i2;
                        int i6 = i5 != 0 ? ((iIntValue % i5) + i5) % i5 : 0;
                        it50 it50Var = (it50) arrayList.get(i6);
                        float fO = l7x.O(1.6f, 1.0f, 1.0f - l1e0.c(Math.abs(fL), 0.0f, 1.0f));
                        float f3 = (((fO - 1.0f) * iB) / 2.0f) * (fetVar2.k(bmd.n) == k6z.b ? 1.0f : -1.0f) * (fL <= 0.0f ? -1.0f : 1.0f);
                        n0q n0qVar = o7k0.c;
                        Function2 function4 = function2;
                        boolean zG = fetVar2.g(function4) | fetVar2.i(it50Var);
                        Object objP = fetVar2.P();
                        cl5 cl5Var = ukd.f35823a;
                        if (zG || objP == cl5Var) {
                            objP = new uo50(function4, it50Var, (byte) 1);
                            fetVar2.o0(objP);
                        }
                        mm40 mm40VarF = phu0.F(n0qVar, null, null, false, null, (Function0) objP, fetVar2, 24966, 5);
                        boolean zD = fetVar2.d(fO) | fetVar2.d(f3);
                        Object objP2 = fetVar2.P();
                        if (zD || objP2 == cl5Var) {
                            objP2 = new ih10(fO, f3, (byte) 5);
                            fetVar2.o0(objP2);
                        }
                        mm40 mm40VarT = i4w0.T(mm40VarF, (Function1) objP2);
                        wyq0 wyq0Var = it50Var.e;
                        Function2 function5 = function3;
                        boolean zG2 = fetVar2.g(function5) | fetVar2.i(it50Var);
                        Object objP3 = fetVar2.P();
                        if (zG2 || objP3 == cl5Var) {
                            objP3 = new rw40(function5, it50Var, (byte) 12);
                            fetVar2.o0(objP3);
                        }
                        lv00.O(mm40VarT, wyq0Var, i6, (Function1) objP3, fetVar2, 0);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (i4 >> 3) & 14, 24576, 16380);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp(mm40Var2, kwjVar, arrayList, i2, function2, function3, i3, (byte) 14);
        }
    }

    public static final void H(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-752735185);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = cjx.V(s5x0.N(jm40.b, 0.0f, 16.0f, 0.0f, 0.0f, 13), a8k0.G(xczVarA, fetVar), null).e(o7k0.c);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ys4(l7m0Var, function1, b2);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i2, (byte) 23);
        }
    }

    public static final void I(mm40 mm40Var, w2d w2dVar, cp50 cp50Var, Function1 function1, fet fetVar, int i2) {
        cp50Var.getClass();
        function1.getClass();
        fetVar.g0(1907522820);
        int i3 = i2 | (fetVar.i(w2dVar) ? 32 : 16) | (fetVar.g(cp50Var) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            ycl yclVar = new ycl(32.0f);
            if (cp50Var instanceof ap50) {
                yclVar = null;
            }
            v2n0.b(mm40VarE, w2dVar, 0L, yclVar != null ? yclVar.f42389a : 0.0f, u1c.M(-222025169, new mtz(w2dVar, cp50Var, function1, (byte) 28), fetVar), u1c.M(-1293139477, new qb((Object) cp50Var, (Object) w2dVar, (Object) function1, false, (byte) 8), fetVar), fetVar, (i3 & 112) | 221248, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 3, i2, (Object) mm40Var, (Object) w2dVar, (Object) cp50Var, (Object) function1);
        }
    }

    public static final void J(w2d w2dVar, cp50 cp50Var, xdr xdrVar, xdr xdrVar2, Function2 function2, Function0 function0, Function1 function1, Function1 function3, Function0 function4, fet fetVar, int i2) {
        fetVar.g0(790659617);
        int i3 = i2 | (fetVar.i(w2dVar) ? 4 : 2) | (fetVar.g(cp50Var) ? 32 : 16) | (fetVar.i(xdrVar) ? 256 : 128) | (fetVar.i(xdrVar2) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192) | (fetVar.i(function0) ? 131072 : 65536) | (fetVar.i(function1) ? 1048576 : 524288) | (fetVar.i(function3) ? 8388608 : 4194304) | (fetVar.i(function4) ? 67108864 : 33554432);
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = Boolean.valueOf((cp50Var instanceof bp50) || ((cp50Var instanceof zo50) && !((zo50) cp50Var).f44703a.isEmpty()));
                fetVar.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
            float fC = l1e0.c((w2dVar.f38442a.a() - 0.5f) / 0.5f, 0.0f, 1.0f);
            s(o7k0.w(o7k0.d(jm40.b, 1.0f), null, false, 3), w2dVar, u1c.M(1728079269, new h2d(cp50Var, zBooleanValue, fC, xdrVar, xdrVar2, function2, function0, function1, function3), fetVar), u1c.M(-901014332, new xq40(fC, zBooleanValue, function4, (byte) 1), fetVar), fetVar, 3526 | ((i3 << 3) & 112));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j0a0(w2dVar, cp50Var, xdrVar, xdrVar2, function2, function0, function1, function3, function4, i2, (byte) 4);
        }
    }

    public static final void K(int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(629917860);
        int i3 = i2 | 6;
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            float f2 = xfn.a(fetVar2).e;
            float f3 = xfn.a(fetVar2).e;
            mm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(mm40Var2, f2, 8.0f, f3, 0.0f, 8);
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
            nkb.h(null, new ijm(), kjm.f18392a, null, null, null, fetVar2, 384, 57);
            iun iunVar = iun.f15405a;
            xyl xylVar = xyl.b;
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = new gcl0((byte) 11);
                fetVar2.o0(objP);
            }
            fbc.w(null, iunVar, xylVar, null, null, 0, true, false, (Function2) objP, fetVar, 102433200);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var2, i2, (byte) 29);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void L(mm40 mm40Var, it50 it50Var, fqm fqmVar, Function2 function2, Function2 function3, fet fetVar, int i2) {
        int i3;
        Function2 function4;
        Object[] objArr;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        boolean z;
        float f2;
        float f3;
        boolean z2;
        fet fetVar2 = fetVar;
        ArrayList arrayList = fqmVar.c;
        fetVar2.g0(774101327);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(it50Var) : fetVar2.i(it50Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar2.g(fqmVar) : fetVar2.i(fqmVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function3) ? 16384 : 8192;
        }
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 156.0f);
            Float fValueOf = Float.valueOf(0.0f);
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarL = s5x0.L(i120.P(mm40VarE, yk5.o(new Pair[]{new Pair(fValueOf, new y3d(((StaticColors) fetVar2.k(zfnVar)).m121getTransparent0d7_KjU())), new Pair(Float.valueOf(0.45f), new y3d(((StaticColors) fetVar2.k(zfnVar)).m78getBlack800d7_KjU())), new Pair(Float.valueOf(1.0f), new y3d(((StaticColors) fetVar2.k(zfnVar)).m78getBlack800d7_KjU()))}), null, 6), 16.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.d, gqw0.m, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar6);
            jpm0.n(fetVar2);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar7);
            boolean zIsEmpty = arrayList.isEmpty();
            String str = it50Var.d;
            if (str.length() <= 0) {
                str = null;
            }
            jm40 jm40Var = jm40.b;
            if (str == null) {
                fetVar2.e0(1542255838);
                fetVar2.r(false);
                objArr = false;
                shdVar3 = shdVar5;
                f2 = 0.0f;
                shdVar = shdVar7;
                shdVar2 = shdVar6;
                f3 = 1.0f;
                z = true;
            } else {
                fetVar2.e0(1542255839);
                objArr = false;
                shdVar = shdVar7;
                shdVar2 = shdVar6;
                shdVar3 = shdVar5;
                z = true;
                f2 = 0.0f;
                j6n.h(str, hro0.f13541a, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), 0, 0, fetVar, 48, 24);
                fetVar2 = fetVar;
                fetVar2.r(false);
                f3 = 1.0f;
            }
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, f3), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            yx7 yx7Var = gqw0.l;
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar);
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(new ecu0(yx7Var), 0.0f, 0.0f, 8.0f, 0.0f, 11), z);
            String str2 = it50Var.c;
            n05 n05Var = new n05(qmk.w, qmk.s, idm0.s(0.25d));
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str2, mm40VarH, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), n05Var, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.p(), fetVar, 0, 24960, 109552);
            fetVar2 = fetVar;
            mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
            wul wulVar = new wul(oul.e, oe9.b, new te9(R.drawable.ic_glyph_chevron_right_small), true, false, false);
            int i4 = i3;
            boolean z4 = ((i4 & 112) == 32 || ((i4 & 64) != 0 && fetVar2.i(it50Var))) | ((i4 & 7168) == 2048);
            Object objP = fetVar2.P();
            if (z4 || objP == ukd.f35823a) {
                function4 = function2;
                z2 = false;
                objP = new uo50(function4, it50Var, 0 == true ? 1 : 0);
                fetVar2.o0(objP);
            } else {
                function4 = function2;
                z2 = false;
            }
            qzb.n(mm40VarY, wulVar, (Function0) objP, fetVar2, 6, 0);
            fetVar2.r(true);
            if (arrayList.size() >= 2) {
                fetVar2.e0(1544060101);
                kbc.m(epv0.N(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 48.0f, 7), !zIsEmpty ? 1.0f : f2), fqmVar, kxh0.f19056a, function3, fetVar2, ((i4 >> 3) & 112) | 448 | (i4 & 57344));
                fetVar2.r(z2);
            } else {
                fetVar2.e0(1544460745);
                qxw.o(fetVar2, s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 32.0f, 7));
                fetVar2.r(z2);
            }
            fetVar2.r(true);
        } else {
            function4 = function2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) it50Var, (Object) fqmVar, (Object) function4, (Object) function3, i2, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0243  */
    /* JADX WARN: Code duplicated, block: B:101:0x0245  */
    /* JADX WARN: Code duplicated, block: B:105:0x0254  */
    /* JADX WARN: Code duplicated, block: B:108:0x0268  */
    /* JADX WARN: Code duplicated, block: B:110:0x0274  */
    /* JADX WARN: Code duplicated, block: B:113:0x0287  */
    /* JADX WARN: Code duplicated, block: B:114:0x0289  */
    /* JADX WARN: Code duplicated, block: B:120:0x0295  */
    /* JADX WARN: Code duplicated, block: B:123:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:132:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:135:0x0322  */
    public static final void M(mm40 mm40Var, float f2, zo50 zo50Var, final xdr xdrVar, final xdr xdrVar2, Function2 function2, Function0 function0, Function1 function1, Function1 function3, fet fetVar, int i2) {
        mm40 mm40Var2;
        Object d21Var;
        int i3;
        kwj kwjVar;
        yje yjeVar;
        char c2;
        cl5 cl5Var;
        boolean z;
        boolean zE;
        Object objP;
        Object objP2;
        final ngk0 ngk0Var;
        boolean z2;
        Object objP3;
        final byte b2;
        Object objP4;
        boolean z3;
        Object objP5;
        zo50 zo50Var2 = zo50Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1933422559);
        int i4 = i2 | 6 | (fetVar2.d(f2) ? 32 : 16) | (fetVar2.g(zo50Var2) ? 256 : 128) | (fetVar2.i(xdrVar) ? 2048 : 1024) | (fetVar2.i(xdrVar2) ? 16384 : 8192) | (fetVar2.i(function2) ? 131072 : 65536) | (fetVar2.i(function0) ? 1048576 : 524288) | (fetVar2.i(function1) ? 8388608 : 4194304) | (fetVar2.i(function3) ? 67108864 : 33554432);
        if (fetVar2.U(i4 & 1, (38347923 & i4) != 38347922)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            fqm fqmVar = zo50Var2.b;
            ArrayList arrayList = zo50Var2.f44703a;
            int i5 = fqmVar.b;
            int size = fqmVar.c.size();
            int i6 = size > 1 ? Integer.MAX_VALUE : 1;
            int i7 = i6 / 2;
            int i8 = size == 0 ? 0 : ((i7 % size) + size) % size;
            int i9 = i7 + (i5 >= i8 ? i5 - i8 : (size - i8) + i5);
            boolean zE2 = fetVar2.e(i6);
            Object objP6 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (zE2 || objP6 == cl5Var2) {
                objP6 = new y02(i6, (byte) 6);
                fetVar2.o0(objP6);
            }
            kwj kwjVarB = zk80.b(i9, (Function0) objP6, fetVar2, 0, 2);
            float fC = l1e0.c(0.8f, 0.0f, 1.0f);
            boolean zG = fetVar2.g(kwjVarB) | fetVar2.d(fC);
            Object objP7 = fetVar2.P();
            if (zG || objP7 == cl5Var2) {
                objP7 = jgk0.b(new p1d(kwjVarB, fC, (byte) 2));
                fetVar2.o0(objP7);
            }
            l7m0 l7m0Var = (l7m0) objP7;
            boolean zE3 = fetVar2.e(((Number) l7m0Var.getValue()).intValue()) | fetVar2.e(size);
            Object objP8 = fetVar2.P();
            if (zE3 || objP8 == cl5Var2) {
                objP8 = jgk0.b(new x9c(size, l7m0Var));
                fetVar2.o0(objP8);
            }
            l7m0 l7m0Var2 = (l7m0) objP8;
            Integer numValueOf = Integer.valueOf(size);
            boolean zG2 = fetVar2.g(l7m0Var2) | fetVar2.g(kwjVarB) | ((i4 & 234881024) == 67108864);
            Object objP9 = fetVar2.P();
            if (zG2 || objP9 == cl5Var2) {
                objP9 = new ptz(l7m0Var2, kwjVarB, function3, null);
                fetVar2.o0(objP9);
            }
            m0x0.v(kwjVarB, numValueOf, (Function2) objP9, fetVar2);
            Integer numValueOf2 = Integer.valueOf(i5);
            boolean zG3 = ((i4 & 896) == 256) | fetVar2.g(kwjVarB) | fetVar2.e(size);
            Object objP10 = fetVar2.P();
            if (zG3 || objP10 == cl5Var2) {
                i3 = size;
                kwjVar = kwjVarB;
                yjeVar = null;
                c2 = 0;
                zo50Var2 = zo50Var;
                d21Var = new d21((Object) kwjVar, (Object) zo50Var2, i3, yjeVar, (byte) 10);
                fetVar2.o0(d21Var);
            } else {
                d21Var = objP10;
                yjeVar = null;
                c2 = 0;
                i3 = size;
                kwjVar = kwjVarB;
                zo50Var2 = zo50Var;
            }
            m0x0.t(fetVar2, numValueOf2, (Function2) d21Var);
            boolean zG4 = fetVar2.g(kwjVar) | ((3670016 & r22) == c2);
            Object objP11 = fetVar2.P();
            if (zG4) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP11 == cl5Var) {
                }
                m0x0.t(fetVar2, kwjVar, (Function2) objP11);
                Boolean boolValueOf = Boolean.valueOf(kwjVar.k.a());
                boolean zG5 = fetVar2.g(kwjVar);
                if ((29360128 & r22) == 8388608) {
                    z = true;
                } else {
                    z = false;
                }
                zE = z | zG5 | fetVar2.e(i3);
                objP = fetVar2.P();
                if (zE || objP == cl5Var) {
                    objP = new v48(kwjVar, function1, i3, (yje) null);
                    fetVar2.o0(objP);
                }
                m0x0.t(fetVar2, boolValueOf, (Function2) objP);
                if (arrayList.isEmpty()) {
                    mm40Var2 = r27;
                    fetVar2.e0(-1163053701);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-1164241497);
                    objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = new ngk0();
                        fetVar2.o0(objP2);
                    }
                    ngk0Var = (ngk0) objP2;
                    if ((r22 & 57344) == 16384) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP3 = fetVar2.P();
                    if (!z2 || objP3 == cl5Var) {
                        b2 = 0;
                        objP3 = new Function2() { // from class: a.to50
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                byte b3 = b2;
                                xdr xdrVar3 = xdrVar2;
                                ngk0 ngk0Var2 = ngk0Var;
                                Integer num = (Integer) obj;
                                num.intValue();
                                Integer num2 = (Integer) obj2;
                                num2.intValue();
                                switch (b3) {
                                    case 0:
                                        xdrVar3.F(num, num2, (String) ngk0Var2.get(num));
                                        break;
                                    default:
                                        xdrVar3.F(num, num2, (String) ngk0Var2.get(num));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar2.o0(objP3);
                    } else {
                        b2 = 0;
                    }
                    Function2 function4 = (Function2) objP3;
                    objP4 = fetVar2.P();
                    if (objP4 == cl5Var) {
                        objP4 = new pi40(ngk0Var, (byte) 15);
                        fetVar2.o0(objP4);
                    }
                    G(null, kwjVar, arrayList, i3, function4, (Function2) objP4, fetVar, 196608);
                    mm40Var2 = jm40Var;
                    mm40 mm40VarN = epv0.N(jr8.f16991a.b(mm40Var2, gqw0.h), f2);
                    it50 it50Var = (it50) arrayList.get(((Number) l7m0Var2.getValue()).intValue());
                    fqm fqmVar2 = zo50Var2.b;
                    if ((r22 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    objP5 = fetVar.P();
                    if (z3 || objP5 == cl5Var) {
                        final byte b3 = 1;
                        objP5 = new Function2() { // from class: a.to50
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                byte b4 = b3;
                                xdr xdrVar3 = xdrVar;
                                ngk0 ngk0Var2 = ngk0Var;
                                Integer num = (Integer) obj;
                                num.intValue();
                                Integer num2 = (Integer) obj2;
                                num2.intValue();
                                switch (b4) {
                                    case 0:
                                        xdrVar3.F(num, num2, (String) ngk0Var2.get(num));
                                        break;
                                    default:
                                        xdrVar3.F(num, num2, (String) ngk0Var2.get(num));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar.o0(objP5);
                    }
                    L(mm40VarN, it50Var, fqmVar2, (Function2) objP5, function2, fetVar, 512 | ((i4 >> 3) & 57344));
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
                fetVar2.r(true);
            }
            objP11 = new xo50(kwjVar, function0, yjeVar, (byte) 0);
            fetVar2.o0(objP11);
            m0x0.t(fetVar2, kwjVar, (Function2) objP11);
            Boolean boolValueOf2 = Boolean.valueOf(kwjVar.k.a());
            boolean zG6 = fetVar2.g(kwjVar);
            if ((29360128 & r22) == 8388608) {
                z = true;
            } else {
                z = false;
            }
            zE = z | zG6 | fetVar2.e(i3);
            objP = fetVar2.P();
            if (zE) {
                objP = new v48(kwjVar, function1, i3, (yje) null);
                fetVar2.o0(objP);
            } else {
                objP = new v48(kwjVar, function1, i3, (yje) null);
                fetVar2.o0(objP);
            }
            m0x0.t(fetVar2, boolValueOf2, (Function2) objP);
            if (arrayList.isEmpty()) {
                fetVar2.e0(-1164241497);
                objP2 = fetVar2.P();
                if (objP2 == cl5Var) {
                    objP2 = new ngk0();
                    fetVar2.o0(objP2);
                }
                ngk0Var = (ngk0) objP2;
                if ((r22 & 57344) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP3 = fetVar2.P();
                if (z2) {
                    b2 = 0;
                    objP3 = new Function2() { // from class: a.to50
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b4 = b2;
                            xdr xdrVar3 = xdrVar2;
                            ngk0 ngk0Var2 = ngk0Var;
                            Integer num = (Integer) obj;
                            num.intValue();
                            Integer num2 = (Integer) obj2;
                            num2.intValue();
                            switch (b4) {
                                case 0:
                                    xdrVar3.F(num, num2, (String) ngk0Var2.get(num));
                                    break;
                                default:
                                    xdrVar3.F(num, num2, (String) ngk0Var2.get(num));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP3);
                } else {
                    b2 = 0;
                    objP3 = new Function2() { // from class: a.to50
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b4 = b2;
                            xdr xdrVar3 = xdrVar2;
                            ngk0 ngk0Var2 = ngk0Var;
                            Integer num = (Integer) obj;
                            num.intValue();
                            Integer num2 = (Integer) obj2;
                            num2.intValue();
                            switch (b4) {
                                case 0:
                                    xdrVar3.F(num, num2, (String) ngk0Var2.get(num));
                                    break;
                                default:
                                    xdrVar3.F(num, num2, (String) ngk0Var2.get(num));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar2.o0(objP3);
                }
                Function2 function5 = (Function2) objP3;
                objP4 = fetVar2.P();
                if (objP4 == cl5Var) {
                    objP4 = new pi40(ngk0Var, (byte) 15);
                    fetVar2.o0(objP4);
                }
                G(null, kwjVar, arrayList, i3, function5, (Function2) objP4, fetVar, 196608);
                mm40Var2 = jm40Var;
                mm40 mm40VarN2 = epv0.N(jr8.f16991a.b(mm40Var2, gqw0.h), f2);
                it50 it50Var2 = (it50) arrayList.get(((Number) l7m0Var2.getValue()).intValue());
                fqm fqmVar3 = zo50Var2.b;
                if ((r22 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP5 = fetVar.P();
                if (z3) {
                    final byte b4 = 1;
                    objP5 = new Function2() { // from class: a.to50
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b5 = b4;
                            xdr xdrVar3 = xdrVar;
                            ngk0 ngk0Var2 = ngk0Var;
                            Integer num = (Integer) obj;
                            num.intValue();
                            Integer num2 = (Integer) obj2;
                            num2.intValue();
                            switch (b5) {
                                case 0:
                                    xdrVar3.F(num, num2, (String) ngk0Var2.get(num));
                                    break;
                                default:
                                    xdrVar3.F(num, num2, (String) ngk0Var2.get(num));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP5);
                } else {
                    final byte b5 = 1;
                    objP5 = new Function2() { // from class: a.to50
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b6 = b5;
                            xdr xdrVar3 = xdrVar;
                            ngk0 ngk0Var2 = ngk0Var;
                            Integer num = (Integer) obj;
                            num.intValue();
                            Integer num2 = (Integer) obj2;
                            num2.intValue();
                            switch (b6) {
                                case 0:
                                    xdrVar3.F(num, num2, (String) ngk0Var2.get(num));
                                    break;
                                default:
                                    xdrVar3.F(num, num2, (String) ngk0Var2.get(num));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP5);
                }
                L(mm40VarN2, it50Var2, fqmVar3, (Function2) objP5, function2, fetVar, 512 | ((i4 >> 3) & 57344));
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                mm40Var2 = r27;
                fetVar2.e0(-1163053701);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g3d(mm40Var2, f2, zo50Var2, xdrVar, xdrVar2, function2, function0, function1, function3, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    public static final void N(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1237634456);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(vqm.f37862a, fetVar, 6, 0);
            bik bikVarF = pkd.f(fetVar);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = xbc.c0(i120.Q(jm40Var, background, ljcVar), fqj0VarD0);
            float f2 = 1.0f;
            mm40 mm40VarD = o7k0.d(mm40VarC0, 1.0f);
            bikVarF.getClass();
            if (bikVarF instanceof yhk) {
                f2 = 2.7692308f;
            } else {
                uhk uhkVar = bikVarF instanceof uhk ? (uhk) bikVarF : null;
                if (uhkVar != null && !uhkVar.f35683a) {
                    f2 = 2.7692308f;
                }
            }
            zq8.a(0, fetVar, ny9.O(f2, mm40VarD, false));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i2, (byte) 28);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    public static final void O(mm40 mm40Var, wyq0 wyq0Var, int i2, Function1 function1, fet fetVar, int i3) {
        Object obj;
        int i4;
        fetVar.g0(68005247);
        int i5 = i3 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(wyq0Var) ? 32 : 16) | (fetVar.e(i2) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        boolean z = true;
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            boolean z2 = (i5 & 896) == 256;
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (z2 || objP == obj2) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            bik bikVarF = pkd.f(fetVar);
            bikVarF.getClass();
            boolean z3 = bikVarF instanceof yhk;
            if (z3) {
                obj = wyq0Var.f39986a;
            } else {
                uhk uhkVar = bikVarF instanceof uhk ? (uhk) bikVarF : null;
                if (uhkVar == null || uhkVar.f35683a) {
                    obj = wyq0Var.b;
                } else {
                    obj = wyq0Var.f39986a;
                }
            }
            boolean zG = ((i5 & 7168) == 2048) | fetVar.g(pz40Var) | fetVar.g(obj);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj2) {
                objP2 = new jl40((Object) function1, obj, (Object) pz40Var, (byte) 5);
                fetVar.o0(objP2);
            }
            pm80 pm80VarX = l7x.X(obj, (Function1) objP2, null, fetVar, 0, 26);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            pge pgeVar = gqw0.A;
            if (((lz3) pz40Var.getValue()) instanceof kz3) {
                fetVar.e0(-1279370305);
            } else {
                fetVar.e0(-1279323061);
                if (!z3) {
                    uhk uhkVar2 = bikVarF instanceof uhk ? (uhk) bikVarF : null;
                    if (uhkVar2 == null || uhkVar2.f35683a) {
                        z = false;
                    }
                }
                boolean zC = pkd.c(fetVar);
                if (!z && zC) {
                    i4 = R.drawable.news_catalog_placeholder_square_dark;
                } else if (z || zC) {
                    i4 = (z && zC) ? R.drawable.news_catalog_placeholder_dark : R.drawable.news_catalog_placeholder;
                } else {
                    i4 = R.drawable.news_catalog_placeholder_square;
                }
                pm80VarX = a8k0.F(i4, 0, fetVar);
            }
            fetVar.r(false);
            j0x.b(pm80VarX, null, mm40VarE, null, pgeVar, 0.0f, null, fetVar, 24632, 104);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00(mm40Var, wyq0Var, i2, function1, i3);
        }
    }

    public static final void P(mm40 mm40Var, ggv0 ggv0Var, Function1 function1, fet fetVar, int i2) {
        ggv0Var.getClass();
        function1.getClass();
        fetVar.g0(1150994351);
        int i3 = i2 | (fetVar.g(ggv0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ntu0(function1, (byte) 12);
                fetVar.o0(objP);
            }
            knx.i(false, (Function0) objP, fetVar, 0, 1);
            boolean z2 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ntu0(function1, (byte) 13);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z3 = i4 == 256;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new ntu0(function1, (byte) 14);
                fetVar.o0(objP3);
            }
            v3c.A(function0, (Function0) objP3, null, fetVar, 0, 4);
            mm40 mm40VarQ = i120.Q(o050.S(o7k0.d(mm40Var, 1.0f)), ggv0Var.c(), jd8.n);
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
            jm40 jm40Var = jm40.b;
            n8n0.f(o7k0.d(jm40Var, 1.0f), ggv0Var.a(), function1, fetVar, i4 | 6);
            if (ggv0Var instanceof egv0) {
                fetVar.e0(821414283);
                s7n0.h(o7k0.d(jm40Var, 1.0f), (egv0) ggv0Var, function1, fetVar, (i3 & 112) | 6 | i4);
                fetVar.r(false);
            } else {
                if (!(ggv0Var instanceof fgv0)) {
                    throw b1j.f(821412242, fetVar, false);
                }
                fetVar.e0(821421284);
                ahy.W(o7k0.c, (fgv0) ggv0Var, fetVar, (i3 & 112) | 6);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(mm40Var, ggv0Var, function1, i2, (byte) 15);
        }
    }

    public static final mm40 Q(Function0 function0) {
        n0q n0qVar = o7k0.c;
        zcl zclVar = qmk.f28987a;
        return i4w0.T(s5x0.N(n0qVar, 8.0f, 8.0f, 8.0f, 0.0f, 8), new y(function0, (byte) 22));
    }

    public static final imm R(ctf0 ctf0Var) {
        pz40 pz40Var = s6t0.f31722a;
        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.bonuses_info_name, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
    }

    public static final void S(String str, Bundle bundle, Object obj) {
        if (obj != null) {
            if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof String) {
                bundle.putString(str, (String) obj);
                return;
            }
            if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
                return;
            }
            if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
                return;
            }
            if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
                return;
            }
            if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
                return;
            }
            if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
                return;
            }
            if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
                return;
            }
            if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
                return;
            }
            if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
                return;
            }
            if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
                return;
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
                return;
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
                return;
            }
        }
        c99.m(str, " is not supported", "Type of property ");
    }

    public static final mz3 T(o0x o0xVar, o0x o0xVar2, Function0 function0, Function0 function1, fet fetVar, int i2, int i3) {
        o0xVar.getClass();
        o0x o0xVar3 = (i3 & 2) != 0 ? null : o0xVar2;
        Function0 function2 = (i3 & 4) != 0 ? null : function0;
        Function0 function3 = (i3 & 8) != 0 ? null : function1;
        mz3 mz3VarX = l7x.X(o0xVar3 != null ? o0xVar3.a() : null, null, null, fetVar, 0, 30);
        Object objA = o0xVar.a();
        boolean z = (((i2 & 896) ^ 384) > 256 && fetVar.g(function2)) || (i2 & 384) == 256;
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (z || objP == cl5Var) {
            objP = new y(function2, (byte) 5);
            fetVar.o0(objP);
        }
        Function1 function4 = (Function1) objP;
        boolean z2 = (((i2 & 7168) ^ 3072) > 2048 && fetVar.g(function3)) || (i2 & 3072) == 2048;
        Object objP2 = fetVar.P();
        if (z2 || objP2 == cl5Var) {
            objP2 = new y(function3, (byte) 6);
            fetVar.o0(objP2);
        }
        return l7x.Y(objA, mz3VarX, mz3VarX, null, function4, (Function1) objP2, fetVar, 0, Response.REQUEST_TIMEOUT);
    }

    public static void U(xr xrVar, float f2) {
        xfg0 xfg0Var = (xfg0) xrVar.f41344a;
        CardView cardView = (CardView) xrVar.b;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f2 != xfg0Var.e || xfg0Var.f != useCompatPadding || xfg0Var.g != preventCornerOverlap) {
            xfg0Var.e = f2;
            xfg0Var.f = useCompatPadding;
            xfg0Var.g = preventCornerOverlap;
            xfg0Var.b(null);
            xfg0Var.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            xrVar.t(0, 0, 0, 0);
            return;
        }
        xfg0 xfg0Var2 = (xfg0) xrVar.f41344a;
        float f3 = xfg0Var2.e;
        float f4 = xfg0Var2.f40790a;
        int iCeil = (int) Math.ceil(yfg0.a(f3, f4, cardView.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(yfg0.b(f3, f4, cardView.getPreventCornerOverlap()));
        xrVar.t(iCeil, iCeil2, iCeil, iCeil2);
    }

    public static void V(ByteBuffer byteBuffer, boolean z) {
        for (je60 je60Var : d9x.T(byteBuffer.asReadOnlyBuffer())) {
            int i2 = je60Var.f16358a;
            ByteBuffer byteBuffer2 = je60Var.b;
            if (i2 == 5) {
                try {
                    x0x.A(i2 == 5);
                    ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
                    if (d9x.N(byteBufferAsReadOnlyBuffer) == 4) {
                        if (z && byteBufferAsReadOnlyBuffer.remaining() >= 6) {
                            int iPosition = byteBufferAsReadOnlyBuffer.position();
                            for (int i3 = 0; i3 < 6; i3++) {
                                if (byteBufferAsReadOnlyBuffer.get(iPosition + i3) == f20699a[i3]) {
                                }
                            }
                        }
                        byteBuffer.put(byteBuffer2.position(), (byte) 31);
                        break;
                    }
                } catch (BufferUnderflowException unused) {
                }
            }
        }
    }

    public static final zt6 W(ouj0 ouj0Var, String str, long j2, String str2, String str3, boolean z, boolean z2, int i2) {
        int i3;
        String str4;
        boolean z3;
        ArrayList arrayList;
        long j3;
        yb9 yb9Var;
        ouj0Var.getClass();
        str.getClass();
        str2.getClass();
        long j4 = ouj0Var.f25881a;
        long j5 = ouj0Var.b;
        String str5 = ouj0Var.c;
        boolean z4 = ouj0Var.d;
        List list = ouj0Var.e;
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(ro4.i0((ru6) it.next()));
        }
        int i4 = ouj0Var.f;
        int i5 = ouj0Var.g;
        String str6 = ouj0Var.p;
        boolean z5 = ouj0Var.h;
        List list2 = ouj0Var.i;
        List list3 = ouj0Var.j;
        ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
        Iterator it2 = list3.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            double dDoubleValue = ((Number) it2.next()).doubleValue();
            arrayList3.add(dDoubleValue != -1.0d ? Double.valueOf(dDoubleValue) : null);
        }
        long j6 = ouj0Var.k;
        int i6 = ouj0Var.l;
        boolean z6 = ouj0Var.m;
        String strValueOf = String.valueOf(j2);
        boolean z7 = ouj0Var.n;
        String str7 = ouj0Var.o;
        ex4 ex4Var = ouj0Var.q;
        double d2 = ex4Var != null ? ex4Var.f8559a : 0.0d;
        boolean z8 = ex4Var != null ? ex4Var.b : false;
        boolean z9 = ex4Var != null ? ex4Var.c : false;
        String str8 = ouj0Var.r;
        boolean z10 = ouj0Var.t;
        int i7 = z2 ? 1 : 2;
        boolean z11 = z8;
        boolean zD = Intrinsics.d(ouj0Var.v, Boolean.TRUE);
        String str9 = ouj0Var.w;
        if (str9 == null) {
            str9 = "0";
        }
        String str10 = str9;
        vb9 vb9Var = ouj0Var.y;
        if (vb9Var != null) {
            List list4 = vb9Var.c;
            int i8 = 10;
            ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                rb9 rb9Var = (rb9) it3.next();
                int i9 = i4;
                String str11 = str5;
                long j7 = rb9Var.f30173a;
                Iterator it4 = it3;
                List list5 = rb9Var.c;
                boolean z12 = z4;
                ArrayList arrayList5 = arrayList2;
                ArrayList arrayList6 = new ArrayList(r3d.q(list5, i8));
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    gb9 gb9Var = (gb9) it5.next();
                    arrayList6.add(new ec9(gb9Var.c, gb9Var.b, gb9Var.d, gb9Var.e, gb9Var.f11006a));
                    it5 = it5;
                    j6 = j6;
                }
                kb9 kb9Var = rb9Var.b;
                arrayList4.add(new hc9(j7, new nb9(kb9Var.f18002a, kb9Var.b, kb9Var.c), arrayList6));
                it3 = it4;
                str5 = str11;
                i4 = i9;
                z4 = z12;
                arrayList2 = arrayList5;
                i8 = 10;
            }
            i3 = i4;
            str4 = str5;
            z3 = z4;
            arrayList = arrayList2;
            j3 = j6;
            yb9Var = new yb9(vb9Var.f37130a, vb9Var.b, arrayList4);
        } else {
            i3 = i4;
            str4 = str5;
            z3 = z4;
            arrayList = arrayList2;
            j3 = j6;
            yb9Var = null;
        }
        return new zt6(j4, j5, str, str4, z3, arrayList, i3, i5, z5, list2, arrayList3, j3, i6, z6, strValueOf, str2, str3, z7, str6, str7, d2, z11, z9, z, str8, z10, i7, zD, str10, i2, yb9Var);
    }

    public static final String X(en7 en7Var, ctf0 ctf0Var) {
        en7Var.getClass();
        ctf0Var.getClass();
        return twn.m(en7Var.f8078a, String.format(Locale.ENGLISH, "%s %d/", Arrays.copyOf(new Object[]{ctf0Var.f(R.string.system, new Object[0]), Integer.valueOf(en7Var.c)}, 2)));
    }

    public static final mm40 Y(mm40 mm40Var, boolean z, gy40 gy40Var, boolean z2, ucg0 ucg0Var, Function1 function1) {
        return mm40Var.e(new cvq0(z, gy40Var, z2, ucg0Var, function1));
    }

    public static final void a(mm40 mm40Var, gc gcVar, Function0 function0, fet fetVar, int i2) {
        zfn zfnVar;
        long textPrimary;
        long secondary;
        fetVar.g0(1554589452);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(gcVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int iOrdinal = gcVar.f11035a.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-1800193108);
                zfnVar = zaq0.b;
                textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
                fetVar.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(-1800195187, fetVar, false);
                }
                fetVar.e0(-1800191128);
                zfnVar = zaq0.b;
                textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getWarning();
                fetVar.r(false);
            }
            int iOrdinal2 = gcVar.f11035a.ordinal();
            if (iOrdinal2 == 0) {
                fetVar.e0(1162199275);
                secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
                fetVar.r(false);
            } else {
                if (iOrdinal2 != 1) {
                    throw b1j.f(1162197196, fetVar, false);
                }
                fetVar.e0(1162201193);
                secondary = ((ThemeColors) fetVar.k(zfnVar)).getWarning();
                fetVar.r(false);
            }
            obc.q(mm40Var, new rqm((vui0) new tui0(gcVar.c, new y3d(textPrimary)), (pui0) new oui0((Integer) null, (y3d) null, new m0x(gcVar.b, null, 6), new y3d(secondary), 19), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508), false, null, function0, null, null, null, fetVar, ((i3 << 6) & 57344) | (i3 & 14), 236);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var, gcVar, function0, i2, (byte) 7);
        }
    }

    public static final void b(mm40 mm40Var, tc tcVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        gc gcVar;
        float f2;
        fet fetVar2 = fetVar;
        tcVar.getClass();
        function1.getClass();
        fetVar2.g0(1571822526);
        int i3 = i2 | 6 | (fetVar2.g(tcVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
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
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 28.0f, 0L, fetVar2, 0, 5);
            float f3 = 0.0f;
            c(s5x0.L(jm40Var, 16.0f, 0.0f, 2), tcVar.f33694a, fetVar2, 0);
            wvb.o(null, 16.0f, 0L, fetVar2, 0, 5);
            fetVar2.e0(-305845308);
            int i4 = 0;
            for (Object obj : tcVar.b) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                gc gcVar2 = (gc) obj;
                if (i4 > 0) {
                    fetVar2.e0(-265316257);
                    f2 = f3;
                    gcVar = gcVar2;
                    vtb.t(null, qqm.f29173a, zfi0.f44303a, 0L, fetVar, 432, 9);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    gcVar = gcVar2;
                    f2 = f3;
                    fetVar2.e0(-265129823);
                    fetVar2.r(false);
                }
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(jm40Var, 4.0f, f2, 2);
                boolean zG = ((i3 & 896) == 256) | fetVar2.g(gcVar);
                Object objP = fetVar2.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new mc(function1, gcVar, b2);
                    fetVar2.o0(objP);
                }
                a(mm40VarL, gcVar, (Function0) objP, fetVar2, 0);
                f3 = f2;
                i4 = i5;
            }
            fetVar2.r(false);
            zcl zclVar3 = qmk.f28987a;
            wvb.o(null, 16.0f, 0L, fetVar2, 0, 5);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var2, tcVar, function1, i2, (byte) 6);
        }
    }

    public static final void c(mm40 mm40Var, fd fdVar, fet fetVar, int i2) {
        fetVar.g0(-1718408256);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(fdVar) ? 32 : 16);
        byte b2 = 14;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            uui0 uui0Var = new uui0(fdVar.b, null, fdVar.c, null, null, 58);
            Integer numValueOf = Integer.valueOf(R.drawable.ic_account_default);
            n0x n0xVar = new n0x(fdVar.f9334a);
            zfn zfnVar = zaq0.b;
            obc.q(mm40Var, new rqm((vui0) uui0Var, (pui0) new nui0(numValueOf, null, n0xVar, new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), null, new pc5(new y3d(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent())), 0.0f, 210), (pvi0) new jvi0(fdVar.d, null), d4d.BACKGROUND, (tvi0) null, (wui0) null, false, (e900) null, Response.NOT_ACCEPTABLE_HERE), false, null, null, null, null, null, fetVar, i3 & 14, 252);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mz7(mm40Var, fdVar, i2, b2);
        }
    }

    public static final void d(mm40 mm40Var, sql sqlVar, sql sqlVar2, fet fetVar, int i2) {
        pcy pcyVar;
        sql sqlVar3 = sqlVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1768359342);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(sqlVar) ? 32 : 16) | (fetVar2.g(sqlVar3) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            byte b2 = 14;
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4(b2)), gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
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
            String strQ = w6x.q(sqlVar.c, Separators.SP, sqlVar.b);
            afn0.v(fetVar2).getClass();
            v8q0.a(strQ, null, afn0.m(fetVar2).getTextPrimary(), new n05(qmk.u, qmk.y, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.s(), fetVar, 0, 24960, 110578);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b2)), gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarQ = i120.Q(lgb.J(o7k0.n(jm40Var, 32.0f), vgg0.f37379a), afn0.m(fetVar).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            dww.c(a8k0.F(R.drawable.ic_glyph_favourite_active, 0, fetVar), null, o7k0.n(jm40Var, 20.0f), afn0.m(fetVar).getSecondary(), fetVar, 56, 0);
            fetVar.r(true);
            x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            sqlVar3 = sqlVar2;
            String str = sqlVar3.b;
            afn0.v(fetVar).getClass();
            v8q0.a(str, null, afn0.m(fetVar).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110586);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            String str2 = sqlVar3.c;
            afn0.v(fetVar).getClass();
            v8q0.a(str2, mm40VarN, afn0.m(fetVar).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.m(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            ohs0.x(fetVar2, true, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mql(mm40Var, sqlVar, sqlVar3, i2, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x015c  */
    public static final void e(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        mm40 mm40Var2;
        boolean z;
        int i3;
        Object obj;
        int i4;
        boolean z2;
        Object obj2;
        Function0 function0;
        boolean zG;
        Object obj3;
        l7m0Var.getClass();
        fetVar.g0(1758527516);
        int i5 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i5 & 1, (i5 & 147) != 146)) {
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, background, ljcVar);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40VarQ.e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            Function0 function3 = e7z.u1;
            if (z3) {
                fetVar.l(function3);
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
            imm immVar = ((rk1) l7m0Var.getValue()).f30624a;
            int i6 = i5 & 896;
            boolean z4 = i6 == 256;
            Object objP = fetVar.P();
            Object obj4 = ukd.f35823a;
            Object obj5 = objP;
            if (z4 || objP == obj4) {
                Object si1Var = new si1(function1, (byte) 5);
                fetVar.o0(si1Var);
                obj5 = si1Var;
            }
            hlm.c(null, immVar, null, (Function0) obj5, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            d9z d9zVarA = f9z.a(fetVar);
            jk1 jk1Var = ((rk1) l7m0Var.getValue()).b;
            if (jk1Var instanceof hk1) {
                fetVar.e0(-551577665);
                dol dolVar = ((hk1) jk1Var).f13187a;
                if (dolVar instanceof bol) {
                    fetVar.e0(-551490400);
                    a4x a4xVar = ((bol) dolVar).f2938a;
                    i3 = i6;
                    i4 = 256;
                    boolean z5 = i3 == 256;
                    Object objP2 = fetVar.P();
                    if (z5) {
                        obj = obj4;
                    } else {
                        obj = obj4;
                        if (objP2 != obj) {
                            function2 = function1;
                            obj2 = objP2;
                        }
                        function0 = (Function0) obj2;
                        zG = fetVar.g(d9zVarA) | fetVar.g(function0);
                        Object objP3 = fetVar.P();
                        if (!zG || objP3 == obj) {
                            z = true;
                            Object xi1Var = new xi1(d9zVarA, function0, null, true ? 1 : 0);
                            fetVar.o0(xi1Var);
                            obj3 = xi1Var;
                        } else {
                            z = true;
                            obj3 = objP3;
                        }
                        m0x0.t(fetVar, a4xVar, (Function2) obj3);
                        z2 = false;
                        fetVar.r(false);
                    }
                    function2 = function1;
                    Object si1Var2 = new si1(function2, (byte) 6);
                    fetVar.o0(si1Var2);
                    obj2 = si1Var2;
                    function0 = (Function0) obj2;
                    zG = fetVar.g(d9zVarA) | fetVar.g(function0);
                    Object objP4 = fetVar.P();
                    if (zG) {
                        z = true;
                        Object xi1Var2 = new xi1(d9zVarA, function0, null, true ? 1 : 0);
                        fetVar.o0(xi1Var2);
                        obj3 = xi1Var2;
                    } else {
                        z = true;
                        Object xi1Var3 = new xi1(d9zVarA, function0, null, true ? 1 : 0);
                        fetVar.o0(xi1Var3);
                        obj3 = xi1Var3;
                    }
                    m0x0.t(fetVar, a4xVar, (Function2) obj3);
                    z2 = false;
                    fetVar.r(false);
                } else {
                    function2 = function1;
                    i3 = i6;
                    obj = obj4;
                    i4 = 256;
                    z = true;
                    z2 = false;
                    fetVar.e0(-551044496);
                    fetVar.r(false);
                }
                zcl zclVar = qmk.f28987a;
                ch80 ch80VarF = knm0.f(new lh80(qmk.a(fetVar).c, 8.0f, qmk.a(fetVar).c, 24.0f), fetVar);
                boolean z6 = i3 == i4 ? z : z2;
                Object objP5 = fetVar.P();
                Object obj6 = objP5;
                if (z6 || objP5 == obj) {
                    Object h61Var = new h61(function2, (byte) 13);
                    fetVar.o0(h61Var);
                    obj6 = h61Var;
                }
                wvb.k(n0qVar, dolVar, d9zVarA, ch80VarF, (Function1) obj6, null, fetVar, 0, 32);
                fetVar.r(z2);
            } else {
                function2 = function1;
                z = true;
                if (!(jk1Var instanceof ik1)) {
                    throw b1j.f(-1126174599, fetVar, false);
                }
                fetVar.e0(-550009096);
                mm40 mm40VarE2 = tfx.E(n0qVar);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE2);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function3);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                mdm mdmVar = ((ik1) jk1Var).f14903a;
                boolean z7 = i6 == 256;
                Object objP6 = fetVar.P();
                Object obj7 = objP6;
                if (z7 || objP6 == obj4) {
                    Object si1Var3 = new si1(function2, (byte) 7);
                    fetVar.o0(si1Var3);
                    obj7 = si1Var3;
                }
                jcb.l(null, mdmVar, false, (Function0) obj7, fetVar, 0, 5);
                fetVar.r(true);
                fetVar.r(false);
            }
            fetVar.r(z);
            mm40Var2 = jm40Var;
        } else {
            function2 = function1;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var2, l7m0Var, function2, i2, (byte) 4);
        }
    }

    public static final void f(mm40 mm40Var, vw1 vw1Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1840441287);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(vw1Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (!fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.X();
        } else if (vw1Var instanceof tw1) {
            fetVar.e0(-965839477);
            i(mm40Var, (tw1) vw1Var, function1, fetVar, i3 & 1022);
            fetVar.r(false);
        } else {
            if (!vw1Var.equals(uw1.f36373a)) {
                throw b1j.f(-862442201, fetVar, false);
            }
            fetVar.e0(-965584626);
            j(i3 & 14, fetVar, mm40Var);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var, vw1Var, function1, i2, (byte) 23);
        }
    }

    public static final void g(qw1 qw1Var, fet fetVar, int i2) {
        qw1 qw1Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1475146923);
        int i3 = i2 | (fetVar2.g(qw1Var) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, 32.0f), vgg0.f37379a);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), jd8.n), "AGGREGATOR_TOURNAMENT_RULES_CELL_NUMBER_BOX");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (qw1Var instanceof pw1) {
                fetVar2.e0(640548676);
                v8q0.a(((pw1) qw1Var).f27688a, o2e.e0(jm40Var, "AGGREGATOR_TOURNAMENT_RULES_CELL_NUMBER_TEXT"), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, new y9q0(0L, qmk.s, null, j1t0.f15753a, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 48, 24576, 114680);
                fetVar2 = fetVar;
                fetVar2.r(false);
                qw1Var2 = qw1Var;
            } else {
                qw1Var2 = qw1Var;
                if (!(qw1Var2 instanceof ow1)) {
                    throw b1j.f(1683228136, fetVar2, false);
                }
                fetVar2.e0(640916026);
                h(((ow1) qw1Var2).f25949a, fetVar2, 0);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            qw1Var2 = qw1Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o00(qw1Var2, i2, (byte) 23);
        }
    }

    public static final void h(m0x m0xVar, fet fetVar, int i2) {
        fet fetVar2;
        fetVar.g0(1791530937);
        int i3 = (fetVar.g(m0xVar) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fetVar.e0(-2060315503);
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            dww.c(a8k0.F(m0xVar.f20977a, 0, fetVar), null, o2e.e0(o7k0.n(jm40.b, 24.0f), "AGGREGATOR_TOURNAMENT_RULES_CELL_RULES_ICON"), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(false);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sw1(m0xVar, i2);
        }
    }

    public static final void i(mm40 mm40Var, tw1 tw1Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(1176520689);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(tw1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.valueOf(tw1Var.d));
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                zcl zclVar = qmk.f28987a;
                objP2 = vgg0.a(16.0f);
                fetVar2.o0(objP2);
            }
            ugg0 ugg0Var = (ugg0) objP2;
            boolean z = (i3 & 896) == 256;
            Object objP3 = fetVar2.P();
            if (z || objP3 == cl5Var) {
                objP3 = new rw1(pz40Var, function1);
                fetVar2.o0(objP3);
            }
            Function0 function0 = (Function0) objP3;
            mm40 mm40VarJ = lgb.J(mm40Var, ugg0Var);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), "AGGREGATOR_TOURNAMENT_RULES_CELL_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarH = phu0.H(o7k0.e(mm40VarD, 48.0f), null, 1);
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = dw9.j(fetVar2);
            }
            mm40 mm40VarM = s5x0.M(y860.W(mm40VarH, (gy40) objP4, null, false, null, function0, 28), 12.0f, 4.0f, 4.0f, 4.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarM);
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
            g(tw1Var.c, fetVar2, 0);
            v8q0.a(tw1Var.f34626a, o2e.e0(new x7z(1.0f, true), "AGGREGATOR_TOURNAMENT_RULES_CELL_TITLE"), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.t, null, j1t0.f15753a, 0L, null, 0, 0, idm0.t(22), 16646109), fetVar, 0, 24960, 110584);
            acb.n(new zb(null, null, 7), ((Boolean) pz40Var.getValue()).booleanValue(), function0, null, fetVar, 0, 8);
            fetVar2 = fetVar;
            fetVar2.r(true);
            b34.e(y5d.f42040a, ((Boolean) pz40Var.getValue()).booleanValue(), null, null, null, null, u1c.M(1493890147, new un6(tw1Var, (byte) 12), fetVar2), fetVar2, 1572870, 30);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var, (Object) tw1Var, (Object) function1, i2, (byte) 18);
        }
    }

    public static final void j(int i2, fet fetVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(-207339661);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(mm40VarD, 288.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i2, b2);
        }
    }

    public static final void k(final float f2, fet fetVar, int i2) {
        ro50 ro50Var;
        yfe0 yfe0VarU;
        final Window window;
        fetVar.g0(1400592400);
        int i3 = (fetVar.d(f2) ? 4 : 2) | i2;
        final byte b2 = 1;
        final byte b3 = 0;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            Activity activity = (Activity) fetVar.k(cr00.f4820a);
            if (activity == null || (window = activity.getWindow()) == null) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    ro50Var = new ro50(f2, i2, b3);
                }
            } else {
                final boolean zC = pkd.c(fetVar);
                androidx.compose.runtime.d dVar = zaq0.b;
                long jP = fbc.P(f2, y3d.c(0.0f, ((ThemeColors) fetVar.k(dVar)).getBackgroundContent()), ((ThemeColors) fetVar.k(dVar)).getBackgroundContent());
                int i4 = i3 & 14;
                boolean zI = fetVar.i(window) | (i4 == 4) | fetVar.h(zC);
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (zI || objP == obj) {
                    objP = new Function0() { // from class: a.so50
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ycm0 ziv0Var;
                            ycm0 ziv0Var2;
                            byte b4 = b3;
                            boolean z = false;
                            boolean z2 = zC;
                            float f3 = f2;
                            Window window2 = window;
                            switch (b4) {
                                case 0:
                                    if (f3 > 0.5f && !z2) {
                                        z = true;
                                    }
                                    ani0 ani0Var = new ani0(window2.getDecorView());
                                    int i5 = Build.VERSION.SDK_INT;
                                    if (i5 >= 35) {
                                        ziv0Var = new bjv0(window2, ani0Var);
                                    } else if (i5 >= 30) {
                                        ziv0Var = new ajv0(window2, ani0Var);
                                    } else {
                                        ziv0Var = i5 >= 26 ? new ziv0(window2, ani0Var) : new yiv0(window2, ani0Var);
                                    }
                                    ziv0Var.w(z);
                                    break;
                                default:
                                    if (f3 > 0.5f && !z2) {
                                        z = true;
                                    }
                                    ani0 ani0Var2 = new ani0(window2.getDecorView());
                                    int i6 = Build.VERSION.SDK_INT;
                                    if (i6 >= 35) {
                                        ziv0Var2 = new bjv0(window2, ani0Var2);
                                    } else if (i6 >= 30) {
                                        ziv0Var2 = new ajv0(window2, ani0Var2);
                                    } else {
                                        ziv0Var2 = i6 >= 26 ? new ziv0(window2, ani0Var2) : new yiv0(window2, ani0Var2);
                                    }
                                    ziv0Var2.w(z);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP);
                }
                m0x0.D((Function0) objP, fetVar);
                boolean zI2 = (i4 == 4) | fetVar.i(window) | fetVar.h(zC);
                Object objP2 = fetVar.P();
                if (zI2 || objP2 == obj) {
                    objP2 = new Function0() { // from class: a.so50
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ycm0 ziv0Var;
                            ycm0 ziv0Var2;
                            byte b4 = b2;
                            boolean z = false;
                            boolean z2 = zC;
                            float f3 = f2;
                            Window window2 = window;
                            switch (b4) {
                                case 0:
                                    if (f3 > 0.5f && !z2) {
                                        z = true;
                                    }
                                    ani0 ani0Var = new ani0(window2.getDecorView());
                                    int i5 = Build.VERSION.SDK_INT;
                                    if (i5 >= 35) {
                                        ziv0Var = new bjv0(window2, ani0Var);
                                    } else if (i5 >= 30) {
                                        ziv0Var = new ajv0(window2, ani0Var);
                                    } else {
                                        ziv0Var = i5 >= 26 ? new ziv0(window2, ani0Var) : new yiv0(window2, ani0Var);
                                    }
                                    ziv0Var.w(z);
                                    break;
                                default:
                                    if (f3 > 0.5f && !z2) {
                                        z = true;
                                    }
                                    ani0 ani0Var2 = new ani0(window2.getDecorView());
                                    int i6 = Build.VERSION.SDK_INT;
                                    if (i6 >= 35) {
                                        ziv0Var2 = new bjv0(window2, ani0Var2);
                                    } else if (i6 >= 30) {
                                        ziv0Var2 = new ajv0(window2, ani0Var2);
                                    } else {
                                        ziv0Var2 = i6 >= 26 ? new ziv0(window2, ani0Var2) : new yiv0(window2, ani0Var2);
                                    }
                                    ziv0Var2.w(z);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP2);
                }
                v3c.z((Function0) objP2, null, null, fetVar, 0, 6);
                mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                WeakHashMap weakHashMap = djv0.w;
                zq8.a(0, fetVar, i120.Q(y860.j0(mm40VarD, zcm0.i(fetVar).f), jP, jd8.n));
            }
            yfe0VarU.d = ro50Var;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            ro50Var = new ro50(f2, i2, b2);
            yfe0VarU.d = ro50Var;
        }
    }

    public static final void l(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var) {
        int i3;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        fetVar2.g0(-984677880);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(l7m0Var) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 48);
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
            String str = ((df4) l7m0Var.getValue()).f5982a;
            zfn zfnVar = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, null, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.q(), fetVar, 0, 0, 131066);
            String str2 = ((df4) l7m0Var.getValue()).b;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.g(), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cf4(mm40Var, l7m0Var, i2, (byte) 0);
        }
    }

    public static final void m(int i2, fet fetVar, mm40 mm40Var, Function0 function0) {
        mm40Var.getClass();
        function0.getClass();
        fetVar.g0(1975342077);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_arrow_left, 6, fetVar), fetVar), null, y860.W(mm40Var, null, null, true, null, function0, 24), obc.O(R.color.static_white, fetVar), fetVar, 56, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(mm40Var, function0, i2, (byte) 3);
        }
    }

    public static final void n(mm40 mm40Var, yo5 yo5Var, Function1 function1, xdr xdrVar, fet fetVar, int i2) {
        mm40 mm40Var2;
        ue9 ue9Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-175334888);
        int i3 = i2 | 6 | (fetVar2.i(yo5Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(xdrVar) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
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
            mm40 mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
            String str = yo5Var.b;
            ArrayList arrayList = yo5Var.c;
            y3d y3dVar = new y3d(((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary());
            if (arrayList.size() > 3) {
                fetVar2.e0(-409936168);
                ue9Var = new ue9(xsm0.s(R.string.all, fetVar2));
                fetVar2.r(false);
            } else {
                fetVar2.e0(-409840440);
                fetVar2.r(false);
                ue9Var = null;
            }
            hjm hjmVar = new hjm(str, null, y3dVar, null, null, null, false, null, null, false, ue9Var, null, 7162);
            kjm kjmVar = kjm.f18392a;
            int i4 = i3 & 112;
            boolean z = ((i3 & 896) == 256) | (i4 == 32 || fetVar2.i(yo5Var));
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new a540((byte) 8, (Object) yo5Var, function1);
                fetVar2.o0(objP);
            }
            nkb.h(mm40VarL, hjmVar, kjmVar, null, (Function0) objP, null, fetVar2, 384, 40);
            hzc0 hzc0Var = new hzc0(ma80.b);
            Integer numValueOf = Integer.valueOf(pkd.c(fetVar2) ? R.drawable.news_catalog_placeholder_square_dark : R.drawable.news_catalog_placeholder_square);
            boolean z2 = ((i3 & 7168) == 2048) | (i4 == 32 || fetVar2.i(yo5Var));
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ba30(xdrVar, yo5Var, (byte) 20);
                fetVar2.o0(objP2);
            }
            uzb.u(null, arrayList, hzc0Var, false, null, 0.0f, 0.0f, numValueOf, (Function2) objP2, fetVar, 384, 121);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 2, i2, (Object) mm40Var2, (Object) yo5Var, (Object) function1, (Object) xdrVar);
        }
    }

    public static final void o(int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(1195991871);
        int i3 = i2 | 6;
        byte b2 = 2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
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
            nkb.h(s5x0.L(mm40Var2, xfn.a(fetVar).e, 0.0f, 2), new ijm(), kjm.f18392a, null, null, null, fetVar, 384, 56);
            iun iunVar = iun.f15405a;
            hzc0 hzc0Var = new hzc0(ma80.b);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new rj50(b2);
                fetVar.o0(objP);
            }
            uzb.u(null, iunVar, hzc0Var, true, null, 0.0f, 0.0f, null, (Function2) objP, fetVar, 100666800, 241);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var2, i2, (byte) 27);
        }
    }

    public static final void p(int i2, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        str2.getClass();
        fetVar2.g0(-631843131);
        int i3 = i2 | 6 | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 12.0f, 0.0f, 2);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarL, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 4, 0, null, g1t0.j(), fetVar2, (i3 >> 3) & 14, 24960, 109560);
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
            yfe0VarU.d = new hx1(mm40Var2, str2, i2, (byte) 11);
        }
    }

    public static final void q(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1631998047);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (!fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.X();
        } else if (((rgc) l7m0Var.getValue()).b.isEmpty()) {
            fetVar.e0(-175755975);
            B(0, fetVar);
            fetVar.r(false);
        } else {
            fetVar.e0(-175707088);
            H(l7m0Var, function1, fetVar, i3 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i2, (byte) 22);
        }
    }

    public static final void r(mm40 mm40Var, String str, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(-748665655);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarW = o7k0.w(o7k0.d(mm40Var, 1.0f), null, false, 3);
            zfn zfnVar = zaq0.b;
            hlm.c(mm40VarW, new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(str, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null), null, function0, null, null, null, null, null, null, null, null, fetVar, (i3 << 3) & 7168, 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f49(mm40Var, str, function0, i2, (byte) 3);
        }
    }

    public static final void s(mm40 mm40Var, w2d w2dVar, ugd ugdVar, ugd ugdVar2, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1731493337);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(w2dVar) : fetVar.i(w2dVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 2048 : 1024;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(w2dVar)));
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new j2d(ugdVar2, ugdVar, w2dVar, b2);
                fetVar.o0(objP);
            }
            x4n0.a(mm40Var, (Function2) objP, fetVar, i3 & 14, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qo50(mm40Var, w2dVar, ugdVar, ugdVar2, i2, (byte) 0);
        }
    }

    public static final void t(mm40 mm40Var, zo50 zo50Var, xdr xdrVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-1380778660);
        byte b2 = 4;
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(zo50Var) ? 32 : 16) | (fetVar.i(xdrVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "CONTENT_LAZY_COLUMN");
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 8.0f, 0.0f, 32.0f, 5), fetVar);
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new jl40(zo50Var, function1, xdrVar, b2);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE0, null, ch80VarG, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 1, i2, (Object) mm40Var, (Object) zo50Var, (Object) xdrVar, (Object) function1);
        }
    }

    public static final void u(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(-165886453);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
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
            jcb.l(jr8.f16991a.b(jm40.b, gqw0.e), mdmVar, false, function0, fetVar, (i3 & 112) | ((i3 << 3) & 7168), 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gg8(mm40Var, mdmVar, function0, i2, (byte) 3);
        }
    }

    public static final void v(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-688079113);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80VarU = s5x0.u(0.0f, 8.0f, 0.0f, 32.0f, 5);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new mb50((byte) 7);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, lh80VarU, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i3 & 14) | 817889280, 362);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i2, (byte) 26);
        }
    }

    public static final void w(final mm40 mm40Var, final h7h h7hVar, final Function1 function1, fet fetVar, final int i2) {
        int i3;
        a4x a4xVar = h7hVar.g;
        function1.getClass();
        fetVar.g0(-940853069);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(h7hVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (!fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.X();
        } else {
            if (a4xVar.isEmpty()) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    final byte b2 = 0;
                    yfe0VarU.d = new Function2() { // from class: a.c7h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = b2;
                            int i4 = i2;
                            Function1 function2 = function1;
                            h7h h7hVar2 = h7hVar;
                            mm40 mm40Var2 = mm40Var;
                            fet fetVar2 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    lv00.w(mm40Var2, h7hVar2, function2, fetVar2, x8x.L(i4 | 1));
                                    break;
                                default:
                                    lv00.w(mm40Var2, h7hVar2, function2, fetVar2, x8x.L(i4 | 1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    return;
                }
                return;
            }
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                List listD0 = CollectionsKt.D0(a4xVar, 3);
                ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                Iterator it = listD0.iterator();
                while (it.hasNext()) {
                    arrayList.add(b7h.a((b7h) it.next()));
                }
                objP = dyb.o0(arrayList);
                fetVar.o0(objP);
            }
            a4x a4xVar2 = (a4x) objP;
            int i4 = i3;
            long j2 = h7hVar.f12573a;
            String str = h7hVar.b;
            String str2 = h7hVar.e;
            if (h7hVar.d <= 0) {
                str2 = null;
            }
            vzb.a(mm40Var, a4xVar2, j2, str, str2, function1, fetVar, (i4 & 14) | ((i4 << 9) & 458752));
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            final byte b3 = 1;
            yfe0VarU2.d = new Function2() { // from class: a.c7h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b3;
                    int i5 = i2;
                    Function1 function2 = function1;
                    h7h h7hVar2 = h7hVar;
                    mm40 mm40Var2 = mm40Var;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b4) {
                        case 0:
                            lv00.w(mm40Var2, h7hVar2, function2, fetVar2, x8x.L(i5 | 1));
                            break;
                        default:
                            lv00.w(mm40Var2, h7hVar2, function2, fetVar2, x8x.L(i5 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void x(int i2, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(290526591);
        int i3 = i2 | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 32.0f, 0.0f, 2);
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
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2, (i3 >> 3) & 14, 0, 130042);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var, str2, i2, (byte) 19);
        }
    }

    public static final void y(final h7h h7hVar, final Function0 function0, final Function1 function1, fet fetVar, final int i2) {
        h7h h7hVar2;
        Function0 function2;
        Function1 function3;
        yfe0 yfe0VarU;
        Function2 function4;
        function1.getClass();
        fetVar.g0(-1490915966);
        int i3 = i2 | (fetVar.g(h7hVar) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            boolean z = h7hVar.c;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar.e0(-1620544146);
                n0q n0qVar = o7k0.c;
                boolean z2 = (i3 & 112) == 32;
                Object objP = fetVar.P();
                if (z2 || objP == cl5Var) {
                    objP = new y(function0, (byte) 23);
                    fetVar.o0(objP);
                }
                wzb.j(i4w0.T(n0qVar, (Function1) objP), null, fetVar, 0, 2);
                fetVar.r(false);
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b2 = 0;
                function4 = new Function2(h7hVar, function0, function1, i2, b2) { // from class: a.d7h

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ byte f5592a;
                    public final /* synthetic */ h7h b;
                    public final /* synthetic */ Function0 c;
                    public final /* synthetic */ Function1 d;

                    {
                        this.f5592a = b2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = this.f5592a;
                        Function1 function5 = this.d;
                        Function0 function6 = this.c;
                        h7h h7hVar3 = this.b;
                        fet fetVar2 = (fet) obj;
                        ((Integer) obj2).getClass();
                        switch (b3) {
                            case 0:
                                lv00.y(h7hVar3, function6, function5, fetVar2, x8x.L(1));
                                break;
                            case 1:
                                lv00.y(h7hVar3, function6, function5, fetVar2, x8x.L(1));
                                break;
                            default:
                                lv00.y(h7hVar3, function6, function5, fetVar2, x8x.L(1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                fetVar.e0(-1620342336);
                fetVar.r(false);
                if (!h7hVar.g.isEmpty() || h7hVar.d <= 0) {
                    function2 = function0;
                    function3 = function1;
                    h7hVar2 = h7hVar;
                    fetVar.e0(-1620116160);
                    fetVar.r(false);
                    n0q n0qVar2 = o7k0.c;
                    boolean z3 = (i3 & 112) == 32;
                    Object objP2 = fetVar.P();
                    if (z3 || objP2 == cl5Var) {
                        objP2 = new y(function2, (byte) 24);
                        fetVar.o0(objP2);
                    }
                    mm40 mm40VarT = i4w0.T(n0qVar2, (Function1) objP2);
                    zcl zclVar = qmk.f28987a;
                    qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
                    lh80 lh80Var = new lh80(8.0f, 8.0f, 8.0f, 16.0f);
                    boolean z4 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
                    Object objP3 = fetVar.P();
                    if (z4 || objP3 == cl5Var) {
                        objP3 = new v4f(h7hVar2, function3, (byte) 27);
                        fetVar.o0(objP3);
                    }
                    b8k0.e(mm40VarT, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP3, fetVar, 0, 490);
                } else {
                    fetVar.e0(-1620267998);
                    x(6, fetVar, o7k0.c, h7hVar.f);
                    fetVar.r(false);
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU == null) {
                        return;
                    }
                    final byte b3 = 1;
                    function4 = new Function2(h7hVar, function0, function1, i2, b3) { // from class: a.d7h

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ byte f5592a;
                        public final /* synthetic */ h7h b;
                        public final /* synthetic */ Function0 c;
                        public final /* synthetic */ Function1 d;

                        {
                            this.f5592a = b3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b4 = this.f5592a;
                            Function1 function5 = this.d;
                            Function0 function6 = this.c;
                            h7h h7hVar3 = this.b;
                            fet fetVar2 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b4) {
                                case 0:
                                    lv00.y(h7hVar3, function6, function5, fetVar2, x8x.L(1));
                                    break;
                                case 1:
                                    lv00.y(h7hVar3, function6, function5, fetVar2, x8x.L(1));
                                    break;
                                default:
                                    lv00.y(h7hVar3, function6, function5, fetVar2, x8x.L(1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                }
            }
            yfe0VarU.d = function4;
        }
        h7hVar2 = h7hVar;
        function2 = function0;
        function3 = function1;
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b4 = 2;
            final h7h h7hVar3 = h7hVar2;
            final Function0 function5 = function2;
            final Function1 function6 = function3;
            function4 = new Function2(h7hVar3, function5, function6, i2, b4) { // from class: a.d7h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f5592a;
                public final /* synthetic */ h7h b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;

                {
                    this.f5592a = b4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b5 = this.f5592a;
                    Function1 function7 = this.d;
                    Function0 function8 = this.c;
                    h7h h7hVar4 = this.b;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b5) {
                        case 0:
                            lv00.y(h7hVar4, function8, function7, fetVar2, x8x.L(1));
                            break;
                        case 1:
                            lv00.y(h7hVar4, function8, function7, fetVar2, x8x.L(1));
                            break;
                        default:
                            lv00.y(h7hVar4, function8, function7, fetVar2, x8x.L(1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function4;
        }
    }

    public static final void z(wql wqlVar, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        sql sqlVar = wqlVar.f39596a;
        fetVar2.g0(-2032468339);
        int i4 = i2 & 6;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 = i2 | (fetVar2.g(jm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(wqlVar) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            k6z k6zVar = (k6z) fetVar2.k(bmd.n);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarI = dw9.i(zclVar, zclVar, zclVar, zclVar, jm40Var);
            zfn zfnVar = zaq0.b;
            long primary = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarI, primary, ljcVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), true);
            kjm kjmVar = kjm.f18392a;
            boolean zG = fetVar2.g(wqlVar.d);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                ljm ljmVar = new ljm();
                String str = wqlVar.d;
                pz40 pz40Var = s6t0.f31722a;
                objP = new hjm(str, ljmVar, new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU()), null, null, null, false, null, null, false, null, null, 8184);
                fetVar2.o0(objP);
            }
            nkb.h(mm40VarH, (hjm) objP, kjmVar, null, null, null, fetVar, 384, 56);
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 144.0f), 68.0f);
            k6z k6zVar2 = k6z.b;
            mm40 mm40VarV = yyw.V(mm40VarE, k6zVar == k6zVar2);
            o0x o0xVar = sqlVar.f32635a;
            k7x.a(o0xVar != null ? o0xVar.a() : null, null, mm40VarV, null, null, fetVar, 48, 2040);
            fetVar.r(true);
            mm40 mm40VarN = s5x0.N(jm40Var, 12.0f, 0.0f, 12.0f, 12.0f, 2);
            zcl zclVar2 = qmk.e;
            d(s5x0.J(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar), 12.0f), sqlVar, wqlVar.c, fetVar, 0);
            fetVar.r(true);
            mm40 mm40VarV2 = yyw.V(jr8.f16991a.b(o7k0.n(jm40Var, 72.0f), gqw0.i), k6zVar == k6zVar2);
            o0x o0xVar2 = wqlVar.b;
            fetVar2 = fetVar;
            k7x.a(o0xVar2 != null ? o0xVar2.a() : null, null, mm40VarV2, null, null, fetVar2, 48, 2040);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(wqlVar, i2);
        }
    }
}
