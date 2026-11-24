package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ccs extends dcs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4127a;

    public ccs(boolean z) {
        this.f4127a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccs) && this.f4127a == ((ccs) obj).f4127a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4127a);
    }

    public final String toString() {
        return defpackage.c.d("ShowWheelGameField(show=", Separators.RPAREN, this.f4127a);
    }
}
