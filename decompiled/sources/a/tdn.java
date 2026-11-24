package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tdn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33777a;
    public final String b;
    public final String c;
    public final Integer d;

    public tdn(long j, Integer num, String str, String str2) {
        str2.getClass();
        this.f33777a = j;
        this.b = str;
        this.c = str2;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tdn)) {
            return false;
        }
        tdn tdnVar = (tdn) obj;
        return this.f33777a == tdnVar.f33777a && this.b.equals(tdnVar.b) && Intrinsics.d(this.c, tdnVar.c) && Intrinsics.d(this.d, tdnVar.d);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(Long.hashCode(this.f33777a) * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        return iB + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f33777a, "DuelPlayerModel(playerId=", ", logoUrl=", this.b);
        sbO.append(", playerName=");
        sbO.append(this.c);
        sbO.append(", teamNumber=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
