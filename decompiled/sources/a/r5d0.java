package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29879a;
    public final n0x b;

    public r5d0(n0x n0xVar, String str) {
        str.getClass();
        this.f29879a = str;
        this.b = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5d0)) {
            return false;
        }
        r5d0 r5d0Var = (r5d0) obj;
        return Intrinsics.d(this.f29879a, r5d0Var.f29879a) && this.b.equals(r5d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29879a.hashCode() * 31);
    }

    public final String toString() {
        return "ProviderCellUiModel(id=" + this.f29879a + ", image=" + this.b + Separators.RPAREN;
    }
}
