package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ekz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f7975a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public ekz(int i, int i2) {
        this.f7975a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekz)) {
            return false;
        }
        ekz ekzVar = (ekz) obj;
        return this.f7975a == ekzVar.f7975a && this.b == ekzVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f7975a) * 31);
    }

    public final String toString() {
        return ohs0.m("LevelInfoModel(level=", this.f7975a, ", progress=", Separators.RPAREN, this.b);
    }
}
