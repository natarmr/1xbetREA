package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes5.dex */
public final class sld0 extends w46 {
    public final i1w0 b;
    public final ljf0 c;
    public final yfu d;
    public final ih5 e;
    public final au0 f;
    public final ctf0 g;
    public final mne h;
    public final nr i;
    public final p7m0 j;
    public final ol60 k;
    public final sff0 l;
    public final ArrayList m;

    public sld0(i1w0 i1w0Var, ljf0 ljf0Var, yfu yfuVar, ih5 ih5Var, au0 au0Var, ctf0 ctf0Var, mne mneVar, nr nrVar, pru pruVar) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        this.b = i1w0Var;
        this.c = ljf0Var;
        this.d = yfuVar;
        this.e = ih5Var;
        this.f = au0Var;
        this.g = ctf0Var;
        this.h = mneVar;
        this.i = nrVar;
        this.j = q7m0.a(pld0.f27177a);
        this.k = new ol60(1, i99.b);
        this.l = pruVar.a();
        this.m = new ArrayList();
        sac.V(jiu0.a(this), new v6d0(this, (byte) 8), null, mneVar.f22085a, new rld0(this, null, (byte) 0), 10);
    }

    public final void w() {
        Object obj;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        List listD0 = CollectionsKt.D0(CollectionsKt.S0(this.d.i(this.l)), 4);
        Iterator it = listD0.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((IndexedValue) next).b != nev0.LIVE);
        boolean z = next != null;
        Iterator it2 = listD0.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (((IndexedValue) next2).b != nev0.RESULTS);
        boolean z2 = next2 != null;
        Iterator it3 = listD0.iterator();
        do {
            if (!it3.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it3.next();
        } while (((IndexedValue) next3).b != nev0.CYBER);
        boolean z3 = next3 != null;
        Iterator it4 = listD0.iterator();
        do {
            if (!it4.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it4.next();
        } while (((IndexedValue) next4).b != nev0.SEARCH);
        boolean z4 = next4 != null;
        Iterator it5 = listD0.iterator();
        do {
            if (!it5.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it5.next();
        } while (((IndexedValue) next5).b != nev0.AGGREGATOR);
        boolean z5 = next5 != null;
        for (Object obj2 : listD0) {
            if (((IndexedValue) obj2).b == nev0.XGAMES) {
                obj = obj2;
                break;
            }
        }
        boolean z6 = obj != null;
        s1p s1pVar = this.f.f1455a;
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(z ? "live_on" : "live_off");
        lc00VarB.add(z2 ? "results_on" : "results_off");
        lc00VarB.add(z3 ? "cyber_on" : "cyber_off");
        lc00VarB.add(z4 ? "search_on" : "search_off");
        lc00VarB.add(z5 ? "aggregator_on" : "aggregator_off");
        lc00VarB.add(z6 ? "1xgames_on" : "games_off");
        s1pVar.a(cui0.b(new j1p(CollectionsKt.b0(kotlin.collections.a.a(lc00VarB), null, null, null, null, 63), (byte) 0)), 3156L);
        i1w0 i1w0Var = this.b;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
