package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17115a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public jts(String str, String str2, Integer num, Integer num2) {
        this.f17115a = str;
        this.b = str2;
        this.c = num;
        this.d = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jts)) {
            return false;
        }
        jts jtsVar = (jts) obj;
        return Intrinsics.d(this.f17115a, jtsVar.f17115a) && Intrinsics.d(this.b, jtsVar.b) && Intrinsics.d(this.c, jtsVar.c) && Intrinsics.d(this.d, jtsVar.d);
    }

    public final int hashCode() {
        String str = this.f17115a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return ua80.l(b1j.n("GameSubScoreModel(subFirst=", this.f17115a, ", subSecond=", this.b, ", pointsFirst="), this.c, ", pointsSecond=", this.d, Separators.RPAREN);
    }
}
