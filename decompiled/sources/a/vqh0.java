package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vqh0 implements yqh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37855a;
    public final sek0 b;

    public vqh0(sek0 sek0Var, String str) {
        str.getClass();
        this.f37855a = str;
        this.b = sek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqh0)) {
            return false;
        }
        vqh0 vqh0Var = (vqh0) obj;
        return Intrinsics.d(this.f37855a, vqh0Var.f37855a) && this.b.equals(vqh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37855a.hashCode() * 31);
    }

    public final String toString() {
        return "Message(message=" + this.f37855a + ", snackbarType=" + this.b + Separators.RPAREN;
    }
}
