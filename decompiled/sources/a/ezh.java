package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ezh implements gzh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8671a;
    public final String b;
    public final o0x c;
    public final m0x d;
    public final boolean e;
    public final dzh f;
    public final Integer g;

    public ezh(long j, String str, o0x o0xVar, m0x m0xVar, boolean z, dzh dzhVar, Integer num) {
        str.getClass();
        this.f8671a = j;
        this.b = str;
        this.c = o0xVar;
        this.d = m0xVar;
        this.e = z;
        this.f = dzhVar;
        this.g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ezh)) {
            return false;
        }
        ezh ezhVar = (ezh) obj;
        return this.f8671a == ezhVar.f8671a && Intrinsics.d(this.b, ezhVar.b) && Intrinsics.d(this.c, ezhVar.c) && Intrinsics.d(this.d, ezhVar.d) && this.e == ezhVar.e && Intrinsics.d(this.f, ezhVar.f) && Intrinsics.d(this.g, ezhVar.g);
    }

    public final int hashCode() {
        int iE = brm0.e(cs0.a(this.d, w6x.d(this.c, ua80.b(Long.hashCode(this.f8671a) * 31, 31, this.b), 31), 31), 31, this.e);
        dzh dzhVar = this.f;
        int iHashCode = (iE + (dzhVar == null ? 0 : dzhVar.hashCode())) * 31;
        Integer num = this.g;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f8671a, "Content(id=", ", title=", this.b);
        sbO.append(", imageLink=");
        sbO.append(this.c);
        sbO.append(", placeholderLink=");
        sbO.append(this.d);
        sbO.append(", titleBlackout=");
        sbO.append(this.e);
        sbO.append(", tag=");
        sbO.append(this.f);
        sbO.append(", actionIconRes=");
        sbO.append(this.g);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }

    public /* synthetic */ ezh(long j, String str, o0x o0xVar, m0x m0xVar) {
        this(j, str, o0xVar, m0xVar, false, null, null);
    }
}
