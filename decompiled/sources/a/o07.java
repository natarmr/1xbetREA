package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class o07 implements q07 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24408a;

    public final boolean equals(Object obj) {
        if (obj instanceof o07) {
            return this.f24408a == ((o07) obj).f24408a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24408a);
    }

    public final String toString() {
        return defpackage.c.d("IsExpanded(value=", Separators.RPAREN, this.f24408a);
    }
}
