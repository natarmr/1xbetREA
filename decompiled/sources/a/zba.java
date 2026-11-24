package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class zba implements aca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bca f44106a;
    public final bca b;
    public final lpm c;
    public final String d;

    public zba(bca bcaVar, bca bcaVar2, lpm lpmVar, String str) {
        str.getClass();
        this.f44106a = bcaVar;
        this.b = bcaVar2;
        this.c = lpmVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zba)) {
            return false;
        }
        zba zbaVar = (zba) obj;
        return this.f44106a.equals(zbaVar.f44106a) && this.b.equals(zbaVar.b) && this.c.equals(zbaVar.c) && Intrinsics.d(this.d, zbaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f140.e(this.c, (this.b.hashCode() + (this.f44106a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "TwoOpponents(firstOpponentModel=" + this.f44106a + ", secondOpponentModel=" + this.b + ", score=" + this.c + ", infoLabel=" + this.d + Separators.RPAREN;
    }
}
