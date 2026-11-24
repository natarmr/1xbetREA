package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class re50 implements te50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu4 f30319a;
    public final wul0 b;
    public final List c;

    public re50(nu4 nu4Var, wul0 wul0Var, List list) {
        list.getClass();
        this.f30319a = nu4Var;
        this.b = wul0Var;
        this.c = list;
    }

    public static re50 d(re50 re50Var, wul0 wul0Var, List list, int i) {
        nu4 nu4Var = re50Var.f30319a;
        if ((i & 2) != 0) {
            wul0Var = re50Var.b;
        }
        if ((i & 4) != 0) {
            list = re50Var.c;
        }
        re50Var.getClass();
        list.getClass();
        return new re50(nu4Var, wul0Var, list);
    }

    @Override // a.te50
    public final List c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof re50)) {
            return false;
        }
        re50 re50Var = (re50) obj;
        return this.f30319a == re50Var.f30319a && this.b.equals(re50Var.b) && Intrinsics.d(this.c, re50Var.c);
    }

    @Override // a.te50
    public final wul0 getRoot() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f30319a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Auth(tag=");
        sb.append(this.f30319a);
        sb.append(", root=");
        sb.append(this.b);
        sb.append(", screens=");
        return dw9.r(sb, this.c, Separators.RPAREN);
    }
}
