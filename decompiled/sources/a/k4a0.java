package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class k4a0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17658a;

    public /* synthetic */ k4a0(String str) {
        this.f17658a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k4a0) {
            return this.f17658a.equals(((k4a0) obj).f17658a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17658a.hashCode();
    }

    public final String toString() {
        return kng0.l("HeroName(value=", this.f17658a, Separators.RPAREN);
    }
}
