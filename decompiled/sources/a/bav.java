package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bav {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2277a;
    public final String b;

    public bav(String str, String str2) {
        str.getClass();
        this.f2277a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bav)) {
            return false;
        }
        bav bavVar = (bav) obj;
        return Intrinsics.d(this.f2277a, bavVar.f2277a) && this.b.equals(bavVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2277a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("GoldRushGameUiState(value=", this.f2277a, ", background=", this.b, Separators.RPAREN);
    }
}
