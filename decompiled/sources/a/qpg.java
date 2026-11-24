package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qpg implements fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vqg f29117a;

    public qpg(vqg vqgVar) {
        this.f29117a = vqgVar;
    }

    @Override // a.fer
    public final wdr b() {
        return new rer(1, this.f29117a, vqg.class, "onClickTab", "onClickTab(J)V", 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qpg) {
            return b().equals(((fer) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
