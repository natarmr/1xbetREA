package a;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public final class g8n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f10874a = q7m0.a(xun.f41520a);
    public final ir30 b;
    public final ir30 c;
    public final AtomicBoolean d;

    public g8n0(mne mneVar) {
        dvj dvjVar = mneVar.b;
        this.b = new ir30(dvjVar, 120000L);
        this.c = new ir30(dvjVar, 120000L);
        this.d = new AtomicBoolean(false);
    }

    public final boolean a(ots otsVar) {
        p7m0 p7m0Var = this.f10874a;
        Set set = (Set) p7m0Var.getValue();
        LinkedHashSet linkedHashSetH = eui0.h(set, otsVar);
        p7m0Var.o(null, linkedHashSetH);
        return linkedHashSetH.size() >= set.size();
    }

    public final boolean b(ots otsVar) {
        p7m0 p7m0Var = this.f10874a;
        Set set = (Set) p7m0Var.getValue();
        LinkedHashSet linkedHashSetE = eui0.e(set, otsVar);
        p7m0Var.o(null, linkedHashSetE);
        return linkedHashSetE.size() <= set.size();
    }

    public final ots c(long j) {
        Object next;
        Iterator it = ((Iterable) this.f10874a.getValue()).iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((ots) next).f25844a == j) {
                return (ots) next;
            }
        }
        next = null;
        return (ots) next;
    }
}
