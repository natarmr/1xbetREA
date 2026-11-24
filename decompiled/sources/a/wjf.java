package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wjf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39260a;
    public final String b;
    public final trf c;

    public wjf(String str, String str2, trf trfVar) {
        str.getClass();
        this.f39260a = str;
        this.b = str2;
        this.c = trfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjf)) {
            return false;
        }
        wjf wjfVar = (wjf) obj;
        return Intrinsics.d(this.f39260a, wjfVar.f39260a) && this.b.equals(wjfVar.b) && this.c.equals(wjfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f39260a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Cs2FullStatisticModel(teamName=", this.f39260a, ", teamImage=", this.b, ", teamStatistic=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
