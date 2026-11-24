package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class xqw implements yqw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41341a;

    public xqw(String str) {
        this.f41341a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xqw) && this.f41341a.equals(((xqw) obj).f41341a);
    }

    public final int hashCode() {
        return this.f41341a.hashCode();
    }

    public final String toString() {
        return kng0.l("UpdateArrowItem(id=", this.f41341a, Separators.RPAREN);
    }
}
