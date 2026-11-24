package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g7b0 implements i7b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10807a;

    public g7b0(boolean z) {
        this.f10807a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7b0) && this.f10807a == ((g7b0) obj).f10807a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f10807a);
    }

    public final String toString() {
        return defpackage.c.d("Loading(showShimmers=", Separators.RPAREN, this.f10807a);
    }
}
