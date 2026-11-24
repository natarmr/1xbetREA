package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class x4l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40270a;

    public /* synthetic */ x4l(String str) {
        this.f40270a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x4l) {
            return this.f40270a.equals(((x4l) obj).f40270a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40270a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamLogo(value=", this.f40270a, Separators.RPAREN);
    }
}
