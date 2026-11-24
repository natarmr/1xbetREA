package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class w470 extends a570 {
    public static final v470 Companion = new v470();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s470 f38531a;

    public w470(int i, s470 s470Var) {
        if (1 == (i & 1)) {
            this.f38531a = s470Var;
        } else {
            m2x.I(i, 1, u470.f35031a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w470) && this.f38531a == ((w470) obj).f38531a;
    }

    public final int hashCode() {
        return this.f38531a.hashCode();
    }

    public final String toString() {
        return "OneXGamesTypeNative(gameType=" + this.f38531a + Separators.RPAREN;
    }

    public w470(s470 s470Var) {
        this.f38531a = s470Var;
    }
}
