package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aou0 implements cou0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1220a;

    public final boolean equals(Object obj) {
        if (obj instanceof aou0) {
            return this.f1220a == ((aou0) obj).f1220a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1220a);
    }

    public final String toString() {
        return defpackage.c.d("SearchExpand(expand=", Separators.RPAREN, this.f1220a);
    }
}
