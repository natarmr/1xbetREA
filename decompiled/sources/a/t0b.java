package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t0b implements u0b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33111a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;

    public t0b(String str, int i, String str2, String str3, int i2) {
        str.getClass();
        str2.getClass();
        this.f33111a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0b)) {
            return false;
        }
        t0b t0bVar = (t0b) obj;
        return Intrinsics.d(this.f33111a, t0bVar.f33111a) && Intrinsics.d(this.b, t0bVar.b) && this.c.equals(t0bVar.c) && this.d == t0bVar.d && this.e == t0bVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.a(this.d, ua80.b(ua80.b(this.f33111a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Progress(progressLabel=", this.f33111a, ", currentProgressText=", this.b, ", maxProgressText=");
        twn.w(this.d, this.c, ", currentProgress=", ", maxProgress=", sbN);
        return rz4.j(this.e, Separators.RPAREN, sbN);
    }
}
