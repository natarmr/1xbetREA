package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g5w implements j5w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10736a;

    public g5w(String str) {
        this.f10736a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g5w) && this.f10736a.equals(((g5w) obj).f10736a);
    }

    public final int hashCode() {
        return this.f10736a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(message=", this.f10736a, Separators.RPAREN);
    }
}
