package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bmi0 implements dmi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2838a;

    public bmi0(String str) {
        this.f2838a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bmi0) && this.f2838a.equals(((bmi0) obj).f2838a);
    }

    public final int hashCode() {
        return this.f2838a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenErrorDialogWithMessage(message=", this.f2838a, Separators.RPAREN);
    }
}
