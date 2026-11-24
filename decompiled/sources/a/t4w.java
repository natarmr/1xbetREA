package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t4w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33341a;

    public t4w(boolean z) {
        this.f33341a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t4w) && this.f33341a == ((t4w) obj).f33341a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33341a);
    }

    public final String toString() {
        return defpackage.c.d("Loading(show=", Separators.RPAREN, this.f33341a);
    }
}
