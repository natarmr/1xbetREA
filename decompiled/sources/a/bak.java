package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bak implements dak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2261a;

    public bak(String str) {
        this.f2261a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bak) && this.f2261a.equals(((bak) obj).f2261a);
    }

    public final int hashCode() {
        return this.f2261a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenErrorDialogWithMessage(message=", this.f2261a, Separators.RPAREN);
    }
}
