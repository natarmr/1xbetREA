package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f5m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final go8 f8968a;
    public final String b;

    public f5m(go8 go8Var, String str) {
        this.f8968a = go8Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5m)) {
            return false;
        }
        f5m f5mVar = (f5m) obj;
        return Intrinsics.d(this.f8968a, f5mVar.f8968a) && Intrinsics.d(this.b, f5mVar.b);
    }

    public final int hashCode() {
        go8 go8Var = this.f8968a;
        int iHashCode = (go8Var == null ? 0 : go8Var.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "DsCyberGameHeaderBottomUiModel(mainInfo=" + this.f8968a + ", additionalInfo=" + this.b + Separators.RPAREN;
    }
}
