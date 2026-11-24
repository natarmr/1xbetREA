package a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.game.GameStatistic;
import org.xplatform.betting.core.zip.model.zip.game.StatInfo;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v3c {
    public static final void A(Function0 function0, Function0 function1, clz clzVar, fet fetVar, int i, int i2) {
        int i3;
        int i4;
        Function0 function2;
        Function0 function3;
        clz clzVar2;
        fetVar.g0(1709853210);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (fetVar.i(function0) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (fetVar.i(function1) ? 32 : 16);
        }
        int i7 = i4 | 128;
        byte b = 1;
        if (fetVar.U(i7 & 1, (i7 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                if (i5 != 0) {
                    function0 = null;
                }
                if (i6 != 0) {
                    function1 = null;
                }
                clzVar = (clz) fetVar.k(or00.f25714a);
            } else {
                fetVar.X();
            }
            int i8 = i7 & (-897);
            Function0 function4 = function0;
            clz clzVar3 = clzVar;
            fetVar.s();
            boolean z = ((i8 & 14) == 4) | ((i8 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new yhd(function4, function1, b);
                fetVar.o0(objP);
            }
            Function0 function5 = function1;
            s0x.h(function4, function5, clzVar3, (Function1) objP, fetVar, i8 & 1022, 0);
            function2 = function4;
            function3 = function5;
            clzVar2 = clzVar3;
        } else {
            fetVar.X();
            function2 = function0;
            function3 = function1;
            clzVar2 = clzVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51(function2, function3, clzVar2, i, i2);
        }
    }

    public static final void B(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        mm40 mm40Var2;
        fetVar.g0(-2014076209);
        byte b = 2;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            j6n.h(rsm0.w(R.string.live_new, 0, fetVar), hro0.f13541a, mm40Var2, 0, 0, fetVar2, ((i2 << 6) & 896) | 48, 24);
        } else {
            fetVar2 = fetVar;
            mm40Var2 = mm40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var2, i, b);
        }
    }

    public static final void C(mm40 mm40Var, String str, u6n u6nVar, u12 u12Var, fet fetVar, int i) {
        fet fetVar2;
        u12 u12Var2;
        fetVar.g0(1960070565);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(u6nVar) ? 256 : 128) | 3072;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            u12Var2 = gqw0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 54.0f);
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
            mm40 mm40VarN = s5x0.N(ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            long j = qmk.q;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            long j2 = g1t0.m().f42262a.b;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            kc5.N(str, mm40VarN, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, null, 0L, j, j2, null, null, 0L, u12Var2, 2, false, 3, 0, false, null, g1t0.m(), 0.0f, fetVar, (i2 >> 3) & 14, 1600512, 0, 3055416);
            fetVar2 = fetVar;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new d1n(u6nVar, (byte) 0);
                fetVar2.o0(objP);
            }
            kkb.p(1, fetVar2, null, (Function0) objP);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            u12Var2 = u12Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e1n(mm40Var, str, u6nVar, u12Var2, i, (byte) 0);
        }
    }

    public static final void D(mm40 mm40Var, String str, u6n u6nVar, u12 u12Var, fet fetVar, int i) {
        u12 u12Var2;
        fetVar.g0(428461183);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(u6nVar) ? 256 : 128) | 3072;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zx7 zx7Var = gqw0.f11754a;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 54.0f);
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
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new d1n(u6nVar, (byte) 0);
                fetVar.o0(objP);
            }
            kkb.p(1, fetVar, null, (Function0) objP);
            mm40 mm40VarN = s5x0.N(new x7z(1.0f, true), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            long j = qmk.q;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            long j2 = g1t0.m().f42262a.b;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            kc5.N(str, mm40VarN, ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, null, 0L, j, j2, null, null, 0L, zx7Var, 2, false, 3, 0, false, null, g1t0.m(), 0.0f, fetVar, (i2 >> 3) & 14, 1600512, 0, 3055416);
            fetVar.r(true);
            u12Var2 = zx7Var;
        } else {
            fetVar.X();
            u12Var2 = u12Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e1n(mm40Var, str, u6nVar, u12Var2, i, (byte) 1);
        }
    }

    public static final void E(ArrayList arrayList, List list, Set set, Set set2, fet fetVar, int i) {
        fetVar.g0(-720826424);
        int i2 = (i & 6) == 0 ? (fetVar.i(arrayList) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(set) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(set2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(arrayList, fetVar);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(list, fetVar);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = ((ob50) arrayList.get(i3)).b;
                set.add(obj);
                List listL0 = CollectionsKt.L0(arrayList);
                boolean zG = fetVar.g(pz40VarF) | fetVar.i(obj) | fetVar.i(set) | fetVar.i(set2) | fetVar.g(pz40VarF2);
                Object objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    dg dgVar = new dg(obj, set, set2, pz40VarF, pz40VarF2, (byte) 13);
                    fetVar.o0(dgVar);
                    objP = dgVar;
                }
                m0x0.n(obj, listL0, (Function1) objP, fetVar);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 2, i, (Object) arrayList, (Object) list, (Object) set, (Object) set2);
        }
    }

    public static final void F(mm40 mm40Var, lpm lpmVar, boolean z, fet fetVar, int i) {
        fetVar.g0(1129374248);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(lpmVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            n4c.l(o7k0.e(s5x0.L(mm40Var, 8.0f, 0.0f, 2), 54.0f), lpmVar, z, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f1n(mm40Var, lpmVar, z, i, (byte) 0);
        }
    }

    public static final void G(int i, int i2, long j, fet fetVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(-1271674115);
        int i3 = i2 | 6 | (fetVar.e(i) ? 32 : 16) | (fetVar.f(j) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            l7m0 l7m0VarB = m5k0.b(j, ro4.m0(0, 0, ihn.d, 3), fetVar, (i3 >> 6) & 14, 12);
            pm80 pm80VarF = a8k0.F(i, (i3 >> 3) & 14, fetVar);
            long j2 = ((y3d) l7m0VarB.getValue()).f41946a;
            jm40 jm40Var = jm40.b;
            dww.c(pm80VarF, null, jm40Var, j2, fetVar, 440, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w1m(mm40Var2, i, j, i2, (byte) 2);
        }
    }

    public static final void H(mm40 mm40Var, a4x a4xVar, ljw ljwVar, pz40 pz40Var, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z;
        long jD;
        Function1 function2 = function1;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar.g0(-1254306707);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(ljwVar) : fetVar.i(ljwVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(pz40Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar, shdVar2, fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, shdVar, 875580935, a4xVar);
            int i3 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                int iIntValue = ((Number) next).intValue();
                fetVar.b0(-733763930, Integer.valueOf(iIntValue));
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = dw9.j(fetVar);
                }
                gy40 gy40Var = (gy40) objP;
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarN = o7k0.n(jm40.b, 44.0f);
                ucg0 ucg0Var = new ucg0(4);
                boolean zE = ((i2 & 57344) == 16384) | fetVar.e(i3);
                Object objP2 = fetVar.P();
                if (zE || objP2 == cl5Var) {
                    objP2 = new re1(function2, i3, (byte) 9);
                    fetVar.o0(objP2);
                }
                mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarN, gy40Var, null, false, ucg0Var, (Function0) objP2, 12), "HOME_SEGMENT");
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int i5 = i2;
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE0);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                if (i3 == ((Number) pz40Var.getValue()).intValue()) {
                    fetVar.e0(327608305);
                    jD = ljwVar.a(fetVar);
                    z = false;
                    fetVar.r(false);
                } else {
                    z = false;
                    fetVar.e0(327698639);
                    jD = ljwVar.d(fetVar);
                    fetVar.r(false);
                }
                G(iIntValue, 0, jD, fetVar, null);
                fetVar.r(true);
                fetVar.r(z);
                i2 = i5;
                pcyVar = pcyVar;
                i3 = i4;
                function2 = function1;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) a4xVar, (Object) ljwVar, (Object) pz40Var, (Object) function1, i, (byte) 4);
        }
    }

    public static final void I(mm40 mm40Var, yjj0 yjj0Var, ljw ljwVar, pz40 pz40Var, fet fetVar, int i) {
        pz40 pz40Var2;
        mm40 mm40Var2;
        fetVar.g0(566106554);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(yjj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(ljwVar) : fetVar.i(ljwVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            pz40Var2 = pz40Var;
            i2 |= fetVar.g(pz40Var2) ? 2048 : 1024;
        } else {
            pz40Var2 = pz40Var;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            float fFloatValue = ((Number) d43.b(52.0f * ((Number) pz40Var2.getValue()).intValue(), ro4.m0(160, 0, ihn.d, 2), null, null, fetVar, 0, 28).getValue()).floatValue();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(ffb0.R(jm40Var, fFloatValue, 0.0f, 2), 44.0f);
            float fC = ljwVar.c(fetVar);
            ljwVar.e(fetVar);
            zq8.a(0, fetVar, i120.Q(s5x0.K(mm40VarN, fC, 4.0f), ljwVar.b(fetVar), yjj0Var));
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 8, i, (Object) mm40Var2, (Object) yjj0Var, (Object) ljwVar, (Object) pz40Var);
        }
    }

    public static final void J(int i, int i2, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fetVar.g0(971994830);
        int i3 = i2 | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.e(i) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 >> 3;
            s4u0 s4u0VarR = iom0.r(jpm0.t(i, (i4 & 112) | 6, fetVar), fetVar);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            int i5 = (i4 & 14) | 36912;
            mm40Var2 = jm40Var;
            k7x.b(str, null, o7k0.n(jm40Var, 16.0f), s4u0VarR, s4u0VarR, null, null, null, null, null, null, new m78(StaticColors.INSTANCE.m131getWhite800d7_KjU(), 5), fetVar, i5, 0, 28640);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var2, str, i, i2, (byte) 16);
        }
    }

    public static final qkf K(List list, jpf jpfVar) {
        list.getClass();
        jpfVar.getClass();
        if (jpfVar.h) {
            return qkf.f28881a;
        }
        if (jpfVar.i) {
            return qkf.b;
        }
        if (jpfVar.f) {
            return qkf.c;
        }
        if (jpfVar.g) {
            return qkf.d;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            jpf jpfVar2 = (jpf) obj;
            if (!jpfVar2.h && !jpfVar2.f && !jpfVar2.i && !jpfVar2.g) {
                arrayList.add(obj);
            }
        }
        return (arrayList.size() != 1 || list.size() == 1) ? qkf.f : qkf.e;
    }

    public static final long L(long j, long j2, Function1 function1) {
        List listL0 = CollectionsKt.L0(new IntRange((int) daq0.c(j2), (int) daq0.c(j), 1));
        int i = q3d.i(listL0);
        int i2 = 0;
        while (i2 <= i) {
            int iD = hne.d(i, i2, 2, i2);
            if (((Boolean) function1.invoke(new daq0(idm0.t(((Number) listL0.get(iD)).intValue())))).booleanValue()) {
                i = iD - 1;
            } else {
                i2 = iD + 1;
            }
        }
        return i != -1 ? idm0.t(((Number) listL0.get(i)).intValue()) : j2;
    }

    public static final boolean M(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = iun.f15405a;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    tai0 tai0Var = (tai0) obj2;
                    tai0 tai0Var2 = (tai0) obj;
                    arrayList2.add(new ne60((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (tai0Var2.g().e() >> 32)) - Float.intBitsToFloat((int) (tai0Var.g().e() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (tai0Var2.g().e() & 4294967295L)) - Float.intBitsToFloat((int) (tai0Var.g().e() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((ne60) CollectionsKt.U(list)).f23370a;
            } else {
                if (list.isEmpty()) {
                    qf00.c("Empty collection can't be reduced.");
                }
                Object objU = CollectionsKt.U(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objU = new ne60(ne60.f(((ne60) objU).f23370a, ((ne60) list.get(i2)).f23370a));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((ne60) objU).f23370a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final void N(bby bbyVar) {
        if (bbyVar == null || !bbyVar.isActive()) {
            return;
        }
        bbyVar.cancel(null);
    }

    public static final ob50 O(ob50 ob50Var, List list, Set set, Set set2, fet fetVar, int i) {
        fetVar.e0(-1239021605);
        pz40 pz40VarF = androidx.compose.runtime.e.f(list, fetVar);
        Object obj = ob50Var.b;
        fetVar.b0(-993800456, obj);
        ob50 ob50Var2 = new ob50(ob50Var, u1c.M(-1349345695, new s49(set2, obj, set, pz40VarF, list, ob50Var, (byte) 5), fetVar));
        fetVar.r(false);
        fetVar.r(false);
        return ob50Var2;
    }

    public static final boolean P(q16 q16Var) {
        q16Var.getClass();
        kuw kuwVar = q16Var.c;
        if (kuwVar == i2o.SimplePasswordError || kuwVar == i2o.RepeatCharsInPasswordError || kuwVar == i2o.CommonPasswordError || kuwVar == i2o.UnacceptableSymbolsPasswordError || kuwVar == i2o.UsedBeforePasswordError) {
            throw new u3c(q16Var.f27936a);
        }
        return ((Boolean) q16Var.a()).booleanValue();
    }

    public static final long Q(ipm ipmVar) {
        if (ipmVar instanceof gpm) {
            pz40 pz40Var = s6t0.f31722a;
            return StaticColors.INSTANCE.m123getWhite0d7_KjU();
        }
        if (ipmVar instanceof hpm) {
            pz40 pz40Var2 = s6t0.f31722a;
            return s6t0.b().f33626a.getTextPrimary();
        }
        t9f.b();
        return 0L;
    }

    public static final boolean R(Context context, String str) {
        return (context == null || context.getApplicationContext().getPackageManager().getLaunchIntentForPackage(str) == null) ? false : true;
    }

    public static final boolean S(d0t d0tVar) {
        d0tVar.getClass();
        if (d0tVar.v == tvg.d.b) {
            return true;
        }
        return d0tVar.C ? qzb.H0(d0tVar) : qzb.E0(d0tVar);
    }

    public static final void T(Context context, String str) {
        if (context == null) {
            return;
        }
        Intent launchIntentForPackage = context.getApplicationContext().getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        } else {
            launchIntentForPackage = null;
        }
        if (launchIntentForPackage != null) {
            context.startActivity(launchIntentForPackage);
        } else {
            U(context, str);
        }
    }

    public static final void U(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("market://details?id=".concat(str))));
        } catch (ActivityNotFoundException unused) {
            context.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://play.google.com/store/apps/details?id=".concat(str))));
        }
    }

    public static final ArrayList V(List list, List list2, fet fetVar, int i) {
        List list3;
        fet fetVar2;
        ArrayList arrayList;
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (objP == cl5Var) {
            objP = new LinkedHashSet();
            fetVar.o0(objP);
        }
        Set set = (Set) objP;
        Object objP2 = fetVar.P();
        if (objP2 == cl5Var) {
            objP2 = new LinkedHashSet();
            fetVar.o0(objP2);
        }
        Set set2 = (Set) objP2;
        fetVar.e0(110758886);
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                List list4 = list2;
                arrayList.add(O((ob50) list.get(i2), list4, set, set2, fetVar, i & 112));
                i2++;
                list2 = list4;
            }
            list3 = list2;
            fetVar2 = fetVar;
        } else {
            list3 = list2;
            fetVar2 = fetVar;
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(O((ob50) it.next(), list3, set, set2, fetVar2, i & 112));
            }
        }
        ArrayList arrayList2 = arrayList;
        fetVar2.r(false);
        E(arrayList2, list3, set, set2, fetVar2, i & 112);
        return arrayList2;
    }

    public static final ArrayList W(List list, List list2, Function1 function1, fet fetVar, int i) {
        ArrayList arrayList;
        boolean zG = fetVar.g(CollectionsKt.L0(list));
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            if (list instanceof RandomAccess) {
                arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add((ob50) function1.invoke(list.get(i2)));
                }
            } else {
                arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((ob50) function1.invoke(it.next()));
                }
            }
            objP = arrayList;
            fetVar.o0(objP);
        }
        return V((List) objP, list2, fetVar, i & 112);
    }

    public static final ezj X(fet fetVar) {
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            objP = new ezj();
            fetVar.o0(objP);
        }
        return (ezj) objP;
    }

    public static final l7m0 Y(Object[] objArr, Function0 function0, fet fetVar) {
        function0.getClass();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zE = fetVar.e(objArrCopyOf.length);
        for (Object obj : objArrCopyOf) {
            zE |= fetVar.g(obj);
        }
        Object objP = fetVar.P();
        if (zE || objP == ukd.f35823a) {
            objP = jgk0.b(function0);
            fetVar.o0(objP);
        }
        return (l7m0) objP;
    }

    public static final pz40 Z(Object obj, Object[] objArr, fet fetVar) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zE = fetVar.e(objArrCopyOf.length);
        for (Object obj2 : objArrCopyOf) {
            zE |= fetVar.g(obj2);
        }
        Object objP = fetVar.P();
        if (zE || objP == ukd.f35823a) {
            objP = androidx.compose.runtime.e.e(obj);
            fetVar.o0(objP);
        }
        return (pz40) objP;
    }

    public static final void a(mm40 mm40Var, hye hyeVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(286249710);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.e(hyeVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var);
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40 mm40VarM = s5x0.M(y860.Y(i120.Q(mm40VarE, staticColors.m125getWhite100d7_KjU(), jd8.n), false, null, null, function0, 15), 6.0f, 4.0f, 10.0f, 4.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
            j0x.b(iom0.r(jpm0.t(hyeVar.f13855a, 6, fetVar2), fetVar2), null, o7k0.n(jm40Var, 16.0f), null, null, 0.0f, new m78(staticColors.m123getWhite0d7_KjU(), 5), fetVar2, 56, 56);
            mm40 mm40VarE0 = o2e.e0(s5x0.N(o7k0.y(jm40Var, null, 3), 4.0f, 0.0f, 0.0f, 0.0f, 14), "BET_SLIP_ADD_REMOVE_BUTTON");
            String strW = rsm0.w(hyeVar.b, 0, fetVar2);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(strW, mm40VarE0, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(g1t0.d(), staticColors.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 0, 131068);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var, (Object) hyeVar, (Object) function0, i, (byte) 13);
        }
    }

    public static final pz40 a0(Object obj, Object[] objArr, fet fetVar, int i) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        byte b = 0;
        boolean z = (((i & 14) ^ 6) > 4 && fetVar.i(obj)) || (i & 6) == 4;
        Object objP = fetVar.P();
        if (z || objP == ukd.f35823a) {
            objP = new xhd(obj, b);
            fetVar.o0(objP);
        }
        return (pz40) e9x.Q(objArrCopyOf, (Function0) objP, fetVar, 0);
    }

    public static final void b(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(863692857);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(mm40Var, 180.0f, 248.0f);
            int i3 = ((i2 << 6) & 7168) | 48;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarP);
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
            ua80.p(((i3 >> 6) & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i23(mm40Var, ugdVar, i, b);
        }
    }

    public static final void b0(k7 k7Var, tai0 tai0Var) {
        Object objG = tai0Var.k().f23193a.g(xai0.g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            hny.b();
            return;
        }
        tai0 tai0VarL = tai0Var.l();
        if (tai0VarL == null) {
            return;
        }
        Object objG2 = tai0VarL.k().f23193a.g(xai0.e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = tai0VarL.k().f23193a.g(xai0.f);
            m3d m3dVar = (m3d) (objG3 != null ? objG3 : null);
            if (m3dVar == null || (m3dVar.f21109a >= 0 && m3dVar.b >= 0)) {
                if (tai0Var.k().f23193a.c(xai0.K)) {
                    ArrayList arrayList = new ArrayList();
                    List listI = tai0VarL.i((4 & 1) != 0 ? !tai0VarL.b : false, (4 & 2) == 0);
                    int size = listI.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        tai0 tai0Var2 = (tai0) listI.get(i2);
                        if (tai0Var2.k().f23193a.c(xai0.K)) {
                            arrayList.add(tai0Var2);
                            if (tai0Var2.c.w() < tai0Var.c.w()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zM = M(arrayList);
                    int i3 = zM ? 0 : i;
                    int i4 = zM ? i : 0;
                    Object objG4 = tai0Var.k().f23193a.g(xai0.K);
                    if (objG4 == null) {
                        objG4 = Boolean.FALSE;
                    }
                    k7Var.l(j7.a(((Boolean) objG4).booleanValue(), i3, 1, i4, 1));
                }
            }
        }
    }

    public static final void c(final int i, final int i2, fet fetVar, final int i3) {
        fetVar.g0(596135614);
        int i4 = (fetVar.e(i) ? 4 : 2) | i3;
        if ((i3 & 48) == 0) {
            i4 |= fetVar.e(i2) ? 32 : 16;
        }
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(jm40.b, 164.0f, 232.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            j0x.b(a8k0.F(i, i4 & 14, fetVar), null, h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), null, null, l1e0.d(i2, 0, 100) / 100.0f, null, fetVar, 56, 88);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.zoh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i3 | 1);
                    v3c.c(i, i2, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public static final v3g c0(c4g c4gVar) {
        ?? arrayList;
        List<z3g> list;
        Boolean bool;
        Integer num;
        int iIntValue = (c4gVar == null || (num = c4gVar.f3723a) == null) ? 0 : num.intValue();
        boolean zBooleanValue = (c4gVar == null || (bool = c4gVar.b) == null) ? false : bool.booleanValue();
        if (c4gVar == null || (list = c4gVar.c) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (z3g z3gVar : list) {
                z3gVar.getClass();
                String str = z3gVar.f43715a;
                if (str == null) {
                    str = "";
                }
                Integer num2 = z3gVar.b;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                Integer num3 = z3gVar.c;
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                Integer num4 = z3gVar.d;
                int iIntValue4 = num4 != null ? num4.intValue() : 0;
                Float f = z3gVar.e;
                float fFloatValue = 0.0f;
                float fFloatValue2 = f != null ? f.floatValue() : 0.0f;
                Float f2 = z3gVar.f;
                float fFloatValue3 = f2 != null ? f2.floatValue() : 0.0f;
                Float f3 = z3gVar.g;
                if (f3 != null) {
                    fFloatValue = f3.floatValue();
                }
                arrayList.add(new w3g(str, iIntValue2, iIntValue3, iIntValue4, fFloatValue2, fFloatValue3, fFloatValue));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new v3g(iIntValue, arrayList, zBooleanValue);
    }

    public static final void d(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        fetVar.g0(-922601589);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ugd ugdVarM = u1c.M(1291127739, new yoh(a4xVar, b), fetVar);
            jm40 jm40Var = jm40.b;
            b(jm40Var, ugdVarM, fetVar, 54);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i, (byte) 4);
        }
    }

    public static final nyg d0(xah xahVar) {
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

    public static final void e(mm40 mm40Var, a4x a4xVar, a4x a4xVar2, fet fetVar, int i) {
        mm40 mm40Var2;
        a4xVar.getClass();
        a4xVar2.getClass();
        fetVar.g0(1331119422);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(a4xVar2) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            ugd ugdVarM = u1c.M(2063317358, new qx7(a4xVar, a4xVar2, b), fetVar);
            jm40 jm40Var = jm40.b;
            b(jm40Var, ugdVarM, fetVar, 54);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var2, a4xVar, a4xVar2, i, (byte) 2);
        }
    }

    public static final jl9 e0(c5g c5gVar, o4g o4gVar, int i) {
        c5gVar.getClass();
        o4gVar.getClass();
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        calendar.setTime(new Date());
        Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        List list = o4gVar.b;
        calendar2.set(((d5g) CollectionsKt.d0(list)).f5503a, ((Number) CollectionsKt.i0(((d5g) CollectionsKt.d0(list)).b)).intValue() - 1, calendar2.getActualMaximum(5));
        int i2 = 0;
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        Calendar calendar3 = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        calendar3.set(((d5g) CollectionsKt.U(list)).f5503a, ((Number) CollectionsKt.l0(((d5g) CollectionsKt.U(list)).b)).intValue() - 1, calendar2.getActualMinimum(5));
        calendar3.set(11, 0);
        calendar3.set(12, 0);
        calendar3.set(13, 0);
        Calendar calendar4 = Calendar.getInstance();
        calendar4.set(c5gVar.f3770a, c5gVar.b, c5gVar.c);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (calendar2.after(calendar3)) {
            arrayList.add(fre0.T(calendar, calendar3));
            if (calendar3.get(2) == calendar4.get(2) && calendar3.get(1) == calendar4.get(1)) {
                i2 = i3;
            }
            Date time = calendar3.getTime();
            time.getClass();
            arrayList2.add(time);
            calendar3.add(2, 1);
            i3++;
        }
        if (i == -1) {
            i = i2;
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add("  " + ((String) it.next()) + "  ");
        }
        return new jl9(i, arrayList3, arrayList2);
    }

    public static final void f(mm40 mm40Var, u1i u1iVar, u1i u1iVar2, boolean z, c4i c4iVar, b4i b4iVar, Function0 function0, Function0 function1, fet fetVar, int i) {
        k6z k6zVar;
        function0.getClass();
        function1.getClass();
        fetVar.g0(-503721051);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(u1iVar) ? 32 : 16) | (fetVar.g(u1iVar2) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        int i3 = i2 | (fetVar.g(c4iVar) ? 16384 : 8192) | (fetVar.g(b4iVar) ? 131072 : 65536);
        if ((1572864 & i) == 0) {
            i3 |= fetVar.i(function0) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= fetVar.i(function1) ? 8388608 : 4194304;
        }
        if (fetVar.U(i3 & 1, (4793491 & i3) != 4793490)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40VarD, 84.0f), 12.0f, 4.0f, 12.0f, 0.0f, 8);
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
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (z) {
                fetVar.e0(-1095916330);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1095915406);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(171425583, new x1i(u1iVar, u1iVar2, function0, function1), fetVar), fetVar, 56);
            i(null, b4iVar, c4iVar, fetVar, ((i3 >> 6) & 896) | ((i3 >> 12) & 112));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gw6(mm40Var, u1iVar, u1iVar2, z, c4iVar, b4iVar, function0, function1, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    public static final l9l f0(f2h f2hVar, long j) {
        String str = f2hVar.d;
        str.getClass();
        if (!kotlin.text.c.x(str, ujn.h, false)) {
            if (str.length() == 0) {
                str = "";
            } else {
                List list = u0d.f34849a;
                if (u0d.c(str)) {
                    str = "";
                } else {
                    str = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
                }
            }
        }
        return new l9l(j, str);
    }

    public static final void g(u1i u1iVar, u1i u1iVar2, Function0 function0, Function0 function1, fet fetVar, int i) {
        Function0 function2;
        Function0 function3;
        u1i u1iVar3;
        u1i u1iVar4;
        fetVar.g0(-233472588);
        int i2 = (fetVar.g(u1iVar) ? 32 : 16) | i | (fetVar.g(u1iVar2) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            function2 = function1;
            x1i x1iVar = new x1i(u1iVar, function0, u1iVar2, function2, (byte) 3);
            u1iVar4 = u1iVar;
            function3 = function0;
            u1iVar3 = u1iVar2;
            vfc.j(jm40.b, u1c.M(-577771097, x1iVar, fetVar), fetVar, 54);
        } else {
            function2 = function1;
            function3 = function0;
            u1iVar3 = u1iVar2;
            u1iVar4 = u1iVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x1i(u1iVar4, u1iVar3, function3, function2, i);
        }
    }

    public static final List g0(a4t a4tVar, sip sipVar, long j) {
        a4tVar.getClass();
        sipVar.getClass();
        List<h600> list = a4tVar.c;
        if (list == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (h600 h600Var : list) {
            hmz hmzVar = a4tVar.f239a;
            Integer num = null;
            String str = hmzVar != null ? hmzVar.b : null;
            if (str == null) {
                str = "";
            }
            Long l = hmzVar != null ? hmzVar.f13327a : null;
            if (hmzVar != null) {
                num = hmzVar.d;
            }
            long j2 = j;
            Integer num2 = num;
            sip sipVar2 = sipVar;
            arrayList.add(q8x.K(h600Var, sipVar2, str, l, j2, num2));
            sipVar = sipVar2;
            j = j2;
        }
        return arrayList;
    }

    public static final void h(mm40 mm40Var, o0x o0xVar, m0x m0xVar, y3d y3dVar, String str, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2;
        jm40 jm40Var;
        boolean z;
        pm80 pm80VarF;
        pm80 pm80VarF2;
        fet fetVar3 = fetVar;
        fetVar3.g0(64984157);
        int i2 = i | 6 | (fetVar3.g(o0xVar) ? 32 : 16) | (fetVar3.g(m0xVar) ? 256 : 128) | (fetVar3.g(y3dVar) ? 2048 : 1024) | (fetVar3.g(str) ? 16384 : 8192);
        if (fetVar3.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var2, 16.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            if (o0xVar != null) {
                fetVar3.e0(-1340726616);
                mm40 mm40VarN = o7k0.n(jm40Var2, 16.0f);
                Object objA = o0xVar.a();
                if (m0xVar == null) {
                    fetVar3.e0(-1340565293);
                    fetVar3.r(false);
                    pm80VarF = null;
                } else {
                    fetVar3.e0(-1340565292);
                    pm80VarF = a8k0.F(m0xVar.f20977a, 0, fetVar3);
                    fetVar3.r(false);
                }
                if (m0xVar == null) {
                    fetVar3.e0(-1340441293);
                    fetVar3.r(false);
                    pm80VarF2 = null;
                } else {
                    fetVar3.e0(-1340441292);
                    pm80VarF2 = a8k0.F(m0xVar.f20977a, 0, fetVar3);
                    fetVar3.r(false);
                }
                z = true;
                jm40Var = jm40Var2;
                k7x.b(objA, null, mm40VarN, pm80VarF, pm80VarF2, null, null, null, null, null, null, y3dVar != null ? new m78(y3dVar.f41946a, 5) : null, fetVar3, 36912, 0, 28640);
                fetVar2 = fetVar3;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar3;
                jm40Var = jm40Var2;
                z = true;
                fetVar2.e0(-1340169887);
                fetVar2.r(false);
            }
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            fet fetVar4 = fetVar2;
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar4, (i2 >> 12) & 14, 24960, 110586);
            fetVar3 = fetVar4;
            fetVar3.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar3.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba00((Object) mm40Var2, (Object) o0xVar, (Object) m0xVar, (Object) y3dVar, (Object) str, i, (byte) 26);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static final tas h0(vqs vqsVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        vas vasVar;
        ArrayList arrayList3;
        ?? arrayList4;
        tf90 tf90Var;
        vqsVar.getClass();
        String str = vqsVar.f37868a;
        Integer num = vqsVar.b;
        String str2 = vqsVar.c;
        List<gf90> list = vqsVar.d;
        if (list != null) {
            ArrayList arrayList5 = new ArrayList(r3d.q(list, 10));
            for (gf90 gf90Var : list) {
                gf90Var.getClass();
                Integer num2 = gf90Var.f11198a;
                int iIntValue = num2 != null ? num2.intValue() : 0;
                wf90 wf90Var = gf90Var.b;
                if (wf90Var != null) {
                    String str3 = wf90Var.f39060a;
                    if (str3 == null) {
                        str3 = "";
                    }
                    Integer num3 = wf90Var.b;
                    int iIntValue2 = num3 != null ? num3.intValue() : 0;
                    Integer num4 = wf90Var.c;
                    tf90Var = new tf90(str3, iIntValue2, num4 != null ? num4.intValue() : 0);
                } else {
                    tf90Var = tf90.d;
                }
                arrayList5.add(new df90(iIntValue, tf90Var));
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        Integer num5 = vqsVar.e;
        Integer num6 = vqsVar.f;
        Integer num7 = vqsVar.g;
        nts ntsVar = vqsVar.h;
        vas vasVar2 = ntsVar != null ? new vas(ntsVar.f24115a, ntsVar.b) : null;
        String str4 = vqsVar.i;
        Long l = vqsVar.j;
        Integer num8 = vqsVar.k;
        Integer num9 = vqsVar.l;
        vas vasVar3 = vasVar2;
        String str5 = vqsVar.m;
        List list2 = vqsVar.n;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(xkb.a0((imr) it.next()));
            }
        } else {
            arrayList2 = null;
        }
        List list3 = vqsVar.o;
        if (list3 != null) {
            ArrayList arrayList6 = new ArrayList(r3d.q(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                y6m0 y6m0Var = (y6m0) it2.next();
                y6m0Var.getClass();
                Integer num10 = y6m0Var.f42106a;
                Integer numValueOf = Integer.valueOf(num10 != null ? num10.intValue() : 0);
                List list4 = y6m0Var.b;
                Iterator it3 = it2;
                if (list4 != null) {
                    arrayList4 = new ArrayList(r3d.q(list4, 10));
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        kss kssVar = (kss) it4.next();
                        kssVar.getClass();
                        Iterator it5 = it4;
                        b7m0 b7m0Var = kssVar.f18831a;
                        z6m0 z6m0VarP0 = b7m0Var != null ? ucx.p0(b7m0Var) : z6m0.c;
                        Integer num11 = num5;
                        String str6 = kssVar.b;
                        if (str6 == null) {
                            str6 = "";
                        }
                        vas vasVar4 = vasVar3;
                        String str7 = kssVar.c;
                        if (str7 == null) {
                            str7 = "";
                        }
                        String str8 = kssVar.d;
                        if (str8 == null) {
                            str8 = "";
                        }
                        arrayList4.add(new GameStatistic(z6m0VarP0, str6, str7, str8));
                        it4 = it5;
                        num5 = num11;
                        vasVar3 = vasVar4;
                    }
                } else {
                    arrayList4 = 0;
                }
                Integer num12 = num5;
                vas vasVar5 = vasVar3;
                if (arrayList4 == 0) {
                    arrayList4 = iun.f15405a;
                }
                arrayList6.add(new StatInfo(numValueOf, arrayList4));
                arrayList = arrayList;
                it2 = it3;
                str2 = str2;
                num5 = num12;
                vasVar3 = vasVar5;
            }
            vasVar = vasVar3;
            arrayList3 = arrayList6;
        } else {
            vasVar = vasVar3;
            arrayList3 = null;
        }
        return new tas(str, num, str2, arrayList, num5, num6, num7, vasVar, str4, l, num8, num9, str5, arrayList2, arrayList3, vqsVar.p, vqsVar.q, null, new ubr(0, 0));
    }

    public static final void i(mm40 mm40Var, b4i b4iVar, c4i c4iVar, fet fetVar, int i) {
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-444597661);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(b4iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(c4iVar) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 6);
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
            if (b4iVar.f1959a.length() > 0) {
                fetVar2.e0(-1724415998);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 4.0f, 5);
                String str = b4iVar.f1959a;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                mm40Var = jm40Var;
                z = true;
                v8q0.a(str, mm40VarN, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.d(), fetVar2), fetVar, 0, 24960, 110588);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = true;
                mm40Var = jm40Var;
                fetVar2.e0(-1724111051);
                fetVar2.r(false);
            }
            h(null, c4iVar.c, c4iVar.d, c4iVar.e, c4iVar.f3727a, fetVar2, 0);
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var2, b4iVar, c4iVar, i, (byte) 26);
        }
    }

    public static final irk i0(List list) {
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
            arrayList2.add(d0((xah) it.next()));
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayListU, 10));
        Iterator it2 = arrayListU.iterator();
        while (it2.hasNext()) {
            arrayList3.add(d0((xah) it2.next()));
        }
        return new irk(arrayList3, arrayList2);
    }

    public static final void j(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(875988997);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40Var, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(g1t0.g(), StaticColors.INSTANCE.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 24960, 110588);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str2, i, (byte) 6);
        }
    }

    public static final int j0(a4x a4xVar, aph aphVar) {
        Object next;
        Iterator<E> it = a4xVar.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((xoh) next).f41219a != aphVar);
        xoh xohVar = (xoh) next;
        if (xohVar != null) {
            return xohVar.d;
        }
        return 0;
    }

    public static final void k(mm40 mm40Var, ppl pplVar, float f, float f2, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1631870029);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pplVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (!fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.X();
        } else if (pplVar instanceof npl) {
            fetVar.e0(-304796694);
            npl nplVar = (npl) pplVar;
            String str = nplVar.c;
            int i3 = i2 & 126;
            int i4 = i2 << 3;
            l(mm40Var, nplVar, !(str == null || str.length() == 0), f, f2, function1, fetVar, i3 | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            fetVar.r(false);
        } else {
            if (!(pplVar instanceof opl)) {
                throw b1j.f(-564024337, fetVar, false);
            }
            fetVar.e0(-564006332);
            int i5 = i2 & 14;
            int i6 = i2 >> 3;
            m(mm40Var, f, f2, fetVar, (i6 & 896) | i5 | (i6 & 112));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n04(mm40Var, (tpl) pplVar, f, f2, function1, i, (byte) 5);
        }
    }

    public static final void l(mm40 mm40Var, npl nplVar, boolean z, float f, float f2, Function1 function1, fet fetVar, int i) {
        int i2;
        float f3;
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1744054084);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(nplVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function1) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 74899) != 74898)) {
            mm40 mm40VarK = s5x0.K(o7k0.d(mm40Var, 1.0f), f, f2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40VarK, vgg0.a(16.0f));
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarL = s5x0.L(o7k0.g(o7k0.d(jm40Var, 1.0f), 40.0f, 0.0f, 2), 12.0f, 0.0f, 2);
            hjm hjmVar = new hjm(nplVar.b, null, null, null, null, null, false, null, null, false, null, null, 8190);
            kjm kjmVar = kjm.f18392a;
            Object objP = fetVar2.P();
            byte b = 5;
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new knl(b);
                fetVar2.o0(objP);
            }
            nkb.h(mm40VarL, hjmVar, kjmVar, (Function0) objP, null, null, fetVar2, 3456, 48);
            if (z) {
                fetVar2.e0(-860491331);
                mm40 mm40VarL2 = s5x0.L(o7k0.g(o7k0.d(jm40Var, 1.0f), 14.0f, 0.0f, 2), 12.0f, 0.0f, 2);
                String str = nplVar.c;
                if (str == null) {
                    str = "";
                }
                long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                f3 = 0.0f;
                v8q0.a(str, mm40VarL2, textPrimary, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 0, 0, null, g1t0.g(), fetVar, 0, 384, 125944);
                fetVar2 = fetVar;
                z2 = false;
                fetVar2.r(false);
            } else {
                f3 = 0.0f;
                z2 = false;
                fetVar2.e0(-859995982);
                fetVar2.r(false);
            }
            mm40 mm40VarE = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 10.0f, 0.0f, 16.0f, 5).e(new wkw(gqw0.n));
            lh80 lh80VarT = s5x0.t(12.0f, f3, 2);
            qw3 qw3Var = new qw3(12.0f, true, new jf4((byte) 14));
            boolean z4 = (i3 & 112) == 32 ? true : z2;
            if ((i3 & 458752) == 131072) {
                z2 = true;
            }
            boolean z5 = z4 | z2;
            Object objP2 = fetVar2.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new ngh(nplVar, function1, (byte) 29);
                fetVar2.o0(objP2);
            }
            b8k0.f(mm40VarE, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 0, 490);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zol(mm40Var, nplVar, z, f, f2, function1, i, (byte) 2);
        }
    }

    public static final void m(mm40 mm40Var, float f, float f2, fet fetVar, int i) {
        int i2;
        fetVar.g0(899226619);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(o7k0.e(mm40VarD, 256.0f), f, f2);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarK), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wol(mm40Var, f, f2, i, (byte) 3);
        }
    }

    public static final void n(mm40 mm40Var, wxl wxlVar, Function1 function1, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        wxl wxlVar2;
        fetVar.g0(569235774);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= fetVar.e(wxlVar == null ? -1 : wxlVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40Var2 = i4 != 0 ? jm40.b : mm40Var;
            wxl wxlVar3 = i5 != 0 ? wxl.PRIMARY : wxlVar;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new edl(wxlVar3, (byte) 10);
                fetVar.o0(objP);
            }
            dwi0.b((Function1) objP, mm40Var2, function1, fetVar, ((i3 << 3) & 112) | (i3 & 896), 0);
            wxlVar2 = wxlVar3;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            wxlVar2 = wxlVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z23(mm40Var2, (Object) wxlVar2, (Object) function1, i, i2, (byte) 6);
        }
    }

    public static final void o(int i, fet fetVar, mm40 mm40Var) {
        mm40Var.getClass();
        fetVar.g0(-581648375);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 52.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 9);
        }
    }

    public static final void p(mm40 mm40Var, zfa zfaVar, boolean z, Function1 function1, fet fetVar, int i) {
        float f;
        function1.getClass();
        fetVar.g0(-1059741765);
        byte b = 4;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(zfaVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (zfaVar instanceof ufa) {
                zcl zclVar = qmk.f28987a;
                f = 16.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 20.0f;
            }
            float f2 = f;
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gnm(function1, zfaVar, (byte) 10);
                fetVar.o0(objP);
            }
            a8k0.n(o2e.e0(y860.W(mm40Var, null, null, false, null, (Function0) objP, 28), "SPORT_FINAL_EVENT_CARD_LIVE"), f2, 0L, null, u1c.M(-1546509510, new wvm(zfaVar, function1, b), fetVar), u1c.M(600056955, new jv1((Object) zfaVar, z, (byte) 14), fetVar), u1c.M(-1548343876, new igm((Object) zfaVar, z, (Object) function1, (byte) 23), fetVar), fetVar, 1797120, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0(mm40Var, (Object) zfaVar, z, function1, i, (byte) 24);
        }
    }

    public static final void q(mm40 mm40Var, g1n g1nVar, fet fetVar, int i) {
        k6z k6zVar;
        fetVar.g0(-656251870);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(g1nVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (g1nVar.e) {
                fetVar.e0(702152553);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(702153477);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(s5x0.L(o7k0.g(mm40VarD, 94.0f, 0.0f, 2), 8.0f, 0.0f, 2), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
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
            obc.d(bmd.n.a(k6zVar), u1c.M(2007293228, new mxm(g1nVar, (byte) 10), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n((byte) 5, i, mm40Var, g1nVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:101:0x0124  */
    /* JADX WARN: Code duplicated, block: B:102:0x0127  */
    /* JADX WARN: Code duplicated, block: B:105:0x012f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0159  */
    /* JADX WARN: Code duplicated, block: B:109:0x015b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0164  */
    /* JADX WARN: Code duplicated, block: B:113:0x0166  */
    /* JADX WARN: Code duplicated, block: B:116:0x0171  */
    /* JADX WARN: Code duplicated, block: B:122:0x017f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0187  */
    /* JADX WARN: Code duplicated, block: B:128:0x0191 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x0193  */
    /* JADX WARN: Code duplicated, block: B:133:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007c  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x010f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0113  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x011d  */
    public static final void r(mm40 mm40Var, ejm ejmVar, float f, gy40 gy40Var, ezj ezjVar, Function2 function2, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        float f2;
        int i4;
        gy40 gy40Var2;
        int i5;
        int i6;
        boolean zI;
        int i7;
        Object obj;
        boolean z;
        ezj ezjVar2;
        mm40 mm40Var3;
        float f3;
        gy40 gy40Var3;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        float f4;
        cl5 cl5Var;
        gy40 gy40Var4;
        int iOrdinal;
        float f5;
        Object objP;
        ngk0 ngk0Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objP2;
        ezj ezjVar3;
        Object objP3;
        Object objP4;
        int i8;
        ezj ezjVar4 = ezjVar;
        function2.getClass();
        fetVar.g0(1806492048);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(ejmVar) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                f2 = f;
                i3 |= fetVar.d(f2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    gy40Var2 = gy40Var;
                    if (fetVar.g(gy40Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    if ((i & 32768) == 0) {
                        zI = fetVar.g(ezjVar4);
                    } else {
                        zI = fetVar.i(ezjVar4);
                    }
                    if (zI) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                if ((196608 & i) == 0) {
                    obj = function2;
                    if (fetVar.i(obj)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i3 |= i8;
                } else {
                    obj = function2;
                }
                if ((i3 & 74899) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i3 & 1, z)) {
                    if (i9 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i10 != 0) {
                        f4 = xan.f40565a;
                    } else {
                        f4 = f2;
                    }
                    cl5Var = ukd.f35823a;
                    if (i4 != 0) {
                        objP4 = fetVar.P();
                        if (objP4 == cl5Var) {
                            objP4 = dw9.j(fetVar);
                        }
                        gy40Var4 = (gy40) objP4;
                    } else {
                        gy40Var4 = gy40Var2;
                    }
                    if (i6 != 0) {
                        objP3 = fetVar.P();
                        if (objP3 == cl5Var) {
                            objP3 = new ezj();
                            fetVar.o0(objP3);
                        }
                        ezjVar4 = (ezj) objP3;
                    }
                    float f6 = xan.f40565a;
                    xim ximVarA = ejmVar.a();
                    ximVarA.getClass();
                    iOrdinal = ximVarA.ordinal();
                    f5 = 12.0f;
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            zcl zclVar = qmk.f28987a;
                        } else if (iOrdinal != 2) {
                            zcl zclVar2 = qmk.f28987a;
                        } else {
                            if (iOrdinal == 3) {
                                t9f.b();
                                return;
                            }
                            zcl zclVar3 = qmk.f28987a;
                        }
                        f5 = 8.0f;
                    } else {
                        zcl zclVar4 = qmk.f28987a;
                    }
                    objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = new ngk0();
                        fetVar.o0(objP);
                    }
                    ngk0Var = (ngk0) objP;
                    mm40 mm40VarE0 = o2e.e0(mm40Var4, "GAMES_COLLECTION_LAZY_ROW");
                    lh80 lh80VarT = s5x0.t(f4, 0.0f, 2);
                    mm40 mm40Var5 = mm40Var4;
                    qw3 qw3Var = new qw3(f5, true, new jf4((byte) 14));
                    if ((i3 & 112) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((458752 & i3) == 131072) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z6 = z2 | z3;
                    if ((57344 & i3) != 16384 || ((i3 & 32768) != 0 && fetVar.i(ezjVar4))) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    z5 = z6 | z4 | ((i3 & 7168) == 2048);
                    objP2 = fetVar.P();
                    if (!z5 || objP2 == cl5Var) {
                        ezjVar3 = ezjVar4;
                        dg dgVar = new dg(ejmVar, ezjVar3, gy40Var4, obj, ngk0Var, (byte) 16);
                        fetVar.o0(dgVar);
                        objP2 = dgVar;
                    } else {
                        ezjVar3 = ezjVar4;
                    }
                    b8k0.f(mm40VarE0, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 0, 490);
                    f3 = f4;
                    ezjVar2 = ezjVar3;
                    gy40Var3 = gy40Var4;
                    mm40Var3 = mm40Var5;
                } else {
                    fetVar.X();
                    ezjVar2 = ezjVar4;
                    mm40Var3 = mm40Var2;
                    f3 = f2;
                    gy40Var3 = gy40Var2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new qt0(mm40Var3, (Object) ejmVar, f3, (Object) gy40Var3, (Object) ezjVar2, (wdr) function2, i, i2, (byte) 3);
                }
            }
            i3 |= 3072;
            gy40Var2 = gy40Var;
            i6 = i2 & 16;
            if (i6 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if ((i & 32768) == 0) {
                    zI = fetVar.g(ezjVar4);
                } else {
                    zI = fetVar.i(ezjVar4);
                }
                if (zI) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                obj = function2;
                if (fetVar.i(obj)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            } else {
                obj = function2;
            }
            if ((i3 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                if (i9 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i10 != 0) {
                    f4 = xan.f40565a;
                } else {
                    f4 = f2;
                }
                cl5Var = ukd.f35823a;
                if (i4 != 0) {
                    objP4 = fetVar.P();
                    if (objP4 == cl5Var) {
                        objP4 = dw9.j(fetVar);
                    }
                    gy40Var4 = (gy40) objP4;
                } else {
                    gy40Var4 = gy40Var2;
                }
                if (i6 != 0) {
                    objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = new ezj();
                        fetVar.o0(objP3);
                    }
                    ezjVar4 = (ezj) objP3;
                }
                float f7 = xan.f40565a;
                xim ximVarA2 = ejmVar.a();
                ximVarA2.getClass();
                iOrdinal = ximVarA2.ordinal();
                f5 = 12.0f;
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        zcl zclVar5 = qmk.f28987a;
                    } else if (iOrdinal != 2) {
                        zcl zclVar6 = qmk.f28987a;
                    } else {
                        if (iOrdinal == 3) {
                            t9f.b();
                            return;
                        }
                        zcl zclVar7 = qmk.f28987a;
                    }
                    f5 = 8.0f;
                } else {
                    zcl zclVar8 = qmk.f28987a;
                }
                objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new ngk0();
                    fetVar.o0(objP);
                }
                ngk0Var = (ngk0) objP;
                mm40 mm40VarE1 = o2e.e0(mm40Var4, "GAMES_COLLECTION_LAZY_ROW");
                lh80 lh80VarT2 = s5x0.t(f4, 0.0f, 2);
                mm40 mm40Var6 = mm40Var4;
                qw3 qw3Var2 = new qw3(f5, true, new jf4((byte) 14));
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((458752 & i3) == 131072) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z7 = z2 | z3;
                if ((57344 & i3) != 16384) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                z5 = z7 | z4 | ((i3 & 7168) == 2048);
                objP2 = fetVar.P();
                if (z5) {
                    ezjVar3 = ezjVar4;
                    dg dgVar2 = new dg(ejmVar, ezjVar3, gy40Var4, obj, ngk0Var, (byte) 16);
                    fetVar.o0(dgVar2);
                    objP2 = dgVar2;
                } else {
                    ezjVar3 = ezjVar4;
                    dg dgVar3 = new dg(ejmVar, ezjVar3, gy40Var4, obj, ngk0Var, (byte) 16);
                    fetVar.o0(dgVar3);
                    objP2 = dgVar3;
                }
                b8k0.f(mm40VarE1, null, lh80VarT2, false, qw3Var2, null, null, false, null, (Function1) objP2, fetVar, 0, 490);
                f3 = f4;
                ezjVar2 = ezjVar3;
                gy40Var3 = gy40Var4;
                mm40Var3 = mm40Var6;
            } else {
                fetVar.X();
                ezjVar2 = ezjVar4;
                mm40Var3 = mm40Var2;
                f3 = f2;
                gy40Var3 = gy40Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new qt0(mm40Var3, (Object) ejmVar, f3, (Object) gy40Var3, (Object) ezjVar2, (wdr) function2, i, i2, (byte) 3);
            }
        }
        i3 |= 384;
        f2 = f;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                gy40Var2 = gy40Var;
                if (fetVar.g(gy40Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if ((i & 32768) == 0) {
                    zI = fetVar.g(ezjVar4);
                } else {
                    zI = fetVar.i(ezjVar4);
                }
                if (zI) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            if ((196608 & i) == 0) {
                obj = function2;
                if (fetVar.i(obj)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
            } else {
                obj = function2;
            }
            if ((i3 & 74899) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                if (i9 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i10 != 0) {
                    f4 = xan.f40565a;
                } else {
                    f4 = f2;
                }
                cl5Var = ukd.f35823a;
                if (i4 != 0) {
                    objP4 = fetVar.P();
                    if (objP4 == cl5Var) {
                        objP4 = dw9.j(fetVar);
                    }
                    gy40Var4 = (gy40) objP4;
                } else {
                    gy40Var4 = gy40Var2;
                }
                if (i6 != 0) {
                    objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = new ezj();
                        fetVar.o0(objP3);
                    }
                    ezjVar4 = (ezj) objP3;
                }
                float f8 = xan.f40565a;
                xim ximVarA3 = ejmVar.a();
                ximVarA3.getClass();
                iOrdinal = ximVarA3.ordinal();
                f5 = 12.0f;
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        zcl zclVar9 = qmk.f28987a;
                    } else if (iOrdinal != 2) {
                        zcl zclVar10 = qmk.f28987a;
                    } else {
                        if (iOrdinal == 3) {
                            t9f.b();
                            return;
                        }
                        zcl zclVar11 = qmk.f28987a;
                    }
                    f5 = 8.0f;
                } else {
                    zcl zclVar12 = qmk.f28987a;
                }
                objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new ngk0();
                    fetVar.o0(objP);
                }
                ngk0Var = (ngk0) objP;
                mm40 mm40VarE2 = o2e.e0(mm40Var4, "GAMES_COLLECTION_LAZY_ROW");
                lh80 lh80VarT3 = s5x0.t(f4, 0.0f, 2);
                mm40 mm40Var7 = mm40Var4;
                qw3 qw3Var3 = new qw3(f5, true, new jf4((byte) 14));
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((458752 & i3) == 131072) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z8 = z2 | z3;
                if ((57344 & i3) != 16384) {
                    z4 = true;
                } else {
                    z4 = true;
                }
                z5 = z8 | z4 | ((i3 & 7168) == 2048);
                objP2 = fetVar.P();
                if (z5) {
                    ezjVar3 = ezjVar4;
                    dg dgVar4 = new dg(ejmVar, ezjVar3, gy40Var4, obj, ngk0Var, (byte) 16);
                    fetVar.o0(dgVar4);
                    objP2 = dgVar4;
                } else {
                    ezjVar3 = ezjVar4;
                    dg dgVar5 = new dg(ejmVar, ezjVar3, gy40Var4, obj, ngk0Var, (byte) 16);
                    fetVar.o0(dgVar5);
                    objP2 = dgVar5;
                }
                b8k0.f(mm40VarE2, null, lh80VarT3, false, qw3Var3, null, null, false, null, (Function1) objP2, fetVar, 0, 490);
                f3 = f4;
                ezjVar2 = ezjVar3;
                gy40Var3 = gy40Var4;
                mm40Var3 = mm40Var7;
            } else {
                fetVar.X();
                ezjVar2 = ezjVar4;
                mm40Var3 = mm40Var2;
                f3 = f2;
                gy40Var3 = gy40Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new qt0(mm40Var3, (Object) ejmVar, f3, (Object) gy40Var3, (Object) ezjVar2, (wdr) function2, i, i2, (byte) 3);
            }
        }
        i3 |= 3072;
        gy40Var2 = gy40Var;
        i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if ((i & 32768) == 0) {
                zI = fetVar.g(ezjVar4);
            } else {
                zI = fetVar.i(ezjVar4);
            }
            if (zI) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((196608 & i) == 0) {
            obj = function2;
            if (fetVar.i(obj)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        } else {
            obj = function2;
        }
        if ((i3 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i3 & 1, z)) {
            if (i9 != 0) {
                mm40Var4 = jm40.b;
            } else {
                mm40Var4 = mm40Var2;
            }
            if (i10 != 0) {
                f4 = xan.f40565a;
            } else {
                f4 = f2;
            }
            cl5Var = ukd.f35823a;
            if (i4 != 0) {
                objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = dw9.j(fetVar);
                }
                gy40Var4 = (gy40) objP4;
            } else {
                gy40Var4 = gy40Var2;
            }
            if (i6 != 0) {
                objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = new ezj();
                    fetVar.o0(objP3);
                }
                ezjVar4 = (ezj) objP3;
            }
            float f9 = xan.f40565a;
            xim ximVarA4 = ejmVar.a();
            ximVarA4.getClass();
            iOrdinal = ximVarA4.ordinal();
            f5 = 12.0f;
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    zcl zclVar13 = qmk.f28987a;
                } else if (iOrdinal != 2) {
                    zcl zclVar14 = qmk.f28987a;
                } else {
                    if (iOrdinal == 3) {
                        t9f.b();
                        return;
                    }
                    zcl zclVar15 = qmk.f28987a;
                }
                f5 = 8.0f;
            } else {
                zcl zclVar16 = qmk.f28987a;
            }
            objP = fetVar.P();
            if (objP == cl5Var) {
                objP = new ngk0();
                fetVar.o0(objP);
            }
            ngk0Var = (ngk0) objP;
            mm40 mm40VarE3 = o2e.e0(mm40Var4, "GAMES_COLLECTION_LAZY_ROW");
            lh80 lh80VarT4 = s5x0.t(f4, 0.0f, 2);
            mm40 mm40Var8 = mm40Var4;
            qw3 qw3Var4 = new qw3(f5, true, new jf4((byte) 14));
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((458752 & i3) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z9 = z2 | z3;
            if ((57344 & i3) != 16384) {
                z4 = true;
            } else {
                z4 = true;
            }
            z5 = z9 | z4 | ((i3 & 7168) == 2048);
            objP2 = fetVar.P();
            if (z5) {
                ezjVar3 = ezjVar4;
                dg dgVar6 = new dg(ejmVar, ezjVar3, gy40Var4, obj, ngk0Var, (byte) 16);
                fetVar.o0(dgVar6);
                objP2 = dgVar6;
            } else {
                ezjVar3 = ezjVar4;
                dg dgVar7 = new dg(ejmVar, ezjVar3, gy40Var4, obj, ngk0Var, (byte) 16);
                fetVar.o0(dgVar7);
                objP2 = dgVar7;
            }
            b8k0.f(mm40VarE3, null, lh80VarT4, false, qw3Var4, null, null, false, null, (Function1) objP2, fetVar, 0, 490);
            f3 = f4;
            ezjVar2 = ezjVar3;
            gy40Var3 = gy40Var4;
            mm40Var3 = mm40Var8;
        } else {
            fetVar.X();
            ezjVar2 = ezjVar4;
            mm40Var3 = mm40Var2;
            f3 = f2;
            gy40Var3 = gy40Var2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qt0(mm40Var3, (Object) ejmVar, f3, (Object) gy40Var3, (Object) ezjVar2, (wdr) function2, i, i2, (byte) 3);
        }
    }

    public static final void s(wng wngVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1476942513);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(wngVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = c5o.f3781a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new yhn((Object) wngVar, (byte) 11);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean z2 = i3 == 4;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new mxm(wngVar, (byte) 29);
                fetVar.o0(objP3);
            }
            idm0.j(mm40Var, wngVar, xdrVar, null, function1, (Function2) objP3, fetVar, ((i2 << 3) & 112) | 384, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(wngVar, i, b);
        }
    }

    public static final void t(mm40 mm40Var, boolean z, v3n v3nVar, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(42316728);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(v3nVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(str) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            float fE = v3nVar.a().e();
            jm40 jm40Var = jm40.b;
            k7x.a(str, null, o7k0.n(jm40Var, fE), null, null, fetVar2, ((i2 >> 9) & 14) | 48, 2040);
            if (z) {
                fetVar2.e0(-139253465);
                zcl zclVar = qmk.f28987a;
                qxw.o(fetVar2, o7k0.e(jm40Var, 16.0f));
                j0x.b(a8k0.F(R.drawable.ic_game_assistant, 0, fetVar2), null, o7k0.n(jm40Var, v3nVar.a().e()), null, null, 0.0f, null, fetVar, 56, 120);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-138964204);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1((byte) 24, i, (Object) mm40Var, (Object) v3nVar, (Object) str, z);
        }
    }

    public static final void u(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i, int i2) {
        nw3 nw3Var = uc9.g;
        if ((i2 & 4) != 0) {
            ugdVar = null;
        }
        if ((i2 & 16) != 0) {
            ugdVar3 = null;
        }
        zcl zclVar = qmk.f28987a;
        mm40 mm40VarY = o7k0.y(s5x0.L(mm40Var, qmk.a(fetVar).c, 0.0f, 2), null, 3);
        x5d x5dVarA = w5d.a(nw3Var, gqw0.m, fetVar, ((i & 112) >> 3) & 14);
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
        jpm0.o(fetVar, x5dVarA, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        mm40 mm40VarW = o7k0.w(o7k0.d(jm40.b, 1.0f), null, false, 3);
        y5d y5dVar = y5d.f42040a;
        if (ugdVar == null) {
            fetVar.e0(-2142848230);
        } else {
            fetVar.e0(-623313465);
            ugdVar.j(y5dVar, mm40VarW, fetVar, Integer.valueOf((i & 896) | 54));
        }
        fetVar.r(false);
        ugdVar2.j(y5dVar, mm40VarW, fetVar, Integer.valueOf(((i >> 3) & 896) | 54));
        if (ugdVar3 == null) {
            fetVar.e0(-2142744070);
        } else {
            fetVar.e0(-623310105);
            ugdVar3.j(y5dVar, mm40VarW, fetVar, Integer.valueOf(((i >> 6) & 896) | 54));
        }
        fetVar.r(false);
        fetVar.r(true);
    }

    public static final void v(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(29393145);
        int i2 = i | 6 | (fetVar.d(6.0f) ? 32 : 16);
        byte b = 6;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new w(ugdVar, (byte) 11);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            x4n0.a(jm40Var, (Function2) objP, fetVar, 6, 0);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fb8(mm40Var, ugdVar, i, b);
        }
    }

    public static final void w(mm40 mm40Var, itv itvVar, Function0 function0, fet fetVar, int i) {
        int i2;
        itvVar.getClass();
        hye hyeVar = itvVar.f;
        function0.getClass();
        fetVar.g0(-1654761456);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(itvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
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
            boolean z = itvVar.b;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-619622640);
                zcl zclVar = qmk.f28987a;
                B(0, fetVar, s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11));
                fetVar.r(false);
            } else {
                fetVar.e0(-619555370);
                fetVar.r(false);
            }
            J(itvVar.d, 0, fetVar, null, itvVar.c);
            zcl zclVar2 = qmk.f28987a;
            j(0, fetVar, dw9.h(1.0f, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), true), itvVar.e);
            if (hyeVar != hye.c) {
                fetVar.e0(-619064020);
                a(s5x0.N(o7k0.y(jm40Var, null, 3), 6.0f, 0.0f, 0.0f, 0.0f, 14), hyeVar, function0, fetVar, i2 & 896);
                fetVar.r(false);
            } else {
                fetVar.e0(-618716138);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var, (Object) itvVar, (Object) function0, i, (byte) 12);
        }
    }

    public static final void x(mm40 mm40Var, mjw mjwVar, pz40 pz40Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        mjwVar.getClass();
        ljw ljwVar = mjwVar.f21915a;
        function1.getClass();
        fetVar2.g0(182539641);
        int i2 = i | 6 | (fetVar2.g(mjwVar) ? 32 : 16) | (fetVar2.g(pz40Var) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zG = fetVar2.g(ljwVar);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                if (ljwVar instanceof kjw) {
                    zcl zclVar = qmk.f;
                    ugg0 ugg0Var = vgg0.f37379a;
                    objP = new ugg0(zclVar, zclVar, zclVar, zclVar);
                } else if (!(ljwVar instanceof jjw)) {
                    t9f.b();
                    return;
                } else {
                    zcl zclVar2 = qmk.m;
                    ugg0 ugg0Var2 = vgg0.f37379a;
                    objP = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
                }
                fetVar2.o0(objP);
            }
            ugg0 ugg0Var3 = (ugg0) objP;
            zcl zclVar3 = qmk.f28987a;
            mm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(mm40Var, 44.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            int i3 = i2 << 3;
            I(null, ugg0Var3, ljwVar, pz40Var, fetVar, i3 & 7168);
            fetVar2 = fetVar;
            H(o2e.e0(o7k0.e(mm40Var, 44.0f), "HOME_SEGMENT_ROW"), mjwVar.b, ljwVar, pz40Var, function1, fetVar2, i3 & 64512);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((byte) 7, i, (Object) mm40Var2, (Object) mjwVar, (Object) pz40Var, (Object) function1);
        }
    }

    public static final void y(int i, int i2, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        int i3;
        mm40 mm40Var2;
        int i4;
        mm40 mm40Var3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1602831042);
        int i5 = i2 | 6 | (fetVar.g(a4xVar) ? 32 : 16) | 128;
        boolean z = false;
        boolean z2 = true;
        if (fetVar2.U(i5 & 1, (i5 & 147) != 146)) {
            fetVar2.Z();
            int i6 = i2 & 1;
            jm40 jm40Var = jm40.b;
            if (i6 == 0 || fetVar2.B()) {
                i4 = 3;
                mm40Var3 = jm40Var;
            } else {
                fetVar2.X();
                i4 = i;
                mm40Var3 = mm40Var;
            }
            fetVar2.s();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var3, 0.0f, 6.0f, 1);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            Iterator itO = h97.o(fetVar2, mm40VarC0, gqw0.v, -773872834, a4xVar);
            while (itO.hasNext()) {
                String str = (String) itO.next();
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                v8q0.a(str, mm40VarD, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(i4), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 48, 24960, 109560);
                fetVar2 = fetVar;
                jm40Var = jm40Var;
                i4 = i4;
                mm40Var3 = mm40Var3;
                z = false;
                z2 = true;
            }
            fetVar2.r(z);
            fetVar2.r(true);
            i3 = i4;
            mm40Var2 = mm40Var3;
        } else {
            fetVar2.X();
            i3 = i;
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iqh(mm40Var2, a4xVar, i3, i2, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0052  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b7  */
    public static final void z(Function0 function0, Function0 function1, clz clzVar, fet fetVar, int i, int i2) {
        int i3;
        Function0 function2;
        Function0 function3;
        clz clzVar2;
        Function0 function4;
        clz clzVar3;
        Function0 function5;
        boolean z;
        boolean z2;
        Object objP;
        int i4;
        fetVar.g0(-1510061451);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) != 0) {
                i4 = 128;
            } else {
                if ((i & 512) == 0 ? fetVar.g(clzVar) : fetVar.i(clzVar)) {
                    i4 = 256;
                } else {
                    i4 = 128;
                }
            }
            i3 |= i4;
        }
        byte b = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                if (i5 != 0) {
                    function0 = null;
                }
                if (i6 != 0) {
                    function1 = null;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    function4 = function0;
                    clzVar3 = (clz) fetVar.k(or00.f25714a);
                    function5 = function1;
                }
                fetVar.s();
                if ((i3 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = z | ((i3 & 112) == 32);
                objP = fetVar.P();
                if (z2 || objP == ukd.f35823a) {
                    objP = new yhd(function4, function5, b);
                    fetVar.o0(objP);
                }
                clz clzVar4 = clzVar3;
                s0x.e(function4, function5, clzVar4, (Function1) objP, fetVar, i3 & 1022, 0);
                clzVar2 = clzVar4;
                function3 = function5;
                function2 = function4;
            } else {
                fetVar.X();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            function4 = function0;
            function5 = function1;
            clzVar3 = clzVar;
            fetVar.s();
            if ((i3 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            z2 = z | ((i3 & 112) == 32);
            objP = fetVar.P();
            if (z2) {
                objP = new yhd(function4, function5, b);
                fetVar.o0(objP);
            } else {
                objP = new yhd(function4, function5, b);
                fetVar.o0(objP);
            }
            clz clzVar5 = clzVar3;
            s0x.e(function4, function5, clzVar5, (Function1) objP, fetVar, i3 & 1022, 0);
            clzVar2 = clzVar5;
            function3 = function5;
            function2 = function4;
        } else {
            fetVar.X();
            function2 = function0;
            function3 = function1;
            clzVar2 = clzVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z23((wdr) function2, (Object) function3, (Object) clzVar2, i, i2, (byte) 4);
        }
    }
}
