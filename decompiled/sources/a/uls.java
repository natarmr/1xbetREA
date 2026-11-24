package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uls implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tls f35889a;
    public final tls b;
    public final String c;
    public final i4 d;

    public uls(tls tlsVar, tls tlsVar2, String str, i4 i4Var) {
        str.getClass();
        this.f35889a = tlsVar;
        this.b = tlsVar2;
        this.c = str;
        this.d = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uls)) {
            return false;
        }
        uls ulsVar = (uls) obj;
        return this.f35889a.equals(ulsVar.f35889a) && this.b.equals(ulsVar.b) && Intrinsics.d(this.c, ulsVar.c) && this.d.equals(ulsVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (this.f35889a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "GameLogsUiModel(firstTeam=" + this.f35889a + ", secondTeam=" + this.b + ", matchDuration=" + this.c + ", logs=" + this.d + Separators.RPAREN;
    }
}
