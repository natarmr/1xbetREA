package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class d1k implements u1k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5312a;

    public d1k(boolean z) {
        this.f5312a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d1k) && this.f5312a == ((d1k) obj).f5312a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5312a);
    }

    public final String toString() {
        return defpackage.c.d("OnEmailClickedResult(isLinked=", Separators.RPAREN, this.f5312a);
    }
}
