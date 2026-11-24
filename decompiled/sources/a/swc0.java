package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class swc0 implements wwc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32916a;

    public swc0(boolean z) {
        this.f32916a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swc0) && this.f32916a == ((swc0) obj).f32916a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32916a);
    }

    public final String toString() {
        return defpackage.c.d("EnableDebugMode(enabled=", Separators.RPAREN, this.f32916a);
    }
}
