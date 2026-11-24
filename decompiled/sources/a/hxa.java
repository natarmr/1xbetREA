package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hxa implements txa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13805a;

    public hxa(long j) {
        this.f13805a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hxa) && this.f13805a == ((hxa) obj).f13805a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13805a);
    }

    public final String toString() {
        return axq.h(this.f13805a, "OnScreenShown(monthGameId=", Separators.RPAREN);
    }
}
