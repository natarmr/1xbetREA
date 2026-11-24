package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qal0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28401a;
    public final String b;
    public final String c;
    public final String d;

    public qal0(String str, String str2, String str3, String str4) {
        str.getClass();
        this.f28401a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qal0)) {
            return false;
        }
        qal0 qal0Var = (qal0) obj;
        return Intrinsics.d(this.f28401a, qal0Var.f28401a) && Intrinsics.d(this.b, qal0Var.b) && Intrinsics.d(this.c, qal0Var.c) && Intrinsics.d(this.d, qal0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f28401a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return ua80.m(b1j.n("SportGameBoardTimerUiModel(timerInfo=", this.f28401a, ", hours=", this.b, ", minutes="), this.c, ", seconds=", this.d, Separators.RPAREN);
    }
}
