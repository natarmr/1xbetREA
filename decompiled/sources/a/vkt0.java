package a;

/* JADX INFO: loaded from: classes4.dex */
public final class vkt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uuy f37592a;

    public vkt0(uuy uuyVar) {
        uuyVar.getClass();
        this.f37592a = uuyVar;
    }

    public final void a(wuy wuyVar) {
        uuy uuyVar = this.f37592a;
        uuyVar.getClass();
        tuy tuyVar = uuyVar.f36323a;
        tuyVar.getClass();
        p7m0 p7m0Var = tuyVar.c;
        while (true) {
            Object value = p7m0Var.getValue();
            wuy wuyVar2 = wuyVar;
            if (p7m0Var.m(value, suy.a((suy) value, wuyVar2, 0L, 0L, false, 30))) {
                return;
            } else {
                wuyVar = wuyVar2;
            }
        }
    }
}
