package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o26 implements p26 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24517a;

    public o26(boolean z) {
        this.f24517a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o26) && this.f24517a == ((o26) obj).f24517a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24517a);
    }

    public final String toString() {
        return defpackage.c.d("ShowSearch(showKeyboardOnStart=", Separators.RPAREN, this.f24517a);
    }
}
