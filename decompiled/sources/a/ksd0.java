package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ksd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18809a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public ksd0(long j, String str, String str2, String str3, List list) {
        list.getClass();
        this.f18809a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksd0)) {
            return false;
        }
        ksd0 ksd0Var = (ksd0) obj;
        return this.f18809a == ksd0Var.f18809a && this.b.equals(ksd0Var.b) && this.c.equals(ksd0Var.c) && this.d.equals(ksd0Var.d) && Intrinsics.d(this.e, ksd0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(Long.hashCode(this.f18809a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f18809a, "RaceStatisticModel(dateStart=", ", hippodrome=", this.b);
        f140.v(sbO, ", title=", this.c, ", result=", this.d);
        return ohs0.s(sbO, ", description=", this.e, Separators.RPAREN);
    }
}
