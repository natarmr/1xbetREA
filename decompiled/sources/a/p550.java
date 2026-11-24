package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class p550 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ d650 k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p550(d650 d650Var, String str, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = d650Var;
        this.l = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        String str = this.l;
        d650 d650Var = this.k;
        switch (b) {
            case 0:
                p550 p550Var = new p550(d650Var, str, yjeVar, (byte) 0);
                p550Var.j = obj;
                return p550Var;
            case 1:
                p550 p550Var2 = new p550(d650Var, str, yjeVar, (byte) 1);
                p550Var2.j = obj;
                return p550Var2;
            case 2:
                p550 p550Var3 = new p550(d650Var, str, yjeVar, (byte) 2);
                p550Var3.j = obj;
                return p550Var3;
            default:
                p550 p550Var4 = new p550(d650Var, str, yjeVar, (byte) 3);
                p550Var4.j = obj;
                return p550Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((p550) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((p550) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((p550) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((p550) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0218  */
    /* JADX WARN: Code duplicated, block: B:223:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:? A[LOOP:8: B:75:0x017b->B:224:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0177  */
    /* JADX WARN: Code duplicated, block: B:77:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x01af  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:97:0x0201  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        int i;
        Object value2;
        ArrayList arrayList2;
        Object value3;
        ArrayList arrayList3;
        Object value4;
        ArrayList arrayList4;
        Object value5;
        ArrayList arrayList5;
        bby bbyVar;
        Iterator it;
        Object value6;
        ArrayList arrayList6;
        bby bbyVar2;
        Object value7;
        ArrayList arrayList7;
        Object value8;
        ArrayList arrayList8;
        byte b = this.i;
        sbj sbjVar = sbj.f31937a;
        nbj nbjVar = nbj.f23243a;
        obj objVar = obj.f24982a;
        String str = this.l;
        int i2 = 10;
        d650 d650Var = this.k;
        switch (b) {
            case 0:
                LinkedHashMap linkedHashMap = d650Var.C0;
                p7m0 p7m0Var = d650Var.g1;
                List list = (List) this.j;
                wne wneVar = wne.f39444a;
                ArrayList arrayListT = twn.t(obj);
                for (Object obj2 : list) {
                    if (obj2 instanceof te40) {
                        arrayListT.add(obj2);
                    }
                }
                if (arrayListT.isEmpty()) {
                    do {
                        value4 = p7m0Var.getValue();
                        Iterable<Object> iterable = (Iterable) p7m0Var.getValue();
                        arrayList4 = new ArrayList(r3d.q(iterable, 10));
                        for (Object we40Var : iterable) {
                            if (we40Var instanceof we40) {
                                we40Var = new we40(sbjVar);
                            }
                            arrayList4.add(we40Var);
                        }
                    } while (!p7m0Var.m(value4, arrayList4));
                    bby bbyVar3 = (bby) linkedHashMap.get(str);
                    if (bbyVar3 != null) {
                        bbyVar3.cancel(null);
                    }
                    linkedHashMap.remove(str);
                } else {
                    Iterator it2 = arrayListT.iterator();
                    while (it2.hasNext()) {
                        vbj vbjVar = ((te40) it2.next()).b;
                        if (vbjVar instanceof qbj) {
                            while (true) {
                                Object value9 = p7m0Var.getValue();
                                Iterable<ef40> iterable2 = (Iterable) p7m0Var.getValue();
                                ArrayList arrayList9 = new ArrayList(r3d.q(iterable2, i2));
                                for (ef40 we40Var2 : iterable2) {
                                    if (we40Var2 instanceof we40) {
                                        we40Var2 = new we40(new qbj(new sh10(false, ((zh10) ((qbj) vbjVar).f28448a).b.c), false));
                                    }
                                    arrayList9.add(we40Var2);
                                }
                                if (p7m0Var.m(value9, arrayList9)) {
                                    bby bbyVar4 = (bby) linkedHashMap.get(str);
                                    if (bbyVar4 != null) {
                                        bbyVar4.cancel(null);
                                    }
                                    linkedHashMap.remove(str);
                                } else {
                                    i2 = 10;
                                }
                            }
                        } else if (vbjVar.equals(nbjVar)) {
                            do {
                                value3 = p7m0Var.getValue();
                                Iterable<Object> iterable3 = (Iterable) p7m0Var.getValue();
                                arrayList3 = new ArrayList(r3d.q(iterable3, 10));
                                for (Object we40Var3 : iterable3) {
                                    if (we40Var3 instanceof we40) {
                                        we40Var3 = new we40(sbjVar);
                                    }
                                    arrayList3.add(we40Var3);
                                }
                            } while (!p7m0Var.m(value3, arrayList3));
                            bby bbyVar5 = (bby) linkedHashMap.get(str);
                            if (bbyVar5 != null) {
                                bbyVar5.cancel(null);
                            }
                            linkedHashMap.remove(str);
                        } else if (vbjVar.equals(objVar)) {
                            do {
                                value2 = p7m0Var.getValue();
                                Iterable<Object> iterable4 = (Iterable) p7m0Var.getValue();
                                arrayList2 = new ArrayList(r3d.q(iterable4, 10));
                                for (Object we40Var4 : iterable4) {
                                    if (we40Var4 instanceof we40) {
                                        we40Var4 = new we40(objVar);
                                    }
                                    arrayList2.add(we40Var4);
                                }
                            } while (!p7m0Var.m(value2, arrayList2));
                        } else {
                            pbj pbjVar = pbj.f26710a;
                            if (vbjVar.equals(pbjVar)) {
                                do {
                                    value = p7m0Var.getValue();
                                    Iterable<Object> iterable5 = (Iterable) p7m0Var.getValue();
                                    i = 10;
                                    arrayList = new ArrayList(r3d.q(iterable5, 10));
                                    for (Object we40Var5 : iterable5) {
                                        if (we40Var5 instanceof we40) {
                                            we40Var5 = new we40(pbjVar);
                                        }
                                        arrayList.add(we40Var5);
                                    }
                                } while (!p7m0Var.m(value, arrayList));
                            }
                            i2 = i;
                        }
                        i = 10;
                        i2 = i;
                    }
                }
                break;
            case 1:
                p7m0 p7m0Var2 = d650Var.g1;
                LinkedHashMap linkedHashMap2 = d650Var.C0;
                List<ef40> list2 = (List) this.j;
                wne wneVar2 = wne.f39444a;
                ArrayList<ef40> arrayListT2 = twn.t(obj);
                for (Object obj3 : list2) {
                    if (!(((ef40) obj3) instanceof xe40)) {
                        arrayListT2.add(obj3);
                    }
                }
                if (arrayListT2.isEmpty()) {
                    do {
                        value5 = p7m0Var2.getValue();
                        Iterable<Object> iterable6 = (Iterable) p7m0Var2.getValue();
                        arrayList5 = new ArrayList(r3d.q(iterable6, 10));
                        for (Object xe40Var : iterable6) {
                            if (xe40Var instanceof xe40) {
                                xe40Var = new xe40(objVar);
                            }
                            arrayList5.add(xe40Var);
                        }
                    } while (!p7m0Var2.m(value5, arrayList5));
                    bbyVar = (bby) linkedHashMap2.get(str);
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    linkedHashMap2.remove(str);
                } else {
                    for (ef40 ef40Var : arrayListT2) {
                        if (!(ef40Var.getState() instanceof nbj) && !(ef40Var.getState() instanceof obj)) {
                            if (!list2.isEmpty()) {
                                for (ef40 ef40Var2 : list2) {
                                    if (ef40Var2 instanceof xe40) {
                                        vbj vbjVar2 = ((xe40) ef40Var2).f40727a;
                                        if ((vbjVar2 instanceof tbj) || (vbjVar2 instanceof obj)) {
                                            bby bbyVar6 = (bby) linkedHashMap2.get(str);
                                            if (bbyVar6 != null) {
                                                bbyVar6.cancel(null);
                                            }
                                            linkedHashMap2.remove(str);
                                        }
                                    }
                                }
                                if (!list2.isEmpty()) {
                                    it = list2.iterator();
                                    while (it.hasNext()) {
                                        if (((ef40) it.next()).getState() instanceof tbj) {
                                            do {
                                                value6 = p7m0Var2.getValue();
                                                Iterable<Object> iterable7 = (Iterable) p7m0Var2.getValue();
                                                arrayList6 = new ArrayList(r3d.q(iterable7, 10));
                                                for (Object xe40Var2 : iterable7) {
                                                    if (xe40Var2 instanceof xe40) {
                                                        xe40Var2 = new xe40(sbjVar);
                                                    }
                                                    arrayList6.add(xe40Var2);
                                                }
                                            } while (!p7m0Var2.m(value6, arrayList6));
                                            bbyVar2 = (bby) linkedHashMap2.get(str);
                                            if (bbyVar2 != null) {
                                                bbyVar2.cancel(null);
                                            }
                                            linkedHashMap2.remove(str);
                                        }
                                    }
                                }
                            } else if (!list2.isEmpty()) {
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    if (((ef40) it.next()).getState() instanceof tbj) {
                                        do {
                                            value6 = p7m0Var2.getValue();
                                            Iterable<Object> iterable8 = (Iterable) p7m0Var2.getValue();
                                            arrayList6 = new ArrayList(r3d.q(iterable8, 10));
                                            while (r4.hasNext()) {
                                                if (xe40Var2 instanceof xe40) {
                                                    xe40Var2 = new xe40(sbjVar);
                                                }
                                                arrayList6.add(xe40Var2);
                                            }
                                        } while (!p7m0Var2.m(value6, arrayList6));
                                        bbyVar2 = (bby) linkedHashMap2.get(str);
                                        if (bbyVar2 != null) {
                                            bbyVar2.cancel(null);
                                        }
                                        linkedHashMap2.remove(str);
                                    }
                                }
                            }
                        }
                    }
                    do {
                        value5 = p7m0Var2.getValue();
                        Iterable<Object> iterable9 = (Iterable) p7m0Var2.getValue();
                        arrayList5 = new ArrayList(r3d.q(iterable9, 10));
                        while (r2.hasNext()) {
                            if (xe40Var instanceof xe40) {
                                xe40Var = new xe40(objVar);
                            }
                            arrayList5.add(xe40Var);
                        }
                    } while (!p7m0Var2.m(value5, arrayList5));
                    bbyVar = (bby) linkedHashMap2.get(str);
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    linkedHashMap2.remove(str);
                }
                break;
            case 2:
                p7m0 p7m0Var3 = d650Var.g1;
                List list3 = (List) this.j;
                wne wneVar3 = wne.f39444a;
                ArrayList arrayListT3 = twn.t(obj);
                for (Object obj4 : list3) {
                    if (((myr0) obj4).g) {
                        arrayListT3.add(obj4);
                    }
                }
                List listD0 = CollectionsKt.D0(arrayListT3, 8);
                do {
                    value7 = p7m0Var3.getValue();
                    Iterable<ef40> iterable10 = (Iterable) p7m0Var3.getValue();
                    arrayList7 = new ArrayList(r3d.q(iterable10, 10));
                    for (ef40 cf40Var : iterable10) {
                        if (cf40Var instanceof cf40) {
                            cf40Var = new cf40(!listD0.isEmpty() ? new qbj(listD0, true) : nbjVar);
                        }
                        arrayList7.add(cf40Var);
                    }
                } while (!p7m0Var3.m(value7, arrayList7));
                d650Var.C0.remove(str);
                break;
            default:
                Throwable th = (Throwable) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var4 = d650Var.g1;
                do {
                    value8 = p7m0Var4.getValue();
                    Iterable<Object> iterable11 = (Iterable) p7m0Var4.getValue();
                    arrayList8 = new ArrayList(r3d.q(iterable11, 10));
                    for (Object cf40Var2 : iterable11) {
                        if (cf40Var2 instanceof cf40) {
                            cf40Var2 = new cf40(objVar);
                        }
                        arrayList8.add(cf40Var2);
                    }
                } while (!p7m0Var4.m(value8, arrayList8));
                d650Var.Z.b(th, new o240((byte) 21));
                d650Var.C0.remove(str);
                break;
        }
        return Unit.f46060a;
    }
}
