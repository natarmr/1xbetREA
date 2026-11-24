package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class aa90 implements ea90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f515a;
    public final da90 b;

    public aa90(String str, da90 da90Var) {
        str.getClass();
        this.f515a = str;
        this.b = da90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa90)) {
            return false;
        }
        aa90 aa90Var = (aa90) obj;
        return Intrinsics.d(this.f515a, aa90Var.f515a) && this.b == aa90Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f515a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSnackBar(message=" + this.f515a + ", type=" + this.b + Separators.RPAREN;
    }
}
