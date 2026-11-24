package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lbm implements wqg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19760a;
    public final boolean b;

    public lbm(String str, boolean z) {
        str.getClass();
        this.f19760a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbm)) {
            return false;
        }
        lbm lbmVar = (lbm) obj;
        return Intrinsics.d(this.f19760a, lbmVar.f19760a) && this.b == lbmVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f19760a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("DsCyberTextCellUiModel(label=", this.f19760a, ", active=", this.b, Separators.RPAREN);
    }
}
