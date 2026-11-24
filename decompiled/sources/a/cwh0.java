package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cwh0 implements dwh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5080a;

    public cwh0(int i) {
        this.f5080a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwh0) && this.f5080a == ((cwh0) obj).f5080a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5080a);
    }

    public final String toString() {
        return ua80.e(this.f5080a, "ImageRes(id=", Separators.RPAREN);
    }
}
