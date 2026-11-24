package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class asc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1385a;
    public final String b;
    public final List c;

    public asc0(long j, String str, List list) {
        list.getClass();
        this.f1385a = j;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asc0)) {
            return false;
        }
        asc0 asc0Var = (asc0) obj;
        return this.f1385a == asc0Var.f1385a && this.b.equals(asc0Var.b) && Intrinsics.d(this.c, asc0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f1385a) * 31, 31, this.b);
    }

    public final String toString() {
        return ohs0.s(axq.o(this.f1385a, "PromoShopModel(categoryId=", ", categoryName=", this.b), ", items=", this.c, Separators.RPAREN);
    }
}
