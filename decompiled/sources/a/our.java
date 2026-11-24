package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class our implements tur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25890a;
    public final long b;
    public final boolean c;
    public final int d;
    public final boolean e;

    public our(int i, long j, String str, boolean z, boolean z2) {
        str.getClass();
        this.f25890a = str;
        this.b = j;
        this.c = z;
        this.d = i;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof our)) {
            return false;
        }
        our ourVar = (our) obj;
        return Intrinsics.d(this.f25890a, ourVar.f25890a) && this.b == ourVar.b && this.c == ourVar.c && this.d == ourVar.d && this.e == ourVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + twn.a(this.d, brm0.e(rw2.b(this.f25890a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "Description(text=", this.f25890a, ", startTime=");
        cs0.v(this.d, ", timerEnabled=", ", textMaxLines=", sbO, this.c);
        return f140.n(sbO, ", descriptionVisible=", this.e, Separators.RPAREN);
    }
}
