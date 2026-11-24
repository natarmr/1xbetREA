package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r1e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29676a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public r1e0(String str, String str2, String str3, String str4, String str5, List list) {
        list.getClass();
        this.f29676a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1e0)) {
            return false;
        }
        r1e0 r1e0Var = (r1e0) obj;
        return Intrinsics.d(this.f29676a, r1e0Var.f29676a) && this.b.equals(r1e0Var.b) && this.c.equals(r1e0Var.c) && this.d.equals(r1e0Var.d) && this.e.equals(r1e0Var.e) && this.f.equals(r1e0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f29676a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbO = ua80.o("RankingsBreakdownModel(groupsRankingModel=", ", points=", this.b, this.f29676a, ", prizeMoney=");
        f140.v(sbO, this.c, ", ranking=", this.d, ", titles=");
        return ua80.m(sbO, this.e, ", winlose=", this.f, Separators.RPAREN);
    }
}
