package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ml6 implements ol6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21972a;

    public ml6(boolean z) {
        this.f21972a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ml6) && this.f21972a == ((ml6) obj).f21972a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f21972a);
    }

    public final String toString() {
        return defpackage.c.d("Enabled(isEventsEmpty=", Separators.RPAREN, this.f21972a);
    }
}
