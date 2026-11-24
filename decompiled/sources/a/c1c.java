package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class c1c implements e1c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3567a;

    public c1c(String str) {
        this.f3567a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1c) && this.f3567a.equals(((c1c) obj).f3567a);
    }

    public final int hashCode() {
        return this.f3567a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowTokenExpiredMessage(text=", this.f3567a, Separators.RPAREN);
    }
}
