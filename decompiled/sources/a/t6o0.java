package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t6o0 implements w6o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33428a;

    public t6o0(int i) {
        this.f33428a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t6o0) && this.f33428a == ((t6o0) obj).f33428a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33428a);
    }

    public final String toString() {
        return ua80.e(this.f33428a, "OnDateFilterClick(position=", Separators.RPAREN);
    }
}
