package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class aoj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1203a;

    public aoj(String str) {
        this.f1203a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aoj) && this.f1203a.equals(((aoj) obj).f1203a);
    }

    public final int hashCode() {
        return this.f1203a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return kng0.l("PaySystemRedirection(hasBackStack=false, url=", this.f1203a, Separators.RPAREN);
    }
}
