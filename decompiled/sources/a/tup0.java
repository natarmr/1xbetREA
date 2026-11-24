package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tup0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34562a;
    public final String b;

    public tup0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f34562a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tup0)) {
            return false;
        }
        tup0 tup0Var = (tup0) obj;
        return Intrinsics.d(this.f34562a, tup0Var.f34562a) && Intrinsics.d(this.b, tup0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34562a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TelegramBonusCodeBottomSheetState(code=", this.f34562a, ", link=", this.b, Separators.RPAREN);
    }
}
