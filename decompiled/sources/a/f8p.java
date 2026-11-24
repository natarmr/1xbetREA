package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class f8p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f9118a;
    public final ir30 b;

    public f8p(mne mneVar) {
        dvj dvjVar = mneVar.b;
        c0o c0oVar = j8p.f;
        int iA = wp20.a(r3d.q(c0oVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            Object next = y2Var.next();
            linkedHashMap.put(next, new ir30(dvjVar, 120000L));
        }
        this.f9118a = linkedHashMap;
        this.b = new ir30(dvjVar, 120000L);
    }

    public final void a(ArrayList arrayList, j8p j8pVar) {
        j8pVar.getClass();
        ir30 ir30Var = (ir30) this.f9118a.get(j8pVar);
        if (ir30Var != null) {
            ir30Var.d(arrayList);
        }
    }
}
