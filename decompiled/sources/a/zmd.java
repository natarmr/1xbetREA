package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class zmd extends ind {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44620a;

    public zmd(boolean z) {
        this.f44620a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zmd) && this.f44620a == ((zmd) obj).f44620a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44620a);
    }

    public final String toString() {
        return defpackage.c.d("IsPointEnable(isPointEnable=", Separators.RPAREN, this.f44620a);
    }
}
