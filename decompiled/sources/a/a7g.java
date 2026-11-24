package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a7g implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f367a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public a7g(long j, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f367a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7g)) {
            return false;
        }
        a7g a7gVar = (a7g) obj;
        return this.f367a == a7gVar.f367a && Intrinsics.d(this.b, a7gVar.b) && Intrinsics.d(this.c, a7gVar.c) && this.d == a7gVar.d && this.e == a7gVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + brm0.e(ua80.b(ua80.b(Long.hashCode(this.f367a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f367a, "CyberCalendarDisciplineUiModel(subSportId=", ", image=", this.b);
        w6x.z(", title=", this.c, ", selected=", sbO, this.d);
        return f140.n(sbO, ", imageEnabled=", this.e, Separators.RPAREN);
    }
}
