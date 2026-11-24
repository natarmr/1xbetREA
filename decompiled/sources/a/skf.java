package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class skf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32345a;

    public final boolean equals(Object obj) {
        if (obj instanceof skf) {
            return this.f32345a == ((skf) obj).f32345a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32345a);
    }

    public final String toString() {
        return defpackage.c.d("DeciderMap(value=", Separators.RPAREN, this.f32345a);
    }
}
