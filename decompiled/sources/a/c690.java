package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class c690 implements f690 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3808a;

    public c690(boolean z) {
        this.f3808a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c690) && this.f3808a == ((c690) obj).f3808a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3808a);
    }

    public final String toString() {
        return defpackage.c.d("AllowDebug(allow=", Separators.RPAREN, this.f3808a);
    }
}
