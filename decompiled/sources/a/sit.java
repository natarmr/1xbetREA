package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.coupon.impl.generate_coupon.presentation.model.compose.GenerateCouponTypeUiModel;

/* JADX INFO: loaded from: classes.dex */
public final class sit extends i3t0 {
    public static final /* synthetic */ int G = 0;
    public final ctf0 A;
    public final art B;
    public final x20 C;
    public final m1e D;
    public bby E;
    public final ax5 F;
    public final vzg0 o;
    public final List p;
    public final mne q;
    public final uii r;
    public final gbi s;
    public final iqi t;
    public final k7u u;
    public final i1w0 v;
    public final duj w;
    public final cu x;
    public final qu y;
    public final ouu z;

    /* JADX WARN: Illegal instructions before constructor call */
    public sit(vzg0 vzg0Var, List list, mne mneVar, uii uiiVar, gbi gbiVar, iqi iqiVar, k7u k7uVar, i1w0 i1w0Var, duj dujVar, cu cuVar, qu quVar, ouu ouuVar, ctf0 ctf0Var, art artVar, x20 x20Var, m1e m1eVar, ocl oclVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        g090 g090VarP = cvm0.p(vs10Var, rwjVar);
        super(new lit(vzg0Var, ctf0Var), g090VarP, new f8m((Object) ctf0Var, (Object) list, (Object) oclVar, (byte) 28), (yzn0) null);
        this.o = vzg0Var;
        this.p = list;
        this.q = mneVar;
        this.r = uiiVar;
        this.s = gbiVar;
        this.t = iqiVar;
        this.u = k7uVar;
        this.v = i1w0Var;
        this.w = dujVar;
        this.x = cuVar;
        this.y = quVar;
        this.z = ouuVar;
        this.A = ctf0Var;
        this.B = artVar;
        this.C = x20Var;
        this.D = m1eVar;
        this.F = new ax5(this);
        sac.T(new fnq(m1eVar.a(), new pit(this, null, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), rwjVar), qit.h);
        O();
    }

