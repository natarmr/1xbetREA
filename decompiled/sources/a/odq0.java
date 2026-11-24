package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class odq0 implements iqg {
    public static final ndq0 Companion = new ndq0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25089a;
    public final String b;

    public /* synthetic */ odq0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f25089a = null;
        } else {
            this.f25089a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odq0)) {
            return false;
        }
        odq0 odq0Var = (odq0) obj;
        return Intrinsics.d(this.f25089a, odq0Var.f25089a) && Intrinsics.d(this.b, odq0Var.b);
    }

    public final int hashCode() {
        String str = this.f25089a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("TicTacToeResponse(currentRound=", this.f25089a, ", roundHistory=", this.b, Separators.RPAREN);
    }

    public odq0() {
        this.f25089a = null;
        this.b = null;
    }
}
