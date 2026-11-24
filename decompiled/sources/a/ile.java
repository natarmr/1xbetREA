package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ile extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14974a;

    public ile(boolean z) {
        this.f14974a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ile) && this.f14974a == ((ile) obj).f14974a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14974a);
    }

    public final String toString() {
        return defpackage.c.d("ChangeAccountToPrimaryDialogAllowed(allowed=", Separators.RPAREN, this.f14974a);
    }
}
