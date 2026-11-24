package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jus implements nus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m9s f17173a;
    public final owq0 b;
    public final int c;

    public jus(m9s m9sVar, owq0 owq0Var, int i) {
        this.f17173a = m9sVar;
        this.b = owq0Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jus)) {
            return false;
        }
        jus jusVar = (jus) obj;
        return Intrinsics.d(this.f17173a, jusVar.f17173a) && this.b.equals(jusVar.b) && this.c == jusVar.c;
    }

    public final int hashCode() {
        m9s m9sVar = this.f17173a;
        int iHashCode = m9sVar == null ? 0 : m9sVar.hashCode();
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnUpdateParams(gameDetails=");
        sb.append(this.f17173a);
        sb.append(", statisticBlocksItemParams=");
        sb.append(this.b);
        sb.append(", globalChampId=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
