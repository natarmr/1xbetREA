package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class gza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12173a;
    public final String b;
    public final List c;
    public final fza0 d;
    public final List e;
    public final boolean f;

    public gza0(long j, String str, List list, fza0 fza0Var, List list2, boolean z) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f12173a = j;
        this.b = str;
        this.c = list;
        this.d = fza0Var;
        this.e = list2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gza0)) {
            return false;
        }
        gza0 gza0Var = (gza0) obj;
        return this.f12173a == gza0Var.f12173a && Intrinsics.d(this.b, gza0Var.b) && Intrinsics.d(this.c, gza0Var.c) && this.d == gza0Var.d && Intrinsics.d(this.e, gza0Var.e) && this.f == gza0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + dw9.a((this.d.hashCode() + dw9.a(ua80.b(Long.hashCode(this.f12173a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f12173a, "PopularAggregatorCategoryWithGamesModel(id=", ", title=", this.b);
        sbO.append(", games=");
        sbO.append(this.c);
        sbO.append(", popularAggregatorCategory=");
        sbO.append(this.d);
        esw0.k(sbO, ", favorites=", this.e, ", authorized=", this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
