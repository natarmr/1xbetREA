package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t8h0 implements d9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33511a;

    public t8h0(boolean z) {
        this.f33511a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8h0) && this.f33511a == ((t8h0) obj).f33511a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f33511a);
    }

    public final String toString() {
        return defpackage.c.d("SetTheme(isNightMode=", Separators.RPAREN, this.f33511a);
    }
}
