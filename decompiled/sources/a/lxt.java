package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class lxt extends bnn0 implements zdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lxt(Object obj, yje yjeVar, byte b) {
        super(5, yjeVar);
        this.i = b;
        this.n = obj;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.i;
        Object obj6 = this.n;
        switch (b) {
            case 0:
                Object obj7 = ((j0g0) obj).f15681a;
                Object obj8 = ((j0g0) obj2).f15681a;
                Object obj9 = ((j0g0) obj3).f15681a;
                Object obj10 = ((j0g0) obj4).f15681a;
                lxt lxtVar = new lxt((ypl0) obj6, (yje) obj5, (byte) 0);
                lxtVar.j = obj7;
                lxtVar.k = obj8;
                lxtVar.l = obj9;
                lxtVar.m = obj10;
                return lxtVar.invokeSuspend(Unit.f46060a);
            case 1:
                Object obj11 = ((j0g0) obj).f15681a;
                Object obj12 = ((j0g0) obj2).f15681a;
                lxt lxtVar2 = new lxt((rrd) obj6, (yje) obj5, (byte) 1);
                lxtVar2.j = obj11;
                lxtVar2.k = obj12;
                lxtVar2.l = (List) obj3;
                lxtVar2.m = (List) obj4;
                return lxtVar2.invokeSuspend(Unit.f46060a);
            case 2:
                lxt lxtVar3 = new lxt((wdu) obj6, (yje) obj5, (byte) 2);
                lxtVar3.j = (List) obj;
                lxtVar3.k = (List) obj2;
                lxtVar3.l = (List) obj3;
                lxtVar3.m = (List) obj4;
                return lxtVar3.invokeSuspend(Unit.f46060a);
            case 3:
                lxt lxtVar4 = new lxt((xzp) obj6, (yje) obj5, (byte) 3);
                lxtVar4.j = (List) obj;
                lxtVar4.k = (HashMap) obj2;
                lxtVar4.l = (List) obj3;
                lxtVar4.m = (List) obj4;
                return lxtVar4.invokeSuspend(Unit.f46060a);
            default:
                lxt lxtVar5 = new lxt((g9b0) obj6, (yje) obj5, (byte) 4);
                lxtVar5.j = (q8b0) obj;
                lxtVar5.k = (q8b0) obj2;
                lxtVar5.l = (q8b0) obj3;
                lxtVar5.m = (q8b0) obj4;
                return lxtVar5.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0342  */
    /* JADX WARN: Code duplicated, block: B:130:0x0352  */
    /* JADX WARN: Code duplicated, block: B:133:0x0363  */
    /* JADX WARN: Code duplicated, block: B:135:0x037c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0389  */
    /* JADX WARN: Code duplicated, block: B:143:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:149:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:245:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:394:0x037f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x03af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x039a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x03bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v80, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v81, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v82, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v83 */
    /* JADX WARN: Type inference failed for: r3v44, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v60, types: [java.util.ArrayList] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i;
        Boolean bool;
        Object obj2;
        g570 g570Var;
        Object obj3;
        zab zabVar;
        ?? arrayList;
        int iIndexOf;
        String strF;
        List list;
        Object pv60Var;
        Object qv60Var;
        y4t y4tVar;
        Object sv60Var;
        ?? arrayList2;
        String str;
        ArrayList arrayList3;
        Iterator it;
        fis fisVarA;
        String str2;
        Iterator it2;
        ArrayList arrayList4;
        byte b = this.i;
        Object obj4 = this.n;
        switch (b) {
            case 0:
                Object obj5 = this.j;
                Object obj6 = this.k;
                Object obj7 = this.l;
                Object obj8 = this.m;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return new jkb(obj5, obj6, obj7, obj8, (ypl0) obj4);
            case 1:
                Object obj9 = this.j;
                Object obj10 = this.k;
                List list2 = (List) this.l;
                List list3 = (List) this.m;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return new edw(rrd.E(obj9, list2, list3), rrd.E(obj10, list2, list3));
            case 2:
                List list4 = (List) this.j;
                List list5 = (List) this.k;
                List list6 = (List) this.l;
                List list7 = (List) this.m;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                lc00 lc00VarB = kotlin.collections.a.b();
                nw80 nw80Var = nw80.b;
                long id = nw80Var.getId();
                fza0 fza0Var = fza0.f;
                iun iunVar = iun.f15405a;
                lc00VarB.add(new gza0(id, "", list4, fza0Var, iunVar, false));
                nw80 nw80Var2 = nw80.f24223a;
                lc00VarB.add(new gza0(nw80Var2.getId(), "", list5, fza0.b, iunVar, false));
                lc00VarB.add(new gza0(nw80Var.getId(), "", list6, fza0.d, iunVar, false));
                lc00VarB.add(new gza0(nw80Var2.getId(), "", list7, fza0.e, iunVar, false));
                lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                ArrayList arrayList5 = new ArrayList();
                ListIterator listIterator = lc00VarA.listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        return arrayList5;
                    }
                    Object next = pawVar.next();
                    if (!((gza0) next).c.isEmpty()) {
                        arrayList5.add(next);
                    }
                }
                break;
            case 3:
                xzp xzpVar = (xzp) obj4;
                uyn uynVar = (uyn) xzpVar.e;
                List list8 = (List) this.j;
                HashMap map = (HashMap) this.k;
                List list9 = (List) this.l;
                List list10 = (List) this.m;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList6 = new ArrayList(r3d.q(list8, 10));
                Iterator it3 = list8.iterator();
                while (it3.hasNext()) {
                    ggx ggxVar = (ggx) it3.next();
                    long j = ggxVar.b;
                    String str3 = ggxVar.f;
                    Boolean bool2 = (Boolean) map.get(j + str3);
                    boolean zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
                    list9.getClass();
                    list10.getClass();
                    ArrayList<List> arrayList7 = ggxVar.f11272a;
                    long j2 = ggxVar.d;
                    int i2 = 10;
                    ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                    for (List list11 : arrayList7) {
                        Iterator it4 = it3;
                        ArrayList arrayList9 = new ArrayList(r3d.q(list11, i2));
                        Iterator it5 = list11.iterator();
                        int i3 = 0;
                        while (it5.hasNext()) {
                            Object next2 = it5.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            vr20 vr20Var = (vr20) next2;
                            arrayList9.add(tlb.h0(vr20Var, m2x.v(list9, vr20Var, j2), m2x.v(list10, vr20Var, j2), uyc.IDLE));
                            it5 = it5;
                            i3 = i4;
                            list10 = list10;
                        }
                        arrayList8.add(arrayList9);
                        it3 = it4;
                        i2 = 10;
                    }
                    arrayList6.add(new nu20(arrayList8, ggxVar.b, ggxVar.c, str3, zBooleanValue, ggxVar.e, ggxVar.d));
                    it3 = it3;
                    list10 = list10;
                }
                HashSet hashSet = new HashSet();
                Iterator it6 = arrayList6.iterator();
                while (it6.hasNext()) {
                    hashSet.add(xzp.R((nu20) it6.next()));
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str4 = (String) entry.getKey();
                    if (((Boolean) entry.getValue()).booleanValue() && !hashSet.contains(str4)) {
                        str4.getClass();
                        ((ino) uynVar.f36498a).f15084a.a(str4, false);
                    }
                }
                if (!((ino) ((yfu) xzpVar.f).f42558a).f15084a.b) {
                    Iterable iterableS0 = CollectionsKt.S0(arrayList6);
                    if (!(iterableS0 instanceof Collection) || !((Collection) iterableS0).isEmpty()) {
                        Iterator it7 = iterableS0.iterator();
                        do {
                            iil iilVar = (iil) it7;
                            if (iilVar.b.hasNext()) {
                                IndexedValue indexedValue = (IndexedValue) iilVar.next();
                                i = indexedValue.f46061a;
                                bool = (Boolean) map.get(xzp.R((nu20) indexedValue.b));
                            }
                        } while ((bool != null ? bool.booleanValue() : false) == (i < 3));
                        int i5 = 0;
                        for (Object obj11 : arrayList6) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            ((ino) uynVar.f36498a).f15084a.a(xzp.R((nu20) obj11), i5 < 3);
                            i5 = i6;
                        }
                    }
                }
                return arrayList6;
            default:
                q8b0 q8b0Var = (q8b0) this.j;
                q8b0 q8b0Var2 = (q8b0) this.k;
                q8b0 q8b0Var3 = (q8b0) this.l;
                q8b0 q8b0Var4 = (q8b0) this.m;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                g9b0 g9b0Var = (g9b0) obj4;
                p7m0 p7m0Var = g9b0Var.F;
                if (p7m0Var.getValue() instanceof t8b0) {
                    Object value = p7m0Var.getValue();
                    value.getClass();
                    if (((t8b0) value).c) {
                        return iun.f15405a;
                    }
                }
                if (q8b0Var2 != null) {
                    if (q8b0Var2 instanceof n8b0) {
                        if (!(p7m0Var.getValue() instanceof t8b0)) {
                            g9b0Var.G(false);
                        }
                        return iun.f15405a;
                    }
                    if (q8b0Var2 instanceof m8b0) {
                        if (!(p7m0Var.getValue() instanceof t8b0)) {
                            g9b0Var.G(true);
                        }
                        return iun.f15405a;
                    }
                }
                if ((q8b0Var2 instanceof p8b0) && !(q8b0Var instanceof m8b0)) {
                    p7m0Var.getClass();
                    p7m0Var.o(null, u8b0.f35225a);
                }
                boolean z = q8b0Var instanceof p8b0;
                x2y x2yVar = x2y.f40193a;
                l8b0 l8b0Var = l8b0.f19596a;
                if (z) {
                    obj2 = (y2y) ((p8b0) q8b0Var).f26546a;
                } else if ((q8b0Var instanceof m8b0) || Intrinsics.d(q8b0Var, l8b0Var)) {
                    obj2 = w2y.f38473a;
                } else {
                    if (!(q8b0Var instanceof n8b0) && !Intrinsics.d(q8b0Var, o8b0.f24822a)) {
                        t9f.b();
                        return null;
                    }
                    obj2 = x2yVar;
                }
                if (q8b0Var2 == null) {
                    g570Var = e570.f7219a;
                } else if (q8b0Var2 instanceof p8b0) {
                    g570Var = (g570) ((p8b0) q8b0Var2).f26546a;
                } else if (q8b0Var2 instanceof o8b0) {
                    g570Var = f570.f8947a;
                } else {
                    g570Var = e570.f7219a;
                }
                if (q8b0Var3 instanceof p8b0) {
                    obj3 = (oo10) ((p8b0) q8b0Var3).f26546a;
                } else if ((q8b0Var3 instanceof m8b0) || Intrinsics.d(q8b0Var3, l8b0Var) || (q8b0Var3 instanceof n8b0)) {
                    obj3 = mo10.f22114a;
                } else {
                    if (!(q8b0Var3 instanceof o8b0)) {
                        t9f.b();
                        return null;
                    }
                    obj3 = no10.f23848a;
                }
                if (q8b0Var4 instanceof p8b0) {
                    zabVar = (zab) ((p8b0) q8b0Var4).f26546a;
                } else if ((q8b0Var4 instanceof n8b0) || Intrinsics.d(q8b0Var4, m8b0.f21362a)) {
                    zabVar = xab.f40545a;
                } else if (q8b0Var4 instanceof l8b0) {
                    zabVar = wab.f38817a;
                } else {
                    if (!(q8b0Var4 instanceof o8b0)) {
                        t9f.b();
                        return null;
                    }
                    zabVar = yab.f42286a;
                }
                c8b0 c8b0Var = g9b0Var.u;
                c8b0Var.getClass();
                lc00 lc00VarB2 = kotlin.collections.a.b();
                if (g570Var instanceof d570) {
                    boolean z2 = obj2 instanceof w2y;
                    if (z2 || (zabVar instanceof wab)) {
                        g5s g5sVar = g5s.Circle;
                        lc00VarB2.add(new pct());
                    } else {
                        d570 d570Var = (d570) g570Var;
                        List list12 = d570Var.f5491a;
                        ctf0 ctf0Var = c8b0Var.c;
                        lc00 lc00VarB3 = kotlin.collections.a.b();
                        boolean z3 = zabVar instanceof vab;
                        if (z3) {
                            List list13 = ((vab) zabVar).f37077a;
                            if (list13.size() == 1) {
                                nek nekVar = y4t.c;
                                sv60Var = new tv60(new nrv(ctf0Var.b.a(R.string.popular_games_in_center_of_attention, Arrays.copyOf(new Object[0], 0)), false, null, null, null, null, null, 254), new rv60(new rvy(x1x.D(((uab) CollectionsKt.U(list13)).f35321a.b), new n0x(((uab) CollectionsKt.U(list13)).f35321a.d.f12884a), new n0x(azw.R(((uab) CollectionsKt.U(list13)).f35321a.d.f12884a)), ((uab) CollectionsKt.U(list13)).f35321a.f22638a), zvw.b0(((uab) CollectionsKt.U(list13)).f35321a, ((uab) CollectionsKt.U(list13)).b)));
                            } else {
                                nek nekVar2 = y4t.c;
                                nrv nrvVar = new nrv(ctf0Var.b.a(R.string.popular_games_in_center_of_attention, Arrays.copyOf(new Object[0], 0)), false, null, null, null, null, null, 254);
                                int size = list13.size();
                                ArrayList arrayList10 = new ArrayList(size);
                                int i7 = 0;
                                while (i7 < size) {
                                    arrayList10.add(new rv60(new rvy(x1x.D(((uab) list13.get(i7)).f35321a.b), new n0x(((uab) list13.get(i7)).f35321a.d.f12884a), new n0x(azw.R(((uab) list13.get(i7)).f35321a.d.f12884a)), ((uab) list13.get(i7)).f35321a.f22638a), zvw.b0(((uab) list13.get(i7)).f35321a, ((uab) list13.get(i7)).b)));
                                    i7++;
                                    size = size;
                                }
                                sv60Var = new sv60(nrvVar, arrayList10);
                            }
                            lc00VarB3.add(sv60Var);
                            ArrayList arrayList11 = new ArrayList(r3d.q(list13, 10));
                            Iterator it8 = list13.iterator();
                            while (it8.hasNext()) {
                                arrayList11.add(((uab) it8.next()).b);
                            }
                            ArrayList arrayList12 = new ArrayList(r3d.q(list13, 10));
                            Iterator it9 = list13.iterator();
                            while (it9.hasNext()) {
                                arrayList12.add(Long.valueOf(x1x.D(((uab) it9.next()).f35321a.b)));
                            }
                            if (arrayList11.isEmpty()) {
                                arrayList2 = new ArrayList();
                                for (Object obj12 : list12) {
                                    str = ((fis) obj12).b;
                                    nek nekVar3 = y4t.c;
                                    if (!Intrinsics.d(str, "160291")) {
                                        arrayList2.add(obj12);
                                    }
                                }
                            } else {
                                Iterator it10 = arrayList11.iterator();
                                while (true) {
                                    if (it10.hasNext()) {
                                        String str5 = (String) it10.next();
                                        nek nekVar4 = y4t.c;
                                        if (!Intrinsics.d(str5, "160291")) {
                                            if (arrayList11.isEmpty()) {
                                                arrayList3 = new ArrayList(r3d.q(list12, 10));
                                                it = list12.iterator();
                                                while (it.hasNext()) {
                                                    fisVarA = (fis) it.next();
                                                    str2 = fisVarA.b;
                                                    nek nekVar5 = y4t.c;
                                                    if (Intrinsics.d(str2, "158983")) {
                                                        List list14 = fisVarA.f9602a;
                                                        arrayList4 = new ArrayList();
                                                        for (Object obj13 : list14) {
                                                            Iterator it11 = it;
                                                            if (!arrayList12.contains(Long.valueOf(x1x.D(((mz60) obj13).b)))) {
                                                                arrayList4.add(obj13);
                                                            }
                                                            it = it11;
                                                        }
                                                        it2 = it;
                                                        fisVarA = fis.a(fisVarA, arrayList4);
                                                    } else {
                                                        it2 = it;
                                                    }
                                                    arrayList3.add(fisVarA);
                                                    it = it2;
                                                }
                                                arrayList2 = new ArrayList();
                                                for (Object obj14 : arrayList3) {
                                                    if (!((fis) obj14).f9602a.isEmpty()) {
                                                        arrayList2.add(obj14);
                                                    }
                                                }
                                            } else {
                                                Iterator it12 = arrayList11.iterator();
                                                while (true) {
                                                    if (it12.hasNext()) {
                                                        String str6 = (String) it12.next();
                                                        nek nekVar6 = y4t.c;
                                                        if (!Intrinsics.d(str6, "158983")) {
                                                            arrayList2 = list12;
                                                        }
                                                    } else {
                                                        arrayList3 = new ArrayList(r3d.q(list12, 10));
                                                        it = list12.iterator();
                                                        while (it.hasNext()) {
                                                            fisVarA = (fis) it.next();
                                                            str2 = fisVarA.b;
                                                            nek nekVar7 = y4t.c;
                                                            if (Intrinsics.d(str2, "158983")) {
                                                                List list15 = fisVarA.f9602a;
                                                                arrayList4 = new ArrayList();
                                                                while (r7.hasNext()) {
                                                                    Iterator it13 = it;
                                                                    if (!arrayList12.contains(Long.valueOf(x1x.D(((mz60) obj13).b)))) {
                                                                        arrayList4.add(obj13);
                                                                    }
                                                                    it = it13;
                                                                }
                                                                it2 = it;
                                                                fisVarA = fis.a(fisVarA, arrayList4);
                                                            } else {
                                                                it2 = it;
                                                            }
                                                            arrayList3.add(fisVarA);
                                                            it = it2;
                                                        }
                                                        arrayList2 = new ArrayList();
                                                        while (r0.hasNext()) {
                                                            if (!((fis) obj14).f9602a.isEmpty()) {
                                                                arrayList2.add(obj14);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        arrayList2 = new ArrayList();
                                        while (r0.hasNext()) {
                                            str = ((fis) obj12).b;
                                            nek nekVar8 = y4t.c;
                                            if (!Intrinsics.d(str, "160291")) {
                                                arrayList2.add(obj12);
                                            }
                                        }
                                    }
                                }
                            }
                            d570Var = new d570(arrayList2);
                        } else {
                            zabVar = zabVar;
                            z2 = z2;
                            z3 = z3;
                        }
                        List list16 = d570Var.f5491a;
                        ArrayList arrayList13 = new ArrayList(r3d.q(list16, 10));
                        Iterator it14 = list16.iterator();
                        while (it14.hasNext()) {
                            fis fisVar = (fis) it14.next();
                            g5s g5sVar2 = g5s.Circle;
                            fisVar.getClass();
                            String str7 = fisVar.b;
                            String str8 = fisVar.c;
                            List list17 = fisVar.f9602a;
                            if (str8.length() == 0) {
                                y4t.c.getClass();
                                str7.getClass();
                                y4t[] y4tVarArrValues = y4t.values();
                                int length = y4tVarArrValues.length;
                                int i8 = 0;
                                while (true) {
                                    if (i8 < length) {
                                        int i9 = length;
                                        y4tVar = y4tVarArrValues[i8];
                                        int i10 = i8;
                                        if (!y4tVar.f42020a.equals(str7)) {
                                            i8 = i10 + 1;
                                            length = i9;
                                        }
                                    } else {
                                        y4tVar = null;
                                    }
                                }
                                strF = y4tVar != null ? ctf0Var.f(y4tVar.b, new Object[0]) : str8;
                            } else {
                                strF = str8;
                            }
                            nek nekVar9 = y4t.c;
                            if (Intrinsics.d(str7, "158984")) {
                                List listD0 = CollectionsKt.D0(list17, 10);
                                list = list12;
                                ArrayList arrayList14 = new ArrayList(r3d.q(listD0, 10));
                                Iterator it15 = listD0.iterator();
                                while (it15.hasNext()) {
                                    arrayList14.add(zvw.b0((mz60) it15.next(), str7));
                                }
                                String str9 = fisVar.b;
                                nrv nrvVar2 = new nrv(strF, false, null, null, null, null, null, 254);
                                List listD1 = CollectionsKt.D0(list17, 10);
                                ArrayList arrayList15 = new ArrayList(r3d.q(listD1, 10));
                                Iterator it16 = listD1.iterator();
                                while (it16.hasNext()) {
                                    arrayList15.add(zvw.Z((mz60) it16.next(), ctf0Var));
                                }
                                qv60Var = new qv60(nrvVar2, str9, R.drawable.gradient_category_best, R.drawable.category_best_banner_container, arrayList14, arrayList15);
                            } else {
                                list = list12;
                                if (Intrinsics.d(str7, "159891")) {
                                    List listD2 = CollectionsKt.D0(list17, 10);
                                    ArrayList arrayList16 = new ArrayList(r3d.q(listD2, 10));
                                    Iterator it17 = listD2.iterator();
                                    while (it17.hasNext()) {
                                        arrayList16.add(zvw.b0((mz60) it17.next(), str7));
                                    }
                                    String str10 = fisVar.b;
                                    nrv nrvVar3 = new nrv(strF, false, null, null, null, null, null, 254);
                                    List listD3 = CollectionsKt.D0(list17, 10);
                                    ArrayList arrayList17 = new ArrayList(r3d.q(listD3, 10));
                                    Iterator it18 = listD3.iterator();
                                    while (it18.hasNext()) {
                                        arrayList17.add(zvw.Z((mz60) it18.next(), ctf0Var));
                                    }
                                    qv60Var = new qv60(nrvVar3, str10, R.drawable.gradient_category_for_you, R.drawable.category_for_you_banner_container, arrayList16, arrayList17);
                                } else {
                                    List listD4 = CollectionsKt.D0(list17, 10);
                                    ArrayList arrayList18 = new ArrayList(r3d.q(listD4, 10));
                                    Iterator it19 = listD4.iterator();
                                    while (it19.hasNext()) {
                                        arrayList18.add(zvw.b0((mz60) it19.next(), str7));
                                    }
                                    nrv nrvVar4 = new nrv(strF, false, null, list17.size() >= 4 ? ctf0Var.b.a(R.string.filter_all, Arrays.copyOf(new Object[0], 0)) : null, null, null, null, 246);
                                    List listD5 = CollectionsKt.D0(list17, 10);
                                    ArrayList arrayList19 = new ArrayList(r3d.q(listD5, 10));
                                    Iterator it20 = listD5.iterator();
                                    while (it20.hasNext()) {
                                        arrayList19.add(zvw.Z((mz60) it20.next(), ctf0Var));
                                    }
                                    pv60Var = new pv60(nrvVar4, str7, arrayList18, arrayList19);
                                }
                                arrayList13.add(pv60Var);
                                it14 = it14;
                                list12 = list;
                            }
                            pv60Var = qv60Var;
                            arrayList13.add(pv60Var);
                            it14 = it14;
                            list12 = list;
                        }
                        List list18 = list12;
                        lc00VarB3.addAll(arrayList13);
                        lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB3);
                        ArrayList arrayListL = q3d.l(y4t.d, y4t.e, y4t.f, y4t.g, y4t.i);
                        vab vabVar = z3 ? (vab) zabVar : null;
                        if (vabVar != null) {
                            List list19 = vabVar.f37077a;
                            ArrayList arrayList20 = new ArrayList();
                            for (Object obj15 : list19) {
                                String str11 = ((uab) obj15).b;
                                nek nekVar10 = y4t.c;
                                if (q3d.j("158983", "160291").contains(str11)) {
                                    arrayList20.add(obj15);
                                }
                            }
                            arrayList = new ArrayList(r3d.q(arrayList20, 10));
                            Iterator it21 = arrayList20.iterator();
                            while (it21.hasNext()) {
                                arrayList.add(Long.valueOf(x1x.D(((uab) it21.next()).f35321a.b)));
                            }
                        } else {
                            arrayList = iun.f15405a;
                        }
                        ArrayList arrayList21 = new ArrayList();
                        for (Object obj16 : list18) {
                            String str12 = ((fis) obj16).b;
                            nek nekVar11 = y4t.c;
                            if (Intrinsics.d(str12, "158983")) {
                                arrayList21.add(obj16);
                            }
                        }
                        ArrayList arrayList22 = new ArrayList();
                        Iterator it22 = arrayList21.iterator();
                        while (it22.hasNext()) {
                            w3d.u(arrayList22, ((fis) it22.next()).f9602a);
                        }
                        if (arrayList22.isEmpty()) {
                            iIndexOf = arrayListL.indexOf(y4t.g);
                            if (iIndexOf != -1) {
                                arrayListL.remove(iIndexOf);
                            }
                        } else {
                            Iterator it23 = arrayList22.iterator();
                            while (true) {
                                if (!it23.hasNext()) {
                                    iIndexOf = arrayListL.indexOf(y4t.g);
                                    if (iIndexOf != -1) {
                                        arrayListL.remove(iIndexOf);
                                    }
                                } else if (!arrayList.contains(Long.valueOf(x1x.D(((mz60) it23.next()).b)))) {
                                }
                            }
                        }
                        Iterator it24 = arrayListL.iterator();
                        while (it24.hasNext()) {
                            c8b0.v(lc00VarB2, lc00VarA2, (y4t) it24.next());
                        }
                        if (obj3 instanceof lo10) {
                            lc00VarB2.add(((lo10) obj3).f20369a);
                        }
                        Iterator it25 = q3d.j(y4t.j, y4t.k).iterator();
                        while (it25.hasNext()) {
                            c8b0.v(lc00VarB2, lc00VarA2, (y4t) it25.next());
                        }
                        if (obj2 instanceof v2y) {
                            pn40 pn40Var = pn40.f27267a;
                            u2y u2yVar = ((v2y) obj2).f36709a;
                            lc00VarB2.add(new jm60(2, R.drawable.jackpot_popular_banner, pn40.d(Double.parseDouble(u2yVar.f34969a.d), u2yVar.b, p3u0.c), ctf0Var.b.a(R.string.promo_jackpot, Arrays.copyOf(new Object[0], 0)), false));
                        } else if (!z2 && !obj2.equals(x2yVar)) {
                            t9f.b();
                            return null;
                        }
                        Iterator it26 = q3d.j(y4t.l, y4t.h, y4t.m).iterator();
                        while (it26.hasNext()) {
                            c8b0.v(lc00VarB2, lc00VarA2, (y4t) it26.next());
                        }
                    }
                } else if (g570Var instanceof e570) {
                    g5s g5sVar3 = g5s.Circle;
                    lc00VarB2.add(new pct());
                }
                return kotlin.collections.a.a(lc00VarB2);
        }
    }
}
