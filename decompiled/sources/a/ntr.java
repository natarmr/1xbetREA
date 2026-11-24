package a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ntr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f24113a = new ugd(-426605417, false, new vgd(3));
    public static final ugd b = new ugd(6842114, false, new zgd(5));
    public static final ugd c = new ugd(-1982275142, false, new zgd(6));
    public static final ugd d = new ugd(1184004469, false, new zgd(7));
    public static final ugd e = new ugd(-561676705, false, new qbd((byte) 18));
    public static final ugd f = new ugd(-1050860591, false, new qbd((byte) 19));
    public static final ugd g = new ugd(1475743890, false, new bhd(23));
    public static final ugd h = new ugd(1610685287, false, new chd(29));
    public static final ugd i = new ugd(1472906027, false, new ohd(11));
    public static final byte[] j = {0, 0, 0, 1};
    public static final float[] k = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object l = new Object();
    public static int[] m = new int[10];
    public static final d13 n = new d13(1022);
    public static final byte[] o = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] p = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static final void A(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        int i3;
        a4x a4xVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-783349187);
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
        byte b2 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarA0 = wha0.a0(s5x0.M(mm40Var, xfn.a(fetVar2).e, 8.0f, xfn.a(fetVar2).e, 56.0f), wha0.T(fetVar2), false, 14);
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
            hjm hjmVar = (hjm) objP;
            kjm kjmVar = kjm.f18392a;
            jm40 jm40Var = jm40.b;
            nkb.h(jm40Var, hjmVar, kjmVar, null, null, null, fetVar2, 390, 56);
            a4xVar2 = a4xVar;
            jwb.p(o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 24.0f, 5), 1.0f), new qw3(8.0f, true, new jf4((byte) 14)), new qw3(16.0f, true, new jf4((byte) 14)), null, 0, 0, u1c.M(-1735172286, new r3g0(a4xVar2, function1, b2), fetVar2), fetVar2, 1572864, 56);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            a4xVar2 = a4xVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(mm40Var, a4xVar2, function1, i2, (byte) 12);
        }
    }

    public static final void B(xk80 xk80Var, l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, Function1 function3, fet fetVar, int i2) {
        int i3;
        l7m0 l7m0Var2;
        qdz qdzVar2;
        fetVar.g0(1145248299);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(xk80Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i3 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i2 & 384) == 0) {
            qdzVar2 = qdzVar;
            i3 |= fetVar.g(qdzVar2) ? 256 : 128;
        } else {
            qdzVar2 = qdzVar;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function3) ? 131072 : 65536;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            zcl zclVar = qmk.f28987a;
            float fB = pkd.b(8.0f, fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            rdo0 rdo0Var = (rdo0) fetVar.k(sdo0.f32043a);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new bkg(xk80Var, pz40Var, null, b2);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, xk80Var, (Function2) objP2);
            q5x.e(xk80Var, o2e.e0(vtb.U(jm40.b, ((Boolean) pz40Var.getValue()).booleanValue()), "HOME_SCREEN_HORIZONTAL_PAGER"), null, null, 2, 32.0f, null, null, false, null, null, null, null, u1c.M(14194604, new akg(l7m0Var2, qdzVar2, xk80Var, function3, fB, rdo0Var, function1, function2), fetVar), fetVar, i4 | 100687872, 24576, 16076);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) xk80Var, (Object) l7m0Var, (Object) qdzVar, function1, (wdr) function2, (wdr) function3, i2, (byte) 7);
        }
    }

    public static final void C(ik7 ik7Var, fet fetVar, int i2) {
        int i3;
        zx7 zx7Var = gqw0.e;
        fetVar.g0(-641865834);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(ik7Var) : fetVar.i(ik7Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            tvw tvwVar = ik7Var.d;
            boolean zEquals = tvwVar.equals(qvw.f29409a);
            jr8 jr8Var = jr8.f16991a;
            if (zEquals) {
                fetVar.e0(1714747762);
                zcl zclVar = qmk.f28987a;
                j0x.b(a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar), null, jr8Var.b(o7k0.n(jm40Var, 32.0f), zx7Var), null, null, 0.0f, new m78(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 5), fetVar, 56, 56);
                fetVar.r(false);
            } else if (tvwVar instanceof rvw) {
                fetVar.e0(1715198781);
                zcl zclVar2 = qmk.f28987a;
                lgb.s(jr8Var.b(o7k0.n(jm40Var, 32.0f), zx7Var), ((rvw) tvwVar).f31190a, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar);
                fetVar.r(false);
            } else {
                if (!(tvwVar instanceof svw)) {
                    throw b1j.f(193859324, fetVar, false);
                }
                fetVar.e0(1715637772);
                zcl zclVar3 = qmk.f28987a;
                j0x.b(a8k0.F(((svw) tvwVar).f32891a, 0, fetVar), null, jr8Var.b(o7k0.n(jm40Var, 32.0f), zx7Var), null, null, 0.0f, new m78(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 5), fetVar, 56, 56);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(ik7Var, i2, (byte) 8);
        }
    }

    public static final void D(mdm mdmVar, a4x a4xVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-303306399);
        int i3 = i2 | (fetVar.g(mdmVar) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (!fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.X();
        } else if (a4xVar.isEmpty()) {
            fetVar.e0(810457879);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(n0qVar, 0.0f, 0.0f, 0.0f, 32.0f, 7);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jcb.l(jr8.f16991a.b(jm40.b, gqw0.e), mdmVar, false, null, fetVar, (i3 << 3) & 112, 12);
            fetVar.r(true);
            fetVar.r(false);
        } else {
            fetVar.e0(810683714);
            n0q n0qVar2 = o7k0.c;
            zcl zclVar2 = qmk.f28987a;
            lh80 lh80Var = new lh80(8.0f, 8.0f, 8.0f, 24.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new or0(a4xVar, function1, (byte) 18);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar2, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, 6, 490);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mdmVar, a4xVar, function1, i2, (byte) 23);
        }
    }

    public static final void E(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1507265340);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Unit unit = Unit.f46060a;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new i1y(function1, (byte) 17);
                fetVar.o0(objP);
            }
            m0x0.o(unit, (Function1) objP, fetVar);
            m1z m1zVar = (m1z) l7m0Var.getValue();
            f9m0 f9m0VarC = m1zVar.c();
            zdm0 zdm0Var = m1zVar.b().f33143a;
            j9m0 j9m0Var = m1zVar.b().b;
            boolean z2 = false;
            boolean zA = m1zVar.a();
            boolean z3 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == obj) {
                objP2 = new xwy(function1, (byte) 10);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean zG = fetVar.g(m1zVar);
            if (i4 == 256) {
                z2 = true;
            }
            boolean z4 = zG | z2;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == obj) {
                objP3 = new wqv(m1zVar, function1);
                fetVar.o0(objP3);
            }
            ugd ugdVarM = u1c.M(1898966482, new rgh(m1zVar, function1, (byte) 28), fetVar);
            mm40Var2 = jm40.b;
            ffb0.D(mm40Var2, f9m0VarC, zdm0Var, j9m0Var, zA, function0, null, (Function0) objP3, ugdVarM, fetVar, 100663302, 64);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r93(mm40Var2, l7m0Var, function1, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v18 */
    public static final void F(l1z l1zVar, Function1 function1, Function1 function2, Function0 function0, fet fetVar, int i2) {
        fet fetVar2;
        ?? r15;
        kwj kwjVar;
        Function1 function3 = function2;
        fet fetVar3 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        int i3 = l1zVar.e;
        xx7 xx7Var = gqw0.m;
        mw3 mw3Var = uc9.c;
        fetVar3.g0(122261560);
        int i4 = i2 | (fetVar3.g(l1zVar) ? 4 : 2) | (fetVar3.i(function1) ? 32 : 16) | (fetVar3.i(function3) ? 256 : 128) | (fetVar3.i(function0) ? 2048 : 1024);
        if (fetVar3.U(i4 & 1, (i4 & 1171) != 1170)) {
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object objP = fetVar3.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new y2x(l1zVar, (byte) 24);
                fetVar3.o0(objP);
            }
            kwj kwjVarB = zk80.b(i3, (Function0) objP, fetVar3, 0, 2);
            Integer numValueOf = Integer.valueOf(i3);
            boolean zG = (i5 == 4) | fetVar3.g(kwjVarB);
            Object objP2 = fetVar3.P();
            yje yjeVar = null;
            if (zG || objP2 == obj) {
                objP2 = new juy((Object) kwjVarB, (Object) l1zVar, yjeVar, (byte) 2);
                fetVar3.o0(objP2);
            }
            m0x0.t(fetVar3, numValueOf, (Function2) objP2);
            Integer numValueOf2 = Integer.valueOf(kwjVarB.k());
            boolean zG2 = (i5 == 4) | fetVar3.g(kwjVarB) | ((i4 & 112) == 32);
            Object objP3 = fetVar3.P();
            if (zG2 || objP3 == obj) {
                r15 = 0;
                kwjVar = kwjVarB;
                khx khxVar = new khx(l1zVar, kwjVar, function1, yjeVar, (byte) 2);
                fetVar3.o0(khxVar);
                objP3 = khxVar;
            } else {
                kwjVar = kwjVarB;
                r15 = 0;
            }
            m0x0.t(fetVar3, numValueOf2, (Function2) objP3);
            n3q n3qVar = l1zVar.d;
            n3q n3qVar2 = n3q.c;
            jm40 jm40Var = jm40.b;
            pcy pcyVar = e7z.u1;
            if (n3qVar == n3qVar2) {
                fetVar3.e0(162559773);
                x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar3, r15);
                int iHashCode = Long.hashCode(fetVar3.T);
                bh90 bh90VarM = fetVar3.m();
                mm40 mm40VarC0 = kbc.c0(fetVar3, jm40Var);
                mkd.c0.getClass();
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(pcyVar);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, x5dVarA, shdVar4);
                jpm0.o(fetVar3, bh90VarM, shdVar3);
                jpm0.o(fetVar3, Integer.valueOf(iHashCode), shdVar2);
                jpm0.n(fetVar3);
                jpm0.o(fetVar3, mm40VarC0, shdVar);
                U(l1zVar.i, l1zVar.c, function0, fetVar3, (i4 >> 3) & 896);
                function3 = function2;
                D(l1zVar.j, l1zVar.g, function3, fetVar3, i4 & 896);
                fetVar3.r(true);
                fetVar3.r(r15);
                fetVar2 = fetVar3;
            } else {
                function3 = function2;
                fetVar3.e0(163015473);
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar3, r15);
                int iHashCode2 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM2 = fetVar3.m();
                mm40 mm40VarC1 = kbc.c0(fetVar3, jm40Var);
                mkd.c0.getClass();
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(pcyVar);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, x5dVarA2, shdVar4);
                jpm0.o(fetVar3, bh90VarM2, shdVar3);
                jpm0.o(fetVar3, Integer.valueOf(iHashCode2), shdVar2);
                jpm0.n(fetVar3);
                jpm0.o(fetVar3, mm40VarC1, shdVar);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40Var, qmk.a(fetVar3).f, 12.0f, qmk.a(fetVar3).f, 0.0f, 8);
                boolean z2 = l1zVar.c;
                a4x a4xVar = l1zVar.f;
                boolean zG3 = fetVar3.g(kwjVar);
                Object objP4 = fetVar3.P();
                if (zG3 || objP4 == obj) {
                    objP4 = new w48(kwjVar, (byte) 2);
                    fetVar3.o0(objP4);
                }
                ibc.o(mm40VarN, a4xVar, gxh0.f12078a, z2, (Function0) objP4, function1, fetVar3, ((i4 << 12) & 458752) | 384, 0);
                q5x.e(kwjVar, null, null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(1120732243, new d2s(l1zVar, function3, (byte) 7), fetVar3), fetVar, 0, 24576, 16382);
                fet fetVar4 = fetVar;
                fetVar4.r(true);
                fetVar4.r(false);
                fetVar2 = fetVar4;
            }
        } else {
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr(l1zVar, function1, function3, function0, i2);
        }
    }

    public static final void G(int i2, fet fetVar) {
        fet fetVar2 = fetVar;
        fetVar2.g0(390808406);
        if (fetVar2.U(i2 & 1, i2 != 0)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            dww.c(a8k0.F(R.drawable.ic_glyph_live_indicator, 0, fetVar2), null, o7k0.n(jm40Var, 16.0f), y3d.g, fetVar2, 3128, 0);
            v8q0.a(rsm0.w(R.string.live_new, 0, fetVar2), new x7z(1.0f, false), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.r(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i87(i2, (byte) 8);
        }
    }

    public static final void H(int i2, fet fetVar) {
        fetVar.g0(701850368);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            boolean zG = fetVar.g(fqj0VarD0);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new yq5(fqj0VarD0, (byte) 3);
                fetVar.o0(objP);
            }
            b8k0.e(null, null, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 511);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jfa0(i2, (byte) 2);
        }
    }

    public static final void I(mm40 mm40Var, imm immVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(-144787532);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(immVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            byte b2 = 27;
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new mfp(function1, (byte) 27);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new qyo(function1, b2);
                fetVar.o0(objP2);
            }
            mm40Var2 = jm40.b;
            hlm.c(mm40Var2, immVar, null, function0, null, (Function1) objP2, null, null, null, null, null, null, fetVar, i3 & 126, 0, 4052);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o4q(mm40Var2, immVar, function1, i2, (byte) 0);
        }
    }

    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r15v13 */
    public static final void J(mm40 mm40Var, String str, float f2, l7m0 l7m0Var, Function0 function0, fet fetVar, int i2) {
        int i3;
        char c2;
        Object objJ;
        Object objB;
        boolean z;
        Object objJ2;
        qja qjaVar = qja.j;
        fetVar.g0(-1884378173);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.d(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function0) ? 16384 : 8192;
        }
        ?? r15 = 0;
        boolean z2 = false;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            oms0 oms0VarZ = phu0.Z(Float.valueOf(f2), null, fetVar, (i3 >> 6) & 14, 2);
            pz40 pz40Var = oms0VarZ.d;
            p4 p4Var = oms0VarZ.f25519a;
            long jM121getTransparent0d7_KjU = afn0.p(fetVar).m121getTransparent0d7_KjU();
            hgk0 hgk0Var = (hgk0) pz40Var;
            long jP = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.B(fetVar, 1420901850, fetVar), afn0.m(fetVar).getSecondary());
            fetVar.r(false);
            Object objF = y3d.f(jP);
            boolean zG = fetVar.g(objF);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = kng0.d(qjaVar, new s43(objF, (byte) 2), fetVar);
            }
            lxs0 lxs0Var = (lxs0) objP;
            if (oms0VarZ.h()) {
                c2 = 50445;
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
                        z2 = false;
                    } catch (Throwable th) {
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        throw th;
                    }
                }
                fetVar.r(z2);
                c2 = 50445;
                r15 = z2;
            }
            y3d y3dVar = new y3d(twn.i(fetVar, twn.B(fetVar, 1420901850, fetVar), ((Number) objJ).floatValue(), r15));
            boolean zG3 = fetVar.g(oms0VarZ);
            Object objP2 = fetVar.P();
            if (zG3 || objP2 == obj) {
                objP2 = jgk0.b(new elb(oms0VarZ, r15));
                fetVar.o0(objP2);
            }
            y3d y3dVar2 = new y3d(twn.i(fetVar, twn.B(fetVar, 1420901850, fetVar), ((Number) ((l7m0) objP2).getValue()).floatValue(), r15));
            boolean zG4 = fetVar.g(oms0VarZ);
            Object objP3 = fetVar.P();
            if (zG4 || objP3 == obj) {
                objB = jgk0.b(new elb(oms0VarZ, (byte) 1));
                fetVar.o0(objB);
            } else {
                objB = objP3;
            }
            cms0 cms0VarE = phu0.E(oms0VarZ, y3dVar, y3dVar2, w6x.k((ams0) ((l7m0) objB).getValue(), fetVar, 1445529914, false), lxs0Var, fetVar, 0);
            long jP2 = fbc.P(((Number) hgk0Var.getValue()).floatValue(), twn.h(fetVar, 1391125224, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            Object objF2 = y3d.f(jP2);
            boolean zG5 = fetVar.g(objF2);
            Object objP4 = fetVar.P();
            if (zG5 || objP4 == obj) {
                objP4 = kng0.d(qjaVar, new s43(objF2, (byte) 2), fetVar);
            }
            lxs0 lxs0Var2 = (lxs0) objP4;
            if (oms0VarZ.h()) {
                z = false;
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
                z = false;
                fetVar.r(false);
            }
            long jP3 = fbc.P(((Number) objJ2).floatValue(), twn.h(fetVar, 1391125224, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(z);
            y3d y3dVar3 = new y3d(jP3);
            boolean zG7 = fetVar.g(oms0VarZ);
            Object objP5 = fetVar.P();
            if (zG7 || objP5 == obj) {
                objP5 = jgk0.b(new elb(oms0VarZ, (byte) 2));
                fetVar.o0(objP5);
            }
            long jP4 = fbc.P(((Number) ((l7m0) objP5).getValue()).floatValue(), twn.h(fetVar, 1391125224, fetVar), afn0.p(fetVar).m121getTransparent0d7_KjU());
            fetVar.r(false);
            y3d y3dVar4 = new y3d(jP4);
            boolean zG8 = fetVar.g(oms0VarZ);
            Object objP6 = fetVar.P();
            if (zG8 || objP6 == obj) {
                objP6 = jgk0.b(new elb(oms0VarZ, (byte) 3));
                fetVar.o0(objP6);
            }
            cms0 cms0VarE2 = phu0.E(oms0VarZ, y3dVar3, y3dVar4, w6x.k((ams0) ((l7m0) objP6).getValue(), fetVar, 1529083464, false), lxs0Var2, fetVar, 0);
            mm40 mm40VarX = yyw.X(o7k0.d(mm40Var, 1.0f), null, fetVar, 1);
            boolean zH = fetVar.h(((Boolean) l7m0Var.getValue()).booleanValue());
            Object objP7 = fetVar.P();
            if (zH || objP7 == obj) {
                objP7 = new imm(klm.f18497a, mlm.f21997a, fmm.f9790a, jM121getTransparent0d7_KjU, ((Boolean) l7m0Var.getValue()).booleanValue(), null);
                fetVar.o0(objP7);
            }
            imm immVar = (imm) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == obj) {
                objP8 = new vkm(1);
                fetVar.o0(objP8);
            }
            hlm.c(mm40VarX, immVar, (vkm) objP8, null, null, null, null, null, null, u1c.M(-699585081, new cb3(function0, cms0VarE2, cms0VarE, (byte) 2), fetVar), u1c.M(1786595221, new blb(str, f2), fetVar), null, fetVar, 805306752, 6, 2552);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pt1(mm40Var, str, f2, l7m0Var, function0, i2);
        }
    }

    public static final void K(g5h g5hVar, l7m0 l7m0Var, boolean z, boolean z2, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1666946958);
        int i3 = i2 | (fetVar2.e(g5hVar.ordinal()) ? 4 : 2) | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.h(z2) ? 2048 : 1024) | (fetVar2.g(xczVar) ? 16384 : 8192) | (fetVar2.g(qdzVar) ? 131072 : 65536) | (fetVar2.i(function1) ? 1048576 : 524288) | (fetVar2.i(function2) ? 8388608 : 4194304);
        if (fetVar2.U(i3 & 1, (4793491 & i3) != 4793490)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new eka(l7m0Var, (byte) 23));
                fetVar2.o0(objP);
            }
            yiw yiwVar = (yiw) ((l7m0) objP).getValue();
            if (yiwVar != null) {
                if (yiwVar instanceof wiw) {
                    fetVar2.e0(-1604403979);
                    Object objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = jgk0.b(new eka(l7m0Var, (byte) 21));
                        fetVar2.o0(objP2);
                    }
                    l7m0 l7m0Var2 = (l7m0) objP2;
                    Object objP3 = fetVar2.P();
                    if (objP3 == cl5Var) {
                        objP3 = androidx.compose.runtime.e.e(l7m0Var2.getValue());
                        fetVar2.o0(objP3);
                    }
                    pz40 pz40Var = (pz40) objP3;
                    a4x a4xVar = (a4x) l7m0Var2.getValue();
                    if (!a4xVar.isEmpty()) {
                        pz40Var.setValue(a4xVar);
                    }
                    if (((Collection) pz40Var.getValue()).isEmpty()) {
                        fetVar2.e0(-1603004112);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1603545155);
                        Object objP4 = fetVar2.P();
                        if (objP4 == cl5Var) {
                            objP4 = jgk0.b(new eka(l7m0Var, (byte) 22));
                            fetVar2.o0(objP4);
                        }
                        int i4 = i3 << 3;
                        P(g5hVar, pz40Var, qdzVar, (l7m0) objP4, z2, z, xczVar, function1, function2, fetVar2, ((i3 << 6) & 3670016) | (i3 & 14) | 3120 | ((i3 >> 9) & 896) | (57344 & i4) | ((i3 << 9) & 458752) | (29360128 & i4) | (234881024 & i4));
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else if (yiwVar instanceof xiw) {
                    fetVar2.e0(-1602938299);
                    Object objP5 = fetVar2.P();
                    if (objP5 == cl5Var) {
                        objP5 = jgk0.b(new vjg(yiwVar, (byte) 0));
                        fetVar2.o0(objP5);
                    }
                    p((l7m0) objP5, g5hVar, z2, function1, fetVar2, ((i3 << 3) & 112) | 6 | ((i3 >> 3) & 896) | ((i3 >> 9) & 7168));
                    fetVar2.r(false);
                }
            }
            throw b1j.f(86790237, fetVar2, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjg(g5hVar, l7m0Var, z, z2, xczVar, qdzVar, function1, function2, i2, (byte) 0);
        }
    }

    public static final void L(g8a0 g8a0Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-430286900);
        int i3 = i2 | (fetVar2.g(g8a0Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new qw80((Object) function1, (Object) g8a0Var, (byte) 19);
                fetVar2.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40VarD, false, null, null, (Function0) objP, 15);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarY, 16.0f, 8.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            k1x k1xVar = new k1x((Context) fetVar2.k(dy2.b));
            k1xVar.c = g8a0Var.c;
            t1x.c(k1xVar, R.drawable.ic_statistic_player_placeholder);
            t1x.f(k1xVar, R.drawable.ic_statistic_player_placeholder);
            o1x o1xVarA = k1xVar.a();
            mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, 40.0f), vgg0.f37379a);
            pz40 pz40Var = s6t0.f31722a;
            k7x.a(o1xVarA, null, i120.Q(mm40VarJ, s6t0.b().f33626a.getSecondary(), jd8.n), gqw0.A, null, fetVar2, 1572912, 1976);
            qxw.o(fetVar2, o7k0.s(jm40Var, 16.0f));
            v8q0.a(g8a0Var.b, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(g8a0Var, function1, i2, (byte) 6);
        }
    }

    public static final void M(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        fet fetVar2;
        Function1 function2;
        mm40 mm40Var2;
        jm40 jm40Var;
        boolean z;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(612931130);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(n0qVar, backgroundContent, ljcVar);
            WeakHashMap weakHashMap = djv0.w;
            mm40 mm40VarK0 = j120.k0(mm40VarQ, zcm0.i(fetVar).f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
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
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rsm0.w(R.string.players, 0, fetVar), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), true, null);
            int i4 = i3 & 896;
            boolean z3 = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new i0a0(function1, (byte) 11);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            mm40 mm40VarQ2 = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), ljcVar);
            byte b2 = 0;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ2);
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
            hha0 hha0Var = (hha0) l7m0Var.getValue();
            if (hha0Var != null) {
                if (hha0Var instanceof fha0) {
                    fetVar.e0(-190092660);
                    H(0, fetVar);
                    fetVar.r(false);
                    fetVar2 = fetVar;
                    jm40Var = jm40Var2;
                    z = true;
                    function2 = function1;
                } else if (hha0Var instanceof gha0) {
                    fetVar.e0(-189964134);
                    jm40Var = jm40Var2;
                    mm40 mm40VarQ3 = i120.Q(o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), s6t0.b().f33626a.getBackgroundContent(), ljcVar);
                    zcl zclVar = qmk.f28987a;
                    z = true;
                    mm40 mm40VarL = s5x0.L(mm40VarQ3, 0.0f, 8.0f, 1);
                    boolean zG = fetVar.g(hha0Var) | (i4 == 256);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new zga0(hha0Var, function1, b2);
                        fetVar.o0(objP2);
                    }
                    fetVar2 = fetVar;
                    function2 = function1;
                    b8k0.e(mm40VarL, null, null, null, null, null, false, null, (Function1) objP2, fetVar2, 0, 510);
                    fetVar2.r(false);
                } else {
                    fetVar2 = fetVar;
                    jm40Var = jm40Var2;
                    z = true;
                    function2 = function1;
                    if (hha0Var instanceof eha0) {
                        fetVar2.e0(-189129025);
                        mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
                        mdm mdmVar = ((eha0) hha0Var).f7798a;
                        boolean z4 = i4 == 256;
                        Object objP3 = fetVar2.P();
                        if (z4 || objP3 == cl5Var) {
                            objP3 = new i0a0(function2, (byte) 12);
                            fetVar2.o0(objP3);
                        }
                        jcb.l(mm40VarB, mdmVar, false, (Function0) objP3, fetVar2, 0, 4);
                        fetVar2.r(false);
                    }
                }
                fetVar2.r(z);
                fetVar2.r(z);
                mm40Var2 = jm40Var;
            } else {
                fetVar2 = fetVar;
            }
            throw b1j.f(-698870071, fetVar2, false);
        }
        fetVar2 = fetVar;
        function2 = function1;
        fetVar2.X();
        mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var2, l7m0Var, function2, i2, (byte) 27);
        }
    }

    public static final void N(mm40 mm40Var, xzh xzhVar, fet fetVar, int i2) {
        int i3;
        xzh xzhVar2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-354512989);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(xzhVar) ? 32 : 16;
        }
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 6);
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
            boolean z3 = xzhVar.l;
            jm40 jm40Var = jm40.b;
            if (z3) {
                fetVar2.e0(13203844);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarW = o7k0.w(o7k0.g(mm40VarD2, 28.0f, 0.0f, 2), gqw0.k, false, 2);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                v8q0.a(xzhVar.m, mm40VarW, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(false);
                xzhVar2 = xzhVar;
                z = true;
            } else {
                fetVar2.e0(13768261);
                zfn zfnVar = m8m0.f21378a;
                StaticColors staticColors = (StaticColors) fetVar2.k(zfnVar);
                mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                boolean zE = fetVar2.e(xzhVar.i) | fetVar2.e(xzhVar.j);
                Object objP = fetVar2.P();
                if (zE || objP == ukd.f35823a) {
                    tnm tnmVar = tnm.f34243a;
                    long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                    long jM123getWhite0d7_KjU2 = staticColors.m123getWhite0d7_KjU();
                    long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
                    zcl zclVar2 = qmk.f28987a;
                    objP = new unm(tnmVar, jM123getWhite0d7_KjU, jM123getWhite0d7_KjU2, jM126getWhite200d7_KjU, 8.0f, 4.0f, xzhVar.i, xzhVar.j, true, 512);
                    fetVar2.o0(objP);
                }
                snm.b(mm40VarD3, (unm) objP, fetVar2, 6);
                mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(mm40VarD4, 0.0f, 6.0f, 0.0f, 0.0f, 13);
                qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                yx7 yx7Var = gqw0.l;
                thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
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
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                mm40 mm40VarE0 = o2e.e0(o7k0.w(o7k0.g(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 14.0f, 0.0f, 2), yx7Var, false, 2), "TEXT_EXPERIENCE_LOYALTY_WIDGET");
                zfn zfnVar2 = j1t0.e;
                ((g1t0) fetVar2.k(zfnVar2)).getClass();
                float f2 = 1.0f;
                z = true;
                v8q0.a(xzhVar.g, mm40VarE0, ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 110584);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f2 = Float.MAX_VALUE;
                }
                mm40 mm40VarW2 = o7k0.w(o7k0.g(new x7z(f2, true), 14.0f, 0.0f, 2), yx7Var, false, 2);
                ((g1t0) fetVar.k(zfnVar2)).getClass();
                xzhVar2 = xzhVar;
                v8q0.a(xzhVar2.h, mm40VarW2, ((StaticColors) fetVar.k(zfnVar)).m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            xzhVar2 = xzhVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) mm40Var, (Object) xzhVar2, i2, (byte) 8);
        }
    }

    public static final void O(int i2, fet fetVar, mm40 mm40Var) {
        fet fetVar2 = fetVar;
        fetVar2.g0(699985551);
        byte b2 = 2;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var, xfn.a(fetVar2).e, 8.0f, xfn.a(fetVar2).e, 0.0f, 8);
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
                objP = new vtf0(b2);
                fetVar2.o0(objP);
            }
            fbc.w(null, iunVar, xylVar, null, null, 0, true, false, (Function2) objP, fetVar, 102433200);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i2, (byte) 17);
        }
    }

    public static final void P(g5h g5hVar, pz40 pz40Var, qdz qdzVar, l7m0 l7m0Var, boolean z, boolean z2, xcz xczVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        boolean z3;
        fet fetVar2 = fetVar;
        fetVar2.g0(1270680599);
        int i3 = (fetVar2.e(g5hVar.ordinal()) ? 4 : 2) | i2;
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(qdzVar) ? 256 : 128;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            z3 = z2;
            i3 |= fetVar2.h(z3) ? 131072 : 65536;
        } else {
            z3 = z2;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar2.g(xczVar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar2.i(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar2.i(function2) ? 67108864 : 33554432;
        }
        if (fetVar2.U(i3 & 1, (38347923 & i3) != 38347922)) {
            int iOrdinal = g5hVar.ordinal();
            if (iOrdinal == 0) {
                fetVar2.e0(1353357890);
                int i4 = ((i3 >> 12) & 896) | 54 | ((i3 << 3) & 7168);
                int i5 = i3 >> 9;
                wwj.a(pz40Var, l7m0Var, xczVar, qdzVar, function1, function2, fetVar2, i4 | (i5 & 57344) | (i5 & 458752));
                fetVar2.r(false);
            } else if (iOrdinal == 1) {
                fetVar2.e0(-995234330);
                hp4.k(pz40Var, l7m0Var, xczVar, qdzVar, !z, z3, function2, function1, fetVar2, ((i3 >> 6) & 3670016) | ((i3 >> 12) & 896) | 54 | ((i3 << 3) & 7168) | (i3 & 458752) | (i3 & 29360128));
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(1353356787, fetVar2, false);
                }
                fetVar2.e0(1353382821);
                int i6 = i3 >> 12;
                vbw0.t(pz40Var, l7m0Var, xczVar, qdzVar, function2, function1, fetVar2, ((i3 << 3) & 7168) | 54 | (i6 & 896) | (i6 & 57344) | ((i3 >> 6) & 458752));
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yjg(g5hVar, pz40Var, qdzVar, l7m0Var, z, z2, xczVar, function1, function2, i2, (byte) 0);
        }
    }

    public static final void Q(int i2, fet fetVar) {
        fet fetVar2;
        fetVar.g0(1279033092);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80Var = new lh80(8.0f, 8.0f, 8.0f, 8.0f);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new djx((byte) 23);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            b8k0.e(null, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar2, 817889280, 363);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hvy(i2, (byte) 7);
        }
    }

    public static final void R(mm40 mm40Var, float f2, fet fetVar, int i2) {
        fetVar.g0(1083707358);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.d(f2) ? 32 : 16;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            lh80 lh80VarT = s5x0.t(f2, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new f8l0(b2);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarD, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 805306368, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0i(mm40Var, f2, i2, (byte) 3);
        }
    }

    public static final void S(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(146050683);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 120.0f), 104.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarC0 = xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarC0);
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
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i2, (byte) 20);
        }
    }

    public static final void T(mm40 mm40Var, b3n b3nVar, float f2, Function1 function1, fet fetVar, int i2, int i3) {
        if ((i3 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if (b3nVar instanceof z2n) {
            fetVar.e0(2061975314);
            v(mm40Var, (z2n) b3nVar, f2, function1, fetVar, i2 & 8190);
            fetVar.r(false);
            return;
        }
        if (!(b3nVar instanceof a3n)) {
            throw b1j.f(-626223493, fetVar, false);
        }
        fetVar.e0(2062235714);
        R(mm40Var, f2, fetVar, 0);
        fetVar.r(false);
    }

    public static final void U(csv csvVar, boolean z, Function0 function0, fet fetVar, int i2) {
        int i3;
        k6z k6zVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1406504349);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(csvVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            boolean zF = fetVar2.f(backgroundContent);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                objP = new dls((byte) 15, backgroundContent);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarD, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarK, 16.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            x5d x5dVarA = w5d.a(new qw3(16.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
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
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            boolean z3 = (i3 & 896) == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new dbn(function0, (byte) 29);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarD2, null, null, false, null, (Function0) objP2, 28);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarW);
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
            v8q0.a(csvVar.f4908a, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.l(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), fetVar, 0, 24960, 110590);
            fetVar2 = fetVar;
            dww.b(jpm0.t(csvVar.d, 6, fetVar2), null, o7k0.n(jm40Var, 24.0f), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 48, 0);
            fetVar2.r(true);
            if (z) {
                fetVar2.e0(363187918);
                k6zVar = (k6z) fetVar2.k(bmd.n);
                fetVar2.r(false);
            } else {
                fetVar2.e0(363188842);
                fetVar2.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(847135015, new xxv(csvVar, (byte) 28), fetVar2), fetVar2, 56);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzx((Object) csvVar, z, (Object) function0, i2, (byte) 1);
        }
    }

    public static final void V(gin0 gin0Var, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1750385161);
        int i3 = i2 | (fetVar2.g(gin0Var) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
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
            v8q0.a(gin0Var.f11357a, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.q(g1t0.m(), fetVar2), fetVar, 0, 24960, 110590);
            v8q0.a(gin0Var.c, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.m(), fetVar), fetVar, 0, 24960, 110590);
            v8q0.a(gin0Var.b, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.q(g1t0.m(), fetVar), fetVar, 0, 24960, 110590);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xxv(gin0Var, i2, (byte) 29);
        }
    }

    public static final void W(xk80 xk80Var, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-1812619620);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(xk80Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(l7m0Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            int iOrdinal = ((kkw) l7m0Var.getValue()).f18461a.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(872967328);
                obc.y(xk80Var, ((kkw) l7m0Var.getValue()).c, function1, fetVar, ((i3 >> 3) & 896) | (i3 & 14));
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(873208353);
                gco.a(xk80Var, ((kkw) l7m0Var.getValue()).c, function1, fetVar, ((i3 >> 3) & 896) | (i3 & 14));
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(1829273624, fetVar, false);
                }
                fetVar.e0(873451238);
                frv.a(xk80Var, ((kkw) l7m0Var.getValue()).c, l7m0Var2, function1, fetVar, i3 & 8078);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zjg(xk80Var, l7m0Var, l7m0Var2, function1, i2, (byte) 0);
        }
    }

    public static boolean X(guo guoVar) {
        fq80 fq80Var = new fq80(8);
        int i2 = ejx.c(guoVar, fq80Var).f7928a;
        if (i2 != 1380533830 && i2 != 1380333108) {
            return false;
        }
        guoVar.n(fq80Var.f9961a, 0, 4);
        fq80Var.M(0);
        int iM = fq80Var.m();
        if (iM == 1463899717) {
            return true;
        }
        f1t0.Q("WavHeaderReader", "Unsupported form type: " + iM);
        return false;
    }

    public static void Y(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static final int Z(List list) {
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int i3 = q3d.i(list);
        for (int i4 = 1; i4 < i3; i4++) {
            if (y3d.d(((y3d) list.get(i4)).f41946a) == 0.0f) {
                i2++;
            }
        }
        return i2;
    }

    public static final void a(mm40 mm40Var, sgk0 sgk0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        function1.getClass();
        fetVar.g0(728022549);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(sgk0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 56.0f);
            long backgroundGroup = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundGroup();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarN, backgroundGroup, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new e0(function1, b2);
                fetVar.o0(objP);
            }
            mm40 mm40VarY = y860.Y(mm40VarQ, false, null, null, (Function0) objP, 15);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
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
            mm40 mm40VarN2 = o7k0.n(jm40.b, 40.0f);
            boolean z2 = sgk0Var.f32166a;
            yb ybVar = new yb();
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new q8((byte) 0);
                fetVar.o0(objP2);
            }
            acb.n(ybVar, z2, (Function0) objP2, mm40VarN2, fetVar, 384, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var, (Object) sgk0Var, (Object) function1, i2, (byte) 5);
        }
    }

    public static int a0(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        x0x.K(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            Y(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            Y(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            Y(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    Y(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static final void b(di0 di0Var, Function1 function1, fet fetVar, int i2) {
        ArrayList arrayList;
        di0Var.getClass();
        fetVar.g0(-973981922);
        int i3 = (i2 & 6) == 0 ? (fetVar.g(di0Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        byte b2 = 3;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            int i4 = pkd.d(fetVar) ? 18 : 12;
            if (di0Var instanceof bi0) {
                arrayList = ((bi0) di0Var).f2634a;
            } else {
                if (!di0Var.equals(ci0.f4388a)) {
                    t9f.b();
                    return;
                }
                arrayList = new ArrayList(i4);
                for (int i5 = 0; i5 < i4; i5++) {
                    arrayList.add(oh0.f25241a);
                }
            }
            int i6 = ((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp;
            int iMin = Math.min(arrayList.size(), i6 < 640 ? 2 : 3);
            int size = ((arrayList.size() + iMin) - 1) / iMin;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40.b, ((size - 1) * 8.0f) + (64.0f * size)), 1.0f);
            int i7 = i3;
            ngv ngvVar = new ngv(i6 > 411 ? iMin : 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
            boolean zI = fetVar.i(arrayList) | ((i7 & 112) == 32);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new rb(arrayList, function1, b2);
                fetVar.o0(objP);
            }
            g8x.i(ngvVar, mm40VarD, null, null, qw3Var2, qw3Var, null, false, null, (Function1) objP, fetVar, 0, 924);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rh0(di0Var, function1, i2, (byte) 3);
        }
    }

    public static String b0(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                u3x u3xVarL = b4x.l();
                int i3 = 0;
                while (i3 < bArr.length) {
                    int iA0 = a0(bArr, i3, bArr.length, zArr);
                    if (iA0 != bArr.length) {
                        u3xVarL.b(Integer.valueOf(iA0));
                    }
                    i3 = iA0 + 3;
                }
                rcf0 rcf0VarG = u3xVarL.g();
                for (int i4 = 0; i4 < rcf0VarG.d; i4++) {
                    if (((Integer) rcf0VarG.get(i4)).intValue() + 3 < length) {
                        z55 z55Var = new z55(bArr, ((Integer) rcf0VarG.get(i4)).intValue() + 3, length);
                        j6 j6VarK0 = k0(z55Var);
                        if (j6VarK0.f15959a == 33 && j6VarK0.b == 0) {
                            z55Var.v(4);
                            int iJ = z55Var.j(3);
                            z55Var.u();
                            a950 a950VarL0 = l0(z55Var, true, iJ, null);
                            return jyc.a(a950VarL0.f461a, a950VarL0.b, a950VarL0.c, a950VarL0.d, a950VarL0.e, a950VarL0.f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final void c(uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, fet fetVar, int i2) {
        int i3;
        String str;
        String str2;
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(1861922423);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(uzhVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.i(function3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.i(function4) ? 131072 : 65536;
        }
        int i4 = i3;
        if (fetVar2.U(i4 & 1, (i4 & 74899) != 74898)) {
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
            q7n q7nVar = uzhVar.s;
            tzh tzhVar = uzhVar.t;
            fetVar2.e0(-59579774);
            String str4 = q7nVar.f28259a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            cwr0.o(null, str4, g1t0.g(), q7nVar.b, new qol(null, 15), tol.d, null, function4, fetVar2, 1572864 | ((i4 << 9) & 234881024));
            fetVar2 = fetVar2;
            fetVar2.r(false);
            a4x a4xVar = uzhVar.j;
            woo0 woo0Var = woo0.f39508a;
            if (a4xVar == null || a4xVar.isEmpty()) {
                fetVar2.e0(-58631019);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-59040715);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                String str5 = uzhVar.f;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                u1c.g(mm40VarD, str5, g1t0.g(), uzhVar.j, woo0Var, tzhVar.b, function0, fetVar2, ((i4 << 15) & 3670016) | 24582);
                fetVar2.r(false);
            }
            a4x a4xVar2 = uzhVar.k;
            if (a4xVar2 == null || a4xVar2.isEmpty()) {
                fetVar2.e0(-58162795);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-58556154);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                String str6 = uzhVar.g;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                u1c.g(mm40VarD2, str6, g1t0.g(), uzhVar.k, woo0Var, tzhVar.c, function1, fetVar2, ((i4 << 12) & 3670016) | 24582);
                fetVar2.r(false);
            }
            String str7 = uzhVar.h;
            if (str7 == null || str7.length() == 0 || (str3 = uzhVar.m) == null || str3.length() == 0) {
                fetVar2.e0(-57787819);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-58054977);
                String str8 = uzhVar.h;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                gq80.r(null, str8, g1t0.g(), uzhVar.m, tzhVar.d, fetVar2, 0);
                fetVar2.r(false);
            }
            String str9 = uzhVar.i;
            if (str9 == null || str9.length() == 0 || (str2 = uzhVar.n) == null || str2.length() == 0) {
                fetVar2.e0(-57407883);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-57677924);
                String str10 = uzhVar.i;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                gq80.r(null, str10, g1t0.g(), uzhVar.n, false, fetVar2, 0);
                fetVar2.r(false);
            }
            String str11 = uzhVar.o;
            if ((str11 == null || str11.length() == 0) && ((str = uzhVar.p) == null || str.length() == 0)) {
                fetVar2.e0(-57018027);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-57298639);
                pzb.l(uzhVar.o, uzhVar.p, function2, function3, fetVar2, (i4 >> 3) & 8064);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new anl(uzhVar, function0, function1, function2, function3, function4, i2, (byte) 2);
        }
    }

    public static final ban c0(tf8 tf8Var, ctf0 ctf0Var, csr csrVar) {
        boolean zEquals = tf8Var.a().f4905a.equals(csrVar.f4905a);
        return new ban(1, new wul(zEquals ? nul.e : lul.e, oe9.c, new ue9(zEquals ? ctf0Var.b.a(R.string.bonuses_deactivate_bonus, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.bonuses_activate_bonus, Arrays.copyOf(new Object[0], 0))), true, false, true));
    }

    /* JADX WARN: Code duplicated, block: B:66:0x032c  */
    /* JADX WARN: Code duplicated, block: B:67:0x038e  */
    public static final void d(uzh uzhVar, Function0 function0, fet fetVar, int i2) {
        int i3;
        Function0 function1;
        byte b2;
        ovl ovlVar;
        fet fetVar2;
        boolean z;
        uzh uzhVar2 = uzhVar;
        fet fetVar3 = fetVar;
        fetVar3.g0(-773501269);
        if ((i2 & 6) == 0) {
            i3 = i2 | (fetVar3.g(uzhVar2) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar3.i(function0) ? 32 : 16;
        }
        if (fetVar3.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 116.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z2 = fetVar3.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarA = jr8Var.a(jm40Var);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarA);
            fetVar3.i0();
            int i4 = i3;
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, shdVar);
            jpm0.o(fetVar3, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar4);
            mm40 mm40VarC = o7k0.c(o7k0.s(jm40Var, 88.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar3, zclVar3, zclVar2, mm40VarC);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM3 = fetVar3.m();
            mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarE2);
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
            mm40 mm40VarA2 = jr8Var.a(jm40Var);
            long backgroundContent = afn0.m(fetVar3).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarV = yyw.V(i120.Q(mm40VarA2, backgroundContent, ljcVar), fetVar3.k(bmd.n) == k6z.b);
            String str = uzhVar2.d;
            ovl ovlVar2 = uzhVar2.r;
            String str2 = ovlVar2.b;
            k7x.a(str, null, mm40VarV, gqw0.A, null, fetVar, 1572912, 1976);
            fetVar.r(true);
            mm40 mm40VarQ = i120.Q(h97.e(zclVar3, zclVar2, zclVar2, zclVar3, o7k0.c(new x7z(1.0f, true), 1.0f)), afn0.m(fetVar).getPrimary(), ljcVar);
            tj30 tj30VarC3 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarQ);
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
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, n0qVar);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            z(jm40Var, uzhVar, fetVar, ((i4 << 3) & 112) | 6);
            mm40 mm40VarN = s5x0.N(jm40Var, 16.0f, 0.0f, 8.0f, 0.0f, 10);
            String str3 = uzhVar.e;
            afn0.v(fetVar).getClass();
            aad.e(str3, mm40VarN, y9q0.a(g1t0.p(), afn0.p(fetVar).m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 1, qmk.t, null, null, 16580606), null, 2, false, 1, 0, null, new n05(qmk.q, qmk.w, qmk.n), fetVar, 1794048, 392);
            if (str2 == null || str2.length() == 0) {
                ovlVar = ovlVar2;
                String str4 = ovlVar.c;
                if (str4 == null || str4.length() == 0) {
                    fetVar2 = fetVar;
                    fetVar2.e0(1251340340);
                    fetVar2.r(false);
                }
                ohs0.x(fetVar2, true, true, true);
                b2 = 2;
                f(0, fetVar2, o7k0.c(ffb0.R(jr8Var.b(jm40Var, gqw0.d), 82.0f, 0.0f, 2), 1.0f));
                if (uzhVar.l) {
                    fetVar2.e0(-899704151);
                    mm40 mm40VarJ = s5x0.J(jr8Var.b(jm40Var, gqw0.c), 4.0f);
                    long jM126getWhite200d7_KjU = afn0.p(fetVar2).m126getWhite200d7_KjU();
                    zcl zclVar4 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarN2 = o7k0.n(i120.Q(mm40VarJ, jM126getWhite200d7_KjU, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4)), 24.0f);
                    uzhVar2 = uzhVar;
                    z = true;
                    function1 = function0;
                    fetVar3 = fetVar2;
                    dww.c(a8k0.F(R.drawable.ic_glyph_cancel, 0, fetVar2), null, y860.Y(mm40VarN2, false, null, null, function0, 15), afn0.p(fetVar2).m123getWhite0d7_KjU(), fetVar3, 56, 0);
                    fetVar3.r(false);
                } else {
                    function1 = function0;
                    uzhVar2 = uzhVar;
                    z = true;
                    fetVar3 = fetVar2;
                    fetVar3.e0(-899059971);
                    fetVar3.r(false);
                }
                fetVar3.r(z);
            } else {
                ovlVar = ovlVar2;
            }
            fetVar.e0(1249741236);
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            afn0.v(fetVar).getClass();
            wha0.n(mm40VarD2, g1t0.g(), new y8n(ovlVar.f25931a, str2 == null ? "" : str2, ovlVar.c, afn0.m(fetVar).getPrimary(), afn0.p(fetVar).m131getWhite800d7_KjU(), afn0.p(fetVar).m123getWhite0d7_KjU(), afn0.p(fetVar).m131getWhite800d7_KjU(), false, new unm(tnm.f34243a, afn0.p(fetVar).m123getWhite0d7_KjU(), afn0.p(fetVar).m123getWhite0d7_KjU(), afn0.p(fetVar).m126getWhite200d7_KjU(), 8.0f, 4.0f, uzhVar.q, 100, false, 768)), fetVar, 6, 0);
            fetVar2 = fetVar;
            fetVar2.r(false);
            ohs0.x(fetVar2, true, true, true);
            b2 = 2;
            f(0, fetVar2, o7k0.c(ffb0.R(jr8Var.b(jm40Var, gqw0.d), 82.0f, 0.0f, 2), 1.0f));
            if (uzhVar.l) {
                fetVar2.e0(-899704151);
                mm40 mm40VarJ2 = s5x0.J(jr8Var.b(jm40Var, gqw0.c), 4.0f);
                long jM126getWhite200d7_KjU2 = afn0.p(fetVar2).m126getWhite200d7_KjU();
                zcl zclVar5 = qmk.m;
                ugg0 ugg0Var2 = vgg0.f37379a;
                mm40 mm40VarN3 = o7k0.n(i120.Q(mm40VarJ2, jM126getWhite200d7_KjU2, new ugg0(zclVar5, zclVar5, zclVar5, zclVar5)), 24.0f);
                uzhVar2 = uzhVar;
                z = true;
                function1 = function0;
                fetVar3 = fetVar2;
                dww.c(a8k0.F(R.drawable.ic_glyph_cancel, 0, fetVar2), null, y860.Y(mm40VarN3, false, null, null, function0, 15), afn0.p(fetVar2).m123getWhite0d7_KjU(), fetVar3, 56, 0);
                fetVar3.r(false);
            } else {
                function1 = function0;
                uzhVar2 = uzhVar;
                z = true;
                fetVar3 = fetVar2;
                fetVar3.e0(-899059971);
                fetVar3.r(false);
            }
            fetVar3.r(z);
        } else {
            i2 = i2;
            function1 = function0;
            b2 = 2;
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yml(uzhVar2, function1, i2, b2);
        }
    }

    public static final fan d0(tf8 tf8Var, ctf0 ctf0Var, csr csrVar) {
        if (tf8Var.a().f4905a.equals(csrVar.f4905a)) {
            return new fan(ctf0Var.b.a(R.string.bonus_active, Arrays.copyOf(new Object[0], 0)), bqo0.f3042a);
        }
        return new fan(ctf0Var.b.a(R.string.available_with_value_v2, Arrays.copyOf(new Object[]{Long.valueOf(tf8Var.a().d)}, 1)), qpo0.f29131a);
    }

    public static final void e(mm40 mm40Var, uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, fet fetVar, int i2) {
        int i3;
        uzh uzhVar2;
        Function0 function5;
        Function0 function6;
        Function0 function7;
        Function0 function8;
        Function0 function9;
        fetVar.g0(-1309509226);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            uzhVar2 = uzhVar;
            i3 |= fetVar.g(uzhVar2) ? 32 : 16;
        } else {
            uzhVar2 = uzhVar;
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
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            c(uzhVar2, function5, function6, function7, function8, function9, fetVar, (i3 >> 3) & 524286);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zml(mm40Var, uzhVar, function0, function1, function2, function3, function4, i2, (byte) 2);
        }
    }

    public static String e0(androidx.media3.common.b bVar) {
        String str = bVar.p;
        String str2 = bVar.l;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return bVar.p;
    }

    public static final void f(int i2, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-577884301);
        byte b2 = 2;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 12.0f);
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
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS2 = o7k0.s(o7k0.c(jr8Var.b(jm40Var, zx7Var), 1.0f), 2.0f);
            boolean zF = fetVar.f(backgroundContent);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new nme((byte) 14, backgroundContent);
                fetVar.o0(objP);
            }
            p8a.k(mm40VarS2, (Function1) objP, fetVar, 0);
            mm40 mm40VarR = ffb0.R(jr8Var.b(o7k0.n(jm40Var, 12.0f), gqw0.b), 0.0f, -6.0f, 1);
            long backgroundContent2 = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, i120.S(i120.Q(mm40VarR, backgroundContent2, ugg0Var), 2.0f, backgroundContent, ugg0Var));
            qxw.o(fetVar, i120.S(i120.Q(ffb0.R(jr8Var.b(o7k0.n(jm40Var, 12.0f), gqw0.h), 0.0f, 6.0f, 1), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ugg0Var), 2.0f, backgroundContent, ugg0Var));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, false, i2, b2);
        }
    }

    public static final String f0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((fba) obj).d) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((fba) it.next()).b;
        }
        return String.valueOf(i2);
    }

    public static final void g(int i2, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(-1236752920);
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
            nkb.h(null, new ijm(), kjm.b, null, null, null, fetVar, 384, 57);
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new or3((byte) 14);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarQ, null, null, null, null, null, false, null, (Function1) objP, fetVar, 805306368, 510);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var2, i2, (byte) 15);
        }
    }

    public static boolean g0(byte[] bArr, int i2, androidx.media3.common.b bVar) {
        int i3;
        if (Objects.equals(bVar.p, "video/avc")) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(bVar.p, "video/hevc")) {
            j6 j6VarK0 = k0(new z55(bArr, 4, i2 + 4));
            int i4 = j6VarK0.f15959a;
            if (i4 == 35) {
                return false;
            }
            if (i4 <= 14 && i4 % 2 == 0 && j6VarK0.c == bVar.I - 1) {
                return false;
            }
        }
        return true;
    }

    public static final void h(List list, Function1 function1, Function1 function2, Function1 function3, mm40 mm40Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        list.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar.g0(481166612);
        int i3 = i2 | (fetVar.g(list) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128) | (fetVar.i(function3) ? 2048 : 1024) | 24576;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            n0q n0qVar = o7k0.c;
            ch80 ch80VarF = knm0.f(s5x0.t(0.0f, 0.0f, 3), fetVar);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                dc0 dc0Var = new dc0((Object) list, (Object) function1, (Object) function2, (Object) function3, (byte) 9);
                fetVar.o0(dc0Var);
                objP = dc0Var;
            }
            b8k0.e(n0qVar, null, ch80VarF, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) list, function1, function2, (wdr) function3, (Object) mm40Var2, i2, (byte) 8);
        }
    }

    public static final int[] h0(int i2, List list) {
        int i3;
        int i4 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            int[] iArr = new int[size];
            while (i4 < size) {
                iArr[i4] = fbc.U(((y3d) list.get(i4)).f41946a);
                i4++;
            }
            return iArr;
        }
        int[] iArr2 = new int[list.size() + i2];
        int size2 = list.size() - 1;
        int size3 = list.size();
        int i5 = 0;
        while (i4 < size3) {
            long j2 = ((y3d) list.get(i4)).f41946a;
            if (y3d.d(j2) == 0.0f) {
                if (i4 == 0) {
                    i3 = i5 + 1;
                    iArr2[i5] = fbc.U(y3d.c(0.0f, ((y3d) list.get(1)).f41946a));
                } else if (i4 == size2) {
                    i3 = i5 + 1;
                    iArr2[i5] = fbc.U(y3d.c(0.0f, ((y3d) list.get(i4 - 1)).f41946a));
                } else {
                    int i6 = i5 + 1;
                    iArr2[i5] = fbc.U(y3d.c(0.0f, ((y3d) list.get(i4 - 1)).f41946a));
                    i5 += 2;
                    iArr2[i6] = fbc.U(y3d.c(0.0f, ((y3d) list.get(i4 + 1)).f41946a));
                }
                i5 = i3;
            } else {
                iArr2[i5] = fbc.U(j2);
                i5++;
            }
            i4++;
        }
        return iArr2;
    }

    public static final void i(ta5 ta5Var, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        ta5Var.getClass();
        fetVar2.g0(1968065626);
        int i3 = i2 | (fetVar2.g(ta5Var) ? 4 : 2);
        if (fetVar2.U(i3 & 1, (i3 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 1.0f), 32.0f);
            ((ijg) fetVar2.k(jjg.f16616a)).getClass();
            long j2 = ijg.i;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, j2, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
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
            String str = ta5Var.f33598a;
            mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 4.0f, 0.0f, 10);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE2 = mm40VarN.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarE2, staticColors.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            String str2 = ta5Var.b;
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(str2, mm40VarN2.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fa2(ta5Var, i2);
        }
    }

    public static final float[] i0(int i2, List list, List list2) {
        if (i2 == 0) {
            if (list != null) {
                return CollectionsKt.I0(list);
            }
            return null;
        }
        float[] fArr = new float[list2.size() + i2];
        fArr[0] = list != null ? ((Number) list.get(0)).floatValue() : 0.0f;
        int size = list2.size() - 1;
        int i3 = 1;
        for (int i4 = 1; i4 < size; i4++) {
            long j2 = ((y3d) list2.get(i4)).f41946a;
            float fFloatValue = list != null ? ((Number) list.get(i4)).floatValue() : i4 / (list2.size() - 1);
            int i5 = i3 + 1;
            fArr[i3] = fFloatValue;
            if (y3d.d(j2) == 0.0f) {
                i3 += 2;
                fArr[i5] = fFloatValue;
            } else {
                i3 = i5;
            }
        }
        fArr[i3] = list != null ? ((Number) list.get(list2.size() - 1)).floatValue() : 1.0f;
        return fArr;
    }

    public static final void j(mm40 mm40Var, flb flbVar, float f2, float f3, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(2071618664);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(flbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.d(f2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.d(f3) ? 2048 : 1024;
        }
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            mz3 mz3VarX = l7x.X(Integer.valueOf(flbVar.d), null, null, fetVar2, 0, 30);
            mm40 mm40VarH = o7k0.h(o7k0.d(mm40Var, 1.0f), f2 + f3);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarH);
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
            String str = flbVar.c;
            n0q n0qVar = o7k0.c;
            k7x.b(str, null, n0qVar, mz3VarX, mz3VarX, null, null, null, null, gqw0.f, gqw0.A, null, fetVar, 805306800, 6, 31200);
            fetVar2 = fetVar;
            StaticColors staticColors = StaticColors.INSTANCE;
            zq8.a(0, fetVar2, i120.P(n0qVar, yk5.n(q3d.j(new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m73getBlack400d7_KjU()), new y3d(staticColors.m78getBlack800d7_KjU())), 0.0f, 0.0f, 14), null, 6));
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new clb(mm40Var, flbVar, f2, f3, i2);
        }
    }

    public static int j0(androidx.media3.common.b bVar) {
        String strE0 = e0(bVar);
        if (Objects.equals(strE0, "video/avc")) {
            return 1;
        }
        return (Objects.equals(strE0, "video/hevc") || Objects.equals(strE0, "video/vvc")) ? 2 : 0;
    }

    public static final void k(ny6 ny6Var, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        ny6Var.getClass();
        fetVar.g0(823296177);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(jm40.b) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(ny6Var) ? 32 : 16;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar2 = fetVar;
            vbw0.h(null, u1c.M(-1148272926, new cq6(ny6Var, b2), fetVar), null, fetVar2, (i3 & 14) | 384, 10);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(ny6Var, i2);
        }
    }

    public static j6 k0(z55 z55Var) {
        z55Var.u();
        return new j6(z55Var.j(6), z55Var.j(6), z55Var.j(3) - 1);
    }

    public static final void l(mm40 mm40Var, ik7 ik7Var, fet fetVar, int i2) {
        ugd ugdVarM;
        fetVar.g0(-41878585);
        int i3 = i2 | 6 | (fetVar.g(ik7Var) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (ik7Var.c.isEmpty()) {
                fetVar.e0(-2062643265);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(-2064080053);
                ugdVarM = u1c.M(-81129105, new hk7(ik7Var, b2), fetVar);
                fetVar.r(false);
            }
            jm40 jm40Var = jm40.b;
            q(jm40Var, ik7Var, ugdVarM, fetVar, i3 & 126);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(mm40Var, ik7Var, i2, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    public static a950 l0(z55 z55Var, boolean z, int i2, a950 a950Var) {
        int[] iArr;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean zI;
        int iJ;
        int i6;
        int i7;
        int[] iArr2 = new int[6];
        if (!z) {
            if (a950Var != null) {
                int i8 = a950Var.f461a;
                zI = a950Var.b;
                iJ = a950Var.c;
                i6 = a950Var.d;
                iArr2 = a950Var.e;
                i3 = i8;
            } else {
                iArr = iArr2;
                i3 = 0;
                z2 = false;
                i4 = 0;
                i5 = 0;
            }
            int iJ2 = z55Var.j(8);
            i7 = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                if (z55Var.i()) {
                    i7 += 88;
                }
                if (z55Var.i()) {
                    i7 += 8;
                }
            }
            z55Var.v(i7);
            if (i2 > 0) {
                z55Var.v((8 - i2) * 2);
            }
            return new a950(i3, z2, i4, i5, iArr, iJ2);
        }
        int iJ3 = z55Var.j(2);
        zI = z55Var.i();
        iJ = z55Var.j(5);
        i6 = 0;
        for (int i10 = 0; i10 < 32; i10++) {
            if (z55Var.i()) {
                i6 |= 1 << i10;
            }
        }
        for (int i11 = 0; i11 < 6; i11++) {
            iArr2[i11] = z55Var.j(8);
        }
        i3 = iJ3;
        iArr = iArr2;
        z2 = zI;
        i4 = iJ;
        i5 = i6;
        int iJ4 = z55Var.j(8);
        i7 = 0;
        while (i9 < i2) {
            if (z55Var.i()) {
                i7 += 88;
            }
            if (z55Var.i()) {
                i7 += 8;
            }
        }
        z55Var.v(i7);
        if (i2 > 0) {
            z55Var.v((8 - i2) * 2);
        }
        return new a950(i3, z2, i4, i5, iArr, iJ4);
    }

    public static final void m(mm40 mm40Var, eoa eoaVar, Function1 function1, fet fetVar, int i2, int i3) {
        int i4;
        function1.getClass();
        fetVar.g0(-789664577);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(eoaVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                mm40Var = jm40.b;
            }
            if (eoaVar instanceof aoa) {
                fetVar.e0(-1361339618);
                eeq.m(mm40Var, (aoa) eoaVar, function1, fetVar, i4 & 1022);
                fetVar.r(false);
            } else {
                if (!(eoaVar instanceof doa)) {
                    throw b1j.f(1341557675, fetVar, false);
                }
                fetVar.e0(-1361137281);
                cjx.l(mm40Var, (doa) eoaVar, function1, fetVar, i4 & 1022);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var2, (Object) eoaVar, (Object) function1, i2, i3, (byte) 6);
        }
    }

    public static x860 m0(byte[] bArr, int i2, int i3) {
        byte b2;
        int i4 = i2 + 2;
        do {
            i3--;
            b2 = bArr[i3];
            if (b2 != 0) {
                break;
            }
        } while (i3 > i4);
        if (b2 == 0 || i3 <= i4) {
            return null;
        }
        z55 z55Var = new z55(bArr, i4, i3 + 1);
        while (z55Var.c(16)) {
            int iJ = z55Var.j(8);
            int i5 = 0;
            while (iJ == 255) {
                i5 += 255;
                iJ = z55Var.j(8);
            }
            int i6 = i5 + iJ;
            int iJ2 = z55Var.j(8);
            int i7 = 0;
            while (iJ2 == 255) {
                i7 += 255;
                iJ2 = z55Var.j(8);
            }
            int i8 = i7 + iJ2;
            if (i8 == 0 || !z55Var.c(i8)) {
                return null;
            }
            if (i6 == 176) {
                int iK = z55Var.k();
                boolean zI = z55Var.i();
                int iK2 = zI ? z55Var.k() : 0;
                int iK3 = z55Var.k();
                int iK4 = -1;
                for (int i9 = 0; i9 <= iK3; i9++) {
                    iK4 = z55Var.k();
                    z55Var.k();
                    int iJ3 = z55Var.j(6);
                    if (iJ3 == 63) {
                        return null;
                    }
                    z55Var.j(iJ3 == 0 ? Math.max(0, iK - 30) : Math.max(0, (iJ3 + iK) - 31));
                    if (zI) {
                        int iJ4 = z55Var.j(6);
                        if (iJ4 == 63) {
                            return null;
                        }
                        z55Var.j(iJ4 == 0 ? Math.max(0, iK2 - 30) : Math.max(0, (iJ4 + iK2) - 31));
                    }
                    if (z55Var.i()) {
                        z55Var.v(10);
                    }
                }
                return new x860(iK4, false);
            }
            z55Var.v(i8 * 8);
        }
        return null;
    }

    public static final void n(mm40 mm40Var, long j2, v2n v2nVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        pm80 pm80VarF;
        pm80 pm80VarF2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1849431346);
        int i3 = i2 | 6 | (fetVar2.f(j2) ? 32 : 16) | (fetVar2.g(v2nVar) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 120.0f), 104.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), j2, jd8.n), 4.0f);
            boolean z = ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new d8l0(function1, v2nVar, (byte) 1);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarJ, null, null, false, null, (Function0) objP, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            o0x o0xVar = v2nVar.b;
            Integer num = v2nVar.d;
            Object objA = o0xVar.a();
            if (num == null) {
                fetVar2.e0(1570066546);
                fetVar2.r(false);
                pm80VarF = null;
            } else {
                fetVar2.e0(1570066547);
                pm80VarF = a8k0.F(num.intValue(), 0, fetVar2);
                fetVar2.r(false);
            }
            if (num == null) {
                fetVar2.e0(1570148882);
                fetVar2.r(false);
                pm80VarF2 = null;
            } else {
                fetVar2.e0(1570148883);
                pm80VarF2 = a8k0.F(num.intValue(), 0, fetVar2);
                fetVar2.r(false);
            }
            pge pgeVar = gqw0.A;
            mm40 mm40VarS2 = o7k0.s(o7k0.e(jm40Var, 80.0f), 96.0f);
            zcl zclVar3 = qmk.g;
            k7x.b(objA, null, h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarS2), pm80VarF, pm80VarF2, null, null, null, null, null, pgeVar, null, fetVar2, 36912, 6, 27616);
            mm40 mm40VarE = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13).e(o7k0.c);
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
            v8q0.a(v2nVar.c, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, y9q0.a(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), 0L, 0L, null, null, null, 0L, null, null, 0, 0, qmk.C, null, null, 16646143), fetVar2, 0, 24960, 109562);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ds8((Object) mm40Var2, j2, (Object) v2nVar, (wdr) function1, i2, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:202:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b9  */
    public static c950 n0(byte[] bArr, int i2, int i3, dgu dguVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iK;
        int i8;
        int iK2;
        int i9;
        int i10;
        int iMax;
        int i11;
        int i12;
        int i13;
        int iF;
        int iG;
        int i14;
        zn00 zn00Var;
        j910 j910Var;
        j6 j6VarK0 = k0(new z55(bArr, i2, i3));
        z55 z55Var = new z55(bArr, i2 + 2, i3);
        int i15 = 4;
        z55Var.v(4);
        int iJ = z55Var.j(3);
        int i16 = j6VarK0.b;
        boolean z = i16 != 0 && iJ == 7;
        if (dguVar != null) {
            b4x b4xVar = (b4x) dguVar.f6058a;
            if (b4xVar.isEmpty()) {
                i4 = 0;
            } else {
                i4 = ((z850) b4xVar.get(Math.min(i16, b4xVar.size() - 1))).f43951a;
            }
        } else {
            i4 = 0;
        }
        a950 a950VarL0 = null;
        if (!z) {
            z55Var.u();
            a950VarL0 = l0(z55Var, true, iJ, null);
        } else if (dguVar != null) {
            zpu zpuVar = (zpu) dguVar.b;
            int[] iArr = (int[]) zpuVar.c;
            b4x b4xVar2 = (b4x) zpuVar.b;
            int i17 = iArr[i4];
            if (b4xVar2.size() > i17) {
                a950VarL0 = (a950) b4xVar2.get(i17);
            }
        }
        z55Var.k();
        if (z) {
            int iJ2 = z55Var.i() ? z55Var.j(8) : -1;
            if (dguVar == null || (j910Var = (j910) dguVar.c) == null) {
                iK = 0;
                iK2 = 0;
                i8 = 0;
                i10 = 0;
                i7 = 0;
                i9 = 0;
            } else {
                b4x b4xVar3 = (b4x) j910Var.b;
                if (iJ2 == -1) {
                    iJ2 = ((int[]) j910Var.c)[i4];
                }
                if (iJ2 == -1 || b4xVar3.size() <= iJ2) {
                    iK = 0;
                    iK2 = 0;
                    i8 = 0;
                    i10 = 0;
                    i7 = 0;
                    i9 = 0;
                } else {
                    b950 b950Var = (b950) b4xVar3.get(iJ2);
                    int i18 = b950Var.f2191a;
                    i8 = b950Var.d;
                    int i19 = b950Var.e;
                    iK = b950Var.b;
                    iK2 = b950Var.c;
                    i7 = i19;
                    i9 = i7;
                    i10 = i8;
                }
            }
        } else {
            int iK3 = z55Var.k();
            if (iK3 == 3) {
                z55Var.u();
            }
            int iK4 = z55Var.k();
            int iK5 = z55Var.k();
            if (z55Var.i()) {
                int iK6 = z55Var.k();
                int iK7 = z55Var.k();
                int iK8 = z55Var.k();
                int iK9 = z55Var.k();
                i5 = iK4 - ((iK6 + iK7) * ((iK3 == 1 || iK3 == 2) ? 2 : 1));
                i6 = iK5 - ((iK8 + iK9) * (iK3 == 1 ? 2 : 1));
            } else {
                i5 = iK4;
                i6 = iK5;
            }
            i7 = i6;
            iK = z55Var.k();
            i8 = i5;
            iK2 = z55Var.k();
            i9 = iK5;
            i10 = iK4;
        }
        int iK10 = z55Var.k();
        if (z) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i20 = z55Var.i() ? 0 : iJ; i20 <= iJ; i20++) {
                z55Var.k();
                iMax = Math.max(z55Var.k(), iMax);
                z55Var.k();
            }
        }
        z55Var.k();
        z55Var.k();
        z55Var.k();
        z55Var.k();
        z55Var.k();
        z55Var.k();
        if (z55Var.i()) {
            int i21 = 6;
            if (z ? z55Var.i() : false) {
                z55Var.v(6);
            } else if (z55Var.i()) {
                int i22 = 0;
                while (i22 < i15) {
                    int i23 = 0;
                    while (i23 < i21) {
                        if (z55Var.i()) {
                            int iMin = Math.min(64, 1 << ((i22 << 1) + 4));
                            if (i22 > 1) {
                                z55Var.m();
                            }
                            for (int i24 = 0; i24 < iMin; i24++) {
                                z55Var.m();
                            }
                        } else {
                            z55Var.k();
                        }
                        i23 += i22 == 3 ? 3 : 1;
                        i21 = 6;
                    }
                    i22++;
                    i15 = 4;
                    i21 = 6;
                }
            }
        }
        z55Var.v(2);
        if (z55Var.i()) {
            z55Var.v(8);
            z55Var.k();
            z55Var.k();
            z55Var.u();
        }
        int iK11 = z55Var.k();
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i25 = 0;
        int iK12 = -1;
        int i26 = -1;
        while (i25 < iK11) {
            if (i25 == 0 || !z55Var.i()) {
                int iK13 = z55Var.k();
                iK12 = z55Var.k();
                int[] iArr3 = new int[iK13];
                int i27 = 0;
                while (i27 < iK13) {
                    iArr3[i27] = (i27 > 0 ? iArr3[i27 - 1] : 0) - (z55Var.k() + 1);
                    z55Var.u();
                    i27++;
                }
                int[] iArr4 = new int[iK12];
                int i28 = 0;
                while (i28 < iK12) {
                    iArr4[i28] = z55Var.k() + 1 + (i28 > 0 ? iArr4[i28 - 1] : 0);
                    z55Var.u();
                    i28++;
                }
                i26 = iK13;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i29 = i26 + iK12;
                int iK14 = (1 - ((z55Var.i() ? 1 : 0) * 2)) * (z55Var.k() + 1);
                int i30 = i29 + 1;
                boolean[] zArr = new boolean[i30];
                for (int i31 = 0; i31 <= i29; i31++) {
                    if (z55Var.i()) {
                        zArr[i31] = true;
                    } else {
                        zArr[i31] = z55Var.i();
                    }
                }
                int[] iArr5 = new int[i30];
                int[] iArr6 = new int[i30];
                int i32 = 0;
                for (int i33 = iK12 - 1; i33 >= 0; i33--) {
                    int i34 = iArrCopyOf[i33] + iK14;
                    if (i34 < 0 && zArr[i26 + i33]) {
                        iArr5[i32] = i34;
                        i32++;
                    }
                }
                if (iK14 < 0 && zArr[i29]) {
                    iArr5[i32] = iK14;
                    i32++;
                }
                int i35 = i32;
                int[] iArr7 = iArr2;
                for (int i36 = 0; i36 < i26; i36++) {
                    int i37 = iArr7[i36] + iK14;
                    if (i37 < 0 && zArr[i36]) {
                        iArr5[i35] = i37;
                        i35++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i35);
                int i38 = 0;
                for (int i39 = i26 - 1; i39 >= 0; i39--) {
                    int i40 = iArr7[i39] + iK14;
                    if (i40 > 0 && zArr[i39]) {
                        iArr6[i38] = i40;
                        i38++;
                    }
                }
                if (iK14 > 0 && zArr[i29]) {
                    iArr6[i38] = iK14;
                    i38++;
                }
                int i41 = i35;
                int i42 = i38;
                for (int i43 = 0; i43 < iK12; i43++) {
                    int i44 = iArrCopyOf[i43] + iK14;
                    if (i44 > 0 && zArr[i26 + i43]) {
                        iArr6[i42] = i44;
                        i42++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i42);
                iK12 = i42;
                i26 = i41;
                iArr2 = iArrCopyOf2;
            }
            i25++;
            iK11 = iK11;
            i4 = i4;
        }
        int i45 = i4;
        if (z55Var.i()) {
            int iK15 = z55Var.k();
            for (int i46 = 0; i46 < iK15; i46++) {
                z55Var.v(iK10 + 5);
            }
        }
        z55Var.v(2);
        float f2 = 1.0f;
        if (z55Var.i()) {
            if (z55Var.i()) {
                int iJ3 = z55Var.j(8);
                if (iJ3 == 255) {
                    int iJ4 = z55Var.j(16);
                    int iJ5 = z55Var.j(16);
                    if (iJ4 != 0 && iJ5 != 0) {
                        f2 = iJ4 / iJ5;
                    }
                } else if (iJ3 < 17) {
                    f2 = k[iJ3];
                } else {
                    rw2.u(iJ3, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (z55Var.i()) {
                z55Var.u();
            }
            if (z55Var.i()) {
                z55Var.v(3);
                i14 = z55Var.i() ? 1 : 2;
                if (z55Var.i()) {
                    int iJ6 = z55Var.j(8);
                    int iJ7 = z55Var.j(8);
                    z55Var.v(8);
                    iF = c4d.f(iJ6);
                    iG = c4d.g(iJ7);
                } else {
                    iF = -1;
                    iG = -1;
                }
            } else if (dguVar == null || (zn00Var = (zn00) dguVar.d) == null) {
                iF = -1;
                iG = -1;
                i14 = -1;
            } else {
                b4x b4xVar4 = (b4x) zn00Var.f44650a;
                int i47 = ((int[]) zn00Var.b)[i45];
                if (b4xVar4.size() > i47) {
                    d950 d950Var = (d950) b4xVar4.get(i47);
                    int i48 = d950Var.f5684a;
                    int i49 = d950Var.b;
                    iG = d950Var.c;
                    iF = i48;
                    i14 = i49;
                } else {
                    iF = -1;
                    iG = -1;
                    i14 = -1;
                }
            }
            if (z55Var.i()) {
                z55Var.k();
                z55Var.k();
            }
            z55Var.u();
            if (z55Var.i()) {
                i7 *= 2;
            }
            i11 = iF;
            i13 = iG;
            i12 = i14;
        } else {
            i11 = -1;
            i12 = -1;
            i13 = -1;
        }
        return new c950(iJ, a950VarL0, iK, iK2, i8, i7, i10, i9, f2, iMax, i11, i12, i13);
    }

    public static final void o(mm40 mm40Var, flb flbVar, l7m0 l7m0Var, float f2, float f3, float f4, Function0 function0, fet fetVar, int i2) {
        flb flbVar2;
        mm40 mm40Var2;
        boolean z;
        Object objJ;
        boolean z2;
        fet fetVar2 = fetVar;
        flbVar.getClass();
        function0.getClass();
        fetVar2.g0(1081660104);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(flbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(l7m0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.d(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar2.d(f3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar2.d(f4) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar2.i(function0) ? 1048576 : 524288;
        }
        if (fetVar2.U(i3 & 1, (599187 & i3) != 599186)) {
            float fFloatValue = ((Number) l7m0Var.getValue()).floatValue();
            oms0 oms0VarZ = phu0.Z(l7m0Var.getValue(), null, fetVar2, 0, 2);
            p4 p4Var = oms0VarZ.f25519a;
            Object[] objArr = new Object[0];
            boolean z3 = (i3 & 896) == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new eka(l7m0Var, (byte) 8);
                fetVar2.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar2);
            lxs0 lxs0Var = hp4.l;
            if (oms0VarZ.h()) {
                z = false;
                objJ = vqd.j(fetVar2, 1666827533, false, p4Var);
            } else {
                fetVar2.e0(1666573488);
                boolean zG = fetVar2.g(oms0VarZ);
                objJ = fetVar2.P();
                if (zG || objJ == cl5Var) {
                    rfk0 rfk0VarJ = vdx.J();
                    Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                    rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                    try {
                        Object objY0 = p4Var.y0();
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        fetVar2.o0(objY0);
                        objJ = objY0;
                    } catch (Throwable th) {
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        throw th;
                    }
                }
                fetVar2.r(false);
                z = false;
            }
            float fFloatValue2 = ((Number) objJ).floatValue();
            fetVar2.e0(1481049515);
            ycl yclVarG = dw9.g(fetVar2, z, l7x.O(f2, f3, fFloatValue2));
            boolean zG2 = fetVar2.g(oms0VarZ);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = jgk0.b(new gb3(oms0VarZ, (byte) 28));
                fetVar2.o0(objP2);
            }
            float fFloatValue3 = ((Number) ((l7m0) objP2).getValue()).floatValue();
            fetVar2.e0(1481049515);
            ycl yclVarG2 = dw9.g(fetVar2, false, l7x.O(f2, f3, fFloatValue3));
            boolean zG3 = fetVar2.g(oms0VarZ);
            Object objP3 = fetVar2.P();
            if (zG3 || objP3 == cl5Var) {
                objP3 = jgk0.b(new gb3(oms0VarZ, (byte) 29));
                fetVar2.o0(objP3);
            }
            int i4 = i3;
            cms0 cms0VarE = phu0.E(oms0VarZ, yclVarG, yclVarG2, w6x.k((ams0) ((l7m0) objP3).getValue(), fetVar2, 938114916, false), lxs0Var, fetVar2, 0);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = lgb.K(o7k0.d(jm40Var, 1.0f));
            boolean zG4 = ((i4 & 458752) == 131072) | fetVar2.g(cms0VarE);
            Object objP4 = fetVar2.P();
            if (zG4 || objP4 == cl5Var) {
                objP4 = new dlb(cms0VarE, f4);
                fetVar2.o0(objP4);
            }
            tj30 tj30Var = (tj30) objP4;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
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
            jpm0.o(fetVar2, tj30Var, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarK0 = mrv.k0(jm40Var, kwq0.f19015a);
            boolean zD = fetVar2.d(fFloatValue);
            Object objP5 = fetVar2.P();
            if (zD || objP5 == cl5Var) {
                objP5 = new f54(fFloatValue, (byte) 2);
                fetVar2.o0(objP5);
            }
            int i5 = i4 >> 6;
            j(i4w0.T(mm40VarK0, (Function1) objP5), flbVar, f2, f4, fetVar2, (i5 & 7168) | (i4 & 112) | ((i4 >> 3) & 896));
            mm40 mm40VarE = mrv.k0(jm40Var, kwq0.b).e(o7k0.c);
            boolean zD2 = fetVar2.d(fFloatValue);
            Object objP6 = fetVar2.P();
            if (zD2 || objP6 == cl5Var) {
                objP6 = new f54(fFloatValue, (byte) 3);
                fetVar2.o0(objP6);
            }
            zq8.a(0, fetVar2, i120.Q(i4w0.T(mm40VarE, (Function1) objP6), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n));
            J(mrv.k0(jm40Var, kwq0.c), flbVar.f9729a, fFloatValue, l7m0VarY, function0, fetVar2, (i5 & 57344) | 6);
            if (fFloatValue < 1.0f) {
                fetVar2.e0(456964781);
                mm40 mm40VarK1 = mrv.k0(jm40Var, kwq0.d);
                boolean zD3 = fetVar2.d(fFloatValue);
                Object objP7 = fetVar2.P();
                if (zD3 || objP7 == cl5Var) {
                    objP7 = new f54(fFloatValue, (byte) 4);
                    fetVar2.o0(objP7);
                }
                mm40 mm40VarT = i4w0.T(mm40VarK1, (Function1) objP7);
                zcl zclVar = qmk.f28987a;
                flbVar2 = flbVar;
                mm40 mm40VarN = s5x0.N(o7k0.e(mm40VarT, 180.0f), 0.0f, 0.0f, 0.0f, f4, 7);
                tj30 tj30VarC = zq8.c(gqw0.h, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
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
                xbc.m(s5x0.N(jm40Var, xfn.a(fetVar2).c, 0.0f, xfn.a(fetVar2).c, 4.0f, 2), flbVar2.b, true, null, fetVar2, 3456, 16);
                fetVar2 = fetVar2;
                z2 = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                flbVar2 = flbVar;
                fetVar2 = fetVar2;
                z2 = true;
                fetVar2.e0(457846979);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
            mm40Var2 = jm40Var;
        } else {
            flbVar2 = flbVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new db3(mm40Var2, flbVar2, l7m0Var, f2, f3, f4, function0, i2, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:473:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    public static dgu o0(byte[] bArr, int i2, int i3) {
        int[] iArr;
        zn00 zn00Var;
        int iJ;
        int iJ2;
        int iJ3;
        int i4;
        rcf0 rcf0Var;
        boolean[][] zArr;
        int i5;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        int i6;
        boolean zI;
        int i7;
        int i8;
        int i9;
        boolean zI2;
        boolean zI3;
        int iK;
        int i10;
        int i11;
        int i12;
        boolean z;
        boolean z2;
        z55 z55Var = new z55(bArr, i2, i3);
        k0(z55Var);
        z55Var.v(4);
        boolean zI4 = z55Var.i();
        boolean zI5 = z55Var.i();
        int iJ4 = z55Var.j(6);
        int i13 = iJ4 + 1;
        int iJ5 = z55Var.j(3);
        z55Var.v(17);
        a950 a950VarL0 = l0(z55Var, true, iJ5, null);
        for (int i14 = z55Var.i() ? 0 : iJ5; i14 <= iJ5; i14++) {
            z55Var.k();
            z55Var.k();
            z55Var.k();
        }
        int iJ6 = z55Var.j(6);
        int iK2 = z55Var.k() + 1;
        int i15 = 6;
        zpu zpuVar = new zpu(b4x.t(a950VarL0), new int[1]);
        boolean z3 = i13 >= 2 && iK2 >= 2;
        boolean z4 = zI4 && zI5;
        int i16 = iJ6 + 1;
        boolean z5 = i16 >= i13;
        if (!z3 || !z4 || !z5) {
            return new dgu((rcf0) null, zpuVar, (j910) null, (zn00) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iK2, i16);
        int i17 = 1;
        int[] iArr5 = new int[iK2];
        int[] iArr6 = new int[iK2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i18 = 1; i18 < iK2; i18++) {
            int i19 = 0;
            for (int i20 = 0; i20 <= iJ6; i20++) {
                if (z55Var.i()) {
                    iArr4[i18][i19] = i20;
                    iArr6[i18] = i20;
                    i19++;
                }
                iArr5[i18] = i19;
            }
        }
        if (z55Var.i()) {
            z55Var.v(64);
            if (z55Var.i()) {
                z55Var.k();
            }
            int iK3 = z55Var.k();
            int i21 = 0;
            while (i21 < iK3) {
                z55Var.k();
                if (i21 == 0 || z55Var.i()) {
                    boolean zI6 = z55Var.i();
                    boolean zI7 = z55Var.i();
                    z2 = zI6;
                    z = zI7;
                    if (zI6 || zI7) {
                        zI = z55Var.i();
                        if (zI) {
                            z55Var.v(19);
                        }
                        z55Var.v(8);
                        if (zI) {
                            z55Var.v(4);
                        }
                        z55Var.v(15);
                        i8 = zI6;
                        i7 = zI7;
                    }
                    i9 = 0;
                    while (i9 <= iJ5) {
                        zI2 = z55Var.i();
                        if (!zI2) {
                            zI2 = z55Var.i();
                        }
                        if (zI2) {
                            z55Var.k();
                            zI3 = false;
                        } else {
                            zI3 = z55Var.i();
                        }
                        if (zI3) {
                            iK = 0;
                        } else {
                            iK = z55Var.k();
                        }
                        int[][] iArr7 = iArr4;
                        i10 = i8 + i7;
                        int[] iArr8 = iArr6;
                        i11 = 0;
                        while (i11 < i10) {
                            int i22 = i10;
                            for (i12 = 0; i12 <= iK; i12++) {
                                z55Var.k();
                                z55Var.k();
                                if (zI) {
                                    z55Var.k();
                                    z55Var.k();
                                }
                                z55Var.u();
                            }
                            i11++;
                            i10 = i22;
                        }
                        i9++;
                        i21 = i21;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i21++;
                } else {
                    z2 = false;
                    z = false;
                }
                zI = false;
                i8 = z2;
                i7 = z;
                i9 = 0;
                while (i9 <= iJ5) {
                    zI2 = z55Var.i();
                    if (!zI2) {
                        zI2 = z55Var.i();
                    }
                    if (zI2) {
                        z55Var.k();
                        zI3 = false;
                    } else {
                        zI3 = z55Var.i();
                    }
                    if (zI3) {
                        iK = z55Var.k();
                    } else {
                        iK = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i10 = i8 + i7;
                    int[] iArr10 = iArr6;
                    i11 = 0;
                    while (i11 < i10) {
                        int i23 = i10;
                        while (i12 <= iK) {
                            z55Var.k();
                            z55Var.k();
                            if (zI) {
                                z55Var.k();
                                z55Var.k();
                            }
                            z55Var.u();
                        }
                        i11++;
                        i10 = i23;
                    }
                    i9++;
                    i21 = i21;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i21++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!z55Var.i()) {
            return new dgu((rcf0) null, zpuVar, (j910) null, (zn00) null);
        }
        int i24 = z55Var.e;
        if (i24 > 0) {
            z55Var.v(8 - i24);
        }
        a950 a950VarL1 = l0(z55Var, false, iJ5, a950VarL0);
        boolean zI8 = z55Var.i();
        boolean[] zArr3 = new boolean[16];
        int i25 = 0;
        for (int i26 = 0; i26 < 16; i26++) {
            boolean zI9 = z55Var.i();
            zArr3[i26] = zI9;
            if (zI9) {
                i25++;
            }
        }
        if (i25 == 0 || !zArr3[1]) {
            return new dgu((rcf0) null, zpuVar, (j910) null, (zn00) null);
        }
        int[] iArr13 = new int[i25];
        for (int i27 = 0; i27 < i25 - (zI8 ? 1 : 0); i27++) {
            iArr13[i27] = z55Var.j(3);
        }
        int[] iArr14 = new int[i25 + 1];
        if (zI8) {
            int i28 = 1;
            while (i28 < i25) {
                int[] iArr15 = iArr14;
                for (int i29 = 0; i29 < i28; i29++) {
                    iArr15[i28] = iArr13[i29] + 1 + iArr15[i28];
                }
                i28++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i25] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i13, i25);
        int[] iArr17 = new int[i13];
        iArr17[0] = 0;
        boolean zI10 = z55Var.i();
        int i30 = 1;
        while (i30 < i13) {
            if (zI10) {
                i6 = i30;
                iArr17[i6] = z55Var.j(i15);
            } else {
                i6 = i30;
                iArr17[i6] = i6;
            }
            if (zI8) {
                int i31 = 0;
                while (i31 < i25) {
                    int i32 = i31 + 1;
                    iArr16[i6][i31] = (iArr17[i6] & ((1 << iArr[i32]) - 1)) >> iArr[i31];
                    i31 = i32;
                }
            } else {
                int i33 = 0;
                while (i33 < i25) {
                    int i34 = i33;
                    iArr16[i6][i34] = z55Var.j(iArr13[i33] + 1);
                    i33 = i34 + 1;
                }
            }
            i30 = i6 + 1;
            i15 = 6;
        }
        int[] iArr18 = new int[i16];
        int i35 = 1;
        int i36 = 0;
        while (i36 < i13) {
            iArr18[iArr17[i36]] = -1;
            int[] iArr19 = iArr18;
            int i37 = 0;
            int i38 = 0;
            while (i37 < 16) {
                if (zArr3[i37]) {
                    if (i37 == i17) {
                        iArr19[iArr17[i36]] = iArr16[i36][i38];
                    }
                    i38++;
                }
                i37++;
                i17 = 1;
            }
            if (i36 > 0) {
                int i39 = 0;
                while (true) {
                    if (i39 >= i36) {
                        i35++;
                        break;
                    }
                    int i40 = i39;
                    if (iArr19[iArr17[i36]] == iArr19[iArr17[i39]]) {
                        break;
                    }
                    i39 = i40 + 1;
                }
            }
            i36++;
            iArr18 = iArr19;
            i17 = 1;
        }
        int[] iArr20 = iArr18;
        int iJ7 = z55Var.j(4);
        if (i35 < 2 || iJ7 == 0) {
            return new dgu((rcf0) null, zpuVar, (j910) null, (zn00) null);
        }
        int[] iArr21 = new int[i35];
        for (int i41 = 0; i41 < i35; i41++) {
            iArr21[i41] = z55Var.j(iJ7);
        }
        int[] iArr22 = new int[i16];
        for (int i42 = 0; i42 < i13; i42++) {
            iArr22[Math.min(iArr17[i42], iJ6)] = i42;
        }
        u3x u3xVarL = b4x.l();
        int i43 = 0;
        while (i43 <= iJ6) {
            int[] iArr23 = iArr22;
            int i44 = i35;
            int iMin = Math.min(iArr20[i43], i44 - 1);
            u3xVarL.b(new z850(iArr23[i43], iMin >= 0 ? iArr21[iMin] : -1));
            i43++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i35 = i44;
        }
        int[] iArr24 = iArr17;
        rcf0 rcf0VarG = u3xVarL.g();
        if (((z850) rcf0VarG.get(0)).b == -1) {
            return new dgu((rcf0) null, zpuVar, (j910) null, (zn00) null);
        }
        int i45 = 1;
        while (true) {
            if (i45 > iJ6) {
                i45 = -1;
                break;
            }
            if (((z850) rcf0VarG.get(i45)).b != -1) {
                break;
            }
            i45++;
        }
        if (i45 == -1) {
            return new dgu((rcf0) null, zpuVar, (j910) null, (zn00) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i13, i13);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i13, i13);
        for (int i46 = 1; i46 < i13; i46++) {
            for (int i47 = 0; i47 < i46; i47++) {
                boolean[] zArr6 = zArr4[i46];
                boolean[] zArr7 = zArr5[i46];
                boolean zI11 = z55Var.i();
                zArr7[i47] = zI11;
                zArr6[i47] = zI11;
            }
        }
        for (int i48 = 1; i48 < i13; i48++) {
            int i49 = 0;
            while (i49 < iJ4) {
                boolean[][] zArr8 = zArr4;
                for (int i50 = 0; i50 < i48; i50++) {
                    boolean[] zArr9 = zArr5[i48];
                    if (zArr9[i50] && zArr5[i50][i49]) {
                        zArr9[i49] = true;
                        break;
                    }
                }
                i49++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i16];
        for (int i51 = 0; i51 < i13; i51++) {
            int i52 = 0;
            for (int i53 = 0; i53 < i51; i53++) {
                i52 += zArr10[i51][i53] ? 1 : 0;
            }
            iArr25[iArr24[i51]] = i52;
        }
        int i54 = 0;
        for (int i55 = 0; i55 < i13; i55++) {
            if (iArr25[iArr24[i55]] == 0) {
                i54++;
            }
        }
        if (i54 > 1) {
            return new dgu((rcf0) null, zpuVar, (j910) null, (zn00) null);
        }
        int[] iArr26 = new int[i13];
        int[] iArr27 = new int[iK2];
        if (z55Var.i()) {
            int i56 = 0;
            while (i56 < i13) {
                int i57 = i56;
                iArr26[i57] = z55Var.j(3);
                i56 = i57 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i13, iJ5);
        }
        int i58 = 0;
        while (i58 < iK2) {
            int i59 = i58;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int iMax = 0;
            for (int i60 = 0; i60 < iArr5[i59]; i60++) {
                iMax = Math.max(iMax, iArr28[((z850) rcf0VarG.get(iArr11[i59][i60])).f43951a]);
            }
            iArr27[i59] = iMax + 1;
            i58 = i59 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (z55Var.i()) {
            int i61 = 0;
            while (i61 < iJ4) {
                int i62 = i61 + 1;
                int i63 = i62;
                while (i63 < i13) {
                    if (zArr10[i63][i61]) {
                        z55Var.v(3);
                    }
                    i63++;
                    iJ4 = iJ4;
                }
                i61 = i62;
            }
        }
        z55Var.u();
        int iK4 = z55Var.k() + 1;
        u3x u3xVarL2 = b4x.l();
        u3xVarL2.b(a950VarL0);
        if (iK4 > 1) {
            u3xVarL2.b(a950VarL1);
            for (int i64 = 2; i64 < iK4; i64++) {
                a950VarL1 = l0(z55Var, z55Var.i(), iJ5, a950VarL1);
                u3xVarL2.b(a950VarL1);
            }
        }
        rcf0 rcf0VarG2 = u3xVarL2.g();
        int iK5 = z55Var.k() + iK2;
        if (iK5 > iK2) {
            return new dgu((rcf0) null, zpuVar, (j910) null, (zn00) null);
        }
        int iJ8 = z55Var.j(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iK5, i16);
        int[] iArr29 = new int[iK5];
        int i65 = 0;
        int[] iArr30 = new int[iK5];
        int i66 = 0;
        while (i66 < iK2) {
            iArr29[i66] = i65;
            iArr30[i66] = iArr12[i66];
            if (iJ8 == 0) {
                i5 = i66;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                Arrays.fill(zArr13[i5], i65, iArr5[i5], true);
                iArr2[i5] = iArr5[i5];
            } else {
                i5 = i66;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                if (iJ8 == 1) {
                    int i67 = iArr12[i5];
                    for (int i68 = 0; i68 < iArr5[i5]; i68++) {
                        zArr2[i5][i68] = iArr11[i5][i68] == i67;
                    }
                    iArr2[i5] = 1;
                } else {
                    i65 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i66 = i5 + 1;
                zArr13 = zArr2;
                iArr29 = iArr2;
                iArr27 = iArr3;
            }
            i65 = 0;
            i66 = i5 + 1;
            zArr13 = zArr2;
            iArr29 = iArr2;
            iArr27 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i16];
        int i69 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i16;
        iArr34[i65] = iK5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i70 = 1;
        int i71 = 0;
        while (i70 < iK5) {
            if (iJ8 == i69) {
                for (int i72 = 0; i72 < iArr5[i70]; i72++) {
                    zArr14[i70][i72] = z55Var.i();
                    int i73 = iArr31[i70];
                    boolean z6 = zArr14[i70][i72];
                    iArr31[i70] = i73 + (z6 ? 1 : 0);
                    if (z6) {
                        iArr30[i70] = iArr11[i70][i72];
                    }
                }
            }
            if (i71 == 0) {
                i4 = 0;
                if (iArr11[i70][0] == 0 && zArr14[i70][0]) {
                    for (int i74 = 1; i74 < iArr5[i70]; i74++) {
                        if (iArr11[i70][i74] == i45 && zArr14[i70][i45]) {
                            i71 = i70;
                        }
                    }
                }
            } else {
                i4 = 0;
            }
            int i75 = i4;
            while (i75 < iArr5[i70]) {
                if (iK4 > 1) {
                    zArr15[i70][i75] = zArr14[i70][i75];
                    rcf0Var = rcf0VarG2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iC = sbl.c(iK4);
                    if (!zArr[i70][i75]) {
                        int i76 = ((z850) rcf0VarG.get(iArr11[i70][i75])).f43951a;
                        int i77 = i4;
                        while (i77 < i75) {
                            int i78 = i77;
                            if (zArr12[i76][((z850) rcf0VarG.get(iArr11[i70][i78])).f43951a]) {
                                zArr[i70][i75] = true;
                                break;
                            }
                            i77 = i78 + 1;
                        }
                    }
                    if (zArr[i70][i75]) {
                        if (i71 <= 0 || i70 != i71) {
                            z55Var.v(iC);
                        } else {
                            iArr33[i75] = z55Var.j(iC);
                        }
                    }
                } else {
                    rcf0Var = rcf0VarG2;
                    zArr = zArr15;
                }
                i75++;
                rcf0VarG2 = rcf0Var;
                zArr15 = zArr;
            }
            rcf0 rcf0Var2 = rcf0VarG2;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i70] == 1 && iArr25[iArr30[i70]] > 0) {
                z55Var.u();
            }
            i70++;
            rcf0VarG2 = rcf0Var2;
            zArr15 = zArr16;
            i69 = 2;
        }
        rcf0 rcf0Var3 = rcf0VarG2;
        boolean[][] zArr17 = zArr15;
        if (i71 == 0) {
            return new dgu((rcf0) null, zpuVar, (j910) null, (zn00) null);
        }
        int iK6 = z55Var.k();
        int i79 = iK6 + 1;
        u3x u3xVarM = b4x.m(i79);
        int[] iArr35 = new int[i13];
        for (int i80 = 0; i80 < i79; i80++) {
            int iJ9 = z55Var.j(16);
            int iJ10 = z55Var.j(16);
            if (z55Var.i()) {
                iJ = z55Var.j(2);
                if (iJ == 3) {
                    z55Var.u();
                }
                iJ2 = z55Var.j(4);
                iJ3 = z55Var.j(4);
            } else {
                iJ = 0;
                iJ2 = 0;
                iJ3 = 0;
            }
            if (z55Var.i()) {
                int iK7 = z55Var.k();
                int iK8 = z55Var.k();
                int iK9 = z55Var.k();
                int iK10 = z55Var.k();
                iJ9 -= (iK7 + iK8) * ((iJ == 1 || iJ == 2) ? 2 : 1);
                iJ10 -= (iK9 + iK10) * (iJ == 1 ? 2 : 1);
            }
            u3xVarM.b(new b950(iJ, iJ2, iJ3, iJ9, iJ10));
        }
        if (i79 <= 1 || !z55Var.i()) {
            for (int i81 = 1; i81 < i13; i81++) {
                iArr35[i81] = Math.min(i81, iK6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iC2 = sbl.c(i79);
            for (int i82 = 1; i82 < i13; i82++) {
                iArr35[i82] = z55Var.j(iC2);
            }
        }
        j910 j910Var = new j910(u3xVarM.g(), iArr35);
        z55Var.v(2);
        for (int i83 = 1; i83 < i13; i83++) {
            if (iArr25[iArr24[i83]] == 0) {
                z55Var.u();
            }
        }
        for (int i84 = 1; i84 < iK5; i84++) {
            boolean zI12 = z55Var.i();
            int i85 = 0;
            while (i85 < iArr32[i84]) {
                if ((i85 <= 0 || !zI12) ? i85 == 0 : z55Var.i()) {
                    for (int i86 = 0; i86 < iArr5[i84]; i86++) {
                        if (zArr17[i84][i86]) {
                            z55Var.k();
                        }
                    }
                    z55Var.k();
                    z55Var.k();
                }
                i85++;
            }
        }
        int iK11 = z55Var.k() + 2;
        if (z55Var.i()) {
            z55Var.v(iK11);
        } else {
            for (int i87 = 1; i87 < i13; i87++) {
                for (int i88 = 0; i88 < i87; i88++) {
                    if (zArr10[i87][i88]) {
                        z55Var.v(iK11);
                    }
                }
            }
        }
        int iK12 = z55Var.k();
        for (int i89 = 1; i89 <= iK12; i89++) {
            z55Var.v(8);
        }
        if (z55Var.i()) {
            int i90 = z55Var.e;
            if (i90 > 0) {
                z55Var.v(8 - i90);
            }
            if (!z55Var.i() ? z55Var.i() : true) {
                z55Var.u();
            }
            boolean zI13 = z55Var.i();
            boolean zI14 = z55Var.i();
            if (zI13 || zI14) {
                for (int i91 = 0; i91 < iK2; i91++) {
                    for (int i92 = 0; i92 < iArr32[i91]; i92++) {
                        boolean zI15 = zI13 ? z55Var.i() : false;
                        boolean zI16 = zI14 ? z55Var.i() : false;
                        if (zI15) {
                            z55Var.v(32);
                        }
                        if (zI16) {
                            z55Var.v(18);
                        }
                    }
                }
            }
            boolean zI17 = z55Var.i();
            int iJ11 = zI17 ? z55Var.j(4) + 1 : i13;
            u3x u3xVarM2 = b4x.m(iJ11);
            int[] iArr36 = new int[i13];
            for (int i93 = 0; i93 < iJ11; i93++) {
                z55Var.v(3);
                int i94 = z55Var.i() ? 1 : 2;
                int iF = c4d.f(z55Var.j(8));
                int iG = c4d.g(z55Var.j(8));
                z55Var.v(8);
                u3xVarM2.b(new d950(iF, i94, iG));
            }
            if (zI17 && iJ11 > 1) {
                for (int i95 = 0; i95 < i13; i95++) {
                    iArr36[i95] = z55Var.j(4);
                }
            }
            rcf0 rcf0VarG3 = u3xVarM2.g();
            zn00Var = new zn00();
            zn00Var.f44650a = b4x.o(rcf0VarG3);
            zn00Var.b = iArr36;
        } else {
            zn00Var = null;
        }
        return new dgu(rcf0VarG, new zpu(rcf0Var3, iArr33), j910Var, zn00Var);
    }

    public static final void p(l7m0 l7m0Var, g5h g5hVar, boolean z, Function1 function1, fet fetVar, int i2) {
        l7m0 l7m0Var2;
        int i3;
        g5h g5hVar2;
        fetVar.g0(1760239197);
        if ((i2 & 6) == 0) {
            l7m0Var2 = l7m0Var;
            i3 = (fetVar.g(l7m0Var2) ? 4 : 2) | i2;
        } else {
            l7m0Var2 = l7m0Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(g5hVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
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
            g5hVar2 = g5hVar;
            if (g5hVar2 == g5h.EVENT_FOCUS) {
                fetVar.e0(682597717);
                long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
                zcl zclVar = z ? qmk.f28987a : qmk.l;
                zcl zclVar2 = z ? qmk.f28987a : qmk.l;
                zcl zclVar3 = qmk.f28987a;
                zq8.a(0, fetVar, i120.Q(n0qVar, background, new ugg0(zclVar, zclVar2, zclVar3, zclVar3)));
                fetVar.r(false);
            } else {
                fetVar.e0(683160863);
                fetVar.r(false);
            }
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7);
            mdm mdmVar = (mdm) l7m0Var2.getValue();
            boolean z2 = (i3 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new afd(function1, (byte) 19);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            fetVar.r(true);
        } else {
            g5hVar2 = g5hVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xjg(l7m0Var2, g5hVar2, z, function1, i2, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ae A[PHI: r19
  0x01ae: PHI (r19v6 float) = (r19v3 float), (r19v9 float), (r19v3 float), (r19v3 float), (r19v10 float) binds: [B:94:0x0190, B:104:0x01b5, B:98:0x01a6, B:99:0x01a8, B:100:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:122:0x0208  */
    /* JADX WARN: Code duplicated, block: B:125:0x0214  */
    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0228  */
    /* JADX WARN: Code duplicated, block: B:134:0x022f  */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0261  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    public static f950 p0(byte[] bArr, int i2, int i3) {
        int iK;
        int iK2;
        int i4;
        boolean z;
        int i5;
        int iK3;
        boolean z2;
        boolean zI;
        int i6;
        int i7;
        int i8;
        int iK4;
        int iF;
        float f2;
        int i9;
        int i10;
        int i11;
        float f3;
        int i12;
        int i13;
        int iG;
        boolean zI2;
        boolean zI3;
        int iJ;
        int iJ2;
        int iJ3;
        int i14;
        int i15;
        z55 z55Var = new z55(bArr, i2 + 1, i3);
        int iJ4 = z55Var.j(8);
        int iJ5 = z55Var.j(8);
        int iJ6 = z55Var.j(8);
        int iK5 = z55Var.k();
        if (iJ4 == 100 || iJ4 == 110 || iJ4 == 122 || iJ4 == 244 || iJ4 == 44 || iJ4 == 83 || iJ4 == 86 || iJ4 == 118 || iJ4 == 128 || iJ4 == 138) {
            iK = z55Var.k();
            boolean zI4 = iK == 3 ? z55Var.i() : false;
            int iK6 = z55Var.k();
            iK2 = z55Var.k();
            z55Var.u();
            if (z55Var.i()) {
                int i16 = iK != 3 ? 8 : 12;
                i4 = 16;
                int i17 = 0;
                while (i17 < i16) {
                    if (z55Var.i()) {
                        int i18 = i17 < 6 ? 16 : 64;
                        int iM = 8;
                        int i19 = 8;
                        for (int i20 = 0; i20 < i18; i20++) {
                            if (iM != 0) {
                                iM = ((z55Var.m() + i19) + 256) % 256;
                            }
                            if (iM != 0) {
                                i19 = iM;
                            }
                        }
                    }
                    i17++;
                }
            } else {
                i4 = 16;
            }
            z = zI4;
            i5 = iK6;
        } else {
            iK = 1;
            i4 = 16;
            i5 = 0;
            z = false;
            iK2 = 0;
        }
        int iK7 = z55Var.k() + 4;
        int iK8 = z55Var.k();
        if (iK8 != 0) {
            if (iK8 == 1) {
                boolean zI5 = z55Var.i();
                z55Var.m();
                z55Var.m();
                iJ4 = iJ4;
                long jK = z55Var.k();
                iK8 = iK8;
                for (int i21 = 0; i21 < jK; i21++) {
                    z55Var.k();
                }
                iK2 = iK2;
                z2 = zI5;
                iK3 = 0;
            } else {
                iK3 = 0;
            }
            z55Var.k();
            z55Var.u();
            int iK9 = z55Var.k() + 1;
            int iK10 = z55Var.k() + 1;
            zI = z55Var.i();
            i6 = 2 - (zI ? 1 : 0);
            int i22 = iK10 * i6;
            if (!zI) {
                z55Var.u();
            }
            z55Var.u();
            i7 = iK9 * 16;
            i8 = i22 * 16;
            if (z55Var.i()) {
                int iK11 = z55Var.k();
                int iK12 = z55Var.k();
                int iK13 = z55Var.k();
                int iK14 = z55Var.k();
                if (iK == 0) {
                    i14 = 1;
                } else {
                    if (iK == 3) {
                        i14 = 1;
                    } else {
                        i14 = 2;
                    }
                    if (iK == 1) {
                        i15 = 2;
                    } else {
                        i15 = 1;
                    }
                    i6 *= i15;
                }
                i7 -= (iK11 + iK12) * i14;
                i8 -= (iK13 + iK14) * i6;
            }
            int i23 = i8;
            int i24 = i7;
            int i25 = iJ4;
            iK4 = ((i25 != 44 || i25 == 86 || i25 == 100 || i25 == 110 || i25 == 122 || i25 == 244) && (iJ5 & 16) != 0) ? 0 : i4;
            iF = -1;
            f2 = 1.0f;
            if (z55Var.i()) {
                if (!z55Var.i()) {
                    iJ = z55Var.j(8);
                    if (iJ == 255) {
                        int i26 = i4;
                        iJ2 = z55Var.j(i26);
                        iJ3 = z55Var.j(i26);
                        if (iJ2 != 0 && iJ3 != 0) {
                            f2 = iJ2 / iJ3;
                        }
                    } else if (iJ < 17) {
                        f2 = k[iJ];
                    } else {
                        rw2.u(iJ, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (z55Var.i()) {
                    z55Var.u();
                }
                if (z55Var.i()) {
                    z55Var.v(3);
                    if (z55Var.i()) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    if (z55Var.i()) {
                        int iJ7 = z55Var.j(8);
                        int iJ8 = z55Var.j(8);
                        z55Var.v(8);
                        iF = c4d.f(iJ7);
                        iG = c4d.g(iJ8);
                    } else {
                        iG = -1;
                    }
                } else {
                    i13 = -1;
                    iG = -1;
                }
                if (z55Var.i()) {
                    z55Var.k();
                    z55Var.k();
                }
                if (z55Var.i()) {
                    z55Var.v(65);
                }
                zI2 = z55Var.i();
                if (zI2) {
                    r0(z55Var);
                }
                zI3 = z55Var.i();
                if (zI3) {
                    r0(z55Var);
                }
                if (zI2 || zI3) {
                    z55Var.u();
                }
                z55Var.u();
                if (z55Var.i()) {
                    z55Var.u();
                    z55Var.k();
                    z55Var.k();
                    z55Var.k();
                    z55Var.k();
                    iK4 = z55Var.k();
                    z55Var.k();
                }
                f3 = f2;
                i12 = iF;
                i10 = i13;
                i11 = iG;
                i9 = iK4;
            } else {
                iK7 = iK7;
                i9 = iK4;
                i10 = -1;
                i11 = -1;
                f3 = 1.0f;
                i12 = -1;
            }
            return new f950(i25, iJ5, iJ6, iK5, i24, i23, f3, i5, iK2, z, zI, iK7, iK8, iK3, z2, i12, i10, i11, i9);
        }
        iK3 = z55Var.k() + 4;
        z2 = false;
        z55Var.k();
        z55Var.u();
        int iK15 = z55Var.k() + 1;
        int iK16 = z55Var.k() + 1;
        zI = z55Var.i();
        i6 = 2 - (zI ? 1 : 0);
        int i27 = iK16 * i6;
        if (!zI) {
            z55Var.u();
        }
        z55Var.u();
        i7 = iK15 * 16;
        i8 = i27 * 16;
        if (z55Var.i()) {
            int iK17 = z55Var.k();
            int iK18 = z55Var.k();
            int iK19 = z55Var.k();
            int iK110 = z55Var.k();
            if (iK == 0) {
                i14 = 1;
            } else {
                if (iK == 3) {
                    i14 = 1;
                } else {
                    i14 = 2;
                }
                if (iK == 1) {
                    i15 = 2;
                } else {
                    i15 = 1;
                }
                i6 *= i15;
            }
            i7 -= (iK17 + iK18) * i14;
            i8 -= (iK19 + iK110) * i6;
        }
        int i28 = i8;
        int i29 = i7;
        int i210 = iJ4;
        if (i210 != 44) {
        }
        iF = -1;
        f2 = 1.0f;
        if (z55Var.i()) {
            if (!z55Var.i()) {
                iJ = z55Var.j(8);
                if (iJ == 255) {
                    int i211 = i4;
                    iJ2 = z55Var.j(i211);
                    iJ3 = z55Var.j(i211);
                    if (iJ2 != 0) {
                        f2 = iJ2 / iJ3;
                    }
                } else if (iJ < 17) {
                    f2 = k[iJ];
                } else {
                    rw2.u(iJ, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (z55Var.i()) {
                z55Var.u();
            }
            if (z55Var.i()) {
                z55Var.v(3);
                if (z55Var.i()) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                if (z55Var.i()) {
                    int iJ9 = z55Var.j(8);
                    int iJ10 = z55Var.j(8);
                    z55Var.v(8);
                    iF = c4d.f(iJ9);
                    iG = c4d.g(iJ10);
                } else {
                    iG = -1;
                }
            } else {
                i13 = -1;
                iG = -1;
            }
            if (z55Var.i()) {
                z55Var.k();
                z55Var.k();
            }
            if (z55Var.i()) {
                z55Var.v(65);
            }
            zI2 = z55Var.i();
            if (zI2) {
                r0(z55Var);
            }
            zI3 = z55Var.i();
            if (zI3) {
                r0(z55Var);
            }
            if (zI2) {
                z55Var.u();
            } else {
                z55Var.u();
            }
            z55Var.u();
            if (z55Var.i()) {
                z55Var.u();
                z55Var.k();
                z55Var.k();
                z55Var.k();
                z55Var.k();
                iK4 = z55Var.k();
                z55Var.k();
            }
            f3 = f2;
            i12 = iF;
            i10 = i13;
            i11 = iG;
            i9 = iK4;
        } else {
            iK7 = iK7;
            i9 = iK4;
            i10 = -1;
            i11 = -1;
            f3 = 1.0f;
            i12 = -1;
        }
        return new f950(i210, iJ5, iJ6, iK5, i29, i28, f3, i5, iK2, z, zI, iK7, iK8, iK3, z2, i12, i10, i11, i9);
    }

    public static final void q(mm40 mm40Var, ik7 ik7Var, Function2 function2, fet fetVar, int i2) {
        int i3;
        boolean z;
        fetVar.g0(-11939104);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(ik7Var) : fetVar.i(ik7Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function2) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            C(ik7Var, fetVar, (i3 >> 3) & 14);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarH = dw9.h(1.0f, o7k0.g(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 32.0f, 0.0f, 2), true);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar, 6);
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
            thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
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
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(169554782, new hk7(ik7Var, (byte) 1), fetVar), fetVar, 56);
            if (ik7Var.e) {
                fetVar.e0(1324121421);
                z = false;
                G(0, fetVar);
                fetVar.r(false);
            } else {
                z = false;
                fetVar.e0(1324174276);
                fetVar.r(false);
            }
            fetVar.r(true);
            if (function2 == null) {
                fetVar.e0(-524427521);
                fetVar.r(z);
            } else {
                fetVar.e0(-1263843006);
                h97.q((i3 >> 6) & 14, fetVar, function2, z);
            }
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((Object) mm40Var, (Object) ik7Var, (Object) function2, i2, (byte) 10);
        }
    }

    public static ad9 q0(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        IntRange intRange = new IntRange(1, dataInputStream.readInt(), 1);
        ArrayList arrayList = new ArrayList(r3d.q(intRange, 10));
        Iterator it = intRange.iterator();
        while (((kkx) it).c) {
            ((bkx) it).nextInt();
            arrayList.add(Integer.valueOf(dataInputStream.readInt()));
        }
        int[] iArrK0 = CollectionsKt.K0(arrayList);
        int[] iArrCopyOf = Arrays.copyOf(iArrK0, iArrK0.length);
        return new ad9(Arrays.copyOf(iArrCopyOf, iArrCopyOf.length));
    }

    public static final void r(l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        kwj kwjVar;
        pz40 pz40Var;
        a4x a4xVar;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(-1285261950);
        int i3 = i2 | (fetVar2.g(l7m0Var) ? 4 : 2) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(function2) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                gkw gkwVar = (gkw) ((kkw) l7m0Var.getValue()).c.getValue();
                objP = Integer.valueOf((gkwVar == null || (a4xVar = gkwVar.b) == null) ? 0 : a4xVar.size());
                fetVar2.o0(objP);
            }
            int iIntValue = ((Number) objP).intValue();
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new y02(iIntValue, (byte) 6);
                fetVar2.o0(objP2);
            }
            kwj kwjVarB = zk80.b(0, (Function0) objP2, fetVar2, 384, 3);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                gkw gkwVar2 = (gkw) ((kkw) l7m0Var.getValue()).c.getValue();
                objP3 = Boolean.valueOf(gkwVar2 != null && gkwVar2.f11464a);
                fetVar2.o0(objP3);
            }
            boolean zBooleanValue = ((Boolean) objP3).booleanValue();
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP4);
            }
            pz40 pz40Var2 = (pz40) objP4;
            mm40 mm40VarQ = o7k0.c;
            if (((kkw) l7m0Var.getValue()).f18461a == g5h.EVENT_FOCUS) {
                fetVar2.e0(805850963);
                mm40VarQ = i120.Q(mm40VarQ, ((IndividualColors) fetVar2.k(j7x.f16059a)).getSplashBackground(), jd8.n);
                fetVar2.r(false);
            } else {
                fetVar2.e0(805955557);
                fetVar2.r(false);
            }
            mm40 mm40VarE0 = o2e.e0(cjx.V(mm40VarQ, x0x.a0(fetVar2), null), "COLUMN_HOME_SCREEN");
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
            if (zBooleanValue) {
                fetVar2.e0(1540713517);
                int i4 = i3 << 3;
                kwjVar = kwjVarB;
                pz40Var = pz40Var2;
                W(kwjVar, l7m0Var, pz40Var, function1, fetVar2, (i4 & 7168) | 384 | (i4 & 112));
                fetVar2.r(false);
            } else {
                kwjVar = kwjVarB;
                pz40Var = pz40Var2;
                fetVar2.e0(1540937430);
                fetVar2.r(false);
            }
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = new ca6(pz40Var, (byte) 13);
                fetVar2.o0(objP5);
            }
            Function1 function3 = (Function1) objP5;
            int i5 = i3 << 3;
            B(kwjVar, l7m0Var, qdzVar, function1, function2, function3, fetVar2, (i5 & 112) | 196992 | (i5 & 7168) | (i5 & 57344));
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new keg(l7m0Var, qdzVar, function1, function2, i2, (byte) 1);
        }
    }

    public static void r0(z55 z55Var) {
        int iK = z55Var.k() + 1;
        z55Var.v(8);
        for (int i2 = 0; i2 < iK; i2++) {
            z55Var.k();
            z55Var.k();
            z55Var.u();
        }
        z55Var.v(20);
    }

    public static final void s(mm40 mm40Var, a0i a0iVar, Function0 function0, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-967635779);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | (fetVar.g(a0iVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (!fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            fetVar.X();
        } else if (a0iVar instanceof xzh) {
            fetVar.e0(983225299);
            t(mm40Var, (xzh) a0iVar, function0, fetVar, i4 & 1022);
            fetVar.r(false);
        } else if (a0iVar instanceof yzh) {
            fetVar.e0(983455381);
            u(mm40Var, (yzh) a0iVar, function0, fetVar, i4 & 1022);
            fetVar.r(false);
        } else {
            if (!a0iVar.equals(zzh.f45253a)) {
                throw b1j.f(2109925275, fetVar, false);
            }
            fetVar.e0(983686114);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 152.0f);
            zcl zclVar2 = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51((Object) mm40Var, (Object) a0iVar, (Object) function0, i2, (byte) 0);
        }
    }

    public static ejx s0(int i2, guo guoVar, fq80 fq80Var) {
        ejx ejxVarC = ejx.c(guoVar, fq80Var);
        while (true) {
            int i3 = ejxVarC.f7928a;
            if (i3 == i2) {
                return ejxVarC;
            }
            rw2.u(i3, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j2 = ejxVarC.b;
            long j3 = 8 + j2;
            if (j2 % 2 != 0) {
                j3 = 9 + j2;
            }
            if (j3 > 2147483647L) {
                throw kq80.e("Chunk is too large (~2GB+) to skip; id: " + i3);
            }
            guoVar.m((int) j3);
            ejxVarC = ejx.c(guoVar, fq80Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0264  */
    /* JADX WARN: Code duplicated, block: B:60:0x0269  */
    /* JADX WARN: Code duplicated, block: B:63:0x02db  */
    /* JADX WARN: Code duplicated, block: B:65:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:70:0x03a2  */
    public static final void t(mm40 mm40Var, xzh xzhVar, Function0 function0, fet fetVar, int i2) {
        int i3;
        pcy pcyVar;
        cl5 cl5Var;
        o0x o0xVar;
        Object objA;
        pcy pcyVar2;
        boolean zE;
        Object objP;
        fet fetVar2 = fetVar;
        fetVar2.g0(706550176);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(xzhVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function0) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarW = y860.W(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD), null, null, false, null, function0, 28);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z || objP2 == cl5Var2) {
                objP2 = new m51(xzhVar, b2);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(s5x0.J(rq8.L(mm40VarW, (Function1) objP2), 16.0f), "DS_AGGREGATOR_LOYALTY_WIDGET_COLUMN");
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar3 = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar3);
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
            mm40 mm40VarE1 = o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), "HEADER_LEVEL_LOYALTY_WIDGET");
            int i5 = i3;
            String str = xzhVar.f41753a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarT = g1t0.t();
            zfn zfnVar2 = m8m0.f21378a;
            v8q0.a(str, mm40VarE1, ((StaticColors) fetVar2.k(zfnVar2)).m123getWhite0d7_KjU(), new n05(idm0.t(14), idm0.t(24), idm0.t(1)), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0VarT, fetVar, 0, 24960, 110576);
            mm40 mm40VarE = o7k0.e(jm40Var, 40.0f);
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar3;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar3;
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarE2 = o2e.e0(o7k0.s(o7k0.e(jm40Var, 40.0f), 60.0f), "BOX_IMAGE_LOYALTY_WIDGET");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE2);
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
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_favourite_active, 0, fetVar);
            boolean zE2 = fetVar.e(R.drawable.ic_glyph_favourite_active);
            Object objP3 = fetVar.P();
            if (zE2) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP3 == cl5Var) {
                }
                pm80 pm80Var = (pm80) objP3;
                n0q n0qVar = o7k0.c;
                o0xVar = xzhVar.d;
                if (o0xVar != null) {
                    objA = o0xVar.a();
                } else {
                    objA = null;
                }
                pcyVar2 = pcyVar;
                cl5 cl5Var3 = cl5Var;
                k7x.b(objA, null, n0qVar, null, pm80Var, null, null, null, null, null, gqw0.B, null, fetVar, 33200, 6, 31720);
                fetVar.r(true);
                mm40 mm40VarE3 = o7k0.e(new x7z(1.0f, true), 40.0f);
                x5d x5dVarA2 = w5d.a(new qw3(2.0f, false, new gne(yx7Var, (byte) 11)), xx7Var, fetVar, 0);
                int iHashCode4 = Long.hashCode(fetVar.T);
                bh90 bh90VarM4 = fetVar.m();
                mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarE3);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar2);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar);
                jpm0.o(fetVar, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC3, shdVar4);
                mm40 mm40VarE4 = o2e.e0(jm40Var, "SUBTITLE_LEVEL_LOYALTY_WIDGET");
                String str2 = xzhVar.c;
                ((g1t0) fetVar.k(zfnVar)).getClass();
                v8q0.a(str2, mm40VarE4, ((StaticColors) fetVar.k(zfnVar2)).m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 48, 24960, 110584);
                mm40 mm40VarE5 = o2e.e0(jm40Var, "TEXT_LEVEL_LOYALTY_WIDGET");
                String str3 = xzhVar.b;
                ((g1t0) fetVar.k(zfnVar)).getClass();
                v8q0.a(str3, mm40VarE5, ((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU(), new n05(idm0.t(14), idm0.t(18), idm0.t(1)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.v(), fetVar, 48, 24960, 110576);
                fetVar2 = fetVar;
                fetVar2.r(true);
                zE = fetVar2.e(R.drawable.ic_glyph_chevron_right_small);
                objP = fetVar2.P();
                if (zE || objP == cl5Var3) {
                    wul wulVar = new wul(oul.e, oe9.d, new se9(R.drawable.ic_glyph_chevron_right_small), true, false, true);
                    fetVar2.o0(wulVar);
                    objP = wulVar;
                }
                qzb.n(null, (wul) objP, function0, fetVar2, i5 & 896, 1);
                fetVar2.r(true);
                N(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), xzhVar, fetVar2, i4);
                fetVar2.r(true);
            }
            pz40 pz40Var = s6t0.f31722a;
            objP3 = ju70.T(pm80VarF, new m78(StaticColors.INSTANCE.m123getWhite0d7_KjU(), 5), new g20((byte) 25), 2);
            fetVar.o0(objP3);
            pm80 pm80Var2 = (pm80) objP3;
            n0q n0qVar2 = o7k0.c;
            o0xVar = xzhVar.d;
            if (o0xVar != null) {
                objA = o0xVar.a();
            } else {
                objA = null;
            }
            pcyVar2 = pcyVar;
            cl5 cl5Var4 = cl5Var;
            k7x.b(objA, null, n0qVar2, null, pm80Var2, null, null, null, null, null, gqw0.B, null, fetVar, 33200, 6, 31720);
            fetVar.r(true);
            mm40 mm40VarE6 = o7k0.e(new x7z(1.0f, true), 40.0f);
            x5d x5dVarA3 = w5d.a(new qw3(2.0f, false, new gne(yx7Var, (byte) 11)), xx7Var, fetVar, 0);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarE6);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA3, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            mm40 mm40VarE7 = o2e.e0(jm40Var, "SUBTITLE_LEVEL_LOYALTY_WIDGET");
            String str4 = xzhVar.c;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str4, mm40VarE7, ((StaticColors) fetVar.k(zfnVar2)).m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 48, 24960, 110584);
            mm40 mm40VarE8 = o2e.e0(jm40Var, "TEXT_LEVEL_LOYALTY_WIDGET");
            String str5 = xzhVar.b;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str5, mm40VarE8, ((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU(), new n05(idm0.t(14), idm0.t(18), idm0.t(1)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.v(), fetVar, 48, 24960, 110576);
            fetVar2 = fetVar;
            fetVar2.r(true);
            zE = fetVar2.e(R.drawable.ic_glyph_chevron_right_small);
            objP = fetVar2.P();
            if (zE) {
                wul wulVar2 = new wul(oul.e, oe9.d, new se9(R.drawable.ic_glyph_chevron_right_small), true, false, true);
                fetVar2.o0(wulVar2);
                objP = wulVar2;
            } else {
                wul wulVar3 = new wul(oul.e, oe9.d, new se9(R.drawable.ic_glyph_chevron_right_small), true, false, true);
                fetVar2.o0(wulVar3);
                objP = wulVar3;
            }
            qzb.n(null, (wul) objP, function0, fetVar2, i5 & 896, 1);
            fetVar2.r(true);
            N(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), xzhVar, fetVar2, i4);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var, (Object) xzhVar, (Object) function0, i2, (byte) 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00fa  */
    public static final gt1 t0(gu1 gu1Var, ctf0 ctf0Var, vql vqlVar) {
        vql vqlVar2;
        brl yqlVar;
        Object next;
        Object obj;
        Integer numValueOf;
        Object next2;
        ctf0Var.getClass();
        z1s0 z1s0Var = gu1Var.b;
        if (z1s0Var == z1s0.f43637a) {
            j88 j88Var = gu1Var.e;
            List list = gu1Var.l.f38767a;
            List list2 = gu1Var.h.f17902a;
            boolean z = gu1Var.c;
            int iOrdinal = j88Var.j.ordinal();
            int i2 = R.string.tournament_participate;
            int i3 = R.string.tournament_compete_win;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    if (z) {
                        Iterator it = list2.iterator();
                        do {
                            if (!it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                        } while (!((o2g0) next2).b);
                        o2g0 o2g0Var = (o2g0) next2;
                        if (o2g0Var == null) {
                            n0x n0xVarC0 = ahy.c0(vqlVar, false, true, 0, false, false);
                            lsm0 lsm0Var = ctf0Var.b;
                            yqlVar = new yql(new sql(n0xVarC0, lsm0Var.a(R.string.tournament_compete_win, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.you_participating_tournament, Arrays.copyOf(new Object[0], 0))), ahy.c0(vqlVar, true, false, 0, false, false), lsm0Var.a(R.string.tournament_your_progress, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            int i4 = o2g0Var.c;
                            int i5 = R.string.tournament_your_score;
                            sql sqlVar = new sql(ahy.c0(vqlVar, false, true, i4, true, false), ahy.d0(vqlVar, ctf0Var, String.valueOf(i4)), String.valueOf(i4));
                            n0x n0xVarC1 = ahy.c0(vqlVar, false, false, o2g0Var.c, true, false);
                            String strValueOf = String.valueOf(o2g0Var.d);
                            if (vqlVar == vql.c) {
                                i5 = R.string.tournament_score;
                            }
                            lsm0 lsm0Var2 = ctf0Var.b;
                            yqlVar = new wql(sqlVar, ahy.c0(vqlVar, true, false, 0, false, false), new sql(n0xVarC1, lsm0Var2.a(i5, Arrays.copyOf(new Object[0], 0)), strValueOf), lsm0Var2.a(R.string.tournament_your_progress, Arrays.copyOf(new Object[0], 0)));
                        }
                    } else {
                        vqlVar2 = vqlVar;
                        yqlVar = null;
                    }
                } else if (z) {
                    Iterator it2 = list2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!((o2g0) next).b);
                    o2g0 o2g0Var2 = (o2g0) next;
                    if (o2g0Var2 == null) {
                        n0x n0xVarC2 = ahy.c0(vqlVar, false, true, 0, false, false);
                        lsm0 lsm0Var3 = ctf0Var.b;
                        yqlVar = new yql(new sql(n0xVarC2, lsm0Var3.a(R.string.tournament_compete_win, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.you_participating_tournament, Arrays.copyOf(new Object[0], 0))), ahy.c0(vqlVar, true, false, 0, false, false), lsm0Var3.a(R.string.tournament_your_progress, Arrays.copyOf(new Object[0], 0)));
                    } else {
                        int i6 = o2g0Var2.c;
                        int i7 = o2g0Var2.d;
                        if (z1s0Var == z1s0.f43637a && gu1Var.m == 4) {
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                Object next3 = it3.next();
                                if (((fzl0) next3).c == gu1Var.q) {
                                    obj = next3;
                                    break;
                                }
                            }
                            fzl0 fzl0Var = (fzl0) obj;
                            if (fzl0Var == null) {
                                jf4.n("Current stage not found");
                                return null;
                            }
                            int i8 = fzl0Var.b;
                            int i9 = o2g0Var2.c;
                            int i10 = R.string.tournament_your_score;
                            sql sqlVar2 = new sql(ahy.c0(vqlVar, false, true, i9, true, false), ahy.d0(vqlVar, ctf0Var, String.valueOf(i6)), String.valueOf(i6));
                            n0x n0xVarC3 = ahy.c0(vqlVar, false, false, o2g0Var2.c, true, false);
                            String strValueOf2 = String.valueOf(i7);
                            if (vqlVar == vql.c) {
                                i10 = R.string.tournament_score;
                            }
                            lsm0 lsm0Var4 = ctf0Var.b;
                            sql sqlVar3 = new sql(n0xVarC3, lsm0Var4.a(i10, Arrays.copyOf(new Object[0], 0)), strValueOf2);
                            String strA = lsm0Var4.a(R.string.tournament_points_to_next_stage, Arrays.copyOf(new Object[0], 0));
                            int i11 = i7 < i8 ? i7 : i8;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : list) {
                                if (((fzl0) obj2).b < i8) {
                                    arrayList.add(obj2);
                                }
                            }
                            Iterator it4 = arrayList.iterator();
                            if (it4.hasNext()) {
                                numValueOf = Integer.valueOf(((fzl0) it4.next()).b);
                                while (it4.hasNext()) {
                                    Integer numValueOf2 = Integer.valueOf(((fzl0) it4.next()).b);
                                    if (numValueOf.compareTo(numValueOf2) < 0) {
                                        numValueOf = numValueOf2;
                                    }
                                }
                            } else {
                                numValueOf = null;
                            }
                            vqlVar2 = vqlVar;
                            yqlVar = new xql(sqlVar2, ahy.c0(vqlVar, true, false, 0, false, false), sqlVar3, new tql(strA, i11, String.valueOf(numValueOf != null ? numValueOf.intValue() : 0), String.valueOf(i8), String.valueOf(i7), i8 - i7 < 0 ? uql.b : uql.f36124a), lsm0Var4.a(R.string.tournament_your_progress, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            n0x n0xVarC4 = ahy.c0(vqlVar, false, true, i6, true, false);
                            String strValueOf3 = String.valueOf(i6);
                            lsm0 lsm0Var5 = ctf0Var.b;
                            yqlVar = new wql(new sql(n0xVarC4, lsm0Var5.a(R.string.tournament_place, Arrays.copyOf(new Object[0], 0)), strValueOf3), ahy.c0(vqlVar, true, false, 0, false, false), new sql(ahy.c0(vqlVar, false, false, o2g0Var2.c, true, false), lsm0Var5.a(R.string.tournament_your_score, Arrays.copyOf(new Object[0], 0)), String.valueOf(i7)), lsm0Var5.a(R.string.tournament_your_progress, Arrays.copyOf(new Object[0], 0)));
                        }
                    }
                } else {
                    n0x n0xVarC5 = ahy.c0(vqlVar, false, true, 0, false, false);
                    lsm0 lsm0Var6 = ctf0Var.b;
                    yqlVar = new yql(new sql(n0xVarC5, lsm0Var6.a(R.string.tournament_compete_win, Arrays.copyOf(new Object[0], 0)), lsm0Var6.a(R.string.tournament_participate, Arrays.copyOf(new Object[0], 0))), ahy.c0(vqlVar, true, false, 0, false, false), lsm0Var6.a(R.string.tournament_your_progress, Arrays.copyOf(new Object[0], 0)));
                }
                vqlVar2 = vqlVar;
            } else {
                n0x n0xVarC6 = ahy.c0(vqlVar, false, true, 0, false, gu1Var.c);
                if (z) {
                    i2 = R.string.you_participating_tournament;
                }
                lsm0 lsm0Var7 = ctf0Var.b;
                String strA2 = lsm0Var7.a(i2, Arrays.copyOf(new Object[0], 0));
                if (z) {
                    i3 = R.string.tournament_participating_waiting_start;
                }
                vqlVar2 = vqlVar;
                yqlVar = new yql(new sql(n0xVarC6, lsm0Var7.a(i3, Arrays.copyOf(new Object[0], 0)), strA2), ahy.c0(vqlVar, true, false, 0, false, gu1Var.c), lsm0Var7.a(R.string.tournament_your_progress, Arrays.copyOf(new Object[0], 0)));
            }
        } else {
            vqlVar2 = vqlVar;
            yqlVar = null;
        }
        if (yqlVar != null) {
            return new gt1(vqlVar2, yqlVar);
        }
        return null;
    }

    public static final void u(mm40 mm40Var, yzh yzhVar, Function0 function0, fet fetVar, int i2) {
        int i3;
        pcy pcyVar;
        yzh yzhVar2 = yzhVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-387317184);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(yzhVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function0) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarW = y860.W(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD), null, null, false, null, function0, 28);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new m51(yzhVar2, b2);
                fetVar2.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(s5x0.J(rq8.L(mm40VarW, (Function1) objP), 16.0f), "DS_AGGREGATOR_LOYALTY_WIDGET_COLUMN");
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE1 = o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), "HEADER_LEVEL_LOYALTY_WIDGET");
            int i4 = i3;
            String str = yzhVar2.f43513a;
            afn0.v(fetVar2).getClass();
            v8q0.a(str, mm40VarE1, afn0.p(fetVar2).m123getWhite0d7_KjU(), new n05(idm0.t(14), idm0.t(24), idm0.t(1)), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.t(), fetVar, 0, 24960, 110576);
            mm40 mm40VarE = o7k0.e(jm40Var, 40.0f);
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
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
            mm40 mm40VarE2 = o7k0.e(o7k0.s(jm40Var, 56.0f), 40.0f);
            long jM126getWhite200d7_KjU = afn0.p(fetVar).m126getWhite200d7_KjU();
            zcl zclVar2 = qmk.e;
            mm40 mm40VarQ = i120.Q(mm40VarE2, jM126getWhite200d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
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
            dww.c(a8k0.F(R.drawable.ic_glyph_favourite_active, 0, fetVar), null, o7k0.n(jm40Var, 24.0f), afn0.p(fetVar).m123getWhite0d7_KjU(), fetVar, 56, 0);
            fetVar.r(true);
            mm40 mm40VarN = s5x0.N(o7k0.e(new x7z(1.0f, true), 40.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA2 = w5d.a(uc9.e, xx7Var, fetVar, 6);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarN);
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
            mm40 mm40VarE3 = o2e.e0(jm40Var, "SUBTITLE_LEVEL_LOYALTY_WIDGET");
            yzhVar2 = yzhVar;
            String str2 = yzhVar2.c;
            afn0.v(fetVar).getClass();
            v8q0.a(str2, mm40VarE3, afn0.p(fetVar).m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 48, 24960, 110584);
            mm40 mm40VarE4 = o2e.e0(jm40Var, "TEXT_LEVEL_LOYALTY_WIDGET");
            String str3 = yzhVar2.b;
            afn0.v(fetVar).getClass();
            v8q0.a(str3, mm40VarE4, afn0.p(fetVar).m123getWhite0d7_KjU(), new n05(idm0.t(14), idm0.t(18), qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.v(), fetVar, 48, 24960, 110576);
            fetVar.r(true);
            boolean zE = fetVar.e(R.drawable.ic_glyph_chevron_right_small);
            Object objP2 = fetVar.P();
            if (zE || objP2 == cl5Var) {
                wul wulVar = new wul(oul.e, oe9.d, new se9(R.drawable.ic_glyph_chevron_right_small), true, false, true);
                fetVar.o0(wulVar);
                objP2 = wulVar;
            }
            qzb.n(null, (wul) objP2, function0, fetVar, i4 & 896, 1);
            fetVar.r(true);
            mm40 mm40VarW2 = o7k0.w(o7k0.g(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), 28.0f, 0.0f, 2), yx7Var, false, 2);
            afn0.v(fetVar).getClass();
            v8q0.a(yzhVar2.d, mm40VarW2, afn0.p(fetVar).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ca00((Object) mm40Var, (Object) yzhVar2, (Object) function0, i2, (byte) 15);
        }
    }

    public static final jh8 u0(uf8 uf8Var, w3t w3tVar, ctf0 ctf0Var) {
        int i2;
        uf8Var.getClass();
        ctf0Var.getClass();
        boolean z = uf8Var instanceof rf8;
        qpo0 qpo0Var = qpo0.f29131a;
        fan fanVar = null;
        if (z) {
            if (!(w3tVar instanceof v3t)) {
                rf8 rf8Var = (rf8) uf8Var;
                pbv pbvVar = rf8Var.c;
                n0x n0xVar = new n0x(pbvVar.n.b);
                n0x n0xVar2 = new n0x(azw.R(pbvVar.n.b));
                m0x m0xVar = new m0x(R.drawable.ic_games_square, null, 6);
                pz40 pz40Var = s6t0.f31722a;
                qan qanVar = new qan(s6t0.b().f33626a.getPrimary());
                csr csrVar = rf8Var.f30373a;
                return new fh8(new jan(n0xVar, n0xVar2, m0xVar, qanVar, ctf0Var.b.a(R.string.available_with_value_v2, Arrays.copyOf(new Object[]{Long.valueOf(csrVar.d)}, 1)), csrVar.b, pbvVar.p), csrVar);
            }
            rf8 rf8Var2 = (rf8) uf8Var;
            csr csrVar2 = ((v3t) w3tVar).c;
            csr csrVar3 = rf8Var2.f30373a;
            int iOrdinal = csrVar3.f4905a.f3145a.ordinal();
            if (iOrdinal == 1) {
                i2 = R.drawable.ic_bonuses_info_doubling;
            } else if (iOrdinal == 2) {
                i2 = R.drawable.ic_bonuses_info_return;
            } else if (iOrdinal != 3) {
                i2 = iOrdinal != 5 ? R.drawable.ic_games_square : R.drawable.bonuses_info_wild_freebet;
            } else {
                i2 = R.drawable.ic_bonuses_info_free_bet;
            }
            m0x m0xVar2 = new m0x(i2, null, 6);
            m0x m0xVar3 = new m0x(R.drawable.ic_games_square, null, 6);
            pz40 pz40Var2 = s6t0.f31722a;
            qan qanVar2 = new qan(s6t0.b().f33626a.getPrimary());
            fan fanVarD0 = d0(rf8Var2, ctf0Var, csrVar2);
            if (rf8Var2.a().f4905a.equals(csrVar2.f4905a)) {
                fanVar = new fan(ctf0Var.b.a(R.string.available_with_value_v2, Arrays.copyOf(new Object[]{Long.valueOf(rf8Var2.a().d)}, 1)), qpo0Var);
            }
            return new gh8(new gan(m0xVar2, m0xVar3, qanVar2, fanVarD0, fanVar, csrVar3.b, new can(c0(rf8Var2, ctf0Var, csrVar2))), csrVar3);
        }
        if (!(uf8Var instanceof sf8)) {
            if (!(uf8Var instanceof qf8)) {
                t9f.b();
                return null;
            }
            qf8 qf8Var = (qf8) uf8Var;
            String str = qf8Var.c;
            n0x n0xVar3 = new n0x(str);
            n0x n0xVar4 = new n0x(azw.R(str));
            m0x m0xVar4 = new m0x(R.drawable.ic_games_square, null, 6);
            pz40 pz40Var3 = s6t0.f31722a;
            return new ch8(new jan(n0xVar3, n0xVar4, m0xVar4, new qan(s6t0.b().f33626a.getPrimary()), "", ctf0Var.b.a(qf8Var.f28618a == d270.LUCKY_WHEEL ? R.string.bonuses_empty_stub : R.string.empty_str, Arrays.copyOf(new Object[0], 0)), qf8Var.b));
        }
        if (!(w3tVar instanceof v3t)) {
            csr csrVar4 = ((sf8) uf8Var).f32104a;
            m0x m0xVar5 = new m0x(R.drawable.ic_wild_free_bet_bonus, null, 6);
            m0x m0xVar6 = new m0x(R.drawable.ic_games_square, null, 6);
            pz40 pz40Var4 = s6t0.f31722a;
            return new fh8(new jan(m0xVar5, m0xVar5, m0xVar6, new qan(s6t0.b().f33626a.getPrimary()), ctf0Var.b.a(R.string.available_with_value_v2, Arrays.copyOf(new Object[]{Long.valueOf(csrVar4.d)}, 1)), csrVar4.b, false), csrVar4);
        }
        sf8 sf8Var = (sf8) uf8Var;
        csr csrVar5 = sf8Var.f32104a;
        csr csrVar6 = ((v3t) w3tVar).c;
        m0x m0xVar7 = new m0x(R.drawable.ic_wild_free_bet_bonus, null, 6);
        m0x m0xVar8 = new m0x(R.drawable.ic_games_square, null, 6);
        pz40 pz40Var5 = s6t0.f31722a;
        qan qanVar3 = new qan(s6t0.b().f33626a.getPrimary());
        String str2 = csrVar5.b;
        fan fanVarD1 = d0(sf8Var, ctf0Var, csrVar6);
        if (sf8Var.a().f4905a.equals(csrVar6.f4905a)) {
            fanVar = new fan(ctf0Var.b.a(R.string.available_with_value_v2, Arrays.copyOf(new Object[]{Long.valueOf(sf8Var.a().d)}, 1)), qpo0Var);
        }
        return new gh8(new gan(m0xVar7, m0xVar8, qanVar3, fanVarD1, fanVar, str2, new dan(new ban(2, new wul(nul.e, oe9.c, new ue9(ctf0Var.b.a(R.string.bonuses_change_game, Arrays.copyOf(new Object[0], 0))), true, false, true)), c0(sf8Var, ctf0Var, csrVar6))), csrVar5);
    }

    public static final void v(mm40 mm40Var, z2n z2nVar, float f2, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1777577454);
        byte b2 = 2;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(z2nVar) ? 32 : 16;
        }
        int i4 = i3 | (fetVar.d(f2) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i4 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 120.0f), 1.0f);
            lh80 lh80VarT = s5x0.t(f2, 0.0f, 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i4 & 112) == 32) | ((i4 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new u5l0(b2, z2nVar, function1);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarD, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new c8l0(mm40Var, z2nVar, f2, function1, i2, (byte) 1);
        }
    }

    public static final long[] v0(List list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i2 = 0; i2 < size; i2++) {
            jArr[i2] = rq8.X(((y3d) list.get(i2)).f41946a);
        }
        return jArr;
    }

    public static final void w(mm40 mm40Var, uzh uzhVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3, Function0 function4, Function0 function5, fet fetVar, int i2) {
        int i3;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        fetVar.g0(861020366);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(uzhVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function4) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.i(function5) ? 8388608 : 4194304;
        }
        if (fetVar.U(i3 & 1, (4793491 & i3) != 4793490)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 320.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
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
            int i4 = i3 >> 3;
            d(uzhVar, function2, fetVar, (i4 & 14) | ((i3 >> 9) & 112));
            e(o7k0.d(jm40Var, 1.0f), uzhVar, function0, function1, function3, function4, function5, fetVar, (i3 & 7168) | (i3 & 112) | 6 | (i3 & 896) | (57344 & i4) | (458752 & i4) | (i4 & 3670016));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wml(mm40Var, uzhVar, function0, function1, function2, function3, function4, function5, i2, (byte) 3);
        }
    }

    public static int w0(byte[] bArr, int i2) {
        int i3;
        synchronized (l) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArrCopyOf = m;
                    if (iArrCopyOf.length <= i5) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                        m = iArrCopyOf;
                    }
                    iArrCopyOf[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = m[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static final void x(mm40 mm40Var, mdm mdmVar, fet fetVar, int i2) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-915359932);
        int i3 = i2 | 6 | (fetVar.g(mdmVar) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
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
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, null, fetVar2, i3 & 112, 13);
            fetVar2.r(true);
            mm40Var = jm40.b;
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rdb(mm40Var, mdmVar2, i2, (byte) 2);
        }
    }

    public static final void x0(List list, List list2) {
        if (list2 == null) {
            if (list.size() >= 2) {
                return;
            }
            jf4.o("colors must have length of at least 2 if colorStops is omitted.");
        } else {
            if (list.size() == list2.size()) {
                return;
            }
            jf4.o("colors and colorStops arguments must have equal length.");
        }
    }

    public static final void y(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(852918992);
        int i3 = i2 | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            x4q x4qVar = (x4q) l7m0Var.getValue();
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            I(null, x4qVar.a(), function1, fetVar, i3 & 896);
            boolean z2 = x4qVar instanceof v4q;
            jm40 jm40Var = jm40.b;
            if (z2) {
                fetVar.e0(177121058);
                eeq.M((v4q) x4qVar, function1, fetVar, i3 & 910);
                fetVar.r(false);
            } else {
                if (!(x4qVar instanceof w4q)) {
                    throw b1j.f(1668280018, fetVar, false);
                }
                fetVar.e0(1668290083);
                mm40 mm40VarD = o7k0.d(new x7z(1.0f, true), 1.0f);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
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
                jcb.l(jr8.f16991a.b(jm40Var, gqw0.e), ((w4q) x4qVar).b, false, null, fetVar, 0, 12);
                fetVar.r(true);
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
            yfe0VarU.d = new kr0(mm40Var2, l7m0Var, function1, i2, (byte) 15);
        }
    }

    public static final void z(mm40 mm40Var, uzh uzhVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-851829424);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(uzhVar) ? 32 : 16;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            int iT = w6kVar.T(8.0f);
            mm40 mm40VarM = s5x0.M(mm40Var, 16.0f, 8.0f, uzhVar.l ? 36.0f : 8.0f, 6.0f);
            boolean zE = ((i3 & 112) == 32) | fetVar.e(iT);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new inl(uzhVar, iT, b2);
                fetVar.o0(objP);
            }
            x4n0.a(mm40VarM, (Function2) objP, fetVar, 0, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jnl(mm40Var, uzhVar, i2, b2);
        }
    }
}
