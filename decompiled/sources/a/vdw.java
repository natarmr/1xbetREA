package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class vdw {
    public static final udw Companion = new udw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37252a;
    public final String b;

    public /* synthetic */ vdw(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f37252a = null;
        } else {
            this.f37252a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdw)) {
            return false;
        }
        vdw vdwVar = (vdw) obj;
        return Intrinsics.d(this.f37252a, vdwVar.f37252a) && Intrinsics.d(this.b, vdwVar.b);
    }

    public final int hashCode() {
        String str = this.f37252a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("HltvAwardsNomineesStatInfoResponse(label=", this.f37252a, ", value=", this.b, Separators.RPAREN);
    }
}
