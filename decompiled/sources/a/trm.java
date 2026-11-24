package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class trm implements vrm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f34426a;
    public final String b;
    public final String c;
    public final String d;
    public final n0x e;
    public final m0x f;

    public trm(long j, String str, String str2, String str3, n0x n0xVar, m0x m0xVar) {
        str.getClass();
        str2.getClass();
        this.f34426a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = n0xVar;
        this.f = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trm)) {
            return false;
        }
        trm trmVar = (trm) obj;
        return this.f34426a == trmVar.f34426a && Intrinsics.d(this.b, trmVar.b) && Intrinsics.d(this.c, trmVar.c) && this.d.equals(trmVar.d) && this.e.equals(trmVar.e) && this.f.equals(trmVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + f140.f(this.e, ua80.b(ua80.b(ua80.b(Long.hashCode(this.f34426a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f34426a, "Content(id=", ", label=", this.b);
        f140.v(sbO, ", liveTag=", this.c, ", hotTag=", this.d);
        sbO.append(", image=");
        sbO.append(this.e);
        sbO.append(", placeHolder=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
