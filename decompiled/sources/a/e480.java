package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class e480 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7170a;

    public e480(String str) {
        this.f7170a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e480) && this.f7170a.equals(((e480) obj).f7170a);
    }

    public final int hashCode() {
        return this.f7170a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpponentsModel(fullName=", this.f7170a, Separators.RPAREN);
    }
}
