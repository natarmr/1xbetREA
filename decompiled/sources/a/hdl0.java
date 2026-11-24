package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class hdl0 implements kdl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12875a;
    public final jkm b;
    public final long c;

    public hdl0(boolean z, jkm jkmVar, long j) {
        this.f12875a = z;
        this.b = jkmVar;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdl0)) {
            return false;
        }
        hdl0 hdl0Var = (hdl0) obj;
        return this.f12875a == hdl0Var.f12875a && this.b.equals(hdl0Var.b) && this.c == hdl0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Boolean.hashCode(this.f12875a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(hasMenuDiscardBtnEnabled=");
        sb.append(this.f12875a);
        sb.append(", config=");
        sb.append(this.b);
        sb.append(", countDownTimeMillis=");
        return brm0.k(this.c, Separators.RPAREN, sb);
    }
}
