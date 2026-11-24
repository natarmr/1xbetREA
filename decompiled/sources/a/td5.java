package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class td5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33749a;
    public final int b;

    public td5(String str, int i) {
        str.getClass();
        this.f33749a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td5)) {
            return false;
        }
        td5 td5Var = (td5) obj;
        return Intrinsics.d(this.f33749a, td5Var.f33749a) && this.b == td5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f33749a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "BackgroundUiModel(backgroundImageUrl=", this.f33749a, ", placeholderRes=", Separators.RPAREN);
    }
}
