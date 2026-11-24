package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ctk implements etk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4941a;
    public final String b;
    public final String c;
    public final boolean d;

    public ctk(long j, String str, String str2, boolean z) {
        str.getClass();
        this.f4941a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctk)) {
            return false;
        }
        ctk ctkVar = (ctk) obj;
        return this.f4941a == ctkVar.f4941a && Intrinsics.d(this.b, ctkVar.b) && this.c.equals(ctkVar.c) && this.d == ctkVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(Long.hashCode(this.f4941a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f4941a, "Content(id=", ", image=", this.b);
        w6x.z(", title=", this.c, ", selected=", sbO, this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
