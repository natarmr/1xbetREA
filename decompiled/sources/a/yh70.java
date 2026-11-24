package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yh70 extends zh70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42625a;

    public yh70(boolean z) {
        this.f42625a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yh70) && this.f42625a == ((yh70) obj).f42625a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42625a);
    }

    public final String toString() {
        return defpackage.c.d("ShowOptions(show=", Separators.RPAREN, this.f42625a);
    }
}
