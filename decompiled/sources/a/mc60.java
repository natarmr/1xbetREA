package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class mc60 extends bnn0 implements aer {
    public pzu i;
    public long j;
    public boolean k;
    public /* synthetic */ o530 l;
    public /* synthetic */ HashMap m;
    public /* synthetic */ List n;
    public /* synthetic */ List o;
    public /* synthetic */ List p;
    public final /* synthetic */ long q;
    public final /* synthetic */ pzu r;
    public final /* synthetic */ long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc60(long j, pzu pzuVar, long j2, yje yjeVar) {
        super(6, yjeVar);
        this.q = j;
        this.r = pzuVar;
        this.s = j2;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Collection collection;
        HashMap map;
        long j;
        Object objS0;
        pzu pzuVar;
        HashMap map2;
        long j2;
        Object next;
        Collection collection2;
        List list;
        ArrayList arrayList;
        Object next2;
        ArrayList arrayList2;
        Iterator it;
        long j3;
        boolean z;
        List list2;
        List list3;
        Iterator it2;
        boolean z2;
        o530 o530Var = this.l;
        HashMap map3 = this.m;
        List list4 = this.n;
        List list5 = this.o;
        Collection collection3 = this.p;
        wne wneVar = wne.f39444a;
        boolean z3 = this.k;
        if (!z3) {
            z1x.P(obj);
            if (this.q != -26) {
                collection3 = iun.f15405a;
            }
            List list6 = o530Var.b;
            this.r.getClass();
            if (collection3.isEmpty()) {
                collection = collection3;
            } else {
                ArrayList arrayListN0 = CollectionsKt.N0(list6);
                ArrayList arrayList3 = new ArrayList();
                ArrayList<wt20> arrayList4 = new ArrayList();
                for (Object obj2 : collection3) {
                    if (((wt20) obj2).c != 0) {
                        arrayList4.add(obj2);
                    }
                }
                for (wt20 wt20Var : arrayList4) {
                    Iterator it3 = list6.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            collection2 = collection3;
                            list = list6;
                            arrayList = arrayListN0;
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                        arrayList = arrayListN0;
                        collection2 = collection3;
                        list = list6;
                        if (((xt20) next2).b == wt20Var.f39719a) {
                            break;
                        }
                        arrayListN0 = arrayList;
                        collection3 = collection2;
                        list6 = list;
                    }
                    xt20 xt20Var = (xt20) next2;
                    if (xt20Var != null) {
                        arrayList3.add(xt20.a(xt20Var, null, false, 0L, 0.0d, 191));
                        arrayList2 = arrayList;
                        arrayList2.remove(xt20Var);
                    } else {
                        arrayList2 = arrayList;
                    }
                    arrayListN0 = arrayList2;
                    collection3 = collection2;
                    list6 = list;
                }
                collection = collection3;
                arrayList3.addAll(arrayListN0);
                list6 = arrayList3;
            }
            ArrayList<xt20> arrayListN1 = CollectionsKt.N0(list6);
            long j4 = 0;
            if (collection.isEmpty()) {
                map = map3;
                j = 0;
            } else {
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (Object obj3 : collection) {
                    if (((wt20) obj3).d) {
                        arrayList6.add(obj3);
                    }
                }
                for (xt20 xt20Var2 : arrayListN1) {
                    Iterator it4 = arrayList6.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            map2 = map3;
                            j2 = j4;
                            next = null;
                            break;
                        }
                        next = it4.next();
                        map2 = map3;
                        j2 = j4;
                        if (((wt20) next).f39719a == xt20Var2.b) {
                            break;
                        }
                        map3 = map2;
                        j4 = j2;
                    }
                    if (((wt20) next) == null) {
                        arrayList5.add(xt20Var2);
                        j4 = j2;
                    } else {
                        j4 = j2 + 1;
                    }
                    map3 = map2;
                }
                map = map3;
                arrayListN1.clear();
                arrayListN1.addAll(arrayList5);
                j = j4;
            }
            this.l = o530Var;
            this.m = null;
            this.n = list4;
            this.o = list5;
            this.p = null;
            pzu pzuVar2 = this.r;
            this.i = pzuVar2;
            this.j = j;
            this.k = true;
            objS0 = pzuVar2.s0(arrayListN1, map, this.q, this.s, this);
            if (objS0 == wneVar) {
                return wneVar;
            }
            pzuVar = pzuVar2;
        } else {
            if (!z3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = this.j;
            pzuVar = this.i;
            z1x.P(obj);
            j = j5;
            objS0 = obj;
        }
        List list7 = (List) objS0;
        pzuVar.getClass();
        int i = 10;
        ArrayList arrayList7 = new ArrayList(r3d.q(list7, 10));
        Iterator it5 = list7.iterator();
        while (it5.hasNext()) {
            xt20 xt20Var3 = (xt20) it5.next();
            List list8 = xt20Var3.f41445a;
            ArrayList arrayList8 = new ArrayList(r3d.q(list8, i));
            Iterator it6 = list8.iterator();
            while (it6.hasNext()) {
                List<dao> list9 = (List) it6.next();
                ArrayList arrayList9 = new ArrayList(r3d.q(list9, i));
                for (dao daoVar : list9) {
                    Iterator it7 = it6;
                    long j6 = this.s;
                    if (list4 != null && list4.isEmpty()) {
                        it = it5;
                        j3 = j6;
                        z = false;
                        break;
                    }
                    Iterator it8 = list4.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            it = it5;
                            j3 = j6;
                            z = false;
                            break;
                        }
                        ru6 ru6Var = (ru6) it8.next();
                        it = it5;
                        j3 = j6;
                        if (ru6Var.d == j3 && ru6Var.h == daoVar.b && ru6Var.g == daoVar.m.f32198a && ru6Var.f == daoVar.f) {
                            z = true;
                            break;
                        }
                        j6 = j3;
                        it5 = it;
                    }
                    if (list5 != null && list5.isEmpty()) {
                        list2 = list4;
                        list3 = list5;
                        z2 = false;
                        break;
                        break;
                    }
                    Iterator it9 = list5.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            list2 = list4;
                            list3 = list5;
                            z2 = false;
                            break;
                        }
                        m97 m97Var = ((pbs0) it9.next()).b;
                        list2 = list4;
                        list3 = list5;
                        if (m97Var.f21398a == j3 && m97Var.h == daoVar.b) {
                            it2 = it9;
                            if (m97Var.f == daoVar.m.f32198a && m97Var.k == daoVar.f) {
                                z2 = true;
                                break;
                            }
                        } else {
                            it2 = it9;
                        }
                        list4 = list2;
                        it9 = it2;
                        list5 = list3;
                    }
                    arrayList9.add(dao.a(daoVar, z, z2, 475135));
                    list4 = list2;
                    it6 = it7;
                    it5 = it;
                    list5 = list3;
                }
                arrayList8.add(arrayList9);
                i = 10;
            }
            arrayList7.add(xt20.a(xt20Var3, arrayList8, false, 0L, 0.0d, 254));
            it5 = it5;
            i = 10;
        }
        if (o530Var.f24669a) {
            return bx7.f3363a;
        }
        if (o530Var.b.isEmpty()) {
            return zw7.f45092a;
        }
        return !arrayList7.isEmpty() ? new xw7(j, arrayList7) : new vw7(j);
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        pzu pzuVar = this.r;
        long j = this.s;
        mc60 mc60Var = new mc60(this.q, pzuVar, j, (yje) obj6);
        mc60Var.l = (o530) obj;
        mc60Var.m = (HashMap) obj2;
        mc60Var.n = (List) obj3;
        mc60Var.o = (List) obj4;
        mc60Var.p = (List) obj5;
        return mc60Var.invokeSuspend(Unit.f46060a);
    }
}
