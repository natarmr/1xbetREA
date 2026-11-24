package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hmf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13303a;

    public final boolean equals(Object obj) {
        if (obj instanceof hmf) {
            return this.f13303a == ((hmf) obj).f13303a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13303a);
    }

    public final String toString() {
        return defpackage.c.d("NeedExtraMargin(value=", Separators.RPAREN, this.f13303a);
    }
}
