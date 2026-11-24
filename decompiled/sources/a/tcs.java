package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tcs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33733a;
    public final long b;
    public final Integer c;
    public final String d;
    public final String e;
    public final Integer f;
    public final Integer g;

    public tcs(boolean z, long j, Integer num, String str, String str2, Integer num2, Integer num3) {
        this.f33733a = z;
        this.b = j;
        this.c = num;
        this.d = str;
        this.e = str2;
        this.f = num2;
        this.g = num3;
    }

    public static tcs a(tcs tcsVar, boolean z, long j, Integer num, String str, String str2, Integer num2, Integer num3, int i) {
        if ((i & 1) != 0) {
            z = tcsVar.f33733a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            j = tcsVar.b;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            num = tcsVar.c;
        }
        Integer num4 = num;
        if ((i & 8) != 0) {
            str = tcsVar.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = tcsVar.e;
        }
        String str4 = str2;
        Integer num5 = (i & 32) != 0 ? tcsVar.f : num2;
        Integer num6 = (i & 64) != 0 ? tcsVar.g : num3;
        tcsVar.getClass();
        str3.getClass();
        return new tcs(z2, j2, num4, str3, str4, num5, num6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcs)) {
            return false;
        }
        tcs tcsVar = (tcs) obj;
        return this.f33733a == tcsVar.f33733a && this.b == tcsVar.b && Intrinsics.d(this.c, tcsVar.c) && this.d.equals(tcsVar.d) && this.e.equals(tcsVar.e) && Intrinsics.d(this.f, tcsVar.f) && Intrinsics.d(this.g, tcsVar.g);
    }

    public final int hashCode() {
        int iB = rw2.b(Boolean.hashCode(this.f33733a) * 31, 31, this.b);
        Integer num = this.c;
        int iB2 = ua80.b(ua80.b((iB + (num == null ? 0 : num.hashCode())) * 31, 31, this.d), 31, this.e);
        Integer num2 = this.f;
        int iHashCode = (iB2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        return iHashCode + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "GameHeaderBackgroundStateModel(isNightModeEnable=" + this.f33733a + ", sportId=" + this.b + ", specialEventId=" + this.c + ", overrideImagesId=" + this.d + ", individualBackgroundUrl=" + this.e + ", backgroundHeight=" + this.f + ", backgroundWidth=" + this.g + Separators.RPAREN;
    }
}
