package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class chj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4362a;
    public final String b;
    public final List c;
    public final boolean d;

    public chj(long j, String str, List list, boolean z) {
        list.getClass();
        this.f4362a = j;
        this.b = str;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chj)) {
            return false;
        }
        chj chjVar = (chj) obj;
        return this.f4362a == chjVar.f4362a && this.b.equals(chjVar.b) && Intrinsics.d(this.c, chjVar.c) && this.d == chjVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dw9.a(ua80.b(Long.hashCode(this.f4362a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f4362a, "DayExpressEventsZipModel(id=", ", coefficient=", this.b);
        esw0.k(sbO, ", dayExpressZipModelList=", this.c, ", live=", this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
