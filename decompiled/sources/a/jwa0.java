package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jwa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17242a;
    public final String b;

    public jwa0(String str, String str2) {
        this.f17242a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jwa0)) {
            return false;
        }
        jwa0 jwa0Var = (jwa0) obj;
        return this.f17242a.equals(jwa0Var.f17242a) && this.b.equals(jwa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17242a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PopUpBonusCheckListModel(img=", this.f17242a, ", text=", this.b, Separators.RPAREN);
    }
}
