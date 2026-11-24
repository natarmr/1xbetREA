package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bvr implements dvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3291a;
    public final String b;
    public final String c;

    public bvr(long j, String str, String str2) {
        str.getClass();
        this.f3291a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bvr)) {
            return false;
        }
        bvr bvrVar = (bvr) obj;
        return this.f3291a == bvrVar.f3291a && Intrinsics.d(this.b, bvrVar.b) && this.c.equals(bvrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f3291a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f3291a, "TeamFirst(id=", ", name=", this.b), ", imageUrl=", this.c, Separators.RPAREN);
    }
}
