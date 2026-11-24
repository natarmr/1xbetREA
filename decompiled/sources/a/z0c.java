package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class z0c implements e1c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43559a;

    public z0c(String str) {
        this.f43559a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0c) && this.f43559a.equals(((z0c) obj).f43559a);
    }

    public final int hashCode() {
        return this.f43559a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorMessage(text=", this.f43559a, Separators.RPAREN);
    }
}
