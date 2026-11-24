package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class tqb0 implements uqb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34373a;

    public final boolean equals(Object obj) {
        if (obj instanceof tqb0) {
            return this.f34373a == ((tqb0) obj).f34373a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34373a);
    }

    public final String toString() {
        return defpackage.c.d("TimerVisibility(value=", Separators.RPAREN, this.f34373a);
    }
}
