package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class bg8 {
    public static final ag8 Companion = new ag8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uk10 f2543a;
    public final String b;

    public /* synthetic */ bg8(int i, uk10 uk10Var, String str) {
        if ((i & 1) == 0) {
            this.f2543a = null;
        } else {
            this.f2543a = uk10Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg8)) {
            return false;
        }
        bg8 bg8Var = (bg8) obj;
        return this.f2543a == bg8Var.f2543a && Intrinsics.d(this.b, bg8Var.b);
    }

    public final int hashCode() {
        uk10 uk10Var = this.f2543a;
        int iHashCode = (uk10Var == null ? 0 : uk10Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BonusRequest(bonusType=" + this.f2543a + ", freeBetSum=" + this.b + Separators.RPAREN;
    }

    public bg8(uk10 uk10Var, String str) {
        this.f2543a = uk10Var;
        this.b = str;
    }
}
