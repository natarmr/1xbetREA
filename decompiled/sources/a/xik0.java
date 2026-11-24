package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class xik0 implements zik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40949a;

    public xik0(String str) {
        this.f40949a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xik0) && this.f40949a.equals(((xik0) obj).f40949a);
    }

    public final int hashCode() {
        return this.f40949a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorSnack(message=", this.f40949a, Separators.RPAREN);
    }
}
