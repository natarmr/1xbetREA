package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class epb0 implements fpb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f8178a;
    public final a4x b;

    public epb0(i4 i4Var, i4 i4Var2) {
        i4Var.getClass();
        i4Var2.getClass();
        this.f8178a = i4Var;
        this.b = i4Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epb0)) {
            return false;
        }
        epb0 epb0Var = (epb0) obj;
        return Intrinsics.d(this.f8178a, epb0Var.f8178a) && Intrinsics.d(this.b, epb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8178a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(buttonUiState=" + this.f8178a + ", powerBetItemUiModelList=" + this.b + Separators.RPAREN;
    }
}
