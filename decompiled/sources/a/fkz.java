package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class fkz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f9716a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public fkz(int i, int i2) {
        this.f9716a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkz)) {
            return false;
        }
        fkz fkzVar = (fkz) obj;
        return this.f9716a == fkzVar.f9716a && this.b == fkzVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f9716a) * 31);
    }

    public final String toString() {
        return ohs0.m("LevelInfoUiModel(level=", this.f9716a, ", progress=", Separators.RPAREN, this.b);
    }
}
