package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class dxo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6857a;
    public final String b;

    public dxo0(String str, String str2) {
        str.getClass();
        this.f6857a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxo0)) {
            return false;
        }
        dxo0 dxo0Var = (dxo0) obj;
        return Intrinsics.d(this.f6857a, dxo0Var.f6857a) && this.b.equals(dxo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6857a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TaxUiModel(label=", this.f6857a, ", value=", this.b, Separators.RPAREN);
    }
}
