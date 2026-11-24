package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24169a;
    public final j7n b;
    public final boolean c;
    public final a4x d;
    public final wul e;

    public nv0(String str, g7n g7nVar, boolean z, a4x a4xVar, wul wulVar) {
        str.getClass();
        g7nVar.getClass();
        a4xVar.getClass();
        wulVar.getClass();
        this.f24169a = str;
        this.b = g7nVar;
        this.c = z;
        this.d = a4xVar;
        this.e = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv0)) {
            return false;
        }
        nv0 nv0Var = (nv0) obj;
        return Intrinsics.d(this.f24169a, nv0Var.f24169a) && Intrinsics.d(this.b, nv0Var.b) && this.c == nv0Var.c && Intrinsics.d(this.d, nv0Var.d) && Intrinsics.d(this.e, nv0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cs0.b(this.d, brm0.e((this.b.hashCode() + (this.f24169a.hashCode() * 31)) * 31, 31, this.c), 31);
    }

    public final String toString() {
        return "AggregatorGameNicknameUiState(title=" + this.f24169a + ", nicknameModel=" + this.b + ", autoFocus=" + this.c + ", nicknameHints=" + this.d + ", applyButtonModel=" + this.e + Separators.RPAREN;
    }
}
