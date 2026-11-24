package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class s71 implements t81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31728a;

    public s71(boolean z) {
        this.f31728a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s71) && this.f31728a == ((s71) obj).f31728a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31728a);
    }

    public final String toString() {
        return defpackage.c.d("ChangeViewMode(fullScreen=", Separators.RPAREN, this.f31728a);
    }
}
