package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class toe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34280a;

    public toe(int i) {
        this.f34280a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof toe) && this.f34280a == ((toe) obj).f34280a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34280a);
    }

    public final String toString() {
        return ua80.e(this.f34280a, "CountModel(count=", Separators.RPAREN);
    }
}
