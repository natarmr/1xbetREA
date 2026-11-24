package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class in2 implements jn2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15052a;

    public /* synthetic */ in2(String str) {
        this.f15052a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof in2) {
            return this.f15052a.equals(((in2) obj).f15052a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15052a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(message=", this.f15052a, Separators.RPAREN);
    }
}
