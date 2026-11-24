package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class k3t extends l3t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17637a;

    public k3t(boolean z) {
        this.f17637a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k3t) && this.f17637a == ((k3t) obj).f17637a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17637a);
    }

    public final String toString() {
        return defpackage.c.d("ShowAutoSpinSettings(show=", Separators.RPAREN, this.f17637a);
    }
}
