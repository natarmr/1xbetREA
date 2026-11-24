package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yba implements aca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bca f42333a;
    public final bca b;
    public final lpm c;
    public final String d;

    public yba(bca bcaVar, bca bcaVar2, lpm lpmVar, String str) {
        str.getClass();
        this.f42333a = bcaVar;
        this.b = bcaVar2;
        this.c = lpmVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yba)) {
            return false;
        }
        yba ybaVar = (yba) obj;
        return this.f42333a.equals(ybaVar.f42333a) && this.b.equals(ybaVar.b) && this.c.equals(ybaVar.c) && Intrinsics.d(this.d, ybaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + f140.e(this.c, (this.b.hashCode() + (this.f42333a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "TwoOpponents(firstOpponentModel=" + this.f42333a + ", secondOpponentModel=" + this.b + ", score=" + this.c + ", infoLabel=" + this.d + Separators.RPAREN;
    }
}
