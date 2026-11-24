package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ll4 implements xl4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20229a;

    public ll4(boolean z) {
        this.f20229a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ll4) && this.f20229a == ((ll4) obj).f20229a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20229a);
    }

    public final String toString() {
        return defpackage.c.d("SetNewApi(isNewApi=", Separators.RPAREN, this.f20229a);
    }
}
