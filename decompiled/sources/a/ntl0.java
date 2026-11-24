package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ntl0 implements qtl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24107a;

    public final boolean equals(Object obj) {
        if (obj instanceof ntl0) {
            return this.f24107a == ((ntl0) obj).f24107a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24107a);
    }

    public final String toString() {
        return defpackage.c.d("AnimationEnable(value=", Separators.RPAREN, this.f24107a);
    }
}
