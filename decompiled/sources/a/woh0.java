package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class woh0 implements zoh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39498a;
    public final sek0 b;

    public woh0(sek0 sek0Var, String str) {
        str.getClass();
        this.f39498a = str;
        this.b = sek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woh0)) {
            return false;
        }
        woh0 woh0Var = (woh0) obj;
        return Intrinsics.d(this.f39498a, woh0Var.f39498a) && this.b.equals(woh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39498a.hashCode() * 31);
    }

    public final String toString() {
        return "Message(message=" + this.f39498a + ", snackbarType=" + this.b + Separators.RPAREN;
    }
}
