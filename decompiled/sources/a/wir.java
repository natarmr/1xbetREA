package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class wir {
    public static final vir Companion = new vir();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f39231a;
    public final String b;
    public final pir c;
    public final Integer d;

    public /* synthetic */ wir(int i, Integer num, String str, pir pirVar, Integer num2) {
        if ((i & 1) == 0) {
            this.f39231a = null;
        } else {
            this.f39231a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = pirVar;
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
        if (!(obj instanceof wir)) {
            return false;
        }
        wir wirVar = (wir) obj;
        return Intrinsics.d(this.f39231a, wirVar.f39231a) && Intrinsics.d(this.b, wirVar.b) && Intrinsics.d(this.c, wirVar.c) && Intrinsics.d(this.d, wirVar.d);
    }

    public final int hashCode() {
        Integer num = this.f39231a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        pir pirVar = this.c;
        int iHashCode3 = (iHashCode2 + (pirVar == null ? 0 : pirVar.hashCode())) * 31;
        Integer num2 = this.d;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = h97.n(this.f39231a, "GPWebAppParams(id=", ", category=", this.b, ", bonus=");
        sbN.append(this.c);
        sbN.append(", demo=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
