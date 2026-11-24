package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f1b implements h1b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f8757a;

    public final boolean equals(Object obj) {
        if (obj instanceof f1b) {
            return this.f8757a == ((f1b) obj).f8757a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8757a);
    }

    public final String toString() {
        return defpackage.c.d("IsChecked(value=", Separators.RPAREN, this.f8757a);
    }
}
