package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class cob implements dob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4691a;
    public final a4x b;
    public final a4x c;
    public final boolean d;

    public cob(long j, a4x a4xVar, a4x a4xVar2, boolean z) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f4691a = j;
        this.b = a4xVar;
        this.c = a4xVar2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cob)) {
            return false;
        }
        cob cobVar = (cob) obj;
        return this.f4691a == cobVar.f4691a && Intrinsics.d(this.b, cobVar.b) && Intrinsics.d(this.c, cobVar.c) && this.d == cobVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cs0.b(this.c, cs0.b(this.b, Long.hashCode(this.f4691a) * 31, 31), 31);
    }

    public final String toString() {
        return "BalanceSuccess(currentBalance=" + this.f4691a + ", balanceList=" + this.b + ", bonusList=" + this.c + ", showAddWalletButton=" + this.d + Separators.RPAREN;
    }
}
