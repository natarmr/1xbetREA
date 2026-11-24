package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class rld0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ sld0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rld0(sld0 sld0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = sld0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        sld0 sld0Var = this.k;
        switch (b) {
            case 0:
                return new rld0(sld0Var, yjeVar, (byte) 0);
            default:
                return new rld0(sld0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((rld0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0285 A[LOOP:11: B:100:0x027f->B:102:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:162:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x020a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0099  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:57:0x0132 A[LOOP:6: B:55:0x012c->B:57:0x0132, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x015f A[LOOP:7: B:59:0x0159->B:61:0x015f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x019e A[LOOP:8: B:63:0x0198->B:65:0x019e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:83:0x0217  */
    /* JADX WARN: Code duplicated, block: B:86:0x023e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0246  */
    /* JADX WARN: Code duplicated, block: B:90:0x024a  */
    /* JADX WARN: Code duplicated, block: B:91:0x024d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0250  */
    /* JADX WARN: Code duplicated, block: B:94:0x0253  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int iNextIndex;
        Integer numValueOf;
        int size;
        ArrayList<lev0> arrayList;
        ArrayList<lev0> arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Iterator it;
        boolean z;
        ArrayList arrayList6;
        Iterator it2;
        ArrayList arrayList7;
        Iterator it3;
        int size2;
        int size3;
        lc00 lc00VarB;
        ctf0 ctf0Var;
        ArrayList arrayList8;
        int i;
        ArrayList arrayList9;
        ArrayList arrayList10;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        boolean z5;
        nev0 nev0VarC;
        nev0 nev0VarC2;
        byte b = this.i;
        sld0 sld0Var = this.k;
        boolean z6 = true;
        switch (b) {
            case 0:
                sff0 sff0Var = sld0Var.l;
                ctf0 ctf0Var2 = sld0Var.g;
                wne wneVar = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    nr nrVar = sld0Var.i;
                    sff0 sff0VarA = ((pru) nrVar.d).a();
                    List listK = ((ocl) nrVar.b).k(sff0VarA);
                    List listA0 = CollectionsKt.A0(listK, new sr0(CollectionsKt.S0(((yfu) nrVar.c).i(sff0VarA)), listK, (byte) 2));
                    List listD0 = CollectionsKt.D0(listA0, 4);
                    int i5 = q3d.i(listD0);
                    ArrayList<lev0> arrayList11 = new ArrayList(r3d.q(listD0, 10));
                    int i6 = 0;
                    for (Object obj2 : listD0) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            q3d.p();
                            throw null;
                        }
                        arrayList11.add(hxm0.C((nev0) obj2, sff0Var.d.f27973a.b, ctf0Var2, i6 == i5, i6 == 0));
                        i6 = i7;
                    }
                    lc00 lc00VarB2 = kotlin.collections.a.b();
                    lc00VarB2.add(new dev0(ctf0Var2.f(R.string.active, new Object[0])));
                    lc00VarB2.addAll(arrayList11);
                    if (listA0.size() > 4) {
                        lc00VarB2.add(new dev0(ctf0Var2.f(R.string.inactive, new Object[0])));
                        List listO = CollectionsKt.O(listA0, 4);
                        int i8 = q3d.i(listO);
                        List listD1 = CollectionsKt.D0(listO, 4);
                        ArrayList arrayList12 = new ArrayList(r3d.q(listD1, 10));
                        int i9 = 0;
                        for (Object obj3 : listD1) {
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList12.add(hxm0.C((nev0) obj3, sff0Var.d.f27973a.b, ctf0Var2, i9 == i8, i9 == 0));
                            i9 = i10;
                        }
                        lc00VarB2.addAll(arrayList12);
                    }
                    lc00 lc00VarA = kotlin.collections.a.a(lc00VarB2);
                    sld0Var.m.addAll(lc00VarA);
                    p7m0 p7m0Var = sld0Var.j;
                    ArrayList arrayList13 = new ArrayList(r3d.q(arrayList11, 10));
                    for (lev0 lev0Var : arrayList11) {
                        lev0Var.getClass();
                        arrayList13.add(new kev0(lev0Var.f19924a, lev0Var.c, lev0Var.b));
                    }
                    old0 old0Var = new old0(lc00VarA, arrayList13);
                    this.j = true;
                    p7m0Var.getClass();
                    p7m0Var.o(null, old0Var);
                    if (Unit.f46060a == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    ArrayList arrayList14 = sld0Var.m;
                    ArrayList arrayList15 = sld0Var.m;
                    Iterator it4 = arrayList14.iterator();
                    int i11 = 0;
                    while (true) {
                        iNextIndex = -1;
                        if (!it4.hasNext()) {
                            i11 = -1;
                        } else if (!(((p6t0) it4.next()) instanceof dev0)) {
                            i11++;
                        }
                    }
                    ListIterator listIterator = arrayList14.listIterator(arrayList14.size());
                    while (listIterator.hasPrevious()) {
                        if (((p6t0) listIterator.previous()) instanceof dev0) {
                            iNextIndex = listIterator.nextIndex();
                            numValueOf = Integer.valueOf(iNextIndex);
                            if (iNextIndex == i11) {
                                numValueOf = null;
                            }
                            if (numValueOf != null) {
                                size = numValueOf.intValue();
                            } else {
                                size = arrayList14.size();
                            }
                            Integer numValueOf2 = Integer.valueOf(i11);
                            Integer numValueOf3 = Integer.valueOf(size);
                            int iIntValue = numValueOf2.intValue();
                            int iIntValue2 = numValueOf3.intValue();
                            List listSubList = arrayList15.subList(iIntValue, iIntValue2);
                            arrayList = new ArrayList();
                            for (Object obj4 : listSubList) {
                                if (obj4 instanceof lev0) {
                                    arrayList.add(obj4);
                                }
                            }
                            List listSubList2 = arrayList15.subList(iIntValue2, arrayList15.size());
                            arrayList2 = new ArrayList();
                            for (Object obj5 : listSubList2) {
                                if (obj5 instanceof lev0) {
                                    arrayList2.add(obj5);
                                }
                            }
                            ih5 ih5Var = sld0Var.e;
                            arrayList3 = new ArrayList();
                            for (lev0 lev0Var2 : arrayList) {
                                kys0 kys0Var = nev0.b;
                                byte b2 = lev0Var2.f19924a;
                                kys0Var.getClass();
                                nev0VarC2 = kys0.c(b2);
                                if (nev0VarC2 != null) {
                                    arrayList3.add(nev0VarC2);
                                }
                            }
                            arrayList4 = new ArrayList();
                            for (lev0 lev0Var3 : arrayList2) {
                                kys0 kys0Var2 = nev0.b;
                                byte b3 = lev0Var3.f19924a;
                                kys0Var2.getClass();
                                nev0VarC = kys0.c(b3);
                                if (nev0VarC != null) {
                                    arrayList4.add(nev0VarC);
                                }
                            }
                            ih5Var.getClass();
                            arrayList5 = new ArrayList(r3d.q(arrayList3, 10));
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                                arrayList5.add(pym0.o((nev0) it.next()).concat("_on"));
                                z6 = z6;
                            }
                            z = z6;
                            arrayList6 = new ArrayList(r3d.q(arrayList4, 10));
                            it2 = arrayList4.iterator();
                            while (it2.hasNext()) {
                                arrayList6.add(pym0.o((nev0) it2.next()).concat("_off"));
                            }
                            ih5Var.f14765a.a("widget_fastaccess_setup_change", wp20.b(new Pair("option", CollectionsKt.q0(arrayList5, arrayList6))));
                            ljf0 ljf0Var = sld0Var.c;
                            arrayList7 = new ArrayList(r3d.q(arrayList, 10));
                            it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                arrayList7.add(new Integer(((lev0) it3.next()).f19924a));
                            }
                            ljf0Var.c(arrayList7);
                            size2 = arrayList.size() - 1;
                            size3 = arrayList2.size() - 1;
                            lc00VarB = kotlin.collections.a.b();
                            ctf0Var = sld0Var.g;
                            lc00VarB.add(new dev0(ctf0Var.f(R.string.active, new Object[0])));
                            arrayList8 = new ArrayList(r3d.q(arrayList, 10));
                            i = 0;
                            for (Object obj6 : arrayList) {
                                i4 = i + 1;
                                if (i >= 0) {
                                    q3d.p();
                                    throw null;
                                }
                                lev0 lev0Var4 = (lev0) obj6;
                                if (i == 0) {
                                    z4 = z;
                                } else {
                                    z4 = false;
                                }
                                if (i == size2) {
                                    z5 = z;
                                } else {
                                    z5 = false;
                                }
                                arrayList8.add(lev0.c(lev0Var4, z4, z5));
                                i = i4;
                            }
                            lc00VarB.addAll(arrayList8);
                            if (!arrayList2.isEmpty()) {
                                lc00VarB.add(new dev0(ctf0Var.f(R.string.inactive, new Object[0])));
                                arrayList10 = new ArrayList(r3d.q(arrayList2, 10));
                                i2 = 0;
                                for (Object obj7 : arrayList2) {
                                    i3 = i2 + 1;
                                    if (i2 >= 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    lev0 lev0Var5 = (lev0) obj7;
                                    if (i2 == 0) {
                                        z2 = z;
                                    } else {
                                        z2 = false;
                                    }
                                    if (i2 == size3) {
                                        z3 = z;
                                    } else {
                                        z3 = false;
                                    }
                                    arrayList10.add(lev0.c(lev0Var5, z2, z3));
                                    i2 = i3;
                                }
                                lc00VarB.addAll(arrayList10);
                            }
                            lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB);
                            arrayList15.clear();
                            arrayList15.addAll(lc00VarA2);
                            p7m0 p7m0Var2 = sld0Var.j;
                            arrayList9 = new ArrayList(r3d.q(arrayList, 10));
                            for (lev0 lev0Var6 : arrayList) {
                                lev0Var6.getClass();
                                arrayList9.add(new kev0(lev0Var6.f19924a, lev0Var6.c, lev0Var6.b));
                            }
                            old0 old0Var2 = new old0(lc00VarA2, arrayList9);
                            this.j = z;
                            p7m0Var2.getClass();
                            p7m0Var2.o(null, old0Var2);
                            if (Unit.f46060a == wneVar2) {
                                return wneVar2;
                            }
                        }
                    }
                    numValueOf = Integer.valueOf(iNextIndex);
                    if (iNextIndex == i11) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        size = numValueOf.intValue();
                    } else {
                        size = arrayList14.size();
                    }
                    Integer numValueOf4 = Integer.valueOf(i11);
                    Integer numValueOf5 = Integer.valueOf(size);
                    int iIntValue3 = numValueOf4.intValue();
                    int iIntValue4 = numValueOf5.intValue();
                    List listSubList3 = arrayList15.subList(iIntValue3, iIntValue4);
                    arrayList = new ArrayList();
                    while (r11.hasNext()) {
                        if (obj4 instanceof lev0) {
                            arrayList.add(obj4);
                        }
                    }
                    List listSubList4 = arrayList15.subList(iIntValue4, arrayList15.size());
                    arrayList2 = new ArrayList();
                    while (r4.hasNext()) {
                        if (obj5 instanceof lev0) {
                            arrayList2.add(obj5);
                        }
                    }
                    ih5 ih5Var2 = sld0Var.e;
                    arrayList3 = new ArrayList();
                    while (r14.hasNext()) {
                        kys0 kys0Var3 = nev0.b;
                        byte b4 = lev0Var2.f19924a;
                        kys0Var3.getClass();
                        nev0VarC2 = kys0.c(b4);
                        if (nev0VarC2 != null) {
                            arrayList3.add(nev0VarC2);
                        }
                    }
                    arrayList4 = new ArrayList();
                    while (r15.hasNext()) {
                        kys0 kys0Var4 = nev0.b;
                        byte b5 = lev0Var3.f19924a;
                        kys0Var4.getClass();
                        nev0VarC = kys0.c(b5);
                        if (nev0VarC != null) {
                            arrayList4.add(nev0VarC);
                        }
                    }
                    ih5Var2.getClass();
                    arrayList5 = new ArrayList(r3d.q(arrayList3, 10));
                    it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList5.add(pym0.o((nev0) it.next()).concat("_on"));
                        z6 = z6;
                    }
                    z = z6;
                    arrayList6 = new ArrayList(r3d.q(arrayList4, 10));
                    it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        arrayList6.add(pym0.o((nev0) it2.next()).concat("_off"));
                    }
                    ih5Var2.f14765a.a("widget_fastaccess_setup_change", wp20.b(new Pair("option", CollectionsKt.q0(arrayList5, arrayList6))));
                    ljf0 ljf0Var2 = sld0Var.c;
                    arrayList7 = new ArrayList(r3d.q(arrayList, 10));
                    it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList7.add(new Integer(((lev0) it3.next()).f19924a));
                    }
                    ljf0Var2.c(arrayList7);
                    size2 = arrayList.size() - 1;
                    size3 = arrayList2.size() - 1;
                    lc00VarB = kotlin.collections.a.b();
                    ctf0Var = sld0Var.g;
                    lc00VarB.add(new dev0(ctf0Var.f(R.string.active, new Object[0])));
                    arrayList8 = new ArrayList(r3d.q(arrayList, 10));
                    i = 0;
                    while (r14.hasNext()) {
                        i4 = i + 1;
                        if (i >= 0) {
                            q3d.p();
                            throw null;
                        }
                        lev0 lev0Var7 = (lev0) obj6;
                        if (i == 0) {
                            z4 = z;
                        } else {
                            z4 = false;
                        }
                        if (i == size2) {
                            z5 = z;
                        } else {
                            z5 = false;
                        }
                        arrayList8.add(lev0.c(lev0Var7, z4, z5));
                        i = i4;
                    }
                    lc00VarB.addAll(arrayList8);
                    if (!arrayList2.isEmpty()) {
                        lc00VarB.add(new dev0(ctf0Var.f(R.string.inactive, new Object[0])));
                        arrayList10 = new ArrayList(r3d.q(arrayList2, 10));
                        i2 = 0;
                        while (r3.hasNext()) {
                            i3 = i2 + 1;
                            if (i2 >= 0) {
                                q3d.p();
                                throw null;
                            }
                            lev0 lev0Var8 = (lev0) obj7;
                            if (i2 == 0) {
                                z2 = z;
                            } else {
                                z2 = false;
                            }
                            if (i2 == size3) {
                                z3 = z;
                            } else {
                                z3 = false;
                            }
                            arrayList10.add(lev0.c(lev0Var8, z2, z3));
                            i2 = i3;
                        }
                        lc00VarB.addAll(arrayList10);
                    }
                    lc00 lc00VarA3 = kotlin.collections.a.a(lc00VarB);
                    arrayList15.clear();
                    arrayList15.addAll(lc00VarA3);
                    p7m0 p7m0Var3 = sld0Var.j;
                    arrayList9 = new ArrayList(r3d.q(arrayList, 10));
                    while (r5.hasNext()) {
                        lev0Var6.getClass();
                        arrayList9.add(new kev0(lev0Var6.f19924a, lev0Var6.c, lev0Var6.b));
                    }
                    old0 old0Var3 = new old0(lc00VarA3, arrayList9);
                    this.j = z;
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, old0Var3);
                    if (Unit.f46060a == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
