package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jus0 implements cqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hus0 f17174a;
    public final ius0 b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;

    public jus0(hus0 hus0Var, ius0 ius0Var, String str, String str2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f17174a = hus0Var;
        this.b = ius0Var;
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jus0)) {
            return false;
        }
        jus0 jus0Var = (jus0) obj;
        return this.f17174a == jus0Var.f17174a && this.b == jus0Var.b && this.c.equals(jus0Var.c) && this.d.equals(jus0Var.d) && Intrinsics.d(this.e, jus0Var.e) && Intrinsics.d(this.f, jus0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(ua80.b(ua80.b((this.b.hashCode() + (this.f17174a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwentyOneModel(gameType=");
        sb.append(this.f17174a);
        sb.append(", matchState=");
        sb.append(this.b);
        sb.append(", playerOneBatchScore=");
        f140.v(sb, this.c, ", playerTwoBatchScore=", this.d, ", playerOneCardList=");
        return kng0.n(", playerTwoCardList=", Separators.RPAREN, sb, this.e, this.f);
    }
}
