package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kbh implements qbh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18014a;

    public kbh(boolean z) {
        this.f18014a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbh) && this.f18014a == ((kbh) obj).f18014a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18014a);
    }

    public final String toString() {
        return defpackage.c.d("OnPollingActiveChanged(active=", Separators.RPAREN, this.f18014a);
    }
}
