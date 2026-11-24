package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class la8 implements qa8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19693a;

    public final boolean equals(Object obj) {
        if (obj instanceof la8) {
            return this.f19693a == ((la8) obj).f19693a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19693a);
    }

    public final String toString() {
        return defpackage.c.d("BlockBetValueLoading(value=", Separators.RPAREN, this.f19693a);
    }
}
