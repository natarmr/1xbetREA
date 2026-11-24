package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zj70 extends bk70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44471a;

    public zj70(boolean z) {
        this.f44471a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zj70) && this.f44471a == ((zj70) obj).f44471a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44471a);
    }

    public final String toString() {
        return defpackage.c.d("EnableButtons(enable=", Separators.RPAREN, this.f44471a);
    }
}
