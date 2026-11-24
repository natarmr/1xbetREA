package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class aeg implements deg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f726a;

    public aeg(boolean z) {
        this.f726a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aeg) && this.f726a == ((aeg) obj).f726a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f726a);
    }

    public final String toString() {
        return defpackage.c.d("Description(isWorldCupChamp=", Separators.RPAREN, this.f726a);
    }
}
