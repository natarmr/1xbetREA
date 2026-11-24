package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class l230 implements m230 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m9s f19288a;
    public final ms2 b;
    public final long c;

    public l230(m9s m9sVar, ms2 ms2Var, long j) {
        m9sVar.getClass();
        ms2Var.getClass();
        this.f19288a = m9sVar;
        this.b = ms2Var;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l230)) {
            return false;
        }
        l230 l230Var = (l230) obj;
        return Intrinsics.d(this.f19288a, l230Var.f19288a) && Intrinsics.d(this.b, l230Var.b) && this.c == l230Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (this.f19288a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnUpdateParams(gameDetails=");
        sb.append(this.f19288a);
        sb.append(", entryPointType=");
        sb.append(this.b);
        sb.append(", marketTypeId=");
        return brm0.k(this.c, Separators.RPAREN, sb);
    }
}
