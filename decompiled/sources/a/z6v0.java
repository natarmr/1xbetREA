package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z6v0 implements a7v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43889a;

    public z6v0(boolean z) {
        this.f43889a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z6v0) && this.f43889a == ((z6v0) obj).f43889a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43889a);
    }

    public final String toString() {
        return defpackage.c.d("ShowLoading(show=", Separators.RPAREN, this.f43889a);
    }
}
