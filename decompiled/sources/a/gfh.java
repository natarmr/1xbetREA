package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gfh implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11207a;

    public /* synthetic */ gfh(String str) {
        this.f11207a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gfh) {
            return this.f11207a.equals(((gfh) obj).f11207a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11207a.hashCode();
    }

    public final String toString() {
        return kng0.l("Image(value=", this.f11207a, Separators.RPAREN);
    }
}
