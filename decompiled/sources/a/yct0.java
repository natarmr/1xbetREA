package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yct0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g9m f42399a;

    public yct0(g9m g9mVar) {
        this.f42399a = g9mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yct0) && this.f42399a.equals(((yct0) obj).f42399a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "SOCIAL_MEDIA";
    }

    public final int hashCode() {
        return this.f42399a.f10921a.hashCode() - 99340850;
    }

    public final String toString() {
        return "UniversalChampSocialMediaUiModel(key=SOCIAL_MEDIA, socialMedia=" + this.f42399a + Separators.RPAREN;
    }
}
