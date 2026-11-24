package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cj70 implements dj70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4447a;

    public cj70(boolean z) {
        this.f4447a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cj70) && this.f4447a == ((cj70) obj).f4447a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4447a) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return defpackage.c.d("ShowLoader(show=false, showOptions=", Separators.RPAREN, this.f4447a);
    }
}
