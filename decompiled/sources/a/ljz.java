package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ljz implements mjz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20174a;

    public ljz(boolean z) {
        this.f20174a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ljz) && this.f20174a == ((ljz) obj).f20174a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20174a);
    }

    public final String toString() {
        return defpackage.c.d("Verification(completed=", Separators.RPAREN, this.f20174a);
    }
}
