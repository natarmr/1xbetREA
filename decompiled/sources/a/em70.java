package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class em70 extends im70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8034a;

    public em70(boolean z) {
        this.f8034a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof em70) && this.f8034a == ((em70) obj).f8034a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8034a);
    }

    public final String toString() {
        return defpackage.c.d("SetInstantBetButtonChecked(enable=", Separators.RPAREN, this.f8034a);
    }
}
