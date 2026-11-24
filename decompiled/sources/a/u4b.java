package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class u4b implements x4b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35037a;

    public u4b(int i) {
        this.f35037a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4b) && this.f35037a == ((u4b) obj).f35037a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35037a);
    }

    public final String toString() {
        return ua80.e(this.f35037a, "OnRightButtonClick(index=", Separators.RPAREN);
    }
}
