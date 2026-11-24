package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class f7c implements h7c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9054a;

    public f7c(String str) {
        this.f9054a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7c) && this.f9054a.equals(((f7c) obj).f9054a);
    }

    public final int hashCode() {
        return this.f9054a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowTokenExpiredDialog(message=", this.f9054a, Separators.RPAREN);
    }
}
