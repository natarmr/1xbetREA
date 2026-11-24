package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vwr0 implements wwr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38167a;

    public vwr0(boolean z) {
        this.f38167a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vwr0) && this.f38167a == ((vwr0) obj).f38167a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38167a);
    }

    public final String toString() {
        return defpackage.c.d("Horizontal(isHighlighted=", Separators.RPAREN, this.f38167a);
    }
}
