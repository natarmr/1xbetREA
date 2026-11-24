package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class il70 extends ll70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14963a;

    public il70(boolean z) {
        this.f14963a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof il70) && this.f14963a == ((il70) obj).f14963a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14963a);
    }

    public final String toString() {
        return defpackage.c.d("Enable(enable=", Separators.RPAREN, this.f14963a);
    }
}
