package a;

import android.gov.nist.core.Separators;
import android.os.Handler;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.games_section.impl.navigation.GamesSectionScreens$OneXGamesFragmentScreen;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;

/* JADX INFO: loaded from: classes4.dex */
public final class cyu implements da60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f5196a;
    public Object b;
    public Object c;

    public cyu(byte b) {
        switch (b) {
            case 5:
                this.f5196a = new hy40();
                this.b = new HashMap();
                break;
            case 10:
                bp00 bp00Var = bp00.c;
                this.f5196a = bp00Var;
                this.b = bp00Var;
                this.c = bp00Var;
                break;
            case 24:
                this.f5196a = new or30();
                this.b = new or30();
                break;
            default:
                this.f5196a = new k050();
                this.b = new ArrayList();
                this.c = q7m0.a(iun.f15405a);
                break;
        }
    }

    public static void G(cyu cyuVar, GamesSectionScreens$OneXGamesFragmentScreen gamesSectionScreens$OneXGamesFragmentScreen) {
        i1w0 i1w0VarB = ((oeg0) cyuVar.c).b();
        i1w0VarB.getClass();
        k0w0 k0w0Var = new k0w0(i1w0VarB);
        k0w0Var.c(null);
        k0w0Var.h(gamesSectionScreens$OneXGamesFragmentScreen);
        ListIterator listIteratorO = b1j.o(i1w0VarB, k0w0Var.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0VarB.a((oe50) pawVar.next());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    public static List Q(List list, List list2, CyberGamesPage cyberGamesPage, List list3) {
        Object next;
        lel0 lel0Var;
        Object next2;
        String string;
        String string2;
        String str;
        Object next3;
        List list4;
        Object next4;
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nyg nygVar = (nyg) it.next();
            nygVar.getClass();
            list2.getClass();
            String string3 = null;
            if (cyberGamesPage.equals(CyberGamesPage.Real.INSTANCE)) {
                Iterator it2 = list3.iterator();
                do {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                } while (((ril0) next3).f30549a != 40);
                ril0 ril0Var = (ril0) next3;
                if (ril0Var == null || (list4 = ril0Var.f) == null) {
                    lel0Var = null;
                } else {
                    Iterator it3 = list4.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next4 = null;
                            break;
                        }
                        next4 = it3.next();
                    } while (((f3n0) next4).f8872a != nygVar.l);
                    f3n0 f3n0Var = (f3n0) next4;
                    if (f3n0Var != null) {
                        lel0Var = f3n0Var.c;
                    } else {
                        lel0Var = null;
                    }
                }
            } else {
                Iterator it4 = list3.iterator();
                do {
                    if (!it4.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it4.next();
                } while (((ril0) next).f30549a != nygVar.i);
                ril0 ril0Var2 = (ril0) next;
                if (ril0Var2 != null) {
                    lel0Var = ril0Var2.g;
                } else {
                    lel0Var = null;
                }
            }
            Iterator it5 = list2.iterator();
            do {
                if (!it5.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it5.next();
            } while (((qgg) next2).f28683a != nygVar.g);
            qgg qggVar = (qgg) next2;
            String strA = oyg.a(qggVar != null ? qggVar.b : null, lel0Var != null ? lel0Var.e : null);
            if (strA != null) {
                StringBuilder sb = new StringBuilder(ujn.h);
                if (strA.length() == 0) {
                    sb.setLength(0);
                } else if (StringsKt.O(strA, ujn.h, false) || kotlin.text.c.x(strA, "https://", false)) {
                    sb.setLength(0);
                    sb.append(strA);
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0(strA, '/'));
                }
                string = sb.toString();
            } else {
                string = null;
            }
            String str2 = string == null ? "" : string;
            String strA2 = oyg.a(qggVar != null ? qggVar.c : null, lel0Var != null ? lel0Var.f : null);
            if (strA2 != null) {
                StringBuilder sb2 = new StringBuilder(ujn.h);
                if (strA2.length() == 0) {
                    sb2.setLength(0);
                } else if (StringsKt.O(strA2, ujn.h, false) || kotlin.text.c.x(strA2, "https://", false)) {
                    sb2.setLength(0);
                    sb2.append(strA2);
                } else {
                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                        sb2.append('/');
                    }
                    sb2.append(StringsKt.y0(strA2, '/'));
                }
                string2 = sb2.toString();
            } else {
                string2 = null;
            }
            String str3 = string2 == null ? "" : string2;
            if (lel0Var != null && (str = lel0Var.f19909a) != null) {
                StringBuilder sb3 = new StringBuilder(ujn.h);
                if (str.length() == 0) {
                    sb3.setLength(0);
                } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                    sb3.setLength(0);
                    sb3.append(str);
                } else {
                    if (sb3.length() > 0 && !StringsKt.S(sb3, Separators.SLASH)) {
                        sb3.append('/');
                    }
                    sb3.append(StringsKt.y0(str, '/'));
                }
                string3 = sb3.toString();
            }
            String str4 = string3 == null ? "" : string3;
            int i = nygVar.c;
            int i2 = nygVar.d;
            boolean z = nygVar.e;
            String str5 = nygVar.f;
            long j = nygVar.g;
            int i3 = nygVar.h;
            long j2 = nygVar.i;
            String str6 = nygVar.j;
            int i4 = nygVar.k;
            long j3 = nygVar.l;
            boolean z2 = nygVar.m;
            str5.getClass();
            arrayList.add(new nyg(i, i2, i3, i4, j, j2, j3, str2, str3, str5, str6, str4, z, z2));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    public static List R(List list, List list2, List list3) {
        String string;
        Object next;
        lel0 lel0Var;
        Object next2;
        String string2;
        String string3;
        String str;
        List list4;
        Object next3;
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xah xahVar = (xah) it.next();
            xahVar.getClass();
            list2.getClass();
            list3.getClass();
            Iterator it2 = list3.iterator();
            do {
                string = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((ril0) next).f30549a != 40);
            ril0 ril0Var = (ril0) next;
            if (ril0Var == null || (list4 = ril0Var.f) == null) {
                lel0Var = null;
            } else {
                Iterator it3 = list4.iterator();
                do {
                    if (!it3.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it3.next();
                } while (((f3n0) next3).f8872a != xahVar.k);
                f3n0 f3n0Var = (f3n0) next3;
                if (f3n0Var != null) {
                    lel0Var = f3n0Var.c;
                } else {
                    lel0Var = null;
                }
            }
            Iterator it4 = list2.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (((qgg) next2).f28683a != xahVar.g);
            qgg qggVar = (qgg) next2;
            String strA = oyg.a(qggVar != null ? qggVar.b : null, lel0Var != null ? lel0Var.e : null);
            if (strA != null) {
                StringBuilder sb = new StringBuilder(ujn.h);
                if (strA.length() == 0) {
                    sb.setLength(0);
                } else if (StringsKt.O(strA, ujn.h, false) || kotlin.text.c.x(strA, "https://", false)) {
                    sb.setLength(0);
                    sb.append(strA);
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0(strA, '/'));
                }
                string2 = sb.toString();
            } else {
                string2 = null;
            }
            String str2 = "";
            if (string2 == null) {
                string2 = "";
            }
            String strA2 = oyg.a(qggVar != null ? qggVar.c : null, lel0Var != null ? lel0Var.f : null);
            if (strA2 != null) {
                StringBuilder sb2 = new StringBuilder(ujn.h);
                if (strA2.length() == 0) {
                    sb2.setLength(0);
                } else if (StringsKt.O(strA2, ujn.h, false) || kotlin.text.c.x(strA2, "https://", false)) {
                    sb2.setLength(0);
                    sb2.append(strA2);
                } else {
                    if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                        sb2.append('/');
                    }
                    sb2.append(StringsKt.y0(strA2, '/'));
                }
                string3 = sb2.toString();
            } else {
                string3 = null;
            }
            if (string3 == null) {
                string3 = "";
            }
            if (lel0Var != null && (str = lel0Var.f19909a) != null) {
                StringBuilder sb3 = new StringBuilder(ujn.h);
                if (str.length() == 0) {
                    sb3.setLength(0);
                } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                    sb3.setLength(0);
                    sb3.append(str);
                } else {
                    if (sb3.length() > 0 && !StringsKt.S(sb3, Separators.SLASH)) {
                        sb3.append('/');
                    }
                    sb3.append(StringsKt.y0(str, '/'));
                }
                string = sb3.toString();
            }
            if (string != null) {
                str2 = string;
            }
            arrayList.add(xah.a(xahVar, string2, string3, str2, false, 57340));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static drg0 n(brg0 brg0Var, String str) {
        drg0 drg0VarN;
        drg0 drg0Var = (drg0) brg0Var;
        if (str.equals(drg0Var.c)) {
            return drg0Var;
        }
        for (Object obj : brg0Var.getChildren()) {
            if (obj instanceof drg0) {
                drg0 drg0Var2 = (drg0) obj;
                if (str.equals(drg0Var2.c)) {
                    return drg0Var2;
                }
                if ((obj instanceof brg0) && (drg0VarN = n((brg0) obj, str)) != null) {
                    return drg0VarN;
                }
            }
        }
        return null;
    }

    public void A() {
        int iOrdinal = ((AnalyticsEntryPoint) this.c).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            t9f.b();
        } else {
            Long l = 10856L;
            long jLongValue = l.longValue();
            ((b4j) this.f5196a).f1961a.c("call_back_country_manual_call");
            ((je) this.b).f16351a.a(xun.f41520a, jLongValue);
        }
    }

    public void B(nq90 nq90Var) {
        if (nq90Var instanceof kq90) {
            String str = ((kq90) nq90Var).d;
            int iOrdinal = ((AnalyticsEntryPoint) this.c).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    return;
                }
                t9f.b();
            } else {
                b4j b4jVar = (b4j) this.f5196a;
                str.getClass();
                i8i.D("option", str, b4jVar.f1961a, "call_back_country_select");
                b1j.v(str, ((je) this.b).f16351a, 10854L);
            }
        }
    }

    public void C(String str) {
        str.getClass();
        b1j.v(str, (s1p) this.f5196a, 3071L);
    }

    public void D(Integer num, String str, String str2) {
        str2.getClass();
        int length = StringsKt.u0(str2).toString().length();
        int iIntValue = num != null ? num.intValue() : 2;
        bby bbyVar = (bby) this.c;
        if (length < iIntValue) {
            v3c.N(bbyVar);
        } else {
            v3c.N(bbyVar);
            this.c = sac.V((sje) this.b, pfh0.f26906a, null, null, new kmg0((Object) this, str, str2, (yje) null, (byte) 15), 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object F(bby bbyVar, zje zjeVar) {
        o3k0 o3k0Var;
        k050 k050Var;
        if (zjeVar instanceof o3k0) {
            o3k0Var = (o3k0) zjeVar;
            int i = o3k0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                o3k0Var.m = i - Integer.MIN_VALUE;
            } else {
                o3k0Var = new o3k0(this, zjeVar);
            }
        } else {
            o3k0Var = new o3k0(this, zjeVar);
        }
        Object obj = o3k0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = o3k0Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            k050Var = (k050) this.b;
            o3k0Var.i = bbyVar;
            o3k0Var.j = k050Var;
            o3k0Var.m = 1;
            if (k050Var.d(o3k0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = o3k0Var.j;
            bby bbyVar2 = o3k0Var.i;
            z1x.P(obj);
            k050Var = k050Var2;
            bbyVar = bbyVar2;
        }
        try {
            if (bbyVar == ((bby) this.c)) {
                this.c = null;
            }
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    public void H(int i) {
        i1w0 i1w0VarC = ((oeg0) this.c).c();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
        c8d c8dVar = new c8d(y7d.f42146a, new q0w0(null));
        byte b = 0;
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, c8dVar, i1w0VarC, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                kd30 kd30Var = (kd30) this.b;
                wv10 wv10Var = wv10.SPORT;
                kd30Var.Q(new ab50(3), new q270(this, i, b));
                return;
            }
            i1w0VarC.a((oe50) pawVar.next());
        }
    }

    public void I() {
        i1w0 i1w0VarB = ((oeg0) this.c).b();
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarB);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(null)), i1w0VarB, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                kd30 kd30Var = (kd30) this.b;
                wv10 wv10Var = wv10.SPORT;
                kd30.G(kd30Var, new ab50(3), null, false, false, 30);
                return;
            }
            i1w0VarB.a((oe50) pawVar.next());
        }
    }

    public void J(t270 t270Var) {
        kd30 kd30Var = (kd30) this.b;
        wv10 wv10Var = wv10.SPORT;
        kd30.G(kd30Var, new ab50(3), oct.f((oct) this.f5196a, 0L, null, 0, t270Var, null, 23), false, false, 26);
    }

    public void K(kkz kkzVar) {
        hii0 hii0Var = (hii0) this.c;
        if (hii0Var != null) {
            hii0Var.run();
        }
        hii0 hii0Var2 = new hii0((glz) this.f5196a, kkzVar);
        this.c = hii0Var2;
        ((Handler) this.b).postAtFrontOfQueue(hii0Var2);
    }

    public drg0 L(String str) {
        if (str != null) {
            if (str.startsWith(Separators.DOUBLE_QUOTE) && str.endsWith(Separators.DOUBLE_QUOTE)) {
                str = str.substring(1, str.length() - 1).replace("\\\"", Separators.DOUBLE_QUOTE);
            } else if (str.startsWith(Separators.QUOTE) && str.endsWith(Separators.QUOTE)) {
                str = str.substring(1, str.length() - 1).replace("\\'", Separators.QUOTE);
            }
            String strReplace = str.replace("\\\n", "").replace("\\A", Separators.RETURN);
            if (strReplace.length() > 1 && strReplace.startsWith(Separators.POUND)) {
                String strSubstring = strReplace.substring(1);
                HashMap map = (HashMap) this.c;
                if (strSubstring.length() == 0) {
                    return null;
                }
                if (strSubstring.equals(((yqg0) this.f5196a).c)) {
                    return (yqg0) this.f5196a;
                }
                if (map.containsKey(strSubstring)) {
                    return (drg0) map.get(strSubstring);
                }
                drg0 drg0VarN = n((yqg0) this.f5196a, strSubstring);
                map.put(strSubstring, drg0VarN);
                return drg0VarN;
            }
        }
        return null;
    }

    public void M(dp00 dp00Var) {
        this.f5196a = dp00Var.f6438a;
        this.c = dp00Var.c;
        this.b = dp00Var.b;
    }

    public void N(gp00 gp00Var, mva mvaVar) {
        gp00Var.getClass();
        int iOrdinal = gp00Var.ordinal();
        if (iOrdinal == 0) {
            this.f5196a = mvaVar;
            return;
        }
        if (iOrdinal == 1) {
            this.b = mvaVar;
        } else if (iOrdinal == 2) {
            this.c = mvaVar;
        } else {
            t9f.b();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object O(List list, zje zjeVar) {
        o4x o4xVar;
        k050 k050Var;
        ArrayList arrayList = (ArrayList) this.b;
        if (zjeVar instanceof o4x) {
            o4xVar = (o4x) zjeVar;
            int i = o4xVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                o4xVar.m = i - Integer.MIN_VALUE;
            } else {
                o4xVar = new o4x(this, zjeVar);
            }
        } else {
            o4xVar = new o4x(this, zjeVar);
        }
        Object obj = o4xVar.k;
        wne wneVar = wne.f39444a;
        int i2 = o4xVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            k050Var = (k050) this.f5196a;
            o4xVar.i = list;
            o4xVar.j = k050Var;
            o4xVar.m = 1;
            if (k050Var.d(o4xVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = o4xVar.j;
            List list2 = o4xVar.i;
            z1x.P(obj);
            k050Var = k050Var2;
            list = list2;
        }
        try {
            arrayList.clear();
            arrayList.addAll(list);
            ((p7m0) this.c).n(CollectionsKt.L0(arrayList));
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    public dp00 P() {
        return new dp00((mva) this.f5196a, (mva) this.b, (mva) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [a.bby] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.bby] */
    /* JADX WARN: Type inference failed for: r9v1, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r9v4, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public Object S(bby bbyVar, zje zjeVar) {
        p3k0 p3k0Var;
        ?? r2;
        ?? r0;
        if (zjeVar instanceof p3k0) {
            p3k0Var = (p3k0) zjeVar;
            int i = p3k0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                p3k0Var.m = i - Integer.MIN_VALUE;
            } else {
                p3k0Var = new p3k0(this, zjeVar);
            }
        } else {
            p3k0Var = new p3k0(this, zjeVar);
        }
        Object obj = p3k0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = p3k0Var.m;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                k050 k050Var = (k050) this.b;
                p3k0Var.i = bbyVar;
                p3k0Var.j = k050Var;
                p3k0Var.m = 1;
                if (k050Var.d(p3k0Var) != wneVar) {
                    r2 = bbyVar;
                    bbyVar = k050Var;
                }
                return wneVar;
            }
            if (i2 == 1) {
                i050 i050Var = p3k0Var.j;
                bby bbyVar2 = p3k0Var.i;
                z1x.P(obj);
                r2 = bbyVar2;
                bbyVar = i050Var;
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i050 i050Var2 = p3k0Var.j;
                bby bbyVar3 = p3k0Var.i;
                z1x.P(obj);
                r0 = bbyVar3;
                bbyVar = i050Var2;
            }
            r2 = r0;
            this.c = r2;
            bbyVar.c(null);
            return true;
            bby bbyVar4 = (bby) this.c;
            if (bbyVar4 != null) {
                bbyVar4.isActive();
            }
            if (bbyVar4 != null) {
                bbyVar4.cancel(new n3k0((lef0) this.f5196a));
            }
            if (bbyVar4 != null) {
                p3k0Var.i = r2;
                p3k0Var.j = bbyVar;
                p3k0Var.m = 2;
                if (bbyVar4.join(p3k0Var) != wneVar) {
                    r0 = r2;
                    bbyVar = bbyVar;
                    r2 = r0;
                }
                return wneVar;
            }
            this.c = r2;
            bbyVar.c(null);
            return true;
        } catch (Throwable th) {
            bbyVar.c(null);
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:12|13|71|78|22|23|76|24|(1:27)|70) */
    /* JADX WARN: Code duplicated, block: B:27:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:59:0x011a  */
    /* JADX WARN: Code duplicated, block: B:60:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        r12 = r1;
        r11 = r2;
        r2 = r6;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ea, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
    
        r17 = r4;
        r6 = r11;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fd, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010c, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010e, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
    
        if (r6.f != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011a, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011c, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0122, code lost:
    
        if (a.hic.C(r0) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0125, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0127, code lost:
    
        if (r2 > 3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012c, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r2, "error (", "): ", r0));
        r1.j = r12;
        r1.k = r11;
        r1.i = r9;
        r1.l = r4;
        r1.m = r2;
        r1.p = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x014b, code lost:
    
        if (a.qcc.O(3000, r1) == r3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0151, code lost:
    
        r1 = a.j0g0.b;
        r0 = new a.g0g0(r0);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x014b -> B:13:0x003b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable T(long r20, a.zje r22, java.lang.String r23) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cyu.T(long, a.zje, java.lang.String):java.io.Serializable");
    }

    @Override // a.da60
    public void a(ca60 ca60Var) {
        synchronized (((HashMap) this.b)) {
            ((HashMap) this.b).remove(ca60Var);
            if (((HashMap) this.b).isEmpty()) {
                ((lmv) j120.T()).execute(new xh00(this, (byte) 0));
            }
        }
    }

    @Override // a.da60
    public void b(Executor executor, ca60 ca60Var) {
        synchronized (((HashMap) this.b)) {
            boolean zIsEmpty = ((HashMap) this.b).isEmpty();
            ((HashMap) this.b).put(ca60Var, executor);
            if (zIsEmpty) {
                ((lmv) j120.T()).execute(new xh00(this, (byte) 1));
            } else {
                executor.execute(new llo(this, ca60Var, (byte) 14));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object c(List list, zje zjeVar) {
        m4x m4xVar;
        k050 k050Var;
        ArrayList arrayList = (ArrayList) this.b;
        if (zjeVar instanceof m4x) {
            m4xVar = (m4x) zjeVar;
            int i = m4xVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                m4xVar.m = i - Integer.MIN_VALUE;
            } else {
                m4xVar = new m4x(this, zjeVar);
            }
        } else {
            m4xVar = new m4x(this, zjeVar);
        }
        Object obj = m4xVar.k;
        wne wneVar = wne.f39444a;
        int i2 = m4xVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            k050Var = (k050) this.f5196a;
            m4xVar.i = list;
            m4xVar.j = k050Var;
            m4xVar.m = 1;
            if (k050Var.d(m4xVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = m4xVar.j;
            List list2 = m4xVar.i;
            z1x.P(obj);
            k050Var = k050Var2;
            list = list2;
        }
        try {
            arrayList.addAll(list);
            ((p7m0) this.c).n(CollectionsKt.L0(arrayList));
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(String str, String str2, zje zjeVar) {
        mvp0 mvp0Var;
        if (zjeVar instanceof mvp0) {
            mvp0Var = (mvp0) zjeVar;
            int i = mvp0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mvp0Var.k = i - Integer.MIN_VALUE;
            } else {
                mvp0Var = new mvp0(this, zjeVar);
            }
        } else {
            mvp0Var = new mvp0(this, zjeVar);
        }
        Object objA = mvp0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = mvp0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            wq10 wq10Var = (wq10) this.b;
            String strA = ((btt0) this.f5196a).a();
            mvp0Var.k = 1;
            objA = ((cup0) wq10Var.f39569a.b(sre0.f32672a.b(cup0.class))).a(strA, str2, new iwp0(str), mvp0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        Integer num = ((lwp0) ((dx5) objA).a()).f20775a;
        return Boolean.valueOf(num != null && num.intValue() == 1);
    }

    public void e(long j, fq80 fq80Var) {
        if (fq80Var.a() < 9) {
            return;
        }
        int iM = fq80Var.m();
        int iM2 = fq80Var.m();
        int iZ = fq80Var.z();
        if (iM == 434 && iM2 == 1195456820 && iZ == 3) {
            ((fp) this.c).a(j, fq80Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void f(cmn0 cmn0Var, Map.Entry entry) {
        cmn0 cmn0Var2 = (cmn0) entry.getValue();
        l8x.U("SurfaceProcessorNode", "     -> outputEdge = " + cmn0Var2);
        i55 i55Var = null;
        i55 i55Var2 = new i55(cmn0Var.g.f12463a, ((l45) entry.getKey()).d, cmn0Var.c ? (s0a) this.b : null, ((l45) entry.getKey()).f, ((l45) entry.getKey()).g);
        int i = ((l45) entry.getKey()).c;
        cmn0Var2.getClass();
        ofm0.m();
        cmn0Var2.a();
        z1x.y("Consumer can only be linked once.", !cmn0Var2.j);
        cmn0Var2.j = true;
        bmn0 bmn0Var = cmn0Var2.l;
        qbb qbbVarK0 = ro4.k0(bmn0Var.c(), new amn0(cmn0Var2, bmn0Var, i, i55Var2, i55Var), j120.T());
        qbbVarK0.a(new mfr((Object) qbbVarK0, (Object) new fck0(this, cmn0Var2, false, (byte) 4), (byte) (0 == true ? 1 : 0)), j120.T());
    }

    public void g(huo huoVar, zrs0 zrs0Var) {
        ncs0[] ncs0VarArr = (ncs0[]) this.b;
        for (int i = 0; i < ncs0VarArr.length; i++) {
            zrs0Var.a();
            zrs0Var.b();
            ncs0 ncs0VarQ = huoVar.q(zrs0Var.d, 3);
            androidx.media3.common.b bVar = (androidx.media3.common.b) ((List) this.f5196a).get(i);
            String str = bVar.p;
            x0x.y("Invalid closed caption MIME type provided: %s", str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            awq awqVar = new awq();
            zrs0Var.b();
            awqVar.f1587a = zrs0Var.e;
            awqVar.n = mg40.n("video/mp2t");
            awqVar.o = mg40.n(str);
            awqVar.e = bVar.e;
            awqVar.d = bVar.d;
            awqVar.O = bVar.P;
            awqVar.r = bVar.s;
            ohs0.w(awqVar, ncs0VarQ);
            ncs0VarArr[i] = ncs0VarQ;
        }
    }

    public mva h(gp00 gp00Var) {
        gp00Var.getClass();
        int iOrdinal = gp00Var.ordinal();
        if (iOrdinal == 0) {
            return (mva) this.f5196a;
        }
        if (iOrdinal == 1) {
            return (mva) this.b;
        }
        if (iOrdinal == 2) {
            return (mva) this.c;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(ArrayList arrayList, ArrayList arrayList2, zje zjeVar) {
        lzq0 lzq0Var;
        Object g0g0Var;
        if (zjeVar instanceof lzq0) {
            lzq0Var = (lzq0) zjeVar;
            int i = lzq0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                lzq0Var.l = i - Integer.MIN_VALUE;
            } else {
                lzq0Var = new lzq0(this, zjeVar);
            }
        } else {
            lzq0Var = new lzq0(this, zjeVar);
        }
        Object objD = lzq0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = lzq0Var.l;
        try {
            if (i2 == 0) {
                z1x.P(objD);
                e0g0 e0g0Var = j0g0.b;
                roi0 roi0Var = (roi0) this.b;
                lzq0Var.i = arrayList2;
                lzq0Var.l = 1;
                objD = roi0Var.d(arrayList, lzq0Var);
                if (objD == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList2 = lzq0Var.i;
                z1x.P(objD);
            }
            g0g0Var = (List) objD;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            return g0g0Var;
        }
        try {
            List list = (List) g0g0Var;
            ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(plc.M((fmb) it.next()));
            }
            ((LinkedHashSet) ((n660) this.c).d).addAll(arrayList3);
            return CollectionsKt.q0(arrayList3, arrayList2);
        } catch (Throwable th2) {
            e0g0 e0g0Var4 = j0g0.b;
            return new g0g0(th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(boolean z, ArrayList arrayList, zje zjeVar) {
        kzq0 kzq0Var;
        if (zjeVar instanceof kzq0) {
            kzq0Var = (kzq0) zjeVar;
            int i = kzq0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kzq0Var.k = i - Integer.MIN_VALUE;
            } else {
                kzq0Var = new kzq0(this, zjeVar);
            }
        } else {
            kzq0Var = new kzq0(this, zjeVar);
        }
        Object obj = kzq0Var.i;
        Object obj2 = wne.f39444a;
        int i2 = kzq0Var.k;
        if (i2 != 0) {
            if (i2 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        ArrayList arrayListO = ((n660) this.c).o(arrayList);
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayListO, 10));
        Iterator it = arrayListO.iterator();
        while (it.hasNext()) {
            axq.t(((qgg) it.next()).f28683a, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!arrayList2.contains(new Long(((Number) obj3).longValue()))) {
                arrayList3.add(obj3);
            }
        }
        if (!z || arrayList3.isEmpty()) {
            e0g0 e0g0Var = j0g0.b;
            return arrayListO;
        }
        kzq0Var.k = 1;
        Object objI = i(arrayList3, arrayListO, kzq0Var);
        return objI == obj2 ? obj2 : objI;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(2:4|(1:6)(1:7))(1:7)|8|99|(1:(4:(1:(4:13|14|15|64)(2:18|19))(3:20|21|22)|65|66|(8:97|32|106|33|34|102|35|(2:37|79)(1:38))(1:(2:84|85)(1:86)))(4:23|100|24|25))(4:28|29|30|(8:97|32|106|33|34|102|35|(2:37|79)(1:38))(1:(2:84|85)(1:86)))|104|39|40|88|(1:90)|91|(1:93)(1:94)|95|96) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:97|32|106|33|34|102|35|(2:37|79)(1:38)) */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x012f A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x0043, B:40:0x0108, B:49:0x0127, B:52:0x012f, B:54:0x013a, B:58:0x0143, B:60:0x0147, B:67:0x016a, B:69:0x0175, B:71:0x017d, B:75:0x0187, B:77:0x018b, B:81:0x01ac, B:82:0x01b5, B:84:0x01c0, B:85:0x01c7, B:86:0x01c8, B:21:0x0074, B:29:0x00bd), top: B:99:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x013a A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x0043, B:40:0x0108, B:49:0x0127, B:52:0x012f, B:54:0x013a, B:58:0x0143, B:60:0x0147, B:67:0x016a, B:69:0x0175, B:71:0x017d, B:75:0x0187, B:77:0x018b, B:81:0x01ac, B:82:0x01b5, B:84:0x01c0, B:85:0x01c7, B:86:0x01c8, B:21:0x0074, B:29:0x00bd), top: B:99:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0140  */
    /* JADX WARN: Code duplicated, block: B:57:0x0142  */
    /* JADX WARN: Code duplicated, block: B:60:0x0147 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x0043, B:40:0x0108, B:49:0x0127, B:52:0x012f, B:54:0x013a, B:58:0x0143, B:60:0x0147, B:67:0x016a, B:69:0x0175, B:71:0x017d, B:75:0x0187, B:77:0x018b, B:81:0x01ac, B:82:0x01b5, B:84:0x01c0, B:85:0x01c7, B:86:0x01c8, B:21:0x0074, B:29:0x00bd), top: B:99:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0162  */
    /* JADX WARN: Code duplicated, block: B:63:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x0043, B:40:0x0108, B:49:0x0127, B:52:0x012f, B:54:0x013a, B:58:0x0143, B:60:0x0147, B:67:0x016a, B:69:0x0175, B:71:0x017d, B:75:0x0187, B:77:0x018b, B:81:0x01ac, B:82:0x01b5, B:84:0x01c0, B:85:0x01c7, B:86:0x01c8, B:21:0x0074, B:29:0x00bd), top: B:99:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0175 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x0043, B:40:0x0108, B:49:0x0127, B:52:0x012f, B:54:0x013a, B:58:0x0143, B:60:0x0147, B:67:0x016a, B:69:0x0175, B:71:0x017d, B:75:0x0187, B:77:0x018b, B:81:0x01ac, B:82:0x01b5, B:84:0x01c0, B:85:0x01c7, B:86:0x01c8, B:21:0x0074, B:29:0x00bd), top: B:99:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x017d A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x0043, B:40:0x0108, B:49:0x0127, B:52:0x012f, B:54:0x013a, B:58:0x0143, B:60:0x0147, B:67:0x016a, B:69:0x0175, B:71:0x017d, B:75:0x0187, B:77:0x018b, B:81:0x01ac, B:82:0x01b5, B:84:0x01c0, B:85:0x01c7, B:86:0x01c8, B:21:0x0074, B:29:0x00bd), top: B:99:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0184  */
    /* JADX WARN: Code duplicated, block: B:74:0x0186  */
    /* JADX WARN: Code duplicated, block: B:77:0x018b A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x0043, B:40:0x0108, B:49:0x0127, B:52:0x012f, B:54:0x013a, B:58:0x0143, B:60:0x0147, B:67:0x016a, B:69:0x0175, B:71:0x017d, B:75:0x0187, B:77:0x018b, B:81:0x01ac, B:82:0x01b5, B:84:0x01c0, B:85:0x01c7, B:86:0x01c8, B:21:0x0074, B:29:0x00bd), top: B:99:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ac A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x0043, B:40:0x0108, B:49:0x0127, B:52:0x012f, B:54:0x013a, B:58:0x0143, B:60:0x0147, B:67:0x016a, B:69:0x0175, B:71:0x017d, B:75:0x0187, B:77:0x018b, B:81:0x01ac, B:82:0x01b5, B:84:0x01c0, B:85:0x01c7, B:86:0x01c8, B:21:0x0074, B:29:0x00bd), top: B:99:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01b5 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x0043, B:40:0x0108, B:49:0x0127, B:52:0x012f, B:54:0x013a, B:58:0x0143, B:60:0x0147, B:67:0x016a, B:69:0x0175, B:71:0x017d, B:75:0x0187, B:77:0x018b, B:81:0x01ac, B:82:0x01b5, B:84:0x01c0, B:85:0x01c7, B:86:0x01c8, B:21:0x0074, B:29:0x00bd), top: B:99:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01c0 A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x0043, B:40:0x0108, B:49:0x0127, B:52:0x012f, B:54:0x013a, B:58:0x0143, B:60:0x0147, B:67:0x016a, B:69:0x0175, B:71:0x017d, B:75:0x0187, B:77:0x018b, B:81:0x01ac, B:82:0x01b5, B:84:0x01c0, B:85:0x01c7, B:86:0x01c8, B:21:0x0074, B:29:0x00bd), top: B:99:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01c8 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:14:0x0043, B:40:0x0108, B:49:0x0127, B:52:0x012f, B:54:0x013a, B:58:0x0143, B:60:0x0147, B:67:0x016a, B:69:0x0175, B:71:0x017d, B:75:0x0187, B:77:0x018b, B:81:0x01ac, B:82:0x01b5, B:84:0x01c0, B:85:0x01c7, B:86:0x01c8, B:21:0x0074, B:29:0x00bd), top: B:99:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:97:0x00cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010d, code lost:
    
        r15 = r8;
        r8 = r4;
        r6 = r15;
        r4 = r10;
        r10 = r5;
        r15 = r14;
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0118, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0119, code lost:
    
        r15 = r14;
        r14 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x011d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011e, code lost:
    
        r20 = r2;
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0122, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0123, code lost:
    
        r20 = r2;
        r2 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0163 -> B:64:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01a9 -> B:64:0x0165). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(long r21, a.zje r23) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cyu.k(long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable l(int i, zje zjeVar, List list) {
        nzq0 nzq0Var;
        Object objO;
        ArrayList arrayList;
        List list2;
        ArrayList arrayList2;
        if (zjeVar instanceof nzq0) {
            nzq0Var = (nzq0) zjeVar;
            int i2 = nzq0Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nzq0Var.o = i2 - Integer.MIN_VALUE;
            } else {
                nzq0Var = new nzq0(this, zjeVar);
            }
        } else {
            nzq0Var = new nzq0(this, zjeVar);
        }
        Object objE = nzq0Var.m;
        wne wneVar = wne.f39444a;
        int i3 = nzq0Var.o;
        if (i3 == 0) {
            z1x.P(objE);
            jo20 jo20VarN = kbc.N(((knf0) this.f5196a).d(), i);
            roi0 roi0Var = (roi0) this.b;
            nzq0Var.j = list;
            nzq0Var.i = i;
            nzq0Var.o = 1;
            objE = roi0Var.e(jo20VarN, nzq0Var);
            if (objE != wneVar) {
            }
            return wneVar;
        }
        if (i3 == 1) {
            i = nzq0Var.i;
            list = nzq0Var.j;
            z1x.P(objE);
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = nzq0Var.l;
            arrayList2 = nzq0Var.k;
            list2 = nzq0Var.j;
            z1x.P(objE);
            objO = ((j0g0) objE).f15681a;
        }
        if (j0g0.a(objO) != null) {
            objO = ((n660) this.c).o(arrayList);
        }
        return (Serializable) R(arrayList2, (List) objO, list2);
        Iterable iterable = (Iterable) objE;
        ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList3.add(jeb.V((abh) it.next()));
        }
        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            axq.t(((xah) it2.next()).g, arrayList4);
        }
        nzq0Var.j = list;
        nzq0Var.k = arrayList3;
        nzq0Var.l = arrayList4;
        nzq0Var.i = i;
        nzq0Var.o = 2;
        Object objJ = j(true, arrayList4, nzq0Var);
        if (objJ != wneVar) {
            objO = objJ;
            arrayList = arrayList4;
            list2 = list;
            arrayList2 = arrayList3;
            if (j0g0.a(objO) != null) {
                objO = ((n660) this.c).o(arrayList);
            }
            return (Serializable) R(arrayList2, (List) objO, list2);
        }
        return wneVar;
    }

    public gz40 m() {
        int i;
        float fA;
        int i2;
        yqg0 yqg0Var = (yqg0) this.f5196a;
        jqg0 jqg0Var = yqg0Var.r;
        jqg0 jqg0Var2 = yqg0Var.s;
        if (jqg0Var == null || jqg0Var.g() || (i = jqg0Var.b) == 9 || i == 2 || i == 3) {
            return new gz40(-1.0f, -1.0f, -1.0f, -1.0f);
        }
        float fA2 = jqg0Var.a();
        if (jqg0Var2 == null) {
            gz40 gz40Var = ((yqg0) this.f5196a).o;
            fA = gz40Var != null ? (gz40Var.e * fA2) / gz40Var.d : fA2;
        } else {
            if (jqg0Var2.g() || (i2 = jqg0Var2.b) == 9 || i2 == 2 || i2 == 3) {
                return new gz40(-1.0f, -1.0f, -1.0f, -1.0f);
            }
            fA = jqg0Var2.a();
        }
        return new gz40(0.0f, 0.0f, fA2, fA);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:77|24|25|79|26|27|28|(1:31)|65) */
    /* JADX WARN: Code duplicated, block: B:31:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:55:0x011c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:66:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:0x014e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0158  */
    /* JADX WARN: Code duplicated, block: B:70:0x0165  */
    /* JADX WARN: Code duplicated, block: B:72:0x0169  */
    /* JADX WARN: Code duplicated, block: B:74:0x016f  */
    /* JADX WARN: Code duplicated, block: B:77:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d5, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010c, code lost:
    
        if (a.qcc.P(r11, r4) == r3) goto L65;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00de -> B:23:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014a -> B:67:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x014e -> B:52:0x0110). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0158 -> B:23:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(java.lang.String r19, a.zje r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cyu.o(java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public Serializable p(Integer num, zje zjeVar) {
        shb0 shb0Var;
        knf0 knf0Var = (knf0) this.f5196a;
        if (zjeVar instanceof shb0) {
            shb0Var = (shb0) zjeVar;
            int i = shb0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                shb0Var.k = i - Integer.MIN_VALUE;
            } else {
                shb0Var = new shb0(this, zjeVar);
            }
        } else {
            shb0Var = new shb0(this, zjeVar);
        }
        shb0 shb0Var2 = shb0Var;
        Object objA = shb0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = shb0Var2.k;
        if (i2 == 0) {
            z1x.P(objA);
            ugf0 ugf0Var = (ugf0) this.b;
            knf0Var.getClass();
            String strC = knf0Var.c();
            shb0Var2.k = 1;
            zhb0 zhb0Var = (zhb0) ((rta0) ugf0Var.f35622a).invoke();
            Integer num2 = new Integer(1357);
            objA = zhb0Var.a(num, num2.intValue() != 0 ? num2 : null, strC, null, shb0Var2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        yhb0 yhb0Var = (yhb0) objA;
        yhb0Var.getClass();
        List<xhb0> list = yhb0Var.f42631a;
        if (list == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (xhb0 xhb0Var : list) {
            Long l = xhb0Var.f40882a;
            long jLongValue = 0;
            long jLongValue2 = l != null ? l.longValue() : 0L;
            String str = xhb0Var.b;
            String str2 = str == null ? "" : str;
            List list2 = xhb0Var.c;
            String str3 = list2 != null ? (String) CollectionsKt.firstOrNull(list2) : null;
            String str4 = str3 == null ? "" : str3;
            Long l2 = xhb0Var.d;
            if (l2 != null) {
                jLongValue = l2.longValue();
            }
            arrayList.add(new xde0(jLongValue2, Long.valueOf(jLongValue), str2, str4));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(String str, zje zjeVar) {
        nvp0 nvp0Var;
        if (zjeVar instanceof nvp0) {
            nvp0Var = (nvp0) zjeVar;
            int i = nvp0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nvp0Var.k = i - Integer.MIN_VALUE;
            } else {
                nvp0Var = new nvp0(this, zjeVar);
            }
        } else {
            nvp0Var = new nvp0(this, zjeVar);
        }
        Object objC = nvp0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = nvp0Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            wq10 wq10Var = (wq10) this.b;
            String strA = ((btt0) this.f5196a).a();
            nvp0Var.k = 1;
            objC = ((cup0) wq10Var.f39569a.b(sre0.f32672a.b(cup0.class))).c(strA, str, nvp0Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        avp0 avp0Var = (avp0) ((dx5) objC).a();
        String str2 = avp0Var.b;
        if (str2 == null) {
            str2 = "";
        }
        if (StringsKt.W(str2)) {
            jf4.k(null);
            return null;
        }
        String str3 = avp0Var.f1538a;
        String str4 = str3 != null ? str3 : "";
        if (!StringsKt.W(str4)) {
            return new dup0(str2, str4);
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(zje zjeVar) {
        ovp0 ovp0Var;
        if (zjeVar instanceof ovp0) {
            ovp0Var = (ovp0) zjeVar;
            int i = ovp0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ovp0Var.k = i - Integer.MIN_VALUE;
            } else {
                ovp0Var = new ovp0(this, zjeVar);
            }
        } else {
            ovp0Var = new ovp0(this, zjeVar);
        }
        Object objB = ovp0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ovp0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            wq10 wq10Var = (wq10) this.b;
            String strA = ((btt0) this.f5196a).a();
            ovp0Var.k = 1;
            objB = ((cup0) wq10Var.f39569a.b(sre0.f32672a.b(cup0.class))).b(strA, ovp0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        String str = ((hvp0) ((dx5) objB).a()).f13737a;
        if (str == null) {
            str = "";
        }
        if (!StringsKt.W(str)) {
            return str;
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    public Object s(int i, long j, zje zjeVar) {
        o4s0 o4s0Var;
        owp0 owp0Var = (owp0) this.b;
        if (zjeVar instanceof o4s0) {
            o4s0Var = (o4s0) zjeVar;
            int i2 = o4s0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o4s0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                o4s0Var = new o4s0(this, zjeVar);
            }
        } else {
            o4s0Var = new o4s0(this, zjeVar);
        }
        o4s0 o4s0Var2 = o4s0Var;
        Object objA = o4s0Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = o4s0Var2.k;
        ?? arrayList = 0;
        if (i3 == 0) {
            z1x.P(objA);
            r2s0 r2s0Var = (r2s0) owp0Var.b;
            if (r2s0Var != null) {
                return r2s0Var;
            }
            w4p0 w4p0Var = (w4p0) this.f5196a;
            String strC = ((knf0) this.c).c();
            o4s0Var2.k = 1;
            objA = ((mwr0) ((lkr0) w4p0Var.b).invoke()).a(j, i, strC, o4s0Var2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        z4s0 z4s0Var = (z4s0) objA;
        z4s0Var.getClass();
        List<List> list = z4s0Var.c;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (List list2 : list) {
                list2.getClass();
                String str = (String) CollectionsKt.firstOrNull(list2);
                String str2 = str == null ? "" : str;
                String str3 = (String) CollectionsKt.f0(list2);
                String str4 = str3 == null ? "" : str3;
                List listSubList = list2.subList(1, list2.size() - 7);
                String str5 = (String) CollectionsKt.W(list2.size() - 7, list2);
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = str5.length() == 0 ? "0" : str5;
                String str7 = (String) CollectionsKt.W(list2.size() - 6, list2);
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = str7.length() == 0 ? "0" : str7;
                String str9 = (String) CollectionsKt.W(list2.size() - 5, list2);
                if (str9 == null) {
                    str9 = "";
                }
                String str10 = str9.length() == 0 ? "0" : str9;
                String str11 = (String) CollectionsKt.W(list2.size() - 4, list2);
                if (str11 == null) {
                    str11 = "";
                }
                String str12 = str11.length() == 0 ? "0" : str11;
                String str13 = (String) CollectionsKt.W(list2.size() - 3, list2);
                if (str13 == null) {
                    str13 = "";
                }
                String str14 = str13.length() == 0 ? "0" : str13;
                String str15 = (String) CollectionsKt.W(list2.size() - 2, list2);
                String str16 = str15 != null ? str15 : "";
                arrayList.add(new cmp0(str2, str4, listSubList, str6, str8, str10, str12, str14, str16.length() == 0 ? "0" : str16));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        r2s0 r2s0Var2 = new r2s0(arrayList);
        owp0Var.b = r2s0Var2;
        return r2s0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Enum t(zje zjeVar) {
        byu byuVar;
        if (zjeVar instanceof byu) {
            byuVar = (byu) zjeVar;
            int i = byuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                byuVar.k = i - Integer.MIN_VALUE;
            } else {
                byuVar = new byu(this, zjeVar);
            }
        } else {
            byuVar = new byu(this, zjeVar);
        }
        Object objM = byuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = byuVar.k;
        if (i2 == 0) {
            z1x.P(objM);
            a1t a1tVarB = ((n4u) this.f5196a).b();
            byuVar.k = 1;
            objM = ntb.M(a1tVarB, byuVar);
            if (objM == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objM);
        }
        Collection collection = (Collection) objM;
        boolean z = collection == null || collection.isEmpty();
        r9u r9uVar = (r9u) this.c;
        ygp ygpVar = ygp.o;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        if (z) {
            return a1p0.f83a;
        }
        int i3 = ayu.f1687a[((pru) this.b).a().g.B.ordinal()];
        if (i3 == 1 && zD) {
            return a1p0.c;
        }
        if (i3 == 2 && zD) {
            return a1p0.c;
        }
        return (i3 == 3 || i3 == 4) ? a1p0.b : a1p0.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(zje zjeVar) {
        no00 no00Var;
        if (zjeVar instanceof no00) {
            no00Var = (no00) zjeVar;
            int i = no00Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                no00Var.k = i - Integer.MIN_VALUE;
            } else {
                no00Var = new no00(this, zjeVar);
            }
        } else {
            no00Var = new no00(this, zjeVar);
        }
        Object obj = no00Var.i;
        wne wneVar = wne.f39444a;
        int i2 = no00Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            if (((dzz) ((xqt) this.b).b.b).c != 0) {
                return Unit.f46060a;
            }
            ((xqt) this.c).b();
            ciu ciuVar = (ciu) this.f5196a;
            no00Var.k = 1;
            if (ciuVar.a(no00Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public boolean v() {
        return ((usc) this.f5196a).f36204a.b().b > ((rkr0) ((yfu) this.b).f42558a).b().f2869a * ((double) ((hru) this.c).a());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:163|37|154|38|152|39|40|41|42|159|43|(6:46|150|47|(3:49|(12:52|(1:54)(1:55)|56|(1:58)(1:59)|60|(1:62)(1:63)|64|(1:66)(1:67)|68|(2:70|171)(2:71|170)|72|50)|169)(1:75)|(1:77)|78)|146) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:46|150|47|(3:49|(12:52|(1:54)(1:55)|56|(1:58)(1:59)|60|(1:62)(1:63)|64|(1:66)(1:67)|68|(2:70|171)(2:71|170)|72|50)|169)(1:75)|(1:77)|78) */
    /* JADX WARN: Code duplicated, block: B:100:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:104:0x01f2 A[Catch: Exception -> 0x005e, TryCatch #3 {Exception -> 0x005e, blocks: (B:15:0x0051, B:93:0x01d3, B:96:0x01db, B:98:0x01e6, B:102:0x01ee, B:104:0x01f2, B:109:0x020f, B:111:0x0218, B:113:0x021e, B:117:0x0226, B:119:0x022a, B:122:0x0243, B:123:0x0249, B:20:0x0070, B:34:0x00b5), top: B:156:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0209  */
    /* JADX WARN: Code duplicated, block: B:107:0x020b  */
    /* JADX WARN: Code duplicated, block: B:109:0x020f A[Catch: Exception -> 0x005e, TryCatch #3 {Exception -> 0x005e, blocks: (B:15:0x0051, B:93:0x01d3, B:96:0x01db, B:98:0x01e6, B:102:0x01ee, B:104:0x01f2, B:109:0x020f, B:111:0x0218, B:113:0x021e, B:117:0x0226, B:119:0x022a, B:122:0x0243, B:123:0x0249, B:20:0x0070, B:34:0x00b5), top: B:156:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0218 A[Catch: Exception -> 0x005e, TryCatch #3 {Exception -> 0x005e, blocks: (B:15:0x0051, B:93:0x01d3, B:96:0x01db, B:98:0x01e6, B:102:0x01ee, B:104:0x01f2, B:109:0x020f, B:111:0x0218, B:113:0x021e, B:117:0x0226, B:119:0x022a, B:122:0x0243, B:123:0x0249, B:20:0x0070, B:34:0x00b5), top: B:156:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x021e A[Catch: Exception -> 0x005e, TryCatch #3 {Exception -> 0x005e, blocks: (B:15:0x0051, B:93:0x01d3, B:96:0x01db, B:98:0x01e6, B:102:0x01ee, B:104:0x01f2, B:109:0x020f, B:111:0x0218, B:113:0x021e, B:117:0x0226, B:119:0x022a, B:122:0x0243, B:123:0x0249, B:20:0x0070, B:34:0x00b5), top: B:156:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0223  */
    /* JADX WARN: Code duplicated, block: B:116:0x0225  */
    /* JADX WARN: Code duplicated, block: B:119:0x022a A[Catch: Exception -> 0x005e, TryCatch #3 {Exception -> 0x005e, blocks: (B:15:0x0051, B:93:0x01d3, B:96:0x01db, B:98:0x01e6, B:102:0x01ee, B:104:0x01f2, B:109:0x020f, B:111:0x0218, B:113:0x021e, B:117:0x0226, B:119:0x022a, B:122:0x0243, B:123:0x0249, B:20:0x0070, B:34:0x00b5), top: B:156:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0241  */
    /* JADX WARN: Code duplicated, block: B:122:0x0243 A[Catch: Exception -> 0x005e, TryCatch #3 {Exception -> 0x005e, blocks: (B:15:0x0051, B:93:0x01d3, B:96:0x01db, B:98:0x01e6, B:102:0x01ee, B:104:0x01f2, B:109:0x020f, B:111:0x0218, B:113:0x021e, B:117:0x0226, B:119:0x022a, B:122:0x0243, B:123:0x0249, B:20:0x0070, B:34:0x00b5), top: B:156:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0249 A[Catch: Exception -> 0x005e, TRY_LEAVE, TryCatch #3 {Exception -> 0x005e, blocks: (B:15:0x0051, B:93:0x01d3, B:96:0x01db, B:98:0x01e6, B:102:0x01ee, B:104:0x01f2, B:109:0x020f, B:111:0x0218, B:113:0x021e, B:117:0x0226, B:119:0x022a, B:122:0x0243, B:123:0x0249, B:20:0x0070, B:34:0x00b5), top: B:156:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x024e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0253 A[Catch: Exception -> 0x025b, TRY_ENTER, TryCatch #4 {Exception -> 0x025b, blocks: (B:127:0x0253, B:128:0x025a, B:131:0x0260), top: B:158:0x0251 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0260 A[Catch: Exception -> 0x025b, TRY_LEAVE, TryCatch #4 {Exception -> 0x025b, blocks: (B:127:0x0253, B:128:0x025a, B:131:0x0260), top: B:158:0x0251 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0106  */
    /* JADX WARN: Code duplicated, block: B:49:0x011d A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:47:0x0111, B:49:0x011d, B:50:0x012c, B:52:0x0132, B:56:0x014a, B:60:0x0153, B:62:0x0157, B:64:0x0160, B:68:0x0169, B:70:0x016d, B:72:0x0176, B:77:0x0188, B:78:0x018a), top: B:150:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0132 A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:47:0x0111, B:49:0x011d, B:50:0x012c, B:52:0x0132, B:56:0x014a, B:60:0x0153, B:62:0x0157, B:64:0x0160, B:68:0x0169, B:70:0x016d, B:72:0x0176, B:77:0x0188, B:78:0x018a), top: B:150:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0145  */
    /* JADX WARN: Code duplicated, block: B:55:0x0148  */
    /* JADX WARN: Code duplicated, block: B:58:0x014e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0151  */
    /* JADX WARN: Code duplicated, block: B:62:0x0157 A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:47:0x0111, B:49:0x011d, B:50:0x012c, B:52:0x0132, B:56:0x014a, B:60:0x0153, B:62:0x0157, B:64:0x0160, B:68:0x0169, B:70:0x016d, B:72:0x0176, B:77:0x0188, B:78:0x018a), top: B:150:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x015e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0164  */
    /* JADX WARN: Code duplicated, block: B:67:0x0167  */
    /* JADX WARN: Code duplicated, block: B:70:0x016d A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:47:0x0111, B:49:0x011d, B:50:0x012c, B:52:0x0132, B:56:0x014a, B:60:0x0153, B:62:0x0157, B:64:0x0160, B:68:0x0169, B:70:0x016d, B:72:0x0176, B:77:0x0188, B:78:0x018a), top: B:150:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0174  */
    /* JADX WARN: Code duplicated, block: B:75:0x0185  */
    /* JADX WARN: Code duplicated, block: B:77:0x0188 A[Catch: all -> 0x0181, TryCatch #0 {all -> 0x0181, blocks: (B:47:0x0111, B:49:0x011d, B:50:0x012c, B:52:0x0132, B:56:0x014a, B:60:0x0153, B:62:0x0157, B:64:0x0160, B:68:0x0169, B:70:0x016d, B:72:0x0176, B:77:0x0188, B:78:0x018a), top: B:150:0x0111 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01db A[Catch: Exception -> 0x005e, TryCatch #3 {Exception -> 0x005e, blocks: (B:15:0x0051, B:93:0x01d3, B:96:0x01db, B:98:0x01e6, B:102:0x01ee, B:104:0x01f2, B:109:0x020f, B:111:0x0218, B:113:0x021e, B:117:0x0226, B:119:0x022a, B:122:0x0243, B:123:0x0249, B:20:0x0070, B:34:0x00b5), top: B:156:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01e6 A[Catch: Exception -> 0x005e, TryCatch #3 {Exception -> 0x005e, blocks: (B:15:0x0051, B:93:0x01d3, B:96:0x01db, B:98:0x01e6, B:102:0x01ee, B:104:0x01f2, B:109:0x020f, B:111:0x0218, B:113:0x021e, B:117:0x0226, B:119:0x022a, B:122:0x0243, B:123:0x0249, B:20:0x0070, B:34:0x00b5), top: B:156:0x0028 }] */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0285, code lost:
    
        if (r2.a(r0, r3) == r4) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0299, code lost:
    
        if (r2.a(r0, r3) == r4) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x020c, code lost:
    
        r15 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0181, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0182, code lost:
    
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a4, code lost:
    
        if (r2.a(r0, r3) == r4) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01af, code lost:
    
        r8 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b9, code lost:
    
        r15 = r0;
        r3 = r17;
        r12 = r18;
        r10 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c2, code lost:
    
        r8 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x024c -> B:108:0x020c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01db -> B:97:0x01e2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(java.lang.String r27, a.zje r28) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cyu.w(java.lang.String, a.zje):java.lang.Object");
    }

    public void x(Integer num) {
        int iOrdinal = ((AnalyticsEntryPoint) this.c).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            t9f.b();
            return;
        }
        Long l = 10858L;
        long jLongValue = l.longValue();
        b4j b4jVar = (b4j) this.f5196a;
        jo20 jo20Var = new jo20();
        if (num != null) {
            jo20Var.put("option", num);
        }
        b4jVar.f1961a.a("call_back_country_manual_add", jo20Var.b());
        je jeVar = (je) this.b;
        yni0 yni0Var = new yni0();
        if (num != null) {
            yni0Var.add(new i1p(num));
        }
        jeVar.f16351a.a(cui0.a(yni0Var), jLongValue);
    }

    public void y(String str) {
        str.getClass();
        int iOrdinal = ((AnalyticsEntryPoint) this.c).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            t9f.b();
        } else {
            Long l = 10860L;
            long jLongValue = l.longValue();
            i8i.D("option", str, ((b4j) this.f5196a).f1961a, "call_back_country_manual_error");
            b1j.v(str, ((je) this.b).f16351a, jLongValue);
        }
    }

    public void z() {
        int iOrdinal = ((AnalyticsEntryPoint) this.c).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            t9f.b();
        } else {
            Long l = 10862L;
            long jLongValue = l.longValue();
            ((b4j) this.f5196a).f1961a.c("call_back_country_search_call");
            ((je) this.b).f16351a.a(xun.f41520a, jLongValue);
        }
    }

    public cyu(u6t u6tVar, p6t p6tVar, b6t b6tVar) {
        u6tVar.getClass();
        p6tVar.getClass();
        b6tVar.getClass();
        this.f5196a = u6tVar;
        this.b = p6tVar;
        this.c = b6tVar;
    }

    public cyu(vby vbyVar, q7d0 q7d0Var) {
        q7d0Var.getClass();
        vbyVar.getClass();
        this.f5196a = q7d0Var;
        this.b = vbyVar;
        this.c = iun.f15405a;
    }

    public cyu(b4j b4jVar, je jeVar, AnalyticsEntryPoint analyticsEntryPoint) {
        analyticsEntryPoint.getClass();
        this.f5196a = b4jVar;
        this.b = jeVar;
        this.c = analyticsEntryPoint;
    }

    public cyu(nv20 nv20Var, knf0 knf0Var, btt0 btt0Var) {
        knf0Var.getClass();
        btt0Var.getClass();
        this.f5196a = nv20Var;
        this.b = knf0Var;
        this.c = btt0Var;
    }

    public cyu(m1e m1eVar, dn0 dn0Var, mne mneVar) {
        m1eVar.getClass();
        dn0Var.getClass();
        this.f5196a = m1eVar;
        this.b = dn0Var;
        this.c = mneVar;
    }

    public cyu(n4u n4uVar, pru pruVar, r9u r9uVar) {
        r9uVar.getClass();
        this.f5196a = n4uVar;
        this.b = pruVar;
        this.c = r9uVar;
    }

    public /* synthetic */ cyu(Object obj, Object obj2, Object obj3) {
        this.f5196a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public cyu(zn00 zn00Var, zb30 zb30Var, knf0 knf0Var) {
        zb30Var.getClass();
        knf0Var.getClass();
        this.f5196a = zn00Var;
        this.b = zb30Var;
        this.c = knf0Var;
    }

    public cyu(List list) {
        this.f5196a = list;
        this.b = new ncs0[list.size()];
        fp fpVar = new fp(new b0l0(this, (byte) 29));
        this.c = fpVar;
        fpVar.O(3);
    }
}
