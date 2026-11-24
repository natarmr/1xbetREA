package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class t3f implements c4f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33263a;

    public t3f(int i) {
        this.f33263a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3f) && this.f33263a == ((t3f) obj).f33263a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33263a);
    }

    public final String toString() {
        return ua80.e(this.f33263a, "ShowMakeBlockBet(blockId=", Separators.RPAREN);
    }
}
