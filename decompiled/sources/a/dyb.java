package a;

import android.app.Application;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.cyber.dota.impl.presentation.statistic.skills.view.DotaSkillsViewContainer;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dyb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static v8i f6885a;

    public static final void A(c8m c8mVar, r7m r7mVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(533843996);
        int i3 = i & 6;
        zhg0 zhg0Var = zhg0.f44392a;
        if (i3 == 0) {
            i2 = (fetVar.g(zhg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(c8mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(r7mVar) : fetVar.i(r7mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarW = y860.W(zhg0Var.a(1.0f, o7k0.c(jm40.b, 1.0f), false), null, null, false, null, function0, 28);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
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
            v8q0.a(c8mVar.f3920a.toString(), null, r7mVar.f29983a, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t7m(c8mVar, r7mVar, function0, i, (byte) 1);
        }
    }

    public static final void B(mm40 mm40Var, String str, String str2, mum mumVar, fet fetVar, int i) {
        int i2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(1955350552);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(mumVar) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar2, 48);
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
            if (str2.length() > 0) {
                fetVar2.e0(1673399529);
                j6n.h(str2, oro0.f25744a, null, 0, 0, fetVar2, ((i2 >> 6) & 14) | 48, 28);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1673529574);
                fetVar2.r(false);
            }
            if (mumVar instanceof jum) {
                fetVar2.e0(-915843648);
                fetVar2.r(false);
                z = false;
            } else if (mumVar instanceof kum) {
                fetVar2.e0(1673697005);
                z = false;
                rcb.x(null, kpb.m0((kum) mumVar), h2m.c, nsm0.y(fgm.b), true, null, fetVar, 384);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = false;
                if (!(mumVar instanceof lum)) {
                    throw b1j.f(-915845489, fetVar2, false);
                }
                fetVar2.e0(1674095882);
                j6n.h("VAR", kro0.f18776a, null, 0, 0, fetVar2, 54, 28);
                fetVar2.r(false);
            }
            if (str.length() > 0) {
                fetVar2.e0(1674313657);
                v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, (i2 >> 3) & 14, 24960, 110586);
                fetVar2 = fetVar;
                fetVar2.r(z);
            } else {
                fetVar2.e0(1674551334);
                fetVar2.r(z);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 16, i, (Object) mm40Var, (Object) str, (Object) str2, (Object) mumVar);
        }
    }

    public static final void C(mm40 mm40Var, vum vumVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        d280 d280Var = vumVar.b;
        fetVar2.g0(-531574049);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(vumVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.j, (byte) 11)), xx7Var, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            boolean zG = fetVar2.g(d280Var);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.f, d280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG2 = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            mm40 mm40VarD2 = o7k0.d(jm40.b, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD2);
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
            v8q0.a(vumVar.f38055a, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var, vumVar, i, (byte) 0);
        }
    }

    public static final void D(mm40 mm40Var, yzm yzmVar, boolean z, boolean z2, fet fetVar, int i) {
        int i2;
        int i3;
        boolean z3;
        d280 d280Var = yzmVar.b;
        fetVar.g0(1400688449);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(yzmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), xx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z4) {
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
            boolean zG = fetVar.g(d280Var);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new u6n(d4d.SECONDARY60, w6n.f, d280Var);
                fetVar.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            boolean zG2 = fetVar.g(u6nVar);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                i3 = 1;
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar.o0(objP2);
            } else {
                i3 = 1;
            }
            kkb.p(i3, fetVar, null, (Function0) objP2);
            fetVar.e0(-1676295459);
            fetVar.r(false);
            if (z2) {
                fetVar.e0(-1676223446);
                z3 = true;
                jcb.k(0, 0, fetVar, ffb0.R(jr8.f16991a.b(jm40Var, gqw0.h), 0.0f, 8.0f, 1));
                fetVar.r(false);
            } else {
                z3 = true;
                fetVar.e0(-1676020675);
                fetVar.r(false);
            }
            fetVar.r(z3);
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarC);
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
            boolean z5 = z3;
            v8q0.a(yzmVar.f43520a, null, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 109562);
            fetVar.r(z5);
            fetVar.r(z5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aw5((Object) mm40Var, (Object) yzmVar, z, z2, i, (byte) 5);
        }
    }

    public static final void E(mm40 mm40Var, yzm yzmVar, yzm yzmVar2, a2m a2mVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        uso0 uso0Var = uso0.f36223a;
        fetVar2.g0(1187417296);
        int i2 = i | 6 | (fetVar2.g(yzmVar) ? 32 : 16) | (fetVar2.g(yzmVar2) ? 256 : 128) | (fetVar2.g(a2mVar) ? 2048 : 1024) | (fetVar2.h(z) ? 16384 : 8192) | (fetVar2.e(0) ? 131072 : 65536);
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 80.0f);
            thg0 thg0VarA = shg0.a(new qw3(16.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            uso0 uso0Var2 = uso0.f36223a;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            D(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), yzmVar, true, false, fetVar2, (i2 & 112) | 384);
            obb.q(null, a2mVar, z, fetVar, (i2 >> 6) & 1008, 1);
            uso0 uso0Var3 = uso0.f36223a;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            fetVar2 = fetVar;
            D(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), yzmVar2, false, false, fetVar2, ((i2 >> 3) & 112) | 384);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0(mm40Var2, yzmVar, yzmVar2, a2mVar, z, i);
        }
    }

    public static final void F(lpk lpkVar, l7m0 l7m0Var, xcz xczVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-1836231330);
        int i2 = i | (fetVar.i(lpkVar) ? 4 : 2) | (fetVar.g(xczVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            if (Intrinsics.d(lpkVar, jpk.f16906a)) {
                fetVar.e0(1831238341);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    xsj xsjVar = new xsj((Object) pz40Var, (Object) l7m0Var, (wdr) function1, (yje) null, (byte) 20);
                    fetVar.o0(xsjVar);
                    objP2 = xsjVar;
                }
                m0x0.t(fetVar, lpkVar, (Function2) objP2);
                fetVar.r(false);
            } else {
                if (!(lpkVar instanceof kpk)) {
                    throw b1j.f(613259585, fetVar, false);
                }
                fetVar.e0(1831574660);
                boolean z = (i2 & 896) == 256;
                Object objP3 = fetVar.P();
                if (z || objP3 == cl5Var) {
                    xb2 xb2Var = new xb2(l7m0Var, xczVar, pz40Var, function1, null, (byte) 13);
                    fetVar.o0(xb2Var);
                    objP3 = xb2Var;
                }
                m0x0.t(fetVar, lpkVar, (Function2) objP3);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 0, i, (Object) lpkVar, (Object) l7m0Var, (Object) xczVar, (Object) function1);
        }
    }

    public static final void G(k7q0 k7q0Var, boolean z, fet fetVar, int i) {
        b9q0 b9q0VarD;
        fetVar.g0(626339208);
        byte b = 4;
        int i2 = (fetVar.i(k7q0Var) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (z) {
            fetVar.e0(1530097388);
            djz djzVar = k7q0Var.d;
            a9q0 a9q0Var = null;
            if (djzVar != null && (b9q0VarD = djzVar.d()) != null) {
                a9q0 a9q0Var2 = b9q0VarD.f2224a;
                djz djzVar2 = k7q0Var.d;
                if (!(djzVar2 != null ? djzVar2.p : true)) {
                    a9q0Var = a9q0Var2;
                }
            }
            if (a9q0Var == null) {
                fetVar.e0(1530097387);
                fetVar.r(false);
            } else {
                fetVar.e0(1530097388);
                if (o9q0.c(k7q0Var.l().b)) {
                    fetVar.e0(2110860558);
                    fetVar.r(false);
                } else {
                    fetVar.e0(2109807302);
                    int iS = k7q0Var.b.s((int) (k7q0Var.l().b >> 32));
                    int iS2 = k7q0Var.b.s((int) (k7q0Var.l().b & 4294967295L));
                    xsf0 xsf0VarA = a9q0Var.a(iS);
                    xsf0 xsf0VarA2 = a9q0Var.a(Math.max(iS2 - 1, 0));
                    djz djzVar3 = k7q0Var.d;
                    if (djzVar3 == null || !((Boolean) ((hgk0) djzVar3.m).getValue()).booleanValue()) {
                        fetVar.e0(2110490542);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(2110225306);
                        cvm0.e(true, xsf0VarA, k7q0Var, fetVar, ((i2 << 6) & 896) | 6);
                        fetVar.r(false);
                    }
                    djz djzVar4 = k7q0Var.d;
                    if (djzVar4 == null || !((Boolean) ((hgk0) djzVar4.n).getValue()).booleanValue()) {
                        fetVar.e0(2110838734);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(2110574459);
                        cvm0.e(false, xsf0VarA2, k7q0Var, fetVar, ((i2 << 6) & 896) | 6);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                }
                djz djzVar5 = k7q0Var.d;
                if (djzVar5 != null) {
                    pz40 pz40Var = djzVar5.l;
                    if (!Intrinsics.d(k7q0Var.u.f440a.b, k7q0Var.l().f440a.b)) {
                        ((hgk0) pz40Var).setValue(Boolean.FALSE);
                    }
                    if (djzVar5.b()) {
                        if (((Boolean) ((hgk0) pz40Var).getValue()).booleanValue()) {
                            k7q0Var.s();
                        } else {
                            k7q0Var.m();
                        }
                    }
                }
                fetVar.r(false);
            }
            fetVar.r(false);
        } else {
            fetVar.e0(1989076778);
            fetVar.r(false);
            k7q0Var.m();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jv1(k7q0Var, z, i, b);
        }
    }

    public static final void H(mm40 mm40Var, y9q0 y9q0Var, long j, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(332381716);
        int i2 = i | 6 | (fetVar.g(y9q0Var) ? 32 : 16) | (fetVar.f(j) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = 54 | (i2 & 896);
            int i4 = (i2 << 18) & 29360128;
            jm40 jm40Var = jm40.b;
            v8q0.a(Separators.COLON, jm40Var, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, i3, i4, 131064);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nol(mm40Var2, y9q0Var, j, i, (byte) 1);
        }
    }

    public static final void I(int i, fet fetVar) {
        fetVar.g0(2141905083);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40.b, 16.0f), 80.0f);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f4m(i, (byte) 5);
        }
    }

    public static final void J(k7q0 k7q0Var, fet fetVar, int i) {
        fet fetVar2;
        j83 j83VarK;
        fetVar.g0(-1436003720);
        int i2 = (fetVar.i(k7q0Var) ? 4 : 2) | i;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            djz djzVar = k7q0Var.d;
            if (djzVar == null || !((Boolean) ((hgk0) djzVar.o).getValue()).booleanValue() || (j83VarK = k7q0Var.k()) == null || j83VarK.b.length() <= 0) {
                fetVar2 = fetVar;
                fetVar2.e0(-2111042550);
                fetVar2.r(false);
            } else {
                fetVar.e0(-2112351432);
                boolean zG = fetVar.g(k7q0Var);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (zG || objP == cl5Var) {
                    objP = new g7q0(k7q0Var);
                    fetVar.o0(objP);
                }
                p5q0 p5q0Var = (p5q0) objP;
                w6k w6kVar = (w6k) fetVar.k(bmd.h);
                qe60 qe60Var = k7q0Var.b;
                long j = k7q0Var.l().b;
                int i3 = o9q0.c;
                int iS = qe60Var.s((int) (j >> 32));
                djz djzVar2 = k7q0Var.d;
                b9q0 b9q0VarD = djzVar2 != null ? djzVar2.d() : null;
                b9q0VarD.getClass();
                a9q0 a9q0Var = b9q0VarD.f2224a;
                jge0 jge0VarC = a9q0Var.c(l1e0.d(iS, 0, a9q0Var.f491a.f43981a.b.length()));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((w6kVar.w0(2.0f) / 2.0f) + jge0VarC.f16474a)) << 32) | (((long) Float.floatToRawIntBits(jge0VarC.d)) & 4294967295L);
                boolean zF = fetVar.f(jFloatToRawIntBits);
                Object objP2 = fetVar.P();
                if (zF || objP2 == cl5Var) {
                    objP2 = new ume(jFloatToRawIntBits);
                    fetVar.o0(objP2);
                }
                ye60 ye60Var = (ye60) objP2;
                boolean zI = fetVar.i(p5q0Var) | fetVar.i(k7q0Var);
                Object objP3 = fetVar.P();
                if (zI || objP3 == cl5Var) {
                    objP3 = new wme(p5q0Var, k7q0Var, b);
                    fetVar.o0(objP3);
                }
                mm40 mm40VarA = fnn0.a(jm40.b, p5q0Var, (PointerInputEventHandler) objP3);
                boolean zF2 = fetVar.f(jFloatToRawIntBits);
                Object objP4 = fetVar.P();
                if (zF2 || objP4 == cl5Var) {
                    objP4 = new nme(b, jFloatToRawIntBits);
                    fetVar.o0(objP4);
                }
                fetVar2 = fetVar;
                oy2.a(ye60Var, pai0.a(mm40VarA, false, (Function1) objP4), 0L, fetVar2, 0);
                fetVar2.r(false);
            }
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cnc(k7q0Var, i, (byte) 15);
        }
    }

    public static final void K(mm40 mm40Var, String str, String str2, y9q0 y9q0Var, y9q0 y9q0Var2, long j, long j2, float f, long j3, float f2, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1260837249);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(y9q0Var) ? 2048 : 1024) | (fetVar2.g(y9q0Var2) ? 16384 : 8192) | (fetVar2.f(j) ? 131072 : 65536) | (fetVar2.f(j2) ? 1048576 : 524288) | (fetVar2.d(f) ? 8388608 : 4194304) | (fetVar2.f(j3) ? 67108864 : 33554432) | (fetVar2.d(f2) ? 536870912 : 268435456);
        if (fetVar2.U(i2 & 1, (i2 & 306783379) != 306783378)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.A(jm40Var, null, 3), null, false, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            v8q0.a(str, o7k0.s(jm40Var, f), j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0Var, fetVar2, ((i2 >> 3) & 14) | ((i2 >> 9) & 896), (i2 << 12) & 29360128, 130040);
            if (str2 != null) {
                fetVar2.e0(-163643274);
                v8q0.a(str2, o7k0.e(o7k0.s(jm40Var, f), f2), j2, new n05(qmk.o, j3, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 1, false, 1, 0, null, y9q0Var2, fetVar, ((i2 >> 6) & 14) | ((i2 >> 12) & 896), ((i2 << 9) & 29360128) | 24960, 109552);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                fetVar2.e0(-163046183);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vol(mm40Var2, str, str2, y9q0Var, y9q0Var2, j, j2, f, j3, f2, i, (byte) 1);
        }
    }

    public static int L(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static final boolean M(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final cjj N(View view, ymx ymxVar, Function1 function1) {
        view.getClass();
        ymxVar.getClass();
        cjj cjjVar = new cjj(ymxVar, false, function1);
        view.setOnClickListener(cjjVar);
        return cjjVar;
    }

    public static cjj O(View view, Function1 function1) {
        return N(view, ivb0.b, function1);
    }

    public static final boolean P(ymx ymxVar, Function0 function0) {
        ymxVar.getClass();
        if (SystemClock.uptimeMillis() - ivb0.c > ymxVar.f42912a) {
            return ((Boolean) function0.invoke()).booleanValue();
        }
        return false;
    }

    public static boolean Q(Function0 function0) {
        return P(ivb0.b, function0);
    }

    public static final void R(djz djzVar) {
        r8q0 r8q0Var = djzVar.e;
        if (r8q0Var != null) {
            djzVar.v.invoke(a8q0.a((a8q0) djzVar.d.f13586a, null, 0L, 3));
            o8q0 o8q0Var = r8q0Var.f30040a;
            AtomicReference atomicReference = o8q0Var.b;
            while (!atomicReference.compareAndSet(r8q0Var, null)) {
                if (atomicReference.get() != r8q0Var) {
                }
            }
            o8q0Var.f24843a.b();
        }
        djzVar.e = null;
    }

    public static final String S(int i) {
        return i < 10 ? twn.m(i, "0") : String.valueOf(i);
    }

    public static final Rect T(wpq wpqVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        nqq nqqVarZ = uzb.Z(((ypq) wpqVar).c);
        jge0 jge0VarA0 = nqqVarZ != null ? uzb.a0(nqqVarZ) : null;
        if (jge0VarA0 == null) {
            return null;
        }
        int i = (int) jge0VarA0.f16474a;
        int i2 = iArr[0];
        int i3 = iArr2[0];
        int i4 = (int) jge0VarA0.b;
        int i5 = iArr[1];
        int i6 = iArr2[1];
        return new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) jge0VarA0.c) + i2) - i3, (((int) jge0VarA0.d) + i5) - i6);
    }

    public static final p0n U(d0t d0tVar) {
        d0tVar.getClass();
        if (uzb.s0(d0tVar)) {
            return new p0n(kpb.j0(d0tVar) ? kpb.u0(d0tVar) : kpb.q0(d0tVar), fgm.b, d0tVar.P.getTime(), kpb.j0(d0tVar), 16);
        }
        return null;
    }

    public static cjj V(Function1 function1) {
        ymx ymxVar = ivb0.b;
        ymxVar.getClass();
        return new cjj(ymxVar, false, new olh(function1, (byte) 14));
    }

    public static final View W(lm40 lm40Var) {
        bhu0 bhu0Var = vcc.Z(lm40Var.f20279a).p;
        View interopView = bhu0Var != null ? bhu0Var.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        jf4.n("Could not fetch interop view");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static v8i X(Application application) {
        application.getClass();
        v8i v8iVar = f6885a;
        if (v8iVar != null) {
            return v8iVar;
        }
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ddw.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (!(ze3Var instanceof ddw)) {
                ze3Var = null;
            }
            ddw ddwVar = (ddw) ze3Var;
            if (ddwVar != null) {
                duj dujVar = ddwVar.f5917a;
                oeg0 oeg0Var = ddwVar.b;
                pyg pygVar = ddwVar.c;
                iip iipVar = ddwVar.d;
                cad cadVar = ddwVar.e;
                xri xriVar = ddwVar.f;
                m1e m1eVar = ddwVar.g;
                ctf0 ctf0Var = ddwVar.h;
                gii0 gii0Var = ddwVar.i;
                knf0 knf0Var = ddwVar.j;
                j2u j2uVar = ddwVar.k;
                pmi pmiVar = ddwVar.l;
                pru pruVar = ddwVar.m;
                us3 us3Var = ddwVar.n;
                vby vbyVar = ddwVar.o;
                rrc rrcVar = ddwVar.p;
                xyt xytVar = ddwVar.q;
                gst0 gst0Var = ddwVar.r;
                j1q0 j1q0Var = ddwVar.s;
                e720 e720Var = ddwVar.t;
                jru jruVar = ddwVar.u;
                kqc kqcVar = ddwVar.v;
                lp4 lp4Var = ddwVar.x;
                sue sueVar = ddwVar.w;
                oeg0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                us3Var.getClass();
                vbyVar.getClass();
                gst0Var.getClass();
                j1q0Var.getClass();
                pygVar.getClass();
                iipVar.getClass();
                xriVar.getClass();
                lp4Var.getClass();
                sueVar.getClass();
                v8i v8iVar2 = new v8i(pygVar, cadVar, xriVar, sueVar, lp4Var, dujVar, oeg0Var, m1eVar, ctf0Var, gii0Var, knf0Var, j2uVar, pmiVar, pruVar, us3Var, vbyVar, rrcVar, xytVar, gst0Var, j1q0Var, e720Var, jruVar, kqcVar);
                f6885a = v8iVar2;
                return v8iVar2;
            }
        }
        jf4.n(b1j.i(ddw.class, "Cannot create dependency "));
        return null;
    }

    public static final uxm Y(d0t d0tVar) {
        d0tVar.getClass();
        if (!qzb.B0(d0tVar) && !kpb.j0(d0tVar)) {
            return null;
        }
        long jU0 = kpb.j0(d0tVar) ? kpb.u0(d0tVar) : kpb.q0(d0tVar);
        fgm fgmVar = fgm.f9498a;
        return new uxm(jU0, kpb.j0(d0tVar), d0tVar.P.getTime());
    }

    public static final ezm Z(d0t d0tVar) {
        d0tVar.getClass();
        if (!qzb.B0(d0tVar) && !kpb.j0(d0tVar)) {
            return null;
        }
        long jU0 = kpb.j0(d0tVar) ? kpb.u0(d0tVar) : kpb.q0(d0tVar);
        fgm fgmVar = fgm.f9498a;
        return new ezm(jU0, kpb.j0(d0tVar), d0tVar.P.getTime());
    }

    public static final void a(mm40 mm40Var, long j, long j2, fet fetVar, int i) {
        fetVar.g0(-1796870926);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.f(j) ? 32 : 16) | (fetVar.f(j2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, o2e.e0(i120.S(i120.Q(o7k0.e(o7k0.s(mm40Var, 6.0f), 10.0f), j, vgg0.a(2.0f)), 1.0f, j2, vgg0.a(2.0f)), "VICTORY_INDICATOR_CELL_ITEM_BOX"));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hzh(mm40Var, j, j2, i, (byte) 2);
        }
    }

    public static final p0n a0(d0t d0tVar) {
        d0tVar.getClass();
        if (qzb.B0(d0tVar) || kpb.j0(d0tVar)) {
            return new p0n(kpb.j0(d0tVar) ? kpb.u0(d0tVar) : kpb.q0(d0tVar), fgm.b, d0tVar.P.getTime(), kpb.j0(d0tVar), 16);
        }
        return null;
    }

    public static final void b(mm40 mm40Var, IntRange intRange, IntRange intRange2, long j, long j2, long j3, fet fetVar, int i) {
        int i2;
        long j4;
        boolean z;
        fetVar.g0(-1579720178);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(intRange) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(intRange2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.f(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            j4 = j3;
            i2 |= fetVar.f(j4) ? 131072 : 65536;
        } else {
            j4 = j3;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            fetVar.e0(1135077262);
            int i3 = intRange.f46068a;
            int i4 = intRange.b;
            if (i3 <= i4) {
                while (true) {
                    boolean z2 = i3 <= intRange2.b && intRange2.f46068a <= i3;
                    boolean zH = fetVar.h(z2);
                    Object objP = fetVar.P();
                    if (zH || objP == ukd.f35823a) {
                        objP = new z((byte) 28, z2);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarA = pai0.a(jm40.b, false, (Function1) objP);
                    if (!z2) {
                        j4 = j;
                    }
                    int i5 = i3;
                    z = true;
                    a(mm40VarA, j4, z2 ? j3 : j2, fetVar, 0);
                    if (i5 == i4) {
                        break;
                    }
                    i3 = i5 + 1;
                    j4 = j3;
                }
            } else {
                z = true;
            }
            fetVar.r(false);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0m(mm40Var, intRange, intRange2, j, j2, j3, i);
        }
    }

    public static final cjj b0(View view, ymx ymxVar, Function1 function1) {
        view.getClass();
        ymxVar.getClass();
        cjj cjjVar = new cjj(ymxVar, true, function1);
        view.setOnClickListener(cjjVar);
        return cjjVar;
    }

    public static final void c(mm40 mm40Var, vum vumVar, vum vumVar2, a2m a2mVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1563392738);
        int i2 = i | (fetVar.g(vumVar) ? 32 : 16) | (fetVar.g(vumVar2) ? 256 : 128) | (fetVar.g(a2mVar) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40Var2, 72.0f), 4.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i3 = vumVar.c;
            int i4 = vumVar.d;
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (i3 > 0) {
                fetVar.e0(-213720060);
                boolean zE = fetVar.e(i3) | fetVar.e(i4);
                Object objP = fetVar.P();
                if (zE || objP == cl5Var) {
                    objP = new j2m(i3, i4);
                    fetVar.o0(objP);
                }
                i2m.b(o2e.e0(jm40Var, "FIRST_DS_CUSTOM_VERTICAL_INDICATOR"), (j2m) objP, fetVar, 6);
                fetVar.r(false);
            } else {
                fetVar.e0(-213197276);
                fetVar.r(false);
            }
            obb.q(null, a2mVar, z, fetVar, (i2 >> 6) & 1008, 1);
            int i5 = vumVar2.c;
            int i6 = vumVar2.d;
            if (i5 > 0) {
                fetVar.e0(-213064193);
                boolean zE2 = fetVar.e(i5) | fetVar.e(i6);
                Object objP2 = fetVar.P();
                if (zE2 || objP2 == cl5Var) {
                    objP2 = new j2m(i5, i6);
                    fetVar.o0(objP2);
                }
                i2m.b(o2e.e0(jm40Var, "SECOND_DS_CUSTOM_VERTICAL_INDICATOR"), (j2m) objP2, fetVar, 6);
                fetVar.r(false);
            } else {
                fetVar.e0(-212536604);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0((byte) 14, i, mm40Var2, (Object) vumVar, (Object) vumVar2, (Object) a2mVar, z);
        }
    }

    public static void c0(View view, Function1 function1) {
        b0(view, ivb0.b, function1);
    }

    public static final void d(mm40 mm40Var, String str, String str2, Function2 function2, Function2 function3, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        str.getClass();
        str2.getClass();
        fetVar.g0(760563051);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024) | (fetVar.i(function3) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            if (function2 == null) {
                fetVar.e0(-1216392118);
                fetVar.r(false);
            } else {
                fetVar.e0(-1701806441);
                h97.q((i2 >> 9) & 14, fetVar, function2, false);
            }
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
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
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40Var2 = jm40Var;
            v8q0.a(str, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, (i2 >> 3) & 14, 0, 131066);
            v8q0.a(str2, null, staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.h(), fetVar, (i2 >> 6) & 14, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (function3 == null) {
                fetVar2.e0(-1215900086);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1701790569);
                h97.q((i2 >> 12) & 14, fetVar2, function3, false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jdd(mm40Var2, str, str2, function2, function3, i, (byte) 1);
        }
    }

    public static String d0(eyb eybVar, u9y u9yVar) {
        if (eybVar.b(u9yVar)) {
            return null;
        }
        return eybVar.getDescription();
    }

    public static final void e(l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        float f;
        fetVar.g0(1684305515);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            float fH0 = lgb.h0(fetVar);
            qsk qskVar = (qsk) ((tsk) l7m0Var.getValue()).b.getValue();
            boolean zG = fetVar.g(qskVar);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                nsk nskVar = qskVar instanceof nsk ? (nsk) qskVar : null;
                if (nskVar != null ? nskVar.c : false) {
                    zcl zclVar = qmk.f28987a;
                    f = 276.0f;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    f = 160.0f;
                }
                objP = twn.j(f, fetVar);
            }
            float f2 = ((ycl) objP).f42389a + fH0;
            zcl zclVar3 = qmk.f28987a;
            float f3 = 56.0f + fH0;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP3);
            }
            pz40 pz40Var2 = (pz40) objP3;
            androidx.compose.runtime.d dVar = m8m0.f21378a;
            long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(dVar)).m121getTransparent0d7_KjU();
            long jM121getTransparent0d7_KjU2 = ((StaticColors) fetVar.k(dVar)).m121getTransparent0d7_KjU();
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = new ca6(pz40Var2, (byte) 27);
                fetVar.o0(objP4);
            }
            m0x0.d(null, f2, jM121getTransparent0d7_KjU, jM121getTransparent0d7_KjU2, true, 14.0f, null, background, 0.0f, pz40Var, (Function1) objP4, u1c.M(1592276894, new qpk(qskVar, f2, f3, fH0, function1, (byte) 1), fetVar), u1c.M(-393838376, new fqk(xczVarA, qdzVar, function1, function2, pz40Var2, l7m0Var, pz40Var), fetVar), fetVar, 805330944, 438, 321);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new keg(l7m0Var, qdzVar, function1, function2, i, (byte) 4);
        }
    }

    public static final boolean e0(long j) {
        long jCurrentTimeMillis = j - (System.currentTimeMillis() / 1000);
        return 1 <= jCurrentTimeMillis && jCurrentTimeMillis < 21600;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 25661. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void f(a.a8q0 r62, kotlin.jvm.functions.Function1 r63, a.mm40 r64, a.y9q0 r65, a.vuu0 r66, kotlin.jvm.functions.Function1 r67, a.gy40 r68, a.skk0 r69, boolean r70, int r71, int r72, a.k3x r73, a.kly r74, boolean r75, boolean r76, a.xdr r77, a.fet r78, int r79, int r80) {
        /*
            Method dump skipped, instruction units count: 2566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.dyb.f(a.a8q0, kotlin.jvm.functions.Function1, a.mm40, a.y9q0, a.vuu0, kotlin.jvm.functions.Function1, a.gy40, a.skk0, boolean, int, int, a.k3x, a.kly, boolean, boolean, a.xdr, a.fet, int, int):void");
    }

    public static final void f0(djz djzVar, a8q0 a8q0Var, qe60 qe60Var) {
        rfk0 rfk0VarJ = vdx.J();
        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
        try {
            b9q0 b9q0VarD = djzVar.d();
            if (b9q0VarD == null) {
                return;
            }
            r8q0 r8q0Var = djzVar.e;
            if (r8q0Var == null) {
                return;
            }
            j6z j6zVarC = djzVar.c();
            if (j6zVarC == null) {
                return;
            }
            ktt0.u(a8q0Var, djzVar.f6209a, b9q0VarD.f2224a, j6zVarC, r8q0Var, djzVar.b(), qe60Var);
        } finally {
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
        }
    }

    public static final void g(mm40 mm40Var, k7q0 k7q0Var, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(2036174316);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.i(k7q0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, true);
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
            dtb.b(k7q0Var, ugdVar, fetVar, (i2 >> 3) & 126);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var, k7q0Var, ugdVar, i, (byte) 19);
        }
    }

    public static final i4 g0(Object... objArr) {
        lak0 lak0Var = lak0.c;
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        lak0Var.getClass();
        return lak0Var.f(listAsList);
    }

    public static final void h(r7m r7mVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-788818708);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(r7mVar) : fetVar.i(r7mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(o7k0.e(o7k0.s(jm40Var, 40.0f), 32.0f), null, null, false, null, function0, 28);
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
            r2x r2xVarT = jpm0.t(R.drawable.ic_glyph_chevron_right_small, 6, fetVar);
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 24.0f), 18.0f);
            long j = r7mVar.b;
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            dww.b(r2xVarT, null, s5x0.J(i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 1.0f), r7mVar.c, fetVar, 48, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7m(r7mVar, function0, i, b);
        }
    }

    public static final bi90 h0(Object... objArr) {
        bi90 bi90Var = bi90.e;
        List listAsList = Arrays.asList(objArr);
        listAsList.getClass();
        bi90Var.getClass();
        return bi90Var.e(listAsList);
    }

    public static final void i(int i, int i2, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(-831420230);
        int i3 = i2 | 6 | (fetVar.e(i) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            String strW = rsm0.w(i, (i3 >> 3) & 14, fetVar);
            strW.getClass();
            na10 na10VarW = x8x.w(new oa10(strW), fetVar);
            u910 u910VarA0 = gq80.a0(na10VarW.getValue(), fetVar, 956);
            fa10 fa10VarB = na10VarW.getValue();
            boolean zG = fetVar.g(u910VarA0);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new u4h(u910VarA0, b);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            fetVar2 = fetVar;
            piz.j(fa10VarB, (Function0) objP, jm40Var, null, fetVar2, 384, 0, 131064);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i, i2, (byte) 15);
        }
    }

    public static final bi90 i0(bi90 bi90Var, Iterable iterable) {
        bi90Var.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            return bi90Var.e((Collection) iterable);
        }
        di90 di90Var = new di90(bi90Var);
        w3d.u(di90Var, iterable);
        return di90Var.e();
    }

    public static final void j(ioh iohVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        iohVar.getClass();
        int i2 = i & 4;
        cl5 cl5Var = ukd.f35823a;
        if (i2 != 0) {
            Object objP = fetVar.P();
            if (objP == cl5Var) {
                objP = new m7h((byte) 21);
                fetVar.o0(objP);
            }
            function1 = (Function1) objP;
        }
        if ((i & 8) != 0) {
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new m7h((byte) 22);
                fetVar.o0(objP2);
            }
            function2 = (Function1) objP2;
        }
        if (iohVar instanceof goh) {
            fetVar.e0(330180648);
            fxb.f(((goh) iohVar).f11632a, function2, function1, fetVar, 0);
            fetVar.r(false);
        } else {
            if (!iohVar.equals(hoh.f13393a)) {
                throw b1j.f(1534669355, fetVar, false);
            }
            fetVar.e0(330485316);
            ozb.m(0, fetVar);
            fetVar.r(false);
        }
    }

    public static final uek0 j0(f3d f3dVar, j73 j73Var, fet fetVar, int i) {
        sjj sjjVarA = wzk0.a(fetVar);
        boolean zG = fetVar.g(sjjVarA);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zG || objP == obj) {
            objP = new iuj(sjjVarA);
            fetVar.o0(objP);
        }
        iuj iujVar = (iuj) objP;
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && fetVar.g(f3dVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !fetVar.g(j73Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objP2 = fetVar.P();
        if (z3 || objP2 == obj) {
            objP2 = new uek0(f3dVar, iujVar, j73Var);
            fetVar.o0(objP2);
        }
        return (uek0) objP2;
    }

    public static final void k(mm40 mm40Var, ypl yplVar, bql bqlVar, Function0 function0, Function2 function2, fet fetVar, int i) {
        int i2;
        yplVar.getClass();
        fetVar.g0(1343842267);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.e(yplVar.ordinal()) ? 32 : 16) | (fetVar.g(bqlVar) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            int iOrdinal = yplVar.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-1352724493);
                int i4 = i3 & 14;
                int i5 = i3 >> 3;
                fre0.v(mm40Var, bqlVar, function0, function2, fetVar, i4 | (i5 & 112) | (i5 & 896) | (i5 & 7168));
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(-1352715405);
                int i6 = i3 & 14;
                int i7 = i3 >> 3;
                x4d0.v(mm40Var, bqlVar, function0, function2, fetVar, i6 | (i7 & 112) | (i7 & 896) | (i7 & 7168));
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(-1352706251);
                int i8 = i3 & 14;
                int i9 = i3 >> 3;
                unh0.s(mm40Var, bqlVar, function0, function2, fetVar, i8 | (i9 & 112) | (i9 & 896) | (i9 & 7168));
                fetVar.r(false);
            } else if (iOrdinal == 3) {
                fetVar.e0(-1352696970);
                int i10 = i3 & 14;
                int i11 = i3 >> 3;
                ohq0.y(mm40Var, bqlVar, function0, function2, fetVar, i10 | (i11 & 112) | (i11 & 896) | (i11 & 7168));
                fetVar.r(false);
            } else {
                if (iOrdinal != 4) {
                    throw b1j.f(-1352725875, fetVar, false);
                }
                fetVar.e0(-1352687658);
                int i12 = i3 & 14;
                int i13 = i3 >> 3;
                ccq0.p(mm40Var, bqlVar, function0, function2, fetVar, i12 | (i13 & 112) | (i13 & 896) | (i13 & 7168));
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gja(mm40Var, yplVar, bqlVar, function0, function2, i, (byte) 1);
        }
    }

    public static void k0(x2e x2eVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + x2eVar.b;
        try {
            int iE = hne.E(x2eVar.c);
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z = true;
            switch (iE) {
                case 0:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 1:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((L((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (L((int) (fArr[3] * 255.0f)) << 24) | (L((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | L((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iL = (L((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (L((int) (fArr[3] * 255.0f)) << 24) | (L((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | L((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iL);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    throw new RuntimeException("unable to interpolate strings " + x2eVar.b);
                case 5:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z));
                    return;
                case 6:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            StringBuilder sbT = kng0.t("Cannot access method ", str, " on View \"");
            sbT.append(ozb.U(view));
            sbT.append(Separators.DOUBLE_QUOTE);
            Log.e("CustomSupport", sbT.toString(), e);
        } catch (NoSuchMethodException e2) {
            StringBuilder sbT2 = kng0.t("No method ", str, " on View \"");
            sbT2.append(ozb.U(view));
            sbT2.append(Separators.DOUBLE_QUOTE);
            Log.e("CustomSupport", sbT2.toString(), e2);
        } catch (InvocationTargetException e3) {
            StringBuilder sbT3 = kng0.t("Cannot invoke method ", str, " on View \"");
            sbT3.append(ozb.U(view));
            sbT3.append(Separators.DOUBLE_QUOTE);
            Log.e("CustomSupport", sbT3.toString(), e3);
        }
    }

    public static final void l(mm40 mm40Var, String str, String str2, y9q0 y9q0Var, y9q0 y9q0Var2, long j, long j2, float f, long j3, float f2, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1401089505);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(y9q0Var) ? 2048 : 1024) | (fetVar2.g(y9q0Var2) ? 16384 : 8192) | (fetVar2.f(j) ? 131072 : 65536) | (fetVar2.f(j2) ? 1048576 : 524288) | (fetVar2.d(f) ? 8388608 : 4194304) | (fetVar2.f(j3) ? 67108864 : 33554432) | (fetVar2.d(f2) ? 536870912 : 268435456);
        if (fetVar2.U(i2 & 1, (306783379 & i2) != 306783378)) {
            g9q0 g9q0VarN = pym0.n(fetVar2);
            boolean z = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = g9q0.a(g9q0VarN, str, y9q0Var, 0, 0, 0L, null, 1020);
                fetVar2.o0(objP);
            }
            a9q0 a9q0Var = (a9q0) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.w(o7k0.A(jm40Var, null, 3), null, false, 3), "TIMER_COLUMN");
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
            v8q0.a(str, o7k0.u(jm40Var, f, 0.0f, 2), j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0Var, fetVar2, ((i2 >> 3) & 14) | ((i2 >> 9) & 896), (i2 << 12) & 29360128, 130040);
            if (str2 != null) {
                fetVar2.e0(611001234);
                v8q0.a(str2, o7k0.e(o7k0.s(jm40Var, pkd.e((int) (a9q0Var.c >> 32), fetVar2)), f2), j2, new n05(qmk.o, j3, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 1, false, 1, 0, null, y9q0Var2, fetVar, ((i2 >> 6) & 14) | ((i2 >> 12) & 896), ((i2 << 9) & 29360128) | 24960, 109552);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                fetVar2.e0(611621389);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vol(mm40Var2, str, str2, y9q0Var, y9q0Var2, j, j2, f, j3, f2, i, (byte) 0);
        }
    }

    public static final void l0(o8q0 o8q0Var, djz djzVar, a8q0 a8q0Var, k3x k3xVar, qe60 qe60Var) {
        hsj hsjVar = djzVar.d;
        ome omeVar = djzVar.v;
        ome omeVar2 = djzVar.w;
        mie0 mie0Var = new mie0();
        nej0 nej0Var = new nej0((Object) hsjVar, (Object) omeVar, (Object) mie0Var, (byte) 20);
        qw90 qw90Var = o8q0Var.f24843a;
        qw90Var.g(a8q0Var, k3xVar, nej0Var, omeVar2);
        r8q0 r8q0Var = new r8q0(o8q0Var, qw90Var);
        o8q0Var.b.set(r8q0Var);
        mie0Var.f21842a = r8q0Var;
        djzVar.e = r8q0Var;
        f0(djzVar, a8q0Var, qe60Var);
    }

    public static final void m(l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        l7m0 l7m0Var2;
        qdz qdzVar2;
        Function1 function3;
        Function1 function4;
        fet fetVar2;
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-2068806677);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            fetVar2 = fetVar;
            e(l7m0Var, qdzVar, function1, function2, fetVar2, i2 & 8190);
            l7m0Var2 = l7m0Var;
            qdzVar2 = qdzVar;
            function3 = function1;
            function4 = function2;
        } else {
            l7m0Var2 = l7m0Var;
            qdzVar2 = qdzVar;
            function3 = function1;
            function4 = function2;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new keg(l7m0Var2, qdzVar2, function3, function4, i, (byte) 3);
        }
    }

    public static final ArrayList m0(ngf ngfVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        List list = ngfVar.f23482a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            chf chfVar = (chf) obj;
            int i3 = chfVar.f4356a;
            int i4 = chfVar.e;
            nhf nhfVar = (nhf) nhf.d.get(chfVar.c);
            String strA = ctf0Var.b.a(R.string.crystal_plus_points_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1));
            int i5 = chfVar.d;
            arrayList.add(new rgf(i, i3, nhfVar, strA, w6x.n(i5, i4 / i5, "x")));
            i = i2;
        }
        return arrayList;
    }

    public static final void n(final u4l u4lVar, amw amwVar, fet fetVar, int i) {
        int i2;
        amwVar.getClass();
        fetVar.g0(-392464096);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(u4lVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(amwVar) ? 32 : 16;
        }
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 4.0f, 7), "DOTA_SKILLS_STATISTICS");
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new i5l(amwVar, b2);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new n2l((byte) 8);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new Function1() { // from class: a.h7l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = b;
                        int i4 = 0;
                        u4l u4lVar2 = u4lVar;
                        j7l j7lVar = (j7l) obj;
                        switch (b3) {
                            case 0:
                                j7lVar.getClass();
                                String strValueOf = String.valueOf(u4lVar2.b);
                                strValueOf.getClass();
                                DotaSkillsViewContainer dotaSkillsViewContainer = (DotaSkillsViewContainer) j7lVar.f16046a.d;
                                for (Object obj2 : dotaSkillsViewContainer.f46501a.values()) {
                                    int i5 = i4 + 1;
                                    if (i4 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    o6l o6lVar = (o6l) obj2;
                                    amw amwVar2 = dotaSkillsViewContainer.c;
                                    if (amwVar2 != null) {
                                        amwVar2.b(strValueOf + i4, o6lVar);
                                    }
                                    i4 = i5;
                                }
                                return Unit.f46060a;
                            default:
                                j7lVar.getClass();
                                j7lVar.setTeam(u4lVar2.c);
                                j7lVar.setHeroes(u4lVar2.d);
                                j7lVar.setHeroesItems(u4lVar2.e);
                                j7lVar.setAdditionalInformation(u4lVar2.f);
                                j7lVar.setItems(u4lVar2.g);
                                String strValueOf2 = String.valueOf(u4lVar2.b);
                                strValueOf2.getClass();
                                DotaSkillsViewContainer dotaSkillsViewContainer2 = (DotaSkillsViewContainer) j7lVar.f16046a.d;
                                for (Object obj3 : dotaSkillsViewContainer2.f46501a.values()) {
                                    int i6 = i4 + 1;
                                    if (i4 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    o6l o6lVar2 = (o6l) obj3;
                                    amw amwVar3 = dotaSkillsViewContainer2.c;
                                    if (amwVar3 != null) {
                                        amwVar3.a(strValueOf2 + i4, o6lVar2);
                                    }
                                    i4 = i6;
                                }
                                return Unit.f46060a;
                        }
                    }
                };
                fetVar.o0(objP3);
            }
            Function1 function3 = (Function1) objP3;
            b = i3 == 4 ? (byte) 1 : (byte) 0;
            Object objP4 = fetVar.P();
            if (b != 0 || objP4 == cl5Var) {
                objP4 = new Function1() { // from class: a.h7l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = b2;
                        int i4 = 0;
                        u4l u4lVar2 = u4lVar;
                        j7l j7lVar = (j7l) obj;
                        switch (b3) {
                            case 0:
                                j7lVar.getClass();
                                String strValueOf = String.valueOf(u4lVar2.b);
                                strValueOf.getClass();
                                DotaSkillsViewContainer dotaSkillsViewContainer = (DotaSkillsViewContainer) j7lVar.f16046a.d;
                                for (Object obj2 : dotaSkillsViewContainer.f46501a.values()) {
                                    int i5 = i4 + 1;
                                    if (i4 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    o6l o6lVar = (o6l) obj2;
                                    amw amwVar2 = dotaSkillsViewContainer.c;
                                    if (amwVar2 != null) {
                                        amwVar2.b(strValueOf + i4, o6lVar);
                                    }
                                    i4 = i5;
                                }
                                return Unit.f46060a;
                            default:
                                j7lVar.getClass();
                                j7lVar.setTeam(u4lVar2.c);
                                j7lVar.setHeroes(u4lVar2.d);
                                j7lVar.setHeroesItems(u4lVar2.e);
                                j7lVar.setAdditionalInformation(u4lVar2.f);
                                j7lVar.setItems(u4lVar2.g);
                                String strValueOf2 = String.valueOf(u4lVar2.b);
                                strValueOf2.getClass();
                                DotaSkillsViewContainer dotaSkillsViewContainer2 = (DotaSkillsViewContainer) j7lVar.f16046a.d;
                                for (Object obj3 : dotaSkillsViewContainer2.f46501a.values()) {
                                    int i6 = i4 + 1;
                                    if (i4 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    o6l o6lVar2 = (o6l) obj3;
                                    amw amwVar3 = dotaSkillsViewContainer2.c;
                                    if (amwVar3 != null) {
                                        amwVar3.a(strValueOf2 + i4, o6lVar2);
                                    }
                                    i4 = i6;
                                }
                                return Unit.f46060a;
                        }
                    }
                };
                fetVar.o0(objP4);
            }
            dwi0.c(function1, mm40VarE0, function2, function3, (Function1) objP4, fetVar, 384, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(u4lVar, amwVar, i, (byte) 26);
        }
    }

    public static final hxu n0(pxu pxuVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Double d;
        String str6;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        Double d6;
        pxuVar.getClass();
        lvo0 lvo0Var = pxuVar.f27772a;
        if (lvo0Var == null || (str = lvo0Var.f20725a) == null) {
            str = "";
        }
        ivo0 ivo0Var = new ivo0(str, (lvo0Var == null || (d6 = lvo0Var.b) == null) ? 0.0d : d6.doubleValue());
        String str7 = "";
        lvo0 lvo0Var2 = pxuVar.b;
        if (lvo0Var2 == null || (str2 = lvo0Var2.f20725a) == null) {
            str2 = str7;
        }
        ivo0 ivo0Var2 = new ivo0(str2, (lvo0Var2 == null || (d5 = lvo0Var2.b) == null) ? 0.0d : d5.doubleValue());
        lvo0 lvo0Var3 = pxuVar.c;
        if (lvo0Var3 == null || (str3 = lvo0Var3.f20725a) == null) {
            str3 = str7;
        }
        double dDoubleValue = (lvo0Var3 == null || (d4 = lvo0Var3.b) == null) ? 0.0d : d4.doubleValue();
        ivo0 ivo0Var3 = new ivo0(str3, dDoubleValue);
        lvo0 lvo0Var4 = pxuVar.d;
        if (lvo0Var4 == null || (str4 = lvo0Var4.f20725a) == null) {
            str4 = str7;
        }
        ivo0 ivo0Var4 = new ivo0(str4, (lvo0Var4 == null || (d3 = lvo0Var4.b) == null) ? 0.0d : d3.doubleValue());
        lvo0 lvo0Var5 = pxuVar.e;
        if (lvo0Var5 == null || (str5 = lvo0Var5.f20725a) == null) {
            str5 = str7;
        }
        ivo0 ivo0Var5 = new ivo0(str5, (lvo0Var5 == null || (d2 = lvo0Var5.b) == null) ? 0.0d : d2.doubleValue());
        double dDoubleValue2 = 0.0d;
        lvo0 lvo0Var6 = pxuVar.f;
        if (lvo0Var6 != null && (str6 = lvo0Var6.f20725a) != null) {
            str7 = str6;
        }
        if (lvo0Var6 != null && (d = lvo0Var6.b) != null) {
            dDoubleValue2 = d.doubleValue();
        }
        return new hxu(ivo0Var, ivo0Var2, ivo0Var3, ivo0Var4, ivo0Var5, new ivo0(str7, dDoubleValue2), dDoubleValue2 - dDoubleValue);
    }

    public static final void o(mm40 mm40Var, int i, int i2, int i3, int i4, qol qolVar, tol tolVar, iol iolVar, fet fetVar, int i5) {
        int i6;
        int i7;
        y9q0 y9q0VarT;
        y9q0 y9q0VarN;
        long j;
        float f;
        float f2;
        long j2;
        float f3;
        y9q0 y9q0Var;
        y9q0 y9q0VarT2;
        long j3;
        fetVar.g0(-1570258161);
        if ((i5 & 6) == 0) {
            i6 = (fetVar.g(mm40Var) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 = i;
            i6 |= fetVar.e(i7) ? 32 : 16;
        } else {
            i7 = i;
        }
        if ((i5 & 384) == 0) {
            i6 |= fetVar.e(i2) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= fetVar.e(i3) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= fetVar.e(i4) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i6 |= (262144 & i5) == 0 ? fetVar.g(qolVar) : fetVar.i(qolVar) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i6 |= fetVar.e(tolVar == null ? -1 : tolVar.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            i6 |= fetVar.g(iolVar) ? 8388608 : 4194304;
        }
        if (fetVar.U(i6 & 1, (4793491 & i6) != 4793490)) {
            fetVar.Z();
            if ((i5 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            int iOrdinal = tolVar.ordinal();
            float f4 = 12.0f;
            if (iOrdinal != 0) {
                f = 14.0f;
                if (iOrdinal != 1) {
                    f4 = 16.0f;
                    if (iOrdinal == 2) {
                        fetVar.e0(1224186450);
                        y9q0VarT = ibm0.t(g1t0.m(), fetVar);
                        zcl zclVar = qmk.f28987a;
                        y9q0VarN = ibm0.n(g1t0.e(), fetVar);
                        j = qmk.p;
                        fetVar.r(false);
                    } else {
                        if (iOrdinal != 3) {
                            throw b1j.f(-1484553487, fetVar, false);
                        }
                        fetVar.e0(1224518894);
                        y9q0VarT2 = ibm0.t(g1t0.j(), fetVar);
                        zcl zclVar2 = qmk.f28987a;
                        y9q0VarN = ibm0.n(g1t0.d(), fetVar);
                        j3 = qmk.q;
                        fetVar.r(false);
                        f = 20.0f;
                    }
                } else {
                    fetVar.e0(1223849294);
                    y9q0VarT2 = ibm0.t(g1t0.d(), fetVar);
                    zcl zclVar3 = qmk.f28987a;
                    y9q0VarN = ibm0.n(g1t0.e(), fetVar);
                    j3 = qmk.p;
                    fetVar.r(false);
                }
                f2 = f;
                j2 = j3;
                y9q0Var = y9q0VarT2;
                f3 = f4;
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(-674949169, new uol(mm40Var, iolVar, i7, qolVar, y9q0Var, y9q0VarN, f2, j2, f3, i2, i3, i4), fetVar), fetVar, 56);
            } else {
                fetVar.e0(1223513967);
                y9q0VarT = ibm0.t(g1t0.e(), fetVar);
                zcl zclVar4 = qmk.f28987a;
                y9q0VarN = ibm0.n(g1t0.f(), fetVar);
                j = qmk.o;
                fetVar.r(false);
                f = 10.0f;
            }
            f2 = f4;
            j2 = j;
            f3 = f;
            y9q0Var = y9q0VarT;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-674949169, new uol(mm40Var, iolVar, i7, qolVar, y9q0Var, y9q0VarN, f2, j2, f3, i2, i3, i4), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lol(mm40Var, i, i2, i3, i4, qolVar, tolVar, iolVar, i5, (byte) 1);
        }
    }

    public static final a4x o0(Iterable iterable) {
        iterable.getClass();
        a4x a4xVar = iterable instanceof a4x ? (a4x) iterable : null;
        return a4xVar == null ? r0(iterable) : a4xVar;
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        fetVar2.g0(1541259637);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
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
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.k(), fetVar2, (i2 >> 3) & 14, 0, 131066);
            mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str2, mm40VarN, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.j(), fetVar2, (i2 >> 6) & 14, 0, 131064);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var2, str, str2, i, (byte) 21);
        }
    }

    public static final th90 p0(Map map) {
        map.getClass();
        th90 th90Var = map instanceof th90 ? (th90) map : null;
        if (th90Var != null) {
            return th90Var;
        }
        sh90 sh90Var = map instanceof sh90 ? (sh90) map : null;
        th90 th90VarBuild = sh90Var != null ? sh90Var.build() : null;
        if (th90VarBuild != null) {
            return th90VarBuild;
        }
        uh90 uh90Var = uh90.g;
        uh90Var.getClass();
        return uh90Var.putAll(map);
    }

    public static final void q(mm40 mm40Var, a8m a8mVar, r7m r7mVar, float f, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        a8mVar.getClass();
        r7mVar.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(405099151);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(a8mVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? fetVar.g(r7mVar) : fetVar.i(r7mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.d(f) ? 2048 : 1024;
        }
        int i4 = i3 | (fetVar.i(function0) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i4 & 1, (74899 & i4) != 74898)) {
            mm40 mm40VarL = s5x0.L(mm40Var, f, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarL, 36.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 54);
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
            if (a8mVar instanceof y7m) {
                fetVar.e0(1765592217);
                c8m c8mVar = ((y7m) a8mVar).f42159a;
                A(c8mVar, r7mVar, function0, fetVar, (i4 & 896) | 6 | ((i4 >> 3) & 7168));
                if (c8mVar.b instanceof n7m) {
                    fetVar.e0(1765854136);
                    h(r7mVar, function1, fetVar, ((i4 >> 12) & 112) | ((i4 >> 6) & 14));
                    fetVar.r(false);
                } else {
                    fetVar.e0(1766029999);
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else {
                if (!(a8mVar instanceof z7m)) {
                    throw b1j.f(1580973300, fetVar, false);
                }
                fetVar.e0(1766097765);
                I(0, fetVar);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s7m(mm40Var, a8mVar, r7mVar, f, function0, function1, i, (byte) 1);
        }
    }

    public static final g4x q0(Iterable iterable) {
        iterable.getClass();
        g4x g4xVar = iterable instanceof g4x ? (g4x) iterable : null;
        if (g4xVar != null) {
            return g4xVar;
        }
        di90 di90Var = iterable instanceof di90 ? (di90) iterable : null;
        bi90 bi90VarE = di90Var != null ? di90Var.e() : null;
        return bi90VarE != null ? bi90VarE : i0(bi90.e, iterable);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    public static final void r(int i, int i2, long j, fet fetVar, mm40 mm40Var, String str) {
        int i3;
        long j2;
        mm40 mm40Var2;
        str.getClass();
        fetVar.g0(381435294);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i3 |= fetVar.f(j2) ? 256 : 128;
        } else {
            j2 = j;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                if (i4 != 0) {
                    mm40Var2 = jm40.b;
                }
                fetVar.s();
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var2, 24.0f), 28.0f);
                long backgroundLight60 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundLight60();
                zcl zclVar2 = qmk.d;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarQ = i120.Q(mm40VarS, backgroundLight60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
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
                v8q0.a(str, null, j2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar, ((i3 >> 3) & 14) | (i3 & 896), 24960, 110586);
                fetVar.r(true);
            } else {
                fetVar.X();
            }
            mm40Var2 = mm40Var;
            fetVar.s();
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarS2 = o7k0.s(o7k0.e(mm40Var2, 24.0f), 28.0f);
            long backgroundLight61 = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundLight60();
            zcl zclVar4 = qmk.d;
            ugg0 ugg0Var2 = vgg0.f37379a;
            mm40 mm40VarQ2 = i120.Q(mm40VarS2, backgroundLight61, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4));
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            v8q0.a(str, null, j2, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar, ((i3 >> 3) & 14) | (i3 & 896), 24960, 110586);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l2m(mm40Var2, str, j, i, i2, (byte) 2);
        }
    }

    public static final i4 r0(Iterable iterable) {
        iterable.getClass();
        i4 i4Var = iterable instanceof i4 ? (i4) iterable : null;
        if (i4Var != null) {
            return i4Var;
        }
        hi90 hi90Var = iterable instanceof hi90 ? (hi90) iterable : null;
        i4 i4VarF = hi90Var != null ? hi90Var.f() : null;
        if (i4VarF != null) {
            return i4VarF;
        }
        lak0 lak0Var = lak0.c;
        lak0Var.getClass();
        if (iterable instanceof Collection) {
            return lak0Var.f((Collection) iterable);
        }
        hi90 hi90VarG = lak0Var.g();
        w3d.u(hi90VarG, iterable);
        return hi90VarG.f();
    }

    public static final void s(final mm40 mm40Var, final vum vumVar, final vum vumVar2, final a2m a2mVar, final String str, final String str2, final mum mumVar, final boolean z, fet fetVar, final int i) {
        int i2;
        k6z k6zVar;
        str.getClass();
        str2.getClass();
        fetVar.g0(469084750);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(vumVar) ? 32 : 16) | (fetVar.g(vumVar2) ? 256 : 128) | (fetVar.g(a2mVar) ? 2048 : 1024) | (fetVar.g(str) ? 16384 : 8192) | (fetVar.g(str2) ? 131072 : 65536) | (fetVar.g(mumVar) ? 1048576 : 524288) | (fetVar.h(z) ? 8388608 : 4194304);
        if (fetVar.U(i3 & 1, (4793491 & i3) != 4793490)) {
            if (z) {
                fetVar.e0(-181107595);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-181106671);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            k6z k6zVar2 = k6zVar;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 100.0f), 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.l, (byte) 11)), gqw0.m, fetVar, 0);
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
            int i4 = i3 >> 9;
            B(o2e.e0(jm40.b, "INFO_CONTAINER_V4"), str, str2, mumVar, fetVar, (i4 & 112) | 6 | (i4 & 896) | (i4 & 7168));
            obc.d(bmd.n.a(k6zVar2), u1c.M(352418648, new i4a0((Object) vumVar, (Object) vumVar2, (Object) a2mVar, z, (byte) 22), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.vvm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dyb.s(mm40Var, vumVar, vumVar2, a2mVar, str, str2, mumVar, z, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final th90 s0(Map map) {
        map.getClass();
        uh90 uh90Var = map instanceof uh90 ? (uh90) map : null;
        if (uh90Var != null) {
            return uh90Var;
        }
        vh90 vh90Var = map instanceof vh90 ? (vh90) map : null;
        th90 th90VarBuild = vh90Var != null ? vh90Var.build() : null;
        if (th90VarBuild != null) {
            return th90VarBuild;
        }
        uh90 uh90Var2 = uh90.g;
        uh90Var2.getClass();
        return uh90Var2.putAll(map);
    }

    public static final void t(mm40 mm40Var, yzm yzmVar, yzm yzmVar2, a2m a2mVar, String str, jwm jwmVar, jwm jwmVar2, boolean z, fet fetVar, int i) {
        int i2;
        yzm yzmVar3;
        yzm yzmVar4;
        a2m a2mVar2;
        String str2;
        k6z k6zVar;
        uso0 uso0Var = uso0.f36223a;
        str.getClass();
        fetVar.g0(-2060345526);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            yzmVar3 = yzmVar;
            i2 |= fetVar.g(yzmVar3) ? 32 : 16;
        } else {
            yzmVar3 = yzmVar;
        }
        if ((i & 384) == 0) {
            yzmVar4 = yzmVar2;
            i2 |= fetVar.g(yzmVar4) ? 256 : 128;
        } else {
            yzmVar4 = yzmVar2;
        }
        if ((i & 3072) == 0) {
            a2mVar2 = a2mVar;
            i2 |= fetVar.g(a2mVar2) ? 2048 : 1024;
        } else {
            a2mVar2 = a2mVar;
        }
        if ((i & 24576) == 0) {
            str2 = str;
            i2 |= fetVar.g(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? fetVar.g(jwmVar) : fetVar.i(jwmVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? fetVar.g(jwmVar2) : fetVar.i(jwmVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.h(z) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.e(0) ? 67108864 : 33554432;
        }
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            if (z) {
                fetVar.e0(-12109455);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-12108531);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-710589430, new ntm(mm40Var, str2, yzmVar3, yzmVar4, a2mVar2, z, jwmVar, jwmVar2), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gw6(mm40Var, yzmVar, yzmVar2, a2mVar, str, jwmVar, jwmVar2, z, i);
        }
    }

    public static final bi90 t0(yni0 yni0Var) {
        yni0Var.getClass();
        return i0(bi90.e, yni0Var);
    }

    public static final void u(mm40 mm40Var, l8n l8nVar, fet fetVar, int i) {
        int i2;
        l8nVar.getClass();
        fetVar.g0(624981404);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l8nVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int iE = l1e0.e(l8nVar.b, new IntRange(1, 4, 1));
            int iE2 = l1e0.e(l8nVar.c, new IntRange(0, 4, 1));
            int i3 = i2;
            IntRange intRange = new IntRange(1, iE, 1);
            IntRange intRange2 = new IntRange(0, iE2, 1);
            k8n k8nVar = l8nVar.f19613a;
            fetVar.e0(138187327);
            zfn zfnVar = zaq0.b;
            b(mm40Var, intRange, intRange2, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ((ThemeColors) fetVar.k(zfnVar)).getSeparator(), k8nVar.f17880a, fetVar, i3 & 14);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((Object) mm40Var, (Object) l8nVar, i, (byte) 5);
        }
    }

    public static final void u0() {
        ymx ymxVar = ivb0.b;
        ivb0.c = SystemClock.uptimeMillis();
    }

    public static final void v(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(553728171);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            imm immVar = ((f4o) l7m0Var.getValue()).f8925a;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ylm(function1, (byte) 22);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new btm(function1, (byte) 13);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z3 = i3 == 32;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new btm(function1, (byte) 14);
                fetVar.o0(objP3);
            }
            Function1 function3 = (Function1) objP3;
            boolean z4 = i3 == 32;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new ylm(function1, (byte) 23);
                fetVar.o0(objP4);
            }
            hlm.c(mm40VarD, immVar, null, function0, null, function2, function3, null, (Function0) objP4, null, null, null, fetVar, 6, 0, 3732);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i, (byte) 10);
        }
    }

    public static final void w(mm40 mm40Var, ewp ewpVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        String str = ewpVar.c;
        fetVar2.g0(219523640);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ewpVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 36.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            String str2 = ewpVar.b;
            zfn zfnVar = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(str2, null, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.n(), 0L, 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, new m600(0, j600.b, 0), 15728639), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            if (str.length() > 0) {
                fetVar2.e0(-12572586);
                long secondary80 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary80();
                ((g1t0) fetVar2.k(zfnVar2)).getClass();
                v8q0.a(str, null, secondary80, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, 0, 24960, 110586);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-12307040);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gup(mm40Var, ewpVar, i, (byte) 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static final void x(mm40 mm40Var, uqr uqrVar, fet fetVar, int i) {
        int i2;
        uqr uqrVar2;
        fet fetVar2;
        final byte b;
        final ?? r11;
        fet fetVar3;
        fet fetVar4 = fetVar;
        uqrVar.getClass();
        j83 j83Var = uqrVar.b;
        fetVar4.g0(1758887484);
        if ((i & 6) == 0) {
            i2 = i | (fetVar4.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar4.g(uqrVar) : fetVar4.i(uqrVar) ? 32 : 16;
        }
        if (fetVar4.U(i2 & 1, (i2 & 19) != 18)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(uqrVar, fetVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar4, 48);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40Var);
            mkd.c0.getClass();
            fetVar4.i0();
            boolean z = fetVar4.S;
            Function0 function0 = e7z.u1;
            if (z) {
                fetVar4.l(function0);
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
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar4, 48);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar4, jm40Var);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(function0);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, thg0VarA, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar4);
            androidx.compose.runtime.d dVar = zaq0.b;
            oil oilVarT = ju70.T(a8k0.F(R.drawable.ic_glyph_language, 0, fetVar4), new m78(((ThemeColors) fetVar4.k(dVar)).getSecondary(), 5), null, 10);
            zcl zclVar = qmk.f28987a;
            k7x.b(((uqr) pz40VarF.getValue()).c, null, o7k0.n(jm40Var, 16.0f), oilVarT, oilVarT, null, null, null, null, null, gqw0.A, null, fetVar4, 36912, 6, 31712);
            mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            String str = uqrVar.f36131a;
            androidx.compose.runtime.d dVar2 = j1t0.e;
            ((g1t0) fetVar4.k(dVar2)).getClass();
            v8q0.a(str, mm40VarN, ((ThemeColors) fetVar4.k(dVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 109560);
            fet fetVar5 = fetVar;
            final boolean z2 = true;
            fetVar5.r(true);
            if (j83Var.b.length() > 0) {
                fetVar5.e0(2058567149);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                ((g1t0) fetVar5.k(dVar2)).getClass();
                b = 3;
                v8q0.b(j83Var, mm40VarN2, ((ThemeColors) fetVar5.k(dVar)).getSecondary(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, null, g1t0.d(), fetVar, 0, 24960, 240632);
                fet fetVar6 = fetVar;
                r11 = 0;
                fetVar6.r(false);
                fetVar3 = fetVar6;
            } else {
                b = 3;
                r11 = 0;
                fetVar5.e0(2058929756);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            uqrVar2 = uqrVar;
            final jg30 jg30Var = uqrVar2.d;
            if (jg30Var == null) {
                fetVar3.e0(2058965002);
                fetVar3.r(r11);
            } else {
                fetVar3.e0(2058965003);
                final byte b2 = 2;
                x1x.j(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), u1c.M(-1445100640, new xdr() { // from class: a.sqr
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        byte b3 = r11;
                        jg30 jg30Var2 = jg30Var;
                        yhg0 yhg0Var = (yhg0) obj;
                        fet fetVar7 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (b3) {
                            case 0:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.f(yhg0Var, jg30Var2.f16461a, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            case 1:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.b(yhg0Var, jg30Var2.b, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            case 2:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.d(yhg0Var, jg30Var2.c, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            default:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.e(yhg0Var, jg30Var2.d, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar3), u1c.M(-438419393, new xdr() { // from class: a.sqr
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        byte b3 = z2;
                        jg30 jg30Var2 = jg30Var;
                        yhg0 yhg0Var = (yhg0) obj;
                        fet fetVar7 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (b3) {
                            case 0:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.f(yhg0Var, jg30Var2.f16461a, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            case 1:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.b(yhg0Var, jg30Var2.b, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            case 2:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.d(yhg0Var, jg30Var2.c, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            default:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.e(yhg0Var, jg30Var2.d, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar3), u1c.M(568261854, new xdr() { // from class: a.sqr
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        byte b3 = b2;
                        jg30 jg30Var2 = jg30Var;
                        yhg0 yhg0Var = (yhg0) obj;
                        fet fetVar7 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (b3) {
                            case 0:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.f(yhg0Var, jg30Var2.f16461a, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            case 1:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.b(yhg0Var, jg30Var2.b, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            case 2:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.d(yhg0Var, jg30Var2.c, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            default:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.e(yhg0Var, jg30Var2.d, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar3), u1c.M(1574943101, new xdr() { // from class: a.sqr
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        byte b3 = b;
                        jg30 jg30Var2 = jg30Var;
                        yhg0 yhg0Var = (yhg0) obj;
                        fet fetVar7 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        switch (b3) {
                            case 0:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.f(yhg0Var, jg30Var2.f16461a, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            case 1:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.b(yhg0Var, jg30Var2.b, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            case 2:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.d(yhg0Var, jg30Var2.c, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            default:
                                yhg0Var.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar7.g(yhg0Var) ? 4 : 2;
                                }
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    vsm0.e(yhg0Var, jg30Var2.d, fetVar7, iIntValue & 14);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar3), fetVar3, 28080);
                fetVar3.r(r11);
            }
            fetVar3.r(z2);
            fetVar2 = fetVar3;
        } else {
            uqrVar2 = uqrVar;
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((Object) mm40Var, (Object) uqrVar2, i, (byte) 15);
        }
    }

    public static final void y(mm40 mm40Var, pz40 pz40Var, Function0 function0, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        int i2;
        pz40 pz40Var2;
        function0.getClass();
        fetVar.g0(-1622950730);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            pz40Var2 = pz40Var;
            i2 |= fetVar.g(pz40Var2) ? 32 : 16;
        } else {
            pz40Var2 = pz40Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            String str = (String) pz40Var2.getValue();
            pz40 pz40Var3 = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            hlm.c(mm40VarD, new imm(klm.f18497a, new plm(str, staticColors.m123getWhite0d7_KjU(), fa50.f9191a), fmm.f9790a, staticColors.m121getTransparent0d7_KjU(), false, null), null, null, null, null, null, null, null, u1c.M(-1594582086, new wr4(function0, (byte) 5), fetVar), null, u1c.M(-13420663, new d0(ugdVar2, ugdVar, b), fetVar), fetVar, 805306368, 48, 1532);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a3s(mm40Var, pz40Var, function0, ugdVar, ugdVar2, i, (byte) 1);
        }
    }

    public static final void z(int i, fet fetVar, mm40 mm40Var) {
        zcl zclVar = qmk.f28987a;
        mm40 mm40VarE = o7k0.e(mm40Var, 18.0f);
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
        dww.c(a8k0.F(i, 0, fetVar), null, o7k0.n(jm40.b, 14.0f), y3d.g, fetVar, 3128, 0);
        fetVar.r(true);
    }
}
