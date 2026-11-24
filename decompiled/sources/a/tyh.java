package a;

/* JADX INFO: loaded from: classes6.dex */
public final class tyh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0x f34755a;

    public tyh(m0x m0xVar) {
        this.f34755a = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tyh) && this.f34755a.equals(((tyh) obj).f34755a);
    }

    public final int hashCode() {
        return this.f34755a.hashCode() * 31;
    }

    public final String toString() {
        return "DSAggregatorBannerRegistrationPictureUiModel(image=" + this.f34755a + ", placeholder=null)";
    }
}
