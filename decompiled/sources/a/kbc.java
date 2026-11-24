package a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kbc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18007a = 23;

    public static final void A(mm40 mm40Var, String str, String str2, boolean z, v3n v3nVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1884215455);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(v3nVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function0) ? 131072 : 65536;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            y9q0 y9q0VarM = v3nVar.b().m(fetVar);
            mm40 mm40VarW = y860.W(mm40Var, null, null, false, null, function0, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = c0(fetVar, mm40VarW);
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
            int i3 = (i2 >> 12) & 14;
            int i4 = i2 >> 3;
            u6n u6nVarE0 = e0(v3nVar, str2, fetVar, i3 | (i4 & 112));
            mm40 mm40VarN = epv0.N(jm40.b, z ? 1.0f : 0.5f);
            boolean zG = fetVar.g(u6nVarE0);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new d1n(u6nVarE0, b);
                fetVar.o0(objP);
            }
            kkb.p(0, fetVar, mm40VarN, (Function0) objP);
            x7z x7zVar = new x7z(1.0f, true);
            zcl zclVar = qmk.f28987a;
            v8q0.a(str, epv0.N(s5x0.N(x7zVar, 8.0f, 0.0f, 0.0f, 0.0f, 14), z ? 1.0f : 0.5f), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, y9q0VarM, fetVar, i4 & 14, 24960, 109564);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mfo(mm40Var, str, str2, z, v3nVar, function0, i, (byte) 0);
        }
    }

    public static final void B(mm40 mm40Var, String str, String str2, boolean z, v3n v3nVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        boolean z2;
        Object obj;
        fetVar.g0(1360246625);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(v3nVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function0) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            y9q0 y9q0VarM = v3nVar.b().m(fetVar);
            mm40 mm40VarW = y860.W(mm40Var, null, null, false, null, function0, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = c0(fetVar, mm40VarW);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            int i3 = i2 >> 3;
            v8q0.a(str, epv0.N(dw9.h(1.0f, s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), true), z ? 1.0f : 0.5f), 0L, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, y9q0VarM, fetVar, i3 & 14, 24960, 109564);
            fet fetVar3 = fetVar;
            u6n u6nVarE0 = e0(v3nVar, str2, fetVar3, ((i2 >> 12) & 14) | (i3 & 112));
            mm40 mm40VarN = epv0.N(o7k0.y(jm40Var, null, 3), z ? 1.0f : 0.5f);
            boolean zG = fetVar3.g(u6nVarE0);
            Object objP = fetVar3.P();
            if (zG || objP == ukd.f35823a) {
                z2 = true;
                d1n d1nVar = new d1n(u6nVarE0, true ? 1 : 0);
                fetVar3.o0(d1nVar);
                obj = d1nVar;
            } else {
                z2 = true;
                obj = objP;
            }
            kkb.p(0, fetVar3, mm40VarN, (Function0) obj);
            fetVar3.r(z2);
            fetVar2 = fetVar3;
        } else {
            fet fetVar4 = fetVar;
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mfo(mm40Var, str, str2, z, v3nVar, function0, i, (byte) 1);
        }
    }

    public static final void C(a4x a4xVar, long j, fet fetVar, int i) {
        int i2;
        fetVar.g0(-981925810);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(a4xVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = c0(fetVar, jm40Var);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 2986650, a4xVar);
            while (itO.hasNext()) {
                vam vamVar = (vam) itO.next();
                zcl zclVar2 = qmk.f28987a;
                K((i3 << 6) & 7168, j, fetVar, o7k0.n(jm40Var, 36.0f), vamVar.f37096a, vamVar.e);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tam(a4xVar, j, i);
        }
    }

    public static final void D(mm40 mm40Var, zyp zypVar, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(-701562765);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(zypVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = c0(fetVar2, mm40VarD);
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
            b = 1;
            f1t0.a(null, zypVar.f45216a, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), 0L, fetVar, 0, 438265);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywm(mm40Var, zypVar, i, b);
        }
    }

    public static final void E(mm40 mm40Var, r2m r2mVar, String str, boolean z, long j, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1951516067);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(r2mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.f(j) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 36.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = c0(fetVar2, mm40VarE);
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
            y3d y3dVar = new y3d(j);
            if (!z) {
                y3dVar = null;
            }
            vdb.w(null, new r2m(r2mVar.f29742a, r2mVar.b, y3dVar, r2mVar.d), null, fetVar2, 0, 5);
            x7z x7zVar = new x7z(1.0f, true);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, x7zVar, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.d(), fetVar, (i2 >> 6) & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u5h(mm40Var, r2mVar, str, z, j, i);
        }
    }

    public static final void F(mm40 mm40Var, a4x a4xVar, long j, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1317910090);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        long j2 = j;
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j2) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = c0(fetVar, mm40Var);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 1897095470, a4xVar);
            while (itO.hasNext()) {
                vam vamVar = (vam) itO.next();
                E(o7k0.d(jm40.b, 1.0f), vamVar.b, vamVar.c, vamVar.e, j2, fetVar, (57344 & (i3 << 6)) | 6);
                j2 = j;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xhh((Object) mm40Var, (Object) a4xVar, j, i, (byte) 3);
        }
    }

    public static final void G(mm40 mm40Var, rwh0 rwh0Var, int i, lxh0 lxh0Var, Function0 function0, Function0 function1, fet fetVar, int i2) {
        int i3;
        rwh0 rwh0Var2;
        mm40 mm40Var2;
        long jE;
        Object obj;
        boolean z;
        k6x k6xVar;
        Object pqmVar;
        t33 t33Var;
        boolean z2;
        fetVar.g0(-152046931);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(rwh0Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? fetVar.g(lxh0Var) : fetVar.i(lxh0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(null) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function0) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj2) {
                objP2 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            Object[] objArr = new Object[0];
            Object objP3 = fetVar.P();
            if (objP3 == obj2) {
                objP3 = new ndm((byte) 20);
                fetVar.o0(objP3);
            }
            agk0 agk0Var = (agk0) e9x.Q(objArr, (Function0) objP3, fetVar, 48);
            Object[] objArr2 = new Object[0];
            Object objP4 = fetVar.P();
            if (objP4 == obj2) {
                objP4 = new ndm((byte) 21);
                fetVar.o0(objP4);
            }
            agk0 agk0Var2 = (agk0) e9x.Q(objArr2, (Function0) objP4, fetVar, 48);
            Object objP5 = fetVar.P();
            if (objP5 == obj2) {
                objP5 = xf0.c(agk0Var.l());
                fetVar.o0(objP5);
            }
            t33 t33Var2 = (t33) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == obj2) {
                objP6 = xf0.c(agk0Var2.l());
                fetVar.o0(objP6);
            }
            t33 t33Var3 = (t33) objP6;
            ixh0 ixh0Var = ixh0.f15542a;
            boolean zEquals = lxh0Var.equals(ixh0Var);
            kxh0 kxh0Var = kxh0.f19056a;
            jxh0 jxh0Var = jxh0.f17307a;
            if (zEquals || lxh0Var.equals(jxh0Var)) {
                jE = cs0.e(fetVar, -88186348, fetVar, false);
            } else {
                if (!lxh0Var.equals(kxh0Var)) {
                    throw b1j.f(-88190421, fetVar, false);
                }
                fetVar.e0(-88183886);
                jE = afn0.p(fetVar).m123getWhite0d7_KjU();
                fetVar.r(false);
            }
            long j = jE;
            if (lxh0Var.equals(ixh0Var)) {
                fetVar.e0(-88180475);
                obj = obj2;
                k6xVar = new k6x(j, afn0.m(fetVar).getBackground());
                z = false;
                fetVar.r(false);
            } else {
                obj = obj2;
                z = false;
                if (lxh0Var.equals(jxh0Var)) {
                    fetVar.e0(-88173812);
                    k6xVar = new k6x(j, afn0.m(fetVar).getBackgroundContent());
                    fetVar.r(false);
                } else {
                    if (!lxh0Var.equals(kxh0Var)) {
                        throw b1j.f(-88182007, fetVar, false);
                    }
                    fetVar.e0(-88167288);
                    k6xVar = new k6x(j, afn0.p(fetVar).m126getWhite200d7_KjU());
                    fetVar.r(false);
                }
            }
            boolean zG = fetVar.g(agk0Var) | fetVar.i(t33Var2) | fetVar.g(agk0Var2) | fetVar.i(t33Var3) | ((i3 & 112) == 32 ? true : z) | fetVar.i(vneVar) | ((i3 & 896) == 256 ? true : z) | ((458752 & i3) == 131072 ? true : z) | ((3670016 & i3) == 1048576 ? true : z);
            Object objP7 = fetVar.P();
            if (zG || objP7 == obj) {
                t33Var = t33Var3;
                z2 = true;
                pqmVar = new pqm(rwh0Var, vneVar, t33Var, t33Var2, i, function0, function1, pz40Var, agk0Var, agk0Var2, null);
                fetVar.o0(pqmVar);
            } else {
                pqmVar = objP7;
                t33Var = t33Var3;
                z2 = true;
            }
            rwh0Var2 = rwh0Var;
            m0x0.t(fetVar, rwh0Var2, (Function2) pqmVar);
            mm40Var2 = mm40Var;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(o7k0.e(mm40VarD, 2.0f), k6xVar.b, jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, z);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = c0(fetVar, mm40VarQ);
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
            mm40 mm40VarN = epv0.N(o7k0.c(o7k0.d(jm40.b, ((Number) t33Var2.d()).floatValue()), 1.0f), ((Number) t33Var.d()).floatValue());
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(z, fetVar, i120.Q(mm40VarN, k6xVar.f17792a, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            fetVar.r(z2);
        } else {
            rwh0Var2 = rwh0Var;
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xnl(mm40Var2, rwh0Var2, i, lxh0Var, function0, function1, i2);
        }
    }

    public static final void H(mm40 mm40Var, tip0 tip0Var, fet fetVar, int i) {
        tip0 tip0Var2;
        mm40 mm40Var2;
        jm40 jm40Var;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1362413185);
        int i2 = i | 6 | (fetVar2.g(tip0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var2, 16.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = c0(fetVar2, mm40VarN);
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
            boolean z2 = tip0Var instanceof rip0;
            cl5 cl5Var = ukd.f35823a;
            if (z2) {
                fetVar2.e0(-419580729);
                uyp uypVar = ((rip0) tip0Var).f30555a;
                boolean zE = fetVar2.e(uypVar.ordinal());
                Object objP = fetVar2.P();
                if (zE || objP == cl5Var) {
                    objP = Integer.valueOf(ibc.k0(uypVar));
                    fetVar2.o0(objP);
                }
                dww.c(a8k0.F(((Number) objP).intValue(), 0, fetVar2), null, o7k0.n(jm40Var2, 14.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), fetVar2, 56, 0);
                fetVar2.r(false);
                tip0Var2 = tip0Var;
                z = true;
                jm40Var = jm40Var2;
            } else {
                if (tip0Var instanceof sip0) {
                    fetVar2.e0(-419135786);
                    boolean zG = fetVar2.g("0");
                    Object objP2 = fetVar2.P();
                    if (zG || objP2 == cl5Var) {
                        Object objI = ttm0.I(0, "0");
                        if (objI == null) {
                            objI = "";
                        }
                        objP2 = objI.toString();
                        fetVar2.o0(objP2);
                    }
                    jm40Var = jm40Var2;
                    v8q0.a((String) objP2, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24960, 110586);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                    tip0Var2 = tip0Var;
                } else {
                    jm40Var = jm40Var2;
                    tip0Var2 = tip0Var;
                    if (!Intrinsics.d(tip0Var2, qip0.f28803a)) {
                        throw b1j.f(1371936991, fetVar2, false);
                    }
                    fetVar2.e0(-418813541);
                    fetVar2.r(false);
                }
                z = true;
            }
            fetVar2.r(z);
            mm40Var2 = jm40Var;
        } else {
            tip0Var2 = tip0Var;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var2, tip0Var2, i, (byte) 10);
        }
    }

    public static final void I(mm40 mm40Var, oip0 oip0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        long primary;
        fet fetVar2 = fetVar;
        String str = oip0Var.f25323a;
        fetVar2.g0(7700191);
        int i2 = i | 6 | (fetVar2.g(oip0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 16.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = c0(fetVar2, mm40VarN);
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
            boolean zG = fetVar2.g(str);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                objP = ttm0.L(1, str);
                fetVar2.o0(objP);
            }
            String str2 = (String) objP;
            int iOrdinal = oip0Var.b.ordinal();
            if (iOrdinal == 0) {
                fetVar2.e0(-1574943446);
                primary = ((ThemeColors) fetVar2.k(zaq0.b)).getPrimary();
                fetVar2.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(-1574945694, fetVar2, false);
                }
                fetVar2.e0(-1574941112);
                primary = ((StaticColors) fetVar2.k(m8m0.f21378a)).m98getGreen0d7_KjU();
                fetVar2.r(false);
            }
            v8q0.a(str2, null, primary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var2, oip0Var, i, (byte) 9);
        }
    }

    public static final void J(wm7 wm7Var, fet fetVar, int i) {
        fetVar.g0(-1727579132);
        int i2 = i | (fetVar.g(wm7Var) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            v8q0.a(wm7Var.f39390a, s5x0.L(jm40.b, 0.0f, 2.0f, 1), wm7Var.b, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f5o(wm7Var, i, (byte) 6);
        }
    }

    public static final void K(int i, long j, fet fetVar, mm40 mm40Var, String str, boolean z) {
        int i2;
        String str2;
        long jM125getWhite100d7_KjU;
        long jM131getWhite800d7_KjU;
        fetVar.g0(1373878175);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i2 |= fetVar.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.f(j) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            y3d y3dVar = new y3d(j);
            if (!z) {
                y3dVar = null;
            }
            if (y3dVar == null) {
                fetVar.e0(1741976070);
                jM125getWhite100d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m125getWhite100d7_KjU();
                fetVar.r(false);
            } else {
                fetVar.e0(1741974117);
                fetVar.r(false);
                jM125getWhite100d7_KjU = y3dVar.f41946a;
            }
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.S(mm40Var, 1.0f, jM125getWhite100d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = c0(fetVar, mm40VarL);
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
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarG = g1t0.g();
            if (z) {
                fetVar.e0(1366504350);
                jM131getWhite800d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            } else {
                fetVar.e0(1366505472);
                jM131getWhite800d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m131getWhite800d7_KjU();
            }
            fetVar.r(false);
            v8q0.a(str2, null, jM131getWhite800d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0VarG, fetVar, (i2 >> 3) & 14, 24960, 109562);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l2m(mm40Var, str, z, j, i);
        }
    }

    public static final void L(String str, fet fetVar, int i) {
        fetVar.g0(-264668929);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, null, jM123getWhite0d7_KjU, null, qmk.u, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.j(), fetVar, i2 & 14, 24960, 109546);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 23, i, str);
        }
    }

    public static final void M(LinearLayout linearLayout, ArrayList arrayList, List list) {
        Iterator it = new ihu0(linearLayout).iterator();
        int i = 0;
        while (true) {
            jhu0 jhu0Var = (jhu0) it;
            if (!jhu0Var.hasNext()) {
                int i2 = 0;
                for (Object obj : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    String str = (String) obj;
                    nth nthVar = (nth) CollectionsKt.W(i2, list);
                    if (nthVar == null) {
                        View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.cybergame_marble_games_header_title_item, (ViewGroup) linearLayout, false);
                        if (viewInflate == null) {
                            hny.u("rootView");
                            return;
                        }
                        TextView textView = (TextView) viewInflate;
                        nth nthVar2 = new nth(textView, textView);
                        linearLayout.addView(textView);
                        list.add(nthVar2);
                        nthVar = nthVar2;
                    }
                    nthVar.b.setText(str);
                    i2 = i3;
                }
                return;
            }
            Object next = jhu0Var.next();
            int i4 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ((View) next).setVisibility(i < arrayList.size() ? 0 : 8);
            i = i4;
        }
    }

    public static final jo20 N(lnf0 lnf0Var, int i) {
        jo20 jo20Var = new jo20();
        qbt.c(i, jo20Var);
        qbt.h(jo20Var);
        qbt.j(lnf0Var.f20342a, jo20Var);
        qbt.l(jo20Var);
        qbt.p(jo20Var);
        return jo20Var.b();
    }

    public static final mm40 O(mm40 mm40Var, xdr xdrVar) {
        return mm40Var.e(new tkd(xdrVar));
    }

    public static void P(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (parentFile.isDirectory()) {
            return;
        }
        itt0.j(file, "Unable to create parent directories of ");
    }

    public static byte[] Q(String str) {
        if (str.length() % 2 != 0) {
            jf4.o("Expected a string of even length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int iDigit = Character.digit(str.charAt(i2), 16);
            int iDigit2 = Character.digit(str.charAt(i2 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                jf4.o("input is not hexadecimal");
                return null;
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static String S(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append("0123456789abcdef".charAt(i / 16));
            sb.append("0123456789abcdef".charAt(i % 16));
        }
        return sb.toString();
    }

    public static final boolean T(long j, long j2) {
        return j == j2;
    }

    public static final c280 U(d0t d0tVar) {
        d0tVar.getClass();
        f0t f0tVar = d0tVar.q;
        String str = (String) CollectionsKt.W(0, f0tVar.d);
        if (str == null) {
            str = "";
        }
        return new c280(vsm0.s(f0tVar.f8731a, str), R.drawable.no_photo_new);
    }

    public static final c280 V(d0t d0tVar) {
        d0tVar.getClass();
        f0t f0tVar = d0tVar.r;
        String str = (String) CollectionsKt.W(0, f0tVar.d);
        if (str == null) {
            str = "";
        }
        String strS = vsm0.s(f0tVar.f8731a, str);
        long j = d0tVar.v;
        return new c280(strS, (j == jrg.d.b || j == jwg.d.b || j == mxg.d.b) ? R.drawable.ic_banker : R.drawable.no_photo_new);
    }

    public static final Number W(pe0 pe0Var) {
        pe0Var.getClass();
        if (pe0Var instanceof st0) {
            return Long.valueOf(((st0) pe0Var).f32750a);
        }
        if (!(pe0Var instanceof ra0)) {
            return Integer.valueOf(-pe0Var.hashCode());
        }
        return -1L;
    }

    public static final int X(tpe tpeVar) {
        tpeVar.getClass();
        if (tpeVar != null) {
            if (tpeVar instanceof rpe) {
                return ((rpe) tpeVar).f30883a;
            }
            if (tpeVar instanceof spe) {
                return ((spe) tpeVar).f32589a;
            }
        }
        t9f.b();
        return 0;
    }

    public static long Y(double d) {
        x0x.z("not a normal value", Z(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    public static boolean Z(double d) {
        return Math.getExponent(d) <= 1023;
    }

    public static final ArrayList a0(List list, pfn pfnVar) {
        list.getClass();
        pfnVar.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            kr5 kr5Var = (kr5) it.next();
            if (kr5Var.n == oo5.ACTION_DYNAMIC) {
                List list2 = kr5Var.f18749a;
                int i = pfnVar.f26913a;
                kr5Var = new kr5(list2, i, kr5Var.c, kr5Var.d, kr5Var.e, pfnVar.f, pfnVar.e, "", "", "", "", kr5Var.l, kr5Var.m, kr5Var.n, pfnVar.c, "", pfnVar.b, pfnVar.d, kr5Var.s, kr5Var.t, kr5Var.u, twn.m(i, "open/games?id="), kr5Var.w, kr5Var.x, kr5Var.y, kr5Var.z, pfnVar.g);
            }
            arrayList.add(kr5Var);
        }
        return arrayList;
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var) {
        byte b;
        fetVar.g0(-1509360454);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 10.0f), 16.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = c0(fetVar, mm40VarE);
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
            x7x x7xVarR = b8k0.r(b8k0.V(null, fetVar, 1), 0.0f, 360.0f, ro4.b0(ro4.m0(1500, 0, ihn.d, 2), null, 0L, 6), null, fetVar, 4536, 8);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_game_indicator_border, 0, fetVar);
            zfn zfnVar = zaq0.b;
            long secondary60 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary60();
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            dww.c(pm80VarF, null, a8k0.I(o7k0.n(jr8Var.b(jm40Var, zx7Var), 10.0f), ((Number) x7xVarR.getValue()).floatValue()), secondary60, fetVar, 56, 0);
            mm40 mm40VarQ = i120.Q(o7k0.n(jm40Var, 4.0f), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), vgg0.a(2.0f));
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = c0(fetVar, mm40VarQ);
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
            b = 1;
            fetVar.r(true);
            fetVar.r(true);
        } else {
            b = 1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, b);
        }
    }

    public static final mm40 b0(fet fetVar, mm40 mm40Var) {
        if (mm40Var.b(new y2d((byte) 15))) {
            return mm40Var;
        }
        fetVar.f0(1219399079);
        mm40 mm40Var2 = (mm40) mm40Var.a(jm40.b, new cnc(fetVar, (byte) 10));
        fetVar.r(false);
        return mm40Var2;
    }

    public static final void c(final String str, final n0x n0xVar, final m0x m0xVar, final long j, final long j2, final long j3, final boolean z, syl sylVar, final Integer num, y3d y3dVar, final Boolean bool, final boolean z2, final Function0 function0, final xdr xdrVar, xdr xdrVar2, fet fetVar, final int i, final int i2) {
        int i3;
        y3d y3dVar2;
        int i4;
        xdr xdrVar3;
        fet fetVar2;
        syl sylVar2;
        final y3d y3dVar3;
        long primary;
        boolean z3;
        Boolean bool2 = Boolean.TRUE;
        str.getClass();
        sylVar.getClass();
        function0.getClass();
        fetVar.g0(-91373812);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(n0xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.d(0.0f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.d(0.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.g(m0xVar) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= fetVar.f(j) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= fetVar.f(j2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= fetVar.f(j3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= fetVar.h(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= fetVar.e(sylVar.ordinal()) ? 536870912 : 268435456;
        }
        int i5 = i3;
        int i6 = (fetVar.g(num) ? 4 : 2) | (fetVar.g(null) ? 32 : 16);
        int i7 = i2 & 4096;
        if (i7 != 0) {
            i4 = i6 | 384;
            y3dVar2 = y3dVar;
        } else {
            y3dVar2 = y3dVar;
            i4 = i6 | (fetVar.g(y3dVar2) ? 256 : 128);
        }
        int i8 = i4 | (fetVar.g(bool2) ? 2048 : 1024) | (fetVar.g(bool) ? 16384 : 8192) | (fetVar.h(z2) ? 131072 : 65536) | (fetVar.i(function0) ? 1048576 : 524288) | (fetVar.i(xdrVar) ? 8388608 : 4194304) | (fetVar.i(xdrVar2) ? 67108864 : 33554432);
        if (fetVar.U(i5 & 1, ((306783379 & i5) == 306783378 && (i8 & 38347923) == 38347922) ? false : true)) {
            y3d y3dVar4 = i7 != 0 ? null : y3dVar2;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "DS_CHIP");
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarE0, 48.0f, 0.0f, 2);
            boolean z4 = (i8 & 458752) == 131072;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new z((byte) 4, z2);
                fetVar.o0(objP);
            }
            mm40 mm40VarL = s5x0.L(pai0.a(mm40VarG, true, (Function1) objP), 0.0f, 8.0f, 1);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z5 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z5) {
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
            mm40 mm40VarQ = i120.Q(o7k0.g(epv0.N(jm40Var, z ? 0.5f : 1.0f), 32.0f, 0.0f, 2), j2, vgg0.a(14.0f));
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new zxb((byte) 4);
                fetVar.o0(objP2);
            }
            mm40 mm40VarY = y860.Y(mm40VarQ, false, null, null, (Function0) objP2, 14);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = c0(fetVar, mm40VarY);
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
            sylVar2 = sylVar;
            mm40 mm40VarN = sylVar2 == syl.b ? s5x0.N(new x7z(1.0f, false), 0.0f, 0.0f, 8.0f, 0.0f, 11) : s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 6.0f, 0.0f, 4.0f, 0.0f, 10);
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new zxb((byte) 5);
                fetVar.o0(objP3);
            }
            int i9 = i5 >> 15;
            int i10 = i9 & 7168;
            ebc.b(mm40VarN2, j, 0.0f, z, n0xVar, num, null, null, null, null, bool, null, null, (Function0) objP3, fetVar, ((i5 >> 12) & 112) | (i5 & 896) | i10 | ((i5 << 9) & 57344) | ((i8 << 15) & 458752), ((i8 >> 12) & 14) | 3072, 7104);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN, j3, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, (i5 & 14) | (i9 & 896), 24960, 110584);
            mm40 mm40VarN3 = s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11);
            if (y3dVar4 != null) {
                primary = y3dVar4.f41946a;
            } else {
                pz40 pz40Var = s6t0.f31722a;
                primary = s6t0.b().f33626a.getPrimary();
            }
            ebc.b(mm40VarN3, primary, 0.0f, z, null, null, null, null, m0xVar, null, null, null, bool2, function0, fetVar, ((i5 << 12) & 234881024) | i10 | ((i5 >> 3) & 896) | ((i8 << 24) & 1879048192), ((i8 >> 3) & 896) | ((i8 >> 9) & 7168), 3312);
            fetVar2 = fetVar;
            fetVar2.r(true);
            Object obj = jr8.f16991a;
            if (xdrVar == null) {
                fetVar2.e0(1758429542);
                z3 = false;
                fetVar2.r(false);
            } else {
                z3 = false;
                fetVar2.e0(1758429543);
                xdrVar.F(obj, fetVar2, 6);
                fetVar2.r(false);
            }
            if (xdrVar2 == null) {
                fetVar2.e0(1758500966);
                fetVar2.r(z3);
                xdrVar3 = xdrVar2;
            } else {
                fetVar2.e0(1758500967);
                xdrVar3 = xdrVar2;
                xdrVar3.F(obj, fetVar2, 6);
                fetVar2.r(z3);
            }
            fetVar2.r(true);
            y3dVar3 = y3dVar4;
        } else {
            xdrVar3 = xdrVar2;
            fetVar2 = fetVar;
            sylVar2 = sylVar;
            fetVar2.X();
            y3dVar3 = y3dVar2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final syl sylVar3 = sylVar2;
            final xdr xdrVar4 = xdrVar3;
            yfe0VarU.d = new Function2() { // from class: a.jbc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = x8x.L(i | 1);
                    kbc.c(str, n0xVar, m0xVar, j, j2, j3, z, sylVar3, num, y3dVar3, bool, z2, function0, xdrVar, xdrVar4, (fet) obj2, iL, i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final mm40 c0(fet fetVar, mm40 mm40Var) {
        fetVar.e0(439770924);
        mm40 mm40VarB0 = b0(fetVar, mm40Var);
        fetVar.r(false);
        return mm40VarB0;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0193  */
    /* JADX WARN: Code duplicated, block: B:103:0x0197  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:123:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:65:0x0114  */
    /* JADX WARN: Code duplicated, block: B:66:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x0121  */
    /* JADX WARN: Code duplicated, block: B:73:0x0133  */
    /* JADX WARN: Code duplicated, block: B:74:0x0135  */
    /* JADX WARN: Code duplicated, block: B:78:0x0143  */
    /* JADX WARN: Code duplicated, block: B:81:0x0153  */
    /* JADX WARN: Code duplicated, block: B:83:0x0157  */
    /* JADX WARN: Code duplicated, block: B:87:0x0162  */
    /* JADX WARN: Code duplicated, block: B:90:0x0172  */
    /* JADX WARN: Code duplicated, block: B:92:0x0176  */
    /* JADX WARN: Code duplicated, block: B:98:0x0184  */
    public static final void d(knf knfVar, sek sekVar, bek bekVar, z5s z5sVar, xex xexVar, CyberBottomSheetParams cyberBottomSheetParams, Function1 function1, fet fetVar, int i) {
        l7m0 l7m0Var;
        cl5 cl5Var;
        boolean z;
        Object objP;
        boolean z2;
        Object objP2;
        boolean z3;
        byte b;
        boolean z4;
        Object objP3;
        boolean z5;
        Object objP4;
        boolean z6;
        Object objP5;
        boolean z7;
        Object objP6;
        boolean z8;
        Object objP7;
        knfVar.getClass();
        sekVar.getClass();
        bekVar.getClass();
        xexVar.getClass();
        function1.getClass();
        fetVar.g0(1552082586);
        int i2 = i | (fetVar.g(knfVar) ? 4 : 2) | (fetVar.g(sekVar) ? 32 : 16) | (fetVar.g(bekVar) ? 256 : 128) | (fetVar.g(z5sVar) ? 2048 : 1024) | (fetVar.g(xexVar) ? 16384 : 8192) | (fetVar.g(cyberBottomSheetParams) ? 131072 : 65536) | (fetVar.i(function1) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            int i3 = 3670016 & i2;
            boolean z9 = i3 == 1048576;
            Object objP8 = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z9 || objP8 == cl5Var2) {
                objP8 = new afd(function1, (byte) 7);
                fetVar.o0(objP8);
            }
            Function0 function0 = (Function0) objP8;
            boolean z10 = i3 == 1048576;
            Object objP9 = fetVar.P();
            if (z10 || objP9 == cl5Var2) {
                objP9 = new afd(function1, (byte) 9);
                fetVar.o0(objP9);
            }
            v3c.z(function0, (Function0) objP9, null, fetVar, 0, 4);
            l7m0 l7m0Var2 = knfVar.f18583a;
            l7m0 l7m0Var3 = knfVar.b;
            l7m0 l7m0Var4 = knfVar.c;
            l7m0 l7m0Var5 = knfVar.d;
            l7m0 l7m0Var6 = knfVar.e;
            l7m0 l7m0Var7 = knfVar.f;
            l7m0 l7m0Var8 = knfVar.g;
            boolean z11 = i3 == 1048576;
            Object objP10 = fetVar.P();
            if (z11) {
                l7m0Var = l7m0Var8;
                cl5Var = cl5Var2;
            } else {
                l7m0Var = l7m0Var8;
                cl5Var = cl5Var2;
                if (objP10 == cl5Var) {
                }
                Function0 function2 = (Function0) objP10;
                if (i3 == 1048576) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar.P();
                if (z || objP == cl5Var) {
                    objP = new afd(function1, (byte) 11);
                    fetVar.o0(objP);
                }
                Function0 function3 = (Function0) objP;
                if (i3 == 1048576) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP2 = fetVar.P();
                z3 = z2;
                b = 12;
                if (z3 || objP2 == cl5Var) {
                    objP2 = new afd(function1, b);
                    fetVar.o0(objP2);
                }
                Function0 function4 = (Function0) objP2;
                if (i3 == 1048576) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP3 = fetVar.P();
                if (z4 || objP3 == cl5Var) {
                    objP3 = new afd(function1, (byte) 13);
                    fetVar.o0(objP3);
                }
                Function0 function5 = (Function0) objP3;
                if (i3 == 1048576) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objP4 = fetVar.P();
                if (z5 || objP4 == cl5Var) {
                    objP4 = new omf(function1, (byte) 1);
                    fetVar.o0(objP4);
                }
                Function1 function6 = (Function1) objP4;
                if (i3 == 1048576) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objP5 = fetVar.P();
                if (z6 || objP5 == cl5Var) {
                    objP5 = new omf(function1, (byte) 2);
                    fetVar.o0(objP5);
                }
                Function1 function7 = (Function1) objP5;
                if (i3 == 1048576) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                objP6 = fetVar.P();
                if (z7 || objP6 == cl5Var) {
                    objP6 = new trb(function1, (byte) 27);
                    fetVar.o0(objP6);
                }
                Function1 function8 = (Function1) objP6;
                z8 = i3 == 1048576;
                objP7 = fetVar.P();
                if (z8 || objP7 == cl5Var) {
                    objP7 = new trb(function1, (byte) 28);
                    fetVar.o0(objP7);
                }
                mrv.x(l7m0Var2, l7m0Var3, l7m0Var4, l7m0Var5, l7m0Var6, l7m0Var7, l7m0Var, sekVar, bekVar, z5sVar, xexVar, cyberBottomSheetParams, null, false, function2, function3, function4, function5, function6, function7, function8, (Function1) objP7, u1c.M(237644263, new gn(function1, (byte) 14), fetVar), fetVar, (i2 << 18) & 2143289344, (i2 >> 12) & 126, 12288);
            }
            objP10 = new afd(function1, (byte) 10);
            fetVar.o0(objP10);
            Function0 function9 = (Function0) objP10;
            if (i3 == 1048576) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar.P();
            if (z) {
                objP = new afd(function1, (byte) 11);
                fetVar.o0(objP);
            } else {
                objP = new afd(function1, (byte) 11);
                fetVar.o0(objP);
            }
            Function0 function10 = (Function0) objP;
            if (i3 == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP2 = fetVar.P();
            z3 = z2;
            b = 12;
            if (z3) {
                objP2 = new afd(function1, b);
                fetVar.o0(objP2);
            } else {
                objP2 = new afd(function1, b);
                fetVar.o0(objP2);
            }
            Function0 function11 = (Function0) objP2;
            if (i3 == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            objP3 = fetVar.P();
            if (z4) {
                objP3 = new afd(function1, (byte) 13);
                fetVar.o0(objP3);
            } else {
                objP3 = new afd(function1, (byte) 13);
                fetVar.o0(objP3);
            }
            Function0 function12 = (Function0) objP3;
            if (i3 == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            objP4 = fetVar.P();
            if (z5) {
                objP4 = new omf(function1, (byte) 1);
                fetVar.o0(objP4);
            } else {
                objP4 = new omf(function1, (byte) 1);
                fetVar.o0(objP4);
            }
            Function1 function13 = (Function1) objP4;
            if (i3 == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            objP5 = fetVar.P();
            if (z6) {
                objP5 = new omf(function1, (byte) 2);
                fetVar.o0(objP5);
            } else {
                objP5 = new omf(function1, (byte) 2);
                fetVar.o0(objP5);
            }
            Function1 function14 = (Function1) objP5;
            if (i3 == 1048576) {
                z7 = true;
            } else {
                z7 = false;
            }
            objP6 = fetVar.P();
            if (z7) {
                objP6 = new trb(function1, (byte) 27);
                fetVar.o0(objP6);
            } else {
                objP6 = new trb(function1, (byte) 27);
                fetVar.o0(objP6);
            }
            Function1 function15 = (Function1) objP6;
            if (i3 == 1048576) {
            }
            objP7 = fetVar.P();
            if (z8) {
                objP7 = new trb(function1, (byte) 28);
                fetVar.o0(objP7);
            } else {
                objP7 = new trb(function1, (byte) 28);
                fetVar.o0(objP7);
            }
            mrv.x(l7m0Var2, l7m0Var3, l7m0Var4, l7m0Var5, l7m0Var6, l7m0Var7, l7m0Var, sekVar, bekVar, z5sVar, xexVar, cyberBottomSheetParams, null, false, function9, function10, function11, function12, function13, function14, function15, (Function1) objP7, u1c.M(237644263, new gn(function1, (byte) 14), fetVar), fetVar, (i2 << 18) & 2143289344, (i2 >> 12) & 126, 12288);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn0((Object) knfVar, (Object) sekVar, (Object) bekVar, (Object) z5sVar, (Object) xexVar, (Object) cyberBottomSheetParams, (wdr) function1, i, (byte) 3);
        }
    }

    public static final int d0(int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        return i % i2;
    }

    public static final void e(int i, long j, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(2143754375);
        int i2 = i | 6 | (fetVar.f(j) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 12.0f);
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, i120.Q(mm40VarN, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ly2(mm40Var2, j, i, (byte) 2);
        }
    }

    public static final u6n e0(v3n v3nVar, String str, fet fetVar, int i) {
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && fetVar.g(v3nVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !fetVar.g(str)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objP = fetVar.P();
        if (z3 || objP == ukd.f35823a) {
            objP = new u6n(v3nVar.b().e(), w6n.j, new c280(str, R.drawable.ic_glyph_placeholder_player));
            fetVar.o0(objP);
        }
        return (u6n) objP;
    }

    public static final void f(mm40 mm40Var, h3i h3iVar, Function1 function1, fet fetVar) {
        function1.getClass();
        if (h3iVar instanceof c3i) {
            fetVar.e0(674948298);
            c3i c3iVar = (c3i) h3iVar;
            ibc.h(mm40Var, c3iVar.f3675a, c3iVar.b, c3iVar.c, c3iVar.d, function1, fetVar, 196608);
            fetVar.r(false);
            return;
        }
        if (h3iVar instanceof d3i) {
            fetVar.e0(675326374);
            d3i d3iVar = (d3i) h3iVar;
            mbc.i(mm40Var, d3iVar.f5404a, d3iVar.b, d3iVar.c, function1, fetVar, 24576);
            fetVar.r(false);
            return;
        }
        if (h3iVar instanceof e3i) {
            fetVar.e0(-1779320144);
            e3i e3iVar = (e3i) h3iVar;
            String str = e3iVar.f7136a;
            obc.j(1572864, e3iVar.c, e3iVar.d, e3iVar.e, e3iVar.b, fetVar, mm40Var, str, function1);
            fetVar.r(false);
            return;
        }
        if (h3iVar instanceof f3i) {
            fetVar.e0(676085626);
            f3i f3iVar = (f3i) h3iVar;
            String str2 = f3iVar.e;
            qbc.f(1572864, f3iVar.b, f3iVar.c, f3iVar.d, f3iVar.f8865a, fetVar, mm40Var, str2, function1);
            fetVar.r(false);
            return;
        }
        if (!(h3iVar instanceof g3i)) {
            throw b1j.f(-1779343540, fetVar, false);
        }
        fetVar.e0(676511535);
        g3i g3iVar = (g3i) h3iVar;
        vbc.p(mm40Var, g3iVar.b, g3iVar.c, g3iVar.d, g3iVar.f10613a, function1, fetVar, 196608);
        fetVar.r(false);
    }

    public static final int f0(int i, p0s p0sVar) {
        if (i == 0 || i < 9 || p0sVar.equals(o0s.f24443a)) {
            return i;
        }
        if (p0sVar.equals(m0s.f20970a)) {
            return Integer.MAX_VALUE;
        }
        if (!(p0sVar instanceof n0s)) {
            t9f.b();
            return 0;
        }
        if (i < ((n0s) p0sVar).f22715a) {
            return i;
        }
        return Integer.MAX_VALUE;
    }

    public static final nyg g0(xah xahVar) {
        String str = xahVar.f40554a;
        String str2 = xahVar.b;
        int i = xahVar.c;
        String str3 = xahVar.f;
        long j = xahVar.g;
        int i2 = xahVar.h;
        long j2 = xahVar.i;
        String str4 = xahVar.j;
        return new nyg(i, 0, i2, 2, j, j2, xahVar.k, str, str2, str3, str4, xahVar.l, true, xahVar.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public static final i9t h0(l9t l9tVar) {
        ?? arrayList;
        l9tVar.getClass();
        List list = l9tVar.f19672a;
        if (list == null) {
            list = iun.f15405a;
        }
        List<h7t> list2 = l9tVar.b;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            for (h7t h7tVar : list2) {
                h7tVar.getClass();
                Long l = h7tVar.b;
                long jLongValue = l != null ? l.longValue() : 0L;
                Integer num = h7tVar.f12591a;
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = h7tVar.d;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                Integer num3 = h7tVar.c;
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                Double d = h7tVar.e;
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = d != null ? d.doubleValue() : 0.0d;
                Double d2 = h7tVar.f;
                if (d2 != null) {
                    dDoubleValue = d2.doubleValue();
                }
                arrayList.add(new r9b(jLongValue, iIntValue, iIntValue2, iIntValue3, dDoubleValue2, dDoubleValue));
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new i9t(list, arrayList);
    }

    public static final zrk i0(List list) {
        ArrayList arrayListU = twn.u(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((xah) obj).n) {
                arrayListU.add(obj);
            } else {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(g0((xah) it.next()));
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayListU, 10));
        Iterator it2 = arrayListU.iterator();
        while (it2.hasNext()) {
            arrayList3.add(g0((xah) it2.next()));
        }
        return new zrk(arrayList3, arrayList2);
    }

    public static final void j(mm40 mm40Var, fw1 fw1Var, fet fetVar, int i) {
        int i2;
        fw1 fw1Var2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-747765851);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(fw1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(null) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((k6z) fetVar2.k(bmd.n)) == k6z.b;
            if (fw1Var instanceof dw1) {
                fetVar2.e0(1303438969);
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                ((hi0) fetVar2.k(ii0.f14805a)).getClass();
                long j = hi0.r;
                zcl zclVar = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarQ = i120.Q(mm40VarD, j, new ugg0(zclVar, zclVar, zclVar, zclVar));
                Object objP = fetVar2.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = dw9.j(fetVar2);
                }
                gy40 gy40Var = (gy40) objP;
                boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
                Object objP2 = fetVar2.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new knl(fw1Var, (byte) 9);
                    fetVar2.o0(objP2);
                }
                mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = c0(fetVar2, mm40VarW);
                mkd.c0.getClass();
                fetVar2.i0();
                boolean z3 = fetVar2.S;
                pcy pcyVar = e7z.u1;
                if (z3) {
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
                dw1 dw1Var = (dw1) fw1Var;
                n0x n0xVar = dw1Var.j;
                fetVar2.e0(1379319221);
                jm40 jm40Var = jm40.b;
                mm40 mm40VarB = jr8.f16991a.b(o7k0.n(jm40Var, 152.0f), gqw0.f);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarE = h97.e(zclVar2, zclVar, zclVar, zclVar2, mm40VarB);
                boolean zH = fetVar2.h(z);
                Object objP3 = fetVar2.P();
                if (zH || objP3 == cl5Var) {
                    objP3 = new z((byte) 14, z);
                    fetVar2.o0(objP3);
                }
                k7x.a(n0xVar.a(), null, i4w0.T(mm40VarE, (Function1) objP3), gqw0.A, null, fetVar2, 1572912, 1976);
                fetVar2.r(false);
                mm40 mm40VarM = s5x0.M(o7k0.c(jm40Var, 1.0f), 16.0f, 8.0f, 164.0f, 8.0f);
                tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = c0(fetVar2, mm40VarM);
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
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = c0(fetVar2, jm40Var);
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
                String str = dw1Var.b;
                zfn zfnVar = m8m0.f21378a;
                long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU();
                y9q0 y9q0VarG = g1t0.g();
                long j2 = qmk.p;
                long j3 = qmk.q;
                long j4 = qmk.n;
                v8q0.a(str, jm40Var, jM123getWhite0d7_KjU, new n05(j2, j3, j4), 0L, null, null, null, 0L, null, 0L, 2, true, 2, 0, null, y9q0VarG, fetVar, 48, 28032, 102384);
                v8q0.a(dw1Var.c, s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), new n05(j2, qmk.y, j4), 0L, null, null, null, 0L, null, 0L, 2, true, 1, 0, null, y9q0.a(g1t0.s(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 28032, 102384);
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                v8q0.a(dw1Var.f6773a == bw1.b ? dw1Var.i : w6x.q(dw1Var.e, " - ", dw1Var.g), mm40VarN, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), new n05(j2, j3, j4), 0L, null, null, null, 0L, new f2q0(5), 0L, 2, true, 3, 0, null, g1t0.a(), fetVar, 0, 28032, 101360);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(true);
                fetVar2.r(true);
                fetVar2.r(false);
                mm40Var2 = mm40Var;
                fw1Var2 = fw1Var;
            } else {
                fw1Var2 = fw1Var;
                if (!fw1Var2.equals(ew1.f8498a)) {
                    throw b1j.f(-1343428953, fetVar2, false);
                }
                fetVar2.e0(1307935178);
                mm40Var2 = mm40Var;
                mm40 mm40VarD2 = o7k0.d(mm40Var2, 1.0f);
                zcl zclVar3 = qmk.i;
                ugg0 ugg0Var2 = vgg0.f37379a;
                dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarD2), vbc.d0(null, fetVar2, 0, 1), fetVar2, 0, false);
            }
        } else {
            fw1Var2 = fw1Var;
            mm40Var2 = mm40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jql(mm40Var2, fw1Var2, i, (byte) 3);
        }
    }

    public static final trm j0(nyg nygVar, ctf0 ctf0Var) {
        long j = nygVar.g;
        String strM0 = nygVar.f;
        if (nygVar.i == 243) {
            strM0 = StringsKt.m0(strM0, ". ", strM0);
        }
        return new trm(j, strM0, nygVar.m ? ctf0Var.b.a(R.string.cyber_live, Arrays.copyOf(new Object[0], 0)) : "", nygVar.j, ctf0Var.j() ? new n0x(nygVar.b) : new n0x(nygVar.f24328a), ctf0Var.j() ? new m0x(R.drawable.cybergames_tablet_champ_placeholder, null, 6) : new m0x(R.drawable.cybergames_champ_placeholder, null, 6));
    }

    public static final void k(mm40 mm40Var, t6n t6nVar, fet fetVar, int i) {
        mm40 mm40Var2;
        t6nVar.getClass();
        fetVar.g0(-1648087885);
        int i2 = i | 6 | (fetVar.g(t6nVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            d4d d4dVar = t6nVar.f33426a;
            w6n w6nVar = t6nVar.b;
            long jY = ibc.Y(d4dVar, fetVar);
            boolean zE = fetVar.e(d4dVar.ordinal()) | fetVar.e(w6nVar.ordinal());
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zE || objP == obj) {
                objP = new r6n(vtb.i0(w6nVar), jY);
                fetVar.o0(objP);
            }
            r6n r6nVar = (r6n) objP;
            boolean zG = fetVar.g(r6nVar);
            Object objP2 = fetVar.P();
            jm40 jm40Var = jm40.b;
            if (zG || objP2 == obj) {
                objP2 = lgb.J(o7k0.n(jm40Var, r6nVar.f29942a), vgg0.f37379a);
                fetVar.o0(objP2);
            }
            c280 c280Var = t6nVar.c;
            fetVar.e0(1880577526);
            oil oilVarT = ju70.T(a8k0.F(c280Var.b, 0, fetVar), new m78(r6nVar.b, 5), null, 10);
            k1x k1xVar = new k1x((Context) fetVar.k(dy2.b));
            k1xVar.c = c280Var.f3613a;
            k7x.b(k1xVar.a(), null, (mm40) objP2, oilVarT, oilVarT, oilVarT, null, null, null, null, gqw0.A, null, fetVar, 299056, 6, 31680);
            fetVar.r(false);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(mm40Var2, t6nVar, i, (byte) 23);
        }
    }

    public static String k0(long j) {
        if (T(j, 12884901888L)) {
            return "Rgb";
        }
        if (T(j, 12884901889L)) {
            return "Xyz";
        }
        if (T(j, 12884901890L)) {
            return "Lab";
        }
        return T(j, 17179869187L) ? "Cmyk" : "Unknown";
    }

    public static final void l(mm40 mm40Var, wam wamVar, long j, fet fetVar, int i) {
        long j2;
        long j3;
        fet fetVar2 = fetVar;
        a4x a4xVar = wamVar.b;
        fetVar2.g0(-884459460);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(wamVar) ? 32 : 16) | 128;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar2.Z();
            if ((i & 1) == 0 || fetVar2.B()) {
                ((ijg) fetVar2.k(jjg.f16616a)).getClass();
                j3 = ijg.M0;
            } else {
                fetVar2.X();
                j3 = j;
            }
            fetVar2.s();
            boolean zG = fetVar2.g(a4xVar);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                objP = dyb.o0(CollectionsKt.D0(a4xVar, 10));
                fetVar2.o0(objP);
            }
            a4x a4xVar2 = (a4x) objP;
            long jM75getBlack600d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m75getBlack600d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40Var, jM75getBlack600d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = c0(fetVar2, mm40VarJ);
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
            C(a4xVar2, j3, fetVar2, 0);
            F(new x7z(1.0f, true), a4xVar2, j3, fetVar2, 0);
            fetVar2.e0(-580362684);
            int i3 = 0;
            for (Object obj : CollectionsKt.D0(wamVar.f38835a, 2)) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                fet fetVar3 = fetVar2;
                long j4 = j3;
                a4x a4xVar3 = a4xVar2;
                z(i3, (uam) obj, a4xVar3, j4, fetVar3, 0);
                a4xVar2 = a4xVar3;
                j3 = j4;
                i3 = i4;
                fetVar2 = fetVar3;
            }
            fetVar2.r(false);
            fetVar2.r(true);
            j2 = j3;
        } else {
            fetVar2.X();
            j2 = j;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new my2((byte) 4, i, j2, mm40Var, (Object) wamVar);
        }
    }

    public static final void m(final mm40 mm40Var, final fqm fqmVar, final lxh0 lxh0Var, final Function2 function2, fet fetVar, final int i) {
        mm40 mm40Var2;
        fqm fqmVar2;
        yfe0 yfe0VarU;
        Function2 function3;
        int i2;
        rwh0 rwh0Var;
        ArrayList arrayList = fqmVar.c;
        function2.getClass();
        fetVar.g0(-1601370199);
        int i3 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? fetVar.g(fqmVar) : fetVar.i(fqmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? fetVar.g(lxh0Var) : fetVar.i(lxh0Var) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            i4 |= fetVar.i(function2) ? 16384 : 8192;
        }
        int i5 = i4;
        if (fetVar.U(i5 & 1, (i5 & 9363) != 9362)) {
            if (arrayList.size() < 2) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                function3 = new Function2() { // from class: a.oqm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b2 = b;
                        int i6 = i;
                        switch (b2) {
                            case 0:
                                ((Integer) obj2).getClass();
                                kbc.m(mm40Var, fqmVar, lxh0Var, function2, (fet) obj, x8x.L(i6 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                kbc.m(mm40Var, fqmVar, lxh0Var, function2, (fet) obj, x8x.L(i6 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                mm40Var2 = mm40Var;
                fqmVar2 = fqmVar;
                Function2 function4 = function2;
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                    fetVar.o0(objP);
                }
                pz40 pz40Var = (pz40) objP;
                mm40 mm40VarW = o7k0.w(o7k0.d(mm40Var2, 1.0f), null, false, 3);
                zcl zclVar = qmk.f28987a;
                thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = c0(fetVar, mm40VarW);
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
                fetVar.e0(890319738);
                int i6 = 0;
                for (Object obj : arrayList) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        q3d.p();
                        throw null;
                    }
                    int iIntValue = ((Number) obj).intValue();
                    Object objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = androidx.compose.runtime.e.e(null);
                        fetVar.o0(objP2);
                    }
                    pz40 pz40Var2 = (pz40) objP2;
                    zie0 zie0Var = rwh0.f31217a;
                    rwh0 rwh0Var2 = (rwh0) pz40Var2.getValue();
                    boolean z = fqmVar2.f9982a;
                    boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
                    int i8 = fqmVar2.b;
                    zie0Var.getClass();
                    boolean z2 = i8 == i6;
                    if (zBooleanValue) {
                        rwh0Var = rwh0.f;
                        i2 = iIntValue;
                    } else {
                        i2 = iIntValue;
                        rwh0 rwh0Var3 = rwh0.e;
                        if (rwh0Var2 == rwh0Var3 && z && z2) {
                            rwh0Var = rwh0.d;
                        } else if (z && z2) {
                            rwh0Var = rwh0.c;
                        } else if (i8 < i6) {
                            rwh0Var = rwh0.d;
                        } else {
                            rwh0Var = i8 > i6 ? rwh0Var3 : rwh0.b;
                        }
                    }
                    boolean zE = fetVar.e(rwh0Var.ordinal());
                    Object objP3 = fetVar.P();
                    if (zE || objP3 == cl5Var) {
                        objP3 = new gnm(rwh0Var, pz40Var2, (byte) 2);
                        fetVar.o0(objP3);
                    }
                    m0x0.D((Function0) objP3, fetVar);
                    x7z x7zVar = new x7z(1.0f, true);
                    boolean zE2 = ((i5 & 57344) == 16384) | fetVar.e(i6) | ((i5 & 112) == 32 || ((i5 & 64) != 0 && fetVar.i(fqmVar2)));
                    Object objP4 = fetVar.P();
                    if (zE2 || objP4 == cl5Var) {
                        objP4 = new vk8(i6, fqmVar2, function4, pz40Var);
                        fetVar.o0(objP4);
                    }
                    Function0 function0 = (Function0) objP4;
                    Object objP5 = fetVar.P();
                    if (objP5 == cl5Var) {
                        objP5 = new cml(pz40Var, (byte) 23);
                        fetVar.o0(objP5);
                    }
                    int i9 = i5 << 3;
                    G(x7zVar, rwh0Var, i2, lxh0Var, function0, (Function0) objP5, fetVar, (i9 & 57344) | (i9 & 7168) | 1572864);
                    function4 = function2;
                    pz40Var = pz40Var;
                    i6 = i7;
                    cl5Var = cl5Var;
                }
                fetVar.r(false);
                fetVar.r(true);
            }
            yfe0VarU.d = function3;
        }
        mm40Var2 = mm40Var;
        fqmVar2 = fqmVar;
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            final mm40 mm40Var3 = mm40Var2;
            final fqm fqmVar3 = fqmVar2;
            function3 = new Function2() { // from class: a.oqm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    byte b3 = b2;
                    int i10 = i;
                    switch (b3) {
                        case 0:
                            ((Integer) obj3).getClass();
                            kbc.m(mm40Var3, fqmVar3, lxh0Var, function2, (fet) obj2, x8x.L(i10 | 1));
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            kbc.m(mm40Var3, fqmVar3, lxh0Var, function2, (fet) obj2, x8x.L(i10 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function3;
        }
    }

    public static final void n(mm40 mm40Var, bxm bxmVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1875832425);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(bxmVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40Var, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = c0(fetVar, mm40VarN);
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
            fetVar.e0(-1388275138);
            jm40 jm40Var = jm40.b;
            jeb.r(o7k0.e(s5x0.L(jm40Var, 4.0f, 0.0f, 2), 50.0f), bhm.b, fetVar, 48);
            fetVar.r(false);
            x7z x7zVar = new x7z(1.0f, true);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = c0(fetVar, x7zVar);
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
            y(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), 14.0f), bxmVar.f3380a, fetVar, 0);
            D(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), 14.0f), bxmVar.b, fetVar, 0);
            D(o7k0.e(jm40Var, 14.0f), bxmVar.c, fetVar, 0);
            fetVar.r(true);
            s(null, bxmVar.d, bxmVar.e, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 11, i, mm40Var, bxmVar);
        }
    }

    public static final void o(mm40 mm40Var, h2n h2nVar, fet fetVar, int i) {
        if (h2nVar instanceof c2n) {
            fetVar.e0(-1461355039);
            c2n c2nVar = (c2n) h2nVar;
            ibc.q(mm40Var, c2nVar.f3633a, c2nVar.b, c2nVar.c, c2nVar.d, c2nVar.e, c2nVar.f, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (h2nVar instanceof d2n) {
            fetVar.e0(-1460894379);
            d2n d2nVar = (d2n) h2nVar;
            mbc.q(mm40Var, d2nVar.f5364a, d2nVar.b, d2nVar.c, d2nVar.d, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (h2nVar instanceof e2n) {
            fetVar.e0(-1460453869);
            e2n e2nVar = (e2n) h2nVar;
            obc.s(mm40Var, e2nVar.f7095a, e2nVar.b, e2nVar.c, e2nVar.d, e2nVar.e, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (h2nVar instanceof f2n) {
            fetVar.e0(-1460042189);
            f2n f2nVar = (f2n) h2nVar;
            qbc.n(mm40Var, f2nVar.f8819a, f2nVar.b, f2nVar.c, f2nVar.d, f2nVar.e, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (!(h2nVar instanceof g2n)) {
            throw b1j.f(-1986803802, fetVar, false);
        }
        fetVar.e0(-1459627843);
        g2n g2nVar = (g2n) h2nVar;
        vbc.z(mm40Var, g2nVar.f10567a, g2nVar.b, g2nVar.c, g2nVar.d, g2nVar.e, g2nVar.f, g2nVar.g, fetVar, i & 14);
        fetVar.r(false);
    }

    public static final void p(kq20 kq20Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1978522362);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(kq20Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 10;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = twn.s(fetVar);
            }
            List list = (List) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = r5o.f29897a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            int i3 = i2 & 14;
            boolean zI = (i3 == 4) | fetVar.i(list) | fetVar.i(context);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new f8m(kq20Var, list, context, b);
                fetVar.o0(objP3);
            }
            Function1 function1 = (Function1) objP3;
            boolean zI2 = fetVar.i(list) | (i3 == 4) | fetVar.i(context);
            Object objP4 = fetVar.P();
            byte b2 = 3;
            if (zI2 || objP4 == cl5Var) {
                objP4 = new ann(kq20Var, list, context, b2);
                fetVar.o0(objP4);
            }
            idm0.j(null, kq20Var, xdrVar, null, function1, (Function2) objP4, fetVar, ((i2 << 3) & 112) | 384, 9);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(kq20Var, i, b);
        }
    }

    public static final void q(mm40 mm40Var, String str, String str2, nfo nfoVar, boolean z, v3n v3nVar, Function0 function0, fet fetVar, int i) {
        String str3;
        String str4;
        boolean z2;
        v3n v3nVar2;
        Function0 function1;
        nfo nfoVar2;
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(897053315);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= fetVar.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= fetVar.g(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(nfoVar.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            v3nVar2 = v3nVar;
            i2 |= fetVar.g(v3nVar2) ? 131072 : 65536;
        } else {
            v3nVar2 = v3nVar;
        }
        if ((1572864 & i) == 0) {
            function1 = function0;
            i2 |= fetVar.i(function1) ? 1048576 : 524288;
        } else {
            function1 = function0;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 32.0f);
            nfoVar2 = nfoVar;
            if (nfoVar2 == nfo.f23446a) {
                fetVar.e0(829177684);
                int i3 = i2 & 1008;
                int i4 = i2 >> 3;
                B(mm40VarE, str3, str4, z2, v3nVar2, function1, fetVar, (i4 & 458752) | i3 | (i4 & 7168) | (57344 & i4));
                fetVar.r(false);
            } else {
                fetVar.e0(829448500);
                int i5 = i2 & 1008;
                int i6 = i2 >> 3;
                A(mm40VarE, str, str2, z, v3nVar, function0, fetVar, i5 | (i6 & 7168) | (i6 & 57344) | (i6 & 458752));
                fetVar.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            nfoVar2 = nfoVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(mm40Var2, str, str2, nfoVar2, z, v3nVar, function0, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(mm40 mm40Var, String str, wm7 wm7Var, a4x a4xVar, yto ytoVar, yto ytoVar2, Function1 function1, fet fetVar, int i) {
        final yto ytoVar3;
        final Function1 function2;
        fet fetVar2;
        float f;
        Object obj;
        int i2;
        final byte b;
        final yto ytoVar4 = ytoVar;
        fet fetVar3 = fetVar;
        a4xVar.getClass();
        function1.getClass();
        fetVar3.g0(385017270);
        int i3 = i | (fetVar3.g(mm40Var) ? 4 : 2) | (fetVar3.g(str) ? 32 : 16) | (fetVar3.g(wm7Var) ? 256 : 128) | (fetVar3.g(a4xVar) ? 2048 : 1024) | (fetVar3.g(ytoVar4) ? 16384 : 8192) | (fetVar3.g(ytoVar2) ? 131072 : 65536) | (fetVar3.i(function1) ? 1048576 : 524288);
        if (fetVar3.U(i3 & 1, (599187 & i3) != 599186)) {
            int i4 = 57344 & i3;
            int i5 = i3 & 458752;
            boolean z = (i4 == 16384) | (i5 == 131072);
            Object objP = fetVar3.P();
            Object obj2 = ukd.f35823a;
            if (z || objP == obj2) {
                if (ytoVar4 == null || ytoVar2 == null) {
                    zcl zclVar = qmk.f28987a;
                    f = 32.0f;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    f = 72.0f;
                }
                objP = twn.j(f, fetVar3);
            }
            float f2 = ((ycl) objP).f42389a;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            nw3 nw3Var = uc9.g;
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(nw3Var, yx7Var, fetVar3, 54);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = c0(fetVar3, mm40VarD);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z2 = fetVar3.S;
            Function0 function0 = e7z.u1;
            if (z2) {
                fetVar3.l(function0);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            zcl zclVar3 = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), true);
            byte b2 = 14;
            qw3 qw3Var = new qw3(2.0f, true, new jf4(b2));
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(qw3Var, xx7Var, fetVar3, 0);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = c0(fetVar3, mm40VarH);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(function0);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, shdVar);
            jpm0.o(fetVar3, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar4);
            v8q0.a(str, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar3), fetVar, (i3 >> 3) & 14, 24960, 110590);
            final byte b3 = 1;
            byte b4 = 12;
            jwb.p(null, new qw3(4.0f, true, new gne(xx7Var, b4)), new qw3(2.0f, true, new jf4(b2)), yx7Var, 0, 0, u1c.M(2121107253, new rgh(wm7Var, a4xVar, b4), fetVar), fetVar, 1575936, 49);
            fet fetVar4 = fetVar;
            fetVar4.r(true);
            mm40 mm40VarS = o7k0.s(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), f2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode3 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM3 = fetVar4.m();
            mm40 mm40VarC2 = c0(fetVar4, mm40VarS);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(function0);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, tj30VarC, shdVar);
            jpm0.o(fetVar4, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC2, shdVar4);
            jr8 jr8Var = jr8.f16991a;
            if (ytoVar != null) {
                fetVar4.e0(1310709834);
                mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.d);
                ytoVar4 = ytoVar;
                wul wulVar = ytoVar4.b;
                i2 = 1048576;
                boolean z3 = ((i3 & 3670016) == 1048576) | (i4 == 16384);
                Object objP2 = fetVar4.P();
                if (z3) {
                    obj = obj2;
                } else {
                    obj = obj2;
                    if (objP2 != obj) {
                        function2 = function1;
                        b = 0;
                    }
                    qzb.n(mm40VarB, wulVar, (Function0) objP2, fetVar4, 0, 0);
                    fetVar4.r(b);
                }
                function2 = function1;
                b = 0;
                objP2 = new Function0() { // from class: a.euo
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (b) {
                            case 0:
                                function2.invoke(ytoVar4.f43229a);
                                break;
                            default:
                                function2.invoke(ytoVar4.f43229a);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar4.o0(objP2);
                qzb.n(mm40VarB, wulVar, (Function0) objP2, fetVar4, 0, 0);
                fetVar4.r(b);
            } else {
                ytoVar4 = ytoVar;
                function2 = function1;
                obj = obj2;
                i2 = 1048576;
                fetVar4.e0(1977524066);
                fetVar4.r(false);
            }
            if (ytoVar2 != null) {
                fetVar4.e0(1310718794);
                mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.f);
                ytoVar3 = ytoVar2;
                wul wulVar2 = ytoVar3.b;
                boolean z4 = (i5 == 131072) | ((i3 & 3670016) == i2);
                Object objP3 = fetVar4.P();
                if (z4 || objP3 == obj) {
                    objP3 = new Function0() { // from class: a.euo
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (b3) {
                                case 0:
                                    function2.invoke(ytoVar3.f43229a);
                                    break;
                                default:
                                    function2.invoke(ytoVar3.f43229a);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar4.o0(objP3);
                }
                qzb.n(mm40VarB2, wulVar2, (Function0) objP3, fetVar4, 0, 0);
                fetVar4.r(false);
            } else {
                ytoVar3 = ytoVar2;
                fetVar4.e0(1977801826);
                fetVar4.r(false);
            }
            fetVar4.r(true);
            fetVar4.r(true);
            fetVar2 = fetVar4;
        } else {
            ytoVar3 = ytoVar2;
            function2 = function1;
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn0((Object) mm40Var, (Object) str, (Object) wm7Var, (Object) a4xVar, (Object) ytoVar4, (Object) ytoVar3, (wdr) function2, i, (byte) 7);
        }
    }

    public static final void s(mm40 mm40Var, a4x a4xVar, azp azpVar, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        pcy pcyVar;
        char c;
        boolean z;
        azp azpVar2 = azpVar;
        fet fetVar3 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        xx7 xx7Var = gqw0.n;
        lw3 lw3Var = uc9.f35418a;
        mw3 mw3Var = uc9.c;
        fetVar3.g0(2134030474);
        int i2 = i | 6 | (fetVar3.g(a4xVar) ? 32 : 16) | (fetVar3.g(azpVar2) ? 256 : 128);
        if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(mw3Var, gqw0.m, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = c0(fetVar3, jm40Var);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z2 = true;
            boolean z3 = fetVar3.S;
            mw3 mw3Var2 = mw3Var;
            pcy pcyVar2 = e7z.u1;
            if (z3) {
                fetVar3.l(pcyVar2);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, shdVar4);
            jpm0.o(fetVar3, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
            jpm0.o(fetVar3, mm40VarC0, shdVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 1.0f, 0.0f, 5.0f, 5);
            thg0 thg0VarA = shg0.a(lw3Var, gqw0.k, fetVar3, 48);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = c0(fetVar3, mm40VarN);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar2);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, shdVar4);
            jpm0.o(fetVar3, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
            Iterator itO = h97.o(fetVar3, mm40VarC1, shdVar, -1450047286, a4xVar);
            int i3 = 0;
            while (true) {
                lw3 lw3Var2 = lw3Var;
                if (!itO.hasNext()) {
                    shd shdVar5 = shdVar2;
                    shd shdVar6 = shdVar3;
                    shd shdVar7 = shdVar4;
                    xx7 xx7Var2 = xx7Var;
                    pcy pcyVar3 = pcyVar2;
                    jm40 jm40Var2 = jm40Var;
                    mw3 mw3Var3 = mw3Var2;
                    fet fetVar4 = fetVar3;
                    boolean z4 = false;
                    fetVar4.r(false);
                    String str = azpVar2.f1729a;
                    zfn zfnVar = zaq0.b;
                    v8q0.a(str, o7k0.e(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 12.0f), ((ThemeColors) fetVar4.k(zfnVar)).getSecondary80(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
                    fetVar2 = fetVar;
                    fetVar2.r(true);
                    yx7 yx7Var = gqw0.j;
                    thg0 thg0VarA2 = shg0.a(lw3Var2, yx7Var, fetVar2, 0);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = c0(fetVar2, jm40Var2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        pcyVar = pcyVar3;
                        fetVar2.l(pcyVar);
                    } else {
                        pcyVar = pcyVar3;
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA2, shdVar7);
                    jpm0.o(fetVar2, bh90VarM3, shdVar6);
                    vqd.u(iHashCode3, fetVar2, shdVar5, fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, shdVar);
                    long separator60 = ((ThemeColors) fetVar2.k(zfnVar)).getSeparator60();
                    zcl zclVar2 = qmk.c;
                    ugg0 ugg0Var = vgg0.f37379a;
                    mm40 mm40VarS = i120.S(jm40Var2, 1.0f, separator60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
                    thg0 thg0VarA3 = shg0.a(lw3Var2, yx7Var, fetVar2, 0);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = c0(fetVar2, mm40VarS);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA3, shdVar7);
                    jpm0.o(fetVar2, bh90VarM4, shdVar6);
                    vqd.u(iHashCode4, fetVar2, shdVar5, fetVar2);
                    Iterator itO2 = h97.o(fetVar2, mm40VarC3, shdVar, -1743334920, a4xVar);
                    int i4 = 0;
                    while (itO2.hasNext()) {
                        Object next = itO2.next();
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            q3d.p();
                            throw null;
                        }
                        bzp bzpVar = (bzp) next;
                        zcl zclVar3 = qmk.f28987a;
                        mm40 mm40VarS2 = o7k0.s(jm40Var2, 16.0f);
                        Iterator it = itO2;
                        xx7 xx7Var3 = xx7Var2;
                        mw3 mw3Var4 = mw3Var3;
                        x5d x5dVarA2 = w5d.a(mw3Var4, xx7Var3, fetVar2, 48);
                        int iHashCode5 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM5 = fetVar2.m();
                        mm40 mm40VarC4 = c0(fetVar2, mm40VarS2);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, x5dVarA2, shdVar7);
                        jpm0.o(fetVar2, bh90VarM5, shdVar6);
                        vqd.u(iHashCode5, fetVar2, shdVar5, fetVar2);
                        jpm0.o(fetVar2, mm40VarC4, shdVar);
                        tip0 tip0Var = bzpVar.b;
                        tip0 tip0Var2 = bzpVar.c;
                        H(null, ibc.y0(tip0Var, tip0Var2, fetVar2), fetVar2, 0);
                        mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var2, 1.0f), 1.0f);
                        zfn zfnVar2 = zaq0.b;
                        int i6 = i4;
                        long separator61 = ((ThemeColors) fetVar2.k(zfnVar2)).getSeparator60();
                        ljc ljcVar = jd8.n;
                        qxw.o(fetVar2, i120.Q(mm40VarD, separator61, ljcVar));
                        H(null, ibc.y0(tip0Var2, bzpVar.b, fetVar2), fetVar2, 0);
                        fetVar2.r(true);
                        if (i6 < a4xVar.size() - 1) {
                            fetVar2.e0(-1851908523);
                            c = 0;
                            qxw.o(fetVar2, i120.Q(o7k0.e(o7k0.s(jm40Var2, 1.0f), 32.0f), ((ThemeColors) fetVar2.k(zfnVar2)).getSeparator60(), ljcVar));
                            z = false;
                            fetVar2.r(false);
                        } else {
                            c = 0;
                            z = false;
                            fetVar2.e0(-1851589471);
                            fetVar2.r(false);
                        }
                        itO2 = it;
                        mw3Var3 = mw3Var4;
                        z4 = z;
                        xx7Var2 = xx7Var3;
                        i4 = i5;
                    }
                    fetVar2.r(z4);
                    fetVar2.r(true);
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarS3 = o7k0.s(s5x0.N(jm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14), 18.0f);
                    x5d x5dVarA3 = w5d.a(mw3Var3, xx7Var2, fetVar2, 48);
                    int iHashCode6 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM6 = fetVar2.m();
                    mm40 mm40VarC5 = c0(fetVar2, mm40VarS3);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA3, shdVar7);
                    jpm0.o(fetVar2, bh90VarM6, shdVar6);
                    vqd.u(iHashCode6, fetVar2, shdVar5, fetVar2);
                    jpm0.o(fetVar2, mm40VarC5, shdVar);
                    azpVar2 = azpVar;
                    I(null, azpVar2.b, fetVar2, 0);
                    I(null, azpVar2.c, fetVar2, 0);
                    ohs0.x(fetVar2, true, true, true);
                    mm40Var2 = jm40Var2;
                    break;
                }
                Object next2 = itO.next();
                int i7 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                fet fetVar5 = fetVar3;
                v8q0.a(((bzp) next2).f3481a, o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 0.0f, i3 < a4xVar.size() + (-1) ? 1.0f : 0.0f, 0.0f, 11), 16.0f), 12.0f), ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary80(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar5, 0, 24960, 109560);
                fetVar3 = fetVar5;
                i3 = i7;
                jm40Var = jm40Var;
                shdVar2 = shdVar2;
                shdVar3 = shdVar3;
                shdVar4 = shdVar4;
                xx7Var = xx7Var;
                lw3Var = lw3Var2;
                mw3Var2 = mw3Var2;
                pcyVar2 = pcyVar2;
                z2 = true;
            }
        } else {
            fetVar2 = fetVar3;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zwm(mm40Var2, a4xVar, azpVar2, i, (byte) 1);
        }
    }

    public static final void t(mm40 mm40Var, gad gadVar, fet fetVar, int i) {
        mm40 mm40VarN;
        fetVar.g0(792858866);
        int i2 = i | 6 | (fetVar.e(gadVar.ordinal()) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = c0(fetVar, jm40Var);
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
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                int iOrdinal = gadVar.ordinal();
                if (iOrdinal == 0) {
                    mm40VarN = jm40Var;
                } else if (iOrdinal == 1) {
                    zcl zclVar = qmk.f28987a;
                    mm40VarN = s5x0.N(jm40Var, 0.0f, 20.0f, 0.0f, 0.0f, 13);
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return;
                    }
                    mm40VarN = null;
                }
                fetVar.o0(mm40VarN);
                objP = mm40VarN;
            }
            mm40 mm40Var2 = (mm40) objP;
            if (mm40Var2 == null) {
                fetVar.e0(-619865820);
                fetVar.r(false);
            } else {
                fetVar.e0(-619865819);
                b(0, fetVar, mm40Var2);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gup(mm40Var, gadVar, i, (byte) 29);
        }
    }

    public static final void u(mm40 mm40Var, Function1 function1, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        int i2;
        fetVar.g0(-561267427);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar3) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            byte b = 5;
            if (z || objP == ukd.f35823a) {
                objP = new qf6(function1, b);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = c0(fetVar, mm40Var);
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
            fetVar.e0(1996355764);
            int i3 = 0;
            while (true) {
                int i4 = 12;
                if (i3 >= 9) {
                    break;
                }
                fetVar.e0(1996358075);
                int i5 = 0;
                while (i5 < i4) {
                    if (i3 == 3 && i5 == 5) {
                        fetVar.e0(-943044505);
                        ugdVar2.invoke(fetVar, Integer.valueOf((i2 >> 9) & 14));
                        i5 += 2;
                        fetVar.r(false);
                    } else if (i3 == 3 && i5 == 6) {
                        fetVar.e0(-942854940);
                        fetVar.r(false);
                        i5++;
                    } else {
                        fetVar.e0(-942816221);
                        ugdVar.j(Integer.valueOf(i3), Integer.valueOf(i5), fetVar, Integer.valueOf(i2 & 896));
                        i5++;
                        fetVar.r(false);
                        i4 = i4;
                    }
                }
                fetVar.r(false);
                i3++;
            }
            fetVar.r(false);
            twn.v((i2 >> 12) & 14, ugdVar3, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp(mm40Var, function1, ugdVar, ugdVar2, ugdVar3, i);
        }
    }

    public static final void v(xmw xmwVar, fet fetVar, int i) {
        fetVar.g0(85396171);
        int i2 = (fetVar.g(xmwVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(o7k0.g(mm40VarD, 0.0f, 182.0f, 1), 8.0f, 10.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = c0(fetVar, mm40VarK);
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
            L(xmwVar.f41148a, fetVar, 0);
            x(xmwVar.b, fetVar, 0);
            x(xmwVar.c, fetVar, 0);
            x(xmwVar.d, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xxv(xmwVar, i, (byte) 9);
        }
    }

    public static final void w(mm40 mm40Var, xmw xmwVar, fet fetVar, int i) {
        fet fetVar2;
        xmwVar.getClass();
        fetVar.g0(2126231533);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xmwVar) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            hew0.e(s5x0.K(mm40VarD, qmk.a(fetVar).c, 8.0f), vgg0.a(16.0f), jar0.P(((StaticColors) fetVar.k(m8m0.f21378a)).m75getBlack600d7_KjU(), fetVar), null, u1c.M(-395356741, new elm(xmwVar, (byte) 21), fetVar), fetVar2, 196608, 24);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(mm40Var, xmwVar, i, b);
        }
    }

    public static final void x(String str, fet fetVar, int i) {
        fetVar.g0(1074889073);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 2.0f, 0.0f, 0.0f, 13);
            long jM130getWhite600d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m130getWhite600d7_KjU();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN, jM130getWhite600d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, i2 & 14, 24960, 110584);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 22, i, str);
        }
    }

    public static final void y(mm40 mm40Var, wyp wypVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1175951834);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(wypVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = c0(fetVar2, mm40Var);
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
            f1t0.a(null, wypVar.f39984a, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), 0L, fetVar, 0, 438265);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var, wypVar, i, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0105  */
    public static final void z(int i, uam uamVar, a4x a4xVar, long j, fet fetVar, int i2) {
        int i3;
        float f;
        fetVar.g0(979865491);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(uamVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(a4xVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.f(j) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            int iOrdinal = uamVar.ordinal();
            if (iOrdinal == 0) {
                zcl zclVar = qmk.f28987a;
                f = 52.0f;
            } else if (iOrdinal != 1) {
                t9f.b();
                return;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 100.0f;
            }
            float f2 = f;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = c0(fetVar, jm40Var);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 838693358, a4xVar);
            while (itO.hasNext()) {
                vam vamVar = (vam) itO.next();
                mm40 mm40VarS = o7k0.s(jm40Var, f2);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(mm40VarS, 36.0f);
                String str = (String) CollectionsKt.W(i, vamVar.d);
                if (str == null) {
                    str = "–";
                } else {
                    if (StringsKt.W(str)) {
                        str = null;
                    }
                    if (str == null) {
                        str = "–";
                    }
                }
                K(i3 & 7168, j, fetVar, mm40VarE, str, vamVar.e);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q0m(i, uamVar, a4xVar, j, i2);
        }
    }

    public abstract Object R();

    public String toString() {
        switch (this.f18007a) {
            case 23:
                return R().toString();
            default:
                return super.toString();
        }
    }
}
