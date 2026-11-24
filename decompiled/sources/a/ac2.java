package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ac2 implements cc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f608a;

    public final boolean equals(Object obj) {
        if (obj instanceof ac2) {
            return this.f608a == ((ac2) obj).f608a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f608a);
    }

    public final String toString() {
        return defpackage.c.d("MultiSelectShow(value=", Separators.RPAREN, this.f608a);
    }
}
