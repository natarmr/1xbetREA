package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rgc0 implements tgc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30427a;

    public rgc0(int i) {
        this.f30427a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgc0) && this.f30427a == ((rgc0) obj).f30427a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30427a);
    }

    public final String toString() {
        return ua80.e(this.f30427a, "SelectTab(position=", Separators.RPAREN);
    }
}
