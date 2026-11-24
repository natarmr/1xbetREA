package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dsz implements fsz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6637a;

    public final boolean equals(Object obj) {
        if (obj instanceof dsz) {
            return this.f6637a == ((dsz) obj).f6637a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6637a);
    }

    public final String toString() {
        return defpackage.c.d("Chosen(value=", Separators.RPAREN, this.f6637a);
    }
}
