package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f16229a;
    public final int b;

    public jba(int i, a4x a4xVar) {
        a4xVar.getClass();
        this.f16229a = a4xVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jba)) {
            return false;
        }
        jba jbaVar = (jba) obj;
        return Intrinsics.d(this.f16229a, jbaVar.f16229a) && this.b == jbaVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f16229a.hashCode() * 31);
    }

    public final String toString() {
        return "CardBasketballQuarterInfoUiModel(quarterModelList=" + this.f16229a + ", lastVisibleIndex=" + this.b + Separators.RPAREN;
    }
}
