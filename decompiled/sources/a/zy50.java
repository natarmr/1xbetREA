package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zy50 implements az50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uid f45189a;

    public final boolean equals(Object obj) {
        if (obj instanceof zy50) {
            return this.f45189a.equals(((zy50) obj).f45189a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45189a.hashCode();
    }

    public final String toString() {
        return vqd.m("SportGamesDelegateAction(delegateAction=", this.f45189a, Separators.RPAREN);
    }
}
