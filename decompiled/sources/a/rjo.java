package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class rjo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ony f30604a;

    public rjo(ony onyVar) {
        onyVar.getClass();
        this.f30604a = onyVar;
    }

    public final void a(Throwable th) {
        th.getClass();
        b(th);
        tfq.a().c(th);
        th.printStackTrace();
    }

    public final void b(Throwable th) {
        th.getClass();
        String strS = wgm0.s(th);
        if ((th instanceof zhi0) && ((zhi0) th).c == i2o.BadRequest) {
            return;
        }
        strS.getClass();
        if (strS.length() > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("StackTrace", ncy.c(strS));
            ((rny) this.f30604a).a("Exception", new tny("event", xp20.n(linkedHashMap)));
        }
    }
}
