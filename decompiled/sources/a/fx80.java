package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fx80 implements ix80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10298a;

    public fx80(int i) {
        this.f10298a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx80) && this.f10298a == ((fx80) obj).f10298a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10298a);
    }

    public final String toString() {
        return ua80.e(this.f10298a, "Placeholder(res=", Separators.RPAREN);
    }
}
