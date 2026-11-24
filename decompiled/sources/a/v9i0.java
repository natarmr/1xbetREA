package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v9i0 implements x9i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37036a;

    public v9i0(String str) {
        this.f37036a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v9i0) && this.f37036a.equals(((v9i0) obj).f37036a);
    }

    public final int hashCode() {
        return this.f37036a.hashCode();
    }

    public final String toString() {
        return kng0.l("Error(message=", this.f37036a, Separators.RPAREN);
    }
}
