package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ymd extends ind {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bex f42882a;

    public ymd(bex bexVar) {
        this.f42882a = bexVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ymd) && this.f42882a == ((ymd) obj).f42882a;
    }

    public final int hashCode() {
        return this.f42882a.hashCode();
    }

    public final String toString() {
        return "InningStateChanged(inningState=" + this.f42882a + Separators.RPAREN;
    }
}
