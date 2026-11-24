package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vql0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f37861a;
    public final String b;
    public final n0x c;

    public vql0(long j, String str, n0x n0xVar) {
        this.f37861a = j;
        this.b = str;
        this.c = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vql0)) {
            return false;
        }
        vql0 vql0Var = (vql0) obj;
        return this.f37861a == vql0Var.f37861a && Intrinsics.d(this.b, vql0Var.b) && this.c.equals(vql0Var.c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f37861a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f37861a, "SportsCollectionUiModel(id=", ", title=", this.b);
        sbO.append(", icon=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
