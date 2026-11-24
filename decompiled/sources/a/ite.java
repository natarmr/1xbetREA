package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ite implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15350a;

    public final boolean equals(Object obj) {
        if (obj instanceof ite) {
            return this.f15350a == ((ite) obj).f15350a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15350a);
    }

    public final String toString() {
        return defpackage.c.d("Live(value=", Separators.RPAREN, this.f15350a);
    }
}
