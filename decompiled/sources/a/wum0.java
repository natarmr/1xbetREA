package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class wum0 {
    public static final uum0 Companion = new uum0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39798a;
    public final String b;

    public /* synthetic */ wum0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f39798a = null;
        } else {
            this.f39798a = str;
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
        if (!(obj instanceof wum0)) {
            return false;
        }
        wum0 wum0Var = (wum0) obj;
        return Intrinsics.d(this.f39798a, wum0Var.f39798a) && Intrinsics.d(this.b, wum0Var.b);
    }

    public final int hashCode() {
        String str = this.f39798a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("SubGame(title=", this.f39798a, ", score=", this.b, Separators.RPAREN);
    }
}
