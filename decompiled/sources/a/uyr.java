package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uyr implements zyr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36505a;
    public final long b;
    public final boolean c;

    public uyr(String str, long j, boolean z) {
        str.getClass();
        this.f36505a = str;
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyr)) {
            return false;
        }
        uyr uyrVar = (uyr) obj;
        return Intrinsics.d(this.f36505a, uyrVar.f36505a) && this.b == uyrVar.b && this.c == uyrVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rw2.b(this.f36505a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(f140.o(this.b, "Description(text=", this.f36505a, ", startTime="), ", cyberGame=", this.c, Separators.RPAREN);
    }
}
