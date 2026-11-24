package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class tvj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pvj0 f34602a;
    public final boolean b;

    public tvj0(pvj0 pvj0Var, boolean z) {
        this.f34602a = pvj0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvj0)) {
            return false;
        }
        tvj0 tvj0Var = (tvj0) obj;
        return this.f34602a.equals(tvj0Var.f34602a) && this.b == tvj0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f34602a.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleBetTabKeyModel(simpleBetState=" + this.f34602a + ", forceLoading=" + this.b + Separators.RPAREN;
    }
}
