package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class mn70 extends qn70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22075a;

    public mn70(boolean z) {
        this.f22075a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mn70) && this.f22075a == ((mn70) obj).f22075a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22075a);
    }

    public final String toString() {
        return defpackage.c.d("Reset(freeBonus=", Separators.RPAREN, this.f22075a);
    }
}
