package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lqa extends tqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20477a;

    public lqa(boolean z) {
        this.f20477a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqa) && this.f20477a == ((lqa) obj).f20477a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20477a);
    }

    public final String toString() {
        return defpackage.c.d("HumidityVisibilityChanged(visibility=", Separators.RPAREN, this.f20477a);
    }
}
