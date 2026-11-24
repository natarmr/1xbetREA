package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class h8u0 implements l8u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12647a;

    public h8u0(boolean z) {
        this.f12647a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8u0) && this.f12647a == ((h8u0) obj).f12647a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12647a);
    }

    public final String toString() {
        return defpackage.c.d("OnBackClick(isSystem=", Separators.RPAREN, this.f12647a);
    }
}
