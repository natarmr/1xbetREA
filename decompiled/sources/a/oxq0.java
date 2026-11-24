package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class oxq0 implements wxq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tyq0 f26025a;

    public oxq0(tyq0 tyq0Var) {
        this.f26025a = tyq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxq0) && this.f26025a.equals(((oxq0) obj).f26025a);
    }

    public final int hashCode() {
        return this.f26025a.hashCode();
    }

    public final String toString() {
        return "BannerItem(delegateAction=" + this.f26025a + Separators.RPAREN;
    }
}
