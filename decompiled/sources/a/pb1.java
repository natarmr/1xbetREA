package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class pb1 implements wb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26682a;

    public pb1(String str) {
        this.f26682a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pb1) && this.f26682a.equals(((pb1) obj).f26682a);
    }

    public final int hashCode() {
        return this.f26682a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowInfoDialog(description=", this.f26682a, Separators.RPAREN);
    }
}
