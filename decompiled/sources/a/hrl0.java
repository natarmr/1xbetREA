package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hrl0 implements rrl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13537a;

    public hrl0(String str) {
        this.f13537a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hrl0) && this.f13537a.equals(((hrl0) obj).f13537a);
    }

    public final int hashCode() {
        return this.f13537a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnChangeQuery(query=", this.f13537a, Separators.RPAREN);
    }
}
