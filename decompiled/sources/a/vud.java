package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vud implements evd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38043a;
    public final int b;

    public vud(String str, int i) {
        this.f38043a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vud)) {
            return false;
        }
        vud vudVar = (vud) obj;
        return Intrinsics.d(this.f38043a, vudVar.f38043a) && this.b == vudVar.b;
    }

    public final int hashCode() {
        String str = this.f38043a;
        return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "ShowCodeError(message=", this.f38043a, ", iconTintResId=", Separators.RPAREN);
    }
}
