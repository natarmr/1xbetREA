package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class dr10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yq10 f6540a;
    public final boolean b;

    public dr10(yq10 yq10Var, boolean z) {
        this.f6540a = yq10Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr10)) {
            return false;
        }
        dr10 dr10Var = (dr10) obj;
        return this.f6540a == dr10Var.f6540a && this.b == dr10Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f6540a.hashCode() * 31);
    }

    public final String toString() {
        return "MailingSettingsUpdateModel(type=" + this.f6540a + ", checked=" + this.b + Separators.RPAREN;
    }
}
