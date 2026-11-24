package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xv7 implements zv7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41544a;

    public xv7(boolean z) {
        this.f41544a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xv7) && this.f41544a == ((xv7) obj).f41544a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41544a);
    }

    public final String toString() {
        return defpackage.c.d("Loading(showLoading=", Separators.RPAREN, this.f41544a);
    }
}
