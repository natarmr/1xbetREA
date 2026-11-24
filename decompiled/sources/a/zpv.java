package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zpv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44779a;
    public final boolean b;

    public zpv(boolean z, boolean z2) {
        this.f44779a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpv)) {
            return false;
        }
        zpv zpvVar = (zpv) obj;
        return this.f44779a == zpvVar.f44779a && this.b == zpvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f44779a) * 31);
    }

    public final String toString() {
        return hne.n("HeaderActionsState(enableSearch=", ", enableDelete=", Separators.RPAREN, this.f44779a, this.b);
    }
}
