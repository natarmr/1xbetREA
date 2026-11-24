package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lc5 implements nc5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19784a;
    public final String b;
    public final long c;
    public final boolean d;

    public lc5(int i, long j, String str, boolean z) {
        str.getClass();
        this.f19784a = i;
        this.b = str;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc5)) {
            return false;
        }
        lc5 lc5Var = (lc5) obj;
        return this.f19784a == lc5Var.f19784a && Intrinsics.d(this.b, lc5Var.b) && this.c == lc5Var.c && this.d == lc5Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rw2.b(ua80.b(Integer.hashCode(this.f19784a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f19784a, "GlobalChampBackground(eventId=", ", overrideImagesId=", this.b, ", sportId=");
        hne.t(this.c, ", nightMode=", sbR, this.d);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
