package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cv7 implements dv7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5017a;

    public cv7(String str) {
        this.f5017a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cv7) && this.f5017a.equals(((cv7) obj).f5017a);
    }

    public final int hashCode() {
        return this.f5017a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBarMessage(message=", this.f5017a, Separators.RPAREN);
    }
}
