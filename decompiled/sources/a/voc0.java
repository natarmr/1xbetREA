package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class voc0 implements cpc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37759a;

    public voc0(boolean z) {
        this.f37759a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof voc0) && this.f37759a == ((voc0) obj).f37759a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37759a);
    }

    public final String toString() {
        return defpackage.c.d("OnAppBarStateChanged(expanded=", Separators.RPAREN, this.f37759a);
    }
}
