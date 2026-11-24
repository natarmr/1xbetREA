package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class blc {
    public static final alc Companion = new alc();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2789a;

    public /* synthetic */ blc(int i, int i2) {
        if (1 == (i & 1)) {
            this.f2789a = i2;
        } else {
            m2x.I(i, 1, zkc.f44525a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof blc) && this.f2789a == ((blc) obj).f2789a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2789a);
    }

    public final String toString() {
        return ua80.e(this.f2789a, "ClaimBonusRequest(data=", Separators.RPAREN);
    }

    public blc(int i) {
        this.f2789a = i;
    }
}
