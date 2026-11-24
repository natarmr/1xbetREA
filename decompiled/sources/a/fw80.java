package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class fw80 {
    public static final ew80 Companion = new ew80();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f10247a;
    public final String b;

    public /* synthetic */ fw80(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f10247a = null;
        } else {
            this.f10247a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fw80)) {
            return false;
        }
        fw80 fw80Var = (fw80) obj;
        return Intrinsics.d(this.f10247a, fw80Var.f10247a) && Intrinsics.d(this.b, fw80Var.b);
    }

    public final int hashCode() {
        Long l = this.f10247a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f10247a, "PartitionBrandData(id=", ", name=", this.b, Separators.RPAREN);
    }
}
