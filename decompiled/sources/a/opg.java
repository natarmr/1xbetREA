package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class opg implements fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vqg f25640a;

    public opg(vqg vqgVar) {
        this.f25640a = vqgVar;
    }

    @Override // a.fer
    public final wdr b() {
        return new rer(1, this.f25640a, vqg.class, "onStatisticButtonClick", "onStatisticButtonClick(J)V", 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof opg) {
            return b().equals(((fer) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
