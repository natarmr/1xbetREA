package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dmm implements gmm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wa50 f6327a;

    public dmm(wa50 wa50Var) {
        this.f6327a = wa50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmm) && this.f6327a.equals(((dmm) obj).f6327a);
    }

    public final int hashCode() {
        return this.f6327a.hashCode();
    }

    public final String toString() {
        return "Button(icons=" + this.f6327a + Separators.RPAREN;
    }
}
