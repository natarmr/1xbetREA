package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class j8r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16100a;

    public j8r0(mne mneVar) {
        c0o c0oVar = y9s.f;
        int iA = wp20.a(r3d.q(c0oVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            Object next = y2Var.next();
            linkedHashMap.put(next, new ir30(mneVar.b, 120000L));
        }
        this.f16100a = linkedHashMap;
    }
}
