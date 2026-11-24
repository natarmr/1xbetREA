package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y790 implements b890 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42143a;

    public y790(boolean z) {
        this.f42143a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y790) && this.f42143a == ((y790) obj).f42143a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42143a);
    }

    public final String toString() {
        return defpackage.c.d("AllowDebug(allow=", Separators.RPAREN, this.f42143a);
    }
}
