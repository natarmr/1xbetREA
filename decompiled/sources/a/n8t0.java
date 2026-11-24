package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class n8t0 implements u8t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23106a;

    public n8t0(int i) {
        this.f23106a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8t0) && this.f23106a == ((n8t0) obj).f23106a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23106a);
    }

    public final String toString() {
        return ua80.e(this.f23106a, "OnGroupStageChipClick(chipId=", Separators.RPAREN);
    }
}
