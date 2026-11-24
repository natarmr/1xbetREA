package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class emz {
    public static final zlz Companion = new zlz();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8068a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Boolean e;

    public /* synthetic */ emz(int i, Boolean bool, Integer num, Integer num2, String str, String str2) {
        if ((i & 1) == 0) {
            this.f8068a = null;
        } else {
            this.f8068a = num;
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
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emz)) {
            return false;
        }
        emz emzVar = (emz) obj;
        return Intrinsics.d(this.f8068a, emzVar.f8068a) && Intrinsics.d(this.b, emzVar.b) && Intrinsics.d(this.c, emzVar.c) && Intrinsics.d(this.d, emzVar.d) && Intrinsics.d(this.e, emzVar.e);
    }

    public final int hashCode() {
        Integer num = this.f8068a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.e;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f8068a, "LigaResponse(id=", ", image=", this.b, ", name=");
        axq.x(this.d, this.c, ", cyberType=", ", isDuelChamp=", sbN);
        return defpackage.c.e(sbN, this.e, Separators.RPAREN);
    }
}
