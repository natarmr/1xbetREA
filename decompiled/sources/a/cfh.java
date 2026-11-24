package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cfh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4261a;
    public final List b;

    public cfh(long j, List list) {
        list.getClass();
        this.f4261a = j;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfh)) {
            return false;
        }
        cfh cfhVar = (cfh) obj;
        return this.f4261a == cfhVar.f4261a && Intrinsics.d(this.b, cfhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f4261a) * 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f4261a, "CyberStageTableTitleModel(id=", ", valueColumn=", this.b);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
