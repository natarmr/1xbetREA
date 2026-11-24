package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mvo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22468a;
    public final String b;

    public mvo0(String str, String str2) {
        str.getClass();
        this.f22468a = str;
        this.b = str2;
    }

    public static mvo0 a(mvo0 mvo0Var, String str) {
        String str2 = mvo0Var.f22468a;
        str2.getClass();
        str.getClass();
        return new mvo0(str2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mvo0)) {
            return false;
        }
        mvo0 mvo0Var = (mvo0) obj;
        return Intrinsics.d(this.f22468a, mvo0Var.f22468a) && this.b.equals(mvo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22468a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TaxItemUiModel(title=", this.f22468a, ", value=", this.b, Separators.RPAREN);
    }
}
