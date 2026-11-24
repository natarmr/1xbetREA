package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.huawei.hms.adapter.internal.CommonCode;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i120 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Handler f13975a;
    public static final eoh0 f;
    public static final jbp g;
    public static final d13 i;
    public static final d13 j;
    public static final hcg0 k;
    public static final tgo0 l;
    public static final niq m;
    public static final ugd b = new ugd(-57938702, false, new i5b(26));
    public static final ugd c = new ugd(-1491442472, false, new ehd(10));
    public static final ugd d = new ugd(-249613142, false, new ihd(18));
    public static final ugd e = new ugd(873617325, false, new qhd(2));
    public static final d13 h = new d13(1000);

    static {
        byte b2 = 24;
        f = new eoh0(b2);
        g = new jbp(b2);
        new d13(1007);
        i = new d13(1008);
        j = new d13(CommonCode.BusInterceptor.PRIVACY_CANCEL);
        k = new hcg0(0.16f, 0.1f, 0.08f, 0.1f);
        l = new tgo0((byte) 19);
        m = new niq(0);
    }

    public static final void A(int i2, fet fetVar) {
        fetVar.g0(-1106987473);
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
                objP2 = new zxb((byte) 14);
                fetVar.o0(objP2);
            }
            mm40 mm40VarQ = Q(y860.W(mm40VarH, gy40Var, null, false, null, (Function0) objP2, 28), ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), jd8.n);
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
            yfe0VarU.d = new sfc(i2, (byte) 2);
        }
    }

    public static final void B(mdm mdmVar, fet fetVar, int i2) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(267449793);
        byte b2 = 2;
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            fetVar.b0(-678785144, Integer.valueOf(mdmVar.f21603a));
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarH = o7k0.h(mm40VarD, 220.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarH);
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
            jcb.l(null, mdmVar2, false, null, fetVar2, (i3 << 3) & 112, 13);
            fetVar2.r(true);
            fetVar2.r(false);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vl0(mdmVar2, i2, b2);
        }
    }

    public static final void C(int i2, fet fetVar, mm40 mm40Var, Function0 function0) {
        mm40 mm40Var2;
        fetVar.g0(1477724555);
        int i3 = i2 | 6 | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zfn zfnVar = zaq0.b;
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), new plm(xsm0.s(R.string.news_catalog, fetVar), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), true, null);
            int i4 = 6 | ((i3 << 6) & 7168);
            mm40Var2 = jm40.b;
            hlm.c(mm40Var2, immVar, null, function0, null, null, null, null, null, null, null, null, fetVar, i4, 0, 4084);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(mm40Var2, function0, i2, (byte) 10);
        }
    }

    public static final void D(mm40 mm40Var, rp50 rp50Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        rp50Var.getClass();
        function1.getClass();
        fetVar.g0(502761388);
        int i3 = i2 | (fetVar.g(rp50Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            mm40Var2 = mm40Var;
            mm40 mm40VarE = mm40Var2.e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new w250(function1, (byte) 15);
                fetVar.o0(objP);
            }
            C(0, fetVar, null, (Function0) objP);
            mm40 mm40VarQ = Q(n0qVar, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            if (rp50Var instanceof qp50) {
                fetVar.e0(-1526595960);
                I(0, fetVar, null);
                fetVar.r(false);
            } else if (rp50Var instanceof op50) {
                fetVar.e0(-1526444556);
                op50 op50Var = (op50) rp50Var;
                boolean z3 = i4 == 256;
                Object objP2 = fetVar.P();
                if (z3 || objP2 == cl5Var) {
                    objP2 = new rp30(function1, (byte) 22);
                    fetVar.o0(objP2);
                }
                Function1 function2 = (Function1) objP2;
                boolean z4 = i4 == 256;
                Object objP3 = fetVar.P();
                if (z4 || objP3 == cl5Var) {
                    objP3 = new nc40(function1, (byte) 4);
                    fetVar.o0(objP3);
                }
                j(null, op50Var, function2, (xdr) objP3, fetVar, i3 & 112);
                fetVar.r(false);
            } else {
                if (!(rp50Var instanceof pp50)) {
                    throw b1j.f(1059132799, fetVar, false);
                }
                fetVar.e0(-1525529374);
                mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
                mdm mdmVar = ((pp50) rp50Var).f27361a;
                boolean z5 = i4 == 256;
                Object objP4 = fetVar.P();
                if (z5 || objP4 == cl5Var) {
                    objP4 = new w250(function1, (byte) 16);
                    fetVar.o0(objP4);
                }
                w(mm40VarB, mdmVar, (Function0) objP4, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var2, rp50Var, function1, i2, (byte) 29);
        }
    }

    public static final void E(mm40 mm40Var, nfh0 nfh0Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2;
        fetVar.g0(-1692931499);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(nfh0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            nkb.h(mm40Var2, nfh0Var.f23436a, kjm.f18392a, null, null, null, fetVar2, (i3 & 14) | 384, 56);
        } else {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(mm40Var2, nfh0Var, i2, (byte) 20);
        }
    }

    public static final void F(int i2, fet fetVar, String str, boolean z) {
        fetVar.g0(1435653726);
        int i3 = (fetVar.g(str) ? 4 : 2) | i2 | (fetVar.h(z) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            v8q0.a(str, o2e.e0(s5x0.M(mm40VarD, qmk.a(fetVar).c, z ? 0.0f : 32.0f, qmk.a(fetVar).c, z ? 20.0f : 32.0f), "RELATED_MESSAGE_TEXT"), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar, i3 & 14, 0, 130040);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s5h(str, z, i2, (byte) 1);
        }
    }

    public static final void G(String str, Function0 function0, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1973142209);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar.g(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function0) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new y(function0, (byte) 25);
                fetVar.o0(objP);
            }
            mm40 mm40VarT = i4w0.T(mm40VarD, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            v8q0.a(str, o2e.e0(s5x0.M(mm40VarT, qmk.a(fetVar).c, 16.0f, qmk.a(fetVar).c, 4.0f), "RELATED_TITLE_TEXT"), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, i3 & 14, 24960, 109560);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sxe(str, function0, i2, (byte) 1);
        }
    }

    public static final void H(int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1116972611);
        int i3 = i2 | 6;
        byte b2 = 0;
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
                objP = new gcl0((byte) 12);
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
            yfe0VarU.d = new cpl0(mm40Var2, i2, b2);
        }
    }

    public static final void I(int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(1218465369);
        int i3 = i2 | 6;
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new mb50((byte) 8);
                fetVar.o0(objP);
            }
            mm40Var2 = jm40.b;
            b8k0.e(mm40Var2, null, null, qw3Var, null, null, false, null, (Function1) objP, fetVar, 805306374, 494);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var2, i2, b2);
        }
    }

    public static final void J(mm40 mm40Var, gn1 gn1Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1745413147);
        int i3 = i2 | 6 | (fetVar2.g(gn1Var) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(mm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7);
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
            nkb.h(s5x0.N(mm40Var2, xfn.a(fetVar2).e, 0.0f, xfn.a(fetVar2).e, 0.0f, 10), gn1Var.d, kjm.f18392a, null, null, null, fetVar2, 384, 56);
            ckb.f(o7k0.d(mm40Var2, 1.0f), gn1Var.f11567a, null, s5x0.u(xfn.a(fetVar).c, 0.0f, xfn.a(fetVar).c, 0.0f, 10), null, null, null, null, fetVar, 6, 244);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mz7(mm40Var2, gn1Var, i2, (byte) 28);
        }
    }

    public static final void K(fuy fuyVar, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1855824335);
        int i3 = i2 | (fetVar2.g(fuyVar) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(fuyVar.f10188a, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(g1t0.n(), fetVar2), fetVar, 0, 0, 131070);
            v8q0.a(fuyVar.b, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(g1t0.l(), fetVar), fetVar, 0, 0, 131070);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m87(fuyVar, i2, (byte) 4);
        }
    }

    public static final void L(int i2, fet fetVar) {
        fetVar.g0(1840544163);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(jm40.b, 16.0f, 0.0f, 2);
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
            M(fqj0VarD0, fetVar, 0);
            k(fqj0VarD0, fetVar, 0);
            M(fqj0VarD0, fetVar, 0);
            k(fqj0VarD0, fetVar, 0);
            M(fqj0VarD0, fetVar, 0);
            k(fqj0VarD0, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i87(i2, (byte) 14);
        }
    }

    public static final void M(fqj0 fqj0Var, fet fetVar, int i2) {
        fetVar.g0(-159023725);
        int i3 = (fetVar.g(fqj0Var) ? 4 : 2) | i2;
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.d(o7k0.e(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 4.0f, 7), 18.0f), 1.0f), vgg0.f37379a), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7(b2, i2, fqj0Var);
        }
    }

    public static ciq N(float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return new ciq(f2, f3, f4, f5);
    }

    public static final bgx O(vhv0 vhv0Var, fet fetVar) {
        return new bgx(vhv0Var, (w6k) fetVar.k(bmd.h));
    }

    public static mm40 P(mm40 mm40Var, t89 t89Var, yjj0 yjj0Var, int i2) {
        if ((i2 & 2) != 0) {
            yjj0Var = jd8.n;
        }
        return mm40Var.e(new jc5(0L, t89Var, yjj0Var, 1));
    }

    public static final mm40 Q(mm40 mm40Var, long j2, yjj0 yjj0Var) {
        return mm40Var.e(new jc5(j2, null, yjj0Var, 2));
    }

    public static final mm40 R(mm40 mm40Var, String str, tn7 tn7Var, fet fetVar) {
        mm40Var.getClass();
        str.getClass();
        byte b2 = 23;
        ugd ugdVarM = u1c.M(428282852, new ry2(str, tn7Var, ddz.a(0, 0, fetVar, 0, 3), b2), fetVar);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = androidx.compose.runtime.e.e(fxa0.b);
            fetVar.o0(objP);
        }
        pz40 pz40Var = (pz40) objP;
        Object objP2 = fetVar.P();
        if (objP2 == obj) {
            objP2 = new nie0();
            fetVar.o0(objP2);
        }
        nie0 nie0Var = (nie0) objP2;
        Object objP3 = fetVar.P();
        if (objP3 == obj) {
            zcl zclVar = qmk.f28987a;
            pz40 pz40Var2 = s6t0.f31722a;
            Object sqmVar = new sqm(0.0f, 8.0f, 32.0f, s6t0.b().f33626a.getShadowStrong(), qmk.f);
            fetVar.o0(sqmVar);
            objP3 = sqmVar;
        }
        sqm sqmVar2 = (sqm) objP3;
        androidx.compose.runtime.d dVar = bmd.h;
        w6k w6kVar = (w6k) fetVar.k(dVar);
        fxa0 fxa0Var = (fxa0) pz40Var.getValue();
        Object objP4 = fetVar.P();
        yje yjeVar = null;
        if (objP4 == obj) {
            objP4 = new u6h(pz40Var, yjeVar, (byte) 7);
            fetVar.o0(objP4);
        }
        m0x0.t(fetVar, fxa0Var, (Function2) objP4);
        WeakHashMap weakHashMap = djv0.w;
        q33 q33Var = zcm0.i(fetVar).c;
        boolean z = q33Var.e().d > 0;
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean zH = fetVar.h(z);
        Object objP5 = fetVar.P();
        if (zH || objP5 == obj) {
            objP5 = new u6h(z, pz40Var, yjeVar, (byte) 8);
            fetVar.o0(objP5);
        }
        m0x0.t(fetVar, boolValueOf, (Function2) objP5);
        fetVar.e0(818123873);
        Object objP6 = fetVar.P();
        if (objP6 == obj) {
            objP6 = dw9.j(fetVar);
        }
        gy40 gy40Var = (gy40) objP6;
        Object objP7 = fetVar.P();
        if (objP7 == obj) {
            objP7 = new zhl0(pz40Var, (byte) 16);
            fetVar.o0(objP7);
        }
        mm40 mm40VarW = y860.W(jm40.b, gy40Var, null, false, null, (Function0) objP7, 28);
        boolean zI = fetVar.i(nie0Var);
        Object objP8 = fetVar.P();
        if (zI || objP8 == obj) {
            objP8 = new nop0(nie0Var, b2);
            fetVar.o0(objP8);
        }
        mm40 mm40VarE = mm40Var.e(ro4.d0(mm40VarW, (Function1) objP8));
        if (((fxa0) pz40Var.getValue()) == fxa0.f10302a) {
            fetVar.e0(-1094623565);
            j6z j6zVar = (j6z) nie0Var.f23583a;
            if (j6zVar == null) {
                fetVar.e0(426407854);
                fetVar.r(false);
            } else {
                fetVar.e0(426407855);
                long jG = j6zVar.G(0L);
                r34 r34Var = new r34();
                r34Var.b = w6kVar;
                r34Var.f29768a = jG;
                r34Var.c = j6zVar;
                float fS0 = w6kVar.s0(Float.intBitsToFloat((int) (jG & 4294967295L)));
                zcl zclVar2 = qmk.f28987a;
                ycl yclVar = new ycl(fS0 - 58.0f);
                ycl yclVar2 = new ycl(0.0f);
                if (yclVar.compareTo(yclVar2) < 0) {
                    yclVar = yclVar2;
                }
                Object objP9 = fetVar.P();
                if (objP9 == obj) {
                    objP9 = new zhl0(pz40Var, (byte) 17);
                    fetVar.o0(objP9);
                }
                k13.a(r34Var, (Function0) objP9, null, u1c.M(918250080, new zv((Object) sqmVar2, yclVar.f42389a, (Object) ugdVarM, (byte) 12), fetVar), fetVar, 3120, 4);
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.e0(429172125);
            fetVar.r(false);
        }
        fetVar.r(false);
        return mm40VarE;
    }

    public static final mm40 S(mm40 mm40Var, float f2, long j2, yjj0 yjj0Var) {
        return T(mm40Var, f2, new skk0(j2), yjj0Var);
    }

    public static final mm40 T(mm40 mm40Var, float f2, skk0 skk0Var, yjj0 yjj0Var) {
        return mm40Var.e(new cn8(f2, skk0Var, yjj0Var));
    }

    public static final Bundle U() {
        return new Bundle(0);
    }

    public static final Bundle V(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.f46059a;
            Object obj = pair.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        jf4.o(b1j.k("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, Separators.DOUBLE_QUOTE));
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    jf4.o(b1j.k("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, Separators.DOUBLE_QUOTE));
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final gmq W(gmq gmqVar) {
        return gmqVar instanceof n7m0 ? gmqVar : X(gmqVar, f, g);
    }

    public static final rwk X(gmq gmqVar, Function1 function1, Function2 function2) {
        if (gmqVar instanceof rwk) {
            rwk rwkVar = (rwk) gmqVar;
            if (rwkVar.b == function1 && rwkVar.c == function2) {
                return rwkVar;
            }
        }
        return new rwk(gmqVar, function1, function2);
    }

    public static int Y(Context context, float f2) {
        context.getClass();
        if (f2 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(context.getResources().getDisplayMetrics().density * f2);
    }

    public static final e900 Z(boolean z, fet fetVar) {
        zfn zfnVar = zaq0.b;
        List listJ = q3d.j(new y3d(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent0()), new y3d(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent()));
        if (z) {
            listJ = CollectionsKt.t0(listJ);
        }
        return yk5.n(listJ, 0.0f, 0.0f, 14);
    }

    public static final void a(int i2, fet fetVar, mm40 mm40Var, Function0 function0, Function0 function1, boolean z, boolean z2) {
        mm40 mm40Var2;
        function0.getClass();
        function1.getClass();
        fetVar.g0(1294762061);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.h(z2) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var2, 56.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            int i4 = i3 >> 3;
            j120.a((i4 & 896) | (i3 & 112), fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), function0, z);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            j120.b(((i3 >> 6) & 896) | (i4 & 112), fetVar, s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8.0f, 0.0f, 0.0f, 0.0f, 14), function1, z2);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cd(mm40Var2, function0, function1, z, z2, i2);
        }
    }

    public static float a0(Context context) {
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        int i2 = displayMetrics.heightPixels;
        Object systemService2 = context.getSystemService("window");
        systemService2.getClass();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        ((WindowManager) systemService2).getDefaultDisplay().getRealMetrics(displayMetrics2);
        int i3 = displayMetrics2.widthPixels;
        return (context.getResources().getBoolean(R.bool.isTablet) && (i3 > i2)) ? new BigDecimal(String.valueOf(i3 / i2)).setScale(1, RoundingMode.HALF_UP).floatValue() : new BigDecimal(String.valueOf(i2 / i3)).setScale(1, RoundingMode.HALF_UP).floatValue();
    }

    public static final void b(mm40 mm40Var, sql sqlVar, sql sqlVar2, fet fetVar, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        sql sqlVar3 = sqlVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1024792590);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2 | (fetVar2.g(mm40Var2) ? 4 : 2);
        }
        int i6 = i4 | (fetVar2.g(sqlVar) ? 32 : 16) | (fetVar2.g(sqlVar3) ? 256 : 128);
        if (fetVar2.U(i6 & 1, (i6 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            if (i5 != 0) {
                mm40Var2 = jm40Var;
            }
            mm40 mm40VarK0 = q8a.k0(mm40Var2, enx.f8115a);
            zcl zclVar = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarK = s5x0.K(Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarK0), afn0.m(fetVar2).getBackground(), jd8.n), 12.0f, 10.0f);
            byte b2 = 14;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b2)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            xx7 xx7Var = gqw0.n;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4(b2)), xx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVar);
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
            String str = sqlVar.c;
            afn0.v(fetVar2).getClass();
            y9q0 y9q0VarQ = g1t0.q();
            long textPrimary = afn0.m(fetVar2).getTextPrimary();
            long j2 = qmk.s;
            long j3 = qmk.u;
            long j4 = qmk.n;
            mm40 mm40Var3 = mm40Var2;
            v8q0.a(str, null, textPrimary, new n05(j2, j3, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarQ, fetVar2, 0, 24960, 110578);
            String str2 = sqlVar.b;
            y9q0 y9q0VarG = h97.g(fetVar);
            long secondary = afn0.m(fetVar).getSecondary();
            long j5 = qmk.q;
            long j6 = qmk.r;
            v8q0.a(str2, null, secondary, new n05(j5, j6, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarG, fetVar, 0, 24960, 110578);
            fetVar.r(true);
            jcb.H(o7k0.c(jm40Var, 1.0f), 1.0f, afn0.m(fetVar).getSeparator(), fetVar, 6, 0);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            x5d x5dVarA2 = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, x7zVar2);
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
            sqlVar3 = sqlVar2;
            String str3 = sqlVar3.c;
            afn0.v(fetVar).getClass();
            v8q0.a(str3, null, afn0.m(fetVar).getTextPrimary(), new n05(j2, j3, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.q(), fetVar, 0, 24960, 110578);
            v8q0.a(sqlVar3.b, null, afn0.m(fetVar).getSecondary(), new n05(j5, j6, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, h97.g(fetVar), fetVar, 0, 24960, 110578);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = mm40Var3;
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0(mm40Var2, (Object) sqlVar, (Object) sqlVar3, i2, i3, (byte) 14);
        }
    }

    public static ArrayList b0(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static final void c(mm40 mm40Var, List list, boolean z, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(-1984889545);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(list) : fetVar.i(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            boolean zG = fetVar.g(xczVarA) | fetVar.g(pz40VarF);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new bz0(xczVarA, pz40VarF, null, b2);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, xczVarA, (Function2) objP);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 28.0f, 7), fetVar);
            boolean z2 = ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(list))) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = new r91(list, z, function1, b2);
                fetVar.o0(objP2);
            }
            b8k0.e(n0qVar, xczVarA, ch80VarG, null, null, null, false, null, (Function1) objP2, fetVar, 0, Response.SERVER_TIMEOUT);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1((Object) mm40Var2, (Object) list, z, (wdr) function1, i2, (byte) 0);
        }
    }

    public static final mm40 c0(mm40 mm40Var, dbz dbzVar) {
        return mm40Var.e(new gwk(dbzVar));
    }

    public static final void d(mm40 mm40Var, fo1 fo1Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        a4x a4xVar;
        fet fetVar2 = fetVar;
        fo1Var.getClass();
        function1.getClass();
        fetVar2.g0(744718116);
        int i3 = i2 | 6 | (fetVar2.g(fo1Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            long background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(Q(jm40Var, background, ljcVar).e(o7k0.c), "BOX_AGGREGATOR_SEARCH_SCREEN");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarW = o050.W(o7k0.d(jm40Var, 1.0f));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            imm immVarA = fo1Var.a();
            int i4 = i3 & 896;
            boolean z2 = i4 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new si1(function1, (byte) 8);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i4 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new h61(function1, (byte) 16);
                fetVar2.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z4 = i4 == 256;
            Object objP3 = fetVar2.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new si1(function1, (byte) 9);
                fetVar2.o0(objP3);
            }
            hlm.c(mm40VarD, immVarA, null, function0, null, null, function2, null, (Function0) objP3, null, null, null, fetVar, 6, 0, 3764);
            fetVar2 = fetVar;
            if (fo1Var instanceof do1) {
                fetVar2.e0(-1835789893);
                v(null, ((do1) fo1Var).f6396a, function1, fetVar2, i4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1074762444);
                boolean z5 = fo1Var instanceof eo1;
                if (z5) {
                    a4xVar = ((eo1) fo1Var).f8119a;
                } else {
                    if (!(fo1Var instanceof co1)) {
                        t9f.b();
                        return;
                    }
                    a4xVar = ((co1) fo1Var).f4679a;
                }
                c(null, a4xVar, z5, function1, fetVar2, (i3 << 3) & 7168);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var2, fo1Var, function1, i2, (byte) 22);
        }
    }

    public static final long d0(float f2, long j2) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j2 >> 32)) - f2);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    public static final void e(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        a4xVar.getClass();
        fetVar.g0(1183195764);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(a4xVar) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 2075778877, a4xVar);
            while (itO.hasNext()) {
                eu1 eu1Var = (eu1) itO.next();
                j6n.h(eu1Var.f8396a, eu1Var.b, null, 0, 0, fetVar, 0, 28);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i2, b2);
        }
    }

    public static final ti0 e0(jj0 jj0Var) {
        Object next;
        jj0Var.getClass();
        String str = jj0Var.d;
        String str2 = jj0Var.c;
        if (str != null && str.length() != 0) {
            c0o c0oVar = ui0.c;
            y2 y2VarH = ohs0.h(c0oVar, c0oVar);
            do {
                if (!y2VarH.hasNext()) {
                    next = null;
                    break;
                }
                next = y2VarH.next();
            } while (!((ui0) next).f35706a.equals(str));
            ui0 ui0Var = (ui0) next;
            if (ui0Var != null) {
                return new ri0(ui0Var);
            }
        } else if (str2 != null && str2.length() != 0) {
            return new si0(str2);
        }
        return qi0.f28767a;
    }

    public static final void f(mm40 mm40Var, l7m0 l7m0Var, wul wulVar, Function1 function1, xdr xdrVar, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i2) {
        int i3;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        wulVar.getClass();
        function2.getClass();
        fetVar2.g0(-1778331411);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(wulVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(xdrVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.i(ugdVar) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar2.i(ugdVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar2.i(ugdVar3) ? 8388608 : 4194304;
        }
        if (fetVar2.U(i3 & 1, (4793491 & i3) != 4793490)) {
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            boolean z2 = (i3 & 112) == 32;
            Object objP = fetVar2.P();
            boolean z3 = z2;
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new we4(l7m0Var, (byte) 4);
                fetVar2.o0(objP);
            }
            mm40 mm40VarA0 = qxw.a0(mm40VarD, (Function0) objP);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int i4 = i3;
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarA0);
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
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(1.0f, jm40Var, true);
            Boolean bool = (Boolean) l7m0Var.getValue();
            bool.getClass();
            boolean z4 = false;
            jwb.e(bool, mm40VarA, null, null, u1c.M(-845414394, new ef4(ugdVar, ugdVar2, (byte) 0), fetVar2), fetVar, 24576, 12);
            fetVar2 = fetVar;
            if (xdrVar == null) {
                fetVar2.e0(2004840554);
            } else {
                fetVar2.e0(-905159049);
                xdrVar.F(zhg0Var, fetVar2, Integer.valueOf(((i4 >> 9) & 112) | 6));
            }
            fetVar2.r(false);
            fetVar2.r(true);
            ugdVar3.F(y5d.f42040a, fetVar2, Integer.valueOf(((i4 >> 18) & 112) | 6));
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD2 = o7k0.d(s5x0.L(jm40Var, 0.0f, 8.0f, 1), 1.0f);
            if ((i4 & 7168) == 2048) {
                z4 = true;
            }
            Object objP2 = fetVar2.P();
            if (z4 || objP2 == cl5Var) {
                function2 = function1;
                objP2 = new zk2(function2, (byte) 29);
                fetVar2.o0(objP2);
            } else {
                function2 = function1;
            }
            qzb.n(mm40VarD2, wulVar, (Function0) objP2, fetVar2, (i4 >> 3) & 112, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ff4(mm40Var, (Object) l7m0Var, (Object) wulVar, (Object) function2, (Object) xdrVar, (Object) ugdVar, (Object) ugdVar2, (Object) ugdVar3, i2, (byte) 0);
        }
    }

    public static final pu6 f0(qu6 qu6Var, vby vbyVar) {
        String strD;
        qu6Var.getClass();
        vbyVar.getClass();
        long j2 = qu6Var.f29333a;
        long j3 = qu6Var.b;
        long j4 = qu6Var.c;
        long j5 = qu6Var.d;
        long j6 = qu6Var.e;
        String str = qu6Var.f;
        String str2 = qu6Var.g;
        String str3 = qu6Var.h;
        String str4 = qu6Var.i;
        String str5 = qu6Var.k;
        String str6 = qu6Var.l;
        String str7 = qu6Var.p;
        String str8 = qu6Var.q;
        long j7 = qu6Var.r;
        String str9 = qu6Var.s;
        double d2 = qu6Var.t;
        String str10 = qu6Var.v;
        sqt sqtVar = toy.b;
        byte b2 = qu6Var.w.f36034a;
        sqtVar.getClass();
        toy toyVarH = sqt.h(b2);
        long j8 = qu6Var.x;
        tv6 tv6Var = qu6Var.u;
        long j9 = tv6Var.f34584a;
        String str11 = tv6Var.b;
        String str12 = tv6Var.c;
        zfa0 zfa0Var = qu6Var.y;
        if (zfa0Var != null) {
            if (zfa0Var instanceof xfa0) {
                strD = vbyVar.d(xfa0.Companion.serializer(), zfa0Var);
            } else if (zfa0Var instanceof yfa0) {
                strD = "";
            }
            byte b3 = qu6Var.z.f12022a;
            String str13 = qu6Var.j;
            String str14 = strD;
            String str15 = qu6Var.m;
            String str16 = qu6Var.n;
            String str17 = qu6Var.o;
            int i2 = qu6Var.A;
            String str18 = tv6Var.d;
            String str19 = tv6Var.e;
            long j10 = qu6Var.B;
            double d3 = qu6Var.C;
            String str20 = qu6Var.D;
            int i3 = qu6Var.E;
            ic9 ic9Var = qu6Var.F;
            return new pu6(j2, j3, j4, j5, j6, str, str2, str3, str4, str5, str6, str7, str8, j7, str9, d2, j9, str11, str12, str10, toyVarH, j8, str14, b3, str13, str15, str16, str17, i2, str18, str19, j10, d3, str20, i3, ic9Var.f14524a, ic9Var.b, ic9Var.c, ic9Var.d.f36481a);
        }
        t9f.b();
        return null;
    }

    public static final void g(int i2, fet fetVar, mm40 mm40Var, Function0 function0) {
        mm40Var.getClass();
        function0.getClass();
        fetVar.g0(-223560543);
        byte b2 = 4;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_arrow_left, 6, fetVar), fetVar), null, y860.W(mm40Var, null, null, true, null, function0, 24), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar, 56, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(mm40Var, function0, i2, b2);
        }
    }

    public static final void h(mm40 mm40Var, vo5 vo5Var, Function1 function1, xdr xdrVar, fet fetVar, int i2) {
        mm40 mm40Var2;
        ue9 ue9Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(1456815753);
        int i3 = i2 | 6 | (fetVar2.i(vo5Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(xdrVar) ? 2048 : 1024);
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
            String str = vo5Var.b;
            ArrayList arrayList = vo5Var.c;
            y3d y3dVar = new y3d(((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary());
            if (arrayList.size() > 3) {
                fetVar2.e0(-915533837);
                ue9Var = new ue9(xsm0.s(R.string.all, fetVar2));
                fetVar2.r(false);
            } else {
                fetVar2.e0(-915438109);
                fetVar2.r(false);
                ue9Var = null;
            }
            hjm hjmVar = new hjm(str, null, y3dVar, null, null, null, false, null, null, false, ue9Var, null, 7162);
            kjm kjmVar = kjm.f18392a;
            int i4 = i3 & 112;
            boolean z = ((i3 & 896) == 256) | (i4 == 32 || fetVar2.i(vo5Var));
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new a540((byte) 9, (Object) vo5Var, function1);
                fetVar2.o0(objP);
            }
            nkb.h(mm40VarL, hjmVar, kjmVar, null, (Function0) objP, null, fetVar2, 384, 40);
            hzc0 hzc0Var = new hzc0(ma80.b);
            Integer numValueOf = Integer.valueOf(pkd.c(fetVar2) ? R.drawable.news_catalog_placeholder_square_dark : R.drawable.news_catalog_placeholder_square);
            boolean z2 = ((i3 & 7168) == 2048) | (i4 == 32 || fetVar2.i(vo5Var));
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ba30(xdrVar, vo5Var, (byte) 22);
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
            yfe0VarU.d = new pd50((byte) 4, i2, (Object) mm40Var2, (Object) vo5Var, (Object) function1, (Object) xdrVar);
        }
    }

    public static final void i(int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(-140165758);
        int i3 = i2 | 6;
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
                objP = new rj50((byte) 3);
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
            yfe0VarU.d = new wqr(mm40Var2, i2, (byte) 29);
        }
    }

    public static final void j(mm40 mm40Var, op50 op50Var, Function1 function1, xdr xdrVar, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1038815817);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(op50Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(xdrVar) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            ch80 ch80VarG = knm0.g(s5x0.t(0.0f, 0.0f, 3), fetVar);
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new jl40((Object) op50Var, (Object) xdrVar, (Object) function1, (byte) 6);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            b8k0.e(jm40Var, null, ch80VarG, qw3Var, null, null, false, null, (Function1) objP, fetVar, i3 & 14, 490);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 18, i2, (Object) mm40Var2, (Object) op50Var, (Object) function1, (Object) xdrVar);
        }
    }

    public static final void k(fqj0 fqj0Var, fet fetVar, int i2) {
        fetVar.g0(898435461);
        int i3 = (fetVar.g(fqj0Var) ? 4 : 2) | i2;
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.d(o7k0.e(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 10.0f, 7), 18.0f), 1.0f), vgg0.f37379a), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7(b2, i2, fqj0Var);
        }
    }

    public static final void l(mm40 mm40Var, final nda ndaVar, Function2 function2, fet fetVar, int i2) {
        function2.getClass();
        fetVar.g0(886657680);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(ndaVar) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            uc9.h(mm40Var, u1c.M(-1199640382, new ydr() { // from class: a.nca
                @Override // a.ydr
                public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                    byte b4 = b2;
                    nda ndaVar2 = ndaVar;
                    mm40 mm40Var2 = (mm40) obj2;
                    fet fetVar2 = (fet) obj3;
                    int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var2);
                    switch (b4) {
                        case 0:
                            if ((iD & 48) == 0) {
                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                            }
                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                knx.m(mm40Var2, ndaVar2.f23329a, fetVar2, (iD >> 3) & 14);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            if ((iD & 48) == 0) {
                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                            }
                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                knx.l(mm40Var2, ndaVar2.b, fetVar2, (iD >> 3) & 14);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(943843779, new ec30(ndaVar, function2, (byte) 10), fetVar), u1c.M(-1207639356, new ydr() { // from class: a.nca
                @Override // a.ydr
                public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
                    byte b4 = b3;
                    nda ndaVar2 = ndaVar;
                    mm40 mm40Var2 = (mm40) obj2;
                    fet fetVar2 = (fet) obj3;
                    int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var2);
                    switch (b4) {
                        case 0:
                            if ((iD & 48) == 0) {
                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                            }
                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                knx.m(mm40Var2, ndaVar2.f23329a, fetVar2, (iD >> 3) & 14);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            if ((iD & 48) == 0) {
                                iD |= fetVar2.g(mm40Var2) ? 32 : 16;
                            }
                            if (fetVar2.U(iD & 1, (iD & 145) != 144)) {
                                knx.l(mm40Var2, ndaVar2.b, fetVar2, (iD >> 3) & 14);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (i3 & 14) | 28032, 2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var, ndaVar, function2, i2, (byte) 18);
        }
    }

    public static final void m(mm40 mm40Var, p9r0 p9r0Var, Function0 function0, Function0 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        p9r0Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar2.g0(387593222);
        int i3 = i2 | 6 | (fetVar2.g(p9r0Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 40.0f);
            Object objP = fetVar2.P();
            if (objP == ukd.f35823a) {
                objP = new d69((byte) 24);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = s5x0.K(rq8.K(mm40VarE, (Function1) objP), 12.0f, 8.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC0, gqw0.v, 1.0f, true);
            String str = p9r0Var.f26622a;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, x7zVarI, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24576, 114680);
            fetVar2 = fetVar;
            oja0.S(R.drawable.ic_glyph_chevron_up_small, (i3 << 3) & 7168, fetVar2, null, function0, p9r0Var.b);
            oja0.S(R.drawable.ic_glyph_chevron_down_small, i3 & 7168, fetVar2, null, function1, p9r0Var.c);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((byte) 5, i2, (Object) mm40Var2, (Object) p9r0Var, (Object) function0, (Object) function1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(mm40 mm40Var, final gn1 gn1Var, final Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        final byte b2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2121636070);
        int i3 = i2 | 6 | (fetVar2.g(gn1Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
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
            mm40 mm40VarN2 = s5x0.N(jm40Var, xfn.a(fetVar2).e, 0.0f, xfn.a(fetVar2).e, 0.0f, 10);
            mm40Var2 = jm40Var;
            jjm jjmVar = gn1Var.d;
            kjm kjmVar = kjm.f18392a;
            int i4 = i3 & 896;
            int i5 = i3 & 112;
            boolean z2 = (i4 == 256) | (i5 == 32);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new mc((Object) function1, (Object) gn1Var, (byte) 15);
                fetVar2.o0(objP);
            }
            nkb.h(mm40VarN2, jjmVar, kjmVar, null, (Function0) objP, null, fetVar, 384, 40);
            fetVar2 = fetVar;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zll zllVar = gn1Var.f11567a;
            lh80 lh80VarU = s5x0.u(xfn.a(fetVar2).c, 0.0f, xfn.a(fetVar2).c, 0.0f, 10);
            boolean z3 = (i4 == 256) | (i5 == 32);
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                b2 = 0;
                objP2 = new Function1() { // from class: a.qn1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = b2;
                        gn1 gn1Var2 = gn1Var;
                        Function1 function2 = function1;
                        st0 st0Var = (st0) obj;
                        switch (b3) {
                            case 0:
                                st0Var.getClass();
                                long j2 = st0Var.f32750a;
                                long j3 = gn1Var2.e.f16074a;
                                mtr mtrVar = st0Var.d;
                                function2.invoke(new an1(j2, mtrVar != null ? mtrVar.b : false, j3));
                                break;
                            default:
                                st0Var.getClass();
                                function2.invoke(new bn1(st0Var.f32750a, gn1Var2.e.f16074a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP2);
            } else {
                b2 = 0;
            }
            Function1 function2 = (Function1) objP2;
            boolean z4 = (i4 == 256 ? (byte) 1 : b2) | (i5 == 32 ? (byte) 1 : b2);
            Object objP3 = fetVar2.P();
            if (z4 != 0 || objP3 == cl5Var) {
                z = true;
                final char c2 = 1 == true ? 1 : 0;
                objP3 = new Function1() { // from class: a.qn1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = c2;
                        gn1 gn1Var2 = gn1Var;
                        Function1 function3 = function1;
                        st0 st0Var = (st0) obj;
                        switch (b3) {
                            case 0:
                                st0Var.getClass();
                                long j2 = st0Var.f32750a;
                                long j3 = gn1Var2.e.f16074a;
                                mtr mtrVar = st0Var.d;
                                function3.invoke(new an1(j2, mtrVar != null ? mtrVar.b : false, j3));
                                break;
                            default:
                                st0Var.getClass();
                                function3.invoke(new bn1(st0Var.f32750a, gn1Var2.e.f16074a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP3);
            } else {
                z = true;
            }
            ckb.f(mm40VarD, zllVar, null, lh80VarU, null, null, function2, (Function1) objP3, fetVar2, 6, 52);
            fetVar2.r(z);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var2, gn1Var, function1, i2, (byte) 21);
        }
    }

    public static final void o(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(2130509441);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            xhc xhcVar = (xhc) l7m0Var.getValue();
            wpq wpqVar = (wpq) fetVar.k(bmd.i);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            m8x.y(n0qVar, u1c.M(-1475770307, new ag0(function1, (byte) 23), fetVar), u1c.M(-425901092, new ywa((Object) xhcVar, (Object) wpqVar, (Object) function1, (byte) 8), fetVar), null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0L, N(0.0f, 0.0f, 0.0f, 0.0f, 14), u1c.M(1131826002, new phc(xhcVar, function1, wpqVar), fetVar), fetVar, 805306806, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i2, (byte) 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(mm40 mm40Var, vbh vbhVar, String str, boolean z, Function0 function0, Function1 function1, Function0 function2, fet fetVar, int i2) {
        int i3;
        int i4;
        boolean z2;
        function1.getClass();
        function2.getClass();
        fetVar.g0(1077742783);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(vbhVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function2) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
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
            if (str != null) {
                fetVar.e0(-1228166289);
                boolean z3 = (i3 & 57344) == 16384;
                Object objP = fetVar.P();
                if (z3 || objP == ukd.f35823a) {
                    objP = new pk9(function0, (byte) 17);
                    fetVar.o0(objP);
                }
                G(str, (Function0) objP, fetVar, (i3 >> 6) & 14);
                i4 = 0;
                fetVar.r(false);
            } else {
                i4 = 0;
                fetVar.e0(-1227952947);
                fetVar.r(false);
            }
            F(i4, fetVar, vbhVar.f37140a, str != null ? 1 : i4);
            int iOrdinal = vbhVar.b.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                fetVar.e0(-1227663810);
                int i5 = ((i3 >> 3) & 57344) | (i3 & 7168) | 6;
                z2 = true;
                r(n0qVar, vbhVar.c, vbhVar.d, z, function1, fetVar, i5);
                fetVar.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(-1702175947, fetVar, false);
                }
                fetVar.e0(-1227279162);
                q(((i3 >> 15) & 112) | 6, fetVar, n0qVar, function2);
                fetVar.r(false);
                z2 = true;
            }
            fetVar.r(z2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(mm40Var, vbhVar, str, z, function0, function1, function2, i2);
        }
    }

    public static final void q(int i2, fet fetVar, mm40 mm40Var, Function0 function0) {
        int i3;
        fetVar.g0(-824707195);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function0) ? 32 : 16;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
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
            jcb.l(null, new mdm(0, pdm.c, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 0L, 0L, 860), false, function0, fetVar, (i3 << 6) & 7168, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wb5(mm40Var, function0, i2, b2);
        }
    }

    public static final void r(mm40 mm40Var, a4x a4xVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1235023768);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = pkd.d(fetVar) ? 2 : 1;
            mm40 mm40VarE0 = o2e.e0(mm40Var, "RELATED_LAZY_VERTICAL_GRID_TEST_TAG");
            ngv ngvVar = new ngv(i4);
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(8.0f, 4.0f, 8.0f, 24.0f);
            byte b2 = 14;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b2));
            qw3 qw3Var2 = new qw3(4.0f, true, new jf4(b2));
            boolean z3 = ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((57344 & i3) == 16384);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new uy0(a4xVar, z, function1, (byte) 1);
                fetVar.o0(objP);
            }
            g8x.i(ngvVar, mm40VarE0, null, lh80Var, qw3Var2, qw3Var, null, z2, null, (Function1) objP, fetVar, (i3 << 15) & 234881024, 660);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rbh(mm40Var, a4xVar, z, z2, function1, i2, (byte) 0);
        }
    }

    public static final void s(mm40 mm40Var, wql wqlVar, fet fetVar, int i2) {
        int i3;
        byte b2;
        wql wqlVar2 = wqlVar;
        fet fetVar2 = fetVar;
        sql sqlVar = wqlVar2.f39596a;
        fetVar2.g0(2118937778);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(wqlVar2) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, gqw0.m, fetVar2, 0);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            nkb.h(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), new hjm(wqlVar2.d, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar, 384, 56);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(Q(dw9.i(zclVar2, zclVar2, zclVar2, zclVar2, jm40Var), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), 12.0f, 0.0f, 12.0f, 12.0f, 2);
            x5d x5dVarA2 = w5d.a(mw3Var, gqw0.n, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 320.0f), 80.0f);
            o0x o0xVar = sqlVar.f32635a;
            k7x.a(o0xVar != null ? o0xVar.a() : null, null, mm40VarE, null, null, fetVar, 48, 2040);
            wqlVar2 = wqlVar;
            fetVar2 = fetVar;
            b(null, sqlVar, wqlVar2.c, fetVar2, 0, 1);
            b2 = 1;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            b2 = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lql(mm40Var, wqlVar2, i2, b2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void t(mm40 mm40Var, xql xqlVar, fet fetVar, int i2) {
        int i3;
        byte b2;
        tql tqlVar;
        shd shdVar;
        shd shdVar2;
        pcy pcyVar;
        jm40 jm40Var;
        boolean z;
        fet fetVar2;
        boolean z2;
        boolean z3;
        fet fetVar3;
        fet fetVar4 = fetVar;
        sql sqlVar = xqlVar.f41326a;
        fetVar4.g0(-1511747208);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar4.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar4.g(xqlVar) ? 32 : 16;
        }
        if (fetVar4.U(i3 & 1, (i3 & 19) != 18)) {
            mw3 mw3Var = uc9.c;
            x5d x5dVarA = w5d.a(mw3Var, gqw0.m, fetVar4, 0);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40Var);
            mkd.c0.getClass();
            fetVar4.i0();
            boolean z4 = fetVar4.S;
            pcy pcyVar2 = e7z.u1;
            if (z4) {
                fetVar4.l(pcyVar2);
            } else {
                fetVar4.r0();
            }
            shd shdVar3 = gqw0.x;
            jpm0.o(fetVar4, x5dVarA, shdVar3);
            shd shdVar4 = gqw0.w;
            jpm0.o(fetVar4, bh90VarM, shdVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar5 = gqw0.y;
            jpm0.o(fetVar4, numValueOf, shdVar5);
            jpm0.n(fetVar4);
            shd shdVar6 = gqw0.v;
            jpm0.o(fetVar4, mm40VarC0, shdVar6);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            kjm kjmVar = kjm.f18392a;
            String str = xqlVar.e;
            tql tqlVar2 = xqlVar.d;
            shd shdVar7 = shdVar6;
            shd shdVar8 = shdVar5;
            nkb.h(mm40VarN, new hjm(str, null, null, null, null, null, false, null, null, false, null, null, 8190), kjmVar, null, null, null, fetVar, 384, 56);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN2 = s5x0.N(Q(dw9.i(zclVar2, zclVar2, zclVar2, zclVar2, jm40Var2), afn0.m(fetVar).getBackgroundContent(), jd8.n), 12.0f, 0.0f, 12.0f, 16.0f, 2);
            x5d x5dVarA2 = w5d.a(mw3Var, gqw0.n, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar3);
            jpm0.o(fetVar, bh90VarM2, shdVar4);
            vqd.u(iHashCode2, fetVar, shdVar8, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar7);
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var2, 320.0f), 80.0f);
            o0x o0xVar = sqlVar.f32635a;
            k7x.a(o0xVar != null ? o0xVar.a() : null, null, mm40VarE, null, null, fetVar, 48, 2040);
            fet fetVar5 = fetVar;
            b(s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 12.0f, 7), sqlVar, xqlVar.c, fetVar5, 0, 0);
            byte b3 = 14;
            if (tqlVar2.f == uql.f36124a) {
                fetVar5.e0(-1570415563);
                mm40 mm40VarN3 = s5x0.N(jm40Var2, 0.0f, 0.0f, 0.0f, 10.0f, 7);
                thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4(b3)), gqw0.k, fetVar5, 48);
                int iHashCode3 = Long.hashCode(fetVar5.T);
                bh90 bh90VarM3 = fetVar5.m();
                mm40 mm40VarC2 = kbc.c0(fetVar5, mm40VarN3);
                fetVar5.i0();
                if (fetVar5.S) {
                    fetVar5.l(pcyVar2);
                } else {
                    fetVar5.r0();
                }
                jpm0.o(fetVar5, thg0VarA, shdVar3);
                jpm0.o(fetVar5, bh90VarM3, shdVar4);
                vqd.u(iHashCode3, fetVar5, shdVar8, fetVar5);
                jpm0.o(fetVar5, mm40VarC2, shdVar7);
                String str2 = tqlVar2.f34386a;
                if (str2 == null) {
                    fetVar5.e0(783072979);
                    z3 = false;
                    fetVar5.r(false);
                    tqlVar = tqlVar2;
                    z2 = true;
                    shdVar = shdVar3;
                    shdVar2 = shdVar4;
                    pcyVar = pcyVar2;
                    jm40Var = jm40Var2;
                    fetVar3 = fetVar5;
                } else {
                    x7z x7zVarF = rz4.f(fetVar5, 783072980, 1.0f, false);
                    y9q0 y9q0VarG = h97.g(fetVar5);
                    long secondary = afn0.m(fetVar5).getSecondary();
                    long j2 = qmk.q;
                    long j3 = qmk.r;
                    long j4 = qmk.n;
                    shdVar = shdVar3;
                    shdVar2 = shdVar4;
                    jm40Var = jm40Var2;
                    pcyVar = pcyVar2;
                    z2 = true;
                    v8q0.a(str2, x7zVarF, secondary, new n05(j2, j3, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarG, fetVar, 0, 24960, 110576);
                    tqlVar = tqlVar2;
                    v8q0.a(tqlVar2.e, o7k0.u(jm40Var, 0.0f, 68.0f, 1), afn0.m(fetVar).getSecondary(), new n05(j2, j3, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, h97.g(fetVar), fetVar, 0, 24960, 110576);
                    fet fetVar6 = fetVar;
                    z3 = false;
                    fetVar6.r(false);
                    fetVar3 = fetVar6;
                }
                fetVar3.r(z2);
                fetVar3.r(z3);
                z = z2;
                fetVar2 = fetVar3;
            } else {
                shdVar8 = shdVar8;
                shdVar7 = shdVar7;
                tqlVar = tqlVar2;
                shdVar = shdVar3;
                shdVar2 = shdVar4;
                pcyVar = pcyVar2;
                jm40Var = jm40Var2;
                z = true;
                fetVar5.e0(-1568709354);
                fetVar5.r(false);
                fetVar2 = fetVar5;
            }
            n0q n0qVar = o7k0.c;
            tnm tnmVar = tnm.f34243a;
            StaticColors staticColors = StaticColors.INSTANCE;
            tql tqlVar3 = tqlVar;
            snm.b(n0qVar, new unm(tnmVar, staticColors.m132getYellow0d7_KjU(), staticColors.m132getYellow0d7_KjU(), afn0.m(fetVar2).getBackground(), 6.0f, 6.0f, tqlVar3.b, 0, true, 640), fetVar2, 6);
            mm40 mm40VarN4 = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA2 = shg0.a(new qw3(8.0f, z, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarN4);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar8, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar7);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z);
            String str3 = tqlVar3.c;
            afn0.v(fetVar2).getClass();
            y9q0 y9q0VarL = g1t0.l();
            long textPrimary = afn0.m(fetVar2).getTextPrimary();
            long j5 = qmk.q;
            long j6 = qmk.r;
            long j7 = qmk.n;
            v8q0.a(str3, x7zVar, textPrimary, new n05(j5, j6, j7), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarL, fetVar, 0, 24960, 110576);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(tqlVar3.d, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z), afn0.m(fetVar).getSecondary(), new n05(j5, j6, j7), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, h97.g(fetVar), fetVar, 0, 24960, 109552);
            fetVar4 = fetVar;
            ohs0.x(fetVar4, z, z, z);
            b2 = z;
        } else {
            b2 = 1;
            fetVar4.X();
        }
        yfe0 yfe0VarU = fetVar4.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kql(mm40Var, xqlVar, i2, b2);
        }
    }

    public static final void u(mm40 mm40Var, mdm mdmVar, fet fetVar, int i2) {
        fetVar.g0(-1046820821);
        byte b2 = 4;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(mdmVar) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarE = ufx.E(fetVar, mm40Var.e(o7k0.c));
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
            jcb.l(null, mdmVar, false, null, fetVar, i3 & 112, 13);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rdb(mm40Var, mdmVar, i2, b2);
        }
    }

    public static final void v(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-169330876);
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
                objP = new si1(function1, (byte) 10);
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
            yfe0VarU.d = new wy0(mm40Var2, mdmVar, function1, i2, (byte) 1);
        }
    }

    public static final void w(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(233436882);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jcb.l(mm40Var, mdmVar, false, function0, fetVar, (i3 & 126) | ((i3 << 3) & 7168), 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gg8(mm40Var, mdmVar, function0, i2, (byte) 4);
        }
    }

    public static final void x(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1787617593);
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
            mm40 mm40VarE = ufx.E(fetVar, mm40Var.e(o7k0.c));
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
                objP = new yhl0(function1, (byte) 6);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hak0(mm40Var, mdmVar, function1, i2, (byte) 5);
        }
    }

    public static final void y(mm40 mm40Var, ofh0 ofh0Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-152619882);
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ofh0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            nkb.h(ohs0.i(fetVar2, mm40VarC0, gqw0.v, 1.0f, true), ofh0Var.b, kjm.f18392a, null, null, null, fetVar, 384, 56);
            fetVar2 = fetVar;
            if (ofh0Var.d) {
                fetVar2.e0(1528374895);
                String strW = rsm0.w(R.string.all, 0, fetVar2);
                boolean zG = fetVar2.g(strW);
                Object objP = fetVar2.P();
                cl5 cl5Var = ukd.f35823a;
                if (zG || objP == cl5Var) {
                    objP = new wul(mul.e, oe9.d, new ue9(strW), true, false, false);
                    fetVar2.o0(objP);
                }
                wul wulVar = (wul) objP;
                boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
                Object objP2 = fetVar2.P();
                if (z || objP2 == cl5Var) {
                    objP2 = new o0k0((Object) function1, (Object) ofh0Var, (byte) 11);
                    fetVar2.o0(objP2);
                }
                qzb.n(null, wulVar, (Function0) objP2, fetVar2, 0, 1);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1528990896);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var, ofh0Var, function1, i2, (byte) 22);
        }
    }

    public static final void z(mm40 mm40Var, a4x a4xVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        boolean z3;
        mm40 mm40Var2;
        fetVar.g0(-1552540900);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z3 = z;
            i3 |= fetVar.h(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z4 = (57344 & i3) == 16384;
            Object objP = fetVar.P();
            if (z4 || objP == ukd.f35823a) {
                objP = new yhl0(function1, (byte) 5);
                fetVar.o0(objP);
            }
            mom.c(n0qVar, z3, womVarF, null, false, null, (Function0) objP, null, u1c.M(-424520025, new l4m(a4xVar, function1, z2), fetVar), fetVar, ((i3 >> 3) & 112) | 100663296, 184);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rbh(mm40Var2, a4xVar, z, z2, function1, i2, (byte) 1);
        }
    }
}
