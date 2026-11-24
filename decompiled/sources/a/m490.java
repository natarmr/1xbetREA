package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m490 implements q490 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21157a;

    public m490(String str) {
        this.f21157a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m490) && this.f21157a.equals(((m490) obj).f21157a);
    }

    public final int hashCode() {
        return this.f21157a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnRedirectToBrowser(url=", this.f21157a, Separators.RPAREN);
    }
}
