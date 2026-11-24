package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class znz {
    public static final ynz Companion = new ynz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44695a;
    public final int b;

    public /* synthetic */ znz(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, xnz.f41191a.getDescriptor());
            throw null;
        }
        this.f44695a = i2;
        this.b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znz)) {
            return false;
        }
        znz znzVar = (znz) obj;
        return this.f44695a == znzVar.f44695a && this.b == znzVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f44695a) * 31);
    }

    public final String toString() {
        return ohs0.m("LimitRequest(limitValue=", this.f44695a, ", limitType=", Separators.RPAREN, this.b);
    }

    public znz(int i, int i2) {
        this.f44695a = i;
        this.b = i2;
    }
}
