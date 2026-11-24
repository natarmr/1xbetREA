package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class v1j implements x1j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36633a;

    public v1j(boolean z) {
        this.f36633a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v1j) && this.f36633a == ((v1j) obj).f36633a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36633a);
    }

    public final String toString() {
        return defpackage.c.d("Defined(taskAvailable=", Separators.RPAREN, this.f36633a);
    }
}
