package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class u8j implements g9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35234a;

    public final boolean equals(Object obj) {
        if (obj instanceof u8j) {
            return this.f35234a.equals(((u8j) obj).f35234a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35234a.hashCode();
    }

    public final String toString() {
        return kng0.l("Description(value=", this.f35234a, Separators.RPAREN);
    }
}
