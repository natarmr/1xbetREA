package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e1b implements h1b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7030a;

    public final boolean equals(Object obj) {
        if (obj instanceof e1b) {
            return this.f7030a == ((e1b) obj).f7030a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7030a);
    }

    public final String toString() {
        return defpackage.c.d("IsCheckable(value=", Separators.RPAREN, this.f7030a);
    }
}
