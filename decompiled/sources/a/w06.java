package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class w06 extends i16 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38335a;

    public w06(boolean z) {
        this.f38335a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w06) && this.f38335a == ((w06) obj).f38335a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38335a);
    }

    public final String toString() {
        return defpackage.c.d("ConnectionStatusChangedCommand(available=", Separators.RPAREN, this.f38335a);
    }
}
