package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g77 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10802a;

    public final boolean equals(Object obj) {
        if (obj instanceof g77) {
            return this.f10802a.equals(((g77) obj).f10802a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10802a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBarError(message=", this.f10802a, Separators.RPAREN);
    }
}
