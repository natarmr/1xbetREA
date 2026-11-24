package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ona {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f25538a;
    public final m0x b;
    public final String c;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public ona(long j, m0x m0xVar, String str) {
        str.getClass();
        this.f25538a = (int) j;
        this.b = m0xVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ona)) {
            return false;
        }
        ona onaVar = (ona) obj;
        return ((long) this.f25538a) == ((long) onaVar.f25538a) && this.b.equals(onaVar.b) && Intrinsics.d(this.c, onaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.a(this.b, Long.hashCode(this.f25538a) * 31, 31);
    }

    public final String toString() {
        long j = this.f25538a;
        StringBuilder sb = new StringBuilder("CardStackItemUiModel(id=");
        sb.append(j);
        sb.append(", image=");
        sb.append(this.b);
        return rw2.o(sb, ", label=", this.c, Separators.RPAREN);
    }
}
