package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sd0 implements ud0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32010a;

    public sd0(boolean z) {
        this.f32010a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd0) && this.f32010a == ((sd0) obj).f32010a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32010a);
    }

    public final String toString() {
        return defpackage.c.d("Error(isCountryBlocking=", Separators.RPAREN, this.f32010a);
    }
}
