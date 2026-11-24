package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qdv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28554a;
    public final String b;

    public qdv0(String str, String str2) {
        this.f28554a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdv0)) {
            return false;
        }
        qdv0 qdv0Var = (qdv0) obj;
        return this.f28554a.equals(qdv0Var.f28554a) && this.b.equals(qdv0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28554a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("WidgetEventOpponentUiModel(iconUrl=", this.f28554a, ", coef=", this.b, Separators.RPAREN);
    }
}
