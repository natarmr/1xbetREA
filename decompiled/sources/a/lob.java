package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lob implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20383a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public lob(boolean z, boolean z2, String str, int i) {
        str.getClass();
        this.f20383a = i;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lob)) {
            return false;
        }
        lob lobVar = (lob) obj;
        return this.f20383a == lobVar.f20383a && Intrinsics.d(this.b, lobVar.b) && this.c == lobVar.c && this.d == lobVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(Integer.hashCode(this.f20383a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", last=", Separators.RPAREN, vqd.r(this.f20383a, "ChangeBlockUiModel(blockId=", ", blockName=", this.b, ", current="), this.c, this.d);
    }
}
