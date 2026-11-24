package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ad50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f662a;
    public final String b;

    public ad50(String str, String str2) {
        str.getClass();
        this.f662a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad50)) {
            return false;
        }
        ad50 ad50Var = (ad50) obj;
        return Intrinsics.d(this.f662a, ad50Var.f662a) && this.b.equals(ad50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f662a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("NavigationBarUiModel(title=", this.f662a, ", subtitle=", this.b, Separators.RPAREN);
    }
}
