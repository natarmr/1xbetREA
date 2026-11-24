package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class zqn implements hrn {
    public static final yqn Companion = new yqn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44814a;

    public /* synthetic */ zqn(int i, int i2) {
        if (1 == (i & 1)) {
            this.f44814a = i2;
        } else {
            m2x.I(i, 1, xqn.f41330a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zqn) && this.f44814a == ((zqn) obj).f44814a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44814a);
    }

    public final String toString() {
        return ua80.e(this.f44814a, "CashbackRequest(wichCashback=", Separators.RPAREN);
    }

    public zqn(int i) {
        this.f44814a = i;
    }
}
