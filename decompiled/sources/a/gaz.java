package a;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gaz extends w2 {
    public final f7u l;
    public final are0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gaz(f7u f7uVar, are0 are0Var, int i, vjj vjjVar) {
        super(i, new j9z(f7uVar, are0Var, false), vjjVar, (eu00) ((v7i) f7uVar.b).i, g950.e(are0Var.f1343a.getName()), t3u0.c, false);
        f7uVar.getClass();
        this.l = f7uVar;
        this.m = are0Var;
    }

    @Override // a.t5
    public final List p1(List list) {
        gaz gazVar;
        list.getClass();
        f7u f7uVar = this.l;
        Object obj = f7uVar.b;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wsy wsyVar = (wsy) it.next();
            b180 b180Var = b180.Y;
            wsyVar.getClass();
            if (e0t0.c(wsyVar, b180Var, null)) {
                gazVar = this;
            } else {
                gazVar = this;
                wsy wsyVar2 = (wsy) tqt.b(wsyVar.j0(), new huj0(gazVar, false, f7uVar, x83.TYPE_PARAMETER_BOUNDS, false).L(wsyVar, iun.f15405a, null, false), 0, false).c;
                if (wsyVar2 != null) {
                    wsyVar = wsyVar2;
                }
            }
            arrayList.add(wsyVar);
            this = gazVar;
        }
        return arrayList;
    }

    @Override // a.t5
    public final List q1() {
        Type[] bounds = this.m.f1343a.getBounds();
        bounds.getClass();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new oqe0(type));
        }
        oqe0 oqe0Var = (oqe0) CollectionsKt.x0(arrayList);
        Collection collection = arrayList;
        if (Intrinsics.d(oqe0Var != null ? oqe0Var.f25684a : null, Object.class)) {
            collection = iun.f15405a;
        }
        boolean zIsEmpty = collection.isEmpty();
        f7u f7uVar = this.l;
        if (zIsEmpty) {
            return kotlin.collections.a.c(ucx.W(((zm40) ((v7i) f7uVar.b).j).e.e(), ((zm40) ((v7i) f7uVar.b).j).e.p()));
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(((nvu) f7uVar.e).V((oqe0) it.next(), xvw.Y(b0t0.b, false, this, 3)));
        }
        return arrayList2;
    }
}
