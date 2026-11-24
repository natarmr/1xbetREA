package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tz6 extends xz6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34790a;

    public tz6(boolean z) {
        this.f34790a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tz6) && this.f34790a == ((tz6) obj).f34790a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34790a);
    }

    public final String toString() {
        return defpackage.c.d("ShowProgress(show=", Separators.RPAREN, this.f34790a);
    }
}
