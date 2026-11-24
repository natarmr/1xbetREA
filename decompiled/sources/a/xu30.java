package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xu30 implements cv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41491a;

    public xu30(String str) {
        this.f41491a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xu30) && this.f41491a.equals(((xu30) obj).f41491a);
    }

    public final int hashCode() {
        return this.f41491a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnShowOnboarding(openedScreenName=", this.f41491a, Separators.RPAREN);
    }
}
