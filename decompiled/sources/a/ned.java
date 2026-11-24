package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ned {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lb30 f23380a;
    public final int b;
    public final List c;

    public ned(lb30 lb30Var, int i, List list) {
        list.getClass();
        this.f23380a = lb30Var;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ned)) {
            return false;
        }
        ned nedVar = (ned) obj;
        return this.f23380a.equals(nedVar.f23380a) && this.b == nedVar.b && Intrinsics.d(this.c, nedVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f23380a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletedMatchesModel(matchModel=");
        sb.append(this.f23380a);
        sb.append(", sportId=");
        sb.append(this.b);
        sb.append(", teams=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
