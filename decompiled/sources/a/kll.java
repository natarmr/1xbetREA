package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kll implements oll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18495a;
    public final boolean b;
    public final int c;
    public final String d;
    public final String e;
    public final pll f;
    public final long g;

    public kll(boolean z, boolean z2, int i, String str, String str2, pll pllVar, long j) {
        str.getClass();
        str2.getClass();
        this.f18495a = z;
        this.b = z2;
        this.c = i;
        this.d = str;
        this.e = str2;
        this.f = pllVar;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kll)) {
            return false;
        }
        kll kllVar = (kll) obj;
        return this.f18495a == kllVar.f18495a && this.b == kllVar.b && this.c == kllVar.c && Intrinsics.d(this.d, kllVar.d) && Intrinsics.d(this.e, kllVar.e) && this.f == kllVar.f && this.g == kllVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + ((this.f.hashCode() + ua80.b(ua80.b(twn.a(100, twn.a(this.c, brm0.e(Boolean.hashCode(this.f18495a) * 31, 31, this.b), 31), 31), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("Current(isCompleted=", ", isActive=", ", currentProgress=", this.f18495a, this.b);
        kng0.w(this.c, ", maxProgress=100, textCurrentProgress=", this.d, ", textMaxProgress=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", taskKind=");
        sbQ.append(this.f);
        sbQ.append(", productId=");
        return brm0.k(this.g, Separators.RPAREN, sbQ);
    }
}
