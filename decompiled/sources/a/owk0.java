package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class owk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25970a;
    public final String b;

    public owk0(String str, String str2) {
        str.getClass();
        this.f25970a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owk0)) {
            return false;
        }
        owk0 owk0Var = (owk0) obj;
        return Intrinsics.d(this.f25970a, owk0Var.f25970a) && Intrinsics.d(this.b, owk0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f25970a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return b1j.k("SpecialEventToolbarContentUiModel(title=", this.f25970a, ", timerValue=", this.b, Separators.RPAREN);
    }
}
