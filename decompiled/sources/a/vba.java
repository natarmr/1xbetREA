package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vba implements aca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bca f37132a;
    public final bca b;
    public final lpm c;
    public final String d;

    public vba(bca bcaVar, bca bcaVar2, lpm lpmVar, String str) {
        str.getClass();
        this.f37132a = bcaVar;
        this.b = bcaVar2;
        this.c = lpmVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vba)) {
            return false;
        }
        vba vbaVar = (vba) obj;
        return this.f37132a.equals(vbaVar.f37132a) && this.b.equals(vbaVar.b) && this.c.equals(vbaVar.c) && Intrinsics.d(this.d, vbaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f140.e(this.c, (this.b.hashCode() + (this.f37132a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "TwoOpponents(firstOpponentModel=" + this.f37132a + ", secondOpponentModel=" + this.b + ", score=" + this.c + ", infoLabel=" + this.d + Separators.RPAREN;
    }
}
