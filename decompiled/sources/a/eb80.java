package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class eb80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7508a;

    public eb80(int i) {
        this.f7508a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eb80) && this.f7508a == ((eb80) obj).f7508a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f7508a);
    }

    public final String toString() {
        return ua80.e(this.f7508a, "OnChampRecommendSelected(index=", Separators.RPAREN);
    }
}
