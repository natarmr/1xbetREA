package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.limits_africa.api.domain.LimitGroupEnum;
import org.xplatform.limits_kenya.api.domain.LimitKenyaGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ytz implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43243a;
    public final /* synthetic */ ctf0 b;
    public final /* synthetic */ sa10 c;

    public /* synthetic */ ytz(ctf0 ctf0Var, sa10 sa10Var, byte b) {
        this.f43243a = b;
        this.b = ctf0Var;
        this.c = sa10Var;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:169:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:170:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:172:0x0505  */
    /* JADX WARN: Code duplicated, block: B:279:0x082e  */
    /* JADX WARN: Code duplicated, block: B:281:0x0860  */
    /* JADX WARN: Code duplicated, block: B:282:0x0863  */
    /* JADX WARN: Code duplicated, block: B:284:0x086b  */
    /* JADX WARN: Code duplicated, block: B:336:0x09c6  */
    /* JADX WARN: Code duplicated, block: B:337:0x09c9  */
    /* JADX WARN: Code duplicated, block: B:55:0x0177  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        boolean z;
        int i;
        int i2;
        int i3;
        String strA;
        boolean z2;
        boolean z3;
        int i4;
        Map map;
        int i5;
        int i6;
        boolean z4;
        String strA2;
        String strM;
        py pyVar;
        wui0 wui0Var;
        int i7;
        Iterator it;
        int i8;
        boolean z5;
        String strA3;
        String strN;
        qy qyVar;
        wui0 wui0Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z6;
        String strA4;
        String strM2;
        ry ryVar;
        wui0 wui0Var3;
        byte b = this.f43243a;
        int i13 = 1;
        int i14 = 2;
        ctf0 ctf0Var = this.b;
        switch (b) {
            case 0:
                ttz ttzVar = (ttz) obj;
                ttzVar.getClass();
                String str2 = ttzVar.k;
                ctf0Var.getClass();
                Map map2 = ttzVar.f34526a;
                tn40 tn40Var = ttzVar.j;
                boolean zIsEmpty = map2.isEmpty();
                Map map3 = ttzVar.b;
                boolean zIsEmpty2 = map3.isEmpty();
                ctf0 ctf0Var2 = ctf0Var;
                lsm0 lsm0Var = ctf0Var2.b;
                xsz xszVar = new xsz(lsm0Var.a(R.string.set_your_limits_description, Arrays.copyOf(new Object[0], 0)));
                TreeMap treeMapC = wp20.c(map2, new wpv((byte) 12));
                ArrayList arrayList = new ArrayList();
                Iterator it2 = treeMapC.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    LimitGroupEnum limitGroupEnum = (LimitGroupEnum) entry.getKey();
                    List list = (List) entry.getValue();
                    limitGroupEnum.getClass();
                    Iterator it3 = it2;
                    int iOrdinal = limitGroupEnum.ordinal();
                    if (iOrdinal != 0) {
                        map = map3;
                        if (iOrdinal == 1) {
                            i5 = R.string.deposit_limits_title;
                        } else if (iOrdinal == 2) {
                            i5 = R.string.limit_self_block;
                        } else {
                            if (iOrdinal != 3) {
                                t9f.b();
                                return null;
                            }
                            i5 = R.string.empty_str;
                        }
                    } else {
                        map = map3;
                        i5 = R.string.bet_limit_title;
                    }
                    String strA5 = lsm0Var.a(i5, Arrays.copyOf(new Object[0], 0));
                    int iOrdinal2 = limitGroupEnum.ordinal();
                    if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                        i6 = R.string.deposit_limits_requirements;
                    } else {
                        if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                            t9f.b();
                            return null;
                        }
                        i6 = R.string.empty_str;
                    }
                    ctf0 ctf0Var3 = ctf0Var2;
                    etz etzVar = new etz(strA5, lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0)));
                    list.getClass();
                    ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                    Iterator it4 = list.iterator();
                    int i15 = 0;
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            q3d.p();
                            throw null;
                        }
                        tn40 tn40Var2 = (tn40) next;
                        Iterator it5 = it4;
                        qrz qrzVar = tn40Var2.h;
                        List list2 = list;
                        trz trzVar = tn40Var2.b;
                        String str3 = tn40Var2.c;
                        etz etzVar2 = etzVar;
                        String str4 = tn40Var2.l;
                        String str5 = str2;
                        String str6 = tn40Var2.n;
                        qrz qrzVar2 = qrz.b;
                        boolean z7 = qrzVar == qrzVar2 && !StringsKt.W(str6);
                        ttz ttzVar2 = ttzVar;
                        wui0 wui0VarJ = k7x.J(i15, list2.size() - 1, z7);
                        tn40 tn40Var3 = tn40Var;
                        boolean z8 = z7;
                        String strA6 = lsm0Var.a(k7x.N(trzVar), Arrays.copyOf(new Object[0], 0));
                        if (tn40Var2.h == qrzVar2 && StringsKt.W(str6)) {
                            strM = w6x.q(str4, Separators.SP, str3);
                        } else {
                            if (z8) {
                                strM = ua80.m(b1j.n("\u202d", str4, Separators.SP, str3, " > "), str6, Separators.SP, str3, "\u202d");
                            } else {
                                z4 = false;
                                strA2 = lsm0Var.a(R.string.limit_not_set, Arrays.copyOf(new Object[0], 0));
                            }
                            if (z8) {
                                rdj rdjVar = rdj.f30294a;
                                String strA7 = lsm0Var.a(R.string.limit_pending_info_v2, Arrays.copyOf(new Object[]{rdj.g(new znq0(tn40Var2.o), efj.UNIVERSAL, Boolean.valueOf(ctf0Var3.h()), z4, 56)}, 1));
                                if (i15 == list2.size() - 1) {
                                    wui0Var = wui0.d;
                                } else {
                                    wui0Var = wui0.c;
                                }
                                pyVar = new py(strA7, wui0Var);
                            } else {
                                pyVar = null;
                            }
                            arrayList2.add(new ftz(trzVar, strA6, strA2, wui0VarJ, pyVar));
                            i15 = i16;
                            it4 = it5;
                            list = list2;
                            etzVar = etzVar2;
                            str2 = str5;
                            ttzVar = ttzVar2;
                            tn40Var = tn40Var3;
                        }
                        strA2 = strM;
                        z4 = false;
                        if (z8) {
                            rdj rdjVar2 = rdj.f30294a;
                            String strA8 = lsm0Var.a(R.string.limit_pending_info_v2, Arrays.copyOf(new Object[]{rdj.g(new znq0(tn40Var2.o), efj.UNIVERSAL, Boolean.valueOf(ctf0Var3.h()), z4, 56)}, 1));
                            if (i15 == list2.size() - 1) {
                                wui0Var = wui0.d;
                            } else {
                                wui0Var = wui0.c;
                            }
                            pyVar = new py(strA8, wui0Var);
                        } else {
                            pyVar = null;
                        }
                        arrayList2.add(new ftz(trzVar, strA6, strA2, wui0VarJ, pyVar));
                        i15 = i16;
                        it4 = it5;
                        list = list2;
                        etzVar = etzVar2;
                        str2 = str5;
                        ttzVar = ttzVar2;
                        tn40Var = tn40Var3;
                    }
                    w3d.u(arrayList, CollectionsKt.q0(kotlin.collections.a.c(etzVar), arrayList2));
                    it2 = it3;
                    map3 = map;
                    zIsEmpty2 = zIsEmpty2;
                    ctf0Var2 = ctf0Var3;
                    ttzVar = ttzVar;
                    tn40Var = tn40Var;
                }
                ttz ttzVar3 = ttzVar;
                String str7 = str2;
                tn40 tn40Var4 = tn40Var;
                boolean z9 = zIsEmpty2;
                i4 i4VarR0 = dyb.r0(CollectionsKt.r0(arrayList, xszVar));
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry2 : map3.entrySet()) {
                    LimitGroupEnum limitGroupEnum2 = (LimitGroupEnum) entry2.getKey();
                    List list3 = (List) entry2.getValue();
                    int iOrdinal3 = limitGroupEnum2.ordinal();
                    if (iOrdinal3 == 0) {
                        i = R.string.bet_limit_title;
                    } else if (iOrdinal3 == 1) {
                        i = R.string.deposit_limits_title;
                    } else if (iOrdinal3 == 2) {
                        i = R.string.limit_self_block;
                    } else {
                        if (iOrdinal3 != 3) {
                            t9f.b();
                            return null;
                        }
                        i = R.string.empty_str;
                    }
                    String strA9 = lsm0Var.a(i, Arrays.copyOf(new Object[0], 0));
                    int iOrdinal4 = limitGroupEnum2.ordinal();
                    if (iOrdinal4 == 0 || iOrdinal4 == 1) {
                        i2 = R.string.deposit_limits_requirements;
                    } else {
                        if (iOrdinal4 != 2 && iOrdinal4 != 3) {
                            t9f.b();
                            return null;
                        }
                        i2 = R.string.empty_str;
                    }
                    etz etzVar3 = new etz(strA9, lsm0Var.a(i2, Arrays.copyOf(new Object[0], 0)));
                    ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                    int i17 = 0;
                    for (Object obj2 : list3) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            q3d.p();
                            throw null;
                        }
                        oiq0 oiq0Var = (oiq0) obj2;
                        trz trzVar2 = oiq0Var.b;
                        qrz qrzVar3 = oiq0Var.i;
                        String strA10 = lsm0Var.a(k7x.N(trzVar2), Arrays.copyOf(new Object[0], 0));
                        qrz qrzVar4 = qrz.b;
                        if (qrzVar3 == qrzVar4) {
                            i3 = 0;
                            i4 = 0;
                            if (oiq0Var.c == -1) {
                                strA = lsm0Var.a(R.string.limits_self_exclusion_permanent, Arrays.copyOf(new Object[0], 0));
                            }
                            z2 = i4;
                            wui0 wui0VarJ2 = k7x.J(i17, list3.size() - 1, z2);
                            if (qrzVar3 == qrzVar4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            arrayList4.add(new utz(wui0VarJ2, strA10, strA, z3));
                            i17 = i18;
                        } else {
                            i3 = 0;
                        }
                        if (qrzVar3 == qrzVar4) {
                            strA = oiq0Var.d;
                            i4 = i3;
                            z2 = i4;
                        } else {
                            strA = lsm0Var.a(R.string.select, Arrays.copyOf(new Object[i3], i3));
                            z2 = i3;
                        }
                        wui0 wui0VarJ3 = k7x.J(i17, list3.size() - 1, z2);
                        if (qrzVar3 == qrzVar4) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        arrayList4.add(new utz(wui0VarJ3, strA10, strA, z3));
                        i17 = i18;
                    }
                    w3d.u(arrayList3, CollectionsKt.q0(kotlin.collections.a.c(etzVar3), arrayList4));
                }
                i4 i4VarR1 = dyb.r0(arrayList3);
                lc00 lc00VarB = kotlin.collections.a.b();
                if (!zIsEmpty) {
                    lc00VarB.add(gnz.b);
                }
                if (!z9) {
                    lc00VarB.add(mnz.b);
                }
                i4 i4VarR2 = dyb.r0(kotlin.collections.a.a(lc00VarB));
                String str8 = tn40Var4 != null ? tn40Var4.l : null;
                if (str8 == null) {
                    str8 = "";
                }
                StringBuilder sb = new StringBuilder();
                int length = str8.length();
                for (int i19 = 0; i19 < length; i19++) {
                    char cCharAt = str8.charAt(i19);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String string = sb.toString();
                int i20 = ttzVar3.c;
                boolean z10 = (zIsEmpty || z9) ? false : true;
                ArrayList arrayList5 = new ArrayList(r3d.q(i4VarR2, 10));
                ListIterator listIterator = i4VarR2.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList5.add(lsm0Var.a(((snz) listIterator.next()).f32517a, Arrays.copyOf(new Object[0], 0)));
                }
                i4 i4VarR3 = dyb.r0(arrayList5);
                boolean z11 = ttzVar3.d;
                boolean z12 = ttzVar3.e;
                ra10 ra10VarB = sa10.b(this.c, pb10.g, R.string.data_retrieval_error, 0, null, 28);
                String str9 = tn40Var4 != null ? tn40Var4.c : null;
                String str10 = str9 == null ? "" : str9;
                boolean z13 = tn40Var4 != null ? tn40Var4.e : false;
                boolean z14 = ttzVar3.i;
                if (tn40Var4 != null) {
                    String str11 = tn40Var4.l;
                    if (StringsKt.W(string) || Intrinsics.d(str11, tn40Var4.n)) {
                        str = str7;
                    } else {
                        str = str7;
                        boolean z15 = str.equals(str11) ? false : true;
                        z = z15;
                    }
                    z = z15;
                } else {
                    str = str7;
                    z = false;
                }
                return new wtz(i4VarR0, i4VarR1, z11, i20, z10, i4VarR2, i4VarR3, z12, ra10VarB, new anz(str, string, str10, z13, z14, z, ttzVar3.d));
            case 1:
                gvz gvzVar = (gvz) obj;
                gvzVar.getClass();
                ctf0Var.getClass();
                Map map4 = gvzVar.f11998a;
                boolean zIsEmpty3 = map4.isEmpty();
                Map map5 = gvzVar.b;
                boolean zIsEmpty4 = map5.isEmpty();
                ctf0 ctf0Var4 = ctf0Var;
                lsm0 lsm0Var2 = ctf0Var4.b;
                vuz vuzVar = new vuz(lsm0Var2.a(R.string.set_your_limits_description, Arrays.copyOf(new Object[0], 0)));
                TreeMap treeMapC2 = wp20.c(map4, new wpv((byte) 13));
                ArrayList arrayList6 = new ArrayList();
                Iterator it6 = treeMapC2.entrySet().iterator();
                while (it6.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it6.next();
                    org.xplatform.limits_ee.api.domain.LimitGroupEnum limitGroupEnum3 = (org.xplatform.limits_ee.api.domain.LimitGroupEnum) entry3.getKey();
                    List list4 = (List) entry3.getValue();
                    limitGroupEnum3.getClass();
                    int iOrdinal5 = limitGroupEnum3.ordinal();
                    if (iOrdinal5 != 0) {
                        it = it6;
                        if (iOrdinal5 == 1) {
                            i8 = R.string.limit_self_block;
                        } else {
                            if (iOrdinal5 != 2) {
                                t9f.b();
                                return null;
                            }
                            i8 = R.string.empty_str;
                        }
                    } else {
                        it = it6;
                        i8 = R.string.deposit_losses_title;
                    }
                    bvz bvzVar = new bvz(lsm0Var2.a(i8, Arrays.copyOf(new Object[0], 0)));
                    list4.getClass();
                    ArrayList arrayList7 = new ArrayList(r3d.q(list4, 10));
                    Iterator it7 = list4.iterator();
                    int i21 = 0;
                    while (it7.hasNext()) {
                        Object next2 = it7.next();
                        int i22 = i21 + 1;
                        if (i21 < 0) {
                            q3d.p();
                            throw null;
                        }
                        Iterator it8 = it7;
                        qn40 qn40Var = (qn40) next2;
                        Map map6 = map5;
                        mrz mrzVar = qn40Var.h;
                        boolean z16 = zIsEmpty4;
                        l810 l810Var = qn40Var.b;
                        String str12 = qn40Var.c;
                        List list5 = list4;
                        bvz bvzVar2 = bvzVar;
                        long j = qn40Var.l;
                        gvz gvzVar2 = gvzVar;
                        long j2 = qn40Var.n;
                        ctf0 ctf0Var5 = ctf0Var4;
                        mrz mrzVar2 = mrz.b;
                        boolean z17 = mrzVar == mrzVar2 && j2 != 0;
                        vuz vuzVar2 = vuzVar;
                        wui0 wui0VarL = l7x.L(i21, list5.size() - 1, z17);
                        boolean z18 = z17;
                        ArrayList arrayList8 = arrayList6;
                        String strA11 = lsm0Var2.a(l7x.M(l810Var), Arrays.copyOf(new Object[0], 0));
                        if (qn40Var.h == mrzVar2 && j2 == 0) {
                            strN = j + Separators.SP + str12;
                        } else {
                            if (z18) {
                                StringBuilder sbO = axq.o(j, "\u202d", Separators.SP, str12);
                                kng0.A(sbO, " > ", j2, Separators.SP);
                                strN = axq.n(sbO, str12, "\u202d");
                            } else {
                                z5 = false;
                                strA3 = lsm0Var2.a(R.string.limit_not_set, Arrays.copyOf(new Object[0], 0));
                            }
                            if (z18) {
                                rdj rdjVar3 = rdj.f30294a;
                                String strA12 = lsm0Var2.a(R.string.limit_pending_info_v2, Arrays.copyOf(new Object[]{rdj.g(new znq0(qn40Var.o), efj.UNIVERSAL, Boolean.valueOf(ctf0Var5.h()), z5, 56)}, 1));
                                if (i21 == list5.size() - 1) {
                                    wui0Var2 = wui0.d;
                                } else {
                                    wui0Var2 = wui0.c;
                                }
                                qyVar = new qy(strA12, wui0Var2);
                            } else {
                                qyVar = null;
                            }
                            arrayList7.add(new cvz(l810Var, strA11, strA3, wui0VarL, qyVar));
                            it7 = it8;
                            map5 = map6;
                            i21 = i22;
                            zIsEmpty4 = z16;
                            list4 = list5;
                            bvzVar = bvzVar2;
                            gvzVar = gvzVar2;
                            vuzVar = vuzVar2;
                            arrayList6 = arrayList8;
                            ctf0Var4 = ctf0Var5;
                        }
                        strA3 = strN;
                        z5 = false;
                        if (z18) {
                            rdj rdjVar4 = rdj.f30294a;
                            String strA13 = lsm0Var2.a(R.string.limit_pending_info_v2, Arrays.copyOf(new Object[]{rdj.g(new znq0(qn40Var.o), efj.UNIVERSAL, Boolean.valueOf(ctf0Var5.h()), z5, 56)}, 1));
                            if (i21 == list5.size() - 1) {
                                wui0Var2 = wui0.d;
                            } else {
                                wui0Var2 = wui0.c;
                            }
                            qyVar = new qy(strA13, wui0Var2);
                        } else {
                            qyVar = null;
                        }
                        arrayList7.add(new cvz(l810Var, strA11, strA3, wui0VarL, qyVar));
                        it7 = it8;
                        map5 = map6;
                        i21 = i22;
                        zIsEmpty4 = z16;
                        list4 = list5;
                        bvzVar = bvzVar2;
                        gvzVar = gvzVar2;
                        vuzVar = vuzVar2;
                        arrayList6 = arrayList8;
                        ctf0Var4 = ctf0Var5;
                    }
                    ArrayList arrayList9 = arrayList6;
                    w3d.u(arrayList9, CollectionsKt.q0(kotlin.collections.a.c(bvzVar), arrayList7));
                    arrayList6 = arrayList9;
                    it6 = it;
                    zIsEmpty3 = zIsEmpty3;
                    gvzVar = gvzVar;
                }
                gvz gvzVar3 = gvzVar;
                boolean z19 = zIsEmpty3;
                boolean z20 = zIsEmpty4;
                i4 i4VarR4 = dyb.r0(CollectionsKt.r0(arrayList6, vuzVar));
                ArrayList arrayList10 = new ArrayList();
                Iterator it9 = map5.entrySet().iterator();
                while (it9.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) it9.next();
                    org.xplatform.limits_ee.api.domain.LimitGroupEnum limitGroupEnum4 = (org.xplatform.limits_ee.api.domain.LimitGroupEnum) entry4.getKey();
                    List list6 = (List) entry4.getValue();
                    int iOrdinal6 = limitGroupEnum4.ordinal();
                    if (iOrdinal6 == 0) {
                        i7 = R.string.deposit_losses_title;
                    } else if (iOrdinal6 == 1) {
                        i7 = R.string.limit_self_block;
                    } else {
                        if (iOrdinal6 != 2) {
                            t9f.b();
                            return null;
                        }
                        i7 = R.string.empty_str;
                    }
                    bvz bvzVar3 = new bvz(lsm0Var2.a(i7, Arrays.copyOf(new Object[0], 0)));
                    ArrayList arrayList11 = new ArrayList(r3d.q(list6, 10));
                    int i23 = 0;
                    for (Object obj3 : list6) {
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            q3d.p();
                            throw null;
                        }
                        piq0 piq0Var = (piq0) obj3;
                        urz urzVar = piq0Var.b;
                        mrz mrzVar3 = piq0Var.i;
                        String strA14 = lsm0Var2.a(l7x.M(urzVar), Arrays.copyOf(new Object[0], 0));
                        mrz mrzVar4 = mrz.b;
                        Iterator it10 = it9;
                        i4 i4Var = i4VarR4;
                        arrayList11.add(new hvz(l7x.L(i23, list6.size() - 1, false), strA14, (mrzVar3 == mrzVar4 && piq0Var.c == -1) ? lsm0Var2.a(R.string.limits_self_exclusion_permanent, Arrays.copyOf(new Object[0], 0)) : mrzVar3 == mrzVar4 ? piq0Var.d : lsm0Var2.a(R.string.select, Arrays.copyOf(new Object[0], 0)), mrzVar3 == mrzVar4));
                        i23 = i24;
                        i4VarR4 = i4Var;
                        it9 = it10;
                    }
                    w3d.u(arrayList10, CollectionsKt.q0(kotlin.collections.a.c(bvzVar3), arrayList11));
                    it9 = it9;
                }
                i4 i4Var2 = i4VarR4;
                i4 i4VarR5 = dyb.r0(arrayList10);
                lc00 lc00VarB2 = kotlin.collections.a.b();
                if (!z19) {
                    lc00VarB2.add(hnz.b);
                }
                if (!z20) {
                    lc00VarB2.add(nnz.b);
                }
                i4 i4VarR6 = dyb.r0(kotlin.collections.a.a(lc00VarB2));
                int i25 = gvzVar3.c;
                boolean z21 = (z19 || z20) ? false : true;
                ArrayList arrayList12 = new ArrayList(r3d.q(i4VarR6, 10));
                int i26 = 0;
                ListIterator listIterator2 = i4VarR6.listIterator(0);
                while (listIterator2.hasNext()) {
                    arrayList12.add(lsm0Var2.a(((tnz) listIterator2.next()).f34259a, Arrays.copyOf(new Object[i26], i26)));
                    i26 = 0;
                }
                return new jvz(i4Var2, i4VarR5, gvzVar3.d, i25, z21, i4VarR6, dyb.r0(arrayList12), gvzVar3.e, sa10.b(this.c, pb10.g, R.string.data_retrieval_error, 0, null, 28));
            case 2:
                ryz ryzVar = (ryz) obj;
                ryzVar.getClass();
                ctf0Var.getClass();
                Map map7 = ryzVar.f31334a;
                boolean zIsEmpty5 = map7.isEmpty();
                Map map8 = ryzVar.b;
                boolean zIsEmpty6 = map8.isEmpty();
                lsm0 lsm0Var3 = ctf0Var.b;
                ayz ayzVar = new ayz(lsm0Var3.a(R.string.set_your_limits_description, Arrays.copyOf(new Object[0], 0)));
                TreeMap treeMapC3 = wp20.c(map7, new wpv((byte) 16));
                ArrayList arrayList13 = new ArrayList();
                Iterator it11 = treeMapC3.entrySet().iterator();
                while (it11.hasNext()) {
                    Map.Entry entry5 = (Map.Entry) it11.next();
                    LimitKenyaGroupEnum limitKenyaGroupEnum = (LimitKenyaGroupEnum) entry5.getKey();
                    List list7 = (List) entry5.getValue();
                    limitKenyaGroupEnum.getClass();
                    int iOrdinal7 = limitKenyaGroupEnum.ordinal();
                    if (iOrdinal7 == 0) {
                        i11 = R.string.bet_limit_title;
                    } else if (iOrdinal7 == i13) {
                        i11 = R.string.deposit_limits_title;
                    } else if (iOrdinal7 == i14) {
                        i11 = R.string.limit_self_block;
                    } else {
                        if (iOrdinal7 != 3) {
                            t9f.b();
                            return null;
                        }
                        i11 = R.string.empty_str;
                    }
                    String strA15 = lsm0Var3.a(i11, Arrays.copyOf(new Object[0], 0));
                    int iOrdinal8 = limitKenyaGroupEnum.ordinal();
                    if (iOrdinal8 == 0 || iOrdinal8 == 1) {
                        i12 = R.string.deposit_limits_requirements_new;
                    } else {
                        if (iOrdinal8 != 2 && iOrdinal8 != 3) {
                            t9f.b();
                            return null;
                        }
                        i12 = R.string.empty_str;
                    }
                    Iterator it12 = it11;
                    gyz gyzVar = new gyz(strA15, lsm0Var3.a(i12, Arrays.copyOf(new Object[0], 0)));
                    list7.getClass();
                    ArrayList arrayList14 = new ArrayList(r3d.q(list7, 10));
                    Iterator it13 = list7.iterator();
                    int i27 = 0;
                    while (it13.hasNext()) {
                        Object next3 = it13.next();
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            q3d.p();
                            throw null;
                        }
                        rn40 rn40Var = (rn40) next3;
                        Iterator it14 = it13;
                        nrz nrzVar = rn40Var.h;
                        Map map9 = map8;
                        vrz vrzVar = rn40Var.b;
                        String str13 = rn40Var.c;
                        gyz gyzVar2 = gyzVar;
                        String str14 = rn40Var.l;
                        List list8 = list7;
                        String str15 = rn40Var.n;
                        ctf0 ctf0Var6 = ctf0Var;
                        nrz nrzVar2 = nrz.b;
                        boolean z22 = nrzVar == nrzVar2 && !StringsKt.W(str15);
                        wui0 wui0VarD = n7x.D(i27, list8.size() - 1, z22);
                        ryz ryzVar2 = ryzVar;
                        boolean z23 = z22;
                        String strA16 = lsm0Var3.a(n7x.G(vrzVar), Arrays.copyOf(new Object[0], 0));
                        if (rn40Var.h == nrzVar2 && StringsKt.W(str15)) {
                            strM2 = kng0.l(str14, Separators.SP, str13);
                        } else {
                            if (z23) {
                                strM2 = ua80.m(b1j.n("\u202d", str14, Separators.SP, str13, " > "), str15, Separators.SP, str13, "\u202d");
                            } else {
                                z6 = false;
                                strA4 = lsm0Var3.a(R.string.limit_not_set, Arrays.copyOf(new Object[0], 0));
                            }
                            if (z23) {
                                rdj rdjVar5 = rdj.f30294a;
                                String strA17 = lsm0Var3.a(R.string.limit_pending_info_v2, Arrays.copyOf(new Object[]{rdj.g(new znq0(rn40Var.o), efj.UNIVERSAL, Boolean.valueOf(ctf0Var6.h()), z6, 56)}, 1));
                                if (i27 == list8.size() - 1) {
                                    wui0Var3 = wui0.d;
                                } else {
                                    wui0Var3 = wui0.c;
                                }
                                ryVar = new ry(strA17, wui0Var3);
                            } else {
                                ryVar = null;
                            }
                            arrayList14.add(new iyz(vrzVar, strA16, strA4, wui0VarD, ryVar));
                            i27 = i28;
                            it13 = it14;
                            map8 = map9;
                            gyzVar = gyzVar2;
                            list7 = list8;
                            ctf0Var = ctf0Var6;
                            ryzVar = ryzVar2;
                        }
                        strA4 = strM2;
                        z6 = false;
                        if (z23) {
                            rdj rdjVar6 = rdj.f30294a;
                            String strA18 = lsm0Var3.a(R.string.limit_pending_info_v2, Arrays.copyOf(new Object[]{rdj.g(new znq0(rn40Var.o), efj.UNIVERSAL, Boolean.valueOf(ctf0Var6.h()), z6, 56)}, 1));
                            if (i27 == list8.size() - 1) {
                                wui0Var3 = wui0.d;
                            } else {
                                wui0Var3 = wui0.c;
                            }
                            ryVar = new ry(strA18, wui0Var3);
                        } else {
                            ryVar = null;
                        }
                        arrayList14.add(new iyz(vrzVar, strA16, strA4, wui0VarD, ryVar));
                        i27 = i28;
                        it13 = it14;
                        map8 = map9;
                        gyzVar = gyzVar2;
                        list7 = list8;
                        ctf0Var = ctf0Var6;
                        ryzVar = ryzVar2;
                    }
                    w3d.u(arrayList13, CollectionsKt.q0(kotlin.collections.a.c(gyzVar), arrayList14));
                    i14 = 2;
                    i13 = 1;
                    it11 = it12;
                }
                ryz ryzVar3 = ryzVar;
                i4 i4VarR7 = dyb.r0(CollectionsKt.r0(arrayList13, ayzVar));
                ArrayList arrayList15 = new ArrayList();
                Iterator it15 = map8.entrySet().iterator();
                while (it15.hasNext()) {
                    Map.Entry entry6 = (Map.Entry) it15.next();
                    LimitKenyaGroupEnum limitKenyaGroupEnum2 = (LimitKenyaGroupEnum) entry6.getKey();
                    List list9 = (List) entry6.getValue();
                    int iOrdinal9 = limitKenyaGroupEnum2.ordinal();
                    if (iOrdinal9 == 0) {
                        i9 = R.string.bet_limit_title;
                    } else if (iOrdinal9 == 1) {
                        i9 = R.string.deposit_limits_title;
                    } else if (iOrdinal9 == 2) {
                        i9 = R.string.limit_self_block;
                    } else {
                        if (iOrdinal9 != 3) {
                            t9f.b();
                            return null;
                        }
                        i9 = R.string.empty_str;
                    }
                    String strA19 = lsm0Var3.a(i9, Arrays.copyOf(new Object[0], 0));
                    int iOrdinal10 = limitKenyaGroupEnum2.ordinal();
                    if (iOrdinal10 == 0 || iOrdinal10 == 1) {
                        i10 = R.string.deposit_limits_requirements_new;
                    } else {
                        if (iOrdinal10 != 2 && iOrdinal10 != 3) {
                            t9f.b();
                            return null;
                        }
                        i10 = R.string.empty_str;
                    }
                    gyz gyzVar3 = new gyz(strA19, lsm0Var3.a(i10, Arrays.copyOf(new Object[0], 0)));
                    ArrayList arrayList16 = new ArrayList(r3d.q(list9, 10));
                    int i29 = 0;
                    for (Object obj4 : list9) {
                        int i30 = i29 + 1;
                        if (i29 < 0) {
                            q3d.p();
                            throw null;
                        }
                        qiq0 qiq0Var = (qiq0) obj4;
                        vrz vrzVar2 = qiq0Var.b;
                        nrz nrzVar3 = qiq0Var.i;
                        String strA20 = lsm0Var3.a(n7x.G(vrzVar2), Arrays.copyOf(new Object[0], 0));
                        nrz nrzVar4 = nrz.b;
                        Iterator it16 = it15;
                        List list10 = list9;
                        arrayList16.add(new syz(n7x.D(i29, list10.size() - 1, false), strA20, (nrzVar3 == nrzVar4 && qiq0Var.c == -1) ? lsm0Var3.a(R.string.limits_self_exclusion_permanent, Arrays.copyOf(new Object[0], 0)) : nrzVar3 == nrzVar4 ? qiq0Var.d : lsm0Var3.a(R.string.select, Arrays.copyOf(new Object[0], 0)), nrzVar3 == nrzVar4));
                        it15 = it16;
                        i29 = i30;
                        list9 = list10;
                    }
                    w3d.u(arrayList15, CollectionsKt.q0(kotlin.collections.a.c(gyzVar3), arrayList16));
                    it15 = it15;
                }
                i4 i4VarR8 = dyb.r0(arrayList15);
                lc00 lc00VarB3 = kotlin.collections.a.b();
                if (!zIsEmpty5) {
                    lc00VarB3.add(inz.b);
                }
                if (!zIsEmpty6) {
                    lc00VarB3.add(onz.b);
                }
                i4 i4VarR9 = dyb.r0(kotlin.collections.a.a(lc00VarB3));
                int i31 = ryzVar3.c;
                boolean z24 = (zIsEmpty5 || zIsEmpty6) ? false : true;
                ArrayList arrayList17 = new ArrayList(r3d.q(i4VarR9, 10));
                int i32 = 0;
                ListIterator listIterator3 = i4VarR9.listIterator(0);
                while (listIterator3.hasNext()) {
                    arrayList17.add(lsm0Var3.a(((unz) listIterator3.next()).f35985a, Arrays.copyOf(new Object[i32], i32)));
                    i32 = 0;
                }
                return new uyz(i4VarR7, i4VarR8, ryzVar3.d, i31, z24, i4VarR9, dyb.r0(arrayList17), ryzVar3.e, sa10.b(this.c, pb10.g, R.string.data_retrieval_error, 0, null, 28));
            default:
                ((n940) obj).getClass();
                return new db2(ctf0Var, this.c);
        }
    }
}
