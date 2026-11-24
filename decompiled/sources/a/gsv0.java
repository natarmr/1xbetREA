package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gsv0 implements fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hsv0 f11850a;

    public gsv0(hsv0 hsv0Var) {
        this.f11850a = hsv0Var;
    }

    @Override // a.fer
    public final wdr b() {
        return new rer(1, this.f11850a, hsv0.class, "removeRoutes", "removeRoutes(Ljava/util/List;)V", 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gsv0) {
            return b().equals(((fer) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
