package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class zq10 extends br10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44788a;

    public zq10(boolean z) {
        this.f44788a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zq10) && this.f44788a == ((zq10) obj).f44788a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44788a);
    }

    public final String toString() {
        return defpackage.c.d("ItemEnableStateChange(enabled=", Separators.RPAREN, this.f44788a);
    }
}
