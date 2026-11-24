package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class na20 implements pa20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23170a;
    public final i2o b;
    public final String c;

    public na20(List list, i2o i2oVar, String str) {
        list.getClass();
        i2oVar.getClass();
        this.f23170a = list;
        this.b = i2oVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na20)) {
            return false;
        }
        na20 na20Var = (na20) obj;
        return Intrinsics.d(this.f23170a, na20Var.f23170a) && this.b == na20Var.b && this.c.equals(na20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f23170a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MakeBetErrorModel(gameIds=");
        sb.append(this.f23170a);
        sb.append(", errorCode=");
        sb.append(this.b);
        sb.append(", errorMessage=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
