package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fic0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9581a;
    public final a4x b;

    public fic0(i4 i4Var, String str) {
        i4Var.getClass();
        this.f9581a = str;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fic0)) {
            return false;
        }
        fic0 fic0Var = (fic0) obj;
        return this.f9581a.equals(fic0Var.f9581a) && Intrinsics.d(this.b, fic0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9581a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("PromoFieldInfoUiModel(headerLabel=", this.f9581a, ", infoFieldList=", this.b, Separators.RPAREN);
    }
}
