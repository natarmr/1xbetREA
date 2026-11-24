package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class w8h0 implements e9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38722a;

    public w8h0(boolean z) {
        this.f38722a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8h0) && this.f38722a == ((w8h0) obj).f38722a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38722a);
    }

    public final String toString() {
        return defpackage.c.d("ShowCallLabel(show=", Separators.RPAREN, this.f38722a);
    }
}
