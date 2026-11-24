package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class skv implements ukv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32370a;

    public final boolean equals(Object obj) {
        if (obj instanceof skv) {
            return this.f32370a == ((skv) obj).f32370a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32370a);
    }

    public final String toString() {
        return defpackage.c.d("Enable(value=", Separators.RPAREN, this.f32370a);
    }
}
