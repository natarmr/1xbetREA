package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v00 implements w00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aop0 f36560a;
    public final aop0 b;
    public final String c;

    public v00(aop0 aop0Var, aop0 aop0Var2, String str) {
        this.f36560a = aop0Var;
        this.b = aop0Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v00)) {
            return false;
        }
        v00 v00Var = (v00) obj;
        return this.f36560a.equals(v00Var.f36560a) && this.b.equals(v00Var.b) && Intrinsics.d(this.c, v00Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f36560a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoOpponents(firstTeam=");
        sb.append(this.f36560a);
        sb.append(", secondTeam=");
        sb.append(this.b);
        sb.append(", infoLabel=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
