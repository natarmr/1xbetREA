package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14057a;
    public final String b;
    public final String c;
    public final a4x d;

    public i2n(String str, String str2, String str3, i4 i4Var) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        i4Var.getClass();
        this.f14057a = str;
        this.b = str2;
        this.c = str3;
        this.d = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2n)) {
            return false;
        }
        i2n i2nVar = (i2n) obj;
        return Intrinsics.d(this.f14057a, i2nVar.f14057a) && Intrinsics.d(this.b, i2nVar.b) && Intrinsics.d(this.c, i2nVar.c) && Intrinsics.d(this.d, i2nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f14057a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Default(opponentName=", this.f14057a, ", formulaLabel=", this.b, ", formulaValue=");
        sbN.append(this.c);
        sbN.append(", scores=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
