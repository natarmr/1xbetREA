package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class h190 implements k190 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12272a;

    public h190(boolean z) {
        this.f12272a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h190) && this.f12272a == ((h190) obj).f12272a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12272a);
    }

    public final String toString() {
        return defpackage.c.d("ProceedNextStep(email=", Separators.RPAREN, this.f12272a);
    }
}
