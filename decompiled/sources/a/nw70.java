package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nw70 implements qjt {
    @Override // a.qjt
    public void a(htw htwVar, String str, j jVar) {
        jVar.getClass();
        c(htwVar, str, jVar);
        Iterator it = jVar.a().iterator();
        while (it.hasNext()) {
            aad.F((j) it.next(), htwVar);
        }
        b(htwVar, str, jVar);
    }

    public abstract void b(htw htwVar, String str, j jVar);

    public abstract void c(htw htwVar, String str, j jVar);
}
