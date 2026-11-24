package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class v4e extends w4e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36773a;

    public v4e(int i) {
        this.f36773a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4e) && this.f36773a == ((v4e) obj).f36773a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36773a);
    }

    public final String toString() {
        return ua80.e(this.f36773a, "ConstraintsNotMet(reason=", Separators.RPAREN);
    }
}
