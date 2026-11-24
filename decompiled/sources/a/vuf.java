package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vuf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38045a;
    public final String b;
    public final String c;

    public vuf(long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f38045a = j;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuf)) {
            return false;
        }
        vuf vufVar = (vuf) obj;
        return this.f38045a == vufVar.f38045a && Intrinsics.d(this.b, vufVar.b) && Intrinsics.d(this.c, vufVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f38045a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.o(axq.o(this.f38045a, "CurrencyItem(id=", ", title=", this.b), ", code=", this.c, Separators.RPAREN);
    }
}
