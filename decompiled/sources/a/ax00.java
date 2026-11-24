package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ax00 implements dx00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1600a;

    public ax00(int i) {
        this.f1600a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ax00) && this.f1600a == ((ax00) obj).f1600a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1600a);
    }

    public final String toString() {
        return ua80.e(this.f1600a, "Placeholder(res=", Separators.RPAREN);
    }
}