    public static String M(String str) {
        String string;
        Regex regex = new Regex("[^0-9.]");
        if (str.length() == 0 || regex.g(str)) {
            return str;
        }
        List listI0 = StringsKt.i0(str, new char[]{'.'}, 6);
        String str2 = (String) CollectionsKt.W(0, listI0);
        String string2 = null;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            int length = str2.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str2.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            string = sb.toString();
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        String str3 = (String) CollectionsKt.W(1, listI0);
        if (str3 != null) {
            StringBuilder sb2 = new StringBuilder();
            int length2 = str3.length();
            for (int i2 = 0; i2 < length2; i2++) {
                char cCharAt2 = str3.charAt(i2);
                if (Character.isDigit(cCharAt2)) {
                    sb2.append(cCharAt2);
                }
            }
            string2 = sb2.toString();
        }
        if (string2 == null) {
            string2 = "";
        }
        String strL = string.length() != 0 ? StringsKt.k0(string, '0') ? "0" : ttm0.L(13, string) : "";
        return StringsKt.P(str, '.') ? kng0.l(strL, Separators.DOT, ttm0.L(2, string2)) : strL;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a7 A[LOOP:0: B:24:0x00a1->B:26:0x00a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x00f6 A[LOOP:1: B:28:0x00f0->B:30:0x00f6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x011b  */
    /* JADX WARN: Code duplicated, block: B:34:0x011d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0128  */
    /* JADX WARN: Code duplicated, block: B:40:0x0138  */
    /* JADX WARN: Code duplicated, block: B:51:0x0164  */
    /* JADX WARN: Code duplicated, block: B:54:0x016f  */
    /* JADX WARN: Code duplicated, block: B:57:0x017f  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object N(zje zjeVar) {
        oit oitVar;
        cht chtVar;
        String str;
        double d;
        bdq bdqVar;
        ArrayList arrayList;
        Iterator it;
        i4 i4VarR0;
        ArrayList arrayList2;
        Iterator it2;
        i4 i4VarR1;
        Iterator it3;
        Object next;
        int i;
        Object next2;
        int i2;
        cdq cdqVar;
        Iterator it4;
        cdq cdqVar2;
        zo80 zo80Var;
        p3u0 p3u0Var;
        String strC;
        p7m0 p7m0Var;
        Object value;
        zo80 zo80Var2;
        int i3;
        Object next3;
        int i4;
        if (zjeVar instanceof oit) {
            oitVar = (oit) zjeVar;
            int i5 = oitVar.n;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                oitVar.n = i5 - Integer.MIN_VALUE;
            } else {
                oitVar = new oit(this, zjeVar);
            }
        } else {
            oitVar = new oit(this, zjeVar);
        }
        Object objL = oitVar.l;
        wne wneVar = wne.f39444a;
        int i6 = oitVar.n;
        Object next4 = null;
        if (i6 == 0) {
            z1x.P(objL);
            oitVar.n = 1;
            objL = this.x.l(oitVar);
            if (objL != wneVar) {
            }
            return wneVar;
        }
        if (i6 == 1) {
            z1x.P(objL);
        } else {
            if (i6 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d = oitVar.k;
            str = oitVar.j;
            chtVar = oitVar.i;
            z1x.P(objL);
        }
        bdqVar = (bdq) objL;
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(new lxl(-1L, (dyl) new xxl(str), false, uxl.f36445a, (cwl) null, 108));
        List list = bdqVar.b;
        List list2 = bdqVar.d;
        List list3 = bdqVar.f2411a;
        arrayList = new ArrayList(r3d.q(list, 10));
        it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(aac.b0((cdq) it.next(), opn.f25650a));
        }
        lc00VarB.addAll(arrayList);
        i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
        lc00 lc00VarB2 = kotlin.collections.a.b();
        lc00VarB2.add(new lxl(-1L, (dyl) new xxl(str), false, uxl.f36445a, (cwl) null, 108));
        List list4 = bdqVar.c;
        arrayList2 = new ArrayList(r3d.q(list4, 10));
        it2 = list4.iterator();
        while (it2.hasNext()) {
            arrayList2.add(aac.b0((cdq) it2.next(), opn.b));
        }
        lc00VarB2.addAll(arrayList2);
        i4VarR1 = dyb.r0(kotlin.collections.a.a(lc00VarB2));
        it3 = list3.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                i = ((cdq) next).f4173a;
                do {
                    next2 = it3.next();
                    i2 = ((cdq) next2).f4173a;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        cdqVar = (cdq) next;
        if (cdqVar == null && (cdqVar = (cdq) CollectionsKt.f0(list3)) == null) {
            cdqVar = new cdq(-1, "");
        }
        GenerateCouponTypeUiModel generateCouponTypeUiModelU = agc.U(cdqVar, -1);
        it4 = list2.iterator();
        if (it4.hasNext()) {
            next4 = it4.next();
            if (it4.hasNext()) {
                i3 = ((cdq) next4).f4173a;
                do {
                    next3 = it4.next();
                    i4 = ((cdq) next3).f4173a;
                    if (i3 < i4) {
                        next4 = next3;
                        i3 = i4;
                    }
                } while (it4.hasNext());
            }
        }
        cdqVar2 = (cdq) next4;
        if (cdqVar2 == null && (cdqVar2 = (cdq) CollectionsKt.f0(list2)) == null) {
            cdqVar2 = new cdq(-1, "");
        }
        GenerateCouponTypeUiModel generateCouponTypeUiModelU2 = agc.U(cdqVar2, -1);
        pn40 pn40Var = pn40.f27267a;
        p3u0Var = p3u0.c;
        String strC2 = pn40.c(d, p3u0Var);
        if (d == 0.01d) {
            strC = "";
        } else {
            strC = pn40.c(5.0d * d, p3u0Var);
        }
        String strC3 = d != 0.01d ? pn40.c(d * 50.0d, p3u0Var) : "";
        zo80Var = new zo80(strC2, strC, strC3, generateCouponTypeUiModelU2, generateCouponTypeUiModelU, chtVar.b);
        vzg0 vzg0Var = this.o;
        vzg0Var.e("MIN_BET_SUM_SAVED", strC2);
        vzg0Var.e("BET_SUM_SAVED", strC);
        vzg0Var.e("WONTED_SUM_SAVED", strC3);
        p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
            zo80Var2 = zo80Var;
            zo80Var = zo80Var2;
        } while (!p7m0Var.m(value, zht.a((zht) value, zo80Var2, bdqVar, false, null, null, false, false, i4VarR0, i4VarR1, 540)));
        Q();
        return Unit.f46060a;
        cht chtVar2 = (cht) objL;
        double d2 = chtVar2.f4375a;
        String str2 = ((zht) D()).j;
        oitVar.i = chtVar2;
        oitVar.j = str2;
        oitVar.k = d2;
        oitVar.n = 2;
        Object objG = this.t.g(oitVar);
        if (objG != wneVar) {
            chtVar = chtVar2;
            objL = objG;
            str = str2;
            d = d2;
            bdqVar = (bdq) objL;
            lc00 lc00VarB3 = kotlin.collections.a.b();
            lc00VarB3.add(new lxl(-1L, (dyl) new xxl(str), false, uxl.f36445a, (cwl) null, 108));
            List list5 = bdqVar.b;
            List list6 = bdqVar.d;
            List list7 = bdqVar.f2411a;
            arrayList = new ArrayList(r3d.q(list5, 10));
            it = list5.iterator();
            while (it.hasNext()) {
                arrayList.add(aac.b0((cdq) it.next(), opn.f25650a));
            }
            lc00VarB3.addAll(arrayList);
            i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
            lc00 lc00VarB4 = kotlin.collections.a.b();
            lc00VarB4.add(new lxl(-1L, (dyl) new xxl(str), false, uxl.f36445a, (cwl) null, 108));
            List list8 = bdqVar.c;
            arrayList2 = new ArrayList(r3d.q(list8, 10));
            it2 = list8.iterator();
            while (it2.hasNext()) {
                arrayList2.add(aac.b0((cdq) it2.next(), opn.b));
            }
            lc00VarB4.addAll(arrayList2);
            i4VarR1 = dyb.r0(kotlin.collections.a.a(lc00VarB4));
            it3 = list7.iterator();
            if (it3.hasNext()) {
                next = null;
            } else {
                next = it3.next();
                if (it3.hasNext()) {
                    i = ((cdq) next).f4173a;
                    do {
                        next2 = it3.next();
                        i2 = ((cdq) next2).f4173a;
                        if (i < i2) {
                            next = next2;
                            i = i2;
                        }
                    } while (it3.hasNext());
                }
            }
            cdqVar = (cdq) next;
            if (cdqVar == null) {
                cdqVar = new cdq(-1, "");
            }
            GenerateCouponTypeUiModel generateCouponTypeUiModelU3 = agc.U(cdqVar, -1);
            it4 = list6.iterator();
            if (it4.hasNext()) {
                next4 = it4.next();
                if (it4.hasNext()) {
                    i3 = ((cdq) next4).f4173a;
                    do {
                        next3 = it4.next();
                        i4 = ((cdq) next3).f4173a;
                        if (i3 < i4) {
                            next4 = next3;
                            i3 = i4;
                        }
                    } while (it4.hasNext());
                }
            }
            cdqVar2 = (cdq) next4;
            if (cdqVar2 == null) {
                cdqVar2 = new cdq(-1, "");
            }
            GenerateCouponTypeUiModel generateCouponTypeUiModelU4 = agc.U(cdqVar2, -1);
            pn40 pn40Var2 = pn40.f27267a;
            p3u0Var = p3u0.c;
            String strC4 = pn40.c(d, p3u0Var);
            if (d == 0.01d) {
                strC = "";
            } else {
                strC = pn40.c(5.0d * d, p3u0Var);
            }
            String strC5 = d != 0.01d ? pn40.c(d * 50.0d, p3u0Var) : "";
            zo80Var = new zo80(strC4, strC, strC5, generateCouponTypeUiModelU4, generateCouponTypeUiModelU3, chtVar.b);
            vzg0 vzg0Var2 = this.o;
            vzg0Var2.e("MIN_BET_SUM_SAVED", strC4);
            vzg0Var2.e("BET_SUM_SAVED", strC);
            vzg0Var2.e("WONTED_SUM_SAVED", strC5);
            p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
                zo80Var2 = zo80Var;
                zo80Var = zo80Var2;
            } while (!p7m0Var.m(value, zht.a((zht) value, zo80Var2, bdqVar, false, null, null, false, false, i4VarR0, i4VarR1, 540)));
            Q();
            return Unit.f46060a;
        }
        return wneVar;
    }

    public final void O() {
        Object value;
        Object value2;
        boolean zC = this.D.c();
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (!zC) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, zht.a((zht) value2, null, null, false, null, null, false, true, null, null, 927)));
            return;
        }
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value = p7m0Var2.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var2.m(value, zht.a((zht) value, null, null, false, null, null, true, false, null, null, 927)));
        bvc bvcVarA = jiu0.a(this);
        mit mitVar = new mit(this, (byte) 1);
        dvj dvjVar = this.q.b;
        dvjVar.getClass();
        this.E = sac.V(bvcVarA, mitVar, null, kotlin.coroutines.e.c(dvjVar, this.F), new pit(this, null, (byte) 0), 10);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b1 A[LOOP:2: B:97:0x018e->B:100:0x01b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:101:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01dd A[EDGE_INSN: B:112:0x01dd->B:106:0x01dd BREAK  A[LOOP:2: B:97:0x018e->B:100:0x01b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x018c  */
    public final void P(long j, opn opnVar) {
        List<lxl> list;
        Object next;
        uxl uxlVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        int iOrdinal;
        oyg0 oyg0Var;
        ocj ocjVar;
        ArrayList arrayList3;
        p7m0 p7m0Var;
        Object value;
        ArrayList arrayList4;
        p7m0 p7m0Var2;
        Object value2;
        ArrayList arrayList5;
        Object next2;
        int iOrdinal2 = opnVar.ordinal();
        if (iOrdinal2 == 0) {
            list = ((zht) D()).h;
        } else {
            if (iOrdinal2 != 1) {
                if (iOrdinal2 == 2) {
                    return;
                }
                t9f.b();
                return;
            }
            list = ((zht) D()).i;
        }
        if (j == -1) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (((lxl) next2).f20819a != -1);
            lxl lxlVar = (lxl) next2;
            uxlVar = lxlVar != null ? lxlVar.e : null;
            uxl uxlVar2 = uxl.b;
            if (uxlVar == uxlVar2) {
                uxlVar2 = uxl.f36445a;
            }
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(lxl.a((lxl) it2.next(), uxlVar2));
            }
        } else {
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (((lxl) next).f20819a != j);
            lxl lxlVar2 = (lxl) next;
            uxlVar = lxlVar2 != null ? lxlVar2.e : null;
            int i = uxlVar == null ? -1 : nit.f23606a[uxlVar.ordinal()];
            uxl uxlVar3 = i != 1 ? i != 2 ? uxl.f36445a : uxl.f36445a : uxl.b;
            ArrayList<lxl> arrayList6 = new ArrayList(r3d.q(list, 10));
            for (lxl lxlVarA : list) {
                if (lxlVarA.f20819a == j) {
                    lxlVarA = lxl.a(lxlVarA, uxlVar3);
                }
                arrayList6.add(lxlVarA);
            }
            ArrayList arrayList7 = new ArrayList();
            for (Object obj : arrayList6) {
                if (((lxl) obj).f20819a != -1) {
                    arrayList7.add(obj);
                }
            }
            if (!arrayList7.isEmpty()) {
                Iterator it4 = arrayList7.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (((lxl) it4.next()).e != uxl.b) {
                            if (arrayList7.isEmpty()) {
                                arrayList2 = arrayList6;
                                break;
                            }
                            Iterator it5 = arrayList7.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    arrayList2 = arrayList6;
                                    break;
                                }
                                if (((lxl) it5.next()).e == uxl.f36445a) {
                                    ArrayList arrayList8 = new ArrayList(r3d.q(arrayList6, 10));
                                    for (lxl lxlVarA2 : arrayList6) {
                                        if (lxlVarA2.f20819a == -1) {
                                            lxlVarA2 = lxl.a(lxlVarA2, uxl.f36445a);
                                        }
                                        arrayList8.add(lxlVarA2);
                                    }
                                    arrayList2 = arrayList8;
                                    break;
                                }
                            }
                        }
                    }
                    iOrdinal = opnVar.ordinal();
                    oyg0Var = this.f;
                    ocjVar = this.i;
                    if (iOrdinal != 0) {
                        arrayList3 = arrayList2;
                        p7m0Var = ocjVar.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            oyg0Var.getClass();
                            arrayList4 = arrayList3;
                            arrayList3 = arrayList4;
                        } while (!p7m0Var.m(value, zht.a((zht) value, null, null, false, null, null, false, false, arrayList4, null, 895)));
                    } else {
                        if (iOrdinal == 1) {
                            t9f.b();
                            return;
                        }
                        p7m0Var2 = ocjVar.f25029a;
                        while (true) {
                            value2 = p7m0Var2.getValue();
                            value2.getClass();
                            oyg0Var.getClass();
                            arrayList5 = arrayList2;
                            if (p7m0Var2.m(value2, zht.a((zht) value2, null, null, false, null, null, false, false, null, arrayList5, 767))) {
                                break;
                            } else {
                                arrayList2 = arrayList5;
                            }
                        }
                    }
                    Q();
                }
            }
            arrayList = new ArrayList(r3d.q(arrayList6, 10));
            Iterator it6 = arrayList6.iterator();
            while (it6.hasNext()) {
                arrayList.add(lxl.a((lxl) it6.next(), uxl.b));
            }
        }
        arrayList2 = arrayList;
        iOrdinal = opnVar.ordinal();
        oyg0Var = this.f;
        ocjVar = this.i;
        if (iOrdinal != 0) {
            arrayList3 = arrayList2;
            p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
                arrayList4 = arrayList3;
                arrayList3 = arrayList4;
            } while (!p7m0Var.m(value, zht.a((zht) value, null, null, false, null, null, false, false, arrayList4, null, 895)));
        } else {
            if (iOrdinal == 1) {
                t9f.b();
                return;
            }
            p7m0Var2 = ocjVar.f25029a;
            while (true) {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
                arrayList5 = arrayList2;
                if (p7m0Var2.m(value2, zht.a((zht) value2, null, null, false, null, null, false, false, null, arrayList5, 767))) {
                    break;
                    break;
                }
                arrayList2 = arrayList5;
            }
        }
        Q();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    public final void Q() {
        nhn0 nhn0Var;
        boolean z;
        zo80 zo80Var = ((zht) D()).f44409a;
        Double dI = kotlin.text.b.i(zo80Var.b);
        Double dI2 = kotlin.text.b.i(zo80Var.c);
        Double dI3 = kotlin.text.b.i(zo80Var.f44708a);
        double dDoubleValue = dI3 != null ? dI3.doubleValue() : 0.0d;
        this.B.getClass();
        if ((dI == null && dI2 == null) || dI == null) {
            nhn0Var = new nhn0(false, false);
        } else {
            nhn0Var = new nhn0(Intrinsics.c(dI, 0.0d) || dI.doubleValue() < dDoubleValue, dI2 != null && (dI2.doubleValue() <= dI.doubleValue() || Intrinsics.c(dI2, 0.0d)));
        }
        List list = ((zht) D()).h;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((lxl) it.next()).e == uxl.b) {
                        List list2 = ((zht) D()).i;
                        if (list2 == null || !list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((lxl) it2.next()).e == uxl.b) {
                                    }
                                }
                                z = true;
                            }
                        }
                    }
                }
                if (this.p.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
            }
        } else if (this.p.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = (nhn0Var.f23541a || nhn0Var.b || !z) ? false : true;
        pn40 pn40Var = pn40.f27267a;
        Double dI4 = kotlin.text.b.i(((zht) D()).f44409a.f44708a);
        Object[] objArr = {pn40.d(dI4 != null ? dI4.doubleValue() : 0.0d, zo80Var.f, p3u0.c)};
        ctf0 ctf0Var = this.A;
        H(new p2n(z2, nhn0Var, ctf0Var.b.a(R.string.coupon_min_bet_v2, Arrays.copyOf(objArr, 1)), ctf0Var.b.a(R.string.coupon_win_less_bet_error, Arrays.copyOf(new Object[0], 0))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [a.vzg0] */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        zht zhtVar;
        Object value2;
        zht zhtVar2;
        Object value3;
        zht zhtVar3;
        Object value4;
        zht zhtVar4;
        Object value5;
        Object value6;
        vgt vgtVar = (vgt) obj;
        vgtVar.getClass();
        byte b = 0;
        if (!vgtVar.equals(jgt.f16496a)) {
            boolean zEquals = vgtVar.equals(lgt.f20023a);
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            ?? r6 = 0;
            Object obj2 = null;
            if (zEquals) {
                if (!this.D.c()) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value6 = p7m0Var.getValue();
                        value6.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value6, zht.a((zht) value6, null, null, false, null, null, false, true, null, null, 927)));
                    return;
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value5 = p7m0Var2.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value5, zht.a((zht) value5, null, null, false, null, null, true, false, null, null, 991)));
                this.E = sac.V(jiu0.a(this), new mit(this, b), null, this.q.b, new e3p(this, r6, (byte) 4), 10);
                return;
            }
            if (vgtVar.equals(ngt.f23501a)) {
                if (((zht) D()).f) {
                    return;
                }
                O();
                return;
            }
            if (vgtVar.equals(ogt.f25235a)) {
                List list = ((zht) D()).b.d;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(agc.U((cdq) it.next(), ((zht) D()).f44409a.d.b));
                }
                G(new wht(arrayList));
                return;
            }
            if (vgtVar.equals(qgt.f28702a)) {
                List list2 = ((zht) D()).b.f2411a;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(agc.U((cdq) it2.next(), ((zht) D()).f44409a.e.b));
                }
                G(new xht(arrayList2));
                return;
            }
            if (vgtVar.equals(mgt.f21759a)) {
                E();
                return;
            }
            boolean z = vgtVar instanceof kgt;
            ?? r3 = this.o;
            if (z) {
                String strM = M(((kgt) vgtVar).f18257a);
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value4 = p7m0Var3.getValue();
                    value4.getClass();
                    zhtVar4 = (zht) value4;
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value4, zht.a(zhtVar4, zo80.a(zhtVar4.f44409a, strM, null, null, null, 61), null, false, null, null, false, false, null, null, 1022)));
                r3.e("BET_SUM_SAVED", strM);
                Q();
                return;
            }
            if (vgtVar instanceof ugt) {
                String strM2 = M(((ugt) vgtVar).f35641a);
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                    zhtVar3 = (zht) value3;
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value3, zht.a(zhtVar3, zo80.a(zhtVar3.f44409a, null, strM2, null, null, 59), null, false, null, null, false, false, null, null, 1022)));
                r3.e("WONTED_SUM_SAVED", strM2);
                Q();
                return;
            }
            if (vgtVar instanceof sgt) {
                int i = ((sgt) vgtVar).f32178a;
                if (i == ((zht) D()).f44409a.e.b) {
                    return;
                }
                for (Object obj3 : ((zht) D()).b.f2411a) {
                    if (((cdq) obj3).f4173a == i) {
                        obj2 = obj3;
                        break;
                    }
                }
                cdq cdqVar = (cdq) obj2;
                if (cdqVar != null) {
                    GenerateCouponTypeUiModel generateCouponTypeUiModelU = agc.U(cdqVar, i);
                    p7m0 p7m0Var5 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var5.getValue();
                        value2.getClass();
                        zhtVar2 = (zht) value2;
                        oyg0Var.getClass();
                    } while (!p7m0Var5.m(value2, zht.a(zhtVar2, zo80.a(zhtVar2.f44409a, null, null, null, generateCouponTypeUiModelU, 47), null, false, null, null, false, false, null, null, 1022)));
                    return;
                }
                return;
            }
            if (!(vgtVar instanceof pgt)) {
                if (vgtVar instanceof rgt) {
                    P(((rgt) vgtVar).f30454a, opn.b);
                    return;
                } else if (vgtVar instanceof tgt) {
                    P(((tgt) vgtVar).f33929a, opn.f25650a);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            int i2 = ((pgt) vgtVar).f26967a;
            if (i2 == ((zht) D()).f44409a.d.b) {
                return;
            }
            for (Object obj4 : ((zht) D()).b.d) {
                if (((cdq) obj4).f4173a == i2) {
                    r6 = obj4;
                    break;
                }
            }
            cdq cdqVar2 = (cdq) r6;
            if (cdqVar2 != null) {
                GenerateCouponTypeUiModel generateCouponTypeUiModelU2 = agc.U(cdqVar2, i2);
                p7m0 p7m0Var6 = ocjVar.f25029a;
                do {
                    value = p7m0Var6.getValue();
                    value.getClass();
                    zhtVar = (zht) value;
                    oyg0Var.getClass();
                } while (!p7m0Var6.m(value, zht.a(zhtVar, zo80.a(zhtVar.f44409a, null, null, generateCouponTypeUiModelU2, null, 55), null, false, null, null, false, false, null, null, 1022)));
                return;
            }
            return;
        }
        i1w0 i1w0Var = this.v;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
