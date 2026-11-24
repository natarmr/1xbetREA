package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b6p0 implements d6p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2067a;
    public final a4x b;

    public b6p0(a4x a4xVar, String str) {
        str.getClass();
        a4xVar.getClass();
        this.f2067a = str;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6p0)) {
            return false;
        }
        b6p0 b6p0Var = (b6p0) obj;
        return Intrinsics.d(this.f2067a, b6p0Var.f2067a) && Intrinsics.d(this.b, b6p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2067a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("TeamCharacteristicsForecastUiModel(title=", this.f2067a, ", forecasts=", this.b, Separators.RPAREN);
    }
}
