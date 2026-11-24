package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class iwr implements mwr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15504a;

    public iwr(String str) {
        this.f15504a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iwr) && this.f15504a.equals(((iwr) obj).f15504a);
    }

    public final int hashCode() {
        return this.f15504a.hashCode();
    }

    public final String toString() {
        return kng0.l("GameStateInfo(text=", this.f15504a, Separators.RPAREN);
    }
}
