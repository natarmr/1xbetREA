package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kud0 implements mud0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18905a;

    public final boolean equals(Object obj) {
        if (obj instanceof kud0) {
            return this.f18905a == ((kud0) obj).f18905a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18905a);
    }

    public final String toString() {
        return axq.h(this.f18905a, "OnTabClick(value=", Separators.RPAREN);
    }
}
