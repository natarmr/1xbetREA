package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hxa0 implements iya0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13806a;

    public hxa0(boolean z) {
        this.f13806a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hxa0) && this.f13806a == ((hxa0) obj).f13806a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13806a);
    }

    public final String toString() {
        return defpackage.c.d("Initialize(isStartFromLauncher=", Separators.RPAREN, this.f13806a);
    }
}
