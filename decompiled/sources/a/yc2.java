package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yc2 implements zc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42365a;

    public final boolean equals(Object obj) {
        if (obj instanceof yc2) {
            return this.f42365a.equals(((yc2) obj).f42365a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42365a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(value=", this.f42365a, Separators.RPAREN);
    }
}
