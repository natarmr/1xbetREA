package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iwc0 implements lwc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15482a;

    public iwc0(String str) {
        this.f15482a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iwc0) && this.f15482a.equals(((iwc0) obj).f15482a);
    }

    public final int hashCode() {
        return this.f15482a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnOpenDeeplink(deeplink=", this.f15482a, Separators.RPAREN);
    }
}
