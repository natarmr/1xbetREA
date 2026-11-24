package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ey20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8606a;
    public final long b;
    public final String c;
    public final boolean d;

    public ey20(ArrayList arrayList, long j, String str, boolean z) {
        this.f8606a = arrayList;
        this.b = j;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey20)) {
            return false;
        }
        ey20 ey20Var = (ey20) obj;
        return this.f8606a.equals(ey20Var.f8606a) && this.b == ey20Var.b && Intrinsics.d(this.c, ey20Var.c) && this.d == ey20Var.d;
    }

    public final int hashCode() {
        int iB = rw2.b(this.f8606a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iB + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketSubGameModel(marketGroups=");
        sb.append(this.f8606a);
        sb.append(", subGameId=");
        sb.append(this.b);
        w6x.z(", subGameName=", this.c, ", expanded=", sb, this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
