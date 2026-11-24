package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class gfo0 implements hfo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11216a;

    public final boolean equals(Object obj) {
        if (obj instanceof gfo0) {
            return this.f11216a.equals(((gfo0) obj).f11216a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11216a.hashCode();
    }

    public final String toString() {
        return kng0.l("TitleTab(value=", this.f11216a, Separators.RPAREN);
    }
}
