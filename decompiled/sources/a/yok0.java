package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class yok0 implements zok0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42991a;

    public yok0(int i) {
        this.f42991a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yok0) && this.f42991a == ((yok0) obj).f42991a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42991a);
    }

    public final String toString() {
        return ua80.e(this.f42991a, "OnTabSelected(position=", Separators.RPAREN);
    }
}
