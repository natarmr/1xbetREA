package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wy implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39953a;
    public final a4x b;

    public wy(i4 i4Var, String str) {
        i4Var.getClass();
        this.f39953a = str;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wy)) {
            return false;
        }
        wy wyVar = (wy) obj;
        return this.f39953a.equals(wyVar.f39953a) && Intrinsics.d(this.b, wyVar.b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f39953a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39953a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("AdditionalInfoUiModel(key=", this.f39953a, ", buttons=", this.b, Separators.RPAREN);
    }
}
