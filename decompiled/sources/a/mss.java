package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mss implements qss {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pdq f22336a;

    public final boolean equals(Object obj) {
        if (obj instanceof mss) {
            return this.f22336a.equals(((mss) obj).f22336a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22336a.hashCode();
    }

    public final String toString() {
        return "FindLive(value=" + this.f22336a + Separators.RPAREN;
    }
}
