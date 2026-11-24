package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class f1j0 implements o1j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vvi0 f8766a;

    public f1j0(vvi0 vvi0Var) {
        this.f8766a = vvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1j0) && this.f8766a == ((f1j0) obj).f8766a;
    }

    public final int hashCode() {
        return this.f8766a.hashCode();
    }

    public final String toString() {
        return "ShowNeedAuthSnackBar(settingDestinationType=" + this.f8766a + Separators.RPAREN;
    }
}
