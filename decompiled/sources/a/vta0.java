package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class vta0 {
    public static final uta0 Companion = new uta0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f37997a;
    public final Long b;
    public final String c;

    public /* synthetic */ vta0(int i, Long l, Long l2, String str) {
        if ((i & 1) == 0) {
            this.f37997a = null;
        } else {
            this.f37997a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vta0)) {
            return false;
        }
        vta0 vta0Var = (vta0) obj;
        return Intrinsics.d(this.f37997a, vta0Var.f37997a) && Intrinsics.d(this.b, vta0Var.b) && Intrinsics.d(this.c, vta0Var.c);
    }

    public final int hashCode() {
        Long l = this.f37997a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(rz4.o(this.f37997a, this.b, "PolybetRulesResponse(versionId=", ", languageId=", ", text="), this.c, Separators.RPAREN);
    }
}
