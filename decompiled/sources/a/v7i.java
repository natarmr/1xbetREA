package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetViewType;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerDialogParams;

/* JADX INFO: loaded from: classes3.dex */
public final class v7i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f36925a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    public v7i(dvz dvzVar, iw20 iw20Var, cad cadVar, i1w0 i1w0Var, sa10 sa10Var, ii iiVar, m1e m1eVar, duj dujVar, btt0 btt0Var, ctf0 ctf0Var, gii0 gii0Var, knf0 knf0Var) {
        this.i = iw20Var;
        this.e = sa10Var;
        this.f = dvzVar;
        this.j = gii0Var;
        this.k = btt0Var;
        this.l = knf0Var;
        this.c = ctf0Var;
        this.f36925a = i1w0Var;
        this.d = m1eVar;
        this.h = cadVar;
        this.g = dujVar;
        byte b = 8;
        this.m = mbl.b(new rii(this, 3, b));
        this.b = mbl.b(new rii(this, 2, b));
        this.n = mbl.b(new rii(this, 1, b));
        this.o = new rii(this, 0, b);
    }

    public mii0 a() {
        return new mii0(new rou((b3c0) this.i, (byte) 0), (knf0) this.e, (btt0) this.f, new ok50((gii0) this.j, (byte) 18), (hc8) ((n5d0) this.n).get());
    }

    /* JADX WARN: Code duplicated, block: B:174:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:177:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:178:0x0401  */
    /* JADX WARN: Code duplicated, block: B:181:0x040b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0410  */
    /* JADX WARN: Code duplicated, block: B:185:0x0416  */
    /* JADX WARN: Code duplicated, block: B:197:0x044e  */
    /* JADX WARN: Code duplicated, block: B:198:0x0451  */
    /* JADX WARN: Code duplicated, block: B:205:0x0464  */
    /* JADX WARN: Code duplicated, block: B:210:0x0470  */
    /* JADX WARN: Code duplicated, block: B:212:0x0476  */
    /* JADX WARN: Code duplicated, block: B:213:0x0479  */
    /* JADX WARN: Code duplicated, block: B:215:0x047c  */
    /* JADX WARN: Code duplicated, block: B:217:0x0484  */
    /* JADX WARN: Code duplicated, block: B:218:0x0489  */
    /* JADX WARN: Code duplicated, block: B:220:0x048d  */
    /* JADX WARN: Code duplicated, block: B:223:0x049a  */
    /* JADX WARN: Code duplicated, block: B:227:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:228:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:231:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:232:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:234:0x04af  */
    /* JADX WARN: Code duplicated, block: B:235:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:237:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:238:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:240:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:242:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:243:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:245:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:248:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:252:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:253:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:255:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:256:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:258:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:259:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:262:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:263:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:266:0x0501  */
    /* JADX WARN: Code duplicated, block: B:267:0x0505 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:268:0x0507  */
    /* JADX WARN: Code duplicated, block: B:269:0x050c  */
    /* JADX WARN: Code duplicated, block: B:271:0x050f  */
    /* JADX WARN: Code duplicated, block: B:272:0x0512  */
    /* JADX WARN: Code duplicated, block: B:276:0x0526  */
    /* JADX WARN: Code duplicated, block: B:278:0x052e  */
    /* JADX WARN: Code duplicated, block: B:280:0x0559  */
    /* JADX WARN: Code duplicated, block: B:286:0x0571  */
    /* JADX WARN: Code duplicated, block: B:289:0x058b  */
    /* JADX WARN: Code duplicated, block: B:292:0x0599  */
    /* JADX WARN: Code duplicated, block: B:296:0x05b1 A[EDGE_INSN: B:296:0x05b1->B:297:0x05b3 BREAK  A[LOOP:7: B:290:0x0593->B:643:?]] */
    /* JADX WARN: Code duplicated, block: B:299:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:302:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:306:0x05e9 A[EDGE_INSN: B:306:0x05e9->B:307:0x05eb BREAK  A[LOOP:8: B:300:0x05cb->B:646:?]] */
    /* JADX WARN: Code duplicated, block: B:309:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:310:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:340:0x0669  */
    /* JADX WARN: Code duplicated, block: B:343:0x066f  */
    /* JADX WARN: Code duplicated, block: B:344:0x0672  */
    /* JADX WARN: Code duplicated, block: B:347:0x0678  */
    /* JADX WARN: Code duplicated, block: B:348:0x067f  */
    /* JADX WARN: Code duplicated, block: B:351:0x0685  */
    /* JADX WARN: Code duplicated, block: B:352:0x0688  */
    /* JADX WARN: Code duplicated, block: B:354:0x068c  */
    /* JADX WARN: Code duplicated, block: B:355:0x0691  */
    /* JADX WARN: Code duplicated, block: B:358:0x0697  */
    /* JADX WARN: Code duplicated, block: B:359:0x069e  */
    /* JADX WARN: Code duplicated, block: B:362:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:363:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:365:0x06af  */
    /* JADX WARN: Code duplicated, block: B:366:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:369:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:370:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:372:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:373:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:375:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:377:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:378:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:380:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:382:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:383:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:386:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:387:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:390:0x0700  */
    /* JADX WARN: Code duplicated, block: B:391:0x0707  */
    /* JADX WARN: Code duplicated, block: B:393:0x070b  */
    /* JADX WARN: Code duplicated, block: B:394:0x0712  */
    /* JADX WARN: Code duplicated, block: B:397:0x0718  */
    /* JADX WARN: Code duplicated, block: B:398:0x071f  */
    /* JADX WARN: Code duplicated, block: B:401:0x0725  */
    /* JADX WARN: Code duplicated, block: B:402:0x0728  */
    /* JADX WARN: Code duplicated, block: B:404:0x072c  */
    /* JADX WARN: Code duplicated, block: B:405:0x0731  */
    /* JADX WARN: Code duplicated, block: B:408:0x0737  */
    /* JADX WARN: Code duplicated, block: B:411:0x073f  */
    /* JADX WARN: Code duplicated, block: B:413:0x0745  */
    /* JADX WARN: Code duplicated, block: B:414:0x0747  */
    /* JADX WARN: Code duplicated, block: B:416:0x074b  */
    /* JADX WARN: Code duplicated, block: B:419:0x0751  */
    /* JADX WARN: Code duplicated, block: B:420:0x0758  */
    /* JADX WARN: Code duplicated, block: B:426:0x0767  */
    /* JADX WARN: Code duplicated, block: B:429:0x077d  */
    /* JADX WARN: Code duplicated, block: B:430:0x0784  */
    /* JADX WARN: Code duplicated, block: B:638:0x0563 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x055c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:0x05b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:0x05a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:? A[LOOP:7: B:290:0x0593->B:643:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:0x05e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:0x05de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:? A[LOOP:8: B:300:0x05cb->B:646:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x026b  */
    /* JADX WARN: Instruction removed from duplicated block: B:278:0x052e, please report this as an issue */
    public d0t b(nas nasVar, z9s z9sVar, ril0 ril0Var, rho rhoVar, boolean z, boolean z2, List list, boolean z3, boolean z4) {
        List list2;
        las lasVar;
        ulk ulkVar;
        ArrayList arrayList;
        w9s w9sVar;
        BetGroupZip betGroupZip;
        xco xcoVar;
        ArrayList arrayList2;
        Integer numValueOf;
        BetZip betZipZ;
        long j;
        boolean z5;
        ArrayList arrayList3;
        Long l;
        las lasVar2;
        rqs rqsVar;
        pfs pfsVar;
        Object next;
        String str;
        List list3;
        String str2;
        String str3;
        Integer intOrNull;
        String str4;
        Double dI;
        boolean z6;
        List listJ;
        List list4;
        boolean z7;
        int i;
        int i2;
        boolean z8;
        List list5;
        int i3;
        boolean z9;
        int i4;
        boolean z10;
        int i5;
        boolean z11;
        jz10 jz10Var;
        Double d;
        double dDoubleValue;
        double dDoubleValue2;
        Double d2;
        Double d3;
        double dDoubleValue3;
        double dDoubleValue4;
        Double d4;
        String str5;
        se90 se90Var;
        int iIntValue;
        List list6;
        StringBuilder sb;
        int i6;
        String string;
        List listSplit$default;
        List listD0;
        List listSplit$default2;
        List listD1;
        boolean z12;
        List listO;
        ListIterator listIterator;
        ListIterator listIterator2;
        int i7;
        List list7;
        String str6;
        String str7;
        Integer num;
        int iIntValue2;
        String str8;
        String str9;
        List list8;
        Integer num2;
        int iIntValue3;
        Integer num3;
        int iIntValue4;
        int iIntValue5;
        vas vasVar;
        kts ktsVar;
        String str10;
        String str11;
        kts ktsVar2;
        String str12;
        String str13;
        Long l2;
        long jLongValue;
        int iIntValue6;
        Integer num4;
        int iIntValue7;
        String str14;
        String str15;
        List list9;
        List list10;
        Integer num5;
        boolean z13;
        Integer num6;
        int iIntValue8;
        boolean z14;
        Integer num7;
        int iIntValue9;
        boolean z15;
        Object next2;
        v7i v7iVar = this;
        String str16 = (String) v7iVar.o;
        x9s x9sVar = (x9s) v7iVar.c;
        byte b = 2;
        if (z2) {
            long j2 = nasVar.f23205a;
            x9sVar.getClass();
            str16.getClass();
            las lasVar3 = x9sVar.f40522a;
            lasVar3.getClass();
            lasVar3.f19719a.compute(str16, new kas(new a21((byte) 14, j2), b));
        }
        x9sVar.getClass();
        las lasVar4 = x9sVar.f40522a;
        str16.getClass();
        lasVar4.getClass();
        Map map = lasVar4.a(str16).f5766a;
        long j3 = nasVar.f23205a;
        long j4 = nasVar.x;
        w9s w9sVar2 = (w9s) map.get(new bds(j3));
        ulk ulkVar2 = (ulk) v7iVar.k;
        List<u9s> list11 = nasVar.p;
        int i8 = 10;
        if (list11 == null) {
            list2 = iun.f15405a;
        } else {
            ArrayList arrayList4 = new ArrayList();
            for (u9s u9sVar : list11) {
                List list12 = u9sVar.f35298a;
                Long l3 = u9sVar.b;
                if (list12 == null || l3 == null) {
                    lasVar = lasVar4;
                    ulkVar = ulkVar2;
                    arrayList = arrayList4;
                    w9sVar = w9sVar2;
                    betGroupZip = null;
                } else {
                    xco xcoVar2 = (xco) z9sVar.d.get(l3);
                    String str17 = xcoVar2 != null ? xcoVar2.b : null;
                    if (str17 == null || str17.length() == 0) {
                        ulkVar2.a();
                        xcoVar = null;
                    } else {
                        xcoVar = xcoVar2;
                    }
                    if (xcoVar != null) {
                        List<List> list13 = u9sVar.f35298a;
                        if (list13 != null) {
                            arrayList2 = new ArrayList(r3d.q(list13, i8));
                            for (List<v9s> list14 : list13) {
                                Boolean bool = u9sVar.c;
                                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                                j1q0 j1q0Var = (j1q0) v7iVar.b;
                                ArrayList arrayList5 = new ArrayList();
                                for (v9s v9sVar : list14) {
                                    las lasVar5 = lasVar4;
                                    Long l4 = l3;
                                    ulk ulkVar3 = ulkVar2;
                                    ueo ueoVar = (ueo) z9sVar.e.get(Long.valueOf(v9sVar.f37049a));
                                    if (ueoVar == null) {
                                        ulkVar3.a();
                                    }
                                    if (ueoVar != null) {
                                        sip sipVar = nasVar.r;
                                        long j5 = nasVar.f23205a;
                                        long j6 = nasVar.x;
                                        String str18 = xcoVar.b;
                                        String strA = ((us3) ((peg0) v7iVar.f).b).a();
                                        boolean zJ = j1q0Var.f15748a.j();
                                        if (j1q0Var.f15748a.f() || z4) {
                                            j = j6;
                                            z5 = true;
                                        } else {
                                            j = j6;
                                            z5 = false;
                                        }
                                        betZipZ = wha0.Z(v9sVar, ueoVar, zJ, sipVar, j5, j, str18, strA, z, zBooleanValue, w9sVar2, z9sVar, z3, z5);
                                    } else {
                                        xcoVar = xcoVar;
                                        j1q0Var = j1q0Var;
                                        betZipZ = null;
                                    }
                                    w9s w9sVar3 = w9sVar2;
                                    if (betZipZ != null) {
                                        arrayList5.add(betZipZ);
                                    }
                                    v7iVar = this;
                                    arrayList4 = arrayList4;
                                    xcoVar = xcoVar;
                                    u9sVar = u9sVar;
                                    j1q0Var = j1q0Var;
                                    w9sVar2 = w9sVar3;
                                    lasVar4 = lasVar5;
                                    ulkVar2 = ulkVar3;
                                    l3 = l4;
                                    z9sVar = z9sVar;
                                }
                                arrayList2.add(CollectionsKt.A0(arrayList5, new vvt((byte) 12)));
                                v7iVar = this;
                                xcoVar = xcoVar;
                                lasVar4 = lasVar4;
                                ulkVar2 = ulkVar2;
                                l3 = l3;
                                z9sVar = z9sVar;
                            }
                        } else {
                            arrayList2 = null;
                        }
                        lasVar = lasVar4;
                        Long l5 = l3;
                        ulkVar = ulkVar2;
                        xco xcoVar3 = xcoVar;
                        arrayList = arrayList4;
                        w9sVar = w9sVar2;
                        List list15 = arrayList2;
                        if (arrayList2 == null) {
                            list15 = iun.f15405a;
                        }
                        Iterator it = list15.iterator();
                        if (it.hasNext()) {
                            numValueOf = Integer.valueOf(((List) it.next()).size());
                            while (it.hasNext()) {
                                Integer numValueOf2 = Integer.valueOf(((List) it.next()).size());
                                if (numValueOf.compareTo(numValueOf2) < 0) {
                                    numValueOf = numValueOf2;
                                }
                            }
                        } else {
                            numValueOf = null;
                        }
                        int iIntValue10 = numValueOf != null ? numValueOf.intValue() : 0;
                        ArrayList arrayList6 = new ArrayList();
                        for (int i9 = 0; i9 < iIntValue10; i9++) {
                            Iterator it2 = list15.iterator();
                            while (it2.hasNext()) {
                                BetZip betZip = (BetZip) CollectionsKt.W(i9, (List) it2.next());
                                if (betZip != null) {
                                    arrayList6.add(betZip);
                                }
                            }
                        }
                        long jLongValue2 = l5.longValue();
                        int size = j4 == 40 ? arrayList6.size() : list15.size();
                        betGroupZip = new BetGroupZip(nasVar.x, jLongValue2, xcoVar3.b, (int) xcoVar3.c, size, arrayList6, cy2.A(arrayList6, (jLongValue2 == 1316 || jLongValue2 == 1315) ? BetViewType.b : BetViewType.f46430a, size));
                    } else {
                        lasVar = lasVar4;
                        ulkVar = ulkVar2;
                        arrayList = arrayList4;
                        w9sVar = w9sVar2;
                        betGroupZip = null;
                    }
                }
                if (betGroupZip != null) {
                    arrayList.add(betGroupZip);
                }
                v7iVar = this;
                arrayList4 = arrayList;
                w9sVar2 = w9sVar;
                str16 = str16;
                lasVar4 = lasVar;
                ulkVar2 = ulkVar;
                i8 = 10;
            }
            list2 = arrayList4;
        }
        String str19 = str16;
        las lasVar6 = lasVar4;
        w9s w9sVar4 = w9sVar2;
        List list16 = nasVar.o;
        if (list16 != null) {
            arrayList3 = new ArrayList(r3d.q(list16, 10));
            for (Iterator it3 = list16.iterator(); it3.hasNext(); it3 = it3) {
                arrayList3.add(b((nas) it3.next(), z9sVar, ril0Var, rhoVar, z, z2, list, z3, z4));
                j4 = j4;
            }
        } else {
            arrayList3 = null;
        }
        long j7 = j4;
        las lasVar7 = lasVar6;
        List list17 = arrayList3;
        if (arrayList3 == null) {
            list17 = iun.f15405a;
        }
        List list18 = list17;
        z9sVar.getClass();
        list2.getClass();
        list18.getClass();
        list.getClass();
        long j8 = nasVar.f23205a;
        Long l6 = nasVar.c;
        String str20 = nasVar.s;
        String str21 = nasVar.g;
        String str22 = nasVar.d;
        String str23 = str22 == null ? "" : str22;
        String str24 = nasVar.e;
        String str25 = str24 == null ? "" : str24;
        String str26 = nasVar.f;
        String str27 = str26 == null ? "" : str26;
        String str28 = str21 == null ? "" : str21;
        String str29 = nasVar.j;
        String str30 = str29 == null ? "" : str29;
        Integer num8 = nasVar.k;
        int iIntValue11 = num8 != null ? num8.intValue() : 0;
        Boolean bool2 = nasVar.l;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        String str31 = nasVar.m;
        String str32 = str31 == null ? "" : str31;
        iun iunVar = iun.f15405a;
        long j9 = nasVar.b;
        Long l7 = nasVar.q;
        long jLongValue3 = l7 != null ? l7.longValue() : 0L;
        String str33 = str20 == null ? "" : str20;
        tas tasVar = nasVar.t;
        if (tasVar != null) {
            ubr ubrVar = tasVar.s;
            Integer num9 = tasVar.k;
            List list19 = tasVar.d;
            Integer num10 = tasVar.g;
            List list20 = tasVar.n;
            int i10 = ubrVar.f35394a;
            ubr ubrVar2 = w9sVar4 != null ? w9sVar4.g : null;
            boolean z16 = (ubrVar2 == null || ubrVar.equals(ubrVar2)) ? false : true;
            if (list20 != null) {
                Iterator it4 = list20.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        list3 = list19;
                        lasVar2 = lasVar7;
                        next2 = null;
                        break;
                    }
                    next2 = it4.next();
                    list3 = list19;
                    lasVar2 = lasVar7;
                    if (((cmr) next2).f4620a == dmr.t) {
                        break;
                    }
                    list19 = list3;
                    lasVar7 = lasVar2;
                }
                cmr cmrVar = (cmr) next2;
                str2 = cmrVar != null ? cmrVar.b : null;
                if (str2 == null) {
                    str2 = "";
                }
                List listSplit$default3 = StringsKt__StringsKt.split$default(str2, new String[]{Separators.SEMICOLON}, false, 0, 6, null);
                str3 = (String) CollectionsKt.firstOrNull(listSplit$default3);
                if (str3 != null) {
                    intOrNull = StringsKt.toIntOrNull(str3);
                } else {
                    intOrNull = null;
                }
                str4 = (String) CollectionsKt.f0(listSplit$default3);
                if (str4 != null) {
                    dI = kotlin.text.b.i(str4);
                } else {
                    dI = null;
                }
                if (intOrNull != null || dI == null) {
                    z6 = true;
                    listJ = iun.f15405a;
                } else {
                    Double d5 = dI;
                    z6 = true;
                    listJ = q3d.j(Double.valueOf(intOrNull.intValue() == 1 ? d5.doubleValue() : 0.0d), Double.valueOf(intOrNull.intValue() == 2 ? d5.doubleValue() : 0.0d));
                }
                if (w9sVar4 != null) {
                    list4 = w9sVar4.d;
                } else {
                    list4 = null;
                }
                if (!listJ.isEmpty() || list4 == null || listJ.equals(list4)) {
                    z7 = false;
                } else {
                    z7 = z6;
                }
                if (!z16 || z7) {
                    i = ubrVar.b;
                    if (ubrVar2 != null) {
                        i2 = ubrVar2.f35394a;
                    } else {
                        i2 = 0;
                    }
                    if (i10 > i2) {
                        z8 = z6;
                    } else {
                        d3 = (Double) CollectionsKt.firstOrNull(listJ);
                        if (d3 != null) {
                            dDoubleValue3 = d3.doubleValue();
                        } else {
                            dDoubleValue3 = 0.0d;
                        }
                        if (list4 != null || (d4 = (Double) CollectionsKt.firstOrNull(list4)) == null) {
                            dDoubleValue4 = 0.0d;
                        } else {
                            dDoubleValue4 = d4.doubleValue();
                        }
                        if (dDoubleValue3 > dDoubleValue4) {
                            z8 = z6;
                        } else {
                            z8 = false;
                        }
                    }
                    list5 = listJ;
                    if (ubrVar2 != null) {
                        i3 = ubrVar2.f35394a;
                    } else {
                        i3 = 0;
                    }
                    if (i10 < i3) {
                        z9 = z6;
                    } else {
                        z9 = false;
                    }
                    if (ubrVar2 != null) {
                        i4 = ubrVar2.b;
                    } else {
                        i4 = 0;
                    }
                    if (i > i4) {
                        z10 = z6;
                    } else {
                        d = (Double) CollectionsKt.f0(list5);
                        if (d != null) {
                            dDoubleValue = d.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        if (list4 != null || (d2 = (Double) CollectionsKt.f0(list4)) == null) {
                            dDoubleValue2 = 0.0d;
                        } else {
                            dDoubleValue2 = d2.doubleValue();
                        }
                        if (dDoubleValue > dDoubleValue2) {
                            z10 = z6;
                        } else {
                            z10 = false;
                        }
                    }
                    if (ubrVar2 != null) {
                        i5 = ubrVar2.b;
                    } else {
                        i5 = 0;
                    }
                    if (i < i5) {
                        z11 = z6;
                    } else {
                        z11 = false;
                    }
                    jz10Var = new jz10(z8, z10, z9, z11);
                } else {
                    jz10Var = jz10.e;
                }
                if (w9sVar4 != null) {
                    str5 = w9sVar4.e;
                } else {
                    str5 = null;
                }
                se90Var = se90.e;
                if (str5 == null) {
                    l = l6;
                } else {
                    if (num10 != null) {
                        iIntValue = num10.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (list3 == null) {
                        list6 = iun.f15405a;
                    } else {
                        list6 = list3;
                    }
                    sb = new StringBuilder();
                    i6 = 0;
                    for (Object obj : list6) {
                        i7 = i6 + 1;
                        if (i6 >= 0) {
                            q3d.p();
                            throw null;
                        }
                        list7 = list6;
                        tf90 tf90Var = ((df90) obj).b;
                        Long l8 = l6;
                        sb.append(tf90Var.b + "-" + tf90Var.c);
                        if (i6 != list7.size() - 1) {
                            sb.append(", ");
                        }
                        list6 = list7;
                        l6 = l8;
                        i6 = i7;
                    }
                    l = l6;
                    string = sb.toString();
                    int i11 = gql0.f11739a;
                    if (iIntValue > 0) {
                        string = gql0.c(iIntValue, string);
                    }
                    boolean zEquals = str5.equals(string);
                    listSplit$default = StringsKt__StringsKt.split$default(str5, new String[]{Separators.COMMA}, false, 0, 6, null);
                    if (!listSplit$default.isEmpty()) {
                        listD0 = iun.f15405a;
                        break;
                    }
                    listIterator2 = listSplit$default.listIterator(listSplit$default.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            listD0 = iun.f15405a;
                            break;
                        }
                        if (((String) listIterator2.previous()).length() == 0) {
                            listD0 = CollectionsKt.D0(listSplit$default, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                    listSplit$default2 = StringsKt__StringsKt.split$default(string, new String[]{Separators.COMMA}, false, 0, 6, null);
                    if (!listSplit$default2.isEmpty()) {
                        listD1 = iun.f15405a;
                        break;
                    }
                    listIterator = listSplit$default2.listIterator(listSplit$default2.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            listD1 = iun.f15405a;
                            break;
                        }
                        if (((String) listIterator.previous()).length() == 0) {
                            listD1 = CollectionsKt.D0(listSplit$default2, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                    if (listD0.size() != listD1.size()) {
                        z12 = z6;
                    } else {
                        z12 = false;
                    }
                    List listO2 = m2x.o(listD0);
                    listO = m2x.o(listD1);
                    if (listO.size() == 2 || listO2.size() != 2 || zEquals || z12) {
                        se90Var = se90Var;
                    } else {
                        boolean zD = Intrinsics.d(CollectionsKt.W(0, listO2), CollectionsKt.W(0, listO));
                        boolean z17 = z6;
                        boolean zD2 = Intrinsics.d(CollectionsKt.W(z17 ? 1 : 0, listO2), CollectionsKt.W(z17 ? 1 : 0, listO));
                        double dS = m2x.s(0, listO);
                        double dS2 = m2x.s(z17 ? 1 : 0, listO);
                        double dS3 = m2x.s(0, listO2);
                        double dS4 = m2x.s(z17 ? 1 : 0, listO2);
                        se90Var = new se90(!zD && dS > dS3, !zD2 && dS2 > dS4, !zD && dS < dS3, !zD2 && dS2 < dS4);
                    }
                }
                str6 = tasVar.f33629a;
                if (str6 == null) {
                    str7 = "";
                } else {
                    str7 = str6;
                }
                num = tasVar.b;
                if (num != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                str8 = tasVar.c;
                if (str8 == null) {
                    str9 = "";
                } else {
                    str9 = str8;
                }
                if (list3 == null) {
                    list8 = iun.f15405a;
                } else {
                    list8 = list3;
                }
                num2 = tasVar.e;
                if (num2 != null) {
                    iIntValue3 = num2.intValue();
                } else {
                    iIntValue3 = 0;
                }
                num3 = tasVar.f;
                if (num3 != null) {
                    iIntValue4 = num3.intValue();
                } else {
                    iIntValue4 = 0;
                }
                if (num10 != null) {
                    iIntValue5 = num10.intValue();
                } else {
                    iIntValue5 = 0;
                }
                vasVar = tasVar.h;
                if (w9sVar4 != null) {
                    ktsVar = w9sVar4.f;
                } else {
                    ktsVar = null;
                }
                if (vasVar != null) {
                    str10 = vasVar.f37106a;
                } else {
                    str10 = null;
                }
                if (str10 == null) {
                    str10 = "";
                }
                if (vasVar != null) {
                    str11 = vasVar.b;
                } else {
                    str11 = null;
                }
                if (str11 == null) {
                    str11 = "";
                }
                if (ktsVar == null) {
                    ktsVar2 = new kts(str10, str11, false, false);
                } else {
                    ktsVar2 = new kts(str10, str11, f7k.W(str10, ktsVar.f18881a), f7k.W(str11, ktsVar.b));
                }
                str12 = tasVar.i;
                if (str12 == null) {
                    str13 = "";
                } else {
                    str13 = str12;
                }
                l2 = tasVar.j;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = 0;
                }
                if (num9 != null) {
                    iIntValue6 = num9.intValue();
                } else {
                    iIntValue6 = 0;
                }
                num4 = tasVar.l;
                if (num4 != null) {
                    iIntValue7 = num4.intValue();
                } else {
                    iIntValue7 = 0;
                }
                str14 = tasVar.m;
                if (str14 == null) {
                    str15 = "";
                } else {
                    str15 = str14;
                }
                if (list20 == null) {
                    list9 = iun.f15405a;
                } else {
                    list9 = list20;
                }
                list10 = tasVar.o;
                if (list10 == null) {
                    list10 = iun.f15405a;
                }
                List list21 = list10;
                num5 = tasVar.p;
                if (num5 != null) {
                    if (num5.intValue() > 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z13 = z15;
                } else {
                    z13 = false;
                }
                num6 = tasVar.q;
                if (num6 != null) {
                    iIntValue8 = num6.intValue();
                } else {
                    iIntValue8 = 0;
                }
                if (num9 == null && num9.intValue() == -1) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z18 = jz10Var.f17387a;
                boolean z19 = jz10Var.c;
                boolean z20 = jz10Var.b;
                boolean z21 = jz10Var.d;
                boolean z22 = se90Var.f32068a;
                boolean z23 = se90Var.b;
                boolean z24 = se90Var.c;
                boolean z25 = se90Var.d;
                num7 = tasVar.r;
                if (num7 != null) {
                    iIntValue9 = num7.intValue();
                } else {
                    iIntValue9 = 0;
                }
                rqsVar = new rqs(str7, iIntValue2, str9, list8, iIntValue3, iIntValue4, iIntValue5, ktsVar2, str13, jLongValue, iIntValue6, iIntValue7, str15, list9, list21, z13, iIntValue8, z22, z23, z18, z20, z24, z25, z19, z21, z14, iIntValue9, ubrVar);
            } else {
                list3 = list19;
                lasVar2 = lasVar7;
            }
            if (str2 == null) {
                str2 = "";
            }
            List listSplit$default4 = StringsKt__StringsKt.split$default(str2, new String[]{Separators.SEMICOLON}, false, 0, 6, null);
            str3 = (String) CollectionsKt.firstOrNull(listSplit$default4);
            if (str3 != null) {
                intOrNull = StringsKt.toIntOrNull(str3);
            } else {
                intOrNull = null;
            }
            str4 = (String) CollectionsKt.f0(listSplit$default4);
            if (str4 != null) {
                dI = kotlin.text.b.i(str4);
            } else {
                dI = null;
            }
            if (intOrNull != null) {
                z6 = true;
                listJ = iun.f15405a;
            } else {
                z6 = true;
                listJ = iun.f15405a;
            }
            if (w9sVar4 != null) {
                list4 = w9sVar4.d;
            } else {
                list4 = null;
            }
            if (listJ.isEmpty()) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (z16) {
                i = ubrVar.b;
                if (ubrVar2 != null) {
                    i2 = ubrVar2.f35394a;
                } else {
                    i2 = 0;
                }
                if (i10 > i2) {
                    z8 = z6;
                } else {
                    d3 = (Double) CollectionsKt.firstOrNull(listJ);
                    if (d3 != null) {
                        dDoubleValue3 = d3.doubleValue();
                    } else {
                        dDoubleValue3 = 0.0d;
                    }
                    if (list4 != null) {
                        dDoubleValue4 = 0.0d;
                    } else {
                        dDoubleValue4 = 0.0d;
                    }
                    if (dDoubleValue3 > dDoubleValue4) {
                        z8 = z6;
                    } else {
                        z8 = false;
                    }
                }
                list5 = listJ;
                if (ubrVar2 != null) {
                    i3 = ubrVar2.f35394a;
                } else {
                    i3 = 0;
                }
                if (i10 < i3) {
                    z9 = z6;
                } else {
                    z9 = false;
                }
                if (ubrVar2 != null) {
                    i4 = ubrVar2.b;
                } else {
                    i4 = 0;
                }
                if (i > i4) {
                    z10 = z6;
                } else {
                    d = (Double) CollectionsKt.f0(list5);
                    if (d != null) {
                        dDoubleValue = d.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    if (list4 != null) {
                        dDoubleValue2 = 0.0d;
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    if (dDoubleValue > dDoubleValue2) {
                        z10 = z6;
                    } else {
                        z10 = false;
                    }
                }
                if (ubrVar2 != null) {
                    i5 = ubrVar2.b;
                } else {
                    i5 = 0;
                }
                if (i < i5) {
                    z11 = z6;
                } else {
                    z11 = false;
                }
                jz10Var = new jz10(z8, z10, z9, z11);
            } else {
                i = ubrVar.b;
                if (ubrVar2 != null) {
                    i2 = ubrVar2.f35394a;
                } else {
                    i2 = 0;
                }
                if (i10 > i2) {
                    z8 = z6;
                } else {
                    d3 = (Double) CollectionsKt.firstOrNull(listJ);
                    if (d3 != null) {
                        dDoubleValue3 = d3.doubleValue();
                    } else {
                        dDoubleValue3 = 0.0d;
                    }
                    if (list4 != null) {
                        dDoubleValue4 = 0.0d;
                    } else {
                        dDoubleValue4 = 0.0d;
                    }
                    if (dDoubleValue3 > dDoubleValue4) {
                        z8 = z6;
                    } else {
                        z8 = false;
                    }
                }
                list5 = listJ;
                if (ubrVar2 != null) {
                    i3 = ubrVar2.f35394a;
                } else {
                    i3 = 0;
                }
                if (i10 < i3) {
                    z9 = z6;
                } else {
                    z9 = false;
                }
                if (ubrVar2 != null) {
                    i4 = ubrVar2.b;
                } else {
                    i4 = 0;
                }
                if (i > i4) {
                    z10 = z6;
                } else {
                    d = (Double) CollectionsKt.f0(list5);
                    if (d != null) {
                        dDoubleValue = d.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    if (list4 != null) {
                        dDoubleValue2 = 0.0d;
                    } else {
                        dDoubleValue2 = 0.0d;
                    }
                    if (dDoubleValue > dDoubleValue2) {
                        z10 = z6;
                    } else {
                        z10 = false;
                    }
                }
                if (ubrVar2 != null) {
                    i5 = ubrVar2.b;
                } else {
                    i5 = 0;
                }
                if (i < i5) {
                    z11 = z6;
                } else {
                    z11 = false;
                }
                jz10Var = new jz10(z8, z10, z9, z11);
            }
            if (w9sVar4 != null) {
                str5 = w9sVar4.e;
            } else {
                str5 = null;
            }
            se90Var = se90.e;
            if (str5 == null) {
                l = l6;
            } else {
                if (num10 != null) {
                    iIntValue = num10.intValue();
                } else {
                    iIntValue = 0;
                }
                if (list3 == null) {
                    list6 = iun.f15405a;
                } else {
                    list6 = list3;
                }
                sb = new StringBuilder();
                i6 = 0;
                while (r33.hasNext()) {
                    i7 = i6 + 1;
                    if (i6 >= 0) {
                        q3d.p();
                        throw null;
                    }
                    list7 = list6;
                    tf90 tf90Var2 = ((df90) obj).b;
                    Long l9 = l6;
                    sb.append(tf90Var2.b + "-" + tf90Var2.c);
                    if (i6 != list7.size() - 1) {
                        sb.append(", ");
                    }
                    list6 = list7;
                    l6 = l9;
                    i6 = i7;
                }
                l = l6;
                string = sb.toString();
                int i12 = gql0.f11739a;
                if (iIntValue > 0) {
                    string = gql0.c(iIntValue, string);
                }
                boolean zEquals2 = str5.equals(string);
                listSplit$default = StringsKt__StringsKt.split$default(str5, new String[]{Separators.COMMA}, false, 0, 6, null);
                if (!listSplit$default.isEmpty()) {
                    listD0 = iun.f15405a;
                    break;
                }
                listIterator2 = listSplit$default.listIterator(listSplit$default.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        listD0 = iun.f15405a;
                        break;
                    }
                    if (((String) listIterator2.previous()).length() == 0) {
                        listD0 = CollectionsKt.D0(listSplit$default, listIterator2.nextIndex() + 1);
                        break;
                    }
                }
                listSplit$default2 = StringsKt__StringsKt.split$default(string, new String[]{Separators.COMMA}, false, 0, 6, null);
                if (!listSplit$default2.isEmpty()) {
                    listD1 = iun.f15405a;
                    break;
                }
                listIterator = listSplit$default2.listIterator(listSplit$default2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        listD1 = iun.f15405a;
                        break;
                    }
                    if (((String) listIterator.previous()).length() == 0) {
                        listD1 = CollectionsKt.D0(listSplit$default2, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                if (listD0.size() != listD1.size()) {
                    z12 = z6;
                } else {
                    z12 = false;
                }
                List listO3 = m2x.o(listD0);
                listO = m2x.o(listD1);
                if (listO.size() == 2) {
                    se90Var = se90Var;
                } else {
                    se90Var = se90Var;
                }
            }
            str6 = tasVar.f33629a;
            if (str6 == null) {
                str7 = "";
            } else {
                str7 = str6;
            }
            num = tasVar.b;
            if (num != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = 0;
            }
            str8 = tasVar.c;
            if (str8 == null) {
                str9 = "";
            } else {
                str9 = str8;
            }
            if (list3 == null) {
                list8 = iun.f15405a;
            } else {
                list8 = list3;
            }
            num2 = tasVar.e;
            if (num2 != null) {
                iIntValue3 = num2.intValue();
            } else {
                iIntValue3 = 0;
            }
            num3 = tasVar.f;
            if (num3 != null) {
                iIntValue4 = num3.intValue();
            } else {
                iIntValue4 = 0;
            }
            if (num10 != null) {
                iIntValue5 = num10.intValue();
            } else {
                iIntValue5 = 0;
            }
            vasVar = tasVar.h;
            if (w9sVar4 != null) {
                ktsVar = w9sVar4.f;
            } else {
                ktsVar = null;
            }
            if (vasVar != null) {
                str10 = vasVar.f37106a;
            } else {
                str10 = null;
            }
            if (str10 == null) {
                str10 = "";
            }
            if (vasVar != null) {
                str11 = vasVar.b;
            } else {
                str11 = null;
            }
            if (str11 == null) {
                str11 = "";
            }
            if (ktsVar == null) {
                ktsVar2 = new kts(str10, str11, false, false);
            } else {
                ktsVar2 = new kts(str10, str11, f7k.W(str10, ktsVar.f18881a), f7k.W(str11, ktsVar.b));
            }
            str12 = tasVar.i;
            if (str12 == null) {
                str13 = "";
            } else {
                str13 = str12;
            }
            l2 = tasVar.j;
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            if (num9 != null) {
                iIntValue6 = num9.intValue();
            } else {
                iIntValue6 = 0;
            }
            num4 = tasVar.l;
            if (num4 != null) {
                iIntValue7 = num4.intValue();
            } else {
                iIntValue7 = 0;
            }
            str14 = tasVar.m;
            if (str14 == null) {
                str15 = "";
            } else {
                str15 = str14;
            }
            if (list20 == null) {
                list9 = iun.f15405a;
            } else {
                list9 = list20;
            }
            list10 = tasVar.o;
            if (list10 == null) {
                list10 = iun.f15405a;
            }
            List list22 = list10;
            num5 = tasVar.p;
            if (num5 != null) {
                if (num5.intValue() > 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z13 = z15;
            } else {
                z13 = false;
            }
            num6 = tasVar.q;
            if (num6 != null) {
                iIntValue8 = num6.intValue();
            } else {
                iIntValue8 = 0;
            }
            if (num9 == null) {
                z14 = false;
            } else {
                z14 = true;
            }
            boolean z110 = jz10Var.f17387a;
            boolean z111 = jz10Var.c;
            boolean z26 = jz10Var.b;
            boolean z27 = jz10Var.d;
            boolean z28 = se90Var.f32068a;
            boolean z29 = se90Var.b;
            boolean z210 = se90Var.c;
            boolean z211 = se90Var.d;
            num7 = tasVar.r;
            if (num7 != null) {
                iIntValue9 = num7.intValue();
            } else {
                iIntValue9 = 0;
            }
            rqsVar = new rqs(str7, iIntValue2, str9, list8, iIntValue3, iIntValue4, iIntValue5, ktsVar2, str13, jLongValue, iIntValue6, iIntValue7, str15, list9, list22, z13, iIntValue8, z28, z29, z110, z26, z210, z211, z111, z27, z14, iIntValue9, ubrVar);
        } else {
            l = l6;
            lasVar2 = lasVar7;
            rqsVar = new rqs("", 0, "", iunVar, 0, 0, 0, new kts("", "", false, false), "", 0L, 0, 0, "", iunVar, iunVar, false, 0, false, false, false, false, false, false, false, false, false, 0, new ubr(0, 0));
        }
        f0t f0tVarR0 = vzb.r0(nasVar.y);
        f0t f0tVarR1 = vzb.r0(nasVar.z);
        Long l10 = nasVar.u;
        long jLongValue4 = l10 != null ? l10.longValue() : 0L;
        Long l11 = nasVar.v;
        long jLongValue5 = l11 != null ? l11.longValue() : 0L;
        long j10 = nasVar.x;
        Long l12 = nasVar.w;
        long jLongValue6 = l12 != null ? l12.longValue() : 0L;
        List list23 = nasVar.B;
        if (list23 == null) {
            list23 = iun.f15405a;
        }
        List list24 = list23;
        long jLongValue7 = l != null ? l.longValue() : 0L;
        ufs ufsVar = nasVar.C;
        if (ufsVar != null) {
            String str34 = ufsVar.f35589a;
            String str35 = str34 == null ? "" : str34;
            String str36 = ufsVar.b;
            String str37 = str36 == null ? "" : str36;
            String str38 = ufsVar.c;
            String str39 = str38 == null ? "" : str38;
            String str40 = ufsVar.d;
            String str41 = str40 == null ? "" : str40;
            String str42 = ufsVar.e;
            String str43 = str42 == null ? "" : str42;
            String str44 = ufsVar.f;
            String str45 = str44 == null ? "" : str44;
            String str46 = ufsVar.g;
            pfsVar = new pfs(str35, str37, str39, str41, str43, str45, str46 == null ? "" : str46);
        } else {
            pfsVar = new pfs("", "", "", "", "", "", "");
        }
        Boolean bool3 = nasVar.D;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        Boolean bool4 = nasVar.E;
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        boolean zU = kpb.u(nasVar.r);
        boolean z30 = rhoVar.b;
        boolean z31 = rhoVar.f30500a;
        boolean zL = CollectionsKt.L(z9sVar.f44035a, l);
        boolean z32 = !(str21 == 0 || str21.length() == 0);
        Integer num11 = nasVar.i;
        boolean z33 = (num11 != null ? num11.intValue() : 0) > 0 && list.contains(Long.valueOf(j7));
        String strQ = Intrinsics.d(ril0Var != null ? Boolean.valueOf(ril0Var.e) : null, Boolean.TRUE) ? w6x.q(str20, ". ", str22) : str20 == null ? "" : str20;
        String str47 = (ril0Var == null || (str = ril0Var.b) == null) ? "-" : str;
        Long l13 = nasVar.F;
        long jLongValue8 = l13 != null ? l13.longValue() : 0L;
        Boolean bool5 = nasVar.G;
        boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : false;
        Integer num12 = nasVar.H;
        int iIntValue12 = num12 != null ? num12.intValue() : 0;
        boolean z34 = (w9sVar4 != null && w9sVar4.b) || !list2.isEmpty();
        Date date = new Date();
        String str48 = nasVar.I;
        String str49 = str48 == null ? "" : str48;
        String str50 = nasVar.J;
        String str51 = str50 == null ? "" : str50;
        Boolean bool6 = nasVar.h;
        boolean zBooleanValue6 = bool6 != null ? bool6.booleanValue() : false;
        boh bohVar = nasVar.K;
        Integer num13 = nasVar.L;
        d0t d0tVar = new d0t(j8, str23, str25, str27, str28, str30, iIntValue11, zBooleanValue2, str32, iunVar, list18, iunVar, j9, jLongValue3, str33, rqsVar, f0tVarR0, f0tVarR1, jLongValue4, jLongValue5, jLongValue6, j10, list24, jLongValue7, pfsVar, zBooleanValue3, bohVar, zBooleanValue4, zU, z30, zL, z31, z32, z33, str47, strQ, list2, jLongValue8, zBooleanValue5, z34, iIntValue12, date, str49, str51, zBooleanValue6, num13 != null ? num13.intValue() : 0);
        rqs rqsVar2 = rqsVar;
        if (z) {
            lasVar2.getClass();
            ArrayList<BetZip> arrayList7 = new ArrayList();
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                w3d.u(arrayList7, ((BetGroupZip) it5.next()).f);
            }
            int iA = wp20.a(r3d.q(arrayList7, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (BetZip betZip2 : arrayList7) {
                betZip2.getClass();
                linkedHashMap.put(new g97(gq80.f0(Long.valueOf(betZip2.f46426a), Long.valueOf(betZip2.c), Double.valueOf(betZip2.d), betZip2.t)), new zyc(betZip2.b, betZip2.v));
            }
            Iterator it6 = rqsVar2.n.iterator();
            do {
                if (!it6.hasNext()) {
                    next = null;
                    break;
                }
                next = it6.next();
            } while (((cmr) next).f4620a != dmr.t);
            cmr cmrVar2 = (cmr) next;
            String str52 = cmrVar2 != null ? cmrVar2.b : null;
            int i13 = 0;
            List listSplit$default5 = StringsKt__StringsKt.split$default(str52 != null ? str52 : "", new String[]{Separators.SEMICOLON}, false, 0, 6, null);
            String str53 = (String) CollectionsKt.firstOrNull(listSplit$default5);
            Integer intOrNull2 = str53 != null ? StringsKt.toIntOrNull(str53) : null;
            String str54 = (String) CollectionsKt.f0(listSplit$default5);
            Double dI2 = str54 != null ? kotlin.text.b.i(str54) : null;
            List listJ2 = (intOrNull2 == null || dI2 == null) ? iun.f15405a : q3d.j(Double.valueOf(intOrNull2.intValue() == 1 ? dI2.doubleValue() : 0.0d), Double.valueOf(intOrNull2.intValue() == 2 ? dI2.doubleValue() : 0.0d));
            StringBuilder sb2 = new StringBuilder();
            List list25 = rqsVar2.d;
            for (Object obj2 : list25) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    q3d.p();
                    throw null;
                }
                tf90 tf90Var3 = ((df90) obj2).b;
                sb2.append(tf90Var3.b + "-" + tf90Var3.c);
                if (i13 != list25.size() - 1) {
                    sb2.append(", ");
                }
                i13 = i14;
            }
            String string2 = sb2.toString();
            int i15 = gql0.f11739a;
            int i16 = rqsVar2.g;
            if (i16 > 0) {
                string2 = gql0.c(i16, string2);
            }
            w9s w9sVar5 = new w9s(linkedHashMap, d0tVar.N, rqsVar2.c, listJ2, string2, rqsVar2.h, rqsVar2.B);
            byte b2 = 3;
            lasVar2.f19719a.compute(str19, new kas(new ub4(d0tVar.f5282a, w9sVar5, b2), b2));
        }
        return d0tVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:27:0x0109  */
    /* JADX WARN: Code duplicated, block: B:30:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:36:0x0135  */
    /* JADX WARN: Code duplicated, block: B:42:0x0149  */
    /* JADX WARN: Code duplicated, block: B:45:0x0158  */
    /* JADX WARN: Code duplicated, block: B:52:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0162 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0109 -> B:13:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object c(java.util.List r22, a.z9s r23, boolean r24, java.util.List r25, boolean r26, boolean r27, boolean r28, a.zje r29) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.v7i.c(java.util.List, a.z9s, boolean, java.util.List, boolean, boolean, boolean, a.zje):java.lang.Object");
    }

    public wrh d() {
        return (wrh) ((n5d0) this.n).get();
    }

    public rus e() {
        iqt iqtVar = new iqt((gst0) this.l);
        lbu lbuVar = (lbu) this.f36925a;
        rmd0 rmd0Var = (rmd0) this.m;
        vpu vpuVarG = rmd0Var.g();
        x1x.x(vpuVarG);
        yk50 yk50VarD = rmd0Var.d();
        x1x.x(yk50VarD);
        return new rus(iqtVar, lbuVar, vpuVarG, yk50VarD, (h3c) this.e, (oeg0) this.f);
    }

    public uyn f() {
        qjg qjgVar = (qjg) this.c;
        knf0 knf0Var = (knf0) this.d;
        qjgVar.getClass();
        knf0Var.getClass();
        xex xexVar = new xex();
        xexVar.f40764a = qjgVar;
        xexVar.b = knf0Var;
        return new uyn(xexVar);
    }

    public qah g() {
        return (qah) ((n5d0) this.b).get();
    }

    public a7q h() {
        j3c j3cVarV = ((iip) this.k).V();
        x1x.x(j3cVarV);
        return new a7q(j3cVarV);
    }

    public reu i() {
        return new reu((njg) ((n5d0) this.o).get());
    }

    public wv70 j() {
        xnt xntVar = (xnt) this.i;
        wrt wrtVar = (wrt) this.g;
        pyg0 pyg0Var = (pyg0) this.e;
        riu riuVar = (riu) this.c;
        siu siuVar = (siu) this.d;
        gyt gytVar = (gyt) this.h;
        qyg0 qyg0Var = (qyg0) this.j;
        pru pruVar = (pru) this.k;
        grj grjVar = (grj) this.l;
        jlx jlxVar = (jlx) this.f36925a;
        nv20 nv20Var = (nv20) this.m;
        uzc0 uzc0Var = (uzc0) this.b;
        oeg0 oeg0Var = (oeg0) this.f;
        return new wv70(grjVar, xntVar, wrtVar, gytVar, (x0u) this.o, riuVar, siuVar, (bqu) this.n, pruVar, jlxVar, nv20Var, uzc0Var, oeg0Var, pyg0Var, qyg0Var);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c4  */
    public acu k(List list, boolean z, boolean z2) {
        Object g0g0Var;
        boolean z3;
        list.getClass();
        gst0 gst0Var = (gst0) this.f36925a;
        boolean zA = gst0Var.a();
        x9s x9sVar = (x9s) this.c;
        String str = (String) this.o;
        x9sVar.getClass();
        str.getClass();
        las lasVar = x9sVar.f40522a;
        lasVar.getClass();
        pas pasVar = lasVar.a(str).c;
        byte b = 0;
        byte b2 = 1;
        boolean z4 = pasVar.f26669a == list || !Intrinsics.d(pasVar.b, Boolean.valueOf(zA));
        pas pasVar2 = new pas(list, Boolean.valueOf(zA));
        lasVar.getClass();
        lasVar.f19719a.compute(str, new kas(new jar(pasVar2, (byte) 10), b2));
        hie0 hie0Var = new hie0();
        hie0Var.f13108a = true;
        nas nasVar = (nas) CollectionsKt.firstOrNull(list);
        sip sipVar = nasVar != null ? nasVar.r : null;
        if (z4) {
            z3 = true;
        } else {
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = Boolean.valueOf(gst0Var.d(sipVar == sip.c));
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            Object obj = Boolean.FALSE;
            if (g0g0Var instanceof g0g0) {
                g0g0Var = obj;
            }
            boolean zBooleanValue = ((Boolean) g0g0Var).booleanValue();
            lasVar.getClass();
            Boolean bool = (Boolean) lasVar.a(str).b.get(sipVar);
            boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
            lasVar.getClass();
            lasVar.f19719a.compute(str, new kas(new jv1((Object) sipVar, zBooleanValue, (byte) 23), b));
            if (zBooleanValue != zBooleanValue2) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        mie0 mie0Var = new mie0();
        mie0Var.f21842a = iun.f15405a;
        return new acu((gmq) ((n0o0) this.n).getValue(), mie0Var, hie0Var, this, list, z3, z, z2);
    }

    public dq00 l() {
        return new dq00(new nw20((q7d0) this.k, (vwb0) this.l), (us3) this.f36925a);
    }

    public vkr0 m() {
        mne mneVarH = ((psc) ((cad) this.h).b).h();
        x1x.x(mneVarH);
        return new vkr0(mneVarH, (btt0) this.k, new owp0((gii0) this.l), (gkr0) this.f36925a, (sd80) this.m, (knf0) this.f);
    }

    public pzu n() {
        return new pzu((btt0) this.i, (hqr0) this.e, (csr0) this.f, new epi0((gii0) this.j, (byte) 20), (knf0) this.k, (tgk) this.l);
    }

    public v7i(eu00 eu00Var, zx10 zx10Var, yox yoxVar, jfk jfkVar, zie0 zie0Var, epi0 epi0Var, lwf lwfVar, zm40 zm40Var, xre0 xre0Var, a93 a93Var, cge0 cge0Var, km50 km50Var, cgx0 cgx0Var, bek bekVar) {
        e6o0.f7295a.getClass();
        kld kldVar = d6o0.b;
        km50Var.getClass();
        kldVar.getClass();
        this.i = eu00Var;
        this.g = zx10Var;
        this.e = yoxVar;
        this.f = jfkVar;
        this.c = zie0Var;
        this.d = epi0Var;
        this.h = lwfVar;
        this.j = zm40Var;
        this.k = xre0Var;
        this.l = a93Var;
        this.f36925a = cge0Var;
        this.m = km50Var;
        this.b = cgx0Var;
        this.n = bekVar;
        this.o = kldVar;
    }

    public v7i(ctf0 ctf0Var, mne mneVar, m1e m1eVar, duj dujVar, rjo rjoVar, gii0 gii0Var, wxs0 wxs0Var, btt0 btt0Var, jh70 jh70Var, zn00 zn00Var, nr nrVar, s64 s64Var, sqx sqxVar, ii iiVar, wdk0 wdk0Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        gii0Var.getClass();
        btt0Var.getClass();
        iiVar.getClass();
        wdk0Var.getClass();
        this.c = ctf0Var;
        this.i = mneVar;
        this.d = m1eVar;
        this.g = dujVar;
        this.e = rjoVar;
        this.f = gii0Var;
        this.h = wxs0Var;
        this.j = btt0Var;
        this.k = jh70Var;
        this.l = zn00Var;
        this.f36925a = nrVar;
        this.m = s64Var;
        this.b = sqxVar;
        this.n = iiVar;
        this.o = wdk0Var;
    }

    public v7i(h9c h9cVar, qj9 qj9Var, m0o0 m0o0Var, peg0 peg0Var, x9s x9sVar, sjl0 sjl0Var, nvu nvuVar, edo edoVar, ulk ulkVar, zfo zfoVar, gst0 gst0Var, ehf0 ehf0Var, j1q0 j1q0Var) {
        x9sVar.getClass();
        sjl0Var.getClass();
        edoVar.getClass();
        zfoVar.getClass();
        gst0Var.getClass();
        j1q0Var.getClass();
        this.i = h9cVar;
        this.g = qj9Var;
        this.e = m0o0Var;
        this.f = peg0Var;
        this.c = x9sVar;
        this.d = sjl0Var;
        this.h = nvuVar;
        this.j = edoVar;
        this.k = ulkVar;
        this.l = zfoVar;
        this.f36925a = gst0Var;
        this.m = ehf0Var;
        this.b = j1q0Var;
        this.n = maz.b(new jcs(this, (byte) 21));
        this.o = axq.g();
    }

    public v7i(cad cadVar, pmi0 pmi0Var, nmo nmoVar, r9u r9uVar, i1w0 i1w0Var, ctf0 ctf0Var, pru pruVar, duj dujVar, String str, m1e m1eVar, uyu uyuVar, Long l, ocl oclVar, wyu wyuVar) {
        this.i = nmoVar;
        this.e = str;
        this.f = l;
        this.g = dujVar;
        this.k = oclVar;
        this.h = cadVar;
        this.f36925a = pmi0Var;
        this.m = pruVar;
        this.n = wyuVar;
        this.c = ctf0Var;
        this.j = uyuVar;
        this.d = m1eVar;
        this.b = i1w0Var;
        this.l = r9uVar;
        this.o = new ugi(this, (byte) 8);
    }

    public v7i(cad cadVar, ehf0 ehf0Var, oeg0 oeg0Var, vw3 vw3Var, duj dujVar, m1e m1eVar, ctf0 ctf0Var, ieu ieuVar, ntu ntuVar, wyu wyuVar, bzt bztVar, uyu uyuVar, r9u r9uVar, rl1 rl1Var) {
        this.i = rl1Var;
        this.g = dujVar;
        this.e = vw3Var;
        this.f = oeg0Var;
        this.c = ctf0Var;
        this.d = m1eVar;
        this.h = cadVar;
        this.j = uyuVar;
        this.k = bztVar;
        this.l = r9uVar;
        this.f36925a = ehf0Var;
        this.m = ieuVar;
        this.b = ntuVar;
        this.n = wyuVar;
        this.o = new t5i(this, (byte) 23);
    }

    public v7i(cad cadVar, pmi0 pmi0Var, r9u r9uVar, i1w0 i1w0Var, pru pruVar, gii0 gii0Var, ctf0 ctf0Var, String str, m1e m1eVar, uyu uyuVar, Long l, knf0 knf0Var, ocl oclVar, wyu wyuVar) {
        this.i = str;
        this.g = l;
        this.h = cadVar;
        this.c = ctf0Var;
        this.e = i1w0Var;
        this.f = gii0Var;
        this.k = knf0Var;
        this.f36925a = oclVar;
        this.d = m1eVar;
        this.j = uyuVar;
        this.m = pmi0Var;
        this.b = pruVar;
        this.n = wyuVar;
        this.l = r9uVar;
        this.o = new yei(this, (byte) 22);
    }

    public v7i(grj grjVar, xnt xntVar, wrt wrtVar, gyt gytVar, x0u x0uVar, riu riuVar, siu siuVar, bqu bquVar, pru pruVar, jlx jlxVar, nv20 nv20Var, uzc0 uzc0Var, oeg0 oeg0Var, pyg0 pyg0Var, qyg0 qyg0Var) {
        this.i = xntVar;
        this.g = wrtVar;
        this.e = pyg0Var;
        this.c = riuVar;
        this.d = siuVar;
        this.h = gytVar;
        this.j = qyg0Var;
        this.k = pruVar;
        this.l = grjVar;
        this.f36925a = jlxVar;
        this.m = nv20Var;
        this.b = uzc0Var;
        this.f = oeg0Var;
        this.n = bquVar;
        this.o = x0uVar;
    }

    public v7i(cad cadVar, pmi0 pmi0Var, i1w0 i1w0Var, wyu wyuVar, r9u r9uVar, gii0 gii0Var, ctf0 ctf0Var, String str, pru pruVar, m1e m1eVar, uyu uyuVar, Long l, knf0 knf0Var, ocl oclVar) {
        this.i = str;
        this.g = l;
        this.h = cadVar;
        this.e = i1w0Var;
        this.c = ctf0Var;
        this.f = gii0Var;
        this.k = knf0Var;
        this.f36925a = oclVar;
        this.d = m1eVar;
        this.m = pmi0Var;
        this.b = pruVar;
        this.j = uyuVar;
        this.n = wyuVar;
        this.l = r9uVar;
        this.o = new rki(this, (byte) 18);
    }

    public v7i(x860 x860Var, gii0 gii0Var, btt0 btt0Var, vwb0 vwb0Var, vby vbyVar, pmi pmiVar, bbw0 bbw0Var, ilp0 ilp0Var, mne mneVar, wdk0 wdk0Var, g2v g2vVar, ctf0 ctf0Var, i1w0 i1w0Var, i7u0 i7u0Var, q7u0 q7u0Var) {
        this.i = x860Var;
        this.g = i1w0Var;
        this.e = vbyVar;
        this.f = btt0Var;
        this.d = vwb0Var;
        this.h = gii0Var;
        this.j = pmiVar;
        this.k = bbw0Var;
        this.l = ilp0Var;
        this.f36925a = mneVar;
        this.m = g2vVar;
        this.c = ctf0Var;
        this.b = i7u0Var;
        this.n = q7u0Var;
        this.o = n0k0.a(new yxi(this, (byte) 16));
    }

    public v7i(cad cadVar, nh70 nh70Var, i1w0 i1w0Var, duj dujVar, String str, Long l, Integer num, ctf0 ctf0Var, m1e m1eVar, ocl oclVar, wyu wyuVar, knf0 knf0Var, gii0 gii0Var, uyu uyuVar, r9u r9uVar) {
        this.i = str;
        this.e = l;
        this.f = num;
        this.h = cadVar;
        this.k = i1w0Var;
        this.f36925a = oclVar;
        this.d = m1eVar;
        this.m = gii0Var;
        this.b = knf0Var;
        this.g = dujVar;
        this.n = wyuVar;
        this.j = uyuVar;
        this.l = r9uVar;
        this.c = ctf0Var;
        this.o = new tii(this, (byte) 23);
    }

    public v7i(cad cadVar, PickerDialogParams pickerDialogParams, ctf0 ctf0Var, pru pruVar, duj dujVar, yp90 yp90Var, imb imbVar, bot botVar, je jeVar, kt2 kt2Var, i1w0 i1w0Var, String str, AnalyticsEntryPoint analyticsEntryPoint, bzt bztVar) {
        this.i = pruVar;
        this.k = bztVar;
        this.c = ctf0Var;
        this.h = cadVar;
        this.e = yp90Var;
        this.f = imbVar;
        this.g = dujVar;
        this.d = pickerDialogParams;
        this.j = botVar;
        this.l = i1w0Var;
        this.f36925a = str;
        this.m = kt2Var;
        this.b = jeVar;
        this.n = analyticsEntryPoint;
        this.o = n0k0.a(new eni(this, (byte) 8));
    }

    public v7i(cad cadVar, pmi0 pmi0Var, gii0 gii0Var, String str, Long l, wyu wyuVar, uyu uyuVar, pru pruVar, r9u r9uVar, ctf0 ctf0Var, m1e m1eVar, i1w0 i1w0Var, ocl oclVar, knf0 knf0Var) {
        this.i = str;
        this.g = l;
        this.h = cadVar;
        this.e = gii0Var;
        this.f = knf0Var;
        this.k = pmi0Var;
        this.f36925a = pruVar;
        this.j = uyuVar;
        this.n = wyuVar;
        this.m = oclVar;
        this.c = ctf0Var;
        this.d = m1eVar;
        this.b = i1w0Var;
        this.l = r9uVar;
        this.o = new tii(this, (byte) 5);
    }

    public v7i(roi0 roi0Var, peg0 peg0Var, wsf0 wsf0Var, e41 e41Var, s31 s31Var, ih5 ih5Var, gg5 gg5Var, i1w0 i1w0Var, rqt rqtVar, mne mneVar, eqx eqxVar, v88 v88Var, duj dujVar, wdk0 wdk0Var, ctf0 ctf0Var, cmt cmtVar) {
        this.i = wsf0Var;
        this.e = v88Var;
        this.f = mneVar;
        this.g = dujVar;
        this.d = rqtVar;
        this.h = eqxVar;
        this.j = i1w0Var;
        this.k = roi0Var;
        this.l = s31Var;
        this.f36925a = gg5Var;
        this.m = ih5Var;
        this.b = e41Var;
        this.n = cmtVar;
        this.c = ctf0Var;
        this.o = n0k0.a(new rti(this, (byte) 28));
    }

    public v7i(cad cadVar, pyg pygVar, duj dujVar, kt2 kt2Var, g2v g2vVar, m1e m1eVar, n2u n2uVar, hvt hvtVar, poq0 poq0Var, CyberGamesPage cyberGamesPage, q8u q8uVar, cyg0 cyg0Var, pru pruVar, zr1 zr1Var) {
        this.i = cyberGamesPage;
        this.e = pygVar;
        this.f = n2uVar;
        this.g = dujVar;
        this.c = kt2Var;
        this.j = zr1Var;
        this.k = g2vVar;
        this.d = m1eVar;
        this.h = cadVar;
        this.l = hvtVar;
        this.f36925a = poq0Var;
        this.m = q8uVar;
        this.b = cyg0Var;
        this.n = pruVar;
        this.o = new uci(this, (byte) 26);
    }

    public v7i(ii iiVar, v88 v88Var, m1e m1eVar, mne mneVar, v6k v6kVar, bzt bztVar, r9u r9uVar, rou rouVar, atz atzVar, pv00 pv00Var, sa10 sa10Var, zx10 zx10Var, iw20 iw20Var, ctf0 ctf0Var, wdk0 wdk0Var, zas0 zas0Var, jau0 jau0Var) {
        this.c = ctf0Var;
        this.i = mneVar;
        this.g = zas0Var;
        this.d = m1eVar;
        this.l = r9uVar;
        this.e = rouVar;
        this.f = pv00Var;
        this.h = zx10Var;
        this.j = v88Var;
        this.f36925a = v6kVar;
        this.m = jau0Var;
        this.k = bztVar;
        this.b = sa10Var;
        this.n = iw20Var;
        this.o = n0k0.a(new yxi(this, (byte) 19));
    }

    public v7i(cad cadVar, d1p d1pVar, ii iiVar, Integer num, Long l, knf0 knf0Var, m1e m1eVar, gii0 gii0Var, ctf0 ctf0Var, g2v g2vVar, duj dujVar, i1w0 i1w0Var, aqp0 aqp0Var, yo4 yo4Var) {
        this.h = cadVar;
        this.i = num;
        this.e = l;
        this.d = m1eVar;
        this.g = dujVar;
        this.c = ctf0Var;
        this.f = g2vVar;
        this.j = aqp0Var;
        this.k = gii0Var;
        this.l = knf0Var;
        this.f36925a = i1w0Var;
        this.m = yo4Var;
        this.b = d1pVar;
        byte b = 9;
        this.n = n0k0.a(new msi(this, 1, b));
        this.o = n0k0.a(new msi(this, 0, b));
    }

    public v7i(wsf0 wsf0Var, cad cadVar, sa10 sa10Var, m1e m1eVar, duj dujVar, pru pruVar, wdk0 wdk0Var, i1w0 i1w0Var, ii iiVar, ctf0 ctf0Var, csr0 csr0Var, hqr0 hqr0Var, knf0 knf0Var, gii0 gii0Var, btt0 btt0Var, tgk tgkVar) {
        this.h = cadVar;
        this.c = ctf0Var;
        this.i = i1w0Var;
        this.e = csr0Var;
        this.f = gii0Var;
        this.j = knf0Var;
        this.k = sa10Var;
        this.d = m1eVar;
        this.g = dujVar;
        this.l = pruVar;
        this.f36925a = wsf0Var;
        this.m = btt0Var;
        this.b = hqr0Var;
        this.n = tgkVar;
        this.o = new yxi(this, (byte) 2);
    }

    public v7i(cad cadVar, b4j b4jVar, m1e m1eVar, duj dujVar, ii iiVar, i1w0 i1w0Var, wdk0 wdk0Var, b3c0 b3c0Var, btt0 btt0Var, knf0 knf0Var, gii0 gii0Var, ctf0 ctf0Var, pv00 pv00Var, x20 x20Var, bzt bztVar) {
        this.i = b3c0Var;
        this.e = knf0Var;
        this.f = btt0Var;
        this.j = gii0Var;
        this.l = pv00Var;
        this.f36925a = b4jVar;
        this.m = x20Var;
        this.k = bztVar;
        this.d = m1eVar;
        this.g = dujVar;
        this.h = cadVar;
        this.c = ctf0Var;
        this.b = i1w0Var;
        byte b = 12;
        this.n = mbl.b(new f7i(this, 1, b));
        this.o = new f7i(this, 0, b);
    }

    public v7i(cad cadVar, yox yoxVar, iw20 iw20Var, wdd0 wdd0Var, duj dujVar, ii iiVar, gst0 gst0Var, b3c0 b3c0Var, kt2 kt2Var, hru hruVar, us3 us3Var, q7d0 q7d0Var, vwb0 vwb0Var, wdk0 wdk0Var, ix0 ix0Var, us00 us00Var) {
        this.i = iw20Var;
        this.e = kt2Var;
        this.f = ix0Var;
        this.c = yoxVar;
        this.d = b3c0Var;
        this.j = gst0Var;
        this.h = cadVar;
        this.k = q7d0Var;
        this.l = vwb0Var;
        this.f36925a = us3Var;
        this.m = wdd0Var;
        this.b = us00Var;
        this.n = hruVar;
        this.g = dujVar;
        this.o = n0k0.a(new ppi(this, (byte) 6));
    }

    public v7i(cad cadVar, wsf0 wsf0Var, ii iiVar, gii0 gii0Var, sa10 sa10Var, m1e m1eVar, i1w0 i1w0Var, btt0 btt0Var, gkr0 gkr0Var, ctf0 ctf0Var, sd80 sd80Var, knf0 knf0Var, wdk0 wdk0Var, afm0 afm0Var, duj dujVar, wyu wyuVar, r9u r9uVar) {
        this.i = sa10Var;
        this.d = m1eVar;
        this.h = cadVar;
        this.e = afm0Var;
        this.f = knf0Var;
        this.j = wsf0Var;
        this.k = btt0Var;
        this.l = gii0Var;
        this.f36925a = gkr0Var;
        this.m = sd80Var;
        this.c = ctf0Var;
        this.b = i1w0Var;
        this.g = dujVar;
        this.n = wyuVar;
        this.o = new yxi(this, (byte) 1);
    }

    public v7i(cad cadVar, peg0 peg0Var, wsf0 wsf0Var, ii iiVar, v88 v88Var, duj dujVar, i1w0 i1w0Var, wdk0 wdk0Var, rou rouVar, ctf0 ctf0Var, lgn0 lgn0Var, csr0 csr0Var, hqr0 hqr0Var, knf0 knf0Var, gii0 gii0Var, btt0 btt0Var, tgk tgkVar, m1e m1eVar) {
        this.i = btt0Var;
        this.e = hqr0Var;
        this.f = csr0Var;
        this.j = gii0Var;
        this.k = knf0Var;
        this.l = tgkVar;
        this.f36925a = wsf0Var;
        this.m = v88Var;
        this.b = rouVar;
        this.g = dujVar;
        this.h = cadVar;
        this.c = ctf0Var;
        this.n = i1w0Var;
        this.d = m1eVar;
        this.o = n0k0.a(new tii(this, (byte) 14));
    }

    public v7i(iip iipVar, rmd0 rmd0Var, q7d0 q7d0Var, qjg qjgVar, h3c h3cVar, gii0 gii0Var, knf0 knf0Var, t0d t0dVar, x0t0 x0t0Var, lbu lbuVar, gst0 gst0Var, oeg0 oeg0Var) {
        this.i = gii0Var;
        this.g = q7d0Var;
        this.e = h3cVar;
        this.c = qjgVar;
        this.d = knf0Var;
        this.h = t0dVar;
        this.j = x0t0Var;
        this.k = iipVar;
        this.l = gst0Var;
        this.f36925a = lbuVar;
        this.m = rmd0Var;
        this.f = oeg0Var;
        byte b = 9;
        this.b = mbl.b(new dci(this, 0, b));
        this.n = mbl.b(new dci(this, 1, b));
        this.o = mbl.b(new dci(this, 2, b));
    }

    public v7i(cad cadVar, ehf0 ehf0Var, peg0 peg0Var, peg0 peg0Var2, ii iiVar, oeg0 oeg0Var, j1q0 j1q0Var, m1e m1eVar, vw3 vw3Var, duj dujVar, ntu ntuVar, pru pruVar, iqt iqtVar, wdk0 wdk0Var, ctf0 ctf0Var, gst0 gst0Var, ytt yttVar) {
        this.f36925a = ehf0Var;
        this.i = j1q0Var;
        this.b = ntuVar;
        this.j = pruVar;
        this.c = ctf0Var;
        this.k = iqtVar;
        this.d = m1eVar;
        this.e = vw3Var;
        this.f = oeg0Var;
        this.l = yttVar;
        this.g = dujVar;
        this.h = cadVar;
        this.m = gst0Var;
        byte b = 6;
        this.n = mbl.b(new f7i(this, 1, b));
        this.o = new f7i(this, 0, b);
    }
}
