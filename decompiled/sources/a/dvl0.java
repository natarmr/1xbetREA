package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dvl0 implements hvl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6749a;

    public dvl0(String str) {
        this.f6749a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dvl0) && this.f6749a.equals(((dvl0) obj).f6749a);
    }

    public final int hashCode() {
        return this.f6749a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenImage(image=", this.f6749a, Separators.RPAREN);
    }
}
