package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class gwb {
    public static final fwb Companion = new fwb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f12018a;
    public final String b;
    public final String c;
    public final Integer d;

    public /* synthetic */ gwb(int i, Integer num, Integer num2, String str, String str2) {
        if ((i & 1) == 0) {
            this.f12018a = null;
        } else {
            this.f12018a = num;
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwb)) {
            return false;
        }
        gwb gwbVar = (gwb) obj;
        return Intrinsics.d(this.f12018a, gwbVar.f12018a) && Intrinsics.d(this.b, gwbVar.b) && Intrinsics.d(this.c, gwbVar.c) && Intrinsics.d(this.d, gwbVar.d);
    }

    public final int hashCode() {
        Integer num = this.f12018a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return vqd.l(this.d, this.c, ", characteristicsType=", Separators.RPAREN, h97.n(this.f12018a, "CharacteristicModelResponse(level=", ", levelText=", this.b, ", characteristicsText="));
    }
}
