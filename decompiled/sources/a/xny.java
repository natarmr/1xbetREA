package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class xny {
    public static final wny Companion = new wny();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f41190a;
    public final String b;
    public final String c;
    public final Integer d;

    public /* synthetic */ xny(int i, Integer num, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f41190a = null;
        } else {
            this.f41190a = l;
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
            this.d = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xny)) {
            return false;
        }
        xny xnyVar = (xny) obj;
        return Intrinsics.d(this.f41190a, xnyVar.f41190a) && Intrinsics.d(this.b, xnyVar.b) && Intrinsics.d(this.c, xnyVar.c) && Intrinsics.d(this.d, xnyVar.d);
    }

    public final int hashCode() {
        Long l = this.f41190a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.d;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return vqd.l(this.d, this.c, ", numberOfKills=", Separators.RPAREN, cs0.s(this.f41190a, "KillTargetsResponse(heroId=", ", heroName=", this.b, ", heroIcon="));
    }
}
