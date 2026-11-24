package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.net.Uri;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;

/* JADX INFO: loaded from: classes3.dex */
public final class hsj implements hbj, lq80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f13586a;
    public Object b;

    public hsj(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 7:
                this.f13586a = gii0Var;
                this.b = new ntl(this, (byte) 21);
                break;
            case 8:
                this.f13586a = gii0Var;
                this.b = new yip(this, (byte) 7);
                break;
            default:
                this.f13586a = gii0Var;
                this.b = new ucj(this, (byte) 14);
                break;
        }
    }

    @Override // a.lq80
    public Object a(Uri uri, lbj lbjVar) {
        nbw nbwVar = (nbw) ((lq80) this.f13586a).a(uri, lbjVar);
        List list = (List) this.b;
        return (list == null || list.isEmpty()) ? nbwVar : (nbw) nbwVar.a(list);
    }

    public a8q0 b(List list) {
        vjn vjnVar = null;
        try {
            int size = list.size();
            int i = 0;
            vjn vjnVar2 = null;
            while (i < size) {
                try {
                    vjn vjnVar3 = (vjn) list.get(i);
                    try {
                        vjnVar3.a((z55) this.b);
                        i++;
                        vjnVar2 = vjnVar3;
                    } catch (Exception e) {
                        e = e;
                        vjnVar = vjnVar3;
                        StringBuilder sb = new StringBuilder();
                        int iB = ((tyc) ((z55) this.b).f).B();
                        o9q0 o9q0VarG = ((z55) this.b).g();
                        z55 z55Var = (z55) this.b;
                        sb.append("Error while applying EditCommand batch to buffer (length=" + iB + ", composition=" + o9q0VarG + ", selection=" + o9q0.h(s7n0.e(z55Var.b, z55Var.c)) + "):");
                        sb.append('\n');
                        CollectionsKt.a0(list, sb, Separators.RETURN, null, null, new yhn(vjnVar, this), 60);
                        throw new RuntimeException(sb.toString(), e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    vjnVar = vjnVar2;
                }
            }
            z55 z55Var2 = (z55) this.b;
            z55Var2.getClass();
            j83 j83Var = new j83(((tyc) z55Var2.f).toString());
            z55 z55Var3 = (z55) this.b;
            long jE = s7n0.e(z55Var3.b, z55Var3.c);
            o9q0 o9q0Var = o9q0.g(((a8q0) this.f13586a).b) ? null : new o9q0(jE);
            a8q0 a8q0Var = new a8q0(j83Var, o9q0Var != null ? o9q0Var.f24893a : s7n0.e(o9q0.e(jE), o9q0.f(jE)), ((z55) this.b).g());
            this.f13586a = a8q0Var;
            return a8q0Var;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public float c(sdq sdqVar, sdq sdqVar2) {
        int i = (int) sdqVar.f5402a;
        int i2 = (int) sdqVar.b;
        int i3 = (int) sdqVar2.f5402a;
        int i4 = (int) sdqVar2.b;
        float fW = w(i, i2, i3, i4);
        float fW2 = w((int) sdqVar2.f5402a, i4, (int) sdqVar.f5402a, i2);
        if (Float.isNaN(fW)) {
            return fW2 / 7.0f;
        }
        return Float.isNaN(fW2) ? fW / 7.0f : (fW + fW2) / 14.0f;
    }

    @Override // a.hbj
    public jbj d() {
        return new ntj((Context) this.f13586a, ((yqc) this.b).d());
    }

    public void e() {
        this.f13586a = null;
        this.b = null;
    }

    public c22 f(float f, float f2, int i, int i2) throws o660 {
        c22 c22VarB;
        c22 c22VarB2;
        int i3 = (int) (f2 * f);
        int iMax = Math.max(0, i - i3);
        r68 r68Var = (r68) this.f13586a;
        int iMin = Math.min(r68Var.f29923a - 1, i + i3) - iMax;
        float f3 = 3.0f * f;
        if (iMin < f3) {
            throw o660.a();
        }
        int iMax2 = Math.max(0, i2 - i3);
        int iMin2 = Math.min(r68Var.b - 1, i2 + i3) - iMax2;
        if (iMin2 < f3) {
            throw o660.a();
        }
        r68 r68Var2 = (r68) this.f13586a;
        d22 d22Var = new d22(r68Var2, iMax, iMax2, iMin, iMin2, f, (e3g0) this.b);
        int i4 = d22Var.e;
        int i5 = d22Var.c;
        int i6 = i4 + i5;
        int i7 = d22Var.f;
        int i8 = (i7 / 2) + d22Var.d;
        int[] iArr = new int[3];
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = ((i9 & 1) == 0 ? (i9 + 1) / 2 : -((i9 + 1) / 2)) + i8;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i11 = i5;
            while (i11 < i6 && !r68Var2.b(i11, i10)) {
                i11++;
            }
            int i12 = 0;
            while (i11 < i6) {
                if (!r68Var2.b(i11, i10)) {
                    if (i12 == 1) {
                        i12++;
                    }
                    iArr[i12] = iArr[i12] + 1;
                } else if (i12 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i12 != 2) {
                    i12++;
                    iArr[i12] = iArr[i12] + 1;
                } else {
                    if (d22Var.a(iArr) && (c22VarB2 = d22Var.b(i10, i11, iArr)) != null) {
                        return c22VarB2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i12 = 1;
                }
                i11++;
            }
            if (d22Var.a(iArr) && (c22VarB = d22Var.b(i10, i6, iArr)) != null) {
                return c22VarB;
            }
        }
        ArrayList arrayList = d22Var.b;
        if (arrayList.isEmpty()) {
            throw o660.a();
        }
        return (c22) arrayList.get(0);
    }

    public gos0 g() throws IOException {
        InputStream inputStreamOpen = ((us00) this.b).getAssets().open("translations/ApplicationTranslations.json");
        inputStreamOpen.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
        try {
            String strK = n8n0.k(bufferedReader);
            bufferedReader.close();
            vby vbyVar = (vby) this.f13586a;
            vbyVar.getClass();
            return (gos0) vbyVar.b(gos0.Companion.serializer(), strK);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                bkb.E(bufferedReader, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    public Serializable h(Set set, int i, long j, long j2, int i2, zje zjeVar) {
        ybt ybtVar;
        Iterator it;
        l2g0 l2g0Var;
        l2g0 l2g0Var2;
        List list;
        knf0 knf0Var = (knf0) this.b;
        if (zjeVar instanceof ybt) {
            ybtVar = (ybt) zjeVar;
            int i3 = ybtVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ybtVar.k = i3 - Integer.MIN_VALUE;
            } else {
                ybtVar = new ybt(this, zjeVar);
            }
        } else {
            ybtVar = new ybt(this, zjeVar);
        }
        Object objA = ybtVar.i;
        wne wneVar = wne.f39444a;
        int i4 = ybtVar.k;
        l2g0 l2g0Var3 = null;
        if (i4 == 0) {
            z1x.P(objA);
            nmo nmoVar = (nmo) this.f13586a;
            String strC = knf0Var.c();
            set.getClass();
            jo20 jo20Var = new jo20();
            jo20Var.put("ChampIds", CollectionsKt.b0(set, null, null, null, null, 63));
            jo20Var.put("country", String.valueOf(i));
            jo20Var.put("DateFrom", String.valueOf(j));
            jo20Var.put("DateTo", String.valueOf(j2));
            jo20Var.put("lng", strC);
            jo20Var.put("ref", String.valueOf(1));
            jo20Var.put("gr", String.valueOf(1357));
            if (i2 != -1) {
                jo20Var.put("CyberType", String.valueOf(i2));
            }
            jo20 jo20VarB = jo20Var.b();
            ybtVar.k = 1;
            objA = ((lct) ((wgn) nmoVar.f23782a).invoke()).a(jo20VarB, ybtVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List list2 = ((kct) ((dx5) objA).a()).b;
        if (list2 == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            fct fctVar = (fct) it2.next();
            fctVar.getClass();
            String str = fctVar.c;
            Long l = fctVar.f9327a;
            Long l2 = fctVar.p;
            if (str == null || fctVar.f == null || l2 == null) {
                it = it2;
                l2g0Var = l2g0Var3;
                l2g0Var2 = l2g0Var;
            } else {
                if (l == null) {
                    String str2 = l2g0Var3;
                    jf4.k(str2);
                    return str2;
                }
                long jLongValue = l.longValue();
                long jLongValue2 = l.longValue();
                Long l3 = fctVar.b;
                long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                Long l4 = fctVar.d;
                long jLongValue4 = l4 != null ? l4.longValue() : 0L;
                String str3 = fctVar.e;
                String str4 = str3 == null ? "" : str3;
                String str5 = fctVar.c;
                List list3 = fctVar.j;
                if (list3 == null) {
                    list3 = iun.f15405a;
                }
                List list4 = list3;
                List list5 = fctVar.k;
                if (list5 == null) {
                    list5 = iun.f15405a;
                }
                List list6 = list5;
                String str6 = fctVar.f;
                l2g0Var = l2g0Var3;
                String str7 = fctVar.g;
                String str8 = str7 == null ? "" : str7;
                List list7 = fctVar.h;
                if (list7 == null) {
                    list7 = iun.f15405a;
                }
                List list8 = list7;
                List list9 = fctVar.i;
                if (list9 == null) {
                    list9 = iun.f15405a;
                }
                List list10 = list9;
                String str9 = fctVar.l;
                Object string = str9 != null ? StringsKt.u0(str9).toString() : l2g0Var;
                String str10 = string == null ? "" : string;
                String str11 = fctVar.m;
                Object string2 = str11 != null ? StringsKt.u0(str11).toString() : l2g0Var;
                String str12 = string2 == null ? "" : string2;
                String str13 = fctVar.n;
                String str14 = str13 == null ? "" : str13;
                long jLongValue5 = l2.longValue();
                Map map = fctVar.t;
                if (map == null) {
                    map = lun.f20680a;
                    map.getClass();
                }
                Map map2 = map;
                String str15 = fctVar.u;
                String str16 = str15 == null ? "" : str15;
                Boolean bool = fctVar.v;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Integer num = fctVar.w;
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = fctVar.q;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                List list11 = fctVar.r;
                if (list11 != null) {
                    ArrayList arrayList2 = new ArrayList(r3d.q(list11, 10));
                    Iterator it3 = list11.iterator();
                    while (it3.hasNext()) {
                        ict ictVar = (ict) it3.next();
                        Iterator it4 = it2;
                        Iterator it5 = it3;
                        String str17 = ictVar.f14551a;
                        if (str17 == null) {
                            str17 = "";
                        }
                        String str18 = ictVar.b;
                        if (str18 == null) {
                            str18 = "";
                        }
                        arrayList2.add(new scp(str17, str18));
                        it2 = it4;
                        it3 = it5;
                    }
                    it = it2;
                    list = arrayList2;
                } else {
                    it = it2;
                    list = iun.f15405a;
                }
                l2g0Var2 = new l2g0(jLongValue, jLongValue2, jLongValue3, jLongValue4, str4, 0L, str5, 0L, "", list4, list6, str6, str8, list8, list10, str10, str12, str14, jLongValue5, map2, str16, zBooleanValue, iIntValue, iIntValue2, list);
            }
            if (l2g0Var2 != null) {
                arrayList.add(l2g0Var2);
            }
            it2 = it;
            l2g0Var3 = l2g0Var;
        }
        return arrayList;
    }

    public double i() {
        int i = uzt.f36551a[((ave) ((g45) this.f13586a).c).f1521a.ordinal()];
        lye lyeVar = (lye) ((khf0) this.b).b;
        return i == 1 ? lyeVar.f20858a.h : lyeVar.f20858a.g;
    }

    public ay3 j(int i, String str, String str2, double d, double d2, boolean z, boolean z2) {
        r78 r78Var = r78.p;
        str.getClass();
        str2.getClass();
        q4f q4fVar = ((ave) ((g45) this.f13586a).c).f1521a;
        if (StringsKt.W(str) && q4fVar != q4f.m) {
            return t78.p;
        }
        if (q4fVar == q4f.m) {
            double dO = wvb.O(str);
            double d3 = (((ni9) this.b).a(i).t ? 2.0d : 1.0d) * d2;
            boolean z3 = d2 == 0.0d || z2;
            pn40 pn40Var = pn40.f27267a;
            if (dO < pn40.q(d) && dO > 0.0d) {
                return new w78(str2, pn40.q(d));
            }
            if (z3 || z || dO <= pn40.q(d2)) {
                return z3 ? new x78(str2, pn40.q(d)) : new s78(pn40.q(d), pn40.q(d3), str2);
            }
            return new v78(str2, pn40.q(d3));
        }
        if (kotlin.text.b.i(str) == null) {
            return u78.p;
        }
        if (q4fVar == q4f.h) {
            double dO2 = wvb.O(str);
            if (i == 0) {
                pn40 pn40Var2 = pn40.f27267a;
                if (dO2 < pn40.q(d)) {
                    return new w78(str2, pn40.q(d));
                }
            }
            if (!z2 || i != 0) {
                pn40 pn40Var3 = pn40.f27267a;
                if (dO2 > pn40.q(d2) && pn40.q(d2) != 0.0d) {
                    return new v78(str2, d2);
                }
            }
        }
        return r78Var;
    }

    public vsg0 k(long j, List list, List list2, String str, int i, boolean z) {
        list.getClass();
        list2.getClass();
        str.getClass();
        n31 n31Var = (n31) this.b;
        boolean zA = ((j1q0) this.f13586a).f15748a.a();
        n31Var.getClass();
        return new vsg0(new l31(z, n31Var, i, list, j, list2, zA, str, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable l(String str, String str2, zje zjeVar) {
        mgu mguVar;
        if (zjeVar instanceof mgu) {
            mguVar = (mgu) zjeVar;
            int i = mguVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mguVar.k = i - Integer.MIN_VALUE;
            } else {
                mguVar = new mgu(this, zjeVar);
            }
        } else {
            mguVar = new mgu(this, zjeVar);
        }
        Object objF = mguVar.i;
        wne wneVar = wne.f39444a;
        int i2 = mguVar.k;
        if (i2 == 0) {
            z1x.P(objF);
            y3v y3vVar = (y3v) this.f13586a;
            int iA = ((rpt) this.b).a();
            mguVar.k = 1;
            objF = y3vVar.f(iA, mguVar, str, str2);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objF);
        }
        n3w n3wVar = (n3w) objF;
        ivo0 ivo0Var = n3wVar.z1.f;
        ivo0 ivo0Var2 = ivo0.c;
        if (Intrinsics.d(ivo0Var, ivo0Var2)) {
            return n3wVar;
        }
        hxu hxuVar = n3wVar.z1;
        return n3w.d(n3wVar, null, 0.0d, null, null, 0L, null, 0.0d, hxuVar.f.b, null, null, null, false, null, hxu.a(hxuVar, ivo0Var2, 0.0d, 95), null, -32769, -1048577);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:42:0x0098  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:46:0x009e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Enum m(long j, long j2, zje zjeVar) {
        d8u d8uVar;
        int i;
        xco xcoVar;
        if (zjeVar instanceof d8u) {
            d8uVar = (d8u) zjeVar;
            int i2 = d8uVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d8uVar.n = i2 - Integer.MIN_VALUE;
            } else {
                d8uVar = new d8u(this, zjeVar);
            }
        } else {
            d8uVar = new d8u(this, zjeVar);
        }
        Object objB = d8uVar.l;
        wne wneVar = wne.f39444a;
        int i3 = d8uVar.n;
        Object obj = null;
        if (i3 == 0) {
            z1x.P(objB);
            zfo zfoVar = (zfo) this.f13586a;
            d8uVar.i = j;
            d8uVar.j = j2;
            d8uVar.n = 1;
            objB = zfoVar.b(d8uVar);
            if (objB != wneVar) {
            }
            return wneVar;
        }
        if (i3 == 1) {
            j2 = d8uVar.j;
            j = d8uVar.i;
            z1x.P(objB);
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = d8uVar.k;
            z1x.P(objB);
        }
        xcoVar = (xco) objB;
        if (xcoVar != null ? xcoVar.e : false) {
            return fho.b;
        }
        if (i == 2) {
            return fho.c;
        }
        return i == 3 ? fho.d : fho.f9552a;
        for (Object obj2 : (Iterable) objB) {
            if (((ueo) obj2).f35538a == j) {
                obj = obj2;
                break;
            }
        }
        ueo ueoVar = (ueo) obj;
        int i4 = ueoVar != null ? ueoVar.d : 0;
        edo edoVar = (edo) this.b;
        d8uVar.i = j;
        d8uVar.j = j2;
        d8uVar.k = i4;
        d8uVar.n = 2;
        Object objA = edoVar.a(j2, d8uVar);
        if (objA != wneVar) {
            int i5 = i4;
            objB = objA;
            i = i5;
            xcoVar = (xco) objB;
            if (xcoVar != null ? xcoVar.e : false) {
                return fho.b;
            }
            if (i == 2) {
                return fho.c;
            }
            if (i == 3) {
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(int i, zje zjeVar) {
        w2u w2uVar;
        cyu cyuVar;
        int i2;
        if (zjeVar instanceof w2u) {
            w2uVar = (w2u) zjeVar;
            int i3 = w2uVar.n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w2uVar.n = i3 - Integer.MIN_VALUE;
            } else {
                w2uVar = new w2u(this, zjeVar);
            }
        } else {
            w2uVar = new w2u(this, zjeVar);
        }
        Object objD = w2uVar.l;
        Object obj = wne.f39444a;
        int i4 = w2uVar.n;
        if (i4 == 0) {
            z1x.P(objD);
            cyuVar = (cyu) this.f13586a;
            sjl0 sjl0Var = (sjl0) this.b;
            w2uVar.k = cyuVar;
            w2uVar.i = i;
            w2uVar.j = i;
            w2uVar.n = 1;
            objD = sjl0Var.d(w2uVar);
            if (objD != obj) {
                i2 = i;
            }
        }
        if (i4 != 1) {
            if (i4 == 2) {
                z1x.P(objD);
                return objD;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = w2uVar.j;
        i2 = w2uVar.i;
        cyuVar = w2uVar.k;
        z1x.P(objD);
        w2uVar.k = null;
        w2uVar.i = i2;
        w2uVar.n = 2;
        Object objL = cyuVar.l(i, w2uVar, (List) objD);
        return objL == obj ? obj : objL;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object o(long j, long j2, zje zjeVar) {
        prt prtVar;
        long j3;
        long j4;
        ig5 ig5Var;
        double d;
        if (zjeVar instanceof prt) {
            prtVar = (prt) zjeVar;
            int i = prtVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                prtVar.o = i - Integer.MIN_VALUE;
            } else {
                prtVar = new prt(this, zjeVar);
            }
        } else {
            prtVar = new prt(this, zjeVar);
        }
        prt prtVar2 = prtVar;
        Object objP = prtVar2.m;
        wne wneVar = wne.f39444a;
        int i2 = prtVar2.o;
        if (i2 == 0) {
            z1x.P(objP);
            qrt qrtVar = (qrt) this.f13586a;
            prtVar2.i = j;
            prtVar2.j = j2;
            prtVar2.o = 1;
            objP = qrtVar.f29227a.p(j, j2, prtVar2);
            if (objP != wneVar) {
                j3 = j;
                j4 = j2;
            }
            return wneVar;
        }
        if (i2 == 1) {
            j4 = prtVar2.j;
            j3 = prtVar2.i;
            z1x.P(objP);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d = prtVar2.l;
            ig5Var = prtVar2.k;
            z1x.P(objP);
        }
        return new ig5(d, (String) objP, ig5Var.c);
        ig5 ig5Var2 = (ig5) objP;
        double d2 = ig5Var2.f14719a;
        q0u q0uVar = (q0u) this.b;
        String str = ig5Var2.b;
        prtVar2.k = ig5Var2;
        prtVar2.i = j3;
        prtVar2.j = j4;
        prtVar2.l = d2;
        prtVar2.o = 2;
        Object objA = q0uVar.a(str, prtVar2);
        if (objA != wneVar) {
            ig5Var = ig5Var2;
            objP = objA;
            d = d2;
            return new ig5(d, (String) objP, ig5Var.c);
        }
        return wneVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:12|13|98|22|92|23|24|96|25|26|27|28|90|29|(1:32)|77) */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0110  */
    /* JADX WARN: Code duplicated, block: B:67:0x0112  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0162  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        r16 = r4;
        r17 = r11;
        r4 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d7, code lost:
    
        r8 = r1;
        r11 = r2;
        r2 = r4;
        r1 = r16;
        r4 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f3, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0102, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0104, code lost:
    
        r12 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0109, code lost:
    
        if (r12.f != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0110, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0112, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0118, code lost:
    
        if (a.hic.C(r0) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x011b, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011d, code lost:
    
        if (r2 > 3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0122, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r2, "error (", "): ", r0));
        r1.k = r11;
        r1.i = r9;
        r1.j = r8;
        r1.l = r4;
        r1.m = r2;
        r1.p = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0141, code lost:
    
        if (a.qcc.O(3000, r1) == r3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0144, code lost:
    
        r1 = a.j0g0.b;
        r0 = new a.g0g0(r0);
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0141 -> B:13:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(long r20, a.zje r22, boolean r23) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hsj.p(long, a.zje, boolean):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:13|14|67|23|(1:26)|62) */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        r6 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r2;
        r2 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a6, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        r7 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
    
        if (r7.f != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c5, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cb, code lost:
    
        if (a.hic.C(r0) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ce, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d0, code lost:
    
        if (r12 > 3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d5, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r12, "error (", "): ", r0));
        r14.j = r6;
        r14.i = r2;
        r14.k = r13;
        r14.l = r12;
        r14.o = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f2, code lost:
    
        if (a.qcc.O(3000, r14) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f5, code lost:
    
        r12 = a.j0g0.b;
        r0 = new a.g0g0(r0);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x00f2 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(boolean r13, a.zje r14) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hsj.q(boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(z7b[] z7bVarArr, zje zjeVar) {
        twt twtVar;
        if (zjeVar instanceof twt) {
            twtVar = (twt) zjeVar;
            int i = twtVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                twtVar.l = i - Integer.MIN_VALUE;
            } else {
                twtVar = new twt(this, zjeVar);
            }
        } else {
            twtVar = new twt(this, zjeVar);
        }
        Object objE = twtVar.j;
        Object obj = wne.f39444a;
        int i2 = twtVar.l;
        if (i2 == 0) {
            z1x.P(objE);
            lhf0 lhf0Var = (lhf0) this.f13586a;
            boolean zA = ((j1q0) this.b).f15748a.a();
            twtVar.i = z7bVarArr;
            twtVar.l = 1;
            objE = lhf0Var.e(zA, twtVar);
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z7bVarArr = twtVar.i;
            z1x.P(objE);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) objE) {
            vh0 vh0Var = (vh0) obj2;
            int length = z7bVarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    arrayList.add(obj2);
                    break;
                }
                if (z7bVarArr[i3].f43909a == vh0Var.f) {
                    break;
                }
                i3++;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((vh0) obj3).d.length() == 0) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (((vh0) obj4).d.length() > 0) {
                arrayList3.add(obj4);
            }
        }
        return new a3b(arrayList2, arrayList3);
    }

    public BigDecimal s() {
        long jLongValue;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(((gkr0) ((w5z) this.f13586a).c).a().f2869a));
        Map mapA = ((sd80) ((w5z) ((pyu) this.b).f27815a).d).a();
        if (mapA.isEmpty()) {
            jLongValue = 0;
        } else {
            ArrayList arrayList = new ArrayList(mapA.size());
            Iterator it = mapA.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((Set) ((Map.Entry) it.next()).getValue()).size()));
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                v4i0.p("Empty collection can't be reduced.");
                return null;
            }
            Object next = it2.next();
            while (it2.hasNext()) {
                next = Long.valueOf(((Number) next).longValue() * ((Number) it2.next()).longValue());
            }
            jLongValue = ((Number) next).longValue();
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(jLongValue);
        bigDecimalValueOf.getClass();
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimalValueOf);
        bigDecimalMultiply.getClass();
        return bigDecimalMultiply;
    }

    public boolean t() {
        cit0 cit0VarG = ((rpt) this.b).g();
        boolean z = cit0VarG.H;
        boolean z2 = cit0VarG.I;
        szf szfVar = new szf(z, z2);
        h0f h0fVar = (h0f) ((lrc) this.f13586a).b;
        szf szfVar2 = h0fVar.b;
        h0fVar.getClass();
        h0fVar.b = szfVar;
        if (szfVar2 == null) {
            return false;
        }
        return (szfVar2.f33068a == z && szfVar2.b == z2) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(int i, zje zjeVar, String str) {
        ryk rykVar;
        if (zjeVar instanceof ryk) {
            rykVar = (ryk) zjeVar;
            int i2 = rykVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rykVar.k = i2 - Integer.MIN_VALUE;
            } else {
                rykVar = new ryk(this, zjeVar);
            }
        } else {
            rykVar = new ryk(this, zjeVar);
        }
        Object objB = rykVar.i;
        wne wneVar = wne.f39444a;
        int i3 = rykVar.k;
        if (i3 == 0) {
            z1x.P(objB);
            lyk lykVar = (lyk) ((ucj) this.b).invoke();
            rykVar.k = 1;
            objB = lykVar.b(i, str, rykVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return ((dx5) objB).a();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x008a A[RETURN] */
    public float v(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 1;
        boolean z = Math.abs(i4 - i2) > Math.abs(i3 - i);
        if (z) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int iAbs = Math.abs(i7 - i5);
        int iAbs2 = Math.abs(i8 - i6);
        int i11 = 2;
        int i12 = (-iAbs) / 2;
        int i13 = i5 < i7 ? 1 : -1;
        int i14 = i6 < i8 ? 1 : -1;
        int i15 = i7 + i13;
        int i16 = i5;
        int i17 = i6;
        int i18 = 0;
        while (i16 != i15) {
            boolean z2 = z;
            if ((i18 == i10 ? i10 : 0) == ((r68) this.f13586a).b(z ? i17 : i16, z ? i16 : i17)) {
                if (i18 == 2) {
                    return q7x.w(i16, i17, i5, i6);
                }
                i18++;
            }
            i12 += iAbs2;
            if (i12 > 0) {
                if (i17 == i8) {
                    i9 = 2;
                    if (i18 == i9) {
                        return q7x.w(i15, i8, i5, i6);
                    }
                    return Float.NaN;
                }
                i17 += i14;
                i12 -= iAbs;
            }
            i16 += i13;
            iAbs = iAbs;
            z = z2;
            i10 = 1;
            i11 = 2;
        }
        i9 = i11;
        if (i18 == i9) {
            return q7x.w(i15, i8, i5, i6);
        }
        return Float.NaN;
    }

    public float w(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        r68 r68Var = (r68) this.f13586a;
        float fV = v(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else {
            int i7 = r68Var.f29923a;
            if (i5 >= i7) {
                float f3 = ((i7 - 1) - i) / (i5 - i);
                int i8 = i7 - 1;
                f = f3;
                i5 = i8;
            } else {
                f = 1.0f;
            }
        }
        float f4 = i2;
        int i9 = (int) (f4 - ((i4 - i2) * f));
        if (i9 < 0) {
            f2 = f4 / (i2 - i9);
        } else {
            int i10 = r68Var.b;
            if (i9 >= i10) {
                f2 = ((i10 - 1) - i2) / (i9 - i2);
                i6 = i10 - 1;
            } else {
                i6 = i9;
                f2 = 1.0f;
            }
        }
        return (v(i, i2, (int) (((i5 - i) * f2) + i), i6) + fV) - 1.0f;
    }

    public hsj(vby vbyVar, us00 us00Var) {
        vbyVar.getClass();
        this.f13586a = vbyVar;
        this.b = us00Var;
    }

    public hsj(mii0 mii0Var, gst0 gst0Var) {
        gst0Var.getClass();
        this.f13586a = mii0Var;
        this.b = gst0Var;
    }

    public hsj(lhf0 lhf0Var, j1q0 j1q0Var) {
        j1q0Var.getClass();
        this.f13586a = lhf0Var;
        this.b = j1q0Var;
    }

    public /* synthetic */ hsj(Object obj, Object obj2) {
        this.f13586a = obj;
        this.b = obj2;
    }

    public hsj(j1q0 j1q0Var, n31 n31Var) {
        j1q0Var.getClass();
        n31Var.getClass();
        this.f13586a = j1q0Var;
        this.b = n31Var;
    }

    public hsj(Context context) {
        yqc yqcVar = new yqc((byte) 25);
        this.f13586a = context.getApplicationContext();
        this.b = yqcVar;
    }

    public hsj(DsLottieEmpty dsLottieEmpty, c4m0 c4m0Var, jkm jkmVar) {
        jkmVar.getClass();
        this.f13586a = c4m0Var;
        this.b = jkmVar;
        bby countDownTimerJob = dsLottieEmpty.getCountDownTimerJob();
        if (countDownTimerJob != null) {
            e3c.n(countDownTimerJob);
        }
        c4m0Var.invokeOnCompletion(new edl(dsLottieEmpty, (byte) 17));
    }
}
