package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ga1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10944a;

    public ga1(boolean z) {
        this.f10944a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ga1) && this.f10944a == ((ga1) obj).f10944a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10944a);
    }

    public final String toString() {
        return defpackage.c.d("AggregatorPlayForRealStateModel(isAuth=", Separators.RPAREN, this.f10944a);
    }
}
