package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class e6s implements f6s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7302a;

    public final boolean equals(Object obj) {
        if (obj instanceof e6s) {
            return this.f7302a == ((e6s) obj).f7302a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7302a);
    }

    public final String toString() {
        return defpackage.c.d("Selected(value=", Separators.RPAREN, this.f7302a);
    }
}
