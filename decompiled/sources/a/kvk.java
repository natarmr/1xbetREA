package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kvk implements t7d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18958a;
    public final boolean b;

    public kvk(boolean z, boolean z2) {
        this.f18958a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvk)) {
            return false;
        }
        kvk kvkVar = (kvk) obj;
        return this.f18958a == kvkVar.f18958a && this.b == kvkVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f18958a) * 31);
    }

    public final String toString() {
        return hne.n("DismissCurrentDialog(key=null, isAllowingStateLoss=", ", shouldReattachParent=", Separators.RPAREN, this.f18958a, this.b);
    }
}
