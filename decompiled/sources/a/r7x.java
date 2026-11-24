package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Typeface;
import android.javax.sip.message.Response;
import android.text.TextPaint;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.localtimedif.impl.presentation.localtimediffworker.LocalTimeDiffWorker;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r7x {
    public static final String A(uzb0 uzb0Var) {
        int iOrdinal = uzb0Var.ordinal();
        if (iOrdinal == 0) {
            return "popular";
        }
        if (iOrdinal == 1) {
            return "a-z";
        }
        if (iOrdinal == 2) {
            return "z-a";
        }
        t9f.b();
        return null;
    }

    public static final String B(uzb0 uzb0Var) {
        uzb0Var.getClass();
        int iOrdinal = uzb0Var.ordinal();
        if (iOrdinal == 0) {
            return "byPopularity";
        }
        if (iOrdinal == 1) {
            return "alphabeticallyAsc";
        }
        if (iOrdinal == 2) {
            return "alphabeticallyDesc";
        }
        t9f.b();
        return null;
    }

    public static final czg0 C(fet fetVar) {
        fetVar.e0(1967007413);
        Object[] objArr = new Object[0];
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            objP = new yxg0((byte) 1);
            fetVar.o0(objP);
        }
        czg0 czg0Var = (czg0) e9x.R(objArr, czg0.e, (Function0) objP, fetVar, 384);
        czg0Var.c = (fzg0) fetVar.k(hzg0.f13904a);
        fetVar.r(false);
        return czg0Var;
    }

    public static final void E(a3e a3eVar, jj3 jj3Var) {
        int i = jj3Var.d;
        if (i != -1 && i != a3eVar.i) {
            a3eVar.i = i;
        }
        int i2 = jj3Var.e;
        if (i2 != -1 && i2 != a3eVar.t) {
            a3eVar.t = i2;
        }
        int i3 = jj3Var.f;
        if (i3 != -1 && i3 != a3eVar.l) {
            a3eVar.l = i3;
        }
        int i4 = jj3Var.g;
        if (i4 != -1 && i4 != a3eVar.k) {
            a3eVar.k = i4;
        }
        int i5 = jj3Var.h;
        if (i5 != -1 && i5 != a3eVar.v) {
            a3eVar.v = i5;
        }
        float f = jj3Var.i;
        if (f != 0.5f && f != a3eVar.F) {
            a3eVar.F = f;
        }
        float f2 = jj3Var.j;
        if (f2 == 0.5f || f2 == a3eVar.E) {
            return;
        }
        a3eVar.E = f2;
    }

    public static void F(cpv0 cpv0Var, long j) {
        sl50 sl50Var = sl50.f32381a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o4e o4eVar = new o4e(new hl50(null), sl50.b, false, false, false, false, -1L, -1L, CollectionsKt.P0(linkedHashSet));
        zko zkoVar = zko.f44542a;
        xl60 xl60Var = (xl60) new xl60(LocalTimeDiffWorker.class).x(j, TimeUnit.MINUTES);
        ((ppv0) xl60Var.c).j = o4eVar;
        cpv0Var.c("LocalTimeDiffWorker", zkoVar, (yl60) xl60Var.k());
    }

    public static final boolean G(String str, ArrayList arrayList) {
        int size = arrayList.size();
        return 1 <= size && size < 6 && str.length() > 0;
    }

    public static final x85 H(q95 q95Var, boolean z) {
        Long l = q95Var.f28331a;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        String str = q95Var.b;
        String str2 = "";
        if (str == null) {
            if (z) {
                jf4.k(null);
                return null;
            }
            str = "";
        }
        String str3 = q95Var.c;
        if (str3 != null) {
            str2 = str3;
        } else if (z) {
            jf4.k(null);
            return null;
        }
        return new x85(jLongValue, str, str2);
    }

    public static final String I(jv70 jv70Var) {
        String str = jv70Var.f17195a;
        String strConcat = str != null ? "section=".concat(str) : null;
        String str2 = jv70Var.b;
        String strConcat2 = str2 != null ? "type=".concat(str2) : null;
        String str3 = jv70Var.c;
        String strConcat3 = str3 != null ? "filterid=".concat(str3) : null;
        String str4 = jv70Var.d;
        String strConcat4 = str4 != null ? "partId=".concat(str4) : null;
        String str5 = jv70Var.e;
        return "://open/casino?".concat(CollectionsKt.b0(CollectionsKt.S(q3d.j(strConcat, strConcat2, strConcat3, strConcat4, str5 != null ? "id=".concat(str5) : null)), "&", null, null, null, 62));
    }

    public static final tvv J(f8h f8hVar, List list) {
        List list2 = f8hVar.k;
        vvv vvvVar = f8hVar.d;
        String str = vvvVar.c;
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(a8k0.L((n9d) it.next()));
        }
        List list3 = f8hVar.l;
        ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(a8k0.L((n9d) it2.next()));
        }
        List<djn0> list4 = f8hVar.m;
        ArrayList arrayList3 = new ArrayList(r3d.q(list4, 10));
        for (djn0 djn0Var : list4) {
            djn0Var.getClass();
            arrayList3.add(new xyx(djn0Var.b, String.valueOf(djn0Var.c)));
        }
        if (str.length() == 0) {
            return null;
        }
        if (arrayList.isEmpty() && arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return null;
        }
        boolean zContains = list.contains(Long.valueOf(f8hVar.f9103a));
        int i = zContains ? R.drawable.ic_glyph_chevron_up_small : R.drawable.ic_glyph_chevron_down_small;
        long j = f8hVar.f9103a;
        String str2 = f8hVar.b;
        String str3 = vvvVar.b;
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return new tvv(j, str2, str3, upperCase, zContains, i, dyb.o0(arrayList), dyb.o0(arrayList2), dyb.o0(arrayList3));
    }

    public static final Object K(Function1 function1, zje zjeVar) {
        if (zjeVar.getContext().get(gqw0.n1) == null) {
            return s0x.P(zjeVar.getContext()).e(function1, zjeVar);
        }
        hny.b();
        return null;
    }

    public static final void a(mm40 mm40Var, i4 i4Var, float f, ezj ezjVar, gy40 gy40Var, Function2 function2, fet fetVar, int i) {
        int i2;
        float f2;
        gy40 gy40Var2;
        fetVar.g0(173133420);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(i4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            f2 = f;
            i2 |= fetVar.d(f2) ? 256 : 128;
        } else {
            f2 = f;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? fetVar.g(ezjVar) : fetVar.i(ezjVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            gy40Var2 = gy40Var;
            i2 |= fetVar.g(gy40Var2) ? 16384 : 8192;
        } else {
            gy40Var2 = gy40Var;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarQ = i120.Q(lgb.J(s5x0.I(mm40Var, bnh0.b), bnh0.c), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
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
            zcl zclVar = qmk.f28987a;
            v3c.r(s5x0.L(jm40.b, 0.0f, 8.0f, 1), new cjm(i4Var, xim.f40952a), f2, gy40Var2, ezjVar, function2, fetVar, (i2 & 896) | ((i2 >> 3) & 7168) | (57344 & (i2 << 3)) | (i2 & 458752), 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dnh0(mm40Var, i4Var, f, ezjVar, gy40Var, function2, i, (byte) 0);
        }
    }

    public static final void b(mm40 mm40Var, eb10 eb10Var, Function0 function0, fet fetVar, int i) {
        function0.getClass();
        fetVar.g0(321992350);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(eb10Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.e0(197038140);
            jcb.l(mm40Var, eb10Var.f7497a, false, function0, fetVar, (i2 & 14) | ((i2 << 3) & 7168), 4);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var, eb10Var, function0, i, (byte) 11);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        String str2;
        str.getClass();
        fetVar.g0(-845417894);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            y9q0 y9q0VarT = ibm0.t(new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109), fetVar);
            str2 = str;
            v8q0.a(str2, mm40Var, 0L, new n05(idm0.t(10), idm0.t(14), idm0.t(1)), 0L, null, null, null, 0L, null, 0L, 2, false, 5, 0, null, y9q0.a(y9q0VarT, 0L, 0L, null, null, null, 0L, null, null, 0, 0, idm0.v(daq0.c(y9q0VarT.b.c) / daq0.c(y9q0VarT.f42262a.b), 8589934592L), null, null, 16646143), fetVar, (14 & (i3 >> 3)) | ((i3 << 3) & 112), 24960, 110580);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new poh(mm40Var, str2, i, (byte) 3);
        }
    }

    public static final void d(int i, qw3 qw3Var, fet fetVar, a4x a4xVar, xcz xczVar, mm40 mm40Var, lh80 lh80Var, Function2 function2) {
        a4x a4xVar2;
        a4xVar.getClass();
        xczVar.getClass();
        function2.getClass();
        fetVar.g0(-1452913884);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(lh80Var) ? 256 : 128) | (fetVar.g(xczVar) ? 2048 : 1024) | (fetVar.g(qw3Var) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                zcl zclVar = qmk.f28987a;
                objP = twn.j(64.0f, fetVar);
            }
            float f = ((ycl) objP).f42389a;
            boolean z = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                a4xVar2 = a4xVar;
                objP2 = new ny2((Object) a4xVar2, f, (Object) function2, (byte) 9);
                fetVar.o0(objP2);
            } else {
                a4xVar2 = a4xVar;
            }
            b8k0.f(mm40Var, xczVar, lh80Var, false, qw3Var, null, null, false, null, (Function1) objP2, fetVar, (i2 & 14) | ((i2 >> 6) & 112) | (i2 & 896) | (i2 & 57344), Response.NOT_ACCEPTABLE_HERE);
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var, a4xVar2, lh80Var, xczVar, qw3Var, function2, i, (byte) 23);
        }
    }

    public static final void e(mm40 mm40Var, pl7 pl7Var, Function1 function1, fet fetVar, int i) {
        Object acdVar;
        w2d w2dVar;
        xcz xczVar;
        Function1 function2 = function1;
        pl7Var.getClass();
        function2.getClass();
        fetVar.g0(-1026168621);
        byte b = 16;
        int i2 = i | (fetVar.g(pl7Var) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            w2d w2dVarW0 = uzb.w0(0, fetVar);
            wom womVarF = mom.f(fetVar);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new xv50(function2, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            Boolean boolValueOf = Boolean.valueOf(pl7Var.e());
            boolean zI = ((i2 & 112) == 32) | fetVar.i(w2dVarW0) | fetVar.g(xczVarA) | (i3 == 256);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                w2dVar = w2dVarW0;
                acdVar = new acd(pl7Var, w2dVar, xczVarA, function2, null, (byte) 1);
                xczVar = xczVarA;
                function2 = function2;
                fetVar.o0(acdVar);
            } else {
                acdVar = objP2;
                w2dVar = w2dVarW0;
                xczVar = xczVarA;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) acdVar);
            boolean zG = fetVar.g(w2dVar);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                objP3 = jgk0.b(new ok7(w2dVar, (byte) 4));
                fetVar.o0(objP3);
            }
            mm40 mm40VarR = knm0.r(mm40Var);
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            ugd ugdVarM = u1c.M(1081129108, new pd50(w2dVar, pl7Var, function2, (l7m0) objP3), fetVar);
            Function1 function3 = function2;
            w2d w2dVar2 = w2dVar;
            v2n0.c(mm40VarR, w2dVar2, background, 0.0f, ugdVarM, null, u1c.M(787842649, new s49(pl7Var, womVarF, w2dVar2, function0, xczVar, function3), fetVar), fetVar, 1600576, 32);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbd(mm40Var, pl7Var, function1, i, (byte) 1);
        }
    }

    public static final void f(mm40 mm40Var, vl90 vl90Var, cqq cqqVar, Function1 function1, fet fetVar, int i) {
        vl90Var.getClass();
        function1.getClass();
        fetVar.g0(1003077144);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(vl90Var) ? 32 : 16) | (fetVar.g(cqqVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            obc.d(h36.f12370a.a(cqqVar), u1c.M(1351971544, new o090((byte) 5, mm40Var, (p6t0) vl90Var, function1), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 19, i, (Object) mm40Var, (Object) vl90Var, (Object) cqqVar, (Object) function1);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(1666481883);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_red_fire, 0, fetVar), null, o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), 16.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU(), fetVar2, 56, 0);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i, (byte) 4);
        }
    }

    public static final void h(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1873083750);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(fqj0Var) ? 32 : 16;
        }
        byte b = 1;
        byte b2 = 3;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            hfk0 hfk0Var = hfk0.b;
            boolean zG = fetVar.g(xczVarA);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new qcz(xczVarA, hfk0Var);
                fetVar.o0(objP);
            }
            nnw0.g(mm40Var, null, false, u1c.M(325514116, new sqc0(xczVarA, bdx.m0((ffk0) objP, fetVar), fqj0Var, b), fetVar), fetVar, (i2 & 14) | 3072, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gc30(mm40Var, fqj0Var, i, b2);
        }
    }

    public static final void i(mm40 mm40Var, l7m0 l7m0Var, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        function0.getClass();
        fetVar.g0(-1353792317);
        int i2 = i | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean zG = fetVar.g((u9f0) l7m0Var.getValue());
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(((u9f0) l7m0Var.getValue()).c), ((u9f0) l7m0Var.getValue()).f35281a, false, true), sh00.q))));
                fetVar.o0(objP);
            }
            mtl mtlVar = (mtl) ((pz40) objP).getValue();
            boolean z = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new r3w(function0, (byte) 22);
                fetVar.o0(objP2);
            }
            jm40 jm40Var = jm40.b;
            bkb.f(jm40Var, mtlVar, null, false, null, (Function1) objP2, fetVar, 6, 28);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var2, l7m0Var, function0, i, (byte) 17);
        }
    }

    public static final void j(mm40 mm40Var, ugd ugdVar, ydr ydrVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1100448821);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ydrVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            Object objL = s5x0.L(jm40Var, 2.0f, 0.0f, 2);
            Object objValueOf = Integer.valueOf(((i2 << 3) & 896) | 6);
            jr8 jr8Var = jr8.f16991a;
            ugdVar.j(jr8Var, objL, fetVar, objValueOf);
            if (ydrVar == null) {
                fetVar.e0(-1820565694);
            } else {
                fetVar.e0(634008735);
                ydrVar.j(jr8Var, jr8Var.b(jm40Var, gqw0.c), fetVar, Integer.valueOf((i2 & 896) | 6));
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) mm40Var, (Object) ugdVar, (Object) ydrVar, i, (byte) 1);
        }
    }

    public static final void k(mm40 mm40Var, bbn bbnVar, float f, ezj ezjVar, gy40 gy40Var, Function2 function2, fet fetVar, int i) {
        int i2;
        ezjVar.getClass();
        function2.getClass();
        fetVar.g0(-9506411);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(bbnVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? fetVar.g(ezjVar) : fetVar.i(ezjVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(gy40Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if (!fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar.X();
        } else if (bbnVar instanceof zan) {
            fetVar.e0(262811415);
            a(o7k0.d(mm40Var, 1.0f), ((zan) bbnVar).f44078a, f, ezjVar, gy40Var, function2, fetVar, i2 & 524160);
            fetVar.r(false);
        } else {
            if (!bbnVar.equals(abn.f587a)) {
                throw b1j.f(-545713825, fetVar, false);
            }
            fetVar.e0(263233418);
            m(0, fetVar, o7k0.d(mm40Var, 1.0f));
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cnh0(mm40Var, bbnVar, f, ezjVar, gy40Var, function2, i, (byte) 0);
        }
    }

    public static final void l(Function1 function1, hzi0 hzi0Var, fet fetVar, int i) {
        function1.getClass();
        hzi0Var.getClass();
        fetVar.g0(-576989585);
        int i2 = (fetVar.i(function1) ? 4 : 2) | i | (fetVar.g(hzi0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 64.0f);
            pz40 pz40Var = s6t0.f31722a;
            long primary = s6t0.b().f33626a.getPrimary();
            String str = hzi0Var.b;
            StaticColors staticColors = StaticColors.INSTANCE;
            gy30 gy30Var = new gy30(new ux30(staticColors.m123getWhite0d7_KjU(), staticColors.m131getWhite800d7_KjU(), str, hzi0Var.f13908a), new rx30(new m0x(R.drawable.glyph_exclamation, null, 6), s6t0.b().f33626a.getPrimary(), null, R.drawable.glyph_exclamation, 0L, new pc5(new y3d(staticColors.m123getWhite0d7_KjU())), 436), new zx30(new m0x(R.drawable.banner_time, null, 6), 3), primary, null, null, 240);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new x6h0(function1, hzi0Var, (byte) 14);
                fetVar.o0(objP);
            }
            jiq0.y(mm40VarE, gy30Var, (Function0) objP, null, null, fetVar, 0, 24);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) function1, (Object) hzi0Var, i, (byte) 15);
        }
    }

    public static final void m(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(120394078);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(s5x0.I(mm40Var, bnh0.b), bnh0.f2884a), bnh0.c), vbc.d0(vqm.f37862a, fetVar, 6, 0)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i, (byte) 25);
        }
    }

    public static final void n(mm40 mm40Var, cub0 cub0Var, Function0 function0, fet fetVar, int i) {
        fet fetVar2;
        long background;
        long jC;
        cub0Var.getClass();
        boolean z = cub0Var.b;
        function0.getClass();
        fetVar.g0(1019360083);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(cub0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                background = cs0.e(fetVar, 352502234, fetVar, false);
            } else {
                fetVar.e0(352503229);
                background = afn0.m(fetVar).getBackground();
                fetVar.r(false);
            }
            if (z) {
                fetVar.e0(352505540);
                jC = afn0.m(fetVar).getPrimaryForeground();
                fetVar.r(false);
            } else {
                jC = rz4.c(fetVar, 352506846, fetVar, false);
            }
            mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(y860.W(i120.Q(mm40VarC, background, vgg0.a(360.0f)), null, null, false, null, function0, 28), 12.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            long j = jC;
            String str = cub0Var.f4981a;
            afn0.v(fetVar).getClass();
            v8q0.a(str, null, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.m(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(mm40Var, (Object) cub0Var, (wdr) function0, i, (byte) 29);
        }
    }

    public static final void o(mm40 mm40Var, ner0 ner0Var, xcz xczVar, qw3 qw3Var, lh80 lh80Var, Function1 function1, fet fetVar, int i) {
        ner0Var.getClass();
        function1.getClass();
        fetVar.g0(1337208919);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ner0Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.g(qw3Var) ? 2048 : 1024) | (fetVar.g(lh80Var) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            mm40 mm40VarS = o7k0.s(jm40.b, ((ycl) fetVar.k(wdr0.f38987a)).f42389a);
            boolean z = !ner0Var.c;
            mm40 mm40VarE0 = o2e.e0(mm40Var, "SPORTS_GAME_LINE_LAZY_ROW");
            boolean zG = ((i2 & 112) == 32) | fetVar.g(mm40VarS) | ((458752 & i2) == 131072);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new nej0((Object) ner0Var, (Object) mm40VarS, (Object) function1, (byte) 8);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE0, xczVar, lh80Var, false, qw3Var, null, null, z, null, (Function1) objP, fetVar, ((i2 >> 3) & 112) | ((i2 >> 6) & 896) | ((i2 << 3) & 57344), 360);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vdl0(mm40Var, ner0Var, xczVar, qw3Var, lh80Var, function1, i, (byte) 0);
        }
    }

    public static final void p(hin0 hin0Var, mm40 mm40Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        hin0Var.getClass();
        long j = hin0Var.b;
        mm40Var.getClass();
        fetVar2.g0(-52133663);
        int i2 = (fetVar2.g(hin0Var) ? 4 : 2) | i | (fetVar2.g(mm40Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            boolean zF = fetVar2.f(j);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.valueOf(j > 0));
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            nw3 nw3Var = uc9.e;
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(mm40Var, new ggn(pkd.b(50.0f, fetVar2), pkd.b(16.0f, fetVar2))), StaticColors.INSTANCE.m73getBlack400d7_KjU(), jd8.n);
            thg0 thg0VarA = shg0.a(nw3Var, yx7Var, fetVar2, 54);
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
            pm80 pm80VarF = a8k0.F(hin0Var.f13122a, 0, fetVar2);
            float f = (hin0Var.c || ((Boolean) pz40Var.getValue()).booleanValue()) ? 1.0f : 0.4f;
            jm40 jm40Var = jm40.b;
            j0x.b(pm80VarF, null, o7k0.e(o7k0.s(jm40Var, 24.0f), 24.0f), null, null, f, null, fetVar, 56, 88);
            fetVar2 = fetVar;
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                fetVar2.e0(-1052581044);
                qxw.o(fetVar2, o7k0.s(jm40Var, 8.0f));
                long j2 = hin0Var.b;
                boolean z = hin0Var.c;
                boolean zG = fetVar2.g(pz40Var);
                Object objP2 = fetVar2.P();
                if (zG || objP2 == cl5Var) {
                    objP2 = new ryc0(pz40Var, (byte) 27);
                    fetVar2.o0(objP2);
                }
                q7x.s(j2, z, (Function1) objP2, fetVar2, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1052341755);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(hin0Var, mm40Var, i, (byte) 29);
        }
    }

    public static final void q(TextPaint textPaint, Context context, int i) {
        textPaint.getClass();
        context.getClass();
        if (i != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, mqd0.x);
            typedArrayObtainStyledAttributes.getClass();
            textPaint.setTextSize(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            try {
                textPaint.setTypeface(Typeface.create(itf0.a(typedArrayObtainStyledAttributes.getResourceId(10, -1), context), 0));
            } catch (Exception unused) {
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static final void r(TextPaint textPaint, Context context, int i) {
        textPaint.getClass();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, bqd0.s0);
        textPaint.setColor(typedArrayObtainStyledAttributes.getColor(2, 0));
        q(textPaint, context, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final float s(String str) {
        String strR = kotlin.text.c.r(str, Separators.PERCENT, "", false);
        if (StringsKt.O(strR, Separators.COLON, false)) {
            Float fJ = kotlin.text.b.j((String) CollectionsKt.U(StringsKt__StringsKt.split$default(strR, new String[]{Separators.COLON}, false, 0, 6, null)));
            if (fJ != null) {
                return fJ.floatValue();
            }
            return 0.0f;
        }
        Float fJ2 = kotlin.text.b.j(strR);
        if (fJ2 != null) {
            return fJ2.floatValue();
        }
        return 0.0f;
    }

    public static float t(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static int u(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    public static cly w(String str) throws GeneralSecurityException {
        Map mapUnmodifiableMap;
        AtomicReference atomicReference = pcf0.f26757a;
        synchronized (pcf0.class) {
            mapUnmodifiableMap = Collections.unmodifiableMap(pcf0.d);
        }
        cly clyVar = (cly) mapUnmodifiableMap.get(str);
        if (clyVar != null) {
            return clyVar;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }

    public static final knb x(gua0 gua0Var) {
        knb knbVar;
        gua0Var.getClass();
        fua0 fua0Var = gua0Var.f11919a;
        dua0 dua0Var = fua0Var instanceof dua0 ? (dua0) fua0Var : null;
        if (dua0Var != null && (knbVar = dua0Var.f6691a) != null) {
            return knbVar;
        }
        iun iunVar = iun.f15405a;
        return new knb(iunVar, iunVar);
    }

    public static final o4e0 y(ocl oclVar) {
        return new o4e0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.statistic_empty_data, 0, 0L, 0L, 990));
    }

    public static ugd z(rwm0 rwm0Var, long j, long j2, y9q0 y9q0Var, y9q0 y9q0Var2) {
        return new ugd(1965743720, true, new ee40(rwm0Var, j, j2, y9q0Var, y9q0Var2, jm40.b, (byte) 1));
    }

    public abstract Object v();

    public r7x D(String str, Function1 function1) {
        return this;
    }
}
