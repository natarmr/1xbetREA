package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class muh0 implements puh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22412a;
    public final sek0 b;

    public muh0(sek0 sek0Var, String str) {
        str.getClass();
        this.f22412a = str;
        this.b = sek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muh0)) {
            return false;
        }
        muh0 muh0Var = (muh0) obj;
        return Intrinsics.d(this.f22412a, muh0Var.f22412a) && this.b.equals(muh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22412a.hashCode() * 31);
    }

    public final String toString() {
        return "Message(message=" + this.f22412a + ", snackbarType=" + this.b + Separators.RPAREN;
    }
}
