package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class l85 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19591a;
    public final String b;

    public l85(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f19591a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l85)) {
            return false;
        }
        l85 l85Var = (l85) obj;
        return Intrinsics.d(this.f19591a, l85Var.f19591a) && Intrinsics.d(this.b, l85Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f19591a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AvailablePromocodeUiModel(title=", this.f19591a, ", info=", this.b, Separators.RPAREN);
    }
}
