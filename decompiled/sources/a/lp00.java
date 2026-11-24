package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lp00 implements mp00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20417a;

    public lp00(int i) {
        this.f20417a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lp00) && this.f20417a == ((lp00) obj).f20417a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20417a);
    }

    public final String toString() {
        return ua80.e(this.f20417a, "LoadingResources(backgroundColor=", Separators.RPAREN);
    }
}
