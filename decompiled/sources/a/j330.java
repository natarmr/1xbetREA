package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j330 implements p330 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15812a;

    public j330(int i) {
        this.f15812a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j330) && this.f15812a == ((j330) obj).f15812a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15812a);
    }

    public final String toString() {
        return ua80.e(this.f15812a, "OnDisplayOrderTabSelected(position=", Separators.RPAREN);
    }
}
