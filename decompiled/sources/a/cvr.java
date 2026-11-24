package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cvr implements dvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5043a;
    public final String b;
    public final String c;

    public cvr(long j, String str, String str2) {
        str.getClass();
        this.f5043a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvr)) {
            return false;
        }
        cvr cvrVar = (cvr) obj;
        return this.f5043a == cvrVar.f5043a && Intrinsics.d(this.b, cvrVar.b) && this.c.equals(cvrVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f5043a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f5043a, "TeamSecond(id=", ", name=", this.b), ", imageUrl=", this.c, Separators.RPAREN);
    }
}
