package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ma8 implements qa8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21446a;

    public final boolean equals(Object obj) {
        if (obj instanceof ma8) {
            return this.f21446a == ((ma8) obj).f21446a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21446a);
    }

    public final String toString() {
        return defpackage.c.d("BlockBetVisible(value=", Separators.RPAREN, this.f21446a);
    }
}
