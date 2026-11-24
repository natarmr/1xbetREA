package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v4t implements x4t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f36796a;

    /* JADX WARN: Multi-variable type inference failed */
    public v4t(int i) {
        this.f36796a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v4t) && this.f36796a == ((v4t) obj).f36796a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36796a);
    }

    public final String toString() {
        return ua80.e(this.f36796a, "Recommended(limit=", Separators.RPAREN);
    }
}
