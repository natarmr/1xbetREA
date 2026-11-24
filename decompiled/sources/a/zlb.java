package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zlb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44571a;
    public final String b;
    public final List c;
    public final boolean d;

    public zlb(long j, String str, List list, boolean z) {
        str.getClass();
        this.f44571a = j;
        this.b = str;
        this.c = list;
        this.d = z;
    }

    public static zlb a(zlb zlbVar, ArrayList arrayList) {
        long j = zlbVar.f44571a;
        String str = zlbVar.b;
        boolean z = zlbVar.d;
        str.getClass();
        return new zlb(j, str, arrayList, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlb)) {
            return false;
        }
        zlb zlbVar = (zlb) obj;
        return this.f44571a == zlbVar.f44571a && Intrinsics.d(this.b, zlbVar.b) && this.c.equals(zlbVar.c) && this.d == zlbVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dw9.a(ua80.b(Long.hashCode(this.f44571a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f44571a, "ChampsBySports(id=", ", name=", this.b);
        esw0.k(sbO, ", champs=", this.c, ", expanded=", this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
