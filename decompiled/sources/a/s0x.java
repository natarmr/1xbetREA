package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
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

/* JADX INFO: loaded from: classes6.dex */
public abstract class s0x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31430a = 2;

    public static final x640 A(int i, int i2, int i3, boolean z) {
        if (i == -1) {
            return new w640(axq.g(), false);
        }
        v640 v640Var = v640.f36855a;
        if (z && i > i3) {
            return v640Var;
        }
        u640 u640Var = u640.f35121a;
        return (!z && i > i2) ? v640Var : u640Var;
    }

    public static void B(String str, boolean z) {
        if (z) {
            return;
        }
        jf4.o(str);
    }

    public static void C(boolean z) {
        if (z) {
            return;
        }
        e9d0.o();
    }

    public static void D(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            f140.v(sb, "Must be called on ", name2, " thread, but got ", name);
            itt0.n(sb, Separators.DOT);
        }
    }

    public static void E(String str) {
        if (TextUtils.isEmpty(str)) {
            jf4.o("Given String is empty or null");
        }
    }

    public static void F(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            jf4.o(str2);
        }
    }

    public static void G(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        jf4.n(str);
    }

    public static void H(Object obj) {
        if (obj != null) {
            return;
        }
        hny.u("null reference");
    }

    public static void I(Object obj, String str) {
        if (obj != null) {
            return;
        }
        hny.u(str);
    }

    public static void J(String str, boolean z) {
        if (z) {
            return;
        }
        jf4.n(str);
    }

    public static final Pair K(List list, cj50 cj50Var) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ji50) next).e != cj50Var);
        ji50 ji50Var = (ji50) next;
        if (ji50Var == null) {
            return new Pair(0, 0);
        }
        Integer intOrNull = StringsKt.toIntOrNull(ji50Var.b);
        Integer numValueOf = Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0);
        Integer intOrNull2 = StringsKt.toIntOrNull(ji50Var.c);
        return new Pair(numValueOf, Integer.valueOf(intOrNull2 != null ? intOrNull2.intValue() : 0));
    }

    public static final bjk L(wul0 wul0Var) {
        uul0 uul0Var = wul0Var instanceof uul0 ? (uul0) wul0Var : null;
        if (uul0Var != null) {
            return uul0Var.b;
        }
        return null;
    }

    public static final int M(d270 d270Var) {
        int iOrdinal = d270Var.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.ic_glyph_lucky_wheel;
        }
        if (iOrdinal == 1) {
            return R.drawable.ic_glyph_gift;
        }
        if (iOrdinal == 3) {
            return R.drawable.ic_glyph_reward;
        }
        if (iOrdinal == 4) {
            return R.drawable.ic_glyph_tournaments;
        }
        if (iOrdinal != 6) {
            return iOrdinal != 7 ? R.drawable.ic_glyph_gift : R.drawable.ic_glyph_bonus_info;
        }
        return R.drawable.ic_glyph_jackpot;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if ((r2 instanceof a.pos0) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a.yos0 N(a.qos0 r2, java.util.Map r3, java.util.Map r4) {
        /*
            r0 = 0
            if (r2 == 0) goto L2e
            boolean r1 = r2 instanceof a.oos0
            if (r1 == 0) goto L14
            r0 = r2
            a.oos0 r0 = (a.oos0) r0
            java.lang.String r0 = r0.f25608a
            java.lang.Object r4 = r4.get(r0)
            r0 = r4
            java.io.File r0 = (java.io.File) r0
            goto L18
        L14:
            boolean r4 = r2 instanceof a.pos0
            if (r4 == 0) goto L2e
        L18:
            if (r0 == 0) goto L20
            a.wos0 r3 = new a.wos0
            r3.<init>(r2, r0)
            return r3
        L20:
            java.lang.Object r3 = r3.get(r2)
            a.yos0 r3 = (a.yos0) r3
            if (r3 != 0) goto L2d
            a.uos0 r3 = new a.uos0
            r3.<init>(r2)
        L2d:
            return r3
        L2e:
            a.t9f.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.s0x.N(a.qos0, java.util.Map, java.util.Map):a.yos0");
    }

    public static final LinkedHashMap O(int i, int i2, int i3, long j, long j2, String str, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("cfView", Integer.valueOf(i3));
        linkedHashMap.put("country", Integer.valueOf(i));
        linkedHashMap.put("fcountry", Integer.valueOf(i2));
        linkedHashMap.put("gr", 1357);
        linkedHashMap.put("lng", str);
        linkedHashMap.put("mainGameId", Long.valueOf(j));
        linkedHashMap.put("ref", 1);
        if (z) {
            linkedHashMap.put("userId", Long.valueOf(j2));
        }
        return linkedHashMap;
    }

    public static final qq40 P(CoroutineContext coroutineContext) {
        qq40 qq40Var = (qq40) coroutineContext.get(lwf.t);
        if (qq40Var != null) {
            return qq40Var;
        }
        jf4.n("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final ArrayList Q(List list, List list2) {
        qdh0 qdh0Var;
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zch0 zch0Var = (zch0) it.next();
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    qdh0Var = qdh0.MISS;
                    break;
                }
                if (((ldh0) it2.next()).c.contains(zch0Var)) {
                    qdh0Var = qdh0.HIT;
                    break;
                }
            }
            arrayList.add(new rdh0(new edh0(zch0Var.f44167a, zch0Var.b), qdh0Var));
        }
        return arrayList;
    }

    public static final int R(qpg0 qpg0Var) {
        qpg0Var.getClass();
        xpg0 xpg0VarZ0 = qpg0Var.Z0("SELECT changes()");
        try {
            xpg0VarZ0.W0();
            int i = (int) xpg0VarZ0.getLong(0);
            ay3.L(xpg0VarZ0, null);
            return i;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(xpg0VarZ0, th);
                throw th2;
            }
        }
    }

    public static final void S(qai0 qai0Var) {
        vcc.Z(qai0Var).G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [a.a640, java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [a.a640, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [a.ilf0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    public static final a640 T(n640 n640Var, gxb gxbVar, String str) {
        ?? r16;
        ArrayList arrayList;
        ?? arrayList2;
        ?? arrayList3;
        List<glf0> list;
        List<clf0> list2;
        List list3 = n640Var.e;
        List list4 = n640Var.j;
        String str2 = n640Var.d;
        h640 h640Var = n640Var.i;
        String str3 = n640Var.c;
        Long l = n640Var.k;
        Integer num = n640Var.f22978a;
        List<yl30> list5 = list3 == null ? iun.f15405a : list3;
        boolean zIsEmpty = list5.isEmpty();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ?? r14 = 0;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        if (!zIsEmpty && !list5.isEmpty()) {
            for (yl30 yl30Var : list5) {
                if (!V(yl30Var) && U(yl30Var)) {
                    if (num == null) {
                        jf4.k(null);
                        return null;
                    }
                    int iIntValue = num.intValue();
                    if (l == null) {
                        jf4.k(null);
                        return null;
                    }
                    Date date = new Date(timeUnit.toMillis(l.longValue()));
                    if (str3 == null) {
                        jf4.k(null);
                        return null;
                    }
                    xrt0 xrt0VarW = W(gxbVar, str3);
                    if (list3 == null) {
                        list3 = iun.f15405a;
                    }
                    if (list3.isEmpty()) {
                        jf4.k(null);
                        return null;
                    }
                    n0o0 n0o0VarB = maz.b(new b640(iIntValue, gxbVar, (byte) 4));
                    ilf0 ilf0VarF0 = h640Var != null ? f0(h640Var, iIntValue, gxbVar) : null;
                    String str4 = str2 == null ? "" : str2;
                    if (list4 != null) {
                        arrayList4 = new ArrayList();
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            p830 p830VarU = uvw.U((z830) it.next());
                            if (p830VarU != null) {
                                arrayList4.add(p830VarU);
                            }
                        }
                    }
                    ArrayList arrayList6 = arrayList4;
                    x640 x640Var = (x640) n0o0VarB.getValue();
                    ArrayList arrayList7 = new ArrayList(r3d.q(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList7.add(Z((yl30) it2.next()));
                    }
                    return new p540(iIntValue, ilf0VarF0, str, xrt0VarW, x640Var, date, str4, arrayList6, arrayList7);
                }
            }
        }
        if (!list5.isEmpty()) {
            if (!list5.isEmpty()) {
                Iterator it3 = list5.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (!V((yl30) it3.next())) {
                        }
                    }
                }
            }
            if (num == null) {
                jf4.k(null);
                return null;
            }
            int iIntValue2 = num.intValue();
            if (l == null) {
                jf4.k(null);
                return null;
            }
            Date date2 = new Date(timeUnit.toMillis(l.longValue()));
            if (str3 == null) {
                jf4.k(null);
                return null;
            }
            xrt0 xrt0VarW2 = W(gxbVar, str3);
            n0o0 n0o0VarB2 = maz.b(new b640(iIntValue2, gxbVar, (byte) 2));
            if (list3 == null) {
                list3 = iun.f15405a;
            }
            if (list3.isEmpty()) {
                jf4.k(null);
                return null;
            }
            ilf0 ilf0VarF1 = h640Var != null ? f0(h640Var, iIntValue2, gxbVar) : null;
            x640 x640Var2 = (x640) n0o0VarB2.getValue();
            String str5 = str2 == null ? "" : str2;
            if (list4 != null) {
                arrayList5 = new ArrayList();
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    p830 p830VarU2 = uvw.U((z830) it4.next());
                    if (p830VarU2 != null) {
                        arrayList5.add(p830VarU2);
                    }
                }
            }
            ArrayList arrayList8 = arrayList5;
            ArrayList arrayList9 = new ArrayList(r3d.q(list3, 10));
            Iterator it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList9.add(a0((yl30) it5.next()));
            }
            return new r540(iIntValue2, ilf0VarF1, str, xrt0VarW2, x640Var2, date2, str5, arrayList8, arrayList9);
        }
        hlf0 hlf0Var = n640Var.f;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue3 = num.intValue();
        if (l == null) {
            jf4.k(null);
            return null;
        }
        String str6 = str2;
        Date date3 = new Date(timeUnit.toMillis(l.longValue()));
        if (str3 == null) {
            jf4.k(null);
            return null;
        }
        xrt0 xrt0VarW3 = W(gxbVar, str3);
        n0o0 n0o0VarB3 = maz.b(new b640(iIntValue3, gxbVar, (byte) 3));
        if (hlf0Var == null || (list2 = hlf0Var.f13258a) == null) {
            r16 = 0;
            arrayList = null;
        } else {
            ArrayList arrayList10 = new ArrayList(r3d.q(list2, 10));
            for (clf0 clf0Var : list2) {
                ?? r17 = r14;
                String str7 = clf0Var.f4556a;
                if (str7 == null) {
                    jf4.k(r17);
                    return r17;
                }
                String str8 = clf0Var.b;
                if (str8 == null) {
                    jf4.k(r17);
                    return r17;
                }
                String str9 = clf0Var.c;
                if (str9 == null) {
                    jf4.k(r17);
                    return r17;
                }
                arrayList10.add(new ne9(str7, str8, str9));
                r14 = r17;
            }
            r16 = r14;
            arrayList = arrayList10;
        }
        if (hlf0Var == null || (list = hlf0Var.b) == null) {
            arrayList2 = r16;
        } else {
            arrayList2 = new ArrayList(r3d.q(list, 10));
            for (glf0 glf0Var : list) {
                String str10 = glf0Var.f11488a;
                if (str10 == null) {
                    jf4.k(r16);
                    return r16;
                }
                String str11 = glf0Var.b;
                if (str11 == null) {
                    jf4.k(r16);
                    return r16;
                }
                String str12 = glf0Var.c;
                if (str12 == null) {
                    jf4.k(r16);
                    return r16;
                }
                arrayList2.add(new uhg0(str10, str11, str12));
            }
        }
        if (str6 == null) {
            if ((arrayList == null || arrayList.isEmpty()) && (arrayList2 == 0 || arrayList2.isEmpty())) {
                return j0(n640Var, gxbVar);
            }
            str6 = "";
        }
        ?? F0 = h640Var != null ? f0(h640Var, iIntValue3, gxbVar) : r16;
        if (list4 != null) {
            arrayList3 = new ArrayList();
            Iterator it6 = list4.iterator();
            while (it6.hasNext()) {
                p830 p830VarU3 = uvw.U((z830) it6.next());
                if (p830VarU3 != null) {
                    arrayList3.add(p830VarU3);
                }
            }
        } else {
            arrayList3 = r16;
        }
        x640 x640Var3 = (x640) n0o0VarB3.getValue();
        List list6 = arrayList;
        if (arrayList == null) {
            list6 = iun.f15405a;
        }
        List list7 = list6;
        ?? r2 = arrayList2;
        if (arrayList2 == 0) {
            r2 = iun.f15405a;
        }
        return new x540(iIntValue3, str, F0, xrt0VarW3, str6, arrayList3, list7, r2, x640Var3, date3);
    }

    public static final boolean U(yl30 yl30Var) {
        List list = yl30Var.f;
        if (list == null) {
            return false;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((wl30) it.next()) instanceof pl30) {
                    return true;
                }
            }
        }
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (!(((wl30) it2.next()) instanceof ml30)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean V(yl30 yl30Var) {
        List list = yl30Var.f;
        if (list == null) {
            return false;
        }
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((wl30) it.next()) instanceof pl30) {
                List list2 = yl30Var.e;
                if (list2 == null || list2.isEmpty()) {
                    return false;
                }
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((xl30) it2.next()) instanceof sl30) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static final xrt0 W(gxb gxbVar, String str) {
        Object next;
        Iterator it = gxbVar.i.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(str, ((xrt0) next).a()));
        xrt0 xrt0Var = (xrt0) next;
        return xrt0Var == null ? new wrt0(str) : xrt0Var;
    }

    public static final Object X(o0x o0xVar) {
        if (o0xVar != null) {
            if (o0xVar instanceof m0x) {
                int i = ((m0x) o0xVar).f20977a;
                if (i != 0) {
                    return Integer.valueOf(i);
                }
                return null;
            }
            if (o0xVar instanceof n0x) {
                return ((n0x) o0xVar).f22722a;
            }
            if (o0xVar instanceof l0x) {
                return ((l0x) o0xVar).f19222a;
            }
        }
        t9f.b();
        return null;
    }

    public static final Drawable Y(o0x o0xVar, Context context) {
        if (o0xVar != null) {
            if (o0xVar instanceof m0x) {
                int i = ((m0x) o0xVar).f20977a;
                if (i != 0) {
                    return context.getDrawable(i);
                }
                return null;
            }
            if (o0xVar instanceof l0x) {
                return ((l0x) o0xVar).f19222a;
            }
        }
        return null;
    }

    public static final o540 Z(yl30 yl30Var) {
        String str = yl30Var.b;
        if (str == null) {
            jf4.k(null);
            return null;
        }
        String str2 = yl30Var.d;
        if (str2 == null) {
            jf4.k(null);
            return null;
        }
        Long l = yl30Var.c;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        List list = yl30Var.f;
        wl30 wl30Var = list != null ? (wl30) CollectionsKt.firstOrNull(list) : null;
        ml30 ml30Var = wl30Var instanceof ml30 ? (ml30) wl30Var : null;
        if (ml30Var == null) {
            jf4.k(null);
            return null;
        }
        String str3 = ml30Var.b;
        if (str3 != null) {
            return new o540(jLongValue, new ros0(new oos0(str)), str3, str2);
        }
        jf4.k(null);
        return null;
    }

    public static final void a(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        a4x a4xVar2;
        a4xVar.getClass();
        fetVar.g0(-14153920);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                a4xVar2 = a4xVar;
                objP2 = new u0z(b, a4xVar2, cgk0Var, function1);
                fetVar.o0(objP2);
            } else {
                a4xVar2 = a4xVar;
            }
            b8k0.e(mm40Var, null, null, null, null, null, false, null, (Function1) objP2, fetVar, i2 & 14, 510);
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new de9(mm40Var, a4xVar2, function1, i, (byte) 4);
        }
    }

    public static final q540 a0(yl30 yl30Var) {
        String str;
        Long l;
        String str2;
        String str3 = yl30Var.b;
        List list = yl30Var.e;
        if (str3 == null) {
            jf4.k(null);
            return null;
        }
        xl30 xl30Var = list != null ? (xl30) CollectionsKt.firstOrNull(list) : null;
        vl30 vl30Var = xl30Var instanceof vl30 ? (vl30) xl30Var : null;
        if (vl30Var == null || (str = vl30Var.b) == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof sl30) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            String str4 = ((sl30) obj2).b;
            sqt sqtVar = w1x.b;
            if (Intrinsics.d(str4, "sm")) {
                arrayList2.add(obj2);
            }
        }
        sl30 sl30Var = (sl30) CollectionsKt.firstOrNull(arrayList2);
        if (sl30Var == null || (l = sl30Var.e) == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        List list2 = yl30Var.f;
        wl30 wl30Var = list2 != null ? (wl30) CollectionsKt.firstOrNull(list2) : null;
        ml30 ml30Var = wl30Var instanceof ml30 ? (ml30) wl30Var : null;
        if (ml30Var != null && (str2 = ml30Var.b) != null) {
            return new q540(jLongValue, new ros0(new oos0(str3)), str, str2);
        }
        jf4.k(null);
        return null;
    }

    public static final void b(kkz kkzVar, clz clzVar, Function0 function0, fet fetVar, int i) {
        fetVar.g0(-709389590);
        int i2 = (fetVar.i(clzVar) ? 32 : 16) | i | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            if (kkzVar == kkz.ON_DESTROY) {
                jf4.o("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
                return;
            }
            pz40 pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
            boolean zG = fetVar.g(pz40VarF) | fetVar.i(clzVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new k9v((Object) clzVar, (Object) kkzVar, (Object) pz40VarF, (byte) 12);
                fetVar.o0(objP);
            }
            m0x0.o(clzVar, (Function1) objP, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(kkzVar, clzVar, function0, i, (byte) 28);
        }
    }

    public static final a640 b0(n640 n640Var, gxb gxbVar, String str, vby vbyVar) {
        n640Var.getClass();
        gxbVar.getClass();
        vbyVar.getClass();
        try {
            String str2 = n640Var.b;
            if (Intrinsics.d(str2, "ChatSystemMessage")) {
                return i0(n640Var, gxbVar);
            }
            return Intrinsics.d(str2, "ChatParticipantMessage") ? T(n640Var, gxbVar, str) : j0(n640Var, gxbVar);
        } catch (Exception unused) {
            return j0(n640Var, gxbVar);
        }
    }

    public static final void c(int i, fet fetVar, clz clzVar, Boolean bool, Boolean bool2, Object obj, Function1 function1) {
        clz clzVar2;
        int i2;
        fetVar.g0(-485941842);
        int i3 = (fetVar.i(obj) ? 32 : 16) | i | (fetVar.i(bool2) ? 256 : 128) | 1024 | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                clzVar2 = (clz) fetVar.k(or00.f25714a);
                i2 = i3 & (-7169);
            } else {
                fetVar.X();
                i2 = i3 & (-7169);
                clzVar2 = clzVar;
            }
            fetVar.s();
            boolean zG = fetVar.g(bool) | fetVar.g(obj) | fetVar.g(bool2) | fetVar.g(clzVar2);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ilz(clzVar2.x());
                fetVar.o0(objP);
            }
            f(clzVar2, (ilz) objP, function1, fetVar, (i2 >> 6) & 896);
        } else {
            fetVar.X();
            clzVar2 = clzVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ajw((Object) bool, obj, (Object) bool2, (Object) clzVar2, function1, i, (byte) 5);
        }
    }

    public static final a640 c0(rei0 rei0Var, srt0 srt0Var, Map map) {
        rei0Var.getClass();
        srt0Var.getClass();
        map.getClass();
        if (rei0Var instanceof qei0) {
            qei0 qei0Var = (qei0) rei0Var;
            Date date = qei0Var.c;
            String str = qei0Var.d;
            String str2 = qei0Var.f28586a;
            iun iunVar = iun.f15405a;
            return new x540(-1, str, null, srt0Var, str2, iunVar, iunVar, iunVar, new w640(str, qei0Var.e), date);
        }
        if (!(rei0Var instanceof pei0)) {
            t9f.b();
            return null;
        }
        pei0 pei0Var = (pei0) rei0Var;
        boolean z = pei0Var.e;
        String str3 = pei0Var.d;
        List<File> list = pei0Var.b;
        if (list == null || !list.isEmpty()) {
            for (File file : list) {
                file.getClass();
                if (!kotlin.text.c.x(sj3.c0(file), "image", false)) {
                    Date date2 = pei0Var.c;
                    String str4 = pei0Var.f26855a;
                    w640 w640Var = new w640(str3, z);
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    for (File file2 : list) {
                        String absolutePath = file2.getAbsolutePath();
                        absolutePath.getClass();
                        pos0 pos0Var = new pos0(str3, absolutePath);
                        yos0 vos0Var = (yos0) map.get(pos0Var);
                        if (vos0Var == null) {
                            vos0Var = new vos0(pos0Var, file2);
                        }
                        long length = file2.length();
                        String name = file2.getName();
                        name.getClass();
                        arrayList.add(new o540(length, vos0Var, name, sj3.c0(file2)));
                    }
                    return new p540(-1, null, str3, srt0Var, w640Var, date2, str4, null, arrayList);
                }
            }
        }
        Date date3 = pei0Var.c;
        String str5 = pei0Var.f26855a;
        w640 w640Var2 = new w640(str3, z);
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        for (File file3 : list) {
            String absolutePath2 = file3.getAbsolutePath();
            absolutePath2.getClass();
            pos0 pos0Var2 = new pos0(str3, absolutePath2);
            yos0 vos0Var2 = (yos0) map.get(pos0Var2);
            if (vos0Var2 == null) {
                vos0Var2 = new vos0(pos0Var2, file3);
            }
            long length2 = file3.length();
            String name2 = file3.getName();
            name2.getClass();
            arrayList2.add(new q540(length2, vos0Var2, "", name2));
        }
        return new r540(-1, null, str3, srt0Var, w640Var2, date3, str5, null, arrayList2);
    }

    public static final void d(Object obj, clz clzVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1220373486);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                clzVar = (clz) fetVar.k(or00.f25714a);
            } else {
                fetVar.X();
            }
            int i3 = i2 & (-113);
            fetVar.s();
            boolean zG = fetVar.g(obj) | fetVar.g(clzVar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ilz(clzVar.x());
                fetVar.o0(objP);
            }
            f(clzVar, (ilz) objP, function1, fetVar, i3 & 896);
        } else {
            fetVar.X();
        }
        clz clzVar2 = clzVar;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o(obj, (Object) clzVar2, (Object) function1, i, (byte) 28);
        }
    }

    public static final z8a0 d0(eaa0 eaa0Var) {
        zqe zqeVar;
        eaa0Var.getClass();
        String str = eaa0Var.f7457a;
        if (str == null) {
            str = "";
        }
        String str2 = eaa0Var.b;
        if (str2 == null) {
            str2 = "";
        }
        Integer num = eaa0Var.c;
        int iIntValue = num != null ? num.intValue() : 0;
        String str3 = eaa0Var.d;
        if (str3 == null) {
            str3 = "";
        }
        kre kreVar = eaa0Var.e;
        if (kreVar != null) {
            String str4 = kreVar.f18761a;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = kreVar.b;
            if (str5 == null) {
                str5 = "";
            }
            zqeVar = new zqe(str4, str5);
        } else {
            zqeVar = zqe.c;
        }
        String str6 = eaa0Var.f;
        return new z8a0(str, str2, iIntValue, str3, zqeVar, str6 == null ? "" : str6);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    public static final void e(Object obj, Object obj2, clz clzVar, Function1 function1, fet fetVar, int i, int i2) {
        int i3;
        clz clzVar2;
        clz clzVar3;
        boolean zG;
        Object objP;
        fetVar.g0(752680142);
        if ((i & 6) == 0) {
            i3 = (fetVar.i(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.i(obj2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && fetVar.i(clzVar)) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                if ((i2 & 4) != 0) {
                    clzVar3 = (clz) fetVar.k(or00.f25714a);
                    i3 &= -897;
                }
                fetVar.s();
                zG = fetVar.g(obj) | fetVar.g(obj2) | fetVar.g(clzVar3);
                objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new ilz(clzVar3.x());
                    fetVar.o0(objP);
                }
                f(clzVar3, (ilz) objP, function1, fetVar, ((i3 >> 3) & 896) | ((i3 >> 6) & 14));
                clzVar2 = clzVar3;
            } else {
                fetVar.X();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            clzVar3 = clzVar;
            fetVar.s();
            zG = fetVar.g(obj) | fetVar.g(obj2) | fetVar.g(clzVar3);
            objP = fetVar.P();
            if (zG) {
                objP = new ilz(clzVar3.x());
                fetVar.o0(objP);
            } else {
                objP = new ilz(clzVar3.x());
                fetVar.o0(objP);
            }
            f(clzVar3, (ilz) objP, function1, fetVar, ((i3 >> 3) & 896) | ((i3 >> 6) & 14));
            clzVar2 = clzVar3;
        } else {
            fetVar.X();
            clzVar2 = clzVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xkz(obj, obj2, clzVar2, function1, i, i2, (byte) 1);
        }
    }

    public static final yrc0 e0(vrc0 vrc0Var) {
        vrc0Var.getClass();
        if (vrc0Var instanceof trc0) {
            trc0 trc0Var = (trc0) vrc0Var;
            long j = trc0Var.f34417a;
            String str = trc0Var.c;
            String str2 = trc0Var.d;
            String str3 = trc0Var.k;
            int i = trc0Var.h;
            return new wrc0(str3, j, str, str2, i, i > 0);
        }
        if (!(vrc0Var instanceof urc0)) {
            t9f.b();
            return null;
        }
        urc0 urc0Var = (urc0) vrc0Var;
        long j2 = urc0Var.f36158a;
        String str4 = urc0Var.c;
        String str5 = urc0Var.d;
        hds hdsVar = urc0Var.l;
        int i2 = urc0Var.h;
        return new xrc0(hdsVar, j2, str4, str5, i2, i2 > 0);
    }

    public static final void f(clz clzVar, ilz ilzVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(912823238);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(clzVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ilzVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = fetVar.i(ilzVar) | ((i2 & 896) == 256) | fetVar.i(clzVar);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new k9v((Object) clzVar, (Object) ilzVar, (Object) function1, (byte) 13);
                fetVar.o0(objP);
            }
            m0x0.n(clzVar, ilzVar, (Function1) objP, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) clzVar, (Object) ilzVar, (Object) function1, i, (byte) 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3 A[LOOP:3: B:42:0x009d->B:44:0x00a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:63:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[LOOP:2: B:34:0x007a->B:65:?, LOOP_END, SYNTHETIC] */
    public static final ilf0 f0(h640 h640Var, int i, gxb gxbVar) {
        mlf0 llf0Var;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        String str = h640Var.b;
        String str2 = h640Var.c;
        if (str == null) {
            str = "";
        }
        xrt0 xrt0VarW = W(gxbVar, str);
        Collection collection = h640Var.d;
        if (collection == null) {
            collection = iun.f15405a;
        }
        if (!collection.isEmpty() && !collection.isEmpty()) {
            Iterator it3 = collection.iterator();
            while (true) {
                if (it3.hasNext()) {
                    yl30 yl30Var = (yl30) it3.next();
                    if (!V(yl30Var) && U(yl30Var)) {
                        if (str2 == null) {
                            str2 = "";
                        }
                        ArrayList arrayList2 = new ArrayList(r3d.q(collection, 10));
                        Iterator it4 = collection.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(Z((yl30) it4.next()));
                        }
                        llf0Var = new jlf0(str2, arrayList2);
                    }
                } else if (collection.isEmpty()) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    llf0Var = new llf0(str2);
                } else {
                    if (!collection.isEmpty()) {
                        it2 = collection.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!V((yl30) it2.next())) {
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    llf0Var = new llf0(str2);
                                }
                            }
                        }
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList = new ArrayList(r3d.q(collection, 10));
                    it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(a0((yl30) it.next()));
                    }
                    llf0Var = new klf0(str2, arrayList);
                }
            }
        } else if (collection.isEmpty()) {
            if (str2 == null) {
                str2 = "";
            }
            llf0Var = new llf0(str2);
        } else {
            if (!collection.isEmpty()) {
                it2 = collection.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!V((yl30) it2.next())) {
                            if (str2 == null) {
                                str2 = "";
                            }
                            llf0Var = new llf0(str2);
                        }
                    }
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            arrayList = new ArrayList(r3d.q(collection, 10));
            it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(a0((yl30) it.next()));
            }
            llf0Var = new klf0(str2, arrayList);
        }
        mlf0 mlf0Var = llf0Var;
        Integer num = h640Var.f12512a;
        if (num != null) {
            return new ilf0(num.intValue(), i, xrt0VarW, Intrinsics.d(h640Var.e, Boolean.TRUE), mlf0Var);
        }
        jf4.k(null);
        return null;
    }

    public static final void g(int i, fet fetVar, clz clzVar, Boolean bool, Boolean bool2, Object obj, Function1 function1) {
        int i2;
        clz clzVar2;
        clz clzVar3;
        int i3;
        fetVar.g0(574812561);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | (fetVar.i(bool2) ? 32 : 16) | (fetVar.i(obj) ? 256 : 128) | 1024 | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i4 & 1, (i4 & 9363) != 9362)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                clzVar3 = (clz) fetVar.k(or00.f25714a);
                i3 = i4 & (-7169);
            } else {
                fetVar.X();
                i3 = i4 & (-7169);
                clzVar3 = clzVar;
            }
            fetVar.s();
            boolean zG = fetVar.g(bool) | fetVar.g(bool2) | fetVar.g(obj) | fetVar.g(clzVar3);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new nlz(clzVar3.x());
                fetVar.o0(objP);
            }
            i(clzVar3, (nlz) objP, function1, fetVar, (i3 >> 6) & 896);
            clzVar2 = clzVar3;
        } else {
            fetVar.X();
            clzVar2 = clzVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gja(bool, bool2, obj, clzVar2, function1, i, (byte) 4);
        }
    }

    public static final lla g0(d2w d2wVar, int i, ctf0 ctf0Var, boolean z, boolean z2, boolean z3, v5l0 v5l0Var, String str, String str2, boolean z4) {
        int i2;
        d2wVar.getClass();
        ctf0Var.getClass();
        v5l0Var.getClass();
        str2.getClass();
        if (!(d2wVar instanceof u1w)) {
            if (d2wVar instanceof x1w) {
                return p8a.h0((x1w) d2wVar, v5l0Var, ctf0Var, kotlin.collections.a.c(Integer.valueOf(i)), z, str, z3, z2, str2, z4, false);
            }
            if (d2wVar instanceof y1w) {
                return zgc.Q((y1w) d2wVar, v5l0Var, ctf0Var, kotlin.collections.a.c(Integer.valueOf(i)), z, str, z3, z2, str2, z4, false);
            }
            if (d2wVar instanceof c2w) {
                return x8f.g0((c2w) d2wVar, v5l0Var, ctf0Var, kotlin.collections.a.c(Integer.valueOf(i)), z, str, z3, z2, str2, z4, false);
            }
            if (d2wVar instanceof z1w) {
                return null;
            }
            t9f.b();
            return null;
        }
        u1w u1wVar = (u1w) d2wVar;
        List listC = kotlin.collections.a.c(Integer.valueOf(i));
        List list = u1wVar.n;
        boolean z5 = u1wVar.t;
        a2w a2wVar = u1wVar.p;
        String str3 = a2wVar.f144a;
        a2w a2wVar2 = u1wVar.o;
        String str4 = a2wVar2.f144a;
        String str5 = u1wVar.c;
        long j = u1wVar.d;
        listC.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            tma tmaVar = new tma(o2e.i0(u1wVar, listC, z3, z2, str2), null, 14);
            s480 s480VarY = c9x.y(j, str5);
            d280 d280VarD = g7w.d(a2wVar2);
            d280 d280VarD2 = g7w.d(a2wVar);
            String str6 = s480VarY.f31594a;
            pz40 pz40Var = s6t0.f31722a;
            return new gla(tmaVar, new ola(d280VarD, d280VarD2, str4, str6, s6t0.b().f33626a.getTextPrimary(), str3, s480VarY.b, s6t0.b().f33626a.getTextPrimary(), new jwm(uc9.U(u1wVar, ctf0Var)), new jwm(uc9.V(u1wVar, z4)), null), (!z5 || (cy7.c() && z4)) ? null : new dem(u1wVar.f34920a, ctf0Var.b.a(R.string.additional_info, Arrays.copyOf(new Object[0], 0)), cfx0.N(list), z), u1wVar.f34920a);
        }
        if (iOrdinal == 1) {
            xma xmaVar = new xma(o2e.i0(u1wVar, listC, z3, z2, str2), null, dj8.W(u1wVar, z, z4), 6);
            s480 s480VarY2 = c9x.y(j, str5);
            return new kla(xmaVar, new mma(new vzm(str4, s480VarY2.f31594a), new vzm(str3, s480VarY2.b), new jwm(uc9.U(u1wVar, ctf0Var)), new jwm(uc9.V(u1wVar, z4)), null), (z5 && z && (!cy7.c() || !z4)) ? new eem(cfx0.N(list)) : null, u1wVar.f34920a);
        }
        if (iOrdinal == 2) {
            wma wmaVar = new wma(o2e.i0(u1wVar, listC, z3, z2, str2), null, dj8.W(u1wVar, z, z4), 6);
            s480 s480VarY3 = c9x.y(j, str5);
            d280 d280VarD3 = g7w.d(a2wVar2);
            d280 d280VarD4 = g7w.d(a2wVar);
            String str7 = s480VarY3.f31594a;
            pz40 pz40Var2 = s6t0.f31722a;
            return new jla(wmaVar, new gma(d280VarD3, d280VarD4, str4, str7, s6t0.b().f33626a.getTextPrimary(), str3, s480VarY3.b, s6t0.b().f33626a.getTextPrimary(), new jwm(uc9.U(u1wVar, ctf0Var)), new jwm(uc9.V(u1wVar, z4)), null), rq8.V(u1wVar, z, z4), u1wVar.f34920a);
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            uma umaVar = new uma(o2e.i0(u1wVar, listC, z3, z2, str2), null, dj8.W(u1wVar, z, z4), 6);
            s480 s480VarY4 = c9x.y(j, str5);
            d280 d280VarD5 = g7w.d(a2wVar2);
            d280 d280VarD6 = g7w.d(a2wVar);
            String str8 = s480VarY4.f31594a;
            pz40 pz40Var3 = s6t0.f31722a;
            return new hla(umaVar, new ula(d280VarD5, d280VarD6, str4, str8, s6t0.b().f33626a.getTextPrimary(), str3, s480VarY4.b, s6t0.b().f33626a.getTextPrimary(), new jwm(uc9.U(u1wVar, ctf0Var)), new jwm(uc9.V(u1wVar, z4)), null), rq8.V(u1wVar, z, z4), u1wVar.f34920a);
        }
        vma vmaVar = new vma(o2e.i0(u1wVar, listC, z3, z2, str2), new b4i(uc9.U(u1wVar, ctf0Var), 2), dj8.W(u1wVar, z, z4));
        s480 s480VarY5 = c9x.y(j, str5);
        d280 d280VarD7 = g7w.d(a2wVar2);
        d280 d280VarD8 = g7w.d(a2wVar);
        String str9 = s480VarY5.f31594a;
        pz40 pz40Var4 = s6t0.f31722a;
        ama amaVar = new ama(d280VarD7, d280VarD8, str4, str9, s6t0.b().f33626a.getTextPrimary(), str3, s480VarY5.b, s6t0.b().f33626a.getTextPrimary(), new jwm(uc9.V(u1wVar, z4)), null);
        gem gemVar = (z5 && z && (!cy7.c() || !z4)) ? new gem(cfx0.N(list)) : null;
        long j2 = u1wVar.f34920a;
        StringBuilder sb = new StringBuilder(ujn.h);
        if (str.length() == 0) {
            sb.setLength(0);
        } else {
            if (StringsKt.O(str, ujn.h, false)) {
                i2 = 0;
            } else if (kotlin.text.c.x(str, "https://", false)) {
                i2 = 0;
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(str, '/'));
            }
            sb.setLength(i2);
            sb.append(str);
        }
        return new ila(j2, gemVar, vmaVar, amaVar, new n0x(sb.toString()));
    }

    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    public static final void h(Object obj, Object obj2, clz clzVar, Function1 function1, fet fetVar, int i, int i2) {
        int i3;
        clz clzVar2;
        clz clzVar3;
        boolean zG;
        Object objP;
        fetVar.g0(696924721);
        if ((i & 6) == 0) {
            i3 = (fetVar.i(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.i(obj2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && fetVar.i(clzVar)) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                if ((i2 & 4) != 0) {
                    clzVar3 = (clz) fetVar.k(or00.f25714a);
                    i3 &= -897;
                }
                fetVar.s();
                zG = fetVar.g(obj) | fetVar.g(obj2) | fetVar.g(clzVar3);
                objP = fetVar.P();
                if (zG || objP == ukd.f35823a) {
                    objP = new nlz(clzVar3.x());
                    fetVar.o0(objP);
                }
                i(clzVar3, (nlz) objP, function1, fetVar, ((i3 >> 3) & 896) | ((i3 >> 6) & 14));
                clzVar2 = clzVar3;
            } else {
                fetVar.X();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            clzVar3 = clzVar;
            fetVar.s();
            zG = fetVar.g(obj) | fetVar.g(obj2) | fetVar.g(clzVar3);
            objP = fetVar.P();
            if (zG) {
                objP = new nlz(clzVar3.x());
                fetVar.o0(objP);
            } else {
                objP = new nlz(clzVar3.x());
                fetVar.o0(objP);
            }
            i(clzVar3, (nlz) objP, function1, fetVar, ((i3 >> 3) & 896) | ((i3 >> 6) & 14));
            clzVar2 = clzVar3;
        } else {
            fetVar.X();
            clzVar2 = clzVar;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xkz(obj, obj2, clzVar2, function1, i, i2, (byte) 0);
        }
    }

    public static final m0k0 h0(nms nmsVar, long j, int i) {
        List list = nmsVar.b;
        List list2 = nmsVar.e;
        Long l = (Long) CollectionsKt.firstOrNull(list);
        long jLongValue = l != null ? l.longValue() : 0L;
        String str = nmsVar.c;
        String str2 = nmsVar.d;
        Long l2 = (Long) CollectionsKt.firstOrNull(list2);
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        String str3 = nmsVar.f;
        String str4 = nmsVar.g;
        int iMax = Math.max(list.size(), list2.size());
        String str5 = nmsVar.i;
        long j2 = nmsVar.f23786a;
        Long l3 = nmsVar.h;
        return new m0k0(j, "", jLongValue, str, str2, "", jLongValue2, str3, str4, "", iMax, "", -1, -1, "", "", 0, 0, str5, "", "", "", -1L, false, l3 != null ? l3.longValue() : -1L, i, false, -1L, j2, "", false, false, false, 0, 1);
    }

    public static final void i(clz clzVar, nlz nlzVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(228371534);
        if ((i & 6) == 0) {
            i2 = (fetVar.i(clzVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(nlzVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = fetVar.i(nlzVar) | ((i2 & 896) == 256) | fetVar.i(clzVar);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new k9v((Object) clzVar, (Object) nlzVar, (Object) function1, (byte) 14);
                fetVar.o0(objP);
            }
            m0x0.n(clzVar, nlzVar, (Function1) objP, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) clzVar, (Object) nlzVar, (Object) function1, i, (byte) 29);
        }
    }

    public static final a640 i0(n640 n640Var, gxb gxbVar) {
        Object next;
        Object next2;
        Integer num = n640Var.f22978a;
        Object obj = null;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        Long l = n640Var.k;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        Date date = new Date(TimeUnit.SECONDS.toMillis(l.longValue()));
        th thVar = n640Var.h;
        if (thVar == null) {
            jf4.k(null);
            return null;
        }
        n0o0 n0o0VarB = maz.b(new b640(iIntValue, gxbVar, (byte) 1));
        h640 h640Var = n640Var.i;
        ilf0 ilf0VarF0 = h640Var != null ? f0(h640Var, iIntValue, gxbVar) : null;
        c0o c0oVar = v540.c;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (!((v540) next).f36812a.equals(thVar.f33938a));
        v540 v540Var = (v540) next;
        if (v540Var == null) {
            return j0(n640Var, gxbVar);
        }
        c0o c0oVar2 = t540.d;
        y2 y2VarH2 = ohs0.h(c0oVar2, c0oVar2);
        do {
            if (!y2VarH2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = y2VarH2.next();
        } while (!((t540) next2).f33351a.equals(thVar.b));
        t540 t540Var = (t540) next2;
        if (t540Var == null) {
            t540Var = t540.NO_REASON;
        }
        c0o c0oVar3 = u540.d;
        y2 y2VarH3 = ohs0.h(c0oVar3, c0oVar3);
        while (y2VarH3.hasNext()) {
            Object next3 = y2VarH3.next();
            if (((u540) next3).f35076a.equals(thVar.c)) {
                obj = next3;
                break;
            }
        }
        u540 u540Var = (u540) obj;
        if (u540Var == null) {
            u540Var = u540.UNKNOWN;
        }
        return new w540(iIntValue, new s540(t540Var, v540Var, u540Var), ilf0VarF0, (x640) n0o0VarB.getValue(), date);
    }

    public static final void j(mm40 mm40Var, l7m0 l7m0Var, float f, float f2, float f3, String str, String str2, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        mm40 mm40Var2;
        qja qjaVar;
        Object objD;
        Object objJ;
        Object objJ2;
        byte b;
        Object immVar;
        float f4;
        Object fbnVar;
        qja qjaVar2 = qja.j;
        str.getClass();
        function1.getClass();
        fetVar.g0(911462496);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.d(f3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.g(str2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.i(ugdVar) ? 67108864 : 33554432;
        }
        if (fetVar.U(i2 & 1, (i2 & 38347923) != 38347922)) {
            Object[] objArr = {l7m0Var.getValue()};
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new x000(l7m0Var, (byte) 9);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object obj2 = (w6k) fetVar.k(bmd.h);
            Object[] objArr2 = {l7m0Var.getValue()};
            int i4 = i2 & 57344;
            boolean zG = fetVar.g(obj2) | (i4 == 16384) | (i3 == 32);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new hh10(obj2, f3, l7m0Var, (byte) 0);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            Object[] objArr3 = {l7m0Var.getValue()};
            boolean z2 = i3 == 32;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == obj) {
                objP3 = new x000(l7m0Var, (byte) 10);
                fetVar.o0(objP3);
            }
            l7m0 l7m0VarY3 = v3c.Y(objArr3, (Function0) objP3, fetVar);
            oms0 oms0VarZ = phu0.Z(l7m0VarY3.getValue(), null, fetVar, 0, 2);
            pz40 pz40Var = oms0VarZ.d;
            p4 p4Var = oms0VarZ.f25519a;
            hgk0 hgk0Var = (hgk0) pz40Var;
            float fFloatValue = ((Number) hgk0Var.getValue()).floatValue();
            fetVar.e0(-1700436888);
            pz40 pz40Var2 = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            long jP = fbc.P(fFloatValue, staticColors.m123getWhite0d7_KjU(), s6t0.b().f33626a.getSecondary());
            fetVar.r(false);
            Object objF = y3d.f(jP);
            boolean zG2 = fetVar.g(objF);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == obj) {
                s43 s43Var = new s43(objF, (byte) 2);
                qjaVar = qjaVar2;
                objD = kng0.d(qjaVar, s43Var, fetVar);
            } else {
                objD = objP4;
                qjaVar = qjaVar2;
            }
            lxs0 lxs0Var = (lxs0) objD;
            if (oms0VarZ.h()) {
                lxs0Var = lxs0Var;
                objJ = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG3 = fetVar.g(oms0VarZ);
                Object objP5 = fetVar.P();
                if (zG3 || objP5 == obj) {
                    rfk0 rfk0VarJ = vdx.J();
                    Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                    rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                    try {
                        Object objY0 = p4Var.y0();
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        fetVar.o0(objY0);
                        objP5 = objY0;
                    } catch (Throwable th) {
                        vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                        throw th;
                    }
                }
                fetVar.r(false);
                objJ = objP5;
            }
            float fFloatValue2 = ((Number) objJ).floatValue();
            fetVar.e0(-1700436888);
            y3d y3dVarF = dw9.f(fetVar, false, fbc.P(fFloatValue2, staticColors.m123getWhite0d7_KjU(), s6t0.b().f33626a.getSecondary()));
            boolean zG4 = fetVar.g(oms0VarZ);
            Object objP6 = fetVar.P();
            if (zG4 || objP6 == obj) {
                objP6 = jgk0.b(new m6x(oms0VarZ, (byte) 26));
                fetVar.o0(objP6);
            }
            float fFloatValue3 = ((Number) ((l7m0) objP6).getValue()).floatValue();
            fetVar.e0(-1700436888);
            y3d y3dVarF2 = dw9.f(fetVar, false, fbc.P(fFloatValue3, staticColors.m123getWhite0d7_KjU(), s6t0.b().f33626a.getSecondary()));
            boolean zG5 = fetVar.g(oms0VarZ);
            Object objP7 = fetVar.P();
            if (zG5 || objP7 == obj) {
                objP7 = jgk0.b(new m6x(oms0VarZ, (byte) 27));
                fetVar.o0(objP7);
            }
            byte b2 = 0;
            byte b3 = 2;
            cms0 cms0VarE = phu0.E(oms0VarZ, y3dVarF, y3dVarF2, w6x.k((ams0) ((l7m0) objP7).getValue(), fetVar, 1397531912, false), lxs0Var, fetVar, 0);
            float fFloatValue4 = ((Number) hgk0Var.getValue()).floatValue();
            fetVar.e0(-539553504);
            long jP2 = fbc.P(fFloatValue4, staticColors.m73getBlack400d7_KjU(), staticColors.m121getTransparent0d7_KjU());
            fetVar.r(false);
            Object objF2 = y3d.f(jP2);
            boolean zG6 = fetVar.g(objF2);
            Object objP8 = fetVar.P();
            if (zG6 || objP8 == obj) {
                objP8 = kng0.d(qjaVar, new s43(objF2, b3), fetVar);
            }
            lxs0 lxs0Var2 = (lxs0) objP8;
            if (oms0VarZ.h()) {
                objJ2 = vqd.j(fetVar, 1666827533, false, p4Var);
            } else {
                fetVar.e0(1666573488);
                boolean zG7 = fetVar.g(oms0VarZ);
                objJ2 = fetVar.P();
                if (zG7 || objJ2 == obj) {
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
                fetVar.r(false);
            }
            float fFloatValue5 = ((Number) objJ2).floatValue();
            fetVar.e0(-539553504);
            y3d y3dVarF3 = dw9.f(fetVar, false, fbc.P(fFloatValue5, staticColors.m73getBlack400d7_KjU(), staticColors.m121getTransparent0d7_KjU()));
            boolean zG8 = fetVar.g(oms0VarZ);
            Object objP9 = fetVar.P();
            if (zG8 || objP9 == obj) {
                objP9 = jgk0.b(new m6x(oms0VarZ, (byte) 28));
                fetVar.o0(objP9);
            }
            float fFloatValue6 = ((Number) ((l7m0) objP9).getValue()).floatValue();
            fetVar.e0(-539553504);
            y3d y3dVarF4 = dw9.f(fetVar, false, fbc.P(fFloatValue6, staticColors.m73getBlack400d7_KjU(), staticColors.m121getTransparent0d7_KjU()));
            boolean zG9 = fetVar.g(oms0VarZ);
            Object objP10 = fetVar.P();
            if (zG9 || objP10 == obj) {
                objP10 = jgk0.b(new m6x(oms0VarZ, (byte) 29));
                fetVar.o0(objP10);
            }
            cms0 cms0VarE2 = phu0.E(oms0VarZ, y3dVarF3, y3dVarF4, w6x.k((ams0) ((l7m0) objP10).getValue(), fetVar, -1522279296, false), lxs0Var2, fetVar, 0);
            boolean zH = fetVar.h(((Boolean) l7m0VarY.getValue()).booleanValue());
            Object objP11 = fetVar.P();
            if (zH || objP11 == obj) {
                b = 1;
                immVar = new imm(klm.f18497a, mlm.f21997a, fmm.f9790a, staticColors.m121getTransparent0d7_KjU(), !((Boolean) l7m0VarY.getValue()).booleanValue(), null);
                fetVar.o0(immVar);
            } else {
                immVar = objP11;
                b = 1;
            }
            imm immVar2 = (imm) immVar;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), s6t0.b().f33626a.getBackground(), jd8.n);
            int i5 = (i4 == 16384 ? b : (byte) 0) | ((i2 & 896) == 256 ? b : (byte) 0);
            Object objP12 = fetVar.P();
            if (i5 != 0 || objP12 == obj) {
                f4 = f;
                fbnVar = new fbn(new ih10(f4, f3, b));
                fetVar.o0(fbnVar);
            } else {
                fbnVar = objP12;
                f4 = f;
            }
            s3e s3eVar = (s3e) fbnVar;
            byte b4 = (i2 & 7168) == 2048 ? b : (byte) 0;
            if (i4 != 16384) {
                b = 0;
            }
            int i6 = b4 | b;
            Object objP13 = fetVar.P();
            if (i6 != 0 || objP13 == obj) {
                objP13 = new fbn(new ih10(f2, f3, b2));
                fetVar.o0(objP13);
            }
            s3e s3eVar2 = (s3e) objP13;
            float fFloatValue7 = ((Number) l7m0Var.getValue()).floatValue();
            lwf lwfVar = lwf.o;
            Object objP14 = fetVar.P();
            if (objP14 == obj) {
                objP14 = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                fetVar.o0(objP14);
            }
            pz40 pz40Var3 = (pz40) objP14;
            Object objP15 = fetVar.P();
            Object obj3 = objP15;
            if (objP15 == obj) {
                nie0 nie0Var = new nie0();
                nie0Var.f23583a = cmd.f4598a;
                fetVar.o0(nie0Var);
                obj3 = nie0Var;
            }
            nie0 nie0Var2 = (nie0) obj3;
            n6x.b(s3eVar, s3eVar2, fFloatValue7, false, false, false, mm40VarQ, pz40Var3, nie0Var2, lwfVar, u1c.M(284503157, new lh10(pz40Var3, lwfVar, nie0Var2, f4, f2, l7m0VarY2, l7m0Var, l7m0VarY3, immVar2, function1, cms0VarE2, cms0VarE, str2, str, ugdVar), fetVar), fetVar, 24576);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xpk(mm40Var2, l7m0Var, f, f2, f3, str, str2, function1, ugdVar, i);
        }
    }

    public static final y540 j0(n640 n640Var, gxb gxbVar) {
        Integer num = n640Var.f22978a;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        Long l = n640Var.k;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        Date date = new Date(TimeUnit.SECONDS.toMillis(l.longValue()));
        n0o0 n0o0VarB = maz.b(new b640(iIntValue, gxbVar, (byte) 0));
        h640 h640Var = n640Var.i;
        return new y540(iIntValue, h640Var != null ? f0(h640Var, iIntValue, gxbVar) : null, (x640) n0o0VarB.getValue(), date);
    }

    public static final void k(mm40 mm40Var, uv20 uv20Var, xdr xdrVar, xdr xdrVar2, Function1 function1, fet fetVar, int i) {
        int i2;
        xdrVar.getClass();
        xdrVar2.getClass();
        function1.getClass();
        fetVar.g0(-1298192234);
        byte b = 4;
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(uv20Var) : fetVar.i(uv20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(xdrVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = (i2 & 896) == 256;
            int i3 = i2 & 112;
            if (i3 == 32 || ((i2 & 64) != 0 && fetVar.i(uv20Var))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new eu20(b, xdrVar, uv20Var);
                fetVar.o0(objP);
            }
            x0x.i(mm40Var, uv20Var, (Function0) objP, u1c.M(1341440428, new fu20(uv20Var, b2), fetVar), u1c.M(1148443340, new gu20(uv20Var, (byte) 6), fetVar), u1c.M(-1558063135, new hu20(uv20Var, function1, b2), fetVar), u1c.M(612529290, new iu20(b2, xdrVar2, uv20Var), fetVar), u1c.M(-1802911383, new gu20(uv20Var, (byte) 7), fetVar), u1c.M(76615240, new gu20(uv20Var, (byte) 8), fetVar), fetVar, (i2 & 14) | 115043392 | i3);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ju20(mm40Var, uv20Var, xdrVar, xdrVar2, function1, i, (byte) 2);
        }
    }

    public static final Object k0(Function1 function1, zje zjeVar) {
        return P(zjeVar.getContext()).e(new w8v(function1, (byte) 6), zjeVar);
    }

    public static final void l(mm40 mm40Var, zf30 zf30Var, Function1 function1, Function1 function2, fet fetVar, int i) {
        pz40 pz40Var;
        fet fetVar2 = fetVar;
        mmo mmoVar = zf30Var.b;
        a4x a4xVar = zf30Var.f44284a;
        function2.getClass();
        fetVar2.g0(1511993477);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(zf30Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(function2) ? 2048 : 1024);
        byte b = 1;
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            xcz xczVarA = ddz.a(q3d.i(a4xVar), 0, fetVar2, 0, 2);
            pz40 pz40VarD = vcc.D(xczVarA.g, fetVar2);
            pz40 pz40VarA0 = v3c.a0(Integer.valueOf(a4xVar.size()), new Object[0], fetVar2, 0);
            pz40 pz40VarA1 = v3c.a0(Boolean.FALSE, new Object[0], fetVar2, 6);
            boolean z = mmoVar.c;
            boolean zG = fetVar2.g(xczVarA) | fetVar2.g(pz40VarA1) | fetVar2.g(pz40VarD);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            yje yjeVar = null;
            if (zG || objP == cl5Var) {
                rua ruaVar = new rua(xczVarA, pz40VarA1, pz40VarD, yjeVar, (byte) 4);
                pz40Var = pz40VarA1;
                fetVar2.o0(ruaVar);
                objP = ruaVar;
            } else {
                pz40Var = pz40VarA1;
            }
            m0x0.t(fetVar2, xczVarA, (Function2) objP);
            boolean zG2 = fetVar2.g(xczVarA) | fetVar2.g(pz40VarA0) | fetVar2.g(pz40Var);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                rf30 rf30Var = new rf30(xczVarA, pz40VarA0, pz40Var, yjeVar, (byte) 3);
                fetVar2.o0(rf30Var);
                objP2 = rf30Var;
            }
            m0x0.t(fetVar2, xczVarA, (Function2) objP2);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zH = fetVar2.h(z) | fetVar2.g(xczVarA);
            Object objP3 = fetVar2.P();
            if (zH || objP3 == cl5Var) {
                objP3 = new uf30(z, xczVarA, yjeVar, b);
                fetVar2.o0(objP3);
            }
            m0x0.t(fetVar2, boolValueOf, (Function2) objP3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            a4x a4xVar2 = zf30Var.f44284a;
            mm40 mm40VarH = dw9.h(1.0f, o7k0.d(jm40.b, 1.0f), true);
            zcl zclVar = qmk.f28987a;
            tdc.m(s5x0.N(mm40VarH, 0.0f, 0.0f, 0.0f, 4.0f, 7), a4xVar2, s3n.f31566a, ((Boolean) fetVar2.k(kr00.f18743a)).booleanValue(), xczVarA, function1, fetVar, ((i2 << 9) & 458752) | 384, 0);
            fetVar2 = fetVar;
            feb.t(null, mmoVar, function2, fetVar2, (i2 >> 3) & 896, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((Object) mm40Var, (Object) zf30Var, function1, (wdr) function2, i, (byte) 25);
        }
    }

    public static final void m(mm40 mm40Var, fe80 fe80Var, Function0 function0, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fe80Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar2.g0(-602164501);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(fe80Var) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            long jM139getBackgroundContent0d7_KjU = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40Var, jM139getBackgroundContent0d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar));
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
            jm40 jm40Var = jm40.b;
            n(o7k0.d(jm40Var, 1.0f), fe80Var, function0, fetVar2, (i2 & 112) | 6 | (i2 & 896));
            mbc.o(agi0.f827a, o7k0.d(jm40Var, 1.0f), false, fetVar2, 54, 4);
            ebc.r(o7k0.d(jm40Var, 1.0f), new fyl(fe80Var.c, tyl.c, syl.b, new lh80(12.0f, 8.0f, 12.0f, 8.0f), null), vxl.b, function1, null, fetVar, ((i2 << 3) & 57344) | 390, 40);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50(mm40Var, (Object) fe80Var, function0, function1, i, (byte) 14);
        }
    }

    public static final void n(mm40 mm40Var, fe80 fe80Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-38767628);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(fe80Var) : fetVar2.i(fe80Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40Var, 0.0f, 6.0f, 1), 0.0f, 0.0f, 12.0f, 0.0f, 11);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            nia0.v(null, fe80Var.f9394a, function0, fetVar2, i2 & 896, 1);
            v8q0.a(fe80Var.b, new x7z(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.t(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var, fe80Var, function0, i, (byte) 6);
        }
    }

    public static final void o(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        str2.getClass();
        fetVar2.g0(-1007977561);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var, 64.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            y9q0 y9q0VarA = g1t0.a();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, mm40VarD, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 1, 0, null, y9q0VarA, fetVar2, ((i2 >> 3) & 14) | 48, 24576, 113656);
            v8q0.a(str2, o7k0.d(jm40Var, 1.0f), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, ((i2 >> 6) & 14) | 48, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var2, str, str2, i, (byte) 14);
        }
    }

    public static final void p(nea0 nea0Var, Function0 function0, fet fetVar, int i) {
        nea0Var.getClass();
        function0.getClass();
        fetVar.g0(1081440513);
        int i2 = (fetVar.g(nea0Var) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean zG = fetVar.g(nea0Var.d);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new u6n(d4d.STATIC_WHITE60, w6n.i, new c280(nea0Var.c, R.drawable.ic_glyph_placeholder_player));
                fetVar.o0(objP);
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1928522817, new o090((Object) function0, objP, (Object) nea0Var, (byte) 10), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(nea0Var, function0, i, (byte) 24);
        }
    }

    public static final void q(tnb0 tnb0Var, fet fetVar, int i) {
        tnb0Var.getClass();
        fetVar.g0(-1283561281);
        int i2 = (fetVar.g(tnb0Var) ? 4 : 2) | i;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40.b, 1.0f), null, false, 3);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarW, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 4.0f, 0.0f, 4.0f, 4.0f, 2);
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
            zvw.l(tnb0Var, fetVar, i2 & 14);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new snb0(tnb0Var, i, b);
        }
    }

    public static final void r(mm40 mm40Var, qng0 qng0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        qng0 qng0Var2 = qng0Var;
        fet fetVar2 = fetVar;
        qng0Var2.getClass();
        fetVar2.g0(1528370942);
        int i2 = i | 6 | (fetVar2.g(qng0Var2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zfn zfnVar = zaq0.b;
            long jM137getBackground0d7_KjU = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(16.0f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(jm40Var, jM137getBackground0d7_KjU, ugg0VarA), 16.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 0.0f, 3);
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            v8q0.a(qng0Var2.f29027a, mm40VarL, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 48, 0, 131064);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            qng0Var2 = qng0Var;
            v8q0.a(qng0Var2.b, mm40VarN, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j5d0(mm40Var2, qng0Var2, i, (byte) 13);
        }
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1368697335);
        byte b = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(mm40Var, 52.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, b);
        }
    }

    public static final void t(final int i, final int i2, fet fetVar, final mm40 mm40Var) {
        fetVar.g0(1153066592);
        byte b = 2;
        int i3 = (fetVar.e(i) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new uli0(i, b);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, null, null, null, null, false, null, (Function1) objP, fetVar, ((i3 >> 3) & 14) | 12582912, 382);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.jqj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i2 | 1);
                    s0x.t(i, iL, (fet) obj, mm40Var);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void u(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-805068521);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            s(0, fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            s(0, fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, (byte) 3);
        }
    }

    public static final void v(int i, fet fetVar) {
        fetVar.g0(462783660);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(jm40.b, xfn.a(fetVar).e, 4.0f, xfn.a(fetVar).e, 16.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
            u(0, fetVar, null);
            u(0, fetVar, null);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ogj0(i, (byte) 9);
        }
    }

    public static final void w(mm40 mm40Var, fnk0 fnk0Var, fet fetVar, int i) {
        long jM113getRed0d7_KjU;
        fet fetVar2 = fetVar;
        fnk0Var.getClass();
        boolean z = fnk0Var.b;
        fetVar2.g0(-1350605454);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(fnk0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            if (z) {
                jM113getRed0d7_KjU = cs0.D(fetVar2, -851713385, fetVar2, false);
            } else {
                fetVar2.e0(-851712267);
                jM113getRed0d7_KjU = afn0.p(fetVar2).m113getRed0d7_KjU();
                fetVar2.r(false);
            }
            long j = jM113getRed0d7_KjU;
            int i3 = fnk0Var.f9841a;
            int i4 = i3 > 999 ? 999 : i3;
            int i5 = z ? R.drawable.ic_glyph_triangle_arrow_up : R.drawable.ic_glyph_triangle_arrow_down;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 40.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar2, 54);
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
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            j0x.b(a8k0.F(i5, 0, fetVar2), null, o7k0.n(jm40.b, 14.0f), null, null, 0.0f, new m78(j, 5), fetVar2, 56, 56);
            String strValueOf = String.valueOf(i4);
            afn0.v(fetVar).getClass();
            v8q0.a(strValueOf, null, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(mm40Var, fnk0Var, i, (byte) 11);
        }
    }

    public static final void x(mm40 mm40Var, final fal0 fal0Var, fet fetVar) {
        fet fetVar2 = fetVar;
        fal0Var.getClass();
        e5a0 e5a0Var = fal0Var.c;
        w6n w6nVar = (w6n) fetVar2.k(zep0.f44264a);
        final byte b = 0;
        if (w6nVar == null) {
            fetVar2.e0(-1012376520);
            w6n w6nVar2 = w6n.e;
            w6n w6nVar3 = w6n.j;
            long jB = ((yez) ((rhv0) fetVar2.k(bmd.u))).b();
            Context context = (Context) fetVar2.k(dy2.b);
            boolean zG = fetVar2.g(context);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                objP = zep0.b(zep0.a(context.getResources().getDisplayMetrics().density, jB), w6nVar2, w6nVar3, w6nVar3);
                fetVar2.o0(objP);
            }
            w6nVar = (w6n) objP;
        } else {
            fetVar2.e0(-1012377295);
        }
        fetVar2.r(false);
        thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
        jpm0.o(fetVar2, thg0VarA, gqw0.x);
        jpm0.o(fetVar2, bh90VarM, gqw0.w);
        jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar2);
        jpm0.o(fetVar2, mm40VarC0, gqw0.v);
        int iOrdinal = fal0Var.b.ordinal();
        final byte b2 = 1;
        if (iOrdinal == 0) {
            fetVar2.e0(597544330);
            c3x.m(e5a0Var, w6nVar, null, fetVar, 0, 9);
            fetVar2 = fetVar;
            obc.e(new l5d0[]{eal0.f7472a.a(gqw0.d), dw9.k(5, eal0.b), eal0.c.a(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109))}, u1c.M(-75717070, new Function2() { // from class: a.u9l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b;
                    fal0 fal0Var2 = fal0Var;
                    fet fetVar3 = (fet) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (b3) {
                        case 0:
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                zcl zclVar = qmk.f28987a;
                                eal0.a(0, fetVar3, dw9.h(1.0f, s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14), true), fal0Var2.f9214a);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                zcl zclVar2 = qmk.f28987a;
                                eal0.a(0, fetVar3, dw9.h(1.0f, s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), true), fal0Var2.f9214a);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar2), fetVar2, 48);
            fetVar2.r(false);
        } else {
            if (iOrdinal != 1) {
                throw b1j.f(573463654, fetVar2, false);
            }
            fetVar2.e0(598251440);
            obc.e(new l5d0[]{eal0.f7472a.a(gqw0.f), dw9.k(6, eal0.b), eal0.c.a(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109))}, u1c.M(706829403, new Function2() { // from class: a.u9l0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    fal0 fal0Var2 = fal0Var;
                    fet fetVar3 = (fet) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    switch (b3) {
                        case 0:
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                zcl zclVar = qmk.f28987a;
                                eal0.a(0, fetVar3, dw9.h(1.0f, s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14), true), fal0Var2.f9214a);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                zcl zclVar2 = qmk.f28987a;
                                eal0.a(0, fetVar3, dw9.h(1.0f, s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), true), fal0Var2.f9214a);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar2), fetVar2, 48);
            c3x.m(e5a0Var, w6nVar, null, fetVar2, 0, 9);
            fetVar2.r(false);
        }
        fetVar2.r(true);
    }

    public static final Object z(ig00 ig00Var, yje yjeVar) throws Throwable {
        try {
            if (ig00Var.isDone()) {
                return y4.i(ig00Var);
            }
            n5a n5aVar = new n5a(1, pnx.b(yjeVar));
            n5aVar.r();
            ig00Var.a(new mfr((Object) ig00Var, (Object) n5aVar, (byte) 15), ymk.f42893a);
            n5aVar.t(new s43(ig00Var, (byte) 9));
            Object objP = n5aVar.p();
            wne wneVar = wne.f39444a;
            return objP;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            cause.getClass();
            throw cause;
        }
    }

    public String toString() {
        switch (this.f31430a) {
            case 2:
                return y();
            default:
                return super.toString();
        }
    }

    public abstract String y();
}
