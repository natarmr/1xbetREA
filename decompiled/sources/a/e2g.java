package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class e2g {
    public static final d2g Companion = new d2g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f7083a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final Integer e;

    public /* synthetic */ e2g(int i, Boolean bool, Integer num, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f7083a = null;
        } else {
            this.f7083a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2g)) {
            return false;
        }
        e2g e2gVar = (e2g) obj;
        return Intrinsics.d(this.f7083a, e2gVar.f7083a) && Intrinsics.d(this.b, e2gVar.b) && Intrinsics.d(this.c, e2gVar.c) && Intrinsics.d(this.d, e2gVar.d) && Intrinsics.d(this.e, e2gVar.e);
    }

    public final int hashCode() {
        Long l = this.f7083a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.e;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = cs0.s(this.f7083a, "CyberBaseLigaResponse(id=", ", name=", this.b, ", image=");
        h97.v(this.d, this.c, ", isDuelChamp=", ", cyberType=", sbS);
        return dw9.q(sbS, this.e, Separators.RPAREN);
    }
}
