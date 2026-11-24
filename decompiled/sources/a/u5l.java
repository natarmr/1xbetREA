package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class u5l {
    public static final t5l Companion = new t5l();
    public static final a8z[] e = {null, null, null, maz.a(wez.f39042a, new rtj(27))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35100a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ u5l(int i, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f35100a = null;
        } else {
            this.f35100a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5l)) {
            return false;
        }
        u5l u5lVar = (u5l) obj;
        return Intrinsics.d(this.f35100a, u5lVar.f35100a) && Intrinsics.d(this.b, u5lVar.b) && Intrinsics.d(this.c, u5lVar.c) && Intrinsics.d(this.d, u5lVar.d);
    }

    public final int hashCode() {
        String str = this.f35100a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.d;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return rw2.m(this.c, ", players=", Separators.RPAREN, b1j.n("DotaPlayersCompositionResponse(teamName=", this.f35100a, ", teamImage=", this.b, ", teamImageS3="), this.d);
    }
}
