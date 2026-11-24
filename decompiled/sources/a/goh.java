package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class goh implements ioh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final foh f11632a;

    public final boolean equals(Object obj) {
        if (obj instanceof goh) {
            return this.f11632a.equals(((goh) obj).f11632a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11632a.hashCode();
    }

    public final String toString() {
        return "Content(value=" + this.f11632a + Separators.RPAREN;
    }
}
