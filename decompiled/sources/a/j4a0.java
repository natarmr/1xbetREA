package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class j4a0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15875a;

    public /* synthetic */ j4a0(String str) {
        this.f15875a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j4a0) {
            return this.f15875a.equals(((j4a0) obj).f15875a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15875a.hashCode();
    }

    public final String toString() {
        return kng0.l("HeroIcon(value=", this.f15875a, Separators.RPAREN);
    }
}
