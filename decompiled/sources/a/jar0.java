package a;

import android.content.Context;
import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.os.Build;
import android.view.Window;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feed.notifictation.data.NotificationInfoUiModel;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class jar0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f16205a = new ugd(105604082, false, new qbd((byte) 6));
    public static final ugd b = new ugd(1444833435, false, new qbd((byte) 7));
    public static final ugd c = new ugd(52604295, false, new zgd(20));
    public static final ugd d = new ugd(617494738, false, new wgd(1));
    public static final ugd e = new ugd(-1585476460, false, new ihd(23));
    public static final ugd f;
    public static final fqw0 g;

    static {
        new ugd(-2099086706, false, new lhd((byte) 14));
        f = new ugd(-1854761453, false, new lhd((byte) 28));
        g = new fqw0();
    }

    public static final void A(int i, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(988649569);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            zfn zfnVar = m8m0.f21378a;
            mm40 mm40VarQ = i120.Q(n0qVar, ((StaticColors) fetVar.k(zfnVar)).m109getOverlayBackground400d7_KjU(), jd8.n);
            Unit unit = Unit.f46060a;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = i54.l;
                fetVar.o0(objP);
            }
            mm40 mm40VarA = fnn0.a(mm40VarQ, unit, (PointerInputEventHandler) objP);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
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
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            p3c0.a(o7k0.n(mm40Var2, 40.0f), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), 0.0f, ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), 0, 0.0f, fetVar, 0, 52);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var2, i, (byte) 9);
        }
    }

    public static final void B(mm40 mm40Var, String str, String str2, String str3, boolean z, boolean z2, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        long secondary;
        long secondary2;
        jm40 jm40Var;
        shd shdVar;
        boolean z3;
        pcy pcyVar;
        shd shdVar2;
        shd shdVar3;
        fet fetVar3;
        shd shdVar4;
        fetVar.g0(417452026);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z2) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            if (z) {
                secondary = cs0.D(fetVar, 1739448447, fetVar, false);
            } else {
                fetVar.e0(1739449379);
                secondary = afn0.m(fetVar).getSecondary();
                fetVar.r(false);
            }
            long j = secondary;
            if (z2) {
                secondary2 = cs0.D(fetVar, 1739452607, fetVar, false);
            } else {
                fetVar.e0(1739453539);
                secondary2 = afn0.m(fetVar).getSecondary();
                fetVar.r(false);
            }
            long j2 = secondary2;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40VarC, 32.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.l, (byte) 11)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            pcy pcyVar2 = e7z.u1;
            if (z4) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar7);
            jpm0.n(fetVar);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar8);
            if (str.length() > 0) {
                fetVar.e0(482972912);
                int i3 = i2 & 112;
                z3 = false;
                shdVar = shdVar6;
                pcyVar = pcyVar2;
                shdVar2 = shdVar8;
                jm40Var = jm40Var2;
                shdVar4 = shdVar5;
                shdVar3 = shdVar7;
                f1t0.a(o7k0.e(jm40Var2, 12.0f), str, afn0.m(fetVar).getSecondary80(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), qmk.o, fetVar, i3, 307192);
                fetVar3 = fetVar;
                fetVar3.r(false);
            } else {
                jm40Var = jm40Var2;
                shdVar = shdVar6;
                z3 = false;
                pcyVar = pcyVar2;
                shdVar2 = shdVar8;
                shdVar3 = shdVar7;
                fetVar3 = fetVar;
                shdVar4 = shdVar5;
                fetVar3.e0(483323026);
                fetVar3.r(false);
            }
            mm40 mm40VarE = o7k0.e(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 2.0f, 0.0f, 0.0f, 13), 24.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, z3);
            int iHashCode2 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM2 = fetVar3.m();
            mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarE);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(pcyVar);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC, shdVar4);
            jpm0.o(fetVar3, bh90VarM2, shdVar);
            vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC1, shdVar2);
            shd shdVar9 = shdVar2;
            fet fetVar4 = fetVar3;
            v8q0.a(str2, null, j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, g1t0.d(), fetVar4, (i2 >> 6) & 14, 24576, 113658);
            fetVar4.r(true);
            mm40 mm40VarE2 = o7k0.e(o7k0.d(jm40Var, 1.0f), 24.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM3 = fetVar4.m();
            mm40 mm40VarC2 = kbc.c0(fetVar4, mm40VarE2);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(pcyVar);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, tj30VarC2, shdVar4);
            jpm0.o(fetVar4, bh90VarM3, shdVar);
            vqd.u(iHashCode3, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC2, shdVar9);
            v8q0.a(str3, null, j2, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.d(), fetVar4, (i2 >> 9) & 14, 24576, 114682);
            fetVar2 = fetVar4;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p1n(mm40Var2, str, str2, str3, z, z2, i, (byte) 3);
        }
    }

    public static final void C(mm40 mm40Var, String str, String str2, String str3, boolean z, boolean z2, fet fetVar, int i) {
        mm40 mm40Var2;
        boolean z3;
        fet fetVar2;
        fet fetVar3 = fetVar;
        fetVar3.g0(543807205);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar3.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar3.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar3.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar3.h(z2) ? 131072 : 65536;
        }
        if (fetVar3.U(i2 & 1, (74899 & i2) != 74898)) {
            long jD = z ? cs0.D(fetVar3, -1387276054, fetVar3, false) : rz4.c(fetVar3, -1387275120, fetVar3, false);
            long jD2 = z2 ? cs0.D(fetVar3, -1387271830, fetVar3, false) : rz4.c(fetVar3, -1387270896, fetVar3, false);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40VarC, 32.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.l, (byte) 11)), gqw0.n, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarS);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, x5dVarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            if (str.length() > 0) {
                fetVar3.e0(-662620251);
                z3 = true;
                f1t0.a(o7k0.e(jm40Var, 12.0f), str, afn0.m(fetVar3).getSecondary80(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), qmk.o, fetVar, i2 & 112, 307192);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z3 = true;
                fetVar2 = fetVar3;
                fetVar2.e0(-662270137);
                fetVar2.r(false);
            }
            dyb.r((i2 >> 3) & 112, 0, jD, fetVar2, s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), str2);
            fetVar3 = fetVar;
            dyb.r((i2 >> 6) & 112, 1, jD2, fetVar3, null, str3);
            fetVar3.r(z3);
            mm40Var2 = jm40Var;
        } else {
            fetVar3.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p1n(mm40Var2, str, str2, str3, z, z2, i, (byte) 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static final void D(mm40 mm40Var, String str, a1n a1nVar, a1n a1nVar2, fet fetVar, int i) {
        Object obj;
        mm40 mm40Var2;
        fet fetVar2;
        jm40 jm40Var;
        int i2;
        ?? r0;
        fet fetVar3;
        fetVar.g0(-467133878);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.g(a1nVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            obj = a1nVar2;
            i3 |= fetVar.g(obj) ? 2048 : 1024;
        } else {
            obj = a1nVar2;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40VarC, 32.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.l, (byte) 11)), gqw0.n, fetVar, 48);
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
            if (str.length() > 0) {
                fetVar.e0(433456332);
                int i4 = i3 & 112;
                i2 = 0;
                r0 = 1;
                jm40Var = jm40Var2;
                f1t0.a(o7k0.e(jm40Var2, 12.0f), str, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary80(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), qmk.o, fetVar, i4, 307192);
                fet fetVar4 = fetVar;
                fetVar4.r(false);
                fetVar3 = fetVar4;
            } else {
                fet fetVar5 = fetVar;
                jm40Var = jm40Var2;
                i2 = 0;
                r0 = 1;
                fetVar5.e0(433806446);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            mm40Var2 = jm40Var;
            sac.p(s5x0.N(mm40Var2, 0.0f, 2.0f, 0.0f, 0.0f, 13), c0(a1nVar, fetVar3), fetVar3, i2, i2);
            sac.p(null, c0(a1nVar2, fetVar), fetVar3, i2, r0);
            fetVar3.r(r0);
            fetVar2 = fetVar3;
        } else {
            fet fetVar6 = fetVar;
            fetVar6.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar6;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 23, i, (Object) mm40Var2, (Object) str, (Object) a1nVar, obj);
        }
    }

    public static final void E(mm40 mm40Var, String str, String str2, String str3, a1n a1nVar, a1n a1nVar2, fet fetVar, int i) {
        String str4;
        mm40 mm40Var2;
        boolean z;
        a1n a1nVar3 = a1nVar2;
        String str5 = a1nVar.d;
        String str6 = a1nVar3.d;
        fetVar.g0(-158039541);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str4 = str2;
            i2 |= fetVar.g(str4) ? 256 : 128;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(a1nVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(a1nVar3) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(o7k0.e(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), 70.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            if (str5.length() <= 0 || str6.length() <= 0) {
                z = true;
                fetVar.e0(1177176659);
                fetVar.r(false);
            } else {
                fetVar.e0(1176799947);
                z = true;
                B(null, str, str5, str6, a1nVar.h, a1nVar3.h, fetVar, i3 & 112);
                fetVar.r(false);
            }
            if (a1nVar.e.length() <= 0 || a1nVar3.e.length() <= 0) {
                fetVar.e0(1177480211);
                fetVar.r(false);
            } else {
                fetVar.e0(1177282245);
                int i4 = i3 >> 6;
                D(null, str4, a1nVar, a1nVar3, fetVar, (i4 & 7168) | ((i3 >> 3) & 112) | (i4 & 896));
                fetVar.r(false);
            }
            if (r2.f.length() <= 0 || a1nVar3.f.length() <= 0) {
                fetVar.e0(1177986131);
                fetVar.r(false);
            } else {
                fetVar.e0(1177597887);
                C(null, str3, r2.f, a1nVar3.f, a1nVar.g, a1nVar3.g, fetVar, (i3 >> 6) & 112);
                fetVar.r(false);
            }
            fetVar.r(z);
            mm40Var2 = jm40Var;
        } else {
            a1nVar3 = a1nVar3;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var2, (Object) str, (Object) str2, (Object) str3, (Object) a1nVar, (Object) a1nVar3, i, (byte) 19);
        }
    }

    public static final void F(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        Object immVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1337301518);
        int i2 = i | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 27;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            androidx.compose.runtime.d dVar = zaq0.b;
            ThemeColors themeColors = (ThemeColors) fetVar.k(dVar);
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            String strW = rsm0.w(R.string.select_cashback_title, 0, fetVar);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new rip(pz40VarF, (byte) 25);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new rip(pz40VarF, (byte) 26);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new rip(pz40VarF, b2);
                fetVar.o0(objP3);
            }
            Function0 function3 = (Function0) objP3;
            boolean zG = fetVar.g(strW) | fetVar.g(themeColors);
            Object objP4 = fetVar.P();
            if (zG || objP4 == obj) {
                immVar = new imm(new ilm(themeColors.getSecondary()), new plm(strW, themeColors.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, themeColors.getSecondary()))), themeColors.getBackgroundContent(), true, new y3d(themeColors.getSeparator60()));
                fetVar.o0(immVar);
            } else {
                immVar = objP4;
            }
            imm immVar2 = (imm) immVar;
            mm40 mm40VarE0 = o2e.e0(i120.Q(o7k0.c, ((ThemeColors) fetVar.k(dVar)).getBackground(), jd8.n), "SELECT_CASHBACK_SCREEN");
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
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = new l3c0(function2, (byte) 11);
                fetVar.o0(objP5);
            }
            Function0 function4 = (Function0) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == obj) {
                objP6 = new r3w(function0, (byte) 24);
                fetVar.o0(objP6);
            }
            hlm.c(null, immVar2, null, function4, null, (Function1) objP6, null, null, null, null, null, null, fetVar, 199680, 0, 4053);
            w0i0 w0i0Var = (w0i0) l7m0Var.getValue();
            if (w0i0Var != null) {
                if (w0i0Var instanceof t0i0) {
                    fetVar.e0(-581820950);
                    fww.m(null, (t0i0) w0i0Var, (Function1) pz40VarF.getValue(), fetVar, 0);
                    fetVar.r(false);
                } else if (w0i0Var instanceof u0i0) {
                    fetVar.e0(-581609189);
                    u0i0 u0i0Var = (u0i0) w0i0Var;
                    Object objP7 = fetVar.P();
                    if (objP7 == obj) {
                        objP7 = new l3c0(function3, (byte) 12);
                        fetVar.o0(objP7);
                    }
                    jiq0.Y(null, u0i0Var, (Function0) objP7, fetVar, 384);
                    fetVar.r(false);
                } else if (w0i0Var instanceof v0i0) {
                    fetVar.e0(-581385555);
                    rq8.y(0, fetVar, null);
                    fetVar.r(false);
                }
                fetVar.r(true);
            }
            throw b1j.f(1920891888, fetVar, false);
        }
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5e0(l7m0Var, function1, i, (byte) 27);
        }
    }

    public static final void G(d9z d9zVar, htr htrVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(113783219);
        int i2 = i | (fetVar.g(d9zVar) ? 4 : 2) | (fetVar.g(htrVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(qmk.a(fetVar).c, 8.0f, qmk.a(fetVar).c, 24.0f, fetVar);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new eya(htrVar, function1, (byte) 3);
                fetVar.o0(objP);
            }
            uzb.z(n0qVar, ch80VarF, d9zVar, false, (Function2) objP, fetVar, ((i2 << 6) & 896) | 6, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(d9zVar, htrVar, function1, i, (byte) 10);
        }
    }

    public static final void H(tx60 tx60Var, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z;
        fetVar.g0(243137541);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(tx60Var) : fetVar.i(tx60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mdm mdmVar = tx60Var.c;
            mdm mdmVar2 = tx60Var.b;
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (mdmVar != null) {
                fetVar.e0(1995774901);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 100.0f, 7);
                mdm mdmVar3 = tx60Var.c;
                z = (i2 & 112) == 32;
                Object objP = fetVar.P();
                if (z || objP == cl5Var) {
                    objP = new ju60(function1, (byte) 8);
                    fetVar.o0(objP);
                }
                m(mm40VarN, mdmVar3, (Function0) objP, fetVar, 0);
                fetVar.r(false);
            } else if (mdmVar2 != null) {
                fetVar.e0(1996076779);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7);
                z = (i2 & 112) == 32;
                Object objP2 = fetVar.P();
                if (z || objP2 == cl5Var) {
                    objP2 = new ju60(function1, b2);
                    fetVar.o0(objP2);
                }
                m(mm40VarN2, mdmVar2, (Function0) objP2, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(1996346045);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(tx60Var, function1, i, (byte) 28);
        }
    }

    public static final void I(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(1782599202);
        if (fetVar.U(i & 1, i != 0)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(qmk.a(fetVar).c, 8.0f, qmk.a(fetVar).c, 24.0f);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new cr60((byte) 8);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            uzb.z(n0qVar, lh80Var, null, false, (Function2) objP, fetVar2, 24582, 12);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cr60(i, (byte) 9);
        }
    }

    public static final void J(mm40 mm40Var, l7m0 l7m0Var, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        ugd ugdVar2;
        mm40 mm40Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1331041865);
        int i2 = i | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            boolean zH = fetVar.h(((ocn0) l7m0Var.getValue()).b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                objP = new dmm(new ta50(new wkm(12, R.drawable.ic_glyph_trash, ((ocn0) l7m0Var.getValue()).b, ra50.f30118a, secondary)));
                fetVar.o0(objP);
            }
            dmm dmmVar = (dmm) objP;
            boolean zH2 = fetVar.h(((ocn0) l7m0Var.getValue()).b) | fetVar.g(((ocn0) l7m0Var.getValue()).f25035a) | fetVar.e(((ocn0) l7m0Var.getValue()).c) | fetVar.g(((ocn0) l7m0Var.getValue()).d);
            Object objP2 = fetVar.P();
            if (zH2 || objP2 == cl5Var) {
                oim oimVar = new oim(((ocn0) l7m0Var.getValue()).f25035a, false, "", "", false, dmmVar, ((ocn0) l7m0Var.getValue()).c, ((ocn0) l7m0Var.getValue()).d, axh0.f1625a, null);
                fetVar.o0(oimVar);
                objP2 = oimVar;
            }
            oim oimVar2 = (oim) objP2;
            mm40 mm40VarE0 = o2e.e0(i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), jd8.n), "SUBSCRIPTION_TEAM_BET_COLUMN");
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
            mm40Var2 = jm40.b;
            mm40 mm40VarW = o050.W(mm40Var2);
            boolean z = (i2 & 896) == 256;
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new zbm0(function1, (byte) 10);
                fetVar.o0(objP3);
            }
            ckb.k(mm40VarW, oimVar2, false, null, null, (Function1) objP3, fetVar, 0, 28);
            ugdVar2 = ugdVar;
            ugdVar2.F(Integer.valueOf(((ocn0) l7m0Var.getValue()).c), fetVar, 48);
            fetVar.r(true);
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qhb0(mm40Var2, l7m0Var, function1, ugdVar2, i, (byte) 1);
        }
    }

    public static final void K(mm40 mm40Var, p9n p9nVar, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        sso0 qso0Var;
        fetVar.g0(646818487);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        }
        int i5 = i3 | (fetVar.e(p9nVar.ordinal()) ? 32 : 16);
        if (fetVar.U(i5 & 1, (i5 & 19) != 18)) {
            mm40 mm40Var3 = i4 != 0 ? jm40.b : mm40Var;
            int iOrdinal = p9nVar.ordinal();
            if (iOrdinal == 0) {
                d4d d4dVar = d4d.PRIMARY;
                qso0Var = new qso0();
            } else if (iOrdinal == 1) {
                d4d d4dVar2 = d4d.PRIMARY;
                qso0Var = new eqo0();
            } else if (iOrdinal == 2) {
                d4d d4dVar3 = d4d.PRIMARY;
                qso0Var = new eso0();
            } else if (iOrdinal == 3) {
                d4d d4dVar4 = d4d.PRIMARY;
                qso0Var = new lro0();
            } else if (iOrdinal != 4) {
                t9f.b();
                return;
            } else {
                d4d d4dVar5 = d4d.PRIMARY;
                qso0Var = new dpo0();
            }
            mm40 mm40Var4 = mm40Var3;
            j6n.h(p9nVar.f26615a, qso0Var, mm40Var4, 0, 0, fetVar, (i5 << 6) & 896, 24);
            mm40Var2 = mm40Var4;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm(mm40Var2, (Object) p9nVar, i, i2, (byte) 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public static final void L(t9n t9nVar, Function1 function1, fet fetVar, int i) {
        ?? r12;
        boolean z;
        p9n p9nVar = t9nVar.d;
        fetVar.g0(-87573379);
        jm40 jm40Var = jm40.b;
        int i2 = (fetVar.g(jm40Var) ? 4 : 2) | i | (fetVar.g(t9nVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            mm40 mm40VarO = ny9.O(1.5f, o7k0.d(jm40Var, 1.0f), false);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarO), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundLight60(), jd8.n);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
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
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(847762353, new o5i(t9nVar, function1), fetVar), fetVar, 56);
            fetVar.r(true);
            mm40 mm40VarQ2 = ffb0.Q(o7k0.d(jm40Var, 1.0f), -1.0f, -1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarQ2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            p9n p9nVar2 = t9nVar.e;
            if (p9nVar == null) {
                fetVar.e0(-526428019);
                r12 = 0;
                fetVar.r(false);
            } else {
                r12 = 0;
                fetVar.e0(-526428018);
                K(s5x0.N(jm40Var, 0.0f, 0.0f, 2.0f, 0.0f, 11), p9nVar, fetVar, 0, 0);
                fetVar.r(false);
            }
            if (p9nVar2 != p9nVar) {
                fetVar.e0(1091404908);
                if (p9nVar2 == null) {
                    fetVar.e0(-526186219);
                    fetVar.r(r12);
                    z = true;
                } else {
                    fetVar.e0(-526186218);
                    z = true;
                    K(null, p9nVar2, fetVar, r12, 1);
                    fetVar.r(r12);
                }
                fetVar.r(r12);
            } else {
                z = true;
                fetVar.e0(-526148305);
                fetVar.r(r12);
            }
            fetVar.r(z);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o5i(t9nVar, function1, i);
        }
    }

    public static final void M(w9n w9nVar, Function1 function1, fet fetVar, int i) {
        boolean z;
        fetVar.g0(1000626009);
        jm40 jm40Var = jm40.b;
        int i2 = (fetVar.g(jm40Var) ? 4 : 2) | i | (fetVar.g(w9nVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            mm40 mm40VarO = ny9.O(1.5f, o7k0.d(jm40Var, 1.0f), false);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarO);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-244462195, new n5i(w9nVar, function1), fetVar), fetVar, 56);
            y9n y9nVarZ = w9nVar.z();
            if (y9nVarZ == null) {
                fetVar.e0(504040735);
                fetVar.r(false);
            } else {
                fetVar.e0(504040736);
                vdb.q(jr8.f16991a.b(jm40Var, gqw0.h), y9nVarZ, fetVar, 0);
                fetVar.r(false);
            }
            if (w9nVar instanceof v9n) {
                fetVar.e0(504281699);
                zq8.a(0, fetVar, i120.Q(o7k0.c, ((StaticColors) fetVar.k(m8m0.f21378a)).m75getBlack600d7_KjU(), jd8.n));
                fetVar.r(false);
            } else {
                fetVar.e0(504483509);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40 mm40VarQ = ffb0.Q(o7k0.d(jm40Var, 1.0f), -1.0f, -1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            p9n p9nVarX = w9nVar.x();
            if (p9nVarX == null) {
                fetVar.e0(-725865551);
                fetVar.r(false);
            } else {
                fetVar.e0(-725865550);
                K(s5x0.N(jm40Var, 0.0f, 0.0f, 2.0f, 0.0f, 11), p9nVarX, fetVar, 0, 0);
                fetVar.r(false);
            }
            if (w9nVar.y() != w9nVar.x()) {
                fetVar.e0(1916255432);
                p9n p9nVarY = w9nVar.y();
                if (p9nVarY == null) {
                    fetVar.e0(-725623751);
                    fetVar.r(false);
                    z = true;
                } else {
                    fetVar.e0(-725623750);
                    z = true;
                    K(null, p9nVarY, fetVar, 0, 1);
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else {
                z = true;
                fetVar.e0(-725585837);
                fetVar.r(false);
            }
            fetVar.r(z);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n5i(w9nVar, function1, i);
        }
    }

    public static final void N(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, boolean z) {
        mm40 mm40Var2;
        a4xVar.getClass();
        fetVar.g0(-1087521348);
        int i2 = i | 6 | (fetVar.h(z) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "TOURNAMENT_STAGES_SCREEN_LAZY_COLUMN");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(xfn.a(fetVar).c, 8.0f, xfn.a(fetVar).c, z ? 88.0f : 24.0f, fetVar);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new oea(a4xVar, (byte) 29);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE0, null, ch80VarF, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fup(mm40Var2, z, a4xVar, i);
        }
    }

    public static lca O(fet fetVar) {
        return S((t4d) fetVar.k(v4d.f36771a));
    }

    public static lca P(long j, fet fetVar) {
        long jB = v4d.b(j, fetVar);
        return S((t4d) fetVar.k(v4d.f36771a)).a(j, jB, y3d.g, y3d.c(0.38f, jB));
    }

    public static jfa Q(int i) {
        float f2;
        if ((i & 1) != 0) {
            u4d u4dVar = q0q.f27914a;
            f2 = 0.0f;
        } else {
            f2 = 4.0f;
        }
        return new jfa(f2, q0q.e, q0q.d);
    }

    public static t83 R(g93 g93Var, swq swqVar) {
        Object next;
        swqVar.getClass();
        Iterator it = g93Var.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.d(((t83) next).d(), swqVar)) {
                return (t83) next;
            }
        }
        next = null;
        return (t83) next;
    }

    public static lca S(t4d t4dVar) {
        lca lcaVar = t4dVar.X;
        if (lcaVar != null) {
            return lcaVar;
        }
        u4d u4dVar = q0q.f27914a;
        lca lcaVar2 = new lca(v4d.c(t4dVar, u4dVar), v4d.a(t4dVar, v4d.c(t4dVar, u4dVar)), fbc.L(y3d.c(q0q.c, v4d.c(t4dVar, q0q.b)), v4d.c(t4dVar, u4dVar)), y3d.c(0.38f, v4d.a(t4dVar, v4d.c(t4dVar, u4dVar))));
        t4dVar.X = lcaVar2;
        return lcaVar2;
    }

    public static final long T(boolean z) {
        return z ? StaticColors.INSTANCE.m98getGreen0d7_KjU() : StaticColors.INSTANCE.m131getWhite800d7_KjU();
    }

    public static boolean U(g93 g93Var, swq swqVar) {
        swqVar.getClass();
        return g93Var.O0(swqVar) != null;
    }

    public static final void V(kxq kxqVar, boolean z) {
        ycm0 ziv0Var;
        Window window = kxqVar.getWindow();
        ani0 ani0Var = new ani0(kxqVar.getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            ziv0Var = new bjv0(window, ani0Var);
        } else if (i >= 30) {
            ziv0Var = new ajv0(window, ani0Var);
        } else {
            ziv0Var = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
        }
        ziv0Var.x(2);
        if (z) {
            ziv0Var.s(519);
        } else {
            ziv0Var.y(519);
        }
    }

    public static final String W(String str) {
        return kng0.l("\u2066", str, "\u2069");
    }

    public static final String X(String str, String str2) {
        if (kotlin.text.c.x(str2, "http", false)) {
            return str2;
        }
        if (!kotlin.text.c.x(str2, Separators.SLASH, false)) {
            str2 = Separators.SLASH.concat(str2);
        }
        return ohs0.n(str, str2);
    }

    public static final ArrayList Y(wf0 wf0Var) {
        wf0Var.getClass();
        List<yh0> list = wf0Var.f39044a;
        if (list == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (yh0 yh0Var : list) {
            if (yh0Var == null) {
                jf4.k(null);
                return null;
            }
            Long l = yh0Var.f42611a;
            long jLongValue = l != null ? l.longValue() : 0L;
            String str = yh0Var.b;
            if (str == null) {
                str = "";
            }
            String str2 = yh0Var.c;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = yh0Var.d;
            if (str3 == null) {
                str3 = "";
            }
            Integer num = yh0Var.e;
            int iIntValue = num != null ? num.intValue() : 0;
            Long l2 = yh0Var.f;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            Long l3 = yh0Var.g;
            long jLongValue3 = l3 != null ? l3.longValue() : 0L;
            Long l4 = yh0Var.h;
            long jLongValue4 = l4 != null ? l4.longValue() : 0L;
            Boolean bool = yh0Var.j;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = yh0Var.k;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            String str4 = yh0Var.l;
            String str5 = str4 == null ? "" : str4;
            iun iunVar = iun.f15405a;
            arrayList.add(new vh0(jLongValue, str, str2, str3, iIntValue, jLongValue2, jLongValue3, jLongValue4, zBooleanValue, zBooleanValue2, str5, iunVar, iunVar, false));
        }
        return arrayList;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public static final a.zv6 Z(a.dx6 r22, a.ctf0 r23, a.mnb0 r24, java.lang.String r25, boolean r26) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jar0.Z(a.dx6, a.ctf0, a.mnb0, java.lang.String, boolean):a.zv6");
    }

    public static final void a(int i, in5 in5Var, ijl ijlVar, fet fetVar, Function1 function1) {
        fetVar.g0(441558222);
        int i2 = (fetVar.g(in5Var) ? 4 : 2) | i | (fetVar.e(ijlVar.ordinal()) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (!fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.X();
        } else if (in5Var.b) {
            fetVar.e0(-1023630390);
            long j = in5Var.f;
            String str = in5Var.g;
            String str2 = in5Var.h;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ju60(function1, (byte) 5);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ju60(function1, (byte) 6);
                fetVar.o0(objP2);
            }
            f(j, str, str2, function0, (Function0) objP2, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.e0(-1023210495);
            b((i2 & 896) | ((i2 >> 3) & 14) | ((i2 << 3) & 112), in5Var, ijlVar, fetVar, function1);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(in5Var, ijlVar, function1, i, (byte) 11);
        }
    }

    public static final po9 a0(so9 so9Var) {
        so9Var.getClass();
        Long l = so9Var.f32535a;
        long jLongValue = l != null ? l.longValue() : -1L;
        String str = so9Var.b;
        if (str == null) {
            str = "";
        }
        String str2 = so9Var.c;
        String strE = lmc.E(str2 != null ? str2 : "");
        Boolean bool = so9Var.d;
        return new po9(jLongValue, str, strE, bool != null ? bool.booleanValue() : false);
    }

    public static final void b(int i, in5 in5Var, ijl ijlVar, fet fetVar, Function1 function1) {
        int i2;
        fetVar.g0(-276130307);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.e(ijlVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(in5Var) : fetVar.i(in5Var) ? 32 : 16;
        }
        int i3 = i2 | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) fetVar.k(dy2.b);
            jjl jjlVar = new jjl(in5Var.c, in5Var.d, in5Var.i, in5Var.e);
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ju60(function1, (byte) 3);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ju60(function1, b2);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean zI = fetVar.i(context) | (i4 == 256);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new a540((byte) 22, (Object) context, function1);
                fetVar.o0(objP3);
            }
            feb.k(ijlVar, jjlVar, null, function0, function2, (Function0) objP3, fetVar, i3 & 14, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51((Object) ijlVar, (Object) in5Var, (Object) function1, i, (byte) 13);
        }
    }

    public static final mlr b0(bw0 bw0Var, String str) {
        String strX;
        Long l;
        bw0Var.getClass();
        str.getClass();
        Long l2 = bw0Var.f3301a;
        ex0 ex0Var = bw0Var.l;
        lx0 lx0Var = bw0Var.f;
        List list = bw0Var.e;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        long jLongValue2 = (ex0Var == null || (l = ex0Var.f8552a) == null) ? 0L : l.longValue();
        Long l3 = bw0Var.b;
        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
        String str2 = ex0Var != null ? ex0Var.b : null;
        String str3 = str2 == null ? "" : str2;
        String str4 = bw0Var.d;
        String str5 = str4 == null ? "" : str4;
        String str6 = lx0Var != null ? lx0Var.f : null;
        if (str6 == null || str6.length() == 0) {
            String str7 = lx0Var != null ? lx0Var.c : null;
            strX = X(str, str7 != null ? str7 : "");
        } else {
            strX = X(str, lx0Var.f);
        }
        String str8 = strX;
        boolean zContains = list != null ? list.contains("popular") : false;
        boolean zContains2 = list != null ? list.contains("new") : false;
        boolean zContains3 = list != null ? list.contains("promo") : false;
        boolean zContains4 = list != null ? list.contains("hot") : false;
        Boolean bool = bw0Var.j;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = bw0Var.k;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        boolean zD = Intrinsics.d(bw0Var.i, Boolean.TRUE);
        List list2 = bw0Var.h;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new mlr(jLongValue, jLongValue2, jLongValue3, 0L, str3, str5, str8, (String) null, zContains, zContains2, zContains3, zBooleanValue, zBooleanValue2, zD, zContains4, list2, false, 131200);
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1914587202);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_circle_fire, 0, fetVar2);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
            pz40 pz40Var = s6t0.f31722a;
            dww.c(pm80VarF, null, mm40VarN, s6t0.b().f33626a.getSecondary60(), fetVar2, 56, 0);
            v8q0.a(rsm0.w(R.string.empty_event, 0, fetVar2), s5x0.M(jm40Var, 16.0f, 16.0f, 16.0f, 8.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), fetVar, 0, 0, 130044);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i, (byte) 14);
        }
    }

    public static final dqm c0(a1n a1nVar, fet fetVar) {
        long secondary;
        boolean z = a1nVar.i;
        String str = a1nVar.e;
        if (z) {
            fetVar.e0(483217004);
            secondary = ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU();
        } else {
            fetVar.e0(483217936);
            secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
        }
        fetVar.r(false);
        boolean zH = fetVar.h(z) | fetVar.g(str);
        Object objP = fetVar.P();
        if (zH || objP == ukd.f35823a) {
            objP = new dqm(str, new y3d(secondary));
            fetVar.o0(objP);
        }
        return (dqm) objP;
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var, boolean z) {
        mm40 mm40Var2;
        float f2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1826568790);
        int i2 = i | 6 | (fetVar2.h(z) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar2, 0, 1);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(n0qVar, qmk.a(fetVar2).c, 0.0f, 2), 0.0f, 0.0f, 0.0f, 26.0f, 7);
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
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar2.e0(967647900);
                mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), 60.0f);
                zcl zclVar2 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0VarD0, fetVar2, 0, false);
            } else {
                fetVar2.e0(967961186);
                fetVar2.r(false);
            }
            nkb.h(s5x0.N(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 0.0f, 8.0f, 0.0f, 0.0f, 13), new ijm(), kjm.f18392a, null, null, null, fetVar, 384, 56);
            fetVar2 = fetVar;
            fetVar2.e0(1832348568);
            int iB = 0;
            while (iB < 3) {
                if (iB == 0) {
                    zcl zclVar3 = qmk.f28987a;
                    f2 = 0.0f;
                } else {
                    zcl zclVar4 = qmk.f28987a;
                    f2 = 8.0f;
                }
                mm40 mm40VarE2 = o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, f2, 0.0f, 0.0f, 13), 1.0f), 198.0f);
                zcl zclVar5 = qmk.i;
                ugg0 ugg0Var2 = vgg0.f37379a;
                iB = h97.b(h97.e(zclVar5, zclVar5, zclVar5, zclVar5, mm40VarE2), fqj0VarD0, fetVar2, 0, iB, 1);
            }
            fetVar2.r(false);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var2, z, i, (byte) 1);
        }
    }

    public static final void e(l7m0 l7m0Var, Function1 function1, Function1 function2, Function0 function0, Function0 function3, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        function2.getClass();
        function0.getClass();
        function3.getClass();
        fetVar2.g0(1991626612);
        int i2 = i | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(function2) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192) | (fetVar2.i(function3) ? 131072 : 65536);
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            wkw wkwVar = new wkw(gqw0.n);
            zcl zclVar = qmk.f28987a;
            wwb.i(s5x0.N(wkwVar, 0.0f, 0.0f, 0.0f, 8.0f, 7), xsm0.s(R.string.filter_settings, fetVar2), 0L, 0, 0L, fetVar, 0, 28);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
            xx7 xx7Var = gqw0.m;
            mm40 mm40VarE = mm40VarL.e(new wkw(xx7Var));
            hjm hjmVar = new hjm(xsm0.s(R.string.notification_type, fetVar), new ojm(127), null, null, null, null, false, null, null, false, null, null, 8188);
            kjm kjmVar = kjm.b;
            nkb.h(mm40VarE, hjmVar, kjmVar, null, null, null, fetVar, 384, 56);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new we4(l7m0Var, (byte) 23));
                fetVar.o0(objP);
            }
            v((l7m0) objP, function1, fetVar, (i2 & 896) | 54);
            wvb.o(jm40Var, 16.0f, 0L, fetVar, 6, 4);
            nkb.h(s5x0.L(jm40Var, 8.0f, 0.0f, 2).e(new wkw(xx7Var)), new hjm(xsm0.s(R.string.period, fetVar), new ojm(127), null, null, null, null, false, null, null, false, null, null, 8188), kjmVar, null, null, null, fetVar, 384, 56);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = jgk0.b(new we4(l7m0Var, (byte) 24));
                fetVar.o0(objP2);
            }
            z((l7m0) objP2, function2, fetVar, ((i2 >> 3) & 896) | 54);
            wvb.o(jm40Var, 8.0f, 0L, fetVar, 6, 4);
            String strS = xsm0.s(R.string.reset, fetVar);
            String strS2 = xsm0.s(R.string.apply, fetVar);
            boolean zG = fetVar.g(strS);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new wul(nul.e, oe9.f25112a, new ue9(strS), true, false, false);
                fetVar.o0(objP3);
            }
            wul wulVar = (wul) objP3;
            boolean zG2 = fetVar.g(strS2);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == cl5Var) {
                objP4 = new wul(lul.e, oe9.f25112a, new ue9(strS2), true, false, false);
                fetVar.o0(objP4);
            }
            gkb.i(s5x0.L(jm40Var, 0.0f, 8.0f, 1), vul.f38053a, wulVar, (wul) objP4, 0L, function3, function0, fetVar, (458752 & i2) | 48 | ((i2 << 6) & 3670016), 16);
            fetVar2 = fetVar;
            WeakHashMap weakHashMap = djv0.w;
            qxw.o(fetVar2, j120.k0(jm40Var, zcm0.i(fetVar2).e));
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) l7m0Var, function1, function2, (wdr) function0, (Object) function3, i, (byte) 7);
        }
    }

    public static final void f(long j, String str, String str2, Function0 function0, Function0 function1, fet fetVar, int i) {
        fetVar.g0(-994511738);
        int i2 = i | (fetVar.f(j) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarQ = i120.Q(jm40.b, j, jd8.n);
            zcl zclVar = qmk.f28987a;
            pzb.g(s5x0.K(mm40VarQ, xfn.a(fetVar).d, 8.0f), str, str2, function0, function1, fetVar, i2 & 65520);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new si6(j, str, str2, function0, function1, i);
        }
    }

    public static final void g(mm40 mm40Var, zn5 zn5Var, fet fetVar, int i) {
        mm40 mm40Var2;
        zn5Var.getClass();
        fetVar.g0(1031569943);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(zn5Var) ? 32 : 16);
        byte b2 = 18;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (zn5Var instanceof xn5) {
            fetVar.e0(1009369512);
            xn5 xn5Var = (xn5) zn5Var;
            if (xn5Var.b) {
                fetVar.e0(1009416601);
                x7x x7xVarR = b8k0.r(b8k0.V(null, fetVar, 1), 0.0f, fetVar.k(bmd.n) == k6z.b ? -360.0f : 360.0f, ro4.b0(ro4.m0(800, 0, ihn.d, 2), kkf0.f18436a, 0L, 4), null, fetVar, 4152, 8);
                boolean zG = fetVar.g(x7xVarR);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new yd1(x7xVarR, b2);
                    fetVar.o0(objP);
                }
                mm40 mm40VarT = i4w0.T(mm40Var, (Function1) objP);
                fetVar.r(false);
                mm40Var2 = mm40VarT;
            } else {
                fetVar.e0(1010209891);
                fetVar.r(false);
                mm40Var2 = mm40Var;
            }
            pm80 pm80VarF = a8k0.F(xn5Var.f41156a, 0, fetVar);
            pz40 pz40Var = s6t0.f31722a;
            dww.c(pm80VarF, null, mm40Var2, StaticColors.INSTANCE.m123getWhite0d7_KjU(), fetVar, 56, 0);
            fetVar.r(false);
        } else {
            if (!zn5Var.equals(yn5.f42921a)) {
                throw b1j.f(-798725508, fetVar, false);
            }
            fetVar.e0(-798686454);
            pz40 pz40Var2 = s6t0.f31722a;
            zq8.a(0, fetVar, i120.Q(mm40Var, StaticColors.INSTANCE.m126getWhite200d7_KjU(), vgg0.f37379a));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sr1(mm40Var, zn5Var, i, (byte) 23);
        }
    }

    public static final void h(mm40 mm40Var, pz40 pz40Var, pz40 pz40Var2, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(1636389449);
        int i2 = i | 6 | (fetVar.g(pz40Var) ? 32 : 16) | (fetVar.g(pz40Var2) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.j;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i3 = i2 >> 3;
            piz.f(o7k0.d(mrv.k0(jm40Var, "LEFT_SECTION_ID"), 1.0f), pz40Var2, function0, function1, fetVar, (i3 & 112) | 6 | (i3 & 896) | (i3 & 7168));
            if (pz40Var.getValue() instanceof i30) {
                fetVar.e0(-222727550);
                fetVar.r(false);
            } else {
                fetVar.e0(-222985098);
                k7x.p(o7k0.d(mrv.k0(jm40Var, "RIGHT_SECTION_ID"), 1.0f), pz40Var, function2, fetVar, ((i2 >> 9) & 896) | (i2 & 112) | 6);
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
            yfe0VarU.d = new aw7(mm40Var2, pz40Var, pz40Var2, function0, function1, function2, i, (byte) 2);
        }
    }

    public static final void i(mm40 mm40Var, ArrayList arrayList, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(-321326500);
        int i2 = i | 6;
        byte b2 = 16;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(arrayList) : fetVar.i(arrayList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new uo6(function1, (byte) 15);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new uo6(function1, b2);
                fetVar.o0(objP2);
            }
            Function1 function3 = (Function1) objP2;
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(12.0f, 12.0f, 12.0f, 24.0f, fetVar);
            boolean z3 = false;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(arrayList))) {
                z3 = true;
            }
            boolean zG = fetVar.g(function2) | z3 | fetVar.g(function3);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new on((Object) arrayList, (Object) function2, (Object) function3, (byte) 29);
                fetVar.o0(objP3);
            }
            b8k0.e(n0qVar, null, ch80VarF, qw3Var, null, null, false, null, (Function1) objP3, fetVar, 0, 490);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((byte) 12, i, (Object) mm40Var2, (Object) arrayList, function1);
        }
    }

    public static final void j(x9n x9nVar, Function1 function1, Function0 function0, fet fetVar, int i) {
        function1.getClass();
        if ((i & 8) != 0) {
            function0 = null;
        }
        if (x9nVar instanceof w9n) {
            fetVar.e0(136357871);
            M((w9n) x9nVar, function1, fetVar, 384);
            fetVar.r(false);
        } else if (x9nVar instanceof t9n) {
            fetVar.e0(136565540);
            L((t9n) x9nVar, function1, fetVar, 384);
            fetVar.r(false);
        } else {
            if (!(x9nVar instanceof s9n)) {
                throw b1j.f(-2073812554, fetVar, false);
            }
            fetVar.e0(136796428);
            q((s9n) x9nVar, function1, function0, fetVar, 384);
            fetVar.r(false);
        }
    }

    public static final void k(mm40 mm40Var, a1n a1nVar, a1n a1nVar2, f2i f2iVar, String str, String str2, String str3, String str4, String str5, r0n r0nVar, xem xemVar, fet fetVar, int i) {
        int i2;
        a1n a1nVar3;
        a1n a1nVar4;
        f2i f2iVar2;
        String str6;
        r0n r0nVar2;
        fet fetVar2 = fetVar;
        cs0.x(str, str2, str4, str5);
        fetVar2.g0(436634002);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            a1nVar3 = a1nVar;
            i2 |= fetVar2.g(a1nVar3) ? 32 : 16;
        } else {
            a1nVar3 = a1nVar;
        }
        if ((i & 384) == 0) {
            a1nVar4 = a1nVar2;
            i2 |= fetVar2.g(a1nVar4) ? 256 : 128;
        } else {
            a1nVar4 = a1nVar2;
        }
        if ((i & 3072) == 0) {
            f2iVar2 = f2iVar;
            i2 |= fetVar2.g(f2iVar2) ? 2048 : 1024;
        } else {
            f2iVar2 = f2iVar;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.g(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            str6 = str3;
            i2 |= fetVar2.g(str6) ? 1048576 : 524288;
        } else {
            str6 = str3;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar2.g(str4) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar2.g(str5) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            r0nVar2 = r0nVar;
            i2 |= fetVar2.g(r0nVar2) ? 536870912 : 268435456;
        } else {
            r0nVar2 = r0nVar;
        }
        int i3 = i2;
        int i4 = fetVar2.g(xemVar) ? 4 : 2;
        if (fetVar2.U(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(o7k0.e(mm40VarD, 84.0f), 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.l, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            int i5 = i3 << 9;
            int i6 = i5 & 57344;
            int i7 = i5 & 458752;
            y(ohs0.i(fetVar2, mm40VarC0, gqw0.v, 1.0f, true), f2iVar2, str, str2, a1nVar3, a1nVar4, r0nVar2, fetVar2, ((i3 >> 6) & 8176) | i6 | i7 | (3670016 & (i3 >> 9)));
            fetVar2 = fetVar2;
            if (xemVar instanceof uem) {
                fetVar2.e0(708256556);
                fetVar2.r(false);
            } else {
                fetVar2.e0(708182559);
                n(null, xemVar, fetVar2, (i4 << 3) & 112);
                fetVar2.r(false);
            }
            E(null, str6, str4, str5, a1nVar, a1nVar2, fetVar2, ((i3 >> 15) & 8176) | i6 | i7);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k6b(mm40Var, a1nVar, a1nVar2, f2iVar, str, str2, str3, str4, str5, r0nVar, xemVar, i, (byte) 1);
        }
    }

    public static final void l(l7m0 l7m0Var, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(-1009487501);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mdm mdmVar = ((rns) l7m0Var.getValue()).c;
            if (mdmVar != null) {
                fetVar.e0(-281002025);
                n0q n0qVar = o7k0.c;
                tj30 tj30VarC = zq8.c(gqw0.b, false);
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
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new o9s((byte) 18);
                    fetVar.o0(objP);
                }
                fetVar2 = fetVar;
                jcb.l(null, mdmVar, false, (Function0) objP, fetVar2, 3072, 5);
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                fetVar2.e0(-280763697);
                fetVar2.r(false);
            }
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cw0(l7m0Var, i, (byte) 11);
        }
    }

    public static final void m(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i) {
        fetVar.g0(1110263649);
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
            yfe0VarU.d = new gg8(mm40Var, mdmVar, function0, i, (byte) 9);
        }
    }

    public static final void n(mm40 mm40Var, xem xemVar, fet fetVar, int i) {
        byte b2;
        mm40 mm40Var2;
        fetVar.g0(1109694556);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xemVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.c(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 6.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.l, (byte) 11)), gqw0.m, fetVar, 0);
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
            mm40 mm40VarE = o7k0.e(jm40Var, 24.0f);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
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
            if (xemVar instanceof vem) {
                fetVar.e0(2098960117);
                vzb.h(0, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(2099003362);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var2 = jm40Var;
            mm40 mm40VarE2 = o7k0.e(mm40Var2, 24.0f);
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
            if (xemVar instanceof wem) {
                fetVar.e0(1638958572);
                vzb.h(0, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(1639001817);
                fetVar.r(false);
            }
            b2 = 1;
            fetVar.r(true);
            fetVar.r(true);
        } else {
            b2 = 1;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1n(mm40Var2, xemVar, i, b2);
        }
    }

    public static final void o(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1734983976);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarE0 = o2e.e0(i120.Q(jm40.b, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n).e(o7k0.c), "GAME_NOTIFICATION_COLUMN");
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
            int i3 = i2 & 14;
            int i4 = i2 & 126;
            t(l7m0Var, function1, fetVar, i4);
            r(l7m0Var, function1, fetVar, i4);
            l(l7m0Var, fetVar, i3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i, b2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v24 */
    public static final void p(mm40 mm40Var, f2i f2iVar, String str, r0n r0nVar, String str2, fet fetVar, int i) {
        String str3;
        mm40 mm40Var2;
        fet fetVar2;
        jm40 jm40Var;
        boolean z;
        boolean z2;
        fet fetVar3;
        fet fetVar4;
        ?? r1;
        fet fetVar5 = fetVar;
        fetVar5.g0(-2014000047);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar5.g(f2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str;
            i2 |= fetVar5.g(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar5.g(r0nVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar5.g(str2) ? 16384 : 8192;
        }
        if (fetVar5.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var2, 16.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar5, 48);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarE);
            mkd.c0.getClass();
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(e7z.u1);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, thg0VarA, gqw0.x);
            jpm0.o(fetVar5, bh90VarM, gqw0.w);
            jpm0.o(fetVar5, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar5);
            jpm0.o(fetVar5, mm40VarC0, gqw0.v);
            int length = str3.length();
            oro0 oro0Var = oro0.f25744a;
            if (length > 0) {
                fetVar5.e0(-2138344493);
                jm40Var = jm40Var2;
                String str4 = str3;
                z = true;
                j6n.h(str4, oro0Var, null, 0, 0, fetVar5, ((i2 >> 6) & 14) | 48, 28);
                fetVar5.r(false);
            } else {
                jm40Var = jm40Var2;
                z = true;
                fetVar5.e0(-2138196499);
                fetVar5.r(false);
            }
            if (r0nVar instanceof o0n) {
                fetVar5.e0(1732144313);
                fetVar5.r(false);
                z2 = false;
                fetVar3 = fetVar5;
            } else if (r0nVar instanceof p0n) {
                fetVar5.e0(-2138015180);
                p0n p0nVar = (p0n) r0nVar;
                z2 = false;
                rcb.x(null, u1c.O(p0nVar), h2m.c, nsm0.y(p0nVar.b), true, null, fetVar, 384);
                fet fetVar6 = fetVar;
                fetVar6.r(false);
                fetVar3 = fetVar6;
            } else {
                z2 = false;
                if (!(r0nVar instanceof q0n)) {
                    throw b1j.f(1732142280, fetVar5, false);
                }
                fetVar5.e0(-2137609018);
                j6n.h("VAR", oro0Var, null, 0, 0, fetVar5, 54, 28);
                fetVar5.r(false);
                fetVar3 = fetVar5;
            }
            if (str2.length() > 0) {
                fetVar3.e0(-2137368024);
                boolean z3 = ((Configuration) fetVar3.k(dy2.f6873a)).getLayoutDirection() == z ? z : z2;
                int i3 = i2 & 57344;
                boolean z4 = i3 == 16384 ? z : z2;
                Object objP = fetVar3.P();
                Object obj = ukd.f35823a;
                if (z4 || objP == obj) {
                    objP = androidx.compose.runtime.e.e(str2);
                    fetVar3.o0(objP);
                }
                pz40 pz40Var = (pz40) objP;
                String str5 = (String) pz40Var.getValue();
                y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
                long secondary = ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary();
                x7z x7zVar = new x7z(1.0f, z2);
                boolean zH = (i3 == 16384 ? z : false) | fetVar3.h(z3) | fetVar3.g(pz40Var);
                Object objP2 = fetVar3.P();
                if (zH || objP2 == obj) {
                    objP2 = new r91(z3, (Object) str2, (Object) pz40Var, (byte) 11);
                    fetVar3.o0(objP2);
                }
                r1 = 0;
                v8q0.a(str5, x7zVar, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, (Function1) objP2, y9q0Var, fetVar, 0, 24960, 45048);
                fet fetVar7 = fetVar;
                fetVar7.r(false);
                fetVar4 = fetVar7;
            } else {
                boolean z5 = z2;
                fetVar3.e0(-2136317651);
                fetVar3.r(z5);
                r1 = z5;
                fetVar4 = fetVar3;
            }
            if (f2iVar == null) {
                fetVar4.e0(-2136280576);
                fetVar4.r(r1);
            } else {
                fetVar4.e0(-2136280575);
                n4c.d(null, f2iVar, fetVar4, r1);
                fetVar4.r(r1);
            }
            fetVar4.r(z);
            mm40Var2 = jm40Var;
            fetVar2 = fetVar4;
        } else {
            fetVar5.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var2, (Object) f2iVar, (Object) str, (Object) r0nVar, (Object) str2, i, (byte) 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v13 */
    public static final void q(s9n s9nVar, Function1 function1, Function0 function0, fet fetVar, int i) {
        fet fetVar2;
        ?? r14;
        boolean z;
        fetVar.g0(-829570943);
        jm40 jm40Var = jm40.b;
        int i2 = i | (fetVar.g(jm40Var) ? 4 : 2) | (fetVar.g(s9nVar) ? 32 : 16) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            Function0 function2 = e7z.u1;
            if (z2) {
                fetVar.l(function2);
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
            mm40 mm40VarO = ny9.O(1.5f, o7k0.d(jm40Var, 1.0f), false);
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarO);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1536909131, new chh(s9nVar, function1, (byte) 26), fetVar), fetVar, 56);
            y9n y9nVarZ = s9nVar.z();
            jr8 jr8Var = jr8.f16991a;
            if (y9nVarZ == null) {
                fetVar.e0(-857643081);
                fetVar.r(false);
            } else {
                fetVar.e0(-857643080);
                vdb.q(jr8Var.b(jm40Var, gqw0.h), y9nVarZ, fetVar, 0);
                fetVar.r(false);
            }
            if (s9nVar instanceof r9n) {
                fetVar.e0(-857393189);
                zq8.a(0, fetVar, i120.Q(o7k0.c, ((StaticColors) fetVar.k(m8m0.f21378a)).m75getBlack600d7_KjU(), jd8.n));
                fetVar.r(false);
            } else {
                fetVar.e0(-857191379);
                fetVar.r(false);
            }
            mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.c);
            sc00 sc00Var = new sc00(7, null);
            boolean zV = s9nVar.v();
            boolean zA = s9nVar.A();
            boolean z3 = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new y(function0, (byte) 27);
                fetVar.o0(objP);
            }
            f7k.k(mm40VarB, sc00Var, zV, zA, (Function1) objP, fetVar, 0, 0);
            fet fetVar3 = fetVar;
            fetVar3.r(true);
            mm40 mm40VarQ = ffb0.Q(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 48.0f, 0.0f, 11), 1.0f), -1.0f, -1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar3, 0);
            int iHashCode3 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM3 = fetVar3.m();
            mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarQ);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(function2);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, shdVar);
            jpm0.o(fetVar3, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC2, shdVar4);
            p9n p9nVarX = s9nVar.x();
            if (p9nVarX == null) {
                fetVar3.e0(1416474249);
                r14 = 0;
                fetVar3.r(false);
            } else {
                r14 = 0;
                fetVar3.e0(1416474250);
                K(s5x0.N(jm40Var, 0.0f, 0.0f, 2.0f, 0.0f, 11), p9nVarX, fetVar3, 0, 0);
                fetVar3.r(false);
            }
            if (s9nVar.y() != s9nVar.x()) {
                fetVar3.e0(-1755414800);
                p9n p9nVarY = s9nVar.y();
                if (p9nVarY == null) {
                    fetVar3.e0(1416716049);
                    fetVar3.r(r14);
                    z = true;
                } else {
                    fetVar3.e0(1416716050);
                    z = true;
                    K(null, p9nVarY, fetVar3, r14, 1);
                    fetVar3.r(r14);
                }
                fetVar3.r(r14);
            } else {
                z = true;
                fetVar3.e0(1416753963);
                fetVar3.r(r14);
            }
            fetVar3.r(z);
            fetVar3.r(z);
            fetVar2 = fetVar3;
        } else {
            fet fetVar4 = fetVar;
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(s9nVar, function1, function0, i, (byte) 8);
        }
    }

    public static final void r(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        yfe0 yfe0VarU;
        quh quhVar;
        fetVar.g0(-1253741074);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (((rns) l7m0Var.getValue()).c != null) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    quhVar = new quh(l7m0Var, function1, i, (byte) 19);
                }
            } else {
                u(((i2 << 3) & 896) | 6, fetVar, ((rns) l7m0Var.getValue()).d, o7k0.c, function1);
            }
            yfe0VarU.d = quhVar;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            quhVar = new quh(l7m0Var, function1, i, (byte) 20);
            yfe0VarU.d = quhVar;
        }
    }

    public static final void s(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1, boolean z) {
        int i2;
        a4x a4xVar2;
        mm40 mm40VarV;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(-592482749);
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(12.0f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(a4xVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = pkd.d(fetVar) ? 2 : 1;
            mez mezVarQ = gfx.Q(fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(mezVarQ);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new rcz(mezVarQ, (byte) 23);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            e2d e2dVar = (e2d) fetVar.k(nip.f23600a);
            if (e2dVar != null) {
                fetVar.e0(1662653857);
                boolean zG2 = fetVar.g(l7m0VarY);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == obj) {
                    objP2 = new x000(l7m0VarY, b2);
                    fetVar.o0(objP2);
                }
                mm40VarV = cjx.V(mm40Var, e2d.b(e2dVar, (Function0) objP2), null);
                fetVar.r(false);
            } else {
                fetVar.e0(1662812391);
                fetVar.r(false);
                mm40VarV = mm40Var;
            }
            mm40 mm40VarE = mm40VarV.e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.L(mm40VarE, qmk.a(fetVar).d, 0.0f, 2), "LAZY_VERTICAL_GRID_GAMES");
            y3m0 y3m0Var = new y3m0(i3);
            qw3 qw3Var = new qw3(8.0f, true, new gne(gqw0.n, (byte) 12));
            lh80 lh80VarU = s5x0.u(0.0f, 12.0f, 0.0f, 24.0f, 5);
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | ((i2 & 57344) == 16384);
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj) {
                a4xVar2 = a4xVar;
                objP3 = new uy0(a4xVar2, z, function1, b2);
                fetVar.o0(objP3);
            } else {
                a4xVar2 = a4xVar;
            }
            ydx.f(y3m0Var, mm40VarE0, mezVarQ, lh80VarU, 8.0f, qw3Var, null, false, null, (Function1) objP3, fetVar, 0, 912);
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vy0(mm40Var, z, a4xVar2, function1, i, (byte) 3);
        }
    }

    public static final void t(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-1723005486);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            boolean zG = fetVar.g(((rns) l7m0Var.getValue()).f30804a) | fetVar.f(backgroundContent) | fetVar.f(secondary);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                imm immVar = new imm(new ilm(secondary), new plm(((rns) l7m0Var.getValue()).f30804a, secondary, fa50.f9191a), fmm.f9790a, backgroundContent, false, null);
                fetVar.o0(immVar);
                objP = immVar;
            }
            imm immVar2 = (imm) objP;
            boolean z = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new hcr(function1, (byte) 19);
                fetVar.o0(objP2);
            }
            hlm.c(null, immVar2, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, 0, 54, 1013);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i, (byte) 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    public static final void u(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        int i2;
        String strM;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1115228556);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        boolean z5 = false;
        boolean z6 = true;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarA0 = wha0.a0(mm40Var, wha0.T(fetVar2), false, 14);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o050.S(s5x0.M(mm40VarA0, xfn.a(fetVar2).d, 12.0f, xfn.a(fetVar2).d, 24.0f));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            Iterator itO = h97.o(fetVar2, mm40VarC0, gqw0.v, 976041787, a4xVar);
            int i3 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                p6t0 p6t0Var = (p6t0) next;
                if (p6t0Var == null) {
                    strM = dw9.m(i3, Separators.SP, p6t0Var.getKey());
                } else if (p6t0Var instanceof rsv) {
                    strM = ((rsv) p6t0Var).f31051a;
                } else if (p6t0Var instanceof b760) {
                    NotificationInfoUiModel notificationInfoUiModel = ((b760) p6t0Var).f2089a;
                    j760 j760Var = notificationInfoUiModel.f46676a;
                    long j = notificationInfoUiModel.e;
                    long j2 = notificationInfoUiModel.d;
                    StringBuilder sb = new StringBuilder();
                    sb.append(j760Var);
                    sb.append(j);
                    sb.append(j2);
                    strM = sb.toString();
                } else {
                    strM = dw9.m(i3, Separators.SP, p6t0Var.getKey());
                }
                fetVar2.b0(-1467986155, strM);
                boolean z7 = p6t0Var instanceof srv;
                jm40 jm40Var = jm40.b;
                if (z7) {
                    fetVar2.e0(-1467983906);
                    zcl zclVar2 = qmk.f28987a;
                    z = z6;
                    nkb.h(s5x0.N(jm40Var, 0.0f, 28.0f, 0.0f, 12.0f, 5), new ijm(), kjm.b, null, null, null, fetVar2, 384, 56);
                    z2 = false;
                    fetVar2.r(false);
                } else {
                    z = z6;
                    fet fetVar3 = fetVar2;
                    z2 = false;
                    if (p6t0Var instanceof dqj0) {
                        fetVar3.e0(-1467972266);
                        dqj0 dqj0Var = (dqj0) p6t0Var;
                        ckb.y(dqj0Var.f6519a, dqj0Var.b, fetVar3, 0);
                        fetVar3.r(false);
                        fetVar2 = fetVar3;
                        z3 = z2;
                        z4 = z;
                    } else if (p6t0Var instanceof rsv) {
                        fetVar3.e0(-1467966677);
                        zcl zclVar3 = qmk.f28987a;
                        fetVar2 = fetVar3;
                        nkb.h(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), new hjm(((rsv) p6t0Var).f31051a, new ojm(127), new y3d(((ThemeColors) fetVar3.k(zaq0.b)).getSecondary()), null, null, null, false, null, null, false, null, null, 8184), kjm.b, null, null, null, fetVar2, 384, 56);
                        z2 = false;
                        fetVar2.r(false);
                    } else {
                        fetVar2 = fetVar3;
                        if (p6t0Var instanceof b760) {
                            fetVar2.e0(1738183221);
                            b760 b760Var = (b760) p6t0Var;
                            rqm rqmVar = b760Var.b;
                            boolean zG = fetVar2.g(b760Var);
                            Object objP = fetVar2.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zG || objP == cl5Var) {
                                objP = dw9.j(fetVar2);
                            }
                            gy40 gy40Var = (gy40) objP;
                            boolean zG2 = ((i2 & 896) == 256 ? z : false) | fetVar2.g(p6t0Var);
                            Object objP2 = fetVar2.P();
                            if (zG2 || objP2 == cl5Var) {
                                objP2 = new vwj(function1, p6t0Var, (byte) 3);
                                fetVar2.o0(objP2);
                            }
                            i2 = i2;
                            z3 = false;
                            z4 = z;
                            obc.q(null, rqmVar, false, gy40Var, null, null, (Function0) objP2, null, fetVar, 0, Response.CALL_IS_BEING_FORWARDED);
                            fetVar2 = fetVar;
                            fetVar2.r(false);
                        } else {
                            i2 = i2;
                            z3 = false;
                            z4 = z;
                            fetVar2.e0(1738803624);
                            fetVar2.r(false);
                        }
                    }
                    fetVar2.r(z3);
                    z5 = z3;
                    z6 = z4;
                    i3 = i4;
                    i2 = i2;
                }
                z3 = z2;
                z4 = z;
                fetVar2.r(z3);
                z5 = z3;
                z6 = z4;
                i3 = i4;
                i2 = i2;
            }
            fetVar2.r(z5);
            fetVar2.r(z6);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(mm40Var, a4xVar, function1, i, (byte) 8);
        }
    }

    public static final void v(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(2103036817);
        int i2 = (fetVar.i(function1) ? 256 : 128) | i;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            jwb.p(s5x0.L(mm40VarD, 16.0f, 0.0f, 2), new qw3(8.0f, true, new jf4((byte) 14)), null, null, 0, 0, u1c.M(2029481548, new xs4(l7m0Var, function1, (byte) 19), fetVar), fetVar, 1572864, 60);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o71(l7m0Var, function1, i, (byte) 10);
        }
    }

    public static final void w(int i, fet fetVar, d9z d9zVar, l7m0 l7m0Var, Function1 function1) {
        d9z d9zVar2;
        d9zVar.getClass();
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1312307764);
        int i2 = (fetVar.g(d9zVar) ? 4 : 2) | i | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            vx60 vx60Var = (vx60) l7m0Var.getValue();
            clo cloVarB = lyq0.b(ob3.d(0, 7, fetVar), fetVar, 24576);
            Object value = l7m0Var.getValue();
            boolean zG = ((i2 & 112) == 32) | fetVar.g(cloVarB);
            Object objP = fetVar.P();
            yje yjeVar = null;
            if (zG || objP == ukd.f35823a) {
                objP = new kx60(l7m0Var, cloVarB, yjeVar, b2);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, value, (Function2) objP);
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarE0 = o2e.e0(cjx.V(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n), cloVarB.e, null), "ONE_X_GAMES_FAVORITES_COLUMN");
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
            piz.m(null, cloVarB, u1c.M(804947104, new s000(l7m0Var, function1, (byte) 27), fetVar), u1c.M(687310335, new jt50(vx60Var, function1, (byte) 17), fetVar), fetVar, 3456);
            if (vx60Var != null) {
                if (vx60Var instanceof ux60) {
                    fetVar.e0(1598198705);
                    I(0, fetVar);
                    fetVar.r(false);
                } else {
                    if (vx60Var instanceof tx60) {
                        fetVar.e0(1598273291);
                        H((tx60) vx60Var, function1, fetVar, (i2 >> 3) & 112);
                        fetVar.r(false);
                    } else if (vx60Var instanceof sx60) {
                        fetVar.e0(1598449371);
                        d9zVar2 = d9zVar;
                        G(d9zVar2, ((sx60) vx60Var).b, function1, fetVar, i2 & 910);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                }
                d9zVar2 = d9zVar;
                fetVar.r(true);
            }
            throw b1j.f(190101050, fetVar, false);
        }
        d9zVar2 = d9zVar;
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(d9zVar2, l7m0Var, function1, i, (byte) 9);
        }
    }

    public static final void x(mm40 mm40Var, a1n a1nVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-678132262);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(a1nVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 24.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            d280 d280Var = a1nVar.b;
            int i3 = a1nVar.c;
            if (d280Var != null) {
                fetVar2.e0(-216239510);
                boolean zG = fetVar2.g(d280Var);
                Object objP = fetVar2.P();
                cl5 cl5Var = ukd.f35823a;
                if (zG || objP == cl5Var) {
                    objP = new u6n(d4d.SECONDARY60, w6n.j, d280Var);
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
                fetVar2.r(false);
            } else {
                fetVar2.e0(-215845500);
                fetVar2.r(false);
            }
            v8q0.a(a1nVar.f78a, new x7z(1.0f, false), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.p, g1t0.m().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, g1t0.m(), fetVar, 0, 24960, 108528);
            fetVar2 = fetVar;
            if (i3 != 0) {
                fetVar2.e0(-215270698);
                tdc.e(new rpe(i3), ipe.f15159a, null, fetVar2, 48, 4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-215103484);
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
            yfe0VarU.d = new n0n((Object) mm40Var2, (Object) a1nVar, i, (byte) 2);
        }
    }

    public static final void y(mm40 mm40Var, f2i f2iVar, String str, String str2, a1n a1nVar, a1n a1nVar2, r0n r0nVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(75740585);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(f2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(a1nVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(a1nVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(r0nVar) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.l, (byte) 11)), gqw0.m, fetVar, 0);
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
            int i3 = i2 >> 9;
            p(null, f2iVar, str, r0nVar, str2, fetVar, (i2 & 1008) | (i3 & 7168) | ((i2 << 3) & 57344));
            x(null, a1nVar, fetVar, i3 & 112);
            x(null, a1nVar2, fetVar, (i2 >> 12) & 112);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49((Object) mm40Var, (Object) f2iVar, (Object) str, (Object) str2, (Object) a1nVar, (Object) a1nVar2, (Object) r0nVar, i, (byte) 13);
        }
    }

    public static final void z(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-893497607);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            jwb.p(s5x0.L(mm40VarD, 16.0f, 0.0f, 2), new qw3(8.0f, true, new jf4((byte) 14)), null, null, 0, 0, u1c.M(722426356, new xs4(l7m0Var, function1, (byte) 20), fetVar), fetVar, 1572864, 60);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cn(i, l7m0Var, function1);
        }
    }
}
