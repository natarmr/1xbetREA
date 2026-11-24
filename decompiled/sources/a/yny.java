package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yny implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42962a;

    public /* synthetic */ yny(String str) {
        this.f42962a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yny) {
            return this.f42962a.equals(((yny) obj).f42962a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42962a.hashCode();
    }

    public final String toString() {
        return kng0.l("HeroIcon(value=", this.f42962a, Separators.RPAREN);
    }
}
