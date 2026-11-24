package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fws0 extends h46 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10275a;
    public final Long b;

    public fws0(String str, Long l) {
        str.getClass();
        this.f10275a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fws0)) {
            return false;
        }
        fws0 fws0Var = (fws0) obj;
        return Intrinsics.d(this.f10275a, fws0Var.f10275a) && Intrinsics.d(this.b, fws0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f10275a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "TwoFactoryValidationModel(message=" + this.f10275a + ", messageId=" + this.b + Separators.RPAREN;
    }
}
