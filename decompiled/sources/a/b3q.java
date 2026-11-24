package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b3q implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1920a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;

    public b3q(int i, long j, long j2, String str, boolean z) {
        str.getClass();
        this.f1920a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3q)) {
            return false;
        }
        b3q b3qVar = (b3q) obj;
        return this.f1920a == b3qVar.f1920a && Intrinsics.d(this.b, b3qVar.b) && this.c == b3qVar.c && this.d == b3qVar.d && this.e == b3qVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rw2.b(rw2.b(ua80.b(Integer.hashCode(this.f1920a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f1920a, "FilterChampsItemUiModel(id=", ", name=", this.b, ", sportId=");
        sbR.append(this.c);
        kng0.A(sbR, ", subSportId=", this.d, ", selected=");
        return rw2.p(sbR, this.e, Separators.RPAREN);
    }
}
