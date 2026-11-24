package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sm2 implements vm2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32425a;

    public sm2(boolean z) {
        this.f32425a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sm2) && this.f32425a == ((sm2) obj).f32425a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f32425a);
    }

    public final String toString() {
        return defpackage.c.d("UpdateCanScrollUpState(canScrollUp=", Separators.RPAREN, this.f32425a);
    }
}
