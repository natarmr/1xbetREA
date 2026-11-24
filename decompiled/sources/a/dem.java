package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dem implements hem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5957a;
    public final String b;
    public final a4x c;
    public final boolean d;

    public dem(long j, String str, a4x a4xVar, boolean z) {
        str.getClass();
        a4xVar.getClass();
        this.f5957a = j;
        this.b = str;
        this.c = a4xVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dem)) {
            return false;
        }
        dem demVar = (dem) obj;
        return this.f5957a == demVar.f5957a && Intrinsics.d(this.b, demVar.b) && Intrinsics.d(this.c, demVar.c) && this.d == demVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, ua80.b(Long.hashCode(this.f5957a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f5957a, "Default(gameId=", ", labelTitle=", this.b);
        sbO.append(", additionalInfoRows=");
        sbO.append(this.c);
        sbO.append(", expanded=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
