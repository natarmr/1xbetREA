package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class q5g implements v5g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28149a;

    public final boolean equals(Object obj) {
        if (obj instanceof q5g) {
            return this.f28149a.equals(((q5g) obj).f28149a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28149a.hashCode();
    }

    public final String toString() {
        return kng0.l("Date(value=", this.f28149a, Separators.RPAREN);
    }
}
