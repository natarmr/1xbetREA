package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class z7u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final edo f43937a;

    public z7u(edo edoVar, byte b) {
        edoVar.getClass();
        switch (b) {
            case 1:
                this.f43937a = edoVar;
                break;
            case 2:
                this.f43937a = edoVar;
                break;
            default:
                this.f43937a = edoVar;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v8, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    public Serializable a(List list, zje zjeVar) {
        kfu kfuVar;
        ArrayList arrayList;
        ?? arrayList2;
        if (zjeVar instanceof kfu) {
            kfuVar = (kfu) zjeVar;
            int i = kfuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                kfuVar.l = i - Integer.MIN_VALUE;
            } else {
                kfuVar = new kfu(this, zjeVar);
            }
        } else {
            kfuVar = new kfu(this, zjeVar);
        }
        Object obj = kfuVar.j;
        wne wneVar = wne.f39444a;
        int i2 = kfuVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            if (list.isEmpty()) {
                return iun.f15405a;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a5w a5wVar = (a5w) it.next();
                if (a5wVar != null) {
                    if (a5wVar instanceof vw4) {
                        List list2 = ((vw4) a5wVar).T;
                        arrayList2 = new ArrayList(r3d.q(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            axq.t(((z0w) it2.next()).F, arrayList2);
                        }
                    } else if (a5wVar instanceof kzv) {
                        List list3 = ((kzv) a5wVar).Y;
                        arrayList2 = new ArrayList(r3d.q(list3, 10));
                        Iterator it3 = list3.iterator();
                        while (it3.hasNext()) {
                            axq.t(((z0w) it3.next()).F, arrayList2);
                        }
                    } else if (a5wVar instanceof z7y) {
                        arrayList2 = iun.f15405a;
                    } else if (a5wVar instanceof for0) {
                        arrayList2 = iun.f15405a;
                    } else if (a5wVar instanceof nc10) {
                        arrayList2 = iun.f15405a;
                    } else if (a5wVar instanceof y21) {
                        arrayList2 = iun.f15405a;
                    }
                    w3d.u(arrayList3, arrayList2);
                }
                t9f.b();
                return null;
            }
            if (arrayList3.isEmpty()) {
                return iun.f15405a;
            }
            kfuVar.i = arrayList3;
            kfuVar.l = 1;
            Object objB = this.f43937a.b(kfuVar);
            if (objB == wneVar) {
                return wneVar;
            }
            obj = objB;
            arrayList = arrayList3;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = kfuVar.i;
            z1x.P(obj);
        }
        Set setP0 = CollectionsKt.P0(arrayList);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (setP0.contains(new Long(((xco) obj2).f40655a))) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(int i, zje zjeVar) {
        y7u y7uVar;
        String str;
        if (zjeVar instanceof y7u) {
            y7uVar = (y7u) zjeVar;
            int i2 = y7uVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y7uVar.l = i2 - Integer.MIN_VALUE;
            } else {
                y7uVar = new y7u(this, zjeVar);
            }
        } else {
            y7uVar = new y7u(this, zjeVar);
        }
        Object objB = y7uVar.j;
        wne wneVar = wne.f39444a;
        int i3 = y7uVar.l;
        Object obj = null;
        if (i3 == 0) {
            z1x.P(objB);
            y7uVar.i = i;
            y7uVar.l = 1;
            objB = this.f43937a.b(y7uVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = y7uVar.i;
            z1x.P(objB);
        }
        for (Object obj2 : (Iterable) objB) {
            if (((xco) obj2).f40655a == i) {
                obj = obj2;
                break;
            }
        }
        xco xcoVar = (xco) obj;
        return (xcoVar == null || (str = xcoVar.b) == null) ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(long j, zje zjeVar) {
        apx apxVar;
        if (zjeVar instanceof apx) {
            apxVar = (apx) zjeVar;
            int i = apxVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                apxVar.k = i - Integer.MIN_VALUE;
            } else {
                apxVar = new apx(this, zjeVar);
            }
        } else {
            apxVar = new apx(this, zjeVar);
        }
        Object objA = apxVar.i;
        wne wneVar = wne.f39444a;
        int i2 = apxVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            apxVar.k = 1;
            objA = this.f43937a.a(j, apxVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        xco xcoVar = (xco) objA;
        return Boolean.valueOf(xcoVar != null ? xcoVar.e : false);
    }
}
