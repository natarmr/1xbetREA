package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pv40 implements bco0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f27647a;
    public final Function1 b;
    public final Function1 c;
    public final pz40 d;
    public final qoj0 e = roj0.b(0, 1, i99.b, 1);

    public pv40(LinkedHashMap linkedHashMap, mbo0 mbo0Var, Function1 function1, Function1 function2) {
        this.f27647a = linkedHashMap;
        this.b = function1;
        this.c = function2;
        this.d = androidx.compose.runtime.e.e(mbo0Var);
    }

    @Override // a.bco0
    public final void a(mbo0 mbo0Var) {
        Object next;
        Function1 function1;
        Iterator it = this.f27647a.keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d((mbo0) next, mbo0Var));
        mbo0 mbo0Var2 = (mbo0) next;
        if (mbo0Var2 == null || (function1 = this.b) == null) {
            return;
        }
        function1.invoke(mbo0Var2);
    }

    @Override // a.bco0
    public final void b() {
        Function1 function1;
        if (this.f27647a.size() <= 0 || (function1 = this.c) == null) {
            return;
        }
        function1.invoke(0);
    }

    @Override // a.bco0
    public final noj0 c() {
        return this.e;
    }

    public final LinkedHashMap d(Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.e0(214652942);
        LinkedHashMap linkedHashMap = this.f27647a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(wp20.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            mbo0 mbo0Var = (mbo0) entry.getKey();
            u950 u950Var = (u950) entry.getValue();
            fetVar.b0(-1621807926, mbo0Var);
            ArrayList arrayListW = v3c.W(u950Var, q3d.j(u7x.G(fetVar), a4n0.k(fetVar)), function1, fetVar, (i << 6) & 896);
            fetVar.r(false);
            linkedHashMap2.put(key, arrayListW);
        }
        fetVar.r(false);
        return linkedHashMap2;
    }

    public final void e(mbo0 mbo0Var) {
        mbo0Var.getClass();
        LinkedHashMap linkedHashMap = this.f27647a;
        if (linkedHashMap.containsKey(mbo0Var)) {
            hgk0 hgk0Var = (hgk0) this.d;
            if (!mbo0Var.equals(hgk0Var.getValue())) {
                hgk0Var.setValue(mbo0Var);
                return;
            }
            u950 u950Var = (u950) xp20.d(linkedHashMap, mbo0Var);
            while (u950Var.f35267a.size() > 1) {
                u950Var.remove(u950Var.f35267a.size() - 1);
            }
        }
    }
}
