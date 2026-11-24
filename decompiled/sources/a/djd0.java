package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class djd0 implements ejd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6180a;

    public djd0(String str) {
        this.f6180a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djd0) && this.f6180a.equals(((djd0) obj).f6180a);
    }

    public final int hashCode() {
        return this.f6180a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnackBar(message=", this.f6180a, Separators.RPAREN);
    }
}
