package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t690 implements w690 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33406a;

    public t690(boolean z) {
        this.f33406a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t690) && this.f33406a == ((t690) obj).f33406a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33406a);
    }

    public final String toString() {
        return defpackage.c.d("AllowDebug(allow=", Separators.RPAREN, this.f33406a);
    }
}
