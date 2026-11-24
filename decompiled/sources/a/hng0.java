package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hng0 implements ing0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13351a;

    public hng0(String str) {
        this.f13351a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hng0) && this.f13351a.equals(((hng0) obj).f13351a);
    }

    public final int hashCode() {
        return this.f13351a.hashCode();
    }

    public final String toString() {
        return kng0.l("SendMailAction(uri=", this.f13351a, Separators.RPAREN);
    }
}
