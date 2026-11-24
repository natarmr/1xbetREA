package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class lrb0 implements nrb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20523a;

    public lrb0(boolean z) {
        this.f20523a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lrb0) && this.f20523a == ((lrb0) obj).f20523a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20523a);
    }

    public final String toString() {
        return defpackage.c.d("Loading(showContent=", Separators.RPAREN, this.f20523a);
    }
}
