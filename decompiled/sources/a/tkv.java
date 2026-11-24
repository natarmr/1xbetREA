package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tkv implements ukv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34116a;

    public final boolean equals(Object obj) {
        if (obj instanceof tkv) {
            return this.f34116a == ((tkv) obj).f34116a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34116a);
    }

    public final String toString() {
        return defpackage.c.d("Selected(value=", Separators.RPAREN, this.f34116a);
    }
}
