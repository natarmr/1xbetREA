package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class wmz {
    public static final tmz Companion = new tmz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39424a;
    public final int b;

    public /* synthetic */ wmz(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, qmz.f29009a.getDescriptor());
            throw null;
        }
        this.f39424a = i2;
        this.b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmz)) {
            return false;
        }
        wmz wmzVar = (wmz) obj;
        return this.f39424a == wmzVar.f39424a && this.b == wmzVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f39424a) * 31);
    }

    public final String toString() {
        return ohs0.m("LimitActionRequest(limitGroup=", this.f39424a, ", action=", Separators.RPAREN, this.b);
    }

    public wmz(int i, int i2) {
        this.f39424a = i;
        this.b = i2;
    }
}
