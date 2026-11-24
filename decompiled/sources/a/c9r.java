package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class c9r {
    public static final b9r Companion = new b9r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3975a;
    public final uk10 b;

    public /* synthetic */ c9r(int i, uk10 uk10Var, String str) {
        if ((i & 1) == 0) {
            this.f3975a = null;
        } else {
            this.f3975a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = uk10Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9r)) {
            return false;
        }
        c9r c9rVar = (c9r) obj;
        return Intrinsics.d(this.f3975a, c9rVar.f3975a) && this.b == c9rVar.b;
    }

    public final int hashCode() {
        String str = this.f3975a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        uk10 uk10Var = this.b;
        return iHashCode + (uk10Var != null ? uk10Var.hashCode() : 0);
    }

    public final String toString() {
        return "FruitBlastBonusResponse(desc=" + this.f3975a + ", bonusType=" + this.b + Separators.RPAREN;
    }
}
