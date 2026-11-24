package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sxl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32982a;

    public final boolean equals(Object obj) {
        if (obj instanceof sxl) {
            return this.f32982a == ((sxl) obj).f32982a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32982a);
    }

    public final String toString() {
        return defpackage.c.d("Selected(value=", Separators.RPAREN, this.f32982a);
    }
}
