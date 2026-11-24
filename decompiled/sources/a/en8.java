package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class en8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8080a;
    public final boolean b;

    public en8(boolean z, boolean z2) {
        this.f8080a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en8)) {
            return false;
        }
        en8 en8Var = (en8) obj;
        return this.f8080a == en8Var.f8080a && this.b == en8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f8080a) * 31);
    }

    public final String toString() {
        return hne.n("BottomBarKeyModel(isAuthorized=", ", isMakeBetButtonEnabled=", Separators.RPAREN, this.f8080a, this.b);
    }
}
