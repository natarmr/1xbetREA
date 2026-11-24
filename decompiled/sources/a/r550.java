package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r550 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ d650 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r550(d650 d650Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d650Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        d650 d650Var = this.k;
        switch (b) {
            case 0:
                r550 r550Var = new r550(d650Var, yjeVar, (byte) 0);
                r550Var.j = obj;
                return r550Var;
            case 1:
                r550 r550Var2 = new r550(d650Var, yjeVar, (byte) 1);
                r550Var2.j = obj;
                return r550Var2;
            case 2:
                r550 r550Var3 = new r550(d650Var, yjeVar, (byte) 2);
                r550Var3.j = obj;
                return r550Var3;
            case 3:
                r550 r550Var4 = new r550(d650Var, yjeVar, (byte) 3);
                r550Var4.j = obj;
                return r550Var4;
            case 4:
                r550 r550Var5 = new r550(d650Var, yjeVar, (byte) 4);
                r550Var5.j = obj;
                return r550Var5;
            case 5:
                r550 r550Var6 = new r550(d650Var, yjeVar, (byte) 5);
                r550Var6.j = obj;
                return r550Var6;
            case 6:
                r550 r550Var7 = new r550(d650Var, yjeVar, (byte) 6);
                r550Var7.j = obj;
                return r550Var7;
            default:
                r550 r550Var8 = new r550(d650Var, yjeVar, (byte) 7);
                r550Var8.j = obj;
                return r550Var8;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((r550) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((r550) create((l3j) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((r550) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((r550) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((r550) create((w7r0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((r550) create((mv5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((r550) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((r550) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0228  */
    /* JADX WARN: Code duplicated, block: B:106:0x0253 A[LOOP:12: B:92:0x01db->B:106:0x0253, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:256:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:266:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:273:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x01bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x0250 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x0109  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:60:0x012f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:67:0x015e A[LOOP:6: B:54:0x00e9->B:67:0x015e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x018d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:95:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:97:0x021e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0225  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        Object value2;
        ArrayList arrayList2;
        Object value3;
        ArrayList arrayList3;
        Object value4;
        ArrayList arrayList4;
        Object value5;
        ArrayList arrayList5;
        Object value6;
        Object value7;
        sff0 sff0Var;
        hl1 hl1Var;
        ArrayList arrayList6;
        Iterator it;
        Object next;
        qe40 qe40Var;
        Object value8;
        b550 b550Var;
        ArrayList arrayList7;
        sff0 sff0Var2;
        List listZ;
        Object value9;
        Iterator it2;
        bby bbyVar;
        ArrayList arrayList8;
        Iterator it3;
        Object next2;
        qe40 qe40Var2;
        Object value10;
        b550 b550Var2;
        ArrayList arrayList9;
        List listZ2;
        byte b = this.i;
        vbj qbjVar = obj.f24982a;
        nbj nbjVar = nbj.f23243a;
        int i = 10;
        d650 d650Var = this.k;
        switch (b) {
            case 0:
                List list = (List) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = d650Var.g1;
                do {
                    value = p7m0Var.getValue();
                    Iterable<ef40> iterable = (Iterable) p7m0Var.getValue();
                    arrayList = new ArrayList(r3d.q(iterable, 10));
                    for (ef40 me40Var : iterable) {
                        if (me40Var instanceof me40) {
                            me40Var = new me40(list.isEmpty() ? nbjVar : new qbj(list, false));
                        }
                        arrayList.add(me40Var);
                    }
                } while (!p7m0Var.m(value, arrayList));
                return Unit.f46060a;
            case 1:
                p7m0 p7m0Var2 = d650Var.g1;
                l3j l3jVar = (l3j) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (l3jVar != null) {
                    if (l3jVar instanceof i3j) {
                        do {
                            value3 = p7m0Var2.getValue();
                            Iterable<ef40> iterable2 = (Iterable) p7m0Var2.getValue();
                            arrayList3 = new ArrayList(r3d.q(iterable2, 10));
                            for (ef40 oe40Var : iterable2) {
                                if (oe40Var instanceof oe40) {
                                    oe40Var = new oe40(new qbj(((i3j) l3jVar).f14099a, false));
                                }
                                arrayList3.add(oe40Var);
                            }
                        } while (!p7m0Var2.m(value3, arrayList3));
                    } else if (l3jVar instanceof j3j) {
                        do {
                            value2 = p7m0Var2.getValue();
                            Iterable<Object> iterable3 = (Iterable) p7m0Var2.getValue();
                            arrayList2 = new ArrayList(r3d.q(iterable3, 10));
                            for (Object oe40Var2 : iterable3) {
                                if (oe40Var2 instanceof oe40) {
                                    oe40Var2 = new oe40(qbjVar);
                                }
                                arrayList2.add(oe40Var2);
                            }
                        } while (!p7m0Var2.m(value2, arrayList2));
                    }
                    return Unit.f46060a;
                }
                return Unit.f46060a;
            case 2:
                List list2 = (List) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var3 = d650Var.g1;
                do {
                    value4 = p7m0Var3.getValue();
                    Iterable<ef40> iterable4 = (Iterable) p7m0Var3.getValue();
                    arrayList4 = new ArrayList(r3d.q(iterable4, 10));
                    for (ef40 qe40Var3 : iterable4) {
                        if (qe40Var3 instanceof qe40) {
                            x4t x4tVar = ((qe40) qe40Var3).f28565a;
                            if (x4tVar instanceof p4t) {
                                qe40Var3 = new qe40(x4tVar, list2.isEmpty() ? nbjVar : d650Var.b1.b.C ? new rbj(list2) : new qbj(list2, false));
                            }
                        }
                        arrayList4.add(qe40Var3);
                    }
                } while (!p7m0Var3.m(value4, arrayList4));
                return Unit.f46060a;
            case 3:
                List list3 = (List) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var4 = d650Var.g1;
                do {
                    value5 = p7m0Var4.getValue();
                    Iterable<ef40> iterable5 = (Iterable) p7m0Var4.getValue();
                    arrayList5 = new ArrayList(r3d.q(iterable5, 10));
                    for (ef40 qe40Var4 : iterable5) {
                        if (qe40Var4 instanceof qe40) {
                            x4t x4tVar2 = ((qe40) qe40Var4).f28565a;
                            if (x4tVar2 instanceof s4t) {
                                qe40Var4 = new qe40(x4tVar2, !list3.isEmpty() ? new qbj(list3, true) : nbjVar);
                            }
                        }
                        arrayList5.add(qe40Var4);
                    }
                } while (!p7m0Var4.m(value5, arrayList5));
                return Unit.f46060a;
            case 4:
                d650 d650Var2 = this.k;
                p7m0 p7m0Var5 = d650Var2.i1;
                w7r0 w7r0Var = (w7r0) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (w7r0Var instanceof v7r0) {
                    vbj vbjVar = ((v7r0) w7r0Var).f36944a;
                    if ((vbjVar instanceof pbj) || (vbjVar instanceof ubj)) {
                        int i2 = d650.k1;
                        c4m0 c4m0Var = d650Var2.H0;
                        if (c4m0Var == null || !c4m0Var.isActive()) {
                            d650Var2.H0 = sac.T(new fnq(vtb.N(d650Var2.v), new r550(d650Var2, null, (byte) 5), (byte) 4), d5c.S(jiu0.a(d650Var2), d650Var2.L.b), z550.h);
                        }
                    }
                }
                while (true) {
                    Object value11 = p7m0Var5.getValue();
                    d650 d650Var3 = d650Var2;
                    if (p7m0Var5.m(value11, b550.a((b550) p7m0Var5.getValue(), egm0.t(w7r0Var, d650Var2.e1.f253a, new f340(1, d650Var2, d650.class, "getBalanceTitle", "getBalanceTitle(Lorg/xplatform/balance/model/BalanceModel;)Ljava/lang/String;", 0, (byte) 18), d650Var3.M), null, false, 29))) {
                        return Unit.f46060a;
                    }
                    d650Var2 = d650Var3;
                }
                break;
            case 5:
                mv5 mv5Var = (mv5) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var6 = d650Var.f1;
                if (Intrinsics.d(mv5Var, jv5.f17191a)) {
                    qbjVar = nbjVar;
                } else if (!Intrinsics.d(mv5Var, kv5.f18939a)) {
                    if (!(mv5Var instanceof lv5)) {
                        t9f.b();
                        return null;
                    }
                    qbjVar = new qbj(((lv5) mv5Var).f20702a, false);
                }
                v7r0 v7r0Var = new v7r0(qbjVar);
                p7m0Var6.getClass();
                p7m0Var6.o(null, v7r0Var);
                return Unit.f46060a;
            case 6:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                int i3 = d650.k1;
                d650Var.w();
                d650Var.q0.b();
                LinkedHashMap linkedHashMap = d650Var.C0;
                for (bby bbyVar2 : linkedHashMap.values()) {
                    if (bbyVar2 != null) {
                        bbyVar2.cancel(null);
                    }
                }
                linkedHashMap.clear();
                p7m0 p7m0Var7 = d650Var.f1;
                do {
                    value6 = p7m0Var7.getValue();
                } while (!p7m0Var7.m(value6, sw00Var.f32897a ? new v7r0(pbj.f26710a) : u7r0.f35200a));
                p7m0 p7m0Var8 = d650Var.g1;
                do {
                    value7 = p7m0Var8.getValue();
                    sff0Var = d650Var.b1;
                    hl1Var = sff0Var.b;
                } while (!p7m0Var8.m(value7, h8x.t(hl1Var.K, hl1Var.J, hl1Var.z, sff0Var.l.n, hl1Var.f13233a.c, d650Var.d1, sw00Var.f32897a, d650Var.c1)));
                return Unit.f46060a;
            default:
                LinkedHashMap linkedHashMap2 = d650Var.C0;
                sff0 sff0Var3 = d650Var.b1;
                iqt iqtVar = d650Var.r0;
                p7m0 p7m0Var9 = d650Var.i1;
                List<ef40> list4 = (List) this.j;
                wne wneVar8 = wne.f39444a;
                ArrayList arrayListT = twn.t(obj);
                for (Object obj2 : list4) {
                    if (!(((ef40) obj2).getState() instanceof nbj)) {
                        arrayListT.add(obj2);
                    }
                }
                if (arrayListT.isEmpty()) {
                    arrayList6 = new ArrayList();
                    for (Object obj3 : list4) {
                        if (obj3 instanceof qe40) {
                            arrayList6.add(obj3);
                        }
                    }
                    it = arrayList6.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        qe40Var = (qe40) next;
                        while (true) {
                            value8 = p7m0Var9.getValue();
                            b550Var = (b550) p7m0Var9.getValue();
                            arrayList7 = new ArrayList(r3d.q(list4, 10));
                            for (ef40 ef40Var : list4) {
                                a550 a550Var = d650Var.e1;
                                ctf0 ctf0Var = d650Var.M;
                                boolean zA = iqtVar.f15225a.a();
                                boolean z = d650Var.c1;
                                String strF = d650Var.F();
                                boolean z2 = sff0Var3.b.f13233a.d;
                                sff0 sff0Var4 = sff0Var3;
                                if (qe40Var != null) {
                                    listZ = d650Var.z(qe40Var.f28565a);
                                } else {
                                    listZ = null;
                                }
                                if (listZ == null) {
                                    listZ = iun.f15405a;
                                }
                                arrayList7.add(l8x.x0(ef40Var, a550Var, ctf0Var, zA, z, strF, z2, listZ));
                                sff0Var3 = sff0Var4;
                            }
                            sff0Var2 = sff0Var3;
                            if (p7m0Var9.m(value8, b550.a(b550Var, null, dyb.r0(r3d.r(arrayList7)), false, 27))) {
                                sff0Var3 = sff0Var2;
                            }
                        }
                    } while (!(((qe40) next).f28565a instanceof p4t));
                    qe40Var = (qe40) next;
                    while (true) {
                        value8 = p7m0Var9.getValue();
                        b550Var = (b550) p7m0Var9.getValue();
                        arrayList7 = new ArrayList(r3d.q(list4, 10));
                        while (r6.hasNext()) {
                            a550 a550Var2 = d650Var.e1;
                            ctf0 ctf0Var2 = d650Var.M;
                            boolean zA2 = iqtVar.f15225a.a();
                            boolean z3 = d650Var.c1;
                            String strF2 = d650Var.F();
                            boolean z4 = sff0Var3.b.f13233a.d;
                            sff0 sff0Var5 = sff0Var3;
                            if (qe40Var != null) {
                                listZ = d650Var.z(qe40Var.f28565a);
                            } else {
                                listZ = null;
                            }
                            if (listZ == null) {
                                listZ = iun.f15405a;
                            }
                            arrayList7.add(l8x.x0(ef40Var, a550Var2, ctf0Var2, zA2, z3, strF2, z4, listZ));
                            sff0Var3 = sff0Var5;
                        }
                        sff0Var2 = sff0Var3;
                        if (p7m0Var9.m(value8, b550.a(b550Var, null, dyb.r0(r3d.r(arrayList7)), false, 27))) {
                            sff0Var3 = sff0Var2;
                        }
                    }
                } else {
                    Iterator it4 = arrayListT.iterator();
                    while (it4.hasNext()) {
                        if (!(((ef40) it4.next()).getState() instanceof pbj)) {
                            if (list4.isEmpty()) {
                                do {
                                    value9 = p7m0Var9.getValue();
                                } while (!p7m0Var9.m(value9, b550.a((b550) p7m0Var9.getValue(), null, null, true, 15)));
                                it2 = linkedHashMap2.entrySet().iterator();
                                while (it2.hasNext()) {
                                    bbyVar = (bby) ((Map.Entry) it2.next()).getValue();
                                    if (bbyVar != null) {
                                        bbyVar.cancel(null);
                                    }
                                }
                                linkedHashMap2.clear();
                            } else {
                                for (ef40 ef40Var2 : list4) {
                                    if ((ef40Var2.getState() instanceof nbj) || (ef40Var2.getState() instanceof obj)) {
                                        i = 10;
                                    } else if (list4.isEmpty()) {
                                        arrayList8 = new ArrayList();
                                        for (Object obj4 : list4) {
                                            if (obj4 instanceof qe40) {
                                                arrayList8.add(obj4);
                                            }
                                        }
                                        it3 = arrayList8.iterator();
                                        do {
                                            if (it3.hasNext()) {
                                                next2 = it3.next();
                                            } else {
                                                next2 = null;
                                            }
                                            qe40Var2 = (qe40) next2;
                                            while (true) {
                                                value10 = p7m0Var9.getValue();
                                                b550Var2 = (b550) p7m0Var9.getValue();
                                                arrayList9 = new ArrayList(r3d.q(list4, i));
                                                for (ef40 ef40Var3 : list4) {
                                                    a550 a550Var3 = d650Var.e1;
                                                    ctf0 ctf0Var3 = d650Var.M;
                                                    boolean zA3 = iqtVar.f15225a.a();
                                                    boolean z5 = d650Var.c1;
                                                    String strF3 = d650Var.F();
                                                    boolean z6 = sff0Var3.b.f13233a.d;
                                                    if (qe40Var2 != null) {
                                                        listZ2 = d650Var.z(qe40Var2.f28565a);
                                                    } else {
                                                        listZ2 = null;
                                                    }
                                                    if (listZ2 == null) {
                                                        listZ2 = iun.f15405a;
                                                    }
                                                    arrayList9.add(l8x.x0(ef40Var3, a550Var3, ctf0Var3, zA3, z5, strF3, z6, listZ2));
                                                }
                                                if (p7m0Var9.m(value10, b550.a(b550Var2, null, dyb.r0(r3d.r(arrayList9)), false, 11))) {
                                                    i = 10;
                                                }
                                            }
                                        } while (!(((qe40) next2).f28565a instanceof p4t));
                                        qe40Var2 = (qe40) next2;
                                        while (true) {
                                            value10 = p7m0Var9.getValue();
                                            b550Var2 = (b550) p7m0Var9.getValue();
                                            arrayList9 = new ArrayList(r3d.q(list4, i));
                                            while (r12.hasNext()) {
                                                a550 a550Var4 = d650Var.e1;
                                                ctf0 ctf0Var4 = d650Var.M;
                                                boolean zA4 = iqtVar.f15225a.a();
                                                boolean z7 = d650Var.c1;
                                                String strF4 = d650Var.F();
                                                boolean z8 = sff0Var3.b.f13233a.d;
                                                if (qe40Var2 != null) {
                                                    listZ2 = d650Var.z(qe40Var2.f28565a);
                                                } else {
                                                    listZ2 = null;
                                                }
                                                if (listZ2 == null) {
                                                    listZ2 = iun.f15405a;
                                                }
                                                arrayList9.add(l8x.x0(ef40Var3, a550Var4, ctf0Var4, zA4, z7, strF4, z8, listZ2));
                                            }
                                            if (p7m0Var9.m(value10, b550.a(b550Var2, null, dyb.r0(r3d.r(arrayList9)), false, 11))) {
                                                i = 10;
                                            }
                                        }
                                    } else {
                                        for (ef40 ef40Var4 : list4) {
                                            if ((ef40Var4.getState() instanceof ubj) || (ef40Var4.getState() instanceof pbj)) {
                                            }
                                        }
                                        arrayList8 = new ArrayList();
                                        while (r1.hasNext()) {
                                            if (obj4 instanceof qe40) {
                                                arrayList8.add(obj4);
                                            }
                                        }
                                        it3 = arrayList8.iterator();
                                        do {
                                            if (it3.hasNext()) {
                                                next2 = it3.next();
                                            } else {
                                                next2 = null;
                                            }
                                            qe40Var2 = (qe40) next2;
                                            while (true) {
                                                value10 = p7m0Var9.getValue();
                                                b550Var2 = (b550) p7m0Var9.getValue();
                                                arrayList9 = new ArrayList(r3d.q(list4, i));
                                                while (r12.hasNext()) {
                                                    a550 a550Var5 = d650Var.e1;
                                                    ctf0 ctf0Var5 = d650Var.M;
                                                    boolean zA5 = iqtVar.f15225a.a();
                                                    boolean z9 = d650Var.c1;
                                                    String strF5 = d650Var.F();
                                                    boolean z10 = sff0Var3.b.f13233a.d;
                                                    if (qe40Var2 != null) {
                                                        listZ2 = d650Var.z(qe40Var2.f28565a);
                                                    } else {
                                                        listZ2 = null;
                                                    }
                                                    if (listZ2 == null) {
                                                        listZ2 = iun.f15405a;
                                                    }
                                                    arrayList9.add(l8x.x0(ef40Var3, a550Var5, ctf0Var5, zA5, z9, strF5, z10, listZ2));
                                                }
                                                if (p7m0Var9.m(value10, b550.a(b550Var2, null, dyb.r0(r3d.r(arrayList9)), false, 11))) {
                                                    i = 10;
                                                }
                                            }
                                        } while (!(((qe40) next2).f28565a instanceof p4t));
                                        qe40Var2 = (qe40) next2;
                                        while (true) {
                                            value10 = p7m0Var9.getValue();
                                            b550Var2 = (b550) p7m0Var9.getValue();
                                            arrayList9 = new ArrayList(r3d.q(list4, i));
                                            while (r12.hasNext()) {
                                                a550 a550Var6 = d650Var.e1;
                                                ctf0 ctf0Var6 = d650Var.M;
                                                boolean zA6 = iqtVar.f15225a.a();
                                                boolean z11 = d650Var.c1;
                                                String strF6 = d650Var.F();
                                                boolean z12 = sff0Var3.b.f13233a.d;
                                                if (qe40Var2 != null) {
                                                    listZ2 = d650Var.z(qe40Var2.f28565a);
                                                } else {
                                                    listZ2 = null;
                                                }
                                                if (listZ2 == null) {
                                                    listZ2 = iun.f15405a;
                                                }
                                                arrayList9.add(l8x.x0(ef40Var3, a550Var6, ctf0Var6, zA6, z11, strF6, z12, listZ2));
                                            }
                                            if (p7m0Var9.m(value10, b550.a(b550Var2, null, dyb.r0(r3d.r(arrayList9)), false, 11))) {
                                                i = 10;
                                            }
                                        }
                                    }
                                }
                                do {
                                    value9 = p7m0Var9.getValue();
                                } while (!p7m0Var9.m(value9, b550.a((b550) p7m0Var9.getValue(), null, null, true, 15)));
                                it2 = linkedHashMap2.entrySet().iterator();
                                while (it2.hasNext()) {
                                    bbyVar = (bby) ((Map.Entry) it2.next()).getValue();
                                    if (bbyVar != null) {
                                        bbyVar.cancel(null);
                                    }
                                }
                                linkedHashMap2.clear();
                            }
                        }
                    }
                    arrayList6 = new ArrayList();
                    while (r1.hasNext()) {
                        if (obj3 instanceof qe40) {
                            arrayList6.add(obj3);
                        }
                    }
                    it = arrayList6.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        qe40Var = (qe40) next;
                        while (true) {
                            value8 = p7m0Var9.getValue();
                            b550Var = (b550) p7m0Var9.getValue();
                            arrayList7 = new ArrayList(r3d.q(list4, 10));
                            while (r6.hasNext()) {
                                a550 a550Var7 = d650Var.e1;
                                ctf0 ctf0Var7 = d650Var.M;
                                boolean zA7 = iqtVar.f15225a.a();
                                boolean z13 = d650Var.c1;
                                String strF7 = d650Var.F();
                                boolean z14 = sff0Var3.b.f13233a.d;
                                sff0 sff0Var6 = sff0Var3;
                                if (qe40Var != null) {
                                    listZ = d650Var.z(qe40Var.f28565a);
                                } else {
                                    listZ = null;
                                }
                                if (listZ == null) {
                                    listZ = iun.f15405a;
                                }
                                arrayList7.add(l8x.x0(ef40Var, a550Var7, ctf0Var7, zA7, z13, strF7, z14, listZ));
                                sff0Var3 = sff0Var6;
                            }
                            sff0Var2 = sff0Var3;
                            if (p7m0Var9.m(value8, b550.a(b550Var, null, dyb.r0(r3d.r(arrayList7)), false, 27))) {
                                sff0Var3 = sff0Var2;
                            }
                        }
                    } while (!(((qe40) next).f28565a instanceof p4t));
                    qe40Var = (qe40) next;
                    while (true) {
                        value8 = p7m0Var9.getValue();
                        b550Var = (b550) p7m0Var9.getValue();
                        arrayList7 = new ArrayList(r3d.q(list4, 10));
                        while (r6.hasNext()) {
                            a550 a550Var8 = d650Var.e1;
                            ctf0 ctf0Var8 = d650Var.M;
                            boolean zA8 = iqtVar.f15225a.a();
                            boolean z15 = d650Var.c1;
                            String strF8 = d650Var.F();
                            boolean z16 = sff0Var3.b.f13233a.d;
                            sff0 sff0Var7 = sff0Var3;
                            if (qe40Var != null) {
                                listZ = d650Var.z(qe40Var.f28565a);
                            } else {
                                listZ = null;
                            }
                            if (listZ == null) {
                                listZ = iun.f15405a;
                            }
                            arrayList7.add(l8x.x0(ef40Var, a550Var8, ctf0Var8, zA8, z15, strF8, z16, listZ));
                            sff0Var3 = sff0Var7;
                        }
                        sff0Var2 = sff0Var3;
                        if (p7m0Var9.m(value8, b550.a(b550Var, null, dyb.r0(r3d.r(arrayList7)), false, 27))) {
                            sff0Var3 = sff0Var2;
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}
