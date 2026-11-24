package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class biw implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hdm f2676a;

    public biw(hdm hdmVar) {
        this.f2676a = hdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof biw) && this.f2676a.equals(((biw) obj).f2676a);
    }

    public final int hashCode() {
        return this.f2676a.f12876a.hashCode();
    }

    public final String toString() {
        return "HomeBannerCollectionUiModel(uiModel=" + this.f2676a + Separators.RPAREN;
    }
}
