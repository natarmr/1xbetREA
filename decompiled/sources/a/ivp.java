package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ivp implements kvp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15456a;

    public ivp(String str) {
        this.f15456a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ivp) && this.f15456a.equals(((ivp) obj).f15456a);
    }

    public final int hashCode() {
        return this.f15456a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnResultClick(statId=", this.f15456a, Separators.RPAREN);
    }
}
