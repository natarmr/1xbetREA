package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o9l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24885a;
    public final String b;

    public o9l0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f24885a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9l0)) {
            return false;
        }
        o9l0 o9l0Var = (o9l0) obj;
        return Intrinsics.d(this.f24885a, o9l0Var.f24885a) && Intrinsics.d(this.b, o9l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24885a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("SportGameBoardLiveHeaderUiModel(tag=", this.f24885a, ", period=", this.b, Separators.RPAREN);
    }
}
