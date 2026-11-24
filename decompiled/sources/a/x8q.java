package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class x8q implements f9q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40473a;

    public x8q(int i) {
        this.f40473a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8q) && this.f40473a == ((x8q) obj).f40473a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40473a);
    }

    public final String toString() {
        return ua80.e(this.f40473a, "OnGraphZoneTouched(index=", Separators.RPAREN);
    }
}
