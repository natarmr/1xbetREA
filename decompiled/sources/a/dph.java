package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dph implements eph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6466a;
    public final String b;
    public final int c;

    public dph(int i, String str, String str2) {
        str.getClass();
        this.f6466a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dph)) {
            return false;
        }
        dph dphVar = (dph) obj;
        return Intrinsics.d(this.f6466a, dphVar.f6466a) && this.b.equals(dphVar.b) && this.c == dphVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f6466a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("ProgressIndicatorRadial(title=", this.f6466a, ", value=", this.b, ", progress="));
    }
}
