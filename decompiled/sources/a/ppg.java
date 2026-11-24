package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ppg implements fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vqg f27375a;

    public ppg(vqg vqgVar) {
        this.f27375a = vqgVar;
    }

    @Override // a.fer
    public final wdr b() {
        return new rer(1, this.f27375a, vqg.class, "onLastMatchesFooterClick", "onLastMatchesFooterClick(Lorg/xplatform/cyber/game/core/presentation/lastmatches/uimodel/LastMatchesFooterUiModel;)V", 0);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ppg) {
            return b().equals(((fer) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
