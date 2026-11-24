package a;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.javax.sip.message.Response;
import android.view.View;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.EventParams;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class x8f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f40458a = new ugd(-1684463681, false, new zgd(0));
    public static final ugd b = new ugd(-726418574, false, new bhd(19));
    public static final ugd c = new ugd(-1480364407, false, new jhd(8));
    public static final ugd d = new ugd(564751022, false, new ohd((byte) 7));

    public static final void A(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1303323858);
        byte b2 = 16;
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
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
            if (z || objP == ukd.f35823a) {
                objP = new i0a0(function1, (byte) 4);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, (i2 << 3) & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i, b2);
        }
    }

    public static final void B(final l7m0 l7m0Var, final qdz qdzVar, final Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        boolean z;
        boolean z2;
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar.g0(-886828970);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            float fH0 = lgb.h0(fetVar);
            zcl zclVar = qmk.f28987a;
            float f = 338.0f + fH0;
            float f2 = fH0 + 56.0f;
            Object[] objArr = new Object[0];
            int i3 = i2 & 14;
            boolean z3 = i3 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new plh(l7m0Var, (byte) 29);
                fetVar.o0(objP);
            }
            final l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.a(0.0f);
                fetVar.o0(objP2);
            }
            agk0 agk0Var = (agk0) objP2;
            Object[] objArr2 = new Object[0];
            boolean z4 = i3 == 4;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new zwp(l7m0Var, b2);
                fetVar.o0(objP3);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP3, fetVar);
            mm40 mm40VarQ = i120.Q(o7k0.c, ijg.i, jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            Object objP4 = fetVar.P();
            byte b3 = 6;
            if (objP4 == cl5Var) {
                objP4 = new fc3(agk0Var, b3);
                fetVar.o0(objP4);
            }
            g(6, fetVar, i4w0.T(jm40.b, (Function1) objP4), (String) l7m0VarY2.getValue());
            zfn zfnVar = m8m0.f21378a;
            m0x0.d(null, f, ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), false, 0.0f, null, 0L, 0.0f, null, null, u1c.M(1908288003, new axp(agk0Var, l7m0Var, f, f2, function1), fetVar), u1c.M(-34853443, new zdr() { // from class: a.bxp
                @Override // a.zdr
                public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    fet fetVar3 = (fet) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    ((hh80) obj).getClass();
                    ((l7m0) obj2).getClass();
                    ((l7m0) obj3).getClass();
                    if (!fetVar3.U(iIntValue & 1, (iIntValue & 1025) != 1024)) {
                        fetVar3.X();
                    } else if (((fxp) l7m0VarY.getValue()) instanceof cxp) {
                        fetVar3.e0(1063277255);
                        Object[] objArr3 = new Object[0];
                        l7m0 l7m0Var2 = l7m0Var;
                        boolean zG = fetVar3.g(l7m0Var2);
                        Object objP5 = fetVar3.P();
                        if (zG || objP5 == ukd.f35823a) {
                            objP5 = new zwp(l7m0Var2, (byte) 1);
                            fetVar3.o0(objP5);
                        }
                        saj.w(null, v3c.Y(objArr3, (Function0) objP5, fetVar3), qdzVar, function1, fetVar3, 0);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(865594049);
                        fetVar3.r(false);
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 24576, 432, 1985);
            fxp fxpVar = (fxp) l7m0VarY.getValue();
            if (fxpVar == null) {
                fetVar2 = fetVar;
                z = true;
                z2 = false;
            } else {
                if (fxpVar instanceof dxp) {
                    fetVar.e0(368827996);
                    mdm mdmVar = ((dxp) fxpVar).f6858a;
                    boolean z5 = (i2 & 896) == 256;
                    Object objP5 = fetVar.P();
                    if (z5 || objP5 == cl5Var) {
                        objP5 = new mfp(function1, (byte) 21);
                        fetVar.o0(objP5);
                    }
                    fetVar2 = fetVar;
                    z = true;
                    i(f2, mdmVar, (Function0) objP5, fetVar2, 0, 0);
                    fetVar2.r(false);
                } else {
                    z = true;
                    z2 = false;
                    if (fxpVar instanceof exp) {
                        fetVar.e0(369115087);
                        mdm mdmVar2 = ((exp) fxpVar).f8590a;
                        fetVar2 = fetVar;
                        i(f2, mdmVar2, null, fetVar2, 0, 4);
                        fetVar2.r(false);
                    } else {
                        fetVar2 = fetVar;
                    }
                }
                fetVar2.r(z);
            }
            fetVar2.e0(843196660);
            fetVar2.r(z2);
            fetVar2.r(z);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn(l7m0Var, qdzVar, function1, i, (byte) 3);
        }
    }

    public static final void C(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1853482595);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
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
            y9q0 y9q0VarT = ibm0.t(g1t0.m(), fetVar2);
            long j = qmk.r;
            long j2 = qmk.o;
            long j3 = qmk.n;
            v8q0.a(str, null, 0L, new n05(j2, j, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarT, fetVar2, (i2 >> 3) & 14, 24960, 110582);
            v8q0.a(str2, null, 0L, new n05(j2, qmk.q, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(g1t0.g(), fetVar2), fetVar2, (i2 >> 6) & 14, 24960, 110582);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var, str, str2, i, (byte) 2);
        }
    }

    public static final void D(mm40 mm40Var, ik00 ik00Var, boolean z, qdz qdzVar, e2d e2dVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(668359188);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ik00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(qdzVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(e2dVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            if (ik00Var instanceof fk00) {
                fetVar.e0(-379471407);
                z(mm40Var, ((fk00) ik00Var).f9668a, function1, fetVar, (i3 & 14) | ((i3 >> 9) & 896));
                fetVar.r(false);
            } else if (ik00Var instanceof gk00) {
                fetVar.e0(-1951899388);
                N(mm40Var, (gk00) ik00Var, fetVar, i3 & 126);
                fetVar.r(false);
            } else {
                if (!(ik00Var instanceof hk00)) {
                    throw b1j.f(-1951905213, fetVar, false);
                }
                fetVar.e0(-379239992);
                fetVar2 = fetVar;
                I(null, z, function1, u1c.M(182356005, new jwy(ik00Var, mm40Var, qdzVar, e2dVar, function1, (byte) 0), fetVar), fetVar2, ((i3 >> 3) & 112) | 3072 | ((i3 >> 9) & 896));
                fetVar2.r(false);
            }
            fetVar2 = fetVar;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nwy(mm40Var, ik00Var, z, qdzVar, e2dVar, function1, i, (byte) 0);
        }
    }

    public static final void E(int i, fet fetVar) {
        fetVar.g0(836104504);
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
                objP2 = new ec40((byte) 15);
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
            yfe0VarU.d = new o240(i, (byte) 14);
        }
    }

    public static final void F(int i, fet fetVar) {
        fetVar.g0(-1985008389);
        if (fetVar.U(i & 1, i != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            int iB = (int) (((yez) ((rhv0) fetVar.k(bmd.u))).b() & 4294967295L);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = Integer.valueOf((int) ((iB * 0.010416667f) + 2.0f));
                fetVar.o0(objP);
            }
            int iIntValue = ((Number) objP).intValue();
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA0 = wha0.a0(i120.Q(jm40Var, backgroundContent, ljcVar), wha0.T(fetVar), false, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z) {
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
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(s5x0.N(o7k0.e(mm40VarD, 32.0f), 8.0f, 8.0f, 8.0f, 0.0f, 8), vgg0.a(12.0f)), fqj0VarD0));
            mbc.o(zfi0.f44303a, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), false, fetVar, 6, 4);
            zq8.a(0, fetVar, xbc.c0(lgb.J(s5x0.J(o7k0.e(o7k0.d(jm40Var, 1.0f), 94.0f), 8.0f), vgg0.a(12.0f)), fqj0VarD0));
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            pzw.b(fqj0VarD0, fetVar, 0);
            pzw.b(fqj0VarD0, fetVar, 0);
            fetVar.r(true);
            dw9.x(s5x0.N(o7k0.e(o7k0.d(jm40Var, 1.0f), 34.0f), 0.0f, 6.0f, 0.0f, 0.0f, 13), fqj0VarD0, fetVar, 0, true);
            mm40 mm40VarQ = i120.Q(o7k0.c, s6t0.b().f33626a.getBackgroundContent(), ljcVar);
            boolean zG = fetVar.g(fqj0VarD0);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new m3a0((byte) 0, iIntValue, fqj0VarD0);
                fetVar.o0(objP2);
            }
            b8k0.e(mm40VarQ, null, null, null, null, null, false, null, (Function1) objP2, fetVar, 12582912, 382);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new so90(i, (byte) 18);
        }
    }

    public static final void G(hp40 hp40Var, Function1 function1, fet fetVar, int i) {
        hp40Var.getClass();
        function1.getClass();
        fetVar.g0(-466251110);
        byte b2 = 2;
        int i2 = (fetVar.g(hp40Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b3 = 0;
        byte b4 = 1;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else {
            if (hp40Var.g) {
                fetVar.e0(-162427248);
                h(hp40Var.i, hp40Var.h, function1, fetVar, (i2 << 3) & 896);
                fetVar.r(false);
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new ap40(hp40Var, function1, i, b3);
                    return;
                }
                return;
            }
            fetVar.e0(-162219672);
            fetVar.r(false);
            m8x.y(o7k0.c, u1c.M(222436438, new ap40(hp40Var, function1, b4), fetVar), u1c.M(1272305653, new ap40(hp40Var, function1, b2), fetVar), null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(-1464934549, new ri1(hp40Var, function1, (byte) 10), fetVar), fetVar, 805306806, 440);
            if (hp40Var.f13426a) {
                fetVar.e0(-157726129);
                E(0, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-157702104);
                fetVar.r(false);
            }
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new ap40(hp40Var, function1, i, (byte) 3);
        }
    }

    public static final void H(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1847934625);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarR = knm0.r(o7k0.c);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            imm immVarA = ((t3a0) l7m0Var.getValue()).a();
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new i0a0(function1, (byte) 3);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarD, immVarA, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            t3a0 t3a0Var = (t3a0) l7m0Var.getValue();
            if (t3a0Var != null) {
                if (t3a0Var instanceof s3a0) {
                    fetVar.e0(-276956103);
                    F(0, fetVar);
                    fetVar.r(false);
                } else if (t3a0Var instanceof r3a0) {
                    fetVar.e0(-276953927);
                    A(((r3a0) t3a0Var).b, function1, fetVar, i3);
                    fetVar.r(false);
                } else if (t3a0Var instanceof o3a0) {
                    fetVar.e0(-276948722);
                    u((o3a0) t3a0Var, function1, fetVar, i3);
                    fetVar.r(false);
                } else if (t3a0Var instanceof p3a0) {
                    fetVar.e0(-276943396);
                    r((p3a0) t3a0Var, function1, fetVar, i3);
                    fetVar.r(false);
                } else if (t3a0Var instanceof q3a0) {
                    fetVar.e0(-276937702);
                    s((q3a0) t3a0Var, function1, fetVar, i3);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            throw b1j.f(-276958121, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i, (byte) 8);
        }
    }

    public static final void I(mm40 mm40Var, boolean z, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        boolean z2;
        mm40 mm40Var2;
        fetVar.g0(1488240138);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z3 = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new xwy(function1, (byte) 3);
                fetVar.o0(objP);
            }
            mom.c(n0qVar, z2, womVarF, null, false, null, (Function0) objP, null, ugdVar, fetVar, (i2 & 112) | ((i2 << 15) & 234881024), 184);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new an2(mm40Var2, z, function1, ugdVar, i, (byte) 2);
        }
    }

    public static final void J(String str, String str2, fet fetVar, int i) {
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(1201787628);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 0.0f, 8.0f, 1);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            y9q0 y9q0VarK = g1t0.k();
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, null, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarK, fetVar, i2 & 14, 0, 131066);
            str3 = str2;
            v8q0.a(str3, null, s6t0.b().f33626a.getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.k(), fetVar, (i2 >> 3) & 14, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            str3 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 16, i, str, str3);
        }
    }

    public static final void K(m1e0 m1e0Var, fet fetVar, int i) {
        fetVar.g0(643414306);
        int i2 = (fetVar.g(m1e0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(s5x0.K(mm40VarD, 12.0f, 8.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), vgg0.a(12.0f));
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
            mm40 mm40VarK = s5x0.K(o7k0.d(jm40Var, 1.0f), 8.0f, 4.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarK);
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
            J(rsm0.w(R.string.statistic_info_rating, 0, fetVar), m1e0Var.f21004a, fetVar, 0);
            J(rsm0.w(R.string.stage_table_title_count_points, 0, fetVar), m1e0Var.b, fetVar, 0);
            J(rsm0.w(R.string.win_lose_statistic, 0, fetVar), m1e0Var.c, fetVar, 0);
            J(rsm0.w(R.string.titles_statistic, 0, fetVar), m1e0Var.d, fetVar, 0);
            J(rsm0.w(R.string.prizes_money_statistic, 0, fetVar), m1e0Var.e, fetVar, 0);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cz90(m1e0Var, i, (byte) 5);
        }
    }

    public static final void L(l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, qdz qdzVar, Function1 function1, fet fetVar, int i) {
        l7m0 l7m0Var3;
        int i2;
        l7m0 l7m0Var4;
        fetVar.g0(1456329194);
        if ((i & 6) == 0) {
            l7m0Var3 = l7m0Var;
            i2 = (fetVar.g(l7m0Var3) ? 4 : 2) | i;
        } else {
            l7m0Var3 = l7m0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            l7m0Var4 = l7m0Var2;
            i2 |= fetVar.g(l7m0Var4) ? 32 : 16;
        } else {
            l7m0Var4 = l7m0Var2;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(qdzVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            n0q n0qVar = o7k0.c;
            boolean z = !((Boolean) l7m0Var4.getValue()).booleanValue();
            zcl zclVar = qmk.f28987a;
            b8k0.d(n0qVar, xczVar, l7m0Var3, new qw3(8.0f, true, new jf4((byte) 14)), knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 28.0f, 7), fetVar), z, null, u1c.M(-133753236, new rkb(qdzVar, function1, b2), fetVar), fetVar, ((i2 >> 3) & 112) | 100663302 | ((i2 << 6) & 896), 136);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf((Object) l7m0Var, (Object) l7m0Var4, (Object) xczVar, (Object) qdzVar, (Object) function1, i, (byte) 12);
        }
    }

    public static final void M(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1972456911);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 12);
        }
    }

    public static final void N(mm40 mm40Var, gk00 gk00Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1915077918);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(gk00Var) ? 32 : 16;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80Var = new lh80(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 32.0f);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new djx(gk00Var, (byte) 19);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i2 & 14) | 12582912, 362);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uwy(mm40Var, gk00Var, i, b2);
        }
    }

    public static final void O(int i, fet fetVar) {
        fetVar.g0(1055772906);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40.b, 400.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g20(i, (byte) 12);
        }
    }

    public static final void P(mm40 mm40Var, float f, fet fetVar, int i) {
        int i2;
        fetVar.g0(1417421786);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            lh80 lh80VarT = s5x0.t(f, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ejk0((byte) 25);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarD, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 805306368, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dql(mm40Var, f, i, (byte) 5);
        }
    }

    public static final void Q(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(646074525);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 88.0f), 64.0f);
            zcl zclVar2 = qmk.g;
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
            yfe0VarU.d = new eqj0(mm40Var, i, (byte) 15);
        }
    }

    public static final void R(mm40 mm40Var, jsm jsmVar, float f, Function1 function1, Function0 function0, Function0 function2, xdr xdrVar, fet fetVar, int i, int i2) {
        jsmVar.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if ((i2 & 8) != 0) {
            function1 = null;
        }
        if ((i2 & 16) != 0) {
            function0 = null;
        }
        if ((i2 & 32) != 0) {
            function2 = null;
        }
        if (!(jsmVar instanceof hsm)) {
            mm40 mm40Var2 = mm40Var;
            if (!(jsmVar instanceof ism)) {
                throw b1j.f(1320801525, fetVar, false);
            }
            fetVar.e0(-2004358823);
            P(mm40Var2, f, fetVar, (i & 14) | ((i >> 3) & 112));
            fetVar.r(false);
            return;
        }
        fetVar.e0(-2004762288);
        Function0 function3 = function2;
        mm40 mm40Var3 = mm40Var;
        w(mm40Var3, (hsm) jsmVar, f, function1, function0, function3, xdrVar, fetVar, 4194302 & i);
        fetVar.r(false);
    }

    public static final void S(mm40 mm40Var, hk00 hk00Var, qdz qdzVar, e2d e2dVar, Function1 function1, fet fetVar, int i) {
        byte b2;
        mtl mtlVar = hk00Var.c;
        fetVar.g0(1482133869);
        byte b3 = 4;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(hk00Var) ? 32 : 16) | (fetVar.g(qdzVar) ? 256 : 128) | (fetVar.g(e2dVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            xcz xczVarB = qdzVar.b("ALT_LIVE_RESULTS_SCREEN", new hvy(b3), fetVar, (i2 & 896) | 6);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            WeakHashMap weakHashMap = djv0.w;
            int i3 = zcm0.i(fetVar).c.e().d - zcm0.i(fetVar).e.e().d;
            if (i3 < 0) {
                i3 = 0;
            }
            float fR0 = w6kVar.r0(i3);
            zcl zclVar = qmk.f28987a;
            float fMax = Math.max(0.0f, fR0 - 56.0f);
            mm40 mm40VarV = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (e2dVar != null) {
                fetVar.e0(1986988605);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new j6g0((byte) 17);
                    fetVar.o0(objP);
                }
                mm40VarV = cjx.V(mm40VarV, e2d.b(e2dVar, (Function0) objP), null);
                fetVar.r(false);
            } else {
                fetVar.e0(1987079869);
                fetVar.r(false);
            }
            mm40 mm40VarN = s5x0.N(mm40Var.e(o7k0.c), 0.0f, 0.0f, 0.0f, fMax, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            mm40 mm40VarE = mm40VarV.e(ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, true));
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            ch80 ch80VarF = h97.f(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 32.0f, fetVar);
            boolean z = ((i2 & 112) == 32) | ((57344 & i2) == 16384);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                b2 = 0;
                objP2 = new zwy(hk00Var, function1, b2);
                fetVar.o0(objP2);
            } else {
                b2 = 0;
            }
            b8k0.e(mm40VarE, xczVarB, ch80VarF, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            if (mtlVar != null) {
                fetVar.e0(-357763878);
                cy2.b(null, mtlVar, function1, fetVar, (i2 >> 6) & 896);
                fetVar.r(false);
            } else {
                fetVar.e0(-357624533);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lwy(mm40Var, hk00Var, qdzVar, e2dVar, function1, i, (byte) 0);
        }
    }

    public static final void T(hyl hylVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(299444588);
        int i2 = (fetVar.g(hylVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            vxl vxlVar = vxl.b;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new hs80(function1, (byte) 17);
                fetVar.o0(objP);
            }
            ebc.r(null, hylVar, vxlVar, (Function1) objP, null, fetVar, ((i2 << 3) & 112) | 384, 41);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(hylVar, function1, i, (byte) 21);
        }
    }

    public static final void U(mm40 mm40Var, cll cllVar, fet fetVar, int i) {
        int i2;
        byte b2;
        jm40 jm40Var;
        boolean z;
        fet fetVar2 = fetVar;
        String str = cllVar.d;
        fetVar2.g0(881931958);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(cllVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(0.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar2, 0);
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
            int length = cllVar.c.length();
            jm40 jm40Var2 = jm40.b;
            if (length > 0) {
                fetVar2.e0(1118270082);
                mm40 mm40VarE0 = o2e.e0(o7k0.g(jm40Var2, 18.0f, 0.0f, 2), "DS_CARD_LINE_TITLE");
                int i3 = str.length() > 0 ? 1 : 2;
                String str2 = cllVar.c;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                jm40Var = jm40Var2;
                z = false;
                v8q0.a(str2, mm40VarE0, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), new n05(qmk.q, qmk.r, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, i3, 0, null, g1t0.m(), fetVar, 0, 384, 110576);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                z = false;
                fetVar2.e0(1118895042);
                fetVar2.r(false);
            }
            if (str.length() > 0) {
                fetVar2.e0(1118965970);
                mm40 mm40VarE1 = o2e.e0(o7k0.g(jm40Var, 14.0f, 0.0f, 2), "DS_CARD_LINE_SUBTITLE");
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                fet fetVar3 = fetVar2;
                b2 = 2;
                v8q0.a(str, mm40VarE1, ((StaticColors) fetVar2.k(m8m0.f21378a)).m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.g(), fetVar3, 0, 24960, 110584);
                fetVar2 = fetVar3;
                fetVar2.r(z);
            } else {
                b2 = 2;
                fetVar2.e0(1119360290);
                fetVar2.r(z);
            }
            fetVar2.r(true);
        } else {
            b2 = 2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl(mm40Var, cllVar, i, b2);
        }
    }

    public static final void V(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        boolean z;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1159884650);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new zbt0(function1, (byte) 28);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new zbt0(function1, (byte) 29);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            Object[] objArr = new Object[0];
            int i4 = i2 & 14;
            boolean z4 = i4 == 4;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new ybt0(l7m0Var, (byte) 14);
                fetVar.o0(objP3);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP3, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z5 = i4 == 4;
            Object objP4 = fetVar.P();
            if (z5 || objP4 == cl5Var) {
                objP4 = new ybt0(l7m0Var, (byte) 15);
                fetVar.o0(objP4);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP4, fetVar);
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
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
            imm immVar = (imm) l7m0VarY.getValue();
            boolean z6 = i3 == 32;
            Object objP5 = fetVar.P();
            if (z6 || objP5 == cl5Var) {
                objP5 = new ntu0(function1, (byte) 0);
                fetVar.o0(objP5);
            }
            hlm.c(null, immVar, null, (Function0) objP5, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            rtu0 rtu0Var = (rtu0) l7m0VarY2.getValue();
            if (rtu0Var != null) {
                if (rtu0Var instanceof otu0) {
                    fetVar.e0(-89983162);
                    j2e.F(o2e.e0(jm40.b, "VIRTUAL_RULES_CONTENT_SCREEN"), ((otu0) rtu0Var).f25847a, function1, fetVar, ((i2 << 3) & 896) | 6);
                    fetVar.r(false);
                } else {
                    if (rtu0Var instanceof qtu0) {
                        fetVar.e0(-89683454);
                        tke.P(0, fetVar, null);
                        fetVar.r(false);
                    } else if (rtu0Var instanceof ptu0) {
                        fetVar.e0(-89561314);
                        mdm mdmVar = ((ptu0) rtu0Var).f27582a;
                        boolean z7 = i3 == 32;
                        Object objP6 = fetVar.P();
                        if (z7 || objP6 == cl5Var) {
                            z = true;
                            objP6 = new ntu0(function1, (byte) 1);
                            fetVar.o0(objP6);
                        } else {
                            z = true;
                        }
                        o2e.V(null, mdmVar, (Function0) objP6, fetVar, 0);
                        fetVar.r(false);
                    }
                    fetVar.r(z);
                }
                z = true;
                fetVar.r(z);
            }
            throw b1j.f(-1388378320, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function1, i, (byte) 14);
        }
    }

    public static final void W(mm40 mm40Var, taa taaVar, fet fetVar, int i) {
        Pair pair;
        fetVar.g0(326699977);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(taaVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = taaVar.b.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(323319915);
                pair = new Pair(new y3d(((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU()), new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109));
                fetVar.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(426069189, fetVar, false);
                }
                fetVar.e0(323453246);
                pair = new Pair(new y3d(((StaticColors) fetVar.k(m8m0.f21378a)).m94getGamesTextVictory0d7_KjU()), new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109));
                fetVar.r(false);
            }
            v8q0.a(taaVar.f33604a, mm40Var, ((y3d) pair.f46059a).f41946a, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, (y9q0) pair.b, fetVar, (i2 << 3) & 112, 0, 130040);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t87(mm40Var, taaVar, i, (byte) 27);
        }
    }

    public static final void X(bw40 bw40Var, x5a x5aVar, t89 t89Var, float f, ljj0 ljj0Var, k5q0 k5q0Var, agc agcVar) {
        x5aVar.l();
        ArrayList arrayList = bw40Var.h;
        if (arrayList.size() <= 1 || (t89Var instanceof skk0)) {
            Y(bw40Var, x5aVar, t89Var, f, ljj0Var, k5q0Var, agcVar);
        } else {
            if (!(t89Var instanceof ijj0)) {
                t9f.b();
                return;
            }
            int size = arrayList.size();
            float fMax = 0.0f;
            float f2 = 0.0f;
            for (int i = 0; i < size; i++) {
                s03 s03Var = ((yn80) arrayList.get(i)).f42927a;
                f2 += s03Var.f;
                fMax = Math.max(fMax, s03Var.c());
            }
            Shader shaderB = ((ijj0) t89Var).b((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                s03 s03Var2 = ((yn80) arrayList.get(i2)).f42927a;
                s03Var2.f(x5aVar, new u89(shaderB), f, ljj0Var, k5q0Var, agcVar);
                x5aVar.g(0.0f, s03Var2.f);
                matrix.setTranslate(0.0f, -s03Var2.f);
                shaderB.setLocalMatrix(matrix);
            }
        }
        x5aVar.i();
    }

    public static final void Y(bw40 bw40Var, x5a x5aVar, t89 t89Var, float f, ljj0 ljj0Var, k5q0 k5q0Var, agc agcVar) {
        ArrayList arrayList = bw40Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yn80 yn80Var = (yn80) arrayList.get(i);
            yn80Var.f42927a.f(x5aVar, t89Var, f, ljj0Var, k5q0Var, agcVar);
            x5aVar.g(0.0f, yn80Var.f42927a.f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    public static final ArrayList Z(ctf0 ctf0Var, Long l, Double d2, ArrayList arrayList) {
        boolean z;
        String strF;
        String str;
        ctf0Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            hao haoVar = (hao) obj;
            if (l != null || d2 != null) {
                long j = haoVar.b;
                if (l != null && l.longValue() == j && Intrinsics.c(d2, haoVar.f)) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            haoVar.getClass();
            long j2 = haoVar.b;
            double d3 = haoVar.f;
            String strI = f140.i((int) d3, (j2 == 4564 || j2 == 4556 || (7199 <= j2 && j2 < 7203)) ? "+" : "");
            long j3 = haoVar.b;
            if (j3 == 4558 || j3 == 4566 || j3 == 7199 || j3 == 7201) {
                strF = ctf0Var.f(R.string.yes, new Object[0]);
            } else {
                if (j3 == 4559 || j3 == 4567 || j3 == 7200 || j3 == 7202) {
                    strF = ctf0Var.f(R.string.no, new Object[0]);
                } else {
                    str = "";
                }
                arrayList2.add(new ym6(j2, d3, strI, str, z));
                i = i2;
            }
            str = strF;
            arrayList2.add(new ym6(j2, d3, strI, str, z));
            i = i2;
        }
        return arrayList2;
    }

    public static final void a(mm40 mm40Var, String str, taa taaVar, taa taaVar2, taa taaVar3, fet fetVar, int i) {
        taa taaVar4;
        Object obj = taaVar;
        Object obj2 = taaVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1952794917);
        int i2 = i | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(obj) ? 256 : 128) | (fetVar2.g(obj2) ? 2048 : 1024) | (fetVar2.g(taaVar3) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 0.0f, 2.0f, 1);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 52.0f), 1.0f);
            tj30 tj30VarC2 = zq8.c(gqw0.h, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
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
            j0x.b(a8k0.F(R.drawable.bg_football_zones, 0, fetVar2), null, o7k0.p(jm40Var, 256.0f, 36.0f), null, null, 0.0f, null, fetVar2, 56, 120);
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.b);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarB);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            v8q0.a(str, null, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar, (i2 >> 3) & 14, 24960, 109562);
            fetVar2 = fetVar;
            obj = taaVar;
            obj2 = taaVar2;
            taaVar4 = taaVar3;
            kr00.a(u1c.M(22490236, new zb8(obj, obj2, (Object) taaVar4, (byte) 16), fetVar2), fetVar2, 6);
            fetVar2.r(true);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            taaVar4 = taaVar3;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) mm40Var, (Object) str, obj, obj2, (Object) taaVar4, i, (byte) 17);
        }
    }

    public static final j83 a0(ctf0 ctf0Var, boolean z) {
        if (!z) {
            return null;
        }
        h83 h83Var = new h83();
        h83 h83Var2 = new h83();
        String strA = ctf0Var.b.a(R.string.registration_bonus_rules_part1, Arrays.copyOf(new Object[0], 0));
        long j = y3d.g;
        long j2 = daq0.c;
        y9q0 y9q0VarG = g1t0.g();
        pz40 pz40Var = s6t0.f31722a;
        long secondary = s6t0.b().f33626a.getSecondary();
        j56 j56Var = new j56(0.0f);
        k5q0 k5q0Var = k5q0.b;
        smk0 smk0Var = new smk0(secondary, j2, null, null, null, null, null, j2, j56Var, null, null, j, k5q0Var, null, null, 17424);
        h83Var2.c(strA);
        StringBuilder sb = h83Var2.f12607a;
        int length = sb.length();
        h83Var2.a(smk0Var, 0, length);
        h83Var2.a(y9q0VarG.f42262a, 0, length);
        sb.length();
        h83Var.b(h83Var2.h());
        h83 h83Var3 = new h83();
        h83Var3.c(Separators.RETURN);
        StringBuilder sb2 = h83Var3.f12607a;
        sb2.length();
        sb2.length();
        h83Var.b(h83Var3.h());
        h83 h83Var4 = new h83();
        String strA2 = ctf0Var.b.a(R.string.registration_bonus_rules_part2, Arrays.copyOf(new Object[0], 0));
        y9q0 y9q0VarG2 = g1t0.g();
        smk0 smk0Var2 = new smk0(s6t0.b().f33626a.getSecondary(), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
        h83Var4.c(strA2);
        StringBuilder sb3 = h83Var4.f12607a;
        int length2 = sb3.length();
        h83Var4.a(smk0Var2, 0, length2);
        h83Var4.a(y9q0VarG2.f42262a, 0, length2);
        sb3.length();
        h83Var.b(h83Var4.h());
        return h83Var.h();
    }

    public static final void b(di0 di0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        byte b2;
        int i3;
        di0Var.getClass();
        fetVar.g0(117243028);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(di0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            b2 = 0;
            fetVar.X();
        } else if (di0Var instanceof bi0) {
            fetVar.e0(978862112);
            int i4 = ((Configuration) fetVar.k(dy2.f6873a)).screenWidthDp;
            if (i4 < 411) {
                i3 = 4;
            } else if (i4 < 640) {
                i3 = 5;
            } else {
                i3 = i4 < 768 ? 6 : 7;
            }
            ArrayList arrayList = ((bi0) di0Var).f2634a;
            int iE = l1e0.e(arrayList.size(), new IntRange(1, i3, 1));
            int size = ((arrayList.size() + iE) - 1) / iE;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.d(i120.Q(o7k0.e(jm40.b, ((size - 1) * 16.0f) + (80.0f * size) + 32.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.a(16.0f)), 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13);
            int i5 = i2;
            ngv ngvVar = new ngv(iE);
            qw3 qw3Var = new qw3(12.0f, true, new jf4((byte) 14));
            qw3 qw3Var2 = new qw3(16.0f, true, new jf4((byte) 14));
            boolean z = ((i5 & 14) == 4) | ((i5 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new k1(di0Var, function1, (byte) 21);
                fetVar.o0(objP);
            }
            b2 = 0;
            g8x.i(ngvVar, mm40VarN, null, null, qw3Var2, qw3Var, null, false, null, (Function1) objP, fetVar, 0, 924);
            fetVar.r(false);
        } else {
            b2 = 0;
            fetVar.e0(980573684);
            O(0, fetVar);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rh0(di0Var, function1, i, b2);
        }
    }

    public static final mm40 b0() {
        return new cff0();
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        mm40 mm40Var2;
        boolean z;
        function1.getClass();
        l7m0Var.getClass();
        fetVar.g0(-225999317);
        int i2 = i | 6 | (fetVar.i(function1) ? 32 : 16) | (fetVar.g(l7m0Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.runtime.d dVar = m8m0.f21378a;
            long jM62getBlack0d7_KjU = ((StaticColors) fetVar.k(dVar)).m62getBlack0d7_KjU();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o050.S(o050.W(i120.Q(jm40Var, jM62getBlack0d7_KjU, ljcVar)));
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE0 = o2e.e0(mm40VarS.e(n0qVar), "AGGREGATOR_GAMES_SCREEN");
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z2) {
                fetVar.l(function0);
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
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarD = o7k0.d(i120.Q(jm40Var, ((StaticColors) fetVar.k(dVar)).m62getBlack0d7_KjU(), ljcVar), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 56.0f);
            ugd ugdVarM = u1c.M(-1634930980, new cw0(l7m0Var, (byte) 0), fetVar);
            ugd ugdVarM2 = u1c.M(1240712285, new ag0(function1, (byte) 2), fetVar);
            ugd ugdVarM3 = u1c.M(-178611746, new ag0(function1, (byte) 3), fetVar);
            long jM62getBlack0d7_KjU2 = ((StaticColors) fetVar.k(dVar)).m62getBlack0d7_KjU();
            long jM62getBlack0d7_KjU3 = ((StaticColors) fetVar.k(dVar)).m62getBlack0d7_KjU();
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(dVar)).m123getWhite0d7_KjU();
            long jM123getWhite0d7_KjU2 = ((StaticColors) fetVar.k(dVar)).m123getWhite0d7_KjU();
            long jM123getWhite0d7_KjU3 = ((StaticColors) fetVar.k(dVar)).m123getWhite0d7_KjU();
            kyq0 kyq0Var = new kyq0(jM62getBlack0d7_KjU2, jM62getBlack0d7_KjU3, jM123getWhite0d7_KjU, jM123getWhite0d7_KjU3, jM123getWhite0d7_KjU2, jM123getWhite0d7_KjU3);
            View view = (View) fetVar.k(dy2.f);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            int width = view.getWidth();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.e(new fh80(0.0f, 0.0f, 15));
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            WeakHashMap weakHashMap = djv0.w;
            int i3 = zcm0.i(fetVar).f.e().b;
            String string = i120.O(zcm0.i(fetVar).b, fetVar).toString();
            boolean zI = fetVar.i(view) | fetVar.e(width) | fetVar.e(i3) | fetVar.g(w6kVar);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new mw0(view, width, i3, w6kVar, pz40Var, null);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, string, (Function2) objP2);
            mm40 mm40VarE1 = o2e.e0(s5x0.I(mm40VarE, (hh80) pz40Var.getValue()), "GAME_TOOLBAR");
            zx7 zx7Var2 = gqw0.e;
            tj30 tj30VarC2 = zq8.c(zx7Var2, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE1);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            ob3.a(ugdVarM, s5x0.J(jm40Var, 0.0f), ugdVarM2, u1c.M(-631726091, new kw0(l7m0Var, ugdVarM3), fetVar), 0.0f, null, kyq0Var, fetVar, 3510);
            fetVar.r(true);
            String str = ((nw0) l7m0Var.getValue()).b;
            if (str == null) {
                fetVar.e0(909729263);
                fetVar.r(false);
                function2 = function1;
            } else {
                fetVar.e0(909729264);
                mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 4.0f, 1);
                boolean z3 = (i2 & 112) == 32;
                Object objP3 = fetVar.P();
                if (z3 || objP3 == obj) {
                    function2 = function1;
                    objP3 = new nr0(function2, (byte) 2);
                    fetVar.o0(objP3);
                } else {
                    function2 = function1;
                }
                g8x.g(mm40VarL, str, (Function0) objP3, fetVar, 0);
                fetVar.r(false);
            }
            ohq0.g(o2e.e0(n0qVar, "AGGREGATOR_GAME_WEB_VIEW"), ((nw0) l7m0Var.getValue()).h, fetVar, 6);
            fetVar.r(true);
            if (((nw0) l7m0Var.getValue()).g) {
                fetVar.e0(-1683721087);
                Object objP4 = fetVar.P();
                if (objP4 == obj) {
                    objP4 = new mg0((byte) 19);
                    fetVar.o0(objP4);
                }
                mm40 mm40VarQ = i120.Q(y860.W(n0qVar, null, null, false, null, (Function0) objP4, 28), ((StaticColors) fetVar.k(dVar)).m70getBlack200d7_KjU(), ljcVar);
                tj30 tj30VarC3 = zq8.c(zx7Var, false);
                int iHashCode4 = Long.hashCode(fetVar.T);
                bh90 bh90VarM4 = fetVar.m();
                mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarQ);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC3, shdVar);
                jpm0.o(fetVar, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC3, shdVar4);
                kpb.j(jr8.f16991a.b(jm40Var, zx7Var2), null, fetVar, 0, 2);
                z = true;
                fetVar.r(true);
                fetVar.r(false);
            } else {
                z = true;
                fetVar.e0(-1683263651);
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
            yfe0VarU.d = new kr0(mm40Var2, function2, l7m0Var, i, (byte) 1);
        }
    }

    public static final mm40 c0(e7q0 e7q0Var) {
        return new x4q0(e7q0Var);
    }

    public static final void d(mm40 mm40Var, cv1 cv1Var, xcz xczVar, d9z d9zVar, xcz xczVar2, xcz xczVar3, Function1 function1, fet fetVar, int i) {
        cv1Var.getClass();
        bv1 bv1Var = cv1Var.b;
        xczVar.getClass();
        d9zVar.getClass();
        xczVar2.getClass();
        xczVar3.getClass();
        function1.getClass();
        fetVar.g0(908007337);
        int i2 = i | (fetVar.g(cv1Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.g(d9zVar) ? 2048 : 1024) | (fetVar.g(xczVar2) ? 16384 : 8192) | (fetVar.g(xczVar3) ? 131072 : 65536) | (fetVar.i(function1) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            int iOrdinal = bv1Var.ordinal();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new c51((byte) 15);
                fetVar.o0(objP);
            }
            byte b2 = 2;
            kwj kwjVarB = zk80.b(iOrdinal, (Function0) objP, fetVar, 384, 2);
            boolean zG = fetVar.g(kwjVarB) | ((i2 & 112) == 32);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new wt1(cv1Var, kwjVarB, null, b2);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, bv1Var, (Function2) objP2);
            q5x.e(kwjVarB, mm40Var, null, null, q3d.i(bv1.g), 0.0f, null, null, false, null, null, null, null, u1c.M(-1438291320, new ut1(cv1Var, xczVar, function1, d9zVar, xczVar2, xczVar3, (byte) 2), fetVar), fetVar, 100663344, 24576, 16108);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vt1(mm40Var, cv1Var, xczVar, d9zVar, xczVar2, xczVar3, function1, i, (byte) 2);
        }
    }

    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59, types: [a.bzw, a.y3d] */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68, types: [a.bzw, a.y3d] */
    /* JADX WARN: Type inference failed for: r1v69 */
    public static final sno0 d0(d140 d140Var, ctf0 ctf0Var, qho qhoVar, String str) {
        String str2;
        Iterable iterableA0;
        my30 jy30Var;
        bzw bzwVar;
        gy30 gy30Var;
        gy30 gy30Var2;
        gy30 gy30Var3;
        ?? r1;
        int i;
        wx30 ux30Var;
        ?? r2;
        int i2;
        wx30 ux30Var2;
        ctf0Var.getClass();
        str.getClass();
        Map map = d140Var.q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
        Iterator it = map.entrySet().iterator();
        while (true) {
            bzw bzwVar2 = null;
            if (!it.hasNext()) {
                String str3 = d140Var.u;
                List listL0 = CollectionsKt.L0(d140Var.r);
                Set<r040> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList();
                for (r040 r040Var : setKeySet) {
                    List list = (List) linkedHashMap.get(r040Var);
                    if (list != null) {
                        str2 = str3;
                        iterableA0 = xww.a0(list, listL0, r040Var, ctf0Var, qhoVar, str2, new x7(r040Var, (byte) 1));
                    } else {
                        str2 = str3;
                        iterableA0 = null;
                    }
                    if (iterableA0 == null) {
                        iterableA0 = iun.f15405a;
                    }
                    w3d.u(arrayList, CollectionsKt.N(iterableA0));
                    str3 = str2;
                }
                return new sno0(dyb.o0(arrayList), d140Var.l);
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            r040 r040Var2 = (r040) entry.getKey();
            List list2 = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                nw30 nw30VarK0 = yyw.k0((yx10) it2.next(), ctf0Var, qhoVar, d140Var.x, r040Var2, d140Var.w, d140Var.y, str);
                boolean z = (nw30VarK0 instanceof hw30) || (nw30VarK0 instanceof pv30);
                if ((nw30VarK0 instanceof ew30) || (nw30VarK0 instanceof iw30) || (nw30VarK0 instanceof nv30) || (nw30VarK0 instanceof ov30) || (nw30VarK0 instanceof rv30) || (nw30VarK0 instanceof sv30) || (nw30VarK0 instanceof tv30) || (nw30VarK0 instanceof xv30) || (nw30VarK0 instanceof yv30) || (nw30VarK0 instanceof aw30) || (nw30VarK0 instanceof zv30) || (nw30VarK0 instanceof uv30) || (nw30VarK0 instanceof mw30) || (nw30VarK0 instanceof cw30) || (nw30VarK0 instanceof qv30) || (nw30VarK0 instanceof jw30) || (nw30VarK0 instanceof dw30) || (nw30VarK0 instanceof lw30) || (nw30VarK0 instanceof vv30) || (nw30VarK0 instanceof wv30) || (nw30VarK0 instanceof bw30)) {
                    jy30Var = new jy30(nw30VarK0.m(), nw30VarK0.n(), z, yyw.g0(nw30VarK0), yyw.h0(nw30VarK0), h0(nw30VarK0));
                } else {
                    if (nw30VarK0 instanceof kw30) {
                        jy30Var = xww.Y((kw30) nw30VarK0);
                    } else {
                        iz30 iz30VarM = nw30VarK0.m();
                        r040 r040VarN = nw30VarK0.n();
                        int iF = hne.F(nw30VarK0);
                        ey30 ey30Var = ey30.f8608a;
                        liz lizVar = liz.f20129a;
                        switch (iF) {
                            case 0:
                                it = it;
                                it2 = it2;
                                bzwVar = bzwVar2;
                                nw30VarK0 = nw30VarK0;
                                gy30Var = ((pv30) nw30VarK0).b;
                                break;
                            case 1:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                ew30 ew30Var = (ew30) nw30VarK0;
                                ux30 ux30Var3 = new ux30(10, 0L, ew30Var.e, ew30Var.f);
                                int i3 = ew30Var.d;
                                bzwVar = null;
                                gy30Var = new gy30(ux30Var3, new rx30(new m0x(i3, null, 6), 0L, ew30Var.b ? new kiz(new rf5(3, null)) : lizVar, i3, 0L, null, 498), ey30Var, 0L, null, null, 248);
                                break;
                            case 2:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                mw30 mw30Var = (mw30) nw30VarK0;
                                ux30 ux30Var4 = new ux30(10, 0L, mw30Var.e, mw30Var.f);
                                int i4 = mw30Var.d;
                                gy30Var = new gy30(ux30Var4, new rx30(new m0x(i4, null, 6), 0L, mw30Var.f22484a ? new kiz(new rf5(3, null)) : lizVar, i4, 0L, null, 498), new by30(mw30Var.g), 0L, null, null, 248);
                                bzwVar = null;
                                break;
                            case 3:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                fw30 fw30Var = (fw30) nw30VarK0;
                                ux30 ux30Var5 = new ux30(10, 0L, fw30Var.h, "");
                                pz40 pz40Var = s6t0.f31722a;
                                gy30Var = new gy30(ux30Var5, new rx30(new n0x(fw30Var.e), 0L, fw30Var.f10240a ? new kiz(new rf5(3, null)) : lizVar, R.drawable.sport_new, 0L, new qc5(null, new n0x(fw30Var.f), y3d.a(s6t0.a().getBackground())), 434), new zx30(new n0x(fw30Var.i), 3), 0L, null, null, 248);
                                bzwVar = null;
                                break;
                            case 4:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                iw30 iw30Var = (iw30) nw30VarK0;
                                ux30 ux30Var6 = new ux30(10, 0L, iw30Var.e, iw30Var.f);
                                int i5 = iw30Var.d;
                                rx30 rx30Var = new rx30(new m0x(i5, null, 6), 0L, iw30Var.b ? new kiz(new rf5(3, null)) : lizVar, i5, 0L, null, 498);
                                rpe rpeVar = new rpe(iw30Var.g);
                                pz40 pz40Var2 = s6t0.f31722a;
                                StaticColors staticColors = StaticColors.INSTANCE;
                                gy30Var = new gy30(ux30Var6, rx30Var, new dy30(rpeVar, new kpe(staticColors.m113getRed0d7_KjU(), staticColors.m123getWhite0d7_KjU())), 0L, null, null, 248);
                                bzwVar = null;
                                break;
                            case 5:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                qv30 qv30Var = (qv30) nw30VarK0;
                                ux30 ux30Var7 = new ux30(10, 0L, qv30Var.e, qv30Var.f);
                                int i6 = qv30Var.d;
                                gy30Var = new gy30(ux30Var7, new rx30(new m0x(i6, null, 6), 0L, qv30Var.b ? new kiz(new rf5(3, null)) : lizVar, i6, 0L, null, 498), new zx30(new n0x(qv30Var.g), 3), 0L, null, null, 248);
                                bzwVar = null;
                                break;
                            case 6:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                jw30 jw30Var = (jw30) nw30VarK0;
                                ux30 ux30Var8 = new ux30(10, 0L, jw30Var.e, jw30Var.f);
                                int i7 = jw30Var.d;
                                gy30Var = new gy30(ux30Var8, new rx30(new m0x(i7, null, 6), 0L, jw30Var.b ? new kiz(new rf5(3, null)) : lizVar, i7, 0L, null, 498), new zx30(new n0x(jw30Var.g), 3), 0L, null, null, 248);
                                bzwVar = null;
                                break;
                            case 7:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                dw30 dw30Var = (dw30) nw30VarK0;
                                ux30 ux30Var9 = new ux30(10, 0L, dw30Var.e, dw30Var.f);
                                int i8 = dw30Var.d;
                                gy30Var = new gy30(ux30Var9, new rx30(new m0x(i8, null, 6), 0L, dw30Var.b ? new kiz(new rf5(3, null)) : lizVar, i8, 0L, null, 498), new zx30(new n0x(dw30Var.g), 3), 0L, null, null, 248);
                                bzwVar = null;
                                break;
                            case 8:
                                nw30VarK0 = nw30VarK0;
                                uv30 uv30Var = (uv30) nw30VarK0;
                                ux30 ux30Var10 = new ux30(10, 0L, uv30Var.e, uv30Var.f);
                                int i9 = uv30Var.d;
                                gy30Var2 = new gy30(ux30Var10, new rx30(new m0x(i9, null, 6), 0L, uv30Var.b ? new kiz(new rf5(3, null)) : lizVar, i9, 0L, null, 498), new zx30(new m0x(uv30Var.g, null, 6), 3), 0L, null, null, 248);
                                gy30Var = gy30Var2;
                                bzwVar = null;
                                break;
                            case 9:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                ov30 ov30Var = (ov30) nw30VarK0;
                                ux30 ux30Var11 = new ux30(10, 0L, ov30Var.i, ov30Var.j);
                                pc5 pc5Var = new pc5(y3d.a(ov30Var.f));
                                gy30Var = new gy30(ux30Var11, new rx30(new n0x(ov30Var.d), ov30Var.e, ov30Var.f25907a ? new kiz(new rf5(3, null)) : lizVar, ov30Var.g, ov30Var.h, pc5Var, Response.UNSUPPORTED_URI_SCHEME), ey30Var, 0L, null, null, 248);
                                bzwVar = null;
                                break;
                            case 10:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                rv30 rv30Var = (rv30) nw30VarK0;
                                List list3 = rv30Var.k;
                                String str4 = rv30Var.h;
                                pz40 pz40Var3 = s6t0.f31722a;
                                StaticColors staticColors2 = StaticColors.INSTANCE;
                                ux30 ux30Var12 = new ux30(staticColors2.m123getWhite0d7_KjU(), staticColors2.m131getWhite800d7_KjU(), str4, rv30Var.i);
                                pc5 pc5Var2 = new pc5(y3d.a(rv30Var.g));
                                int i10 = rv30Var.e;
                                gy30Var3 = new gy30(ux30Var12, new rx30(new m0x(i10, null, 6), rv30Var.f, rv30Var.b ? new kiz(new rf5(3, null)) : lizVar, i10, 0L, pc5Var2, 432), new zx30(new m0x(rv30Var.j, rv30Var.l, 4), 3), 0L, list3, null, 216);
                                gy30Var = gy30Var3;
                                bzwVar = null;
                                break;
                            case 11:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                sv30 sv30Var = (sv30) nw30VarK0;
                                long j = sv30Var.j;
                                String str5 = sv30Var.g;
                                pz40 pz40Var4 = s6t0.f31722a;
                                StaticColors staticColors3 = StaticColors.INSTANCE;
                                ux30 ux30Var13 = new ux30(staticColors3.m123getWhite0d7_KjU(), staticColors3.m131getWhite800d7_KjU(), str5, sv30Var.h);
                                int i11 = sv30Var.d;
                                gy30Var3 = new gy30(ux30Var13, new rx30(new m0x(i11, null, 6), 0L, sv30Var.b ? new kiz(new rf5(3, null)) : lizVar, i11, 0L, new pc5(y3d.a(sv30Var.f)), 434), new zx30(new m0x(sv30Var.i, null, 6), 3), j, null, null, 240);
                                gy30Var = gy30Var3;
                                bzwVar = null;
                                break;
                            case 12:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                nv30 nv30Var = (nv30) nw30VarK0;
                                boolean z2 = nv30Var.g;
                                String str6 = nv30Var.e;
                                String str7 = nv30Var.f;
                                if (z2) {
                                    r1 = 0;
                                    i = 6;
                                    ux30Var = new vx30(str6, str7, new m0x(R.drawable.ic_status_green_check_circle, null, 6));
                                } else {
                                    r1 = 0;
                                    i = 6;
                                    ux30Var = new ux30(10, 0L, str6, str7);
                                }
                                int i12 = nv30Var.d;
                                new gy30(ux30Var, new rx30(new m0x(i12, r1, i), 0L, nv30Var.b ? new kiz(new rf5(3, r1)) : lizVar, i12, 0L, null, 498), ey30Var, 0L, null, null, 248);
                                bzwVar = null;
                                break;
                            case 13:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                tv30 tv30Var = (tv30) nw30VarK0;
                                long j2 = tv30Var.i;
                                String str8 = tv30Var.f;
                                pz40 pz40Var5 = s6t0.f31722a;
                                StaticColors staticColors4 = StaticColors.INSTANCE;
                                ux30 ux30Var14 = new ux30(staticColors4.m123getWhite0d7_KjU(), staticColors4.m131getWhite800d7_KjU(), str8, tv30Var.g);
                                int i13 = tv30Var.c;
                                gy30Var3 = new gy30(ux30Var14, new rx30(new m0x(i13, null, 6), tv30Var.d, tv30Var.f34580a ? new kiz(new rf5(3, null)) : lizVar, i13, 0L, new pc5(y3d.a(tv30Var.e)), 432), new zx30(new m0x(tv30Var.h, null, 6), 3), j2, null, null, 240);
                                gy30Var = gy30Var3;
                                bzwVar = null;
                                break;
                            case 14:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                lw30 lw30Var = (lw30) nw30VarK0;
                                gy30Var = new gy30(new ux30(14, 0L, lw30Var.g, (String) null), new rx30(new n0x(lw30Var.f), 0L, lw30Var.f20744a ? new kiz(new rf5(3, null)) : lizVar, R.drawable.ic_glyph_language, 0L, null, 498), ey30Var, 0L, null, null, 248);
                                bzwVar = null;
                                break;
                            case 15:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                vv30 vv30Var = (vv30) nw30VarK0;
                                boolean z3 = vv30Var.g;
                                String str9 = vv30Var.e;
                                String str10 = vv30Var.f;
                                if (z3) {
                                    r2 = 0;
                                    i2 = 6;
                                    ux30Var2 = new vx30(str9, str10, new m0x(R.drawable.ic_status_green_check_circle, null, 6));
                                } else {
                                    r2 = 0;
                                    i2 = 6;
                                    ux30Var2 = new ux30(10, 0L, str9, str10);
                                }
                                int i14 = vv30Var.d;
                                new gy30(ux30Var2, new rx30(new m0x(i14, r2, i2), 0L, vv30Var.b ? new kiz(new rf5(3, r2)) : lizVar, i14, 0L, null, 498), ey30Var, 0L, null, null, 248);
                                bzwVar = null;
                                break;
                            case 16:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                wv30 wv30Var = (wv30) nw30VarK0;
                                gy30Var = new gy30(new ux30(10, 0L, wv30Var.f, wv30Var.g), new rx30(new n0x(wv30Var.d), 0L, wv30Var.f39822a ? new kiz(new rf5(3, null)) : lizVar, wv30Var.e, 0L, null, 498), ey30Var, 0L, null, null, 248);
                                bzwVar = null;
                                break;
                            case 17:
                                it = it;
                                it2 = it2;
                                nw30VarK0 = nw30VarK0;
                                xv30 xv30Var = (xv30) nw30VarK0;
                                List list4 = xv30Var.k;
                                String str11 = xv30Var.h;
                                pz40 pz40Var6 = s6t0.f31722a;
                                StaticColors staticColors5 = StaticColors.INSTANCE;
                                ux30 ux30Var15 = new ux30(staticColors5.m123getWhite0d7_KjU(), staticColors5.m131getWhite800d7_KjU(), str11, xv30Var.i);
                                pc5 pc5Var3 = new pc5(y3d.a(xv30Var.g));
                                int i15 = xv30Var.e;
                                gy30Var3 = new gy30(ux30Var15, new rx30(new m0x(i15, null, 6), xv30Var.f, xv30Var.b ? new kiz(new rf5(3, null)) : lizVar, i15, 0L, pc5Var3, 432), new zx30(new m0x(xv30Var.j, xv30Var.l, 4), 3), 0L, list4, null, 216);
                                gy30Var = gy30Var3;
                                bzwVar = null;
                                break;
                            case 18:
                                it = it;
                                it2 = it2;
                                yv30 yv30Var = (yv30) nw30VarK0;
                                long j3 = yv30Var.j;
                                String str12 = yv30Var.g;
                                pz40 pz40Var7 = s6t0.f31722a;
                                StaticColors staticColors6 = StaticColors.INSTANCE;
                                ux30 ux30Var16 = new ux30(staticColors6.m123getWhite0d7_KjU(), staticColors6.m131getWhite800d7_KjU(), str12, yv30Var.h);
                                int i16 = yv30Var.d;
                                gy30Var3 = new gy30(ux30Var16, new rx30(new m0x(i16, null, 6), yv30Var.e, yv30Var.b ? new kiz(new rf5(3, null)) : lizVar, i16, 0L, null, 496), new zx30(new m0x(yv30Var.i, null, 6), 3), j3, null, null, 240);
                                gy30Var = gy30Var3;
                                bzwVar = null;
                                break;
                            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                zv30 zv30Var = (zv30) nw30VarK0;
                                ux30 ux30Var17 = new ux30(10, 0L, zv30Var.e, zv30Var.f);
                                int i17 = zv30Var.d;
                                gy30Var2 = new gy30(ux30Var17, new rx30(new m0x(i17, null, 6), 0L, zv30Var.b ? new kiz(new rf5(3, null)) : lizVar, i17, 0L, null, 498), new zx30(new m0x(zv30Var.g, null, 6), 3), 0L, null, null, 248);
                                nw30VarK0 = nw30VarK0;
                                gy30Var = gy30Var2;
                                bzwVar = null;
                                break;
                            case 20:
                                aw30 aw30Var = (aw30) nw30VarK0;
                                ux30 ux30Var18 = new ux30(10, 0L, aw30Var.e, aw30Var.f);
                                int i18 = aw30Var.d;
                                gy30Var = new gy30(ux30Var18, new rx30(new m0x(i18, null, 6), 0L, aw30Var.b ? new kiz(new rf5(3, null)) : lizVar, i18, 0L, null, 498), ey30Var, 0L, null, null, 248);
                                nw30VarK0 = nw30VarK0;
                                bzwVar = null;
                                break;
                            case 21:
                                bw30 bw30Var = (bw30) nw30VarK0;
                                gy30Var = new gy30(new ux30(14, 0L, bw30Var.g, (String) null), new rx30(new n0x(bw30Var.f), 0L, bw30Var.f3307a ? new kiz(new rf5(3, null)) : lizVar, R.drawable.ic_glyph_language, 0L, null, 498), ey30Var, 0L, null, null, 248);
                                nw30VarK0 = nw30VarK0;
                                bzwVar = null;
                                break;
                            case 22:
                                cw30 cw30Var = (cw30) nw30VarK0;
                                ux30 ux30Var19 = new ux30(10, 0L, cw30Var.e, cw30Var.f);
                                int i19 = cw30Var.d;
                                gy30Var = new gy30(ux30Var19, new rx30(new m0x(i19, null, 6), 0L, cw30Var.f5062a ? new kiz(new rf5(3, null)) : lizVar, i19, 0L, null, 498), new by30(cw30Var.g), 0L, null, null, 248);
                                nw30VarK0 = nw30VarK0;
                                bzwVar = null;
                                break;
                            case 23:
                                gw30 gw30Var = (gw30) nw30VarK0;
                                ux30 ux30Var20 = new ux30(10, 0L, gw30Var.h, "");
                                pz40 pz40Var8 = s6t0.f31722a;
                                gy30Var3 = new gy30(ux30Var20, new rx30(new n0x(gw30Var.e), 0L, gw30Var.f12006a ? new kiz(new rf5(3, null)) : lizVar, R.drawable.sport_new, 0L, new qc5(null, new n0x(gw30Var.f), y3d.a(s6t0.a().getBackground())), 434), new zx30(new n0x(gw30Var.i), 3), 0L, null, null, 248);
                                nw30VarK0 = nw30VarK0;
                                gy30Var = gy30Var3;
                                bzwVar = null;
                                break;
                            default:
                                ux30 ux30Var21 = new ux30(10, 0L, "", "");
                                zcl zclVar = qmk.f28987a;
                                m0x m0xVar = new m0x(0, bzwVar2, 6);
                                pz40 pz40Var9 = s6t0.f31722a;
                                gy30Var = new gy30(ux30Var21, new qx30(m0xVar, s6t0.a().getPrimary(), lizVar, R.drawable.ic_glyph_language, 40.0f, 16), ey30Var, 0L, null, null, 248);
                                it = it;
                                it2 = it2;
                                bzwVar = bzwVar2;
                                nw30VarK0 = nw30VarK0;
                                break;
                        }
                        jy30Var = new ky30(iz30VarM, r040VarN, gy30Var, z, yyw.g0(nw30VarK0), yyw.h0(nw30VarK0));
                    }
                    arrayList2.add(jy30Var);
                    bzwVar2 = bzwVar;
                    it = it;
                    it2 = it2;
                }
                it = it;
                it2 = it2;
                bzwVar = bzwVar2;
                arrayList2.add(jy30Var);
                bzwVar2 = bzwVar;
                it = it;
                it2 = it2;
            }
            linkedHashMap.put(key, xww.T(arrayList2));
            it = it;
        }
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1597845846);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = s5x0.N(s5x0.L(jm40Var, f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 0.0f, 13).e(o7k0.c);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            ntr.g(0, fetVar, null);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            eeq.g(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), false, fetVar, 0, 2);
            ntr.g(0, fetVar, null);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i, (byte) 16);
        }
    }

    public static final c84 e0(j84 j84Var) {
        j84Var.getClass();
        String str = j84Var.e;
        String str2 = j84Var.b;
        if (str == null) {
            str = "";
        }
        String str3 = j84Var.f16068a;
        if (str3 == null) {
            str3 = "";
        }
        String strConcat = str3.concat((str2 == null || str2.length() == 0) ? "" : ", ".concat(str2));
        Long l = j84Var.c;
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer num = j84Var.f;
        va80 va80VarF = num != null ? fww.F(num.intValue()) : va80.b;
        String str4 = j84Var.h;
        String str5 = str4 != null ? str4 : "";
        Boolean bool = j84Var.j;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = j84Var.k;
        return new c84(str, strConcat, jLongValue, va80VarF, str5, zBooleanValue, bool2 != null ? bool2.booleanValue() : false);
    }

    public static final void f(l85 l85Var, Function0 function0, fet fetVar, int i) {
        fet fetVar2;
        l85Var.getClass();
        fetVar.g0(1806372440);
        int i2 = (fetVar.g(l85Var) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 1.0f), 54.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarW = y860.W(i120.Q(mm40VarE, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), null, null, false, null, function0, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 12.0f, 0.0f, 8.0f, 0.0f, 10);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
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
            dww.b(jpm0.t(R.drawable.ic_glyph_promo_aggregator, 6, fetVar), null, o7k0.n(jm40Var, 24.0f), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fetVar, 48, 0);
            C(0, fetVar, dw9.h(1.0f, s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), true), l85Var.f19591a, l85Var.b);
            fetVar2 = fetVar;
            dww.b(jpm0.t(R.drawable.ic_glyph_chevron_right_small, 6, fetVar), null, o7k0.n(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 20.0f), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), fetVar2, 48, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sr1(l85Var, function0, i, (byte) 21);
        }
    }

    public static final jg7 f0(BetZip betZip) {
        double d2 = betZip.b;
        long j = betZip.c;
        double d3 = betZip.d;
        boolean z = betZip.f;
        long j2 = betZip.f46426a;
        String str = betZip.g;
        String strQ = w6x.q(betZip.u, ": ", betZip.t);
        EventParams eventParams = betZip.i1;
        return new jg7(d2, j, d3, z, j2, str, strQ, new cfo(eventParams.f46427a, eventParams.b));
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2;
        String str2;
        fetVar.g0(-79054237);
        int i2 = (fetVar.g(str) ? 32 : 16) | i;
        byte b2 = 3;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2 = fetVar;
            str2 = str;
            k7x.a(str2, null, o7k0.d(mm40Var, 1.0f), gqw0.Z, null, fetVar2, ((i2 >> 3) & 14) | 1769520, 1944);
        } else {
            fetVar2 = fetVar;
            str2 = str;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str2, i, b2);
        }
    }

    public static final lla g0(c2w c2wVar, v5l0 v5l0Var, ctf0 ctf0Var, List list, boolean z, String str, boolean z2, boolean z3, String str2, boolean z4, boolean z5) {
        lla glaVar;
        c2w c2wVar2;
        a2m y1mVar;
        c2wVar.getClass();
        List list2 = c2wVar.n;
        boolean z6 = c2wVar.t;
        String str3 = c2wVar.s;
        String str4 = c2wVar.r;
        a2w a2wVar = c2wVar.p;
        a2w a2wVar2 = c2wVar.o;
        v5l0Var.getClass();
        ctf0Var.getClass();
        list.getClass();
        str.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            tma tmaVar = new tma(o2e.l0(c2wVar, list, z2, z3, str2, z5), null, 14);
            uzm uzmVarA = g7w.a(a2wVar2, true);
            uzm uzmVarA2 = g7w.a(a2wVar, true);
            hpm hpmVar = new hpm(0L, 3);
            int length = str4.length();
            opm opmVar = opm.f25648a;
            mpm lpmVar = (length == 0 && str3.length() == 0) ? new lpm(opmVar, hpmVar) : new kpm(opmVar, hpmVar, d5c.O(str4, str3, false, false, hpmVar));
            jwm jwmVar = new jwm(saj.T(c2wVar, ctf0Var));
            jwm jwmVar2 = new jwm(saj.U(c2wVar, z4));
            uso0 uso0Var = uso0.f36223a;
            glaVar = new gla(tmaVar, new rla(uzmVarA, uzmVarA2, lpmVar, jwmVar, jwmVar2, null), (!z6 || (cy7.c() && z4)) ? null : new dem(c2wVar.f3644a, ctf0Var.b.a(R.string.additional_info, Arrays.copyOf(new Object[0], 0)), cfx0.N(list2), z), c2wVar.f3644a);
        } else if (iOrdinal == 1) {
            xma xmaVar = new xma(o2e.l0(c2wVar, list, z2, z3, str2, z5), null, dj8.a0(c2wVar, z, z4), 6);
            vzm vzmVarB = g7w.b(a2wVar2, str4);
            vzm vzmVarB2 = g7w.b(a2wVar, str3);
            jwm jwmVar3 = new jwm(saj.T(c2wVar, ctf0Var));
            jwm jwmVar4 = new jwm(saj.U(c2wVar, z4));
            uso0 uso0Var2 = uso0.f36223a;
            glaVar = new kla(xmaVar, new pma(vzmVarB, vzmVarB2, jwmVar3, jwmVar4, null), (z6 && z && (!cy7.c() || !z4)) ? new eem(cfx0.N(list2)) : null, c2wVar.f3644a);
        } else if (iOrdinal != 2) {
            c2m c2mVar = c2m.f3631a;
            if (iOrdinal == 3) {
                vma vmaVar = new vma(o2e.l0(c2wVar, list, z2, z3, str2, z5), new b4i(saj.T(c2wVar, ctf0Var), 2), dj8.a0(c2wVar, z, z4));
                xzm xzmVar = new xzm(a2wVar2.f144a, g7w.d(a2wVar2));
                xzm xzmVar2 = new xzm(a2wVar.f144a, g7w.d(a2wVar));
                x1m x1mVar = new x1m();
                if (str4.length() == 0 && str3.length() == 0) {
                    z1m z1mVar = new z1m(c2mVar);
                    c2wVar2 = c2wVar;
                    y1mVar = z1mVar;
                } else {
                    c2wVar2 = c2wVar;
                    y1mVar = new y1m(c2mVar, x1mVar, str4, str3, false, false);
                }
                jwm jwmVar5 = new jwm(saj.U(c2wVar2, z4));
                uso0 uso0Var3 = uso0.f36223a;
                dma dmaVar = new dma(xzmVar, xzmVar2, y1mVar, jwmVar5, null);
                gem gemVar = (z6 && z && (!cy7.c() || !z4)) ? new gem(cfx0.N(list2)) : null;
                long j = c2wVar2.f3644a;
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
                glaVar = new ila(j, gemVar, vmaVar, dmaVar, new n0x(sb.toString()));
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                uma umaVar = new uma(o2e.l0(c2wVar, list, z2, z3, str2, z5), null, dj8.a0(c2wVar, z, z4), 6);
                yzm yzmVar = new yzm(a2wVar2.f144a, g7w.d(a2wVar2));
                yzm yzmVar2 = new yzm(a2wVar.f144a, g7w.d(a2wVar));
                a2m z1mVar2 = (str4.length() == 0 && str3.length() == 0) ? new z1m(c2mVar) : new y1m(c2mVar, new x1m(), str4, str3, false, false);
                String strT = saj.T(c2wVar, ctf0Var);
                jwm jwmVar6 = new jwm(saj.U(c2wVar, z4));
                uso0 uso0Var4 = uso0.f36223a;
                glaVar = new hla(umaVar, new xla(yzmVar, yzmVar2, z1mVar2, strT, jwmVar6, null), tke.g0(c2wVar, z, z4), c2wVar.f3644a);
            }
        } else {
            wma wmaVar = new wma(o2e.l0(c2wVar, list, z2, z3, str2, z5), null, dj8.a0(c2wVar, z, z4), 6);
            wzm wzmVar = new wzm(a2wVar2.f144a, g7w.d(a2wVar2), str4);
            wzm wzmVar2 = new wzm(a2wVar.f144a, g7w.d(a2wVar), str3);
            String strA = ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
            jwm jwmVar7 = new jwm(saj.T(c2wVar, ctf0Var));
            jwm jwmVar8 = new jwm(saj.U(c2wVar, z4));
            uso0 uso0Var5 = uso0.f36223a;
            glaVar = new jla(wmaVar, new jma(wzmVar, wzmVar2, strA, jwmVar7, jwmVar8, null), tke.g0(c2wVar, z, z4), c2wVar.f3644a);
        }
        return glaVar;
    }

    public static final void h(imm immVar, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        imm immVar2;
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(404223673);
        if ((i & 6) == 0) {
            immVar2 = immVar;
            i2 = (fetVar2.g(immVar2) ? 4 : 2) | i;
        } else {
            immVar2 = immVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(mdmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
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
            mm40 mm40VarW = o050.W(jm40.b);
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            boolean z3 = z2;
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new m040(function1, (byte) 25);
                fetVar2.o0(objP);
            }
            int i3 = i2;
            hlm.c(mm40VarW, immVar2, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, (i2 << 3) & 112, 0, 4084);
            fetVar2 = fetVar;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new ec40((byte) 14);
                fetVar2.o0(objP2);
            }
            jcb.l(null, mdmVar, false, (Function0) objP2, fetVar2, (i3 & 112) | 3072, 5);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cf7(immVar, mdmVar, function1, i, (byte) 4);
        }
    }

    public static final c0m h0(nw30 nw30Var) {
        boolean z = nw30Var instanceof ew30;
        i0m g0mVar = h0m.f12242a;
        if (z) {
            ew30 ew30Var = (ew30) nw30Var;
            String str = ew30Var.e;
            m0x m0xVar = new m0x(ew30Var.d, null, 6);
            pz40 pz40Var = s6t0.f31722a;
            long primary = s6t0.b().f33626a.getPrimary();
            int i = ew30Var.d;
            if (ew30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str, m0xVar, primary, i, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        if (nw30Var instanceof rv30) {
            rv30 rv30Var = (rv30) nw30Var;
            List list = rv30Var.k;
            String str2 = rv30Var.h;
            pz40 pz40Var2 = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
            m0x m0xVar2 = new m0x(rv30Var.e, null, 6);
            long jM123getWhite0d7_KjU2 = staticColors.m123getWhite0d7_KjU();
            int i2 = rv30Var.e;
            if (rv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            j0m j0mVar = new j0m(str2, jM123getWhite0d7_KjU, m0xVar2, jM123getWhite0d7_KjU2, i2, g0mVar);
            y3d y3dVar = (y3d) CollectionsKt.firstOrNull(list);
            long j = y3dVar != null ? y3dVar.f41946a : y3d.g;
            y3d y3dVar2 = (y3d) CollectionsKt.f0(list);
            return new c0m(j0mVar, null, null, false, new wzl(j, y3dVar2 != null ? y3dVar2.f41946a : y3d.g), 46);
        }
        if (nw30Var instanceof sv30) {
            sv30 sv30Var = (sv30) nw30Var;
            String str3 = sv30Var.g;
            pz40 pz40Var3 = s6t0.f31722a;
            StaticColors staticColors2 = StaticColors.INSTANCE;
            long jM123getWhite0d7_KjU3 = staticColors2.m123getWhite0d7_KjU();
            m0x m0xVar3 = new m0x(sv30Var.d, null, 6);
            long jM123getWhite0d7_KjU4 = staticColors2.m123getWhite0d7_KjU();
            int i3 = sv30Var.d;
            if (sv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str3, jM123getWhite0d7_KjU3, m0xVar3, jM123getWhite0d7_KjU4, i3, g0mVar), null, null, false, new vzl(sv30Var.j), 46);
        }
        if (nw30Var instanceof tv30) {
            tv30 tv30Var = (tv30) nw30Var;
            String str4 = tv30Var.f;
            pz40 pz40Var4 = s6t0.f31722a;
            StaticColors staticColors3 = StaticColors.INSTANCE;
            long jM123getWhite0d7_KjU5 = staticColors3.m123getWhite0d7_KjU();
            m0x m0xVar4 = new m0x(tv30Var.c, null, 6);
            long jM123getWhite0d7_KjU6 = staticColors3.m123getWhite0d7_KjU();
            int i4 = tv30Var.c;
            if (tv30Var.f34580a) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str4, jM123getWhite0d7_KjU5, m0xVar4, jM123getWhite0d7_KjU6, i4, g0mVar), null, null, false, new vzl(tv30Var.i), 46);
        }
        if (nw30Var instanceof mw30) {
            mw30 mw30Var = (mw30) nw30Var;
            String str5 = mw30Var.e;
            m0x m0xVar5 = new m0x(mw30Var.d, null, 6);
            pz40 pz40Var5 = s6t0.f31722a;
            long primary2 = s6t0.b().f33626a.getPrimary();
            int i5 = mw30Var.d;
            if (mw30Var.f22484a) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str5, m0xVar5, primary2, i5, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        if (nw30Var instanceof cw30) {
            cw30 cw30Var = (cw30) nw30Var;
            String str6 = cw30Var.e;
            m0x m0xVar6 = new m0x(cw30Var.d, null, 6);
            pz40 pz40Var6 = s6t0.f31722a;
            long primary3 = s6t0.b().f33626a.getPrimary();
            int i6 = cw30Var.d;
            if (cw30Var.f5062a) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str6, m0xVar6, primary3, i6, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        if (nw30Var instanceof lw30) {
            lw30 lw30Var = (lw30) nw30Var;
            String str7 = lw30Var.g;
            n0x n0xVar = new n0x(lw30Var.f);
            pz40 pz40Var7 = s6t0.f31722a;
            long primary4 = s6t0.b().f33626a.getPrimary();
            if (lw30Var.f20744a) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str7, n0xVar, primary4, R.drawable.ic_glyph_language, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        if (nw30Var instanceof vv30) {
            vv30 vv30Var = (vv30) nw30Var;
            String str8 = vv30Var.e;
            m0x m0xVar7 = new m0x(vv30Var.d, null, 6);
            pz40 pz40Var8 = s6t0.f31722a;
            long primary5 = s6t0.b().f33626a.getPrimary();
            int i7 = vv30Var.d;
            if (vv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str8, m0xVar7, primary5, i7, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        if (nw30Var instanceof wv30) {
            wv30 wv30Var = (wv30) nw30Var;
            String str9 = wv30Var.f;
            n0x n0xVar2 = new n0x(wv30Var.d);
            pz40 pz40Var9 = s6t0.f31722a;
            long primary6 = s6t0.b().f33626a.getPrimary();
            int i8 = wv30Var.e;
            if (wv30Var.f39822a) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str9, n0xVar2, primary6, i8, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        if (nw30Var instanceof xv30) {
            xv30 xv30Var = (xv30) nw30Var;
            List list2 = xv30Var.k;
            String str10 = xv30Var.h;
            pz40 pz40Var10 = s6t0.f31722a;
            StaticColors staticColors4 = StaticColors.INSTANCE;
            long jM123getWhite0d7_KjU7 = staticColors4.m123getWhite0d7_KjU();
            m0x m0xVar8 = new m0x(xv30Var.e, null, 6);
            long jM123getWhite0d7_KjU8 = staticColors4.m123getWhite0d7_KjU();
            int i9 = xv30Var.e;
            if (xv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            j0m j0mVar2 = new j0m(str10, jM123getWhite0d7_KjU7, m0xVar8, jM123getWhite0d7_KjU8, i9, g0mVar);
            y3d y3dVar3 = (y3d) CollectionsKt.firstOrNull(list2);
            long primary7 = y3dVar3 != null ? y3dVar3.f41946a : s6t0.b().f33626a.getPrimary();
            y3d y3dVar4 = (y3d) CollectionsKt.f0(list2);
            return new c0m(j0mVar2, null, null, false, new wzl(primary7, y3dVar4 != null ? y3dVar4.f41946a : s6t0.b().f33626a.getPrimary()), 46);
        }
        if (nw30Var instanceof yv30) {
            yv30 yv30Var = (yv30) nw30Var;
            String str11 = yv30Var.g;
            pz40 pz40Var11 = s6t0.f31722a;
            StaticColors staticColors5 = StaticColors.INSTANCE;
            long jM123getWhite0d7_KjU9 = staticColors5.m123getWhite0d7_KjU();
            m0x m0xVar9 = new m0x(yv30Var.d, null, 6);
            long jM123getWhite0d7_KjU10 = staticColors5.m123getWhite0d7_KjU();
            int i10 = yv30Var.d;
            if (yv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str11, jM123getWhite0d7_KjU9, m0xVar9, jM123getWhite0d7_KjU10, i10, g0mVar), null, null, false, new vzl(yv30Var.j), 46);
        }
        if (nw30Var instanceof aw30) {
            aw30 aw30Var = (aw30) nw30Var;
            String str12 = aw30Var.e;
            m0x m0xVar10 = new m0x(aw30Var.d, null, 6);
            pz40 pz40Var12 = s6t0.f31722a;
            long primary8 = s6t0.b().f33626a.getPrimary();
            int i11 = aw30Var.d;
            if (aw30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str12, m0xVar10, primary8, i11, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        if (nw30Var instanceof zv30) {
            zv30 zv30Var = (zv30) nw30Var;
            String str13 = zv30Var.e;
            m0x m0xVar11 = new m0x(zv30Var.d, null, 6);
            pz40 pz40Var13 = s6t0.f31722a;
            long primary9 = s6t0.b().f33626a.getPrimary();
            int i12 = zv30Var.d;
            if (zv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str13, m0xVar11, primary9, i12, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        if (nw30Var instanceof uv30) {
            uv30 uv30Var = (uv30) nw30Var;
            String str14 = uv30Var.e;
            m0x m0xVar12 = new m0x(uv30Var.d, null, 6);
            pz40 pz40Var14 = s6t0.f31722a;
            long primary10 = s6t0.b().f33626a.getPrimary();
            int i13 = uv30Var.d;
            if (uv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str14, m0xVar12, primary10, i13, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        if (nw30Var instanceof bw30) {
            bw30 bw30Var = (bw30) nw30Var;
            String str15 = bw30Var.g;
            n0x n0xVar3 = new n0x(bw30Var.f);
            pz40 pz40Var15 = s6t0.f31722a;
            long primary11 = s6t0.b().f33626a.getPrimary();
            if (bw30Var.f3307a) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str15, n0xVar3, primary11, R.drawable.ic_glyph_language, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        if (nw30Var instanceof iw30) {
            iw30 iw30Var = (iw30) nw30Var;
            String str16 = iw30Var.e;
            m0x m0xVar13 = new m0x(iw30Var.d, null, 6);
            pz40 pz40Var16 = s6t0.f31722a;
            long primary12 = s6t0.b().f33626a.getPrimary();
            int i14 = iw30Var.d;
            if (iw30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            j0m j0mVar3 = new j0m(str16, m0xVar13, primary12, i14, g0mVar, 2);
            vzl vzlVar = new vzl(s6t0.b().f33626a.getBackground());
            int i15 = iw30Var.g;
            return new c0m(j0mVar3, null, i15 > 0 ? new d0m(new rpe(i15), new hpe(s6t0.b().f33626a.getBackground())) : e0m.f6994a, false, vzlVar, 42);
        }
        if (nw30Var instanceof ov30) {
            ov30 ov30Var = (ov30) nw30Var;
            String str17 = ov30Var.i;
            n0x n0xVar4 = new n0x(ov30Var.d);
            pz40 pz40Var17 = s6t0.f31722a;
            long primary13 = s6t0.b().f33626a.getPrimary();
            int i16 = ov30Var.g;
            if (ov30Var.f25907a) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str17, n0xVar4, primary13, i16, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        if (nw30Var instanceof nv30) {
            nv30 nv30Var = (nv30) nw30Var;
            String str18 = nv30Var.e;
            m0x m0xVar14 = new m0x(nv30Var.d, null, 6);
            pz40 pz40Var18 = s6t0.f31722a;
            long primary14 = s6t0.b().f33626a.getPrimary();
            int i17 = nv30Var.d;
            if (nv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str18, m0xVar14, primary14, i17, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        if (nw30Var instanceof qv30) {
            qv30 qv30Var = (qv30) nw30Var;
            String str19 = qv30Var.e;
            m0x m0xVar15 = new m0x(qv30Var.d, null, 6);
            pz40 pz40Var19 = s6t0.f31722a;
            long primary15 = s6t0.b().f33626a.getPrimary();
            int i18 = qv30Var.d;
            if (qv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str19, m0xVar15, primary15, i18, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        if (nw30Var instanceof jw30) {
            jw30 jw30Var = (jw30) nw30Var;
            String str20 = jw30Var.e;
            m0x m0xVar16 = new m0x(jw30Var.d, null, 6);
            pz40 pz40Var20 = s6t0.f31722a;
            long primary16 = s6t0.b().f33626a.getPrimary();
            int i19 = jw30Var.d;
            if (jw30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str20, m0xVar16, primary16, i19, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        if (!(nw30Var instanceof dw30)) {
            m0x m0xVar17 = new m0x(R.drawable.ic_glyph_category_new, null, 6);
            pz40 pz40Var21 = s6t0.f31722a;
            return new c0m(new j0m("", m0xVar17, s6t0.b().f33626a.getPrimary(), R.drawable.ic_glyph_category_new, (i0m) null, 34), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        dw30 dw30Var = (dw30) nw30Var;
        String str21 = dw30Var.e;
        m0x m0xVar18 = new m0x(dw30Var.d, null, 6);
        pz40 pz40Var22 = s6t0.f31722a;
        long primary17 = s6t0.b().f33626a.getPrimary();
        int i20 = dw30Var.d;
        if (dw30Var.b) {
            g0mVar = new g0m(new rf5(3, null));
        }
        return new c0m(new j0m(str21, m0xVar18, primary17, i20, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
    }

    public static final void i(final float f, final mdm mdmVar, Function0 function0, fet fetVar, final int i, final int i2) {
        int i3;
        Function0 function1;
        fetVar.g0(-1114677717);
        int i4 = i | (fetVar.d(f) ? 4 : 2) | (fetVar.g(mdmVar) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (fetVar.i(function0) ? 256 : 128);
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (i5 != 0) {
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new dfp((byte) 26);
                    fetVar.o0(objP);
                }
                function1 = (Function0) objP;
            } else {
                function1 = function0;
            }
            mm40 mm40VarN = s5x0.N(o7k0.c, 0.0f, f, 0.0f, 0.0f, 13);
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
            jcb.l(jr8.f16991a.b(jm40.b, gqw0.e), mdmVar, false, function1, fetVar, (i3 & 112) | ((i3 << 3) & 7168), 4);
            fetVar.r(true);
        } else {
            fetVar.X();
            function1 = function0;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final Function0 function2 = function1;
            yfe0VarU.d = new Function2(f, mdmVar, function2, i, i2) { // from class: a.ywp

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f43381a;
                public final /* synthetic */ mdm b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ byte d;

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.d = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    x8f.i(this.f43381a, this.b, this.c, (fet) obj, iL, this.d);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void j(h3a0 h3a0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-607089952);
        int i2 = i | (fetVar2.g(h3a0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(o7k0.e(mm40VarD, 52.0f), h3a0Var.f, jd8.n);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
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
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarL = s5x0.L(zhg0Var.a(0.22f, jm40Var, true), 4.0f, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            mm40 mm40VarB = zhg0Var.b(yx7Var, mm40VarL);
            String str = h3a0Var.f12375a;
            y9q0 y9q0VarD = g1t0.d();
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarB, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, y9q0VarD, fetVar, 0, 24960, 109560);
            v8q0.a(h3a0Var.b, zhg0Var.b(yx7Var, s5x0.L(zhg0Var.a(0.2f, jm40Var, true), 4.0f, 0.0f, 2)), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            v8q0.a(h3a0Var.c, zhg0Var.b(yx7Var, s5x0.L(zhg0Var.a(0.18f, jm40Var, true), 4.0f, 0.0f, 2)), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            v8q0.a(h3a0Var.d, zhg0Var.b(yx7Var, s5x0.L(zhg0Var.a(0.18f, jm40Var, true), 4.0f, 0.0f, 2)), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            v8q0.a(h3a0Var.e, zhg0Var.b(yx7Var, s5x0.L(zhg0Var.a(0.22f, jm40Var, true), 4.0f, 0.0f, 2)), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cz90(h3a0Var, i, (byte) 6);
        }
    }

    public static final void k(int i, fet fetVar) {
        fetVar.g0(-265884700);
        if (fetVar.U(i & 1, i != 0)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(o7k0.e(mm40VarD, 52.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarL = s5x0.L(zhg0Var.a(0.22f, jm40Var, true), 4.0f, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            mm40 mm40VarB = zhg0Var.b(yx7Var, mm40VarL);
            String strW = rsm0.w(R.string.date, 0, fetVar);
            y9q0 y9q0VarK = g1t0.k();
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(strW, mm40VarB, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 2, 0, null, y9q0VarK, fetVar, 0, 24576, 113656);
            v8q0.a(rsm0.w(R.string.tournament_title, 0, fetVar), zhg0Var.b(yx7Var, s5x0.L(zhg0Var.a(0.2f, jm40Var, true), 4.0f, 0.0f, 2)), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 2, 0, null, g1t0.k(), fetVar, 0, 24576, 113656);
            v8q0.a(rsm0.w(R.string.round, 0, fetVar), zhg0Var.b(yx7Var, s5x0.L(zhg0Var.a(0.18f, jm40Var, true), 4.0f, 0.0f, 2)), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 2, 0, null, g1t0.k(), fetVar, 0, 24576, 113656);
            v8q0.a(rsm0.w(R.string.dt_points, 0, fetVar), zhg0Var.b(yx7Var, s5x0.L(zhg0Var.a(0.18f, jm40Var, true), 4.0f, 0.0f, 2)), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 2, 0, null, g1t0.k(), fetVar, 0, 24576, 113656);
            v8q0.a(rsm0.w(R.string.data_drop_statistic, 0, fetVar), zhg0Var.b(yx7Var, s5x0.L(zhg0Var.a(0.22f, jm40Var, true), 4.0f, 0.0f, 2)), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 2, 0, null, g1t0.k(), fetVar, 0, 24576, 113656);
            fetVar.r(true);
            mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new so90(i, (byte) 20);
        }
    }

    public static final void l(a4x a4xVar, fet fetVar, int i) {
        fetVar.g0(-128641431);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            boolean zG = fetVar.g(xczVarA);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new wi6(xczVarA, null, (byte) 9);
                fetVar.o0(objP);
            }
            int i3 = i2 & 14;
            m0x0.t(fetVar, a4xVar, (Function2) objP);
            k(0, fetVar);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 16.0f, 7);
            boolean z = i3 == 4;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new oea(a4xVar, (byte) 22);
                fetVar.o0(objP2);
            }
            b8k0.e(n0qVar, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP2, fetVar, 6, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eup(a4xVar, i, (byte) 17);
        }
    }

    public static final void m(String str, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-954596118);
        int i2 = i | (fetVar2.g(str) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarG = o7k0.g(o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), 34.0f, 0.0f, 2);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarG, s6t0.b().f33626a.getBackgroundGroup(), jd8.n);
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
            v8q0.a(str, s5x0.L(jm40Var, 8.0f, 0.0f, 2), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, i2 & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yh20((byte) 10, i, str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:89:0x02c0  */
    public static final void n(mm40 mm40Var, long j, String str, String str2, String str3, eb9 eb9Var, uwe uweVar, fet fetVar, int i) {
        String str4;
        long j2;
        mm40 mm40Var2;
        long textPrimary;
        byte b2;
        cl5 cl5Var;
        pcy pcyVar;
        pcy pcyVar2;
        cl5 cl5Var2;
        Object objP;
        fet fetVar2 = fetVar;
        String str5 = eb9Var.f7509a;
        fetVar2.g0(-880320450);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str4 = str2;
            i2 |= fetVar2.g(str4) ? 2048 : 1024;
        } else {
            str4 = str2;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(str3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.g(eb9Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar2.i(uweVar) ? 1048576 : 524288;
        }
        if (fetVar2.U(i2 & 1, (599187 & i2) != 599186)) {
            fb9 fb9Var = eb9Var.b;
            boolean zG = fetVar2.g(str5);
            Object objP2 = fetVar2.P();
            cl5 cl5Var3 = ukd.f35823a;
            if (zG || objP2 == cl5Var3) {
                objP2 = Boolean.valueOf(!StringsKt.W(str5));
                fetVar2.o0(objP2);
            }
            boolean zBooleanValue = ((Boolean) objP2).booleanValue();
            boolean zE = fetVar2.e(fb9Var.ordinal());
            Object objP3 = fetVar2.P();
            if (zE || objP3 == cl5Var3) {
                int iOrdinal = fb9Var.ordinal();
                if (iOrdinal == 0) {
                    pz40 pz40Var = s6t0.f31722a;
                    textPrimary = s6t0.b().f33626a.getTextPrimary();
                } else if (iOrdinal == 1) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    textPrimary = s6t0.b().b.getCoefHigher();
                } else if (iOrdinal != 2) {
                    t9f.b();
                    return;
                } else {
                    pz40 pz40Var3 = s6t0.f31722a;
                    textPrimary = s6t0.b().b.getCoefLower();
                }
                objP3 = dw9.e(textPrimary, fetVar2);
            }
            long j3 = ((y3d) objP3).f41946a;
            mu90 mu90Var = mu90.k;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar3 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, mu90Var, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            int i3 = i2;
            v8q0.a(str, mrv.k0(s5x0.N(jm40Var, 12.0f, 12.0f, 0.0f, 0.0f, 12), "TITLE_LAYOUT_ID"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, ibm0.t(g1t0.m(), fetVar2), fetVar, (i3 >> 6) & 14, 24960, 110588);
            String str6 = str4;
            mm40Var2 = jm40Var;
            v8q0.a(str6, mrv.k0(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), "SUBTITLE_LAYOUT_ID"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(g1t0.g(), fetVar), fetVar, (i3 >> 9) & 14, 24960, 110588);
            fetVar2 = fetVar;
            if (zBooleanValue) {
                fetVar2.e0(1643429494);
                mm40 mm40VarN = s5x0.N(mrv.k0(mm40Var2, "COEF_CONTAINER_LAYOUT_ID"), 12.0f, 0.0f, 0.0f, 0.0f, 14);
                thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
                fetVar2.i0();
                if (fetVar2.S) {
                    pcyVar2 = pcyVar3;
                    fetVar2.l(pcyVar2);
                } else {
                    pcyVar2 = pcyVar3;
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar);
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar4);
                b2 = 3;
                pcyVar = pcyVar2;
                v8q0.a(str3, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(g1t0.g(), fetVar2), fetVar, (i3 >> 12) & 14, 0, 131070);
                y9q0 y9q0VarL = g1t0.l();
                boolean zF = fetVar.f(j3);
                Object objP4 = fetVar.P();
                if (zF) {
                    cl5Var2 = cl5Var3;
                } else {
                    cl5Var2 = cl5Var3;
                    if (objP4 == cl5Var2) {
                    }
                    n4d n4dVar = (n4d) objP4;
                    objP = fetVar.P();
                    if (objP == cl5Var2) {
                        objP = new n05(qmk.o, qmk.r, qmk.n);
                        fetVar.o0(objP);
                    }
                    n05 n05Var = (n05) objP;
                    cl5Var = cl5Var2;
                    aad.e(str5, null, y9q0VarL, null, 2, false, 1, 0, n4dVar, n05Var, fetVar, 1597440, 170);
                    fetVar2 = fetVar;
                    fetVar2.r(true);
                    fetVar2.r(false);
                }
                objP4 = new f15((byte) 3, j3);
                fetVar.o0(objP4);
                n4d n4dVar2 = (n4d) objP4;
                objP = fetVar.P();
                if (objP == cl5Var2) {
                    objP = new n05(qmk.o, qmk.r, qmk.n);
                    fetVar.o0(objP);
                }
                n05 n05Var2 = (n05) objP;
                cl5Var = cl5Var2;
                aad.e(str5, null, y9q0VarL, null, 2, false, 1, 0, n4dVar2, n05Var2, fetVar, 1597440, 170);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                b2 = 3;
                cl5Var = cl5Var3;
                pcyVar = pcyVar3;
                fetVar2.e0(1644541805);
                fetVar2.r(false);
            }
            mm40 mm40VarN2 = o7k0.n(mrv.k0(mm40Var2, "ICON_LAYOUT_ID"), 40.0f);
            boolean z2 = ((i3 & 3670016) == 1048576) | ((i3 & 112) == 32);
            Object objP5 = fetVar2.P();
            if (z2 || objP5 == cl5Var) {
                j2 = j;
                objP5 = new zt(uweVar, j2, b2);
                fetVar2.o0(objP5);
            } else {
                j2 = j;
            }
            mm40 mm40VarW = y860.W(mm40VarN2, null, null, false, null, (Function0) objP5, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarW);
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
            dww.c(a8k0.F(R.drawable.ic_glyph_cancel, 0, fetVar2), null, o7k0.n(mm40Var2, 24.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            j2 = j;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jc9(mm40Var2, j2, str, str2, str3, eb9Var, uweVar, i);
        }
    }

    public static final void o(mm40 mm40Var, vaa vaaVar, Function2 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2;
        function2.getClass();
        fetVar.g0(-1750242307);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(vaaVar) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            uc9.h(mm40Var2, null, u1c.M(-442483158, new ec30(vaaVar, function2, (byte) 8), fetVar), u1c.M(1668208201, new awh(vaaVar, (byte) 5), fetVar), fetVar2, (i2 & 14) | 27648, 6);
        } else {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new oaa(mm40Var2, vaaVar, function2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:97:0x02c4  */
    public static final void p(mm40 mm40Var, l7m0 l7m0Var, final xcz xczVar, Function1 function1, final Function1 function2, final ugd ugdVar, fet fetVar, int i) {
        fet fetVar2;
        long background;
        boolean z;
        long background2;
        l7m0Var.getClass();
        xczVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1580818882);
        byte b2 = 2;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        final byte b3 = 0;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 896;
            boolean z2 = (i3 == 256) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new aj6(xczVar, function1, null, b2);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, xczVar, (Function2) objP);
            final e7b e7bVar = (e7b) l7m0Var.getValue();
            if (e7bVar == null) {
                fetVar2 = fetVar;
            } else if (e7bVar instanceof d7b) {
                fetVar.e0(141727347);
                final d7b d7bVar = (d7b) e7bVar;
                int iOrdinal = d7bVar.b().ordinal();
                if (iOrdinal == 0) {
                    fetVar.e0(1251504968);
                    background2 = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
                    fetVar.r(false);
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            fetVar.e0(1251504968);
                            background2 = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
                            fetVar.r(false);
                        } else if (iOrdinal != 3) {
                            throw b1j.f(1251498441, fetVar, false);
                        }
                    }
                    fetVar.e0(1251501711);
                    background2 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                    fetVar.r(false);
                }
                mm40 mm40VarQ = qjj.Q(mm40Var);
                n0q n0qVar = o7k0.c;
                mm40 mm40VarE = mm40VarQ.e(n0qVar);
                boolean zF = fetVar.f(background2);
                Object objP2 = fetVar.P();
                if (zF || objP2 == cl5Var) {
                    objP2 = new bx((byte) 23, background2);
                    fetVar.o0(objP2);
                }
                final mm40 mm40VarK = rq8.K(mm40VarE, (Function1) objP2);
                ugd ugdVarM = u1c.M(874964118, new xdr() { // from class: a.m6b
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        byte b4 = b3;
                        e7b e7bVar2 = e7bVar;
                        ugd ugdVar2 = ugdVar;
                        RelatedParams relatedParams = (RelatedParams) obj;
                        fet fetVar3 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (b4) {
                            case 0:
                                relatedParams.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar3.g(relatedParams) ? 4 : 2;
                                }
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    ugdVar2.j(((d7b) e7bVar2).b(), relatedParams, fetVar3, Integer.valueOf((iIntValue << 3) & 112));
                                } else {
                                    fetVar3.X();
                                }
                                break;
                            default:
                                relatedParams.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar3.g(relatedParams) ? 4 : 2;
                                }
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    ugdVar2.j(((w6b) e7bVar2).b(), relatedParams, fetVar3, Integer.valueOf((iIntValue << 3) & 112));
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar);
                if (d7bVar instanceof x6b) {
                    fetVar.e0(962620219);
                    rsr0.a(0, fetVar, knm0.s(0, fetVar, mm40VarK), ((x6b) d7bVar).b);
                    fetVar.r(false);
                } else if (d7bVar instanceof y6b) {
                    fetVar.e0(962907496);
                    y6b y6bVar = (y6b) d7bVar;
                    final pz40 pz40VarF = androidx.compose.runtime.e.f(y6bVar.b, fetVar);
                    final byte b4 = 0;
                    obc.d(kr00.f18743a.a(Boolean.valueOf(y6bVar.c)), u1c.M(-1879603404, new Function2() { // from class: a.qvm0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b5 = b4;
                            cl5 cl5Var2 = ukd.f35823a;
                            Function1 function3 = function2;
                            d7b d7bVar2 = d7bVar;
                            byte b6 = 2;
                            switch (b5) {
                                case 0:
                                    fet fetVar3 = (fet) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        udl0 udl0Var = ((y6b) d7bVar2).f42089a;
                                        zcl zclVar = qmk.f28987a;
                                        ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7), fetVar3);
                                        boolean zG = fetVar3.g(function3);
                                        Object objP3 = fetVar3.P();
                                        if (zG || objP3 == cl5Var2) {
                                            objP3 = new zbm0(function3, (byte) 6);
                                            fetVar3.o0(objP3);
                                        }
                                        Function1 function4 = (Function1) objP3;
                                        boolean zG2 = fetVar3.g(function3);
                                        Object objP4 = fetVar3.P();
                                        if (zG2 || objP4 == cl5Var2) {
                                            objP4 = new zbm0(function3, b6);
                                            fetVar3.o0(objP4);
                                        }
                                        Function1 function5 = (Function1) objP4;
                                        boolean zG3 = fetVar3.g(function3);
                                        Object objP5 = fetVar3.P();
                                        if (zG3 || objP5 == cl5Var2) {
                                            objP5 = new nc40(function3, (byte) 13);
                                            fetVar3.o0(objP5);
                                        }
                                        fww.c(mm40VarK, pz40VarF, udl0Var, true, xczVar, ch80VarG, function4, function5, (xdr) objP5, fetVar3, 3072, 0);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                default:
                                    fet fetVar4 = (fet) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (fetVar4.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                        udl0 udl0Var2 = ((z6b) d7bVar2).f43858a;
                                        boolean zG4 = fetVar4.g(function3);
                                        Object objP6 = fetVar4.P();
                                        if (zG4 || objP6 == cl5Var2) {
                                            objP6 = new zbm0(function3, (byte) 3);
                                            fetVar4.o0(objP6);
                                        }
                                        Function1 function6 = (Function1) objP6;
                                        boolean zG5 = fetVar4.g(function3);
                                        Object objP7 = fetVar4.P();
                                        if (zG5 || objP7 == cl5Var2) {
                                            objP7 = new zbm0(function3, (byte) 4);
                                            fetVar4.o0(objP7);
                                        }
                                        Function1 function7 = (Function1) objP7;
                                        boolean zG6 = fetVar4.g(function3);
                                        Object objP8 = fetVar4.P();
                                        if (zG6 || objP8 == cl5Var2) {
                                            objP8 = new nc40(function3, (byte) 14);
                                            fetVar4.o0(objP8);
                                        }
                                        xdr xdrVar = (xdr) objP8;
                                        boolean zG7 = fetVar4.g(function3);
                                        Object objP9 = fetVar4.P();
                                        if (zG7 || objP9 == cl5Var2) {
                                            objP9 = new nc40(function3, (byte) 15);
                                            fetVar4.o0(objP9);
                                        }
                                        xdr xdrVar2 = (xdr) objP9;
                                        boolean zG8 = fetVar4.g(function3);
                                        Object objP10 = fetVar4.P();
                                        if (zG8 || objP10 == cl5Var2) {
                                            objP10 = new nc40(function3, (byte) 16);
                                            fetVar4.o0(objP10);
                                        }
                                        xdr xdrVar3 = (xdr) objP10;
                                        boolean zG9 = fetVar4.g(function3);
                                        Object objP11 = fetVar4.P();
                                        if (zG9 || objP11 == cl5Var2) {
                                            objP11 = new zbm0(function3, (byte) 5);
                                            fetVar4.o0(objP11);
                                        }
                                        idx.d(mm40VarK, pz40VarF, udl0Var2, true, xczVar, function6, function7, xdrVar, xdrVar2, xdrVar3, (Function1) objP11, fetVar4, 3072, 0, 0);
                                    } else {
                                        fetVar4.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, 56);
                    fetVar.r(false);
                } else if (d7bVar instanceof z6b) {
                    fetVar.e0(964570367);
                    z6b z6bVar = (z6b) d7bVar;
                    final pz40 pz40VarF2 = androidx.compose.runtime.e.f(z6bVar.b, fetVar);
                    final byte b5 = 1;
                    obc.d(kr00.f18743a.a(Boolean.valueOf(z6bVar.c)), u1c.M(-613532619, new Function2() { // from class: a.qvm0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b6 = b5;
                            cl5 cl5Var2 = ukd.f35823a;
                            Function1 function3 = function2;
                            d7b d7bVar2 = d7bVar;
                            byte b7 = 2;
                            switch (b6) {
                                case 0:
                                    fet fetVar3 = (fet) obj;
                                    int iIntValue = ((Integer) obj2).intValue();
                                    if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        udl0 udl0Var = ((y6b) d7bVar2).f42089a;
                                        zcl zclVar = qmk.f28987a;
                                        ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7), fetVar3);
                                        boolean zG = fetVar3.g(function3);
                                        Object objP3 = fetVar3.P();
                                        if (zG || objP3 == cl5Var2) {
                                            objP3 = new zbm0(function3, (byte) 6);
                                            fetVar3.o0(objP3);
                                        }
                                        Function1 function4 = (Function1) objP3;
                                        boolean zG2 = fetVar3.g(function3);
                                        Object objP4 = fetVar3.P();
                                        if (zG2 || objP4 == cl5Var2) {
                                            objP4 = new zbm0(function3, b7);
                                            fetVar3.o0(objP4);
                                        }
                                        Function1 function5 = (Function1) objP4;
                                        boolean zG3 = fetVar3.g(function3);
                                        Object objP5 = fetVar3.P();
                                        if (zG3 || objP5 == cl5Var2) {
                                            objP5 = new nc40(function3, (byte) 13);
                                            fetVar3.o0(objP5);
                                        }
                                        fww.c(mm40VarK, pz40VarF2, udl0Var, true, xczVar, ch80VarG, function4, function5, (xdr) objP5, fetVar3, 3072, 0);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                default:
                                    fet fetVar4 = (fet) obj;
                                    int iIntValue2 = ((Integer) obj2).intValue();
                                    if (fetVar4.U(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                                        udl0 udl0Var2 = ((z6b) d7bVar2).f43858a;
                                        boolean zG4 = fetVar4.g(function3);
                                        Object objP6 = fetVar4.P();
                                        if (zG4 || objP6 == cl5Var2) {
                                            objP6 = new zbm0(function3, (byte) 3);
                                            fetVar4.o0(objP6);
                                        }
                                        Function1 function6 = (Function1) objP6;
                                        boolean zG5 = fetVar4.g(function3);
                                        Object objP7 = fetVar4.P();
                                        if (zG5 || objP7 == cl5Var2) {
                                            objP7 = new zbm0(function3, (byte) 4);
                                            fetVar4.o0(objP7);
                                        }
                                        Function1 function7 = (Function1) objP7;
                                        boolean zG6 = fetVar4.g(function3);
                                        Object objP8 = fetVar4.P();
                                        if (zG6 || objP8 == cl5Var2) {
                                            objP8 = new nc40(function3, (byte) 14);
                                            fetVar4.o0(objP8);
                                        }
                                        xdr xdrVar = (xdr) objP8;
                                        boolean zG7 = fetVar4.g(function3);
                                        Object objP9 = fetVar4.P();
                                        if (zG7 || objP9 == cl5Var2) {
                                            objP9 = new nc40(function3, (byte) 15);
                                            fetVar4.o0(objP9);
                                        }
                                        xdr xdrVar2 = (xdr) objP9;
                                        boolean zG8 = fetVar4.g(function3);
                                        Object objP10 = fetVar4.P();
                                        if (zG8 || objP10 == cl5Var2) {
                                            objP10 = new nc40(function3, (byte) 16);
                                            fetVar4.o0(objP10);
                                        }
                                        xdr xdrVar3 = (xdr) objP10;
                                        boolean zG9 = fetVar4.g(function3);
                                        Object objP11 = fetVar4.P();
                                        if (zG9 || objP11 == cl5Var2) {
                                            objP11 = new zbm0(function3, (byte) 5);
                                            fetVar4.o0(objP11);
                                        }
                                        idx.d(mm40VarK, pz40VarF2, udl0Var2, true, xczVar, function6, function7, xdrVar, xdrVar2, xdrVar3, (Function1) objP11, fetVar4, 3072, 0, 0);
                                    } else {
                                        fetVar4.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, 56);
                    fetVar.r(false);
                } else if (d7bVar instanceof a7b) {
                    fetVar.e0(967268886);
                    obc.d(kr00.f18743a.a(Boolean.valueOf(((a7b) d7bVar).b)), u1c.M(652538166, new edk0(d7bVar, (byte) 27), fetVar), fetVar, 56);
                    fetVar.r(false);
                } else {
                    if (d7bVar instanceof b7b) {
                        fetVar.e0(2109424400);
                        ugdVarM.F(((b7b) d7bVar).b, fetVar, 48);
                        fetVar.r(false);
                    } else {
                        if (!(d7bVar instanceof c7b)) {
                            throw b1j.f(2109264921, fetVar, false);
                        }
                        fetVar.e0(967746255);
                        mm40 mm40VarE2 = tfx.E(mm40VarK.e(n0qVar));
                        tj30 tj30VarC = zq8.c(gqw0.e, false);
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
                        jcb.l(null, ((c7b) d7bVar).b, false, null, fetVar, 0, 13);
                        fetVar2 = fetVar;
                        fetVar2.r(true);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                }
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                if (e7bVar instanceof w6b) {
                    fetVar2.e0(142559666);
                    w6b w6bVar = (w6b) e7bVar;
                    int iOrdinal2 = w6bVar.b().ordinal();
                    if (iOrdinal2 == 0) {
                        fetVar2.e0(1251531816);
                        background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
                        fetVar2.r(false);
                    } else {
                        if (iOrdinal2 != 1) {
                            if (iOrdinal2 == 2) {
                                fetVar2.e0(1251531816);
                                background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackground();
                                fetVar2.r(false);
                            } else if (iOrdinal2 != 3) {
                                throw b1j.f(1251525289, fetVar2, false);
                            }
                        }
                        fetVar2.e0(1251528559);
                        background = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
                        fetVar2.r(false);
                    }
                    long j = background;
                    mm40 mm40VarE3 = qjj.Q(mm40Var).e(o7k0.c);
                    boolean zF2 = fetVar2.f(j);
                    Object objP3 = fetVar2.P();
                    if (zF2 || objP3 == cl5Var) {
                        objP3 = new bx((byte) 24, j);
                        fetVar2.o0(objP3);
                    }
                    mm40 mm40VarK2 = rq8.K(mm40VarE3, (Function1) objP3);
                    final byte b6 = 1;
                    ugd ugdVarM2 = u1c.M(-234367467, new xdr() { // from class: a.m6b
                        @Override // a.xdr
                        public final Object F(Object obj, Object obj2, Object obj3) {
                            byte b7 = b6;
                            e7b e7bVar2 = e7bVar;
                            ugd ugdVar2 = ugdVar;
                            RelatedParams relatedParams = (RelatedParams) obj;
                            fet fetVar3 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            switch (b7) {
                                case 0:
                                    relatedParams.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= fetVar3.g(relatedParams) ? 4 : 2;
                                    }
                                    if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        ugdVar2.j(((d7b) e7bVar2).b(), relatedParams, fetVar3, Integer.valueOf((iIntValue << 3) & 112));
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                default:
                                    relatedParams.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= fetVar3.g(relatedParams) ? 4 : 2;
                                    }
                                    if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        ugdVar2.j(((w6b) e7bVar2).b(), relatedParams, fetVar3, Integer.valueOf((iIntValue << 3) & 112));
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar2);
                    int i4 = ((i2 >> 3) & 7168) | i3 | 24576;
                    int iOrdinal3 = w6bVar.b().ordinal();
                    if (iOrdinal3 == 0) {
                        z = false;
                        fetVar2.e0(-930792999);
                        i4w0.n(mm40VarK2, w6bVar, xczVar, function2, ugdVarM2, fetVar2, i4 & 65534);
                        fetVar2.r(false);
                    } else if (iOrdinal3 == 1) {
                        z = false;
                        fetVar2.e0(-930784934);
                        epv0.j(mm40VarK2, w6bVar, xczVar, function2, ugdVarM2, fetVar2, i4 & 65534);
                        fetVar2.r(false);
                    } else if (iOrdinal3 == 2) {
                        z = false;
                        fetVar2.e0(-930776805);
                        vbw0.l(mm40VarK2, w6bVar, xczVar, function2, ugdVarM2, fetVar2, i4 & 65534);
                        fetVar2.r(false);
                    } else {
                        if (iOrdinal3 != 3) {
                            throw b1j.f(-930794162, fetVar2, false);
                        }
                        fetVar2.e0(-930768810);
                        hew0.g(mm40VarK2, w6bVar, xczVar, function2, ugdVarM2, fetVar2, i4 & 65534);
                        z = false;
                        fetVar2.r(false);
                    }
                    fetVar2.r(z);
                }
            }
            throw b1j.f(1251495988, fetVar2, false);
        }
        fetVar2 = fetVar;
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zi6(mm40Var, l7m0Var, xczVar, function1, function2, ugdVar, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x01df  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0201  */
    /* JADX WARN: Code duplicated, block: B:98:0x023f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0243  */
    public static final void q(mm40 mm40Var, dsm dsmVar, Function1 function1, Function0 function0, Function0 function2, fet fetVar, int i) {
        fet fetVar2;
        dsm dsmVar2;
        cl5 cl5Var;
        boolean z;
        Object objP;
        String str;
        fetVar.g0(2051671715);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(dsmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var, 88.0f), 64.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarE, backgroundContent, ljcVar);
            int i3 = i2 & 112;
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | (i3 == 32) | ((57344 & i2) == 16384);
            Object objP2 = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z2 || objP2 == cl5Var2) {
                dsmVar2 = dsmVar;
                r3l0 r3l0Var = new r3l0(dsmVar2, function0, function2, function1, (byte) 1);
                fetVar.o0(r3l0Var);
                objP2 = r3l0Var;
            } else {
                dsmVar2 = dsmVar;
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP2, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 4.0f, 5), 48.0f);
            zcl zclVar3 = qmk.m;
            mm40 mm40VarQ2 = i120.Q(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarN), ((ThemeColors) fetVar.k(zfnVar)).getBackground(), ljcVar);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            boolean z4 = i3 == 32;
            Object objP3 = fetVar.P();
            if (z4) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP3 == cl5Var) {
                }
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(581808103, new o9b((o0x) objP3, (byte) 5), fetVar), fetVar, 56);
                fetVar.r(true);
                if (i3 == 32) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar.P();
                if (z || objP == cl5Var) {
                    if (dsmVar2 instanceof asm) {
                        str = ((asm) dsmVar2).f1397a;
                    } else if (dsmVar2 instanceof bsm) {
                        str = ((bsm) dsmVar2).f3137a;
                    } else {
                        if (!(dsmVar2 instanceof csm)) {
                            t9f.b();
                            return;
                        }
                        str = ((csm) dsmVar2).f4897a.c;
                    }
                    objP = str;
                    fetVar.o0(objP);
                }
                String str2 = (String) objP;
                mm40 mm40VarE2 = s5x0.N(jm40Var, 4.0f, 0.0f, 4.0f, 4.0f, 2).e(o7k0.c);
                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE2);
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
                v8q0.a(str2, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), fetVar, 0, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(true);
            }
            if (dsmVar2 instanceof asm) {
                objP3 = new m0x(R.drawable.ic_glyph_all, null, 6);
            } else if (dsmVar2 instanceof bsm) {
                objP3 = new m0x(R.drawable.ic_glyph_filter_line_inactive, null, 6);
            } else {
                if (!(dsmVar2 instanceof csm)) {
                    t9f.b();
                    return;
                }
                objP3 = ((csm) dsmVar2).f4897a.b;
            }
            fetVar.o0(objP3);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(581808103, new o9b((o0x) objP3, (byte) 5), fetVar), fetVar, 56);
            fetVar.r(true);
            if (i3 == 32) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar.P();
            if (z) {
                if (dsmVar2 instanceof asm) {
                    str = ((asm) dsmVar2).f1397a;
                } else if (dsmVar2 instanceof bsm) {
                    str = ((bsm) dsmVar2).f3137a;
                } else {
                    if (!(dsmVar2 instanceof csm)) {
                        t9f.b();
                        return;
                    }
                    str = ((csm) dsmVar2).f4897a.c;
                }
                objP = str;
                fetVar.o0(objP);
            } else {
                if (dsmVar2 instanceof asm) {
                    str = ((asm) dsmVar2).f1397a;
                } else if (dsmVar2 instanceof bsm) {
                    str = ((bsm) dsmVar2).f3137a;
                } else {
                    if (!(dsmVar2 instanceof csm)) {
                        t9f.b();
                        return;
                    }
                    str = ((csm) dsmVar2).f4897a.c;
                }
                objP = str;
                fetVar.o0(objP);
            }
            String str3 = (String) objP;
            mm40 mm40VarE3 = s5x0.N(jm40Var, 4.0f, 0.0f, 4.0f, 4.0f, 2).e(o7k0.c);
            tj30 tj30VarC3 = zq8.c(zx7Var, false);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarE3);
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
            v8q0.a(str3, null, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s3l0(mm40Var, dsmVar, function1, function0, function2, i, (byte) 1);
        }
    }

    public static final void r(p3a0 p3a0Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1066242598);
        int i2 = i | (fetVar2.g(p3a0Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(n0qVar, backgroundContent, ljcVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            mm40 mm40VarM = s5x0.M(jm40.b, xfn.a(fetVar2).d, 8.0f, xfn.a(fetVar2).d, 8.0f);
            a4x a4xVar = p3a0Var.b;
            boolean z2 = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new l3a0(p3a0Var, (byte) 2);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            int i3 = i2 & 112;
            boolean z3 = i3 == 32;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new hs80(function1, (byte) 19);
                fetVar2.o0(objP2);
            }
            ibc.n(mm40VarM, a4xVar, gxh0.f12078a, axh0.f1625a, false, function0, (Function1) objP2, fetVar, 24960, 0);
            mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
            K(p3a0Var.f, fetVar, 0);
            fyl fylVar = p3a0Var.d;
            boolean z4 = i3 == 32;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new hs80(function1, (byte) 20);
                fetVar.o0(objP3);
            }
            T(fylVar, (Function1) objP3, fetVar, 0);
            m(p3a0Var.g, fetVar, 0);
            mm40 mm40VarQ2 = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), ljcVar);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jcb.l(null, p3a0Var.h, false, null, fetVar, 0, 13);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(p3a0Var, function1, i, (byte) 23);
        }
    }

    public static final void s(q3a0 q3a0Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-363873670);
        int i2 = i | (fetVar2.g(q3a0Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(n0qVar, backgroundContent, ljcVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            mm40 mm40VarM = s5x0.M(jm40.b, xfn.a(fetVar2).d, 8.0f, xfn.a(fetVar2).d, 8.0f);
            a4x a4xVar = q3a0Var.b;
            boolean z2 = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new l3a0(q3a0Var, (byte) 1);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = (i2 & 112) == 32;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new hs80(function1, (byte) 18);
                fetVar2.o0(objP2);
            }
            ibc.n(mm40VarM, a4xVar, gxh0.f12078a, axh0.f1625a, false, function0, (Function1) objP2, fetVar, 24960, 0);
            mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
            K(q3a0Var.d, fetVar, 0);
            mm40 mm40VarQ2 = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), ljcVar);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jcb.l(null, q3a0Var.e, false, null, fetVar, 0, 13);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(q3a0Var, function1, i, (byte) 22);
        }
    }

    public static final void t(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        fetVar.g0(-1912132930);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
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
            mdm mdmVar = (mdm) l7m0Var.getValue();
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new afd(function1, (byte) 14);
                fetVar.o0(objP);
            }
            jcb.l(jm40.b, mdmVar, false, (Function0) objP, fetVar, 6, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var, l7m0Var, function1, i, (byte) 12);
        }
    }

    public static final void u(o3a0 o3a0Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-439526566);
        int i2 = (fetVar2.g(o3a0Var) ? 4 : 2) | i | (fetVar2.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(jm40.b, xfn.a(fetVar2).d, 8.0f, xfn.a(fetVar2).d, 8.0f);
            a4x a4xVar = o3a0Var.b;
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new l3a0(o3a0Var, b2);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new hs80(function1, (byte) 15);
                fetVar2.o0(objP2);
            }
            ibc.n(mm40VarM, a4xVar, gxh0.f12078a, axh0.f1625a, false, function0, (Function1) objP2, fetVar, 384, 16);
            fetVar2 = fetVar;
            mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
            K(o3a0Var.f, fetVar2, 0);
            fyl fylVar = o3a0Var.d;
            boolean z3 = i3 == 32;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new hs80(function1, (byte) 16);
                fetVar2.o0(objP3);
            }
            T(fylVar, (Function1) objP3, fetVar2, 0);
            m(o3a0Var.g, fetVar2, 0);
            l(o3a0Var.h, fetVar2, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(o3a0Var, function1, i, (byte) 20);
        }
    }

    public static final void v(l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-1860860669);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new eka(l7m0Var, (byte) 14));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var2 = (l7m0) objP;
            int i3 = i2 << 3;
            xcz xczVarB = qdzVar.b(((xeg) l7m0Var2.getValue()).getClass().getSimpleName(), new jyf((byte) 18), fetVar, i3 & 896);
            int i4 = (xczVarB.j().n - xczVarB.j().r) / 2;
            mm40 mm40VarE0 = o2e.e0(cjx.V(o7k0.c, x0x.a0(fetVar), null), "CYBER_CHAMPIONSHIP_COLUMN");
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
            xeg xegVar = (xeg) l7m0Var2.getValue();
            byte b2 = 6;
            if (Intrinsics.d(xegVar, veg.f37286a)) {
                fetVar.e0(-1446036473);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = jgk0.b(new eka(l7m0Var, (byte) 15));
                    fetVar.o0(objP2);
                }
                l7m0 l7m0Var3 = (l7m0) objP2;
                Object objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = jgk0.b(new eka(l7m0Var, (byte) 16));
                    fetVar.o0(objP3);
                }
                L(l7m0Var3, (l7m0) objP3, xczVarB, qdzVar, function2, fetVar, ((i2 << 6) & 7168) | 54 | (57344 & i3));
                fetVar.r(false);
            } else {
                if (!(xegVar instanceof weg)) {
                    throw b1j.f(923182570, fetVar, false);
                }
                fetVar.e0(-1445465918);
                mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, pkd.e(i4, fetVar), 7);
                Object objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = jgk0.b(new e8g((weg) xegVar, b2));
                    fetVar.o0(objP4);
                }
                t((i2 & 896) | 48, fetVar, mm40VarN, (l7m0) objP4, function1);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new keg(l7m0Var, qdzVar, function1, function2, i, (byte) 0);
        }
    }

    public static final void w(mm40 mm40Var, hsm hsmVar, float f, Function1 function1, Function0 function0, Function0 function2, xdr xdrVar, fet fetVar, int i) {
        ngk0 ngk0Var;
        pz40 pz40Var;
        int i2;
        int i3;
        qw3 qw3Var;
        Object v3l0Var;
        fetVar.g0(748835459);
        int i4 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= fetVar.g(hsmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= fetVar.i(xdrVar) ? 1048576 : 524288;
        }
        if (fetVar.U(i4 & 1, (599187 & i4) != 599186)) {
            boolean z = (i4 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                lc00 lc00VarB = kotlin.collections.a.b();
                String str = hsmVar.b;
                str.getClass();
                lc00VarB.add(new asm(str));
                a4x<usm> a4xVar = hsmVar.c;
                ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                for (usm usmVar : a4xVar) {
                    usmVar.getClass();
                    arrayList.add(new csm(usmVar));
                }
                lc00VarB.addAll(arrayList);
                String str2 = hsmVar.f13592a;
                str2.getClass();
                lc00VarB.add(new bsm(str2));
                objP = dyb.o0(kotlin.collections.a.a(lc00VarB));
                fetVar.o0(objP);
            }
            a4x a4xVar2 = (a4x) objP;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new ngk0();
                fetVar.o0(objP2);
            }
            ngk0 ngk0Var2 = (ngk0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(0L);
                fetVar.o0(objP3);
            }
            pz40 pz40Var2 = (pz40) objP3;
            if (xdrVar != null) {
                i3 = 3670016;
                fetVar.e0(497966667);
                boolean zG = ((i4 & 3670016) == 1048576) | fetVar.g(xczVarA);
                Object objP4 = fetVar.P();
                if (zG || objP4 == cl5Var) {
                    ngk0Var = ngk0Var2;
                    pz40Var = pz40Var2;
                    i2 = 131072;
                    v3l0Var = new v3l0(pz40Var, xczVarA, ngk0Var, xdrVar, null, (byte) 1);
                    fetVar.o0(v3l0Var);
                } else {
                    ngk0Var = ngk0Var2;
                    pz40Var = pz40Var2;
                    i2 = 131072;
                    v3l0Var = objP4;
                }
                m0x0.t(fetVar, xczVarA, (Function2) v3l0Var);
                fetVar.r(false);
            } else {
                i4 = i4;
                xczVarA = xczVarA;
                ngk0Var = ngk0Var2;
                cl5Var = cl5Var;
                pz40Var = pz40Var2;
                i2 = 131072;
                i3 = 3670016;
                fetVar.e0(498324159);
                fetVar.r(false);
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 88.0f), 1.0f);
            lh80 lh80VarT = s5x0.t(f, 0.0f, 2);
            qw3 qw3Var2 = new qw3(4.0f, true, new jf4((byte) 14));
            boolean zG2 = fetVar.g(a4xVar2) | ((i4 & i3) == 1048576) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384) | ((i4 & 458752) == i2);
            Object objP5 = fetVar.P();
            if (zG2 || objP5 == cl5Var) {
                qw3Var = qw3Var2;
                Object q3l0Var = new q3l0(a4xVar2, xdrVar, function1, function0, function2, ngk0Var, pz40Var, (byte) 1);
                fetVar.o0(q3l0Var);
                objP5 = q3l0Var;
            } else {
                qw3Var = qw3Var2;
            }
            b8k0.f(mm40VarD, xczVarA, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP5, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kb3(mm40Var, hsmVar, f, function1, function0, function2, xdrVar, i, (byte) 3);
        }
    }

    public static final void x(mm40 mm40Var, cll cllVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(2048300227);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(cllVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.e0(1321504623);
            y(mm40Var, cllVar, function1, fetVar, i2 & 1022);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bll(mm40Var, cllVar, function1, i, (byte) 0);
        }
    }

    public static final void y(mm40 mm40Var, cll cllVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1476332354);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(cllVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            long jM95getGray0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m95getGray0d7_KjU();
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new j2l((byte) 13);
                fetVar.o0(objP);
            }
            Function2 function2 = (Function2) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new xjl(b2);
                fetVar.o0(objP2);
            }
            v0h0 v0h0VarT = x8x.t((Function1) objP2, function2);
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new xal((byte) 20);
                fetVar.o0(objP3);
            }
            Map map = (Map) e9x.R(objArr, v0h0VarT, (Function0) objP3, fetVar, 384);
            boolean zG = fetVar.g(map);
            Object objP4 = fetVar.P();
            if (zG || objP4 == obj) {
                y3d y3dVar = (y3d) map.get(Long.valueOf(cllVar.f4565a));
                if (y3dVar != null) {
                    jM95getGray0d7_KjU = y3dVar.f41946a;
                }
                objP4 = androidx.compose.runtime.e.e(new y3d(jM95getGray0d7_KjU));
                fetVar.o0(objP4);
            }
            pz40 pz40Var = (pz40) objP4;
            Object obj2 = (Resources) fetVar.k(dy2.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 64.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            int i3 = i2 & 112;
            boolean z = (i3 == 32) | ((i2 & 896) == 256);
            Object objP5 = fetVar.P();
            if (z || objP5 == obj) {
                objP5 = new lrk(function1, cllVar, (byte) 7);
                fetVar.o0(objP5);
            }
            mm40 mm40VarE0 = o2e.e0(i120.Q(y860.W(mm40VarE2, null, null, false, null, (Function0) objP5, 28), ((y3d) pz40Var.getValue()).f41946a, jd8.n), "DS_CARD_LINE_BOX");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            Object objA = cllVar.b.a();
            mm40 mm40VarE1 = o2e.e0(ny9.O(3.25f, jr8.f16991a.b(o7k0.e(jm40.b, 64.0f), gqw0.c), false), "DS_CARD_LINE_IMAGE");
            boolean z2 = i3 == 32;
            Object objP6 = fetVar.P();
            if (z2 || objP6 == obj) {
                objP6 = new edl(cllVar, (byte) 8);
                fetVar.o0(objP6);
            }
            mm40 mm40VarA = pai0.a(mm40VarE1, false, (Function1) objP6);
            pge pgeVar = gqw0.A;
            boolean zI = fetVar.i(map) | (i3 == 32) | fetVar.g(pz40Var) | fetVar.i(obj2);
            Object objP7 = fetVar.P();
            if (zI || objP7 == obj) {
                Object dc0Var = new dc0((Object) map, (Object) cllVar, obj2, (Object) pz40Var, (byte) 27);
                fetVar.o0(dc0Var);
                objP7 = dc0Var;
            }
            k7x.b(objA, null, mm40VarA, null, null, null, null, (Function1) objP7, null, null, pgeVar, null, fetVar, 48, 6, 31608);
            U(s5x0.N(o7k0.c, 12.0f, 0.0f, 144.0f, 0.0f, 10), cllVar, fetVar, i3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bll(mm40Var, cllVar, function1, i, (byte) 1);
        }
    }

    public static final void z(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1275023735);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
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
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new xwy(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i2 & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var, mdmVar, function1, i, (byte) 14);
        }
    }
}
