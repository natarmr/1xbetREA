package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pqa extends tqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27406a;

    public pqa(boolean z) {
        this.f27406a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pqa) && this.f27406a == ((pqa) obj).f27406a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27406a);
    }

    public final String toString() {
        return defpackage.c.d("TemperatureVisibilityChanged(visibility=", Separators.RPAREN, this.f27406a);
    }
}
