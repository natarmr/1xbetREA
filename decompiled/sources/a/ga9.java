package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ga9 implements ha9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10954a;

    public ga9(int i) {
        this.f10954a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ga9) && this.f10954a == ((ga9) obj).f10954a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10954a);
    }

    public final String toString() {
        return ua80.e(this.f10954a, "OnTabChanged(tabIndex=", Separators.RPAREN);
    }
}
