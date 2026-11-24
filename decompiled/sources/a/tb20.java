package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tb20 implements zc20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33641a;

    public tb20(String str) {
        this.f33641a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tb20) && this.f33641a.equals(((tb20) obj).f33641a);
    }

    public final int hashCode() {
        return this.f33641a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowBetExistsErrorDialog(errorMessage=", this.f33641a, Separators.RPAREN);
    }
}
