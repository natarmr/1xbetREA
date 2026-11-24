package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hdp0 implements qdp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h5a0 f12880a;
    public final String b;

    public hdp0(h5a0 h5a0Var, String str) {
        str.getClass();
        this.f12880a = h5a0Var;
        this.b = str;
    }

    @Override // a.qdp0
    public final h5a0 a() {
        return this.f12880a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdp0)) {
            return false;
        }
        hdp0 hdp0Var = (hdp0) obj;
        return this.f12880a.equals(hdp0Var.f12880a) && Intrinsics.d(this.b, hdp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12880a.hashCode() * 31);
    }

    public final String toString() {
        return "Horizontal(playerLogo=" + this.f12880a + ", name=" + this.b + Separators.RPAREN;
    }
}
