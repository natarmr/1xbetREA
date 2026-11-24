package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jg70 extends qg70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16468a;

    public jg70(boolean z) {
        this.f16468a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jg70) && this.f16468a == ((jg70) obj).f16468a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16468a);
    }

    public final String toString() {
        return defpackage.c.d("GameFinished(autoSpin=", Separators.RPAREN, this.f16468a);
    }
}
