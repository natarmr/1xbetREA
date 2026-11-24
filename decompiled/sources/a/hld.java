package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class hld implements pg80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13253a;
    public final String b;

    public hld(List list, String str) {
        list.getClass();
        this.f13253a = list;
        this.b = str;
        list.size();
        CollectionsKt.P0(list).size();
    }

    @Override // a.pg80
    public final void a(swq swqVar, ArrayList arrayList) {
        swqVar.getClass();
        for (pg80 pg80Var : this.f13253a) {
            pg80Var.getClass();
            swqVar.getClass();
            pg80Var.a(swqVar, arrayList);
        }
    }

    @Override // a.pg80
    public final boolean b(swq swqVar) {
        swqVar.getClass();
        List list = this.f13253a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!x2x.g0((pg80) it.next(), swqVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // a.pg80
    public final Collection n(swq swqVar, Function1 function1) {
        swqVar.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = this.f13253a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((pg80) it.next()).n(swqVar, function1));
        }
        return hashSet;
    }

    public final String toString() {
        return this.b;
    }
}
