package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class ilc implements ckj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mqe0 f14970a;
    public final Function1 b;
    public final w0 c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    public ilc(mqe0 mqe0Var, Function1 function1) {
        mqe0Var.getClass();
        this.f14970a = mqe0Var;
        this.b = function1;
        w0 w0Var = new w0(this, (byte) 13);
        this.c = w0Var;
        c5q c5qVarH = pgi0.h(CollectionsKt.I(mqe0Var.d()), w0Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b5q b5qVar = new b5q(c5qVarH);
        while (b5qVar.hasNext()) {
            Object next = b5qVar.next();
            g950 g950VarC = ((vqe0) next).c();
            Object arrayList = linkedHashMap.get(g950VarC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(g950VarC, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.d = linkedHashMap;
        c5q c5qVarH2 = pgi0.h(CollectionsKt.I(this.f14970a.b()), this.b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        b5q b5qVar2 = new b5q(c5qVarH2);
        while (b5qVar2.hasNext()) {
            Object next2 = b5qVar2.next();
            linkedHashMap2.put(((sqe0) next2).c(), next2);
        }
        this.e = linkedHashMap2;
        ArrayList arrayListF = this.f14970a.f();
        Function1 function2 = this.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListF) {
            if (((Boolean) function2.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iA = wp20.a(r3d.q(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((yqe0) obj2).c(), obj2);
        }
        this.f = linkedHashMap3;
    }

    @Override // a.ckj
    public final yqe0 a(g950 g950Var) {
        g950Var.getClass();
        return (yqe0) this.f.get(g950Var);
    }

    @Override // a.ckj
    public final sqe0 b(g950 g950Var) {
        return (sqe0) this.e.get(g950Var);
    }

    @Override // a.ckj
    public final Set c() {
        c5q c5qVarH = pgi0.h(CollectionsKt.I(this.f14970a.d()), this.c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b5q b5qVar = new b5q(c5qVarH);
        while (b5qVar.hasNext()) {
            linkedHashSet.add(((vqe0) b5qVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override // a.ckj
    public final Collection d(g950 g950Var) {
        List list = (List) this.d.get(g950Var);
        return list != null ? list : iun.f15405a;
    }

    @Override // a.ckj
    public final Set e() {
        return this.f.keySet();
    }

    @Override // a.ckj
    public final Set f() {
        c5q c5qVarH = pgi0.h(CollectionsKt.I(this.f14970a.b()), this.b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        b5q b5qVar = new b5q(c5qVarH);
        while (b5qVar.hasNext()) {
            linkedHashSet.add(((sqe0) b5qVar.next()).c());
        }
        return linkedHashSet;
    }
}
