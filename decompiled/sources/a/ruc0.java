package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ruc0 implements suc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31120a;

    public ruc0(long j) {
        this.f31120a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ruc0) && this.f31120a == ((ruc0) obj).f31120a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31120a);
    }

    public final String toString() {
        return axq.h(this.f31120a, "Promocode(promocodeId=", Separators.RPAREN);
    }
}
