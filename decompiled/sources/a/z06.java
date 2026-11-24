package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class z06 extends i16 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43550a;

    public z06(boolean z) {
        this.f43550a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z06) && this.f43550a == ((z06) obj).f43550a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43550a);
    }

    public final String toString() {
        return defpackage.c.d("GameAvailableCommand(available=", Separators.RPAREN, this.f43550a);
    }
}
