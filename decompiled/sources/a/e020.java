package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class e020 implements g020 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6970a;

    public e020(int i) {
        this.f6970a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e020) && this.f6970a == ((e020) obj).f6970a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6970a);
    }

    public final String toString() {
        return ua80.e(this.f6970a, "AuthorizedUser(userIconRes=", Separators.RPAREN);
    }
}
