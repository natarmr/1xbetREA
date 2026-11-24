package a;

import android.util.Log;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vdx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static wcy f37253a;

    public static final void A(mm40 mm40Var, eum eumVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1688185567);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(eumVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 100.0f), 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            B(eumVar, fetVar, (i2 >> 3) & 14);
            c280 c280Var = eumVar.g;
            String str = eumVar.c;
            c280 c280Var2 = eumVar.h;
            String str2 = eumVar.i;
            boolean z = eumVar.d;
            String str3 = eumVar.e;
            m(0, eumVar.f, eumVar.l, fetVar, c280Var, c280Var2, str, str2, str3, eumVar.k, z, eumVar.j);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var, (Object) eumVar, i, (byte) 8);
        }
    }

    public static final void B(eum eumVar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1442624410);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(eumVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            yx7 yx7Var = gqw0.l;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            mm40 mm40VarE = o7k0.e(jm40.b, 24.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
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
            String str = eumVar.f8426a;
            stm stmVar = eumVar.m;
            if (StringsKt.W(str)) {
                fetVar2.e0(1434669144);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1434533333);
                j6n.h(eumVar.f8426a, oro0.f25744a, null, 0, 0, fetVar2, 48, 28);
                fetVar2.r(false);
            }
            if (stmVar instanceof ptm) {
                fetVar2.e0(323377422);
                fetVar2.r(false);
            } else if (stmVar instanceof qtm) {
                fetVar2.e0(1434863886);
                rcb.x(null, ulb.b0((qtm) stmVar), h2m.c, nsm0.y(fgm.b), true, null, fetVar, 384);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                if (!(stmVar instanceof rtm)) {
                    throw b1j.f(323375296, fetVar2, false);
                }
                fetVar2.e0(1435262422);
                j6n.h("VAR", kro0.f18776a, null, 0, 0, fetVar2, 54, 28);
                fetVar2.r(false);
            }
            v8q0.a(eumVar.b, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(eumVar, i, (byte) 13);
        }
    }

    public static final void C(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(-1371599830);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            long primary = ((ThemeColors) fetVar.k(zaq0.b)).getPrimary();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarD, primary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, (i2 >> 3) & 14, 24960, 110584);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str2, i, (byte) 11);
        }
    }

    public static final boolean D(fl40 fl40Var) {
        int i;
        List<xi40> list = fl40Var.f9722a;
        if (list == null || !list.isEmpty()) {
            i = 0;
            for (xi40 xi40Var : list) {
                if (xi40Var.f40926a > 0 || !StringsKt.W(xi40Var.b)) {
                    i++;
                    if (i < 0) {
                        q3d.o();
                        throw null;
                    }
                }
            }
        } else {
            i = 0;
        }
        return i == 5;
    }

    public static final void E(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        ss3 ss3VarF = F(function1, obj, null);
        if (ss3VarF != null) {
            u1c.H(ss3VarF, coroutineContext);
        }
    }

    public static final ss3 F(Function1 function1, Object obj, ss3 ss3Var) {
        try {
            function1.invoke(obj);
            return ss3Var;
        } catch (Throwable th) {
            if (ss3Var != null && ss3Var.getCause() != th) {
                tjo.a(ss3Var, th);
                return ss3Var;
            }
            return new ss3("Exception in undelivered element handler for " + obj, th);
        }
    }

    public static final int G(int i, int i2, int i3, SimpleDate simpleDate) {
        int i4 = simpleDate.f47286a;
        if (i != i4) {
            return Intrinsics.e(i, i4);
        }
        int i5 = simpleDate.b;
        return i2 != i5 ? Intrinsics.e(i2, i5) : Intrinsics.e(i3, simpleDate.c);
    }

    public static void H(Serializable serializable) {
        Log.e("RootBeer", N().concat(String.valueOf(serializable)));
        Log.e("QLog", N().concat(String.valueOf(serializable)));
    }

    public static final String I(SimpleDate simpleDate, String str, Locale locale, Calendar calendar) {
        calendar.getClass();
        wdx.J(simpleDate, calendar);
        String str2 = new SimpleDateFormat(str, locale).format(calendar.getTime());
        str2.getClass();
        return str2;
    }

    public static rfk0 J() {
        return (rfk0) xfk0.b.w();
    }

    public static final mhg0 K(pj30 pj30Var) {
        Object objN = pj30Var.n();
        if (objN instanceof mhg0) {
            return (mhg0) objN;
        }
        return null;
    }

    public static final int L(mcz mczVar) {
        return (int) (mczVar.q == ma80.f21447a ? mczVar.h() & 4294967295L : mczVar.h() >> 32);
    }

    public static final a4x M() {
        return dyb.o0(q3d.j(new aaj0(true, true, true), new aaj0(true, true, false), new aaj0(true, true, true), new aaj0(true, true, false), new aaj0(true, true, true), new aaj0(true, true, false), new aaj0(true, true, true)));
    }

    public static String N() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        return className.substring(className.lastIndexOf(46) + 1) + ": " + methodName + "() [" + stackTrace[2].getLineNumber() + "] - ";
    }

    public static final float O(mhg0 mhg0Var) {
        if (mhg0Var != null) {
            return mhg0Var.f21792a;
        }
        return 0.0f;
    }

    public static final boolean P(fl40 fl40Var) {
        List<xi40> list = fl40Var.f9722a;
        if (list.size() < 5) {
            return true;
        }
        if (list != null && list.isEmpty()) {
            return false;
        }
        for (xi40 xi40Var : list) {
            if (StringsKt.W(xi40Var.b) || StringsKt.W(xi40Var.e)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean Q(el40 el40Var) {
        Set setL0 = tx3.l0(new cl40[]{cl40.RED, cl40.BLUE});
        fl40 fl40Var = el40Var.f7980a;
        cl40 cl40Var = fl40Var.b;
        fl40 fl40Var2 = el40Var.b;
        boolean zD = Intrinsics.d(setL0, tx3.l0(new cl40[]{cl40Var, fl40Var2.b}));
        List list = fl40Var.g;
        return V(el40Var) || !zD || (list.size() < 2 || list.size() != fl40Var2.g.size());
    }

    public static final boolean R(el40 el40Var) {
        List list = el40Var.h;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((cah) it.next()).c < el40Var.i) {
                return false;
            }
        }
        return true;
    }

    public static final boolean S(el40 el40Var, fl40 fl40Var) {
        fl40Var.getClass();
        if (V(el40Var)) {
            return true;
        }
        List list = fl40Var.f9722a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((xi40) it.next()).f40926a > 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    public static final boolean T(hj40 hj40Var) {
        boolean z;
        hj40Var.getClass();
        List list = hj40Var.c;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((jj40) obj).b.length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() >= 5) {
            List list2 = hj40Var.f;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (((jj40) obj2).b.length() > 0) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.size() >= 5) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return !z;
    }

    public static final boolean U(SimpleDate simpleDate, SimpleDate simpleDate2, GregorianCalendar gregorianCalendar) {
        if (simpleDate != null) {
            int i = simpleDate.c;
            int i2 = simpleDate.b;
            int i3 = simpleDate.f47286a;
            if (simpleDate2 != null) {
                if (G(i3, i2, i, simpleDate2) >= 0) {
                    return true;
                }
                SimpleDate simpleDateZ = Z(gregorianCalendar, i3, i2, i, true);
                if (G(simpleDateZ.f47286a, simpleDateZ.b, simpleDateZ.c, simpleDate2) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean V(el40 el40Var) {
        ni40 ni40Var = el40Var.c;
        return ni40Var == ni40.e || ni40Var == ni40.f;
    }

    public static rfk0 W(rfk0 rfk0Var) {
        if (rfk0Var instanceof ios0) {
            ios0 ios0Var = (ios0) rfk0Var;
            if (ios0Var.t == hfm0.v()) {
                ios0Var.r = null;
                return rfk0Var;
            }
        }
        if (rfk0Var instanceof jos0) {
            jos0 jos0Var = (jos0) rfk0Var;
            if (jos0Var.i == hfm0.v()) {
                jos0Var.h = null;
                return rfk0Var;
            }
        }
        rfk0 rfk0VarE = xfk0.e(rfk0Var, null, false);
        rfk0VarE.j();
        return rfk0VarE;
    }

    public static Object X(ec3 ec3Var, Function0 function0) {
        rfk0 ios0Var;
        rfk0 rfk0Var = (rfk0) xfk0.b.w();
        if (rfk0Var instanceof ios0) {
            ios0 ios0Var2 = (ios0) rfk0Var;
            if (ios0Var2.t == hfm0.v()) {
                Function1 function1 = ios0Var2.r;
                Function1 function2 = ios0Var2.s;
                try {
                    ((ios0) rfk0Var).r = xfk0.i(ec3Var, function1, true);
                    ((ios0) rfk0Var).s = function2;
                    return function0.invoke();
                } finally {
                    ios0Var2.r = function1;
                    ios0Var2.s = function2;
                }
            }
        }
        if (rfk0Var == null || (rfk0Var instanceof nz40)) {
            ios0Var = new ios0(rfk0Var instanceof nz40 ? (nz40) rfk0Var : null, ec3Var, null, true, false);
        } else {
            ios0Var = rfk0Var.u(ec3Var);
        }
        try {
            rfk0 rfk0VarJ = ios0Var.j();
            try {
                Object objInvoke = function0.invoke();
                rfk0.q(rfk0VarJ);
                ios0Var.c();
                return objInvoke;
            } catch (Throwable th) {
                rfk0.q(rfk0VarJ);
                throw th;
            }
        } catch (Throwable th2) {
            ios0Var.c();
            throw th2;
        }
    }

    public static void Y(rfk0 rfk0Var, rfk0 rfk0Var2, Function1 function1) {
        if (rfk0Var != rfk0Var2) {
            rfk0Var2.getClass();
            rfk0.q(rfk0Var);
            rfk0Var2.c();
        } else if (rfk0Var instanceof ios0) {
            ((ios0) rfk0Var).r = function1;
        } else if (rfk0Var instanceof jos0) {
            ((jos0) rfk0Var).h = function1;
        } else {
            udk.e(rfk0Var, "Non-transparent snapshot was reused: ");
        }
    }

    public static final SimpleDate Z(GregorianCalendar gregorianCalendar, int i, int i2, int i3, boolean z) {
        gregorianCalendar.set(i, i2 - 1, i3);
        gregorianCalendar.add(5, z ? 1 : -1);
        return new SimpleDate(gregorianCalendar.get(1), gregorianCalendar.get(2) + 1, gregorianCalendar.get(5));
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(-1144069705);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarD, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, (i2 >> 3) & 14, 24960, 110584);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var2, str2, i, (byte) 10);
        }
    }

    public static final d310 a0(Integer num) {
        Object next;
        c0o c0oVar = d310.f;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (true) {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
            byte b = ((d310) next).f5380a;
            if (num != null && b == num.intValue()) {
                break;
            }
        }
        d310 d310Var = (d310) next;
        return d310Var == null ? d310.UNKNOWN : d310Var;
    }

    public static final void b(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i) {
        fetVar.g0(-1856086285);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(mdmVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jcb.l(mm40Var, mdmVar, false, function0, fetVar, (i2 & 126) | ((i2 << 3) & 7168), 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cv90(mm40Var, mdmVar, function0, i, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    public static final a610 b0(t4h t4hVar) {
        ?? arrayList;
        Float f;
        List<String> list;
        Object next;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        int iIntValue = (t4hVar == null || (num5 = t4hVar.c) == null) ? 0 : num5.intValue();
        int iIntValue2 = -1;
        int iIntValue3 = (t4hVar == null || (num4 = t4hVar.d) == null) ? -1 : num4.intValue();
        int iIntValue4 = (t4hVar == null || (num3 = t4hVar.e) == null) ? -1 : num3.intValue();
        int iIntValue5 = (t4hVar == null || (num2 = t4hVar.f) == null) ? -1 : num2.intValue();
        if (t4hVar != null && (num = t4hVar.g) != null) {
            iIntValue2 = num.intValue();
        }
        int i = iIntValue2;
        List list2 = null;
        if (t4hVar == null || (list = t4hVar.h) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (String str : list) {
                Iterator it = nz00.e.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((nz00) next).f24353a.equals(str));
                nz00 nz00Var = (nz00) next;
                if (nz00Var == null) {
                    nz00Var = nz00.UNKNOWN;
                }
                arrayList.add(nz00Var);
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        d310 d310VarA0 = a0(t4hVar != null ? t4hVar.i : null);
        float fFloatValue = (t4hVar == null || (f = t4hVar.j) == null) ? -1.0f : f.floatValue();
        List<m3h> list3 = t4hVar != null ? t4hVar.k : null;
        if (list3 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (m3h m3hVar : list3) {
                Integer num6 = m3hVar.f21115a;
                Long l = m3hVar.b;
                a010 a010Var = (num6 == null || l == null) ? null : new a010(num6.intValue(), l.longValue());
                if (a010Var != null) {
                    arrayList2.add(a010Var);
                }
            }
            list2 = arrayList2;
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new a610(iIntValue, iIntValue3, iIntValue4, iIntValue5, i, arrayList, d310VarA0, fFloatValue, list2);
    }

    public static final void c(int i, int i2, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        int i3;
        mm40 mm40Var2;
        fetVar.g0(1411921239);
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            str2 = str;
            i4 |= fetVar.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i2 & 384) == 0) {
            i3 = i;
            i4 |= fetVar.e(i3) ? 256 : 128;
        } else {
            i3 = i;
        }
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            long textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str2, mm40VarD, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, i3, 0, null, g1t0.i(), fetVar, (i4 >> 3) & 14, ((i4 << 6) & 57344) | 384, 110584);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7m(mm40Var2, str, i, i2, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[LOOP:6: B:50:0x00e6->B:105:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:58:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x011a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122 A[EDGE_INSN: B:67:0x0122->B:68:0x0123 BREAK  A[LOOP:6: B:50:0x00e6->B:105:?]] */
    /* JADX WARN: Code duplicated, block: B:97:0x00d4 A[SYNTHETIC] */
    public static final sr20 c0(h07 h07Var, List list, List list2, List list3, boolean z, boolean z2, boolean z3) {
        Object next;
        Object next2;
        bkq bkqVar;
        Iterator it;
        Object next3;
        xco xcoVar;
        f07 f07Var;
        Iterator it2;
        ueo ueoVar;
        h07Var.getClass();
        long j = h07Var.b;
        list.getClass();
        list2.getClass();
        list3.getClass();
        Iterator it3 = list3.iterator();
        do {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
        } while (((xco) next).f40655a != j);
        xco xcoVar2 = (xco) next;
        String str = xcoVar2 != null ? xcoVar2.b : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Iterator it4 = list.iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (((sr20) next2).b != j);
        sr20 sr20Var = (sr20) next2;
        List listR = sr20Var != null ? r3d.r(sr20Var.f32656a) : iun.f15405a;
        List<List> list4 = h07Var.f12220a;
        byte b = 23;
        byte b2 = 0;
        Set setV = pgi0.v(pgi0.p(lgi0.c(CollectionsKt.I(list4), new eoh0(b)), new tr20(b2)));
        if (list2.isEmpty()) {
            if (list2.isEmpty()) {
                bkqVar = new bkq(lgi0.c(CollectionsKt.I(list4), new eoh0(b)));
                while (true) {
                    if (bkqVar.hasNext()) {
                        it = list3.iterator();
                        do {
                            if (it.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it.next();
                        } while (((xco) next3).f40655a != j);
                        xcoVar = (xco) next3;
                        if (xcoVar != null && xcoVar.e) {
                            f07Var = f07.f8705a;
                            break;
                        }
                        f07Var = null;
                        break;
                    }
                    if (((ig7) bkqVar.next()).p != 0) {
                        f07Var = f07.d;
                        break;
                    }
                }
            } else {
                it2 = list2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        bkqVar = new bkq(lgi0.c(CollectionsKt.I(list4), new eoh0(b)));
                        while (true) {
                            if (bkqVar.hasNext()) {
                                it = list3.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next3 = null;
                                        break;
                                    }
                                    next3 = it.next();
                                } while (((xco) next3).f40655a != j);
                                xcoVar = (xco) next3;
                                if (xcoVar != null) {
                                    f07Var = null;
                                    break;
                                }
                                f07Var = null;
                                break;
                            }
                            if (((ig7) bkqVar.next()).p != 0) {
                                f07Var = f07.d;
                                break;
                            }
                        }
                    } else {
                        ueoVar = (ueo) it2.next();
                        if (!setV.contains(Long.valueOf(ueoVar.f35538a)) && ueoVar.d == 3) {
                            f07Var = f07.c;
                        }
                    }
                }
            }
        } else {
            Iterator it5 = list2.iterator();
            while (true) {
                if (it5.hasNext()) {
                    ueo ueoVar2 = (ueo) it5.next();
                    if (setV.contains(Long.valueOf(ueoVar2.f35538a)) && ueoVar2.d == 2) {
                        f07Var = f07.b;
                    }
                } else if (list2.isEmpty()) {
                    bkqVar = new bkq(lgi0.c(CollectionsKt.I(list4), new eoh0(b)));
                    while (true) {
                        if (bkqVar.hasNext()) {
                            it = list3.iterator();
                            do {
                                if (it.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it.next();
                            } while (((xco) next3).f40655a != j);
                            xcoVar = (xco) next3;
                            if (xcoVar != null) {
                                f07Var = null;
                                break;
                            }
                            f07Var = null;
                            break;
                        }
                        if (((ig7) bkqVar.next()).p != 0) {
                            f07Var = f07.d;
                            break;
                        }
                    }
                } else {
                    it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            bkqVar = new bkq(lgi0.c(CollectionsKt.I(list4), new eoh0(b)));
                            while (true) {
                                if (bkqVar.hasNext()) {
                                    it = list3.iterator();
                                    do {
                                        if (it.hasNext()) {
                                            next3 = null;
                                            break;
                                        }
                                        next3 = it.next();
                                    } while (((xco) next3).f40655a != j);
                                    xcoVar = (xco) next3;
                                    if (xcoVar != null) {
                                        f07Var = null;
                                        break;
                                    }
                                    f07Var = null;
                                    break;
                                }
                                if (((ig7) bkqVar.next()).p != 0) {
                                    f07Var = f07.d;
                                    break;
                                }
                            }
                        } else {
                            ueoVar = (ueo) it2.next();
                            if (!setV.contains(Long.valueOf(ueoVar.f35538a))) {
                            }
                        }
                    }
                }
            }
        }
        int i = 10;
        ArrayList arrayList = new ArrayList(r3d.q(list4, 10));
        for (List list5 : list4) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list5, i));
            ArrayList arrayList3 = arrayList2;
            int i2 = b2;
            for (Object obj : list5) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    q3d.p();
                    throw null;
                }
                ArrayList arrayList4 = arrayList3;
                String str3 = str2;
                arrayList4.add(xdx.M((ig7) obj, i2, h07Var.e, h07Var.f, str3, h07Var.g, list2, listR, z, h07Var.d, h07Var.b, z2, z3));
                arrayList3 = arrayList4;
                b2 = b2;
                str2 = str3;
                i2 = i3;
            }
            arrayList.add(arrayList3);
            i = 10;
        }
        return new sr20(arrayList, h07Var.b, str2, h07Var.c, h07Var.f, f07Var);
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(1491431672);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fetVar2 = fetVar;
            x7x x7xVarR = b8k0.r(b8k0.V("InningTransition", fetVar, 0), 0.0f, 360.0f, ro4.b0(ro4.m0(1000, 0, ihn.d, 2), null, 0L, 6), null, fetVar2, 4536, 8);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            dww.c(a8k0.F(R.drawable.ic_glyph_spinner_game_indicator, 0, fetVar2), null, a8k0.I(o7k0.n(jm40Var, 14.0f), ((Number) x7xVarR.getValue()).floatValue()), y3d.g, fetVar2, 3128, 0);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 7);
        }
    }

    public static final q850 d0(ctf0 ctf0Var, v12 v12Var) {
        ctf0Var.getClass();
        String strA = ctf0Var.b.a(R.string.special_events_my_bets, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        return new q850(new rqm((vui0) new tui0(strA, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) new nui0(Integer.valueOf(R.drawable.ic_glyph_history), null, new m0x(R.drawable.ic_glyph_history, null, 6), new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU()), null, new pc5(new y3d(s6t0.b().f33626a.getPrimary())), 0.0f, 210), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508), v12Var);
    }

    public static final void e(int i, long j, fet fetVar, mm40 mm40Var) {
        int i2;
        long j2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-115711093);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= fetVar2.f(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.c(j2);
                fetVar2.o0(objP);
            }
            egk0 egk0Var = (egk0) objP;
            Long lValueOf = Long.valueOf(egk0Var.l());
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new slx(egk0Var, null, b);
                fetVar2.o0(objP2);
            }
            m0x0.t(fetVar2, lValueOf, (Function2) objP2);
            if (egk0Var.l() <= 0) {
                fetVar2.e0(1709916559);
                v8q0.a(xsm0.s(R.string.bet_accept_is_over, fetVar2), mm40Var, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, (i2 << 3) & 112, 0, 131064);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(1710136194);
                y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109);
                long jL = egk0Var.l();
                v8q0.a(String.format("%02d:%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(jL / 86400000), Long.valueOf((jL / 3600000) % 24), Long.valueOf((jL / 60000) % 60), Long.valueOf((jL / 1000) % 60)}, 4)), mm40Var, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, (i2 << 3) & 112, 0, 131064);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w1m(mm40Var, j, i, (byte) 3);
        }
    }

    public static final ylb0 e0(amb0 amb0Var) {
        int iOrdinal = amb0Var.ordinal();
        if (iOrdinal == 0) {
            return xlb0.f41064a;
        }
        if (iOrdinal == 1) {
            return wlb0.f39346a;
        }
        if (iOrdinal == 2) {
            return ulb0.f35864a;
        }
        if (iOrdinal == 3) {
            return tlb0.f34134a;
        }
        if (iOrdinal == 4) {
            return vlb0.f37614a;
        }
        t9f.b();
        return null;
    }

    public static final void f(mm40 mm40Var, foh fohVar, int i, fet fetVar, int i2) {
        int i3;
        fetVar.g0(678627443);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(fohVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(i) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            C(0, fetVar, s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 4.0f, 7), fohVar.a());
            c(i, i3 & 896, fetVar, null, fohVar.b());
            a(0, fetVar, null, fohVar.c());
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vty(mm40Var, fohVar, i, i2);
        }
    }

    public static final dxh0 f0(zvh0 zvh0Var) {
        int iOrdinal = zvh0Var.ordinal();
        if (iOrdinal == 0) {
            return axh0.f1625a;
        }
        if (iOrdinal == 1) {
            return zwh0.f45106a;
        }
        if (iOrdinal == 2) {
            return cxh0.f5122a;
        }
        if (iOrdinal == 3) {
            return bxh0.f3376a;
        }
        t9f.b();
        return null;
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-2143737006);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            zq8.a(0, fetVar, xbc.c0(o7k0.c(jm40Var, 1.0f), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 16);
        }
    }

    public static final lla g0(l2g0 l2g0Var, v5l0 v5l0Var, List list, wcb wcbVar, ctf0 ctf0Var, boolean z, boolean z2) {
        lla glaVar;
        String str = l2g0Var.u;
        String str2 = l2g0Var.q;
        String str3 = l2g0Var.p;
        list.getClass();
        wcbVar.getClass();
        ctf0Var.getClass();
        boolean z3 = l2g0Var.v;
        List list2 = l2g0Var.o;
        List list3 = l2g0Var.n;
        String str4 = l2g0Var.l;
        String str5 = l2g0Var.r;
        String str6 = l2g0Var.m;
        if (str6.length() == 0) {
            int iOrdinal = v5l0Var.ordinal();
            if (iOrdinal == 0) {
                glaVar = new gla(bdx.d0(l2g0Var, list, wcbVar, z2), new qla(str4, new jwm(ahb.E(l2g0Var, ctf0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.C(l2g0Var, ctf0Var, z), l2g0Var.f19307a);
            } else if (iOrdinal == 1) {
                glaVar = new kla(bdx.h0(l2g0Var, list, wcbVar, z, z2), new oma(str4, new jwm(ahb.E(l2g0Var, ctf0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.I(l2g0Var, z), l2g0Var.f19307a);
            } else if (iOrdinal == 2) {
                glaVar = new jla(bdx.g0(l2g0Var, list, wcbVar, z, z2), new ima(str4, ahb.E(l2g0Var, ctf0Var), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.H(l2g0Var, z), l2g0Var.f19307a);
            } else if (iOrdinal == 3) {
                String strQ = ahb.Q(l2g0Var, list, wcbVar);
                glaVar = new ila(l2g0Var.f19307a, w9x.E(l2g0Var, z), bdx.f0(l2g0Var, list, wcbVar, z, ctf0Var, z2), new cma(str4, new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), new n0x(strQ));
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                glaVar = new hla(bdx.e0(l2g0Var, list, wcbVar, z, z2), new wla(str4, ahb.E(l2g0Var, ctf0Var), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.D(l2g0Var, z), l2g0Var.f19307a);
            }
        } else {
            long j = l2g0Var.c;
            if (66 == j || 99 == j) {
                int iOrdinal2 = v5l0Var.ordinal();
                if (iOrdinal2 == 0) {
                    long j2 = l2g0Var.f19307a;
                    tma tmaVarD0 = bdx.d0(l2g0Var, list, wcbVar, z2);
                    d280 d280VarO = ahb.O(list3, z3);
                    d280 d280VarP = ahb.P(list2, z3);
                    String str7 = l2g0Var.l;
                    String strH = ahb.H(l2g0Var);
                    String strM = ahb.M(l2g0Var);
                    pz40 pz40Var = s6t0.f31722a;
                    glaVar = new gla(tmaVarD0, new ola(d280VarO, d280VarP, str7, strH, s6t0.b().f33626a.getTextPrimary(), str6, strM, s6t0.b().f33626a.getTextPrimary(), new jwm(ahb.E(l2g0Var, ctf0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.C(l2g0Var, ctf0Var, z), j2);
                } else if (iOrdinal2 == 1) {
                    glaVar = new kla(bdx.h0(l2g0Var, list, wcbVar, z, z2), new mma(new vzm(str4, ahb.H(l2g0Var)), new vzm(str6, ahb.M(l2g0Var)), new jwm(ahb.E(l2g0Var, ctf0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.I(l2g0Var, z), l2g0Var.f19307a);
                } else if (iOrdinal2 == 2) {
                    long j3 = l2g0Var.f19307a;
                    wma wmaVarG0 = bdx.g0(l2g0Var, list, wcbVar, z, z2);
                    d280 d280VarO2 = ahb.O(list3, z3);
                    d280 d280VarP2 = ahb.P(list2, z3);
                    String str8 = l2g0Var.l;
                    String strH2 = ahb.H(l2g0Var);
                    String strM2 = ahb.M(l2g0Var);
                    pz40 pz40Var2 = s6t0.f31722a;
                    glaVar = new jla(wmaVarG0, new gma(d280VarO2, d280VarP2, str8, strH2, s6t0.b().f33626a.getTextPrimary(), str6, strM2, s6t0.b().f33626a.getTextPrimary(), new jwm(ahb.E(l2g0Var, ctf0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.H(l2g0Var, z), j3);
                } else if (iOrdinal2 == 3) {
                    String strQ2 = ahb.Q(l2g0Var, list, wcbVar);
                    long j4 = l2g0Var.f19307a;
                    vma vmaVarF0 = bdx.f0(l2g0Var, list, wcbVar, z, ctf0Var, z2);
                    d280 d280VarO3 = ahb.O(list3, z3);
                    d280 d280VarP3 = ahb.P(list2, z3);
                    String str9 = l2g0Var.l;
                    String strH3 = ahb.H(l2g0Var);
                    String strM3 = ahb.M(l2g0Var);
                    pz40 pz40Var3 = s6t0.f31722a;
                    glaVar = new ila(j4, w9x.E(l2g0Var, z), vmaVarF0, new ama(d280VarO3, d280VarP3, str9, strH3, s6t0.b().f33626a.getTextPrimary(), str6, strM3, s6t0.b().f33626a.getTextPrimary(), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), new n0x(strQ2));
                } else {
                    if (iOrdinal2 != 4) {
                        t9f.b();
                        return null;
                    }
                    long j5 = l2g0Var.f19307a;
                    uma umaVarE0 = bdx.e0(l2g0Var, list, wcbVar, z, z2);
                    d280 d280VarO4 = ahb.O(list3, z3);
                    d280 d280VarP4 = ahb.P(list2, z3);
                    String str10 = l2g0Var.l;
                    String strH4 = ahb.H(l2g0Var);
                    String strM4 = ahb.M(l2g0Var);
                    pz40 pz40Var4 = s6t0.f31722a;
                    glaVar = new hla(umaVarE0, new ula(d280VarO4, d280VarP4, str10, strH4, s6t0.b().f33626a.getTextPrimary(), str6, strM4, s6t0.b().f33626a.getTextPrimary(), new jwm(ahb.E(l2g0Var, ctf0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.D(l2g0Var, z), j5);
                }
            } else if (!z3 && list3.size() == 2 && list2.size() == 2) {
                int iOrdinal3 = v5l0Var.ordinal();
                if (iOrdinal3 == 0) {
                    glaVar = new gla(bdx.d0(l2g0Var, list, wcbVar, z2), new sla(new w1n(str4, (d280) ahb.J(list3, z3).f46059a, (d280) ahb.J(list3, z3).b), new w1n(str6, (d280) ahb.K(list2, z3).f46059a, (d280) ahb.K(list2, z3).b), new t1n(ahb.H(l2g0Var), ahb.M(l2g0Var)), new jwm(ahb.E(l2g0Var, ctf0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.C(l2g0Var, ctf0Var, z), l2g0Var.f19307a);
                } else if (iOrdinal3 == 1) {
                    glaVar = new kla(bdx.h0(l2g0Var, list, wcbVar, z, z2), new qma(new vzm(str4, ahb.H(l2g0Var)), new vzm(str6, ahb.M(l2g0Var)), new jwm(ahb.E(l2g0Var, ctf0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.I(l2g0Var, z), l2g0Var.f19307a);
                } else if (iOrdinal3 == 2) {
                    long j6 = l2g0Var.f19307a;
                    glaVar = new jla(bdx.g0(l2g0Var, list, wcbVar, z, z2), new kma(new wzm(str4, null, ahb.H(l2g0Var)), new wzm(str6, null, ahb.M(l2g0Var)), ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), new jwm(ahb.E(l2g0Var, ctf0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.H(l2g0Var, z), j6);
                } else if (iOrdinal3 == 3) {
                    String strQ3 = ahb.Q(l2g0Var, list, wcbVar);
                    glaVar = new ila(l2g0Var.f19307a, w9x.E(l2g0Var, z), bdx.f0(l2g0Var, list, wcbVar, z, ctf0Var, z2), new ema(new w1n(str4, (d280) ahb.J(list3, z3).f46059a, (d280) ahb.J(list3, z3).b), new w1n(str6, (d280) ahb.K(list2, z3).f46059a, (d280) ahb.K(list2, z3).b), new u1n(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), ahb.H(l2g0Var), ahb.M(l2g0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), new n0x(strQ3));
                } else {
                    if (iOrdinal3 != 4) {
                        t9f.b();
                        return null;
                    }
                    glaVar = new hla(bdx.e0(l2g0Var, list, wcbVar, z, z2), new yla(new w1n(str4, (d280) ahb.J(list3, z3).f46059a, (d280) ahb.J(list3, z3).b), new w1n(str6, (d280) ahb.K(list2, z3).f46059a, (d280) ahb.K(list2, z3).b), new v1n(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), ahb.H(l2g0Var), ahb.M(l2g0Var)), new jwm(ahb.E(l2g0Var, ctf0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.D(l2g0Var, z), l2g0Var.f19307a);
                }
            } else if (list3.size() <= 2 || list2.size() <= 2) {
                int iOrdinal4 = v5l0Var.ordinal();
                if (iOrdinal4 == 0) {
                    long j7 = l2g0Var.f19307a;
                    tma tmaVarD1 = bdx.d0(l2g0Var, list, wcbVar, z2);
                    uzm uzmVar = new uzm(str4, ahb.O(list3, z3));
                    uzm uzmVar2 = new uzm(str6, ahb.P(list2, z3));
                    mpm mpmVarL = ahb.L(l2g0Var);
                    jwm jwmVar = new jwm(ahb.E(l2g0Var, ctf0Var));
                    jwm jwmVar2 = new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE);
                    jwm jwmVar3 = new jwm(str5, Integer.MAX_VALUE);
                    uso0 uso0Var = uso0.f36223a;
                    glaVar = new gla(tmaVarD1, new rla(uzmVar, uzmVar2, mpmVarL, jwmVar, jwmVar2, jwmVar3), w9x.C(l2g0Var, ctf0Var, z), j7);
                } else if (iOrdinal4 == 1) {
                    long j8 = l2g0Var.f19307a;
                    xma xmaVarH0 = bdx.h0(l2g0Var, list, wcbVar, z, z2);
                    vzm vzmVar = new vzm(str4, ahb.H(l2g0Var));
                    vzm vzmVar2 = new vzm(str6, ahb.M(l2g0Var));
                    jwm jwmVar4 = new jwm(ahb.E(l2g0Var, ctf0Var));
                    jwm jwmVar5 = new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE);
                    jwm jwmVar6 = new jwm(str5, Integer.MAX_VALUE);
                    uso0 uso0Var2 = uso0.f36223a;
                    glaVar = new kla(xmaVarH0, new pma(vzmVar, vzmVar2, jwmVar4, jwmVar5, jwmVar6), w9x.I(l2g0Var, z), j8);
                } else if (iOrdinal4 == 2) {
                    long j9 = l2g0Var.f19307a;
                    wma wmaVarG1 = bdx.g0(l2g0Var, list, wcbVar, z, z2);
                    wzm wzmVar = new wzm(str4, ahb.O(list3, z3), ahb.H(l2g0Var));
                    wzm wzmVar2 = new wzm(str6, ahb.P(list2, z3), ahb.M(l2g0Var));
                    jwm jwmVar7 = new jwm(ahb.E(l2g0Var, ctf0Var));
                    jwm jwmVar8 = new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE);
                    jwm jwmVar9 = new jwm(str5, Integer.MAX_VALUE);
                    String strA = ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
                    uso0 uso0Var3 = uso0.f36223a;
                    glaVar = new jla(wmaVarG1, new jma(wzmVar, wzmVar2, strA, jwmVar7, jwmVar8, jwmVar9), w9x.H(l2g0Var, z), j9);
                } else if (iOrdinal4 == 3) {
                    String strQ4 = ahb.Q(l2g0Var, list, wcbVar);
                    long j10 = l2g0Var.f19307a;
                    vma vmaVarF1 = bdx.f0(l2g0Var, list, wcbVar, z, ctf0Var, z2);
                    xzm xzmVar = new xzm(str4, ahb.O(list3, z3));
                    xzm xzmVar2 = new xzm(str6, ahb.P(list2, z3));
                    a2m a2mVarD = ahb.D(l2g0Var);
                    jwm jwmVar10 = new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE);
                    jwm jwmVar11 = new jwm(str5, Integer.MAX_VALUE);
                    uso0 uso0Var4 = uso0.f36223a;
                    glaVar = new ila(j10, w9x.E(l2g0Var, z), vmaVarF1, new dma(xzmVar, xzmVar2, a2mVarD, jwmVar10, jwmVar11), new n0x(strQ4));
                } else {
                    if (iOrdinal4 != 4) {
                        t9f.b();
                        return null;
                    }
                    long j11 = l2g0Var.f19307a;
                    uma umaVarE1 = bdx.e0(l2g0Var, list, wcbVar, z, z2);
                    yzm yzmVar = new yzm(str4, ahb.O(list3, z3));
                    yzm yzmVar2 = new yzm(str6, ahb.P(list2, z3));
                    a2m a2mVarD2 = ahb.D(l2g0Var);
                    String strE = ahb.E(l2g0Var, ctf0Var);
                    jwm jwmVar12 = new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE);
                    jwm jwmVar13 = new jwm(str5, Integer.MAX_VALUE);
                    uso0 uso0Var5 = uso0.f36223a;
                    glaVar = new hla(umaVarE1, new xla(yzmVar, yzmVar2, a2mVarD2, strE, jwmVar12, jwmVar13), w9x.D(l2g0Var, z), j11);
                }
            } else {
                int iOrdinal5 = v5l0Var.ordinal();
                if (iOrdinal5 == 0) {
                    glaVar = new gla(bdx.d0(l2g0Var, list, wcbVar, z2), new pla(new uzm(str4, null), new uzm(str6, null), ahb.L(l2g0Var), new jwm(ahb.E(l2g0Var, ctf0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.C(l2g0Var, ctf0Var, z), l2g0Var.f19307a);
                } else if (iOrdinal5 == 1) {
                    glaVar = new kla(bdx.h0(l2g0Var, list, wcbVar, z, z2), new nma(new vzm(str4, ahb.H(l2g0Var)), new vzm(str6, ahb.M(l2g0Var)), new jwm(ahb.E(l2g0Var, ctf0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.I(l2g0Var, z), l2g0Var.f19307a);
                } else if (iOrdinal5 == 2) {
                    long j12 = l2g0Var.f19307a;
                    glaVar = new jla(bdx.g0(l2g0Var, list, wcbVar, z, z2), new hma(new wzm(str4, null, ahb.H(l2g0Var)), new wzm(str6, null, ahb.M(l2g0Var)), ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), new jwm(ahb.E(l2g0Var, ctf0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.H(l2g0Var, z), j12);
                } else if (iOrdinal5 == 3) {
                    String strQ5 = ahb.Q(l2g0Var, list, wcbVar);
                    glaVar = new ila(l2g0Var.f19307a, w9x.E(l2g0Var, z), bdx.f0(l2g0Var, list, wcbVar, z, ctf0Var, z2), new bma(new w1n(str4, null, null), new w1n(str6, null, null), new u1n(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), ahb.H(l2g0Var), ahb.M(l2g0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), new n0x(strQ5));
                } else {
                    if (iOrdinal5 != 4) {
                        t9f.b();
                        return null;
                    }
                    glaVar = new hla(bdx.e0(l2g0Var, list, wcbVar, z, z2), new vla(new w1n(str4, null, null), new w1n(str6, null, null), new v1n(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), ahb.H(l2g0Var), ahb.M(l2g0Var)), new jwm(ahb.E(l2g0Var, ctf0Var)), new jwm(ahb.z(l2g0Var.c, str3, str2, str, ctf0Var), Integer.MAX_VALUE), new jwm(str5, Integer.MAX_VALUE)), w9x.D(l2g0Var, z), l2g0Var.f19307a);
                }
            }
        }
        return glaVar;
    }

    public static final void h(int i, fet fetVar) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-926012050);
        if (fetVar2.U(i & 1, i != 0)) {
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
            v8q0.a(rsm0.w(R.string.live_new, 0, fetVar2), new x7z(1.0f, false), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.r(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ei20(i, (byte) 29);
        }
    }

    public static final Object h0(i050 i050Var, Function1 function1, zje zjeVar) {
        gie0 gie0Var = new gie0(i050Var);
        return zjeVar.getContext().get(gie0Var) != null ? function1.invoke(zjeVar) : qjj.d0(new fie0(gie0Var), new pnd0(i050Var, function1, null, (byte) 3), zjeVar);
    }

    public static final void i(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, Function1 function1, Function1 function2, xdr xdrVar, xdr xdrVar2, xdr xdrVar3, Function1 function3, fet fetVar, int i) {
        int i2;
        xcz xczVar2;
        l7m0Var.getClass();
        function1.getClass();
        function2.getClass();
        xdrVar.getClass();
        xdrVar2.getClass();
        xdrVar3.getClass();
        function3.getClass();
        fetVar.g0(1272390732);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            xczVar2 = xczVar;
            i2 |= fetVar.g(xczVar2) ? 256 : 128;
        } else {
            xczVar2 = xczVar;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(xdrVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(xdrVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(xdrVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.i(function3) ? 67108864 : 33554432;
        }
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            c030.a(s5x0.L(mm40VarQ, qmk.a(fetVar).c, 0.0f, 2), l7m0Var, null, xczVar2, u1c.M(-777199546, new vz20(xdrVar2, xdrVar3, function3, (byte) 4), fetVar), u1c.M(187290458, new wz20(function1, function2, (byte) 1), fetVar), u1c.M(142830131, new xz20(xdrVar, function1, function2, (byte) 4), fetVar), ny9.d, ny9.e, fetVar, (i2 & 112) | 115040256 | ((i2 << 3) & 7168), 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yz20(mm40Var, l7m0Var, xczVar, function1, function2, xdrVar, xdrVar2, xdrVar3, function3, i, (byte) 4);
        }
    }

    public static final void j(mm40 mm40Var, String str, tvw tvwVar, String str2, boolean z, a4x a4xVar, ec ecVar, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        jm40 jm40Var;
        String str3 = str2;
        fet fetVar2 = fetVar;
        str3.getClass();
        a4xVar.getClass();
        function0.getClass();
        fetVar2.g0(-1585296443);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(tvwVar) ? 256 : 128) | (fetVar2.g(str3) ? 2048 : 1024) | (fetVar2.h(z) ? 16384 : 8192) | (fetVar2.g(a4xVar) ? 131072 : 65536) | (fetVar2.g(ecVar) ? 1048576 : 524288) | (fetVar2.i(function0) ? 8388608 : 4194304);
        if (fetVar2.U(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z2 = ecVar.b;
            boolean zH = fetVar2.h(z2);
            Object objP = fetVar2.P();
            if (zH || objP == ukd.f35823a) {
                zcl zclVar = qmk.f28987a;
                objP = twn.j(z2 ? 4.0f : 8.0f, fetVar2);
            }
            float f = ((ycl) objP).f42389a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 12.0f, f, 0.0f, 0.0f, 12);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(qw3Var, xx7Var, fetVar2, 0);
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
            mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA2 = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(str, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar2), fetVar, (i2 >> 3) & 14, 24960, 110588);
            if (z) {
                fetVar.e0(866859990);
                h(0, fetVar);
            } else {
                fetVar.e0(1102870331);
            }
            fetVar.r(false);
            fetVar.r(true);
            str3 = str2;
            jwb.p(null, new qw3(4.0f, true, new gne(xx7Var, (byte) 12)), new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, 0, 0, u1c.M(-1145703578, new eyn(a4xVar, tvwVar, str3, (byte) 24), fetVar), fetVar, 1575936, 49);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (z2) {
                fetVar2.e0(1077295016);
                jm40Var = jm40Var2;
                acb.n(new zb(null, null, 7), ecVar.f7542a, function0, s5x0.N(jm40Var, 8.0f, 0.0f, 4.0f, 0.0f, 10), fetVar2, (i2 >> 15) & 896, 0);
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(1077582758);
                zq8.a(0, fetVar2, o7k0.s(jm40Var, 12.0f));
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
            yfe0VarU.d = new ntm(mm40Var2, str, tvwVar, str3, z, a4xVar, ecVar, function0, i);
        }
    }

    public static final void k(List list, Function1 function1, fet fetVar, int i) {
        fetVar.g0(869363380);
        byte b = 2;
        int i2 = (fetVar.g(list) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            float f = xfn.a(fetVar).d;
            lh80 lh80Var = new lh80(f, 12.0f, f, 12.0f);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new rb(list, function1, (byte) 10);
                fetVar.o0(objP);
            }
            b8k0.e(null, null, lh80Var, null, null, null, false, null, (Function1) objP, fetVar, 0, 507);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yx(list, function1, i, b);
        }
    }

    public static final void l(int i, fet fetVar, mm40 mm40Var, c280 c280Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(173790909);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(c280Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str2) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
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
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.j, c280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.p, g1t0.m().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, qmk.B, 2, false, 2, 0, null, g1t0.m(), fetVar2, (i2 >> 6) & 14, 24960, 108530);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iym(mm40Var2, c280Var, str2, i);
        }
    }

    public static final void m(int i, long j, long j2, fet fetVar, c280 c280Var, c280 c280Var2, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        c280 c280Var3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2098929430);
        int i2 = (fetVar2.f(j2) ? 536870912 : 268435456) | i | (fetVar.g(c280Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(c280Var2) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.h(z) ? 16384 : 8192) | (fetVar2.g(str3) ? 131072 : 65536) | (fetVar2.f(j) ? 1048576 : 524288) | (fetVar2.h(z2) ? 8388608 : 4194304) | (fetVar2.g(str4) ? 67108864 : 33554432);
        if (fetVar2.U(i2 & 1, (306783379 & i2) != 306783378)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.e(jm40Var, 52.0f), true);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarH);
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
            c280Var3 = c280Var;
            l((i2 << 3) & 1008, fetVar2, null, c280Var3, str);
            l((i2 >> 3) & 1008, fetVar2, null, c280Var2, str2);
            fetVar2.r(true);
            mm40 mm40VarE = o7k0.e(jm40Var, 52.0f);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.o, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            x((i2 >> 12) & 1022, j, fetVar2, str3, z);
            fetVar2 = fetVar;
            x((i2 >> 21) & 1022, j2, fetVar2, str4, z2);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            c280Var3 = c280Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s5l0(c280Var3, str, c280Var2, str2, z, str3, j, z2, str4, j2, i, (byte) 4);
        }
    }

    public static final void n(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        fetVar.g0(683604179);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.D;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ugdVar.invoke(fetVar, 6);
            ugdVar2.invoke(fetVar, 6);
            ugdVar3.invoke(fetVar, 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nzb(mm40Var, ugdVar, ugdVar2, ugdVar3, i, (byte) 3);
        }
    }

    public static final void o(mm40 mm40Var, l090 l090Var, cqq cqqVar, Function1 function1, fet fetVar, int i) {
        l090Var.getClass();
        function1.getClass();
        fetVar.g0(1898821048);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(l090Var) ? 32 : 16) | (fetVar.g(cqqVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            obc.d(h36.f12370a.a(cqqVar), u1c.M(1912478328, new dr50((Object) mm40Var, (Object) l090Var, (Object) function1, (byte) 28), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 17, i, (Object) mm40Var, (Object) l090Var, (Object) cqqVar, (Object) function1);
        }
    }

    public static final void p(k3t0 k3t0Var, fet fetVar, int i) {
        k3t0Var.getClass();
        fetVar.g0(185051372);
        int i2 = (fetVar.g(k3t0Var) ? 4 : 2) | i;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            byte b2 = 14;
            int i3 = i2 & 14;
            i3t0 i3t0Var = (i3t0) k3t0Var;
            pz40 pz40VarY = i3t0Var.y(fetVar);
            f9m0 f9m0Var = new f9m0(R.string.statistic, fmm.f9790a, 0L, false, false, null, null, false, 252);
            zdm0 zdm0VarC = ((drd0) pz40VarY.getValue()).c();
            j9m0 j9m0VarB = ((drd0) pz40VarY.getValue()).b();
            boolean zA = ((drd0) pz40VarY.getValue()).a();
            boolean z = i3 == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dbh(i3t0Var, b2);
                fetVar.o0(objP);
            }
            ffb0.D(jm40.b, f9m0Var, zdm0VarC, j9m0VarB, zA, (Function0) objP, null, null, u1c.M(-638218886, new fg00(pz40VarY, i3t0Var, b), fetVar), fetVar, 100663302, 192);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xcr(k3t0Var, i, (byte) 3);
        }
    }

    public static final void q(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-91529442);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                imm immVar = new imm(new ilm(secondary), new plm(((eea0) l7m0Var.getValue()).f7662a, secondary, fa50.f9191a), fmm.f9790a, backgroundContent, true, null);
                fetVar.o0(immVar);
                objP = immVar;
            }
            imm immVar2 = (imm) objP;
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            boolean z = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new i0a0(function1, (byte) 10);
                fetVar.o0(objP2);
            }
            hlm.c(mm40VarD, immVar2, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, 54, 0, 4084);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i, (byte) 14);
        }
    }

    public static final void r(int i, fet fetVar, mm40 mm40Var, String str, Function0 function0, boolean z) {
        mm40 mm40Var2;
        str.getClass();
        function0.getClass();
        fetVar.g0(-36664095);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(str), z, false, true), sh00.n))));
                fetVar.o0(objP);
            }
            mtl mtlVar = (mtl) ((pz40) objP).getValue();
            boolean z3 = (i2 & 7168) == 2048;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new r3w(function0, (byte) 21);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            jm40 jm40Var = jm40.b;
            bkb.f(jm40Var, mtlVar, null, false, null, function1, fetVar, 6, 28);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b0y(mm40Var2, str, z, function0, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:222:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:226:0x03da  */
    /* JADX WARN: Code duplicated, block: B:235:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:241:0x0417  */
    public static final void s(final mm40 mm40Var, final float f, final float f2, final yjj0 yjj0Var, final long j, final hd9 hd9Var, final List list, final int i, final int i2, final int i3, final tcj tcjVar, final Locale locale, fet fetVar, final int i4, final int i5) {
        int i6;
        int i7;
        Locale locale2;
        Object rjf0Var;
        Unit unit;
        cgk0 cgk0Var;
        boolean z;
        List list2;
        v9v0 v9v0Var;
        int i8;
        GregorianCalendar gregorianCalendar;
        int i9;
        cgk0 cgk0Var2;
        cgk0 cgk0Var3;
        cl5 cl5Var;
        cgk0 cgk0Var4;
        boolean z2;
        Object objP;
        boolean z3;
        boolean zG;
        Object objP2;
        fet fetVar2;
        tcj tcjVar2 = tcjVar;
        yjj0Var.getClass();
        hd9Var.getClass();
        list.getClass();
        fetVar.g0(656449955);
        if ((i4 & 6) == 0) {
            i6 = (fetVar.g(mm40Var) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= fetVar.d(f) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= fetVar.d(f2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= fetVar.g(yjj0Var) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= fetVar.f(j) ? 16384 : 8192;
        }
        if ((i4 & 196608) == 0) {
            i6 |= fetVar.e(4) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= (i4 & 2097152) == 0 ? fetVar.g(hd9Var) : fetVar.i(hd9Var) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= (i4 & 16777216) == 0 ? fetVar.g(list) : fetVar.i(list) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= fetVar.e(i) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= fetVar.e(i2) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (fetVar.e(i3) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= (i5 & 64) == 0 ? fetVar.g(tcjVar2) : fetVar.i(tcjVar2) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            locale2 = locale;
            i7 |= fetVar.g(locale2) ? 256 : 128;
        } else {
            locale2 = locale;
        }
        int i10 = i7;
        if (fetVar.U(i6 & 1, ((i6 & 306783379) == 306783378 && (i10 & 147) == 146) ? false : true)) {
            List list3 = hd9Var.f12859a;
            Object obj = list3.get(i);
            obj.getClass();
            v9v0 v9v0Var2 = (v9v0) obj;
            Object obj2 = list3.get(i2);
            obj2.getClass();
            v9v0 v9v0Var3 = (v9v0) obj2;
            Object obj3 = list3.get(i3);
            obj3.getClass();
            v9v0 v9v0Var4 = (v9v0) obj3;
            Object[] objArr = {"date.yearIdx"};
            boolean zI = fetVar.i(v9v0Var2);
            Object objP3 = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (zI || objP3 == cl5Var2) {
                objP3 = new njf0(v9v0Var2, (byte) 1);
                fetVar.o0(objP3);
            }
            cgk0 cgk0Var5 = (cgk0) e9x.Q(objArr, (Function0) objP3, fetVar, 0);
            Object[] objArr2 = {"date.monthIdx"};
            boolean zI2 = fetVar.i(v9v0Var3);
            Object objP4 = fetVar.P();
            if (zI2 || objP4 == cl5Var2) {
                objP4 = new njf0(v9v0Var3, (byte) 2);
                fetVar.o0(objP4);
            }
            cgk0 cgk0Var6 = (cgk0) e9x.Q(objArr2, (Function0) objP4, fetVar, 0);
            Object[] objArr3 = {"date.dayIdx"};
            boolean zI3 = fetVar.i(v9v0Var4);
            Object objP5 = fetVar.P();
            if (zI3 || objP5 == cl5Var2) {
                objP5 = new njf0(v9v0Var4, (byte) 3);
                fetVar.o0(objP5);
            }
            cgk0 cgk0Var7 = (cgk0) e9x.Q(objArr3, (Function0) objP5, fetVar, 0);
            boolean z4 = (i10 & 896) == 256;
            Object objP6 = fetVar.P();
            if (z4 || objP6 == cl5Var2) {
                objP6 = new GregorianCalendar(locale2);
                fetVar.o0(objP6);
            }
            GregorianCalendar gregorianCalendar2 = (GregorianCalendar) objP6;
            Unit unit2 = Unit.f46060a;
            int i11 = i10 & 112;
            int i12 = i6 & 29360128;
            int i13 = i6 & 234881024;
            boolean zI4 = (i11 == 32 || ((i10 & 64) != 0 && fetVar.i(tcjVar2))) | fetVar.i(gregorianCalendar2) | (i12 == 8388608 || ((i6 & 16777216) != 0 && fetVar.i(list))) | (i13 == 67108864);
            int i14 = i6 & 1879048192;
            int i15 = i10 & 14;
            boolean zI5 = zI4 | (i14 == 536870912) | (i15 == 4) | fetVar.i(v9v0Var2) | fetVar.g(cgk0Var5) | fetVar.g(cgk0Var6) | fetVar.g(cgk0Var7);
            Object objP7 = fetVar.P();
            if (zI5 || objP7 == cl5Var2) {
                unit = unit2;
                cgk0Var = cgk0Var7;
                z = true;
                rjf0Var = new rjf0(tcjVar2, gregorianCalendar2, v9v0Var2, list, i, i2, i3, cgk0Var5, cgk0Var6, cgk0Var, (yje) null);
                tcjVar2 = tcjVar2;
                list2 = list;
                v9v0Var = v9v0Var2;
                i8 = i3;
                gregorianCalendar = gregorianCalendar2;
                i9 = i2;
                cgk0Var2 = cgk0Var5;
                cgk0Var3 = cgk0Var6;
                fetVar.o0(rjf0Var);
            } else {
                i9 = i2;
                cgk0Var = cgk0Var7;
                cgk0Var3 = cgk0Var6;
                gregorianCalendar = gregorianCalendar2;
                v9v0Var = v9v0Var2;
                z = true;
                list2 = list;
                rjf0Var = objP7;
                cgk0Var2 = cgk0Var5;
                unit = unit2;
                i8 = i3;
            }
            m0x0.t(fetVar, unit, (Function2) rjf0Var);
            Object[] objArr4 = {Boolean.valueOf(((t9v0) list.get(i)).e), Boolean.valueOf(((t9v0) list2.get(i9)).e), Boolean.valueOf(((t9v0) list2.get(i8)).e), Integer.valueOf(cgk0Var2.l()), Integer.valueOf(cgk0Var3.l()), Integer.valueOf(cgk0Var.l())};
            boolean z5 = (i13 == 67108864 ? z : false) | ((i12 == 8388608 || ((i6 & 16777216) != 0 && fetVar.i(list2))) ? z : false) | (i14 == 536870912 ? z : false) | (i15 == 4 ? z : false) | ((i11 == 32 || ((i10 & 64) != 0 && fetVar.i(tcjVar2))) ? z : false);
            GregorianCalendar gregorianCalendar3 = gregorianCalendar;
            cgk0 cgk0Var8 = cgk0Var;
            boolean zI6 = z5 | fetVar.i(gregorianCalendar3) | fetVar.i(v9v0Var) | fetVar.g(cgk0Var2) | fetVar.g(cgk0Var3) | fetVar.g(cgk0Var8);
            Object objP8 = fetVar.P();
            if (zI6) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP8 != cl5Var) {
                    cgk0Var4 = cgk0Var3;
                }
                m0x0.w(objArr4, (Function2) objP8, fetVar);
                if (i12 != 8388608 || ((i6 & 16777216) != 0 && fetVar.i(list2))) {
                    z2 = z;
                } else {
                    z2 = false;
                }
                objP = fetVar.P();
                if (z2 || objP == cl5Var) {
                    objP = new kv80(list2, (byte) 8);
                    fetVar.o0(objP);
                }
                Function2 function2 = (Function2) objP;
                if (i12 != 8388608 || ((i6 & 16777216) != 0 && fetVar.i(list2))) {
                    z3 = z;
                } else {
                    z3 = false;
                }
                zG = z3 | fetVar.g(cgk0Var2) | fetVar.g(cgk0Var4) | fetVar.g(cgk0Var8);
                objP2 = fetVar.P();
                if (!zG || objP2 == cl5Var) {
                    fetVar2 = fetVar;
                    x2g x2gVar = new x2g((Object) list2, (Object) cgk0Var2, (Object) cgk0Var4, (Object) cgk0Var8, (byte) 28);
                    fetVar2.o0(x2gVar);
                    objP2 = x2gVar;
                } else {
                    fetVar2 = fetVar;
                }
                int i16 = i6 >> 3;
                bdx.C(mm40Var, f, f2, j, yjj0Var, list, false, function2, (xdr) objP2, fetVar2, (i6 & 14) | 12582912 | (i6 & 112) | (i6 & 896) | (i16 & 7168) | ((i6 << 3) & 57344) | (458752 & i6) | (i16 & 3670016));
            }
            cgk0 cgk0Var9 = cgk0Var2;
            cgk0 cgk0Var10 = cgk0Var3;
            rjf0 rjf0Var2 = new rjf0(list2, i, i9, i8, tcjVar2, gregorianCalendar3, v9v0Var, cgk0Var9, cgk0Var10, cgk0Var8, (yje) null);
            cgk0Var2 = cgk0Var9;
            cgk0Var4 = cgk0Var10;
            fetVar.o0(rjf0Var2);
            objP8 = rjf0Var2;
            m0x0.w(objArr4, (Function2) objP8, fetVar);
            if (i12 != 8388608) {
                z2 = z;
            } else {
                z2 = z;
            }
            objP = fetVar.P();
            if (z2) {
                objP = new kv80(list2, (byte) 8);
                fetVar.o0(objP);
            } else {
                objP = new kv80(list2, (byte) 8);
                fetVar.o0(objP);
            }
            Function2 function3 = (Function2) objP;
            if (i12 != 8388608) {
                z3 = z;
            } else {
                z3 = z;
            }
            zG = z3 | fetVar.g(cgk0Var2) | fetVar.g(cgk0Var4) | fetVar.g(cgk0Var8);
            objP2 = fetVar.P();
            if (zG) {
                fetVar2 = fetVar;
                x2g x2gVar2 = new x2g((Object) list2, (Object) cgk0Var2, (Object) cgk0Var4, (Object) cgk0Var8, (byte) 28);
                fetVar2.o0(x2gVar2);
                objP2 = x2gVar2;
            } else {
                fetVar2 = fetVar;
                x2g x2gVar3 = new x2g((Object) list2, (Object) cgk0Var2, (Object) cgk0Var4, (Object) cgk0Var8, (byte) 28);
                fetVar2.o0(x2gVar3);
                objP2 = x2gVar3;
            }
            int i17 = i6 >> 3;
            bdx.C(mm40Var, f, f2, j, yjj0Var, list, false, function3, (xdr) objP2, fetVar2, (i6 & 14) | 12582912 | (i6 & 112) | (i6 & 896) | (i17 & 7168) | ((i6 << 3) & 57344) | (458752 & i6) | (i17 & 3670016));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.qjf0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iL = x8x.L(i4 | 1);
                    int iL2 = x8x.L(i5);
                    vdx.s(mm40Var, f, f2, yjj0Var, j, hd9Var, list, i, i2, i3, tcjVar, locale, (fet) obj4, iL, iL2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void t(List list, int i, int i2, int i3) {
        Iterator it = q3d.h(((t9v0) list.get(i)).b).iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            cav0 cav0Var = (cav0) ((t9v0) list.get(i)).b.get(iNextInt);
            if (cav0Var.c) {
                ((t9v0) list.get(i)).b.set(iNextInt, cav0.a(cav0Var, false));
            }
        }
        Iterator it2 = q3d.h(((t9v0) list.get(i2)).b).iterator();
        while (((kkx) it2).c) {
            int iNextInt2 = ((bkx) it2).nextInt();
            cav0 cav0Var2 = (cav0) ((t9v0) list.get(i2)).b.get(iNextInt2);
            if (cav0Var2.c) {
                ((t9v0) list.get(i2)).b.set(iNextInt2, cav0.a(cav0Var2, false));
            }
        }
        Iterator it3 = q3d.h(((t9v0) list.get(i3)).b).iterator();
        while (((kkx) it3).c) {
            int iNextInt3 = ((bkx) it3).nextInt();
            cav0 cav0Var3 = (cav0) ((t9v0) list.get(i3)).b.get(iNextInt3);
            if (cav0Var3.c) {
                ((t9v0) list.get(i3)).b.set(iNextInt3, cav0.a(cav0Var3, false));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    public static final void u(tcj tcjVar, GregorianCalendar gregorianCalendar, List list, int i, int i2, int i3) {
        int iG;
        int iG2;
        Iterator it = l1e0.o(0, 31).iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            SimpleDate simpleDate = tcjVar.f33721a;
            SimpleDate simpleDate2 = tcjVar.b;
            int i4 = iNextInt + 1;
            boolean z = true;
            if (i4 < 1) {
                z = false;
            } else {
                gregorianCalendar.getClass();
                gregorianCalendar.set(1, i2);
                gregorianCalendar.set(2, i3 - 1);
                gregorianCalendar.set(5, 1);
                if (i4 > gregorianCalendar.getActualMaximum(5) || ((simpleDate != null && ((iG2 = G(i2, i3, i4, simpleDate)) < 0 || iG2 == 0)) || (simpleDate2 != null && ((iG = G(i2, i3, i4, simpleDate2)) > 0 || iG == 0)))) {
                    z = false;
                }
            }
            cav0 cav0Var = (cav0) ((t9v0) list.get(i)).b.get(iNextInt);
            if (cav0Var.c != z) {
                ((t9v0) list.get(i)).b.set(iNextInt, cav0.a(cav0Var, z));
            }
        }
    }

    public static final void v(tcj tcjVar, List list, int i, int i2) {
        Iterator it = l1e0.o(0, 12).iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            boolean zF = up90.f(tcjVar, i2, iNextInt + 1);
            cav0 cav0Var = (cav0) ((t9v0) list.get(i)).b.get(iNextInt);
            if (cav0Var.c != zF) {
                ((t9v0) list.get(i)).b.set(iNextInt, cav0.a(cav0Var, zF));
            }
        }
    }

    public static final void w(List list, int i, v9v0 v9v0Var, tcj tcjVar) {
        Iterator it = q3d.h(((t9v0) list.get(i)).b).iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            boolean zH = up90.h(tcjVar, ((Number) ((u9v0) v9v0Var.f37054a.get(iNextInt)).c).intValue());
            cav0 cav0Var = (cav0) ((t9v0) list.get(i)).b.get(iNextInt);
            if (cav0Var.c != zH) {
                ((t9v0) list.get(i)).b.set(iNextInt, cav0.a(cav0Var, zH));
            }
        }
    }

    public static final void x(int i, long j, fet fetVar, String str, boolean z) {
        int i2;
        long j2;
        fetVar.g0(-625885718);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i2 |= fetVar.f(j2) ? 256 : 128;
        } else {
            j2 = j;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 24.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            mm40 mm40VarS = o7k0.s(jm40Var, 6.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
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
            if (z) {
                fetVar.e0(-649449087);
                vzb.h(0, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(-649405842);
                fetVar.r(false);
            }
            fetVar.r(true);
            v8q0.a(str, o7k0.u(jm40Var, 0.0f, 144.0f, 1), j2, new n05(qmk.o, g1t0.a().f42262a.b, qmk.n), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.a(), fetVar, ((i2 >> 3) & 14) | (i2 & 896), 24960, 109552);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5l0(z, str, j, i, (byte) 4);
        }
    }

    public static final void y(int i, fet fetVar, mm40 mm40Var, String str, boolean z) {
        mm40 mm40Var2;
        long jM98getGreen0d7_KjU;
        str.getClass();
        fetVar.g0(1503280586);
        int i2 = (fetVar.g(str) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16) | 384;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarN = o7k0.n(mm40Var2, 32.0f);
            zfn zfnVar = zaq0.b;
            dn8 dn8VarH = j120.h(1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator());
            mm40 mm40VarQ = i120.Q(i120.T(mm40VarN, dn8VarH.f6356a, dn8VarH.b, vgg0.a(8.0f)), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), vgg0.a(8.0f));
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
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
            mm40 mm40VarB = jr8.f16991a.b(o7k0.y(o7k0.u(mm40Var2, 0.0f, 22.0f, 1), null, 3), zx7Var);
            String strL = ttm0.L(3, str);
            y9q0 y9q0Var = new y9q0(0L, qmk.t, null, j1t0.f15753a, 0L, null, 0, 0, idm0.t(22), 16646109);
            if (z) {
                fetVar.e0(-2036954155);
                jM98getGreen0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU();
                fetVar.r(false);
            } else {
                fetVar.e0(-2037020619);
                jM98getGreen0d7_KjU = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
                fetVar.r(false);
            }
            w7n0.l(0, jM98getGreen0d7_KjU, fetVar, mm40VarB, y9q0Var, strL);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z05(str, z, mm40Var2, i);
        }
    }

    public static final void z(int i, fet fetVar) {
        fetVar.g0(-1947026462);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            xvw.d(7, 48, fetVar, s5x0.N(jm40.b, qmk.a(fetVar).d, 12.0f, qmk.a(fetVar).d, 0.0f, 8));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new so90(i, (byte) 14);
        }
    }
}
