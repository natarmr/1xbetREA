package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mu30 implements cv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22395a;

    public mu30(boolean z) {
        this.f22395a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mu30) && this.f22395a == ((mu30) obj).f22395a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22395a);
    }

    public final String toString() {
        return defpackage.c.d("OnBalanceSettingsChanged(balanceHasChanged=", Separators.RPAREN, this.f22395a);
    }
}
