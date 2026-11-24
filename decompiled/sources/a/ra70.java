package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ra70 implements wb70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30120a;
    public final mne b;

    public ra70(boolean z, mne mneVar) {
        this.f30120a = z;
        this.b = mneVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ra70) {
            ra70 ra70Var = (ra70) obj;
            return this.f30120a == ra70Var.f30120a && this.b == ra70Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f30120a) * 31);
    }

    public final String toString() {
        return "InitWebViewHolder(allowDebug=" + this.f30120a + ", dispatchers=" + this.b + Separators.RPAREN;
    }
}
