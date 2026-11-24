package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class opf {
    public static final npf Companion = new npf();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25638a;
    public final String b;
    public final Integer c;
    public final Boolean d;
    public final Boolean e;

    public /* synthetic */ opf(int i, String str, String str2, Integer num, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.f25638a = null;
        } else {
            this.f25638a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opf)) {
            return false;
        }
        opf opfVar = (opf) obj;
        return Intrinsics.d(this.f25638a, opfVar.f25638a) && Intrinsics.d(this.b, opfVar.b) && Intrinsics.d(this.c, opfVar.c) && Intrinsics.d(this.d, opfVar.d) && Intrinsics.d(this.e, opfVar.e);
    }

    public final int hashCode() {
        String str = this.f25638a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.e;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Cs2MapsStatisticResponse(mapTitle=", this.f25638a, ", winrate=", this.b, ", count=");
        brm0.z(this.d, this.c, ", pick=", ", ban=", sbN);
        return defpackage.c.e(sbN, this.e, Separators.RPAREN);
    }
}
