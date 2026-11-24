package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public class zri implements qe60, pp9, n1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44854a;
    public final Object b;
    public final Object c;

    public zri(gii0 gii0Var, byte b) {
        this.f44854a = b;
        switch (b) {
            case 11:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new ntl(this, (byte) 24);
                break;
            case 12:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new yip(this, (byte) 3);
                break;
            case 13:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new yip(this, (byte) 6);
                break;
            case 14:
            default:
                this.b = gii0Var;
                this.c = new ucj(this, (byte) 27);
                break;
            case 15:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new yip(this, (byte) 13);
                break;
        }
    }

    public static ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            fk60 fk60Var = (fk60) obj;
            fk60.b.getClass();
            fk60Var.getClass();
            if (!fk60.c.contains(fk60Var)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public ku5 b(int i) {
        ku5 ku5Var;
        ku5 ku5Var2;
        ku5[] ku5VarArr = (ku5[]) this.c;
        ku5 ku5Var3 = ku5VarArr[d(i)];
        if (ku5Var3 != null) {
            return ku5Var3;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int iD = d(i) - i2;
            if (iD >= 0 && (ku5Var2 = ku5VarArr[iD]) != null) {
                return ku5Var2;
            }
            int iD2 = d(i) + i2;
            if (iD2 < ku5VarArr.length && (ku5Var = ku5VarArr[iD2]) != null) {
                return ku5Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(String str, zje zjeVar) {
        muo muoVar;
        pxs0 pxs0Var;
        if (zjeVar instanceof muo) {
            muoVar = (muo) zjeVar;
            int i = muoVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                muoVar.l = i - Integer.MIN_VALUE;
            } else {
                muoVar = new muo(this, zjeVar);
            }
        } else {
            muoVar = new muo(this, zjeVar);
        }
        Object obj = muoVar.j;
        wne wneVar = wne.f39444a;
        int i2 = muoVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            pxs0 pxs0Var2 = (pxs0) this.c;
            muoVar.i = pxs0Var2;
            muoVar.l = 1;
            Object objD = ((z8w0) this.b).d(muoVar, str, true);
            if (objD != wneVar) {
                obj = objD;
                pxs0Var = pxs0Var2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pxs0Var = muoVar.i;
        z1x.P(obj);
        muoVar.i = null;
        muoVar.l = 2;
        Object objC = pxs0Var.c((String) obj, muoVar);
        return objC == wneVar ? wneVar : objC;
    }

    public int d(int i) {
        return i - ((sq8) this.b).c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(int i, int i2, zje zjeVar) {
        ktt kttVar;
        i1k0 i1k0Var;
        if (zjeVar instanceof ktt) {
            kttVar = (ktt) zjeVar;
            int i3 = kttVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kttVar.n = i3 - Integer.MIN_VALUE;
            } else {
                kttVar = new ktt(this, zjeVar);
            }
        } else {
            kttVar = new ktt(this, zjeVar);
        }
        Object obj = kttVar.l;
        wne wneVar = wne.f39444a;
        int i4 = kttVar.n;
        if (i4 == 0) {
            z1x.P(obj);
            i1k0 i1k0Var2 = (i1k0) this.c;
            nw20 nw20Var = (nw20) this.b;
            kttVar.k = i1k0Var2;
            kttVar.i = i;
            kttVar.j = i2;
            kttVar.n = 1;
            Serializable serializableF = nw20Var.f(i, i2, kttVar);
            if (serializableF != wneVar) {
                obj = serializableF;
                i1k0Var = i1k0Var2;
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = kttVar.j;
        i = kttVar.i;
        i1k0Var = kttVar.k;
        z1x.P(obj);
        kttVar.k = null;
        kttVar.i = i;
        kttVar.j = i2;
        kttVar.n = 2;
        Object objA = i1k0Var.a((List) obj, kttVar);
        return objA == wneVar ? wneVar : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object f(int i, long j, zje zjeVar) {
        u2u u2uVar;
        cyu cyuVar;
        int i2;
        long j2;
        if (zjeVar instanceof u2u) {
            u2uVar = (u2u) zjeVar;
            int i3 = u2uVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u2uVar.n = i3 - Integer.MIN_VALUE;
            } else {
                u2uVar = new u2u(this, zjeVar);
            }
        } else {
            u2uVar = new u2u(this, zjeVar);
        }
        Object obj = u2uVar.l;
        wne wneVar = wne.f39444a;
        int i4 = u2uVar.n;
        yje yjeVar = null;
        if (i4 == 0) {
            z1x.P(obj);
            cyu cyuVar2 = (cyu) this.b;
            sjl0 sjl0Var = (sjl0) this.c;
            u2uVar.k = cyuVar2;
            u2uVar.i = i;
            u2uVar.j = j;
            u2uVar.n = 1;
            Serializable serializableD = sjl0Var.d(u2uVar);
            if (serializableD == wneVar) {
                return wneVar;
            }
            cyuVar = cyuVar2;
            obj = serializableD;
            i2 = i;
            j2 = j;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = u2uVar.j;
            i2 = u2uVar.i;
            cyu cyuVar3 = u2uVar.k;
            z1x.P(obj);
            cyuVar = cyuVar3;
        }
        List list = (List) obj;
        cyuVar.getClass();
        list.getClass();
        hie0 hie0Var = new hie0();
        hie0Var.f13108a = true;
        lnf0 lnf0VarD = ((knf0) cyuVar.f5196a).d();
        jo20 jo20Var = new jo20();
        qbt.c(i2, jo20Var);
        qbt.h(jo20Var);
        qbt.j(lnf0VarD.f20342a, jo20Var);
        qbt.l(jo20Var);
        qbt.n(j2, jo20Var);
        qbt.p(jo20Var);
        return new rzq0(gfx.R((or30) ((n660) cyuVar.c).c, kpb.v(sip.c), null, new szq0(cyuVar, jo20Var.b(), yjeVar, (byte) 0), 252), cyuVar, hie0Var, list, (byte) 0);
    }

    @Override // a.pp9
    public void g(to9 to9Var, jtf0 jtf0Var) {
        ((ktj) this.c).f18868a.execute(new b1(this, (pp9) this.b, jtf0Var, (byte) 10));
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        ((lya) this.b).invoke((String) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        if (r1.k(r2) == r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e1, code lost:
    
        if (r8.b(r2, r15, r11, a.hrs.f13547a, r13) == r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00e3, code lost:
    
        return r3;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00e1 -> B:24:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(int r57, a.zje r58) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zri.i(int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(int i, zje zjeVar, String str, boolean z) {
        pot potVar;
        zri zriVar;
        String str2;
        zri zriVar2;
        if (zjeVar instanceof pot) {
            potVar = (pot) zjeVar;
            int i2 = potVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                potVar.o = i2 - Integer.MIN_VALUE;
            } else {
                potVar = new pot(this, zjeVar);
            }
        } else {
            potVar = new pot(this, zjeVar);
        }
        Object objO = potVar.m;
        wne wneVar = wne.f39444a;
        int i3 = potVar.o;
        if (i3 == 0) {
            z1x.P(objO);
            w5z w5zVar = (w5z) this.b;
            potVar.i = str;
            potVar.j = this;
            potVar.k = this;
            potVar.l = z;
            potVar.o = 1;
            objO = w5zVar.o(i, potVar, z);
            if (objO == wneVar) {
                return wneVar;
            }
            zriVar = this;
            str2 = str;
            zriVar2 = zriVar;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = potVar.l;
            zriVar = potVar.k;
            zriVar2 = potVar.j;
            str2 = potVar.i;
            z1x.P(objO);
        }
        zriVar.getClass();
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        ArrayList arrayListU = ohs0.u(lowerCase);
        Iterator it = ((List) objO).iterator();
        while (true) {
            byte b = 0;
            if (!it.hasNext()) {
                return new oot(new a1g(((t52) ((esg0) zriVar2.c).b).f33348a, arrayListU, (byte) 27), this, z, b);
            }
            Object next = it.next();
            if (vqd.A(((jkp) next).b, Locale.ROOT, lowerCase, false)) {
                arrayListU.add(next);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f6, code lost:
    
        if (r0 == r3) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(long r21, a.zje r23) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zri.l(long, a.zje):java.lang.Object");
    }

    @Override // a.pp9
    public void m(to9 to9Var, Throwable th) {
        ((ktj) this.c).f18868a.execute(new b1(this, (pp9) this.b, th));
    }

    @Override // a.qe60
    public int n(int i) {
        String str = (String) this.b;
        String strSubstring = (String) this.c;
        if (i >= strSubstring.length()) {
            return str.length();
        }
        int length = strSubstring.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (strSubstring.charAt(i2) == '.') {
                strSubstring = strSubstring.substring(0, i2);
                break;
            }
        }
        if (i <= strSubstring.length()) {
            return i;
        }
        int i3 = i - 1;
        int length2 = str.length();
        return i3 > length2 ? length2 : i3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object o(jza jzaVar, String str, zje zjeVar) {
        lwt lwtVar;
        double d;
        double d2;
        k9c k9cVar = (k9c) this.c;
        if (zjeVar instanceof lwt) {
            lwtVar = (lwt) zjeVar;
            int i = lwtVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                lwtVar.l = i - Integer.MIN_VALUE;
            } else {
                lwtVar = new lwt(this, zjeVar);
            }
        } else {
            lwtVar = new lwt(this, zjeVar);
        }
        Object objA = lwtVar.j;
        Object obj = wne.f39444a;
        int i2 = lwtVar.l;
        if (i2 == 0) {
            z1x.P(objA);
            d = k9cVar.a() ? jzaVar.i : jzaVar.j;
            if (k9cVar.a()) {
                nou nouVar = (nou) this.b;
                lwtVar.i = d;
                lwtVar.l = 1;
                objA = nouVar.a(tl5.c, lwtVar);
                if (objA == obj) {
                    return obj;
                }
                d2 = d;
            }
            pn40 pn40Var = pn40.f27267a;
            return wp20.b(new Pair("$CASH_BACK", pn40.d(d, str, p3u0.j)));
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        d2 = lwtVar.i;
        z1x.P(objA);
        str = ((ql5) objA).f;
        d = d2;
        pn40 pn40Var2 = pn40.f27267a;
        return wp20.b(new Pair("$CASH_BACK", pn40.d(d, str, p3u0.j)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public List p(mi0 mi0Var) {
        Object g0g0Var;
        ?? g0g0Var2;
        Object g0g0Var3;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = String.valueOf(((x1u) this.c).a());
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        String str = (String) g0g0Var;
        rpt rptVar = (rpt) this.b;
        if (str == null) {
            str = "";
        }
        mii0 mii0Var = (mii0) rptVar.f30901a;
        knf0 knf0Var = (knf0) mii0Var.d;
        try {
            Iterable iterable = ((z41) mii0Var.b).c(str, mi0Var, knf0Var.b(), knf0Var.c()).f8937a;
            if (iterable == null) {
                iterable = iun.f15405a;
            }
            HashSet hashSet = new HashSet();
            ArrayList<jj0> arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (hashSet.add(((jj0) obj).f16598a)) {
                    arrayList.add(obj);
                }
            }
            g0g0Var2 = new ArrayList();
            for (jj0 jj0Var : arrayList) {
                try {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var3 = j120.i0(jj0Var, mi0Var);
                } catch (Throwable th2) {
                    e0g0 e0g0Var4 = j0g0.b;
                    g0g0Var3 = new g0g0(th2);
                }
                if (g0g0Var3 instanceof g0g0) {
                    g0g0Var3 = null;
                }
                gj0 gj0Var = (gj0) g0g0Var3;
                if (gj0Var != null) {
                    g0g0Var2.add(gj0Var);
                }
            }
        } catch (Throwable th3) {
            e0g0 e0g0Var5 = j0g0.b;
            g0g0Var2 = new g0g0(th3);
        }
        e0g0 e0g0Var6 = j0g0.b;
        List list = (List) (g0g0Var2 instanceof g0g0 ? 0 : g0g0Var2);
        return list == null ? iun.f15405a : list;
    }

    @Override // a.qe60
    public int s(int i) {
        String str = (String) this.b;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isDigit(cCharAt) || cCharAt == '.') {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        int length2 = string.length();
        for (int i3 = 0; i3 < length2; i3++) {
            if (string.charAt(i3) == '.') {
                string = string.substring(0, i3);
                break;
            }
        }
        if (i <= ttm0.L(13, string).length()) {
            return i;
        }
        int i4 = i + 1;
        int length3 = ((String) this.c).length();
        return i4 > length3 ? length3 : i4;
    }

    public String toString() {
        switch (this.f44854a) {
            case 4:
                Formatter formatter = new Formatter();
                try {
                    int i = 0;
                    for (ku5 ku5Var : (ku5[]) this.c) {
                        if (ku5Var == null) {
                            formatter.format("%3d:    |   %n", Integer.valueOf(i));
                            i++;
                        } else {
                            formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(ku5Var.f), Integer.valueOf(ku5Var.e));
                            i++;
                        }
                    }
                    String string = formatter.toString();
                    formatter.close();
                    return string;
                } catch (Throwable th) {
                    try {
                        formatter.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            default:
                return super.toString();
        }
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
    }

    public zri(a1d a1dVar, gmt gmtVar) {
        this.f44854a = (byte) 8;
        gmtVar.getClass();
        this.b = a1dVar;
        this.c = gmtVar;
    }

    public zri(uii uiiVar, j1q0 j1q0Var) {
        this.f44854a = (byte) 26;
        j1q0Var.getClass();
        this.b = uiiVar;
        this.c = j1q0Var;
    }

    public zri(wyu wyuVar, ntu ntuVar) {
        this.f44854a = (byte) 21;
        wyuVar.getClass();
        this.b = wyuVar;
        this.c = ntuVar;
    }

    public zri(azj0 azj0Var) {
        this.f44854a = (byte) 6;
        azj0Var.getClass();
        this.b = azj0Var;
        this.c = new ucj(this, (byte) 13);
    }

    public zri(zfo zfoVar, mne mneVar) {
        this.f44854a = (byte) 28;
        zfoVar.getClass();
        this.b = zfoVar;
        this.c = mneVar;
    }

    public zri(cyu cyuVar, sjl0 sjl0Var) {
        this.f44854a = (byte) 25;
        sjl0Var.getClass();
        this.b = cyuVar;
        this.c = sjl0Var;
    }

    public zri(us3 us3Var, us00 us00Var) {
        this.f44854a = (byte) 14;
        us3Var.getClass();
        this.b = us3Var;
        this.c = us00Var;
    }

    public zri(pmi pmiVar, uzc uzcVar) {
        this.f44854a = (byte) 29;
        uzcVar.getClass();
        this.b = pmiVar;
        this.c = uzcVar;
    }

    public zri(us00 us00Var, vwb0 vwb0Var) {
        this.f44854a = (byte) 9;
        vwb0Var.getClass();
        this.b = us00Var;
        this.c = vwb0Var;
    }

    public /* synthetic */ zri(Object obj, Object obj2, byte b) {
        this.f44854a = b;
        this.b = obj;
        this.c = obj2;
    }

    public zri() {
        this.f44854a = (byte) 5;
        this.b = new i6u0(true);
        this.c = new i6u0(true);
    }

    public zri(sq8 sq8Var) {
        this.f44854a = (byte) 4;
        this.b = new sq8(sq8Var);
        this.c = new ku5[(sq8Var.d - sq8Var.c) + 1];
    }

    public zri(i1w0 i1w0Var) {
        this.f44854a = (byte) 0;
        this.b = i1w0Var;
        this.c = new fri(this, (byte) 12);
    }

    public zri(String str, String str2) {
        this.f44854a = (byte) 1;
        str.getClass();
        this.b = str;
        this.c = str2;
    }

    public zri(ktj ktjVar, pp9 pp9Var) {
        this.f44854a = (byte) 2;
        this.c = ktjVar;
        this.b = pp9Var;
    }
}
