package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f0t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8731a;
    public final String b;
    public final List c;
    public final List d;
    public final int e;

    public f0t(int i, long j, String str, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f8731a = j;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0t)) {
            return false;
        }
        f0t f0tVar = (f0t) obj;
        return this.f8731a == f0tVar.f8731a && this.b.equals(f0tVar.b) && Intrinsics.d(this.c, f0tVar.c) && Intrinsics.d(this.d, f0tVar.d) && this.e == f0tVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + dw9.a(dw9.a(ua80.b(Long.hashCode(this.f8731a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f8731a, "GameZipOpponentModel(id=", ", name=", this.b);
        hne.v(", idsList=", ", imageList=", sbO, this.c, this.d);
        return vqd.p(sbO, ", countryId=", this.e, Separators.RPAREN);
    }
}
