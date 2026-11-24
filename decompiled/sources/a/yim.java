package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yim implements bjm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42699a;

    public yim(int i) {
        this.f42699a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yim) && this.f42699a == ((yim) obj).f42699a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42699a);
    }

    public final String toString() {
        return ua80.e(this.f42699a, "ActionIcon(iconRes=", Separators.RPAREN);
    }
}
