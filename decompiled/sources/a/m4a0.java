package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class m4a0 implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21158a;

    public /* synthetic */ m4a0(String str) {
        this.f21158a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m4a0) {
            return this.f21158a.equals(((m4a0) obj).f21158a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21158a.hashCode();
    }

    public final String toString() {
        return kng0.l("Name(value=", this.f21158a, Separators.RPAREN);
    }
}
