package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bi5 implements di5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2642a;

    public bi5(String str) {
        this.f2642a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bi5) && this.f2642a.equals(((bi5) obj).f2642a);
    }

    public final int hashCode() {
        return this.f2642a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(errorMessage=", this.f2642a, Separators.RPAREN);
    }
}
