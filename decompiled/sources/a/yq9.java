package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yq9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43065a;

    public yq9(boolean z) {
        this.f43065a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yq9) && this.f43065a == ((yq9) obj).f43065a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43065a);
    }

    public final String toString() {
        return defpackage.c.d("CallbackHistoryNewUiEnabledValue(enabled=", Separators.RPAREN, this.f43065a);
    }
}
