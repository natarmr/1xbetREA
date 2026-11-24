package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class z270 implements a370 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43657a;

    public z270(boolean z) {
        this.f43657a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z270) && this.f43657a == ((z270) obj).f43657a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43657a);
    }

    public final String toString() {
        return defpackage.c.d("RetryLoadData(force=", Separators.RPAREN, this.f43657a);
    }
}
