package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hod0 implements jod0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13390a;

    public hod0(String str) {
        this.f13390a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hod0) && this.f13390a.equals(((hod0) obj).f13390a);
    }

    public final int hashCode() {
        return this.f13390a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnack(message=", this.f13390a, Separators.RPAREN);
    }
}
