package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class sm9 {
    public static final rm9 Companion = new rm9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32433a;
    public final String b;
    public final Float c;
    public final Float d;
    public final Float e;

    public /* synthetic */ sm9(int i, String str, String str2, Float f, Float f2, Float f3) {
        if ((i & 1) == 0) {
            this.f32433a = null;
        } else {
            this.f32433a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = f3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sm9)) {
            return false;
        }
        sm9 sm9Var = (sm9) obj;
        return Intrinsics.d(this.f32433a, sm9Var.f32433a) && Intrinsics.d(this.b, sm9Var.b) && Intrinsics.d(this.c, sm9Var.c) && Intrinsics.d(this.d, sm9Var.d) && Intrinsics.d(this.e, sm9Var.e);
    }

    public final int hashCode() {
        String str = this.f32433a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.c;
        int iHashCode3 = (iHashCode2 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.d;
        int iHashCode4 = (iHashCode3 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.e;
        return iHashCode4 + (f3 != null ? f3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CalendarTournamentDotaHeroResponse(name=", this.f32433a, ", imageS3=", this.b, ", winPercentage=");
        vqd.x(sbN, this.c, ", pickPercentage=", this.d, ", banPercentage=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
