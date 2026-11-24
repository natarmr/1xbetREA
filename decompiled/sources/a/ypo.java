package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ypo implements hqo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43040a;

    public ypo(long j) {
        this.f43040a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ypo) && this.f43040a == ((ypo) obj).f43040a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f43040a);
    }

    public final String toString() {
        return axq.h(this.f43040a, "OnExpandableCardClick(id=", Separators.RPAREN);
    }
}
