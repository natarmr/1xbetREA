package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g8y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10886a;
    public final lr5 b;

    public g8y(String str, lr5 lr5Var) {
        str.getClass();
        lr5Var.getClass();
        this.f10886a = str;
        this.b = lr5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8y)) {
            return false;
        }
        g8y g8yVar = (g8y) obj;
        return Intrinsics.d(this.f10886a, g8yVar.f10886a) && Intrinsics.d(this.b, g8yVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10886a.hashCode() * 31);
    }

    public final String toString() {
        return "JackpotWidgetModel(amount=" + this.f10886a + ", banner=" + this.b + Separators.RPAREN;
    }
}
