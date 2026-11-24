package a;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class i4u extends bnn0 implements zdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ cvo0 j;
    public /* synthetic */ List k;
    public /* synthetic */ List l;
    public /* synthetic */ List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4u(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = 5;
        switch (this.i) {
            case 0:
                i4u i4uVar = new i4u(i, (yje) obj5, (byte) 0);
                i4uVar.k = (List) obj;
                i4uVar.l = (List) obj2;
                i4uVar.m = (List) obj3;
                i4uVar.j = (cvo0) obj4;
                return i4uVar.invokeSuspend(Unit.f46060a);
            default:
                i4u i4uVar2 = new i4u(i, (yje) obj5, (byte) 1);
                i4uVar2.j = (cvo0) obj;
                i4uVar2.k = (List) obj2;
                i4uVar2.l = (List) obj3;
                i4uVar2.m = (List) obj4;
                return i4uVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object next;
        boolean z;
        List list;
        Object next2;
        z6w z6wVar;
        Object next3;
        switch (this.i) {
            case 0:
                List<n85> list2 = this.k;
                List list3 = this.l;
                List list4 = this.m;
                cvo0 cvo0Var = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z2 = (cvo0Var instanceof avo0) || (cvo0Var instanceof bvo0);
                Iterator it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        n85 n85Var = (n85) next;
                        if (!n85Var.f() || n85Var.g != wuo0.b) {
                        }
                    } else {
                        next = null;
                    }
                }
                n85 n85Var2 = (n85) next;
                n85 n85Var3 = (n85) CollectionsKt.firstOrNull(list2);
                if ((n85Var3 != null ? n85Var3.g : null) == wuo0.g) {
                    list2.getClass();
                    ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                    for (n85 n85Var4 : list2) {
                        arrayList.add(new z6w(n85Var4.h, n85Var4.k, n85Var4.l, new Date(), n85Var4.d, n85Var4.e, n85Var4.f, n85Var4.g, n85Var4.i, n85Var4.j));
                        z2 = z2;
                        list2 = list2;
                    }
                    z = z2;
                    list = list2;
                    z6wVar = (z6w) CollectionsKt.firstOrNull(arrayList);
                } else {
                    z = z2;
                    list = list2;
                    Iterator it2 = list4.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            z6w z6wVar2 = (z6w) next2;
                            Date date = z6wVar2.d;
                            Date date2 = new Date();
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(date);
                            Calendar calendar2 = Calendar.getInstance();
                            calendar2.setTime(date2);
                            Pair pair = new Pair(calendar, calendar2);
                            if (!dtb.C(pair, 1) || !dtb.C(pair, 2) || !dtb.C(pair, 5) || !z6wVar2.f() || z6wVar2.h != wuo0.h) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    z6wVar = (z6w) next2;
                }
                Iterator it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next3 = it3.next();
                        n85 n85Var5 = (n85) next3;
                        if (!n85Var5.f() || n85Var5.g != wuo0.c) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                n85 n85Var6 = (n85) next3;
                if (z) {
                    return null;
                }
                return new l0j(n85Var2, z6wVar, n85Var6);
            default:
                cvo0 cvo0Var2 = this.j;
                List list5 = this.k;
                List list6 = this.l;
                List list7 = this.m;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(cvo0Var2, zuo0.f45018a)) {
                    return k4j.f17671a;
                }
                return Intrinsics.d(cvo0Var2, yuo0.f43277a) ? new m4j(list6, list5, list7) : l4j.f19408a;
        }
    }
}
