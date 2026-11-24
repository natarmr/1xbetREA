package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zb80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44103a;

    public zb80(boolean z) {
        this.f44103a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zb80) && this.f44103a == ((zb80) obj).f44103a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44103a);
    }

    public final String toString() {
        return defpackage.c.d("UpdateCanScrollUpState(canScrollUp=", Separators.RPAREN, this.f44103a);
    }
}
