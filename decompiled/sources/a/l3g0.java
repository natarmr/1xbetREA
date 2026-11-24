package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class l3g0 implements q3g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19358a;

    public /* synthetic */ l3g0(String str) {
        this.f19358a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l3g0) {
            return this.f19358a.equals(((l3g0) obj).f19358a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19358a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnQueryChanged(query=", this.f19358a, Separators.RPAREN);
    }
}
