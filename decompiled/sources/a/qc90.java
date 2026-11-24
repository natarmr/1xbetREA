package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qc90 extends sc90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28475a;

    public qc90(boolean z) {
        this.f28475a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qc90) && this.f28475a == ((qc90) obj).f28475a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28475a);
    }

    public final String toString() {
        return defpackage.c.d("Expected(beating=", Separators.RPAREN, this.f28475a);
    }
}
