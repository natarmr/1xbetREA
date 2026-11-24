package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ve9 implements xe9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37272a;
    public final int b;

    public ve9(String str, int i) {
        str.getClass();
        this.f37272a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve9)) {
            return false;
        }
        ve9 ve9Var = (ve9) obj;
        return Intrinsics.d(this.f37272a, ve9Var.f37272a) && this.b == ve9Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f37272a.hashCode() * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "LabelIconLeft(labelText=", this.f37272a, ", iconResId=", Separators.RPAREN);
    }
}
