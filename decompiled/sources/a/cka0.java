package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cka0 implements dka0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4496a;

    public cka0(int i) {
        this.f4496a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cka0) && this.f4496a == ((cka0) obj).f4496a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4496a);
    }

    public final String toString() {
        return ua80.e(this.f4496a, "OnTabSelected(position=", Separators.RPAREN);
    }
}
