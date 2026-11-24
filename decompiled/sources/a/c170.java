package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c170 implements j170 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3561a;

    public c170(int i) {
        this.f3561a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c170) && this.f3561a == ((c170) obj).f3561a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3561a);
    }

    public final String toString() {
        return ua80.e(this.f3561a, "OnItemClick(id=", Separators.RPAREN);
    }
}
