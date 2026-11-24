package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ucn0 implements ycn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35439a;

    public ucn0(boolean z) {
        this.f35439a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ucn0) && this.f35439a == ((ucn0) obj).f35439a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f35439a);
    }

    public final String toString() {
        return defpackage.c.d("SetBasketButtonEnabled(enabled=", Separators.RPAREN, this.f35439a);
    }
}
