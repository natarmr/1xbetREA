package a;

/* JADX INFO: loaded from: classes5.dex */
public final class wkt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1u f39324a;
    public final pbt b;

    public wkt0(l1u l1uVar, pbt pbtVar) {
        l1uVar.getClass();
        this.f39324a = l1uVar;
        this.b = pbtVar;
    }

    public final void a(double d) {
        if (d >= this.f39324a.a()) {
            j5t j5tVar = this.b.f26724a;
            double d2 = j5tVar.k.f6530a;
            if (d < d2) {
                d = d2;
            }
            j5tVar.w = d;
            j5t.a(Double.valueOf(d), "lastBetForMultiChoiceGame");
        }
    }
}
