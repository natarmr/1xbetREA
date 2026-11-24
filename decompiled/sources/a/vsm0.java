package a;

import android.gov.nist.core.Separators;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vsm0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public static final i0q0 A(n0q0 n0q0Var) {
        ?? arrayList;
        ?? arrayList2;
        g0q0 g0q0Var = n0q0Var.c;
        if (g0q0Var == null) {
            jf4.k(null);
            return null;
        }
        List list = g0q0Var.f10471a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ibm0.D((ugv0) it.next(), lg30.f19988a));
            }
        } else {
            arrayList = iun.f15405a;
        }
        List list2 = g0q0Var.b;
        if (list2 != null) {
            arrayList2 = new ArrayList(r3d.q(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(ibm0.D((ugv0) it2.next(), lg30.b));
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        return new i0q0(arrayList, arrayList2);
    }

    public static final hqt0 B(gqt0 gqt0Var) {
        gqt0Var.getClass();
        switch (gqt0Var.ordinal()) {
            case 0:
                return hqt0.f13500a;
            case 1:
                return hqt0.b;
            case 2:
                return hqt0.c;
            case 3:
                return hqt0.d;
            case 4:
                return hqt0.e;
            case 5:
                return hqt0.f;
            case 6:
                return hqt0.g;
            case 7:
                return hqt0.h;
            default:
                t9f.b();
                return null;
        }
    }

    public static final fbu0 C(cau0 cau0Var, ctf0 ctf0Var, boolean z, lxw lxwVar) {
        int i;
        String strF;
        String strF2;
        cau0Var.getClass();
        ctf0Var.getClass();
        switch (cau0Var.ordinal()) {
            case 0:
            case 1:
            case 5:
            case 8:
                i = R.drawable.ic_required_verification_status;
                break;
            case 2:
                i = R.drawable.ic_accepted_verification_status;
                break;
            case 3:
                i = R.drawable.ic_in_progress_verification_status;
                break;
            case 4:
            case 7:
                i = R.drawable.ic_denied_verification_status;
                break;
            case 6:
                i = R.drawable.ic_complete_verification_status;
                break;
            default:
                t9f.b();
                return null;
        }
        int iOrdinal = cau0Var.ordinal();
        boolean z2 = (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) ? false : true;
        String strF3 = "";
        switch (cau0Var.ordinal()) {
            case 0:
            case 1:
            case 5:
            case 8:
                strF = ctf0Var.f(R.string.verification, new Object[0]);
                break;
            case 2:
            case 3:
            case 4:
                strF = "";
                break;
            case 6:
                strF = ctf0Var.f(R.string.verification_title_success, new Object[0]);
                break;
            case 7:
                strF = ctf0Var.f(R.string.payment_reject, new Object[0]);
                break;
            default:
                t9f.b();
                return null;
        }
        switch (cau0Var.ordinal()) {
            case 0:
            case 1:
                strF2 = !z ? ctf0Var.f(R.string.verification_need_to_pass, new Object[0]) : ctf0Var.f(R.string.verification_status_required, new Object[0]);
                break;
            case 2:
                strF2 = ctf0Var.f(R.string.verification_status_accepted, new Object[0]);
                break;
            case 3:
                strF2 = ctf0Var.f(R.string.verification_status_in_progress, new Object[0]);
                break;
            case 4:
                strF2 = ctf0Var.f(R.string.verification_status_denied, new Object[0]);
                break;
            case 5:
                strF2 = ctf0Var.f(R.string.clarification_required, new Object[0]);
                break;
            case 6:
                strF2 = ctf0Var.f(R.string.verification_completed, new Object[0]);
                break;
            case 7:
                strF2 = ctf0Var.f(R.string.verification_error, new Object[0]);
                break;
            case 8:
                strF2 = !z ? ctf0Var.f(R.string.verification_need_update_data, new Object[0]) : ctf0Var.f(R.string.verification_status_required, new Object[0]);
                break;
            default:
                t9f.b();
                return null;
        }
        boolean z3 = cau0Var != cau0.f;
        int iOrdinal2 = cau0Var.ordinal();
        boolean z4 = iOrdinal2 == 2 ? lxwVar == lxw.b : !(iOrdinal2 == 3 ? lxwVar != lxw.b : iOrdinal2 == 4);
        switch (cau0Var.ordinal()) {
            case 0:
            case 1:
            case 8:
                strF3 = ctf0Var.f(R.string.verification, new Object[0]);
                break;
            case 2:
                if (lxwVar == lxw.b) {
                    strF3 = ctf0Var.f(R.string.verification_check_state, new Object[0]);
                }
                break;
            case 3:
                if (lxwVar == lxw.b) {
                    strF3 = ctf0Var.f(R.string.verification_check_state, new Object[0]);
                }
                break;
            case 4:
                break;
            case 5:
                strF3 = lxwVar != lxw.b ? ctf0Var.f(R.string.verification_other_methods, new Object[0]) : ctf0Var.f(R.string.verification, new Object[0]);
                break;
            case 6:
                strF3 = ctf0Var.f(R.string.refill_account, new Object[0]);
                break;
            case 7:
                strF3 = ctf0Var.f(R.string.verification_other_methods, new Object[0]);
                break;
            default:
                t9f.b();
                return null;
        }
        return new fbu0(i, strF, strF2, strF3, z2, z3, z4);
    }

    public static boolean D(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final void a(mm40 mm40Var, fak0 fak0Var, Function1 function1, Function2 function2, Function2 function3, Function2 function4, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        Function2 function5;
        Function2 function6;
        Function2 function7 = function4;
        fetVar.g0(-882916823);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(fak0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function7) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            c(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), fak0Var.g, fetVar, 0);
            x7z x7zVar = new x7z(1.0f, true);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVar);
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
            boolean z2 = fak0Var.f;
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new ecd((byte) 3, fak0Var, function1);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(jm40Var, null, null, z2, null, (Function0) objP, 24);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarW);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            int i3 = i2;
            v8q0.a(fak0Var.e, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar), fetVar, 0, 24960, 110590);
            fetVar2 = fetVar;
            if (function2 == null) {
                fetVar2.e0(-1443612688);
                fetVar2.r(false);
                function5 = function2;
            } else {
                fetVar2.e0(230526513);
                function5 = function2;
                h97.q((i3 >> 9) & 14, fetVar2, function5, false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            if (function3 == null) {
                fetVar2.e0(-981335000);
                fetVar2.r(false);
                function6 = function3;
            } else {
                fetVar2.e0(799628025);
                int i4 = (i3 >> 12) & 14;
                function6 = function3;
                h97.q(i4, fetVar2, function6, false);
            }
            if (function4 == null) {
                fetVar2.e0(-981301272);
                fetVar2.r(false);
                function7 = function4;
            } else {
                fetVar2.e0(799629113);
                function7 = function4;
                h97.q((i3 >> 15) & 14, fetVar2, function7, false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            function5 = function2;
            function6 = function3;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fer0(mm40Var, (Object) fak0Var, (wdr) function1, (wdr) function5, (wdr) function6, (wdr) function7, i, (byte) 0);
        }
    }

    public static final void b(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1754192546);
        if ((i & 48) == 0) {
            i2 = i | (fetVar2.g(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 17) != 16)) {
            fetVar2.X();
        } else if (str == null) {
            fetVar2.e0(2011987640);
            fetVar2.r(false);
        } else {
            fetVar2.e0(2011987641);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarU = o7k0.u(jm40.b, 20.0f, 0.0f, 2);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarA = g1t0.a();
            zfn zfnVar2 = zaq0.b;
            v8q0.a(str, mm40VarU, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0VarA, fetVar, (i2 >> 3) & 14, 0, 130040);
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(Separators.COLON, null, ((ThemeColors) fetVar.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, 6, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, (byte) 11);
        }
    }

    public static final void c(mm40 mm40Var, tvw tvwVar, fet fetVar, int i) {
        zx7 zx7Var = gqw0.e;
        fetVar.g0(-1140481236);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(tvwVar) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            boolean zEquals = tvwVar.equals(qvw.f29409a);
            jm40 jm40Var = jm40.b;
            jr8 jr8Var = jr8.f16991a;
            if (zEquals) {
                fetVar.e0(1239653264);
                zcl zclVar = qmk.f28987a;
                j0x.b(a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar), null, jr8Var.b(o7k0.n(jm40Var, 24.0f), zx7Var), null, null, 0.0f, new m78(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 5), fetVar, 56, 56);
                fetVar.r(false);
            } else if (tvwVar instanceof rvw) {
                fetVar.e0(1240103601);
                zcl zclVar2 = qmk.f28987a;
                lgb.s(jr8Var.b(o7k0.n(jm40Var, 24.0f), zx7Var), ((rvw) tvwVar).f31190a, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar);
                fetVar.r(false);
            } else {
                if (!(tvwVar instanceof svw)) {
                    throw b1j.f(-929844014, fetVar, false);
                }
                fetVar.e0(1240551520);
                zcl zclVar3 = qmk.f28987a;
                j0x.b(a8k0.F(((svw) tvwVar).f32891a, 0, fetVar), null, jr8Var.b(o7k0.n(jm40Var, 24.0f), zx7Var), null, null, 0.0f, new m78(((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), 5), fetVar, 56, 56);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kv7(mm40Var, tvwVar, i, b);
        }
    }

    public static final void d(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(2140902414);
        if ((i & 48) == 0) {
            i2 = i | (fetVar2.g(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 17) != 16)) {
            fetVar2.X();
        } else if (str == null) {
            fetVar2.e0(-640456314);
            fetVar2.r(false);
        } else {
            fetVar2.e0(-640456313);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarU = o7k0.u(jm40.b, 20.0f, 0.0f, 2);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarA = g1t0.a();
            zfn zfnVar2 = zaq0.b;
            v8q0.a(str, mm40VarU, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0VarA, fetVar, (i2 >> 3) & 14, 0, 130040);
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(Separators.COLON, null, ((ThemeColors) fetVar.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, 6, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, (byte) 5);
        }
    }

    public static final void e(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1695514002);
        if ((i & 48) == 0) {
            i2 = i | (fetVar2.g(str) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 17) != 16)) {
            fetVar2.X();
        } else if (str == null) {
            fetVar2.e0(2052803681);
            fetVar2.r(false);
        } else {
            fetVar2.e0(2052803682);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarU = o7k0.u(jm40.b, 20.0f, 0.0f, 2);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarU, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, (i2 >> 3) & 14, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, (byte) 9);
        }
    }

    public static final void f(yhg0 yhg0Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(564868442);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(yhg0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2.X();
        } else if (str.length() > 0) {
            fetVar2.e0(313988724);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = yhg0Var.a(1.0f, jm40Var, false);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 2.0f, 0.0f, 11);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, (i2 >> 3) & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(false);
        } else {
            fetVar2.e0(314499976);
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y460(yhg0Var, str, i, (byte) 14);
        }
    }

    public static final void g(mm40 mm40Var, fak0 fak0Var, Function1 function1, fet fetVar, int i) {
        ugd ugdVarM;
        ugd ugdVarM2;
        function1.getClass();
        fetVar.g0(-443516945);
        byte b = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(fak0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (fak0Var.f) {
                fetVar.e0(-1493484614);
                ugdVarM = u1c.M(1250901451, new fcd(fak0Var, (byte) 8), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-1492736274);
                ugdVarM = u1c.M(-1048228062, new fcd(fak0Var, (byte) 9), fetVar);
                fetVar.r(false);
            }
            ugd ugdVarM3 = null;
            if (fak0Var.h instanceof oww) {
                fetVar.e0(-1491990569);
                fetVar.r(false);
                ugdVarM2 = null;
            } else {
                fetVar.e0(-1492282806);
                ugdVarM2 = u1c.M(816937770, new gcd(b, fak0Var, function1), fetVar);
                fetVar.r(false);
            }
            if (fak0Var.i instanceof oww) {
                fetVar.e0(-1491558057);
                fetVar.r(false);
            } else {
                fetVar.e0(-1491851255);
                ugdVarM3 = u1c.M(382974089, new gcd((byte) 5, fak0Var, function1), fetVar);
                fetVar.r(false);
            }
            a(mm40Var, fak0Var, function1, ugdVarM, ugdVarM2, ugdVarM3, fetVar, i2 & 1022);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(mm40Var, fak0Var, function1, i, (byte) 2);
        }
    }

    public static final void h(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1211425741);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarX = yyw.X(i120.Q(jm40Var, backgroundContent, ljcVar), null, fetVar, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarX);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            imm immVar = ((a8v0) l7m0Var.getValue()).f447a;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ntu0(function1, (byte) 7);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function1, i, (byte) 17);
        }
    }

    public static final void i(mm40 mm40Var, ywv0 ywv0Var, nuv0 nuv0Var, l7m0 l7m0Var, dvv0 dvv0Var, int i, ugd ugdVar, fet fetVar, int i2) {
        ugd ugdVar2;
        byte b;
        ywv0Var.getClass();
        h0q0 h0q0Var = ywv0Var.b;
        l7m0Var.getClass();
        dvv0Var.getClass();
        fetVar.g0(-548325724);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ywv0Var) ? 32 : 16) | (fetVar.g(nuv0Var) ? 256 : 128) | (fetVar.g(l7m0Var) ? 2048 : 1024) | (fetVar.g(dvv0Var) ? 16384 : 8192) | (fetVar.e(i) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            Object obj = h0q0Var.p().c;
            float f = h0q0Var.p().f3395a.b;
            pz40 pz40Var = s6t0.f31722a;
            long shadowSoft = s6t0.b().f33626a.getShadowSoft();
            boolean zG = fetVar.g(obj) | fetVar.d(f) | fetVar.f(shadowSoft);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                boolean zEquals = obj.equals(ksv0.f18834a);
                jm40 jm40Var = jm40.b;
                if (zEquals) {
                    zcl zclVar = qmk.f28987a;
                    objP = qbc.c0(jm40Var, new sqm(0.0f, -4.0f, 32.0f, shadowSoft, new zcl(f)));
                } else {
                    objP = jm40Var;
                }
                fetVar.o0(objP);
            }
            mm40 mm40Var2 = (mm40) objP;
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj2) {
                objP2 = jgk0.b(new wd60(l7m0Var, ywv0Var));
                fetVar.o0(objP2);
            }
            l7m0 l7m0Var2 = (l7m0) objP2;
            boolean z2 = i4 == 32;
            Object objP3 = fetVar.P();
            yje yjeVar = null;
            if (z2 || objP3 == obj2) {
                objP3 = new ud60(ywv0Var, yjeVar, (byte) 2);
                fetVar.o0(objP3);
            }
            int i5 = i3 >> 3;
            m0x0.t(fetVar, ywv0Var, (Function2) objP3);
            Object value = l7m0Var2.getValue();
            boolean zG2 = fetVar.g(l7m0Var2) | (i4 == 32);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == obj2) {
                objP4 = new n7t0(l7m0Var2, ywv0Var, yjeVar, (byte) 19);
                fetVar.o0(objP4);
            }
            m0x0.v(ywv0Var, value, (Function2) objP4, fetVar);
            pz40 pz40VarF = androidx.compose.runtime.e.f(nuv0Var, fetVar);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(Integer.valueOf(i), fetVar);
            boolean z3 = i4 == 32;
            Object objP5 = fetVar.P();
            if (z3 || objP5 == obj2) {
                objP5 = new wsv0(ywv0Var, pz40VarF, pz40VarF2);
                fetVar.o0(objP5);
            }
            wsv0 wsv0Var = (wsv0) objP5;
            mm40 mm40VarV = cjx.V(mm40Var.e(mm40Var2), dvv0Var, null);
            int i6 = (i5 & 896) | i4;
            mm40VarV.getClass();
            int i7 = (i6 & 112) ^ 48;
            boolean z4 = (i7 > 32 && fetVar.g(ywv0Var)) || (i6 & 48) == 32;
            Object objP6 = fetVar.P();
            if (z4 || objP6 == obj2) {
                objP6 = new gtv0(ywv0Var, (byte) 0);
                fetVar.o0(objP6);
            }
            wel welVarB = uel.b((Function1) objP6, fetVar);
            ma80 ma80Var = ma80.f21447a;
            boolean zBooleanValue = ((Boolean) l7m0Var.getValue()).booleanValue();
            boolean z5 = (i7 > 32 && fetVar.g(ywv0Var)) || (i6 & 48) == 32;
            Object objP7 = fetVar.P();
            if (z5 || objP7 == obj2) {
                objP7 = new htv0(ywv0Var, null, (byte) 0);
                fetVar.o0(objP7);
            }
            xdr xdrVar = (xdr) objP7;
            boolean z6 = (i7 > 32 && fetVar.g(ywv0Var)) || (i6 & 48) == 32;
            Object objP8 = fetVar.P();
            if (z6 || objP8 == obj2) {
                b = 0;
                objP8 = new itv0(ywv0Var, null, b);
                fetVar.o0(objP8);
            } else {
                b = 0;
            }
            mm40 mm40VarA = uel.a(mm40VarV, welVarB, ma80Var, zBooleanValue, false, xdrVar, (xdr) objP8, 152);
            mm40VarA.getClass();
            int i8 = i4 ^ 48;
            byte b2 = ((i8 <= 32 || !fetVar.g(ywv0Var)) && (i3 & 48) != 32) ? b : (byte) 1;
            Object objP9 = fetVar.P();
            if (b2 != 0 || objP9 == obj2) {
                objP9 = new gtv0(ywv0Var, (byte) 1);
                fetVar.o0(objP9);
            }
            wel welVarB2 = uel.b((Function1) objP9, fetVar);
            ma80 ma80Var2 = ma80.b;
            boolean zBooleanValue2 = ((Boolean) l7m0Var2.getValue()).booleanValue();
            byte b3 = ((i8 <= 32 || !fetVar.g(ywv0Var)) && (i3 & 48) != 32) ? b : (byte) 1;
            Object objP10 = fetVar.P();
            if (b3 != 0 || objP10 == obj2) {
                objP10 = new htv0(ywv0Var, null, (byte) 1);
                fetVar.o0(objP10);
            }
            xdr xdrVar2 = (xdr) objP10;
            byte b4 = ((i8 <= 32 || !fetVar.g(ywv0Var)) && (i3 & 48) != 32) ? b : (byte) 1;
            Object objP11 = fetVar.P();
            if (b4 != 0 || objP11 == obj2) {
                objP11 = new itv0(ywv0Var, null, (byte) 1);
                fetVar.o0(objP11);
            }
            mm40 mm40VarA2 = uel.a(mm40VarA, welVarB2, ma80Var2, zBooleanValue2, false, xdrVar2, (xdr) objP11, 152);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, wsv0Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ugdVar2 = ugdVar;
            twn.v(6, ugdVar2, fetVar, true);
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fer0(mm40Var, ywv0Var, nuv0Var, l7m0Var, dvv0Var, i, ugdVar2, i2);
        }
    }

    public static final void j(lc00 lc00Var, m9s m9sVar, yxg yxgVar, ctf0 ctf0Var) {
        String str;
        String str2;
        m9sVar.getClass();
        ctf0Var.getClass();
        qqs qqsVar = m9sVar.h;
        List<ve90> list = qqsVar.c;
        if (qqsVar.c.isEmpty()) {
            return;
        }
        lc00Var.add(new psv("FOOTBALL_HEADER_KEY", R.string.half_statistics));
        boolean z = yxgVar instanceof rvg;
        int i = R.drawable.cybergame_synthetic_football_header_bg;
        if (!z) {
            if (yxgVar instanceof bxg) {
                i = R.drawable.cybergame_synthetic_pes_header_bg;
            } else if (yxgVar instanceof xug) {
                i = R.drawable.cybergame_synthetic_marble_football_header_bg;
            } else if (yxgVar instanceof gwg) {
                i = R.drawable.cybergame_synthetic_sega_football_header_bg;
            }
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (ve90 ve90Var : list) {
            arrayList.add(yxgVar instanceof ltg ? ctf0Var.b.a(R.string.cybergame_synthetic_set_v2, Arrays.copyOf(new Object[]{ve90Var.f37273a}, 1)) : ctf0Var.b.a(R.string.cybergame_synthetic_time_v2, Arrays.copyOf(new Object[]{ve90Var.f37273a}, 1)));
        }
        lc00Var.add(new v5o0(i, arrayList));
        String str3 = m9sVar.i;
        String str4 = (String) CollectionsKt.firstOrNull(m9sVar.m);
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        if (kotlin.text.c.x(str4, ujn.h, false)) {
            str = str4;
        } else {
            if (str4.length() != 0) {
                List list2 = u0d.f34849a;
                if (!u0d.c(str4)) {
                    str4 = String.format(Locale.ENGLISH, StringsKt.O(str4, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str4}, 2));
                    str = str4;
                }
            }
            str = "";
        }
        int iP = rsm0.p(yxgVar, false);
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ve90) it.next()).b);
        }
        lc00Var.add(new w5o0(iP, "FOOTBALL_FIRST_TEAM_KEY", str3, str, arrayList2));
        String str6 = m9sVar.j;
        String str7 = (String) CollectionsKt.firstOrNull(m9sVar.n);
        if (str7 == null) {
            str7 = "";
        }
        if (kotlin.text.c.x(str7, ujn.h, false)) {
            str2 = str7;
        } else {
            if (str7.length() != 0) {
                List list3 = u0d.f34849a;
                if (!u0d.c(str7)) {
                    str5 = String.format(Locale.ENGLISH, StringsKt.O(str7, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str7}, 2));
                }
            }
            str2 = str5;
        }
        int iP2 = rsm0.p(yxgVar, true);
        ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((ve90) it2.next()).c);
        }
        lc00Var.add(new w5o0(iP2, "FOOTBALL_SECOND_TEAM_KEY", str6, str2, arrayList3));
    }

    public static final boolean k(List list) {
        List list2;
        list.getClass();
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            io9 io9Var = (io9) it.next();
            if (io9Var != null) {
                if (io9Var instanceof ho9) {
                    List list3 = ((ho9) io9Var).b;
                    if (list3 == null || !list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            List list4 = ((lm9) it2.next()).b;
                            if (list4 == null || !list4.isEmpty()) {
                                Iterator it3 = list4.iterator();
                                while (it3.hasNext()) {
                                    List list5 = ((yn9) it3.next()).c;
                                    if (list5 == null || !list5.isEmpty()) {
                                        Iterator it4 = list5.iterator();
                                        while (it4.hasNext()) {
                                            List<xm9> list6 = ((tm9) it4.next()).f;
                                            if (list6 == null || !list6.isEmpty()) {
                                                for (xm9 xm9Var : list6) {
                                                    if (xm9Var.d.b.length() > 0 || xm9Var.e.b.length() > 0) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if ((io9Var instanceof go9) && ((list2 = ((go9) io9Var).b) == null || !list2.isEmpty())) {
                    Iterator it5 = list2.iterator();
                    while (it5.hasNext()) {
                        List list7 = ((hm9) it5.next()).b;
                        if (list7 == null || !list7.isEmpty()) {
                            Iterator it6 = list7.iterator();
                            while (it6.hasNext()) {
                                List<xm9> list8 = ((un9) it6.next()).d;
                                if (list8 == null || !list8.isEmpty()) {
                                    for (xm9 xm9Var2 : list8) {
                                        if (xm9Var2.d.b.length() > 0 || xm9Var2.e.b.length() > 0) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final rvo0 l(ivo0 ivo0Var, String str) {
        String str2 = ivo0Var.f15455a;
        int i = cy7.f5159a;
        pn40 pn40Var = pn40.f27267a;
        return new rvo0(str2, cy7.e(pn40.p(str, ivo0Var.b)));
    }

    public static final boolean m(xlh xlhVar) {
        xlhVar.getClass();
        if (!(xlhVar instanceof wlh)) {
            if (!(xlhVar instanceof vlh)) {
                return false;
            }
            List list = ((vlh) xlhVar).b;
            if (list != null && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List list2 = ((yih) it.next()).b;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        List<zjh> list3 = ((glh) it2.next()).d;
                        if (list3 == null || !list3.isEmpty()) {
                            for (zjh zjhVar : list3) {
                                if (zjhVar.d.b.length() > 0 || zjhVar.e.b.length() > 0) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        List list4 = ((wlh) xlhVar).b;
        if (list4 != null && list4.isEmpty()) {
            return false;
        }
        Iterator it3 = list4.iterator();
        while (it3.hasNext()) {
            List list5 = ((cjh) it3.next()).b;
            if (list5 == null || !list5.isEmpty()) {
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    List list6 = ((klh) it4.next()).c;
                    if (list6 == null || !list6.isEmpty()) {
                        Iterator it5 = list6.iterator();
                        while (it5.hasNext()) {
                            List<zjh> list7 = ((ojh) it5.next()).f;
                            if (list7 == null || !list7.isEmpty()) {
                                for (zjh zjhVar2 : list7) {
                                    if (zjhVar2.d.b.length() > 0 || zjhVar2.e.b.length() > 0) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean n(wsy wsyVar, iys0 iys0Var, Set set) {
        boolean zN;
        if (Intrinsics.d(wsyVar.S(), iys0Var)) {
            return true;
        }
        foc focVarN = wsyVar.S().n();
        goc gocVar = focVarN instanceof goc ? (goc) focVarN : null;
        List listM = gocVar != null ? gocVar.M() : null;
        Iterable iterableS0 = CollectionsKt.S0(wsyVar.J());
        if (!(iterableS0 instanceof Collection) || !((Collection) iterableS0).isEmpty()) {
            Iterator it = iterableS0.iterator();
            do {
                iil iilVar = (iil) it;
                if (iilVar.b.hasNext()) {
                    IndexedValue indexedValue = (IndexedValue) iilVar.next();
                    int i = indexedValue.f46061a;
                    pzs0 pzs0Var = (pzs0) indexedValue.b;
                    hzs0 hzs0Var = listM != null ? (hzs0) CollectionsKt.W(i, listM) : null;
                    if ((hzs0Var == null || set == null || !set.contains(hzs0Var)) && !pzs0Var.c()) {
                        wsy wsyVarB = pzs0Var.b();
                        wsyVarB.getClass();
                        zN = n(wsyVarB, iys0Var, set);
                    } else {
                        zN = false;
                    }
                }
            } while (!zN);
            return true;
        }
        return false;
    }

    public static final q4m0 o(wsy wsyVar, t3u0 t3u0Var, hzs0 hzs0Var) {
        wsyVar.getClass();
        t3u0Var.getClass();
        if ((hzs0Var != null ? hzs0Var.t() : null) == t3u0Var) {
            t3u0Var = t3u0.c;
        }
        return new q4m0(wsyVar, t3u0Var);
    }

    public static final void p(wsy wsyVar, kzj0 kzj0Var, LinkedHashSet linkedHashSet, Set set) {
        foc focVarN = wsyVar.S().n();
        if (focVarN instanceof hzs0) {
            if (!Intrinsics.d(wsyVar.S(), kzj0Var.S())) {
                linkedHashSet.add(focVarN);
                return;
            }
            for (wsy wsyVar2 : ((hzs0) focVarN).getUpperBounds()) {
                wsyVar2.getClass();
                p(wsyVar2, kzj0Var, linkedHashSet, set);
            }
            return;
        }
        foc focVarN2 = wsyVar.S().n();
        goc gocVar = focVarN2 instanceof goc ? (goc) focVarN2 : null;
        List listM = gocVar != null ? gocVar.M() : null;
        int i = 0;
        for (pzs0 pzs0Var : wsyVar.J()) {
            int i2 = i + 1;
            hzs0 hzs0Var = listM != null ? (hzs0) CollectionsKt.W(i, listM) : null;
            if ((hzs0Var == null || set == null || !set.contains(hzs0Var)) && !pzs0Var.c() && !CollectionsKt.L(linkedHashSet, pzs0Var.b().S().n()) && !Intrinsics.d(pzs0Var.b().S(), kzj0Var.S())) {
                wsy wsyVarB = pzs0Var.b();
                wsyVarB.getClass();
                p(wsyVarB, kzj0Var, linkedHashSet, set);
            }
            i = i2;
        }
    }

    public static final ary q(wsy wsyVar) {
        wsyVar.getClass();
        ary aryVarC = wsyVar.S().c();
        aryVarC.getClass();
        return aryVarC;
    }

    public static final wsy r(hzs0 hzs0Var) {
        Object obj;
        List upperBounds = hzs0Var.getUpperBounds();
        upperBounds.getClass();
        upperBounds.isEmpty();
        List upperBounds2 = hzs0Var.getUpperBounds();
        upperBounds2.getClass();
        Iterator it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            foc focVarN = ((wsy) next).S().n();
            wm40 wm40Var = focVarN instanceof wm40 ? (wm40) focVarN : null;
            if (wm40Var != null && wm40Var.r() != slc.b && wm40Var.r() != slc.e) {
                obj = next;
                break;
            }
        }
        wsy wsyVar = (wsy) obj;
        if (wsyVar != null) {
            return wsyVar;
        }
        List upperBounds3 = hzs0Var.getUpperBounds();
        upperBounds3.getClass();
        Object objU = CollectionsKt.U(upperBounds3);
        objU.getClass();
        return (wsy) objU;
    }

    public static String s(long j, String str) {
        str.getClass();
        if (kotlin.text.c.x(str, ujn.h, false)) {
            return str;
        }
        if (j <= 0 && str.length() == 0) {
            return "";
        }
        List list = u0d.f34849a;
        if (u0d.c(str)) {
            return "";
        }
        return String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
    }

    public static String t(String str) {
        str.getClass();
        if (kotlin.text.c.x(str, ujn.h, false)) {
            return str;
        }
        if (str.length() == 0) {
            return "";
        }
        List list = u0d.f34849a;
        if (u0d.c(str)) {
            return "";
        }
        return String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
    }

    public static final boolean u(hzs0 hzs0Var, iys0 iys0Var, Set set) {
        hzs0Var.getClass();
        List<wsy> upperBounds = hzs0Var.getUpperBounds();
        upperBounds.getClass();
        if (upperBounds.isEmpty()) {
            return false;
        }
        for (wsy wsyVar : upperBounds) {
            wsyVar.getClass();
            if (n(wsyVar, hzs0Var.I().S(), set) && (iys0Var == null || Intrinsics.d(wsyVar.S(), iys0Var))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean v(wsy wsyVar, wsy wsyVar2) {
        wsyVar.getClass();
        wsyVar2.getClass();
        return ysy.f43192a.b(wsyVar, wsyVar2);
    }

    public static String w(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            jf4.o("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static final wsy y(wsy wsyVar, g93 g93Var) {
        wsyVar.getClass();
        return (wsyVar.getAnnotations().isEmpty() && g93Var.isEmpty()) ? wsyVar : wsyVar.j0().m0(gnm0.r(wsyVar.K(), g93Var));
    }

    public static final tft0 z(wsy wsyVar) {
        tft0 tft0VarZ;
        wsyVar.getClass();
        tft0 tft0VarJ0 = wsyVar.j0();
        if (tft0VarJ0 instanceof kkq) {
            kkq kkqVar = (kkq) tft0VarJ0;
            kzj0 kzj0VarZ = kkqVar.b;
            if (!kzj0VarZ.S().getParameters().isEmpty() && kzj0VarZ.S().n() != null) {
                List parameters = kzj0VarZ.S().getParameters();
                parameters.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new q4m0((hzs0) it.next()));
                }
                kzj0VarZ = qsm0.z(kzj0VarZ, arrayList, null, 2);
            }
            kzj0 kzj0VarZ2 = kkqVar.c;
            if (!kzj0VarZ2.S().getParameters().isEmpty() && kzj0VarZ2.S().n() != null) {
                List parameters2 = kzj0VarZ2.S().getParameters();
                parameters2.getClass();
                ArrayList arrayList2 = new ArrayList(r3d.q(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new q4m0((hzs0) it2.next()));
                }
                kzj0VarZ2 = qsm0.z(kzj0VarZ2, arrayList2, null, 2);
            }
            tft0VarZ = ucx.W(kzj0VarZ, kzj0VarZ2);
        } else {
            if (!(tft0VarJ0 instanceof kzj0)) {
                t9f.b();
                return null;
            }
            kzj0 kzj0Var = (kzj0) tft0VarJ0;
            boolean zIsEmpty = kzj0Var.S().getParameters().isEmpty();
            tft0VarZ = kzj0Var;
            if (!zIsEmpty) {
                foc focVarN = kzj0Var.S().n();
                tft0VarZ = kzj0Var;
                if (focVarN != null) {
                    List parameters3 = kzj0Var.S().getParameters();
                    parameters3.getClass();
                    ArrayList arrayList3 = new ArrayList(r3d.q(parameters3, 10));
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new q4m0((hzs0) it3.next()));
                    }
                    tft0VarZ = qsm0.z(kzj0Var, arrayList3, null, 2);
                }
            }
        }
        return xsm0.n(tft0VarZ, tft0VarJ0);
    }

    public abstract Rect x();
}
