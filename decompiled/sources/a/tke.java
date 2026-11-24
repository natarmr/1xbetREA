package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.javax.sip.message.Response;
import android.media.AudioDescriptor;
import android.os.Build;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f34090a = new ugd(1007358497, false, new wgd(29));
    public static final ugd b = new ugd(-417989136, false, new ehd(5));
    public static final ugd c = new ugd(-1511465482, false, new jhd(7));
    public static final ugd d = new ugd(721801349, false, new ohd(6));

    public static final void A(List list, fet fetVar, int i) {
        List list2;
        xcz xczVar;
        fetVar.g0(-1092367616);
        int i2 = (fetVar.g(list) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            Integer numValueOf = Integer.valueOf(list.size());
            byte b2 = 14;
            int i3 = i2 & 14;
            boolean zG = (i3 == 4) | fetVar.g(xczVarA);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                xczVar = xczVarA;
                lto0 lto0Var = new lto0((Object) cgk0Var, (Object) list, (Object) xczVar, (yje) null, (byte) 17);
                fetVar.o0(lto0Var);
                objP2 = lto0Var;
            } else {
                xczVar = xczVarA;
            }
            m0x0.t(fetVar, numValueOf, (Function2) objP2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40.b, qmk.a(fetVar).d, 0.0f, 2), 1.0f);
            xcz xczVar2 = xczVar;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b2));
            lh80 lh80VarU = s5x0.u(0.0f, 12.0f, 0.0f, 32.0f, 5);
            boolean z = i3 == 4;
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new gg4(list, (byte) 10);
                fetVar.o0(objP3);
            }
            list2 = list;
            b8k0.e(mm40VarD, xczVar2, lh80VarU, qw3Var, null, null, false, null, (Function1) objP3, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
        } else {
            list2 = list;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kv80(i, list2);
        }
    }

    public static final void B(mm40 mm40Var, n0x n0xVar, fet fetVar, int i) {
        fetVar.g0(509585825);
        byte b2 = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(n0xVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            uc9.c(n0qVar, o7k0.n(jm40.b, 86.0f), n0xVar, Integer.valueOf(R.drawable.ic_glyph_placeholder_player), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary10()), null, null, gqw0.B, dyb.g0(new bef()), fetVar, ((i2 << 3) & 896) | 113246214, 96);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nwa(mm40Var, n0xVar, i, b2);
        }
    }

    public static final void C(mm40 mm40Var, p6w p6wVar, boolean z, qdz qdzVar, e2d e2dVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-1097890584);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(p6wVar) ? 32 : 16;
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
            if (p6wVar instanceof m6w) {
                fetVar.e0(-1082076835);
                x(mm40Var, ((m6w) p6wVar).f21291a, function1, fetVar, (i3 & 14) | ((i3 >> 9) & 896));
                fetVar.r(false);
            } else if (p6wVar instanceof n6w) {
                fetVar.e0(1489119320);
                I(mm40Var, (n6w) p6wVar, fetVar, i3 & 126);
                fetVar.r(false);
            } else {
                if (!(p6wVar instanceof o6w)) {
                    throw b1j.f(1489113312, fetVar, false);
                }
                fetVar.e0(-1081839468);
                fetVar2 = fetVar;
                G(null, z, function1, u1c.M(495395385, new iwy(p6wVar, mm40Var, qdzVar, e2dVar, function1, (byte) 0), fetVar), fetVar2, ((i3 >> 3) & 112) | 3072 | ((i3 >> 9) & 896));
                fetVar2.r(false);
            }
            fetVar2 = fetVar;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mwy(mm40Var, p6wVar, z, qdzVar, e2dVar, function1, i, (byte) 0);
        }
    }

    public static final void D(int i, fet fetVar) {
        fetVar.g0(1378954423);
        if (fetVar.U(i & 1, i != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarK = s5x0.K(jm40Var, f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 32.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0VarD0));
            zq8.a(0, fetVar, o7k0.e(jm40Var, 12.0f));
            z(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            z(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            z(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            z(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            z(fqj0VarD0, fetVar, 0);
            zq8.a(0, fetVar, o7k0.e(jm40Var, 8.0f));
            z(fqj0VarD0, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zgp0(i, (byte) 19);
        }
    }

    public static final void E(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0 l7m0Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(43556650);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
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
            imm immVar = ((jn40) l7m0Var.getValue()).f16795a;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new m040(function1, (byte) 23);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            hlm.c(jm40Var, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            zcl zclVar = qmk.f28987a;
            float f = xfn.a(fetVar).c;
            ch80 ch80VarF = knm0.f(new lh80(f, 16.0f, f, 16.0f), fetVar);
            boolean z2 = (i2 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                l7m0Var2 = l7m0Var;
                objP2 = new ufp(l7m0Var2, (byte) 18);
                fetVar.o0(objP2);
            } else {
                l7m0Var2 = l7m0Var;
            }
            b8k0.e(jm40Var, null, ch80VarF, null, null, null, false, null, (Function1) objP2, fetVar, 6, 506);
            fetVar.r(true);
        } else {
            l7m0Var2 = l7m0Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s000(l7m0Var2, function1, i, (byte) 22);
        }
    }

    public static final void F(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i) {
        mdmVar.getClass();
        function0.getClass();
        fetVar.g0(182405389);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
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
            jcb.l(null, mdmVar, false, function0, fetVar, (i2 & 112) | ((i2 << 3) & 7168), 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gg8(mm40Var, mdmVar, function0, i, (byte) 12);
        }
    }

    public static final void G(mm40 mm40Var, boolean z, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        boolean z2;
        mm40 mm40Var2;
        fetVar.g0(-722039190);
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
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z3 = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new xwy(function1, b2);
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
            yfe0VarU.d = new an2(mm40Var2, z, function1, ugdVar, i, (byte) 1);
        }
    }

    public static final void H(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1952852765);
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
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 11);
        }
    }

    public static final void I(mm40 mm40Var, n6w n6wVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(2099068630);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(n6wVar) ? 32 : 16;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(6.0f, true, new jf4((byte) 14));
            lh80 lh80Var = new lh80(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 32.0f);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new djx(n6wVar, (byte) 20);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i2 & 14) | 12582912, 362);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kwy(mm40Var, n6wVar, i, b2);
        }
    }

    public static final void J(mm40 mm40Var, float f, fet fetVar, int i) {
        int i2;
        fetVar.g0(-418123047);
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
                objP = new ejk0((byte) 24);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarD, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 805306368, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dql(mm40Var, f, i, (byte) 4);
        }
    }

    public static final void K(int i, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(-892712970);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var2, 84.0f), 56.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            mm40 mm40VarS2 = o7k0.s(o7k0.e(s5x0.N(mm40Var2, 0.0f, 0.0f, 0.0f, 10.0f, 7), 56.0f), 56.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarC1 = xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS2), vbc.d0(null, fetVar, 0, 1));
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarC1);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            fetVar.r(true);
            mm40 mm40VarC3 = xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.d(o7k0.e(s5x0.L(mm40Var2, 4.0f, 0.0f, 2), 12.0f), 1.0f)), vbc.d0(null, fetVar, 0, 1));
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarC3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var2, i, (byte) 14);
        }
    }

    public static final void L(mm40 mm40Var, gsm gsmVar, float f, Function1 function1, Function0 function0, Function0 function2, xdr xdrVar, fet fetVar, int i, int i2) {
        gsmVar.getClass();
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
        if (!(gsmVar instanceof esm)) {
            mm40 mm40Var2 = mm40Var;
            if (!(gsmVar instanceof fsm)) {
                throw b1j.f(420086956, fetVar, false);
            }
            fetVar.e0(138270220);
            J(mm40Var2, f, fetVar, (i & 14) | ((i >> 3) & 112));
            fetVar.r(false);
            return;
        }
        fetVar.e0(137861795);
        Function0 function3 = function2;
        mm40 mm40Var3 = mm40Var;
        u(mm40Var3, (esm) gsmVar, f, function1, function0, function3, xdrVar, fetVar, 4194302 & i);
        fetVar.r(false);
    }

    public static final void M(mm40 mm40Var, o6w o6wVar, qdz qdzVar, e2d e2dVar, Function1 function1, fet fetVar, int i) {
        byte b2;
        mtl mtlVar = o6wVar.c;
        fetVar.g0(2049694759);
        byte b3 = 2;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(o6wVar) ? 32 : 16) | (fetVar.g(qdzVar) ? 256 : 128) | (fetVar.g(e2dVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            xcz xczVarB = qdzVar.b("ALT_HISTORY_RESULTS_SCREEN", new hvy(b3), fetVar, (i2 & 896) | 6);
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
                fetVar.e0(907250979);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new j6g0((byte) 17);
                    fetVar.o0(objP);
                }
                mm40VarV = cjx.V(mm40VarV, e2d.b(e2dVar, (Function0) objP), null);
                fetVar.r(false);
            } else {
                fetVar.e0(907342243);
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
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            ch80 ch80VarF = h97.f(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 32.0f, fetVar);
            boolean z = ((i2 & 112) == 32) | ((57344 & i2) == 16384);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                b2 = 0;
                objP2 = new twy(o6wVar, function1, b2);
                fetVar.o0(objP2);
            } else {
                b2 = 0;
            }
            b8k0.e(mm40VarE, xczVarB, ch80VarF, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            if (mtlVar != null) {
                fetVar.e0(-1411113871);
                cfx0.b(null, mtlVar, function1, fetVar, (i2 >> 6) & 896);
                fetVar.r(false);
            } else {
                fetVar.e0(-1410971643);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wwy(mm40Var, o6wVar, qdzVar, e2dVar, function1, i, (byte) 0);
        }
    }

    public static final void N(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-445965862);
        byte b2 = 4;
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b3 = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            f9m0 f9m0Var = new f9m0(R.string.text_broadcast, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0Var = ((w3q0) l7m0Var.getValue()).b().f17632a;
            j9m0 j9m0Var = ((w3q0) l7m0Var.getValue()).b().b;
            boolean zA = ((w3q0) l7m0Var.getValue()).a();
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new o0q0(function1, b2);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, zA, (Function0) objP, null, null, u1c.M(213621132, new dqz(l7m0Var, function1, b3), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i, (byte) 28);
        }
    }

    public static final void O(mm40 mm40Var, xkl xklVar, fet fetVar, int i) {
        int i2;
        byte b2;
        boolean z;
        int i3;
        qc0 qc0Var;
        String str;
        jm40 jm40Var;
        int i4;
        jm40 jm40Var2;
        xkl xklVar2;
        float f;
        xkl xklVar3 = xklVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(1965731904);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(xklVar3) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 6);
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
            String str2 = xklVar3.c;
            qc0 qc0Var2 = xklVar3.b;
            String str3 = xklVar3.e;
            int length = str2.length();
            jm40 jm40Var3 = jm40.b;
            if (length > 0) {
                fetVar2.e0(-2018966901);
                if (str3.length() > 0) {
                    zcl zclVar = qmk.f28987a;
                    f = 12.0f;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    f = 0.0f;
                }
                mm40 mm40VarN = s5x0.N(jm40Var3, 0.0f, 0.0f, 0.0f, f, 7);
                long j = qmk.r;
                long j2 = qmk.w;
                str = str3;
                jm40Var = jm40Var3;
                z = false;
                i3 = 1;
                qc0Var = qc0Var2;
                v8q0.a(xklVar3.c, mm40VarN, jM123getWhite0d7_KjU, new n05(j, j2, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j2, null, j1t0.f15753a, 0L, null, 0, 0, qmk.I, 16646109), fetVar, 0, 24960, 110576);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = false;
                i3 = 1;
                qc0Var = qc0Var2;
                str = str3;
                jm40Var = jm40Var3;
                fetVar2.e0(-2018390952);
                fetVar2.r(false);
            }
            int iOrdinal = qc0Var.ordinal();
            if (iOrdinal == 0) {
                i4 = 3;
                jM123getWhite0d7_KjU = jM123getWhite0d7_KjU;
                fetVar2.e0(-2018310817);
                jm40Var2 = jm40Var;
                mm40 mm40VarA = o7k0.A(jm40Var2, null, 3);
                zcl zclVar3 = qmk.f28987a;
                xklVar2 = xklVar;
                j6n.h(xklVar2.e, dqo0.f6527a, s5x0.N(mm40VarA, 0.0f, 0.0f, 0.0f, 6.0f, 7), 0, 0, fetVar2, 48, 24);
                fetVar2.r(z);
            } else {
                if (iOrdinal != i3 && iOrdinal != 2 && iOrdinal != 3) {
                    throw b1j.f(-480750008, fetVar2, z);
                }
                fetVar2.e0(-2017964268);
                if (str.length() > 0) {
                    fetVar2.e0(-2017892224);
                    long j3 = qmk.p;
                    long j4 = qmk.q;
                    i4 = 3;
                    v8q0.a(xklVar.e, null, jM123getWhite0d7_KjU, new n05(j3, j4, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j4, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110578);
                    fetVar2 = fetVar;
                    fetVar2.r(z);
                } else {
                    i4 = 3;
                    fetVar2.e0(-2017359272);
                    fetVar2.r(z);
                }
                fetVar2.r(z);
                xklVar2 = xklVar;
                jm40Var2 = jm40Var;
            }
            int iOrdinal2 = qc0Var.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                fetVar2.e0(-2017235086);
                zcl zclVar4 = qmk.f28987a;
                mm40 mm40VarN2 = s5x0.N(jm40Var2, 0.0f, 6.0f, 0.0f, 0.0f, 13);
                long j5 = qmk.r;
                long j6 = qmk.w;
                xklVar3 = xklVar;
                v8q0.a(xklVar2.d, mm40VarN2, jM123getWhite0d7_KjU, new n05(j5, j6, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j6, null, j1t0.f15753a, 0L, null, 0, 0, qmk.I, 16646109), fetVar, 0, 24960, 110576);
                fetVar2 = fetVar;
                fetVar2.r(z);
            } else {
                if (iOrdinal2 != 2 && iOrdinal2 != i4) {
                    throw b1j.f(-480716299, fetVar2, z);
                }
                fetVar2.e0(-2016630029);
                fetVar2.r(z);
                xklVar3 = xklVar2;
            }
            b2 = 1;
            fetVar2.r(true);
        } else {
            b2 = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl(mm40Var, xklVar3, i, b2);
        }
    }

    public static final void P(int i, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1118903995);
        int i2 = i | 6;
        byte b2 = 0;
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(n0qVar, 0.0f, 8.0f, 0.0f, 0.0f, 13);
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
            nkb.h(null, new ijm(), kjm.f18392a, null, null, null, fetVar, 384, 57);
            mm40Var2 = jm40.b;
            fetVar2 = fetVar;
            ebc.r(s5x0.L(mm40Var2, 0.0f, 8.0f, 1), new gyl(null, s5x0.t(xfn.a(fetVar).e, 0.0f, 2), 1), null, null, null, fetVar2, 0, 60);
            mm40 mm40VarL = s5x0.L(o7k0.e(o7k0.d(mm40Var2, 1.0f), 560.0f), xfn.a(fetVar2).c, 0.0f, 2);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarL), vbc.d0(null, fetVar2, 0, 1), fetVar2, true);
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tsu0(mm40Var2, i, b2);
        }
    }

    public static final List Q(Class cls) {
        return pgi0.t(pgi0.k(lgi0.e(i13.B, cls), i13.Y));
    }

    public static final pzs0 R(pzs0 pzs0Var, hzs0 hzs0Var) {
        if (hzs0Var == null || pzs0Var.a() == t3u0.c) {
            return pzs0Var;
        }
        if (hzs0Var.t() != pzs0Var.a()) {
            caa caaVar = new caa(pzs0Var);
            ays0.b.getClass();
            return new q4m0(new z9a(pzs0Var, caaVar, false, ays0.c));
        }
        if (!pzs0Var.c()) {
            return new q4m0(pzs0Var.b());
        }
        wt00 wt00Var = eu00.e;
        wt00Var.getClass();
        return new q4m0(new zez(wt00Var, new h79(pzs0Var, (byte) 9)));
    }

    public static iyj0 S(Type type, fhy fhyVar, List list, boolean z) {
        return new iyj0(fhyVar, list, z, new obx(iun.f15405a), null, false, false, false, null, new rke(type, (byte) 3));
    }

    public static final iyj0 T(iyj0 iyj0Var, Type type) {
        yx40 yx40VarA;
        fhy fhyVar = iyj0Var.b;
        sgy sgyVar = fhyVar instanceof sgy ? (sgy) fhyVar : null;
        if (sgyVar == null || (yx40VarA = md9.a(sgyVar)) == null) {
            return null;
        }
        return new iyj0(iyj0Var.b, iyj0Var.c, iyj0Var.d, new obx(iun.f15405a), null, false, false, false, yx40VarA, new rke(type, (byte) 3));
    }

    public static b4x U(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            v3x v3xVar = b4x.b;
            return rcf0.e;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(new t24((byte) 0)).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorI = ow2.i(it.next());
            if (audioDescriptorI.getStandard() == 1) {
                byte[] descriptor = audioDescriptorI.getDescriptor();
                if (descriptor.length != 3) {
                    f1t0.g0("AudioDescriptorUtil", "Invalid SAD length: " + descriptor.length);
                } else {
                    byte b2 = descriptor[0];
                    int i = (b2 & 7) + 1;
                    if (((b2 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(vtt0.p(i)));
                    }
                }
            }
        }
        return b4x.o(treeSet);
    }

    public static final oiy V(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (xgy) sre0.f32672a.b((Class) genericDeclaration);
        }
        boolean z = false;
        Object obj = null;
        if (genericDeclaration instanceof Constructor) {
            Class declaringClass = ((Constructor) genericDeclaration).getDeclaringClass();
            declaringClass.getClass();
            xgy xgyVar = (xgy) sre0.f32672a.b(declaringClass);
            Iterator it = xgyVar.g().iterator();
            Object obj2 = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                    obj = obj2;
                    break;
                }
                Object next = it.next();
                if (Intrinsics.d(uvw.x((jhy) next), genericDeclaration)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            }
            h9y h9yVar = (h9y) obj;
            if (h9yVar != null) {
                return h9yVar;
            }
            StringBuilder sb = new StringBuilder("Constructor ");
            sb.append(genericDeclaration);
            sb.append(" is not found in ");
            sb.append(xgyVar);
            String strB0 = CollectionsKt.b0(xgyVar.g(), Separators.RETURN, null, null, ske.b, 30);
            sb.append(":\n");
            sb.append(strB0);
            throw new poe(sb.toString());
        }
        if (!(genericDeclaration instanceof Method)) {
            c99.u("Unsupported container of a type parameter: ", genericDeclaration, " (", typeVariable);
            return null;
        }
        Class<?> declaringClass2 = ((Method) genericDeclaration).getDeclaringClass();
        declaringClass2.getClass();
        xgy xgyVar2 = (xgy) sre0.f32672a.b(declaringClass2);
        Iterator it2 = n2x.z(xgyVar2).iterator();
        Object obj3 = null;
        while (true) {
            if (!it2.hasNext()) {
                if (!z) {
                    break;
                }
                obj = obj3;
                break;
            }
            Object next2 = it2.next();
            if (Intrinsics.d(uvw.z((jhy) next2), genericDeclaration)) {
                if (z) {
                    break;
                }
                z = true;
                obj3 = next2;
            }
        }
        i9y i9yVar = (i9y) obj;
        if (i9yVar != null) {
            return i9yVar;
        }
        StringBuilder sb2 = new StringBuilder("Method ");
        sb2.append(genericDeclaration);
        sb2.append(" is not found in ");
        sb2.append(xgyVar2);
        String strB1 = CollectionsKt.b0(n2x.z(xgyVar2), Separators.RETURN, null, null, i13.z, 30);
        sb2.append(":\n");
        sb2.append(strB1);
        throw new poe(sb2.toString());
    }

    public static final boolean W(Member member) {
        member.getClass();
        if (!(member instanceof Method)) {
            return false;
        }
        Method method = (Method) member;
        if (!method.getDeclaringClass().isEnum() || !Modifier.isStatic(method.getModifiers())) {
            return false;
        }
        if (Intrinsics.d(method.getName(), "values") && method.getParameterTypes().length == 0) {
            return true;
        }
        if (!Intrinsics.d(method.getName(), "valueOf")) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        return Intrinsics.d(tx3.X(parameterTypes), String.class);
    }

    public static final boolean X(sgy sgyVar) {
        sgyVar.getClass();
        return !Intrinsics.d(azw.G(sgyVar).getCanonicalName(), sgyVar.v());
    }

    public static final mm40 Y(udl0 udl0Var, fet fetVar, int i) {
        ljc ljcVar = jd8.n;
        long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
        boolean z = (((i & 112) ^ 48) > 32 && fetVar.e(udl0Var.ordinal())) || (i & 48) == 32;
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            int iOrdinal = udl0Var.ordinal();
            jm40 jm40Var = jm40.b;
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                Object objQ = i120.Q(jm40Var, background, ljcVar);
                objP = objQ;
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                objP = jm40Var;
            }
            fetVar.o0(objP);
        }
        return (mm40) objP;
    }

    public static final mm40 Z(udl0 udl0Var, fet fetVar, int i) {
        float f;
        float f2;
        long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
        int iOrdinal = udl0Var.ordinal();
        if (iOrdinal == 0) {
            fetVar.e0(-1022604657);
            zcl zclVar = qmk.f28987a;
            f = qmk.a(fetVar).d;
            fetVar.r(false);
        } else if (iOrdinal == 1) {
            fetVar.e0(-1022602385);
            zcl zclVar2 = qmk.f28987a;
            f = qmk.a(fetVar).d;
            fetVar.r(false);
        } else if (iOrdinal == 2) {
            fetVar.e0(-1022598176);
            fetVar.r(false);
            zcl zclVar3 = qmk.f28987a;
            f = 8.0f;
        } else {
            if (iOrdinal != 3) {
                throw b1j.f(-1022606664, fetVar, false);
            }
            fetVar.e0(-1022600240);
            zcl zclVar4 = qmk.f28987a;
            f = qmk.a(fetVar).c;
            fetVar.r(false);
        }
        boolean z = (((i & 112) ^ 48) > 32 && fetVar.e(udl0Var.ordinal())) || (i & 48) == 32;
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            int iOrdinal2 = udl0Var.ordinal();
            if (iOrdinal2 == 0) {
                f2 = 24.0f;
            } else {
                if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3) {
                    t9f.b();
                    return null;
                }
                f2 = 0.0f;
            }
            mm40 mm40VarL = jm40.b;
            mm40 mm40VarE = s5x0.N(s5x0.L(mm40VarL, f, 0.0f, 2), 0.0f, 0.0f, 0.0f, f2, 7).e(o7k0.c);
            if (udl0Var == udl0.LITE) {
                zcl zclVar5 = qmk.k;
                zcl zclVar6 = qmk.f28987a;
                mm40VarL = s5x0.L(h97.e(zclVar5, zclVar5, zclVar6, zclVar6, i120.Q(mm40VarL, background, new ugg0(zclVar5, zclVar5, zclVar6, zclVar6))), 4.0f, 0.0f, 2);
            }
            objP = mm40VarE.e(mm40VarL);
            fetVar.o0(objP);
        }
        return (mm40) objP;
    }

    public static final void a(mm40 mm40Var, ph0 ph0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        ph0Var.getClass();
        fetVar.g0(2005296052);
        int i2 = i | 6 | (fetVar.g(ph0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(o7k0.s(mm40Var2, 80.0f), 104.0f), "CATEGORY_RECTANGLE");
            if (ph0Var instanceof nh0) {
                fetVar.e0(1074940790);
                b(mm40VarE0, (nh0) ph0Var, function1, fetVar, i2 & 1008);
                fetVar.r(false);
            } else {
                if (!ph0Var.equals(oh0.f25241a)) {
                    throw b1j.f(-1350799834, fetVar, false);
                }
                fetVar.e0(1075170066);
                c(0, fetVar, null);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ih0(mm40Var2, ph0Var, function1, i, (byte) 4);
        }
    }

    public static final void a0(Matrix matrix, float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
    }

    public static final void b(mm40 mm40Var, nh0 nh0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1711655034);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(nh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 80.0f), 104.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), vgg0.a(12.0f)), 8.0f);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new jh0(function1, nh0Var, (byte) 4);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarJ, gy40Var, null, false, null, (Function0) objP2, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 54);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar2 = qmk.m;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarN, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "CATEGORY_CARD_BOX");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE0);
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
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP3);
            }
            pz40 pz40Var = (pz40) objP3;
            k1x k1xVar = new k1x((Context) fetVar.k(dy2.b));
            k1xVar.c = nh0Var.c;
            t1x.f(k1xVar, R.drawable.ic_glyph_category_new);
            t1x.c(k1xVar, R.drawable.ic_glyph_category_new);
            k1xVar.c((int) pkd.b(24.0f, fetVar));
            o1x o1xVarA = k1xVar.a();
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new we(pz40Var, (byte) 9);
                fetVar.o0(objP4);
            }
            mz3 mz3VarX = l7x.X(o1xVarA, (Function1) objP4, null, fetVar, 384, 26);
            mm40 mm40VarE1 = o2e.e0(o7k0.n(jm40Var, 24.0f), "CATEGORY_CARD_IMAGE");
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new we(pz40Var, (byte) 10);
                fetVar.o0(objP5);
            }
            j0x.b(mz3VarX, null, pai0.a(mm40VarE1, false, (Function1) objP5), null, gqw0.A, 0.0f, new m78(((ThemeColors) fetVar.k(zfnVar)).getPrimary(), 5), fetVar, 24624, 40);
            fetVar.r(true);
            qxw.o(fetVar, new x7z(1.0f, true));
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = androidx.compose.runtime.e.a(0.0f);
                fetVar.o0(objP6);
            }
            agk0 agk0Var = (agk0) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP7);
            }
            cgk0 cgk0Var = (cgk0) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == cl5Var) {
                objP8 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP8);
            }
            pz40 pz40Var2 = (pz40) objP8;
            mm40 mm40VarE2 = o2e.e0(s5x0.N(o7k0.d(jm40Var, 1.0f), 8.0f, 8.0f, 12.0f, 0.0f, 8), "CATEGORY_CARD_TITLE");
            Object objP9 = fetVar.P();
            if (objP9 == cl5Var) {
                objP9 = new kh0(agk0Var, cgk0Var, pz40Var2, (byte) 4);
                fetVar.o0(objP9);
            }
            mm40 mm40VarA = pai0.a(mm40VarE2, false, (Function1) objP9);
            String str = nh0Var.b;
            long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            qrq qrqVar = j1t0.b;
            long j = qmk.q;
            y9q0 y9q0Var = new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.D, 16646045);
            n05 n05Var = new n05(qmk.p, j, idm0.s(0.25d));
            byte b2 = 5;
            f2q0 f2q0Var = new f2q0(5);
            Object objP10 = fetVar.P();
            if (objP10 == cl5Var) {
                objP10 = new kh0(agk0Var, cgk0Var, pz40Var2, b2);
                fetVar.o0(objP10);
            }
            v8q0.a(str, mm40VarA, textPrimary, n05Var, 0L, null, null, null, 0L, f2q0Var, 0L, 2, true, 2, 0, (Function1) objP10, y9q0Var, fetVar, 0, 1600896, 35824);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lh0(mm40Var, nh0Var, function1, i, (byte) 4);
        }
    }

    public static final void b0(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1976706040);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 80.0f), 104.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i, (byte) 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r17v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57, types: [a.bzw, a.y3d] */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v68, types: [a.bzw, a.y3d] */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v5, types: [a.bzw, a.y3d, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final rno0 c0(d140 d140Var, ctf0 ctf0Var, qho qhoVar, String str) {
        String str2;
        Iterable iterableA0;
        my30 jy30Var;
        ?? r6;
        gy30 gy30Var;
        gy30 gy30Var2;
        gy30 gy30Var3;
        gy30 gy30Var4;
        ?? r1;
        int i;
        wx30 ux30Var;
        ?? r2;
        int i2;
        wx30 ux30Var2;
        bzw bzwVar;
        miz kizVar;
        ctf0Var.getClass();
        str.getClass();
        Map map = d140Var.q;
        LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
        Iterator it = map.entrySet().iterator();
        while (true) {
            int i3 = 0;
            ?? r5 = 0;
            if (!it.hasNext()) {
                String str3 = d140Var.u;
                List listL0 = CollectionsKt.L0(d140Var.r);
                Set<r040> setKeySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList();
                for (r040 r040Var : setKeySet) {
                    List list = (List) linkedHashMap.get(r040Var);
                    if (list != null) {
                        str2 = str3;
                        iterableA0 = xww.a0(list, listL0, r040Var, ctf0Var, qhoVar, str2, new x7(r040Var, (byte) 0));
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
                return new rno0(dyb.o0(arrayList), d140Var.l);
            }
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            r040 r040Var2 = (r040) entry.getKey();
            List list2 = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                nw30 nw30VarK0 = yyw.k0((yx10) it2.next(), ctf0Var, qhoVar, d140Var.x, r040Var2, d140Var.w, d140Var.y, str);
                ?? r16 = ((nw30VarK0 instanceof hw30) || (nw30VarK0 instanceof pv30)) ? 1 : i3;
                if ((nw30VarK0 instanceof ew30) || (nw30VarK0 instanceof iw30) || (nw30VarK0 instanceof nv30) || (nw30VarK0 instanceof ov30) || (nw30VarK0 instanceof rv30) || (nw30VarK0 instanceof sv30) || (nw30VarK0 instanceof tv30) || (nw30VarK0 instanceof xv30) || (nw30VarK0 instanceof yv30) || (nw30VarK0 instanceof aw30) || (nw30VarK0 instanceof zv30) || (nw30VarK0 instanceof uv30) || (nw30VarK0 instanceof mw30) || (nw30VarK0 instanceof cw30) || (nw30VarK0 instanceof qv30) || (nw30VarK0 instanceof jw30) || (nw30VarK0 instanceof dw30) || (nw30VarK0 instanceof lw30) || (nw30VarK0 instanceof vv30) || (nw30VarK0 instanceof wv30) || (nw30VarK0 instanceof bw30)) {
                    jy30Var = new jy30(nw30VarK0.m(), nw30VarK0.n(), r16, yyw.g0(nw30VarK0), yyw.h0(nw30VarK0), h0(nw30VarK0));
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
                                key = key;
                                r6 = r5;
                                gy30Var = ((pv30) nw30VarK0).b;
                                break;
                            case 1:
                                it = it;
                                it2 = it2;
                                key = key;
                                ew30 ew30Var = (ew30) nw30VarK0;
                                ux30 ux30Var3 = new ux30(10, 0L, ew30Var.e, ew30Var.f);
                                int i4 = ew30Var.d;
                                r6 = 0;
                                gy30Var = new gy30(ux30Var3, new rx30(new m0x(i4, null, 6), 0L, ew30Var.b ? new kiz(new rf5(3, null)) : lizVar, i4, 0L, null, 498), ey30Var, 0L, null, null, 248);
                                break;
                            case 2:
                                mw30 mw30Var = (mw30) nw30VarK0;
                                ux30 ux30Var4 = new ux30(10, 0L, mw30Var.e, mw30Var.f);
                                int i5 = mw30Var.d;
                                gy30Var2 = new gy30(ux30Var4, new rx30(new m0x(i5, null, 6), 0L, mw30Var.f22484a ? new kiz(new rf5(3, null)) : lizVar, i5, 0L, null, 498), new by30(mw30Var.g), 0L, null, null, 248);
                                gy30Var = gy30Var2;
                                r6 = 0;
                                break;
                            case 3:
                                fw30 fw30Var = (fw30) nw30VarK0;
                                ux30 ux30Var5 = new ux30(10, 0L, fw30Var.h, "");
                                pz40 pz40Var = s6t0.f31722a;
                                gy30Var3 = new gy30(ux30Var5, new rx30(new n0x(fw30Var.e), 0L, fw30Var.f10240a ? new kiz(new rf5(3, null)) : lizVar, R.drawable.sport_new, 0L, new qc5(null, new n0x(fw30Var.f), y3d.a(s6t0.a().getBackground())), 434), new zx30(new n0x(fw30Var.i), 3), 0L, null, null, 248);
                                gy30Var = gy30Var3;
                                r6 = 0;
                                break;
                            case 4:
                                iw30 iw30Var = (iw30) nw30VarK0;
                                ux30 ux30Var6 = new ux30(10, 0L, iw30Var.e, iw30Var.f);
                                int i6 = iw30Var.d;
                                rx30 rx30Var = new rx30(new m0x(i6, null, 6), 0L, iw30Var.b ? new kiz(new rf5(3, null)) : lizVar, i6, 0L, null, 498);
                                rpe rpeVar = new rpe(iw30Var.g);
                                pz40 pz40Var2 = s6t0.f31722a;
                                StaticColors staticColors = StaticColors.INSTANCE;
                                gy30Var4 = new gy30(ux30Var6, rx30Var, new dy30(rpeVar, new kpe(staticColors.m113getRed0d7_KjU(), staticColors.m123getWhite0d7_KjU())), 0L, null, null, 248);
                                gy30Var = gy30Var4;
                                r6 = 0;
                                break;
                            case 5:
                                it = it;
                                it2 = it2;
                                key = key;
                                qv30 qv30Var = (qv30) nw30VarK0;
                                ux30 ux30Var7 = new ux30(10, 0L, qv30Var.e, qv30Var.f);
                                int i7 = qv30Var.d;
                                gy30Var = new gy30(ux30Var7, new rx30(new m0x(i7, null, 6), 0L, qv30Var.b ? new kiz(new rf5(3, null)) : lizVar, i7, 0L, null, 498), new zx30(new n0x(qv30Var.g), 3), 0L, null, null, 248);
                                r6 = 0;
                                break;
                            case 6:
                                jw30 jw30Var = (jw30) nw30VarK0;
                                ux30 ux30Var8 = new ux30(10, 0L, jw30Var.e, jw30Var.f);
                                int i8 = jw30Var.d;
                                gy30Var2 = new gy30(ux30Var8, new rx30(new m0x(i8, null, 6), 0L, jw30Var.b ? new kiz(new rf5(3, null)) : lizVar, i8, 0L, null, 498), new zx30(new n0x(jw30Var.g), 3), 0L, null, null, 248);
                                gy30Var = gy30Var2;
                                r6 = 0;
                                break;
                            case 7:
                                dw30 dw30Var = (dw30) nw30VarK0;
                                ux30 ux30Var9 = new ux30(10, 0L, dw30Var.e, dw30Var.f);
                                int i9 = dw30Var.d;
                                gy30Var3 = new gy30(ux30Var9, new rx30(new m0x(i9, null, 6), 0L, dw30Var.b ? new kiz(new rf5(3, null)) : lizVar, i9, 0L, null, 498), new zx30(new n0x(dw30Var.g), 3), 0L, null, null, 248);
                                gy30Var = gy30Var3;
                                r6 = 0;
                                break;
                            case 8:
                                uv30 uv30Var = (uv30) nw30VarK0;
                                ux30 ux30Var10 = new ux30(10, 0L, uv30Var.e, uv30Var.f);
                                int i10 = uv30Var.d;
                                gy30Var4 = new gy30(ux30Var10, new rx30(new m0x(i10, null, 6), 0L, uv30Var.b ? new kiz(new rf5(3, null)) : lizVar, i10, 0L, null, 498), new zx30(new m0x(uv30Var.g, null, 6), 3), 0L, null, null, 248);
                                gy30Var = gy30Var4;
                                r6 = 0;
                                break;
                            case 9:
                                it = it;
                                it2 = it2;
                                key = key;
                                ov30 ov30Var = (ov30) nw30VarK0;
                                ux30 ux30Var11 = new ux30(10, 0L, ov30Var.i, ov30Var.j);
                                pc5 pc5Var = new pc5(y3d.a(ov30Var.f));
                                gy30Var = new gy30(ux30Var11, new rx30(new n0x(ov30Var.d), ov30Var.e, ov30Var.f25907a ? new kiz(new rf5(3, null)) : lizVar, ov30Var.g, ov30Var.h, pc5Var, Response.UNSUPPORTED_URI_SCHEME), ey30Var, 0L, null, null, 248);
                                r6 = 0;
                                break;
                            case 10:
                                rv30 rv30Var = (rv30) nw30VarK0;
                                List list3 = rv30Var.k;
                                String str4 = rv30Var.h;
                                pz40 pz40Var3 = s6t0.f31722a;
                                StaticColors staticColors2 = StaticColors.INSTANCE;
                                ux30 ux30Var12 = new ux30(staticColors2.m123getWhite0d7_KjU(), staticColors2.m131getWhite800d7_KjU(), str4, rv30Var.i);
                                pc5 pc5Var2 = new pc5(y3d.a(rv30Var.g));
                                int i11 = rv30Var.e;
                                gy30Var4 = new gy30(ux30Var12, new rx30(new m0x(i11, null, 6), rv30Var.f, rv30Var.b ? new kiz(new rf5(3, null)) : lizVar, i11, 0L, pc5Var2, 432), new zx30(new m0x(rv30Var.j, rv30Var.l, 4), 3), 0L, list3, null, 216);
                                gy30Var = gy30Var4;
                                r6 = 0;
                                break;
                            case 11:
                                sv30 sv30Var = (sv30) nw30VarK0;
                                long j = sv30Var.j;
                                String str5 = sv30Var.g;
                                pz40 pz40Var4 = s6t0.f31722a;
                                StaticColors staticColors3 = StaticColors.INSTANCE;
                                ux30 ux30Var13 = new ux30(staticColors3.m123getWhite0d7_KjU(), staticColors3.m131getWhite800d7_KjU(), str5, sv30Var.h);
                                int i12 = sv30Var.d;
                                gy30Var4 = new gy30(ux30Var13, new rx30(new m0x(i12, null, 6), 0L, sv30Var.b ? new kiz(new rf5(3, null)) : lizVar, i12, 0L, new pc5(y3d.a(sv30Var.f)), 434), new zx30(new m0x(sv30Var.i, null, 6), 3), j, null, null, 240);
                                gy30Var = gy30Var4;
                                r6 = 0;
                                break;
                            case 12:
                                it = it;
                                it2 = it2;
                                key = key;
                                nv30 nv30Var = (nv30) nw30VarK0;
                                boolean z = nv30Var.g;
                                String str6 = nv30Var.e;
                                String str7 = nv30Var.f;
                                if (z) {
                                    r1 = 0;
                                    i = 6;
                                    ux30Var = new vx30(str6, str7, new m0x(R.drawable.ic_status_green_check_circle, null, 6));
                                } else {
                                    r1 = 0;
                                    i = 6;
                                    ux30Var = new ux30(10, 0L, str6, str7);
                                }
                                int i13 = nv30Var.d;
                                new gy30(ux30Var, new rx30(new m0x(i13, r1, i), 0L, nv30Var.b ? new kiz(new rf5(3, r1)) : lizVar, i13, 0L, null, 498), ey30Var, 0L, null, null, 248);
                                r6 = 0;
                                break;
                            case 13:
                                tv30 tv30Var = (tv30) nw30VarK0;
                                long j2 = tv30Var.i;
                                String str8 = tv30Var.f;
                                pz40 pz40Var5 = s6t0.f31722a;
                                StaticColors staticColors4 = StaticColors.INSTANCE;
                                ux30 ux30Var14 = new ux30(staticColors4.m123getWhite0d7_KjU(), staticColors4.m131getWhite800d7_KjU(), str8, tv30Var.g);
                                int i14 = tv30Var.c;
                                gy30Var4 = new gy30(ux30Var14, new rx30(new m0x(i14, null, 6), tv30Var.d, tv30Var.f34580a ? new kiz(new rf5(3, null)) : lizVar, i14, 0L, null, 496), new zx30(new m0x(tv30Var.h, null, 6), 3), j2, null, null, 240);
                                gy30Var = gy30Var4;
                                r6 = 0;
                                break;
                            case 14:
                                it = it;
                                it2 = it2;
                                key = key;
                                lw30 lw30Var = (lw30) nw30VarK0;
                                gy30Var = new gy30(new ux30(14, 0L, lw30Var.g, (String) null), new rx30(new n0x(lw30Var.f), 0L, lw30Var.f20744a ? new kiz(new rf5(3, null)) : lizVar, R.drawable.ic_glyph_language, 0L, null, 498), ey30Var, 0L, null, null, 248);
                                r6 = 0;
                                break;
                            case 15:
                                it = it;
                                it2 = it2;
                                key = key;
                                vv30 vv30Var = (vv30) nw30VarK0;
                                boolean z2 = vv30Var.g;
                                String str9 = vv30Var.e;
                                String str10 = vv30Var.f;
                                if (z2) {
                                    r2 = 0;
                                    i2 = 6;
                                    ux30Var2 = new vx30(str9, str10, new m0x(R.drawable.ic_status_green_check_circle, null, 6));
                                } else {
                                    r2 = 0;
                                    i2 = 6;
                                    ux30Var2 = new ux30(10, 0L, str9, str10);
                                }
                                int i15 = vv30Var.d;
                                new gy30(ux30Var2, new rx30(new m0x(i15, r2, i2), 0L, vv30Var.b ? new kiz(new rf5(3, r2)) : lizVar, i15, 0L, null, 498), ey30Var, 0L, null, null, 248);
                                r6 = 0;
                                break;
                            case 16:
                                it = it;
                                it2 = it2;
                                key = key;
                                wv30 wv30Var = (wv30) nw30VarK0;
                                gy30Var = new gy30(new ux30(10, 0L, wv30Var.f, wv30Var.g), new rx30(new n0x(wv30Var.d), 0L, wv30Var.f39822a ? new kiz(new rf5(3, null)) : lizVar, wv30Var.e, 0L, null, 498), ey30Var, 0L, null, null, 248);
                                r6 = 0;
                                break;
                            case 17:
                                xv30 xv30Var = (xv30) nw30VarK0;
                                List list4 = xv30Var.k;
                                String str11 = xv30Var.h;
                                pz40 pz40Var6 = s6t0.f31722a;
                                StaticColors staticColors5 = StaticColors.INSTANCE;
                                ux30 ux30Var15 = new ux30(staticColors5.m123getWhite0d7_KjU(), staticColors5.m131getWhite800d7_KjU(), str11, xv30Var.i);
                                pc5 pc5Var3 = new pc5(y3d.a(xv30Var.g));
                                int i16 = xv30Var.e;
                                gy30Var4 = new gy30(ux30Var15, new rx30(new m0x(i16, null, 6), xv30Var.f, xv30Var.b ? new kiz(new rf5(3, null)) : lizVar, i16, 0L, pc5Var3, 432), new zx30(new m0x(xv30Var.j, xv30Var.l, 4), 3), 0L, list4, null, 216);
                                gy30Var = gy30Var4;
                                r6 = 0;
                                break;
                            case 18:
                                yv30 yv30Var = (yv30) nw30VarK0;
                                long j3 = yv30Var.j;
                                String str12 = yv30Var.g;
                                pz40 pz40Var7 = s6t0.f31722a;
                                StaticColors staticColors6 = StaticColors.INSTANCE;
                                ux30 ux30Var16 = new ux30(staticColors6.m123getWhite0d7_KjU(), staticColors6.m131getWhite800d7_KjU(), str12, yv30Var.h);
                                int i17 = yv30Var.d;
                                long j4 = yv30Var.e;
                                m0x m0xVar = new m0x(i17, r5, 6);
                                pc5 pc5Var4 = new pc5(y3d.a(yv30Var.f));
                                if (yv30Var.b) {
                                    bzwVar = null;
                                    kizVar = new kiz(new rf5(3, null));
                                } else {
                                    bzwVar = null;
                                    kizVar = lizVar;
                                }
                                gy30Var4 = new gy30(ux30Var16, new rx30(m0xVar, j4, kizVar, i17, 0L, pc5Var4, 432), new zx30(new m0x(yv30Var.i, bzwVar, 6), 3), j3, null, null, 240);
                                gy30Var = gy30Var4;
                                r6 = 0;
                                break;
                            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                it = it;
                                it2 = it2;
                                zv30 zv30Var = (zv30) nw30VarK0;
                                ux30 ux30Var17 = new ux30(10, 0L, zv30Var.e, zv30Var.f);
                                int i18 = zv30Var.d;
                                gy30Var = new gy30(ux30Var17, new rx30(new m0x(i18, r5, 6), 0L, zv30Var.b ? new kiz(new rf5(3, r5)) : lizVar, i18, 0L, null, 498), new zx30(new m0x(zv30Var.g, r5, 6), 3), 0L, null, null, 248);
                                r6 = r5;
                                break;
                            case 20:
                                aw30 aw30Var = (aw30) nw30VarK0;
                                ux30 ux30Var18 = new ux30(10, 0L, aw30Var.e, aw30Var.f);
                                int i19 = aw30Var.d;
                                gy30Var = new gy30(ux30Var18, new rx30(new m0x(i19, r5, 6), 0L, aw30Var.b ? new kiz(new rf5(3, r5)) : lizVar, i19, 0L, null, 498), ey30Var, 0L, null, null, 248);
                                r6 = r5;
                                break;
                            case 21:
                                bw30 bw30Var = (bw30) nw30VarK0;
                                gy30Var = new gy30(new ux30(14, 0L, bw30Var.g, (String) null), new rx30(new n0x(bw30Var.f), 0L, bw30Var.f3307a ? new kiz(new rf5(3, r5)) : lizVar, R.drawable.ic_glyph_language, 0L, null, 498), ey30Var, 0L, null, null, 248);
                                r6 = r5;
                                break;
                            case 22:
                                it = it;
                                it2 = it2;
                                cw30 cw30Var = (cw30) nw30VarK0;
                                ux30 ux30Var19 = new ux30(10, 0L, cw30Var.e, cw30Var.f);
                                int i20 = cw30Var.d;
                                gy30Var = new gy30(ux30Var19, new rx30(new m0x(i20, r5, 6), 0L, cw30Var.f5062a ? new kiz(new rf5(3, r5)) : lizVar, i20, 0L, null, 498), new by30(cw30Var.g), 0L, null, null, 248);
                                r6 = r5;
                                break;
                            case 23:
                                gw30 gw30Var = (gw30) nw30VarK0;
                                ux30 ux30Var20 = new ux30(10, 0L, gw30Var.h, "");
                                pz40 pz40Var8 = s6t0.f31722a;
                                gy30Var = new gy30(ux30Var20, new rx30(new n0x(gw30Var.e), 0L, gw30Var.f12006a ? new kiz(new rf5(3, r5)) : lizVar, R.drawable.sport_new, 0L, new qc5(r5, new n0x(gw30Var.f), y3d.a(s6t0.a().getBackground())), 434), new zx30(new n0x(gw30Var.i), 3), 0L, null, null, 248);
                                r6 = r5;
                                break;
                            default:
                                ux30 ux30Var21 = new ux30(10, 0L, "", "");
                                zcl zclVar = qmk.f28987a;
                                m0x m0xVar2 = new m0x(i3, r5, 6);
                                pz40 pz40Var9 = s6t0.f31722a;
                                gy30Var = new gy30(ux30Var21, new qx30(m0xVar2, s6t0.a().getPrimary(), lizVar, R.drawable.ic_glyph_language, 40.0f, 16), ey30Var, 0L, null, null, 248);
                                r6 = r5;
                                break;
                        }
                        jy30Var = new ky30(iz30VarM, r040VarN, gy30Var, r16, yyw.g0(nw30VarK0), yyw.h0(nw30VarK0));
                    }
                    arrayList2.add(jy30Var);
                    r5 = r6;
                    it = it;
                    it2 = it2;
                    key = key;
                    i3 = 0;
                }
                it = it;
                it2 = it2;
                key = key;
                r6 = r5;
                arrayList2.add(jy30Var);
                r5 = r6;
                it = it;
                it2 = it2;
                key = key;
                i3 = 0;
            }
            linkedHashMap.put(key, xww.T(arrayList2));
            it = it;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x008f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00de  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:81:0x010b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0130  */
    /* JADX WARN: Code duplicated, block: B:85:0x0134  */
    /* JADX WARN: Code duplicated, block: B:86:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x014d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0159  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void d(mm40 mm40Var, pe0 pe0Var, float f, Function1 function1, Function1 function2, Function1 function3, fet fetVar, int i, int i2) {
        Function1 function4;
        Function1 function5;
        Function1 function6;
        boolean z;
        boolean z2;
        mm40 mm40Var2;
        Function1 function7;
        yfe0 yfe0VarU;
        Function1 function8;
        boolean zIsNaN;
        jm40 jm40Var;
        mm40 mm40VarE;
        mm40 mm40Var3;
        boolean z3;
        int i3;
        boolean z4;
        Object objP;
        int i4;
        int i5;
        pe0Var.getClass();
        fetVar.g0(-1182825472);
        int i6 = i | 6;
        if ((i & 48) == 0) {
            i6 |= (i & 64) == 0 ? fetVar.g(pe0Var) : fetVar.i(pe0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= fetVar.d(f) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                function4 = function1;
                i6 |= fetVar.i(function4) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                function5 = function2;
                if (fetVar.i(function5)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i6 |= i5;
            } else {
                function5 = function2;
            }
            if ((196608 & i) == 0) {
                function6 = function3;
                if (fetVar.i(function6)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i6 |= i4;
            } else {
                function6 = function3;
            }
            z = true;
            if ((74899 & i6) != 74898) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar.U(i6 & 1, z2)) {
                if (i7 != 0) {
                    function8 = null;
                } else {
                    function8 = function4;
                }
                zcl zclVar = qmk.f28987a;
                zIsNaN = Float.isNaN(f);
                jm40Var = jm40.b;
                if (zIsNaN) {
                    mm40VarE = o7k0.e(jm40Var, 64.0f);
                } else {
                    mm40VarE = o7k0.e(o7k0.s(jm40Var, f), 64.0f);
                }
                mm40Var3 = mm40VarE;
                if (pe0Var instanceof st0) {
                    fetVar.e0(-1641277434);
                    int i8 = i6 & 112;
                    int i9 = i6 >> 6;
                    f(mm40Var3, (st0) pe0Var, function5, function6, fetVar, (i9 & 7168) | i8 | (i9 & 896));
                    fetVar.r(false);
                } else if (pe0Var instanceof ra0) {
                    fetVar.e0(-1640981012);
                    if ((i6 & 7168) == 2048) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    i3 = i6 & 112;
                    if (i3 != 32 && ((i6 & 64) == 0 || !fetVar.i(pe0Var))) {
                        z = false;
                    }
                    z4 = z3 | z;
                    objP = fetVar.P();
                    if (z4 || objP == ukd.f35823a) {
                        objP = new ct0(function8, pe0Var, (byte) 3);
                        fetVar.o0(objP);
                    }
                    e(y860.W(mm40Var3, null, null, false, null, (Function0) objP, 28), (ra0) pe0Var, fetVar, i3);
                    fetVar.r(false);
                } else if (pe0Var instanceof fp1) {
                    fetVar.e0(-1640603835);
                    g(0, fetVar, mm40Var3);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1640477758);
                    fetVar.r(false);
                }
                function7 = function8;
                mm40Var2 = jm40Var;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
                function7 = function4;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new qt0(mm40Var2, (Object) pe0Var, f, (Object) function7, (Object) function2, (wdr) function3, i, i2, (byte) 0);
            }
        }
        i6 |= 3072;
        function4 = function1;
        if ((i & 24576) == 0) {
            function5 = function2;
            if (fetVar.i(function5)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i6 |= i5;
        } else {
            function5 = function2;
        }
        if ((196608 & i) == 0) {
            function6 = function3;
            if (fetVar.i(function6)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i6 |= i4;
        } else {
            function6 = function3;
        }
        z = true;
        if ((74899 & i6) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fetVar.U(i6 & 1, z2)) {
            if (i7 != 0) {
                function8 = null;
            } else {
                function8 = function4;
            }
            zcl zclVar2 = qmk.f28987a;
            zIsNaN = Float.isNaN(f);
            jm40Var = jm40.b;
            if (zIsNaN) {
                mm40VarE = o7k0.e(jm40Var, 64.0f);
            } else {
                mm40VarE = o7k0.e(o7k0.s(jm40Var, f), 64.0f);
            }
            mm40Var3 = mm40VarE;
            if (pe0Var instanceof st0) {
                fetVar.e0(-1641277434);
                int i10 = i6 & 112;
                int i11 = i6 >> 6;
                f(mm40Var3, (st0) pe0Var, function5, function6, fetVar, (i11 & 7168) | i10 | (i11 & 896));
                fetVar.r(false);
            } else if (pe0Var instanceof ra0) {
                fetVar.e0(-1640981012);
                if ((i6 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                i3 = i6 & 112;
                if (i3 != 32) {
                    z = false;
                }
                z4 = z3 | z;
                objP = fetVar.P();
                if (z4) {
                    objP = new ct0(function8, pe0Var, (byte) 3);
                    fetVar.o0(objP);
                } else {
                    objP = new ct0(function8, pe0Var, (byte) 3);
                    fetVar.o0(objP);
                }
                e(y860.W(mm40Var3, null, null, false, null, (Function0) objP, 28), (ra0) pe0Var, fetVar, i3);
                fetVar.r(false);
            } else if (pe0Var instanceof fp1) {
                fetVar.e0(-1640603835);
                g(0, fetVar, mm40Var3);
                fetVar.r(false);
            } else {
                fetVar.e0(-1640477758);
                fetVar.r(false);
            }
            function7 = function8;
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            function7 = function4;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qt0(mm40Var2, (Object) pe0Var, f, (Object) function7, (Object) function2, (wdr) function3, i, i2, (byte) 0);
        }
    }

    public static final List d0(c75 c75Var) {
        Double d2;
        Integer num;
        Integer num2;
        List<y65> list = c75Var.f3845a;
        if (list == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (y65 y65Var : list) {
            Long l = y65Var.f42079a;
            s65 s65Var = y65Var.d;
            b75 b75Var = y65Var.c;
            v65 v65Var = y65Var.b;
            long jLongValue = l != null ? l.longValue() : 0L;
            Integer num3 = y65Var.e;
            int iIntValue = num3 != null ? num3.intValue() : 0;
            Integer num4 = y65Var.f;
            int iIntValue2 = num4 != null ? num4.intValue() : 0;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l2 = y65Var.g;
            zmq0 zmq0Var = new zmq0(TimeUnit.SECONDS.toMillis(l2 != null ? l2.longValue() : 0L) + jCurrentTimeMillis);
            int iIntValue3 = (v65Var == null || (num2 = v65Var.f36856a) == null) ? 0 : num2.intValue();
            String str = v65Var != null ? v65Var.b : null;
            if (str == null) {
                str = "";
            }
            dqs dqsVar = new dqs(iIntValue3, str);
            int iIntValue4 = (b75Var == null || (num = b75Var.f2086a) == null) ? 0 : num.intValue();
            String str2 = b75Var != null ? b75Var.b : null;
            if (str2 == null) {
                str2 = "";
            }
            tzb0 tzb0Var = new tzb0(iIntValue4, str2);
            nnm0 nnm0Var = y65Var.j;
            if (nnm0Var == null) {
                nnm0Var = nnm0.UNKNOWN;
            }
            nnm0 nnm0Var2 = nnm0Var;
            Double d3 = y65Var.h;
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = d3 != null ? d3.doubleValue() : 0.0d;
            String str3 = y65Var.i;
            String str4 = str3 == null ? "" : str3;
            if (s65Var != null && (d2 = s65Var.f31686a) != null) {
                dDoubleValue = d2.doubleValue();
            }
            double d4 = dDoubleValue;
            String str5 = s65Var != null ? s65Var.b : null;
            String str6 = str5 == null ? "" : str5;
            na90 na90Var = y65Var.k;
            if (na90Var == null) {
                na90Var = na90.UNKNOWN;
            }
            arrayList.add(new n65(jLongValue, iIntValue, iIntValue2, zmq0Var, dqsVar, tzb0Var, nnm0Var2, d4, str6, dDoubleValue2, str4, na90Var));
        }
        return arrayList;
    }

    public static final void e(mm40 mm40Var, ra0 ra0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1524853693);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(ra0Var) : fetVar2.i(ra0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40Var, vgg0.a(16.0f));
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarB = jr8.f16991a.b(s5x0.J(o7k0.y(jm40.b, null, 3), 8.0f), gqw0.e);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
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
            ra0Var.getClass();
            dww.c(a8k0.F(R.drawable.ic_glyph_plus_small, 0, fetVar2), null, null, ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar2, 56, 4);
            v8q0.a(ra0Var.f30110a, null, ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new et0(mm40Var, ra0Var, i, (byte) 3);
        }
    }

    public static final kg6 e0(yf6 yf6Var) {
        yf6Var.getClass();
        long j = yf6Var.f42525a;
        List<lh6> list = yf6Var.b;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (lh6 lh6Var : list) {
            gg6 gg6Var = new gg6(lh6Var.b, lh6Var.c, lh6Var.d, lh6Var.f20039a);
            ArrayList<fi6> arrayList2 = lh6Var.e;
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
            for (fi6 fi6Var : arrayList2) {
                arrayList3.add(new jg6(fi6Var.b, fi6Var.f9574a, fi6Var.c));
            }
            arrayList.add(new dg6(gg6Var, arrayList3));
        }
        return new kg6(j, arrayList);
    }

    public static final void f(mm40 mm40Var, st0 st0Var, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        st0 st0Var2;
        pcy pcyVar;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(264711271);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(st0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mtr mtrVar = st0Var.d;
            boolean z2 = mtrVar != null && mtrVar.f22382a > 0;
            zcl zclVar = qmk.f28987a;
            float f = z2 ? 36.0f : 0.0f;
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), vgg0.a(16.0f));
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            int i3 = i2 & 112;
            boolean z3 = ((i2 & 7168) == 2048) | (i3 == 32);
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new dt0(function2, st0Var, (byte) 6);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z4) {
                fetVar2.l(pcyVar2);
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
            int i4 = i2;
            float f2 = f;
            j0x.b(lv00.T(st0Var.e, st0Var.f, null, null, fetVar2, 0, 12), null, lgb.J(o7k0.e(o7k0.s(jm40Var, 104.0f), 64.0f), vgg0.a(16.0f)), null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
            mm40 mm40VarL = s5x0.L(o7k0.c.e(new x7z(1.0f, true)), 8.0f, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(yx7Var, (byte) 11)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            v8q0.a(st0Var.b, o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.m(), fetVar, 48, 24960, 110584);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarD);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            h(null, st0Var.h, fetVar, 0);
            pcy pcyVar3 = pcyVar;
            st0Var2 = st0Var;
            v8q0.a(st0Var.c, o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 48, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            if (z2) {
                fetVar2.e0(-945314748);
                mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 68.0f), f2);
                boolean z5 = (i3 == 32) | ((i4 & 896) == 256);
                Object objP3 = fetVar2.P();
                if (z5 || objP3 == cl5Var) {
                    objP3 = new dt0(function1, st0Var2, (byte) 7);
                    fetVar2.o0(objP3);
                }
                mm40 mm40VarW2 = y860.W(mm40VarS, null, null, true, null, (Function0) objP3, 24);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode4 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM4 = fetVar2.m();
                mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarW2);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar3);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar);
                jpm0.o(fetVar2, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC3, shdVar4);
                j0x.b(a8k0.F(st0Var2.d.f22382a, 0, fetVar2), null, o7k0.n(jm40Var, 20.0f), null, gqw0.f1, 0.0f, new m78(((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), 5), fetVar2, 24632, 40);
                z = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2.e0(-944466185);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            st0Var2 = st0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new it0(mm40Var, st0Var2, function1, function2, i, (byte) 3);
        }
    }

    public static final ig7 f0(cv20 cv20Var, int i, boolean z, long j, long j2) {
        String strC;
        Long l;
        cv20Var.getClass();
        Long l2 = cv20Var.f5013a;
        bv20 bv20Var = cv20Var.f;
        String str = cv20Var.e;
        Double d2 = cv20Var.c;
        Double d3 = cv20Var.b;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        double dDoubleValue = d3 != null ? d3.doubleValue() : 0.0d;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        String strValueOf = d2 != null ? String.valueOf(d2.doubleValue()) : null;
        if (strValueOf == null) {
            strValueOf = "";
        }
        Boolean bool = cv20Var.d;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        double d4 = dDoubleValue;
        String str2 = str == null ? "" : str;
        if (d3 == null || Intrinsics.d(str, "SP")) {
            strC = "SP";
        } else if (str == null || str.length() <= 0) {
            pn40 pn40Var = pn40.f27267a;
            strC = pn40.c(d3.doubleValue(), p3u0.e);
        } else {
            strC = str;
        }
        long jLongValue2 = (bv20Var == null || (l = bv20Var.f3262a) == null) ? 0L : l.longValue();
        String str3 = bv20Var != null ? bv20Var.b : null;
        rh7 rh7Var = new rh7(jLongValue2, str3 != null ? str3 : "");
        uoy uoyVar = z ? uoy.LIVE : uoy.LINE;
        boolean z2 = d3 == null || Intrinsics.d(str, "SP");
        yfa0 yfa0Var = yfa0.INSTANCE;
        Boolean bool2 = cv20Var.h;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Long l3 = cv20Var.g;
        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
        yu20 yu20Var = cv20Var.i;
        List list = yu20Var != null ? yu20Var.f43248a : null;
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = yu20Var != null ? yu20Var.b : null;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new ig7(i, jLongValue, j, d4, j2, dDoubleValue2, strValueOf, zBooleanValue, str2, strC, rh7Var, uoyVar, z2, yfa0Var, zBooleanValue2, jLongValue3, new afo(list, list2));
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(135355314);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i, (byte) 8);
        }
    }

    public static final fem g0(c2w c2wVar, boolean z, boolean z2) {
        c2wVar.getClass();
        if (!c2wVar.t || !z) {
            return null;
        }
        if (cy7.c() && z2) {
            return null;
        }
        return new fem(cfx0.N(c2wVar.n));
    }

    public static final void h(mm40 mm40Var, nur nurVar, fet fetVar, int i) {
        fetVar.g0(1447605121);
        int i2 = i | 6 | (fetVar.g(nurVar) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = nurVar instanceof mur;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-162265177);
                mur murVar = (mur) nurVar;
                j6n.h(murVar.f22425a, murVar.b, yyw.U(o7k0.A(jm40Var, null, 3), 0.5f), 0, 0, fetVar, 0, 24);
                fetVar.r(false);
            } else {
                if (!Intrinsics.d(nurVar, lur.f20686a)) {
                    throw b1j.f(-420877741, fetVar, false);
                }
                fetVar.e0(-161314593);
                fetVar.r(false);
            }
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gt0(mm40Var, nurVar, i, b2);
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
            return new c0m(new j0m(str, m0xVar, primary, i, g0mVar, 2), new a0m(ew30Var.f, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackground()), 44);
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
            a0m a0mVar = new a0m(rv30Var.i, staticColors.m131getWhite800d7_KjU());
            y3d y3dVar = (y3d) CollectionsKt.firstOrNull(list);
            long j = y3dVar != null ? y3dVar.f41946a : y3d.g;
            y3d y3dVar2 = (y3d) CollectionsKt.f0(list);
            return new c0m(j0mVar, a0mVar, null, false, new wzl(j, y3dVar2 != null ? y3dVar2.f41946a : y3d.g), 44);
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
            return new c0m(new j0m(str3, jM123getWhite0d7_KjU3, m0xVar3, jM123getWhite0d7_KjU4, i3, g0mVar), new a0m(sv30Var.h, staticColors2.m131getWhite800d7_KjU()), null, false, new vzl(sv30Var.j), 44);
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
            return new c0m(new j0m(str5, m0xVar5, primary2, i5, g0mVar, 2), new a0m(mw30Var.f, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackground()), 44);
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
            return new c0m(new j0m(str6, m0xVar6, primary3, i6, g0mVar, 2), new a0m(cw30Var.f, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackground()), 44);
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
            String str8 = vv30Var.f;
            String str9 = vv30Var.e;
            m0x m0xVar7 = new m0x(vv30Var.d, null, 6);
            pz40 pz40Var8 = s6t0.f31722a;
            long primary5 = s6t0.b().f33626a.getPrimary();
            int i7 = vv30Var.d;
            if (vv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str9, m0xVar7, primary5, i7, g0mVar, 2), vv30Var.g ? new zzl(new tf5(R.drawable.ic_status_green_check_circle, null, 6), str8, s6t0.b().f33626a.getSecondary()) : new a0m(str8, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackground()), 44);
        }
        if (nw30Var instanceof wv30) {
            wv30 wv30Var = (wv30) nw30Var;
            String str10 = wv30Var.f;
            n0x n0xVar2 = new n0x(wv30Var.d);
            pz40 pz40Var9 = s6t0.f31722a;
            long primary6 = s6t0.b().f33626a.getPrimary();
            int i8 = wv30Var.e;
            if (wv30Var.f39822a) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str10, n0xVar2, primary6, i8, g0mVar, 2), new a0m(wv30Var.g, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackground()), 44);
        }
        if (nw30Var instanceof xv30) {
            xv30 xv30Var = (xv30) nw30Var;
            List list2 = xv30Var.k;
            String str11 = xv30Var.h;
            pz40 pz40Var10 = s6t0.f31722a;
            StaticColors staticColors4 = StaticColors.INSTANCE;
            long jM123getWhite0d7_KjU7 = staticColors4.m123getWhite0d7_KjU();
            m0x m0xVar8 = new m0x(xv30Var.e, null, 6);
            long jM123getWhite0d7_KjU8 = staticColors4.m123getWhite0d7_KjU();
            int i9 = xv30Var.e;
            if (xv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            j0m j0mVar2 = new j0m(str11, jM123getWhite0d7_KjU7, m0xVar8, jM123getWhite0d7_KjU8, i9, g0mVar);
            a0m a0mVar2 = new a0m(xv30Var.i, staticColors4.m131getWhite800d7_KjU());
            y3d y3dVar3 = (y3d) CollectionsKt.firstOrNull(list2);
            long primary7 = y3dVar3 != null ? y3dVar3.f41946a : s6t0.b().f33626a.getPrimary();
            y3d y3dVar4 = (y3d) CollectionsKt.f0(list2);
            return new c0m(j0mVar2, a0mVar2, null, false, new wzl(primary7, y3dVar4 != null ? y3dVar4.f41946a : s6t0.b().f33626a.getPrimary()), 44);
        }
        if (nw30Var instanceof yv30) {
            yv30 yv30Var = (yv30) nw30Var;
            String str12 = yv30Var.g;
            pz40 pz40Var11 = s6t0.f31722a;
            StaticColors staticColors5 = StaticColors.INSTANCE;
            long jM123getWhite0d7_KjU9 = staticColors5.m123getWhite0d7_KjU();
            m0x m0xVar9 = new m0x(yv30Var.d, null, 6);
            long jM123getWhite0d7_KjU10 = staticColors5.m123getWhite0d7_KjU();
            int i10 = yv30Var.d;
            if (yv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str12, jM123getWhite0d7_KjU9, m0xVar9, jM123getWhite0d7_KjU10, i10, g0mVar), new a0m(yv30Var.h, staticColors5.m131getWhite800d7_KjU()), null, false, new vzl(yv30Var.j), 44);
        }
        if (nw30Var instanceof aw30) {
            aw30 aw30Var = (aw30) nw30Var;
            String str13 = aw30Var.e;
            m0x m0xVar10 = new m0x(aw30Var.d, null, 6);
            pz40 pz40Var12 = s6t0.f31722a;
            long primary8 = s6t0.b().f33626a.getPrimary();
            int i11 = aw30Var.d;
            if (aw30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str13, m0xVar10, primary8, i11, g0mVar, 2), new a0m(aw30Var.f, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackground()), 44);
        }
        if (nw30Var instanceof zv30) {
            zv30 zv30Var = (zv30) nw30Var;
            String str14 = zv30Var.e;
            m0x m0xVar11 = new m0x(zv30Var.d, null, 6);
            pz40 pz40Var13 = s6t0.f31722a;
            long primary9 = s6t0.b().f33626a.getPrimary();
            int i12 = zv30Var.d;
            if (zv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str14, m0xVar11, primary9, i12, g0mVar, 2), new a0m(zv30Var.f, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackground()), 44);
        }
        if (nw30Var instanceof uv30) {
            uv30 uv30Var = (uv30) nw30Var;
            String str15 = uv30Var.e;
            m0x m0xVar12 = new m0x(uv30Var.d, null, 6);
            pz40 pz40Var14 = s6t0.f31722a;
            long primary10 = s6t0.b().f33626a.getPrimary();
            int i13 = uv30Var.d;
            if (uv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str15, m0xVar12, primary10, i13, g0mVar, 2), new a0m(uv30Var.f, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackground()), 44);
        }
        if (nw30Var instanceof bw30) {
            bw30 bw30Var = (bw30) nw30Var;
            String str16 = bw30Var.g;
            n0x n0xVar3 = new n0x(bw30Var.f);
            pz40 pz40Var15 = s6t0.f31722a;
            long primary11 = s6t0.b().f33626a.getPrimary();
            if (bw30Var.f3307a) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str16, n0xVar3, primary11, R.drawable.ic_glyph_language, g0mVar, 2), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        if (nw30Var instanceof iw30) {
            iw30 iw30Var = (iw30) nw30Var;
            String str17 = iw30Var.e;
            m0x m0xVar13 = new m0x(iw30Var.d, null, 6);
            pz40 pz40Var16 = s6t0.f31722a;
            long primary12 = s6t0.b().f33626a.getPrimary();
            int i14 = iw30Var.d;
            if (iw30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            j0m j0mVar3 = new j0m(str17, m0xVar13, primary12, i14, g0mVar, 2);
            a0m a0mVar3 = new a0m(iw30Var.f, s6t0.b().f33626a.getSecondary());
            vzl vzlVar = new vzl(s6t0.b().f33626a.getBackground());
            int i15 = iw30Var.g;
            return new c0m(j0mVar3, a0mVar3, i15 > 0 ? new d0m(new rpe(i15), new hpe(s6t0.b().f33626a.getBackground())) : e0m.f6994a, false, vzlVar, 40);
        }
        if (nw30Var instanceof ov30) {
            ov30 ov30Var = (ov30) nw30Var;
            String str18 = ov30Var.i;
            n0x n0xVar4 = new n0x(ov30Var.d);
            pz40 pz40Var17 = s6t0.f31722a;
            long primary13 = s6t0.b().f33626a.getPrimary();
            int i16 = ov30Var.g;
            if (ov30Var.f25907a) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str18, n0xVar4, primary13, i16, g0mVar, 2), new a0m(ov30Var.j, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackground()), 44);
        }
        if (nw30Var instanceof nv30) {
            nv30 nv30Var = (nv30) nw30Var;
            String str19 = nv30Var.f;
            String str20 = nv30Var.e;
            m0x m0xVar14 = new m0x(nv30Var.d, null, 6);
            pz40 pz40Var18 = s6t0.f31722a;
            long primary14 = s6t0.b().f33626a.getPrimary();
            int i17 = nv30Var.d;
            if (nv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str20, m0xVar14, primary14, i17, g0mVar, 2), nv30Var.g ? new zzl(new tf5(R.drawable.ic_status_green_check_circle, null, 6), str19, s6t0.b().f33626a.getSecondary()) : new a0m(str19, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackground()), 44);
        }
        if (nw30Var instanceof qv30) {
            qv30 qv30Var = (qv30) nw30Var;
            String str21 = qv30Var.e;
            m0x m0xVar15 = new m0x(qv30Var.d, null, 6);
            pz40 pz40Var19 = s6t0.f31722a;
            long primary15 = s6t0.b().f33626a.getPrimary();
            int i18 = qv30Var.d;
            if (qv30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str21, m0xVar15, primary15, i18, g0mVar, 2), new a0m(qv30Var.f, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackground()), 44);
        }
        if (nw30Var instanceof jw30) {
            jw30 jw30Var = (jw30) nw30Var;
            String str22 = jw30Var.e;
            m0x m0xVar16 = new m0x(jw30Var.d, null, 6);
            pz40 pz40Var20 = s6t0.f31722a;
            long primary16 = s6t0.b().f33626a.getPrimary();
            int i19 = jw30Var.d;
            if (jw30Var.b) {
                g0mVar = new g0m(new rf5(3, null));
            }
            return new c0m(new j0m(str22, m0xVar16, primary16, i19, g0mVar, 2), new a0m(jw30Var.f, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackground()), 44);
        }
        if (!(nw30Var instanceof dw30)) {
            m0x m0xVar17 = new m0x(R.drawable.ic_glyph_category_new, null, 6);
            pz40 pz40Var21 = s6t0.f31722a;
            return new c0m(new j0m("", m0xVar17, s6t0.b().f33626a.getPrimary(), R.drawable.ic_glyph_category_new, (i0m) null, 34), null, null, false, new vzl(s6t0.b().f33626a.getBackground()), 46);
        }
        dw30 dw30Var = (dw30) nw30Var;
        String str23 = dw30Var.e;
        m0x m0xVar18 = new m0x(dw30Var.d, null, 6);
        pz40 pz40Var22 = s6t0.f31722a;
        long primary17 = s6t0.b().f33626a.getPrimary();
        int i20 = dw30Var.d;
        if (dw30Var.b) {
            g0mVar = new g0m(new rf5(3, null));
        }
        return new c0m(new j0m(str23, m0xVar18, primary17, i20, g0mVar, 2), new a0m(dw30Var.f, s6t0.b().f33626a.getSecondary()), null, false, new vzl(s6t0.b().f33626a.getBackground()), 44);
    }

    public static final void i(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, d9z d9zVar, xcz xczVar2, xcz xczVar3, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        xczVar.getClass();
        d9zVar.getClass();
        xczVar2.getClass();
        xczVar3.getClass();
        function1.getClass();
        fetVar.g0(1931694597);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(d9zVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(xczVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(xczVar3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            float fT = fbc.T(fetVar);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarH = phu0.H(i120.Q(jm40Var, background, ljcVar), null, 1);
            zcl zclVar = qmk.f28987a;
            zfn zfnVar = m8m0.f21378a;
            y0x0.e(mm40VarH, 228.0f + fT, ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), 16.0f, ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), 24.0f, u1c.M(-1771307380, new qt1(fT, l7m0Var, function1, (byte) 2), fetVar), u1c.M(2016038320, new rt1((byte) 2, d9zVar, xczVar, xczVar2, xczVar3, l7m0Var, function1), fetVar), fetVar, 905994240, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new st1(mm40Var2, l7m0Var, xczVar, d9zVar, xczVar2, xczVar3, function1, i, (byte) 2);
        }
    }

    public static final v2 i0(iyj0 iyj0Var, Type type, gzs0 gzs0Var, boolean z) {
        if (z) {
            return iyj0Var;
        }
        fhy fhyVar = iyj0Var.b;
        List<KTypeProjection> list = iyj0Var.c;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (KTypeProjection kTypeProjection : list) {
            kiy kiyVar = kTypeProjection.b;
            if (kiyVar != null) {
                KTypeProjection.c.getClass();
                kTypeProjection = new KTypeProjection(kiyVar, uiy.c);
            }
            arrayList.add(kTypeProjection);
        }
        iyj0 iyj0VarS = S(type, fhyVar, arrayList, gzs0Var != gzs0.f12197a);
        rke rkeVar = new rke(type, (byte) 1);
        boolean zEquals = iyj0Var.equals(iyj0VarS);
        Object jkqVar = iyj0Var;
        if (!zEquals) {
            jkqVar = new jkq(iyj0Var, iyj0VarS, false, rkeVar);
        }
        return (jkq) jkqVar;
    }

    public static final void j(l7m0 l7m0Var, boolean z, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1131323879);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(jm40.b, "AuthHistoryScreen");
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarE0, s6t0.b().f33626a.getBackground(), jd8.n);
            h94 h94Var = (h94) l7m0Var.getValue();
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new zk2(function1, (byte) 17);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new wc2(function1, (byte) 6);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z4 = i3 == 256;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new zk2(function1, (byte) 18);
                fetVar.o0(objP3);
            }
            Function0 function3 = (Function0) objP3;
            boolean z5 = i3 == 256;
            Object objP4 = fetVar.P();
            if (z5 || objP4 == cl5Var) {
                objP4 = new zk2(function1, (byte) 19);
                fetVar.o0(objP4);
            }
            q(z, h94Var, function0, function2, function3, (Function0) objP4, mm40VarQ, fetVar, (i2 >> 3) & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm((Object) l7m0Var, z, (wdr) function1, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0331  */
    /* JADX WARN: Code duplicated, block: B:134:0x0333 A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    public static kiy j0(Type type, Map map, gzs0 gzs0Var, boolean z, boolean z2, c0t0 c0t0Var, int i) {
        kiy kiyVar;
        iyj0 iyj0VarS;
        ArrayList arrayList;
        gzs0 gzs0Var2;
        i13 i13Var = i13.f1;
        i13 i13Var2 = i13.Z;
        gzs0 gzs0Var3 = (i & 2) != 0 ? gzs0.c : gzs0Var;
        boolean z3 = (i & 4) != 0 ? false : z;
        boolean z4 = (i & 8) != 0 ? false : z2;
        c0t0 c0t0Var2 = (i & 16) != 0 ? c0t0.b : c0t0Var;
        type.getClass();
        map.getClass();
        gzs0Var3.getClass();
        c0t0Var2.getClass();
        if (type.equals(Void.TYPE)) {
            return g4m0.e;
        }
        boolean z5 = type instanceof Class;
        KTypeProjection kTypeProjectionL0 = null;
        if (z5) {
            Class cls = (Class) type;
            if (!Q(cls).isEmpty() && !z4) {
                sgy sgyVarB = (z3 && cls.equals(Class.class)) ? sre0.f32672a.b(sgy.class) : sre0.f32672a.b(cls);
                List listQ = Q(cls);
                ArrayList arrayList2 = new ArrayList(r3d.q(listQ, 10));
                int i2 = 0;
                for (Object obj : listQ) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    Type[] bounds = ((TypeVariable) pgi0.o(lgi0.e(i13.A, (TypeVariable) obj))).getBounds();
                    bounds.getClass();
                    Type type2 = (Type) tx3.A(bounds);
                    if (z3) {
                        gzs0Var2 = gzs0.f12197a;
                    } else if (X(sgyVarB)) {
                        gzs0Var2 = d7x.E(x2x.N((fhy) y9a.O(sgyVarB).get(i2), null, 7), g4m0.f10674a) ? gzs0.f12197a : gzs0.b;
                    } else {
                        gzs0Var2 = gzs0.c;
                    }
                    gzs0 gzs0Var4 = gzs0Var2;
                    piy piyVar = KTypeProjection.c;
                    type2.getClass();
                    kiy kiyVarJ0 = j0(type2, map, gzs0Var4, false, true, null, 20);
                    piyVar.getClass();
                    arrayList2.add(piy.a(kiyVarJ0));
                    i2 = i3;
                }
                iyj0 iyj0VarS2 = S(cls, sgyVarB, arrayList2, false);
                iyj0 iyj0VarT = T(iyj0VarS2, cls);
                if (iyj0VarT != null) {
                    iyj0VarS2 = iyj0VarT;
                }
                List<TypeVariable> listQ2 = Q(cls);
                ArrayList arrayList3 = new ArrayList(r3d.q(listQ2, 10));
                for (TypeVariable typeVariable : listQ2) {
                    KTypeProjection.c.getClass();
                    arrayList3.add(KTypeProjection.d);
                }
                iyj0 iyj0VarS3 = S(cls, sgyVarB, arrayList3, true);
                return iyj0VarS2.equals(iyj0VarS3) ? iyj0VarS2 : new jkq(iyj0VarS2, iyj0VarS3, true, new svc(cls, (byte) 26));
            }
            if (cls.isArray()) {
                if (!cls.getComponentType().isPrimitive()) {
                    Class<?> componentType = cls.getComponentType();
                    componentType.getClass();
                    kTypeProjectionL0 = l0(componentType, map, z3);
                }
                return i0(S(type, sre0.f32672a.b(cls), q3d.k(kTypeProjectionL0), false), type, gzs0Var3, z3);
            }
            sgy sgyVarB2 = sre0.f32672a.b(cls);
            List<TypeVariable> listQ3 = Q(cls);
            ArrayList arrayList4 = new ArrayList(r3d.q(listQ3, 10));
            for (TypeVariable typeVariable2 : listQ3) {
                KTypeProjection.c.getClass();
                arrayList4.add(KTypeProjection.d);
            }
            iyj0VarS = S(type, sgyVarB2, arrayList4, false);
            kiyVar = null;
        } else {
            if (type instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
                genericComponentType.getClass();
                KTypeProjection kTypeProjectionL1 = l0(genericComponentType, map, z3);
                kiy kiyVar2 = kTypeProjectionL1.b;
                kiyVar2.getClass();
                return i0(S(type, sre0.f32672a.b(xtt0.e(azw.G(g7x.G(kiyVar2)))), kotlin.collections.a.c(kTypeProjectionL1), false), type, gzs0Var3, z3);
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type rawType = parameterizedType.getRawType();
                rawType.getClass();
                kiyVar = null;
                Class cls2 = (Class) rawType;
                sgy sgyVarB3 = (z3 && cls2.equals(Class.class)) ? sre0.f32672a.b(sgy.class) : sre0.f32672a.b(cls2);
                if (z4) {
                    List<Type> listT = pgi0.t(pgi0.l(lgi0.e(i13Var2, parameterizedType), i13Var));
                    arrayList = new ArrayList(r3d.q(listT, 10));
                    for (Type type3 : listT) {
                        KTypeProjection.c.getClass();
                        arrayList.add(KTypeProjection.d);
                    }
                } else {
                    List listT2 = pgi0.t(pgi0.l(lgi0.e(i13Var2, parameterizedType), i13Var));
                    arrayList = new ArrayList(r3d.q(listT2, 10));
                    Iterator it = listT2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(l0((Type) it.next(), map, z3));
                    }
                }
                iyj0VarS = S(type, sgyVarB3, arrayList, false);
            } else {
                kiyVar = null;
                if (!(type instanceof TypeVariable)) {
                    if (type instanceof WildcardType) {
                        ohq.u(type, "Wildcard type is not possible here: ");
                        return null;
                    }
                    StringBuilder sb = new StringBuilder("Type is not supported: ");
                    sb.append(type);
                    Class<?> cls3 = type.getClass();
                    sb.append(" (");
                    sb.append(cls3);
                    sb.append(')');
                    throw new poe(sb.toString());
                }
                TypeVariable typeVariable3 = (TypeVariable) type;
                miy miyVar = (miy) map.get(typeVariable3);
                if (miyVar == null) {
                    List typeParameters = V(typeVariable3).getTypeParameters();
                    TypeVariable<?>[] typeParameters2 = typeVariable3.getGenericDeclaration().getTypeParameters();
                    typeParameters2.getClass();
                    miyVar = (miy) CollectionsKt.W(tx3.H(typeVariable3, typeParameters2), typeParameters);
                    if (miyVar == null) {
                        throw new poe("Type parameter " + typeVariable3.getName() + " is not found in " + V(typeVariable3));
                    }
                }
                iyj0VarS = S(type, miyVar, iun.f15405a, false);
            }
        }
        if (!z3) {
            iyj0 iyj0VarT2 = T(iyj0VarS, type);
            if (c0t0Var2 != c0t0.f3540a) {
                if (type instanceof ParameterizedType) {
                    Object[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                    actualTypeArguments.getClass();
                    Object obj2 = actualTypeArguments.length == 0 ? kiyVar : actualTypeArguments[actualTypeArguments.length - 1];
                    if ((obj2 instanceof WildcardType) && ((WildcardType) obj2).getLowerBounds().length == 1 && iyj0VarT2 != 0) {
                        fhy fhyVar = iyj0VarT2.b;
                        fhyVar.getClass();
                        if (((niy) ((miy) CollectionsKt.d0(((sgy) fhyVar).getTypeParameters()))).e == uiy.c) {
                            if (iyj0VarT2 == 0) {
                                iyj0VarT2 = iyj0VarS;
                            }
                        }
                    }
                }
                if (iyj0VarT2 != 0) {
                    rke rkeVar = new rke(type, (byte) 0);
                    if (!iyj0VarT2.equals(iyj0VarS)) {
                        iyj0VarT2 = new jkq(iyj0VarT2, iyj0VarS, false, rkeVar);
                    }
                } else {
                    iyj0VarT2 = iyj0VarS;
                }
            } else if (iyj0VarT2 == 0) {
                iyj0VarT2 = iyj0VarS;
            }
            int iOrdinal = gzs0Var3.ordinal();
            if (iOrdinal == 0) {
                return iyj0VarT2;
            }
            if (iOrdinal == 1) {
                return iyj0VarT2.B(true);
            }
            if (iOrdinal != 2) {
                t9f.b();
                return kiyVar;
            }
            if (!z5 || !((Class) type).isPrimitive()) {
                v2 v2VarZ = iyj0VarT2.z();
                v2 v2Var = v2VarZ;
                if (v2VarZ == null) {
                    v2Var = iyj0VarT2;
                }
                v2 v2VarC = iyj0VarT2.C();
                v2 v2Var2 = iyj0VarT2;
                if (v2VarC != null) {
                    v2Var2 = v2VarC;
                }
                v2 v2VarB = v2Var2.B(true);
                rke rkeVar2 = new rke(type, (byte) 2);
                v2VarB.getClass();
                return v2Var.equals(v2VarB) ? v2Var : new jkq(v2Var, v2VarB, false, rkeVar2);
            }
        }
        return iyj0VarS;
    }

    public static final void k(mm40 mm40Var, ie8 ie8Var, ugd ugdVar, fet fetVar, int i) {
        fet fetVar2;
        ie8Var.getClass();
        fetVar.g0(-706975354);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ie8Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarB = hp4.B(mm40Var);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarB);
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
            float f = xfn.a(fetVar).d;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, f, 0.0f, 2), 1.0f);
            zcl zclVar = qmk.f28987a;
            v8q0.a(ie8Var.b, s5x0.N(mm40VarD, 12.0f, 0.0f, 0.0f, 0.0f, 14), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            ugdVar.j(ie8Var.f14620a, ie8Var.d, fetVar2, 384);
            j83 j83Var = ie8Var.c;
            if (j83Var == null) {
                fetVar2.e0(-1483449535);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1483449534);
                mm40 mm40VarD2 = o7k0.d(s5x0.N(jm40Var, xfn.a(fetVar2).d, 12.0f, xfn.a(fetVar2).d, 0.0f, 8), 1.0f);
                Object objP = fetVar2.P();
                if (objP == ukd.f35823a) {
                    objP = new nk7((byte) 14);
                    fetVar2.o0(objP);
                }
                v8q0.b(j83Var, s5x0.J(rq8.L(mm40VarD2, (Function1) objP), 12.0f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, null, fetVar, 0, 0, 524284);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var, ie8Var, ugdVar, i, (byte) 4);
        }
    }

    public static final List k0(TypeVariable[] typeVariableArr, oiy oiyVar) {
        oiy oiyVarH0;
        typeVariableArr.getClass();
        int iA = wp20.a(typeVariableArr.length);
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (TypeVariable typeVariable : typeVariableArr) {
            dre0 dre0Var = oiyVar instanceof dre0 ? (dre0) oiyVar : null;
            if (dre0Var == null || (oiyVarH0 = fre0.h0(dre0Var)) == null) {
                oiyVarH0 = oiyVar;
            }
            String name = typeVariable.getName();
            name.getClass();
            linkedHashMap.put(typeVariable, new niy(null, oiyVarH0, name, uiy.f35755a));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            TypeVariable typeVariable2 = (TypeVariable) entry.getKey();
            niy niyVar = (niy) entry.getValue();
            Type[] bounds = typeVariable2.getBounds();
            bounds.getClass();
            ArrayList arrayList = new ArrayList(bounds.length);
            for (Type type : bounds) {
                type.getClass();
                arrayList.add(j0(type, linkedHashMap, null, false, false, null, 30));
            }
            niyVar.getClass();
            niyVar.g = arrayList;
        }
        return CollectionsKt.L0(linkedHashMap.values());
    }

    public static final void l(v3q0 v3q0Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1367474880);
        int i2 = i | (fetVar2.g(v3q0Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16);
        byte b2 = 1;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new h3q0(v3q0Var, b2);
                fetVar2.o0(objP);
            }
            kwj kwjVarB = zk80.b(0, (Function0) objP, fetVar2, 6, 2);
            Integer numValueOf = Integer.valueOf(v3q0Var.c);
            boolean zG = (i3 == 4) | fetVar2.g(kwjVarB);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new lcl0(kwjVarB, v3q0Var, null, (byte) 27);
                fetVar2.o0(objP2);
            }
            m0x0.t(fetVar2, numValueOf, (Function2) objP2);
            zcl zclVar = qmk.f28987a;
            zcl zclVar2 = qmk.l;
            zcl zclVar3 = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarI = dw9.i(zclVar2, zclVar2, zclVar3, zclVar3, jm40Var);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarI);
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
            if (v3q0Var.d.size() > 1) {
                fetVar2.e0(-201593769);
                mm40 mm40VarN = s5x0.N(jm40Var, qmk.a(fetVar2).f, 12.0f, qmk.a(fetVar2).f, 0.0f, 8);
                a4x a4xVar = v3q0Var.d;
                boolean zG2 = fetVar2.g(kwjVarB);
                Object objP3 = fetVar2.P();
                if (zG2 || objP3 == cl5Var) {
                    objP3 = new ino0(kwjVarB, (byte) 3);
                    fetVar2.o0(objP3);
                }
                Function0 function0 = (Function0) objP3;
                boolean z2 = (i2 & 112) == 32;
                Object objP4 = fetVar2.P();
                if (z2 || objP4 == cl5Var) {
                    objP4 = new coo0(function1, (byte) 22);
                    fetVar2.o0(objP4);
                }
                ibc.o(mm40VarN, a4xVar, gxh0.f12078a, false, function0, (Function1) objP4, fetVar2, 384, 8);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-200937096);
                fetVar2.r(false);
            }
            q5x.e(kwjVarB, null, null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(1651277993, new csw((Object) v3q0Var, (byte) 19), fetVar2), fetVar, 0, 24576, 16382);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0((Object) v3q0Var, (Object) function1, i, (byte) 11);
        }
    }

    public static final KTypeProjection l0(Type type, Map map, boolean z) {
        if (!(type instanceof WildcardType)) {
            piy piyVar = KTypeProjection.c;
            kiy kiyVarJ0 = j0(type, map, null, z, false, null, 26);
            piyVar.getClass();
            return piy.a(kiyVarJ0);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] upperBounds = wildcardType.getUpperBounds();
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            ohq.u(type, "Wildcard types with many bounds are not supported: ");
            return null;
        }
        if (lowerBounds.length == 1) {
            piy piyVar2 = KTypeProjection.c;
            Object objW = tx3.W(lowerBounds);
            objW.getClass();
            kiy kiyVarJ1 = j0((Type) objW, map, null, z, false, null, 26);
            piyVar2.getClass();
            kiyVarJ1.getClass();
            return new KTypeProjection(kiyVarJ1, uiy.b);
        }
        if (upperBounds.length != 1) {
            KTypeProjection.c.getClass();
            return KTypeProjection.d;
        }
        if (Intrinsics.d((Type) tx3.W(upperBounds), Object.class)) {
            KTypeProjection.c.getClass();
            return KTypeProjection.d;
        }
        piy piyVar3 = KTypeProjection.c;
        Object objW2 = tx3.W(upperBounds);
        objW2.getClass();
        kiy kiyVarJ2 = j0((Type) objW2, map, null, z, false, null, 26);
        piyVar3.getClass();
        kiyVarJ2.getClass();
        return new KTypeProjection(kiyVarJ2, uiy.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final void m(m39 m39Var, fet fetVar, int i) {
        fet fetVar2;
        boolean z;
        char c2;
        String str;
        ?? r0;
        jm40 jm40Var;
        zfn zfnVar;
        fet fetVar3;
        y9q0 y9q0VarA;
        m39 m39Var2 = m39Var;
        fet fetVar4 = fetVar;
        fetVar4.g0(-520107539);
        int i2 = i | (fetVar4.g(m39Var2) ? 4 : 2);
        if (fetVar4.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            zfn zfnVar2 = zaq0.b;
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarD, ((ThemeColors) fetVar4.k(zfnVar2)).getBackgroundContent(), ugg0Var2), 16.0f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarK);
            mkd.c0.getClass();
            fetVar4.i0();
            boolean z2 = fetVar4.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar4, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar4, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar4, numValueOf, shdVar3);
            jpm0.n(fetVar4);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar4, mm40VarC0, shdVar4);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar4, 48);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, jm40Var2);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, thg0VarA, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar4);
            String str2 = m39Var2.d;
            String str3 = m39Var2.b;
            if (StringsKt.W(str2)) {
                z = true;
                c2 = 0;
                fetVar4.e0(-1896919057);
                fetVar4.r(false);
            } else {
                fetVar4.e0(-1897236187);
                thg0 thg0VarA2 = shg0.a(lw3Var, gqw0.j, fetVar4, 0);
                int iHashCode3 = Long.hashCode(fetVar4.T);
                bh90 bh90VarM3 = fetVar4.m();
                mm40 mm40VarC2 = kbc.c0(fetVar4, jm40Var2);
                fetVar4.i0();
                if (fetVar4.S) {
                    fetVar4.l(pcyVar);
                } else {
                    fetVar4.r0();
                }
                jpm0.o(fetVar4, thg0VarA2, shdVar);
                jpm0.o(fetVar4, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar4, shdVar3, fetVar4);
                jpm0.o(fetVar4, mm40VarC2, shdVar4);
                k7x.a(m39Var2.d, null, o7k0.n(jm40Var2, 16.0f), null, null, fetVar4, 48, 2040);
                c2 = 0;
                zq8.a(0, fetVar4, o7k0.s(jm40Var2, 8.0f));
                z = true;
                fetVar4.r(true);
                fetVar4.r(false);
            }
            if (StringsKt.W(str3)) {
                str = str3;
                r0 = 0;
                jm40Var = jm40Var2;
                zfnVar = zfnVar2;
                fetVar4.e0(-1896359569);
                fetVar4.r(false);
                fetVar3 = fetVar4;
            } else {
                fetVar4.e0(-1896839542);
                qrq qrqVar = j1t0.b;
                long j = qmk.s;
                str = str3;
                zfnVar = zfnVar2;
                r0 = 0;
                jm40Var = jm40Var2;
                v8q0.a(str, null, 0L, new n05(qmk.q, j, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, y9q0.a(new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.G, 16646109), ((ThemeColors) fetVar4.k(zfnVar2)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24960, 110582);
                fet fetVar5 = fetVar;
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            fetVar3.r(true);
            if (StringsKt.W(m39Var.d) && StringsKt.W(str)) {
                fetVar3.e0(1210634283);
                fetVar3.r(r0);
            } else {
                fetVar3.e0(1210577584);
                zq8.a(r0, fetVar3, o7k0.e(jm40Var, 8.0f));
                fetVar3.r(r0);
            }
            String str4 = m39Var.f21103a;
            if (m39Var.e) {
                fetVar3.e0(1210735436);
                y9q0VarA = y9q0.a(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), ((ThemeColors) fetVar3.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                fetVar3.r(r0);
            } else {
                fetVar3.e0(1210835659);
                y9q0VarA = y9q0.a(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), ((ThemeColors) fetVar3.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
                fetVar3.r(r0);
            }
            m39Var2 = m39Var;
            v8q0.a(str4, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarA, fetVar, 0, 0, 131070);
            fet fetVar6 = fetVar;
            fetVar6.r(true);
            fetVar2 = fetVar6;
        } else {
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l7p0(m39Var2, i, (byte) 17);
        }
    }

    public static vzs0 m0(vzs0 vzs0Var) {
        vzs0Var.getClass();
        if (!(vzs0Var instanceof g5x)) {
            return new daa(vzs0Var, (byte) 0);
        }
        g5x g5xVar = (g5x) vzs0Var;
        hzs0[] hzs0VarArr = g5xVar.b;
        ArrayList<Pair> arrayListN0 = tx3.n0(g5xVar.c, hzs0VarArr);
        ArrayList arrayList = new ArrayList(r3d.q(arrayListN0, 10));
        for (Pair pair : arrayListN0) {
            arrayList.add(R((pzs0) pair.f46059a, (hzs0) pair.b));
        }
        return new g5x(hzs0VarArr, (pzs0[]) arrayList.toArray(new pzs0[0]), true);
    }

    public static final void n(mm40 mm40Var, pc9 pc9Var, uwe uweVar, fet fetVar, int i) {
        mm40 mm40Var2;
        uwe uweVar2 = uweVar;
        pc9Var.getClass();
        fetVar.g0(-1808583399);
        int i2 = i | 6 | (fetVar.g(pc9Var) ? 32 : 16) | (fetVar.i(uweVar2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ugg0Var2);
            int i3 = i2 & 896;
            boolean z = ((i2 & 112) == 32) | (i3 == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new gj4(uweVar2, pc9Var, (byte) 25);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, false, null, (Function0) objP, 28);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            x8f.n(null, pc9Var.f26747a, pc9Var.b, pc9Var.c, pc9Var.d, pc9Var.e, uweVar, fetVar, (i2 << 12) & 3670016);
            uweVar2 = uweVar;
            y9a.j(0, 0L, fetVar, o7k0.d(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 1.0f));
            mm40 mm40VarN = s5x0.N(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 6.0f, 5), 8.0f, 0.0f, 0.0f, 2.0f, 6);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 0);
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
            fetVar.e0(-1774645009);
            ListIterator listIterator = pc9Var.f.listIterator(0);
            while (listIterator.hasNext()) {
                kc9 kc9Var = (kc9) listIterator.next();
                long j = kc9Var.f18047a;
                long j2 = pc9Var.f26747a;
                StringBuilder sbQ = kng0.q(j, "eventId", "builderId");
                sbQ.append(j2);
                fetVar.b0(-357463139, sbQ.toString());
                zgc.g(null, kc9Var, uweVar2, fetVar, i3);
                fetVar.r(false);
            }
            ohs0.x(fetVar, false, true, true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var2, pc9Var, uweVar2, i, (byte) 13);
        }
    }

    public static final void o(mm40 mm40Var, w6b w6bVar, xcz xczVar, hh80 hh80Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, ugd ugdVar5, ugd ugdVar6, ugd ugdVar7, fet fetVar, int i) {
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        ugd ugdVar8;
        mm40 mm40Var2;
        fet fetVar2;
        int i3;
        Object obj4 = w6bVar;
        xczVar.getClass();
        fetVar.g0(1327996632);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(obj4) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            obj = xczVar;
            i2 |= fetVar.g(obj) ? 256 : 128;
        } else {
            obj = xczVar;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(hh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            obj2 = ugdVar2;
            i2 |= fetVar.i(obj2) ? 131072 : 65536;
        } else {
            obj2 = ugdVar2;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(ugdVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            obj3 = ugdVar4;
            i2 |= fetVar.i(obj3) ? 8388608 : 4194304;
        } else {
            obj3 = ugdVar4;
        }
        if ((i & 100663296) == 0) {
            i2 |= fetVar.i(ugdVar5) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= fetVar.i(ugdVar6) ? 536870912 : 268435456;
        }
        if (fetVar.U(i2 & 1, (i2 & 306783379) != 306783378)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            if (obj4 instanceof s6b) {
                fetVar.e0(1404791739);
                boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608) | ((234881024 & i2) == 67108864) | ((1879048192 & i2) == 536870912);
                Object objP = fetVar.P();
                if (z || objP == ukd.f35823a) {
                    i3 = i2;
                    tg4 tg4Var = new tg4(obj4, obj, obj2, (Object) ugdVar3, obj3, (Object) ugdVar5, (Object) ugdVar6, (byte) 3);
                    fetVar.o0(tg4Var);
                    objP = tg4Var;
                } else {
                    i3 = i2;
                }
                int i4 = i3 >> 3;
                b8k0.e(mm40Var, xczVar, hh80Var, null, null, null, false, null, (Function1) objP, fetVar, (i3 & 14) | (i4 & 112) | (i4 & 896), Response.SERVER_TIMEOUT);
                mm40Var2 = mm40Var;
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                mm40Var2 = mm40Var;
                int i5 = i2;
                obj4 = obj4;
                fetVar2 = fetVar;
                if (obj4 instanceof t6b) {
                    fetVar2.e0(599545939);
                    ugdVar.F(((t6b) obj4).c, fetVar2, Integer.valueOf((i5 >> 9) & 112));
                    fetVar2.r(false);
                } else if (obj4 instanceof v6b) {
                    fetVar2.e0(1406155212);
                    mm40 mm40VarE = tfx.E(mm40Var2.e(o7k0.c));
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
                    jcb.l(null, ((v6b) obj4).c, false, null, fetVar2, 0, 13);
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    if (!(obj4 instanceof u6b)) {
                        throw b1j.f(599503554, fetVar2, false);
                    }
                    fetVar2.e0(1406498475);
                    ugdVar8 = ugdVar7;
                    obc.d(kr00.f18743a.a(Boolean.valueOf(((u6b) obj4).b)), u1c.M(-1739237513, new w(ugdVar8, (byte) 4), fetVar2), fetVar2, 56);
                    fetVar2.r(false);
                }
            }
            ugdVar8 = ugdVar7;
        } else {
            ugdVar8 = ugdVar7;
            mm40Var2 = mm40Var;
            obj4 = obj4;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k6b(mm40Var2, obj4, xczVar, hh80Var, ugdVar, ugdVar2, ugdVar3, ugdVar4, ugdVar5, ugdVar6, ugdVar8, i, (byte) 0);
        }
    }

    public static final void p(mm40 mm40Var, dsm dsmVar, Function1 function1, Function0 function0, Function0 function2, fet fetVar, int i) {
        dsm dsmVar2;
        Object m0xVar;
        String str;
        fetVar.g0(1470195120);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(dsmVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var, 84.0f), 56.0f);
            int i3 = i2 & 112;
            boolean z = ((i2 & 896) == 256) | (i3 == 32) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                dsmVar2 = dsmVar;
                r3l0 r3l0Var = new r3l0(dsmVar2, function0, function2, function1, (byte) 0);
                fetVar.o0(r3l0Var);
                objP = r3l0Var;
            } else {
                dsmVar2 = dsmVar;
            }
            mm40 mm40VarW = y860.W(mm40VarS, null, null, false, null, (Function0) objP, 28);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            mm40 mm40VarS2 = o7k0.s(o7k0.e(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 4.0f, 7), 56.0f), 56.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS2);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            boolean z3 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                if (dsmVar2 instanceof asm) {
                    m0xVar = new m0x(R.drawable.ic_glyph_all, null, 6);
                } else if (dsmVar2 instanceof bsm) {
                    m0xVar = new m0x(R.drawable.ic_glyph_filter_line_inactive, null, 6);
                } else {
                    if (!(dsmVar2 instanceof csm)) {
                        t9f.b();
                        return;
                    }
                    m0xVar = ((csm) dsmVar2).f4897a.b;
                }
                objP2 = m0xVar;
                fetVar.o0(objP2);
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1277748972, new o9b((o0x) objP2, (byte) 4), fetVar), fetVar, 56);
            fetVar.r(true);
            boolean z4 = i3 == 32;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
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
                objP3 = str;
                fetVar.o0(objP3);
            }
            String str2 = (String) objP3;
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, n0qVar);
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
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s3l0(mm40Var, dsmVar, function1, function0, function2, i, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v13 */
    public static final void q(boolean z, h94 h94Var, Function0 function0, Function1 function1, Function0 function2, Function0 function3, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        Function0 function4;
        n0q n0qVar;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        ?? r4;
        fet fetVar3;
        fet fetVar4;
        fet fetVar5 = fetVar;
        fetVar5.g0(-1900614627);
        if ((i & 6) == 0) {
            i2 = (fetVar5.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar5.g(h94Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar5.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar5.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar5.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar5.i(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar5.g(mm40Var) ? 1048576 : 524288;
        }
        if (fetVar5.U(i2 & 1, (599187 & i2) != 599186)) {
            n0q n0qVar2 = o7k0.c;
            mm40 mm40VarQ = i120.Q(mm40Var.e(n0qVar2), ((ThemeColors) fetVar5.k(zaq0.b)).getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar5, 0);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarQ);
            mkd.c0.getClass();
            fetVar5.i0();
            boolean z2 = fetVar5.S;
            Function0 function5 = e7z.u1;
            if (z2) {
                fetVar5.l(function5);
            } else {
                fetVar5.r0();
            }
            shd shdVar4 = gqw0.x;
            jpm0.o(fetVar5, x5dVarA, shdVar4);
            shd shdVar5 = gqw0.w;
            jpm0.o(fetVar5, bh90VarM, shdVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar6 = gqw0.y;
            jpm0.o(fetVar5, numValueOf, shdVar6);
            jpm0.n(fetVar5);
            shd shdVar7 = gqw0.v;
            jpm0.o(fetVar5, mm40VarC0, shdVar7);
            if (z) {
                fetVar5.e0(-867023061);
                imm immVar = h94Var.f12659a;
                boolean z3 = (i2 & 896) == 256;
                Object objP = fetVar5.P();
                if (z3 || objP == ukd.f35823a) {
                    objP = new tq(function0, (byte) 10);
                    fetVar5.o0(objP);
                }
                function4 = function5;
                shdVar3 = shdVar6;
                shdVar2 = shdVar7;
                n0qVar = n0qVar2;
                shdVar = shdVar4;
                r4 = 0;
                hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar5, 0, 0, 4085);
                fet fetVar6 = fetVar5;
                fetVar6.r(false);
                fetVar3 = fetVar6;
            } else {
                function4 = function5;
                n0qVar = n0qVar2;
                shdVar = shdVar4;
                shdVar2 = shdVar7;
                shdVar3 = shdVar6;
                r4 = 0;
                fetVar5.e0(-866834705);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            s74 s74Var = h94Var.b;
            if (s74Var instanceof q74) {
                fetVar3.e0(-866714301);
                tj30 tj30VarC = zq8.c(gqw0.e, r4);
                int iHashCode2 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM2 = fetVar3.m();
                mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar);
                fetVar3.i0();
                if (fetVar3.S) {
                    fetVar3.l(function4);
                } else {
                    fetVar3.r0();
                }
                jpm0.o(fetVar3, tj30VarC, shdVar);
                jpm0.o(fetVar3, bh90VarM2, shdVar5);
                vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
                jpm0.o(fetVar3, mm40VarC1, shdVar2);
                fet fetVar7 = fetVar3;
                jcb.l(null, ((q74) s74Var).f28231a, false, function3, fetVar7, (i2 >> 6) & 7168, 5);
                fet fetVar8 = fetVar7;
                fetVar8.r(true);
                fetVar8.r(r4);
                fetVar4 = fetVar8;
            } else if (s74Var instanceof p74) {
                fetVar3.e0(-866303861);
                p74 p74Var = (p74) s74Var;
                j2e.h((i2 >> 3) & 8064, fetVar3, p74Var.f26488a, function2, function1, p74Var.b);
                fetVar3.r(r4);
                fetVar4 = fetVar3;
            } else {
                if (!(s74Var instanceof r74)) {
                    throw b1j.f(941870129, fetVar3, r4);
                }
                fetVar3.e0(941897771);
                x8f.e(r4, fetVar3, null);
                fetVar3.r(r4);
                fetVar4 = fetVar3;
            }
            fetVar4.r(true);
            fetVar2 = fetVar4;
        } else {
            fetVar5.X();
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(z, h94Var, function0, function1, function2, function3, mm40Var, i);
        }
    }

    public static final void r(vbg vbgVar, Function0 function0, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        vbgVar.getClass();
        function1.getClass();
        fetVar.g0(-840365410);
        int i2 = (fetVar.g(vbgVar) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (!fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar.X();
        } else if (vbgVar instanceof tbg) {
            fetVar.e0(-137297279);
            n0q n0qVar = o7k0.c;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new y(function0, (byte) 17);
                fetVar.o0(objP);
            }
            wzb.j(i4w0.T(n0qVar, (Function1) objP), null, fetVar, 0, 2);
            fetVar.r(false);
        } else if (vbgVar instanceof ubg) {
            fetVar.e0(-137289588);
            ugdVar.invoke(fetVar, 6);
            fetVar.r(false);
        } else {
            if (!(vbgVar instanceof sbg)) {
                throw b1j.f(-137299630, fetVar, false);
            }
            fetVar.e0(-137286926);
            s(i2 & 1008, fetVar, ((sbg) vbgVar).f31931a, function0, function1);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((Object) vbgVar, (Object) function0, function1, (wdr) ugdVar, i, (byte) 17);
        }
    }

    public static final void s(int i, fet fetVar, a4x a4xVar, Function0 function0, Function1 function1) {
        fet fetVar2;
        fetVar.g0(-1145702158);
        byte b2 = 4;
        int i2 = i | (fetVar.g(a4xVar) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        int i3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            fetVar.e0(-1508135091);
            int iA = wp20.a(r3d.q(a4xVar, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
            Iterator<E> it = a4xVar.iterator();
            while (it.hasNext()) {
                wbg wbgVar = (wbg) it.next();
                Long lValueOf = Long.valueOf(wbgVar.f38876a.f12573a);
                fetVar.b0(-1694977266, Long.valueOf(wbgVar.f38876a.f12573a));
                boolean z = wbgVar.b;
                float f = z ? 1.0f : 0.0f;
                uts0 uts0Var = v6h.f36877a;
                nul0 nul0VarG0 = ro4.g0(0.0f, z ? 200.0f : 400.0f, Float.valueOf(0.001f), i3);
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                l7m0 l7m0VarB = d43.b(f, nul0VarG0, null, null, fetVar, 0, 28);
                fetVar.r(false);
                linkedHashMap2.put(lValueOf, l7m0VarB);
                xczVarA = xczVarA;
                backgroundContent = backgroundContent;
                linkedHashMap = linkedHashMap2;
                i3 = 1;
                i2 = i2;
            }
            LinkedHashMap linkedHashMap3 = linkedHashMap;
            xcz xczVar = xczVarA;
            int i4 = i2;
            long j = backgroundContent;
            fetVar.r(false);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new LinkedHashMap();
                fetVar.o0(objP);
            }
            Map map = (Map) objP;
            int i5 = i4 & 14;
            boolean zI = (i5 == 4) | fetVar.i(map);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new vef(a4xVar, map, b2);
                fetVar.o0(objP2);
            }
            m0x0.D((Function0) objP2, fetVar);
            n0q n0qVar = o7k0.c;
            boolean z2 = (i4 & 112) == 32;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new y(function0, (byte) 18);
                fetVar.o0(objP3);
            }
            mm40 mm40VarK = lgb.K(i4w0.T(n0qVar, (Function1) objP3));
            boolean zG = fetVar.g(xczVar) | fetVar.f(j);
            Object objP4 = fetVar.P();
            if (zG || objP4 == cl5Var) {
                objP4 = new qi4(xczVar, j, b2);
                fetVar.o0(objP4);
            }
            mm40 mm40VarK2 = rq8.K(mm40VarK, (Function1) objP4);
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(8.0f, 8.0f, 8.0f, 16.0f);
            boolean zG2 = (i5 == 4) | fetVar.g(xczVar) | fetVar.i(linkedHashMap3) | fetVar.i(map) | ((i4 & 896) == 256);
            Object objP5 = fetVar.P();
            if (zG2 || objP5 == cl5Var) {
                fetVar2 = fetVar;
                dg dgVar = new dg(a4xVar, xczVar, linkedHashMap3, map, function1, (byte) 10);
                fetVar2.o0(dgVar);
                objP5 = dgVar;
            } else {
                fetVar2 = fetVar;
            }
            b8k0.e(mm40VarK2, xczVar, lh80Var, null, null, null, false, null, (Function1) objP5, fetVar2, 0, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pbg(a4xVar, function0, function1, i, (byte) 0);
        }
    }

    public static final void t(mm40 mm40Var, wbg wbgVar, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(591174144);
        int i2 = i | 6 | (fetVar.g(wbgVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new vef(function1, wbgVar, (byte) 3);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(o7k0.d(jm40Var, 1.0f), null, null, false, null, function0, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(s5x0.N(mm40VarW, 8.0f, 8.0f, 8.0f, 0.0f, 8), 30.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            mm40Var = jm40Var;
            v8q0.a(wbgVar.f38876a.b, ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, true), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            uzb.b(0, fetVar2, null, function0, wbgVar.b);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var2, wbgVar, function1, i, (byte) 26);
        }
    }

    public static final void u(mm40 mm40Var, esm esmVar, float f, Function1 function1, Function0 function0, Function0 function2, xdr xdrVar, fet fetVar, int i) {
        ngk0 ngk0Var;
        pz40 pz40Var;
        int i2;
        int i3;
        qw3 qw3Var;
        Object v3l0Var;
        fetVar.g0(-704805424);
        int i4 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= fetVar.g(esmVar) ? 32 : 16;
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
                String str = esmVar.b;
                str.getClass();
                lc00VarB.add(new asm(str));
                a4x<usm> a4xVar = esmVar.c;
                ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                for (usm usmVar : a4xVar) {
                    usmVar.getClass();
                    arrayList.add(new csm(usmVar));
                }
                lc00VarB.addAll(arrayList);
                String str2 = esmVar.f8336a;
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
                fetVar.e0(1237664798);
                boolean zG = ((i4 & 3670016) == 1048576) | fetVar.g(xczVarA);
                Object objP4 = fetVar.P();
                if (zG || objP4 == cl5Var) {
                    ngk0Var = ngk0Var2;
                    pz40Var = pz40Var2;
                    i2 = 131072;
                    v3l0Var = new v3l0(pz40Var, xczVarA, ngk0Var, xdrVar, null, (byte) 0);
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
                fetVar.e0(1238022290);
                fetVar.r(false);
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 84.0f), 1.0f);
            lh80 lh80VarT = s5x0.t(f, 0.0f, 2);
            qw3 qw3Var2 = new qw3(4.0f, true, new jf4((byte) 14));
            boolean zG2 = fetVar.g(a4xVar2) | ((i4 & i3) == 1048576) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384) | ((i4 & 458752) == i2);
            Object objP5 = fetVar.P();
            if (zG2 || objP5 == cl5Var) {
                qw3Var = qw3Var2;
                Object q3l0Var = new q3l0(a4xVar2, xdrVar, function1, function0, function2, ngk0Var, pz40Var, (byte) 0);
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
            yfe0VarU.d = new kb3(mm40Var, esmVar, f, function1, function0, function2, xdrVar, i, (byte) 2);
        }
    }

    public static final void v(mm40 mm40Var, xkl xklVar, Function0 function0, fet fetVar, int i) {
        zfn zfnVar;
        e900 e900VarN;
        t89 t89Var;
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1384802713);
        int i3 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(xklVar) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar2 = zaq0.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary();
            long secondary0 = ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary0();
            zfn zfnVar3 = bmd.n;
            k6z k6zVar = (k6z) fetVar2.k(zfnVar3);
            k6z k6zVar2 = k6z.b;
            boolean z = k6zVar == k6zVar2;
            qc0 qc0Var = xklVar.b;
            n0x n0xVar = xklVar.f41032a;
            boolean zE = fetVar2.e(qc0Var.ordinal()) | fetVar2.e(((k6z) fetVar2.k(zfnVar3)).ordinal());
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                int iOrdinal = qc0Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                    boolean z2 = z;
                    zfnVar = zfnVar3;
                    List listJ = q3d.j(new y3d(hi0.h), new y3d(hi0.s));
                    objP = z2 ? yk5.g(CollectionsKt.t0(listJ), 0.0f, 0.0f, 14) : yk5.g(listJ, 0.0f, 0.0f, 14);
                } else if (iOrdinal != 3) {
                    t9f.b();
                    return;
                } else {
                    objP = new skk0(secondary);
                    zfnVar = zfnVar3;
                }
                fetVar2.o0(objP);
            } else {
                zfnVar = zfnVar3;
                k6zVar2 = k6zVar2;
            }
            t89 t89Var2 = (t89) objP;
            boolean zE2 = fetVar2.e(qc0Var.ordinal());
            Object objP2 = fetVar2.P();
            if (zE2 || objP2 == cl5Var) {
                int iOrdinal2 = qc0Var.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                    e900VarN = yk5.n(q3d.j(new y3d(hi0.j), new y3d(hi0.i)), 0.0f, 0.0f, 14);
                } else {
                    if (iOrdinal2 != 3) {
                        t9f.b();
                        return;
                    }
                    e900VarN = yk5.n(q3d.j(new y3d(secondary0), new y3d(secondary)), 0.0f, 0.0f, 14);
                }
                objP2 = e900VarN;
                fetVar2.o0(objP2);
            }
            t89 t89Var3 = (t89) objP2;
            boolean zE3 = fetVar2.e(qc0Var.ordinal());
            Object objP3 = fetVar2.P();
            if (zE3 || objP3 == cl5Var) {
                int iOrdinal3 = qc0Var.ordinal();
                if (iOrdinal3 == 0 || iOrdinal3 == 1 || iOrdinal3 == 2) {
                    objP3 = null;
                } else {
                    if (iOrdinal3 != 3) {
                        t9f.b();
                        return;
                    }
                    float[] fArrA = g4d.a();
                    g4d.b(fArrA);
                    h4d h4dVar = new h4d(new ColorMatrixColorFilter(fArrA));
                    h4dVar.b = fArrA;
                    objP3 = h4dVar;
                }
                fetVar2.o0(objP3);
            }
            a4d a4dVar = (a4d) objP3;
            zcl zclVar = qmk.f28987a;
            k6z k6zVar3 = k6zVar2;
            zfn zfnVar4 = zfnVar;
            mm40 mm40VarW = y860.W(o7k0.e(mm40Var, 120.0f), null, null, false, null, function0, 28);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.P(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarW), t89Var2, null, 6), "AGGREGATOR_BONUSES_IMAGE_PICTURES_STYLE");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            boolean zC = n0xVar.c();
            jm40 jm40Var = jm40.b;
            jr8 jr8Var = jr8.f16991a;
            if (zC) {
                t89Var = t89Var3;
                i2 = 0;
                fetVar2.e0(-1147919165);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1148459557);
                mm40 mm40VarV = yyw.V(jr8Var.b(o7k0.s(o7k0.c(jm40Var, 1.0f), 198.0f), gqw0.f), fetVar2.k(zfnVar4) == k6zVar3);
                Object objA = n0xVar.a();
                t89Var = t89Var3;
                j0x.b(l7x.X(objA, null, null, fetVar2, 0, 30), null, mm40VarV, null, gqw0.A, 0.0f, a4dVar, fetVar, 24624, 40);
                fetVar2 = fetVar;
                i2 = 0;
                fetVar2.r(false);
            }
            zq8.a(i2, fetVar2, jr8Var.b(i120.P(o7k0.e(o7k0.d(jm40Var, 1.0f), 72.0f), t89Var, null, 6), gqw0.h));
            O(s5x0.N(jm40Var, 16.0f, 0.0f, 164.0f, 0.0f, 10).e(o7k0.c), xklVar, fetVar2, i3 & 112);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var, xklVar, function0, i, (byte) 18);
        }
    }

    public static final void w(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1311736856);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 120.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 27);
        }
    }

    public static final void x(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(522082699);
        byte b2 = 4;
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
            yfe0VarU.d = new wy0(mm40Var, mdmVar, function1, i, (byte) 16);
        }
    }

    public static final void y(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-651716402);
        byte b2 = 4;
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
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
            mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new o0q0(function1, (byte) 5);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i2 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new okp0(mdmVar, function1, i, b2);
        }
    }

    public static final void z(fqj0 fqj0Var, fet fetVar, int i) {
        fetVar.g0(79696738);
        int i2 = (fetVar.g(fqj0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 60.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, s5x0.N(xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var), 0.0f, 0.0f, 0.0f, 8.0f, 7));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new on7((byte) 22, i, fqj0Var);
        }
    }
}
