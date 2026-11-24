package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class z0q extends j2q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f43581a;

    public z0q(boolean z) {
        this.f43581a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0q) && this.f43581a == ((z0q) obj).f43581a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f43581a) + (Boolean.hashCode(true) * 31);
    }

    public final String toString() {
        return defpackage.c.d("AgeConfirmation(isRequired=true, isAgeConfirmation=", Separators.RPAREN, this.f43581a);
    }
}
