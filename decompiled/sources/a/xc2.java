package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xc2 implements zc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40626a;

    public final boolean equals(Object obj) {
        if (obj instanceof xc2) {
            return this.f40626a == ((xc2) obj).f40626a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f40626a);
    }

    public final String toString() {
        return defpackage.c.d("MultiSelectShow(value=", Separators.RPAREN, this.f40626a);
    }
}
