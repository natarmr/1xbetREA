package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class it3 implements vt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15335a;
    public final boolean b;

    public it3(boolean z, boolean z2) {
        this.f15335a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it3)) {
            return false;
        }
        it3 it3Var = (it3) obj;
        return this.f15335a == it3Var.f15335a && this.b == it3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f15335a) * 31);
    }

    public final String toString() {
        return hne.n("ShowEndSession(needRejectButton=", ", clearUserCredentials=", Separators.RPAREN, this.f15335a, this.b);
    }
}
