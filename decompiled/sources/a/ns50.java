package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ns50 implements os50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24037a;

    public ns50(boolean z) {
        this.f24037a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ns50) && this.f24037a == ((ns50) obj).f24037a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24037a);
    }

    public final String toString() {
        return defpackage.c.d("OnTopBannerVisibilityChanged(visible=", Separators.RPAREN, this.f24037a);
    }
}
