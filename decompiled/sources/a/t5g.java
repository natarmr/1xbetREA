package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t5g implements v5g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33367a;

    public final boolean equals(Object obj) {
        if (obj instanceof t5g) {
            return this.f33367a.equals(((t5g) obj).f33367a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33367a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamsSize(value=", this.f33367a, Separators.RPAREN);
    }
}
