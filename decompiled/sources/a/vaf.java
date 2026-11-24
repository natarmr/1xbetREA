package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vaf implements bbf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37083a;

    public vaf(boolean z) {
        this.f37083a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vaf) && this.f37083a == ((vaf) obj).f37083a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37083a);
    }

    public final String toString() {
        return defpackage.c.d("NextButtonEnabled(enable=", Separators.RPAREN, this.f37083a);
    }
}
