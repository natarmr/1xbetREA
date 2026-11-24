package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wba implements aca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dca f38866a;
    public final dca b;
    public final z1m c;
    public final String d;

    public wba(dca dcaVar, dca dcaVar2, z1m z1mVar, String str) {
        str.getClass();
        this.f38866a = dcaVar;
        this.b = dcaVar2;
        this.c = z1mVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wba)) {
            return false;
        }
        wba wbaVar = (wba) obj;
        return this.f38866a.equals(wbaVar.f38866a) && this.b.equals(wbaVar.b) && this.c.equals(wbaVar.c) && Intrinsics.d(this.d, wbaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rz4.b(this.c.f43628a, (this.b.hashCode() + (this.f38866a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "TwoOpponents(firstOpponentModel=" + this.f38866a + ", secondOpponentModel=" + this.b + ", score=" + this.c + ", infoLabel=" + this.d + Separators.RPAREN;
    }
}
