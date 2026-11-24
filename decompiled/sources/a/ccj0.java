package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ccj0 implements scj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4114a;

    public ccj0(String str) {
        this.f4114a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccj0) && this.f4114a.equals(((ccj0) obj).f4114a);
    }

    public final int hashCode() {
        return this.f4114a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowAppInfoDialog(appInfo=", this.f4114a, Separators.RPAREN);
    }
}
