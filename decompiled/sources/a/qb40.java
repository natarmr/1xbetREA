package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qb40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28431a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final qc40 g;
    public final List h;

    public qb40(int i, String str, String str2, int i2, int i3, int i4, qc40 qc40Var, List list) {
        list.getClass();
        this.f28431a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = qc40Var;
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qb40)) {
            return false;
        }
        qb40 qb40Var = (qb40) obj;
        return this.f28431a == qb40Var.f28431a && this.b.equals(qb40Var.b) && this.c.equals(qb40Var.c) && this.d == qb40Var.d && this.e == qb40Var.e && this.f == qb40Var.f && this.g.equals(qb40Var.g) && Intrinsics.d(this.h, qb40Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + twn.a(this.f, twn.a(this.e, twn.a(this.d, ua80.b(ua80.b(Integer.hashCode(this.f28431a) * 31, 31, this.b), 31, this.c), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f28431a, "MetaHeroesHeroModel(id=", ", name=", this.b, ", image=");
        twn.w(this.d, this.c, ", rating=", ", numberOfMatches=", sbR);
        axq.r(this.e, this.f, ", numberOfWins=", ", skillBuild=", sbR);
        sbR.append(this.g);
        sbR.append(", events=");
        sbR.append(this.h);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
