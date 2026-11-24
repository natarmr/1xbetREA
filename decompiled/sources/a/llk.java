package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class llk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20251a;
    public final boolean b;

    public llk(int i, boolean z) {
        this.f20251a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llk)) {
            return false;
        }
        llk llkVar = (llk) obj;
        return this.f20251a == llkVar.f20251a && this.b == llkVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f20251a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f20251a, "DiceUiModel(diceImage=", ", disable=", Separators.RPAREN, this.b);
    }
}
