package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jxt0 implements lxt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17327a;

    public final boolean equals(Object obj) {
        if (obj instanceof jxt0) {
            return this.f17327a == ((jxt0) obj).f17327a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f17327a);
    }

    public final String toString() {
        return axq.h(this.f17327a, "OnTabClick(value=", Separators.RPAREN);
    }
}
