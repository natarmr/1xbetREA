package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pqk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f27420a;

    public pqk0(int i) {
        this.f27420a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqk0) && this.f27420a == ((pqk0) obj).f27420a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f27420a);
    }

    public final String toString() {
        return ua80.e(this.f27420a, "OnCyberGroupTabClick(index=", Separators.RPAREN);
    }
}
