package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wqf implements brf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39588a;

    public final boolean equals(Object obj) {
        if (obj instanceof wqf) {
            return this.f39588a == ((wqf) obj).f39588a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39588a);
    }

    public final String toString() {
        return defpackage.c.d("MultipleThree(value=", Separators.RPAREN, this.f39588a);
    }
}
