package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ziy {
    public static final yiy Companion = new yiy();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44460a;
    public final Long b;
    public final String c;
    public final ejy d;

    public /* synthetic */ ziy(int i, String str, Long l, String str2, ejy ejyVar) {
        if ((i & 1) == 0) {
            this.f44460a = null;
        } else {
            this.f44460a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = ejyVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ziy)) {
            return false;
        }
        ziy ziyVar = (ziy) obj;
        return Intrinsics.d(this.f44460a, ziyVar.f44460a) && Intrinsics.d(this.b, ziyVar.b) && Intrinsics.d(this.c, ziyVar.c) && Intrinsics.d(this.d, ziyVar.d);
    }

    public final int hashCode() {
        String str = this.f44460a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ejy ejyVar = this.d;
        return iHashCode3 + (ejyVar != null ? ejyVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbS = kng0.s(this.b, "KabaddiPlayerResponse(playerId=", this.f44460a, ", type=", ", image=");
        sbS.append(this.c);
        sbS.append(", statistics=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
