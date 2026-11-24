package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class gw80 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12015a;
    public final String b;

    public gw80(long j, String str) {
        str.getClass();
        this.f12015a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw80)) {
            return false;
        }
        gw80 gw80Var = (gw80) obj;
        return this.f12015a == gw80Var.f12015a && Intrinsics.d(this.b, gw80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.f12015a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f12015a, "PartitionBrandModel(id=", ", name=", this.b);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
