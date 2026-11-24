package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class l6r0 implements n6r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19522a;

    public l6r0(boolean z) {
        this.f19522a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6r0) && this.f19522a == ((l6r0) obj).f19522a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19522a);
    }

    public final String toString() {
        return defpackage.c.d("OnTabChange(live=", Separators.RPAREN, this.f19522a);
    }
}
