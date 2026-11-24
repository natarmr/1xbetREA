package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fim implements kim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9595a;

    public fim(int i) {
        this.f9595a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fim) && this.f9595a == ((fim) obj).f9595a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9595a);
    }

    public final String toString() {
        return ua80.e(this.f9595a, "OnButtonClick(id=", Separators.RPAREN);
    }
}
