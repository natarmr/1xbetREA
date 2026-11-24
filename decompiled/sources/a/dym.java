package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class dym implements hym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6900a;
    public final uxm b;
    public final String c;
    public final sem d;

    public dym(String str, uxm uxmVar, String str2, sem semVar) {
        str.getClass();
        str2.getClass();
        this.f6900a = str;
        this.b = uxmVar;
        this.c = str2;
        this.d = semVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dym)) {
            return false;
        }
        dym dymVar = (dym) obj;
        return Intrinsics.d(this.f6900a, dymVar.f6900a) && Intrinsics.d(this.b, dymVar.b) && Intrinsics.d(this.c, dymVar.c) && this.d.equals(dymVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f6900a.hashCode() * 31;
        uxm uxmVar = this.b;
        return this.d.hashCode() + ua80.b((iHashCode + (uxmVar == null ? 0 : uxmVar.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return "V1(opponentName=" + this.f6900a + ", timer=" + this.b + ", infoLabel=" + this.c + ", eventStatusIndicatorModel=" + this.d + Separators.RPAREN;
    }
}
