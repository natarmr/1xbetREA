package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class e3t extends l3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7154a;

    public e3t(boolean z) {
        this.f7154a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3t) && this.f7154a == ((e3t) obj).f7154a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7154a);
    }

    public final String toString() {
        return defpackage.c.d("ChangeLimitsTextColor(normalColor=", Separators.RPAREN, this.f7154a);
    }
}
