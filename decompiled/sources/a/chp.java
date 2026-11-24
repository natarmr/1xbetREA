package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class chp implements dhp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4371a;

    public chp(String str) {
        this.f4371a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof chp) && this.f4371a.equals(((chp) obj).f4371a);
    }

    public final int hashCode() {
        return this.f4371a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchChange(value=", this.f4371a, Separators.RPAREN);
    }
}
