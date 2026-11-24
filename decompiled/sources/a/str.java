package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class str implements cur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32785a;

    public final boolean equals(Object obj) {
        if (obj instanceof str) {
            return this.f32785a == ((str) obj).f32785a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32785a);
    }

    public final String toString() {
        return defpackage.c.d("FavoriteVisible(value=", Separators.RPAREN, this.f32785a);
    }
}
