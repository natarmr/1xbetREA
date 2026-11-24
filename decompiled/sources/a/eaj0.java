package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class eaj0 implements taj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7468a;

    public final boolean equals(Object obj) {
        if (obj instanceof eaj0) {
            return this.f7468a == ((eaj0) obj).f7468a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7468a);
    }

    public final String toString() {
        return defpackage.c.d("BalanceSettingsChanged(value=", Separators.RPAREN, this.f7468a);
    }
}
