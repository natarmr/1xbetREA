package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tm70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34180a;

    public tm70(boolean z) {
        this.f34180a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tm70) && this.f34180a == ((tm70) obj).f34180a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34180a);
    }

    public final String toString() {
        return defpackage.c.d("EnableButtons(enable=", Separators.RPAREN, this.f34180a);
    }
}
