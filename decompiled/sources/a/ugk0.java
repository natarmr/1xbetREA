package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ugk0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35629a;

    public ugk0(boolean z) {
        this.f35629a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ugk0) && this.f35629a == ((ugk0) obj).f35629a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35629a);
    }

    public final String toString() {
        return defpackage.c.d("SocialAccordionUiModel(isExpand=", Separators.RPAREN, this.f35629a);
    }
}
