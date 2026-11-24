package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class isv0 implements lsv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15325a;

    public isv0(boolean z) {
        this.f15325a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof isv0) && this.f15325a == ((isv0) obj).f15325a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15325a);
    }

    public final String toString() {
        return defpackage.c.d("DimBehind(isDismissOnTapOutside=", Separators.RPAREN, this.f15325a);
    }
}
